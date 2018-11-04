import java.util.Scanner;

public class Bobcar{
	public static int executivePackage = 0;	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int carChoice;
		int rentalDays;
		int club;
		int totalCost = 0;
		int discount = 0;
		double executivePrice = 0;

		System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard");

		System.out.println("Please choose the rental car:");
		carChoice = input.nextInt();

		System.out.println("Please enter the number of rental days:");
		rentalDays = input.nextInt();

		System.out.println("Club member?: 1 for yes, 0 for no:");
		club = input.nextInt();

		if (club == 1){
			System.out.println("Platinum Executive Package?: 1 for yes, 0 for no:");
			executivePackage = input.nextInt();
		};
		if (carChoice == 1) {
			int costDay = 35;
			totalCost += (costDay * rentalDays);
			System.out.println("Base: " + rentalDays + " days for an Economy car @ $35 per day:\t\t+$" + costDay * rentalDays);
			if (club == 1) {
				int discountDays = rentalDays / 7;
				discount = (discountDays) * costDay;
				System.out.println("Club Member Discount:\t\t\t\t\t-$" + discount);
				if (executivePackage == 1){
					executivePrice = totalCost * 0.15;
					System.out.println("Platinum Executive Package:\t\t\t\t+$" + executivePrice);
				};
			};
			System.out.println("Total Estimate for Rental:\t\t\t\t$" + (totalCost + discount + executivePrice));
		};
		if (carChoice == 2) {
			int costDay = 45;
			totalCost += (costDay * rentalDays);
			System.out.println("Base: " + rentalDays + " days for an Economy car @ $35 per day:\t\t+$" + costDay * rentalDays);
			if (club == 1) {
				int discountDays = rentalDays / 7;
				discount = (discountDays) * costDay;
				System.out.println("Club Member Discount:\t\t\t\t\t-$" + discount);
				if (executivePackage == 1){
					executivePrice = totalCost * 0.15;
					System.out.println("Platinum Executive Package:\t\t\t\t+$" + executivePrice);
				};
			};
			System.out.println("Total Estimate for Rental:\t\t\t\t$" + (totalCost + discount + executivePrice));
		};
		if (carChoice == 3) {
			int costDay = 95;
			totalCost += (costDay * rentalDays);
			System.out.println("Base: " + rentalDays + " days for an Economy car @ $35 per day:\t\t+$" + costDay * rentalDays);
			if (club == 1) {
				int discountDays = rentalDays / 7;
				discount = (discountDays) * costDay;
				System.out.println("Club Member Discount:\t\t\t\t\t-$" + discount);
				if (executivePackage == 1){
					executivePrice = totalCost * 0.15;
					System.out.println("Platinum Executive Package:\t\t\t\t+$" + executivePrice);
				};
			};
			System.out.println("Total Estimate for Rental:\t\t\t\t$" + (totalCost - discount + executivePrice));
		};		
	input.close();
	};
;}
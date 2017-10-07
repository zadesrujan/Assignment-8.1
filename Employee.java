package overloading;
//here we cretaed pacakage as overloading which that organizes a set of related classes and interfaces.
public class Employee {

	private int Id1;
	//Private is the most restrictive access level.
	//int is a default data type for integral values
		private String name;
		private int age;
		Employee()
		{
			//Default constructor
			Id1=841;
			name="vidu";
			age=22;
		}
		Employee(int num1,String str,int num2)
		{
			//parameterized constructor
			Id1=num1;//here we are not taking values directly and we are asking user
			name=str;
			age=num2;
			}
		//getter and setter methods are ordinary functions.The reason for using getters and setters instead of making your members public 
		//is that it makes it possible to change the implementation without changing the interface. 
		public int getId(){
			return Id1;
		}
		public void setId(int Id)
		{	
			/*this is used for calling the default constructor from parameterized constructor
			 * it should always be the first statement inside constructor body
			 */
			
			this.Id1=Id;
		}
		public String getname(){
			return name;
		}
		public void setname(String name)
		{
			this.name=name;
		}
		public int getage(){
			return age;//returning the value
		}
		public void setage(int age)
		{
			this.age=age;
		}
		
		public static void main(String[] args)
		{
			//this object creation would call the default constructor
			Employee s=new Employee();
			System.out.println("Employee name:"+s.getname());
			//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
			//Inside the brackets is value which to be printed		
			
			System.out.println("Employee age:"+s.getage());
			//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
			System.out.println("Employee Id:"+s.getId());
			//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
			/*this object creation would call the parameterized
			 * constructor Student(int,String,int)*/
			 
			Employee s2=new Employee(967,"srujan",24);
			System.out.println("Employee name:"+s2.getname());
			System.out.println("Employee age:"+s2.getage());
			System.out.println("Employee Id:"+s2.getId());
			//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
			//it will print the name age and id
			
		}
	}


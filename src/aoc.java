public class aoc implements Comparable<aoc> {
   private final int a;
   private final hz b;
   private int c;
   private int d;

   public aoc(int $$0, hz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.a;
   }

   public hz b() {
      return this.b;
   }

   public void a(int $$0) {
      if ($$0 > 10) {
         $$0 = 10;
      }

      this.c = $$0;
   }

   public int c() {
      return this.c;
   }

   public void b(int $$0) {
      this.d = $$0;
   }

   public int d() {
      return this.d;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         aoc $$1 = (aoc)$$0;
         return this.a == $$1.a;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Integer.hashCode(this.a);
   }

   public int a(aoc $$0) {
      return this.c != $$0.c ? Integer.compare(this.c, $$0.c) : Integer.compare(this.a, $$0.a);
   }
}

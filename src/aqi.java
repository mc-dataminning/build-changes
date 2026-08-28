public class aqi implements Comparable<aqi> {
   private final int a;
   private final je b;
   private int c;
   private int d;

   public aqi(int $$0, je $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.a;
   }

   public je b() {
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
         aqi $$1 = (aqi)$$0;
         return this.a == $$1.a;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Integer.hashCode(this.a);
   }

   public int a(aqi $$0) {
      return this.c != $$0.c ? Integer.compare(this.c, $$0.c) : Integer.compare(this.a, $$0.a);
   }
}

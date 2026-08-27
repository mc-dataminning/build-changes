public class aii<T> {
   private final int a;
   private final aij<T> b;

   public aii(int $$0, aij<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.a;
   }

   public aij<T> b() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         aii<?> $$1 = (aii<?>)$$0;
         return this.a == $$1.a;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a;
   }

   @Override
   public String toString() {
      return "<entity data: " + this.a + ">";
   }
}

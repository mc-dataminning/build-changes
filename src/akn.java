public record akn<T>(int a, ako<T> b) {
   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         akn<?> $$1 = (akn<?>)$$0;
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

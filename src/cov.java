public record cov<T extends cot<?>>(agm a, T b) {
   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cov<?> $$1 && this.a.equals($$1.a)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public String toString() {
      return this.a.toString();
   }
}

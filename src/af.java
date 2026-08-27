public record af(agg a, ae b) {
   public void a(tu $$0) {
      $$0.a(this.a);
      this.b.a($$0);
   }

   public static af b(tu $$0) {
      return new af($$0.t(), ae.b($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof af $$1 && this.a.equals($$1.a)) {
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

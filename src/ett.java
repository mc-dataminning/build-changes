public record ett(aep a, aep b, aep c, aep d) {
   public ett(aep $$0, aep $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public ett(aep $$0, aep $$1, aep $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public aep a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}

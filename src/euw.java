public record euw(afw a, afw b, afw c, afw d) {
   public euw(afw $$0, afw $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public euw(afw $$0, afw $$1, afw $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public afw a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}

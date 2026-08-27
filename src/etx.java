public record etx(aez a, aez b, aez c, aez d) {
   public etx(aez $$0, aez $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public etx(aez $$0, aez $$1, aez $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public aez a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}

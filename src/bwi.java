public record bwi(float a, float b, float c, bwh d, boolean e) {
   private bwi(float $$0, float $$1, boolean $$2) {
      this($$0, $$1, c($$1), bwh.a($$0, $$1), $$2);
   }

   private static float c(float $$0) {
      return $$0 * 0.85F;
   }

   public fel a(feq $$0) {
      return this.a($$0.d, $$0.e, $$0.f);
   }

   public fel a(double $$0, double $$1, double $$2) {
      float $$3 = this.a / 2.0F;
      float $$4 = this.b;
      return new fel($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public bwi a(float $$0) {
      return this.a($$0, $$0);
   }

   public bwi a(float $$0, float $$1) {
      return !this.e && ($$0 != 1.0F || $$1 != 1.0F) ? new bwi(this.a * $$0, this.b * $$1, this.c * $$1, this.d.a($$0, $$1, $$0), false) : this;
   }

   public static bwi b(float $$0, float $$1) {
      return new bwi($$0, $$1, false);
   }

   public static bwi c(float $$0, float $$1) {
      return new bwi($$0, $$1, true);
   }

   public bwi b(float $$0) {
      return new bwi(this.a, this.b, $$0, this.d, this.e);
   }

   public bwi a(bwh.a $$0) {
      return new bwi(this.a, this.b, this.c, $$0.a(this.a, this.b), this.e);
   }
}

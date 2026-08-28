public record bsg(float a, float b, float c, bsf d, boolean e) {
   private bsg(float $$0, float $$1, boolean $$2) {
      this($$0, $$1, c($$1), bsf.a($$0, $$1), $$2);
   }

   private static float c(float $$0) {
      return $$0 * 0.85F;
   }

   public evu a(evz $$0) {
      return this.a($$0.c, $$0.d, $$0.e);
   }

   public evu a(double $$0, double $$1, double $$2) {
      float $$3 = this.a / 2.0F;
      float $$4 = this.b;
      return new evu($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public bsg a(float $$0) {
      return this.a($$0, $$0);
   }

   public bsg a(float $$0, float $$1) {
      return !this.e && ($$0 != 1.0F || $$1 != 1.0F) ? new bsg(this.a * $$0, this.b * $$1, this.c * $$1, this.d.a($$0, $$1, $$0), false) : this;
   }

   public static bsg b(float $$0, float $$1) {
      return new bsg($$0, $$1, false);
   }

   public static bsg c(float $$0, float $$1) {
      return new bsg($$0, $$1, true);
   }

   public bsg b(float $$0) {
      return new bsg(this.a, this.b, $$0, this.d, this.e);
   }

   public bsg a(bsf.a $$0) {
      return new bsg(this.a, this.b, this.c, $$0.a(this.a, this.b), this.e);
   }
}

public record bsw(float a, float b, float c, bsv d, boolean e) {
   private bsw(float $$0, float $$1, boolean $$2) {
      this($$0, $$1, c($$1), bsv.a($$0, $$1), $$2);
   }

   private static float c(float $$0) {
      return $$0 * 0.85F;
   }

   public evl a(evq $$0) {
      return this.a($$0.c, $$0.d, $$0.e);
   }

   public evl a(double $$0, double $$1, double $$2) {
      float $$3 = this.a / 2.0F;
      float $$4 = this.b;
      return new evl($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public bsw a(float $$0) {
      return this.a($$0, $$0);
   }

   public bsw a(float $$0, float $$1) {
      return !this.e && ($$0 != 1.0F || $$1 != 1.0F) ? new bsw(this.a * $$0, this.b * $$1, this.c * $$1, this.d.a($$0, $$1, $$0), false) : this;
   }

   public static bsw b(float $$0, float $$1) {
      return new bsw($$0, $$1, false);
   }

   public static bsw c(float $$0, float $$1) {
      return new bsw($$0, $$1, true);
   }

   public bsw b(float $$0) {
      return new bsw(this.a, this.b, $$0, this.d, this.e);
   }

   public bsw a(bsv.a $$0) {
      return new bsw(this.a, this.b, this.c, $$0.a(this.a, this.b), this.e);
   }
}

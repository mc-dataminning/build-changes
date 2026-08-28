public record bsk(float a, float b, float c, bsj d, boolean e) {
   private bsk(float $$0, float $$1, boolean $$2) {
      this($$0, $$1, c($$1), bsj.a($$0, $$1), $$2);
   }

   private static float c(float $$0) {
      return $$0 * 0.85F;
   }

   public ewc a(ewh $$0) {
      return this.a($$0.c, $$0.d, $$0.e);
   }

   public ewc a(double $$0, double $$1, double $$2) {
      float $$3 = this.a / 2.0F;
      float $$4 = this.b;
      return new ewc($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public bsk a(float $$0) {
      return this.a($$0, $$0);
   }

   public bsk a(float $$0, float $$1) {
      return !this.e && ($$0 != 1.0F || $$1 != 1.0F) ? new bsk(this.a * $$0, this.b * $$1, this.c * $$1, this.d.a($$0, $$1, $$0), false) : this;
   }

   public static bsk b(float $$0, float $$1) {
      return new bsk($$0, $$1, false);
   }

   public static bsk c(float $$0, float $$1) {
      return new bsk($$0, $$1, true);
   }

   public bsk b(float $$0) {
      return new bsk(this.a, this.b, $$0, this.d, this.e);
   }

   public bsk a(bsj.a $$0) {
      return new bsk(this.a, this.b, this.c, $$0.a(this.a, this.b), this.e);
   }
}

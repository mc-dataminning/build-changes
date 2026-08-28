public record bsx(float a, float b, float c, bsw d, boolean e) {
   private bsx(float $$0, float $$1, boolean $$2) {
      this($$0, $$1, c($$1), bsw.a($$0, $$1), $$2);
   }

   private static float c(float $$0) {
      return $$0 * 0.85F;
   }

   public evm a(evr $$0) {
      return this.a($$0.c, $$0.d, $$0.e);
   }

   public evm a(double $$0, double $$1, double $$2) {
      float $$3 = this.a / 2.0F;
      float $$4 = this.b;
      return new evm($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public bsx a(float $$0) {
      return this.a($$0, $$0);
   }

   public bsx a(float $$0, float $$1) {
      return !this.e && ($$0 != 1.0F || $$1 != 1.0F) ? new bsx(this.a * $$0, this.b * $$1, this.c * $$1, this.d.a($$0, $$1, $$0), false) : this;
   }

   public static bsx b(float $$0, float $$1) {
      return new bsx($$0, $$1, false);
   }

   public static bsx c(float $$0, float $$1) {
      return new bsx($$0, $$1, true);
   }

   public bsx b(float $$0) {
      return new bsx(this.a, this.b, $$0, this.d, this.e);
   }

   public bsx a(bsw.a $$0) {
      return new bsx(this.a, this.b, this.c, $$0.a(this.a, this.b), this.e);
   }
}

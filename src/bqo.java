public record bqo(float a, float b, float c, bqn d, boolean e) {
   private bqo(float $$0, float $$1, boolean $$2) {
      this($$0, $$1, c($$1), bqn.a($$0, $$1), $$2);
   }

   private static float c(float $$0) {
      return $$0 * 0.85F;
   }

   public eta a(etf $$0) {
      return this.a($$0.c, $$0.d, $$0.e);
   }

   public eta a(double $$0, double $$1, double $$2) {
      float $$3 = this.a / 2.0F;
      float $$4 = this.b;
      return new eta($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public bqo a(float $$0) {
      return this.a($$0, $$0);
   }

   public bqo a(float $$0, float $$1) {
      return !this.e && ($$0 != 1.0F || $$1 != 1.0F) ? new bqo(this.a * $$0, this.b * $$1, this.c * $$1, this.d.a($$0, $$1, $$0), false) : this;
   }

   public static bqo b(float $$0, float $$1) {
      return new bqo($$0, $$1, false);
   }

   public static bqo c(float $$0, float $$1) {
      return new bqo($$0, $$1, true);
   }

   public bqo b(float $$0) {
      return new bqo(this.a, this.b, $$0, this.d, this.e);
   }

   public bqo a(bqn.a $$0) {
      return new bqo(this.a, this.b, this.c, $$0.a(this.a, this.b), this.e);
   }
}

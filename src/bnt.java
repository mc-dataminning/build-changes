public record bnt(float a, float b, float c, bns d, boolean e) {
   private bnt(float $$0, float $$1, boolean $$2) {
      this($$0, $$1, c($$1), bns.a($$0, $$1), $$2);
   }

   private static float c(float $$0) {
      return $$0 * 0.85F;
   }

   public enu a(enz $$0) {
      return this.a($$0.c, $$0.d, $$0.e);
   }

   public enu a(double $$0, double $$1, double $$2) {
      float $$3 = this.a / 2.0F;
      float $$4 = this.b;
      return new enu($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public bnt a(float $$0) {
      return this.a($$0, $$0);
   }

   public bnt a(float $$0, float $$1) {
      return !this.e && ($$0 != 1.0F || $$1 != 1.0F) ? new bnt(this.a * $$0, this.b * $$1, this.c * $$1, this.d.a($$0, $$1, $$0), false) : this;
   }

   public static bnt b(float $$0, float $$1) {
      return new bnt($$0, $$1, false);
   }

   public static bnt c(float $$0, float $$1) {
      return new bnt($$0, $$1, true);
   }

   public bnt b(float $$0) {
      return new bnt(this.a, this.b, $$0, this.d, this.e);
   }

   public bnt a(bns.a $$0) {
      return new bnt(this.a, this.b, this.c, $$0.a(this.a, this.b), this.e);
   }
}

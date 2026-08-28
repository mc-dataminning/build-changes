public record bup(float a, float b, float c, buo d, boolean e) {
   private bup(float $$0, float $$1, boolean $$2) {
      this($$0, $$1, c($$1), buo.a($$0, $$1), $$2);
   }

   private static float c(float $$0) {
      return $$0 * 0.85F;
   }

   public faw a(fbb $$0) {
      return this.a($$0.d, $$0.e, $$0.f);
   }

   public faw a(double $$0, double $$1, double $$2) {
      float $$3 = this.a / 2.0F;
      float $$4 = this.b;
      return new faw($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public bup a(float $$0) {
      return this.a($$0, $$0);
   }

   public bup a(float $$0, float $$1) {
      return !this.e && ($$0 != 1.0F || $$1 != 1.0F) ? new bup(this.a * $$0, this.b * $$1, this.c * $$1, this.d.a($$0, $$1, $$0), false) : this;
   }

   public static bup b(float $$0, float $$1) {
      return new bup($$0, $$1, false);
   }

   public static bup c(float $$0, float $$1) {
      return new bup($$0, $$1, true);
   }

   public bup b(float $$0) {
      return new bup(this.a, this.b, $$0, this.d, this.e);
   }

   public bup a(buo.a $$0) {
      return new bup(this.a, this.b, this.c, $$0.a(this.a, this.b), this.e);
   }
}

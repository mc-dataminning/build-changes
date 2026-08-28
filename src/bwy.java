public record bwy(float a, float b, float c, bwx d, boolean e) {
   private bwy(float $$0, float $$1, boolean $$2) {
      this($$0, $$1, c($$1), bwx.a($$0, $$1), $$2);
   }

   private static float c(float $$0) {
      return $$0 * 0.85F;
   }

   public ffn a(ffs $$0) {
      return this.a($$0.d, $$0.e, $$0.f);
   }

   public ffn a(double $$0, double $$1, double $$2) {
      float $$3 = this.a / 2.0F;
      float $$4 = this.b;
      return new ffn($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public bwy a(float $$0) {
      return this.a($$0, $$0);
   }

   public bwy a(float $$0, float $$1) {
      return !this.e && ($$0 != 1.0F || $$1 != 1.0F) ? new bwy(this.a * $$0, this.b * $$1, this.c * $$1, this.d.a($$0, $$1, $$0), false) : this;
   }

   public static bwy b(float $$0, float $$1) {
      return new bwy($$0, $$1, false);
   }

   public static bwy c(float $$0, float $$1) {
      return new bwy($$0, $$1, true);
   }

   public bwy b(float $$0) {
      return new bwy(this.a, this.b, $$0, this.d, this.e);
   }

   public bwy a(bwx.a $$0) {
      return new bwy(this.a, this.b, this.c, $$0.a(this.a, this.b), this.e);
   }
}

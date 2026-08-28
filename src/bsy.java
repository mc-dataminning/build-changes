public record bsy(float a, float b, float c, bsx d, boolean e) {
   private bsy(float $$0, float $$1, boolean $$2) {
      this($$0, $$1, c($$1), bsx.a($$0, $$1), $$2);
   }

   private static float c(float $$0) {
      return $$0 * 0.85F;
   }

   public evn a(evs $$0) {
      return this.a($$0.c, $$0.d, $$0.e);
   }

   public evn a(double $$0, double $$1, double $$2) {
      float $$3 = this.a / 2.0F;
      float $$4 = this.b;
      return new evn($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public bsy a(float $$0) {
      return this.a($$0, $$0);
   }

   public bsy a(float $$0, float $$1) {
      return !this.e && ($$0 != 1.0F || $$1 != 1.0F) ? new bsy(this.a * $$0, this.b * $$1, this.c * $$1, this.d.a($$0, $$1, $$0), false) : this;
   }

   public static bsy b(float $$0, float $$1) {
      return new bsy($$0, $$1, false);
   }

   public static bsy c(float $$0, float $$1) {
      return new bsy($$0, $$1, true);
   }

   public bsy b(float $$0) {
      return new bsy(this.a, this.b, $$0, this.d, this.e);
   }

   public bsy a(bsx.a $$0) {
      return new bsy(this.a, this.b, this.c, $$0.a(this.a, this.b), this.e);
   }
}

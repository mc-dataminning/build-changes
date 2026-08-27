public record brk(float a, float b, float c, brj d, boolean e) {
   private brk(float $$0, float $$1, boolean $$2) {
      this($$0, $$1, c($$1), brj.a($$0, $$1), $$2);
   }

   private static float c(float $$0) {
      return $$0 * 0.85F;
   }

   public etk a(etp $$0) {
      return this.a($$0.c, $$0.d, $$0.e);
   }

   public etk a(double $$0, double $$1, double $$2) {
      float $$3 = this.a / 2.0F;
      float $$4 = this.b;
      return new etk($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public brk a(float $$0) {
      return this.a($$0, $$0);
   }

   public brk a(float $$0, float $$1) {
      return !this.e && ($$0 != 1.0F || $$1 != 1.0F) ? new brk(this.a * $$0, this.b * $$1, this.c * $$1, this.d.a($$0, $$1, $$0), false) : this;
   }

   public static brk b(float $$0, float $$1) {
      return new brk($$0, $$1, false);
   }

   public static brk c(float $$0, float $$1) {
      return new brk($$0, $$1, true);
   }

   public brk b(float $$0) {
      return new brk(this.a, this.b, $$0, this.d, this.e);
   }

   public brk a(brj.a $$0) {
      return new brk(this.a, this.b, this.c, $$0.a(this.a, this.b), this.e);
   }
}

public class bkj {
   public final float a;
   public final float b;
   public final boolean c;

   public bkj(float $$0, float $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ejd a(eji $$0) {
      return this.a($$0.c, $$0.d, $$0.e);
   }

   public ejd a(double $$0, double $$1, double $$2) {
      float $$3 = this.a / 2.0F;
      float $$4 = this.b;
      return new ejd($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public bkj a(float $$0) {
      return this.a($$0, $$0);
   }

   public bkj a(float $$0, float $$1) {
      return !this.c && ($$0 != 1.0F || $$1 != 1.0F) ? b(this.a * $$0, this.b * $$1) : this;
   }

   public static bkj b(float $$0, float $$1) {
      return new bkj($$0, $$1, false);
   }

   public static bkj c(float $$0, float $$1) {
      return new bkj($$0, $$1, true);
   }

   @Override
   public String toString() {
      return "EntityDimensions w=" + this.a + ", h=" + this.b + ", fixed=" + this.c;
   }
}

public class bir {
   public final float a;
   public final float b;
   public final boolean c;

   public bir(float $$0, float $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ehi a(ehn $$0) {
      return this.a($$0.c, $$0.d, $$0.e);
   }

   public ehi a(double $$0, double $$1, double $$2) {
      float $$3 = this.a / 2.0F;
      float $$4 = this.b;
      return new ehi($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public bir a(float $$0) {
      return this.a($$0, $$0);
   }

   public bir a(float $$0, float $$1) {
      return !this.c && ($$0 != 1.0F || $$1 != 1.0F) ? b(this.a * $$0, this.b * $$1) : this;
   }

   public static bir b(float $$0, float $$1) {
      return new bir($$0, $$1, false);
   }

   public static bir c(float $$0, float $$1) {
      return new bir($$0, $$1, true);
   }

   @Override
   public String toString() {
      return "EntityDimensions w=" + this.a + ", h=" + this.b + ", fixed=" + this.c;
   }
}

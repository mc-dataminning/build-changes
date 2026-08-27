public class bsm extends bsw {
   public static final float a = 8.0F;

   @Override
   protected boolean a(biw $$0, biw $$1) {
      return this.f($$0, $$1) && $$1.ba() && (this.b($$1) || this.e($$0, $$1)) && btc.c($$0, $$1);
   }

   private boolean e(biw $$0, biw $$1) {
      return !$$0.dM().a(bry.T) && $$1.ag().a(apm.h);
   }

   private boolean b(biw $$0) {
      return $$0.ag().a(apm.g);
   }

   private boolean f(biw $$0, biw $$1) {
      return $$1.f((big)$$0) <= 64.0;
   }

   @Override
   protected bry<biw> b() {
      return bry.B;
   }
}

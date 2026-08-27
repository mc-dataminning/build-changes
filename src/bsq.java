public class bsq extends bta {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bjb $$0, bjb $$1) {
      return this.f($$0, $$1) && $$1.ba() && (this.b($$1) || this.e($$0, $$1)) && btg.c($$0, $$1);
   }

   private boolean e(bjb $$0, bjb $$1) {
      return !$$0.dM().a(bsc.T) && $$1.ag().a(apr.h);
   }

   private boolean b(bjb $$0) {
      return $$0.ag().a(apr.g);
   }

   private boolean f(bjb $$0, bjb $$1) {
      return $$1.f((bil)$$0) <= 64.0;
   }

   @Override
   protected bsc<bjb> b() {
      return bsc.B;
   }
}

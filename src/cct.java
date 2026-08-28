public class cct extends cdf {
   public static final float a = 8.0F;

   @Override
   protected boolean a(btb $$0, btb $$1) {
      return this.f($$0, $$1) && $$1.bi() && (this.b($$1) || this.e($$0, $$1)) && cdl.c($$0, $$1);
   }

   private boolean e(btb $$0, btb $$1) {
      return !$$0.dU().a(ccf.U) && $$1.al().a(awa.j);
   }

   private boolean b(btb $$0) {
      return $$0.al().a(awa.i);
   }

   private boolean f(btb $$0, btb $$1) {
      return $$1.g((bsg)$$0) <= 64.0;
   }

   @Override
   protected ccf<btb> b() {
      return ccf.B;
   }
}

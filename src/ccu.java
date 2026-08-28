public class ccu extends cdg {
   public static final float a = 8.0F;

   @Override
   protected boolean a(btc $$0, btc $$1) {
      return this.f($$0, $$1) && $$1.bj() && (this.b($$1) || this.e($$0, $$1)) && cdm.c($$0, $$1);
   }

   private boolean e(btc $$0, btc $$1) {
      return !$$0.dV().a(ccg.U) && $$1.am().a(awa.j);
   }

   private boolean b(btc $$0) {
      return $$0.am().a(awa.i);
   }

   private boolean f(btc $$0, btc $$1) {
      return $$1.g((bsh)$$0) <= 64.0;
   }

   @Override
   protected ccg<btc> b() {
      return ccg.B;
   }
}

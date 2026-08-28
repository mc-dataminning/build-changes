public class cdi extends cdu {
   public static final float a = 8.0F;

   @Override
   protected boolean a(btq $$0, btq $$1) {
      return this.f($$0, $$1) && $$1.bh() && (this.b($$1) || this.e($$0, $$1)) && cea.c($$0, $$1);
   }

   private boolean e(btq $$0, btq $$1) {
      return !$$0.dS().a(ccu.U) && $$1.ak().a(awt.j);
   }

   private boolean b(btq $$0) {
      return $$0.ak().a(awt.i);
   }

   private boolean f(btq $$0, btq $$1) {
      return $$1.g((bsv)$$0) <= 64.0;
   }

   @Override
   protected ccu<btq> b() {
      return ccu.B;
   }
}

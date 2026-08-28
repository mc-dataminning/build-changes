public class cdc extends cdo {
   public static final float a = 8.0F;

   @Override
   protected boolean a(btk $$0, btk $$1) {
      return this.f($$0, $$1) && $$1.bh() && (this.b($$1) || this.e($$0, $$1)) && cdu.c($$0, $$1);
   }

   private boolean e(btk $$0, btk $$1) {
      return !$$0.dS().a(cco.U) && $$1.ak().a(awp.j);
   }

   private boolean b(btk $$0) {
      return $$0.ak().a(awp.i);
   }

   private boolean f(btk $$0, btk $$1) {
      return $$1.g((bsp)$$0) <= 64.0;
   }

   @Override
   protected cco<btk> b() {
      return cco.B;
   }
}

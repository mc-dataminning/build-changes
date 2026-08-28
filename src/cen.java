public class cen extends cez {
   public static final float a = 8.0F;

   @Override
   protected boolean a(buv $$0, buv $$1) {
      return this.f($$0, $$1) && $$1.bn() && (this.b($$1) || this.e($$0, $$1)) && cff.c($$0, $$1);
   }

   private boolean e(buv $$0, buv $$1) {
      return !$$0.ed().a(cdz.U) && $$1.aq().a(axd.j);
   }

   private boolean b(buv $$0) {
      return $$0.aq().a(axd.i);
   }

   private boolean f(buv $$0, buv $$1) {
      return $$1.g((btz)$$0) <= 64.0;
   }

   @Override
   protected cdz<buv> b() {
      return cdz.B;
   }
}

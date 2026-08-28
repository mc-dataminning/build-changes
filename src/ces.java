public class ces extends cfe {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bva $$0, bva $$1) {
      return this.f($$0, $$1) && $$1.bn() && (this.b($$1) || this.e($$0, $$1)) && cfk.c($$0, $$1);
   }

   private boolean e(bva $$0, bva $$1) {
      return !$$0.ed().a(cee.U) && $$1.ar().a(axe.j);
   }

   private boolean b(bva $$0) {
      return $$0.ar().a(axe.i);
   }

   private boolean f(bva $$0, bva $$1) {
      return $$1.g((bue)$$0) <= 64.0;
   }

   @Override
   protected cee<bva> b() {
      return cee.B;
   }
}

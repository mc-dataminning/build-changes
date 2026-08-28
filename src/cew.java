public class cew extends cfi {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bve $$0, bve $$1) {
      return this.f($$0, $$1) && $$1.bo() && (this.b($$1) || this.e($$0, $$1)) && cfo.c($$0, $$1);
   }

   private boolean e(bve $$0, bve $$1) {
      return !$$0.ee().a(cei.U) && $$1.ar().a(axh.j);
   }

   private boolean b(bve $$0) {
      return $$0.ar().a(axh.i);
   }

   private boolean f(bve $$0, bve $$1) {
      return $$1.g((bui)$$0) <= 64.0;
   }

   @Override
   protected cei<bve> b() {
      return cei.B;
   }
}

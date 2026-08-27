public class cbr extends ccd {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bsa $$0, bsa $$1) {
      return this.f($$0, $$1) && $$1.bf() && (this.b($$1) || this.e($$0, $$1)) && ccj.c($$0, $$1);
   }

   private boolean e(bsa $$0, bsa $$1) {
      return !$$0.dQ().a(cbd.U) && $$1.ai().a(avu.j);
   }

   private boolean b(bsa $$0) {
      return $$0.ai().a(avu.i);
   }

   private boolean f(bsa $$0, bsa $$1) {
      return $$1.g((brh)$$0) <= 64.0;
   }

   @Override
   protected cbd<bsa> b() {
      return cbd.B;
   }
}

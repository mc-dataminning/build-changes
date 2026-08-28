public class cdw extends cei {
   public static final float a = 8.0F;

   @Override
   protected boolean a(buf $$0, buf $$1) {
      return this.f($$0, $$1) && $$1.bl() && (this.b($$1) || this.e($$0, $$1)) && ceo.c($$0, $$1);
   }

   private boolean e(buf $$0, buf $$1) {
      return !$$0.dX().a(cdi.U) && $$1.ao().a(aww.j);
   }

   private boolean b(buf $$0) {
      return $$0.ao().a(aww.i);
   }

   private boolean f(buf $$0, buf $$1) {
      return $$1.g((btj)$$0) <= 64.0;
   }

   @Override
   protected cdi<buf> b() {
      return cdi.B;
   }
}

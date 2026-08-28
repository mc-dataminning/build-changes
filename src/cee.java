public class cee extends ceq {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bun $$0, bun $$1) {
      return this.f($$0, $$1) && $$1.bl() && (this.b($$1) || this.e($$0, $$1)) && cew.c($$0, $$1);
   }

   private boolean e(bun $$0, bun $$1) {
      return !$$0.dY().a(cdq.U) && $$1.ao().a(awz.j);
   }

   private boolean b(bun $$0) {
      return $$0.ao().a(awz.i);
   }

   private boolean f(bun $$0, bun $$1) {
      return $$1.g((btr)$$0) <= 64.0;
   }

   @Override
   protected cdq<bun> b() {
      return cdq.B;
   }
}

public class bzf extends bzr {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bpo $$0, bpo $$1) {
      return this.f($$0, $$1) && $$1.bf() && (this.b($$1) || this.e($$0, $$1)) && bzx.c($$0, $$1);
   }

   private boolean e(bpo $$0, bpo $$1) {
      return !$$0.dP().a(byr.U) && $$1.ai().a(auq.j);
   }

   private boolean b(bpo $$0) {
      return $$0.ai().a(auq.i);
   }

   private boolean f(bpo $$0, bpo $$1) {
      return $$1.g((bow)$$0) <= 64.0;
   }

   @Override
   protected byr<bpo> b() {
      return byr.B;
   }
}

public class bxz extends byl {
   public static final float a = 8.0F;

   @Override
   protected boolean a(boi $$0, boi $$1) {
      return this.f($$0, $$1) && $$1.bc() && (this.b($$1) || this.e($$0, $$1)) && byr.c($$0, $$1);
   }

   private boolean e(boi $$0, boi $$1) {
      return !$$0.dO().a(bxl.U) && $$1.ai().a(aud.j);
   }

   private boolean b(boi $$0) {
      return $$0.ai().a(aud.i);
   }

   private boolean f(boi $$0, boi $$1) {
      return $$1.f((bnq)$$0) <= 64.0;
   }

   @Override
   protected bxl<boi> b() {
      return bxl.B;
   }
}

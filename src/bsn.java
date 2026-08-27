public class bsn extends bsx {
   public static final float a = 8.0F;

   @Override
   protected boolean a(biy $$0, biy $$1) {
      return this.f($$0, $$1) && $$1.ba() && (this.b($$1) || this.e($$0, $$1)) && btd.c($$0, $$1);
   }

   private boolean e(biy $$0, biy $$1) {
      return !$$0.dM().a(brz.T) && $$1.ag().a(apo.h);
   }

   private boolean b(biy $$0) {
      return $$0.ag().a(apo.g);
   }

   private boolean f(biy $$0, biy $$1) {
      return $$1.f((bii)$$0) <= 64.0;
   }

   @Override
   protected brz<biy> b() {
      return brz.B;
   }
}

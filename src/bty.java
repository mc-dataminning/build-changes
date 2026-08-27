public class bty extends bui {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bkj $$0, bkj $$1) {
      return this.f($$0, $$1) && $$1.ba() && (this.b($$1) || this.e($$0, $$1)) && buo.c($$0, $$1);
   }

   private boolean e(bkj $$0, bkj $$1) {
      return !$$0.dN().a(btk.T) && $$1.ag().a(aqv.j);
   }

   private boolean b(bkj $$0) {
      return $$0.ag().a(aqv.i);
   }

   private boolean f(bkj $$0, bkj $$1) {
      return $$1.f((bjt)$$0) <= 64.0;
   }

   @Override
   protected btk<bkj> b() {
      return btk.B;
   }
}

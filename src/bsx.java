public class bsx extends bth {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bji $$0, bji $$1) {
      return this.f($$0, $$1) && $$1.ba() && (this.b($$1) || this.e($$0, $$1)) && btn.c($$0, $$1);
   }

   private boolean e(bji $$0, bji $$1) {
      return !$$0.dN().a(bsj.T) && $$1.ag().a(apx.h);
   }

   private boolean b(bji $$0) {
      return $$0.ag().a(apx.g);
   }

   private boolean f(bji $$0, bji $$1) {
      return $$1.f((bis)$$0) <= 64.0;
   }

   @Override
   protected bsj<bji> b() {
      return bsj.B;
   }
}

public class bva extends bvk {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bll $$0, bll $$1) {
      return this.f($$0, $$1) && $$1.bc() && (this.b($$1) || this.e($$0, $$1)) && bvq.c($$0, $$1);
   }

   private boolean e(bll $$0, bll $$1) {
      return !$$0.dP().a(bum.T) && $$1.ai().a(arn.j);
   }

   private boolean b(bll $$0) {
      return $$0.ai().a(arn.i);
   }

   private boolean f(bll $$0, bll $$1) {
      return $$1.f((bkv)$$0) <= 64.0;
   }

   @Override
   protected bum<bll> b() {
      return bum.B;
   }
}

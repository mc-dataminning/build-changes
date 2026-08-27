public class bpp extends bpz {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bfz $$0, bfz $$1) {
      return this.f($$0, $$1) && $$1.aY() && (this.b($$1) || this.e($$0, $$1)) && bqf.c($$0, $$1);
   }

   private boolean e(bfz $$0, bfz $$1) {
      return !$$0.dK().a(bpb.T) && $$1.ae().a(amz.h);
   }

   private boolean b(bfz $$0) {
      return $$0.ae().a(amz.g);
   }

   private boolean f(bfz $$0, bfz $$1) {
      return $$1.f((bfj)$$0) <= 64.0;
   }

   @Override
   protected bpb<bfz> b() {
      return bpb.B;
   }
}

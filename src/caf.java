public class caf extends car {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bqo $$0, bqo $$1) {
      return this.f($$0, $$1) && $$1.bf() && (this.b($$1) || this.e($$0, $$1)) && cax.c($$0, $$1);
   }

   private boolean e(bqo $$0, bqo $$1) {
      return !$$0.dP().a(bzr.U) && $$1.ai().a(avf.j);
   }

   private boolean b(bqo $$0) {
      return $$0.ai().a(avf.i);
   }

   private boolean f(bqo $$0, bqo $$1) {
      return $$1.g((bpv)$$0) <= 64.0;
   }

   @Override
   protected bzr<bqo> b() {
      return bzr.B;
   }
}

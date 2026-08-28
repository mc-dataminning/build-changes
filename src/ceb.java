public class ceb extends cen {
   public static final float a = 8.0F;

   @Override
   protected boolean a(buk $$0, buk $$1) {
      return this.f($$0, $$1) && $$1.bl() && (this.b($$1) || this.e($$0, $$1)) && cet.c($$0, $$1);
   }

   private boolean e(buk $$0, buk $$1) {
      return !$$0.dX().a(cdn.U) && $$1.ao().a(awx.j);
   }

   private boolean b(buk $$0) {
      return $$0.ao().a(awx.i);
   }

   private boolean f(buk $$0, buk $$1) {
      return $$1.g((bto)$$0) <= 64.0;
   }

   @Override
   protected cdn<buk> b() {
      return cdn.B;
   }
}

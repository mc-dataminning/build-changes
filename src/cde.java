public class cde extends cdq {
   public static final float a = 8.0F;

   @Override
   protected boolean a(btl $$0, btl $$1) {
      return this.f($$0, $$1) && $$1.bi() && (this.b($$1) || this.e($$0, $$1)) && cdw.c($$0, $$1);
   }

   private boolean e(btl $$0, btl $$1) {
      return !$$0.dU().a(ccq.U) && $$1.am().a(awh.j);
   }

   private boolean b(btl $$0) {
      return $$0.am().a(awh.i);
   }

   private boolean f(btl $$0, btl $$1) {
      return $$1.g((bsq)$$0) <= 64.0;
   }

   @Override
   protected ccq<btl> b() {
      return ccq.B;
   }
}

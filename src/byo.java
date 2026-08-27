public class byo extends bza {
   public static final float a = 8.0F;

   @Override
   protected boolean a(box $$0, box $$1) {
      return this.f($$0, $$1) && $$1.bc() && (this.b($$1) || this.e($$0, $$1)) && bzg.c($$0, $$1);
   }

   private boolean e(box $$0, box $$1) {
      return !$$0.dM().a(bya.U) && $$1.ai().a(auh.j);
   }

   private boolean b(box $$0) {
      return $$0.ai().a(auh.i);
   }

   private boolean f(box $$0, box $$1) {
      return $$1.f((bof)$$0) <= 64.0;
   }

   @Override
   protected bya<box> b() {
      return bya.B;
   }
}

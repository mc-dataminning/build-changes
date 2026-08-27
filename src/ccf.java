public class ccf extends ccr {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bso $$0, bso $$1) {
      return this.f($$0, $$1) && $$1.bl() && (this.b($$1) || this.e($$0, $$1)) && ccx.c($$0, $$1);
   }

   private boolean e(bso $$0, bso $$1) {
      return !$$0.dZ().a(cbr.U) && $$1.ak().a(awh.j);
   }

   private boolean b(bso $$0) {
      return $$0.ak().a(awh.i);
   }

   private boolean f(bso $$0, bso $$1) {
      return $$1.g((brv)$$0) <= 64.0;
   }

   @Override
   protected cbr<bso> b() {
      return cbr.B;
   }
}

public class cak extends caw {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bqt $$0, bqt $$1) {
      return this.f($$0, $$1) && $$1.bf() && (this.b($$1) || this.e($$0, $$1)) && cbc.c($$0, $$1);
   }

   private boolean e(bqt $$0, bqt $$1) {
      return !$$0.dP().a(bzw.U) && $$1.ai().a(avh.j);
   }

   private boolean b(bqt $$0) {
      return $$0.ai().a(avh.i);
   }

   private boolean f(bqt $$0, bqt $$1) {
      return $$1.g((bqa)$$0) <= 64.0;
   }

   @Override
   protected bzw<bqt> b() {
      return bzw.B;
   }
}

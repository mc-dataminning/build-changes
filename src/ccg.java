public class ccg extends ccs {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bso $$0, bso $$1) {
      return this.f($$0, $$1) && $$1.bh() && (this.b($$1) || this.e($$0, $$1)) && ccy.c($$0, $$1);
   }

   private boolean e(bso $$0, bso $$1) {
      return !$$0.dS().a(cbs.U) && $$1.ak().a(avz.j);
   }

   private boolean b(bso $$0) {
      return $$0.ak().a(avz.i);
   }

   private boolean f(bso $$0, bso $$1) {
      return $$1.g((bru)$$0) <= 64.0;
   }

   @Override
   protected cbs<bso> b() {
      return cbs.B;
   }
}

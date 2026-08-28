public class cdg extends cds {
   public static final float a = 8.0F;

   @Override
   protected boolean a(btn $$0, btn $$1) {
      return this.f($$0, $$1) && $$1.bi() && (this.b($$1) || this.e($$0, $$1)) && cdy.c($$0, $$1);
   }

   private boolean e(btn $$0, btn $$1) {
      return !$$0.dU().a(ccs.U) && $$1.am().a(awi.j);
   }

   private boolean b(btn $$0) {
      return $$0.am().a(awi.i);
   }

   private boolean f(btn $$0, btn $$1) {
      return $$1.g((bsr)$$0) <= 64.0;
   }

   @Override
   protected ccs<btn> b() {
      return ccs.B;
   }
}

public class cfq extends cgc {
   public static final float a = 8.0F;

   @Override
   protected boolean a(ard $$0, bvy $$1, bvy $$2) {
      return this.b($$1, $$2) && $$2.bj() && (this.b($$2) || this.a($$1, $$2)) && cgi.c($$0, $$1, $$2);
   }

   private boolean a(bvy $$0, bvy $$1) {
      return !$$0.ea().a(cfc.U) && $$1.aq().a(awt.j);
   }

   private boolean b(bvy $$0) {
      return $$0.aq().a(awt.i);
   }

   private boolean b(bvy $$0, bvy $$1) {
      return $$1.g((bva)$$0) <= 64.0;
   }

   @Override
   protected cfc<bvy> b() {
      return cfc.B;
   }
}

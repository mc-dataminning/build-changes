public class ccq extends cdc {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bsy $$0, bsy $$1) {
      return this.f($$0, $$1) && $$1.bh() && (this.b($$1) || this.e($$0, $$1)) && cdi.c($$0, $$1);
   }

   private boolean e(bsy $$0, bsy $$1) {
      return !$$0.dT().a(ccc.U) && $$1.ak().a(avy.j);
   }

   private boolean b(bsy $$0) {
      return $$0.ak().a(avy.i);
   }

   private boolean f(bsy $$0, bsy $$1) {
      return $$1.g((bsd)$$0) <= 64.0;
   }

   @Override
   protected ccc<bsy> b() {
      return ccc.B;
   }
}

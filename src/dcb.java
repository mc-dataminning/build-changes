public class dcb extends cvo {
   public dcb(bhw $$0, dfd.d $$1) {
      super($$0, 8, $$1);
   }

   @Override
   protected boolean d(dfe $$0, cow $$1, gw $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(csr.dW) || $$0.a(csr.dX) || $$0.a(csr.dY);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      eib $$4 = this.a($$0, $$1, $$2, ehn.a());
      ehi $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(ix.Z, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      if (!$$1.B && $$1.ai() != bgq.a) {
         if ($$3 instanceof bjb $$4 && !$$4.b($$1.ag().p())) {
            $$4.b(new bhy(bia.t, 40));
         }
      }
   }
}

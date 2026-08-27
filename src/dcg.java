public class dcg extends cvt {
   public dcg(bib $$0, dfi.d $$1) {
      super($$0, 8, $$1);
   }

   @Override
   protected boolean d(dfj $$0, cpb $$1, gw $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(csw.dW) || $$0.a(csw.dX) || $$0.a(csw.dY);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      eig $$4 = this.a($$0, $$1, $$2, ehs.a());
      ehn $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(iv.Z, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      if (!$$1.B && $$1.ai() != bgv.a) {
         if ($$3 instanceof bjg $$4 && !$$4.b($$1.ag().p())) {
            $$4.b(new bid(bif.t, 40));
         }
      }
   }
}

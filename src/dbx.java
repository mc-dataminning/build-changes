public class dbx extends cvk {
   public dbx(bht $$0, dez.d $$1) {
      super($$0, 8, $$1);
   }

   @Override
   protected boolean d(dfa $$0, cos $$1, gu $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(csn.dW) || $$0.a(csn.dX) || $$0.a(csn.dY);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      ehx $$4 = this.a($$0, $$1, $$2, ehj.a());
      ehe $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(iv.Z, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
      if (!$$1.B && $$1.ai() != bgn.a) {
         if ($$3 instanceof biy $$4 && !$$4.b($$1.ag().p())) {
            $$4.b(new bhv(bhx.t, 40));
         }
      }
   }
}

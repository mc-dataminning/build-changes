public class dbv extends cvi {
   public dbv(bhr $$0, dex.d $$1) {
      super($$0, 8, $$1);
   }

   @Override
   protected boolean d(dey $$0, coq $$1, gv $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(csl.dW) || $$0.a(csl.dX) || $$0.a(csl.dY);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      ehy $$4 = this.a($$0, $$1, $$2, ehk.a());
      ehf $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(iw.Z, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      if (!$$1.B && $$1.ai() != bgl.a) {
         if ($$3 instanceof biw $$4 && !$$4.b($$1.ag().p())) {
            $$4.b(new bht(bhv.t, 40));
         }
      }
   }
}

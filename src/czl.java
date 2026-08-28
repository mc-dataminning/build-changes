public class czl extends cyo {
   public czl(cyo.a $$0) {
      super($$0);
   }

   @Override
   public cys m() {
      cys $$0 = super.m();
      $$0.b(kj.R, new dao(dap.a));
      return $$0;
   }

   @Override
   public bty a(dcn $$0) {
      dip $$1 = $$0.q();
      iu $$2 = $$0.a();
      cqs $$3 = $$0.o();
      cys $$4 = $$0.n();
      dao $$5 = $$4.a(kj.R, dao.a);
      dzo $$6 = $$1.a_($$2);
      if ($$0.k() != ja.a && $$6.a(axa.cm) && $$5.a(dap.a)) {
         $$1.a(null, $$2, awl.kI, awm.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cyv.a($$4, $$3, new cys(cyw.tl)));
         $$3.b(awv.c.b($$4.h()));
         if (!$$1.C) {
            aro $$7 = (aro)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lx.ap, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awl.cB, awm.e, 1.0F, 1.0F);
         $$1.a(null, eeo.z, $$2);
         $$1.b($$2, dlw.to.m());
         return bty.a;
      } else {
         return bty.e;
      }
   }

   @Override
   public ww a(cys $$0) {
      dao $$1 = $$0.a(kj.R);
      return $$1 != null ? $$1.a(this.n + ".effect.") : super.a($$0);
   }
}

public class dbd extends dag {
   public dbd(dag.a $$0) {
      super($$0);
   }

   @Override
   public dak m() {
      dak $$0 = super.m();
      $$0.b(kl.R, new dcg(dch.a));
      return $$0;
   }

   @Override
   public bvc a(def $$0) {
      dkj $$1 = $$0.q();
      iw $$2 = $$0.a();
      csi $$3 = $$0.o();
      dak $$4 = $$0.n();
      dcg $$5 = $$4.a(kl.R, dcg.a);
      ebq $$6 = $$1.a_($$2);
      if ($$0.k() != jc.a && $$6.a(axn.co) && $$5.a(dch.a)) {
         $$1.a(null, $$2, awy.kM, awz.e, 1.0F, 1.0F);
         $$3.a($$0.p(), dan.a($$4, $$3, new dak(dao.ts)));
         $$3.b(axi.c.b($$4.h()));
         if (!$$1.C) {
            asb $$7 = (asb)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lz.ap, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awy.cB, awz.e, 1.0F, 1.0F);
         $$1.a(null, egq.z, $$2);
         $$1.b($$2, dnq.ts.m());
         return bvc.a;
      } else {
         return bvc.e;
      }
   }

   @Override
   public xg a(dak $$0) {
      dcg $$1 = $$0.a(kl.R);
      return $$1 != null ? $$1.a(this.n + ".effect.") : super.a($$0);
   }
}

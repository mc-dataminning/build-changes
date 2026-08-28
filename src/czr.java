public class czr extends cyu {
   public czr(cyu.a $$0) {
      super($$0);
   }

   @Override
   public cyy m() {
      cyy $$0 = super.m();
      $$0.b(kj.R, new dau(dav.a));
      return $$0;
   }

   @Override
   public bub a(dct $$0) {
      div $$1 = $$0.q();
      iu $$2 = $$0.a();
      cqy $$3 = $$0.o();
      cyy $$4 = $$0.n();
      dau $$5 = $$4.a(kj.R, dau.a);
      dzz $$6 = $$1.a_($$2);
      if ($$0.k() != ja.a && $$6.a(axc.cm) && $$5.a(dav.a)) {
         $$1.a(null, $$2, awn.kJ, awo.e, 1.0F, 1.0F);
         $$3.a($$0.p(), czb.a($$4, $$3, new cyy(czc.tn)));
         $$3.b(awx.c.b($$4.h()));
         if (!$$1.C) {
            arq $$7 = (arq)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lx.ap, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awn.cB, awo.e, 1.0F, 1.0F);
         $$1.a(null, eez.z, $$2);
         $$1.b($$2, dmc.tp.m());
         return bub.a;
      } else {
         return bub.e;
      }
   }

   @Override
   public wy a(cyy $$0) {
      dau $$1 = $$0.a(kj.R);
      return $$1 != null ? $$1.a(this.n + ".effect.") : super.a($$0);
   }
}

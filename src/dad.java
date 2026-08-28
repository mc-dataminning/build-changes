public class dad extends czg {
   public dad(czg.a $$0) {
      super($$0);
   }

   @Override
   public czk m() {
      czk $$0 = super.m();
      $$0.b(kk.R, new dbg(dbh.a));
      return $$0;
   }

   @Override
   public bug a(ddf $$0) {
      djh $$1 = $$0.q();
      iv $$2 = $$0.a();
      crj $$3 = $$0.o();
      czk $$4 = $$0.n();
      dbg $$5 = $$4.a(kk.R, dbg.a);
      eao $$6 = $$1.a_($$2);
      if ($$0.k() != jb.a && $$6.a(axc.co) && $$5.a(dbh.a)) {
         $$1.a(null, $$2, awn.kM, awo.e, 1.0F, 1.0F);
         $$3.a($$0.p(), czn.a($$4, $$3, new czk(czo.ts)));
         $$3.b(awx.c.b($$4.h()));
         if (!$$1.C) {
            arq $$7 = (arq)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(ly.ap, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awn.cB, awo.e, 1.0F, 1.0F);
         $$1.a(null, efo.z, $$2);
         $$1.b($$2, dmo.ts.m());
         return bug.a;
      } else {
         return bug.e;
      }
   }

   @Override
   public wy a(czk $$0) {
      dbg $$1 = $$0.a(kk.R);
      return $$1 != null ? $$1.a(this.n + ".effect.") : super.a($$0);
   }
}

public class dag extends czj {
   public dag(czj.a $$0) {
      super($$0);
   }

   @Override
   public czn m() {
      czn $$0 = super.m();
      $$0.b(kk.R, new dbj(dbk.a));
      return $$0;
   }

   @Override
   public bug a(ddi $$0) {
      djm $$1 = $$0.q();
      iv $$2 = $$0.a();
      crm $$3 = $$0.o();
      czn $$4 = $$0.n();
      dbj $$5 = $$4.a(kk.R, dbj.a);
      eat $$6 = $$1.a_($$2);
      if ($$0.k() != jb.a && $$6.a(axc.co) && $$5.a(dbk.a)) {
         $$1.a(null, $$2, awn.kM, awo.e, 1.0F, 1.0F);
         $$3.a($$0.p(), czq.a($$4, $$3, new czn(czr.ts)));
         $$3.b(awx.c.b($$4.h()));
         if (!$$1.C) {
            arq $$7 = (arq)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(ly.ap, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awn.cB, awo.e, 1.0F, 1.0F);
         $$1.a(null, eft.z, $$2);
         $$1.b($$2, dmt.ts.m());
         return bug.a;
      } else {
         return bug.e;
      }
   }

   @Override
   public wy a(czn $$0) {
      dbj $$1 = $$0.a(kk.R);
      return $$1 != null ? $$1.a(this.n + ".effect.") : super.a($$0);
   }
}

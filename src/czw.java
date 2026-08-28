public class czw extends cyz {
   public czw(cyz.a $$0) {
      super($$0);
   }

   @Override
   public czd m() {
      czd $$0 = super.m();
      $$0.b(kj.R, new daz(dba.a));
      return $$0;
   }

   @Override
   public bud a(dcy $$0) {
      dja $$1 = $$0.q();
      iu $$2 = $$0.a();
      crc $$3 = $$0.o();
      czd $$4 = $$0.n();
      daz $$5 = $$4.a(kj.R, daz.a);
      eah $$6 = $$1.a_($$2);
      if ($$0.k() != ja.a && $$6.a(axc.cn) && $$5.a(dba.a)) {
         $$1.a(null, $$2, awn.kM, awo.e, 1.0F, 1.0F);
         $$3.a($$0.p(), czg.a($$4, $$3, new czd(czh.ts)));
         $$3.b(awx.c.b($$4.h()));
         if (!$$1.C) {
            arq $$7 = (arq)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lx.ap, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awn.cB, awo.e, 1.0F, 1.0F);
         $$1.a(null, efh.z, $$2);
         $$1.b($$2, dmh.ts.m());
         return bud.a;
      } else {
         return bud.e;
      }
   }

   @Override
   public wy a(czd $$0) {
      daz $$1 = $$0.a(kj.R);
      return $$1 != null ? $$1.a(this.n + ".effect.") : super.a($$0);
   }
}

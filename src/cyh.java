public class cyh extends cyz {
   public cyh(cyz.a $$0) {
      super($$0);
   }

   @Override
   public bud a(dcy $$0) {
      dja $$1 = $$0.q();
      iu $$2 = $$0.a();
      eah $$3 = $$1.a_($$2);
      if (!$$3.a(dmh.fX) || $$3.c(dow.c)) {
         return bud.e;
      } else if ($$1.C) {
         return bud.a;
      } else {
         eah $$4 = $$3.b(dow.c, Boolean.valueOf(true));
         dmf.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.b($$2, dmh.fX);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         eam.b $$5 = dow.b().a($$1, $$2);
         if ($$5 != null) {
            iu $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  iu $$9 = $$6.b($$7, 0, $$8);
                  $$1.a($$9, true, null);
                  $$1.a($$9, dmh.fW.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bud.a;
      }
   }

   @Override
   public int a(czd $$0, bxe $$1) {
      return 0;
   }

   @Override
   public bud a(dja $$0, crc $$1, buc $$2) {
      czd $$3 = $$1.b($$2);
      fem $$4 = a($$0, $$1, dij.b.a);
      if ($$4.d() == feo.a.b && $$0.a_($$4.b()).a(dmh.fX)) {
         return bud.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof arq $$5) {
            iu $$6 = $$5.a(axn.a, $$1.dv(), 100, false);
            if ($$6 == null) {
               return bud.c;
            }

            crq $$7 = new crq($$0, $$1.dA(), $$1.e(0.5), $$1.dG());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(efh.K, $$7.dt(), efh.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof arr $$8) {
               ap.n.a($$8, $$6);
            }

            float $$9 = azm.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awn.iG, awo.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awx.c.b(this));
         }

         return bud.b;
      }
   }
}

public class cyo extends czg {
   public cyo(czg.a $$0) {
      super($$0);
   }

   @Override
   public bug a(ddf $$0) {
      djh $$1 = $$0.q();
      iv $$2 = $$0.a();
      eao $$3 = $$1.a_($$2);
      if (!$$3.a(dmo.fX) || $$3.c(dpd.c)) {
         return bug.e;
      } else if ($$1.C) {
         return bug.a;
      } else {
         eao $$4 = $$3.b(dpd.c, Boolean.valueOf(true));
         dmm.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.b($$2, dmo.fX);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         eat.b $$5 = dpd.b().a($$1, $$2);
         if ($$5 != null) {
            iv $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  iv $$9 = $$6.b($$7, 0, $$8);
                  $$1.a($$9, true, null);
                  $$1.a($$9, dmo.fW.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bug.a;
      }
   }

   @Override
   public int a(czk $$0, bxj $$1) {
      return 0;
   }

   @Override
   public bug a(djh $$0, crj $$1, buf $$2) {
      czk $$3 = $$1.b($$2);
      fet $$4 = a($$0, $$1, diq.b.a);
      if ($$4.d() == fev.a.b && $$0.a_($$4.b()).a(dmo.fX)) {
         return bug.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof arq $$5) {
            iv $$6 = $$5.a(axn.a, $$1.du(), 100, false);
            if ($$6 == null) {
               return bug.c;
            }

            crx $$7 = new crx($$0, $$1.dz(), $$1.e(0.5), $$1.dF());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(efo.K, $$7.ds(), efo.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof arr $$8) {
               aq.n.a($$8, $$6);
            }

            float $$9 = azm.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), awn.iG, awo.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awx.c.b(this));
         }

         return bug.b;
      }
   }
}

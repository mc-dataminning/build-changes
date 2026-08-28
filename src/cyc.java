public class cyc extends cyu {
   public cyc(cyu.a $$0) {
      super($$0);
   }

   @Override
   public bub a(dct $$0) {
      div $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzz $$3 = $$1.a_($$2);
      if (!$$3.a(dmc.fU) || $$3.c(doq.c)) {
         return bub.e;
      } else if ($$1.C) {
         return bub.a;
      } else {
         dzz $$4 = $$3.b(doq.c, Boolean.valueOf(true));
         dma.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.b($$2, dmc.fU);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         eae.b $$5 = doq.b().a($$1, $$2);
         if ($$5 != null) {
            iu $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  iu $$9 = $$6.b($$7, 0, $$8);
                  $$1.a($$9, true, null);
                  $$1.a($$9, dmc.fT.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bub.a;
      }
   }

   @Override
   public int a(cyy $$0, bxc $$1) {
      return 0;
   }

   @Override
   public bub a(div $$0, cqy $$1, bua $$2) {
      cyy $$3 = $$1.b($$2);
      fee $$4 = a($$0, $$1, die.b.a);
      if ($$4.d() == feg.a.b && $$0.a_($$4.b()).a(dmc.fU)) {
         return bub.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof arq $$5) {
            iu $$6 = $$5.a(axn.a, $$1.dv(), 100, false);
            if ($$6 == null) {
               return bub.c;
            }

            crl $$7 = new crl($$0, $$1.dA(), $$1.e(0.5), $$1.dG());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(eez.K, $$7.dt(), eez.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof arr $$8) {
               ap.n.a($$8, $$6);
            }

            float $$9 = azm.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awn.iE, awo.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awx.c.b(this));
         }

         return bub.b;
      }
   }
}

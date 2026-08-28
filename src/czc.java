public class czc extends czu {
   public czc(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(ddt $$0) {
      djx $$1 = $$0.q();
      iv $$2 = $$0.a();
      ebe $$3 = $$1.a_($$2);
      if (!$$3.a(dne.fX) || $$3.c(dpt.c)) {
         return bur.e;
      } else if ($$1.C) {
         return bur.a;
      } else {
         ebe $$4 = $$3.b(dpt.c, Boolean.valueOf(true));
         dnc.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.b($$2, dne.fX);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         ebj.b $$5 = dpt.b().a($$1, $$2);
         if ($$5 != null) {
            iv $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  iv $$9 = $$6.b($$7, 0, $$8);
                  $$1.a($$9, true, null);
                  $$1.a($$9, dne.fW.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bur.a;
      }
   }

   @Override
   public int a(czy $$0, bxu $$1) {
      return 0;
   }

   @Override
   public bur a(djx $$0, crx $$1, buq $$2) {
      czy $$3 = $$1.b($$2);
      ffm $$4 = a($$0, $$1, dje.b.a);
      if ($$4.d() == ffo.a.b && $$0.a_($$4.b()).a(dne.fX)) {
         return bur.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof ars $$5) {
            iv $$6 = $$5.a(axp.a, $$1.dv(), 100, false);
            if ($$6 == null) {
               return bur.c;
            }

            csl $$7 = new csl($$0, $$1.dA(), $$1.e(0.5), $$1.dG());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(ege.K, $$7.dt(), ege.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof art $$8) {
               aq.n.a($$8, $$6);
            }

            float $$9 = azo.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awp.iG, awq.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awz.c.b(this));
         }

         return bur.b;
      }
   }
}

public class cxb extends cxu {
   public cxb(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dbp $$0) {
      dhp $$1 = $$0.q();
      jj $$2 = $$0.a();
      dym $$3 = $$1.a_($$2);
      if (!$$3.a(dkw.fT) || $$3.c(dnk.c)) {
         return btq.e;
      } else if ($$1.C) {
         return btq.a;
      } else {
         dym $$4 = $$3.b(dnk.c, Boolean.valueOf(true));
         dku.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.b($$2, dkw.fT);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dyr.b $$5 = dnk.b().a($$1, $$2);
         if ($$5 != null) {
            jj $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  jj $$9 = $$6.b($$7, 0, $$8);
                  $$1.a($$9, true, null);
                  $$1.a($$9, dkw.fS.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return btq.a;
      }
   }

   @Override
   public int a(cxy $$0, bwr $$1) {
      return 0;
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      cxy $$3 = $$1.b($$2);
      fcq $$4 = a($$0, $$1, dgy.b.a);
      if ($$4.d() == fcs.a.b && $$0.a_($$4.b()).a(dkw.fT)) {
         return btq.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof arn $$5) {
            jj $$6 = $$5.a(axl.a, $$1.dv(), 100, false);
            if ($$6 == null) {
               return btq.c;
            }

            cqu $$7 = new cqu($$0, $$1.dA(), $$1.e(0.5), $$1.dG());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(edm.K, $$7.dt(), edm.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof aro $$8) {
               ap.n.a($$8, $$6);
            }

            float $$9 = azk.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awk.iD, awl.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awu.c.b(this));
         }

         return btq.b;
      }
   }
}

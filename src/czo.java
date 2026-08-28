public class czo extends dag {
   public czo(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(def $$0) {
      dkj $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebq $$3 = $$1.a_($$2);
      if (!$$3.a(dnq.fX) || $$3.c(dqf.c)) {
         return bvc.e;
      } else if ($$1.C) {
         return bvc.a;
      } else {
         ebq $$4 = $$3.b(dqf.c, Boolean.valueOf(true));
         dno.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.b($$2, dnq.fX);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         ebv.b $$5 = dqf.b().a($$1, $$2);
         if ($$5 != null) {
            iw $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  iw $$9 = $$6.b($$7, 0, $$8);
                  $$1.a($$9, true, null);
                  $$1.a($$9, dnq.fW.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bvc.a;
      }
   }

   @Override
   public int a(dak $$0, byf $$1) {
      return 0;
   }

   @Override
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      dak $$3 = $$1.b($$2);
      ffy $$4 = a($$0, $$1, djq.b.a);
      if ($$4.d() == fga.a.b && $$0.a_($$4.b()).a(dnq.fX)) {
         return bvc.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof asb $$5) {
            iw $$6 = $$5.a(axy.a, $$1.dv(), 100, false);
            if ($$6 == null) {
               return bvc.c;
            }

            csw $$7 = new csw($$0, $$1.dA(), $$1.e(0.5), $$1.dG());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(egq.K, $$7.dt(), egq.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof asc $$8) {
               aq.n.a($$8, $$6);
            }

            float $$9 = azz.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awy.iG, awz.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(axi.c.b(this));
         }

         return bvc.b;
      }
   }
}

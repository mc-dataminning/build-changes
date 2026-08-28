public class cze extends czw {
   public cze(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(ddv $$0) {
      djz $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebg $$3 = $$1.a_($$2);
      if (!$$3.a(dng.fX) || $$3.c(dpv.c)) {
         return but.e;
      } else if ($$1.C) {
         return but.a;
      } else {
         ebg $$4 = $$3.b(dpv.c, Boolean.valueOf(true));
         dne.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.b($$2, dng.fX);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         ebl.b $$5 = dpv.b().a($$1, $$2);
         if ($$5 != null) {
            iw $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  iw $$9 = $$6.b($$7, 0, $$8);
                  $$1.a($$9, true, null);
                  $$1.a($$9, dng.fW.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return but.a;
      }
   }

   @Override
   public int a(daa $$0, bxw $$1) {
      return 0;
   }

   @Override
   public but a(djz $$0, crz $$1, bus $$2) {
      daa $$3 = $$1.b($$2);
      ffo $$4 = a($$0, $$1, djg.b.a);
      if ($$4.d() == ffq.a.b && $$0.a_($$4.b()).a(dng.fX)) {
         return but.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof aru $$5) {
            iw $$6 = $$5.a(axr.a, $$1.dv(), 100, false);
            if ($$6 == null) {
               return but.c;
            }

            csn $$7 = new csn($$0, $$1.dA(), $$1.e(0.5), $$1.dG());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(egg.K, $$7.dt(), egg.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof arv $$8) {
               aq.n.a($$8, $$6);
            }

            float $$9 = azq.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awr.iG, aws.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(axb.c.b(this));
         }

         return but.b;
      }
   }
}

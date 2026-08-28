public class cwn extends cxg {
   public cwn(cxg.a $$0) {
      super($$0);
   }

   @Override
   public bte a(dbd $$0) {
      dha $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxn $$3 = $$1.a_($$2);
      if (!$$3.a(dkg.fM) || $$3.c(dmv.c)) {
         return bte.e;
      } else if ($$1.C) {
         return bte.a;
      } else {
         dxn $$4 = $$3.b(dmv.c, Boolean.valueOf(true));
         dke.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dkg.fM);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dxs.b $$5 = dmv.b().a($$1, $$2);
         if ($$5 != null) {
            jh $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dkg.fL.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bte.a;
      }
   }

   @Override
   public int a(cxk $$0, bwb $$1) {
      return 0;
   }

   @Override
   public bte a(dha $$0, cps $$1, btd $$2) {
      cxk $$3 = $$1.b($$2);
      fbo $$4 = a($$0, $$1, dgi.b.a);
      if ($$4.d() == fbq.a.b && $$0.a_($$4.b()).a(dkg.fM)) {
         return bte.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof ash $$5) {
            jh $$6 = $$5.a(ayg.a, $$1.dv(), 100, false);
            if ($$6 == null) {
               return bte.c;
            }

            cqe $$7 = new cqe($$0, $$1.dA(), $$1.e(0.5), $$1.dG());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(ecj.K, $$7.dt(), ecj.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof asi $$8) {
               ao.n.a($$8, $$6);
            }

            float $$9 = bae.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), axf.iB, axg.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(axp.c.b(this));
         }

         return bte.b;
      }
   }
}

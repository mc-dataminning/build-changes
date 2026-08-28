public class cws extends cxl {
   public cws(cxl.a $$0) {
      super($$0);
   }

   @Override
   public btj a(dbi $$0) {
      dhi $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxv $$3 = $$1.a_($$2);
      if (!$$3.a(dko.fM) || $$3.c(dnd.c)) {
         return btj.e;
      } else if ($$1.C) {
         return btj.a;
      } else {
         dxv $$4 = $$3.b(dnd.c, Boolean.valueOf(true));
         dkm.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dko.fM);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dya.b $$5 = dnd.b().a($$1, $$2);
         if ($$5 != null) {
            jh $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dko.fL.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return btj.a;
      }
   }

   @Override
   public int a(cxp $$0, bwg $$1) {
      return 0;
   }

   @Override
   public btj a(dhi $$0, cpx $$1, bti $$2) {
      cxp $$3 = $$1.b($$2);
      fbu $$4 = a($$0, $$1, dgq.b.a);
      if ($$4.d() == fbw.a.b && $$0.a_($$4.b()).a(dko.fM)) {
         return btj.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof ash $$5) {
            jh $$6 = $$5.a(ayg.a, $$1.dw(), 100, false);
            if ($$6 == null) {
               return btj.c;
            }

            cqj $$7 = new cqj($$0, $$1.dB(), $$1.e(0.5), $$1.dH());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(ecr.K, $$7.du(), ecr.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof asi $$8) {
               ao.n.a($$8, $$6);
            }

            float $$9 = bae.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), axf.iC, axg.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(axp.c.b(this));
         }

         return btj.b;
      }
   }
}

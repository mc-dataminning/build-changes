public class cwr extends cxk {
   public cwr(cxk.a $$0) {
      super($$0);
   }

   @Override
   public bti a(dbh $$0) {
      dhh $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxu $$3 = $$1.a_($$2);
      if (!$$3.a(dkn.fM) || $$3.c(dnc.c)) {
         return bti.e;
      } else if ($$1.C) {
         return bti.a;
      } else {
         dxu $$4 = $$3.b(dnc.c, Boolean.valueOf(true));
         dkl.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dkn.fM);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dxz.b $$5 = dnc.b().a($$1, $$2);
         if ($$5 != null) {
            jh $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dkn.fL.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bti.a;
      }
   }

   @Override
   public int a(cxo $$0, bwf $$1) {
      return 0;
   }

   @Override
   public bti a(dhh $$0, cpw $$1, bth $$2) {
      cxo $$3 = $$1.b($$2);
      fbt $$4 = a($$0, $$1, dgp.b.a);
      if ($$4.d() == fbv.a.b && $$0.a_($$4.b()).a(dkn.fM)) {
         return bti.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof ash $$5) {
            jh $$6 = $$5.a(ayg.a, $$1.dw(), 100, false);
            if ($$6 == null) {
               return bti.c;
            }

            cqi $$7 = new cqi($$0, $$1.dB(), $$1.e(0.5), $$1.dH());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(ecq.K, $$7.du(), ecq.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof asi $$8) {
               ao.n.a($$8, $$6);
            }

            float $$9 = bae.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), axf.iC, axg.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(axp.c.b(this));
         }

         return bti.b;
      }
   }
}

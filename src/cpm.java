public class cpm extends cqh {
   public cpm(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bnd a(csw $$0) {
      cxb $$1 = $$0.q();
      ib $$2 = $$0.a();
      dnb $$3 = $$1.a_($$2);
      if (!$$3.a(dae.fy) || $$3.c(dcr.c)) {
         return bnd.d;
      } else if ($$1.B) {
         return bnd.a;
      } else {
         dnb $$4 = $$3.a(dcr.c, Boolean.valueOf(true));
         dac.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dae.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dng.b $$5 = dcr.b().a($$1, $$2);
         if ($$5 != null) {
            ib $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dae.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bnd.b;
      }
   }

   @Override
   public int b(cqm $$0) {
      return 0;
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      cqm $$3 = $$1.b($$2);
      epp $$4 = a($$0, $$1, cwk.b.a);
      if ($$4.c() == epr.a.b && $$0.a_($$4.a()).a(dae.fy)) {
         return bne.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof apf $$5) {
            ib $$6 = $$5.a(auz.a, $$1.dm(), 100, false);
            if ($$6 != null) {
               cjf $$7 = new cjf($$0, $$1.dr(), $$1.e(0.5), $$1.dx());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(drp.K, $$7.dk(), drp.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof apg) {
                  am.n.a((apg)$$1, $$6);
               }

               $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aty.ib, atz.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dm(), 0);
               $$3.a(1, $$1);
               $$1.b(aui.c.b(this));
               $$1.a($$2, true);
               return bne.a($$3);
            }
         }

         return bne.b($$3);
      }
   }
}

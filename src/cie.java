public class cie extends cja {
   public cie(cja.a $$0) {
      super($$0);
   }

   @Override
   public bgy a(clp $$0) {
      cpv $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfj $$3 = $$1.a_($$2);
      if (!$$3.a(csw.fy) || $$3.c(cvg.b)) {
         return bgy.d;
      } else if ($$1.B) {
         return bgy.a;
      } else {
         dfj $$4 = $$3.a(cvg.b, Boolean.valueOf(true));
         csv.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, csw.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dfo.b $$5 = cvg.a().a($$1, $$2);
         if ($$5 != null) {
            gw $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), csw.fx.n(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bgy.b;
      }
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      ehj $$4 = a($$0, $$1, cpe.b.a);
      if ($$4.c() == ehl.a.b && $$0.a_($$4.a()).a(csw.fy)) {
         return bgz.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof akq $$5) {
            gw $$6 = $$5.a(aqd.a, $$1.dl(), 100, false);
            if ($$6 != null) {
               ccf $$7 = new ccf($$0, $$1.dq(), $$1.e(0.5), $$1.dw());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(djt.K, $$7.dj(), djt.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof akr) {
                  al.m.a((akr)$$1, $$6);
               }

               $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), apd.hb, ape.g, 0.5F, 0.4F / ($$0.D_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dl(), 0);
               if (!$$1.fS().d) {
                  $$3.h(1);
               }

               $$1.b(apn.c.b(this));
               $$1.a($$2, true);
               return bgz.a($$3);
            }
         }

         return bgz.b($$3);
      }
   }
}

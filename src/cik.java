public class cik extends cjg {
   public cik(cjg.a $$0) {
      super($$0);
   }

   @Override
   public bhe a(clv $$0) {
      cqb $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfd $$3 = $$1.a_($$2);
      if (!$$3.a(cte.fy) || $$3.c(cvp.c)) {
         return bhe.d;
      } else if ($$1.B) {
         return bhe.a;
      } else {
         dfd $$4 = $$3.a(cvp.c, Boolean.valueOf(true));
         ctc.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, cte.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dfi.b $$5 = cvp.b().a($$1, $$2);
         if ($$5 != null) {
            gw $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), cte.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bhe.b;
      }
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      cjl $$3 = $$1.b($$2);
      ehd $$4 = a($$0, $$1, cpk.b.a);
      if ($$4.c() == ehf.a.b && $$0.a_($$4.a()).a(cte.fy)) {
         return bhf.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof akt $$5) {
            gw $$6 = $$5.a(aqg.a, $$1.dl(), 100, false);
            if ($$6 != null) {
               ccl $$7 = new ccl($$0, $$1.dq(), $$1.e(0.5), $$1.dw());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(djn.K, $$7.dj(), djn.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof aku) {
                  al.m.a((aku)$$1, $$6);
               }

               $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), apg.hb, aph.g, 0.5F, 0.4F / ($$0.D_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dl(), 0);
               if (!$$1.fT().d) {
                  $$3.h(1);
               }

               $$1.b(apq.c.b(this));
               $$1.a($$2, true);
               return bhf.a($$3);
            }
         }

         return bhf.b($$3);
      }
   }
}

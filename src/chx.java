public class chx extends cit {
   public chx(cit.a $$0) {
      super($$0);
   }

   @Override
   public bgq a(cli $$0) {
      cpm $$1 = $$0.q();
      gu $$2 = $$0.a();
      dfa $$3 = $$1.a_($$2);
      if (!$$3.a(csn.fy) || $$3.c(cux.b)) {
         return bgq.d;
      } else if ($$1.B) {
         return bgq.a;
      } else {
         dfa $$4 = $$3.a(cux.b, Boolean.valueOf(true));
         csm.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, csn.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dff.b $$5 = cux.a().a($$1, $$2);
         if ($$5 != null) {
            gu $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), csn.fx.n(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bgq.b;
      }
   }

   @Override
   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      ciy $$3 = $$1.b($$2);
      eha $$4 = a($$0, $$1, cov.b.a);
      if ($$4.c() == ehc.a.b && $$0.a_($$4.a()).a(csn.fy)) {
         return bgr.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof akk $$5) {
            gu $$6 = $$5.a(apw.a, $$1.dk(), 100, false);
            if ($$6 != null) {
               cby $$7 = new cby($$0, $$1.dp(), $$1.e(0.5), $$1.dv());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(djk.K, $$7.di(), djk.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof akl) {
                  ai.m.a((akl)$$1, $$6);
               }

               $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aow.hb, aox.g, 0.5F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dk(), 0);
               if (!$$1.fR().d) {
                  $$3.h(1);
               }

               $$1.b(apg.c.b(this));
               $$1.a($$2, true);
               return bgr.a($$3);
            }
         }

         return bgr.b($$3);
      }
   }
}

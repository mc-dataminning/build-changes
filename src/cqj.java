public class cqj extends cre {
   public cqj(cre.a $$0) {
      super($$0);
   }

   @Override
   public boa a(cuq $$0) {
      cyx $$1 = $$0.q();
      ib $$2 = $$0.a();
      doz $$3 = $$1.a_($$2);
      if (!$$3.a(dca.fy) || $$3.c(den.c)) {
         return boa.d;
      } else if ($$1.B) {
         return boa.a;
      } else {
         doz $$4 = $$3.a(den.c, Boolean.valueOf(true));
         dby.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dca.fy);
         $$0.n().g(1);
         $$1.c(1503, $$2, 0);
         dpe.b $$5 = den.b().a($$1, $$2);
         if ($$5 != null) {
            ib $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dca.fx.n(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return boa.b;
      }
   }

   @Override
   public int b(crj $$0) {
      return 0;
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      crj $$3 = $$1.b($$2);
      erw $$4 = a($$0, $$1, cyg.b.a);
      if ($$4.c() == ery.a.b && $$0.a_($$4.a()).a(dca.fy)) {
         return bob.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof aps $$5) {
            ib $$6 = $$5.a(avn.a, $$1.dm(), 100, false);
            if ($$6 != null) {
               cke $$7 = new cke($$0, $$1.dr(), $$1.e(0.5), $$1.dx());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dts.K, $$7.dk(), dts.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof apt) {
                  am.n.a((apt)$$1, $$6);
               }

               $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aum.id, aun.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dm(), 0);
               $$3.a(1, $$1);
               $$1.b(auw.c.b(this));
               $$1.a($$2, true);
               return bob.a($$3);
            }
         }

         return bob.b($$3);
      }
   }
}

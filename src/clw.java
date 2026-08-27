public class clw extends cms {
   public clw(cms.a $$0) {
      super($$0);
   }

   @Override
   public bka a(cpi $$0) {
      cto $$1 = $$0.q();
      hx $$2 = $$0.a();
      djg $$3 = $$1.a_($$2);
      if (!$$3.a(cwr.fy) || $$3.c(cze.c)) {
         return bka.d;
      } else if ($$1.B) {
         return bka.a;
      } else {
         djg $$4 = $$3.a(cze.c, Boolean.valueOf(true));
         cwp.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, cwr.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         djl.b $$5 = cze.b().a($$1, $$2);
         if ($$5 != null) {
            hx $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), cwr.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bka.b;
      }
   }

   @Override
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      cmx $$3 = $$1.b($$2);
      elo $$4 = a($$0, $$1, csx.b.a);
      if ($$4.c() == elq.a.b && $$0.a_($$4.a()).a(cwr.fy)) {
         return bkb.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof and $$5) {
            hx $$6 = $$5.a(asr.a, $$1.dm(), 100, false);
            if ($$6 != null) {
               cfs $$7 = new cfs($$0, $$1.dr(), $$1.e(0.5), $$1.dx());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dnq.K, $$7.dk(), dnq.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof ane) {
                  am.n.a((ane)$$1, $$6);
               }

               $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arr.hE, ars.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dm(), 0);
               if (!$$1.fT().d) {
                  $$3.h(1);
               }

               $$1.b(asb.c.b(this));
               $$1.a($$2, true);
               return bkb.a($$3);
            }
         }

         return bkb.b($$3);
      }
   }
}

public class clg extends cmc {
   public clg(cmc.a $$0) {
      super($$0);
   }

   @Override
   public bjl a(cos $$0) {
      csy $$1 = $$0.q();
      hv $$2 = $$0.a();
      dip $$3 = $$1.a_($$2);
      if (!$$3.a(cwb.fy) || $$3.c(cyo.c)) {
         return bjl.d;
      } else if ($$1.B) {
         return bjl.a;
      } else {
         dip $$4 = $$3.a(cyo.c, Boolean.valueOf(true));
         cvz.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, cwb.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         diu.b $$5 = cyo.b().a($$1, $$2);
         if ($$5 != null) {
            hv $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), cwb.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bjl.b;
      }
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      ekx $$4 = a($$0, $$1, csh.b.a);
      if ($$4.c() == ekz.a.b && $$0.a_($$4.a()).a(cwb.fy)) {
         return bjm.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof amp $$5) {
            hv $$6 = $$5.a(asc.a, $$1.dm(), 100, false);
            if ($$6 != null) {
               cfc $$7 = new cfc($$0, $$1.dr(), $$1.e(0.5), $$1.dx());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dmz.K, $$7.dk(), dmz.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof amq) {
                  am.n.a((amq)$$1, $$6);
               }

               $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arc.hE, ard.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dm(), 0);
               if (!$$1.fT().d) {
                  $$3.h(1);
               }

               $$1.b(arm.c.b(this));
               $$1.a($$2, true);
               return bjm.a($$3);
            }
         }

         return bjm.b($$3);
      }
   }
}

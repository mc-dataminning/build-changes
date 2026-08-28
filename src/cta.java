public class cta extends ctv {
   public cta(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqd a(cxm $$0) {
      dcd $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsh $$3 = $$1.a_($$2);
      if (!$$3.a(dfh.fy) || $$3.c(dhu.c)) {
         return bqd.e;
      } else if ($$1.B) {
         return bqd.a;
      } else {
         dsh $$4 = $$3.a(dhu.c, Boolean.valueOf(true));
         dff.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dfh.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dsm.b $$5 = dhu.b().a($$1, $$2);
         if ($$5 != null) {
            ja $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dfh.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bqd.c;
      }
   }

   @Override
   public int a(cua $$0, bsy $$1) {
      return 0;
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      evv $$4 = a($$0, $$1, dbm.b.a);
      if ($$4.c() == evx.a.b && $$0.a_($$4.a()).a(dfh.fy)) {
         return bqe.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof aqk $$5) {
            ja $$6 = $$5.a(awg.a, $$1.dp(), 100, false);
            if ($$6 != null) {
               cms $$7 = new cms($$0, $$1.du(), $$1.e(0.5), $$1.dA());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dxa.K, $$7.dn(), dxa.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof aql $$8) {
                  am.n.a($$8, $$6);
               }

               float $$9 = aye.i($$0.z.i(), 0.33F, 0.5F);
               $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avf.ii, avg.g, 1.0F, $$9);
               $$3.a(1, $$1);
               $$1.b(avp.c.b(this));
               $$1.a($$2, true);
               return bqe.a($$3);
            }
         }

         return bqe.b($$3);
      }
   }
}

public class ctd extends cty {
   public ctd(cty.a $$0) {
      super($$0);
   }

   @Override
   public bqh a(cxp $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsl $$3 = $$1.a_($$2);
      if (!$$3.a(dfk.fy) || $$3.c(dhx.c)) {
         return bqh.e;
      } else if ($$1.B) {
         return bqh.a;
      } else {
         dsl $$4 = $$3.a(dhx.c, Boolean.valueOf(true));
         dfi.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dfk.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dsq.b $$5 = dhx.b().a($$1, $$2);
         if ($$5 != null) {
            ja $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dfk.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bqh.c;
      }
   }

   @Override
   public int a(cud $$0, btc $$1) {
      return 0;
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      cud $$3 = $$1.b($$2);
      ewd $$4 = a($$0, $$1, dbp.b.a);
      if ($$4.c() == ewf.a.b && $$0.a_($$4.a()).a(dfk.fy)) {
         return bqi.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof aqm $$5) {
            ja $$6 = $$5.a(awi.a, $$1.dr(), 100, false);
            if ($$6 != null) {
               cmw $$7 = new cmw($$0, $$1.dw(), $$1.e(0.5), $$1.dC());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dxh.K, $$7.dp(), dxh.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof aqn $$8) {
                  am.n.a($$8, $$6);
               }

               float $$9 = ayg.i($$0.z.i(), 0.33F, 0.5F);
               $$0.a(null, $$1.dw(), $$1.dy(), $$1.dC(), avh.ii, avi.g, 1.0F, $$9);
               $$3.a(1, $$1);
               $$1.b(avr.c.b(this));
               $$1.a($$2, true);
               return bqi.a($$3);
            }
         }

         return bqi.b($$3);
      }
   }
}

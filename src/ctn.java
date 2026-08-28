public class ctn extends cui {
   public ctn(cui.a $$0) {
      super($$0);
   }

   @Override
   public bqs a(cya $$0) {
      dbw $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsa $$3 = $$1.a_($$2);
      if (!$$3.a(dez.fy) || $$3.c(dhm.c)) {
         return bqs.e;
      } else if ($$1.B) {
         return bqs.a;
      } else {
         dsa $$4 = $$3.a(dhm.c, Boolean.valueOf(true));
         dex.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dez.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dsf.b $$5 = dhm.b().a($$1, $$2);
         if ($$5 != null) {
            iz $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dez.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bqs.c;
      }
   }

   @Override
   public int b(cun $$0) {
      return 0;
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      evl $$4 = a($$0, $$1, dbf.b.a);
      if ($$4.c() == evn.a.b && $$0.a_($$4.a()).a(dez.fy)) {
         return bqt.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof are $$5) {
            iz $$6 = $$5.a(axa.a, $$1.dp(), 100, false);
            if ($$6 != null) {
               cng $$7 = new cng($$0, $$1.du(), $$1.e(0.5), $$1.dA());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dwt.K, $$7.dn(), dwt.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof arf) {
                  am.n.a((arf)$$1, $$6);
               }

               $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avz.ii, awa.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dp(), 0);
               $$3.a(1, $$1);
               $$1.b(awj.c.b(this));
               $$1.a($$2, true);
               return bqt.a($$3);
            }
         }

         return bqt.b($$3);
      }
   }
}

public class ctp extends cuk {
   public ctp(cuk.a $$0) {
      super($$0);
   }

   @Override
   public bqu a(cyc $$0) {
      dby $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsc $$3 = $$1.a_($$2);
      if (!$$3.a(dfb.fy) || $$3.c(dho.c)) {
         return bqu.e;
      } else if ($$1.B) {
         return bqu.a;
      } else {
         dsc $$4 = $$3.a(dho.c, Boolean.valueOf(true));
         dez.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dfb.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dsh.b $$5 = dho.b().a($$1, $$2);
         if ($$5 != null) {
            iz $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dfb.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bqu.c;
      }
   }

   @Override
   public int b(cup $$0) {
      return 0;
   }

   @Override
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      cup $$3 = $$1.b($$2);
      evn $$4 = a($$0, $$1, dbh.b.a);
      if ($$4.c() == evp.a.b && $$0.a_($$4.a()).a(dfb.fy)) {
         return bqv.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof arf $$5) {
            iz $$6 = $$5.a(axb.a, $$1.dp(), 100, false);
            if ($$6 != null) {
               cni $$7 = new cni($$0, $$1.du(), $$1.e(0.5), $$1.dA());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dwv.K, $$7.dn(), dwv.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof arg) {
                  am.n.a((arg)$$1, $$6);
               }

               $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), awa.ii, awb.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dp(), 0);
               $$3.a(1, $$1);
               $$1.b(awk.c.b(this));
               $$1.a($$2, true);
               return bqv.a($$3);
            }
         }

         return bqv.b($$3);
      }
   }
}

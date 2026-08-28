public class cto extends cuj {
   public cto(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqt a(cyb $$0) {
      dbx $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsb $$3 = $$1.a_($$2);
      if (!$$3.a(dfa.fy) || $$3.c(dhn.c)) {
         return bqt.e;
      } else if ($$1.B) {
         return bqt.a;
      } else {
         dsb $$4 = $$3.a(dhn.c, Boolean.valueOf(true));
         dey.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dfa.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dsg.b $$5 = dhn.b().a($$1, $$2);
         if ($$5 != null) {
            iz $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dfa.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bqt.c;
      }
   }

   @Override
   public int b(cuo $$0) {
      return 0;
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      cuo $$3 = $$1.b($$2);
      evm $$4 = a($$0, $$1, dbg.b.a);
      if ($$4.c() == evo.a.b && $$0.a_($$4.a()).a(dfa.fy)) {
         return bqu.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof are $$5) {
            iz $$6 = $$5.a(axa.a, $$1.dp(), 100, false);
            if ($$6 != null) {
               cnh $$7 = new cnh($$0, $$1.du(), $$1.e(0.5), $$1.dA());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dwu.K, $$7.dn(), dwu.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof arf) {
                  am.n.a((arf)$$1, $$6);
               }

               $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avz.ii, awa.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dp(), 0);
               $$3.a(1, $$1);
               $$1.b(awj.c.b(this));
               $$1.a($$2, true);
               return bqu.a($$3);
            }
         }

         return bqu.b($$3);
      }
   }
}

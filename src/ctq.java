public class ctq extends cul {
   public ctq(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqv a(cyd $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsd $$3 = $$1.a_($$2);
      if (!$$3.a(dfc.fy) || $$3.c(dhp.c)) {
         return bqv.e;
      } else if ($$1.B) {
         return bqv.a;
      } else {
         dsd $$4 = $$3.a(dhp.c, Boolean.valueOf(true));
         dfa.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dfc.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dsi.b $$5 = dhp.b().a($$1, $$2);
         if ($$5 != null) {
            iz $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dfc.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bqv.c;
      }
   }

   @Override
   public int b(cuq $$0) {
      return 0;
   }

   @Override
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      cuq $$3 = $$1.b($$2);
      evo $$4 = a($$0, $$1, dbi.b.a);
      if ($$4.c() == evq.a.b && $$0.a_($$4.a()).a(dfc.fy)) {
         return bqw.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof arf $$5) {
            iz $$6 = $$5.a(axb.a, $$1.dp(), 100, false);
            if ($$6 != null) {
               cnj $$7 = new cnj($$0, $$1.du(), $$1.e(0.5), $$1.dA());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dww.K, $$7.dn(), dww.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof arg) {
                  am.n.a((arg)$$1, $$6);
               }

               $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), awa.ii, awb.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dp(), 0);
               $$3.a(1, $$1);
               $$1.b(awk.c.b(this));
               $$1.a($$2, true);
               return bqw.a($$3);
            }
         }

         return bqw.b($$3);
      }
   }
}

public class ctr extends cum {
   public ctr(cum.a $$0) {
      super($$0);
   }

   @Override
   public bqw a(cye $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      dse $$3 = $$1.a_($$2);
      if (!$$3.a(dfd.fy) || $$3.c(dhq.c)) {
         return bqw.e;
      } else if ($$1.B) {
         return bqw.a;
      } else {
         dse $$4 = $$3.a(dhq.c, Boolean.valueOf(true));
         dfb.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dfd.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dsj.b $$5 = dhq.b().a($$1, $$2);
         if ($$5 != null) {
            iz $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dfd.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bqw.c;
      }
   }

   @Override
   public int b(cur $$0) {
      return 0;
   }

   @Override
   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      cur $$3 = $$1.b($$2);
      evp $$4 = a($$0, $$1, dbj.b.a);
      if ($$4.c() == evr.a.b && $$0.a_($$4.a()).a(dfd.fy)) {
         return bqx.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof arf $$5) {
            iz $$6 = $$5.a(axb.a, $$1.dp(), 100, false);
            if ($$6 != null) {
               cnk $$7 = new cnk($$0, $$1.du(), $$1.e(0.5), $$1.dA());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dwx.K, $$7.dn(), dwx.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof arg) {
                  am.n.a((arg)$$1, $$6);
               }

               $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), awa.ii, awb.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dp(), 0);
               $$3.a(1, $$1);
               $$1.b(awk.c.b(this));
               $$1.a($$2, true);
               return bqx.a($$3);
            }
         }

         return bqx.b($$3);
      }
   }
}

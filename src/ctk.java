public class ctk extends cuf {
   public ctk(cuf.a $$0) {
      super($$0);
   }

   @Override
   public bqp a(cxx $$0) {
      dbt $$1 = $$0.q();
      iz $$2 = $$0.a();
      drx $$3 = $$1.a_($$2);
      if (!$$3.a(dew.fy) || $$3.c(dhj.c)) {
         return bqp.e;
      } else if ($$1.B) {
         return bqp.a;
      } else {
         drx $$4 = $$3.a(dhj.c, Boolean.valueOf(true));
         deu.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dew.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dsc.b $$5 = dhj.b().a($$1, $$2);
         if ($$5 != null) {
            iz $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dew.fx.n(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bqp.c;
      }
   }

   @Override
   public int b(cuk $$0) {
      return 0;
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      cuk $$3 = $$1.b($$2);
      evi $$4 = a($$0, $$1, dbc.b.a);
      if ($$4.c() == evk.a.b && $$0.a_($$4.a()).a(dew.fy)) {
         return bqq.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof arb $$5) {
            iz $$6 = $$5.a(awx.a, $$1.dp(), 100, false);
            if ($$6 != null) {
               cnd $$7 = new cnd($$0, $$1.du(), $$1.e(0.5), $$1.dA());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dwq.K, $$7.dn(), dwq.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof arc) {
                  am.n.a((arc)$$1, $$6);
               }

               $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avw.ii, avx.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dp(), 0);
               $$3.a(1, $$1);
               $$1.b(awg.c.b(this));
               $$1.a($$2, true);
               return bqq.a($$3);
            }
         }

         return bqq.b($$3);
      }
   }
}

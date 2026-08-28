import java.util.List;

public class csm extends cuf {
   public csm(cuf.a $$0) {
      super($$0);
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      List<bsl> $$3 = $$0.a(bsl.class, $$1.cK().g(2.0), $$0x -> $$0x != null && $$0x.bD() && $$0x.q() instanceof chw);
      cuk $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bsl $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avw.cD, avx.g, 1.0F, 1.0F);
         $$0.a($$1, dwq.y, $$1.dn());
         if ($$1 instanceof arc $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bqq.a(this.a($$4, $$1, new cuk(cun.vn)), $$0.x_());
      } else {
         evi $$7 = a($$0, $$1, dbc.b.b);
         if ($$7.c() == evk.a.a) {
            return bqq.c($$4);
         } else {
            if ($$7.c() == evk.a.b) {
               iz $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bqq.c($$4);
               }

               if ($$0.b_($$8).a(awr.a)) {
                  $$0.a($$1, $$1.du(), $$1.dw(), $$1.dA(), avw.cC, avx.g, 1.0F, 1.0F);
                  $$0.a($$1, dwq.y, $$8);
                  return bqq.a(this.a($$4, $$1, cwl.a(cun.sk, cwm.a)), $$0.x_());
               }
            }

            return bqq.c($$4);
         }
      }
   }

   protected cuk a(cuk $$0, cms $$1, cuk $$2) {
      $$1.b(awg.c.b(this));
      return cum.a($$0, $$1, $$2);
   }
}

import java.util.List;

public class csr extends cuk {
   public csr(cuk.a $$0) {
      super($$0);
   }

   @Override
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      List<bsq> $$3 = $$0.a(bsq.class, $$1.cK().g(2.0), $$0x -> $$0x != null && $$0x.bD() && $$0x.q() instanceof cib);
      cup $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bsq $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), awa.cD, awb.g, 1.0F, 1.0F);
         $$0.a($$1, dwv.y, $$1.dn());
         if ($$1 instanceof arg $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bqv.a(this.a($$4, $$1, new cup(cus.vn)), $$0.x_());
      } else {
         evn $$7 = a($$0, $$1, dbh.b.b);
         if ($$7.c() == evp.a.a) {
            return bqv.c($$4);
         } else {
            if ($$7.c() == evp.a.b) {
               iz $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bqv.c($$4);
               }

               if ($$0.b_($$8).a(awv.a)) {
                  $$0.a($$1, $$1.du(), $$1.dw(), $$1.dA(), awa.cC, awb.g, 1.0F, 1.0F);
                  $$0.a($$1, dwv.y, $$8);
                  return bqv.a(this.a($$4, $$1, cwq.a(cus.sk, cwr.a)), $$0.x_());
               }
            }

            return bqv.c($$4);
         }
      }
   }

   protected cup a(cup $$0, cmx $$1, cup $$2) {
      $$1.b(awk.c.b(this));
      return cur.a($$0, $$1, $$2);
   }
}

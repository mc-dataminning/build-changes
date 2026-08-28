import java.util.List;

public class cst extends cum {
   public cst(cum.a $$0) {
      super($$0);
   }

   @Override
   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      List<bss> $$3 = $$0.a(bss.class, $$1.cK().g(2.0), $$0x -> $$0x != null && $$0x.bD() && $$0x.q() instanceof cid);
      cur $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bss $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), awa.cD, awb.g, 1.0F, 1.0F);
         $$0.a($$1, dwx.y, $$1.dn());
         if ($$1 instanceof arg $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bqx.a(this.a($$4, $$1, new cur(cuu.vn)), $$0.x_());
      } else {
         evp $$7 = a($$0, $$1, dbj.b.b);
         if ($$7.c() == evr.a.a) {
            return bqx.c($$4);
         } else {
            if ($$7.c() == evr.a.b) {
               iz $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bqx.c($$4);
               }

               if ($$0.b_($$8).a(awv.a)) {
                  $$0.a($$1, $$1.du(), $$1.dw(), $$1.dA(), awa.cC, awb.g, 1.0F, 1.0F);
                  $$0.a($$1, dwx.y, $$8);
                  return bqx.a(this.a($$4, $$1, cws.a(cuu.sk, cwt.a)), $$0.x_());
               }
            }

            return bqx.c($$4);
         }
      }
   }

   protected cur a(cur $$0, cmz $$1, cur $$2) {
      $$1.b(awk.c.b(this));
      return cut.a($$0, $$1, $$2);
   }
}

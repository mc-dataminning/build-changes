import java.util.List;

public class css extends cul {
   public css(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      List<bsr> $$3 = $$0.a(bsr.class, $$1.cK().g(2.0), $$0x -> $$0x != null && $$0x.bD() && $$0x.q() instanceof cic);
      cuq $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bsr $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), awa.cD, awb.g, 1.0F, 1.0F);
         $$0.a($$1, dww.y, $$1.dn());
         if ($$1 instanceof arg $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bqw.a(this.a($$4, $$1, new cuq(cut.vn)), $$0.x_());
      } else {
         evo $$7 = a($$0, $$1, dbi.b.b);
         if ($$7.c() == evq.a.a) {
            return bqw.c($$4);
         } else {
            if ($$7.c() == evq.a.b) {
               iz $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bqw.c($$4);
               }

               if ($$0.b_($$8).a(awv.a)) {
                  $$0.a($$1, $$1.du(), $$1.dw(), $$1.dA(), awa.cC, awb.g, 1.0F, 1.0F);
                  $$0.a($$1, dww.y, $$8);
                  return bqw.a(this.a($$4, $$1, cwr.a(cut.sk, cws.a)), $$0.x_());
               }
            }

            return bqw.c($$4);
         }
      }
   }

   protected cuq a(cuq $$0, cmy $$1, cuq $$2) {
      $$1.b(awk.c.b(this));
      return cus.a($$0, $$1, $$2);
   }
}

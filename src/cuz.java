import java.util.List;

public class cuz extends cwm {
   public cuz(cwm.a $$0) {
      super($$0);
   }

   @Override
   public bsl a(dgj $$0, coy $$1, bsk $$2) {
      List<buf> $$3 = $$0.a(buf.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bL() && $$0x.n() instanceof cjw);
      cwq $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         buf $$5 = $$3.get(0);
         $$5.a($$5.c() - 0.5F);
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awa.cD, awb.g, 1.0F, 1.0F);
         $$0.a($$1, ebu.y, $$1.dt());
         if ($$1 instanceof are $$6) {
            ap.T.a($$6, $$4, $$5);
         }

         return bsl.a.a(this.a($$4, $$1, new cwq(cwu.wn)));
      } else {
         fax $$7 = a($$0, $$1, dfr.b.b);
         if ($$7.d() == faz.a.a) {
            return bsl.e;
         } else {
            if ($$7.d() == faz.a.b) {
               ji $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bsl.e;
               }

               if ($$0.b_($$8).a(awv.a)) {
                  $$0.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awa.cC, awb.g, 1.0F, 1.0F);
                  $$0.a($$1, ebu.y, $$8);
                  return bsl.a.a(this.a($$4, $$1, cyp.a(cwu.ti, cyq.a)));
               }
            }

            return bsl.e;
         }
      }
   }

   protected cwq a(cwq $$0, coy $$1, cwq $$2) {
      $$1.b(awk.c.b(this));
      return cwt.a($$0, $$1, $$2);
   }
}

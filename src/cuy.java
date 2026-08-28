import java.util.List;

public class cuy extends cwl {
   public cuy(cwl.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(dgi $$0, cox $$1, bsj $$2) {
      List<bue> $$3 = $$0.a(bue.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bL() && $$0x.n() instanceof cjv);
      cwp $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bue $$5 = $$3.get(0);
         $$5.a($$5.c() - 0.5F);
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awa.cD, awb.g, 1.0F, 1.0F);
         $$0.a($$1, ebt.y, $$1.dt());
         if ($$1 instanceof are $$6) {
            ap.T.a($$6, $$4, $$5);
         }

         return bsk.a.a(this.a($$4, $$1, new cwp(cwt.wn)));
      } else {
         faw $$7 = a($$0, $$1, dfq.b.b);
         if ($$7.d() == fay.a.a) {
            return bsk.e;
         } else {
            if ($$7.d() == fay.a.b) {
               ji $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bsk.e;
               }

               if ($$0.b_($$8).a(awv.a)) {
                  $$0.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awa.cC, awb.g, 1.0F, 1.0F);
                  $$0.a($$1, ebt.y, $$8);
                  return bsk.a.a(this.a($$4, $$1, cyo.a(cwt.ti, cyp.a)));
               }
            }

            return bsk.e;
         }
      }
   }

   protected cwp a(cwp $$0, cox $$1, cwp $$2) {
      $$1.b(awk.c.b(this));
      return cws.a($$0, $$1, $$2);
   }
}

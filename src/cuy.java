import java.util.List;

public class cuy extends cwl {
   public cuy(cwl.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dgi $$0, cox $$1, bsi $$2) {
      List<bud> $$3 = $$0.a(bud.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bL() && $$0x.n() instanceof cju);
      cwp $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bud $$5 = $$3.get(0);
         $$5.a($$5.c() - 0.5F);
         $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), awa.cD, awb.g, 1.0F, 1.0F);
         $$0.a($$1, ebt.y, $$1.du());
         if ($$1 instanceof ard $$6) {
            ap.T.a($$6, $$4, $$5);
         }

         return bsj.a.a(this.a($$4, $$1, new cwp(cwt.wn)));
      } else {
         faw $$7 = a($$0, $$1, dfq.b.b);
         if ($$7.d() == fay.a.a) {
            return bsj.e;
         } else {
            if ($$7.d() == fay.a.b) {
               ji $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bsj.e;
               }

               if ($$0.b_($$8).a(awv.a)) {
                  $$0.a($$1, $$1.dB(), $$1.dD(), $$1.dH(), awa.cC, awb.g, 1.0F, 1.0F);
                  $$0.a($$1, ebt.y, $$8);
                  return bsj.a.a(this.a($$4, $$1, cyo.a(cwt.ti, cyp.a)));
               }
            }

            return bsj.e;
         }
      }
   }

   protected cwp a(cwp $$0, cox $$1, cwp $$2) {
      $$1.b(awk.c.b(this));
      return cws.a($$0, $$1, $$2);
   }
}

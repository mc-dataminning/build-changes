import java.util.List;

public class cuw extends cwj {
   public cuw(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      List<buc> $$3 = $$0.a(buc.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bL() && $$0x.n() instanceof cjt);
      cwn $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         buc $$5 = $$3.get(0);
         $$5.a($$5.c() - 0.5F);
         $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), avz.cD, awa.g, 1.0F, 1.0F);
         $$0.a($$1, ebr.y, $$1.du());
         if ($$1 instanceof ard $$6) {
            ap.T.a($$6, $$4, $$5);
         }

         return bsi.a.a(this.a($$4, $$1, new cwn(cwr.wn)));
      } else {
         fau $$7 = a($$0, $$1, dfo.b.b);
         if ($$7.d() == faw.a.a) {
            return bsi.e;
         } else {
            if ($$7.d() == faw.a.b) {
               ji $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bsi.e;
               }

               if ($$0.b_($$8).a(awu.a)) {
                  $$0.a($$1, $$1.dB(), $$1.dD(), $$1.dH(), avz.cC, awa.g, 1.0F, 1.0F);
                  $$0.a($$1, ebr.y, $$8);
                  return bsi.a.a(this.a($$4, $$1, cym.a(cwr.ti, cyn.a)));
               }
            }

            return bsi.e;
         }
      }
   }

   protected cwn a(cwn $$0, cov $$1, cwn $$2) {
      $$1.b(awj.c.b(this));
      return cwq.a($$0, $$1, $$2);
   }
}

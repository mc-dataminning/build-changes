import java.util.List;

public class cvp extends cxc {
   public cvp(cxc.a $$0) {
      super($$0);
   }

   @Override
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      List<buu> $$3 = $$0.a(buu.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bL() && $$0x.n() instanceof ckl);
      cxg $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         buu $$5 = $$3.get(0);
         $$5.a($$5.c() - 0.5F);
         $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), awv.cD, aww.g, 1.0F, 1.0F);
         $$0.a($$1, eck.y, $$1.du());
         if ($$1 instanceof ary $$6) {
            ao.T.a($$6, $$4, $$5);
         }

         return bta.a.a(this.a($$4, $$1, new cxg(cxk.wn)));
      } else {
         fbn $$7 = a($$0, $$1, dgh.b.b);
         if ($$7.d() == fbp.a.a) {
            return bta.e;
         } else {
            if ($$7.d() == fbp.a.b) {
               jh $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bta.e;
               }

               if ($$0.b_($$8).a(axq.a)) {
                  $$0.a($$1, $$1.dB(), $$1.dD(), $$1.dH(), awv.cC, aww.g, 1.0F, 1.0F);
                  $$0.a($$1, eck.y, $$8);
                  return bta.a.a(this.a($$4, $$1, czf.a(cxk.ti, czg.a)));
               }
            }

            return bta.e;
         }
      }
   }

   protected cxg a(cxg $$0, cpo $$1, cxg $$2) {
      $$1.b(axf.c.b(this));
      return cxj.a($$0, $$1, $$2);
   }
}

import java.util.List;

public class cuk extends cvx {
   public cuk(cvx.a $$0) {
      super($$0);
   }

   @Override
   public bsd a(dfb $$0, com $$1, bsc $$2) {
      List<btx> $$3 = $$0.a(btx.class, $$1.cS().g(2.0), $$0x -> $$0x != null && $$0x.bM() && $$0x.q() instanceof cjo);
      cwb $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         btx $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), awl.cD, awm.g, 1.0F, 1.0F);
         $$0.a($$1, eag.y, $$1.dv());
         if ($$1 instanceof aro $$6) {
            ao.T.a($$6, $$4, $$5);
         }

         return bsd.a.a(this.a($$4, $$1, new cwb(cwf.vp)));
      } else {
         ezj $$7 = a($$0, $$1, dej.b.b);
         if ($$7.d() == ezl.a.a) {
            return bsd.e;
         } else {
            if ($$7.d() == ezl.a.b) {
               jh $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bsd.e;
               }

               if ($$0.b_($$8).a(axg.a)) {
                  $$0.a($$1, $$1.dC(), $$1.dE(), $$1.dI(), awl.cC, awm.g, 1.0F, 1.0F);
                  $$0.a($$1, eag.y, $$8);
                  return bsd.a.a(this.a($$4, $$1, cya.a(cwf.sm, cyb.a)));
               }
            }

            return bsd.e;
         }
      }
   }

   protected cwb a(cwb $$0, com $$1, cwb $$2) {
      $$1.b(awv.c.b(this));
      return cwe.a($$0, $$1, $$2);
   }
}

import java.util.List;

public class cuo extends cwb {
   public cuo(cwb.a $$0) {
      super($$0);
   }

   @Override
   public bsh a(dff $$0, cor $$1, bsg $$2) {
      List<bub> $$3 = $$0.a(bub.class, $$1.cT().g(2.0), $$0x -> $$0x != null && $$0x.bN() && $$0x.q() instanceof cjs);
      cwf $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bub $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.dD(), $$1.dF(), $$1.dJ(), awo.cD, awp.g, 1.0F, 1.0F);
         $$0.a($$1, eak.y, $$1.dw());
         if ($$1 instanceof arr $$6) {
            ao.T.a($$6, $$4, $$5);
         }

         return bsh.a.a(this.a($$4, $$1, new cwf(cwj.vF)));
      } else {
         ezn $$7 = a($$0, $$1, den.b.b);
         if ($$7.d() == ezp.a.a) {
            return bsh.e;
         } else {
            if ($$7.d() == ezp.a.b) {
               jh $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bsh.e;
               }

               if ($$0.b_($$8).a(axj.a)) {
                  $$0.a($$1, $$1.dD(), $$1.dF(), $$1.dJ(), awo.cC, awp.g, 1.0F, 1.0F);
                  $$0.a($$1, eak.y, $$8);
                  return bsh.a.a(this.a($$4, $$1, cye.a(cwj.sC, cyf.a)));
               }
            }

            return bsh.e;
         }
      }
   }

   protected cwf a(cwf $$0, cor $$1, cwf $$2) {
      $$1.b(awy.c.b(this));
      return cwi.a($$0, $$1, $$2);
   }
}

import java.util.List;

public class ctu extends cvk {
   public ctu(cvk.a $$0) {
      super($$0);
   }

   @Override
   public brp a(deg $$0, cnu $$1, bro $$2) {
      List<btj> $$3 = $$0.a(btj.class, $$1.cO().g(2.0), $$0x -> $$0x != null && $$0x.bI() && $$0x.q() instanceof cix);
      cvp $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         btj $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), awe.cD, awf.g, 1.0F, 1.0F);
         $$0.a($$1, dzl.y, $$1.dq());
         if ($$1 instanceof ari $$6) {
            an.T.a($$6, $$4, $$5);
         }

         return brp.a.a(this.a($$4, $$1, new cvp(cvt.vp)));
      } else {
         eyo $$7 = a($$0, $$1, ddo.b.b);
         if ($$7.d() == eyq.a.a) {
            return brp.e;
         } else {
            if ($$7.d() == eyq.a.b) {
               je $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return brp.e;
               }

               if ($$0.b_($$8).a(awz.a)) {
                  $$0.a($$1, $$1.dx(), $$1.dz(), $$1.dD(), awe.cC, awf.g, 1.0F, 1.0F);
                  $$0.a($$1, dzl.y, $$8);
                  return brp.a.a(this.a($$4, $$1, cxo.a(cvt.sm, cxp.a)));
               }
            }

            return brp.e;
         }
      }
   }

   protected cvp a(cvp $$0, cnu $$1, cvp $$2) {
      $$1.b(awo.c.b(this));
      return cvs.a($$0, $$1, $$2);
   }
}

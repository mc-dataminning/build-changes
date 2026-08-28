import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cyj extends cvz {
   protected static final Map<dkd, dxo> a = Maps.newHashMap(
      new Builder()
         .put(dkf.i, dkf.lg.m())
         .put(dkf.j, dkf.lg.m())
         .put(dkf.l, dkf.lg.m())
         .put(dkf.k, dkf.lg.m())
         .put(dkf.fA, dkf.lg.m())
         .put(dkf.tj, dkf.lg.m())
         .build()
   );

   public cyj(cyx $$0, float $$1, float $$2, cxc.a $$3) {
      super($$0, axk.bF, $$1, $$2, $$3);
   }

   @Override
   public bta a(daz $$0) {
      dgz $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxo $$3 = $$1.a_($$2);
      if ($$0.k() == jm.a) {
         return bta.e;
      } else {
         cpo $$4 = $$0.o();
         dxo $$5 = a.get($$3.b());
         dxo $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awv.xk, aww.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dks && $$3.c(dks.c)) {
            if (!$$1.B_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dks.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dks.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(eck.c, $$2, eck.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bvx.d($$0.p()));
               }
            }

            return bta.a;
         } else {
            return bta.e;
         }
      }
   }
}

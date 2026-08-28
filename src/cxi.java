import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cxi extends cuy {
   protected static final Map<dij, dvo> a = Maps.newHashMap(
      new Builder()
         .put(dil.i, dil.kE.m())
         .put(dil.j, dil.kE.m())
         .put(dil.l, dil.kE.m())
         .put(dil.k, dil.kE.m())
         .put(dil.fl, dil.kE.m())
         .put(dil.sH, dil.kE.m())
         .build()
   );

   public cxi(cxw $$0, float $$1, float $$2, cwb.a $$3) {
      super($$0, axd.bE, $$1, $$2, $$3);
   }

   @Override
   public bsh a(czy $$0) {
      dff $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvo $$3 = $$1.a_($$2);
      if ($$0.k() == jm.a) {
         return bsh.e;
      } else {
         cor $$4 = $$0.o();
         dvo $$5 = a.get($$3.b());
         dvo $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awo.wJ, awp.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dix && $$3.c(dix.c)) {
            if (!$$1.y_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dix.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dix.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(eak.c, $$2, eak.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bve.d($$0.p()));
               }
            }

            return bsh.a;
         } else {
            return bsh.e;
         }
      }
   }
}

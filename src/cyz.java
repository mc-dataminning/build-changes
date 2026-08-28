import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cyz extends cxu {
   protected static final Map<dku, dym> a = Maps.newHashMap(
      new Builder()
         .put(dkw.i, dkw.lg.m())
         .put(dkw.j, dkw.lg.m())
         .put(dkw.l, dkw.lg.m())
         .put(dkw.k, dkw.lg.m())
         .put(dkw.fA, dkw.lg.m())
         .put(dkw.tn, dkw.lg.m())
         .build()
   );

   public cyz(czm $$0, float $$1, float $$2, cxu.a $$3) {
      super($$3.a($$0, awz.bF, $$1, $$2, false));
   }

   @Override
   public btq a(dbp $$0) {
      dhp $$1 = $$0.q();
      jj $$2 = $$0.a();
      dym $$3 = $$1.a_($$2);
      if ($$0.k() == jo.a) {
         return btq.e;
      } else {
         cqi $$4 = $$0.o();
         dym $$5 = a.get($$3.b());
         dym $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awk.xu, awl.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dlj && $$3.c(dlj.b)) {
            if (!$$1.w_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dlj.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dlj.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(edm.c, $$2, edm.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bwr.d($$0.p()));
               }
            }

            return btq.a;
         } else {
            return btq.e;
         }
      }
   }
}

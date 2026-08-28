import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cws extends cuf {
   protected static final Map<dhj, duo> a = Maps.newHashMap(
      new Builder()
         .put(dhl.i, dhl.kE.o())
         .put(dhl.j, dhl.kE.o())
         .put(dhl.l, dhl.kE.o())
         .put(dhl.k, dhl.kE.o())
         .put(dhl.fl, dhl.kE.o())
         .put(dhl.sH, dhl.kE.o())
         .build()
   );

   public cws(cxg $$0, float $$1, float $$2, cvk.a $$3) {
      super($$0, awt.bE, $$1, $$2, $$3);
   }

   @Override
   public brp a(czm $$0) {
      deg $$1 = $$0.q();
      je $$2 = $$0.a();
      duo $$3 = $$1.a_($$2);
      if ($$0.k() == jj.a) {
         return brp.e;
      } else {
         cnu $$4 = $$0.o();
         duo $$5 = a.get($$3.b());
         duo $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awe.wL, awf.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dhx && $$3.c(dhx.c)) {
            if (!$$1.w_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dhx.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dhx.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dzl.c, $$2, dzl.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, buk.d($$0.p()));
               }
            }

            return brp.a;
         } else {
            return brp.e;
         }
      }
   }
}

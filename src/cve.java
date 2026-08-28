import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cve extends css {
   protected static final Map<dfi, dsl> a = Maps.newHashMap(
      new Builder()
         .put(dfk.i, dfk.kE.o())
         .put(dfk.j, dfk.kE.o())
         .put(dfk.l, dfk.kE.o())
         .put(dfk.k, dfk.kE.o())
         .put(dfk.fl, dfk.kE.o())
         .put(dfk.sH, dfk.kE.o())
         .build()
   );

   public cve(cvs $$0, cty.a $$1) {
      super($$0, avw.bD, $$1);
   }

   @Override
   public bqh a(cxp $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsl $$3 = $$1.a_($$2);
      if ($$0.k() == jf.a) {
         return bqh.e;
      } else {
         cml $$4 = $$0.o();
         dsl $$5 = a.get($$3.b());
         dsl $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, avh.wK, avi.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dfw && $$3.c(dfw.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dfw.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dfw.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dxh.c, $$2, dxh.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, btc.d($$0.p()));
               }
            }

            return bqh.a($$1.B);
         } else {
            return bqh.e;
         }
      }
   }
}

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cmm extends cjy {
   protected static final Map<cvf, dhn> a = Maps.newHashMap(
      new Builder()
         .put(cvh.i, cvh.kE.o())
         .put(cvh.j, cvh.kE.o())
         .put(cvh.l, cvh.kE.o())
         .put(cvh.k, cvh.kE.o())
         .put(cvh.fl, cvh.kE.o())
         .put(cvh.sH, cvh.kE.o())
         .build()
   );

   public cmm(cnb $$0, float $$1, float $$2, clj.a $$3) {
      super($$1, $$2, $$0, ark.bC, $$3);
   }

   @Override
   public bjb a(cny $$0) {
      csf $$1 = $$0.q();
      hx $$2 = $$0.a();
      dhn $$3 = $$1.a_($$2);
      if ($$0.k() == ib.a) {
         return bjb.d;
      } else {
         cdz $$4 = $$0.o();
         dhn $$5 = a.get($$3.b());
         dhn $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, aqv.vs, aqw.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof cvt && $$3.c(cvt.c)) {
            if (!$$1.y_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            cvt.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(cvt.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dlx.c, $$2, dlx.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bjb.a($$1.B);
         } else {
            return bjb.d;
         }
      }
   }
}

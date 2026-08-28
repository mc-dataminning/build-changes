import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cvu extends cte {
   protected static final Map<dfy, dtc> a = Maps.newHashMap(
      new Builder()
         .put(dga.i, dga.kE.o())
         .put(dga.j, dga.kE.o())
         .put(dga.l, dga.kE.o())
         .put(dga.k, dga.kE.o())
         .put(dga.fl, dga.kE.o())
         .put(dga.sH, dga.kE.o())
         .build()
   );

   public cvu(cwi $$0, cul.a $$1) {
      super($$0, awe.bD, $$1);
   }

   @Override
   public bqr a(cyf $$0) {
      dcw $$1 = $$0.q();
      jd $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      if ($$0.k() == ji.a) {
         return bqr.e;
      } else {
         cmx $$4 = $$0.o();
         dtc $$5 = a.get($$3.b());
         dtc $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).i()) {
            $$1.a($$4, $$2, avp.wK, avq.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dgm && $$3.c(dgm.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dgm.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dgm.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dxz.c, $$2, dxz.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, btn.d($$0.p()));
               }
            }

            return bqr.a($$1.B);
         } else {
            return bqr.e;
         }
      }
   }
}

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class ckj extends chv {
   protected static final Map<ctc, dfd> a = Maps.newHashMap(
      new Builder()
         .put(cte.i, cte.kE.o())
         .put(cte.j, cte.kE.o())
         .put(cte.l, cte.kE.o())
         .put(cte.k, cte.kE.o())
         .put(cte.fl, cte.kE.o())
         .put(cte.rG, cte.kE.o())
         .build()
   );

   public ckj(cky $$0, float $$1, float $$2, cjg.a $$3) {
      super($$1, $$2, $$0, apv.bC, $$3);
   }

   @Override
   public bhe a(clv $$0) {
      cqb $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfd $$3 = $$1.a_($$2);
      if ($$0.k() == ha.a) {
         return bhe.d;
      } else {
         cca $$4 = $$0.o();
         dfd $$5 = a.get($$3.b());
         dfd $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, apg.uX, aph.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof ctq && $$3.c(ctq.c)) {
            if (!$$1.w_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            ctq.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(ctq.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(djn.c, $$2, djn.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bhe.a($$1.B);
         } else {
            return bhe.d;
         }
      }
   }
}

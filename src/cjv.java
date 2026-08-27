import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cjv extends chh {
   protected static final Map<csl, dez> a = Maps.newHashMap(
      new Builder()
         .put(csm.i, csm.kE.n())
         .put(csm.j, csm.kE.n())
         .put(csm.l, csm.kE.n())
         .put(csm.k, csm.kE.n())
         .put(csm.fl, csm.kE.n())
         .put(csm.rG, csm.kE.n())
         .build()
   );

   public cjv(ckk $$0, float $$1, float $$2, cis.a $$3) {
      super($$1, $$2, $$0, apl.bC, $$3);
   }

   @Override
   public bgq a(clh $$0) {
      cpl $$1 = $$0.q();
      gu $$2 = $$0.a();
      dez $$3 = $$1.a_($$2);
      if ($$0.k() == ha.a) {
         return bgq.d;
      } else {
         cbm $$4 = $$0.o();
         dez $$5 = a.get($$3.b());
         dez $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, aow.uX, aox.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof csy && $$3.c(csy.b)) {
            if (!$$1.r_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            csy.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(csy.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(djj.c, $$2, djj.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bgq.a($$1.B);
         } else {
            return bgq.d;
         }
      }
   }
}

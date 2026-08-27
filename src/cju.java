import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cju extends chg {
   protected static final Map<csk, dey> a = Maps.newHashMap(
      new Builder()
         .put(csl.i, csl.kE.n())
         .put(csl.j, csl.kE.n())
         .put(csl.l, csl.kE.n())
         .put(csl.k, csl.kE.n())
         .put(csl.fl, csl.kE.n())
         .put(csl.rG, csl.kE.n())
         .build()
   );

   public cju(ckj $$0, float $$1, float $$2, cir.a $$3) {
      super($$1, $$2, $$0, apj.bC, $$3);
   }

   @Override
   public bgo a(clg $$0) {
      cpk $$1 = $$0.q();
      gv $$2 = $$0.a();
      dey $$3 = $$1.a_($$2);
      if ($$0.k() == hb.a) {
         return bgo.d;
      } else {
         cbl $$4 = $$0.o();
         dey $$5 = a.get($$3.b());
         dey $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, aou.uX, aov.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof csx && $$3.c(csx.b)) {
            if (!$$1.r_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            csx.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(csx.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dji.c, $$2, dji.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bgo.a($$1.B);
         } else {
            return bgo.d;
         }
      }
   }
}

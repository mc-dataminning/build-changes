import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cnp extends clb {
   protected static final Map<cwj, dja> a = Maps.newHashMap(
      new Builder()
         .put(cwl.i, cwl.kE.o())
         .put(cwl.j, cwl.kE.o())
         .put(cwl.l, cwl.kE.o())
         .put(cwl.k, cwl.kE.o())
         .put(cwl.fl, cwl.kE.o())
         .put(cwl.sH, cwl.kE.o())
         .build()
   );

   public cnp(coe $$0, float $$1, float $$2, cmm.a $$3) {
      super($$1, $$2, $$0, asb.bC, $$3);
   }

   @Override
   public bjv a(cpc $$0) {
      cti $$1 = $$0.q();
      hx $$2 = $$0.a();
      dja $$3 = $$1.a_($$2);
      if ($$0.k() == ic.a) {
         return bjv.d;
      } else {
         cfb $$4 = $$0.o();
         dja $$5 = a.get($$3.b());
         dja $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, arm.vN, arn.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof cwx && $$3.c(cwx.c)) {
            if (!$$1.y_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            cwx.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(cwx.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dnk.c, $$2, dnk.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bjv.a($$1.B);
         } else {
            return bjv.d;
         }
      }
   }
}

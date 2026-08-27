import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class ckd extends chp {
   protected static final Map<csv, dfj> a = Maps.newHashMap(
      new Builder()
         .put(csw.i, csw.kE.n())
         .put(csw.j, csw.kE.n())
         .put(csw.l, csw.kE.n())
         .put(csw.k, csw.kE.n())
         .put(csw.fl, csw.kE.n())
         .put(csw.rG, csw.kE.n())
         .build()
   );

   public ckd(cks $$0, float $$1, float $$2, cja.a $$3) {
      super($$1, $$2, $$0, aps.bC, $$3);
   }

   @Override
   public bgy a(clp $$0) {
      cpv $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfj $$3 = $$1.a_($$2);
      if ($$0.k() == ha.a) {
         return bgy.d;
      } else {
         cbu $$4 = $$0.o();
         dfj $$5 = a.get($$3.b());
         dfj $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, apd.uX, ape.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof cti && $$3.c(cti.b)) {
            if (!$$1.w_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            cti.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(cti.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(djt.c, $$2, djt.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bgy.a($$1.B);
         } else {
            return bgy.d;
         }
      }
   }
}

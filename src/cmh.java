import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cmh extends cjt {
   protected static final Map<cva, dhi> a = Maps.newHashMap(
      new Builder()
         .put(cvc.i, cvc.kE.o())
         .put(cvc.j, cvc.kE.o())
         .put(cvc.l, cvc.kE.o())
         .put(cvc.k, cvc.kE.o())
         .put(cvc.fl, cvc.kE.o())
         .put(cvc.sH, cvc.kE.o())
         .build()
   );

   public cmh(cmw $$0, float $$1, float $$2, cle.a $$3) {
      super($$1, $$2, $$0, arg.bC, $$3);
   }

   @Override
   public bix a(cnt $$0) {
      csa $$1 = $$0.q();
      ht $$2 = $$0.a();
      dhi $$3 = $$1.a_($$2);
      if ($$0.k() == hx.a) {
         return bix.d;
      } else {
         cdu $$4 = $$0.o();
         dhi $$5 = a.get($$3.b());
         dhi $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, aqr.vs, aqs.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof cvo && $$3.c(cvo.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            cvo.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(cvo.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dls.c, $$2, dls.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bix.a($$1.B);
         } else {
            return bix.d;
         }
      }
   }
}

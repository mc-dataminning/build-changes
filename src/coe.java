import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class coe extends clr {
   protected static final Map<cwy, djp> a = Maps.newHashMap(
      new Builder()
         .put(cxa.i, cxa.kE.o())
         .put(cxa.j, cxa.kE.o())
         .put(cxa.l, cxa.kE.o())
         .put(cxa.k, cxa.kE.o())
         .put(cxa.fl, cxa.kE.o())
         .put(cxa.sH, cxa.kE.o())
         .build()
   );

   public coe(cou $$0, float $$1, float $$2, cnb.a $$3) {
      super($$1, $$2, $$0, asi.bC, $$3);
   }

   @Override
   public bkc a(cpr $$0) {
      ctx $$1 = $$0.q();
      hx $$2 = $$0.a();
      djp $$3 = $$1.a_($$2);
      if ($$0.k() == ic.a) {
         return bkc.d;
      } else {
         cfq $$4 = $$0.o();
         djp $$5 = a.get($$3.b());
         djp $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, art.wc, aru.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof cxm && $$3.c(cxm.c)) {
            if (!$$1.y_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            cxm.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(cxm.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dnz.c, $$2, dnz.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bkc.a($$1.B);
         } else {
            return bkc.d;
         }
      }
   }
}

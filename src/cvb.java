import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cvb extends csp {
   protected static final Map<dff, dsh> a = Maps.newHashMap(
      new Builder()
         .put(dfh.i, dfh.kE.o())
         .put(dfh.j, dfh.kE.o())
         .put(dfh.l, dfh.kE.o())
         .put(dfh.k, dfh.kE.o())
         .put(dfh.fl, dfh.kE.o())
         .put(dfh.sH, dfh.kE.o())
         .build()
   );

   public cvb(cvp $$0, ctv.a $$1) {
      super($$0, avu.bD, $$1);
   }

   @Override
   public bqd a(cxm $$0) {
      dcd $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsh $$3 = $$1.a_($$2);
      if ($$0.k() == jf.a) {
         return bqd.e;
      } else {
         cmh $$4 = $$0.o();
         dsh $$5 = a.get($$3.b());
         dsh $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, avf.wK, avg.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dft && $$3.c(dft.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dft.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dft.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dxa.c, $$2, dxa.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bsy.d($$0.p()));
               }
            }

            return bqd.a($$1.B);
         } else {
            return bqd.e;
         }
      }
   }
}

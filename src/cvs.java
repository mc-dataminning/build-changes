import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cvs extends ctg {
   protected static final Map<dfb, dse> a = Maps.newHashMap(
      new Builder()
         .put(dfd.i, dfd.kE.o())
         .put(dfd.j, dfd.kE.o())
         .put(dfd.l, dfd.kE.o())
         .put(dfd.k, dfd.kE.o())
         .put(dfd.fl, dfd.kE.o())
         .put(dfd.sH, dfd.kE.o())
         .build()
   );

   public cvs(cwg $$0, cum.a $$1) {
      super($$0, awp.bD, $$1);
   }

   @Override
   public bqw a(cye $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      dse $$3 = $$1.a_($$2);
      if ($$0.k() == je.a) {
         return bqw.e;
      } else {
         cmz $$4 = $$0.o();
         dse $$5 = a.get($$3.b());
         dse $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, awa.wH, awb.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dfp && $$3.c(dfp.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dfp.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dfp.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dwx.c, $$2, dwx.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, btr.d($$0.p()));
               }
            }

            return bqw.a($$1.B);
         } else {
            return bqw.e;
         }
      }
   }
}

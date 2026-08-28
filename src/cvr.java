import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cvr extends ctf {
   protected static final Map<dfa, dsd> a = Maps.newHashMap(
      new Builder()
         .put(dfc.i, dfc.kE.o())
         .put(dfc.j, dfc.kE.o())
         .put(dfc.l, dfc.kE.o())
         .put(dfc.k, dfc.kE.o())
         .put(dfc.fl, dfc.kE.o())
         .put(dfc.sH, dfc.kE.o())
         .build()
   );

   public cvr(cwf $$0, cul.a $$1) {
      super($$0, awp.bD, $$1);
   }

   @Override
   public bqv a(cyd $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsd $$3 = $$1.a_($$2);
      if ($$0.k() == je.a) {
         return bqv.e;
      } else {
         cmy $$4 = $$0.o();
         dsd $$5 = a.get($$3.b());
         dsd $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, awa.wH, awb.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dfo && $$3.c(dfo.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dfo.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dfo.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dww.c, $$2, dww.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, btq.d($$0.p()));
               }
            }

            return bqv.a($$1.B);
         } else {
            return bqv.e;
         }
      }
   }
}

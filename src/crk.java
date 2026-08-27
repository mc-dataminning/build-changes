import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class crk extends coz {
   protected static final Map<dac, dnb> a = Maps.newHashMap(
      new Builder()
         .put(dae.i, dae.kE.o())
         .put(dae.j, dae.kE.o())
         .put(dae.l, dae.kE.o())
         .put(dae.k, dae.kE.o())
         .put(dae.fl, dae.kE.o())
         .put(dae.sH, dae.kE.o())
         .build()
   );

   public crk(crz $$0, float $$1, float $$2, cqh.a $$3) {
      super($$1, $$2, $$0, aun.bD, $$3);
   }

   @Override
   public bnd a(csw $$0) {
      cxb $$1 = $$0.q();
      ib $$2 = $$0.a();
      dnb $$3 = $$1.a_($$2);
      if ($$0.k() == ih.a) {
         return bnd.d;
      } else {
         ciu $$4 = $$0.o();
         dnb $$5 = a.get($$3.b());
         dnb $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, aty.wl, atz.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof daq && $$3.c(daq.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            daq.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(daq.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(drp.c, $$2, drp.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bpp.d($$0.p()));
               }
            }

            return bnd.a($$1.B);
         } else {
            return bnd.d;
         }
      }
   }
}

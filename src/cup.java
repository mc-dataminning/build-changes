import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cup extends csd {
   protected static final Map<ddy, drb> a = Maps.newHashMap(
      new Builder()
         .put(dea.i, dea.kE.n())
         .put(dea.j, dea.kE.n())
         .put(dea.l, dea.kE.n())
         .put(dea.k, dea.kE.n())
         .put(dea.fl, dea.kE.n())
         .put(dea.sH, dea.kE.n())
         .build()
   );

   public cup(cvd $$0, ctj.a $$1) {
      super($$0, avw.bD, $$1);
   }

   @Override
   public bpu a(cxb $$0) {
      dax $$1 = $$0.q();
      io $$2 = $$0.a();
      drb $$3 = $$1.a_($$2);
      if ($$0.k() == it.a) {
         return bpu.d;
      } else {
         clw $$4 = $$0.o();
         drb $$5 = a.get($$3.b());
         drb $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, avh.wH, avi.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dem && $$3.c(dem.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dem.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dem.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dvu.c, $$2, dvu.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bso.d($$0.p()));
               }
            }

            return bpu.a($$1.B);
         } else {
            return bpu.d;
         }
      }
   }
}

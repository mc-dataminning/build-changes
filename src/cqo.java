import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cqo extends coc {
   protected static final Map<czf, dme> a = Maps.newHashMap(
      new Builder()
         .put(czh.i, czh.kE.o())
         .put(czh.j, czh.kE.o())
         .put(czh.l, czh.kE.o())
         .put(czh.k, czh.kE.o())
         .put(czh.fl, czh.kE.o())
         .put(czh.sH, czh.kE.o())
         .build()
   );

   public cqo(crd $$0, float $$1, float $$2, cpl.a $$3) {
      super($$1, $$2, $$0, aue.bC, $$3);
   }

   @Override
   public bml a(crz $$0) {
      cwe $$1 = $$0.q();
      ib $$2 = $$0.a();
      dme $$3 = $$1.a_($$2);
      if ($$0.k() == ih.a) {
         return bml.d;
      } else {
         cia $$4 = $$0.o();
         dme $$5 = a.get($$3.b());
         dme $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, atp.wd, atq.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof czt && $$3.c(czt.c)) {
            if (!$$1.y_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            czt.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(czt.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dqr.c, $$2, dqr.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, box.d($$0.p()));
               }
            }

            return bml.a($$1.B);
         } else {
            return bml.d;
         }
      }
   }
}

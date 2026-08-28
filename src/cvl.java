import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cvl extends csz {
   protected static final Map<deu, drx> a = Maps.newHashMap(
      new Builder()
         .put(dew.i, dew.kE.n())
         .put(dew.j, dew.kE.n())
         .put(dew.l, dew.kE.n())
         .put(dew.k, dew.kE.n())
         .put(dew.fl, dew.kE.n())
         .put(dew.sH, dew.kE.n())
         .build()
   );

   public cvl(cvz $$0, cuf.a $$1) {
      super($$0, awl.bD, $$1);
   }

   @Override
   public bqp a(cxx $$0) {
      dbt $$1 = $$0.q();
      iz $$2 = $$0.a();
      drx $$3 = $$1.a_($$2);
      if ($$0.k() == je.a) {
         return bqp.e;
      } else {
         cms $$4 = $$0.o();
         drx $$5 = a.get($$3.b());
         drx $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, avw.wH, avx.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dfi && $$3.c(dfi.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dfi.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dfi.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dwq.c, $$2, dwq.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, btk.d($$0.p()));
               }
            }

            return bqp.a($$1.B);
         } else {
            return bqp.e;
         }
      }
   }
}

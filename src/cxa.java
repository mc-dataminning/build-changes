import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cxa extends cuq {
   protected static final Map<dhy, dvd> a = Maps.newHashMap(
      new Builder()
         .put(dia.i, dia.kE.m())
         .put(dia.j, dia.kE.m())
         .put(dia.l, dia.kE.m())
         .put(dia.k, dia.kE.m())
         .put(dia.fl, dia.kE.m())
         .put(dia.sH, dia.kE.m())
         .build()
   );

   public cxa(cxo $$0, float $$1, float $$2, cvt.a $$3) {
      super($$0, awz.bE, $$1, $$2, $$3);
   }

   @Override
   public bry a(czo $$0) {
      dev $$1 = $$0.q();
      jg $$2 = $$0.a();
      dvd $$3 = $$1.a_($$2);
      if ($$0.k() == jl.a) {
         return bry.e;
      } else {
         coh $$4 = $$0.o();
         dvd $$5 = a.get($$3.b());
         dvd $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awk.wJ, awl.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dim && $$3.c(dim.c)) {
            if (!$$1.y_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dim.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dim.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(eaa.c, $$2, eaa.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, buv.d($$0.p()));
               }
            }

            return bry.a;
         } else {
            return bry.e;
         }
      }
   }
}

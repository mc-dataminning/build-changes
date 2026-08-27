import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cvq extends csu {
   protected static final Map<dfc, dtc> a = Maps.newHashMap(
      new Builder()
         .put(dfe.j, dfe.lB.n())
         .put(dfe.m, dfe.lB.n())
         .put(dfe.n, dfe.lC.n())
         .put(dfe.p, dfe.lB.n())
         .put(dfe.o, dfe.lB.n())
         .put(dfe.gd, dfe.lB.n())
         .put(dfe.ue, dfe.lB.n())
         .put(dfe.k, dfe.lC.n())
         .put(dfe.l, dfe.lC.n())
         .build()
   );

   public cvq(cwe $$0, cuc.a $$1) {
      super($$0, awe.bG, $$1);
   }

   @Override
   public bqa a(cyf $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      if ($$0.k() == iw.a) {
         return bqa.d;
      } else {
         cly $$4 = $$0.o();
         dtc $$5 = a.get($$3.b());
         dtc $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, avo.xf, avq.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dfq && $$3.c(dfq.d)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dfq.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dfq.d, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(dxv.c, $$2, dxv.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bso.d($$0.p()));
               }
            }

            return bqa.a($$1.C);
         } else {
            return bqa.d;
         }
      }
   }
}

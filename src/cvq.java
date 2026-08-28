import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cvq extends cte {
   protected static final Map<dez, dsc> a = Maps.newHashMap(
      new Builder()
         .put(dfb.i, dfb.kE.o())
         .put(dfb.j, dfb.kE.o())
         .put(dfb.l, dfb.kE.o())
         .put(dfb.k, dfb.kE.o())
         .put(dfb.fl, dfb.kE.o())
         .put(dfb.sH, dfb.kE.o())
         .build()
   );

   public cvq(cwe $$0, cuk.a $$1) {
      super($$0, awp.bD, $$1);
   }

   @Override
   public bqu a(cyc $$0) {
      dby $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsc $$3 = $$1.a_($$2);
      if ($$0.k() == je.a) {
         return bqu.e;
      } else {
         cmx $$4 = $$0.o();
         dsc $$5 = a.get($$3.b());
         dsc $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, awa.wH, awb.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dfn && $$3.c(dfn.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dfn.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dfn.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dwv.c, $$2, dwv.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, btp.d($$0.p()));
               }
            }

            return bqu.a($$1.B);
         } else {
            return bqu.e;
         }
      }
   }
}

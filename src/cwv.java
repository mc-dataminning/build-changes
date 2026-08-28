import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cwv extends cui {
   protected static final Map<dhm, dus> a = Maps.newHashMap(
      new Builder()
         .put(dho.i, dho.kE.n())
         .put(dho.j, dho.kE.n())
         .put(dho.l, dho.kE.n())
         .put(dho.k, dho.kE.n())
         .put(dho.fl, dho.kE.n())
         .put(dho.sH, dho.kE.n())
         .build()
   );

   public cwv(cxj $$0, float $$1, float $$2, cvn.a $$3) {
      super($$0, awv.bE, $$1, $$2, $$3);
   }

   @Override
   public brs a(czp $$0) {
      dej $$1 = $$0.q();
      jf $$2 = $$0.a();
      dus $$3 = $$1.a_($$2);
      if ($$0.k() == jk.a) {
         return brs.e;
      } else {
         cnx $$4 = $$0.o();
         dus $$5 = a.get($$3.b());
         dus $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awg.wL, awh.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dia && $$3.c(dia.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dia.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dia.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dzp.c, $$2, dzp.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bun.d($$0.p()));
               }
            }

            return brs.a;
         } else {
            return brs.e;
         }
      }
   }
}

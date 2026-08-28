import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cxt extends cvj {
   protected static final Map<djn, dwy> a = Maps.newHashMap(
      new Builder()
         .put(djp.i, djp.lg.m())
         .put(djp.j, djp.lg.m())
         .put(djp.l, djp.lg.m())
         .put(djp.k, djp.lg.m())
         .put(djp.fA, djp.lg.m())
         .put(djp.tj, djp.lg.m())
         .build()
   );

   public cxt(cyh $$0, float $$1, float $$2, cwm.a $$3) {
      super($$0, awp.bF, $$1, $$2, $$3);
   }

   @Override
   public bsl a(daj $$0) {
      dgj $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwy $$3 = $$1.a_($$2);
      if ($$0.k() == jn.a) {
         return bsl.e;
      } else {
         coy $$4 = $$0.o();
         dwy $$5 = a.get($$3.b());
         dwy $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awa.xk, awb.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dkc && $$3.c(dkc.c)) {
            if (!$$1.B_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dkc.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dkc.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(ebu.c, $$2, ebu.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bvi.d($$0.p()));
               }
            }

            return bsl.a;
         } else {
            return bsl.e;
         }
      }
   }
}

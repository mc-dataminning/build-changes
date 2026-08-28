import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cxr extends cvh {
   protected static final Map<djl, dww> a = Maps.newHashMap(
      new Builder()
         .put(djn.i, djn.lg.m())
         .put(djn.j, djn.lg.m())
         .put(djn.l, djn.lg.m())
         .put(djn.k, djn.lg.m())
         .put(djn.fA, djn.lg.m())
         .put(djn.tj, djn.lg.m())
         .build()
   );

   public cxr(cyf $$0, float $$1, float $$2, cwk.a $$3) {
      super($$0, awp.bF, $$1, $$2, $$3);
   }

   @Override
   public bsj a(dah $$0) {
      dgh $$1 = $$0.q();
      ji $$2 = $$0.a();
      dww $$3 = $$1.a_($$2);
      if ($$0.k() == jn.a) {
         return bsj.e;
      } else {
         cow $$4 = $$0.o();
         dww $$5 = a.get($$3.b());
         dww $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awa.xk, awb.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dka && $$3.c(dka.c)) {
            if (!$$1.B_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dka.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dka.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(ebs.c, $$2, ebs.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bvg.d($$0.p()));
               }
            }

            return bsj.a;
         } else {
            return bsj.e;
         }
      }
   }
}

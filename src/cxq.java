import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cxq extends cvg {
   protected static final Map<djk, dwv> a = Maps.newHashMap(
      new Builder()
         .put(djm.i, djm.lg.m())
         .put(djm.j, djm.lg.m())
         .put(djm.l, djm.lg.m())
         .put(djm.k, djm.lg.m())
         .put(djm.fA, djm.lg.m())
         .put(djm.tj, djm.lg.m())
         .build()
   );

   public cxq(cye $$0, float $$1, float $$2, cwj.a $$3) {
      super($$0, awo.bF, $$1, $$2, $$3);
   }

   @Override
   public bsi a(dag $$0) {
      dgg $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwv $$3 = $$1.a_($$2);
      if ($$0.k() == jn.a) {
         return bsi.e;
      } else {
         cov $$4 = $$0.o();
         dwv $$5 = a.get($$3.b());
         dwv $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, avz.xk, awa.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof djz && $$3.c(djz.c)) {
            if (!$$1.B_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            djz.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(djz.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(ebr.c, $$2, ebr.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bvf.d($$0.p()));
               }
            }

            return bsi.a;
         } else {
            return bsi.e;
         }
      }
   }
}

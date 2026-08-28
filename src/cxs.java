import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cxs extends cvi {
   protected static final Map<djm, dwx> a = Maps.newHashMap(
      new Builder()
         .put(djo.i, djo.lg.m())
         .put(djo.j, djo.lg.m())
         .put(djo.l, djo.lg.m())
         .put(djo.k, djo.lg.m())
         .put(djo.fA, djo.lg.m())
         .put(djo.tj, djo.lg.m())
         .build()
   );

   public cxs(cyg $$0, float $$1, float $$2, cwl.a $$3) {
      super($$0, awp.bF, $$1, $$2, $$3);
   }

   @Override
   public bsk a(dai $$0) {
      dgi $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwx $$3 = $$1.a_($$2);
      if ($$0.k() == jn.a) {
         return bsk.e;
      } else {
         cox $$4 = $$0.o();
         dwx $$5 = a.get($$3.b());
         dwx $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awa.xk, awb.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dkb && $$3.c(dkb.c)) {
            if (!$$1.B_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dkb.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dkb.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(ebt.c, $$2, ebt.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bvh.d($$0.p()));
               }
            }

            return bsk.a;
         } else {
            return bsk.e;
         }
      }
   }
}

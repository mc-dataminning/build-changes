import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cyj extends cxd {
   protected static final Map<dke, dxq> a = Maps.newHashMap(
      new Builder()
         .put(dkg.i, dkg.lg.m())
         .put(dkg.j, dkg.lg.m())
         .put(dkg.l, dkg.lg.m())
         .put(dkg.k, dkg.lg.m())
         .put(dkg.fA, dkg.lg.m())
         .put(dkg.tl, dkg.lg.m())
         .build()
   );

   public cyj(cyw $$0, float $$1, float $$2, cxd.a $$3) {
      super($$3.a($$0, awp.bF, $$1, $$2, false));
   }

   @Override
   public bsy a(daz $$0) {
      dgz $$1 = $$0.q();
      ji $$2 = $$0.a();
      dxq $$3 = $$1.a_($$2);
      if ($$0.k() == jn.a) {
         return bsy.e;
      } else {
         cpr $$4 = $$0.o();
         dxq $$5 = a.get($$3.b());
         dxq $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awa.xu, awb.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dkt && $$3.c(dkt.b)) {
            if (!$$1.w_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dkt.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dkt.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(ecp.c, $$2, ecp.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bvy.d($$0.p()));
               }
            }

            return bsy.a;
         } else {
            return bsy.e;
         }
      }
   }
}

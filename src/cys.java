import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cys extends cwi {
   protected static final Map<dkm, dxv> a = Maps.newHashMap(
      new Builder()
         .put(dko.i, dko.kZ.m())
         .put(dko.j, dko.kZ.m())
         .put(dko.l, dko.kZ.m())
         .put(dko.k, dko.kZ.m())
         .put(dko.fz, dko.kZ.m())
         .put(dko.tc, dko.kZ.m())
         .build()
   );

   public cys(czg $$0, float $$1, float $$2, cxl.a $$3) {
      super($$0, axu.bF, $$1, $$2, $$3);
   }

   @Override
   public btj a(dbi $$0) {
      dhi $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxv $$3 = $$1.a_($$2);
      if ($$0.k() == jm.a) {
         return btj.e;
      } else {
         cpx $$4 = $$0.o();
         dxv $$5 = a.get($$3.b());
         dxv $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, axf.xe, axg.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dlb && $$3.c(dlb.c)) {
            if (!$$1.B_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dlb.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dlb.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(ecr.c, $$2, ecr.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bwg.d($$0.p()));
               }
            }

            return btj.a;
         } else {
            return btj.e;
         }
      }
   }
}

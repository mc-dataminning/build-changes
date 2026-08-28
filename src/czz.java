import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class czz extends cyu {
   protected static final Map<dma, dzz> a = Maps.newHashMap(
      new Builder()
         .put(dmc.i, dmc.lh.m())
         .put(dmc.j, dmc.lh.m())
         .put(dmc.l, dmc.lh.m())
         .put(dmc.k, dmc.lh.m())
         .put(dmc.fB, dmc.lh.m())
         .put(dmc.to, dmc.lh.m())
         .build()
   );

   public czz(dam $$0, float $$1, float $$2, cyu.a $$3) {
      super($$3.d($$0, $$1, $$2));
   }

   @Override
   public bub a(dct $$0) {
      div $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzz $$3 = $$1.a_($$2);
      if ($$0.k() == ja.a) {
         return bub.e;
      } else {
         cqy $$4 = $$0.o();
         dzz $$5 = a.get($$3.b());
         dzz $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awn.xx, awo.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dmp && $$3.c(dmp.b)) {
            if (!$$1.w_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dmp.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dmp.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(eez.c, $$2, eez.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bxc.d($$0.p()));
               }
            }

            return bub.a;
         } else {
            return bub.e;
         }
      }
   }
}

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class dae extends cyz {
   protected static final Map<dmf, eah> a = Maps.newHashMap(
      new Builder()
         .put(dmh.i, dmh.lk.m())
         .put(dmh.j, dmh.lk.m())
         .put(dmh.l, dmh.lk.m())
         .put(dmh.k, dmh.lk.m())
         .put(dmh.fE, dmh.lk.m())
         .put(dmh.tr, dmh.lk.m())
         .build()
   );

   public dae(dar $$0, float $$1, float $$2, cyz.a $$3) {
      super($$3.d($$0, $$1, $$2));
   }

   @Override
   public bud a(dcy $$0) {
      dja $$1 = $$0.q();
      iu $$2 = $$0.a();
      eah $$3 = $$1.a_($$2);
      if ($$0.k() == ja.a) {
         return bud.e;
      } else {
         crc $$4 = $$0.o();
         eah $$5 = a.get($$3.b());
         eah $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awn.xA, awo.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dmv && $$3.c(dmv.b)) {
            if (!$$1.w_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dmv.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dmv.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(efh.c, $$2, efh.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bxe.d($$0.p()));
               }
            }

            return bud.a;
         } else {
            return bud.e;
         }
      }
   }
}

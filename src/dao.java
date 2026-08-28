import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class dao extends czj {
   protected static final Map<dmr, eat> a = Maps.newHashMap(
      new Builder()
         .put(dmt.i, dmt.lk.m())
         .put(dmt.j, dmt.lk.m())
         .put(dmt.l, dmt.lk.m())
         .put(dmt.k, dmt.lk.m())
         .put(dmt.fE, dmt.lk.m())
         .put(dmt.tr, dmt.lk.m())
         .build()
   );

   public dao(dbb $$0, float $$1, float $$2, czj.a $$3) {
      super($$3.d($$0, $$1, $$2));
   }

   @Override
   public bug a(ddi $$0) {
      djm $$1 = $$0.q();
      iv $$2 = $$0.a();
      eat $$3 = $$1.a_($$2);
      if ($$0.k() == jb.a) {
         return bug.e;
      } else {
         crm $$4 = $$0.o();
         eat $$5 = a.get($$3.b());
         eat $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awn.xA, awo.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dnh && $$3.c(dnh.b)) {
            if (!$$1.w_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dnh.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dnh.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(eft.c, $$2, eft.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bxj.d($$0.p()));
               }
            }

            return bug.a;
         } else {
            return bug.e;
         }
      }
   }
}

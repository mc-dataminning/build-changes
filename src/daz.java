import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class daz extends czu {
   protected static final Map<dnc, ebe> a = Maps.newHashMap(
      new Builder()
         .put(dne.i, dne.lk.m())
         .put(dne.j, dne.lk.m())
         .put(dne.l, dne.lk.m())
         .put(dne.k, dne.lk.m())
         .put(dne.fE, dne.lk.m())
         .put(dne.tr, dne.lk.m())
         .build()
   );

   public daz(dbm $$0, float $$1, float $$2, czu.a $$3) {
      super($$3.d($$0, $$1, $$2));
   }

   @Override
   public bur a(ddt $$0) {
      djx $$1 = $$0.q();
      iv $$2 = $$0.a();
      ebe $$3 = $$1.a_($$2);
      if ($$0.k() == jb.a) {
         return bur.e;
      } else {
         crx $$4 = $$0.o();
         ebe $$5 = a.get($$3.b());
         ebe $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awp.xA, awq.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dns && $$3.c(dns.b)) {
            if (!$$1.A_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dns.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dns.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(ege.c, $$2, ege.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bxu.d($$0.p()));
               }
            }

            return bur.a;
         } else {
            return bur.e;
         }
      }
   }
}

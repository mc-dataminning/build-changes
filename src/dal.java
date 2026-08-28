import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class dal extends czg {
   protected static final Map<dmm, eao> a = Maps.newHashMap(
      new Builder()
         .put(dmo.i, dmo.lk.m())
         .put(dmo.j, dmo.lk.m())
         .put(dmo.l, dmo.lk.m())
         .put(dmo.k, dmo.lk.m())
         .put(dmo.fE, dmo.lk.m())
         .put(dmo.tr, dmo.lk.m())
         .build()
   );

   public dal(day $$0, float $$1, float $$2, czg.a $$3) {
      super($$3.d($$0, $$1, $$2));
   }

   @Override
   public bug a(ddf $$0) {
      djh $$1 = $$0.q();
      iv $$2 = $$0.a();
      eao $$3 = $$1.a_($$2);
      if ($$0.k() == jb.a) {
         return bug.e;
      } else {
         crj $$4 = $$0.o();
         eao $$5 = a.get($$3.b());
         eao $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awn.xA, awo.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dnc && $$3.c(dnc.b)) {
            if (!$$1.w_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dnc.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dnc.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(efo.c, $$2, efo.a.a($$4, $$6));
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

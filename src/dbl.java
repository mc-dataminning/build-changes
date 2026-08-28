import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class dbl extends dag {
   protected static final Map<dno, ebq> a = Maps.newHashMap(
      new Builder()
         .put(dnq.i, dnq.lk.m())
         .put(dnq.j, dnq.lk.m())
         .put(dnq.l, dnq.lk.m())
         .put(dnq.k, dnq.lk.m())
         .put(dnq.fE, dnq.lk.m())
         .put(dnq.tr, dnq.lk.m())
         .build()
   );

   public dbl(dby $$0, float $$1, float $$2, dag.a $$3) {
      super($$3.d($$0, $$1, $$2));
   }

   @Override
   public bvc a(def $$0) {
      dkj $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebq $$3 = $$1.a_($$2);
      if ($$0.k() == jc.a) {
         return bvc.e;
      } else {
         csi $$4 = $$0.o();
         ebq $$5 = a.get($$3.b());
         ebq $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awy.xA, awz.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof doe && $$3.c(doe.b)) {
            if (!$$1.A_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            doe.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(doe.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(egq.c, $$2, egq.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, byf.d($$0.p()));
               }
            }

            return bvc.a;
         } else {
            return bvc.e;
         }
      }
   }
}

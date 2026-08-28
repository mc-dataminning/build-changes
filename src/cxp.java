import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cxp extends cvf {
   protected static final Map<diq, dvv> a = Maps.newHashMap(
      new Builder()
         .put(dis.i, dis.kE.m())
         .put(dis.j, dis.kE.m())
         .put(dis.l, dis.kE.m())
         .put(dis.k, dis.kE.m())
         .put(dis.fl, dis.kE.m())
         .put(dis.sH, dis.kE.m())
         .build()
   );

   public cxp(cyd $$0, float $$1, float $$2, cwi.a $$3) {
      super($$0, axc.bE, $$1, $$2, $$3);
   }

   @Override
   public bsk a(daf $$0) {
      dfm $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvv $$3 = $$1.a_($$2);
      if ($$0.k() == jm.a) {
         return bsk.e;
      } else {
         cou $$4 = $$0.o();
         dvv $$5 = a.get($$3.b());
         dvv $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awn.wJ, awo.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dje && $$3.c(dje.c)) {
            if (!$$1.A_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dje.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dje.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(ear.c, $$2, ear.a.a($$4, $$6));
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

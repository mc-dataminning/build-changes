import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cyr extends cwh {
   protected static final Map<dkl, dxu> a = Maps.newHashMap(
      new Builder()
         .put(dkn.i, dkn.kZ.m())
         .put(dkn.j, dkn.kZ.m())
         .put(dkn.l, dkn.kZ.m())
         .put(dkn.k, dkn.kZ.m())
         .put(dkn.fz, dkn.kZ.m())
         .put(dkn.tc, dkn.kZ.m())
         .build()
   );

   public cyr(czf $$0, float $$1, float $$2, cxk.a $$3) {
      super($$0, axu.bF, $$1, $$2, $$3);
   }

   @Override
   public bti a(dbh $$0) {
      dhh $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxu $$3 = $$1.a_($$2);
      if ($$0.k() == jm.a) {
         return bti.e;
      } else {
         cpw $$4 = $$0.o();
         dxu $$5 = a.get($$3.b());
         dxu $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, axf.xe, axg.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dla && $$3.c(dla.c)) {
            if (!$$1.B_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dla.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dla.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(ecq.c, $$2, ecq.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bwf.d($$0.p()));
               }
            }

            return bti.a;
         } else {
            return bti.e;
         }
      }
   }
}

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cyn extends cwd {
   protected static final Map<dke, dxn> a = Maps.newHashMap(
      new Builder()
         .put(dkg.i, dkg.kZ.m())
         .put(dkg.j, dkg.kZ.m())
         .put(dkg.l, dkg.kZ.m())
         .put(dkg.k, dkg.kZ.m())
         .put(dkg.fz, dkg.kZ.m())
         .put(dkg.tc, dkg.kZ.m())
         .build()
   );

   public cyn(czb $$0, float $$1, float $$2, cxg.a $$3) {
      super($$0, axu.bF, $$1, $$2, $$3);
   }

   @Override
   public bte a(dbd $$0) {
      dha $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxn $$3 = $$1.a_($$2);
      if ($$0.k() == jm.a) {
         return bte.e;
      } else {
         cps $$4 = $$0.o();
         dxn $$5 = a.get($$3.b());
         dxn $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, axf.xd, axg.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dkt && $$3.c(dkt.c)) {
            if (!$$1.B_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dkt.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dkt.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(ecj.c, $$2, ecj.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bwb.d($$0.p()));
               }
            }

            return bte.a;
         } else {
            return bte.e;
         }
      }
   }
}

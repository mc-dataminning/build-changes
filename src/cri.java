import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cri extends cox {
   protected static final Map<daa, dmz> a = Maps.newHashMap(
      new Builder()
         .put(dac.i, dac.kE.o())
         .put(dac.j, dac.kE.o())
         .put(dac.l, dac.kE.o())
         .put(dac.k, dac.kE.o())
         .put(dac.fl, dac.kE.o())
         .put(dac.sH, dac.kE.o())
         .build()
   );

   public cri(crx $$0, float $$1, float $$2, cqf.a $$3) {
      super($$1, $$2, $$0, aun.bD, $$3);
   }

   @Override
   public bnc a(csu $$0) {
      cwz $$1 = $$0.q();
      ib $$2 = $$0.a();
      dmz $$3 = $$1.a_($$2);
      if ($$0.k() == ih.a) {
         return bnc.d;
      } else {
         cis $$4 = $$0.o();
         dmz $$5 = a.get($$3.b());
         dmz $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, aty.wg, atz.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dao && $$3.c(dao.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dao.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dao.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(drn.c, $$2, drn.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bpo.d($$0.p()));
               }
            }

            return bnc.a($$1.B);
         } else {
            return bnc.d;
         }
      }
   }
}

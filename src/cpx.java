import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cpx extends cnj {
   protected static final Map<cyo, dlf> a = Maps.newHashMap(
      new Builder()
         .put(cyq.i, cyq.kE.o())
         .put(cyq.j, cyq.kE.o())
         .put(cyq.l, cyq.kE.o())
         .put(cyq.k, cyq.kE.o())
         .put(cyq.fl, cyq.kE.o())
         .put(cyq.sH, cyq.kE.o())
         .build()
   );

   public cpx(cqm $$0, float $$1, float $$2, cou.a $$3) {
      super($$1, $$2, $$0, atz.bC, $$3);
   }

   @Override
   public blu a(cri $$0) {
      cvn $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlf $$3 = $$1.a_($$2);
      if ($$0.k() == ie.a) {
         return blu.d;
      } else {
         chh $$4 = $$0.o();
         dlf $$5 = a.get($$3.b());
         dlf $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, atk.wc, atl.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof czc && $$3.c(czc.c)) {
            if (!$$1.y_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            czc.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(czc.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dpp.c, $$2, dpp.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bog.d($$0.p()));
               }
            }

            return blu.a($$1.B);
         } else {
            return blu.d;
         }
      }
   }
}

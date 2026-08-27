import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cnf extends ckr {
   protected static final Map<cvz, dip> a = Maps.newHashMap(
      new Builder()
         .put(cwb.i, cwb.kE.o())
         .put(cwb.j, cwb.kE.o())
         .put(cwb.l, cwb.kE.o())
         .put(cwb.k, cwb.kE.o())
         .put(cwb.fl, cwb.kE.o())
         .put(cwb.sH, cwb.kE.o())
         .build()
   );

   public cnf(cnu $$0, float $$1, float $$2, cmc.a $$3) {
      super($$1, $$2, $$0, arr.bC, $$3);
   }

   @Override
   public bjl a(cos $$0) {
      csy $$1 = $$0.q();
      hv $$2 = $$0.a();
      dip $$3 = $$1.a_($$2);
      if ($$0.k() == ia.a) {
         return bjl.d;
      } else {
         cer $$4 = $$0.o();
         dip $$5 = a.get($$3.b());
         dip $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, arc.vN, ard.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof cwn && $$3.c(cwn.c)) {
            if (!$$1.y_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            cwn.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(cwn.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dmz.c, $$2, dmz.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bjl.a($$1.B);
         } else {
            return bjl.d;
         }
      }
   }
}

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cjw extends chi {
   protected static final Map<csm, dfa> a = Maps.newHashMap(
      new Builder()
         .put(csn.i, csn.kE.n())
         .put(csn.j, csn.kE.n())
         .put(csn.l, csn.kE.n())
         .put(csn.k, csn.kE.n())
         .put(csn.fl, csn.kE.n())
         .put(csn.rG, csn.kE.n())
         .build()
   );

   public cjw(ckl $$0, float $$1, float $$2, cit.a $$3) {
      super($$1, $$2, $$0, apl.bC, $$3);
   }

   @Override
   public bgq a(cli $$0) {
      cpm $$1 = $$0.q();
      gu $$2 = $$0.a();
      dfa $$3 = $$1.a_($$2);
      if ($$0.k() == ha.a) {
         return bgq.d;
      } else {
         cbn $$4 = $$0.o();
         dfa $$5 = a.get($$3.b());
         dfa $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, aow.uX, aox.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof csz && $$3.c(csz.b)) {
            if (!$$1.r_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            csz.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(csz.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(djk.c, $$2, djk.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bgq.a($$1.B);
         } else {
            return bgq.d;
         }
      }
   }
}

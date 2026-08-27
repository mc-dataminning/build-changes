import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class ckf extends chr {
   protected static final Map<csx, dfl> a = Maps.newHashMap(
      new Builder()
         .put(csy.i, csy.kE.n())
         .put(csy.j, csy.kE.n())
         .put(csy.l, csy.kE.n())
         .put(csy.k, csy.kE.n())
         .put(csy.fl, csy.kE.n())
         .put(csy.rG, csy.kE.n())
         .build()
   );

   public ckf(cku $$0, float $$1, float $$2, cjc.a $$3) {
      super($$1, $$2, $$0, apu.bC, $$3);
   }

   @Override
   public bha a(clr $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfl $$3 = $$1.a_($$2);
      if ($$0.k() == hc.a) {
         return bha.d;
      } else {
         cbw $$4 = $$0.o();
         dfl $$5 = a.get($$3.b());
         dfl $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, apf.uX, apg.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof ctk && $$3.c(ctk.b)) {
            if (!$$1.w_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            ctk.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(ctk.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(djv.c, $$2, djv.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bha.a($$1.B);
         } else {
            return bha.d;
         }
      }
   }
}

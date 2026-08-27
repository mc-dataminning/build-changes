import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cty extends cro {
   protected static final Map<dde, dqh> a = Maps.newHashMap(
      new Builder()
         .put(ddg.i, ddg.kE.n())
         .put(ddg.j, ddg.kE.n())
         .put(ddg.l, ddg.kE.n())
         .put(ddg.k, ddg.kE.n())
         .put(ddg.fl, ddg.kE.n())
         .put(ddg.sH, ddg.kE.n())
         .build()
   );

   public cty(cum $$0, csu.a $$1) {
      super($$0, avr.bD, $$1);
   }

   @Override
   public bpm a(cwk $$0) {
      dad $$1 = $$0.q();
      in $$2 = $$0.a();
      dqh $$3 = $$1.a_($$2);
      if ($$0.k() == is.a) {
         return bpm.d;
      } else {
         clh $$4 = $$0.o();
         dqh $$5 = a.get($$3.b());
         dqh $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, avc.ww, avd.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dds && $$3.c(dds.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dds.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dds.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dva.c, $$2, dva.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bsa.d($$0.p()));
               }
            }

            return bpm.a($$1.B);
         } else {
            return bpm.d;
         }
      }
   }
}

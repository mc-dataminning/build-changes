import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cnv extends clh {
   protected static final Map<cwp, djg> a = Maps.newHashMap(
      new Builder()
         .put(cwr.i, cwr.kE.o())
         .put(cwr.j, cwr.kE.o())
         .put(cwr.l, cwr.kE.o())
         .put(cwr.k, cwr.kE.o())
         .put(cwr.fl, cwr.kE.o())
         .put(cwr.sH, cwr.kE.o())
         .build()
   );

   public cnv(cok $$0, float $$1, float $$2, cms.a $$3) {
      super($$1, $$2, $$0, asg.bC, $$3);
   }

   @Override
   public bka a(cpi $$0) {
      cto $$1 = $$0.q();
      hx $$2 = $$0.a();
      djg $$3 = $$1.a_($$2);
      if ($$0.k() == ic.a) {
         return bka.d;
      } else {
         cfh $$4 = $$0.o();
         djg $$5 = a.get($$3.b());
         djg $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, arr.vN, ars.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof cxd && $$3.c(cxd.c)) {
            if (!$$1.y_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            cxd.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(cxd.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dnq.c, $$2, dnq.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bka.a($$1.B);
         } else {
            return bka.d;
         }
      }
   }
}

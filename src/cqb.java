import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cqb extends cnn {
   protected static final Map<cys, dlj> a = Maps.newHashMap(
      new Builder()
         .put(cyu.i, cyu.kE.o())
         .put(cyu.j, cyu.kE.o())
         .put(cyu.l, cyu.kE.o())
         .put(cyu.k, cyu.kE.o())
         .put(cyu.fl, cyu.kE.o())
         .put(cyu.sH, cyu.kE.o())
         .build()
   );

   public cqb(cqq $$0, float $$1, float $$2, coy.a $$3) {
      super($$1, $$2, $$0, aua.bC, $$3);
   }

   @Override
   public blw a(crm $$0) {
      cvr $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlj $$3 = $$1.a_($$2);
      if ($$0.k() == ie.a) {
         return blw.d;
      } else {
         chl $$4 = $$0.o();
         dlj $$5 = a.get($$3.b());
         dlj $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, atl.wd, atm.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof czg && $$3.c(czg.c)) {
            if (!$$1.y_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            czg.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(czg.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dpw.c, $$2, dpw.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, boi.d($$0.p()));
               }
            }

            return blw.a($$1.B);
         } else {
            return blw.d;
         }
      }
   }
}

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cvs extends ctc {
   protected static final Map<dfw, dta> a = Maps.newHashMap(
      new Builder()
         .put(dfy.i, dfy.kE.o())
         .put(dfy.j, dfy.kE.o())
         .put(dfy.l, dfy.kE.o())
         .put(dfy.k, dfy.kE.o())
         .put(dfy.fl, dfy.kE.o())
         .put(dfy.sH, dfy.kE.o())
         .build()
   );

   public cvs(cwg $$0, cuj.a $$1) {
      super($$0, awd.bD, $$1);
   }

   @Override
   public bqq a(cyd $$0) {
      dcu $$1 = $$0.q();
      jd $$2 = $$0.a();
      dta $$3 = $$1.a_($$2);
      if ($$0.k() == ji.a) {
         return bqq.e;
      } else {
         cmv $$4 = $$0.o();
         dta $$5 = a.get($$3.b());
         dta $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, avo.wK, avp.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dgk && $$3.c(dgk.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dgk.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dgk.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dxw.c, $$2, dxw.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, btl.d($$0.p()));
               }
            }

            return bqq.a($$1.B);
         } else {
            return bqq.e;
         }
      }
   }
}

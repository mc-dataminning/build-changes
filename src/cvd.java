import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cvd extends csr {
   protected static final Map<dfh, dsk> a = Maps.newHashMap(
      new Builder()
         .put(dfj.i, dfj.kE.o())
         .put(dfj.j, dfj.kE.o())
         .put(dfj.l, dfj.kE.o())
         .put(dfj.k, dfj.kE.o())
         .put(dfj.fl, dfj.kE.o())
         .put(dfj.sH, dfj.kE.o())
         .build()
   );

   public cvd(cvr $$0, ctx.a $$1) {
      super($$0, avw.bD, $$1);
   }

   @Override
   public bqg a(cxo $$0) {
      dcf $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsk $$3 = $$1.a_($$2);
      if ($$0.k() == jf.a) {
         return bqg.e;
      } else {
         cmk $$4 = $$0.o();
         dsk $$5 = a.get($$3.b());
         dsk $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, avh.wK, avi.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dfv && $$3.c(dfv.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dfv.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dfv.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dxg.c, $$2, dxg.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, btb.d($$0.p()));
               }
            }

            return bqg.a($$1.B);
         } else {
            return bqg.e;
         }
      }
   }
}

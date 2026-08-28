import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cvo extends ctc {
   protected static final Map<dex, dsa> a = Maps.newHashMap(
      new Builder()
         .put(dez.i, dez.kE.o())
         .put(dez.j, dez.kE.o())
         .put(dez.l, dez.kE.o())
         .put(dez.k, dez.kE.o())
         .put(dez.fl, dez.kE.o())
         .put(dez.sH, dez.kE.o())
         .build()
   );

   public cvo(cwc $$0, cui.a $$1) {
      super($$0, awo.bD, $$1);
   }

   @Override
   public bqs a(cya $$0) {
      dbw $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsa $$3 = $$1.a_($$2);
      if ($$0.k() == je.a) {
         return bqs.e;
      } else {
         cmv $$4 = $$0.o();
         dsa $$5 = a.get($$3.b());
         dsa $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, avz.wH, awa.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dfl && $$3.c(dfl.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dfl.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dfl.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dwt.c, $$2, dwt.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, btn.d($$0.p()));
               }
            }

            return bqs.a($$1.B);
         } else {
            return bqs.e;
         }
      }
   }
}

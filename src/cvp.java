import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cvp extends ctd {
   protected static final Map<dey, dsb> a = Maps.newHashMap(
      new Builder()
         .put(dfa.i, dfa.kE.o())
         .put(dfa.j, dfa.kE.o())
         .put(dfa.l, dfa.kE.o())
         .put(dfa.k, dfa.kE.o())
         .put(dfa.fl, dfa.kE.o())
         .put(dfa.sH, dfa.kE.o())
         .build()
   );

   public cvp(cwd $$0, cuj.a $$1) {
      super($$0, awo.bD, $$1);
   }

   @Override
   public bqt a(cyb $$0) {
      dbx $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsb $$3 = $$1.a_($$2);
      if ($$0.k() == je.a) {
         return bqt.e;
      } else {
         cmw $$4 = $$0.o();
         dsb $$5 = a.get($$3.b());
         dsb $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, avz.wH, awa.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dfm && $$3.c(dfm.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dfm.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dfm.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dwu.c, $$2, dwu.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bto.d($$0.p()));
               }
            }

            return bqt.a($$1.B);
         } else {
            return bqt.e;
         }
      }
   }
}

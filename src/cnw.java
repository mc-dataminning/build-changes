import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cnw extends cli {
   protected static final Map<cwq, djh> a = Maps.newHashMap(
      new Builder()
         .put(cws.i, cws.kE.o())
         .put(cws.j, cws.kE.o())
         .put(cws.l, cws.kE.o())
         .put(cws.k, cws.kE.o())
         .put(cws.fl, cws.kE.o())
         .put(cws.sH, cws.kE.o())
         .build()
   );

   public cnw(col $$0, float $$1, float $$2, cmt.a $$3) {
      super($$1, $$2, $$0, ash.bC, $$3);
   }

   @Override
   public bkb a(cpj $$0) {
      ctp $$1 = $$0.q();
      hx $$2 = $$0.a();
      djh $$3 = $$1.a_($$2);
      if ($$0.k() == ic.a) {
         return bkb.d;
      } else {
         cfi $$4 = $$0.o();
         djh $$5 = a.get($$3.b());
         djh $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, ars.vN, art.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof cxe && $$3.c(cxe.c)) {
            if (!$$1.y_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            cxe.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(cxe.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dnr.c, $$2, dnr.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bkb.a($$1.B);
         } else {
            return bkb.d;
         }
      }
   }
}

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class clh extends cit {
   protected static final Map<cua, dgb> a = Maps.newHashMap(
      new Builder()
         .put(cuc.i, cuc.kE.o())
         .put(cuc.j, cuc.kE.o())
         .put(cuc.l, cuc.kE.o())
         .put(cuc.k, cuc.kE.o())
         .put(cuc.fl, cuc.kE.o())
         .put(cuc.rG, cuc.kE.o())
         .build()
   );

   public clh(clw $$0, float $$1, float $$2, cke.a $$3) {
      super($$1, $$2, $$0, aqs.bC, $$3);
   }

   @Override
   public bib a(cmt $$0) {
      cqz $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgb $$3 = $$1.a_($$2);
      if ($$0.k() == hx.a) {
         return bib.d;
      } else {
         ccx $$4 = $$0.o();
         dgb $$5 = a.get($$3.b());
         dgb $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, aqd.uZ, aqe.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof cuo && $$3.c(cuo.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            cuo.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(cuo.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dkl.c, $$2, dkl.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bib.a($$1.B);
         } else {
            return bib.d;
         }
      }
   }
}

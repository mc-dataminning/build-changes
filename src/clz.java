import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class clz extends cjl {
   protected static final Map<cut, dgw> a = Maps.newHashMap(
      new Builder()
         .put(cuv.i, cuv.kE.o())
         .put(cuv.j, cuv.kE.o())
         .put(cuv.l, cuv.kE.o())
         .put(cuv.k, cuv.kE.o())
         .put(cuv.fl, cuv.kE.o())
         .put(cuv.rG, cuv.kE.o())
         .build()
   );

   public clz(cmo $$0, float $$1, float $$2, ckw.a $$3) {
      super($$1, $$2, $$0, arc.bC, $$3);
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgw $$3 = $$1.a_($$2);
      if ($$0.k() == hx.a) {
         return biq.d;
      } else {
         cdm $$4 = $$0.o();
         dgw $$5 = a.get($$3.b());
         dgw $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, aqn.vb, aqo.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof cvh && $$3.c(cvh.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            cvh.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(cvh.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dlg.c, $$2, dlg.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return biq.a($$1.B);
         } else {
            return biq.d;
         }
      }
   }
}

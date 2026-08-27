import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class csh extends cpy {
   protected static final Map<dby, doz> a = Maps.newHashMap(
      new Builder()
         .put(dca.i, dca.kE.n())
         .put(dca.j, dca.kE.n())
         .put(dca.l, dca.kE.n())
         .put(dca.k, dca.kE.n())
         .put(dca.fl, dca.kE.n())
         .put(dca.sH, dca.kE.n())
         .build()
   );

   public csh(csv $$0, cre.a $$1) {
      super($$0, avc.bD, $$1);
   }

   @Override
   public boa a(cuq $$0) {
      cyx $$1 = $$0.q();
      ib $$2 = $$0.a();
      doz $$3 = $$1.a_($$2);
      if ($$0.k() == ih.a) {
         return boa.d;
      } else {
         cjt $$4 = $$0.o();
         doz $$5 = a.get($$3.b());
         doz $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, aum.wo, aun.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dcm && $$3.c(dcm.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dcm.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dcm.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dts.c, $$2, dts.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bqo.d($$0.p()));
               }
            }

            return boa.a($$1.B);
         } else {
            return boa.d;
         }
      }
   }
}

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cjy extends chk {
   protected static final Map<csq, dfe> a = Maps.newHashMap(
      new Builder()
         .put(csr.i, csr.kE.n())
         .put(csr.j, csr.kE.n())
         .put(csr.l, csr.kE.n())
         .put(csr.k, csr.kE.n())
         .put(csr.fl, csr.kE.n())
         .put(csr.rG, csr.kE.n())
         .build()
   );

   public cjy(ckn $$0, float $$1, float $$2, civ.a $$3) {
      super($$1, $$2, $$0, apo.bC, $$3);
   }

   @Override
   public bgt a(clk $$0) {
      cpq $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfe $$3 = $$1.a_($$2);
      if ($$0.k() == hc.a) {
         return bgt.d;
      } else {
         cbp $$4 = $$0.o();
         dfe $$5 = a.get($$3.b());
         dfe $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, aoz.uX, apa.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof ctd && $$3.c(ctd.b)) {
            if (!$$1.r_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            ctd.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(ctd.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(djo.c, $$2, djo.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bgt.a($$1.B);
         } else {
            return bgt.d;
         }
      }
   }
}

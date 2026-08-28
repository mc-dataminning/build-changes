import java.util.Map;

public class cpg extends byv<cpa> {
   public cpg() {
      super(Map.of(cgg.p, cgh.a, cgg.n, cgh.b, cgg.aV, cgh.b, cgg.aW, cgh.b));
   }

   protected boolean a(arq $$0, cpa $$1) {
      return $$1.aJ() && !$$1.bj() && $$1.aw() == bxq.a;
   }

   protected void a(arq $$0, cpa $$1, long $$2) {
      bxe $$3 = $$1.ec().c(cgg.p).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.l($$3.dt());
         feq $$5 = null;
         if ($$4) {
            feq $$6 = chx.a($$1, 5, 5, $$3.dt());
            if ($$6 != null && cpc.a($$1, $$6) && $$3.h($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dY().h() ? cpc.a($$3, $$1.dY()) : a($$1, $$3);
         }

         $$1.ec().a(cgg.n, new cgj(iu.a((jo)$$5), 0.6F, 1));
      }
   }

   private static feq a(cpa $$0, bxe $$1) {
      feq $$2 = $$1.dt().d($$0.dt());
      double $$3 = $$2.g() - azm.d($$0.dY().j(), 8.0, 4.0);
      feq $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dt().e($$4);
   }
}

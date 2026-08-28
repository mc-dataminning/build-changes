import java.util.Map;

public class cle extends bvh<cky> {
   public cle() {
      super(Map.of(ccs.o, cct.a, ccs.m, cct.b, ccs.aU, cct.b, ccs.aV, cct.b));
   }

   protected boolean a(are $$0, cky $$1) {
      return $$1.aE() && !$$1.be() && $$1.ar() == bua.a;
   }

   protected void a(are $$0, cky $$1, long $$2) {
      bto $$3 = $$1.dS().c(ccs.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.dn());
         evq $$5 = null;
         if ($$4) {
            evq $$6 = cej.a($$1, 5, 5, $$3.dn());
            if ($$6 != null && cla.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.el().h() ? cla.a($$3, $$1.el()) : a($$1, $$3);
         }

         $$1.dS().a(ccs.m, new ccv(iz.a($$5), 0.6F, 1));
      }
   }

   private static evq a(cky $$0, bto $$1) {
      evq $$2 = $$1.dn().d($$0.dn());
      double $$3 = $$2.f() - ayy.d($$0.el().j(), 8.0, 4.0);
      evq $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dn().e($$4);
   }
}

import java.util.Map;

public class clh extends bvk<clb> {
   public clh() {
      super(Map.of(ccv.o, ccw.a, ccv.m, ccw.b, ccv.aU, ccw.b, ccv.aV, ccw.b));
   }

   protected boolean a(arf $$0, clb $$1) {
      return $$1.aE() && !$$1.be() && $$1.ar() == bud.a;
   }

   protected void a(arf $$0, clb $$1, long $$2) {
      btr $$3 = $$1.dS().c(ccv.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.dn());
         evt $$5 = null;
         if ($$4) {
            evt $$6 = cem.a($$1, 5, 5, $$3.dn());
            if ($$6 != null && cld.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.el().h() ? cld.a($$3, $$1.el()) : a($$1, $$3);
         }

         $$1.dS().a(ccv.m, new ccy(iz.a($$5), 0.6F, 1));
      }
   }

   private static evt a(clb $$0, btr $$1) {
      evt $$2 = $$1.dn().d($$0.dn());
      double $$3 = $$2.f() - ayz.d($$0.el().j(), 8.0, 4.0);
      evt $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dn().e($$4);
   }
}

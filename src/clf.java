import java.util.Map;

public class clf extends bvi<ckz> {
   public clf() {
      super(Map.of(cct.o, ccu.a, cct.m, ccu.b, cct.aU, ccu.b, cct.aV, ccu.b));
   }

   protected boolean a(arf $$0, ckz $$1) {
      return $$1.aE() && !$$1.be() && $$1.ar() == bub.a;
   }

   protected void a(arf $$0, ckz $$1, long $$2) {
      btp $$3 = $$1.dS().c(cct.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.dn());
         evr $$5 = null;
         if ($$4) {
            evr $$6 = cek.a($$1, 5, 5, $$3.dn());
            if ($$6 != null && clb.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.el().h() ? clb.a($$3, $$1.el()) : a($$1, $$3);
         }

         $$1.dS().a(cct.m, new ccw(iz.a($$5), 0.6F, 1));
      }
   }

   private static evr a(ckz $$0, btp $$1) {
      evr $$2 = $$1.dn().d($$0.dn());
      double $$3 = $$2.f() - ayz.d($$0.el().j(), 8.0, 4.0);
      evr $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dn().e($$4);
   }
}

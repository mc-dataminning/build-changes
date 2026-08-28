import java.util.Map;

public class clg extends bvj<cla> {
   public clg() {
      super(Map.of(ccu.o, ccv.a, ccu.m, ccv.b, ccu.aU, ccv.b, ccu.aV, ccv.b));
   }

   protected boolean a(arf $$0, cla $$1) {
      return $$1.aE() && !$$1.be() && $$1.ar() == buc.a;
   }

   protected void a(arf $$0, cla $$1, long $$2) {
      btq $$3 = $$1.dS().c(ccu.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.dn());
         evs $$5 = null;
         if ($$4) {
            evs $$6 = cel.a($$1, 5, 5, $$3.dn());
            if ($$6 != null && clc.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.el().h() ? clc.a($$3, $$1.el()) : a($$1, $$3);
         }

         $$1.dS().a(ccu.m, new ccx(iz.a($$5), 0.6F, 1));
      }
   }

   private static evs a(cla $$0, btq $$1) {
      evs $$2 = $$1.dn().d($$0.dn());
      double $$3 = $$2.f() - ayz.d($$0.el().j(), 8.0, 4.0);
      evs $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dn().e($$4);
   }
}

import java.util.Map;

public class cla extends bvd<cku> {
   public cla() {
      super(Map.of(cco.o, ccp.a, cco.m, ccp.b, cco.aU, ccp.b, cco.aV, ccp.b));
   }

   protected boolean a(arb $$0, cku $$1) {
      return $$1.aE() && !$$1.be() && $$1.ar() == btw.a;
   }

   protected void a(arb $$0, cku $$1, long $$2) {
      btk $$3 = $$1.dS().c(cco.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.dn());
         evm $$5 = null;
         if ($$4) {
            evm $$6 = cef.a($$1, 5, 5, $$3.dn());
            if ($$6 != null && ckw.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.el().h() ? ckw.a($$3, $$1.el()) : a($$1, $$3);
         }

         $$1.dS().a(cco.m, new ccr(iz.a($$5), 0.6F, 1));
      }
   }

   private static evm a(cku $$0, btk $$1) {
      evm $$2 = $$1.dn().d($$0.dn());
      double $$3 = $$2.f() - ayu.d($$0.el().j(), 8.0, 4.0);
      evm $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dn().e($$4);
   }
}

import java.util.Map;

public class ckg extends buj<cka> {
   public ckg() {
      super(Map.of(cbu.o, cbv.a, cbu.m, cbv.b, cbu.aU, cbv.b, cbu.aV, cbv.b));
   }

   protected boolean a(aqn $$0, cka $$1) {
      return $$1.aE() && !$$1.be() && $$1.ar() == btc.a;
   }

   protected void a(aqn $$0, cka $$1, long $$2) {
      bsq $$3 = $$1.dS().c(cbu.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.dn());
         eum $$5 = null;
         if ($$4) {
            eum $$6 = cdl.a($$1, 5, 5, $$3.dn());
            if ($$6 != null && ckc.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.el().h() ? ckc.a($$3, $$1.el()) : a($$1, $$3);
         }

         $$1.dS().a(cbu.m, new cbx(io.a($$5), 0.6F, 1));
      }
   }

   private static eum a(cka $$0, bsq $$1) {
      eum $$2 = $$1.dn().d($$0.dn());
      double $$3 = $$2.f() - ayf.d($$0.el().j(), 8.0, 4.0);
      eum $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dn().e($$4);
   }
}

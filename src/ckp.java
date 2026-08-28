import java.util.Map;

public class ckp extends bur<ckj> {
   public ckp() {
      super(Map.of(ccc.o, ccd.a, ccc.m, ccd.b, ccc.aU, ccd.b, ccc.aV, ccd.b));
   }

   protected boolean a(aqk $$0, ckj $$1) {
      return $$1.aE() && !$$1.be() && $$1.ar() == btk.a;
   }

   protected void a(aqk $$0, ckj $$1, long $$2) {
      bsy $$3 = $$1.dT().c(ccc.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.dn());
         evz $$5 = null;
         if ($$4) {
            evz $$6 = cdt.a($$1, 5, 5, $$3.dn());
            if ($$6 != null && ckl.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dS().h() ? ckl.a($$3, $$1.dS()) : a($$1, $$3);
         }

         $$1.dT().a(ccc.m, new ccf(ja.a($$5), 0.6F, 1));
      }
   }

   private static evz a(ckj $$0, bsy $$1) {
      evz $$2 = $$1.dn().d($$0.dn());
      double $$3 = $$2.f() - aye.d($$0.dS().j(), 8.0, 4.0);
      evz $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dn().e($$4);
   }
}

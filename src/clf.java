import java.util.Map;

public class clf extends bvh<ckz> {
   public clf() {
      super(Map.of(ccs.o, cct.a, ccs.m, cct.b, ccs.aU, cct.b, ccs.aV, cct.b));
   }

   protected boolean a(aqu $$0, ckz $$1) {
      return $$1.aF() && !$$1.bf() && $$1.at() == bua.a;
   }

   protected void a(aqu $$0, ckz $$1, long $$2) {
      btn $$3 = $$1.dU().c(ccs.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.b($$3.dn());
         exa $$5 = null;
         if ($$4) {
            exa $$6 = cej.a($$1, 5, 5, $$3.dn());
            if ($$6 != null && clb.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dS().h() ? clb.a($$3, $$1.dS()) : a($$1, $$3);
         }

         $$1.dU().a(ccs.m, new ccv(jd.a((jw)$$5), 0.6F, 1));
      }
   }

   private static exa a(ckz $$0, btn $$1) {
      exa $$2 = $$1.dn().d($$0.dn());
      double $$3 = $$2.f() - ayo.d($$0.dS().j(), 8.0, 4.0);
      exa $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dn().e($$4);
   }
}

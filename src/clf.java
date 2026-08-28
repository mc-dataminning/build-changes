import java.util.Map;

public class clf extends bvh<ckz> {
   public clf() {
      super(Map.of(ccs.o, cct.a, ccs.m, cct.b, ccs.aU, cct.b, ccs.aV, cct.b));
   }

   protected boolean a(aqu $$0, ckz $$1) {
      return $$1.aF() && !$$1.bf() && $$1.at() == bua.a;
   }

   protected void a(aqu $$0, ckz $$1, long $$2) {
      btn $$3 = $$1.dT().c(ccs.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.b($$3.dm());
         exc $$5 = null;
         if ($$4) {
            exc $$6 = cej.a($$1, 5, 5, $$3.dm());
            if ($$6 != null && clb.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dR().h() ? clb.a($$3, $$1.dR()) : a($$1, $$3);
         }

         $$1.dT().a(ccs.m, new ccv(jd.a((jw)$$5), 0.6F, 1));
      }
   }

   private static exc a(ckz $$0, btn $$1) {
      exc $$2 = $$1.dm().d($$0.dm());
      double $$3 = $$2.f() - ayo.d($$0.dR().j(), 8.0, 4.0);
      exc $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dm().e($$4);
   }
}

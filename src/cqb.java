import java.util.Map;

public class cqb extends bzl<cpv> {
   public cqb() {
      super(Map.of(cgw.p, cgx.a, cgw.n, cgx.b, cgw.aV, cgx.b, cgw.aW, cgx.b));
   }

   protected boolean a(ars $$0, cpv $$1) {
      return $$1.aH() && !$$1.bi() && $$1.at() == byg.a;
   }

   protected void a(ars $$0, cpv $$1, long $$2) {
      bxu $$3 = $$1.ec().c(cgw.p).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.l($$3.dt());
         ffq $$5 = null;
         if ($$4) {
            ffq $$6 = cin.a($$1, 5, 5, $$3.dt());
            if ($$6 != null && cpx.a($$1, $$6) && $$3.h($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dY().h() ? cpx.a($$3, $$1.dY()) : a($$1, $$3);
         }

         $$1.ec().a(cgw.n, new cgz(iv.a((jp)$$5), 0.6F, 1));
      }
   }

   private static ffq a(cpv $$0, bxu $$1) {
      ffq $$2 = $$1.dt().d($$0.dt());
      double $$3 = $$2.g() - azo.d($$0.dY().j(), 8.0, 4.0);
      ffq $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dt().e($$4);
   }
}

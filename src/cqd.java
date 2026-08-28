import java.util.Map;

public class cqd extends bzn<cpx> {
   public cqd() {
      super(Map.of(cgy.p, cgz.a, cgy.n, cgz.b, cgy.aV, cgz.b, cgy.aW, cgz.b));
   }

   protected boolean a(aru $$0, cpx $$1) {
      return $$1.aH() && !$$1.bi() && $$1.at() == byi.a;
   }

   protected void a(aru $$0, cpx $$1, long $$2) {
      bxw $$3 = $$1.ec().c(cgy.p).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.l($$3.dt());
         ffs $$5 = null;
         if ($$4) {
            ffs $$6 = cip.a($$1, 5, 5, $$3.dt());
            if ($$6 != null && cpz.a($$1, $$6) && $$3.h($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dY().h() ? cpz.a($$3, $$1.dY()) : a($$1, $$3);
         }

         $$1.ec().a(cgy.n, new chb(iw.a((jq)$$5), 0.6F, 1));
      }
   }

   private static ffs a(cpx $$0, bxw $$1) {
      ffs $$2 = $$1.dt().d($$0.dt());
      double $$3 = $$2.g() - azq.d($$0.dY().j(), 8.0, 4.0);
      ffs $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dt().e($$4);
   }
}

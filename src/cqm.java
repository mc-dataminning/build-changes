import java.util.Map;

public class cqm extends bzw<cqg> {
   public cqm() {
      super(Map.of(chh.p, chi.a, chh.n, chi.b, chh.aV, chi.b, chh.aW, chi.b));
   }

   protected boolean a(asb $$0, cqg $$1) {
      return $$1.aH() && !$$1.bi() && $$1.at() == byr.a;
   }

   protected void a(asb $$0, cqg $$1, long $$2) {
      byf $$3 = $$1.ec().c(chh.p).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.l($$3.dt());
         fgc $$5 = null;
         if ($$4) {
            fgc $$6 = ciy.a($$1, 5, 5, $$3.dt());
            if ($$6 != null && cqi.a($$1, $$6) && $$3.h($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dY().h() ? cqi.a($$3, $$1.dY()) : a($$1, $$3);
         }

         $$1.ec().a(chh.n, new chk(iw.a((jq)$$5), 0.6F, 1));
      }
   }

   private static fgc a(cqg $$0, byf $$1) {
      fgc $$2 = $$1.dt().d($$0.dt());
      double $$3 = $$2.g() - azz.d($$0.dY().j(), 8.0, 4.0);
      fgc $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dt().e($$4);
   }
}

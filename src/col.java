import java.util.Map;

public class col extends byi<cof> {
   public col() {
      super(Map.of(cft.p, cfu.a, cft.n, cfu.b, cft.aV, cfu.b, cft.aW, cfu.b));
   }

   protected boolean a(arn $$0, cof $$1) {
      return $$1.aJ() && !$$1.bj() && $$1.aw() == bxd.a;
   }

   protected void a(arn $$0, cof $$1, long $$2) {
      bwr $$3 = $$1.eb().c(cft.p).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.l($$3.dt());
         fcu $$5 = null;
         if ($$4) {
            fcu $$6 = chk.a($$1, 5, 5, $$3.dt());
            if ($$6 != null && coh.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dY().h() ? coh.a($$3, $$1.dY()) : a($$1, $$3);
         }

         $$1.eb().a(cft.n, new cfw(jj.a((kc)$$5), 0.6F, 1));
      }
   }

   private static fcu a(cof $$0, bwr $$1) {
      fcu $$2 = $$1.dt().d($$0.dt());
      double $$3 = $$2.g() - azk.d($$0.dY().j(), 8.0, 4.0);
      fcu $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dt().e($$4);
   }
}

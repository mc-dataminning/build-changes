import java.util.Map;

public class cnz extends bxz<cnt> {
   public cnz() {
      super(Map.of(cfk.o, cfl.a, cfk.m, cfl.b, cfk.aU, cfl.b, cfk.aV, cfl.b));
   }

   protected boolean a(ash $$0, cnt $$1) {
      return $$1.aJ() && !$$1.bj() && $$1.aw() == bws.a;
   }

   protected void a(ash $$0, cnt $$1, long $$2) {
      bwg $$3 = $$1.ec().c(cfk.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.du());
         fby $$5 = null;
         if ($$4) {
            fby $$6 = chb.a($$1, 5, 5, $$3.du());
            if ($$6 != null && cnv.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dZ().h() ? cnv.a($$3, $$1.dZ()) : a($$1, $$3);
         }

         $$1.ec().a(cfk.m, new cfn(jh.a((ka)$$5), 0.6F, 1));
      }
   }

   private static fby a(cnt $$0, bwg $$1) {
      fby $$2 = $$1.du().d($$0.du());
      double $$3 = $$2.g() - bae.d($$0.dZ().j(), 8.0, 4.0);
      fby $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.du().e($$4);
   }
}

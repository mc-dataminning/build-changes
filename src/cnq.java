import java.util.Map;

public class cnq extends bxq<cnk> {
   public cnq() {
      super(Map.of(cfb.o, cfc.a, cfb.m, cfc.b, cfb.aU, cfc.b, cfb.aV, cfc.b));
   }

   protected boolean a(arx $$0, cnk $$1) {
      return $$1.aJ() && !$$1.bj() && $$1.aw() == bwj.a;
   }

   protected void a(arx $$0, cnk $$1, long $$2) {
      bvx $$3 = $$1.ec().c(cfb.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.du());
         fbr $$5 = null;
         if ($$4) {
            fbr $$6 = cgs.a($$1, 5, 5, $$3.du());
            if ($$6 != null && cnm.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dZ().h() ? cnm.a($$3, $$1.dZ()) : a($$1, $$3);
         }

         $$1.ec().a(cfb.m, new cfe(jh.a((ka)$$5), 0.6F, 1));
      }
   }

   private static fbr a(cnk $$0, bvx $$1) {
      fbr $$2 = $$1.du().d($$0.du());
      double $$3 = $$2.g() - azu.d($$0.dZ().j(), 8.0, 4.0);
      fbr $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.du().e($$4);
   }
}

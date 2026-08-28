import java.util.Map;

public class cpq extends bza<cpk> {
   public cpq() {
      super(Map.of(cgl.p, cgm.a, cgl.n, cgm.b, cgl.aV, cgm.b, cgl.aW, cgm.b));
   }

   protected boolean a(arq $$0, cpk $$1) {
      return $$1.aH() && !$$1.bh() && $$1.at() == bxv.a;
   }

   protected void a(arq $$0, cpk $$1, long $$2) {
      bxj $$3 = $$1.eb().c(cgl.p).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.l($$3.ds());
         ffc $$5 = null;
         if ($$4) {
            ffc $$6 = cic.a($$1, 5, 5, $$3.ds());
            if ($$6 != null && cpm.a($$1, $$6) && $$3.h($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dX().h() ? cpm.a($$3, $$1.dX()) : a($$1, $$3);
         }

         $$1.eb().a(cgl.n, new cgo(iv.a((jp)$$5), 0.6F, 1));
      }
   }

   private static ffc a(cpk $$0, bxj $$1) {
      ffc $$2 = $$1.ds().d($$0.ds());
      double $$3 = $$2.g() - azm.d($$0.dX().j(), 8.0, 4.0);
      ffc $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.ds().e($$4);
   }
}

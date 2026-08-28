import java.util.Map;

public class cpc extends byt<cow> {
   public cpc() {
      super(Map.of(cge.p, cgf.a, cge.n, cgf.b, cge.aV, cgf.b, cge.aW, cgf.b));
   }

   protected boolean a(arq $$0, cow $$1) {
      return $$1.aJ() && !$$1.bj() && $$1.aw() == bxo.a;
   }

   protected void a(arq $$0, cow $$1, long $$2) {
      bxc $$3 = $$1.eb().c(cge.p).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.l($$3.dt());
         fei $$5 = null;
         if ($$4) {
            fei $$6 = chv.a($$1, 5, 5, $$3.dt());
            if ($$6 != null && coy.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dY().h() ? coy.a($$3, $$1.dY()) : a($$1, $$3);
         }

         $$1.eb().a(cge.n, new cgh(iu.a((jo)$$5), 0.6F, 1));
      }
   }

   private static fei a(cow $$0, bxc $$1) {
      fei $$2 = $$1.dt().d($$0.dt());
      double $$3 = $$2.g() - azm.d($$0.dY().j(), 8.0, 4.0);
      fei $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dt().e($$4);
   }
}

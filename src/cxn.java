import java.util.List;

public class cxn extends ctx {
   public cxn(cvt.a $$0) {
      super($$0);
   }

   @Override
   public cvx o() {
      cvx $$0 = super.o();
      $$0.b(kt.P, new cxw(cxx.C));
      return $$0;
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      cxw $$4 = $$0.a(kt.P);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public xh c_(cvx $$0) {
      return $$0.a(kt.P, cxw.a).e().map($$0x -> xh.c(this.k + ".effect." + ((cxu)$$0x.a()).b())).orElseGet(() -> xh.c(this.k + ".effect.empty"));
   }
}

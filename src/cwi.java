public class cwi extends cxc {
   public cwi(dhj $$0, dhj $$1, cvk.a $$2) {
      super($$0, $$1, $$2, jj.a);
   }

   @Override
   public xd m(cvp $$0) {
      cys $$1 = $$0.a(kr.ab);
      return (xd)($$1 != null && $$1.c().isPresent() ? xd.a(this.a() + ".named", $$1.c().get()) : super.m($$0));
   }

   @Override
   public void l(cvp $$0) {
      cys $$1 = $$0.a(kr.ab);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kr.ab, $$1x), dtg.a);
      }
   }
}

public class cwq extends cxk {
   public cwq(dhy $$0, dhy $$1, cvt.a $$2) {
      super($$0, $$1, jl.a, $$2);
   }

   @Override
   public xh c_(cvx $$0) {
      cyu $$1 = $$0.a(kt.af);
      return (xh)($$1 != null && $$1.c().isPresent() ? xh.a(this.k + ".named", $$1.c().get()) : super.c_($$0));
   }

   @Override
   public void l(cvx $$0) {
      cyu $$1 = $$0.a(kt.af);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kt.af, $$1x), dtu.a);
      }
   }
}

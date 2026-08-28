public class cvd extends cvy {
   public cvd(dex $$0, dex $$1, cui.a $$2) {
      super($$0, $$1, $$2, je.a);
   }

   @Override
   public xo o(cun $$0) {
      cxp $$1 = $$0.a(km.U);
      return (xo)($$1 != null && $$1.c().isPresent() ? xo.a(this.a() + ".named", $$1.c().get()) : super.o($$0));
   }

   @Override
   public void n(cun $$0) {
      cxp $$1 = $$0.a(km.U);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(km.U, $$1x), dqr.a);
      }
   }
}

public class cux extends cwa {
   public cux(dfc $$0, dfc $$1, cuc.a $$2) {
      super($$0, $$1, $$2, iw.a);
   }

   @Override
   public xe o(cuh $$0) {
      cxs $$1 = $$0.a(ke.U);
      return (xe)($$1 != null && $$1.c().isPresent() ? xe.a(this.a() + ".named", $$1.c().get()) : super.o($$0));
   }

   @Override
   public void n(cuh $$0) {
      cxs $$1 = $$0.a(ke.U);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(ke.U, $$1x), drt.a);
      }
   }
}

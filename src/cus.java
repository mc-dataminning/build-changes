public class cus extends cvn {
   public cus(dfh $$0, dfh $$1, ctx.a $$2) {
      super($$0, $$1, $$2, jf.a);
   }

   @Override
   public wu n(cuc $$0) {
      cxd $$1 = $$0.a(kn.V);
      return (wu)($$1 != null && $$1.c().isPresent() ? wu.a(this.a() + ".named", $$1.c().get()) : super.n($$0));
   }

   @Override
   public void m(cuc $$0) {
      cxd $$1 = $$0.a(kn.V);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kn.V, $$1x), drc.a);
      }
   }
}

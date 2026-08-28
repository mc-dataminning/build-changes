public class cut extends cvo {
   public cut(dfi $$0, dfi $$1, cty.a $$2) {
      super($$0, $$1, $$2, jf.a);
   }

   @Override
   public wu n(cud $$0) {
      cxe $$1 = $$0.a(kn.V);
      return (wu)($$1 != null && $$1.c().isPresent() ? wu.a(this.a() + ".named", $$1.c().get()) : super.n($$0));
   }

   @Override
   public void m(cud $$0) {
      cxe $$1 = $$0.a(kn.V);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kn.V, $$1x), drd.a);
      }
   }
}

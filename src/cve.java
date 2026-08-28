public class cve extends cvz {
   public cve(dey $$0, dey $$1, cuj.a $$2) {
      super($$0, $$1, $$2, je.a);
   }

   @Override
   public xo o(cuo $$0) {
      cxq $$1 = $$0.a(km.V);
      return (xo)($$1 != null && $$1.c().isPresent() ? xo.a(this.a() + ".named", $$1.c().get()) : super.o($$0));
   }

   @Override
   public void n(cuo $$0) {
      cxq $$1 = $$0.a(km.V);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(km.V, $$1x), dqs.a);
      }
   }
}

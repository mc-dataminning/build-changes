public class cwu extends cxo {
   public cwu(die $$0, die $$1, cvx.a $$2) {
      super($$0, $$1, jm.a, $$2);
   }

   @Override
   public xi a(cwb $$0) {
      cza $$1 = $$0.a(ku.ag);
      return (xi)($$1 != null && $$1.c().isPresent() ? xi.a(this.k + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(cwb $$0) {
      cza $$1 = $$0.a(ku.ag);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(ku.ag, $$1x), dua.a);
      }
   }
}

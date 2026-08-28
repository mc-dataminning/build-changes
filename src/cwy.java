public class cwy extends cxs {
   public cwy(dij $$0, dij $$1, cwb.a $$2) {
      super($$0, $$1, jm.a, $$2);
   }

   @Override
   public xl a(cwf $$0) {
      cze $$1 = $$0.a(ku.ag);
      return (xl)($$1 != null && $$1.c().isPresent() ? xl.a(this.k + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(cwf $$0) {
      cze $$1 = $$0.a(ku.ag);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(ku.ag, $$1x), duf.a);
      }
   }
}

public class cxf extends cxz {
   public cxf(diq $$0, diq $$1, cwi.a $$2) {
      super($$0, $$1, jm.a, $$2);
   }

   @Override
   public xj a(cwm $$0) {
      czl $$1 = $$0.a(ku.ag);
      return (xj)($$1 != null && $$1.c().isPresent() ? xj.a(this.k + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(cwm $$0) {
      czl $$1 = $$0.a(ku.ag);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(ku.ag, $$1x), dum.a);
      }
   }
}

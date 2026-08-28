public class cyd extends cyx {
   public cyd(dke $$0, dke $$1, cxg.a $$2) {
      super($$0, $$1, jm.a, $$2);
   }

   @Override
   public xv a(cxk $$0) {
      daj $$1 = $$0.a(ku.ag);
      return (xv)($$1 != null && $$1.c().isPresent() ? xv.a(this.k + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(cxk $$0) {
      daj $$1 = $$0.a(ku.ag);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(ku.ag, $$1x), dwe.a);
      }
   }
}

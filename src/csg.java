public class csg extends cta {
   public csg(dch $$0, dch $$1, crn.a $$2) {
      super($$0, $$1, $$2, ij.a);
   }

   @Override
   public wi o(crs $$0) {
      cup $$1 = $$0.a(jr.L);
      return (wi)($$1 != null && $$1.c().isPresent() ? wi.a(this.a() + ".named", $$1.c().get()) : super.o($$0));
   }

   @Override
   public void n(crs $$0) {
      cup $$1 = $$0.a(jr.L);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(jr.L, $$1x), doa.a);
      }
   }
}

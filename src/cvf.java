public class cvf extends cwa {
   public cvf(dez $$0, dez $$1, cuk.a $$2) {
      super($$0, $$1, $$2, je.a);
   }

   @Override
   public xp o(cup $$0) {
      cxr $$1 = $$0.a(km.V);
      return (xp)($$1 != null && $$1.c().isPresent() ? xp.a(this.a() + ".named", $$1.c().get()) : super.o($$0));
   }

   @Override
   public void n(cup $$0) {
      cxr $$1 = $$0.a(km.V);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(km.V, $$1x), dqt.a);
      }
   }
}

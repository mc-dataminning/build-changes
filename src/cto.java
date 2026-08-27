public class cto extends cui {
   public cto(dde $$0, dde $$1, csu.a $$2) {
      super($$0, $$1, $$2, is.a);
   }

   @Override
   public wu o(csz $$0) {
      cvz $$1 = $$0.a(ka.S);
      return (wu)($$1 != null && $$1.c().isPresent() ? wu.a(this.a() + ".named", $$1.c().get()) : super.o($$0));
   }

   @Override
   public void n(csz $$0) {
      cvz $$1 = $$0.a(ka.S);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(ka.S, $$1x), doy.a);
      }
   }
}

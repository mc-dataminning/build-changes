public class daq extends dbj {
   public daq(dnc $$0, dnc $$1, czu.a $$2) {
      super($$0, $$1, jb.a, $$2);
   }

   @Override
   public xa a(czy $$0) {
      dcy $$1 = $$0.a(kk.ak);
      return (xa)($$1 != null && $$1.c().isPresent() ? xa.a(this.n + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(czy $$0) {
      dcy $$1 = $$0.a(kk.ak);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kk.ak, $$1x), dzs.a);
      }
   }
}

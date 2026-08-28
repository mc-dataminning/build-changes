public class dac extends dav {
   public dac(dmm $$0, dmm $$1, czg.a $$2) {
      super($$0, $$1, jb.a, $$2);
   }

   @Override
   public wy a(czk $$0) {
      dck $$1 = $$0.a(kk.ak);
      return (wy)($$1 != null && $$1.c().isPresent() ? wy.a(this.n + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(czk $$0) {
      dck $$1 = $$0.a(kk.ak);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kk.ak, $$1x), dzc.a);
      }
   }
}

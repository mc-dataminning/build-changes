public class cvi extends cwc {
   public cvi(dfw $$0, dfw $$1, cuj.a $$2) {
      super($$0, $$1, $$2, ji.a);
   }

   @Override
   public wy n(cuo $$0) {
      cxs $$1 = $$0.a(kq.W);
      return (wy)($$1 != null && $$1.c().isPresent() ? wy.a(this.a() + ".named", $$1.c().get()) : super.n($$0));
   }

   @Override
   public void m(cuo $$0) {
      cxs $$1 = $$0.a(kq.W);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kq.W, $$1x), drs.a);
      }
   }
}

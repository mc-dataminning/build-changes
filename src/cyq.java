public class cyq extends czj {
   public cyq(dku $$0, dku $$1, cxu.a $$2) {
      super($$0, $$1, jo.a, $$2);
   }

   @Override
   public wv a(cxy $$0) {
      dau $$1 = $$0.a(kx.ai);
      return (wv)($$1 != null && $$1.c().isPresent() ? wv.a(this.m + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(cxy $$0) {
      dau $$1 = $$0.a(kx.ai);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kx.ai, $$1x), dxb.a);
      }
   }
}

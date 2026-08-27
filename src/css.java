public class css extends ctm {
   public css(dcv $$0, dcv $$1, cry.a $$2) {
      super($$0, $$1, $$2, ir.a);
   }

   @Override
   public ws o(csd $$0) {
      cvd $$1 = $$0.a(jz.L);
      return (ws)($$1 != null && $$1.c().isPresent() ? ws.a(this.a() + ".named", $$1.c().get()) : super.o($$0));
   }

   @Override
   public void n(csd $$0) {
      cvd $$1 = $$0.a(jz.L);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(jz.L, $$1x), dop.a);
      }
   }
}

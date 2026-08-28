public class czv extends dao {
   public czv(dmf $$0, dmf $$1, cyz.a $$2) {
      super($$0, $$1, ja.a, $$2);
   }

   @Override
   public wy a(czd $$0) {
      dcd $$1 = $$0.a(kj.ak);
      return (wy)($$1 != null && $$1.c().isPresent() ? wy.a(this.n + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(czd $$0) {
      dcd $$1 = $$0.a(kj.ak);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kj.ak, $$1x), dyv.a);
      }
   }
}

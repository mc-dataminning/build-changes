public class cxz extends cyt {
   public cxz(dke $$0, dke $$1, cxd.a $$2) {
      super($$0, $$1, jn.a, $$2);
   }

   @Override
   public wp a(cxh $$0) {
      dae $$1 = $$0.a(kv.ai);
      return (wp)($$1 != null && $$1.c().isPresent() ? wp.a(this.m + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(cxh $$0) {
      dae $$1 = $$0.a(kv.ai);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kv.ai, $$1x), dwh.a);
      }
   }
}

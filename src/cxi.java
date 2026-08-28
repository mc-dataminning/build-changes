public class cxi extends cyc {
   public cxi(djm $$0, djm $$1, cwl.a $$2) {
      super($$0, $$1, jn.a, $$2);
   }

   @Override
   public wp a(cwp $$0) {
      czo $$1 = $$0.a(kv.ag);
      return (wp)($$1 != null && $$1.c().isPresent() ? wp.a(this.l + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(cwp $$0) {
      czo $$1 = $$0.a(kv.ag);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kv.ag, $$1x), dvo.a);
      }
   }
}

public class cxh extends cyb {
   public cxh(djl $$0, djl $$1, cwk.a $$2) {
      super($$0, $$1, jn.a, $$2);
   }

   @Override
   public wp a(cwo $$0) {
      czn $$1 = $$0.a(kv.ag);
      return (wp)($$1 != null && $$1.c().isPresent() ? wp.a(this.l + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(cwo $$0) {
      czn $$1 = $$0.a(kv.ag);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kv.ag, $$1x), dvn.a);
      }
   }
}

public class cxg extends cya {
   public cxg(djk $$0, djk $$1, cwj.a $$2) {
      super($$0, $$1, jn.a, $$2);
   }

   @Override
   public wo a(cwn $$0) {
      czm $$1 = $$0.a(kv.ag);
      return (wo)($$1 != null && $$1.c().isPresent() ? wo.a(this.l + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(cwn $$0) {
      czm $$1 = $$0.a(kv.ag);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kv.ag, $$1x), dvm.a);
      }
   }
}

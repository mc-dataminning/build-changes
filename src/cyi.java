public class cyi extends czc {
   public cyi(dkm $$0, dkm $$1, cxl.a $$2) {
      super($$0, $$1, jm.a, $$2);
   }

   @Override
   public xv a(cxp $$0) {
      dao $$1 = $$0.a(ku.ag);
      return (xv)($$1 != null && $$1.c().isPresent() ? xv.a(this.l + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(cxp $$0) {
      dao $$1 = $$0.a(ku.ag);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(ku.ag, $$1x), dwm.a);
      }
   }
}

public class cxz extends cyt {
   public cxz(dkd $$0, dkd $$1, cxc.a $$2) {
      super($$0, $$1, jm.a, $$2);
   }

   @Override
   public xk a(cxg $$0) {
      daf $$1 = $$0.a(ku.ag);
      return (xk)($$1 != null && $$1.c().isPresent() ? xk.a(this.l + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(cxg $$0) {
      daf $$1 = $$0.a(ku.ag);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(ku.ag, $$1x), dwf.a);
      }
   }
}

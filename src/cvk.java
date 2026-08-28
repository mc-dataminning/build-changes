public class cvk extends cwe {
   public cvk(dfy $$0, dfy $$1, cul.a $$2) {
      super($$0, $$1, $$2, ji.a);
   }

   @Override
   public wz n(cuq $$0) {
      cxu $$1 = $$0.a(kq.W);
      return (wz)($$1 != null && $$1.c().isPresent() ? wz.a(this.a() + ".named", $$1.c().get()) : super.n($$0));
   }

   @Override
   public void m(cuq $$0) {
      cxu $$1 = $$0.a(kq.W);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kq.W, $$1x), dru.a);
      }
   }
}

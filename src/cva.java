public class cva extends cvv {
   public cva(deu $$0, deu $$1, cuf.a $$2) {
      super($$0, $$1, $$2, je.a);
   }

   @Override
   public xl o(cuk $$0) {
      cxm $$1 = $$0.a(km.U);
      return (xl)($$1 != null && $$1.c().isPresent() ? xl.a(this.a() + ".named", $$1.c().get()) : super.o($$0));
   }

   @Override
   public void n(cuk $$0) {
      cxm $$1 = $$0.a(km.U);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(km.U, $$1x), dqo.a);
      }
   }
}

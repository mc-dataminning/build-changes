public class cug extends cvb {
   public cug(dea $$0, dea $$1, ctl.a $$2) {
      super($$0, $$1, $$2, it.a);
   }

   @Override
   public wx o(ctq $$0) {
      cws $$1 = $$0.a(kb.U);
      return (wx)($$1 != null && $$1.c().isPresent() ? wx.a(this.a() + ".named", $$1.c().get()) : super.o($$0));
   }

   @Override
   public void n(ctq $$0) {
      cws $$1 = $$0.a(kb.U);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kb.U, $$1x), dpu.a);
      }
   }
}

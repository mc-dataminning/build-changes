public class crx extends csr {
   public crx(dby $$0, dby $$1, cre.a $$2) {
      super($$0, $$1, $$2, ih.a);
   }

   @Override
   public wg o(crj $$0) {
      cug $$1 = $$0.a(jp.L);
      return (wg)($$1 != null ? wg.a(this.a() + ".named", $$1.c()) : super.o($$0));
   }

   @Override
   public void n(crj $$0) {
      cug $$1 = $$0.a(jp.L);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(jp.L, $$1x), dnr.a);
      }
   }
}

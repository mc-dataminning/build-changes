public class crd extends cpn {
   private static final sw a = sw.c("container.crafting");

   protected crd(dca.d $$0) {
      super($$0);
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$1.B) {
         return bdx.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(amr.an);
         return bdx.b;
      }
   }

   @Override
   public bea b(dcb $$0, cmm $$1, gu $$2) {
      return new bef(($$2x, $$3, $$4) -> new cbu($$2x, $$3, cbq.a($$1, $$2)), a);
   }
}

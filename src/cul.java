public class cul extends csv {
   private static final tl a = tl.c("container.crafting");

   protected cul(dfi.d $$0) {
      super($$0);
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.B) {
         return bgy.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apn.an);
         return bgy.b;
      }
   }

   @Override
   public bhb b(dfj $$0, cpv $$1, gw $$2) {
      return new bhg(($$2x, $$3, $$4) -> new cfa($$2x, $$3, cew.a($$1, $$2)), a);
   }
}

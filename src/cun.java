public class cun extends csx {
   private static final tn a = tn.c("container.crafting");

   protected cun(dfk.d $$0) {
      super($$0);
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.B) {
         return bha.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(app.an);
         return bha.b;
      }
   }

   @Override
   public bhd b(dfl $$0, cpx $$1, gw $$2) {
      return new bhi(($$2x, $$3, $$4) -> new cfc($$2x, $$3, cey.a($$1, $$2)), a);
   }
}

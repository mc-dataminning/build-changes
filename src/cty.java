public class cty extends cru {
   private final csl a;

   protected cty(csl $$0, dey.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      this.a($$0, (cpm)$$1, $$2);
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.a.n().a(c, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$1 == ha.a && !$$0.a($$3, $$4)) {
         return csm.a.n();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(c)) {
            $$3.a($$4, ead.c, ead.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}

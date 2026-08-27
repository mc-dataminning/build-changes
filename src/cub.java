public class cub extends cry {
   private final csm b;

   protected cub(csm $$0, dez.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      this.a($$0, (cpn)$$1, $$2);
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.b.n().a(c, Boolean.valueOf(false)).a(a, $$0.c(a)), 2);
      }
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$1.g() == $$0.c(a) && !$$0.a($$3, $$4)) {
         return csn.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eae.c, eae.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}

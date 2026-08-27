public class ctz extends crw {
   private final csl d;
   protected static final float a = 6.0F;
   protected static final ehw b = csl.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   protected ctz(csl $$0, dey.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      this.a($$0, (cpm)$$1, $$2);
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.d.n().a(c, Boolean.valueOf(false)), 2);
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

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return b;
   }
}

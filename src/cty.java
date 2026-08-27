public class cty extends crv {
   private final csk d;
   protected static final float a = 6.0F;
   protected static final ehy b = csk.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   protected cty(csk $$0, dex.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      this.a($$0, (cpl)$$1, $$2);
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.d.n().a(c, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$1 == hb.a && !$$0.a($$3, $$4)) {
         return csl.a.n();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(c)) {
            $$3.a($$4, eac.c, eac.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return b;
   }
}

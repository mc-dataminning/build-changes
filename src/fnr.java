public class fnr implements fnd.a {
   private final enn a;

   public fnr(enn $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
      gu $$5 = this.a.t.di();
      cmp $$6 = this.a.t.dI();

      for (gu $$7 : gu.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         dxe $$8 = $$6.b_($$7);
         if ($$8.a(anb.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            fnd.a(
               $$0,
               $$1,
               new eed(
                     (double)((float)$$7.u() + 0.01F),
                     (double)((float)$$7.v() + 0.01F),
                     (double)((float)$$7.w() + 0.01F),
                     (double)((float)$$7.u() + 0.99F),
                     $$9,
                     (double)((float)$$7.w() + 0.99F)
                  )
                  .d(-$$2, -$$3, -$$4),
               0.0F,
               1.0F,
               0.0F,
               0.15F
            );
         }
      }

      for (gu $$10 : gu.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         dxe $$11 = $$6.b_($$10);
         if ($$11.a(anb.a)) {
            fnd.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}

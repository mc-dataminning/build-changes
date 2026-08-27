public class fri implements fqu.a {
   private final eqm a;

   public fri(eqm $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elg $$0, fnl $$1, double $$2, double $$3, double $$4) {
      gu $$5 = this.a.v.dk();
      cpp $$6 = this.a.v.dK();

      for (gu $$7 : gu.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         ead $$8 = $$6.b_($$7);
         if ($$8.a(apq.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            fqu.a(
               $$0,
               $$1,
               new egz(
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
         ead $$11 = $$6.b_($$10);
         if ($$11.a(apq.a)) {
            fqu.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}

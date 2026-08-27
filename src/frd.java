public class frd implements fqp.a {
   private final eqn a;

   public frd(eqn $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elh $$0, fng $$1, double $$2, double $$3, double $$4) {
      gv $$5 = this.a.t.dk();
      cpn $$6 = this.a.t.dK();

      for (gv $$7 : gv.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         eab $$8 = $$6.b_($$7);
         if ($$8.a(apo.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            fqp.a(
               $$0,
               $$1,
               new eha(
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

      for (gv $$10 : gv.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         eab $$11 = $$6.b_($$10);
         if ($$11.a(apo.a)) {
            fqp.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}

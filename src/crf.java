public class crf extends cqh {
   public crf(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bnd a(cqm $$0, ciu $$1, bpp $$2, bnc $$3) {
      if ($$2 instanceof bqe $$4 && $$2.bA() && !$$4.i() && $$4.f()) {
         if (!$$1.dM().B) {
            $$4.a(atz.g);
            $$2.dM().a($$2, drp.v, $$2.dk());
            $$0.h(1);
         }

         return bnd.a($$1.dM().B);
      }

      return bnd.d;
   }
}

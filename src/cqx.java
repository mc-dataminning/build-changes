public class cqx extends cqh {
   public cqx(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bnd a(cqm $$0, ciu $$1, bpp $$2, bnc $$3) {
      if ($$0.B() && !($$2 instanceof ciu)) {
         if (!$$1.dM().B && $$2.bA()) {
            $$2.b($$0.z());
            if ($$2 instanceof bpr) {
               ((bpr)$$2).fS();
            }

            $$0.h(1);
         }

         return bnd.a($$1.dM().B);
      } else {
         return bnd.d;
      }
   }
}

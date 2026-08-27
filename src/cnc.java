public class cnc extends cmm {
   public cnc(cmm.a $$0) {
      super($$0);
   }

   @Override
   public bjv a(cmr $$0, cfb $$1, bmf $$2, bju $$3) {
      if ($$0.A() && !($$2 instanceof cfb)) {
         if (!$$1.dM().B && $$2.bx()) {
            $$2.b($$0.y());
            if ($$2 instanceof bmh) {
               ((bmh)$$2).fJ();
            }

            $$0.h(1);
         }

         return bjv.a($$1.dM().B);
      } else {
         return bjv.d;
      }
   }
}

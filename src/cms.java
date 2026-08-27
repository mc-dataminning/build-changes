public class cms extends cmc {
   public cms(cmc.a $$0) {
      super($$0);
   }

   @Override
   public bjl a(cmh $$0, cer $$1, blv $$2, bjk $$3) {
      if ($$0.A() && !($$2 instanceof cer)) {
         if (!$$1.dM().B && $$2.bx()) {
            $$2.b($$0.y());
            if ($$2 instanceof blx) {
               ((blx)$$2).fJ();
            }

            $$0.h(1);
         }

         return bjl.a($$1.dM().B);
      } else {
         return bjl.d;
      }
   }
}

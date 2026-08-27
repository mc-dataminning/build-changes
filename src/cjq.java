public class cjq extends cja {
   public cjq(cja.a $$0) {
      super($$0);
   }

   @Override
   public bgy a(cjf $$0, cbu $$1, bjg $$2, bgx $$3) {
      if ($$0.A() && !($$2 instanceof cbu)) {
         if (!$$1.dL().B && $$2.bw()) {
            $$2.b($$0.y());
            if ($$2 instanceof bji) {
               ((bji)$$2).fI();
            }

            $$0.h(1);
         }

         return bgy.a($$1.dL().B);
      } else {
         return bgy.d;
      }
   }
}

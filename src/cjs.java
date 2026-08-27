public class cjs extends cjc {
   public cjs(cjc.a $$0) {
      super($$0);
   }

   @Override
   public bha a(cjh $$0, cbw $$1, bji $$2, bgz $$3) {
      if ($$0.A() && !($$2 instanceof cbw)) {
         if (!$$1.dL().B && $$2.bv()) {
            $$2.b($$0.y());
            if ($$2 instanceof bjk) {
               ((bjk)$$2).fI();
            }

            $$0.h(1);
         }

         return bha.a($$1.dL().B);
      } else {
         return bha.d;
      }
   }
}

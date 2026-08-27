public class cgk extends cfu {
   public cgk(cfu.a $$0) {
      super($$0);
   }

   @Override
   public bdx a(cfz $$0, byo $$1, bfz $$2, bdw $$3) {
      if ($$0.A() && !($$2 instanceof byo)) {
         if (!$$1.dI().B && $$2.bs()) {
            $$2.b($$0.y());
            if ($$2 instanceof bgb) {
               ((bgb)$$2).fF();
            }

            $$0.h(1);
         }

         return bdx.a($$1.dI().B);
      } else {
         return bdx.d;
      }
   }
}

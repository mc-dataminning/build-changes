public class cgs extends cfu {
   public cgs(cfu.a $$0) {
      super($$0);
   }

   @Override
   public bdx a(cfz $$0, byo $$1, bfz $$2, bdw $$3) {
      if ($$2 instanceof bgq && $$2.bs()) {
         bgq $$4 = (bgq)$$2;
         if (!$$4.i() && $$4.g()) {
            if (!$$1.dI().B) {
               $$4.a(ami.g);
               $$2.dI().a($$2, dgl.w, $$2.dg());
               $$0.h(1);
            }

            return bdx.a($$1.dI().B);
         }
      }

      return bdx.d;
   }
}

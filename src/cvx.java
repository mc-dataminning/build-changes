public class cvx<T extends bul & bve> extends cwi {
   private final bus<T> a;
   private final int b;

   public cvx(bus<T> $$0, int $$1, cwi.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bsk a(dfm $$0, cou $$1, bsj $$2) {
      cwm $$3 = $$1.b($$2);
      if ($$0.C) {
         return bsk.e;
      } else {
         bul $$4 = $$1.dl();
         if ($$1.bZ() && $$4 instanceof bve $$5 && $$4.aq() == this.a && $$5.a()) {
            but $$6 = bvh.d($$2);
            cwm $$7 = $$3.a(this.b, cwq.rm, $$1, $$6);
            return bsk.b.a($$7);
         }

         $$1.b(awx.c.b(this));
         return bsk.e;
      }
   }
}

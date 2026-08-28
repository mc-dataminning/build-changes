public class cyj<T extends bwd & bwz> extends cyu {
   private final bwm<T> a;
   private final int b;

   public cyj(bwm<T> $$0, int $$1, cyu.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bub a(div $$0, cqy $$1, bua $$2) {
      cyy $$3 = $$1.b($$2);
      if ($$0.C) {
         return bub.e;
      } else {
         bwd $$4 = $$1.dl();
         if ($$1.bZ() && $$4 instanceof bwz $$5 && $$4.aq() == this.a && $$5.a()) {
            bwn $$6 = bxc.d($$2);
            cyy $$7 = $$3.a(this.b, czc.rY, $$1, $$6);
            return bub.b.a($$7);
         }

         $$1.b(awx.c.b(this));
         return bub.e;
      }
   }
}

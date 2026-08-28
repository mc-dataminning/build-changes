public class cwz<T extends bvj & bwc> extends cxk {
   private final bvq<T> a;
   private final int b;

   public cwz(bvq<T> $$0, int $$1, cxk.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bti a(dhh $$0, cpw $$1, bth $$2) {
      cxo $$3 = $$1.b($$2);
      if ($$0.C) {
         return bti.e;
      } else {
         bvj $$4 = $$1.dm();
         if ($$1.bZ() && $$4 instanceof bwc $$5 && $$4.aq() == this.a && $$5.a()) {
            bvr $$6 = bwf.d($$2);
            cxo $$7 = $$3.a(this.b, cxs.rJ, $$1, $$6);
            return bti.b.a($$7);
         }

         $$1.b(axp.c.b(this));
         return bti.e;
      }
   }
}

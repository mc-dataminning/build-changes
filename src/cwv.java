public class cwv<T extends bvf & bvy> extends cxg {
   private final bvm<T> a;
   private final int b;

   public cwv(bvm<T> $$0, int $$1, cxg.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bte a(dha $$0, cps $$1, btd $$2) {
      cxk $$3 = $$1.b($$2);
      if ($$0.C) {
         return bte.e;
      } else {
         bvf $$4 = $$1.dl();
         if ($$1.bZ() && $$4 instanceof bvy $$5 && $$4.aq() == this.a && $$5.a()) {
            bvn $$6 = bwb.d($$2);
            cxk $$7 = $$3.a(this.b, cxo.rJ, $$1, $$6);
            return bte.b.a($$7);
         }

         $$1.b(axp.c.b(this));
         return bte.e;
      }
   }
}

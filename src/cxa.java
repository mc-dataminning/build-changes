public class cxa<T extends bvk & bwd> extends cxl {
   private final bvr<T> a;
   private final int b;

   public cxa(bvr<T> $$0, int $$1, cxl.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public btj a(dhi $$0, cpx $$1, bti $$2) {
      cxp $$3 = $$1.b($$2);
      if ($$0.C) {
         return btj.e;
      } else {
         bvk $$4 = $$1.dm();
         if ($$1.bZ() && $$4 instanceof bwd $$5 && $$4.aq() == this.a && $$5.a()) {
            bvs $$6 = bwg.d($$2);
            cxp $$7 = $$3.a(this.b, cxt.rJ, $$1, $$6);
            return btj.b.a($$7);
         }

         $$1.b(axp.c.b(this));
         return btj.e;
      }
   }
}

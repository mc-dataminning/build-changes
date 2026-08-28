public class cxj<T extends bvs & bwo> extends cxu {
   private final bwb<T> a;
   private final int b;

   public cxj(bwb<T> $$0, int $$1, cxu.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      cxy $$3 = $$1.b($$2);
      if ($$0.C) {
         return btq.e;
      } else {
         bvs $$4 = $$1.dl();
         if ($$1.bZ() && $$4 instanceof bwo $$5 && $$4.aq() == this.a && $$5.a()) {
            bwc $$6 = bwr.d($$2);
            cxy $$7 = $$3.a(this.b, cyc.rW, $$1, $$6);
            return btq.b.a($$7);
         }

         $$1.b(awu.c.b(this));
         return btq.e;
      }
   }
}

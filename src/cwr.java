public class cwr<T extends bvb & bvu> extends cxc {
   private final bvi<T> a;
   private final int b;

   public cwr(bvi<T> $$0, int $$1, cxc.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = $$1.b($$2);
      if ($$0.C) {
         return bta.e;
      } else {
         bvb $$4 = $$1.dm();
         if ($$1.bZ() && $$4 instanceof bvu $$5 && $$4.aq() == this.a && $$5.a()) {
            bvj $$6 = bvx.d($$2);
            cxg $$7 = $$3.a(this.b, cxk.rS, $$1, $$6);
            return bta.b.a($$7);
         }

         $$1.b(axf.c.b(this));
         return bta.e;
      }
   }
}

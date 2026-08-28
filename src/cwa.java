public class cwa<T extends buk & bvd> extends cwl {
   private final bur<T> a;
   private final int b;

   public cwa(bur<T> $$0, int $$1, cwl.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bsj a(dgi $$0, cox $$1, bsi $$2) {
      cwp $$3 = $$1.b($$2);
      if ($$0.C) {
         return bsj.e;
      } else {
         buk $$4 = $$1.dm();
         if ($$1.bZ() && $$4 instanceof bvd $$5 && $$4.aq() == this.a && $$5.a()) {
            bus $$6 = bvg.d($$2);
            cwp $$7 = $$3.a(this.b, cwt.rS, $$1, $$6);
            return bsj.b.a($$7);
         }

         $$1.b(awk.c.b(this));
         return bsj.e;
      }
   }
}

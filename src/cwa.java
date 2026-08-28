public class cwa<T extends bul & bve> extends cwl {
   private final bus<T> a;
   private final int b;

   public cwa(bus<T> $$0, int $$1, cwl.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bsk a(dgi $$0, cox $$1, bsj $$2) {
      cwp $$3 = $$1.b($$2);
      if ($$0.C) {
         return bsk.e;
      } else {
         bul $$4 = $$1.dl();
         if ($$1.bZ() && $$4 instanceof bve $$5 && $$4.aq() == this.a && $$5.a()) {
            but $$6 = bvh.d($$2);
            cwp $$7 = $$3.a(this.b, cwt.rS, $$1, $$6);
            return bsk.b.a($$7);
         }

         $$1.b(awk.c.b(this));
         return bsk.e;
      }
   }
}

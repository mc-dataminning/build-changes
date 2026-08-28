public class cvy<T extends buj & bvc> extends cwj {
   private final buq<T> a;
   private final int b;

   public cvy(buq<T> $$0, int $$1, cwj.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      cwn $$3 = $$1.b($$2);
      if ($$0.C) {
         return bsi.e;
      } else {
         buj $$4 = $$1.dm();
         if ($$1.bZ() && $$4 instanceof bvc $$5 && $$4.aq() == this.a && $$5.a()) {
            bur $$6 = bvf.d($$2);
            cwn $$7 = $$3.a(this.b, cwr.rS, $$1, $$6);
            return bsi.b.a($$7);
         }

         $$1.b(awj.c.b(this));
         return bsi.e;
      }
   }
}

public class cyd<T extends bwa & bww> extends cyo {
   private final bwj<T> a;
   private final int b;

   public cyd(bwj<T> $$0, int $$1, cyo.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bty a(dip $$0, cqs $$1, btx $$2) {
      cys $$3 = $$1.b($$2);
      if ($$0.C) {
         return bty.e;
      } else {
         bwa $$4 = $$1.dl();
         if ($$1.bZ() && $$4 instanceof bww $$5 && $$4.aq() == this.a && $$5.a()) {
            bwk $$6 = bwz.d($$2);
            cys $$7 = $$3.a(this.b, cyw.rW, $$1, $$6);
            return bty.b.a($$7);
         }

         $$1.b(awv.c.b(this));
         return bty.e;
      }
   }
}

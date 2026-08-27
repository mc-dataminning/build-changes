public class ccl extends cbi {
   public ccl(blj<? extends ccl> $$0, csy $$1) {
      super($$0, $$1);
   }

   public static boolean a(blj<ccl> $$0, ctn $$1, blz $$2, hv $$3, auf $$4) {
      hv $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(cwb.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (blz.a($$2) || $$1.g($$5.d()));
   }

   @Override
   protected arb y() {
      return arc.yp;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.yr;
   }

   @Override
   protected arb n_() {
      return arc.yq;
   }

   @Override
   arb w() {
      return arc.ys;
   }

   @Override
   protected cex b(cmh $$0, float $$1) {
      cex $$2 = super.b($$0, $$1);
      if ($$2 instanceof cez) {
         ((cez)$$2).a(new bks(bku.b, 600));
      }

      return $$2;
   }
}

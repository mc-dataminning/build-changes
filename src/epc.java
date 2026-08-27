import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class epc extends epo {
   protected epc(epe $$0) {
      super($$0);
   }

   @Override
   protected DoubleList a(ih.a $$0) {
      return new epb(this.a.c($$0));
   }

   @Override
   protected int a(ih.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return awm.a(awm.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

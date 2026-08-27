import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class eqa extends eqm {
   protected eqa(eqc $$0) {
      super($$0);
   }

   @Override
   protected DoubleList a(ih.a $$0) {
      return new epz(this.a.c($$0));
   }

   @Override
   protected int a(ih.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return aww.a(aww.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

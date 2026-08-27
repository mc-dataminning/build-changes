import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class ehu extends eig {
   protected ehu(ehw $$0) {
      super($$0);
   }

   @Override
   protected DoubleList a(hc.a $$0) {
      return new eht(this.a.c($$0));
   }

   @Override
   protected int a(hc.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return arx.a(arx.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

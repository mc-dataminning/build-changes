import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class eyl extends eyx {
   protected eyl(eyn $$0) {
      super($$0);
   }

   @Override
   public DoubleList a(jj.a $$0) {
      return new eyk(this.a.c($$0));
   }

   @Override
   protected int a(jj.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return azc.a(azc.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

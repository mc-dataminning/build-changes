import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class ewm extends ewy {
   protected ewm(ewo $$0) {
      super($$0);
   }

   @Override
   public DoubleList a(jf.a $$0) {
      return new ewl(this.a.c($$0));
   }

   @Override
   protected int a(jf.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return ayg.a(ayg.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

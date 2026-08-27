import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class eho extends eia {
   protected eho(ehq $$0) {
      super($$0);
   }

   @Override
   protected DoubleList a(ha.a $$0) {
      return new ehn(this.a.c($$0));
   }

   @Override
   protected int a(ha.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return asb.a(asb.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

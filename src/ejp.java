import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class ejp extends ekb {
   protected ejp(ejr $$0) {
      super($$0);
   }

   @Override
   protected DoubleList a(hx.a $$0) {
      return new ejo(this.a.c($$0));
   }

   @Override
   protected int a(hx.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return ati.a(ati.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

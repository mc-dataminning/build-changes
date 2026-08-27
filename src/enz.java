import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class enz extends eol {
   protected enz(eob $$0) {
      super($$0);
   }

   @Override
   protected DoubleList a(ie.a $$0) {
      return new eny(this.a.c($$0));
   }

   @Override
   protected int a(ie.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return awh.a(awh.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

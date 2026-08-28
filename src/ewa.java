import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class ewa extends ewm {
   protected ewa(ewc $$0) {
      super($$0);
   }

   @Override
   protected DoubleList a(je.a $$0) {
      return new evz(this.a.c($$0));
   }

   @Override
   protected int a(je.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return ayz.a(ayz.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

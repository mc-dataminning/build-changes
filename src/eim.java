import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class eim extends eiy {
   protected eim(eio $$0) {
      super($$0);
   }

   @Override
   protected DoubleList a(hx.a $$0) {
      return new eil(this.a.c($$0));
   }

   @Override
   protected int a(hx.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return asy.a(asy.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

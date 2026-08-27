import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class elz extends eml {
   protected elz(emb $$0) {
      super($$0);
   }

   @Override
   protected DoubleList a(ic.a $$0) {
      return new ely(this.a.c($$0));
   }

   @Override
   protected int a(ic.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return aun.a(aun.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

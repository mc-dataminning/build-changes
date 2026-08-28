import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class fdb extends fdo {
   protected fdb(fdd $$0) {
      super($$0);
   }

   @Override
   public DoubleList a(jo.a $$0) {
      return new fda(this.a.c($$0));
   }

   @Override
   protected int a(jo.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return azk.a(azk.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

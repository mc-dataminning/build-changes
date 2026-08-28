import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class fep extends ffc {
   protected fep(fer $$0) {
      super($$0);
   }

   @Override
   public DoubleList a(ja.a $$0) {
      return new feo(this.a.c($$0));
   }

   @Override
   protected int a(ja.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return azm.a(azm.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

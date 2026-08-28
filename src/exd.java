import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class exd extends exp {
   protected exd(exf $$0) {
      super($$0);
   }

   @Override
   public DoubleList a(ji.a $$0) {
      return new exc(this.a.c($$0));
   }

   @Override
   protected int a(ji.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return ayn.a(ayn.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

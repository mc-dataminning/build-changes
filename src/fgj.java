import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class fgj extends fgw {
   protected fgj(fgl $$0) {
      super($$0);
   }

   @Override
   public DoubleList a(jc.a $$0) {
      return new fgi(this.a.c($$0));
   }

   @Override
   protected int a(jc.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return azz.a(azz.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

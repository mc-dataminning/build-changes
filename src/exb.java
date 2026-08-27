import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class exb extends exn {
   protected exb(exd $$0) {
      super($$0);
   }

   @Override
   protected DoubleList a(iw.a $$0) {
      return new exa(this.a.c($$0));
   }

   @Override
   protected int a(iw.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return aym.a(aym.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

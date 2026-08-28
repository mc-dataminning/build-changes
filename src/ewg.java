import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class ewg extends ews {
   protected ewg(ewi $$0) {
      super($$0);
   }

   @Override
   public DoubleList a(jf.a $$0) {
      return new ewf(this.a.c($$0));
   }

   @Override
   protected int a(jf.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return aye.a(aye.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

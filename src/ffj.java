import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class ffj extends ffw {
   protected ffj(ffl $$0) {
      super($$0);
   }

   @Override
   public DoubleList a(jb.a $$0) {
      return new ffi(this.a.c($$0));
   }

   @Override
   protected int a(jb.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return azm.a(azm.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

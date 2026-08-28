import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class fby extends fcl {
   protected fby(fca $$0) {
      super($$0);
   }

   @Override
   public DoubleList a(jm.a $$0) {
      return new fbx(this.a.c($$0));
   }

   @Override
   protected int a(jm.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return azu.a(azu.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

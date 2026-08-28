import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class fbh extends fbu {
   protected fbh(fbj $$0) {
      super($$0);
   }

   @Override
   public DoubleList a(jn.a $$0) {
      return new fbg(this.a.c($$0));
   }

   @Override
   protected int a(jn.a $$0, double $$1) {
      int $$2 = this.a.c($$0);
      return ayz.a(ayz.a($$1 * (double)$$2, -1.0, (double)$$2));
   }
}

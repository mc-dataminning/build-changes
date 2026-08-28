import javax.annotation.Nullable;

class bri extends brl {
   private final boolean a;

   public bri(brn $$0, int $$1, boolean $$2) {
      super($$0, $$1);
      this.a = $$2;
   }

   @Override
   public boolean a(btb $$0, int $$1) {
      if (this.a == $$0.ew()) {
         $$0.c((float)Math.max(4 << $$1, 0));
      } else {
         $$0.a($$0.dR().p(), (float)(6 << $$1));
      }

      return true;
   }

   @Override
   public void a(@Nullable bsg $$0, @Nullable bsg $$1, btb $$2, int $$3, double $$4) {
      if (this.a == $$2.ew()) {
         int $$5 = (int)($$4 * (double)(4 << $$3) + 0.5);
         $$2.c((float)$$5);
      } else {
         int $$6 = (int)($$4 * (double)(6 << $$3) + 0.5);
         if ($$0 == null) {
            $$2.a($$2.dR().p(), (float)$$6);
         } else {
            $$2.a($$2.dR().c($$0, $$1), (float)$$6);
         }
      }
   }
}

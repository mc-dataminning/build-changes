import javax.annotation.Nullable;

class brs extends brv {
   private final boolean c;

   public brs(brx $$0, int $$1, boolean $$2) {
      super($$0, $$1);
      this.c = $$2;
   }

   @Override
   public boolean a(btl $$0, int $$1) {
      if (this.c == $$0.ew()) {
         $$0.c((float)Math.max(4 << $$1, 0));
      } else {
         $$0.a($$0.dR().p(), (float)(6 << $$1));
      }

      return true;
   }

   @Override
   public void a(@Nullable bsq $$0, @Nullable bsq $$1, btl $$2, int $$3, double $$4) {
      if (this.c == $$2.ew()) {
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

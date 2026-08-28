import javax.annotation.Nullable;

class bui extends bul {
   private final boolean c;

   public bui(bun $$0, int $$1, boolean $$2) {
      super($$0, $$1);
      this.c = $$2;
   }

   @Override
   public boolean a(ash $$0, bwf $$1, int $$2) {
      if (this.c == $$1.eC()) {
         $$1.c((float)Math.max(4 << $$2, 0));
      } else {
         $$1.a($$0, $$1.dW().q(), (float)(6 << $$2));
      }

      return true;
   }

   @Override
   public void a(ash $$0, @Nullable bvj $$1, @Nullable bvj $$2, bwf $$3, int $$4, double $$5) {
      if (this.c == $$3.eC()) {
         int $$6 = (int)($$5 * (double)(4 << $$4) + 0.5);
         $$3.c((float)$$6);
      } else {
         int $$7 = (int)($$5 * (double)(6 << $$4) + 0.5);
         if ($$1 == null) {
            $$3.a($$0, $$3.dW().q(), (float)$$7);
         } else {
            $$3.a($$0, $$3.dW().c($$1, $$2), (float)$$7);
         }
      }
   }
}

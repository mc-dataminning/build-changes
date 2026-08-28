import javax.annotation.Nullable;

class bth extends btk {
   private final boolean c;

   public bth(btm $$0, int $$1, boolean $$2) {
      super($$0, $$1);
      this.c = $$2;
   }

   @Override
   public boolean a(bve $$0, int $$1) {
      if (this.c == $$0.eG()) {
         $$0.c((float)Math.max(4 << $$1, 0));
      } else {
         $$0.a($$0.dZ().q(), (float)(6 << $$1));
      }

      return true;
   }

   @Override
   public void a(@Nullable bui $$0, @Nullable bui $$1, bve $$2, int $$3, double $$4) {
      if (this.c == $$2.eG()) {
         int $$5 = (int)($$4 * (double)(4 << $$3) + 0.5);
         $$2.c((float)$$5);
      } else {
         int $$6 = (int)($$4 * (double)(6 << $$3) + 0.5);
         if ($$0 == null) {
            $$2.a($$2.dZ().q(), (float)$$6);
         } else {
            $$2.a($$2.dZ().c($$0, $$1), (float)$$6);
         }
      }
   }
}

import javax.annotation.Nullable;

class btd extends btg {
   private final boolean c;

   public btd(bti $$0, int $$1, boolean $$2) {
      super($$0, $$1);
      this.c = $$2;
   }

   @Override
   public boolean a(bva $$0, int $$1) {
      if (this.c == $$0.eF()) {
         $$0.c((float)Math.max(4 << $$1, 0));
      } else {
         $$0.a($$0.dY().q(), (float)(6 << $$1));
      }

      return true;
   }

   @Override
   public void a(@Nullable bue $$0, @Nullable bue $$1, bva $$2, int $$3, double $$4) {
      if (this.c == $$2.eF()) {
         int $$5 = (int)($$4 * (double)(4 << $$3) + 0.5);
         $$2.c((float)$$5);
      } else {
         int $$6 = (int)($$4 * (double)(6 << $$3) + 0.5);
         if ($$0 == null) {
            $$2.a($$2.dY().q(), (float)$$6);
         } else {
            $$2.a($$2.dY().c($$0, $$1), (float)$$6);
         }
      }
   }
}

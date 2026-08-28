import javax.annotation.Nullable;

class bsk extends bsn {
   private final boolean c;

   public bsk(bsp $$0, int $$1, boolean $$2) {
      super($$0, $$1);
      this.c = $$2;
   }

   @Override
   public boolean a(buf $$0, int $$1) {
      if (this.c == $$0.ez()) {
         $$0.c((float)Math.max(4 << $$1, 0));
      } else {
         $$0.a($$0.dT().q(), (float)(6 << $$1));
      }

      return true;
   }

   @Override
   public void a(@Nullable btj $$0, @Nullable btj $$1, buf $$2, int $$3, double $$4) {
      if (this.c == $$2.ez()) {
         int $$5 = (int)($$4 * (double)(4 << $$3) + 0.5);
         $$2.c((float)$$5);
      } else {
         int $$6 = (int)($$4 * (double)(6 << $$3) + 0.5);
         if ($$0 == null) {
            $$2.a($$2.dT().q(), (float)$$6);
         } else {
            $$2.a($$2.dT().c($$0, $$1), (float)$$6);
         }
      }
   }
}

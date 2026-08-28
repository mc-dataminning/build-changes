import javax.annotation.Nullable;

class bua extends bud {
   private final boolean c;

   public bua(buf $$0, int $$1, boolean $$2) {
      super($$0, $$1);
      this.c = $$2;
   }

   @Override
   public boolean a(arx $$0, bvx $$1, int $$2) {
      if (this.c == $$1.eD()) {
         $$1.c((float)Math.max(4 << $$2, 0));
      } else {
         $$1.a($$0, $$1.dX().q(), (float)(6 << $$2));
      }

      return true;
   }

   @Override
   public void a(arx $$0, @Nullable bvb $$1, @Nullable bvb $$2, bvx $$3, int $$4, double $$5) {
      if (this.c == $$3.eD()) {
         int $$6 = (int)($$5 * (double)(4 << $$4) + 0.5);
         $$3.c((float)$$6);
      } else {
         int $$7 = (int)($$5 * (double)(6 << $$4) + 0.5);
         if ($$1 == null) {
            $$3.a($$0, $$3.dX().q(), (float)$$7);
         } else {
            $$3.a($$0, $$3.dX().c($$1, $$2), (float)$$7);
         }
      }
   }
}

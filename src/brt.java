import javax.annotation.Nullable;

class brt extends brw {
   private final boolean c;

   public brt(bry $$0, int $$1, boolean $$2) {
      super($$0, $$1);
      this.c = $$2;
   }

   @Override
   public boolean a(btn $$0, int $$1) {
      if (this.c == $$0.ew()) {
         $$0.c((float)Math.max(4 << $$1, 0));
      } else {
         $$0.a($$0.dQ().p(), (float)(6 << $$1));
      }

      return true;
   }

   @Override
   public void a(@Nullable bsr $$0, @Nullable bsr $$1, btn $$2, int $$3, double $$4) {
      if (this.c == $$2.ew()) {
         int $$5 = (int)($$4 * (double)(4 << $$3) + 0.5);
         $$2.c((float)$$5);
      } else {
         int $$6 = (int)($$4 * (double)(6 << $$3) + 0.5);
         if ($$0 == null) {
            $$2.a($$2.dQ().p(), (float)$$6);
         } else {
            $$2.a($$2.dQ().c($$0, $$1), (float)$$6);
         }
      }
   }
}

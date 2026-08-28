import javax.annotation.Nullable;

class bru extends brx {
   private final boolean a;

   public bru(brz $$0, int $$1, boolean $$2) {
      super($$0, $$1);
      this.a = $$2;
   }

   @Override
   public boolean a(btn $$0, int $$1) {
      if (this.a == $$0.ez()) {
         $$0.c((float)Math.max(4 << $$1, 0));
      } else {
         $$0.a($$0.dQ().o(), (float)(6 << $$1));
      }

      return true;
   }

   @Override
   public void a(@Nullable bss $$0, @Nullable bss $$1, btn $$2, int $$3, double $$4) {
      if (this.a == $$2.ez()) {
         int $$5 = (int)($$4 * (double)(4 << $$3) + 0.5);
         $$2.c((float)$$5);
      } else {
         int $$6 = (int)($$4 * (double)(6 << $$3) + 0.5);
         if ($$0 == null) {
            $$2.a($$2.dQ().o(), (float)$$6);
         } else {
            $$2.a($$2.dQ().c($$0, $$1), (float)$$6);
         }
      }
   }
}

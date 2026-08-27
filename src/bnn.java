import javax.annotation.Nullable;

class bnn extends bnp {
   private final boolean a;

   public bnn(bnr $$0, int $$1, boolean $$2) {
      super($$0, $$1);
      this.a = $$2;
   }

   @Override
   public boolean a(box $$0, int $$1) {
      if (this.a == $$0.et()) {
         $$0.c((float)Math.max(4 << $$1, 0));
      } else {
         $$0.a($$0.dK().o(), (float)(6 << $$1));
      }

      return true;
   }

   @Override
   public void a(@Nullable bof $$0, @Nullable bof $$1, box $$2, int $$3, double $$4) {
      if (this.a == $$2.et()) {
         int $$5 = (int)($$4 * (double)(4 << $$3) + 0.5);
         $$2.c((float)$$5);
      } else {
         int $$6 = (int)($$4 * (double)(6 << $$3) + 0.5);
         if ($$0 == null) {
            $$2.a($$2.dK().o(), (float)$$6);
         } else {
            $$2.a($$2.dK().c($$0, $$1), (float)$$6);
         }
      }
   }
}

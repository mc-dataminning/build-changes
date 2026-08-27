import javax.annotation.Nullable;

class bkd extends bkf {
   private final boolean a;

   public bkd(bkh $$0, int $$1, boolean $$2) {
      super($$0, $$1);
      this.a = $$2;
   }

   @Override
   public void a(bll $$0, int $$1) {
      super.a($$0, $$1);
      if (this.a == $$0.ev()) {
         $$0.b((float)Math.max(4 << $$1, 0));
      } else {
         $$0.a($$0.dO().o(), (float)(6 << $$1));
      }
   }

   @Override
   public void a(@Nullable bkv $$0, @Nullable bkv $$1, bll $$2, int $$3, double $$4) {
      if (this.a == $$2.ev()) {
         int $$5 = (int)($$4 * (double)(4 << $$3) + 0.5);
         $$2.b((float)$$5);
      } else {
         int $$6 = (int)($$4 * (double)(6 << $$3) + 0.5);
         if ($$0 == null) {
            $$2.a($$2.dO().o(), (float)$$6);
         } else {
            $$2.a($$2.dO().c($$0, $$1), (float)$$6);
         }
      }
   }
}

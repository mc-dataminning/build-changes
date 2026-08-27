import javax.annotation.Nullable;

class bjb extends bjd {
   private final boolean a;

   public bjb(bjf $$0, int $$1, boolean $$2) {
      super($$0, $$1);
      this.a = $$2;
   }

   @Override
   public void a(bkj $$0, int $$1) {
      super.a($$0, $$1);
      if (this.a == $$0.et()) {
         $$0.b((float)Math.max(4 << $$1, 0));
      } else {
         $$0.a($$0.dM().o(), (float)(6 << $$1));
      }
   }

   @Override
   public void a(@Nullable bjt $$0, @Nullable bjt $$1, bkj $$2, int $$3, double $$4) {
      if (this.a == $$2.et()) {
         int $$5 = (int)($$4 * (double)(4 << $$3) + 0.5);
         $$2.b((float)$$5);
      } else {
         int $$6 = (int)($$4 * (double)(6 << $$3) + 0.5);
         if ($$0 == null) {
            $$2.a($$2.dM().o(), (float)$$6);
         } else {
            $$2.a($$2.dM().c($$0, $$1), (float)$$6);
         }
      }
   }
}

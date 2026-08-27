import javax.annotation.Nullable;

class bho extends bhq {
   private final boolean a;

   public bho(bhs $$0, int $$1, boolean $$2) {
      super($$0, $$1);
      this.a = $$2;
   }

   @Override
   public void a(biw $$0, int $$1) {
      super.a($$0, $$1);
      if (this.a == $$0.es()) {
         $$0.b((float)Math.max(4 << $$1, 0));
      } else {
         $$0.a($$0.dL().o(), (float)(6 << $$1));
      }
   }

   @Override
   public void a(@Nullable big $$0, @Nullable big $$1, biw $$2, int $$3, double $$4) {
      if (this.a == $$2.es()) {
         int $$5 = (int)($$4 * (double)(4 << $$3) + 0.5);
         $$2.b((float)$$5);
      } else {
         int $$6 = (int)($$4 * (double)(6 << $$3) + 0.5);
         if ($$0 == null) {
            $$2.a($$2.dL().o(), (float)$$6);
         } else {
            $$2.a($$2.dL().c($$0, $$1), (float)$$6);
         }
      }
   }
}

import javax.annotation.Nullable;

class brc extends bre {
   private final boolean a;

   public brc(brg $$0, int $$1, boolean $$2) {
      super($$0, $$1);
      this.a = $$2;
   }

   @Override
   public boolean a(bso $$0, int $$1) {
      if (this.a == $$0.eH()) {
         $$0.c((float)Math.max(4 << $$1, 0));
      } else {
         $$0.a($$0.dX().p(), (float)(6 << $$1));
      }

      return true;
   }

   @Override
   public void a(@Nullable brv $$0, @Nullable brv $$1, bso $$2, int $$3, double $$4) {
      if (this.a == $$2.eH()) {
         int $$5 = (int)($$4 * (double)(4 << $$3) + 0.5);
         $$2.c((float)$$5);
      } else {
         int $$6 = (int)($$4 * (double)(6 << $$3) + 0.5);
         if ($$0 == null) {
            $$2.a($$2.dX().p(), (float)$$6);
         } else {
            $$2.a($$2.dX().c($$0, $$1), (float)$$6);
         }
      }
   }
}

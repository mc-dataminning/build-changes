public abstract class dfe {
   private static final int a = 5;
   private int b;

   protected abstract void a(crs var1, ht var2, dgw var3);

   protected abstract void b(crs var1, ht var2, dgw var3);

   protected abstract void a(crs var1, ht var2, dgw var3, int var4, int var5);

   protected abstract boolean a(cdm var1);

   public void a(cdm $$0, crs $$1, ht $$2, dgw $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dlg.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   public void b(cdm $$0, crs $$1, ht $$2, dgw $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dlg.j, $$2);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private int a(crs $$0, ht $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      float $$5 = 5.0F;
      ejd $$6 = new ejd(
         (double)((float)$$2 - 5.0F),
         (double)((float)$$3 - 5.0F),
         (double)((float)$$4 - 5.0F),
         (double)((float)($$2 + 1) + 5.0F),
         (double)((float)($$3 + 1) + 5.0F),
         (double)((float)($$4 + 1) + 5.0F)
      );
      return $$0.a(dku.a(cdm.class), $$6, this::a).size();
   }

   public void c(crs $$0, ht $$1, dgw $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b;
      if ($$4 != $$3) {
         boolean $$5 = $$3 != 0;
         boolean $$6 = $$4 != 0;
         if ($$5 && !$$6) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dlg.k, $$1);
         } else if (!$$5) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dlg.j, $$1);
         }

         this.b = $$3;
      }

      this.a($$0, $$1, $$2, $$4, $$3);
      if ($$3 > 0) {
         d($$0, $$1, $$2);
      }
   }

   public int a() {
      return this.b;
   }

   private static void d(crs $$0, ht $$1, dgw $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}

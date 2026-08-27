public abstract class dhq {
   private static final int a = 5;
   private int b;

   protected abstract void a(ctx var1, hx var2, djp var3);

   protected abstract void b(ctx var1, hx var2, djp var3);

   protected abstract void a(ctx var1, hx var2, djp var3, int var4, int var5);

   protected abstract boolean a(cfq var1);

   public void a(cfq $$0, ctx $$1, hx $$2, djp $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dnz.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   public void b(cfq $$0, ctx $$1, hx $$2, djp $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dnz.j, $$2);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private int a(ctx $$0, hx $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      float $$5 = 5.0F;
      elx $$6 = new elx(
         (double)((float)$$2 - 5.0F),
         (double)((float)$$3 - 5.0F),
         (double)((float)$$4 - 5.0F),
         (double)((float)($$2 + 1) + 5.0F),
         (double)((float)($$3 + 1) + 5.0F),
         (double)((float)($$4 + 1) + 5.0F)
      );
      return $$0.a(dnn.a(cfq.class), $$6, this::a).size();
   }

   public void c(ctx $$0, hx $$1, djp $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b;
      if ($$4 != $$3) {
         boolean $$5 = $$3 != 0;
         boolean $$6 = $$4 != 0;
         if ($$5 && !$$6) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dnz.k, $$1);
         } else if (!$$5) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dnz.j, $$1);
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

   private static void d(ctx $$0, hx $$1, djp $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}

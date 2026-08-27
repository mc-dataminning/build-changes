public abstract class dhh {
   private static final int a = 5;
   private int b;

   protected abstract void a(cto var1, hx var2, djg var3);

   protected abstract void b(cto var1, hx var2, djg var3);

   protected abstract void a(cto var1, hx var2, djg var3, int var4, int var5);

   protected abstract boolean a(cfh var1);

   public void a(cfh $$0, cto $$1, hx $$2, djg $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dnq.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   public void b(cfh $$0, cto $$1, hx $$2, djg $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dnq.j, $$2);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private int a(cto $$0, hx $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      float $$5 = 5.0F;
      eln $$6 = new eln(
         (double)((float)$$2 - 5.0F),
         (double)((float)$$3 - 5.0F),
         (double)((float)$$4 - 5.0F),
         (double)((float)($$2 + 1) + 5.0F),
         (double)((float)($$3 + 1) + 5.0F),
         (double)((float)($$4 + 1) + 5.0F)
      );
      return $$0.a(dne.a(cfh.class), $$6, this::a).size();
   }

   public void c(cto $$0, hx $$1, djg $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b;
      if ($$4 != $$3) {
         boolean $$5 = $$3 != 0;
         boolean $$6 = $$4 != 0;
         if ($$5 && !$$6) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dnq.k, $$1);
         } else if (!$$5) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dnq.j, $$1);
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

   private static void d(cto $$0, hx $$1, djg $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}

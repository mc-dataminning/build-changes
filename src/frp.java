public abstract class frp implements frv {
   private int c;
   private int d;
   protected int a;
   protected int b;

   public frp(int $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
   }

   @Override
   public void k(int $$0) {
      this.b($$1 -> {
         int $$2 = $$1.D() + ($$0 - this.D());
         $$1.k($$2);
      });
      this.c = $$0;
   }

   @Override
   public void l(int $$0) {
      this.b($$1 -> {
         int $$2 = $$1.E() + ($$0 - this.E());
         $$1.l($$2);
      });
      this.d = $$0;
   }

   @Override
   public int D() {
      return this.c;
   }

   @Override
   public int E() {
      return this.d;
   }

   @Override
   public int y() {
      return this.a;
   }

   @Override
   public int w() {
      return this.b;
   }

   protected abstract static class a {
      public final frw a;
      public final frx.a b;

      protected a(frw $$0, frx $$1) {
         this.a = $$0;
         this.b = $$1.h();
      }

      public int a() {
         return this.a.w() + this.b.b + this.b.d;
      }

      public int b() {
         return this.a.y() + this.b.a + this.b.c;
      }

      public void a(int $$0, int $$1) {
         float $$2 = (float)this.b.a;
         float $$3 = (float)($$1 - this.a.y() - this.b.c);
         int $$4 = (int)bae.h(this.b.e, $$2, $$3);
         this.a.k($$4 + $$0);
      }

      public void b(int $$0, int $$1) {
         float $$2 = (float)this.b.b;
         float $$3 = (float)($$1 - this.a.w() - this.b.d);
         int $$4 = Math.round(bae.h(this.b.f, $$2, $$3));
         this.a.l($$4 + $$0);
      }
   }
}

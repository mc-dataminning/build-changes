public abstract class faw implements fbc {
   private int c;
   private int d;
   protected int a;
   protected int b;

   public faw(int $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
   }

   @Override
   public void n(int $$0) {
      this.b($$1 -> {
         int $$2 = $$1.B() + ($$0 - this.B());
         $$1.n($$2);
      });
      this.c = $$0;
   }

   @Override
   public void o(int $$0) {
      this.b($$1 -> {
         int $$2 = $$1.C() + ($$0 - this.C());
         $$1.o($$2);
      });
      this.d = $$0;
   }

   @Override
   public int B() {
      return this.c;
   }

   @Override
   public int C() {
      return this.d;
   }

   @Override
   public int w() {
      return this.a;
   }

   @Override
   public int u() {
      return this.b;
   }

   protected abstract static class a {
      public final fbd a;
      public final fbe.a b;

      protected a(fbd $$0, fbe $$1) {
         this.a = $$0;
         this.b = $$1.h();
      }

      public int a() {
         return this.a.u() + this.b.b + this.b.d;
      }

      public int b() {
         return this.a.w() + this.b.a + this.b.c;
      }

      public void a(int $$0, int $$1) {
         float $$2 = (float)this.b.a;
         float $$3 = (float)($$1 - this.a.w() - this.b.c);
         int $$4 = (int)aup.i(this.b.e, $$2, $$3);
         this.a.n($$4 + $$0);
      }

      public void b(int $$0, int $$1) {
         float $$2 = (float)this.b.b;
         float $$3 = (float)($$1 - this.a.u() - this.b.d);
         int $$4 = Math.round(aup.i(this.b.f, $$2, $$3));
         this.a.o($$4 + $$0);
      }
   }
}

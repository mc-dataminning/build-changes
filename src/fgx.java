public abstract class fgx implements fhd {
   private int c;
   private int d;
   protected int a;
   protected int b;

   public fgx(int $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
   }

   @Override
   public void m(int $$0) {
      this.b($$1 -> {
         int $$2 = $$1.C() + ($$0 - this.C());
         $$1.m($$2);
      });
      this.c = $$0;
   }

   @Override
   public void n(int $$0) {
      this.b($$1 -> {
         int $$2 = $$1.D() + ($$0 - this.D());
         $$1.n($$2);
      });
      this.d = $$0;
   }

   @Override
   public int C() {
      return this.c;
   }

   @Override
   public int D() {
      return this.d;
   }

   @Override
   public int x() {
      return this.a;
   }

   @Override
   public int v() {
      return this.b;
   }

   protected abstract static class a {
      public final fhe a;
      public final fhf.a b;

      protected a(fhe $$0, fhf $$1) {
         this.a = $$0;
         this.b = $$1.h();
      }

      public int a() {
         return this.a.v() + this.b.b + this.b.d;
      }

      public int b() {
         return this.a.x() + this.b.a + this.b.c;
      }

      public void a(int $$0, int $$1) {
         float $$2 = (float)this.b.a;
         float $$3 = (float)($$1 - this.a.x() - this.b.c);
         int $$4 = (int)axk.i(this.b.e, $$2, $$3);
         this.a.m($$4 + $$0);
      }

      public void b(int $$0, int $$1) {
         float $$2 = (float)this.b.b;
         float $$3 = (float)($$1 - this.a.v() - this.b.d);
         int $$4 = Math.round(axk.i(this.b.f, $$2, $$3));
         this.a.n($$4 + $$0);
      }
   }
}

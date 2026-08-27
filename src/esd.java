public abstract class esd implements esh {
   private int c;
   private int d;
   protected int a;
   protected int b;

   public esd(int $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
   }

   @Override
   public void e(int $$0) {
      this.b($$1 -> {
         int $$2 = $$1.p() + ($$0 - this.p());
         $$1.e($$2);
      });
      this.c = $$0;
   }

   @Override
   public void f(int $$0) {
      this.b($$1 -> {
         int $$2 = $$1.r() + ($$0 - this.r());
         $$1.f($$2);
      });
      this.d = $$0;
   }

   @Override
   public int p() {
      return this.c;
   }

   @Override
   public int r() {
      return this.d;
   }

   @Override
   public int k() {
      return this.a;
   }

   @Override
   public int h() {
      return this.b;
   }

   protected abstract static class a {
      public final esi a;
      public final esj.a b;

      protected a(esi $$0, esj $$1) {
         this.a = $$0;
         this.b = $$1.h();
      }

      public int a() {
         return this.a.h() + this.b.b + this.b.d;
      }

      public int b() {
         return this.a.k() + this.b.a + this.b.c;
      }

      public void a(int $$0, int $$1) {
         float $$2 = (float)this.b.a;
         float $$3 = (float)($$1 - this.a.k() - this.b.c);
         int $$4 = (int)apa.i(this.b.e, $$2, $$3);
         this.a.e($$4 + $$0);
      }

      public void b(int $$0, int $$1) {
         float $$2 = (float)this.b.b;
         float $$3 = (float)($$1 - this.a.h() - this.b.d);
         int $$4 = Math.round(apa.i(this.b.f, $$2, $$3));
         this.a.f($$4 + $$0);
      }
   }
}

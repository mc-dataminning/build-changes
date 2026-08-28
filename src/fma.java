public interface fma {
   fma a(int var1);

   fma a(int var1, int var2);

   fma a(int var1, int var2, int var3, int var4);

   fma b(int var1);

   fma c(int var1);

   fma d(int var1);

   fma e(int var1);

   fma f(int var1);

   fma g(int var1);

   fma a(float var1, float var2);

   fma a(float var1);

   fma b(float var1);

   default fma a() {
      return this.a(0.0F);
   }

   default fma b() {
      return this.a(0.5F);
   }

   default fma c() {
      return this.a(1.0F);
   }

   default fma d() {
      return this.b(0.0F);
   }

   default fma e() {
      return this.b(0.5F);
   }

   default fma f() {
      return this.b(1.0F);
   }

   fma g();

   fma.a h();

   static fma i() {
      return new fma.a();
   }

   public static class a implements fma {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fma.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fma.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fma.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fma.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fma.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fma.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fma.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fma.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fma.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fma.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fma.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fma.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fma.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fma.a j() {
         return new fma.a(this);
      }

      @Override
      public fma.a h() {
         return this;
      }
   }
}

public interface fth {
   fth a(int var1);

   fth a(int var1, int var2);

   fth a(int var1, int var2, int var3, int var4);

   fth b(int var1);

   fth c(int var1);

   fth d(int var1);

   fth e(int var1);

   fth f(int var1);

   fth g(int var1);

   fth a(float var1, float var2);

   fth a(float var1);

   fth b(float var1);

   default fth a() {
      return this.a(0.0F);
   }

   default fth b() {
      return this.a(0.5F);
   }

   default fth c() {
      return this.a(1.0F);
   }

   default fth d() {
      return this.b(0.0F);
   }

   default fth e() {
      return this.b(0.5F);
   }

   default fth f() {
      return this.b(1.0F);
   }

   fth g();

   fth.a h();

   static fth i() {
      return new fth.a();
   }

   public static class a implements fth {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fth.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fth.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fth.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fth.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fth.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fth.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fth.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fth.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fth.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fth.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fth.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fth.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fth.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fth.a j() {
         return new fth.a(this);
      }

      @Override
      public fth.a h() {
         return this;
      }
   }
}

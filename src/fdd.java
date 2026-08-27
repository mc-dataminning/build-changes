public interface fdd {
   fdd a(int var1);

   fdd a(int var1, int var2);

   fdd a(int var1, int var2, int var3, int var4);

   fdd b(int var1);

   fdd c(int var1);

   fdd d(int var1);

   fdd e(int var1);

   fdd f(int var1);

   fdd g(int var1);

   fdd a(float var1, float var2);

   fdd a(float var1);

   fdd b(float var1);

   default fdd a() {
      return this.a(0.0F);
   }

   default fdd b() {
      return this.a(0.5F);
   }

   default fdd c() {
      return this.a(1.0F);
   }

   default fdd d() {
      return this.b(0.0F);
   }

   default fdd e() {
      return this.b(0.5F);
   }

   default fdd f() {
      return this.b(1.0F);
   }

   fdd g();

   fdd.a h();

   static fdd i() {
      return new fdd.a();
   }

   public static class a implements fdd {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fdd.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fdd.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fdd.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fdd.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fdd.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fdd.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fdd.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fdd.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fdd.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fdd.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fdd.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fdd.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fdd.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fdd.a j() {
         return new fdd.a(this);
      }

      @Override
      public fdd.a h() {
         return this;
      }
   }
}

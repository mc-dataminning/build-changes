public interface fiu {
   fiu a(int var1);

   fiu a(int var1, int var2);

   fiu a(int var1, int var2, int var3, int var4);

   fiu b(int var1);

   fiu c(int var1);

   fiu d(int var1);

   fiu e(int var1);

   fiu f(int var1);

   fiu g(int var1);

   fiu a(float var1, float var2);

   fiu a(float var1);

   fiu b(float var1);

   default fiu a() {
      return this.a(0.0F);
   }

   default fiu b() {
      return this.a(0.5F);
   }

   default fiu c() {
      return this.a(1.0F);
   }

   default fiu d() {
      return this.b(0.0F);
   }

   default fiu e() {
      return this.b(0.5F);
   }

   default fiu f() {
      return this.b(1.0F);
   }

   fiu g();

   fiu.a h();

   static fiu i() {
      return new fiu.a();
   }

   public static class a implements fiu {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fiu.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fiu.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fiu.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fiu.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fiu.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fiu.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fiu.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fiu.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fiu.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fiu.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fiu.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fiu.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fiu.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fiu.a j() {
         return new fiu.a(this);
      }

      @Override
      public fiu.a h() {
         return this;
      }
   }
}

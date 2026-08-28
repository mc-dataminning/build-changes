public interface fli {
   fli a(int var1);

   fli a(int var1, int var2);

   fli a(int var1, int var2, int var3, int var4);

   fli b(int var1);

   fli c(int var1);

   fli d(int var1);

   fli e(int var1);

   fli f(int var1);

   fli g(int var1);

   fli a(float var1, float var2);

   fli a(float var1);

   fli b(float var1);

   default fli a() {
      return this.a(0.0F);
   }

   default fli b() {
      return this.a(0.5F);
   }

   default fli c() {
      return this.a(1.0F);
   }

   default fli d() {
      return this.b(0.0F);
   }

   default fli e() {
      return this.b(0.5F);
   }

   default fli f() {
      return this.b(1.0F);
   }

   fli g();

   fli.a h();

   static fli i() {
      return new fli.a();
   }

   public static class a implements fli {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fli.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fli.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fli.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fli.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fli.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fli.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fli.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fli.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fli.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fli.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fli.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fli.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fli.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fli.a j() {
         return new fli.a(this);
      }

      @Override
      public fli.a h() {
         return this;
      }
   }
}

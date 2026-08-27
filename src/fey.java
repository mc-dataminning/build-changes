public interface fey {
   fey a(int var1);

   fey a(int var1, int var2);

   fey a(int var1, int var2, int var3, int var4);

   fey b(int var1);

   fey c(int var1);

   fey d(int var1);

   fey e(int var1);

   fey f(int var1);

   fey g(int var1);

   fey a(float var1, float var2);

   fey a(float var1);

   fey b(float var1);

   default fey a() {
      return this.a(0.0F);
   }

   default fey b() {
      return this.a(0.5F);
   }

   default fey c() {
      return this.a(1.0F);
   }

   default fey d() {
      return this.b(0.0F);
   }

   default fey e() {
      return this.b(0.5F);
   }

   default fey f() {
      return this.b(1.0F);
   }

   fey g();

   fey.a h();

   static fey i() {
      return new fey.a();
   }

   public static class a implements fey {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fey.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fey.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fey.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fey.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fey.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fey.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fey.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fey.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fey.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fey.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fey.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fey.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fey.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fey.a j() {
         return new fey.a(this);
      }

      @Override
      public fey.a h() {
         return this;
      }
   }
}

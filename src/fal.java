public interface fal {
   fal a(int var1);

   fal a(int var1, int var2);

   fal a(int var1, int var2, int var3, int var4);

   fal b(int var1);

   fal c(int var1);

   fal d(int var1);

   fal e(int var1);

   fal f(int var1);

   fal g(int var1);

   fal a(float var1, float var2);

   fal a(float var1);

   fal b(float var1);

   default fal a() {
      return this.a(0.0F);
   }

   default fal b() {
      return this.a(0.5F);
   }

   default fal c() {
      return this.a(1.0F);
   }

   default fal d() {
      return this.b(0.0F);
   }

   default fal e() {
      return this.b(0.5F);
   }

   default fal f() {
      return this.b(1.0F);
   }

   fal g();

   fal.a h();

   static fal i() {
      return new fal.a();
   }

   public static class a implements fal {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fal.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fal.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fal.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fal.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fal.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fal.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fal.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fal.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fal.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fal.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fal.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fal.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fal.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fal.a j() {
         return new fal.a(this);
      }

      @Override
      public fal.a h() {
         return this;
      }
   }
}

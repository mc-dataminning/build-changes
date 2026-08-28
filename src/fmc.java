public interface fmc {
   fmc a(int var1);

   fmc a(int var1, int var2);

   fmc a(int var1, int var2, int var3, int var4);

   fmc b(int var1);

   fmc c(int var1);

   fmc d(int var1);

   fmc e(int var1);

   fmc f(int var1);

   fmc g(int var1);

   fmc a(float var1, float var2);

   fmc a(float var1);

   fmc b(float var1);

   default fmc a() {
      return this.a(0.0F);
   }

   default fmc b() {
      return this.a(0.5F);
   }

   default fmc c() {
      return this.a(1.0F);
   }

   default fmc d() {
      return this.b(0.0F);
   }

   default fmc e() {
      return this.b(0.5F);
   }

   default fmc f() {
      return this.b(1.0F);
   }

   fmc g();

   fmc.a h();

   static fmc i() {
      return new fmc.a();
   }

   public static class a implements fmc {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fmc.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fmc.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fmc.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fmc.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fmc.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fmc.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fmc.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fmc.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fmc.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fmc.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fmc.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fmc.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fmc.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fmc.a j() {
         return new fmc.a(this);
      }

      @Override
      public fmc.a h() {
         return this;
      }
   }
}

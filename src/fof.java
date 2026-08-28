public interface fof {
   fof a(int var1);

   fof a(int var1, int var2);

   fof a(int var1, int var2, int var3, int var4);

   fof b(int var1);

   fof c(int var1);

   fof d(int var1);

   fof e(int var1);

   fof f(int var1);

   fof g(int var1);

   fof a(float var1, float var2);

   fof a(float var1);

   fof b(float var1);

   default fof a() {
      return this.a(0.0F);
   }

   default fof b() {
      return this.a(0.5F);
   }

   default fof c() {
      return this.a(1.0F);
   }

   default fof d() {
      return this.b(0.0F);
   }

   default fof e() {
      return this.b(0.5F);
   }

   default fof f() {
      return this.b(1.0F);
   }

   fof g();

   fof.a h();

   static fof i() {
      return new fof.a();
   }

   public static class a implements fof {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fof.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fof.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fof.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fof.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fof.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fof.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fof.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fof.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fof.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fof.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fof.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fof.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fof.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fof.a j() {
         return new fof.a(this);
      }

      @Override
      public fof.a h() {
         return this;
      }
   }
}

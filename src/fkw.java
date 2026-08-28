public interface fkw {
   fkw a(int var1);

   fkw a(int var1, int var2);

   fkw a(int var1, int var2, int var3, int var4);

   fkw b(int var1);

   fkw c(int var1);

   fkw d(int var1);

   fkw e(int var1);

   fkw f(int var1);

   fkw g(int var1);

   fkw a(float var1, float var2);

   fkw a(float var1);

   fkw b(float var1);

   default fkw a() {
      return this.a(0.0F);
   }

   default fkw b() {
      return this.a(0.5F);
   }

   default fkw c() {
      return this.a(1.0F);
   }

   default fkw d() {
      return this.b(0.0F);
   }

   default fkw e() {
      return this.b(0.5F);
   }

   default fkw f() {
      return this.b(1.0F);
   }

   fkw g();

   fkw.a h();

   static fkw i() {
      return new fkw.a();
   }

   public static class a implements fkw {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fkw.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fkw.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fkw.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fkw.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fkw.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fkw.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fkw.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fkw.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fkw.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fkw.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fkw.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fkw.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fkw.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fkw.a j() {
         return new fkw.a(this);
      }

      @Override
      public fkw.a h() {
         return this;
      }
   }
}

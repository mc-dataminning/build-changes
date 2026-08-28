public interface fob {
   fob a(int var1);

   fob a(int var1, int var2);

   fob a(int var1, int var2, int var3, int var4);

   fob b(int var1);

   fob c(int var1);

   fob d(int var1);

   fob e(int var1);

   fob f(int var1);

   fob g(int var1);

   fob a(float var1, float var2);

   fob a(float var1);

   fob b(float var1);

   default fob a() {
      return this.a(0.0F);
   }

   default fob b() {
      return this.a(0.5F);
   }

   default fob c() {
      return this.a(1.0F);
   }

   default fob d() {
      return this.b(0.0F);
   }

   default fob e() {
      return this.b(0.5F);
   }

   default fob f() {
      return this.b(1.0F);
   }

   fob g();

   fob.a h();

   static fob i() {
      return new fob.a();
   }

   public static class a implements fob {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fob.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fob.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fob.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fob.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fob.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fob.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fob.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fob.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fob.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fob.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fob.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fob.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fob.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fob.a j() {
         return new fob.a(this);
      }

      @Override
      public fob.a h() {
         return this;
      }
   }
}

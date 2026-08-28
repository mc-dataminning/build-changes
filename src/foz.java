public interface foz {
   foz a(int var1);

   foz a(int var1, int var2);

   foz a(int var1, int var2, int var3, int var4);

   foz b(int var1);

   foz c(int var1);

   foz d(int var1);

   foz e(int var1);

   foz f(int var1);

   foz g(int var1);

   foz a(float var1, float var2);

   foz a(float var1);

   foz b(float var1);

   default foz a() {
      return this.a(0.0F);
   }

   default foz b() {
      return this.a(0.5F);
   }

   default foz c() {
      return this.a(1.0F);
   }

   default foz d() {
      return this.b(0.0F);
   }

   default foz e() {
      return this.b(0.5F);
   }

   default foz f() {
      return this.b(1.0F);
   }

   foz g();

   foz.a h();

   static foz i() {
      return new foz.a();
   }

   public static class a implements foz {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(foz.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public foz.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public foz.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public foz.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public foz.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public foz.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public foz.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public foz.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public foz.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public foz.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public foz.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public foz.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public foz.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public foz.a j() {
         return new foz.a(this);
      }

      @Override
      public foz.a h() {
         return this;
      }
   }
}

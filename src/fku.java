public interface fku {
   fku a(int var1);

   fku a(int var1, int var2);

   fku a(int var1, int var2, int var3, int var4);

   fku b(int var1);

   fku c(int var1);

   fku d(int var1);

   fku e(int var1);

   fku f(int var1);

   fku g(int var1);

   fku a(float var1, float var2);

   fku a(float var1);

   fku b(float var1);

   default fku a() {
      return this.a(0.0F);
   }

   default fku b() {
      return this.a(0.5F);
   }

   default fku c() {
      return this.a(1.0F);
   }

   default fku d() {
      return this.b(0.0F);
   }

   default fku e() {
      return this.b(0.5F);
   }

   default fku f() {
      return this.b(1.0F);
   }

   fku g();

   fku.a h();

   static fku i() {
      return new fku.a();
   }

   public static class a implements fku {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fku.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fku.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fku.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fku.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fku.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fku.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fku.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fku.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fku.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fku.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fku.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fku.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fku.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fku.a j() {
         return new fku.a(this);
      }

      @Override
      public fku.a h() {
         return this;
      }
   }
}

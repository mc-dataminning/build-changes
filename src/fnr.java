public interface fnr {
   fnr a(int var1);

   fnr a(int var1, int var2);

   fnr a(int var1, int var2, int var3, int var4);

   fnr b(int var1);

   fnr c(int var1);

   fnr d(int var1);

   fnr e(int var1);

   fnr f(int var1);

   fnr g(int var1);

   fnr a(float var1, float var2);

   fnr a(float var1);

   fnr b(float var1);

   default fnr a() {
      return this.a(0.0F);
   }

   default fnr b() {
      return this.a(0.5F);
   }

   default fnr c() {
      return this.a(1.0F);
   }

   default fnr d() {
      return this.b(0.0F);
   }

   default fnr e() {
      return this.b(0.5F);
   }

   default fnr f() {
      return this.b(1.0F);
   }

   fnr g();

   fnr.a h();

   static fnr i() {
      return new fnr.a();
   }

   public static class a implements fnr {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fnr.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fnr.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fnr.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fnr.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fnr.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fnr.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fnr.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fnr.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fnr.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fnr.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fnr.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fnr.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fnr.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fnr.a j() {
         return new fnr.a(this);
      }

      @Override
      public fnr.a h() {
         return this;
      }
   }
}

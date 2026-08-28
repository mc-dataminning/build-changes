public interface frx {
   frx a(int var1);

   frx a(int var1, int var2);

   frx a(int var1, int var2, int var3, int var4);

   frx b(int var1);

   frx c(int var1);

   frx d(int var1);

   frx e(int var1);

   frx f(int var1);

   frx g(int var1);

   frx a(float var1, float var2);

   frx a(float var1);

   frx b(float var1);

   default frx a() {
      return this.a(0.0F);
   }

   default frx b() {
      return this.a(0.5F);
   }

   default frx c() {
      return this.a(1.0F);
   }

   default frx d() {
      return this.b(0.0F);
   }

   default frx e() {
      return this.b(0.5F);
   }

   default frx f() {
      return this.b(1.0F);
   }

   frx g();

   frx.a h();

   static frx i() {
      return new frx.a();
   }

   public static class a implements frx {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(frx.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public frx.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public frx.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public frx.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public frx.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public frx.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public frx.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public frx.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public frx.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public frx.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public frx.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public frx.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public frx.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public frx.a j() {
         return new frx.a(this);
      }

      @Override
      public frx.a h() {
         return this;
      }
   }
}

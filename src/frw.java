public interface frw {
   frw a(int var1);

   frw a(int var1, int var2);

   frw a(int var1, int var2, int var3, int var4);

   frw b(int var1);

   frw c(int var1);

   frw d(int var1);

   frw e(int var1);

   frw f(int var1);

   frw g(int var1);

   frw a(float var1, float var2);

   frw a(float var1);

   frw b(float var1);

   default frw a() {
      return this.a(0.0F);
   }

   default frw b() {
      return this.a(0.5F);
   }

   default frw c() {
      return this.a(1.0F);
   }

   default frw d() {
      return this.b(0.0F);
   }

   default frw e() {
      return this.b(0.5F);
   }

   default frw f() {
      return this.b(1.0F);
   }

   frw g();

   frw.a h();

   static frw i() {
      return new frw.a();
   }

   public static class a implements frw {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(frw.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public frw.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public frw.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public frw.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public frw.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public frw.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public frw.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public frw.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public frw.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public frw.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public frw.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public frw.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public frw.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public frw.a j() {
         return new frw.a(this);
      }

      @Override
      public frw.a h() {
         return this;
      }
   }
}

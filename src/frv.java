public interface frv {
   frv a(int var1);

   frv a(int var1, int var2);

   frv a(int var1, int var2, int var3, int var4);

   frv b(int var1);

   frv c(int var1);

   frv d(int var1);

   frv e(int var1);

   frv f(int var1);

   frv g(int var1);

   frv a(float var1, float var2);

   frv a(float var1);

   frv b(float var1);

   default frv a() {
      return this.a(0.0F);
   }

   default frv b() {
      return this.a(0.5F);
   }

   default frv c() {
      return this.a(1.0F);
   }

   default frv d() {
      return this.b(0.0F);
   }

   default frv e() {
      return this.b(0.5F);
   }

   default frv f() {
      return this.b(1.0F);
   }

   frv g();

   frv.a h();

   static frv i() {
      return new frv.a();
   }

   public static class a implements frv {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(frv.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public frv.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public frv.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public frv.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public frv.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public frv.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public frv.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public frv.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public frv.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public frv.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public frv.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public frv.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public frv.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public frv.a j() {
         return new frv.a(this);
      }

      @Override
      public frv.a h() {
         return this;
      }
   }
}

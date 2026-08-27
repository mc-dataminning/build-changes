public interface ezu {
   ezu a(int var1);

   ezu a(int var1, int var2);

   ezu a(int var1, int var2, int var3, int var4);

   ezu b(int var1);

   ezu c(int var1);

   ezu d(int var1);

   ezu e(int var1);

   ezu f(int var1);

   ezu g(int var1);

   ezu a(float var1, float var2);

   ezu a(float var1);

   ezu b(float var1);

   default ezu a() {
      return this.a(0.0F);
   }

   default ezu b() {
      return this.a(0.5F);
   }

   default ezu c() {
      return this.a(1.0F);
   }

   default ezu d() {
      return this.b(0.0F);
   }

   default ezu e() {
      return this.b(0.5F);
   }

   default ezu f() {
      return this.b(1.0F);
   }

   ezu g();

   ezu.a h();

   static ezu i() {
      return new ezu.a();
   }

   public static class a implements ezu {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(ezu.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public ezu.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public ezu.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public ezu.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public ezu.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public ezu.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public ezu.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public ezu.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public ezu.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public ezu.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public ezu.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public ezu.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public ezu.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public ezu.a j() {
         return new ezu.a(this);
      }

      @Override
      public ezu.a h() {
         return this;
      }
   }
}

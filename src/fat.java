public interface fat {
   fat a(int var1);

   fat a(int var1, int var2);

   fat a(int var1, int var2, int var3, int var4);

   fat b(int var1);

   fat c(int var1);

   fat d(int var1);

   fat e(int var1);

   fat f(int var1);

   fat g(int var1);

   fat a(float var1, float var2);

   fat a(float var1);

   fat b(float var1);

   default fat a() {
      return this.a(0.0F);
   }

   default fat b() {
      return this.a(0.5F);
   }

   default fat c() {
      return this.a(1.0F);
   }

   default fat d() {
      return this.b(0.0F);
   }

   default fat e() {
      return this.b(0.5F);
   }

   default fat f() {
      return this.b(1.0F);
   }

   fat g();

   fat.a h();

   static fat i() {
      return new fat.a();
   }

   public static class a implements fat {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fat.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fat.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fat.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fat.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fat.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fat.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fat.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fat.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fat.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fat.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fat.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fat.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fat.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fat.a j() {
         return new fat.a(this);
      }

      @Override
      public fat.a h() {
         return this;
      }
   }
}

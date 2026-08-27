public interface exz {
   exz a(int var1);

   exz a(int var1, int var2);

   exz a(int var1, int var2, int var3, int var4);

   exz b(int var1);

   exz c(int var1);

   exz d(int var1);

   exz e(int var1);

   exz f(int var1);

   exz g(int var1);

   exz a(float var1, float var2);

   exz a(float var1);

   exz b(float var1);

   default exz a() {
      return this.a(0.0F);
   }

   default exz b() {
      return this.a(0.5F);
   }

   default exz c() {
      return this.a(1.0F);
   }

   default exz d() {
      return this.b(0.0F);
   }

   default exz e() {
      return this.b(0.5F);
   }

   default exz f() {
      return this.b(1.0F);
   }

   exz g();

   exz.a h();

   static exz i() {
      return new exz.a();
   }

   public static class a implements exz {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(exz.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public exz.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public exz.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public exz.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public exz.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public exz.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public exz.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public exz.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public exz.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public exz.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public exz.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public exz.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public exz.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public exz.a j() {
         return new exz.a(this);
      }

      @Override
      public exz.a h() {
         return this;
      }
   }
}

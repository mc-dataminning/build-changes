public interface fdz {
   fdz a(int var1);

   fdz a(int var1, int var2);

   fdz a(int var1, int var2, int var3, int var4);

   fdz b(int var1);

   fdz c(int var1);

   fdz d(int var1);

   fdz e(int var1);

   fdz f(int var1);

   fdz g(int var1);

   fdz a(float var1, float var2);

   fdz a(float var1);

   fdz b(float var1);

   default fdz a() {
      return this.a(0.0F);
   }

   default fdz b() {
      return this.a(0.5F);
   }

   default fdz c() {
      return this.a(1.0F);
   }

   default fdz d() {
      return this.b(0.0F);
   }

   default fdz e() {
      return this.b(0.5F);
   }

   default fdz f() {
      return this.b(1.0F);
   }

   fdz g();

   fdz.a h();

   static fdz i() {
      return new fdz.a();
   }

   public static class a implements fdz {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fdz.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fdz.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fdz.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fdz.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fdz.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fdz.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fdz.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fdz.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fdz.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fdz.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fdz.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fdz.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fdz.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fdz.a j() {
         return new fdz.a(this);
      }

      @Override
      public fdz.a h() {
         return this;
      }
   }
}

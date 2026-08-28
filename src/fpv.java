public interface fpv {
   fpv a(int var1);

   fpv a(int var1, int var2);

   fpv a(int var1, int var2, int var3, int var4);

   fpv b(int var1);

   fpv c(int var1);

   fpv d(int var1);

   fpv e(int var1);

   fpv f(int var1);

   fpv g(int var1);

   fpv a(float var1, float var2);

   fpv a(float var1);

   fpv b(float var1);

   default fpv a() {
      return this.a(0.0F);
   }

   default fpv b() {
      return this.a(0.5F);
   }

   default fpv c() {
      return this.a(1.0F);
   }

   default fpv d() {
      return this.b(0.0F);
   }

   default fpv e() {
      return this.b(0.5F);
   }

   default fpv f() {
      return this.b(1.0F);
   }

   fpv g();

   fpv.a h();

   static fpv i() {
      return new fpv.a();
   }

   public static class a implements fpv {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fpv.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fpv.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fpv.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fpv.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fpv.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fpv.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fpv.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fpv.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fpv.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fpv.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fpv.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fpv.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fpv.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fpv.a j() {
         return new fpv.a(this);
      }

      @Override
      public fpv.a h() {
         return this;
      }
   }
}

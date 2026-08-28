public interface fkv {
   fkv a(int var1);

   fkv a(int var1, int var2);

   fkv a(int var1, int var2, int var3, int var4);

   fkv b(int var1);

   fkv c(int var1);

   fkv d(int var1);

   fkv e(int var1);

   fkv f(int var1);

   fkv g(int var1);

   fkv a(float var1, float var2);

   fkv a(float var1);

   fkv b(float var1);

   default fkv a() {
      return this.a(0.0F);
   }

   default fkv b() {
      return this.a(0.5F);
   }

   default fkv c() {
      return this.a(1.0F);
   }

   default fkv d() {
      return this.b(0.0F);
   }

   default fkv e() {
      return this.b(0.5F);
   }

   default fkv f() {
      return this.b(1.0F);
   }

   fkv g();

   fkv.a h();

   static fkv i() {
      return new fkv.a();
   }

   public static class a implements fkv {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fkv.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fkv.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fkv.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fkv.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fkv.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fkv.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fkv.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fkv.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fkv.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fkv.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fkv.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fkv.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fkv.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fkv.a j() {
         return new fkv.a(this);
      }

      @Override
      public fkv.a h() {
         return this;
      }
   }
}

public interface fkp {
   fkp a(int var1);

   fkp a(int var1, int var2);

   fkp a(int var1, int var2, int var3, int var4);

   fkp b(int var1);

   fkp c(int var1);

   fkp d(int var1);

   fkp e(int var1);

   fkp f(int var1);

   fkp g(int var1);

   fkp a(float var1, float var2);

   fkp a(float var1);

   fkp b(float var1);

   default fkp a() {
      return this.a(0.0F);
   }

   default fkp b() {
      return this.a(0.5F);
   }

   default fkp c() {
      return this.a(1.0F);
   }

   default fkp d() {
      return this.b(0.0F);
   }

   default fkp e() {
      return this.b(0.5F);
   }

   default fkp f() {
      return this.b(1.0F);
   }

   fkp g();

   fkp.a h();

   static fkp i() {
      return new fkp.a();
   }

   public static class a implements fkp {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fkp.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fkp.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fkp.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fkp.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fkp.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fkp.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fkp.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fkp.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fkp.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fkp.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fkp.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fkp.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fkp.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fkp.a j() {
         return new fkp.a(this);
      }

      @Override
      public fkp.a h() {
         return this;
      }
   }
}

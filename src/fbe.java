public interface fbe {
   fbe a(int var1);

   fbe a(int var1, int var2);

   fbe a(int var1, int var2, int var3, int var4);

   fbe b(int var1);

   fbe c(int var1);

   fbe d(int var1);

   fbe e(int var1);

   fbe f(int var1);

   fbe g(int var1);

   fbe a(float var1, float var2);

   fbe a(float var1);

   fbe b(float var1);

   default fbe a() {
      return this.a(0.0F);
   }

   default fbe b() {
      return this.a(0.5F);
   }

   default fbe c() {
      return this.a(1.0F);
   }

   default fbe d() {
      return this.b(0.0F);
   }

   default fbe e() {
      return this.b(0.5F);
   }

   default fbe f() {
      return this.b(1.0F);
   }

   fbe g();

   fbe.a h();

   static fbe i() {
      return new fbe.a();
   }

   public static class a implements fbe {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fbe.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fbe.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fbe.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fbe.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fbe.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fbe.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fbe.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fbe.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fbe.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fbe.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fbe.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fbe.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fbe.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fbe.a j() {
         return new fbe.a(this);
      }

      @Override
      public fbe.a h() {
         return this;
      }
   }
}

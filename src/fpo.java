public interface fpo {
   fpo a(int var1);

   fpo a(int var1, int var2);

   fpo a(int var1, int var2, int var3, int var4);

   fpo b(int var1);

   fpo c(int var1);

   fpo d(int var1);

   fpo e(int var1);

   fpo f(int var1);

   fpo g(int var1);

   fpo a(float var1, float var2);

   fpo a(float var1);

   fpo b(float var1);

   default fpo a() {
      return this.a(0.0F);
   }

   default fpo b() {
      return this.a(0.5F);
   }

   default fpo c() {
      return this.a(1.0F);
   }

   default fpo d() {
      return this.b(0.0F);
   }

   default fpo e() {
      return this.b(0.5F);
   }

   default fpo f() {
      return this.b(1.0F);
   }

   fpo g();

   fpo.a h();

   static fpo i() {
      return new fpo.a();
   }

   public static class a implements fpo {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fpo.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fpo.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fpo.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fpo.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fpo.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fpo.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fpo.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fpo.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fpo.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fpo.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fpo.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fpo.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fpo.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fpo.a j() {
         return new fpo.a(this);
      }

      @Override
      public fpo.a h() {
         return this;
      }
   }
}

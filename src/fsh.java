public interface fsh {
   fsh a(int var1);

   fsh a(int var1, int var2);

   fsh a(int var1, int var2, int var3, int var4);

   fsh b(int var1);

   fsh c(int var1);

   fsh d(int var1);

   fsh e(int var1);

   fsh f(int var1);

   fsh g(int var1);

   fsh a(float var1, float var2);

   fsh a(float var1);

   fsh b(float var1);

   default fsh a() {
      return this.a(0.0F);
   }

   default fsh b() {
      return this.a(0.5F);
   }

   default fsh c() {
      return this.a(1.0F);
   }

   default fsh d() {
      return this.b(0.0F);
   }

   default fsh e() {
      return this.b(0.5F);
   }

   default fsh f() {
      return this.b(1.0F);
   }

   fsh g();

   fsh.a h();

   static fsh i() {
      return new fsh.a();
   }

   public static class a implements fsh {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fsh.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fsh.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fsh.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fsh.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fsh.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fsh.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fsh.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fsh.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fsh.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fsh.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fsh.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fsh.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fsh.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fsh.a j() {
         return new fsh.a(this);
      }

      @Override
      public fsh.a h() {
         return this;
      }
   }
}

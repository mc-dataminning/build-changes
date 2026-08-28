public interface fkt {
   fkt a(int var1);

   fkt a(int var1, int var2);

   fkt a(int var1, int var2, int var3, int var4);

   fkt b(int var1);

   fkt c(int var1);

   fkt d(int var1);

   fkt e(int var1);

   fkt f(int var1);

   fkt g(int var1);

   fkt a(float var1, float var2);

   fkt a(float var1);

   fkt b(float var1);

   default fkt a() {
      return this.a(0.0F);
   }

   default fkt b() {
      return this.a(0.5F);
   }

   default fkt c() {
      return this.a(1.0F);
   }

   default fkt d() {
      return this.b(0.0F);
   }

   default fkt e() {
      return this.b(0.5F);
   }

   default fkt f() {
      return this.b(1.0F);
   }

   fkt g();

   fkt.a h();

   static fkt i() {
      return new fkt.a();
   }

   public static class a implements fkt {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fkt.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fkt.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fkt.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fkt.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fkt.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fkt.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fkt.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fkt.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fkt.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fkt.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fkt.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fkt.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fkt.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fkt.a j() {
         return new fkt.a(this);
      }

      @Override
      public fkt.a h() {
         return this;
      }
   }
}

public interface fsk {
   fsk a(int var1);

   fsk a(int var1, int var2);

   fsk a(int var1, int var2, int var3, int var4);

   fsk b(int var1);

   fsk c(int var1);

   fsk d(int var1);

   fsk e(int var1);

   fsk f(int var1);

   fsk g(int var1);

   fsk a(float var1, float var2);

   fsk a(float var1);

   fsk b(float var1);

   default fsk a() {
      return this.a(0.0F);
   }

   default fsk b() {
      return this.a(0.5F);
   }

   default fsk c() {
      return this.a(1.0F);
   }

   default fsk d() {
      return this.b(0.0F);
   }

   default fsk e() {
      return this.b(0.5F);
   }

   default fsk f() {
      return this.b(1.0F);
   }

   fsk g();

   fsk.a h();

   static fsk i() {
      return new fsk.a();
   }

   public static class a implements fsk {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fsk.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fsk.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fsk.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fsk.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fsk.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fsk.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fsk.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fsk.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fsk.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fsk.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fsk.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fsk.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fsk.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fsk.a j() {
         return new fsk.a(this);
      }

      @Override
      public fsk.a h() {
         return this;
      }
   }
}

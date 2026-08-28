public interface fsl {
   fsl a(int var1);

   fsl a(int var1, int var2);

   fsl a(int var1, int var2, int var3, int var4);

   fsl b(int var1);

   fsl c(int var1);

   fsl d(int var1);

   fsl e(int var1);

   fsl f(int var1);

   fsl g(int var1);

   fsl a(float var1, float var2);

   fsl a(float var1);

   fsl b(float var1);

   default fsl a() {
      return this.a(0.0F);
   }

   default fsl b() {
      return this.a(0.5F);
   }

   default fsl c() {
      return this.a(1.0F);
   }

   default fsl d() {
      return this.b(0.0F);
   }

   default fsl e() {
      return this.b(0.5F);
   }

   default fsl f() {
      return this.b(1.0F);
   }

   fsl g();

   fsl.a h();

   static fsl i() {
      return new fsl.a();
   }

   public static class a implements fsl {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fsl.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fsl.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fsl.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fsl.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fsl.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fsl.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fsl.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fsl.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fsl.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fsl.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fsl.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fsl.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fsl.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fsl.a j() {
         return new fsl.a(this);
      }

      @Override
      public fsl.a h() {
         return this;
      }
   }
}

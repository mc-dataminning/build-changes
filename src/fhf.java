public interface fhf {
   fhf a(int var1);

   fhf a(int var1, int var2);

   fhf a(int var1, int var2, int var3, int var4);

   fhf b(int var1);

   fhf c(int var1);

   fhf d(int var1);

   fhf e(int var1);

   fhf f(int var1);

   fhf g(int var1);

   fhf a(float var1, float var2);

   fhf a(float var1);

   fhf b(float var1);

   default fhf a() {
      return this.a(0.0F);
   }

   default fhf b() {
      return this.a(0.5F);
   }

   default fhf c() {
      return this.a(1.0F);
   }

   default fhf d() {
      return this.b(0.0F);
   }

   default fhf e() {
      return this.b(0.5F);
   }

   default fhf f() {
      return this.b(1.0F);
   }

   fhf g();

   fhf.a h();

   static fhf i() {
      return new fhf.a();
   }

   public static class a implements fhf {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fhf.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fhf.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fhf.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fhf.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fhf.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fhf.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fhf.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fhf.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fhf.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fhf.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fhf.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fhf.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fhf.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fhf.a j() {
         return new fhf.a(this);
      }

      @Override
      public fhf.a h() {
         return this;
      }
   }
}

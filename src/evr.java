public interface evr {
   evr a(int var1);

   evr a(int var1, int var2);

   evr a(int var1, int var2, int var3, int var4);

   evr b(int var1);

   evr c(int var1);

   evr d(int var1);

   evr e(int var1);

   evr f(int var1);

   evr g(int var1);

   evr a(float var1, float var2);

   evr a(float var1);

   evr b(float var1);

   default evr a() {
      return this.a(0.0F);
   }

   default evr b() {
      return this.a(0.5F);
   }

   default evr c() {
      return this.a(1.0F);
   }

   default evr d() {
      return this.b(0.0F);
   }

   default evr e() {
      return this.b(0.5F);
   }

   default evr f() {
      return this.b(1.0F);
   }

   evr g();

   evr.a h();

   static evr i() {
      return new evr.a();
   }

   public static class a implements evr {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(evr.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public evr.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public evr.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public evr.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public evr.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public evr.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public evr.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public evr.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public evr.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public evr.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public evr.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public evr.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public evr.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public evr.a j() {
         return new evr.a(this);
      }

      @Override
      public evr.a h() {
         return this;
      }
   }
}

public interface evx {
   evx a(int var1);

   evx a(int var1, int var2);

   evx a(int var1, int var2, int var3, int var4);

   evx b(int var1);

   evx c(int var1);

   evx d(int var1);

   evx e(int var1);

   evx f(int var1);

   evx g(int var1);

   evx a(float var1, float var2);

   evx a(float var1);

   evx b(float var1);

   default evx a() {
      return this.a(0.0F);
   }

   default evx b() {
      return this.a(0.5F);
   }

   default evx c() {
      return this.a(1.0F);
   }

   default evx d() {
      return this.b(0.0F);
   }

   default evx e() {
      return this.b(0.5F);
   }

   default evx f() {
      return this.b(1.0F);
   }

   evx g();

   evx.a h();

   static evx i() {
      return new evx.a();
   }

   public static class a implements evx {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(evx.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public evx.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public evx.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public evx.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public evx.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public evx.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public evx.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public evx.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public evx.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public evx.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public evx.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public evx.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public evx.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public evx.a j() {
         return new evx.a(this);
      }

      @Override
      public evx.a h() {
         return this;
      }
   }
}

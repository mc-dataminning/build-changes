public interface evs {
   evs a(int var1);

   evs a(int var1, int var2);

   evs a(int var1, int var2, int var3, int var4);

   evs b(int var1);

   evs c(int var1);

   evs d(int var1);

   evs e(int var1);

   evs f(int var1);

   evs g(int var1);

   evs a(float var1, float var2);

   evs a(float var1);

   evs b(float var1);

   default evs a() {
      return this.a(0.0F);
   }

   default evs b() {
      return this.a(0.5F);
   }

   default evs c() {
      return this.a(1.0F);
   }

   default evs d() {
      return this.b(0.0F);
   }

   default evs e() {
      return this.b(0.5F);
   }

   default evs f() {
      return this.b(1.0F);
   }

   evs g();

   evs.a h();

   static evs i() {
      return new evs.a();
   }

   public static class a implements evs {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(evs.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public evs.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public evs.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public evs.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public evs.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public evs.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public evs.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public evs.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public evs.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public evs.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public evs.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public evs.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public evs.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public evs.a j() {
         return new evs.a(this);
      }

      @Override
      public evs.a h() {
         return this;
      }
   }
}

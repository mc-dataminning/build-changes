public interface evn {
   evn a(int var1);

   evn a(int var1, int var2);

   evn a(int var1, int var2, int var3, int var4);

   evn b(int var1);

   evn c(int var1);

   evn d(int var1);

   evn e(int var1);

   evn f(int var1);

   evn g(int var1);

   evn a(float var1, float var2);

   evn a(float var1);

   evn b(float var1);

   default evn a() {
      return this.a(0.0F);
   }

   default evn b() {
      return this.a(0.5F);
   }

   default evn c() {
      return this.a(1.0F);
   }

   default evn d() {
      return this.b(0.0F);
   }

   default evn e() {
      return this.b(0.5F);
   }

   default evn f() {
      return this.b(1.0F);
   }

   evn g();

   evn.a h();

   static evn i() {
      return new evn.a();
   }

   public static class a implements evn {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(evn.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public evn.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public evn.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public evn.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public evn.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public evn.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public evn.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public evn.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public evn.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public evn.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public evn.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public evn.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public evn.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public evn.a j() {
         return new evn.a(this);
      }

      @Override
      public evn.a h() {
         return this;
      }
   }
}

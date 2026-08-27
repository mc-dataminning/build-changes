public interface fik {
   fik a(int var1);

   fik a(int var1, int var2);

   fik a(int var1, int var2, int var3, int var4);

   fik b(int var1);

   fik c(int var1);

   fik d(int var1);

   fik e(int var1);

   fik f(int var1);

   fik g(int var1);

   fik a(float var1, float var2);

   fik a(float var1);

   fik b(float var1);

   default fik a() {
      return this.a(0.0F);
   }

   default fik b() {
      return this.a(0.5F);
   }

   default fik c() {
      return this.a(1.0F);
   }

   default fik d() {
      return this.b(0.0F);
   }

   default fik e() {
      return this.b(0.5F);
   }

   default fik f() {
      return this.b(1.0F);
   }

   fik g();

   fik.a h();

   static fik i() {
      return new fik.a();
   }

   public static class a implements fik {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fik.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fik.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fik.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fik.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fik.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fik.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fik.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fik.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fik.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fik.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fik.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fik.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fik.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fik.a j() {
         return new fik.a(this);
      }

      @Override
      public fik.a h() {
         return this;
      }
   }
}

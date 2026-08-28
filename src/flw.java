public interface flw {
   flw a(int var1);

   flw a(int var1, int var2);

   flw a(int var1, int var2, int var3, int var4);

   flw b(int var1);

   flw c(int var1);

   flw d(int var1);

   flw e(int var1);

   flw f(int var1);

   flw g(int var1);

   flw a(float var1, float var2);

   flw a(float var1);

   flw b(float var1);

   default flw a() {
      return this.a(0.0F);
   }

   default flw b() {
      return this.a(0.5F);
   }

   default flw c() {
      return this.a(1.0F);
   }

   default flw d() {
      return this.b(0.0F);
   }

   default flw e() {
      return this.b(0.5F);
   }

   default flw f() {
      return this.b(1.0F);
   }

   flw g();

   flw.a h();

   static flw i() {
      return new flw.a();
   }

   public static class a implements flw {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(flw.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public flw.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public flw.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public flw.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public flw.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public flw.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public flw.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public flw.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public flw.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public flw.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public flw.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public flw.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public flw.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public flw.a j() {
         return new flw.a(this);
      }

      @Override
      public flw.a h() {
         return this;
      }
   }
}

public interface eww {
   eww a(int var1);

   eww a(int var1, int var2);

   eww a(int var1, int var2, int var3, int var4);

   eww b(int var1);

   eww c(int var1);

   eww d(int var1);

   eww e(int var1);

   eww f(int var1);

   eww g(int var1);

   eww a(float var1, float var2);

   eww a(float var1);

   eww b(float var1);

   default eww a() {
      return this.a(0.0F);
   }

   default eww b() {
      return this.a(0.5F);
   }

   default eww c() {
      return this.a(1.0F);
   }

   default eww d() {
      return this.b(0.0F);
   }

   default eww e() {
      return this.b(0.5F);
   }

   default eww f() {
      return this.b(1.0F);
   }

   eww g();

   eww.a h();

   static eww i() {
      return new eww.a();
   }

   public static class a implements eww {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(eww.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public eww.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public eww.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public eww.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public eww.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public eww.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public eww.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public eww.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public eww.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public eww.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public eww.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public eww.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public eww.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public eww.a j() {
         return new eww.a(this);
      }

      @Override
      public eww.a h() {
         return this;
      }
   }
}

public interface fcw {
   fcw a(int var1);

   fcw a(int var1, int var2);

   fcw a(int var1, int var2, int var3, int var4);

   fcw b(int var1);

   fcw c(int var1);

   fcw d(int var1);

   fcw e(int var1);

   fcw f(int var1);

   fcw g(int var1);

   fcw a(float var1, float var2);

   fcw a(float var1);

   fcw b(float var1);

   default fcw a() {
      return this.a(0.0F);
   }

   default fcw b() {
      return this.a(0.5F);
   }

   default fcw c() {
      return this.a(1.0F);
   }

   default fcw d() {
      return this.b(0.0F);
   }

   default fcw e() {
      return this.b(0.5F);
   }

   default fcw f() {
      return this.b(1.0F);
   }

   fcw g();

   fcw.a h();

   static fcw i() {
      return new fcw.a();
   }

   public static class a implements fcw {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fcw.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fcw.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fcw.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fcw.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fcw.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fcw.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fcw.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fcw.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fcw.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fcw.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fcw.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fcw.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fcw.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fcw.a j() {
         return new fcw.a(this);
      }

      @Override
      public fcw.a h() {
         return this;
      }
   }
}

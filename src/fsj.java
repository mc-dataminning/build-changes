public interface fsj {
   fsj a(int var1);

   fsj a(int var1, int var2);

   fsj a(int var1, int var2, int var3, int var4);

   fsj b(int var1);

   fsj c(int var1);

   fsj d(int var1);

   fsj e(int var1);

   fsj f(int var1);

   fsj g(int var1);

   fsj a(float var1, float var2);

   fsj a(float var1);

   fsj b(float var1);

   default fsj a() {
      return this.a(0.0F);
   }

   default fsj b() {
      return this.a(0.5F);
   }

   default fsj c() {
      return this.a(1.0F);
   }

   default fsj d() {
      return this.b(0.0F);
   }

   default fsj e() {
      return this.b(0.5F);
   }

   default fsj f() {
      return this.b(1.0F);
   }

   fsj g();

   fsj.a h();

   static fsj i() {
      return new fsj.a();
   }

   public static class a implements fsj {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fsj.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fsj.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fsj.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fsj.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fsj.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fsj.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fsj.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fsj.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fsj.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fsj.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fsj.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fsj.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fsj.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fsj.a j() {
         return new fsj.a(this);
      }

      @Override
      public fsj.a h() {
         return this;
      }
   }
}

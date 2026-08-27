public interface fas {
   fas a(int var1);

   fas a(int var1, int var2);

   fas a(int var1, int var2, int var3, int var4);

   fas b(int var1);

   fas c(int var1);

   fas d(int var1);

   fas e(int var1);

   fas f(int var1);

   fas g(int var1);

   fas a(float var1, float var2);

   fas a(float var1);

   fas b(float var1);

   default fas a() {
      return this.a(0.0F);
   }

   default fas b() {
      return this.a(0.5F);
   }

   default fas c() {
      return this.a(1.0F);
   }

   default fas d() {
      return this.b(0.0F);
   }

   default fas e() {
      return this.b(0.5F);
   }

   default fas f() {
      return this.b(1.0F);
   }

   fas g();

   fas.a h();

   static fas i() {
      return new fas.a();
   }

   public static class a implements fas {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fas.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fas.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fas.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fas.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fas.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fas.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fas.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fas.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fas.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fas.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fas.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fas.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fas.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fas.a j() {
         return new fas.a(this);
      }

      @Override
      public fas.a h() {
         return this;
      }
   }
}

public interface flc {
   flc a(int var1);

   flc a(int var1, int var2);

   flc a(int var1, int var2, int var3, int var4);

   flc b(int var1);

   flc c(int var1);

   flc d(int var1);

   flc e(int var1);

   flc f(int var1);

   flc g(int var1);

   flc a(float var1, float var2);

   flc a(float var1);

   flc b(float var1);

   default flc a() {
      return this.a(0.0F);
   }

   default flc b() {
      return this.a(0.5F);
   }

   default flc c() {
      return this.a(1.0F);
   }

   default flc d() {
      return this.b(0.0F);
   }

   default flc e() {
      return this.b(0.5F);
   }

   default flc f() {
      return this.b(1.0F);
   }

   flc g();

   flc.a h();

   static flc i() {
      return new flc.a();
   }

   public static class a implements flc {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(flc.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public flc.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public flc.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public flc.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public flc.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public flc.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public flc.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public flc.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public flc.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public flc.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public flc.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public flc.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public flc.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public flc.a j() {
         return new flc.a(this);
      }

      @Override
      public flc.a h() {
         return this;
      }
   }
}

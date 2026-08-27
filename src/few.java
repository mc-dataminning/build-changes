public interface few {
   few a(int var1);

   few a(int var1, int var2);

   few a(int var1, int var2, int var3, int var4);

   few b(int var1);

   few c(int var1);

   few d(int var1);

   few e(int var1);

   few f(int var1);

   few g(int var1);

   few a(float var1, float var2);

   few a(float var1);

   few b(float var1);

   default few a() {
      return this.a(0.0F);
   }

   default few b() {
      return this.a(0.5F);
   }

   default few c() {
      return this.a(1.0F);
   }

   default few d() {
      return this.b(0.0F);
   }

   default few e() {
      return this.b(0.5F);
   }

   default few f() {
      return this.b(1.0F);
   }

   few g();

   few.a h();

   static few i() {
      return new few.a();
   }

   public static class a implements few {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(few.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public few.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public few.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public few.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public few.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public few.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public few.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public few.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public few.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public few.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public few.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public few.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public few.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public few.a j() {
         return new few.a(this);
      }

      @Override
      public few.a h() {
         return this;
      }
   }
}

public interface fks {
   fks a(int var1);

   fks a(int var1, int var2);

   fks a(int var1, int var2, int var3, int var4);

   fks b(int var1);

   fks c(int var1);

   fks d(int var1);

   fks e(int var1);

   fks f(int var1);

   fks g(int var1);

   fks a(float var1, float var2);

   fks a(float var1);

   fks b(float var1);

   default fks a() {
      return this.a(0.0F);
   }

   default fks b() {
      return this.a(0.5F);
   }

   default fks c() {
      return this.a(1.0F);
   }

   default fks d() {
      return this.b(0.0F);
   }

   default fks e() {
      return this.b(0.5F);
   }

   default fks f() {
      return this.b(1.0F);
   }

   fks g();

   fks.a h();

   static fks i() {
      return new fks.a();
   }

   public static class a implements fks {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fks.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fks.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fks.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fks.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fks.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fks.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fks.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fks.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fks.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fks.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fks.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fks.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fks.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fks.a j() {
         return new fks.a(this);
      }

      @Override
      public fks.a h() {
         return this;
      }
   }
}

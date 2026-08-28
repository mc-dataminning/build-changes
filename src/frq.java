public interface frq {
   frq a(int var1);

   frq a(int var1, int var2);

   frq a(int var1, int var2, int var3, int var4);

   frq b(int var1);

   frq c(int var1);

   frq d(int var1);

   frq e(int var1);

   frq f(int var1);

   frq g(int var1);

   frq a(float var1, float var2);

   frq a(float var1);

   frq b(float var1);

   default frq a() {
      return this.a(0.0F);
   }

   default frq b() {
      return this.a(0.5F);
   }

   default frq c() {
      return this.a(1.0F);
   }

   default frq d() {
      return this.b(0.0F);
   }

   default frq e() {
      return this.b(0.5F);
   }

   default frq f() {
      return this.b(1.0F);
   }

   frq g();

   frq.a h();

   static frq i() {
      return new frq.a();
   }

   public static class a implements frq {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(frq.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public frq.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public frq.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public frq.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public frq.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public frq.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public frq.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public frq.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public frq.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public frq.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public frq.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public frq.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public frq.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public frq.a j() {
         return new frq.a(this);
      }

      @Override
      public frq.a h() {
         return this;
      }
   }
}

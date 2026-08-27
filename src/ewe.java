public interface ewe {
   ewe a(int var1);

   ewe a(int var1, int var2);

   ewe a(int var1, int var2, int var3, int var4);

   ewe b(int var1);

   ewe c(int var1);

   ewe d(int var1);

   ewe e(int var1);

   ewe f(int var1);

   ewe g(int var1);

   ewe a(float var1, float var2);

   ewe a(float var1);

   ewe b(float var1);

   default ewe a() {
      return this.a(0.0F);
   }

   default ewe b() {
      return this.a(0.5F);
   }

   default ewe c() {
      return this.a(1.0F);
   }

   default ewe d() {
      return this.b(0.0F);
   }

   default ewe e() {
      return this.b(0.5F);
   }

   default ewe f() {
      return this.b(1.0F);
   }

   ewe g();

   ewe.a h();

   static ewe i() {
      return new ewe.a();
   }

   public static class a implements ewe {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(ewe.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public ewe.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public ewe.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public ewe.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public ewe.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public ewe.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public ewe.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public ewe.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public ewe.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public ewe.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public ewe.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public ewe.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public ewe.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public ewe.a j() {
         return new ewe.a(this);
      }

      @Override
      public ewe.a h() {
         return this;
      }
   }
}

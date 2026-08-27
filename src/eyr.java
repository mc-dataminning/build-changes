public interface eyr {
   eyr a(int var1);

   eyr a(int var1, int var2);

   eyr a(int var1, int var2, int var3, int var4);

   eyr b(int var1);

   eyr c(int var1);

   eyr d(int var1);

   eyr e(int var1);

   eyr f(int var1);

   eyr g(int var1);

   eyr a(float var1, float var2);

   eyr a(float var1);

   eyr b(float var1);

   default eyr a() {
      return this.a(0.0F);
   }

   default eyr b() {
      return this.a(0.5F);
   }

   default eyr c() {
      return this.a(1.0F);
   }

   default eyr d() {
      return this.b(0.0F);
   }

   default eyr e() {
      return this.b(0.5F);
   }

   default eyr f() {
      return this.b(1.0F);
   }

   eyr g();

   eyr.a h();

   static eyr i() {
      return new eyr.a();
   }

   public static class a implements eyr {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(eyr.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public eyr.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public eyr.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public eyr.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public eyr.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public eyr.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public eyr.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public eyr.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public eyr.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public eyr.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public eyr.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public eyr.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public eyr.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public eyr.a j() {
         return new eyr.a(this);
      }

      @Override
      public eyr.a h() {
         return this;
      }
   }
}

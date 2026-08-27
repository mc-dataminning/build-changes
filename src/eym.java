public interface eym {
   eym a(int var1);

   eym a(int var1, int var2);

   eym a(int var1, int var2, int var3, int var4);

   eym b(int var1);

   eym c(int var1);

   eym d(int var1);

   eym e(int var1);

   eym f(int var1);

   eym g(int var1);

   eym a(float var1, float var2);

   eym a(float var1);

   eym b(float var1);

   default eym a() {
      return this.a(0.0F);
   }

   default eym b() {
      return this.a(0.5F);
   }

   default eym c() {
      return this.a(1.0F);
   }

   default eym d() {
      return this.b(0.0F);
   }

   default eym e() {
      return this.b(0.5F);
   }

   default eym f() {
      return this.b(1.0F);
   }

   eym g();

   eym.a h();

   static eym i() {
      return new eym.a();
   }

   public static class a implements eym {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(eym.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public eym.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public eym.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public eym.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public eym.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public eym.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public eym.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public eym.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public eym.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public eym.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public eym.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public eym.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public eym.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public eym.a j() {
         return new eym.a(this);
      }

      @Override
      public eym.a h() {
         return this;
      }
   }
}

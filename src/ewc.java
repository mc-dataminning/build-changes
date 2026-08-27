public interface ewc {
   ewc a(int var1);

   ewc a(int var1, int var2);

   ewc a(int var1, int var2, int var3, int var4);

   ewc b(int var1);

   ewc c(int var1);

   ewc d(int var1);

   ewc e(int var1);

   ewc f(int var1);

   ewc g(int var1);

   ewc a(float var1, float var2);

   ewc a(float var1);

   ewc b(float var1);

   default ewc a() {
      return this.a(0.0F);
   }

   default ewc b() {
      return this.a(0.5F);
   }

   default ewc c() {
      return this.a(1.0F);
   }

   default ewc d() {
      return this.b(0.0F);
   }

   default ewc e() {
      return this.b(0.5F);
   }

   default ewc f() {
      return this.b(1.0F);
   }

   ewc g();

   ewc.a h();

   static ewc i() {
      return new ewc.a();
   }

   public static class a implements ewc {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(ewc.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public ewc.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public ewc.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public ewc.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public ewc.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public ewc.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public ewc.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public ewc.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public ewc.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public ewc.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public ewc.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public ewc.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public ewc.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public ewc.a j() {
         return new ewc.a(this);
      }

      @Override
      public ewc.a h() {
         return this;
      }
   }
}

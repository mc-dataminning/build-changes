public interface fjp {
   fjp a(int var1);

   fjp a(int var1, int var2);

   fjp a(int var1, int var2, int var3, int var4);

   fjp b(int var1);

   fjp c(int var1);

   fjp d(int var1);

   fjp e(int var1);

   fjp f(int var1);

   fjp g(int var1);

   fjp a(float var1, float var2);

   fjp a(float var1);

   fjp b(float var1);

   default fjp a() {
      return this.a(0.0F);
   }

   default fjp b() {
      return this.a(0.5F);
   }

   default fjp c() {
      return this.a(1.0F);
   }

   default fjp d() {
      return this.b(0.0F);
   }

   default fjp e() {
      return this.b(0.5F);
   }

   default fjp f() {
      return this.b(1.0F);
   }

   fjp g();

   fjp.a h();

   static fjp i() {
      return new fjp.a();
   }

   public static class a implements fjp {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fjp.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fjp.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fjp.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fjp.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fjp.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fjp.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fjp.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fjp.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fjp.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fjp.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fjp.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fjp.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fjp.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fjp.a j() {
         return new fjp.a(this);
      }

      @Override
      public fjp.a h() {
         return this;
      }
   }
}

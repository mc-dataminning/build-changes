public interface fjq {
   fjq a(int var1);

   fjq a(int var1, int var2);

   fjq a(int var1, int var2, int var3, int var4);

   fjq b(int var1);

   fjq c(int var1);

   fjq d(int var1);

   fjq e(int var1);

   fjq f(int var1);

   fjq g(int var1);

   fjq a(float var1, float var2);

   fjq a(float var1);

   fjq b(float var1);

   default fjq a() {
      return this.a(0.0F);
   }

   default fjq b() {
      return this.a(0.5F);
   }

   default fjq c() {
      return this.a(1.0F);
   }

   default fjq d() {
      return this.b(0.0F);
   }

   default fjq e() {
      return this.b(0.5F);
   }

   default fjq f() {
      return this.b(1.0F);
   }

   fjq g();

   fjq.a h();

   static fjq i() {
      return new fjq.a();
   }

   public static class a implements fjq {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fjq.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fjq.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fjq.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fjq.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fjq.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fjq.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fjq.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fjq.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fjq.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fjq.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fjq.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fjq.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fjq.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fjq.a j() {
         return new fjq.a(this);
      }

      @Override
      public fjq.a h() {
         return this;
      }
   }
}

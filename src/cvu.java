import javax.annotation.Nullable;

class cvu extends cxn {
   private final bxu a;
   private final bxd b;
   @Nullable
   private final ali g;

   public cvu(buk $$0, bxu $$1, bxd $$2, int $$3, int $$4, int $$5, @Nullable ali $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(czy $$0, czy $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(czy $$0) {
      return this.a.a($$0, this.b);
   }

   @Override
   public boolean b() {
      return this.a.e(this.b);
   }

   @Override
   public boolean a(crx $$0) {
      czy $$1 = this.g();
      return !$$1.f() && !$$0.b() && dgn.a($$1, dgm.E) ? false : super.a($$0);
   }

   @Nullable
   @Override
   public ali c() {
      return this.g;
   }
}

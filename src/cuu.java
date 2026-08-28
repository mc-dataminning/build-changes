import javax.annotation.Nullable;

class cuu extends cwn {
   private final bxc a;
   private final bwn b;
   @Nullable
   private final alg g;

   public cuu(btu $$0, bxc $$1, bwn $$2, int $$3, int $$4, int $$5, @Nullable alg $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cyy $$0, cyy $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cyy $$0) {
      return this.a.a($$0, this.b);
   }

   @Override
   public boolean b() {
      return this.a.e(this.b);
   }

   @Override
   public boolean a(cqy $$0) {
      cyy $$1 = this.g();
      return !$$1.f() && !$$0.b() && dfn.a($$1, dfm.E) ? false : super.a($$0);
   }

   @Nullable
   @Override
   public alg c() {
      return this.g;
   }
}

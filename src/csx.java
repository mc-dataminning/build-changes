import javax.annotation.Nullable;

class csx extends cuq {
   private final bvx a;
   private final bvj b;
   @Nullable
   private final alp g;

   public csx(bst $$0, bvx $$1, bvj $$2, int $$3, int $$4, int $$5, @Nullable alp $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cxg $$0, cxg $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cxg $$0) {
      return this.b == this.a.f($$0);
   }

   @Override
   public boolean a(cpo $$0) {
      cxg $$1 = this.g();
      return !$$1.f() && !$$0.b() && dds.a($$1, ddr.E) ? false : super.a($$0);
   }

   @Nullable
   @Override
   public alp b() {
      return this.g;
   }
}

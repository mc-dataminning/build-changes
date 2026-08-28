import javax.annotation.Nullable;

class csg extends ctz {
   private final bvg a;
   private final bus b;
   @Nullable
   private final aku g;

   public csg(bsc $$0, bvg $$1, bus $$2, int $$3, int $$4, int $$5, @Nullable aku $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cwp $$0, cwp $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cwp $$0) {
      return this.b == this.a.f($$0);
   }

   @Override
   public boolean a(cox $$0) {
      cwp $$1 = this.g();
      return !$$1.f() && !$$0.b() && ddb.a($$1, dda.E) ? false : super.a($$0);
   }

   @Nullable
   @Override
   public aku b() {
      return this.g;
   }
}

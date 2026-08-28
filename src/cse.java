import javax.annotation.Nullable;

class cse extends ctx {
   private final bvf a;
   private final bur b;
   @Nullable
   private final aku g;

   public cse(bsb $$0, bvf $$1, bur $$2, int $$3, int $$4, int $$5, @Nullable aku $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cwn $$0, cwn $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cwn $$0) {
      return this.b == this.a.f($$0);
   }

   @Override
   public boolean a(cov $$0) {
      cwn $$1 = this.g();
      return !$$1.f() && !$$0.b() && dcz.a($$1, dcy.E) ? false : super.a($$0);
   }

   @Nullable
   @Override
   public aku b() {
      return this.g;
   }
}

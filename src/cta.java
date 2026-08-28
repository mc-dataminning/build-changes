import javax.annotation.Nullable;

class cta extends cut {
   private final bvy a;
   private final bvj b;
   @Nullable
   private final aku g;

   public cta(bsr $$0, bvy $$1, bvj $$2, int $$3, int $$4, int $$5, @Nullable aku $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cxh $$0, cxh $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cxh $$0) {
      return this.b == this.a.f($$0);
   }

   @Override
   public boolean a(cpr $$0) {
      cxh $$1 = this.g();
      return !$$1.f() && !$$0.b() && ddt.a($$1, dds.E) ? false : super.a($$0);
   }

   @Nullable
   @Override
   public aku b() {
      return this.g;
   }
}

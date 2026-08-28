import javax.annotation.Nullable;

class csh extends cua {
   private final bvi a;
   private final buu b;
   @Nullable
   private final akv g;

   public csh(bse $$0, bvi $$1, buu $$2, int $$3, int $$4, int $$5, @Nullable akv $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cwq $$0, cwq $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cwq $$0) {
      return this.b == this.a.f($$0);
   }

   @Override
   public boolean a(coy $$0) {
      cwq $$1 = this.g();
      return !$$1.f() && !$$0.b() && ddc.a($$1, ddb.E) ? false : super.a($$0);
   }

   @Nullable
   @Override
   public akv b() {
      return this.g;
   }
}

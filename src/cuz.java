import javax.annotation.Nullable;

class cuz extends cws {
   private final bxe a;
   private final bwp b;
   @Nullable
   private final alg g;

   public cuz(btw $$0, bxe $$1, bwp $$2, int $$3, int $$4, int $$5, @Nullable alg $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(czd $$0, czd $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(czd $$0) {
      return this.a.a($$0, this.b);
   }

   @Override
   public boolean b() {
      return this.a.e(this.b);
   }

   @Override
   public boolean a(crc $$0) {
      czd $$1 = this.g();
      return !$$1.f() && !$$0.b() && dfs.a($$1, dfr.E) ? false : super.a($$0);
   }

   @Nullable
   @Override
   public alg c() {
      return this.g;
   }
}

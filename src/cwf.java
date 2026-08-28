import javax.annotation.Nullable;

class cwf extends cxz {
   private final byf a;
   private final bxo b;
   @Nullable
   private final alr g;

   public cwf(buv $$0, byf $$1, bxo $$2, int $$3, int $$4, int $$5, @Nullable alr $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(dak $$0, dak $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(dak $$0) {
      return this.a.a($$0, this.b);
   }

   @Override
   public boolean b() {
      return this.a.e(this.b);
   }

   @Override
   public boolean a(csi $$0) {
      dak $$1 = this.g();
      return !$$1.f() && !$$0.gz() && dgz.a($$1, dgy.E) ? false : super.a($$0);
   }

   @Nullable
   @Override
   public alr c() {
      return this.g;
   }
}

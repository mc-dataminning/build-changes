import javax.annotation.Nullable;

class ctr extends cvk {
   private final bwr a;
   private final bwc b;
   @Nullable
   private final ald g;

   public ctr(btj $$0, bwr $$1, bwc $$2, int $$3, int $$4, int $$5, @Nullable ald $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cxy $$0, cxy $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cxy $$0) {
      return this.a.a($$0, this.b);
   }

   @Override
   public boolean b() {
      return this.a.e(this.b);
   }

   @Override
   public boolean a(cqi $$0) {
      cxy $$1 = this.g();
      return !$$1.f() && !$$0.b() && dej.a($$1, dei.E) ? false : super.a($$0);
   }

   @Nullable
   @Override
   public ald c() {
      return this.g;
   }
}

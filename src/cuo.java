import javax.annotation.Nullable;

class cuo extends cwh {
   private final bwz a;
   private final bwk b;
   @Nullable
   private final ale g;

   public cuo(btr $$0, bwz $$1, bwk $$2, int $$3, int $$4, int $$5, @Nullable ale $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cys $$0, cys $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cys $$0) {
      return this.a.a($$0, this.b);
   }

   @Override
   public boolean b() {
      return this.a.e(this.b);
   }

   @Override
   public boolean a(cqs $$0) {
      cys $$1 = this.g();
      return !$$1.f() && !$$0.b() && dfh.a($$1, dfg.E) ? false : super.a($$0);
   }

   @Nullable
   @Override
   public ale c() {
      return this.g;
   }
}

import javax.annotation.Nullable;

class cvw extends cxp {
   private final bxw a;
   private final bxf b;
   @Nullable
   private final alk g;

   public cvw(bum $$0, bxw $$1, bxf $$2, int $$3, int $$4, int $$5, @Nullable alk $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(daa $$0, daa $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(daa $$0) {
      return this.a.a($$0, this.b);
   }

   @Override
   public boolean b() {
      return this.a.e(this.b);
   }

   @Override
   public boolean a(crz $$0) {
      daa $$1 = this.g();
      return !$$1.f() && !$$0.b() && dgp.a($$1, dgo.E) ? false : super.a($$0);
   }

   @Nullable
   @Override
   public alk c() {
      return this.g;
   }
}

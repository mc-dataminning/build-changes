import javax.annotation.Nullable;

class cvg extends cwz {
   private final bxj a;
   private final bws b;
   @Nullable
   private final alg g;

   public cvg(btz $$0, bxj $$1, bws $$2, int $$3, int $$4, int $$5, @Nullable alg $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(czk $$0, czk $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(czk $$0) {
      return this.a.a($$0, this.b);
   }

   @Override
   public boolean b() {
      return this.a.e(this.b);
   }

   @Override
   public boolean a(crj $$0) {
      czk $$1 = this.g();
      return !$$1.f() && !$$0.b() && dfz.a($$1, dfy.E) ? false : super.a($$0);
   }

   @Nullable
   @Override
   public alg c() {
      return this.g;
   }
}

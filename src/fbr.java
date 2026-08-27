public class fbr extends fah {
   private float a = 0.5F;

   public fbr(vs $$0, ezv $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fbr(int $$0, int $$1, vs $$2, ezv $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fbr(int $$0, int $$1, int $$2, int $$3, vs $$4, ezv $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fbr b(int $$0) {
      super.a($$0);
      return this;
   }

   private fbr b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fbr d() {
      return this.b(0.0F);
   }

   public fbr e() {
      return this.b(0.5F);
   }

   public fbr f() {
      return this.b(1.0F);
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      vs $$4 = this.x();
      ezv $$5 = this.a();
      int $$6 = this.w();
      int $$7 = $$5.a($$4);
      int $$8 = this.B() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.C() + (this.u() - 9) / 2;
      avy $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private avy a(vs $$0, int $$1) {
      ezv $$2 = this.a();
      vx $$3 = $$2.a($$0, $$1 - $$2.a(vr.u));
      return st.a().a(vx.a($$3, vr.u));
   }
}

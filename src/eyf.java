public class eyf extends ewv {
   private float a = 0.5F;

   public eyf(vd $$0, ewk $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public eyf(int $$0, int $$1, vd $$2, ewk $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public eyf(int $$0, int $$1, int $$2, int $$3, vd $$4, ewk $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public eyf b(int $$0) {
      super.a($$0);
      return this;
   }

   private eyf b(float $$0) {
      this.a = $$0;
      return this;
   }

   public eyf d() {
      return this.b(0.0F);
   }

   public eyf e() {
      return this.b(0.5F);
   }

   public eyf f() {
      return this.b(1.0F);
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      vd $$4 = this.x();
      ewk $$5 = this.a();
      int $$6 = this.w();
      int $$7 = $$5.a($$4);
      int $$8 = this.B() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.C() + (this.u() - 9) / 2;
      atu $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private atu a(vd $$0, int $$1) {
      ewk $$2 = this.a();
      vi $$3 = $$2.a($$0, $$1 - $$2.a(vc.t));
      return sg.a().a(vi.a($$3, vc.t));
   }
}

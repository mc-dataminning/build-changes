public class eyy extends exo {
   private float a = 0.5F;

   public eyy(vg $$0, exc $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public eyy(int $$0, int $$1, vg $$2, exc $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public eyy(int $$0, int $$1, int $$2, int $$3, vg $$4, exc $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public eyy b(int $$0) {
      super.a($$0);
      return this;
   }

   private eyy b(float $$0) {
      this.a = $$0;
      return this;
   }

   public eyy d() {
      return this.b(0.0F);
   }

   public eyy e() {
      return this.b(0.5F);
   }

   public eyy f() {
      return this.b(1.0F);
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
      vg $$4 = this.x();
      exc $$5 = this.a();
      int $$6 = this.w();
      int $$7 = $$5.a($$4);
      int $$8 = this.B() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.C() + (this.u() - 9) / 2;
      aub $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private aub a(vg $$0, int $$1) {
      exc $$2 = this.a();
      vl $$3 = $$2.a($$0, $$1 - $$2.a(vf.t));
      return sj.a().a(vl.a($$3, vf.t));
   }
}

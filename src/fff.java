public class fff extends fdv {
   private float a = 0.5F;

   public fff(wi $$0, fdj $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fff(int $$0, int $$1, wi $$2, fdj $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fff(int $$0, int $$1, int $$2, int $$3, wi $$4, fdj $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fff b(int $$0) {
      super.a($$0);
      return this;
   }

   private fff b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fff d() {
      return this.b(0.0F);
   }

   public fff e() {
      return this.b(0.5F);
   }

   public fff f() {
      return this.b(1.0F);
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
      wi $$4 = this.y();
      fdj $$5 = this.a();
      int $$6 = this.x();
      int $$7 = $$5.a($$4);
      int $$8 = this.C() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.D() + (this.v() - 9) / 2;
      awy $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private awy a(wi $$0, int $$1) {
      fdj $$2 = this.a();
      wn $$3 = $$2.a($$0, $$1 - $$2.a(wh.u));
      return tj.a().a(wn.a($$3, wh.u));
   }
}

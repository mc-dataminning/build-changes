public class fim extends fhc {
   private float a = 0.5F;

   public fim(xp $$0, fgq $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fim(int $$0, int $$1, xp $$2, fgq $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fim(int $$0, int $$1, int $$2, int $$3, xp $$4, fgq $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fim b(int $$0) {
      super.a($$0);
      return this;
   }

   private fim b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fim c() {
      return this.b(0.0F);
   }

   public fim e() {
      return this.b(0.5F);
   }

   public fim f() {
      return this.b(1.0F);
   }

   @Override
   public void b(fgs $$0, int $$1, int $$2, float $$3) {
      xp $$4 = this.y();
      fgq $$5 = this.a();
      int $$6 = this.x();
      int $$7 = $$5.a($$4);
      int $$8 = this.C() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.D() + (this.v() - 9) / 2;
      ayl $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ayl a(xp $$0, int $$1) {
      fgq $$2 = this.a();
      xu $$3 = $$2.a($$0, $$1 - $$2.a(xo.u));
      return un.a().a(xu.a($$3, xo.u));
   }
}

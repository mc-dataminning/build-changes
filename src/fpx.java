public class fpx extends fol {
   private float a = 0.5F;

   public fpx(wo $$0, fnz $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fpx(int $$0, int $$1, wo $$2, fnz $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fpx(int $$0, int $$1, int $$2, int $$3, wo $$4, fnz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fpx b(int $$0) {
      super.a($$0);
      return this;
   }

   private fpx b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fpx c() {
      return this.b(0.0F);
   }

   public fpx e() {
      return this.b(0.5F);
   }

   public fpx g() {
      return this.b(1.0F);
   }

   @Override
   public void b(fob $$0, int $$1, int $$2, float $$3) {
      wo $$4 = this.B();
      fnz $$5 = this.a();
      int $$6 = this.A();
      int $$7 = $$5.a($$4);
      int $$8 = this.F() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.G() + (this.y() - 9) / 2;
      ayk $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ayk a(wo $$0, int $$1) {
      fnz $$2 = this.a();
      wt $$3 = $$2.a($$0, $$1 - $$2.a(wn.u));
      return tl.a().a(wt.a($$3, wn.u));
   }
}

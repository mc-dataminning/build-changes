public class euq extends etg {
   private float a = 0.5F;

   public euq(ui $$0, esw $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public euq(int $$0, int $$1, ui $$2, esw $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public euq(int $$0, int $$1, int $$2, int $$3, ui $$4, esw $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.i = false;
   }

   public euq i(int $$0) {
      super.a($$0);
      return this;
   }

   private euq b(float $$0) {
      this.a = $$0;
      return this;
   }

   public euq e() {
      return this.b(0.0F);
   }

   public euq f() {
      return this.b(0.5F);
   }

   public euq g() {
      return this.b(1.0F);
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      ui $$4 = this.l();
      esw $$5 = this.a();
      int $$6 = this.k();
      int $$7 = $$5.a($$4);
      int $$8 = this.p() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.r() + (this.i() - 9) / 2;
      ask $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ask a(ui $$0, int $$1) {
      esw $$2 = this.a();
      un $$3 = $$2.a($$0, $$1 - $$2.a(uh.t));
      return ro.a().a(un.a($$3, uh.t));
   }
}

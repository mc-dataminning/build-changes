public class exo extends ewe {
   private float a = 0.5F;

   public exo(vb $$0, evu $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public exo(int $$0, int $$1, vb $$2, evu $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public exo(int $$0, int $$1, int $$2, int $$3, vb $$4, evu $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.i = false;
   }

   public exo i(int $$0) {
      super.a($$0);
      return this;
   }

   private exo b(float $$0) {
      this.a = $$0;
      return this;
   }

   public exo e() {
      return this.b(0.0F);
   }

   public exo f() {
      return this.b(0.5F);
   }

   public exo g() {
      return this.b(1.0F);
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      vb $$4 = this.l();
      evu $$5 = this.a();
      int $$6 = this.k();
      int $$7 = $$5.a($$4);
      int $$8 = this.p() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.r() + (this.i() - 9) / 2;
      atk $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private atk a(vb $$0, int $$1) {
      evu $$2 = this.a();
      vg $$3 = $$2.a($$0, $$1 - $$2.a(va.t));
      return se.a().a(vg.a($$3, va.t));
   }
}

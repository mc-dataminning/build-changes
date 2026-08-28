public class fjb extends fhr {
   private float a = 0.5F;

   public fjb(wu $$0, fhf $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fjb(int $$0, int $$1, wu $$2, fhf $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fjb(int $$0, int $$1, int $$2, int $$3, wu $$4, fhf $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fjb b(int $$0) {
      super.a($$0);
      return this;
   }

   private fjb b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fjb c() {
      return this.b(0.0F);
   }

   public fjb e() {
      return this.b(0.5F);
   }

   public fjb f() {
      return this.b(1.0F);
   }

   @Override
   public void b(fhh $$0, int $$1, int $$2, float $$3) {
      wu $$4 = this.z();
      fhf $$5 = this.a();
      int $$6 = this.y();
      int $$7 = $$5.a($$4);
      int $$8 = this.D() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.E() + (this.w() - 9) / 2;
      axs $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private axs a(wu $$0, int $$1) {
      fhf $$2 = this.a();
      wz $$3 = $$2.a($$0, $$1 - $$2.a(wt.u));
      return ts.a().a(wz.a($$3, wt.u));
   }
}

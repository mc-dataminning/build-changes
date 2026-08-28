public class fry extends frh<cse> {
   private static final alh G = alh.b("textures/gui/container/dispenser.png");

   public fry(cse $$0, cog $$1, xh $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.v = (this.s - this.p.a(this.l)) / 2;
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fkm $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gig::B, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}

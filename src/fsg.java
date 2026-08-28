public class fsg extends frp<csj> {
   private static final ali G = ali.b("textures/gui/container/dispenser.png");

   public fsg(csj $$0, col $$1, xi $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.v = (this.s - this.p.a(this.l)) / 2;
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fku $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gir::B, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}

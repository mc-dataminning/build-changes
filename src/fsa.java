public class fsa extends frp<crx> {
   private static final ali G = ali.b("textures/gui/container/generic_54.png");
   private final int H;

   public fsa(crx $$0, col $$1, xi $$2) {
      super($$0, $$1, $$2);
      int $$3 = 222;
      int $$4 = 114;
      this.H = $$0.m();
      this.u = 114 + this.H * 18;
      this.y = this.u - 94;
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
      $$0.a(gir::B, G, $$4, $$5, 0.0F, 0.0F, this.s, this.H * 18 + 17, 256, 256);
      $$0.a(gir::B, G, $$4, $$5 + this.H * 18 + 17, 0.0F, 126.0F, this.s, 96, 256, 256);
   }
}

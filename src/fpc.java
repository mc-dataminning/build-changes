public class fpc extends fod<cqv> {
   private static final alf D = new alf("textures/gui/container/hopper.png");

   public fpc(cqv $$0, cmy $$1, xp $$2) {
      super($$0, $$1, $$2);
      this.d = 133;
      this.v = this.d - 94;
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fgt $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.d);
   }
}

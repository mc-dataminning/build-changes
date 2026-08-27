public class fek extends fdb<cjc> {
   private static final agt x = new agt("textures/gui/container/shulker_box.png");

   public fek(cjc $$0, ceq $$1, vb $$2) {
      super($$0, $$1, $$2);
      this.k++;
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(evw $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
   }
}

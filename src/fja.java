public class fja extends fie<cmm> {
   private static final ajh x = new ajh("container/grindstone/error");
   private static final ajh y = new ajh("textures/gui/container/grindstone.png");

   public fja(cmm $$0, cir $$1, vu $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fat $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(y, $$4, $$5, 0, 0, this.c, this.k);
      if ((this.p.b(0).h() || this.p.b(1).h()) && !this.p.b(2).h()) {
         $$0.a(x, $$4 + 92, $$5 + 31, 28, 21);
      }
   }
}

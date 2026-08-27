public class fjn extends fie<cng> {
   private static final ajh x = new ajh("textures/gui/container/shulker_box.png");

   public fjn(cng $$0, cir $$1, vu $$2) {
      super($$0, $$1, $$2);
      this.k++;
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
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
   }
}

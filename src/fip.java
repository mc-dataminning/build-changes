public class fip extends fhg<cmm> {
   private static final ajc x = new ajc("textures/gui/container/shulker_box.png");

   public fip(cmm $$0, chz $$1, vs $$2) {
      super($$0, $$1, $$2);
      this.k++;
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(ezx $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
   }
}

public class flv extends fkm<coh> {
   private static final ajt A = new ajt("textures/gui/container/shulker_box.png");

   public flv(coh $$0, cjs $$1, wg $$2) {
      super($$0, $$1, $$2);
      this.d++;
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fdc $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.k - this.c) / 2;
      int $$5 = (this.l - this.d) / 2;
      $$0.a(A, $$4, $$5, 0, 0, this.c, this.d);
   }
}

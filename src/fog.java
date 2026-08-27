public class fog extends fmx<cqn> {
   private static final akn D = new akn("textures/gui/container/shulker_box.png");

   public fog(cqn $$0, clx $$1, wx $$2) {
      super($$0, $$1, $$2);
      this.d++;
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(ffn $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.d);
   }
}

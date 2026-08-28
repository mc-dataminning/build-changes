public class fsz extends fsn<css> {
   private static final alj G = alj.b("textures/gui/container/crafting_table.png");

   public fsz(css $$0, cot $$1, xj $$2) {
      super($$0, new fvp($$0), $$1, $$2);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.v = 29;
   }

   @Override
   protected fqk J() {
      return new fqk(this.C + 5, this.o / 2 - 49);
   }

   @Override
   protected void a(flq $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gjq::B, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}

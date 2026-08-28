public class fov extends fny<cqg> {
   private static final akk D = new akk("container/grindstone/error");
   private static final akk E = new akk("textures/gui/container/grindstone.png");

   public fov(cqg $$0, cmj $$1, wu $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fhf $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.q) / 2;
      $$0.a(E, $$4, $$5, 0, 0, this.c, this.q);
      if ((this.w.b(0).h() || this.w.b(1).h()) && !this.w.b(2).h()) {
         $$0.a(D, $$4 + 92, $$5 + 31, 28, 21);
      }
   }
}

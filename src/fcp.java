public class fcp extends fbt<chk> {
   private static final agi x = new agi("container/grindstone/error");
   private static final agi y = new agi("textures/gui/container/grindstone.png");

   public fcp(chk $$0, cdt $$1, ur $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(euo $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(y, $$4, $$5, 0, 0, this.c, this.k);
      if ((this.p.b(0).g() || this.p.b(1).g()) && !this.p.b(2).g()) {
         $$0.a(x, $$4 + 92, $$5 + 31, 28, 21);
      }
   }
}

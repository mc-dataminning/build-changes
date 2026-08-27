public class fmn extends flr<cof> {
   private static final akf D = new akf("container/grindstone/error");
   private static final akf E = new akf("textures/gui/container/grindstone.png");

   public fmn(cof $$0, ckk $$1, ws $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(feh $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(E, $$4, $$5, 0, 0, this.c, this.d);
      if ((this.w.b(0).h() || this.w.b(1).h()) && !this.w.b(2).h()) {
         $$0.a(D, $$4 + 92, $$5 + 31, 28, 21);
      }
   }
}

public class feo extends fds<cis> {
   private static final ahd x = new ahd("container/grindstone/error");
   private static final ahd y = new ahd("textures/gui/container/grindstone.png");

   public feo(cis $$0, cfa $$1, vd $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(ewm $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(y, $$4, $$5, 0, 0, this.c, this.k);
      if ((this.p.b(0).h() || this.p.b(1).h()) && !this.p.b(2).h()) {
         $$0.a(x, $$4 + 92, $$5 + 31, 28, 21);
      }
   }
}

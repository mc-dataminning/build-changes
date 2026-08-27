public class feq extends fds<cit> {
   private static final ahd x = new ahd("textures/gui/container/hopper.png");

   public feq(cit $$0, cfa $$1, vd $$2) {
      super($$0, $$1, $$2);
      this.k = 133;
      this.o = this.k - 94;
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
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
   }
}

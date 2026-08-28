public class fre extends fqi<crq> {
   private static final alb G = alb.b("container/grindstone/error");
   private static final alb H = alb.b("textures/gui/container/grindstone.png");

   public fre(crq $$0, cno $$1, xd $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fjn $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(ghe::C, H, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if ((this.z.b(0).h() || this.z.b(1).h()) && !this.z.b(2).h()) {
         $$0.a(ghe::C, G, $$4 + 92, $$5 + 31, 28, 21);
      }
   }
}

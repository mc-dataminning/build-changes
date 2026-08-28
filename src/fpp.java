public class fpp extends fot<cqt> {
   private static final akr E = akr.b("container/grindstone/error");
   private static final akr F = akr.b("textures/gui/container/grindstone.png");

   public fpp(cqt $$0, cmw $$1, wz $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fhz $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.r) / 2;
      $$0.a(F, $$4, $$5, 0, 0, this.c, this.r);
      if ((this.x.b(0).h() || this.x.b(1).h()) && !this.x.b(2).h()) {
         $$0.a(E, $$4 + 92, $$5 + 31, 28, 21);
      }
   }
}

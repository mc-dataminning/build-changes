public class fpc extends foq<cqc> implements fpw<cqc> {
   private static final akr E = akr.b("textures/gui/container/generic_54.png");
   private final int F;

   public fpc(cqc $$0, cmw $$1, wz $$2) {
      super($$0, $$1, $$2);
      int $$3 = 222;
      int $$4 = 114;
      this.F = $$0.m();
      this.r = 114 + this.F * 18;
      this.w = this.r - 94;
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fhx $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.r) / 2;
      $$0.a(E, $$4, $$5, 0, 0, this.c, this.F * 18 + 17);
      $$0.a(E, $$4, $$5 + this.F * 18 + 17, 0, 126, this.c, 96);
   }
}

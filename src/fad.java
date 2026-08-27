public class fad extends ezi<cfh> {
   private static final aex x = new aex("container/grindstone/error");
   private static final aex y = new aex("textures/gui/container/grindstone.png");

   public fad(cfh $$0, cbt $$1, tm $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(esf $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(y, $$4, $$5, 0, 0, this.c, this.k);
      if ((this.p.b(0).f() || this.p.b(1).f()) && !this.p.b(2).f()) {
         $$0.a(x, $$4 + 92, $$5 + 31, 28, 21);
      }
   }
}

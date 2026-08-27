public class fsx extends fup<byw, fez<byw>> {
   private static final aey a = new aey("textures/entity/creeper/creeper.png");

   public fsx(ftj.a $$0) {
      super($$0, new fez<>($$0.a(fid.B)), 0.5F);
      this.a(new fwu(this, $$0.f()));
   }

   protected void a(byw $$0, elr $$1, float $$2) {
      float $$3 = $$0.E($$2);
      float $$4 = 1.0F + ary.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = ary.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(byw $$0, float $$1) {
      float $$2 = $$0.E($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : ary.a($$2, 0.5F, 1.0F);
   }

   public aey a(byw $$0) {
      return a;
   }
}

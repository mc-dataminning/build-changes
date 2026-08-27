public class ftu extends fup<bzf, ffs<bzf>> {
   private static final aey a = new aey("textures/entity/zombie/zombie.png");
   private final float i;

   public ftu(ftj.a $$0, float $$1) {
      super($$0, new ffk($$0.a(fid.ab)), 0.5F * $$1);
      this.i = $$1;
      this.a(new fxk<>(this, $$0.d()));
      this.a(new fxh<>(this, new ffk($$0.a(fid.ac)), new ffk($$0.a(fid.ad)), $$0.g()));
   }

   protected void a(bzf $$0, elr $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public aey a(bzf $$0) {
      return a;
   }
}

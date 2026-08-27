public class fsu extends ftp<byu, fex<byu>> {
   private static final aep a = new aep("textures/entity/zombie/zombie.png");
   private final float i;

   public fsu(fsj.a $$0, float $$1) {
      super($$0, new fep($$0.a(fhi.ab)), 0.5F * $$1);
      this.i = $$1;
      this.a(new fwk<>(this, $$0.d()));
      this.a(new fwh<>(this, new fep($$0.a(fhi.ac)), new fep($$0.a(fhi.ad)), $$0.g()));
   }

   protected void a(byu $$0, elh $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public aep a(byu $$0) {
      return a;
   }
}

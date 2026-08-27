public class fto extends fuj<bzj, ffl<bzj>> {
   private static final aez a = new aez("textures/entity/zombie/zombie.png");
   private final float i;

   public fto(ftd.a $$0, float $$1) {
      super($$0, new ffd($$0.a(fhw.ab)), 0.5F * $$1);
      this.i = $$1;
      this.a(new fxe<>(this, $$0.d()));
      this.a(new fxb<>(this, new ffd($$0.a(fhw.ac)), new ffd($$0.a(fhw.ad)), $$0.g()));
   }

   protected void a(bzj $$0, elj $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public aez a(bzj $$0) {
      return a;
   }
}

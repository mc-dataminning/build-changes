public class fsz extends ftu<byw, ffb<byw>> {
   private static final aer a = new aer("textures/entity/zombie/zombie.png");
   private final float i;

   public fsz(fso.a $$0, float $$1) {
      super($$0, new fet($$0.a(fhm.ab)), 0.5F * $$1);
      this.i = $$1;
      this.a(new fwp<>(this, $$0.d()));
      this.a(new fwm<>(this, new fet($$0.a(fhm.ac)), new fet($$0.a(fhm.ad)), $$0.g()));
   }

   protected void a(byw $$0, elg $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public aer a(byw $$0) {
      return a;
   }
}

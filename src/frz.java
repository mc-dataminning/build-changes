public class frz extends ftu<bup, fed<bup>> {
   private static final aer a = new aer("textures/entity/chicken.png");

   public frz(fso.a $$0) {
      super($$0, new fed<>($$0.a(fhm.t)), 0.3F);
   }

   public aer a(bup $$0) {
      return a;
   }

   protected float a(bup $$0, float $$1) {
      float $$2 = arp.i($$1, $$0.bX, $$0.bT);
      float $$3 = arp.i($$1, $$0.bW, $$0.bU);
      return (arp.a($$2) + 1.0F) * $$3;
   }
}

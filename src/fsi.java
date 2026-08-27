public class fsi extends fud<buo, fei<buo>> {
   private static final aer a = new aer("textures/entity/chicken.png");

   public fsi(fsx.a $$0) {
      super($$0, new fei<>($$0.a(fhr.t)), 0.3F);
   }

   public aer a(buo $$0) {
      return a;
   }

   protected float a(buo $$0, float $$1) {
      float $$2 = arp.i($$1, $$0.bX, $$0.bT);
      float $$3 = arp.i($$1, $$0.bW, $$0.bU);
      return (arp.a($$2) + 1.0F) * $$3;
   }
}

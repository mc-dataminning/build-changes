public class fru extends ftp<bun, fdz<bun>> {
   private static final aep a = new aep("textures/entity/chicken.png");

   public fru(fsj.a $$0) {
      super($$0, new fdz<>($$0.a(fhi.t)), 0.3F);
   }

   public aep a(bun $$0) {
      return a;
   }

   protected float a(bun $$0, float $$1) {
      float $$2 = aro.i($$1, $$0.bX, $$0.bT);
      float $$3 = aro.i($$1, $$0.bW, $$0.bU);
      return (aro.a($$2) + 1.0F) * $$3;
   }
}

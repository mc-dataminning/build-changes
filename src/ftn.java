public class ftn extends ftp<byy, ffa<byy>> {
   private static final aep a = new aep("textures/entity/slime/magmacube.png");

   public ftn(fsj.a $$0) {
      super($$0, new ffa<>($$0.a(fhi.au)), 0.25F);
   }

   protected int a(byy $$0, gv $$1) {
      return 15;
   }

   public aep a(byy $$0) {
      return a;
   }

   public void a(byy $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5) {
      this.d = 0.25F * (float)$$0.ga();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(byy $$0, elh $$1, float $$2) {
      int $$3 = $$0.ga();
      float $$4 = aro.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}

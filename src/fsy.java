public class fsy extends ftu<byv, fes<byv>> {
   private static final aer a = new aer("textures/entity/ghast/ghast.png");
   private static final aer i = new aer("textures/entity/ghast/ghast_shooting.png");

   public fsy(fso.a $$0) {
      super($$0, new fes<>($$0.a(fhm.aa)), 1.5F);
   }

   public aer a(byv $$0) {
      return $$0.p() ? i : a;
   }

   protected void a(byv $$0, elg $$1, float $$2) {
      float $$3 = 1.0F;
      float $$4 = 4.5F;
      float $$5 = 4.5F;
      $$1.b(4.5F, 4.5F, 4.5F);
   }
}

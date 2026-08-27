public class ftj extends ftu<buw, ffd<buw>> {
   private static final aer a = new aer("textures/entity/iron_golem/iron_golem.png");

   public ftj(fso.a $$0) {
      super($$0, new ffd<>($$0.a(fhm.ap)), 0.7F);
      this.a(new fwn(this));
      this.a(new fwo(this, $$0.c()));
   }

   public aer a(buw $$0) {
      return a;
   }

   protected void a(buw $$0, elg $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!((double)$$0.aQ.a() < 0.01)) {
         float $$5 = 13.0F;
         float $$6 = $$0.aQ.c($$4) + 6.0F;
         float $$7 = (Math.abs($$6 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$7));
      }
   }
}

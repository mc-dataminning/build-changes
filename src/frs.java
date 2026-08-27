public class frs extends fqe<byb, fdq<byb>> {
   private static final acq a = new acq("textures/entity/villager/villager.png");

   public frs(foy.a $$0) {
      super($$0, new fdq<>($$0.a(fed.bJ)), 0.5F);
      this.a(new fsl<>(this, $$0.f(), $$0.d()));
      this.a(new ftr<>(this, $$0.e(), "villager"));
      this.a(new fsk<>(this, $$0.d()));
   }

   public acq a(byb $$0) {
      return a;
   }

   protected void a(byb $$0, eij $$1, float $$2) {
      float $$3 = 0.9375F;
      if ($$0.h_()) {
         $$3 *= 0.5F;
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}

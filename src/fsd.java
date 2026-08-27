public class fsd extends fpp<bww, fdx<bww>> {
   private static final acq a = new acq("textures/entity/zombie_villager/zombie_villager.png");

   public fsd(foy.a $$0) {
      super($$0, new fdx<>($$0.a(fed.cc)), 0.5F);
      this.a(new fsw<>(this, new fdx($$0.a(fed.cd)), new fdx($$0.a(fed.ce)), $$0.g()));
      this.a(new ftr<>(this, $$0.e(), "zombie_villager"));
   }

   public acq a(bww $$0) {
      return a;
   }

   protected boolean b(bww $$0) {
      return super.a($$0) || $$0.gi();
   }
}

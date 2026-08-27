public class fub extends ftp<bvb, fek<bvb>> {
   private static final aep a = new aep("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fek<bvb> j;
   private final fek<bvb> k;
   private final fek<bvb> l = this.a();

   public fub(fsj.a $$0) {
      super($$0, new ffr<>($$0.a(fhi.aV)), 0.2F);
      this.k = new ffs<>($$0.a(fhi.aW));
      this.j = new fft<>($$0.a(fhi.aX));
   }

   public aep a(bvb $$0) {
      return a;
   }

   public void a(bvb $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5) {
      int $$6 = $$0.gb();
      if ($$6 != this.i) {
         if ($$6 == 0) {
            this.f = this.j;
         } else if ($$6 == 1) {
            this.f = this.k;
         } else {
            this.f = this.l;
         }
      }

      this.i = $$6;
      this.d = 0.1F + 0.1F * (float)$$6;
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(bvb $$0, elh $$1, float $$2, float $$3, float $$4) {
      $$1.a(0.0F, aro.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4);
   }
}

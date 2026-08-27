public class fqq extends fqe<bse, fbf<bse>> {
   private static final acq a = new acq("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fbf<bse> j;
   private final fbf<bse> k;
   private final fbf<bse> l = this.a();

   public fqq(foy.a $$0) {
      super($$0, new fcm<>($$0.a(fed.aV)), 0.2F);
      this.k = new fcn<>($$0.a(fed.aW));
      this.j = new fco<>($$0.a(fed.aX));
   }

   public acq a(bse $$0) {
      return a;
   }

   public void a(bse $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
      int $$6 = $$0.ga();
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

   protected void a(bse $$0, eij $$1, float $$2, float $$3, float $$4) {
      $$1.a(0.0F, apa.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4);
   }
}

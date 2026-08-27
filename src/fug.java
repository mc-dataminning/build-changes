public class fug extends ftu<bvd, feo<bvd>> {
   private static final aer a = new aer("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final feo<bvd> j;
   private final feo<bvd> k;
   private final feo<bvd> l = this.a();

   public fug(fso.a $$0) {
      super($$0, new ffv<>($$0.a(fhm.aV)), 0.2F);
      this.k = new ffw<>($$0.a(fhm.aW));
      this.j = new ffx<>($$0.a(fhm.aX));
   }

   public aer a(bvd $$0) {
      return a;
   }

   public void a(bvd $$0, float $$1, float $$2, elg $$3, fnl $$4, int $$5) {
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

   protected void a(bvd $$0, elg $$1, float $$2, float $$3, float $$4) {
      $$1.a(0.0F, arp.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4);
   }
}

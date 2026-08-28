public class fsg extends frh<csl> {
   private static final alh G = alh.b("container/horse/chest_slots");
   private static final alh H = alh.b("container/horse/saddle_slot");
   private static final alh I = alh.b("container/horse/llama_armor_slot");
   private static final alh J = alh.b("container/horse/armor_slot");
   private static final alh K = alh.b("textures/gui/container/horse.png");
   private final ciq L;
   private final int M;
   private float N;
   private float O;

   public fsg(csl $$0, cog $$1, ciq $$2, int $$3) {
      super($$0, $$1, $$2.S_());
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected void a(fkm $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gig::B, K, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if (this.M > 0) {
         $$0.a(gig::B, G, 90, 54, 0, 0, $$4 + 79, $$5 + 17, this.M * 18, 54);
      }

      if (this.L.f()) {
         $$0.a(gig::B, H, $$4 + 7, $$5 + 35 - 18, 18, 18);
      }

      if (this.L.e(buh.g)) {
         if (this.L instanceof cit) {
            $$0.a(gig::B, I, $$4 + 7, $$5 + 35, 18, 18);
         } else {
            $$0.a(gig::B, J, $$4 + 7, $$5 + 35, 18, 18);
         }
      }

      fsh.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.N, this.O, this.L);
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      this.N = (float)$$1;
      this.O = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}

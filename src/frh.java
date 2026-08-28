public class frh extends fqi<crs> {
   private static final alb G = alb.b("container/horse/chest_slots");
   private static final alb H = alb.b("container/horse/saddle_slot");
   private static final alb I = alb.b("container/horse/llama_armor_slot");
   private static final alb J = alb.b("container/horse/armor_slot");
   private static final alb K = alb.b("textures/gui/container/horse.png");
   private final chz L;
   private final int M;
   private float N;
   private float O;

   public frh(crs $$0, cno $$1, chz $$2, int $$3) {
      super($$0, $$1, $$2.Q_());
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected void a(fjn $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(ghe::C, K, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if (this.M > 0) {
         $$0.a(ghe::C, G, 90, 54, 0, 0, $$4 + 79, $$5 + 17, this.M * 18, 54);
      }

      if (this.L.f()) {
         $$0.a(ghe::C, H, $$4 + 7, $$5 + 35 - 18, 18, 18);
      }

      if (this.L.e(btr.g)) {
         if (this.L instanceof cic) {
            $$0.a(ghe::C, I, $$4 + 7, $$5 + 35, 18, 18);
         } else {
            $$0.a(ghe::C, J, $$4 + 7, $$5 + 35, 18, 18);
         }
      }

      fri.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.N, this.O, this.L);
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      this.N = (float)$$1;
      this.O = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}

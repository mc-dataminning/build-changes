public class fow extends fnw<cqp> {
   private static final alb D = new alb("container/horse/chest_slots");
   private static final alb E = new alb("container/horse/saddle_slot");
   private static final alb F = new alb("container/horse/llama_armor_slot");
   private static final alb G = new alb("container/horse/armor_slot");
   private static final alb H = new alb("textures/gui/container/horse.png");
   private final che I;
   private float J;
   private float K;

   public fow(cqp $$0, cmr $$1, che $$2) {
      super($$0, $$1, $$2.O_());
      this.I = $$2;
   }

   @Override
   protected void a(fgm $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(H, $$4, $$5, 0, 0, this.c, this.d);
      if (this.I instanceof chd $$6 && $$6.u()) {
         $$0.a(D, 90, 54, 0, 0, $$4 + 79, $$5 + 17, $$6.gy() * 18, 54);
      }

      if (this.I.f()) {
         $$0.a(E, $$4 + 7, $$5 + 35 - 18, 18, 18);
      }

      if (this.I.fS()) {
         if (this.I instanceof chh) {
            $$0.a(F, $$4 + 7, $$5 + 35, 18, 18);
         } else {
            $$0.a(G, $$4 + 7, $$5 + 35, 18, 18);
         }
      }

      fox.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.J, this.K, this.I);
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      this.J = (float)$$1;
      this.K = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}

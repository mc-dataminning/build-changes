public class fqn extends fpn<cqh> {
   private static final akt D = new akt("container/horse/chest_slots");
   private static final akt E = new akt("container/horse/saddle_slot");
   private static final akt F = new akt("container/horse/llama_armor_slot");
   private static final akt G = new akt("container/horse/armor_slot");
   private static final akt H = new akt("textures/gui/container/horse.png");
   private final cgi I;
   private float J;
   private float K;

   public fqn(cqh $$0, clx $$1, cgi $$2) {
      super($$0, $$1, $$2.P_());
      this.I = $$2;
   }

   @Override
   protected void a(fia $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(H, $$4, $$5, 0, 0, this.c, this.d);
      if (this.I instanceof cgh $$6 && $$6.t()) {
         $$0.a(D, 90, 54, 0, 0, $$4 + 79, $$5 + 17, $$6.gG() * 18, 54);
      }

      if (this.I.f()) {
         $$0.a(E, $$4 + 7, $$5 + 35 - 18, 18, 18);
      }

      if (this.I.ga()) {
         if (this.I instanceof cgl) {
            $$0.a(F, $$4 + 7, $$5 + 35, 18, 18);
         } else {
            $$0.a(G, $$4 + 7, $$5 + 35, 18, 18);
         }
      }

      fqo.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.J, this.K, this.I);
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      this.J = (float)$$1;
      this.K = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}

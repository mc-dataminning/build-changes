public class foy extends fny<cqi> {
   private static final akk D = new akk("container/horse/chest_slots");
   private static final akk E = new akk("container/horse/saddle_slot");
   private static final akk F = new akk("container/horse/llama_armor_slot");
   private static final akk G = new akk("container/horse/armor_slot");
   private static final akk H = new akk("textures/gui/container/horse.png");
   private final cgv I;
   private float J;
   private float K;

   public foy(cqi $$0, cmj $$1, cgv $$2) {
      super($$0, $$1, $$2.O_());
      this.I = $$2;
   }

   @Override
   protected void a(fhf $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.q) / 2;
      $$0.a(H, $$4, $$5, 0, 0, this.c, this.q);
      if (this.I instanceof cgu $$6 && $$6.u()) {
         $$0.a(D, 90, 54, 0, 0, $$4 + 79, $$5 + 17, $$6.gw() * 18, 54);
      }

      if (this.I.f()) {
         $$0.a(E, $$4 + 7, $$5 + 35 - 18, 18, 18);
      }

      if (this.I.fP()) {
         if (this.I instanceof cgy) {
            $$0.a(F, $$4 + 7, $$5 + 35, 18, 18);
         } else {
            $$0.a(G, $$4 + 7, $$5 + 35, 18, 18);
         }
      }

      foz.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.J, this.K, this.I);
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      this.J = (float)$$1;
      this.K = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}

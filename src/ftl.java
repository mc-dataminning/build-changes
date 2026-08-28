public class ftl extends fsl<ctb> {
   private static final alj G = alj.b("container/horse/chest_slots");
   private static final alj H = alj.b("container/horse/saddle_slot");
   private static final alj I = alj.b("container/horse/llama_armor_slot");
   private static final alj J = alj.b("container/horse/armor_slot");
   private static final alj K = alj.b("textures/gui/container/horse.png");
   private final cjc L;
   private final int M;
   private float N;
   private float O;

   public ftl(ctb $$0, cot $$1, cjc $$2, int $$3) {
      super($$0, $$1, $$2.o_());
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected void a(flq $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gjq::B, K, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if (this.M > 0) {
         $$0.a(gjq::B, G, 90, 54, 0, 0, $$4 + 79, $$5 + 17, this.M * 18, 54);
      }

      if (this.L.f()) {
         $$0.a(gjq::B, H, $$4 + 7, $$5 + 35 - 18, 18, 18);
      }

      if (this.L.e(but.g)) {
         if (this.L instanceof cjf) {
            $$0.a(gjq::B, I, $$4 + 7, $$5 + 35, 18, 18);
         } else {
            $$0.a(gjq::B, J, $$4 + 7, $$5 + 35, 18, 18);
         }
      }

      ftm.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.N, this.O, this.L);
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      this.N = (float)$$1;
      this.O = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}

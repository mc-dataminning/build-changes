public class flu extends fkv<cnw> {
   private static final ajv A = new ajv("container/horse/chest_slots");
   private static final ajv B = new ajv("container/horse/saddle_slot");
   private static final ajv C = new ajv("container/horse/llama_armor_slot");
   private static final ajv D = new ajv("container/horse/armor_slot");
   private static final ajv E = new ajv("textures/gui/container/horse.png");
   private final cem F;
   private float G;
   private float H;

   public flu(cnw $$0, cjz $$1, cem $$2) {
      super($$0, $$1, $$2.O_());
      this.F = $$2;
   }

   @Override
   protected void a(fdl $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.k - this.c) / 2;
      int $$5 = (this.l - this.d) / 2;
      $$0.a(E, $$4, $$5, 0, 0, this.c, this.d);
      if (this.F instanceof cel $$6 && $$6.u()) {
         $$0.a(A, 90, 54, 0, 0, $$4 + 79, $$5 + 17, $$6.gv() * 18, 54);
      }

      if (this.F.f()) {
         $$0.a(B, $$4 + 7, $$5 + 35 - 18, 18, 18);
      }

      if (this.F.fQ()) {
         if (this.F instanceof cep) {
            $$0.a(C, $$4 + 7, $$5 + 35, 18, 18);
         } else {
            $$0.a(D, $$4 + 7, $$5 + 35, 18, 18);
         }
      }

      flv.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.G, this.H, this.F);
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      this.G = (float)$$1;
      this.H = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}

public class fll extends fkm<cnp> {
   private static final ajt A = new ajt("container/horse/chest_slots");
   private static final ajt B = new ajt("container/horse/saddle_slot");
   private static final ajt C = new ajt("container/horse/llama_armor_slot");
   private static final ajt D = new ajt("container/horse/armor_slot");
   private static final ajt E = new ajt("textures/gui/container/horse.png");
   private final cef F;
   private float G;
   private float H;

   public fll(cnp $$0, cjs $$1, cef $$2) {
      super($$0, $$1, $$2.O_());
      this.F = $$2;
   }

   @Override
   protected void a(fdc $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.k - this.c) / 2;
      int $$5 = (this.l - this.d) / 2;
      $$0.a(E, $$4, $$5, 0, 0, this.c, this.d);
      if (this.F instanceof cee $$6 && $$6.u()) {
         $$0.a(A, 90, 54, 0, 0, $$4 + 79, $$5 + 17, $$6.gv() * 18, 54);
      }

      if (this.F.f()) {
         $$0.a(B, $$4 + 7, $$5 + 35 - 18, 18, 18);
      }

      if (this.F.fQ()) {
         if (this.F instanceof cei) {
            $$0.a(C, $$4 + 7, $$5 + 35, 18, 18);
         } else {
            $$0.a(D, $$4 + 7, $$5 + 35, 18, 18);
         }
      }

      flm.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.G, this.H, this.F);
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      this.G = (float)$$1;
      this.H = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}

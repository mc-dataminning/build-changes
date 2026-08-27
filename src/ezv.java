public class ezv extends eyx<cfc> {
   private static final aer x = new aer("container/horse/chest_slots");
   private static final aer y = new aer("container/horse/saddle_slot");
   private static final aer z = new aer("container/horse/llama_armor_slot");
   private static final aer A = new aer("container/horse/armor_slot");
   private static final aer B = new aer("textures/gui/container/horse.png");
   private final bwj C;
   private float D;
   private float E;

   public ezv(cfc $$0, cbm $$1, bwj $$2) {
      super($$0, $$1, $$2.H_());
      this.C = $$2;
   }

   @Override
   protected void a(erw $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(B, $$4, $$5, 0, 0, this.c, this.k);
      if (this.C instanceof bwi $$6 && $$6.q()) {
         $$0.a(x, 90, 54, 0, 0, $$4 + 79, $$5 + 17, $$6.gh() * 18, 54);
      }

      if (this.C.g()) {
         $$0.a(y, $$4 + 7, $$5 + 35 - 18, 18, 18);
      }

      if (this.C.gI()) {
         if (this.C instanceof bwm) {
            $$0.a(z, $$4 + 7, $$5 + 35, 18, 18);
         } else {
            $$0.a(A, $$4 + 7, $$5 + 35, 18, 18);
         }
      }

      ezw.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.D, this.E, this.C);
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      this.D = (float)$$1;
      this.E = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}

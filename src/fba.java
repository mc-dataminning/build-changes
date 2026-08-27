public class fba extends fac<cgn> {
   private static final afw x = new afw("container/horse/chest_slots");
   private static final afw y = new afw("container/horse/saddle_slot");
   private static final afw z = new afw("container/horse/llama_armor_slot");
   private static final afw A = new afw("container/horse/armor_slot");
   private static final afw B = new afw("textures/gui/container/horse.png");
   private final bxt C;
   private float D;
   private float E;

   public fba(cgn $$0, ccw $$1, bxt $$2) {
      super($$0, $$1, $$2.O_());
      this.C = $$2;
   }

   @Override
   protected void a(esy $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(B, $$4, $$5, 0, 0, this.c, this.k);
      if (this.C instanceof bxs $$6 && $$6.t()) {
         $$0.a(x, 90, 54, 0, 0, $$4 + 79, $$5 + 17, $$6.gm() * 18, 54);
      }

      if (this.C.g()) {
         $$0.a(y, $$4 + 7, $$5 + 35 - 18, 18, 18);
      }

      if (this.C.gN()) {
         if (this.C instanceof bxw) {
            $$0.a(z, $$4 + 7, $$5 + 35, 18, 18);
         } else {
            $$0.a(A, $$4 + 7, $$5 + 35, 18, 18);
         }
      }

      fbb.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.D, this.E, this.C);
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      this.D = (float)$$1;
      this.E = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}

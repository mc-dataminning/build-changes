public class fag extends ezi<cfj> {
   private static final aew x = new aew("container/horse/chest_slots");
   private static final aew y = new aew("container/horse/saddle_slot");
   private static final aew z = new aew("container/horse/llama_armor_slot");
   private static final aew A = new aew("container/horse/armor_slot");
   private static final aew B = new aew("textures/gui/container/horse.png");
   private final bwq C;
   private float D;
   private float E;

   public fag(cfj $$0, cbt $$1, bwq $$2) {
      super($$0, $$1, $$2.N_());
      this.C = $$2;
   }

   @Override
   protected void a(esf $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(B, $$4, $$5, 0, 0, this.c, this.k);
      if (this.C instanceof bwp $$6 && $$6.t()) {
         $$0.a(x, 90, 54, 0, 0, $$4 + 79, $$5 + 17, $$6.gl() * 18, 54);
      }

      if (this.C.g()) {
         $$0.a(y, $$4 + 7, $$5 + 35 - 18, 18, 18);
      }

      if (this.C.gM()) {
         if (this.C instanceof bwt) {
            $$0.a(z, $$4 + 7, $$5 + 35, 18, 18);
         } else {
            $$0.a(A, $$4 + 7, $$5 + 35, 18, 18);
         }
      }

      fah.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.D, this.E, this.C);
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      this.D = (float)$$1;
      this.E = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}

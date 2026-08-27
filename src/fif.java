public class fif extends fhg<clu> {
   private static final ajc x = new ajc("container/horse/chest_slots");
   private static final ajc y = new ajc("container/horse/saddle_slot");
   private static final ajc z = new ajc("container/horse/llama_armor_slot");
   private static final ajc A = new ajc("container/horse/armor_slot");
   private static final ajc B = new ajc("textures/gui/container/horse.png");
   private final cco C;
   private float D;
   private float E;

   public fif(clu $$0, chz $$1, cco $$2) {
      super($$0, $$1, $$2.Q_());
      this.C = $$2;
   }

   @Override
   protected void a(ezx $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(B, $$4, $$5, 0, 0, this.c, this.k);
      if (this.C instanceof ccn $$6 && $$6.w()) {
         $$0.a(x, 90, 54, 0, 0, $$4 + 79, $$5 + 17, $$6.gt() * 18, 54);
      }

      if (this.C.g()) {
         $$0.a(y, $$4 + 7, $$5 + 35 - 18, 18, 18);
      }

      if (this.C.fO()) {
         if (this.C instanceof ccr) {
            $$0.a(z, $$4 + 7, $$5 + 35, 18, 18);
         } else {
            $$0.a(A, $$4 + 7, $$5 + 35, 18, 18);
         }
      }

      fig.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.D, this.E, this.C);
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      this.D = (float)$$1;
      this.E = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}

public class fjf extends fig<cmq> {
   private static final ajh x = new ajh("container/horse/chest_slots");
   private static final ajh y = new ajh("container/horse/saddle_slot");
   private static final ajh z = new ajh("container/horse/llama_armor_slot");
   private static final ajh A = new ajh("container/horse/armor_slot");
   private static final ajh B = new ajh("textures/gui/container/horse.png");
   private final cdg C;
   private float D;
   private float E;

   public fjf(cmq $$0, cit $$1, cdg $$2) {
      super($$0, $$1, $$2.O_());
      this.C = $$2;
   }

   @Override
   protected void a(fav $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(B, $$4, $$5, 0, 0, this.c, this.k);
      if (this.C instanceof cdf $$6 && $$6.s()) {
         $$0.a(x, 90, 54, 0, 0, $$4 + 79, $$5 + 17, $$6.gv() * 18, 54);
      }

      if (this.C.f()) {
         $$0.a(y, $$4 + 7, $$5 + 35 - 18, 18, 18);
      }

      if (this.C.fQ()) {
         if (this.C instanceof cdj) {
            $$0.a(z, $$4 + 7, $$5 + 35, 18, 18);
         } else {
            $$0.a(A, $$4 + 7, $$5 + 35, 18, 18);
         }
      }

      fjg.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.D, this.E, this.C);
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      this.D = (float)$$1;
      this.E = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}

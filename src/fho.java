public class fho extends fhg<ckz> {
   private static final ajc x = new ajc("container/brewing_stand/fuel_length");
   private static final ajc y = new ajc("container/brewing_stand/brew_progress");
   private static final ajc z = new ajc("container/brewing_stand/bubbles");
   private static final ajc A = new ajc("textures/gui/container/brewing_stand.png");
   private static final int[] B = new int[]{29, 24, 20, 16, 11, 6, 0};

   public fho(ckz $$0, chz $$1, vs $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.l = (this.c - this.i.a(this.e)) / 2;
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(ezx $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(A, $$4, $$5, 0, 0, this.c, this.k);
      int $$6 = this.p.l();
      int $$7 = awm.a((18 * $$6 + 20 - 1) / 20, 0, 18);
      if ($$7 > 0) {
         $$0.a(x, 18, 4, 0, 0, $$4 + 60, $$5 + 44, $$7, 4);
      }

      int $$8 = this.p.m();
      if ($$8 > 0) {
         int $$9 = (int)(28.0F * (1.0F - (float)$$8 / 400.0F));
         if ($$9 > 0) {
            $$0.a(y, 9, 28, 0, 0, $$4 + 97, $$5 + 16, 9, $$9);
         }

         $$9 = B[$$8 / 2 % 7];
         if ($$9 > 0) {
            $$0.a(z, 12, 29, 0, 29 - $$9, $$4 + 63, $$5 + 14 + 29 - $$9, 12, $$9);
         }
      }
   }
}

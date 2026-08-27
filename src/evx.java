public class evx extends evp<cbk> {
   private static final acq w = new acq("textures/gui/container/brewing_stand.png");
   private static final int[] x = new int[]{29, 24, 20, 16, 11, 6, 0};

   public evx(cbk $$0, byn $$1, sw $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void b() {
      super.b();
      this.l = (this.c - this.i.a(this.e)) / 2;
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(eox $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(w, $$4, $$5, 0, 0, this.c, this.k);
      int $$6 = this.p.l();
      int $$7 = apa.a((18 * $$6 + 20 - 1) / 20, 0, 18);
      if ($$7 > 0) {
         $$0.a(w, $$4 + 60, $$5 + 44, 176, 29, $$7, 4);
      }

      int $$8 = this.p.m();
      if ($$8 > 0) {
         int $$9 = (int)(28.0F * (1.0F - (float)$$8 / 400.0F));
         if ($$9 > 0) {
            $$0.a(w, $$4 + 97, $$5 + 16, 176, 0, 9, $$9);
         }

         $$9 = x[$$8 / 2 % 7];
         if ($$9 > 0) {
            $$0.a(w, $$4 + 63, $$5 + 14 + 29 - $$9, 185, 29 - $$9, 12, $$9);
         }
      }
   }
}

public class fld extends fkv<cnb> {
   private static final ajv A = new ajv("container/brewing_stand/fuel_length");
   private static final ajv B = new ajv("container/brewing_stand/brew_progress");
   private static final ajv C = new ajv("container/brewing_stand/bubbles");
   private static final ajv D = new ajv("textures/gui/container/brewing_stand.png");
   private static final int[] E = new int[]{29, 24, 20, 16, 11, 6, 0};

   public fld(cnb $$0, cjz $$1, wi $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.o = (this.c - this.m.a(this.i)) / 2;
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fdl $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.k - this.c) / 2;
      int $$5 = (this.l - this.d) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.d);
      int $$6 = this.s.l();
      int $$7 = axm.a((18 * $$6 + 20 - 1) / 20, 0, 18);
      if ($$7 > 0) {
         $$0.a(A, 18, 4, 0, 0, $$4 + 60, $$5 + 44, $$7, 4);
      }

      int $$8 = this.s.m();
      if ($$8 > 0) {
         int $$9 = (int)(28.0F * (1.0F - (float)$$8 / 400.0F));
         if ($$9 > 0) {
            $$0.a(B, 9, 28, 0, 0, $$4 + 97, $$5 + 16, 9, $$9);
         }

         $$9 = E[$$8 / 2 % 7];
         if ($$9 > 0) {
            $$0.a(C, 12, 29, 0, 29 - $$9, $$4 + 63, $$5 + 14 + 29 - $$9, 12, $$9);
         }
      }
   }
}

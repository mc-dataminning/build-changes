public class fnf extends fmx<cpa> {
   private static final akn D = new akn("container/brewing_stand/fuel_length");
   private static final akn E = new akn("container/brewing_stand/brew_progress");
   private static final akn F = new akn("container/brewing_stand/bubbles");
   private static final akn G = new akn("textures/gui/container/brewing_stand.png");
   private static final int[] H = new int[]{29, 24, 20, 16, 11, 6, 0};

   public fnf(cpa $$0, clx $$1, wx $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.r = (this.c - this.p.a(this.l)) / 2;
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(ffn $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(G, $$4, $$5, 0, 0, this.c, this.d);
      int $$6 = this.w.l();
      int $$7 = ayf.a((18 * $$6 + 20 - 1) / 20, 0, 18);
      if ($$7 > 0) {
         $$0.a(D, 18, 4, 0, 0, $$4 + 60, $$5 + 44, $$7, 4);
      }

      int $$8 = this.w.m();
      if ($$8 > 0) {
         int $$9 = (int)(28.0F * (1.0F - (float)$$8 / 400.0F));
         if ($$9 > 0) {
            $$0.a(E, 9, 28, 0, 0, $$4 + 97, $$5 + 16, 9, $$9);
         }

         $$9 = H[$$8 / 2 % 7];
         if ($$9 > 0) {
            $$0.a(F, 12, 29, 0, 29 - $$9, $$4 + 63, $$5 + 14 + 29 - $$9, 12, $$9);
         }
      }
   }
}

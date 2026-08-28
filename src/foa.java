public class foa extends fns<cpk> {
   private static final akk D = new akk("container/brewing_stand/fuel_length");
   private static final akk E = new akk("container/brewing_stand/brew_progress");
   private static final akk F = new akk("container/brewing_stand/bubbles");
   private static final akk G = new akk("textures/gui/container/brewing_stand.png");
   private static final int[] H = new int[]{29, 24, 20, 16, 11, 6, 0};

   public foa(cpk $$0, cmg $$1, wu $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.r = (this.c - this.o.a(this.k)) / 2;
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fgz $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.q) / 2;
      $$0.a(G, $$4, $$5, 0, 0, this.c, this.q);
      int $$6 = this.w.l();
      int $$7 = aye.a((18 * $$6 + 20 - 1) / 20, 0, 18);
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

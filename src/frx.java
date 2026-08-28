public class frx extends frp<crv> {
   private static final ali G = ali.b("container/brewing_stand/fuel_length");
   private static final ali H = ali.b("container/brewing_stand/brew_progress");
   private static final ali I = ali.b("container/brewing_stand/bubbles");
   private static final ali J = ali.b("textures/gui/container/brewing_stand.png");
   private static final int[] K = new int[]{29, 24, 20, 16, 11, 6, 0};

   public frx(crv $$0, col $$1, xi $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.v = (this.s - this.p.a(this.l)) / 2;
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fku $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gir::B, J, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      int $$6 = this.z.l();
      int $$7 = azk.a((18 * $$6 + 20 - 1) / 20, 0, 18);
      if ($$7 > 0) {
         $$0.a(gir::B, G, 18, 4, 0, 0, $$4 + 60, $$5 + 44, $$7, 4);
      }

      int $$8 = this.z.m();
      if ($$8 > 0) {
         int $$9 = (int)(28.0F * (1.0F - (float)$$8 / 400.0F));
         if ($$9 > 0) {
            $$0.a(gir::B, H, 9, 28, 0, 0, $$4 + 97, $$5 + 16, 9, $$9);
         }

         $$9 = K[$$8 / 2 % 7];
         if ($$9 > 0) {
            $$0.a(gir::B, I, 12, 29, 0, 29 - $$9, $$4 + 63, $$5 + 14 + 29 - $$9, 12, $$9);
         }
      }
   }
}

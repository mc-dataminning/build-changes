public class foz extends foq<cqa> {
   private static final akr E = akr.b("container/brewing_stand/fuel_length");
   private static final akr F = akr.b("container/brewing_stand/brew_progress");
   private static final akr G = akr.b("container/brewing_stand/bubbles");
   private static final akr H = akr.b("textures/gui/container/brewing_stand.png");
   private static final int[] I = new int[]{29, 24, 20, 16, 11, 6, 0};

   public foz(cqa $$0, cmw $$1, wz $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.s = (this.c - this.o.a(this.k)) / 2;
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fhx $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.r) / 2;
      $$0.a(H, $$4, $$5, 0, 0, this.c, this.r);
      int $$6 = this.x.l();
      int $$7 = ayo.a((18 * $$6 + 20 - 1) / 20, 0, 18);
      if ($$7 > 0) {
         $$0.a(E, 18, 4, 0, 0, $$4 + 60, $$5 + 44, $$7, 4);
      }

      int $$8 = this.x.m();
      if ($$8 > 0) {
         int $$9 = (int)(28.0F * (1.0F - (float)$$8 / 400.0F));
         if ($$9 > 0) {
            $$0.a(F, 9, 28, 0, 0, $$4 + 97, $$5 + 16, 9, $$9);
         }

         $$9 = I[$$8 / 2 % 7];
         if ($$9 > 0) {
            $$0.a(G, 12, 29, 0, 29 - $$9, $$4 + 63, $$5 + 14 + 29 - $$9, 12, $$9);
         }
      }
   }
}

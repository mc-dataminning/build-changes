public class fmn extends fmb<cos> {
   private static final akh D = new akh("container/crafter/disabled_slot");
   private static final akh E = new akh("container/crafter/powered_redstone");
   private static final akh F = new akh("container/crafter/unpowered_redstone");
   private static final akh G = new akh("textures/gui/container/crafter.png");
   private static final wu H = wu.c("gui.togglable_slot");
   private final clh I;

   public fmn(cos $$0, clg $$1, wu $$2) {
      super($$0, $$1, $$2);
      this.I = $$1.l;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.r = (this.c - this.p.a(this.l)) / 2;
   }

   @Override
   protected void a(cpz $$0, int $$1, int $$2, com $$3) {
      if ($$0 instanceof cot && !$$0.h() && !this.I.N_()) {
         switch ($$3) {
            case a:
               if (this.w.e($$1)) {
                  this.a($$1);
               } else if (this.w.g().d()) {
                  this.b($$1);
               }
               break;
            case c:
               csz $$4 = this.I.ga().a($$2);
               if (this.w.e($$1) && !$$4.d()) {
                  this.a($$1);
               }
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private void a(int $$0) {
      this.a($$0, true);
   }

   private void b(int $$0) {
      this.a($$0, false);
   }

   private void a(int $$0, boolean $$1) {
      this.w.a($$0, $$1);
      super.a($$0, this.w.j, $$1);
      float $$2 = $$1 ? 1.0F : 0.75F;
      this.I.a(avc.Ad.a(), 0.4F, $$2);
   }

   @Override
   public void a(fer $$0, cpz $$1) {
      if ($$1 instanceof cot $$2 && this.w.e($$1.e)) {
         this.a($$0, $$2);
         return;
      }

      super.a($$0, $$1);
   }

   private void a(fer $$0, cot $$1) {
      $$0.a(D, $$1.f - 1, $$1.g - 1, 18, 18);
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      this.a($$0, $$1, $$2);
      if (this.y instanceof cot && !this.w.e(this.y.e) && this.w.g().d() && !this.y.h() && !this.I.N_()) {
         $$0.a(this.p, H, $$1, $$2);
      }
   }

   private void c(fer $$0) {
      int $$1 = this.n / 2 + 9;
      int $$2 = this.o / 2 - 48;
      akh $$3;
      if (this.w.l()) {
         $$3 = E;
      } else {
         $$3 = F;
      }

      $$0.a($$3, $$1, $$2, 16, 16);
   }

   @Override
   protected void a(fer $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(G, $$4, $$5, 0, 0, this.c, this.d);
   }
}

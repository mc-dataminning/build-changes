public class fol extends fnz<cqg> {
   private static final ale D = new ale("container/crafter/disabled_slot");
   private static final ale E = new ale("container/crafter/powered_redstone");
   private static final ale F = new ale("container/crafter/unpowered_redstone");
   private static final ale G = new ale("textures/gui/container/crafter.png");
   private static final xo H = xo.c("gui.togglable_slot");
   private final cmv I;

   public fol(cqg $$0, cmu $$1, xo $$2) {
      super($$0, $$1, $$2);
      this.I = $$1.l;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.r = (this.c - this.p.a(this.l)) / 2;
   }

   @Override
   protected void a(crn $$0, int $$1, int $$2, cqb $$3) {
      if ($$0 instanceof cqh && !$$0.h() && !this.I.N_()) {
         switch ($$3) {
            case a:
               if (this.w.e($$1)) {
                  this.a($$1);
               } else if (this.w.g().e()) {
                  this.b($$1);
               }
               break;
            case c:
               cun $$4 = this.I.gc().a($$2);
               if (this.w.e($$1) && !$$4.e()) {
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
      this.I.a(avz.Ao.a(), 0.4F, $$2);
   }

   @Override
   public void a(fgp $$0, crn $$1) {
      if ($$1 instanceof cqh $$2 && this.w.e($$1.d)) {
         this.a($$0, $$2);
         return;
      }

      super.a($$0, $$1);
   }

   private void a(fgp $$0, cqh $$1) {
      $$0.a(D, $$1.e - 1, $$1.f - 1, 18, 18);
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      this.a($$0, $$1, $$2);
      if (this.y instanceof cqh && !this.w.e(this.y.d) && this.w.g().e() && !this.y.h() && !this.I.N_()) {
         $$0.a(this.p, H, $$1, $$2);
      }
   }

   private void c(fgp $$0) {
      int $$1 = this.n / 2 + 9;
      int $$2 = this.o / 2 - 48;
      ale $$3;
      if (this.w.l()) {
         $$3 = E;
      } else {
         $$3 = F;
      }

      $$0.a($$3, $$1, $$2, 16, 16);
   }

   @Override
   protected void a(fgp $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(G, $$4, $$5, 0, 0, this.c, this.d);
   }
}

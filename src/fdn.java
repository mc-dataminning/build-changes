public class fdn extends fdb<chy> {
   private static final agt x = new agt("container/crafter/disabled_slot");
   private static final agt y = new agt("container/crafter/powered_redstone");
   private static final agt z = new agt("container/crafter/unpowered_redstone");
   private static final agt A = new agt("textures/gui/container/crafter.png");
   private static final vb B = vb.c("gui.togglable_slot");
   private final cer C;

   public fdn(chy $$0, ceq $$1, vb $$2) {
      super($$0, $$1, $$2);
      this.C = $$1.m;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.l = (this.c - this.i.a(this.e)) / 2;
   }

   @Override
   protected void a(cjf $$0, int $$1, int $$2, cht $$3) {
      if ($$0 instanceof chz && !$$0.h() && !this.C.P_()) {
         switch ($$3) {
            case a:
               if (this.p.e($$1)) {
                  this.a($$1);
               } else if (this.p.g().b()) {
                  this.b($$1);
               }
               break;
            case c:
               cmh $$4 = this.C.fS().a($$2);
               if (this.p.e($$1) && !$$4.b()) {
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
      this.p.a($$0, $$1);
      super.a($$0, this.p.j, $$1);
      float $$2 = $$1 ? 1.0F : 0.75F;
      this.C.a(arc.zu.a(), 0.4F, $$2);
   }

   @Override
   public void a(evw $$0, cjf $$1) {
      if ($$1 instanceof chz $$2 && this.p.e($$1.e)) {
         this.a($$0, $$2);
         return;
      }

      super.a($$0, $$1);
   }

   private void a(evw $$0, chz $$1) {
      $$0.a(x, $$1.f - 1, $$1.g - 1, 18, 18);
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      this.a($$0, $$1, $$2);
      if (this.r instanceof chz && !this.p.e(this.r.e) && this.p.g().b() && !this.r.h()) {
         $$0.a(this.i, B, $$1, $$2);
      }
   }

   private void c(evw $$0) {
      int $$1 = this.g / 2 + 9;
      int $$2 = this.h / 2 - 48;
      agt $$3;
      if (this.p.l()) {
         $$3 = y;
      } else {
         $$3 = z;
      }

      $$0.a($$3, $$1, $$2, 16, 16);
   }

   @Override
   protected void a(evw $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(A, $$4, $$5, 0, 0, this.c, this.k);
   }
}

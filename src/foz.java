public class foz extends fom<cqh> {
   private static final akq D = akq.b("container/crafter/disabled_slot");
   private static final akq E = akq.b("container/crafter/powered_redstone");
   private static final akq F = akq.b("container/crafter/unpowered_redstone");
   private static final akq G = akq.b("textures/gui/container/crafter.png");
   private static final wy H = wy.c("gui.togglable_slot");
   private final cmv I;

   public foz(cqh $$0, cmu $$1, wy $$2) {
      super($$0, $$1, $$2);
      this.I = $$1.l;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.r = (this.c - this.o.a(this.k)) / 2;
   }

   @Override
   protected void a(cro $$0, int $$1, int $$2, cqc $$3) {
      if ($$0 instanceof cqi && !$$0.h() && !this.I.N_()) {
         switch ($$3) {
            case a:
               if (this.w.e($$1)) {
                  this.a($$1);
               } else if (this.w.g().e()) {
                  this.b($$1);
               }
               break;
            case c:
               cuo $$4 = this.I.fZ().a($$2);
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
      this.I.a(avo.Ar.a(), 0.4F, $$2);
   }

   @Override
   public void a(fht $$0, cro $$1) {
      if ($$1 instanceof cqi $$2 && this.w.e($$1.d)) {
         this.a($$0, $$2);
         return;
      }

      super.a($$0, $$1);
   }

   private void a(fht $$0, cqi $$1) {
      $$0.a(D, $$1.e - 1, $$1.f - 1, 18, 18);
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      this.a($$0, $$1, $$2);
      if (this.y instanceof cqi && !this.w.e(this.y.d) && this.w.g().e() && !this.y.h() && !this.I.N_()) {
         $$0.a(this.o, H, $$1, $$2);
      }
   }

   private void c(fht $$0) {
      int $$1 = this.m / 2 + 9;
      int $$2 = this.n / 2 - 48;
      akq $$3;
      if (this.w.l()) {
         $$3 = E;
      } else {
         $$3 = F;
      }

      $$0.a($$3, $$1, $$2, 16, 16);
   }

   @Override
   protected void a(fht $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.q) / 2;
      $$0.a(G, $$4, $$5, 0, 0, this.c, this.q);
   }
}

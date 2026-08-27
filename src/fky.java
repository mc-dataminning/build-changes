public class fky extends fkm<cnd> {
   private static final ajt A = new ajt("container/crafter/disabled_slot");
   private static final ajt B = new ajt("container/crafter/powered_redstone");
   private static final ajt C = new ajt("container/crafter/unpowered_redstone");
   private static final ajt D = new ajt("textures/gui/container/crafter.png");
   private static final wg E = wg.c("gui.togglable_slot");
   private final cjt F;

   public fky(cnd $$0, cjs $$1, wg $$2) {
      super($$0, $$1, $$2);
      this.F = $$1.m;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.o = (this.c - this.m.a(this.i)) / 2;
   }

   @Override
   protected void a(cok $$0, int $$1, int $$2, cmy $$3) {
      if ($$0 instanceof cne && !$$0.h() && !this.F.N_()) {
         switch ($$3) {
            case a:
               if (this.s.e($$1)) {
                  this.a($$1);
               } else if (this.s.g().d()) {
                  this.b($$1);
               }
               break;
            case c:
               crj $$4 = this.F.fZ().a($$2);
               if (this.s.e($$1) && !$$4.d()) {
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
      this.s.a($$0, $$1);
      super.a($$0, this.s.j, $$1);
      float $$2 = $$1 ? 1.0F : 0.75F;
      this.F.a(aum.zV.a(), 0.4F, $$2);
   }

   @Override
   public void a(fdc $$0, cok $$1) {
      if ($$1 instanceof cne $$2 && this.s.e($$1.e)) {
         this.a($$0, $$2);
         return;
      }

      super.a($$0, $$1);
   }

   private void a(fdc $$0, cne $$1) {
      $$0.a(A, $$1.f - 1, $$1.g - 1, 18, 18);
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      this.a($$0, $$1, $$2);
      if (this.v instanceof cne && !this.s.e(this.v.e) && this.s.g().d() && !this.v.h() && !this.F.N_()) {
         $$0.a(this.m, E, $$1, $$2);
      }
   }

   private void c(fdc $$0) {
      int $$1 = this.k / 2 + 9;
      int $$2 = this.l / 2 - 48;
      ajt $$3;
      if (this.s.l()) {
         $$3 = B;
      } else {
         $$3 = C;
      }

      $$0.a($$3, $$1, $$2, 16, 16);
   }

   @Override
   protected void a(fdc $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.k - this.c) / 2;
      int $$5 = (this.l - this.d) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.d);
   }
}

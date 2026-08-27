public class flh extends fkv<cnk> {
   private static final ajv A = new ajv("container/crafter/disabled_slot");
   private static final ajv B = new ajv("container/crafter/powered_redstone");
   private static final ajv C = new ajv("container/crafter/unpowered_redstone");
   private static final ajv D = new ajv("textures/gui/container/crafter.png");
   private static final wi E = wi.c("gui.togglable_slot");
   private final cka F;

   public flh(cnk $$0, cjz $$1, wi $$2) {
      super($$0, $$1, $$2);
      this.F = $$1.m;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.o = (this.c - this.m.a(this.i)) / 2;
   }

   @Override
   protected void a(cos $$0, int $$1, int $$2, cnf $$3) {
      if ($$0 instanceof cnl && !$$0.h() && !this.F.N_()) {
         switch ($$3) {
            case a:
               if (this.s.e($$1)) {
                  this.a($$1);
               } else if (this.s.g().d()) {
                  this.b($$1);
               }
               break;
            case c:
               crs $$4 = this.F.fZ().a($$2);
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
      this.F.a(auo.zV.a(), 0.4F, $$2);
   }

   @Override
   public void a(fdl $$0, cos $$1) {
      if ($$1 instanceof cnl $$2 && this.s.e($$1.e)) {
         this.a($$0, $$2);
         return;
      }

      super.a($$0, $$1);
   }

   private void a(fdl $$0, cnl $$1) {
      $$0.a(A, $$1.f - 1, $$1.g - 1, 18, 18);
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      this.a($$0, $$1, $$2);
      if (this.v instanceof cnl && !this.s.e(this.v.e) && this.s.g().d() && !this.v.h() && !this.F.N_()) {
         $$0.a(this.m, E, $$1, $$2);
      }
   }

   private void c(fdl $$0) {
      int $$1 = this.k / 2 + 9;
      int $$2 = this.l / 2 - 48;
      ajv $$3;
      if (this.s.l()) {
         $$3 = B;
      } else {
         $$3 = C;
      }

      $$0.a($$3, $$1, $$2, 16, 16);
   }

   @Override
   protected void a(fdl $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.k - this.c) / 2;
      int $$5 = (this.l - this.d) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.d);
   }
}

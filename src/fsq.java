public class fsq extends fse<csi> {
   private static final all G = all.b("container/crafter/disabled_slot");
   private static final all H = all.b("container/crafter/powered_redstone");
   private static final all I = all.b("container/crafter/unpowered_redstone");
   private static final all J = all.b("textures/gui/container/crafter.png");
   private static final xl K = xl.c("gui.togglable_slot");
   private final cor L;

   public fsq(csi $$0, coq $$1, xl $$2) {
      super($$0, $$1, $$2);
      this.L = $$1.k;
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.v = (this.s - this.p.a(this.l)) / 2;
   }

   @Override
   protected void a(ctp $$0, int $$1, int $$2, csd $$3) {
      if ($$0 instanceof csj && !$$0.h() && !this.L.R_()) {
         switch ($$3) {
            case a:
               if (this.z.e($$1)) {
                  this.a($$1);
               } else if (this.z.g().f()) {
                  this.b($$1);
               }
               break;
            case c:
               cwf $$4 = this.L.gl().a($$2);
               if (this.z.e($$1) && !$$4.f()) {
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
      this.z.a($$0, $$1);
      super.a($$0, this.z.l, $$1);
      float $$2 = $$1 ? 1.0F : 0.75F;
      this.L.a(awo.Av.a(), 0.4F, $$2);
   }

   @Override
   public void a(flj $$0, ctp $$1) {
      if ($$1 instanceof csj $$2 && this.z.e($$1.d)) {
         this.a($$0, $$2);
         return;
      }

      super.a($$0, $$1);
   }

   private void a(flj $$0, csj $$1) {
      $$0.a(gjh::B, G, $$1.e - 1, $$1.f - 1, 18, 18);
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      this.a($$0, $$1, $$2);
      if (this.B instanceof csj && !this.z.e(this.B.d) && this.z.g().f() && !this.B.h() && !this.L.R_()) {
         $$0.a(this.p, K, $$1, $$2);
      }
   }

   private void c(flj $$0) {
      int $$1 = this.n / 2 + 9;
      int $$2 = this.o / 2 - 48;
      all $$3;
      if (this.z.l()) {
         $$3 = H;
      } else {
         $$3 = I;
      }

      $$0.a(gjh::B, $$3, $$1, $$2, 16, 16);
   }

   @Override
   protected void a(flj $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gjh::B, J, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}

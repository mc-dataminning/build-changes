public class fee extends fds<cii> {
   private static final ahd x = new ahd("container/crafter/disabled_slot");
   private static final ahd y = new ahd("container/crafter/powered_redstone");
   private static final ahd z = new ahd("container/crafter/unpowered_redstone");
   private static final ahd A = new ahd("textures/gui/container/crafter.png");
   private static final vd B = vd.c("gui.togglable_slot");
   private final cfb C;

   public fee(cii $$0, cfa $$1, vd $$2) {
      super($$0, $$1, $$2);
      this.C = $$1.m;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.l = (this.c - this.i.a(this.e)) / 2;
   }

   @Override
   protected void a(cjp $$0, int $$1, int $$2, cid $$3) {
      if ($$0 instanceof cij && !$$0.h() && !this.C.P_()) {
         switch ($$3) {
            case a:
               if (this.p.e($$1)) {
                  this.a($$1);
               } else if (this.p.g().b()) {
                  this.b($$1);
               }
               break;
            case c:
               cmr $$4 = this.C.fS().a($$2);
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
      this.C.a(arm.zu.a(), 0.4F, $$2);
   }

   @Override
   public void a(ewm $$0, cjp $$1) {
      if ($$1 instanceof cij $$2 && this.p.e($$1.e)) {
         this.a($$0, $$2);
         return;
      }

      super.a($$0, $$1);
   }

   private void a(ewm $$0, cij $$1) {
      $$0.a(x, $$1.f - 1, $$1.g - 1, 18, 18);
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      this.a($$0, $$1, $$2);
      if (this.r instanceof cij && !this.p.e(this.r.e) && this.p.g().b() && !this.r.h()) {
         $$0.a(this.i, B, $$1, $$2);
      }
   }

   private void c(ewm $$0) {
      int $$1 = this.g / 2 + 9;
      int $$2 = this.h / 2 - 48;
      ahd $$3;
      if (this.p.l()) {
         $$3 = y;
      } else {
         $$3 = z;
      }

      $$0.a($$3, $$1, $$2, 16, 16);
   }

   @Override
   protected void a(ewm $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(A, $$4, $$5, 0, 0, this.c, this.k);
   }
}

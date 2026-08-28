public class fpd extends foq<cqj> {
   private static final akr E = akr.b("container/crafter/disabled_slot");
   private static final akr F = akr.b("container/crafter/powered_redstone");
   private static final akr G = akr.b("container/crafter/unpowered_redstone");
   private static final akr H = akr.b("textures/gui/container/crafter.png");
   private static final wz I = wz.c("gui.togglable_slot");
   private final cmx J;

   public fpd(cqj $$0, cmw $$1, wz $$2) {
      super($$0, $$1, $$2);
      this.J = $$1.l;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.s = (this.c - this.o.a(this.k)) / 2;
   }

   @Override
   protected void a(crq $$0, int $$1, int $$2, cqe $$3) {
      if ($$0 instanceof cqk && !$$0.h() && !this.J.R_()) {
         switch ($$3) {
            case a:
               if (this.x.e($$1)) {
                  this.a($$1);
               } else if (this.x.g().e()) {
                  this.b($$1);
               }
               break;
            case c:
               cuq $$4 = this.J.fZ().a($$2);
               if (this.x.e($$1) && !$$4.e()) {
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
      this.x.a($$0, $$1);
      super.a($$0, this.x.j, $$1);
      float $$2 = $$1 ? 1.0F : 0.75F;
      this.J.a(avp.Ar.a(), 0.4F, $$2);
   }

   @Override
   public void a(fhx $$0, crq $$1) {
      if ($$1 instanceof cqk $$2 && this.x.e($$1.d)) {
         this.a($$0, $$2);
         return;
      }

      super.a($$0, $$1);
   }

   private void a(fhx $$0, cqk $$1) {
      $$0.a(E, $$1.e - 1, $$1.f - 1, 18, 18);
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      this.a($$0, $$1, $$2);
      if (this.z instanceof cqk && !this.x.e(this.z.d) && this.x.g().e() && !this.z.h() && !this.J.R_()) {
         $$0.a(this.o, I, $$1, $$2);
      }
   }

   private void c(fhx $$0) {
      int $$1 = this.m / 2 + 9;
      int $$2 = this.n / 2 - 48;
      akr $$3;
      if (this.x.l()) {
         $$3 = F;
      } else {
         $$3 = G;
      }

      $$0.a($$3, $$1, $$2, 16, 16);
   }

   @Override
   protected void a(fhx $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.r) / 2;
      $$0.a(H, $$4, $$5, 0, 0, this.c, this.r);
   }
}

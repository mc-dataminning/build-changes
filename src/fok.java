public class fok extends fny<cpw> {
   private static final akk D = new akk("container/crafter/disabled_slot");
   private static final akk E = new akk("container/crafter/powered_redstone");
   private static final akk F = new akk("container/crafter/unpowered_redstone");
   private static final akk G = new akk("textures/gui/container/crafter.png");
   private static final wu H = wu.c("gui.togglable_slot");
   private final cmk I;

   public fok(cpw $$0, cmj $$1, wu $$2) {
      super($$0, $$1, $$2);
      this.I = $$1.l;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.r = (this.c - this.o.a(this.k)) / 2;
   }

   @Override
   protected void a(crd $$0, int $$1, int $$2, cpr $$3) {
      if ($$0 instanceof cpx && !$$0.h() && !this.I.N_()) {
         switch ($$3) {
            case a:
               if (this.w.e($$1)) {
                  this.a($$1);
               } else if (this.w.g().e()) {
                  this.b($$1);
               }
               break;
            case c:
               cuc $$4 = this.I.fZ().a($$2);
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
      this.I.a(avh.Ar.a(), 0.4F, $$2);
   }

   @Override
   public void a(fhf $$0, crd $$1) {
      if ($$1 instanceof cpx $$2 && this.w.e($$1.d)) {
         this.a($$0, $$2);
         return;
      }

      super.a($$0, $$1);
   }

   private void a(fhf $$0, cpx $$1) {
      $$0.a(D, $$1.e - 1, $$1.f - 1, 18, 18);
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      this.a($$0, $$1, $$2);
      if (this.y instanceof cpx && !this.w.e(this.y.d) && this.w.g().e() && !this.y.h() && !this.I.N_()) {
         $$0.a(this.o, H, $$1, $$2);
      }
   }

   private void c(fhf $$0) {
      int $$1 = this.m / 2 + 9;
      int $$2 = this.n / 2 - 48;
      akk $$3;
      if (this.w.l()) {
         $$3 = E;
      } else {
         $$3 = F;
      }

      $$0.a($$3, $$1, $$2, 16, 16);
   }

   @Override
   protected void a(fhf $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.q) / 2;
      $$0.a(G, $$4, $$5, 0, 0, this.c, this.q);
   }
}

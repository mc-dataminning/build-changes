public class flu extends fms<cnj> {
   private static final akf D = new akf("container/anvil/text_field");
   private static final akf E = new akf("container/anvil/text_field_disabled");
   private static final akf F = new akf("container/anvil/error");
   private static final akf G = new akf("textures/gui/container/anvil.png");
   private static final ws H = ws.c("container.repair.expensive");
   private ffd I;
   private final ckl J;

   public flu(cnj $$0, ckk $$1, ws $$2) {
      super($$0, $$1, $$2, G);
      this.J = $$1.m;
      this.r = 60;
   }

   @Override
   protected void E() {
      int $$0 = (this.n - this.c) / 2;
      int $$1 = (this.o - this.d) / 2;
      this.I = new ffd(this.p, $$0 + 62, $$1 + 24, 103, 12, ws.c("container.repair"));
      this.I.f(false);
      this.I.g(-1);
      this.I.h(-1);
      this.I.d(false);
      this.I.f(50);
      this.I.b(this::a);
      this.I.a("");
      this.d(this.I);
      this.I.e(this.w.b(0).h());
   }

   @Override
   protected void aC_() {
      this.b(this.I);
   }

   @Override
   public void a(fcu $$0, int $$1, int $$2) {
      String $$3 = this.I.a();
      this.b($$0, $$1, $$2);
      this.I.a($$3);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.m.s.r();
      }

      return !this.I.a($$0, $$1, $$2) && !this.I.d() ? super.a($$0, $$1, $$2) : true;
   }

   private void a(String $$0) {
      cpd $$1 = this.w.b(0);
      if ($$1.h()) {
         String $$2 = $$0;
         if (!$$1.g().b(jz.d) && $$0.equals($$1.g().w().getString())) {
            $$2 = "";
         }

         if (this.w.a($$2)) {
            this.m.s.h.b(new ahf($$2));
         }
      }
   }

   @Override
   protected void b(feh $$0, int $$1, int $$2) {
      super.b($$0, $$1, $$2);
      int $$3 = this.w.n();
      if ($$3 > 0) {
         int $$4 = 8453920;
         ws $$5;
         if ($$3 >= 40 && !this.m.s.gb().d) {
            $$5 = H;
            $$4 = 16736352;
         } else if (!this.w.b(2).h()) {
            $$5 = null;
         } else {
            $$5 = ws.a("container.repair.cost", $$3);
            if (!this.w.b(2).a(this.J)) {
               $$4 = 16736352;
            }
         }

         if ($$5 != null) {
            int $$8 = this.c - 8 - this.p.a($$5) - 2;
            int $$9 = 69;
            $$0.a($$8 - 2, 67, this.c - 8, 79, 1325400064);
            $$0.b(this.p, $$5, $$8, 69, $$4);
         }
      }
   }

   @Override
   protected void a(feh $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.w.b(0).h() ? D : E, this.z + 59, this.A + 20, 110, 16);
   }

   @Override
   public void d(feh $$0, int $$1, int $$2, float $$3) {
      this.I.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void c(feh $$0, int $$1, int $$2) {
      if ((this.w.b(0).h() || this.w.b(1).h()) && !this.w.b(this.w.o()).h()) {
         $$0.a(F, $$1 + 99, $$2 + 45, 28, 21);
      }
   }

   @Override
   public void a(cnh $$0, int $$1, csd $$2) {
      if ($$1 == 0) {
         this.I.a($$2.d() ? "" : $$2.w().getString());
         this.I.e(!$$2.d());
         this.a(this.I);
      }
   }
}

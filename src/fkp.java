public class fkp extends fln<cmr> {
   private static final ajt A = new ajt("container/anvil/text_field");
   private static final ajt B = new ajt("container/anvil/text_field_disabled");
   private static final ajt C = new ajt("container/anvil/error");
   private static final ajt D = new ajt("textures/gui/container/anvil.png");
   private static final wg E = wg.c("container.repair.expensive");
   private fdy F;
   private final cjt G;

   public fkp(cmr $$0, cjs $$1, wg $$2) {
      super($$0, $$1, $$2, D);
      this.G = $$1.m;
      this.o = 60;
   }

   @Override
   protected void E() {
      int $$0 = (this.k - this.c) / 2;
      int $$1 = (this.l - this.d) / 2;
      this.F = new fdy(this.m, $$0 + 62, $$1 + 24, 103, 12, wg.c("container.repair"));
      this.F.f(false);
      this.F.g(-1);
      this.F.h(-1);
      this.F.d(false);
      this.F.f(50);
      this.F.b(this::a);
      this.F.a("");
      this.d(this.F);
      this.F.e(this.s.b(0).h());
   }

   @Override
   protected void aD_() {
      this.b(this.F);
   }

   @Override
   public void a(fbp $$0, int $$1, int $$2) {
      String $$3 = this.F.a();
      this.b($$0, $$1, $$2);
      this.F.a($$3);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.j.s.r();
      }

      return !this.F.a($$0, $$1, $$2) && !this.F.d() ? super.a($$0, $$1, $$2) : true;
   }

   private void a(String $$0) {
      cok $$1 = this.s.b(0);
      if ($$1.h()) {
         String $$2 = $$0;
         if (!$$1.g().b(jp.d) && $$0.equals($$1.g().w().getString())) {
            $$2 = "";
         }

         if (this.s.a($$2)) {
            this.j.s.ct.b(new agt($$2));
         }
      }
   }

   @Override
   protected void b(fdc $$0, int $$1, int $$2) {
      super.b($$0, $$1, $$2);
      int $$3 = this.s.n();
      if ($$3 > 0) {
         int $$4 = 8453920;
         wg $$5;
         if ($$3 >= 40 && !this.j.s.ga().d) {
            $$5 = E;
            $$4 = 16736352;
         } else if (!this.s.b(2).h()) {
            $$5 = null;
         } else {
            $$5 = wg.a("container.repair.cost", $$3);
            if (!this.s.b(2).a(this.G)) {
               $$4 = 16736352;
            }
         }

         if ($$5 != null) {
            int $$8 = this.c - 8 - this.m.a($$5) - 2;
            int $$9 = 69;
            $$0.a($$8 - 2, 67, this.c - 8, 79, 1325400064);
            $$0.b(this.m, $$5, $$8, 69, $$4);
         }
      }
   }

   @Override
   protected void a(fdc $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.s.b(0).h() ? A : B, this.w + 59, this.x + 20, 110, 16);
   }

   @Override
   public void d(fdc $$0, int $$1, int $$2, float $$3) {
      this.F.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void c(fdc $$0, int $$1, int $$2) {
      if ((this.s.b(0).h() || this.s.b(1).h()) && !this.s.b(this.s.o()).h()) {
         $$0.a(C, $$1 + 99, $$2 + 45, 28, 21);
      }
   }

   @Override
   public void a(cmp $$0, int $$1, crj $$2) {
      if ($$1 == 0) {
         this.F.a($$2.d() ? "" : $$2.w().getString());
         this.F.e(!$$2.d());
         this.a(this.F);
      }
   }
}

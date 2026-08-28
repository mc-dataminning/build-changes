public class frk extends fsi<crm> {
   private static final alh G = alh.b("container/anvil/text_field");
   private static final alh H = alh.b("container/anvil/text_field_disabled");
   private static final alh I = alh.b("container/anvil/error");
   private static final alh J = alh.b("textures/gui/container/anvil.png");
   private static final xh K = xh.c("container.repair.expensive");
   private fli L;
   private final coh M;

   public frk(crm $$0, cog $$1, xh $$2) {
      super($$0, $$1, $$2, J);
      this.M = $$1.k;
      this.v = 60;
   }

   @Override
   protected void F() {
      int $$0 = (this.n - this.s) / 2;
      int $$1 = (this.o - this.u) / 2;
      this.L = new fli(this.p, $$0 + 62, $$1 + 24, 103, 12, xh.c("container.repair"));
      this.L.f(false);
      this.L.g(-1);
      this.L.h(-1);
      this.L.d(false);
      this.L.f(50);
      this.L.b(this::a);
      this.L.a("");
      this.d(this.L);
      this.L.e(this.z.b(0).h());
   }

   @Override
   protected void aH_() {
      this.b(this.L);
   }

   @Override
   public void a(fja $$0, int $$1, int $$2) {
      String $$3 = this.L.a();
      this.b($$0, $$1, $$2);
      this.L.a($$3);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.m.t.s();
      }

      return !this.L.a($$0, $$1, $$2) && !this.L.c() ? super.a($$0, $$1, $$2) : true;
   }

   private void a(String $$0) {
      ctg $$1 = this.z.b(0);
      if ($$1.h()) {
         String $$2 = $$0;
         if (!$$1.g().b(kt.g) && $$0.equals($$1.g().y().getString())) {
            $$2 = "";
         }

         if (this.z.a($$2)) {
            this.m.t.cw.b(new aie($$2));
         }
      }
   }

   @Override
   protected void b(fkm $$0, int $$1, int $$2) {
      super.b($$0, $$1, $$2);
      int $$3 = this.z.n();
      if ($$3 > 0) {
         int $$4 = 8453920;
         xh $$5;
         if ($$3 >= 40 && !this.m.t.gl().d) {
            $$5 = K;
            $$4 = 16736352;
         } else if (!this.z.b(2).h()) {
            $$5 = null;
         } else {
            $$5 = xh.a("container.repair.cost", $$3);
            if (!this.z.b(2).a(this.M)) {
               $$4 = 16736352;
            }
         }

         if ($$5 != null) {
            int $$8 = this.s - 8 - this.p.a($$5) - 2;
            int $$9 = 69;
            $$0.a($$8 - 2, 67, this.s - 8, 79, 1325400064);
            $$0.b(this.p, $$5, $$8, 69, $$4);
         }
      }
   }

   @Override
   protected void a(fkm $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gig::B, this.z.b(0).h() ? G : H, this.C + 59, this.D + 20, 110, 16);
   }

   @Override
   public void d(fkm $$0, int $$1, int $$2, float $$3) {
      this.L.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void c(fkm $$0, int $$1, int $$2) {
      if ((this.z.b(0).h() || this.z.b(1).h()) && !this.z.b(this.z.o()).h()) {
         $$0.a(gig::B, I, $$1 + 99, $$2 + 45, 28, 21);
      }
   }

   @Override
   public void a(crj $$0, int $$1, cvx $$2) {
      if ($$1 == 0) {
         this.L.a($$2.f() ? "" : $$2.y().getString());
         this.L.e(!$$2.f());
         this.a(this.L);
      }
   }
}

public class fow extends fpu<cpw> {
   private static final akr E = akr.b("container/anvil/text_field");
   private static final akr F = akr.b("container/anvil/text_field_disabled");
   private static final akr G = akr.b("container/anvil/error");
   private static final akr H = akr.b("textures/gui/container/anvil.png");
   private static final wz I = wz.c("container.repair.expensive");
   private fiv J;
   private final cmx K;

   public fow(cpw $$0, cmw $$1, wz $$2) {
      super($$0, $$1, $$2, H);
      this.K = $$1.l;
      this.s = 60;
   }

   @Override
   protected void E() {
      int $$0 = (this.m - this.c) / 2;
      int $$1 = (this.n - this.r) / 2;
      this.J = new fiv(this.o, $$0 + 62, $$1 + 24, 103, 12, wz.c("container.repair"));
      this.J.f(false);
      this.J.g(-1);
      this.J.h(-1);
      this.J.d(false);
      this.J.f(50);
      this.J.b(this::a);
      this.J.a("");
      this.d(this.J);
      this.J.e(this.x.b(0).h());
   }

   @Override
   protected void aI_() {
      this.b(this.J);
   }

   @Override
   public void a(fgo $$0, int $$1, int $$2) {
      String $$3 = this.J.a();
      this.b($$0, $$1, $$2);
      this.J.a($$3);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.l.s.s();
      }

      return !this.J.a($$0, $$1, $$2) && !this.J.c() ? super.a($$0, $$1, $$2) : true;
   }

   private void a(String $$0) {
      crq $$1 = this.x.b(0);
      if ($$1.h()) {
         String $$2 = $$0;
         if (!$$1.g().b(kq.g) && $$0.equals($$1.g().w().getString())) {
            $$2 = "";
         }

         if (this.x.a($$2)) {
            this.l.s.h.b(new ahr($$2));
         }
      }
   }

   @Override
   protected void b(fhz $$0, int $$1, int $$2) {
      super.b($$0, $$1, $$2);
      int $$3 = this.x.n();
      if ($$3 > 0) {
         int $$4 = 8453920;
         wz $$5;
         if ($$3 >= 40 && !this.l.s.fZ().d) {
            $$5 = I;
            $$4 = 16736352;
         } else if (!this.x.b(2).h()) {
            $$5 = null;
         } else {
            $$5 = wz.a("container.repair.cost", $$3);
            if (!this.x.b(2).a(this.K)) {
               $$4 = 16736352;
            }
         }

         if ($$5 != null) {
            int $$8 = this.c - 8 - this.o.a($$5) - 2;
            int $$9 = 69;
            $$0.a($$8 - 2, 67, this.c - 8, 79, 1325400064);
            $$0.b(this.o, $$5, $$8, 69, $$4);
         }
      }
   }

   @Override
   protected void a(fhz $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.x.b(0).h() ? E : F, this.A + 59, this.B + 20, 110, 16);
   }

   @Override
   public void d(fhz $$0, int $$1, int $$2, float $$3) {
      this.J.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void c(fhz $$0, int $$1, int $$2) {
      if ((this.x.b(0).h() || this.x.b(1).h()) && !this.x.b(this.x.o()).h()) {
         $$0.a(G, $$1 + 99, $$2 + 45, 28, 21);
      }
   }

   @Override
   public void a(cpu $$0, int $$1, cuq $$2) {
      if ($$1 == 0) {
         this.J.a($$2.e() ? "" : $$2.w().getString());
         this.J.e(!$$2.e());
         this.a(this.J);
      }
   }
}

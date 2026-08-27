public class fgg extends fhe<ckd> {
   private static final aiy x = new aiy("container/anvil/text_field");
   private static final aiy y = new aiy("container/anvil/text_field_disabled");
   private static final aiy z = new aiy("container/anvil/error");
   private static final aiy A = new aiy("textures/gui/container/anvil.png");
   private static final vq B = vq.c("container.repair.expensive");
   private ezq C;
   private final chh D;

   public fgg(ckd $$0, chg $$1, vq $$2) {
      super($$0, $$1, $$2, A);
      this.D = $$1.m;
      this.l = 60;
   }

   @Override
   protected void I() {
      int $$0 = (this.g - this.c) / 2;
      int $$1 = (this.h - this.k) / 2;
      this.C = new ezq(this.i, $$0 + 62, $$1 + 24, 103, 12, vq.c("container.repair"));
      this.C.f(false);
      this.C.g(-1);
      this.C.h(-1);
      this.C.d(false);
      this.C.f(50);
      this.C.b(this::a);
      this.C.a("");
      this.e(this.C);
      this.C.e(this.p.b(0).h());
   }

   @Override
   protected void aH_() {
      this.c(this.C);
   }

   @Override
   public void a(exh $$0, int $$1, int $$2) {
      String $$3 = this.C.a();
      this.b($$0, $$1, $$2);
      this.C.a($$3);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.s.r();
      }

      return !this.C.a($$0, $$1, $$2) && !this.C.d() ? super.a($$0, $$1, $$2) : true;
   }

   private void a(String $$0) {
      clw $$1 = this.p.b(0);
      if ($$1.h()) {
         String $$2 = $$0;
         if (!$$1.g().B() && $$0.equals($$1.g().z().getString())) {
            $$2 = "";
         }

         if (this.p.a($$2)) {
            this.f.s.cq.b(new afz($$2));
         }
      }
   }

   @Override
   protected void b(eyu $$0, int $$1, int $$2) {
      super.b($$0, $$1, $$2);
      int $$3 = this.p.n();
      if ($$3 > 0) {
         int $$4 = 8453920;
         vq $$5;
         if ($$3 >= 40 && !this.f.s.fU().d) {
            $$5 = B;
            $$4 = 16736352;
         } else if (!this.p.b(2).h()) {
            $$5 = null;
         } else {
            $$5 = vq.a("container.repair.cost", $$3);
            if (!this.p.b(2).a(this.D)) {
               $$4 = 16736352;
            }
         }

         if ($$5 != null) {
            int $$8 = this.c - 8 - this.i.a($$5) - 2;
            int $$9 = 69;
            $$0.a($$8 - 2, 67, this.c - 8, 79, 1325400064);
            $$0.b(this.i, $$5, $$8, 69, $$4);
         }
      }
   }

   @Override
   protected void a(eyu $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p.b(0).h() ? x : y, this.t + 59, this.u + 20, 110, 16);
   }

   @Override
   public void d(eyu $$0, int $$1, int $$2, float $$3) {
      this.C.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void c(eyu $$0, int $$1, int $$2) {
      if ((this.p.b(0).h() || this.p.b(1).h()) && !this.p.b(this.p.o()).h()) {
         $$0.a(z, $$1 + 99, $$2 + 45, 28, 21);
      }
   }

   @Override
   public void a(ckb $$0, int $$1, coz $$2) {
      if ($$1 == 0) {
         this.C.a($$2.b() ? "" : $$2.z().getString());
         this.C.e(!$$2.b());
         this.a(this.C);
      }
   }
}

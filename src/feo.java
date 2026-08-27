public class feo extends ffm<cil> {
   private static final ahh x = new ahh("container/anvil/text_field");
   private static final ahh y = new ahh("container/anvil/text_field_disabled");
   private static final ahh z = new ahh("container/anvil/error");
   private static final ahh A = new ahh("textures/gui/container/anvil.png");
   private static final vg B = vg.c("container.repair.expensive");
   private eya C;
   private final cfq D;

   public feo(cil $$0, cfp $$1, vg $$2) {
      super($$0, $$1, $$2, A);
      this.D = $$1.m;
      this.l = 60;
   }

   @Override
   protected void I() {
      int $$0 = (this.g - this.c) / 2;
      int $$1 = (this.h - this.k) / 2;
      this.C = new eya(this.i, $$0 + 62, $$1 + 24, 103, 12, vg.c("container.repair"));
      this.C.f(false);
      this.C.g(-1);
      this.C.h(-1);
      this.C.d(false);
      this.C.f(50);
      this.C.b(this::a);
      this.C.a("");
      this.e(this.C);
      this.c(this.C);
      this.C.e(this.p.b(0).h());
   }

   @Override
   public void a(evr $$0, int $$1, int $$2) {
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
      cke $$1 = this.p.b(0);
      if ($$1.h()) {
         String $$2 = $$0;
         if (!$$1.g().A() && $$0.equals($$1.g().y().getString())) {
            $$2 = "";
         }

         if (this.p.a($$2)) {
            this.f.s.cr.b(new aes($$2));
         }
      }
   }

   @Override
   protected void b(exe $$0, int $$1, int $$2) {
      super.b($$0, $$1, $$2);
      int $$3 = this.p.n();
      if ($$3 > 0) {
         int $$4 = 8453920;
         vg $$5;
         if ($$3 >= 40 && !this.f.s.fT().d) {
            $$5 = B;
            $$4 = 16736352;
         } else if (!this.p.b(2).h()) {
            $$5 = null;
         } else {
            $$5 = vg.a("container.repair.cost", $$3);
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
   protected void a(exe $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p.b(0).h() ? x : y, this.t + 59, this.u + 20, 110, 16);
   }

   @Override
   public void d(exe $$0, int $$1, int $$2, float $$3) {
      this.C.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void c(exe $$0, int $$1, int $$2) {
      if ((this.p.b(0).h() || this.p.b(1).h()) && !this.p.b(this.p.o()).h()) {
         $$0.a(z, $$1 + 99, $$2 + 45, 28, 21);
      }
   }

   @Override
   public void a(cij $$0, int $$1, cng $$2) {
      if ($$1 == 0) {
         this.C.a($$2.b() ? "" : $$2.y().getString());
         this.C.e(!$$2.b());
         this.a(this.C);
      }
   }
}

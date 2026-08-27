public class fbw extends fcu<cgo> {
   private static final agi x = new agi("container/anvil/text_field");
   private static final agi y = new agi("container/anvil/text_field_disabled");
   private static final agi z = new agi("container/anvil/error");
   private static final agi A = new agi("textures/gui/container/anvil.png");
   private static final ur B = ur.c("container.repair.expensive");
   private evi C;
   private final cdu D;

   public fbw(cgo $$0, cdt $$1, ur $$2) {
      super($$0, $$1, $$2, A);
      this.D = $$1.m;
      this.l = 60;
   }

   @Override
   protected void E() {
      int $$0 = (this.g - this.c) / 2;
      int $$1 = (this.h - this.k) / 2;
      this.C = new evi(this.i, $$0 + 62, $$1 + 24, 103, 12, ur.c("container.repair"));
      this.C.f(false);
      this.C.m(-1);
      this.C.n(-1);
      this.C.d(false);
      this.C.l(50);
      this.C.b(this::a);
      this.C.a("");
      this.e(this.C);
      this.c(this.C);
      this.C.e(this.p.b(0).g());
   }

   @Override
   public void a(etd $$0, int $$1, int $$2) {
      String $$3 = this.C.a();
      this.b($$0, $$1, $$2);
      this.C.a($$3);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.s.r();
      }

      return !this.C.a($$0, $$1, $$2) && !this.C.e() ? super.a($$0, $$1, $$2) : true;
   }

   private void a(String $$0) {
      cih $$1 = this.p.b(0);
      if ($$1.g()) {
         String $$2 = $$0;
         if (!$$1.f().A() && $$0.equals($$1.f().y().getString())) {
            $$2 = "";
         }

         if (this.p.a($$2)) {
            this.f.s.cn.b(new adt($$2));
         }
      }
   }

   @Override
   protected void b(euo $$0, int $$1, int $$2) {
      super.b($$0, $$1, $$2);
      int $$3 = this.p.n();
      if ($$3 > 0) {
         int $$4 = 8453920;
         ur $$5;
         if ($$3 >= 40 && !this.f.s.fU().d) {
            $$5 = B;
            $$4 = 16736352;
         } else if (!this.p.b(2).g()) {
            $$5 = null;
         } else {
            $$5 = ur.a("container.repair.cost", $$3);
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
   protected void a(euo $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p.b(0).g() ? x : y, this.t + 59, this.u + 20, 110, 16);
   }

   @Override
   public void d(euo $$0, int $$1, int $$2, float $$3) {
      this.C.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void c(euo $$0, int $$1, int $$2) {
      if ((this.p.b(0).g() || this.p.b(1).g()) && !this.p.b(this.p.o()).g()) {
         $$0.a(z, $$1 + 99, $$2 + 45, 28, 21);
      }
   }

   @Override
   public void a(cgm $$0, int $$1, clj $$2) {
      if ($$1 == 0) {
         this.C.a($$2.b() ? "" : $$2.y().getString());
         this.C.e(!$$2.b());
         this.a(this.C);
      }
   }
}

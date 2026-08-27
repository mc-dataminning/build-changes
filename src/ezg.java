public class ezg extends fad<cei> {
   private static final aeu x = new aeu("container/anvil/text_field");
   private static final aeu y = new aeu("container/anvil/text_field_disabled");
   private static final aeu z = new aeu("container/anvil/error");
   private static final aeu A = new aeu("textures/gui/container/anvil.png");
   private static final ti B = ti.c("container.repair.expensive");
   private esu C;
   private final cbp D;

   public ezg(cei $$0, cbo $$1, ti $$2) {
      super($$0, $$1, $$2, A);
      this.D = $$1.m;
      this.l = 60;
   }

   @Override
   protected void E() {
      int $$0 = (this.g - this.c) / 2;
      int $$1 = (this.h - this.k) / 2;
      this.C = new esu(this.i, $$0 + 62, $$1 + 24, 103, 12, ti.c("container.repair"));
      this.C.f(false);
      this.C.m(-1);
      this.C.n(-1);
      this.C.d(false);
      this.C.l(50);
      this.C.b(this::a);
      this.C.a("");
      this.e(this.C);
      this.c(this.C);
      this.C.e(this.p.b(0).f());
   }

   @Override
   public void a(eqq $$0, int $$1, int $$2) {
      String $$3 = this.C.a();
      this.b($$0, $$1, $$2);
      this.C.a($$3);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.s.q();
      }

      return !this.C.a($$0, $$1, $$2) && !this.C.e() ? super.a($$0, $$1, $$2) : true;
   }

   private void a(String $$0) {
      cfy $$1 = this.p.b(0);
      if ($$1.f()) {
         String $$2 = $$0;
         if (!$$1.e().A() && $$0.equals($$1.e().y().getString())) {
            $$2 = "";
         }

         if (this.p.a($$2)) {
            this.f.s.cl.b(new ach($$2));
         }
      }
   }

   @Override
   protected void b(esa $$0, int $$1, int $$2) {
      super.b($$0, $$1, $$2);
      int $$3 = this.p.n();
      if ($$3 > 0) {
         int $$4 = 8453920;
         ti $$5;
         if ($$3 >= 40 && !this.f.s.fR().d) {
            $$5 = B;
            $$4 = 16736352;
         } else if (!this.p.b(2).f()) {
            $$5 = null;
         } else {
            $$5 = ti.a("container.repair.cost", $$3);
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
   protected void a(esa $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p.b(0).f() ? x : y, this.t + 59, this.u + 20, 110, 16);
   }

   @Override
   public void d(esa $$0, int $$1, int $$2, float $$3) {
      this.C.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void c(esa $$0, int $$1, int $$2) {
      if ((this.p.b(0).f() || this.p.b(1).f()) && !this.p.b(this.p.o()).f()) {
         $$0.a(z, $$1 + 99, $$2 + 45, 28, 21);
      }
   }

   @Override
   public void a(ceg $$0, int $$1, cja $$2) {
      if ($$1 == 0) {
         this.C.a($$2.b() ? "" : $$2.y().getString());
         this.C.e(!$$2.b());
         this.a(this.C);
      }
   }
}

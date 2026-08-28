public class foz extends fmy {
   private static final xl a = xl.c("jigsaw_block.joint_label");
   private static final xl b = xl.c("jigsaw_block.pool");
   private static final xl c = xl.c("jigsaw_block.name");
   private static final xl d = xl.c("jigsaw_block.target");
   private static final xl r = xl.c("jigsaw_block.final_state");
   private static final xl s = xl.c("jigsaw_block.placement_priority");
   private static final xl u = xl.c("jigsaw_block.placement_priority.tooltip");
   private static final xl v = xl.c("jigsaw_block.selection_priority");
   private static final xl w = xl.c("jigsaw_block.selection_priority.tooltip");
   private final dqc x;
   private fhi y;
   private fhi z;
   private fhi A;
   private fhi B;
   private fhi C;
   private fhi D;
   int E;
   private boolean F = true;
   private fhg<dqc.a> G;
   private fgz H;
   private fgz I;
   private dqc.a J;

   public foz(dqc $$0) {
      super(fes.a);
      this.x = $$0;
   }

   private void m() {
      this.D();
      this.m.a(null);
   }

   private void C() {
      this.m.a(null);
   }

   private void D() {
      this.m
         .L()
         .b(new aij(this.x.aA_(), new alb(this.y.a()), new alb(this.z.a()), new alb(this.A.a()), this.B.a(), this.J, this.a(this.C.a()), this.a(this.D.a())));
   }

   private int a(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void E() {
      this.m.L().b(new aho(this.x.aA_(), this.E, this.F));
   }

   @Override
   public void d() {
      this.C();
   }

   @Override
   protected void aN_() {
      this.A = new fhi(this.p, this.n / 2 - 153, 20, 300, 20, b);
      this.A.f(128);
      this.A.a(this.x.d().a().toString());
      this.A.b($$0x -> this.F());
      this.d(this.A);
      this.y = new fhi(this.p, this.n / 2 - 153, 55, 300, 20, c);
      this.y.f(128);
      this.y.a(this.x.b().toString());
      this.y.b($$0x -> this.F());
      this.d(this.y);
      this.z = new fhi(this.p, this.n / 2 - 153, 90, 300, 20, d);
      this.z.f(128);
      this.z.a(this.x.c().toString());
      this.z.b($$0x -> this.F());
      this.d(this.z);
      this.B = new fhi(this.p, this.n / 2 - 153, 125, 300, 20, r);
      this.B.f(256);
      this.B.a(this.x.f());
      this.d(this.B);
      this.C = new fhi(this.p, this.n / 2 - 153, 160, 98, 20, v);
      this.C.f(3);
      this.C.a(Integer.toString(this.x.l()));
      this.C.a(fik.a(w));
      this.d(this.C);
      this.D = new fhi(this.p, this.n / 2 - 50, 160, 98, 20, s);
      this.D.f(3);
      this.D.a(Integer.toString(this.x.k()));
      this.D.a(fik.a(u));
      this.d(this.D);
      this.J = this.x.j();
      this.G = this.c(fhg.<dqc.a>a(dqc.a::a).a(dqc.a.values()).a(this.J).a().a(this.n / 2 + 54, 160, 100, 20, a, ($$0x, $$1) -> this.J = $$1));
      boolean $$0 = diw.m(this.x.n()).o().b();
      this.G.j = $$0;
      this.G.k = $$0;
      this.c(new fgv(this.n / 2 - 154, 185, 100, 20, xk.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(xl.a("jigsaw_block.levels", foz.this.E));
         }

         @Override
         protected void a() {
            foz.this.E = ayu.a(ayu.b(0.0, 20.0, this.c));
         }
      });
      this.c(fhg.b(this.F).a(this.n / 2 - 50, 185, 100, 20, xl.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.F = $$1));
      this.I = this.c((fgz)fgz.a(xl.c("jigsaw_block.generate"), $$0x -> {
         this.m();
         this.E();
      }).a(this.n / 2 + 54, 185, 100, 20).a());
      this.H = this.c((fgz)fgz.a(xk.d, $$0x -> this.m()).a(this.n / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fgz)fgz.a(xk.e, $$0x -> this.C()).a(this.n / 2 + 4, 210, 150, 20).a());
      this.F();
   }

   @Override
   protected void aD_() {
      this.b(this.A);
   }

   @Override
   public void b(fgm $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private void F() {
      boolean $$0 = alb.i(this.y.a()) && alb.i(this.z.a()) && alb.i(this.A.a());
      this.H.j = $$0;
      this.I.j = $$0;
   }

   @Override
   public void a(ffa $$0, int $$1, int $$2) {
      String $$3 = this.y.a();
      String $$4 = this.z.a();
      String $$5 = this.A.a();
      String $$6 = this.B.a();
      String $$7 = this.C.a();
      String $$8 = this.D.a();
      int $$9 = this.E;
      dqc.a $$10 = this.J;
      this.b($$0, $$1, $$2);
      this.y.a($$3);
      this.z.a($$4);
      this.A.a($$5);
      this.B.a($$6);
      this.E = $$9;
      this.J = $$10;
      this.G.a($$10);
      this.C.a($$7);
      this.D.a($$8);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (!this.H.j || $$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.m();
         return true;
      }
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, b, this.n / 2 - 153, 10, 10526880);
      this.A.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, c, this.n / 2 - 153, 45, 10526880);
      this.y.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, d, this.n / 2 - 153, 80, 10526880);
      this.z.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, r, this.n / 2 - 153, 115, 10526880);
      this.B.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, v, this.n / 2 - 153, 150, 10526880);
      this.D.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, s, this.n / 2 - 50, 150, 10526880);
      this.C.a($$0, $$1, $$2, $$3);
      if (diw.m(this.x.n()).o().b()) {
         $$0.b(this.p, a, this.n / 2 + 53, 150, 10526880);
      }
   }
}

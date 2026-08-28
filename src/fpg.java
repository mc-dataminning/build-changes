public class fpg extends fnf {
   private static final xp a = xp.c("jigsaw_block.joint_label");
   private static final xp b = xp.c("jigsaw_block.pool");
   private static final xp c = xp.c("jigsaw_block.name");
   private static final xp d = xp.c("jigsaw_block.target");
   private static final xp r = xp.c("jigsaw_block.final_state");
   private static final xp s = xp.c("jigsaw_block.placement_priority");
   private static final xp u = xp.c("jigsaw_block.placement_priority.tooltip");
   private static final xp v = xp.c("jigsaw_block.selection_priority");
   private static final xp w = xp.c("jigsaw_block.selection_priority.tooltip");
   private final dqj x;
   private fhp y;
   private fhp z;
   private fhp A;
   private fhp B;
   private fhp C;
   private fhp D;
   int E;
   private boolean F = true;
   private fhn<dqj.a> G;
   private fhg H;
   private fhg I;
   private dqj.a J;

   public fpg(dqj $$0) {
      super(fez.a);
      this.x = $$0;
   }

   private void m() {
      this.F();
      this.m.a(null);
   }

   private void E() {
      this.m.a(null);
   }

   private void F() {
      this.m
         .L()
         .b(new ain(this.x.ay_(), new alf(this.y.a()), new alf(this.z.a()), new alf(this.A.a()), this.B.a(), this.J, this.a(this.C.a()), this.a(this.D.a())));
   }

   private int a(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void I() {
      this.m.L().b(new ahs(this.x.ay_(), this.E, this.F));
   }

   @Override
   public void d() {
      this.E();
   }

   @Override
   protected void aM_() {
      this.A = new fhp(this.p, this.n / 2 - 153, 20, 300, 20, b);
      this.A.f(128);
      this.A.a(this.x.d().a().toString());
      this.A.b($$0x -> this.J());
      this.d(this.A);
      this.y = new fhp(this.p, this.n / 2 - 153, 55, 300, 20, c);
      this.y.f(128);
      this.y.a(this.x.b().toString());
      this.y.b($$0x -> this.J());
      this.d(this.y);
      this.z = new fhp(this.p, this.n / 2 - 153, 90, 300, 20, d);
      this.z.f(128);
      this.z.a(this.x.c().toString());
      this.z.b($$0x -> this.J());
      this.d(this.z);
      this.B = new fhp(this.p, this.n / 2 - 153, 125, 300, 20, r);
      this.B.f(256);
      this.B.a(this.x.f());
      this.d(this.B);
      this.C = new fhp(this.p, this.n / 2 - 153, 160, 98, 20, v);
      this.C.f(3);
      this.C.a(Integer.toString(this.x.l()));
      this.C.a(fir.a(w));
      this.d(this.C);
      this.D = new fhp(this.p, this.n / 2 - 50, 160, 98, 20, s);
      this.D.f(3);
      this.D.a(Integer.toString(this.x.k()));
      this.D.a(fir.a(u));
      this.d(this.D);
      this.J = this.x.j();
      this.G = this.c(fhn.<dqj.a>a(dqj.a::a).a(dqj.a.values()).a(this.J).a().a(this.n / 2 + 54, 160, 100, 20, a, ($$0x, $$1) -> this.J = $$1));
      boolean $$0 = djd.m(this.x.n()).o().b();
      this.G.j = $$0;
      this.G.k = $$0;
      this.c(new fhc(this.n / 2 - 154, 185, 100, 20, xo.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(xp.a("jigsaw_block.levels", fpg.this.E));
         }

         @Override
         protected void a() {
            fpg.this.E = ayz.a(ayz.b(0.0, 20.0, this.c));
         }
      });
      this.c(fhn.b(this.F).a(this.n / 2 - 50, 185, 100, 20, xp.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.F = $$1));
      this.I = this.c((fhg)fhg.a(xp.c("jigsaw_block.generate"), $$0x -> {
         this.m();
         this.I();
      }).a(this.n / 2 + 54, 185, 100, 20).a());
      this.H = this.c((fhg)fhg.a(xo.d, $$0x -> this.m()).a(this.n / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fhg)fhg.a(xo.e, $$0x -> this.E()).a(this.n / 2 + 4, 210, 150, 20).a());
      this.J();
   }

   @Override
   protected void aB_() {
      this.b(this.A);
   }

   @Override
   public void b(fgt $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private void J() {
      boolean $$0 = alf.i(this.y.a()) && alf.i(this.z.a()) && alf.i(this.A.a());
      this.H.j = $$0;
      this.I.j = $$0;
   }

   @Override
   public void a(ffh $$0, int $$1, int $$2) {
      String $$3 = this.y.a();
      String $$4 = this.z.a();
      String $$5 = this.A.a();
      String $$6 = this.B.a();
      String $$7 = this.C.a();
      String $$8 = this.D.a();
      int $$9 = this.E;
      dqj.a $$10 = this.J;
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
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
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
      if (djd.m(this.x.n()).o().b()) {
         $$0.b(this.p, a, this.n / 2 + 53, 150, 10526880);
      }
   }
}

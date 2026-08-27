public class flo extends fjo {
   private static final wg a = wg.c("jigsaw_block.joint_label");
   private static final wg b = wg.c("jigsaw_block.pool");
   private static final wg c = wg.c("jigsaw_block.name");
   private static final wg d = wg.c("jigsaw_block.target");
   private static final wg o = wg.c("jigsaw_block.final_state");
   private static final wg p = wg.c("jigsaw_block.placement_priority");
   private static final wg q = wg.c("jigsaw_block.placement_priority.tooltip");
   private static final wg r = wg.c("jigsaw_block.selection_priority");
   private static final wg s = wg.c("jigsaw_block.selection_priority.tooltip");
   private final dnf u;
   private fdy v;
   private fdy w;
   private fdy x;
   private fdy y;
   private fdy z;
   private fdy A;
   int B;
   private boolean C = true;
   private fdw<dnf.a> D;
   private fdp E;
   private fdp F;
   private dnf.a G;

   public flo(dnf $$0) {
      super(fbh.a);
      this.u = $$0;
   }

   private void m() {
      this.D();
      this.j.a(null);
   }

   private void C() {
      this.j.a(null);
   }

   private void D() {
      this.j
         .L()
         .b(new ahb(this.u.aA_(), new ajt(this.v.a()), new ajt(this.w.a()), new ajt(this.x.a()), this.y.a(), this.G, this.a(this.z.a()), this.a(this.A.a())));
   }

   private int a(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void E() {
      this.j.L().b(new agg(this.u.aA_(), this.B, this.C));
   }

   @Override
   public void d() {
      this.C();
   }

   @Override
   protected void aN_() {
      this.x = new fdy(this.m, this.k / 2 - 153, 20, 300, 20, b);
      this.x.f(128);
      this.x.a(this.u.d().a().toString());
      this.x.b($$0x -> this.F());
      this.d(this.x);
      this.v = new fdy(this.m, this.k / 2 - 153, 55, 300, 20, c);
      this.v.f(128);
      this.v.a(this.u.b().toString());
      this.v.b($$0x -> this.F());
      this.d(this.v);
      this.w = new fdy(this.m, this.k / 2 - 153, 90, 300, 20, d);
      this.w.f(128);
      this.w.a(this.u.c().toString());
      this.w.b($$0x -> this.F());
      this.d(this.w);
      this.y = new fdy(this.m, this.k / 2 - 153, 125, 300, 20, o);
      this.y.f(256);
      this.y.a(this.u.f());
      this.d(this.y);
      this.z = new fdy(this.m, this.k / 2 - 153, 160, 98, 20, r);
      this.z.f(3);
      this.z.a(Integer.toString(this.u.l()));
      this.z.a(ffa.a(s));
      this.d(this.z);
      this.A = new fdy(this.m, this.k / 2 - 50, 160, 98, 20, p);
      this.A.f(3);
      this.A.a(Integer.toString(this.u.k()));
      this.A.a(ffa.a(q));
      this.d(this.A);
      this.G = this.u.j();
      this.D = this.c(fdw.<dnf.a>a(dnf.a::a).a(dnf.a.values()).a(this.G).a().a(this.k / 2 + 54, 160, 100, 20, a, ($$0x, $$1) -> this.G = $$1));
      boolean $$0 = dfz.m(this.u.n()).o().b();
      this.D.j = $$0;
      this.D.k = $$0;
      this.c(new fdl(this.k / 2 - 154, 185, 100, 20, wf.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(wg.a("jigsaw_block.levels", flo.this.B));
         }

         @Override
         protected void a() {
            flo.this.B = axk.a(axk.b(0.0, 20.0, this.c));
         }
      });
      this.c(fdw.b(this.C).a(this.k / 2 - 50, 185, 100, 20, wg.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.C = $$1));
      this.F = this.c((fdp)fdp.a(wg.c("jigsaw_block.generate"), $$0x -> {
         this.m();
         this.E();
      }).a(this.k / 2 + 54, 185, 100, 20).a());
      this.E = this.c((fdp)fdp.a(wf.d, $$0x -> this.m()).a(this.k / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fdp)fdp.a(wf.e, $$0x -> this.C()).a(this.k / 2 + 4, 210, 150, 20).a());
      this.F();
   }

   @Override
   protected void aD_() {
      this.b(this.x);
   }

   private void F() {
      boolean $$0 = ajt.i(this.v.a()) && ajt.i(this.w.a()) && ajt.i(this.x.a());
      this.E.j = $$0;
      this.F.j = $$0;
   }

   @Override
   public void a(fbp $$0, int $$1, int $$2) {
      String $$3 = this.v.a();
      String $$4 = this.w.a();
      String $$5 = this.x.a();
      String $$6 = this.y.a();
      String $$7 = this.z.a();
      String $$8 = this.A.a();
      int $$9 = this.B;
      dnf.a $$10 = this.G;
      this.b($$0, $$1, $$2);
      this.v.a($$3);
      this.w.a($$4);
      this.x.a($$5);
      this.y.a($$6);
      this.B = $$9;
      this.G = $$10;
      this.D.a($$10);
      this.z.a($$7);
      this.A.a($$8);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (!this.E.j || $$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.m();
         return true;
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.b(this.m, b, this.k / 2 - 153, 10, 10526880);
      this.x.a($$0, $$1, $$2, $$3);
      $$0.b(this.m, c, this.k / 2 - 153, 45, 10526880);
      this.v.a($$0, $$1, $$2, $$3);
      $$0.b(this.m, d, this.k / 2 - 153, 80, 10526880);
      this.w.a($$0, $$1, $$2, $$3);
      $$0.b(this.m, o, this.k / 2 - 153, 115, 10526880);
      this.y.a($$0, $$1, $$2, $$3);
      $$0.b(this.m, r, this.k / 2 - 153, 150, 10526880);
      this.A.a($$0, $$1, $$2, $$3);
      $$0.b(this.m, p, this.k / 2 - 50, 150, 10526880);
      this.z.a($$0, $$1, $$2, $$3);
      if (dfz.m(this.u.n()).o().b()) {
         $$0.b(this.m, a, this.k / 2 + 53, 150, 10526880);
      }
   }
}

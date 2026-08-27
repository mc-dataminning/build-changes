public class flx extends fjx {
   private static final wi a = wi.c("jigsaw_block.joint_label");
   private static final wi b = wi.c("jigsaw_block.pool");
   private static final wi c = wi.c("jigsaw_block.name");
   private static final wi d = wi.c("jigsaw_block.target");
   private static final wi o = wi.c("jigsaw_block.final_state");
   private static final wi p = wi.c("jigsaw_block.placement_priority");
   private static final wi q = wi.c("jigsaw_block.placement_priority.tooltip");
   private static final wi r = wi.c("jigsaw_block.selection_priority");
   private static final wi s = wi.c("jigsaw_block.selection_priority.tooltip");
   private final dno u;
   private feh v;
   private feh w;
   private feh x;
   private feh y;
   private feh z;
   private feh A;
   int B;
   private boolean C = true;
   private fef<dno.a> D;
   private fdy E;
   private fdy F;
   private dno.a G;

   public flx(dno $$0) {
      super(fbq.a);
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
         .b(new ahd(this.u.az_(), new ajv(this.v.a()), new ajv(this.w.a()), new ajv(this.x.a()), this.y.a(), this.G, this.a(this.z.a()), this.a(this.A.a())));
   }

   private int a(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void E() {
      this.j.L().b(new agi(this.u.az_(), this.B, this.C));
   }

   @Override
   public void d() {
      this.C();
   }

   @Override
   protected void aM_() {
      this.x = new feh(this.m, this.k / 2 - 153, 20, 300, 20, b);
      this.x.f(128);
      this.x.a(this.u.d().a().toString());
      this.x.b($$0x -> this.F());
      this.d(this.x);
      this.v = new feh(this.m, this.k / 2 - 153, 55, 300, 20, c);
      this.v.f(128);
      this.v.a(this.u.b().toString());
      this.v.b($$0x -> this.F());
      this.d(this.v);
      this.w = new feh(this.m, this.k / 2 - 153, 90, 300, 20, d);
      this.w.f(128);
      this.w.a(this.u.c().toString());
      this.w.b($$0x -> this.F());
      this.d(this.w);
      this.y = new feh(this.m, this.k / 2 - 153, 125, 300, 20, o);
      this.y.f(256);
      this.y.a(this.u.f());
      this.d(this.y);
      this.z = new feh(this.m, this.k / 2 - 153, 160, 98, 20, r);
      this.z.f(3);
      this.z.a(Integer.toString(this.u.l()));
      this.z.a(ffj.a(s));
      this.d(this.z);
      this.A = new feh(this.m, this.k / 2 - 50, 160, 98, 20, p);
      this.A.f(3);
      this.A.a(Integer.toString(this.u.k()));
      this.A.a(ffj.a(q));
      this.d(this.A);
      this.G = this.u.j();
      this.D = this.c(fef.<dno.a>a(dno.a::a).a(dno.a.values()).a(this.G).a().a(this.k / 2 + 54, 160, 100, 20, a, ($$0x, $$1) -> this.G = $$1));
      boolean $$0 = dgi.m(this.u.n()).o().b();
      this.D.j = $$0;
      this.D.k = $$0;
      this.c(new fdu(this.k / 2 - 154, 185, 100, 20, wh.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(wi.a("jigsaw_block.levels", flx.this.B));
         }

         @Override
         protected void a() {
            flx.this.B = axm.a(axm.b(0.0, 20.0, this.c));
         }
      });
      this.c(fef.b(this.C).a(this.k / 2 - 50, 185, 100, 20, wi.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.C = $$1));
      this.F = this.c((fdy)fdy.a(wi.c("jigsaw_block.generate"), $$0x -> {
         this.m();
         this.E();
      }).a(this.k / 2 + 54, 185, 100, 20).a());
      this.E = this.c((fdy)fdy.a(wh.d, $$0x -> this.m()).a(this.k / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fdy)fdy.a(wh.e, $$0x -> this.C()).a(this.k / 2 + 4, 210, 150, 20).a());
      this.F();
   }

   @Override
   protected void aC_() {
      this.b(this.x);
   }

   private void F() {
      boolean $$0 = ajv.i(this.v.a()) && ajv.i(this.w.a()) && ajv.i(this.x.a());
      this.E.j = $$0;
      this.F.j = $$0;
   }

   @Override
   public void a(fby $$0, int $$1, int $$2) {
      String $$3 = this.v.a();
      String $$4 = this.w.a();
      String $$5 = this.x.a();
      String $$6 = this.y.a();
      String $$7 = this.z.a();
      String $$8 = this.A.a();
      int $$9 = this.B;
      dno.a $$10 = this.G;
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
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
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
      if (dgi.m(this.u.n()).o().b()) {
         $$0.b(this.m, a, this.k / 2 + 53, 150, 10526880);
      }
   }
}

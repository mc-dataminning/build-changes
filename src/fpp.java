public class fpp extends fnx {
   private static final wy a = wy.c("jigsaw_block.joint_label");
   private static final wy b = wy.c("jigsaw_block.pool");
   private static final wy c = wy.c("jigsaw_block.name");
   private static final wy q = wy.c("jigsaw_block.target");
   private static final wy r = wy.c("jigsaw_block.final_state");
   private static final wy s = wy.c("jigsaw_block.placement_priority");
   private static final wy u = wy.c("jigsaw_block.placement_priority.tooltip");
   private static final wy v = wy.c("jigsaw_block.selection_priority");
   private static final wy w = wy.c("jigsaw_block.selection_priority.tooltip");
   private final drg x;
   private fip y;
   private fip z;
   private fip A;
   private fip B;
   private fip C;
   private fip D;
   int E;
   private boolean F = true;
   private fin<drg.a> G;
   private fig H;
   private fig I;
   private drg.a J;

   public fpp(drg $$0) {
      super(fga.a);
      this.x = $$0;
   }

   private void m() {
      this.E();
      this.l.a(null);
   }

   private void D() {
      this.l.a(null);
   }

   private void E() {
      this.l.L().b(new ahy(this.x.az_(), akq.a(this.y.a()), akq.a(this.z.a()), akq.a(this.A.a()), this.B.a(), this.J, this.a(this.C.a()), this.a(this.D.a())));
   }

   private int a(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void F() {
      this.l.L().b(new ahd(this.x.az_(), this.E, this.F));
   }

   @Override
   public void d() {
      this.D();
   }

   @Override
   protected void aP_() {
      this.A = new fip(this.o, this.m / 2 - 153, 20, 300, 20, b);
      this.A.f(128);
      this.A.a(this.x.d().a().toString());
      this.A.b($$0x -> this.G());
      this.d(this.A);
      this.y = new fip(this.o, this.m / 2 - 153, 55, 300, 20, c);
      this.y.f(128);
      this.y.a(this.x.b().toString());
      this.y.b($$0x -> this.G());
      this.d(this.y);
      this.z = new fip(this.o, this.m / 2 - 153, 90, 300, 20, q);
      this.z.f(128);
      this.z.a(this.x.c().toString());
      this.z.b($$0x -> this.G());
      this.d(this.z);
      this.B = new fip(this.o, this.m / 2 - 153, 125, 300, 20, r);
      this.B.f(256);
      this.B.a(this.x.f());
      this.d(this.B);
      this.C = new fip(this.o, this.m / 2 - 153, 160, 98, 20, v);
      this.C.f(3);
      this.C.a(Integer.toString(this.x.l()));
      this.C.a(fjr.a(w));
      this.d(this.C);
      this.D = new fip(this.o, this.m / 2 - 50, 160, 98, 20, s);
      this.D.f(3);
      this.D.a(Integer.toString(this.x.k()));
      this.D.a(fjr.a(u));
      this.d(this.D);
      this.J = this.x.j();
      this.G = this.c(fin.<drg.a>a(drg.a::a).a(drg.a.values()).a(this.J).a().a(this.m / 2 + 54, 160, 100, 20, a, ($$0x, $$1) -> this.J = $$1));
      boolean $$0 = djy.m(this.x.n()).o().b();
      this.G.j = $$0;
      this.G.k = $$0;
      this.c(new fic(this.m / 2 - 154, 185, 100, 20, wx.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(wy.a("jigsaw_block.levels", fpp.this.E));
         }

         @Override
         protected void a() {
            fpp.this.E = ayn.a(ayn.b(0.0, 20.0, this.c));
         }
      });
      this.c(fin.b(this.F).a(this.m / 2 - 50, 185, 100, 20, wy.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.F = $$1));
      this.I = this.c((fig)fig.a(wy.c("jigsaw_block.generate"), $$0x -> {
         this.m();
         this.F();
      }).a(this.m / 2 + 54, 185, 100, 20).a());
      this.H = this.c((fig)fig.a(wx.d, $$0x -> this.m()).a(this.m / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fig)fig.a(wx.e, $$0x -> this.D()).a(this.m / 2 + 4, 210, 150, 20).a());
      this.G();
   }

   @Override
   protected void aE_() {
      this.b(this.A);
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private void G() {
      boolean $$0 = akq.k(this.y.a()) && akq.k(this.z.a()) && akq.k(this.A.a());
      this.H.j = $$0;
      this.I.j = $$0;
   }

   @Override
   public void a(fgi $$0, int $$1, int $$2) {
      String $$3 = this.y.a();
      String $$4 = this.z.a();
      String $$5 = this.A.a();
      String $$6 = this.B.a();
      String $$7 = this.C.a();
      String $$8 = this.D.a();
      int $$9 = this.E;
      drg.a $$10 = this.J;
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
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.b(this.o, b, this.m / 2 - 153, 10, 10526880);
      this.A.a($$0, $$1, $$2, $$3);
      $$0.b(this.o, c, this.m / 2 - 153, 45, 10526880);
      this.y.a($$0, $$1, $$2, $$3);
      $$0.b(this.o, q, this.m / 2 - 153, 80, 10526880);
      this.z.a($$0, $$1, $$2, $$3);
      $$0.b(this.o, r, this.m / 2 - 153, 115, 10526880);
      this.B.a($$0, $$1, $$2, $$3);
      $$0.b(this.o, v, this.m / 2 - 153, 150, 10526880);
      this.D.a($$0, $$1, $$2, $$3);
      $$0.b(this.o, s, this.m / 2 - 50, 150, 10526880);
      this.C.a($$0, $$1, $$2, $$3);
      if (djy.m(this.x.n()).o().b()) {
         $$0.b(this.o, a, this.m / 2 + 53, 150, 10526880);
      }
   }
}

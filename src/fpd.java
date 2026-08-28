public class fpd extends fnl {
   private static final wu a = wu.c("jigsaw_block.joint_label");
   private static final wu b = wu.c("jigsaw_block.pool");
   private static final wu c = wu.c("jigsaw_block.name");
   private static final wu q = wu.c("jigsaw_block.target");
   private static final wu r = wu.c("jigsaw_block.final_state");
   private static final wu s = wu.c("jigsaw_block.placement_priority");
   private static final wu u = wu.c("jigsaw_block.placement_priority.tooltip");
   private static final wu v = wu.c("jigsaw_block.selection_priority");
   private static final wu w = wu.c("jigsaw_block.selection_priority.tooltip");
   private final dqr x;
   private fid y;
   private fid z;
   private fid A;
   private fid B;
   private fid C;
   private fid D;
   int E;
   private boolean F = true;
   private fib<dqr.a> G;
   private fhu H;
   private fhu I;
   private dqr.a J;

   public fpd(dqr $$0) {
      super(ffo.a);
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
      this.l
         .L()
         .b(new ahs(this.x.az_(), new akk(this.y.a()), new akk(this.z.a()), new akk(this.A.a()), this.B.a(), this.J, this.a(this.C.a()), this.a(this.D.a())));
   }

   private int a(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void F() {
      this.l.L().b(new agx(this.x.az_(), this.E, this.F));
   }

   @Override
   public void d() {
      this.D();
   }

   @Override
   protected void aP_() {
      this.A = new fid(this.o, this.m / 2 - 153, 20, 300, 20, b);
      this.A.f(128);
      this.A.a(this.x.d().a().toString());
      this.A.b($$0x -> this.G());
      this.d(this.A);
      this.y = new fid(this.o, this.m / 2 - 153, 55, 300, 20, c);
      this.y.f(128);
      this.y.a(this.x.b().toString());
      this.y.b($$0x -> this.G());
      this.d(this.y);
      this.z = new fid(this.o, this.m / 2 - 153, 90, 300, 20, q);
      this.z.f(128);
      this.z.a(this.x.c().toString());
      this.z.b($$0x -> this.G());
      this.d(this.z);
      this.B = new fid(this.o, this.m / 2 - 153, 125, 300, 20, r);
      this.B.f(256);
      this.B.a(this.x.f());
      this.d(this.B);
      this.C = new fid(this.o, this.m / 2 - 153, 160, 98, 20, v);
      this.C.f(3);
      this.C.a(Integer.toString(this.x.l()));
      this.C.a(fjf.a(w));
      this.d(this.C);
      this.D = new fid(this.o, this.m / 2 - 50, 160, 98, 20, s);
      this.D.f(3);
      this.D.a(Integer.toString(this.x.k()));
      this.D.a(fjf.a(u));
      this.d(this.D);
      this.J = this.x.j();
      this.G = this.c(fib.<dqr.a>a(dqr.a::a).a(dqr.a.values()).a(this.J).a().a(this.m / 2 + 54, 160, 100, 20, a, ($$0x, $$1) -> this.J = $$1));
      boolean $$0 = djk.m(this.x.n()).o().b();
      this.G.j = $$0;
      this.G.k = $$0;
      this.c(new fhq(this.m / 2 - 154, 185, 100, 20, wt.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(wu.a("jigsaw_block.levels", fpd.this.E));
         }

         @Override
         protected void a() {
            fpd.this.E = ayg.a(ayg.b(0.0, 20.0, this.c));
         }
      });
      this.c(fib.b(this.F).a(this.m / 2 - 50, 185, 100, 20, wu.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.F = $$1));
      this.I = this.c((fhu)fhu.a(wu.c("jigsaw_block.generate"), $$0x -> {
         this.m();
         this.F();
      }).a(this.m / 2 + 54, 185, 100, 20).a());
      this.H = this.c((fhu)fhu.a(wt.d, $$0x -> this.m()).a(this.m / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fhu)fhu.a(wt.e, $$0x -> this.D()).a(this.m / 2 + 4, 210, 150, 20).a());
      this.G();
   }

   @Override
   protected void aE_() {
      this.b(this.A);
   }

   @Override
   public void b(fhh $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private void G() {
      boolean $$0 = akk.i(this.y.a()) && akk.i(this.z.a()) && akk.i(this.A.a());
      this.H.j = $$0;
      this.I.j = $$0;
   }

   @Override
   public void a(ffw $$0, int $$1, int $$2) {
      String $$3 = this.y.a();
      String $$4 = this.z.a();
      String $$5 = this.A.a();
      String $$6 = this.B.a();
      String $$7 = this.C.a();
      String $$8 = this.D.a();
      int $$9 = this.E;
      dqr.a $$10 = this.J;
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
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
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
      if (djk.m(this.x.n()).o().b()) {
         $$0.b(this.o, a, this.m / 2 + 53, 150, 10526880);
      }
   }
}

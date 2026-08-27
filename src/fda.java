public class fda extends faz {
   private static final int a = 7;
   private static final uv b = uv.c("jigsaw_block.joint_label");
   private static final uv c = uv.c("jigsaw_block.pool");
   private static final uv k = uv.c("jigsaw_block.name");
   private static final uv l = uv.c("jigsaw_block.target");
   private static final uv m = uv.c("jigsaw_block.final_state");
   private static final uv n = uv.c("jigsaw_block.placement_priority");
   private static final uv o = uv.c("jigsaw_block.placement_priority.tooltip");
   private static final uv p = uv.c("jigsaw_block.selection_priority");
   private static final uv q = uv.c("jigsaw_block.selection_priority.tooltip");
   private final dgi r;
   private evn t;
   private evn u;
   private evn v;
   private evn w;
   private evn x;
   private evn y;
   int z;
   private boolean A = true;
   private evl<dgi.a> B;
   private eve C;
   private eve D;
   private dgi.a E;

   public fda(dgi $$0) {
      super(eta.a);
      this.r = $$0;
   }

   private void l() {
      this.D();
      this.f.a(null);
   }

   private void C() {
      this.f.a(null);
   }

   private void D() {
      this.f
         .I()
         .b(new aef(this.r.aC_(), new agm(this.t.a()), new agm(this.u.a()), new agm(this.v.a()), this.w.a(), this.E, this.a(this.x.a()), this.a(this.y.a())));
   }

   private int a(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void E() {
      this.f.I().b(new adk(this.r.aC_(), this.z, this.A));
   }

   @Override
   public void aG_() {
      this.C();
   }

   @Override
   protected void aQ_() {
      this.v = new evn(this.i, this.g / 2 - 153, 20, 300, 20, c);
      this.v.l(128);
      this.v.a(this.r.f().a().toString());
      this.v.b($$0x -> this.F());
      this.e(this.v);
      this.t = new evn(this.i, this.g / 2 - 153, 55, 300, 20, k);
      this.t.l(128);
      this.t.a(this.r.c().toString());
      this.t.b($$0x -> this.F());
      this.e(this.t);
      this.u = new evn(this.i, this.g / 2 - 153, 90, 300, 20, l);
      this.u.l(128);
      this.u.a(this.r.d().toString());
      this.u.b($$0x -> this.F());
      this.e(this.u);
      this.w = new evn(this.i, this.g / 2 - 153, 125, 300, 20, m);
      this.w.l(256);
      this.w.a(this.r.g());
      this.e(this.w);
      this.x = new evn(this.i, this.g / 2 - 153, 160, 98, 20, p);
      this.x.l(3);
      this.x.a(Integer.toString(this.r.m()));
      this.x.a(ewp.a(q));
      this.e(this.x);
      this.y = new evn(this.i, this.g / 2 - 50, 160, 98, 20, n);
      this.y.l(3);
      this.y.a(Integer.toString(this.r.l()));
      this.y.a(ewp.a(o));
      this.e(this.y);
      this.E = this.r.k();
      this.B = this.d(evl.<dgi.a>a(dgi.a::a).a(dgi.a.values()).a(this.E).a().a(this.g / 2 + 54, 160, 100, 20, b, ($$0x, $$1) -> this.E = $$1));
      boolean $$0 = czg.h(this.r.r()).o().b();
      this.B.i = $$0;
      this.B.j = $$0;
      this.d(new eva(this.g / 2 - 154, 185, 100, 20, uu.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(uv.a("jigsaw_block.levels", fda.this.z));
         }

         @Override
         protected void a() {
            fda.this.z = atq.a(atq.b(0.0, 7.0, this.c));
         }
      });
      this.d(evl.b(this.A).a(this.g / 2 - 50, 185, 100, 20, uv.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.A = $$1));
      this.D = this.d(eve.a(uv.c("jigsaw_block.generate"), $$0x -> {
         this.l();
         this.E();
      }).a(this.g / 2 + 54, 185, 100, 20).a());
      this.C = this.d(eve.a(uu.d, $$0x -> this.l()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.d(eve.a(uu.e, $$0x -> this.C()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.c(this.v);
      this.F();
   }

   private void F() {
      boolean $$0 = agm.i(this.t.a()) && agm.i(this.u.a()) && agm.i(this.v.a());
      this.C.i = $$0;
      this.D.i = $$0;
   }

   @Override
   public void a(eti $$0, int $$1, int $$2) {
      String $$3 = this.t.a();
      String $$4 = this.u.a();
      String $$5 = this.v.a();
      String $$6 = this.w.a();
      String $$7 = this.x.a();
      String $$8 = this.y.a();
      int $$9 = this.z;
      dgi.a $$10 = this.E;
      this.b($$0, $$1, $$2);
      this.t.a($$3);
      this.u.a($$4);
      this.v.a($$5);
      this.w.a($$6);
      this.z = $$9;
      this.E = $$10;
      this.B.a($$10);
      this.x.a($$7);
      this.y.a($$8);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (!this.C.i || $$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.l();
         return true;
      }
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, c, this.g / 2 - 153, 10, 10526880);
      this.v.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, k, this.g / 2 - 153, 45, 10526880);
      this.t.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, l, this.g / 2 - 153, 80, 10526880);
      this.u.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, m, this.g / 2 - 153, 115, 10526880);
      this.w.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, p, this.g / 2 - 153, 150, 10526880);
      this.y.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, n, this.g / 2 - 50, 150, 10526880);
      this.x.a($$0, $$1, $$2, $$3);
      if (czg.h(this.r.r()).o().b()) {
         $$0.b(this.i, b, this.g / 2 + 53, 150, 10526880);
      }
   }
}

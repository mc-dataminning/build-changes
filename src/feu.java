public class feu extends fct {
   private static final vd a = vd.c("jigsaw_block.joint_label");
   private static final vd b = vd.c("jigsaw_block.pool");
   private static final vd c = vd.c("jigsaw_block.name");
   private static final vd k = vd.c("jigsaw_block.target");
   private static final vd l = vd.c("jigsaw_block.final_state");
   private static final vd m = vd.c("jigsaw_block.placement_priority");
   private static final vd n = vd.c("jigsaw_block.placement_priority.tooltip");
   private static final vd o = vd.c("jigsaw_block.selection_priority");
   private static final vd p = vd.c("jigsaw_block.selection_priority.tooltip");
   private final dho q;
   private exh r;
   private exh t;
   private exh u;
   private exh v;
   private exh w;
   private exh x;
   int y;
   private boolean z = true;
   private exf<dho.a> A;
   private ewy B;
   private ewy C;
   private dho.a D;

   public feu(dho $$0) {
      super(eus.a);
      this.q = $$0;
   }

   private void n() {
      this.D();
      this.f.a(null);
   }

   private void C() {
      this.f.a(null);
   }

   private void D() {
      this.f
         .I()
         .b(new aew(this.q.aB_(), new ahd(this.r.a()), new ahd(this.t.a()), new ahd(this.u.a()), this.v.a(), this.D, this.a(this.w.a()), this.a(this.x.a())));
   }

   private int a(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void E() {
      this.f.I().b(new aeb(this.q.aB_(), this.y, this.z));
   }

   @Override
   public void aE_() {
      this.C();
   }

   @Override
   protected void aN_() {
      this.u = new exh(this.i, this.g / 2 - 153, 20, 300, 20, b);
      this.u.e(128);
      this.u.a(this.q.f().a().toString());
      this.u.b($$0x -> this.H());
      this.e(this.u);
      this.r = new exh(this.i, this.g / 2 - 153, 55, 300, 20, c);
      this.r.e(128);
      this.r.a(this.q.c().toString());
      this.r.b($$0x -> this.H());
      this.e(this.r);
      this.t = new exh(this.i, this.g / 2 - 153, 90, 300, 20, k);
      this.t.e(128);
      this.t.a(this.q.d().toString());
      this.t.b($$0x -> this.H());
      this.e(this.t);
      this.v = new exh(this.i, this.g / 2 - 153, 125, 300, 20, l);
      this.v.e(256);
      this.v.a(this.q.g());
      this.e(this.v);
      this.w = new exh(this.i, this.g / 2 - 153, 160, 98, 20, o);
      this.w.e(3);
      this.w.a(Integer.toString(this.q.m()));
      this.w.a(eyj.a(p));
      this.e(this.w);
      this.x = new exh(this.i, this.g / 2 - 50, 160, 98, 20, m);
      this.x.e(3);
      this.x.a(Integer.toString(this.q.l()));
      this.x.a(eyj.a(n));
      this.e(this.x);
      this.D = this.q.k();
      this.A = this.d(exf.<dho.a>a(dho.a::a).a(dho.a.values()).a(this.D).a().a(this.g / 2 + 54, 160, 100, 20, a, ($$0x, $$1) -> this.D = $$1));
      boolean $$0 = dak.h(this.q.r()).o().b();
      this.A.j = $$0;
      this.A.k = $$0;
      this.d(new ewu(this.g / 2 - 154, 185, 100, 20, vc.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(vd.a("jigsaw_block.levels", feu.this.y));
         }

         @Override
         protected void a() {
            feu.this.y = aui.a(aui.b(0.0, 20.0, this.c));
         }
      });
      this.d(exf.b(this.z).a(this.g / 2 - 50, 185, 100, 20, vd.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.z = $$1));
      this.C = this.d(ewy.a(vd.c("jigsaw_block.generate"), $$0x -> {
         this.n();
         this.E();
      }).a(this.g / 2 + 54, 185, 100, 20).a());
      this.B = this.d(ewy.a(vc.d, $$0x -> this.n()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.d(ewy.a(vc.e, $$0x -> this.C()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.c(this.u);
      this.H();
   }

   private void H() {
      boolean $$0 = ahd.i(this.r.a()) && ahd.i(this.t.a()) && ahd.i(this.u.a());
      this.B.j = $$0;
      this.C.j = $$0;
   }

   @Override
   public void a(eva $$0, int $$1, int $$2) {
      String $$3 = this.r.a();
      String $$4 = this.t.a();
      String $$5 = this.u.a();
      String $$6 = this.v.a();
      String $$7 = this.w.a();
      String $$8 = this.x.a();
      int $$9 = this.y;
      dho.a $$10 = this.D;
      this.b($$0, $$1, $$2);
      this.r.a($$3);
      this.t.a($$4);
      this.u.a($$5);
      this.v.a($$6);
      this.y = $$9;
      this.D = $$10;
      this.A.a($$10);
      this.w.a($$7);
      this.x.a($$8);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (!this.B.j || $$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.n();
         return true;
      }
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, b, this.g / 2 - 153, 10, 10526880);
      this.u.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, c, this.g / 2 - 153, 45, 10526880);
      this.r.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, k, this.g / 2 - 153, 80, 10526880);
      this.t.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, l, this.g / 2 - 153, 115, 10526880);
      this.v.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, o, this.g / 2 - 153, 150, 10526880);
      this.x.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, m, this.g / 2 - 50, 150, 10526880);
      this.w.a($$0, $$1, $$2, $$3);
      if (dak.h(this.q.r()).o().b()) {
         $$0.b(this.i, a, this.g / 2 + 53, 150, 10526880);
      }
   }
}

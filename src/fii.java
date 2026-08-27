public class fii extends fgh {
   private static final vs a = vs.c("jigsaw_block.joint_label");
   private static final vs b = vs.c("jigsaw_block.pool");
   private static final vs c = vs.c("jigsaw_block.name");
   private static final vs k = vs.c("jigsaw_block.target");
   private static final vs l = vs.c("jigsaw_block.final_state");
   private static final vs m = vs.c("jigsaw_block.placement_priority");
   private static final vs n = vs.c("jigsaw_block.placement_priority.tooltip");
   private static final vs o = vs.c("jigsaw_block.selection_priority");
   private static final vs p = vs.c("jigsaw_block.selection_priority.tooltip");
   private final dkl q;
   private fat r;
   private fat t;
   private fat u;
   private fat v;
   private fat w;
   private fat x;
   int y;
   private boolean z = true;
   private far<dkl.a> A;
   private fak B;
   private fak C;
   private dkl.a D;

   public fii(dkl $$0) {
      super(eyc.a);
      this.q = $$0;
   }

   private void o() {
      this.H();
      this.f.a(null);
   }

   private void E() {
      this.f.a(null);
   }

   private void H() {
      this.f
         .K()
         .b(new agl(this.q.aD_(), new ajc(this.r.a()), new ajc(this.t.a()), new ajc(this.u.a()), this.v.a(), this.D, this.a(this.w.a()), this.a(this.x.a())));
   }

   private int a(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void I() {
      this.f.K().b(new afq(this.q.aD_(), this.y, this.z));
   }

   @Override
   public void d() {
      this.E();
   }

   @Override
   protected void aP_() {
      this.u = new fat(this.i, this.g / 2 - 153, 20, 300, 20, b);
      this.u.f(128);
      this.u.a(this.q.d().a().toString());
      this.u.b($$0x -> this.J());
      this.d(this.u);
      this.r = new fat(this.i, this.g / 2 - 153, 55, 300, 20, c);
      this.r.f(128);
      this.r.a(this.q.b().toString());
      this.r.b($$0x -> this.J());
      this.d(this.r);
      this.t = new fat(this.i, this.g / 2 - 153, 90, 300, 20, k);
      this.t.f(128);
      this.t.a(this.q.c().toString());
      this.t.b($$0x -> this.J());
      this.d(this.t);
      this.v = new fat(this.i, this.g / 2 - 153, 125, 300, 20, l);
      this.v.f(256);
      this.v.a(this.q.f());
      this.d(this.v);
      this.w = new fat(this.i, this.g / 2 - 153, 160, 98, 20, o);
      this.w.f(3);
      this.w.a(Integer.toString(this.q.l()));
      this.w.a(fbv.a(p));
      this.d(this.w);
      this.x = new fat(this.i, this.g / 2 - 50, 160, 98, 20, m);
      this.x.f(3);
      this.x.a(Integer.toString(this.q.k()));
      this.x.a(fbv.a(n));
      this.d(this.x);
      this.D = this.q.j();
      this.A = this.c(far.<dkl.a>a(dkl.a::a).a(dkl.a.values()).a(this.D).a().a(this.g / 2 + 54, 160, 100, 20, a, ($$0x, $$1) -> this.D = $$1));
      boolean $$0 = ddg.m(this.q.n()).o().b();
      this.A.j = $$0;
      this.A.k = $$0;
      this.c(new fag(this.g / 2 - 154, 185, 100, 20, vr.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(vs.a("jigsaw_block.levels", fii.this.y));
         }

         @Override
         protected void a() {
            fii.this.y = awm.a(awm.b(0.0, 20.0, this.c));
         }
      });
      this.c(far.b(this.z).a(this.g / 2 - 50, 185, 100, 20, vs.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.z = $$1));
      this.C = this.c((fak)fak.a(vs.c("jigsaw_block.generate"), $$0x -> {
         this.o();
         this.I();
      }).a(this.g / 2 + 54, 185, 100, 20).a());
      this.B = this.c((fak)fak.a(vr.d, $$0x -> this.o()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fak)fak.a(vr.e, $$0x -> this.E()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.J();
   }

   @Override
   protected void aG_() {
      this.b(this.u);
   }

   private void J() {
      boolean $$0 = ajc.i(this.r.a()) && ajc.i(this.t.a()) && ajc.i(this.u.a());
      this.B.j = $$0;
      this.C.j = $$0;
   }

   @Override
   public void a(eyk $$0, int $$1, int $$2) {
      String $$3 = this.r.a();
      String $$4 = this.t.a();
      String $$5 = this.u.a();
      String $$6 = this.v.a();
      String $$7 = this.w.a();
      String $$8 = this.x.a();
      int $$9 = this.y;
      dkl.a $$10 = this.D;
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
         this.o();
         return true;
      }
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
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
      if (ddg.m(this.q.n()).o().b()) {
         $$0.b(this.i, a, this.g / 2 + 53, 150, 10526880);
      }
   }
}

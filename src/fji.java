public class fji extends fhh {
   private static final vu a = vu.c("jigsaw_block.joint_label");
   private static final vu b = vu.c("jigsaw_block.pool");
   private static final vu c = vu.c("jigsaw_block.name");
   private static final vu k = vu.c("jigsaw_block.target");
   private static final vu l = vu.c("jigsaw_block.final_state");
   private static final vu m = vu.c("jigsaw_block.placement_priority");
   private static final vu n = vu.c("jigsaw_block.placement_priority.tooltip");
   private static final vu o = vu.c("jigsaw_block.selection_priority");
   private static final vu p = vu.c("jigsaw_block.selection_priority.tooltip");
   private final dli q;
   private fbr r;
   private fbr t;
   private fbr u;
   private fbr v;
   private fbr w;
   private fbr x;
   int y;
   private boolean z = true;
   private fbp<dli.a> A;
   private fbi B;
   private fbi C;
   private dli.a D;

   public fji(dli $$0) {
      super(eza.a);
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
         .L()
         .b(new agp(this.q.aC_(), new ajh(this.r.a()), new ajh(this.t.a()), new ajh(this.u.a()), this.v.a(), this.D, this.a(this.w.a()), this.a(this.x.a())));
   }

   private int a(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void I() {
      this.f.L().b(new afu(this.q.aC_(), this.y, this.z));
   }

   @Override
   public void d() {
      this.E();
   }

   @Override
   protected void aO_() {
      this.u = new fbr(this.i, this.g / 2 - 153, 20, 300, 20, b);
      this.u.f(128);
      this.u.a(this.q.d().a().toString());
      this.u.b($$0x -> this.J());
      this.d(this.u);
      this.r = new fbr(this.i, this.g / 2 - 153, 55, 300, 20, c);
      this.r.f(128);
      this.r.a(this.q.b().toString());
      this.r.b($$0x -> this.J());
      this.d(this.r);
      this.t = new fbr(this.i, this.g / 2 - 153, 90, 300, 20, k);
      this.t.f(128);
      this.t.a(this.q.c().toString());
      this.t.b($$0x -> this.J());
      this.d(this.t);
      this.v = new fbr(this.i, this.g / 2 - 153, 125, 300, 20, l);
      this.v.f(256);
      this.v.a(this.q.f());
      this.d(this.v);
      this.w = new fbr(this.i, this.g / 2 - 153, 160, 98, 20, o);
      this.w.f(3);
      this.w.a(Integer.toString(this.q.l()));
      this.w.a(fct.a(p));
      this.d(this.w);
      this.x = new fbr(this.i, this.g / 2 - 50, 160, 98, 20, m);
      this.x.f(3);
      this.x.a(Integer.toString(this.q.k()));
      this.x.a(fct.a(n));
      this.d(this.x);
      this.D = this.q.j();
      this.A = this.c(fbp.<dli.a>a(dli.a::a).a(dli.a.values()).a(this.D).a().a(this.g / 2 + 54, 160, 100, 20, a, ($$0x, $$1) -> this.D = $$1));
      boolean $$0 = ded.m(this.q.n()).o().b();
      this.A.j = $$0;
      this.A.k = $$0;
      this.c(new fbe(this.g / 2 - 154, 185, 100, 20, vt.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(vu.a("jigsaw_block.levels", fji.this.y));
         }

         @Override
         protected void a() {
            fji.this.y = aww.a(aww.b(0.0, 20.0, this.c));
         }
      });
      this.c(fbp.b(this.z).a(this.g / 2 - 50, 185, 100, 20, vu.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.z = $$1));
      this.C = this.c((fbi)fbi.a(vu.c("jigsaw_block.generate"), $$0x -> {
         this.o();
         this.I();
      }).a(this.g / 2 + 54, 185, 100, 20).a());
      this.B = this.c((fbi)fbi.a(vt.d, $$0x -> this.o()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fbi)fbi.a(vt.e, $$0x -> this.E()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.J();
   }

   @Override
   protected void aF_() {
      this.b(this.u);
   }

   private void J() {
      boolean $$0 = ajh.i(this.r.a()) && ajh.i(this.t.a()) && ajh.i(this.u.a());
      this.B.j = $$0;
      this.C.j = $$0;
   }

   @Override
   public void a(ezi $$0, int $$1, int $$2) {
      String $$3 = this.r.a();
      String $$4 = this.t.a();
      String $$5 = this.u.a();
      String $$6 = this.v.a();
      String $$7 = this.w.a();
      String $$8 = this.x.a();
      int $$9 = this.y;
      dli.a $$10 = this.D;
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
   public void a(fav $$0, int $$1, int $$2, float $$3) {
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
      if (ded.m(this.q.n()).o().b()) {
         $$0.b(this.i, a, this.g / 2 + 53, 150, 10526880);
      }
   }
}

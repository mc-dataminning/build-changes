public class ffc extends fdb {
   private static final vf a = vf.c("jigsaw_block.joint_label");
   private static final vf b = vf.c("jigsaw_block.pool");
   private static final vf c = vf.c("jigsaw_block.name");
   private static final vf k = vf.c("jigsaw_block.target");
   private static final vf l = vf.c("jigsaw_block.final_state");
   private static final vf m = vf.c("jigsaw_block.placement_priority");
   private static final vf n = vf.c("jigsaw_block.placement_priority.tooltip");
   private static final vf o = vf.c("jigsaw_block.selection_priority");
   private static final vf p = vf.c("jigsaw_block.selection_priority.tooltip");
   private final dhv q;
   private exp r;
   private exp t;
   private exp u;
   private exp v;
   private exp w;
   private exp x;
   int y;
   private boolean z = true;
   private exn<dhv.a> A;
   private exg B;
   private exg C;
   private dhv.a D;

   public ffc(dhv $$0) {
      super(eva.a);
      this.q = $$0;
   }

   private void n() {
      this.E();
      this.f.a(null);
   }

   private void D() {
      this.f.a(null);
   }

   private void E() {
      this.f
         .J()
         .b(new aez(this.q.aB_(), new ahg(this.r.a()), new ahg(this.t.a()), new ahg(this.u.a()), this.v.a(), this.D, this.a(this.w.a()), this.a(this.x.a())));
   }

   private int a(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void H() {
      this.f.J().b(new aee(this.q.aB_(), this.y, this.z));
   }

   @Override
   public void aE_() {
      this.D();
   }

   @Override
   protected void aN_() {
      this.u = new exp(this.i, this.g / 2 - 153, 20, 300, 20, b);
      this.u.f(128);
      this.u.a(this.q.f().a().toString());
      this.u.b($$0x -> this.I());
      this.e(this.u);
      this.r = new exp(this.i, this.g / 2 - 153, 55, 300, 20, c);
      this.r.f(128);
      this.r.a(this.q.c().toString());
      this.r.b($$0x -> this.I());
      this.e(this.r);
      this.t = new exp(this.i, this.g / 2 - 153, 90, 300, 20, k);
      this.t.f(128);
      this.t.a(this.q.d().toString());
      this.t.b($$0x -> this.I());
      this.e(this.t);
      this.v = new exp(this.i, this.g / 2 - 153, 125, 300, 20, l);
      this.v.f(256);
      this.v.a(this.q.g());
      this.e(this.v);
      this.w = new exp(this.i, this.g / 2 - 153, 160, 98, 20, o);
      this.w.f(3);
      this.w.a(Integer.toString(this.q.m()));
      this.w.a(eyr.a(p));
      this.e(this.w);
      this.x = new exp(this.i, this.g / 2 - 50, 160, 98, 20, m);
      this.x.f(3);
      this.x.a(Integer.toString(this.q.l()));
      this.x.a(eyr.a(n));
      this.e(this.x);
      this.D = this.q.k();
      this.A = this.d(exn.<dhv.a>a(dhv.a::a).a(dhv.a.values()).a(this.D).a().a(this.g / 2 + 54, 160, 100, 20, a, ($$0x, $$1) -> this.D = $$1));
      boolean $$0 = dar.h(this.q.r()).o().b();
      this.A.j = $$0;
      this.A.k = $$0;
      this.d(new exc(this.g / 2 - 154, 185, 100, 20, ve.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(vf.a("jigsaw_block.levels", ffc.this.y));
         }

         @Override
         protected void a() {
            ffc.this.y = auo.a(auo.b(0.0, 20.0, this.c));
         }
      });
      this.d(exn.b(this.z).a(this.g / 2 - 50, 185, 100, 20, vf.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.z = $$1));
      this.C = this.d(exg.a(vf.c("jigsaw_block.generate"), $$0x -> {
         this.n();
         this.H();
      }).a(this.g / 2 + 54, 185, 100, 20).a());
      this.B = this.d(exg.a(ve.d, $$0x -> this.n()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.d(exg.a(ve.e, $$0x -> this.D()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.c(this.u);
      this.I();
   }

   private void I() {
      boolean $$0 = ahg.i(this.r.a()) && ahg.i(this.t.a()) && ahg.i(this.u.a());
      this.B.j = $$0;
      this.C.j = $$0;
   }

   @Override
   public void a(evi $$0, int $$1, int $$2) {
      String $$3 = this.r.a();
      String $$4 = this.t.a();
      String $$5 = this.u.a();
      String $$6 = this.v.a();
      String $$7 = this.w.a();
      String $$8 = this.x.a();
      int $$9 = this.y;
      dhv.a $$10 = this.D;
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
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
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
      if (dar.h(this.q.r()).o().b()) {
         $$0.b(this.i, a, this.g / 2 + 53, 150, 10526880);
      }
   }
}

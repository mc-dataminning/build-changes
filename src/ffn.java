public class ffn extends fdm {
   private static final vg a = vg.c("jigsaw_block.joint_label");
   private static final vg b = vg.c("jigsaw_block.pool");
   private static final vg c = vg.c("jigsaw_block.name");
   private static final vg k = vg.c("jigsaw_block.target");
   private static final vg l = vg.c("jigsaw_block.final_state");
   private static final vg m = vg.c("jigsaw_block.placement_priority");
   private static final vg n = vg.c("jigsaw_block.placement_priority.tooltip");
   private static final vg o = vg.c("jigsaw_block.selection_priority");
   private static final vg p = vg.c("jigsaw_block.selection_priority.tooltip");
   private final did q;
   private eya r;
   private eya t;
   private eya u;
   private eya v;
   private eya w;
   private eya x;
   int y;
   private boolean z = true;
   private exy<did.a> A;
   private exr B;
   private exr C;
   private did.a D;

   public ffn(did $$0) {
      super(evj.a);
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
         .J()
         .b(new afa(this.q.aE_(), new ahh(this.r.a()), new ahh(this.t.a()), new ahh(this.u.a()), this.v.a(), this.D, this.a(this.w.a()), this.a(this.x.a())));
   }

   private int a(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void I() {
      this.f.J().b(new aef(this.q.aE_(), this.y, this.z));
   }

   @Override
   public void d() {
      this.E();
   }

   @Override
   protected void aP_() {
      this.u = new eya(this.i, this.g / 2 - 153, 20, 300, 20, b);
      this.u.f(128);
      this.u.a(this.q.f().a().toString());
      this.u.b($$0x -> this.J());
      this.e(this.u);
      this.r = new eya(this.i, this.g / 2 - 153, 55, 300, 20, c);
      this.r.f(128);
      this.r.a(this.q.c().toString());
      this.r.b($$0x -> this.J());
      this.e(this.r);
      this.t = new eya(this.i, this.g / 2 - 153, 90, 300, 20, k);
      this.t.f(128);
      this.t.a(this.q.d().toString());
      this.t.b($$0x -> this.J());
      this.e(this.t);
      this.v = new eya(this.i, this.g / 2 - 153, 125, 300, 20, l);
      this.v.f(256);
      this.v.a(this.q.g());
      this.e(this.v);
      this.w = new eya(this.i, this.g / 2 - 153, 160, 98, 20, o);
      this.w.f(3);
      this.w.a(Integer.toString(this.q.m()));
      this.w.a(ezc.a(p));
      this.e(this.w);
      this.x = new eya(this.i, this.g / 2 - 50, 160, 98, 20, m);
      this.x.f(3);
      this.x.a(Integer.toString(this.q.l()));
      this.x.a(ezc.a(n));
      this.e(this.x);
      this.D = this.q.k();
      this.A = this.d(exy.<did.a>a(did.a::a).a(did.a.values()).a(this.D).a().a(this.g / 2 + 54, 160, 100, 20, a, ($$0x, $$1) -> this.D = $$1));
      boolean $$0 = daz.h(this.q.r()).o().b();
      this.A.j = $$0;
      this.A.k = $$0;
      this.d(new exn(this.g / 2 - 154, 185, 100, 20, vf.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(vg.a("jigsaw_block.levels", ffn.this.y));
         }

         @Override
         protected void a() {
            ffn.this.y = aup.a(aup.b(0.0, 20.0, this.c));
         }
      });
      this.d(exy.b(this.z).a(this.g / 2 - 50, 185, 100, 20, vg.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.z = $$1));
      this.C = this.d(exr.a(vg.c("jigsaw_block.generate"), $$0x -> {
         this.o();
         this.I();
      }).a(this.g / 2 + 54, 185, 100, 20).a());
      this.B = this.d(exr.a(vf.d, $$0x -> this.o()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.d(exr.a(vf.e, $$0x -> this.E()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.c(this.u);
      this.J();
   }

   private void J() {
      boolean $$0 = ahh.i(this.r.a()) && ahh.i(this.t.a()) && ahh.i(this.u.a());
      this.B.j = $$0;
      this.C.j = $$0;
   }

   @Override
   public void a(evr $$0, int $$1, int $$2) {
      String $$3 = this.r.a();
      String $$4 = this.t.a();
      String $$5 = this.u.a();
      String $$6 = this.v.a();
      String $$7 = this.w.a();
      String $$8 = this.x.a();
      int $$9 = this.y;
      did.a $$10 = this.D;
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
   public void a(exe $$0, int $$1, int $$2, float $$3) {
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
      if (daz.h(this.q.r()).o().b()) {
         $$0.b(this.i, a, this.g / 2 + 53, 150, 10526880);
      }
   }
}

public class fed extends fcc {
   private static final vb a = vb.c("jigsaw_block.joint_label");
   private static final vb b = vb.c("jigsaw_block.pool");
   private static final vb c = vb.c("jigsaw_block.name");
   private static final vb k = vb.c("jigsaw_block.target");
   private static final vb l = vb.c("jigsaw_block.final_state");
   private static final vb m = vb.c("jigsaw_block.placement_priority");
   private static final vb n = vb.c("jigsaw_block.placement_priority.tooltip");
   private static final vb o = vb.c("jigsaw_block.selection_priority");
   private static final vb p = vb.c("jigsaw_block.selection_priority.tooltip");
   private final dhd q;
   private ewq r;
   private ewq t;
   private ewq u;
   private ewq v;
   private ewq w;
   private ewq x;
   int y;
   private boolean z = true;
   private ewo<dhd.a> A;
   private ewh B;
   private ewh C;
   private dhd.a D;

   public fed(dhd $$0) {
      super(euc.a);
      this.q = $$0;
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
         .b(new aem(this.q.aB_(), new agt(this.r.a()), new agt(this.t.a()), new agt(this.u.a()), this.v.a(), this.D, this.a(this.w.a()), this.a(this.x.a())));
   }

   private int a(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void E() {
      this.f.I().b(new adr(this.q.aB_(), this.y, this.z));
   }

   @Override
   public void aF_() {
      this.C();
   }

   @Override
   protected void aP_() {
      this.u = new ewq(this.i, this.g / 2 - 153, 20, 300, 20, b);
      this.u.l(128);
      this.u.a(this.q.f().a().toString());
      this.u.b($$0x -> this.F());
      this.e(this.u);
      this.r = new ewq(this.i, this.g / 2 - 153, 55, 300, 20, c);
      this.r.l(128);
      this.r.a(this.q.c().toString());
      this.r.b($$0x -> this.F());
      this.e(this.r);
      this.t = new ewq(this.i, this.g / 2 - 153, 90, 300, 20, k);
      this.t.l(128);
      this.t.a(this.q.d().toString());
      this.t.b($$0x -> this.F());
      this.e(this.t);
      this.v = new ewq(this.i, this.g / 2 - 153, 125, 300, 20, l);
      this.v.l(256);
      this.v.a(this.q.g());
      this.e(this.v);
      this.w = new ewq(this.i, this.g / 2 - 153, 160, 98, 20, o);
      this.w.l(3);
      this.w.a(Integer.toString(this.q.m()));
      this.w.a(exs.a(p));
      this.e(this.w);
      this.x = new ewq(this.i, this.g / 2 - 50, 160, 98, 20, m);
      this.x.l(3);
      this.x.a(Integer.toString(this.q.l()));
      this.x.a(exs.a(n));
      this.e(this.x);
      this.D = this.q.k();
      this.A = this.d(ewo.<dhd.a>a(dhd.a::a).a(dhd.a.values()).a(this.D).a().a(this.g / 2 + 54, 160, 100, 20, a, ($$0x, $$1) -> this.D = $$1));
      boolean $$0 = daa.h(this.q.r()).o().b();
      this.A.i = $$0;
      this.A.j = $$0;
      this.d(new ewd(this.g / 2 - 154, 185, 100, 20, va.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(vb.a("jigsaw_block.levels", fed.this.y));
         }

         @Override
         protected void a() {
            fed.this.y = aty.a(aty.b(0.0, 20.0, this.c));
         }
      });
      this.d(ewo.b(this.z).a(this.g / 2 - 50, 185, 100, 20, vb.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.z = $$1));
      this.C = this.d(ewh.a(vb.c("jigsaw_block.generate"), $$0x -> {
         this.l();
         this.E();
      }).a(this.g / 2 + 54, 185, 100, 20).a());
      this.B = this.d(ewh.a(va.d, $$0x -> this.l()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.d(ewh.a(va.e, $$0x -> this.C()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.c(this.u);
      this.F();
   }

   private void F() {
      boolean $$0 = agt.i(this.r.a()) && agt.i(this.t.a()) && agt.i(this.u.a());
      this.B.i = $$0;
      this.C.i = $$0;
   }

   @Override
   public void a(euk $$0, int $$1, int $$2) {
      String $$3 = this.r.a();
      String $$4 = this.t.a();
      String $$5 = this.u.a();
      String $$6 = this.v.a();
      String $$7 = this.w.a();
      String $$8 = this.x.a();
      int $$9 = this.y;
      dhd.a $$10 = this.D;
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
      } else if (!this.B.i || $$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.l();
         return true;
      }
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
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
      if (daa.h(this.q.r()).o().b()) {
         $$0.b(this.i, a, this.g / 2 + 53, 150, 10526880);
      }
   }
}

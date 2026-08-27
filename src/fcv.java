public class fcv extends fau {
   private static final int a = 7;
   private static final ur b = ur.c("jigsaw_block.joint_label");
   private static final ur c = ur.c("jigsaw_block.pool");
   private static final ur k = ur.c("jigsaw_block.name");
   private static final ur l = ur.c("jigsaw_block.target");
   private static final ur m = ur.c("jigsaw_block.final_state");
   private static final ur n = ur.c("jigsaw_block.placement_priority");
   private static final ur o = ur.c("jigsaw_block.placement_priority.tooltip");
   private static final ur p = ur.c("jigsaw_block.selection_priority");
   private static final ur q = ur.c("jigsaw_block.selection_priority.tooltip");
   private final dgd r;
   private evi t;
   private evi u;
   private evi v;
   private evi w;
   private evi x;
   private evi y;
   int z;
   private boolean A = true;
   private evg<dgd.a> B;
   private euz C;
   private euz D;
   private dgd.a E;

   public fcv(dgd $$0) {
      super(esv.a);
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
         .b(new aeb(this.r.p(), new agi(this.t.a()), new agi(this.u.a()), new agi(this.v.a()), this.w.a(), this.E, this.a(this.x.a()), this.a(this.y.a())));
   }

   private int a(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void E() {
      this.f.I().b(new adg(this.r.p(), this.z, this.A));
   }

   @Override
   public void aF_() {
      this.C();
   }

   @Override
   protected void aP_() {
      this.v = new evi(this.i, this.g / 2 - 153, 20, 300, 20, c);
      this.v.l(128);
      this.v.a(this.r.f().a().toString());
      this.v.b($$0x -> this.F());
      this.e(this.v);
      this.t = new evi(this.i, this.g / 2 - 153, 55, 300, 20, k);
      this.t.l(128);
      this.t.a(this.r.c().toString());
      this.t.b($$0x -> this.F());
      this.e(this.t);
      this.u = new evi(this.i, this.g / 2 - 153, 90, 300, 20, l);
      this.u.l(128);
      this.u.a(this.r.d().toString());
      this.u.b($$0x -> this.F());
      this.e(this.u);
      this.w = new evi(this.i, this.g / 2 - 153, 125, 300, 20, m);
      this.w.l(256);
      this.w.a(this.r.g());
      this.e(this.w);
      this.x = new evi(this.i, this.g / 2 - 153, 160, 98, 20, p);
      this.x.l(3);
      this.x.a(Integer.toString(this.r.v()));
      this.x.a(ewk.a(q));
      this.e(this.x);
      this.y = new evi(this.i, this.g / 2 - 50, 160, 98, 20, n);
      this.y.l(3);
      this.y.a(Integer.toString(this.r.j()));
      this.y.a(ewk.a(o));
      this.e(this.y);
      this.E = this.r.i();
      this.B = this.d(evg.<dgd.a>a(dgd.a::a).a(dgd.a.values()).a(this.E).a().a(this.g / 2 + 54, 160, 100, 20, b, ($$0x, $$1) -> this.E = $$1));
      boolean $$0 = czb.h(this.r.q()).o().b();
      this.B.i = $$0;
      this.B.j = $$0;
      this.d(new euv(this.g / 2 - 154, 185, 100, 20, uq.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(ur.a("jigsaw_block.levels", fcv.this.z));
         }

         @Override
         protected void a() {
            fcv.this.z = atm.a(atm.b(0.0, 7.0, this.c));
         }
      });
      this.d(evg.b(this.A).a(this.g / 2 - 50, 185, 100, 20, ur.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.A = $$1));
      this.D = this.d(euz.a(ur.c("jigsaw_block.generate"), $$0x -> {
         this.l();
         this.E();
      }).a(this.g / 2 + 54, 185, 100, 20).a());
      this.C = this.d(euz.a(uq.d, $$0x -> this.l()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.d(euz.a(uq.e, $$0x -> this.C()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.c(this.v);
      this.F();
   }

   private void F() {
      boolean $$0 = agi.i(this.t.a()) && agi.i(this.u.a()) && agi.i(this.v.a());
      this.C.i = $$0;
      this.D.i = $$0;
   }

   @Override
   public void a(etd $$0, int $$1, int $$2) {
      String $$3 = this.t.a();
      String $$4 = this.u.a();
      String $$5 = this.v.a();
      String $$6 = this.w.a();
      String $$7 = this.x.a();
      String $$8 = this.y.a();
      int $$9 = this.z;
      dgd.a $$10 = this.E;
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
   public void a(euo $$0, int $$1, int $$2, float $$3) {
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
      if (czb.h(this.r.q()).o().b()) {
         $$0.b(this.i, b, this.g / 2 + 53, 150, 10526880);
      }
   }
}

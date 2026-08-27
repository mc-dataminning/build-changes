public class faj extends eyk {
   private static final int a = 7;
   private static final tm b = tm.c("jigsaw_block.joint_label");
   private static final tm c = tm.c("jigsaw_block.pool");
   private static final tm k = tm.c("jigsaw_block.name");
   private static final tm l = tm.c("jigsaw_block.target");
   private static final tm m = tm.c("jigsaw_block.final_state");
   private final ddu n;
   private esz o;
   private esz p;
   private esz q;
   private esz s;
   int t;
   private boolean u = true;
   private esx<ddu.a> v;
   private esq w;
   private esq x;
   private ddu.a y;

   public faj(ddu $$0) {
      super(eqn.a);
      this.n = $$0;
   }

   private void l() {
      this.E();
      this.f.a(null);
   }

   private void D() {
      this.f.a(null);
   }

   private void E() {
      this.f.J().b(new acs(this.n.p(), new aex(this.o.a()), new aex(this.p.a()), new aex(this.q.a()), this.s.a(), this.y));
   }

   private void F() {
      this.f.J().b(new abx(this.n.p(), this.t, this.u));
   }

   @Override
   public void az_() {
      this.D();
   }

   @Override
   protected void aI_() {
      this.q = new esz(this.i, this.g / 2 - 153, 20, 300, 20, tm.c("jigsaw_block.pool"));
      this.q.l(128);
      this.q.a(this.n.f().a().toString());
      this.q.b($$0x -> this.G());
      this.e(this.q);
      this.o = new esz(this.i, this.g / 2 - 153, 55, 300, 20, tm.c("jigsaw_block.name"));
      this.o.l(128);
      this.o.a(this.n.c().toString());
      this.o.b($$0x -> this.G());
      this.e(this.o);
      this.p = new esz(this.i, this.g / 2 - 153, 90, 300, 20, tm.c("jigsaw_block.target"));
      this.p.l(128);
      this.p.a(this.n.d().toString());
      this.p.b($$0x -> this.G());
      this.e(this.p);
      this.s = new esz(this.i, this.g / 2 - 153, 125, 300, 20, tm.c("jigsaw_block.final_state"));
      this.s.l(256);
      this.s.a(this.n.g());
      this.e(this.s);
      this.y = this.n.i();
      int $$0 = this.i.a(b) + 10;
      this.v = this.d(esx.<ddu.a>a(ddu.a::a).a(ddu.a.values()).a(this.y).a().a(this.g / 2 - 152 + $$0, 150, 300 - $$0, 20, b, ($$0x, $$1x) -> this.y = $$1x));
      boolean $$1 = cwu.h(this.n.q()).o().b();
      this.v.i = $$1;
      this.v.j = $$1;
      this.d(new esm(this.g / 2 - 154, 180, 100, 20, tl.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(tm.a("jigsaw_block.levels", faj.this.t));
         }

         @Override
         protected void a() {
            faj.this.t = arx.a(arx.b(0.0, 7.0, this.c));
         }
      });
      this.d(esx.b(this.u).a(this.g / 2 - 50, 180, 100, 20, tm.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1x) -> this.u = $$1x));
      this.x = this.d(esq.a(tm.c("jigsaw_block.generate"), $$0x -> {
         this.l();
         this.F();
      }).a(this.g / 2 + 54, 180, 100, 20).a());
      this.w = this.d(esq.a(tl.d, $$0x -> this.l()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.d(esq.a(tl.e, $$0x -> this.D()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.c(this.q);
      this.G();
   }

   private void G() {
      boolean $$0 = aex.i(this.o.a()) && aex.i(this.p.a()) && aex.i(this.q.a());
      this.w.i = $$0;
      this.x.i = $$0;
   }

   @Override
   public void a(eqv $$0, int $$1, int $$2) {
      String $$3 = this.o.a();
      String $$4 = this.p.a();
      String $$5 = this.q.a();
      String $$6 = this.s.a();
      int $$7 = this.t;
      ddu.a $$8 = this.y;
      this.b($$0, $$1, $$2);
      this.o.a($$3);
      this.p.a($$4);
      this.q.a($$5);
      this.s.a($$6);
      this.t = $$7;
      this.y = $$8;
      this.v.a($$8);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (!this.w.i || $$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.l();
         return true;
      }
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, c, this.g / 2 - 153, 10, 10526880);
      this.q.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, k, this.g / 2 - 153, 45, 10526880);
      this.o.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, l, this.g / 2 - 153, 80, 10526880);
      this.p.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, m, this.g / 2 - 153, 115, 10526880);
      this.s.a($$0, $$1, $$2, $$3);
      if (cwu.h(this.n.q()).o().b()) {
         $$0.b(this.i, b, this.g / 2 - 153, 156, 16777215);
      }
   }
}

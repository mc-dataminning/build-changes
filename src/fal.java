public class fal extends eym {
   private static final int a = 7;
   private static final tn b = tn.c("jigsaw_block.joint_label");
   private static final tn c = tn.c("jigsaw_block.pool");
   private static final tn k = tn.c("jigsaw_block.name");
   private static final tn l = tn.c("jigsaw_block.target");
   private static final tn m = tn.c("jigsaw_block.final_state");
   private final ddw n;
   private etb o;
   private etb p;
   private etb q;
   private etb s;
   int t;
   private boolean u = true;
   private esz<ddw.a> v;
   private ess w;
   private ess x;
   private ddw.a y;

   public fal(ddw $$0) {
      super(eqp.a);
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
      this.f.J().b(new act(this.n.p(), new aey(this.o.a()), new aey(this.p.a()), new aey(this.q.a()), this.s.a(), this.y));
   }

   private void F() {
      this.f.J().b(new aby(this.n.p(), this.t, this.u));
   }

   @Override
   public void az_() {
      this.D();
   }

   @Override
   protected void aH_() {
      this.q = new etb(this.i, this.g / 2 - 153, 20, 300, 20, tn.c("jigsaw_block.pool"));
      this.q.l(128);
      this.q.a(this.n.f().a().toString());
      this.q.b($$0x -> this.G());
      this.e(this.q);
      this.o = new etb(this.i, this.g / 2 - 153, 55, 300, 20, tn.c("jigsaw_block.name"));
      this.o.l(128);
      this.o.a(this.n.c().toString());
      this.o.b($$0x -> this.G());
      this.e(this.o);
      this.p = new etb(this.i, this.g / 2 - 153, 90, 300, 20, tn.c("jigsaw_block.target"));
      this.p.l(128);
      this.p.a(this.n.d().toString());
      this.p.b($$0x -> this.G());
      this.e(this.p);
      this.s = new etb(this.i, this.g / 2 - 153, 125, 300, 20, tn.c("jigsaw_block.final_state"));
      this.s.l(256);
      this.s.a(this.n.g());
      this.e(this.s);
      this.y = this.n.i();
      int $$0 = this.i.a(b) + 10;
      this.v = this.d(esz.<ddw.a>a(ddw.a::a).a(ddw.a.values()).a(this.y).a().a(this.g / 2 - 152 + $$0, 150, 300 - $$0, 20, b, ($$0x, $$1x) -> this.y = $$1x));
      boolean $$1 = cww.h(this.n.q()).o().b();
      this.v.i = $$1;
      this.v.j = $$1;
      this.d(new eso(this.g / 2 - 154, 180, 100, 20, tm.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(tn.a("jigsaw_block.levels", fal.this.t));
         }

         @Override
         protected void a() {
            fal.this.t = ary.a(ary.b(0.0, 7.0, this.c));
         }
      });
      this.d(esz.b(this.u).a(this.g / 2 - 50, 180, 100, 20, tn.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1x) -> this.u = $$1x));
      this.x = this.d(ess.a(tn.c("jigsaw_block.generate"), $$0x -> {
         this.l();
         this.F();
      }).a(this.g / 2 + 54, 180, 100, 20).a());
      this.w = this.d(ess.a(tm.d, $$0x -> this.l()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.d(ess.a(tm.e, $$0x -> this.D()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.c(this.q);
      this.G();
   }

   private void G() {
      boolean $$0 = aey.i(this.o.a()) && aey.i(this.p.a()) && aey.i(this.q.a());
      this.w.i = $$0;
      this.x.i = $$0;
   }

   @Override
   public void a(eqx $$0, int $$1, int $$2) {
      String $$3 = this.o.a();
      String $$4 = this.p.a();
      String $$5 = this.q.a();
      String $$6 = this.s.a();
      int $$7 = this.t;
      ddw.a $$8 = this.y;
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
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, c, this.g / 2 - 153, 10, 10526880);
      this.q.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, k, this.g / 2 - 153, 45, 10526880);
      this.o.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, l, this.g / 2 - 153, 80, 10526880);
      this.p.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, m, this.g / 2 - 153, 115, 10526880);
      this.s.a($$0, $$1, $$2, $$3);
      if (cww.h(this.n.q()).o().b()) {
         $$0.b(this.i, b, this.g / 2 - 153, 156, 16777215);
      }
   }
}

public class ezu extends exv {
   private static final int a = 7;
   private static final te b = te.c("jigsaw_block.joint_label");
   private static final te c = te.c("jigsaw_block.pool");
   private static final te k = te.c("jigsaw_block.name");
   private static final te l = te.c("jigsaw_block.target");
   private static final te m = te.c("jigsaw_block.final_state");
   private final ddj n;
   private esr o;
   private esr p;
   private esr q;
   private esr s;
   int t;
   private boolean u = true;
   private esp<ddj.a> v;
   private esi w;
   private esi x;
   private ddj.a y;

   public ezu(ddj $$0) {
      super(eqf.a);
      this.n = $$0;
   }

   private void l() {
      this.C();
      this.f.a(null);
   }

   private void B() {
      this.f.a(null);
   }

   private void C() {
      this.f.I().b(new ack(this.n.p(), new aep(this.o.a()), new aep(this.p.a()), new aep(this.q.a()), this.s.a(), this.y));
   }

   private void D() {
      this.f.I().b(new abp(this.n.p(), this.t, this.u));
   }

   @Override
   public void au_() {
      this.B();
   }

   @Override
   protected void aE_() {
      this.q = new esr(this.i, this.g / 2 - 152, 20, 300, 20, te.c("jigsaw_block.pool"));
      this.q.k(128);
      this.q.a(this.n.f().a().toString());
      this.q.b($$0x -> this.E());
      this.e(this.q);
      this.o = new esr(this.i, this.g / 2 - 152, 55, 300, 20, te.c("jigsaw_block.name"));
      this.o.k(128);
      this.o.a(this.n.c().toString());
      this.o.b($$0x -> this.E());
      this.e(this.o);
      this.p = new esr(this.i, this.g / 2 - 152, 90, 300, 20, te.c("jigsaw_block.target"));
      this.p.k(128);
      this.p.a(this.n.d().toString());
      this.p.b($$0x -> this.E());
      this.e(this.p);
      this.s = new esr(this.i, this.g / 2 - 152, 125, 300, 20, te.c("jigsaw_block.final_state"));
      this.s.k(256);
      this.s.a(this.n.g());
      this.e(this.s);
      this.y = this.n.i();
      int $$0 = this.i.a(b) + 10;
      this.v = this.d(esp.<ddj.a>a(ddj.a::a).a(ddj.a.values()).a(this.y).a().a(this.g / 2 - 152 + $$0, 150, 300 - $$0, 20, b, ($$0x, $$1x) -> this.y = $$1x));
      boolean $$1 = cwj.h(this.n.q()).o().b();
      this.v.i = $$1;
      this.v.j = $$1;
      this.d(new ese(this.g / 2 - 154, 180, 100, 20, td.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(te.a("jigsaw_block.levels", ezu.this.t));
         }

         @Override
         protected void a() {
            ezu.this.t = aro.a(aro.b(0.0, 7.0, this.c));
         }
      });
      this.d(esp.b(this.u).a(this.g / 2 - 50, 180, 100, 20, te.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1x) -> this.u = $$1x));
      this.x = this.d(esi.a(te.c("jigsaw_block.generate"), $$0x -> {
         this.l();
         this.D();
      }).a(this.g / 2 + 54, 180, 100, 20).a());
      this.w = this.d(esi.a(td.d, $$0x -> this.l()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.d(esi.a(td.e, $$0x -> this.B()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.c(this.q);
      this.E();
   }

   private void E() {
      boolean $$0 = aep.i(this.o.a()) && aep.i(this.p.a()) && aep.i(this.q.a());
      this.w.i = $$0;
      this.x.i = $$0;
   }

   @Override
   public void a(eqn $$0, int $$1, int $$2) {
      String $$3 = this.o.a();
      String $$4 = this.p.a();
      String $$5 = this.q.a();
      String $$6 = this.s.a();
      int $$7 = this.t;
      ddj.a $$8 = this.y;
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
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, c, this.g / 2 - 153, 10, 10526880);
      this.q.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, k, this.g / 2 - 153, 45, 10526880);
      this.o.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, l, this.g / 2 - 153, 80, 10526880);
      this.p.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, m, this.g / 2 - 153, 115, 10526880);
      this.s.a($$0, $$1, $$2, $$3);
      if (cwj.h(this.n.q()).o().b()) {
         $$0.b(this.i, b, this.g / 2 - 153, 156, 16777215);
      }
   }
}

public class ewq extends euq {
   private static final int a = 7;
   private static final sw b = sw.c("jigsaw_block.joint_label");
   private static final sw c = sw.c("jigsaw_block.pool");
   private static final sw k = sw.c("jigsaw_block.name");
   private static final sw l = sw.c("jigsaw_block.target");
   private static final sw m = sw.c("jigsaw_block.final_state");
   private final dam n;
   private epr o;
   private epr p;
   private epr q;
   private epr r;
   int s;
   private boolean t = true;
   private epp<dam.a> u;
   private epi v;
   private epi w;
   private dam.a x;

   public ewq(dam $$0) {
      super(enf.a);
      this.n = $$0;
   }

   @Override
   public void f() {
      this.o.a();
      this.p.a();
      this.q.a();
      this.r.a();
   }

   private void l() {
      this.C();
      this.f.a(null);
   }

   private void B() {
      this.f.a(null);
   }

   private void C() {
      this.f.I().a(new aas(this.n.p(), new acq(this.o.b()), new acq(this.p.b()), new acq(this.q.b()), this.r.b(), this.x));
   }

   private void D() {
      this.f.I().a(new zu(this.n.p(), this.s, this.t));
   }

   @Override
   public void aw_() {
      this.B();
   }

   @Override
   protected void b() {
      this.q = new epr(this.i, this.g / 2 - 152, 20, 300, 20, sw.c("jigsaw_block.pool"));
      this.q.m(128);
      this.q.a(this.n.f().a().toString());
      this.q.b($$0x -> this.E());
      this.e(this.q);
      this.o = new epr(this.i, this.g / 2 - 152, 55, 300, 20, sw.c("jigsaw_block.name"));
      this.o.m(128);
      this.o.a(this.n.c().toString());
      this.o.b($$0x -> this.E());
      this.e(this.o);
      this.p = new epr(this.i, this.g / 2 - 152, 90, 300, 20, sw.c("jigsaw_block.target"));
      this.p.m(128);
      this.p.a(this.n.d().toString());
      this.p.b($$0x -> this.E());
      this.e(this.p);
      this.r = new epr(this.i, this.g / 2 - 152, 125, 300, 20, sw.c("jigsaw_block.final_state"));
      this.r.m(256);
      this.r.a(this.n.g());
      this.e(this.r);
      this.x = this.n.i();
      int $$0 = this.i.a(b) + 10;
      this.u = this.d(epp.<dam.a>a(dam.a::a).a(dam.a.values()).a(this.x).a().a(this.g / 2 - 152 + $$0, 150, 300 - $$0, 20, b, ($$0x, $$1x) -> this.x = $$1x));
      boolean $$1 = ctm.h(this.n.q()).o().b();
      this.u.r = $$1;
      this.u.s = $$1;
      this.d(new epd(this.g / 2 - 154, 180, 100, 20, sv.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(sw.a("jigsaw_block.levels", ewq.this.s));
         }

         @Override
         protected void a() {
            ewq.this.s = apa.a(apa.b(0.0, 7.0, this.g));
         }
      });
      this.d(epp.b(this.t).a(this.g / 2 - 50, 180, 100, 20, sw.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1x) -> this.t = $$1x));
      this.w = this.d(epi.a(sw.c("jigsaw_block.generate"), $$0x -> {
         this.l();
         this.D();
      }).a(this.g / 2 + 54, 180, 100, 20).a());
      this.v = this.d(epi.a(sv.d, $$0x -> this.l()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.d(epi.a(sv.e, $$0x -> this.B()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.c(this.q);
      this.E();
   }

   private void E() {
      boolean $$0 = acq.g(this.o.b()) && acq.g(this.p.b()) && acq.g(this.q.b());
      this.v.r = $$0;
      this.w.r = $$0;
   }

   @Override
   public void a(enn $$0, int $$1, int $$2) {
      String $$3 = this.o.b();
      String $$4 = this.p.b();
      String $$5 = this.q.b();
      String $$6 = this.r.b();
      int $$7 = this.s;
      dam.a $$8 = this.x;
      this.b($$0, $$1, $$2);
      this.o.a($$3);
      this.p.a($$4);
      this.q.a($$5);
      this.r.a($$6);
      this.s = $$7;
      this.x = $$8;
      this.u.a($$8);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (!this.v.r || $$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.l();
         return true;
      }
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.b(this.i, c, this.g / 2 - 153, 10, 10526880);
      this.q.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, k, this.g / 2 - 153, 45, 10526880);
      this.o.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, l, this.g / 2 - 153, 80, 10526880);
      this.p.a($$0, $$1, $$2, $$3);
      $$0.b(this.i, m, this.g / 2 - 153, 115, 10526880);
      this.r.a($$0, $$1, $$2, $$3);
      if (ctm.h(this.n.q()).o().b()) {
         $$0.b(this.i, b, this.g / 2 - 153, 156, 16777215);
      }

      super.a($$0, $$1, $$2, $$3);
   }
}

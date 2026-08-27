import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxl extends bmq implements bmt<bxm> {
   public static final double bW = 0.6;
   public static final double bX = 0.8;
   public static final double bY = 1.33;
   private static final cpi bZ = cpi.a(cmk.qW, cmk.qX);
   private static final afz<bxm> ca = agc.a(bxl.class, agb.w);
   private static final afz<Boolean> cb = agc.a(bxl.class, agb.k);
   private static final afz<Boolean> cc = agc.a(bxl.class, agb.k);
   private static final afz<Integer> cd = agc.a(bxl.class, agb.b);
   private bxl.a<cer> ce;
   @Nullable
   private btz cf;
   private float cg;
   private float ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;

   public bxl(blj<? extends bxl> $$0, csy $$1) {
      super($$0, $$1);
   }

   public agt gk() {
      return this.gl().a();
   }

   @Override
   protected void B() {
      this.cf = new bxl.c(this, 0.6, bZ, true);
      this.bO.a(1, new bsl(this));
      this.bO.a(1, new btk(this, 1.5));
      this.bO.a(2, new btw(this));
      this.bO.a(3, new bxl.b(this));
      this.bO.a(4, this.cf);
      this.bO.a(5, new bse(this, 1.1, 8));
      this.bO.a(6, new bsp(this, 1.0, 10.0F, 5.0F, false));
      this.bO.a(7, new bsf(this, 0.8));
      this.bO.a(8, new bsx(this, 0.3F));
      this.bO.a(9, new bth(this));
      this.bO.a(10, new bsd(this, 0.8));
      this.bO.a(11, new bue(this, 0.8, 1.0000001E-5F));
      this.bO.a(12, new bsz(this, cer.class, 10.0F));
      this.bP.a(1, new bun<>(this, byc.class, false, null));
      this.bP.a(1, new bun<>(this, byj.class, false, byj.bU));
   }

   public bxm gl() {
      return this.an.b(ca);
   }

   public void a(bxm $$0) {
      this.an.b(ca, $$0);
   }

   public void A(boolean $$0) {
      this.an.b(cb, $$0);
   }

   public boolean gm() {
      return this.an.b(cb);
   }

   public void B(boolean $$0) {
      this.an.b(cc, $$0);
   }

   public boolean gn() {
      return this.an.b(cc);
   }

   public ckv go() {
      return ckv.a(this.an.b(cd));
   }

   public void a(ckv $$0) {
      this.an.b(cd, $$0.a());
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, kb.ak.e(bxm.b));
      this.an.a(cb, false);
      this.an.a(cc, false);
      this.an.a(cd, ckv.o.a());
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("variant", kb.ak.b(this.gl()).toString());
      $$0.a("CollarColor", (byte)this.go().a());
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      bxm $$1 = kb.ak.a(agt.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(ckv.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Z() {
      if (this.K().b()) {
         double $$0 = this.K().c();
         if ($$0 == 0.6) {
            this.b(bmh.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bmh.a);
            this.g(true);
         } else {
            this.b(bmh.a);
            this.g(false);
         }
      } else {
         this.b(bmh.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected arb y() {
      if (this.u()) {
         if (this.gi()) {
            return arc.dz;
         } else {
            return this.ag.a(4) == 0 ? arc.dA : arc.ds;
         }
      } else {
         return arc.dt;
      }
   }

   @Override
   public int Q() {
      return 120;
   }

   public void gp() {
      this.a(arc.dw, this.eW(), this.eX());
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.dy;
   }

   @Override
   protected arb n_() {
      return arc.du;
   }

   public static bna.a gq() {
      return blx.C().a(bnb.l, 10.0).a(bnb.m, 0.3F).a(bnb.c, 3.0);
   }

   @Override
   protected void a(cer $$0, bjk $$1, cmh $$2) {
      if (this.m($$2)) {
         this.a(arc.dv, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gr() {
      return (float)this.b(bnb.c);
   }

   @Override
   public boolean C(blf $$0) {
      return $$0.a(this.dN().b((blv)this), this.gr());
   }

   @Override
   public void l() {
      super.l();
      if (this.cf != null && this.cf.i() && !this.u() && this.ah % 100 == 0) {
         this.a(arc.dx, 1.0F, 1.0F);
      }

      this.gs();
   }

   private void gs() {
      if ((this.gm() || this.gn()) && this.ah % 5 == 0) {
         this.a(arc.dz, 0.6F + 0.4F * (this.ag.i() - this.ag.i()), 1.0F);
      }

      this.gt();
      this.gu();
   }

   private void gt() {
      this.ch = this.cg;
      this.cj = this.ci;
      if (this.gm()) {
         this.cg = Math.min(1.0F, this.cg + 0.15F);
         this.ci = Math.min(1.0F, this.ci + 0.08F);
      } else {
         this.cg = Math.max(0.0F, this.cg - 0.22F);
         this.ci = Math.max(0.0F, this.ci - 0.13F);
      }
   }

   private void gu() {
      this.cl = this.ck;
      if (this.gn()) {
         this.ck = Math.min(1.0F, this.ck + 0.1F);
      } else {
         this.ck = Math.max(0.0F, this.ck - 0.13F);
      }
   }

   public float E(float $$0) {
      return aty.i($$0, this.ch, this.cg);
   }

   public float F(float $$0) {
      return aty.i($$0, this.cj, this.ci);
   }

   public float G(float $$0) {
      return aty.i($$0, this.cl, this.ck);
   }

   @Nullable
   public bxl b(amp $$0, bla $$1) {
      bxl $$2 = blj.n.a((csy)$$0);
      if ($$2 != null && $$1 instanceof bxl $$3) {
         if (this.ag.h()) {
            $$2.a(this.gl());
         } else {
            $$2.a($$3.gl());
         }

         if (this.u()) {
            $$2.b(this.d());
            $$2.x(true);
            if (this.ag.h()) {
               $$2.a(this.go());
            } else {
               $$2.a($$3.go());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(bxi $$0) {
      if (!this.u()) {
         return false;
      } else {
         return !($$0 instanceof bxl $$1) ? false : $$1.u() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      boolean $$5 = $$0.ao() > 0.9F;
      asg<bxm> $$6 = $$5 ? ars.b : ars.a;
      kb.ak.b($$6).flatMap($$1x -> $$1x.a($$0.F_())).ifPresent($$0x -> this.a((bxm)$$0x.a()));
      amp $$7 = $$0.D();
      if ($$7.a().a(this.dm(), asc.n).b()) {
         this.a(kb.ak.e(bxm.k));
         this.fJ();
      }

      return $$3;
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      cmc $$3 = $$2.d();
      if (this.dM().B) {
         if (this.u() && this.j($$0)) {
            return bjl.a;
         } else {
            return !this.m($$2) || !(this.ev() < this.eM()) && this.u() ? bjl.d : bjl.a;
         }
      } else {
         if (this.u()) {
            if (this.j($$0)) {
               if (!($$3 instanceof ckw)) {
                  if ($$3.u() && this.m($$2) && this.ev() < this.eM()) {
                     this.a($$0, $$1, $$2);
                     this.b((float)$$3.v().a());
                     return bjl.b;
                  }

                  bjl $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.o_()) {
                     this.z(!this.ge());
                  }

                  return $$5;
               }

               ckv $$4 = ((ckw)$$3).d();
               if ($$4 != this.go()) {
                  this.a($$4);
                  if (!$$0.fT().d) {
                     $$2.h(1);
                  }

                  this.fJ();
                  return bjl.b;
               }
            }
         } else if (this.m($$2)) {
            this.a($$0, $$1, $$2);
            if (this.ag.a(3) == 0) {
               this.f($$0);
               this.z(true);
               this.dM().a(this, (byte)7);
            } else {
               this.dM().a(this, (byte)6);
            }

            this.fJ();
            return bjl.b;
         }

         bjl $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fJ();
         }

         return $$6;
      }
   }

   @Override
   public boolean m(cmh $$0) {
      return bZ.a($$0);
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && this.ah > 2400;
   }

   @Override
   protected void w() {
      if (this.ce == null) {
         this.ce = new bxl.a<>(this, cer.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.ce);
      if (!this.u()) {
         this.bO.a(4, this.ce);
      }
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }

   static class a<T extends blv> extends bry<T> {
      private final bxl i;

      public a(bxl $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bli.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.u() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.u() && super.b();
      }
   }

   static class b extends bsr {
      private final bxl a;
      @Nullable
      private cer b;
      @Nullable
      private hv c;
      private int d;

      public b(bxl $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.u()) {
            return false;
         } else if (this.a.ge()) {
            return false;
         } else {
            blv $$0 = this.a.R_();
            if ($$0 instanceof cer) {
               this.b = (cer)$$0;
               if (!$$0.fD()) {
                  return false;
               }

               if (this.a.f((blf)this.b) > 100.0) {
                  return false;
               }

               hv $$1 = this.b.dm();
               dip $$2 = this.a.dM().a_($$1);
               if ($$2.a(arr.R)) {
                  this.c = $$2.d(cvs.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new hv($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (bxl $$1 : this.a.dM().a(bxl.class, new ekw(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gm() || $$1.gn())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.u() && !this.a.ge() && this.b != null && this.b.fD() && this.c != null && !this.h();
      }

      @Override
      public void c() {
         if (this.c != null) {
            this.a.y(false);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void d() {
         this.a.A(false);
         float $$0 = this.a.dM().f(1.0F);
         if (this.b.fW() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dM().F_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.N().n();
      }

      private void i() {
         auf $$0 = this.a.eg();
         hv.a $$1 = new hv.a();
         $$1.g(this.a.fS() ? this.a.fT().dm() : this.a.dm());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dm());
         egm $$2 = this.a.dM().n().aJ().getLootTable(egc.aw);
         egk $$3 = new egk.a((amp)this.a.dM()).a(eip.f, this.a.dk()).a(eip.a, this.a).a(eio.i);

         for (cmh $$5 : $$2.a($$3)) {
            this.a
               .dM()
               .b(
                  new cbe(
                     this.a.dM(),
                     (double)$$1.u() - (double)aty.a(this.a.aU * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)aty.b(this.a.aU * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void e() {
         if (this.b != null && this.c != null) {
            this.a.y(false);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.f((blf)this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.A(true);
                  this.a.B(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.B(true);
               }
            } else {
               this.a.A(false);
            }
         }
      }
   }

   static class c extends btz {
      @Nullable
      private cer c;
      private final bxl d;

      public c(bxl $$0, double $$1, cpi $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.eg().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.eg().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.u();
      }
   }
}

import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cfg extends cft implements bsk, bsp {
   public static final float bY = 0.45F;
   public static final int bZ = 55;
   public static final int cb = 30;
   private static final float cy = 0.1F;
   private static final float cA = 1.4285F;
   private static final float cB = 22.2222F;
   private static final int cC = 5;
   private static final int cD = 40;
   private static final int cE = 52;
   private static final int cF = 80;
   private static final float cG = 1.43F;
   public static final ajm<Boolean> cc = ajq.a(cfg.class, ajo.k);
   public static final ajm<Long> cd = ajq.a(cfg.class, ajo.c);
   public final brc ce = new brc();
   public final brc cf = new brc();
   public final brc cg = new brc();
   public final brc ch = new brc();
   public final brc ci = new brc();
   private static final brk cH = brk.b(brn.o.k(), brn.o.l() - 1.43F).b(0.845F);
   private int cI = 0;
   private int cJ = 0;

   public cfg(brn<? extends cfg> $$0, dad $$1) {
      super($$0, $$1);
      this.bP = new cfg.c();
      this.bO = new cfg.b();
      cbk $$2 = (cbk)this.K();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.ao.a(cd));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bsl.k);
      }

      this.a($$1);
   }

   public static btg.a r() {
      return gO().a(bth.q, 32.0).a(bth.r, 0.09F).a(bth.m, 0.42F).a(bth.v, 1.5);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
      $$0.a(cd, 0L);
   }

   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      cfh.a(this, $$0.E_());
      this.b($$0.E().Y());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected btb.b<cfg> dR() {
      return cfh.a();
   }

   @Override
   protected void z() {
   }

   @Override
   protected btb<?> a(Dynamic<?> $$0) {
      return cfh.a(this.dR().a($$0));
   }

   @Override
   public brk e(bsl $$0) {
      return $$0 == bsl.k ? cH.a(this.eb()) : super.e($$0);
   }

   @Override
   protected void Y() {
      this.dN().af().a("camelBrain");
      btb<?> $$0 = this.dQ();
      ((btb<cfg>)$$0).a((aqh)this.dN(), this);
      this.dN().af().c();
      this.dN().af().a("camelActivityUpdate");
      cfh.a(this);
      this.dN().af().c();
      super.Y();
   }

   @Override
   public void l() {
      super.l();
      if (this.y() && this.cI < 50 && (this.aC() || this.bg() || this.bP())) {
         this.w(false);
      }

      if (this.cI > 0) {
         this.cI--;
         if (this.cI == 0) {
            this.dN().a(null, this.dn(), avc.dz, avd.g, 1.0F, 1.0F);
         }
      }

      if (this.dN().x_()) {
         this.gZ();
      }

      if (this.u()) {
         this.ab();
      }

      if (this.gx() && this.bc()) {
         this.gC();
      }
   }

   private void gZ() {
      if (this.cJ <= 0) {
         this.cJ = this.ah.a(40) + 80;
         this.ch.a(this.ai);
      } else {
         this.cJ--;
      }

      if (this.gy()) {
         this.cg.a();
         this.ci.a();
         if (this.ha()) {
            this.ce.b(this.ai);
            this.cf.a();
         } else {
            this.ce.a();
            this.cf.b(this.ai);
         }
      } else {
         this.ce.a();
         this.cf.a();
         this.ci.a(this.y(), this.ai);
         this.cg.a(this.gz() && this.gD() >= 0L, this.ai);
      }
   }

   @Override
   protected void x(float $$0) {
      float $$1;
      if (this.ap() == bsl.a && !this.ci.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aV.a($$1, 0.2F);
   }

   @Override
   public void a(etp $$0) {
      if (this.u() && this.aC()) {
         this.g(this.dq().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(clh $$0, etp $$1) {
      super.a($$0, $$1);
      if ($$0.br > 0.0F && this.gx() && !this.gz()) {
         this.gB();
      }
   }

   public boolean u() {
      return this.gx() || this.gz();
   }

   @Override
   protected float e(clh $$0) {
      float $$1 = $$0.bZ() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.g(bth.r) + $$1;
   }

   @Override
   protected eto j(bsa $$0) {
      return this.u() ? new eto(this.dF(), this.dD()) : super.j($$0);
   }

   @Override
   protected etp b(clh $$0, etp $$1) {
      return this.u() ? etp.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.u() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cI <= 0 && this.aC()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dG() {
      return true;
   }

   @Override
   protected void b(float $$0, etp $$1) {
      double $$2 = (double)this.ff();
      this.h(this.bJ().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(bth.r) * (double)this.aL()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cI = 55;
      this.w(true);
      this.av = true;
   }

   public boolean y() {
      return this.ao.a(cc);
   }

   public void w(boolean $$0) {
      this.ao.a(cc, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(avc.dy);
      this.a(dva.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cI;
   }

   @Override
   protected avb v() {
      return avc.dx;
   }

   @Override
   protected avb o_() {
      return avc.dA;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.dC;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      if ($$1.a(avr.bp)) {
         this.a(avc.dH, 1.0F, 1.0F);
      } else {
         this.a(avc.dG, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.ah);
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if ($$0.fP() && !this.p_()) {
         this.b($$0);
         return bpm.a(this.dN().B);
      } else {
         bpm $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.o($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cQ().size() < 2 && !this.p_()) {
               this.f($$0);
            }

            return bpm.a(this.dN().B);
         }
      }
   }

   @Override
   protected void F(float $$0) {
      if ($$0 > 6.0F && this.gx() && !this.gz() && this.gp()) {
         this.gB();
      }
   }

   public boolean gp() {
      return this.g(this.gx() ? bsl.a : bsl.k);
   }

   @Override
   protected boolean a(clh $$0, csz $$1) {
      if (!this.o($$1)) {
         return false;
      } else {
         boolean $$2 = this.ey() < this.eP();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gE() && this.g() == 0 && this.gq();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.p_();
         if ($$4) {
            this.dN().a(kx.M, this.d(1.0), this.dv() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dN().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aU()) {
               avb $$5 = this.gw();
               if ($$5 != null) {
                  this.dN().a(null, this.ds(), this.du(), this.dy(), $$5, this.dc(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
               }
            }

            this.a(dva.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   public boolean a(cdp $$0) {
      if ($$0 != this && $$0 instanceof cfg $$1 && this.gW() && $$1.gW()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cfg b(aqh $$0, brb $$1) {
      return brn.o.a((dad)$$0);
   }

   @Nullable
   @Override
   protected avb gw() {
      return avc.dB;
   }

   @Override
   protected void f(bqf $$0, float $$1) {
      this.gC();
      super.f($$0, $$1);
   }

   @Override
   protected etp a(brh $$0, brk $$1, float $$2) {
      int $$3 = Math.max(this.cQ().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dI() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cQ().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cdp) {
            $$5 += 0.2F;
         }
      }

      return new etp(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dD() * (float) (Math.PI / 180.0));
   }

   @Override
   public float eb() {
      return this.p_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, brk $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gz();
      boolean $$9 = this.gx();
      if ($$8) {
         int $$10 = $$9 ? 40 : 52;
         int $$11;
         float $$12;
         if ($$9) {
            $$11 = 28;
            $$12 = $$0 ? 0.5F : 0.1F;
         } else {
            $$11 = $$0 ? 24 : 32;
            $$12 = $$0 ? 0.6F : 0.35F;
         }

         float $$15 = axz.a((float)this.gD() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)axz.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)axz.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public etp p(float $$0) {
      brk $$1 = this.a(this.ap());
      float $$2 = this.eb();
      return new etp(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   protected boolean r(brh $$0) {
      return this.cQ().size() <= 2;
   }

   @Override
   protected void X() {
      super.X();
      afw.a(this);
   }

   public boolean gx() {
      return this.ao.a(cd) < 0L;
   }

   public boolean gy() {
      return this.gD() < 0L != this.gx();
   }

   public boolean gz() {
      long $$0 = this.gD();
      return $$0 < (long)(this.gx() ? 40 : 52);
   }

   private boolean ha() {
      return this.gx() && this.gD() < 40L && this.gD() >= 0L;
   }

   public void gA() {
      if (!this.gx()) {
         this.b(avc.dE);
         this.b(bsl.k);
         this.a(dva.u);
         this.a(-this.dN().Y());
      }
   }

   public void gB() {
      if (this.gx()) {
         this.b(avc.dF);
         this.b(bsl.a);
         this.a(dva.u);
         this.a(this.dN().Y());
      }
   }

   public void gC() {
      this.b(bsl.a);
      this.a(dva.u);
      this.b(this.dN().Y());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.ao.a(cd, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gD() {
      return this.dN().Y() - Math.abs(this.ao.a(cd));
   }

   @Override
   public avb Y_() {
      return avc.dD;
   }

   @Override
   public void a(ajm<?> $$0) {
      if (!this.an && cc.equals($$0)) {
         this.cI = this.cI == 0 ? 55 : this.cI;
      }

      super.a($$0);
   }

   @Override
   public boolean gE() {
      return true;
   }

   @Override
   public void b(clh $$0) {
      if (!this.dN().B) {
         $$0.a(this, this.cs);
      }
   }

   @Override
   protected bxv E() {
      return new cfg.a(this);
   }

   class a extends bxv {
      public a(cfg $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cfg.this.u()) {
            super.a();
         }
      }
   }

   class b extends bxz {
      b() {
         super(cfg.this);
      }

      @Override
      public void a() {
         if (!cfg.this.cP()) {
            super.a();
         }
      }
   }

   class c extends bya {
      public c() {
         super(cfg.this);
      }

      @Override
      public void a() {
         if (this.k == bya.a.b && !cfg.this.gc() && cfg.this.gx() && !cfg.this.gz() && cfg.this.gp()) {
            cfg.this.gB();
         }

         super.a();
      }
   }
}

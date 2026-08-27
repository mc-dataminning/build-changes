import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cdz extends cem implements brd, bri {
   public static final cvp bX = cvp.a(crv.eV);
   public static final float bY = 0.45F;
   public static final int ca = 55;
   public static final int cb = 30;
   private static final float cz = 0.1F;
   private static final float cA = 1.4285F;
   private static final float cB = 22.2222F;
   private static final int cC = 5;
   private static final int cD = 40;
   private static final int cE = 52;
   private static final int cF = 80;
   private static final float cG = 1.43F;
   public static final aja<Boolean> cc = aje.a(cdz.class, ajc.k);
   public static final aja<Long> cd = aje.a(cdz.class, ajc.c);
   public final bpv ce = new bpv();
   public final bpv cf = new bpv();
   public final bpv cg = new bpv();
   public final bpv ch = new bpv();
   public final bpv ci = new bpv();
   private static final bqd cH = bqd.b(bqg.o.k(), bqg.o.l() - 1.43F).b(0.845F);
   private int cI = 0;
   private int cJ = 0;

   public cdz(bqg<? extends cdz> $$0, czg $$1) {
      super($$0, $$1);
      this.bO = new cdz.c();
      this.bN = new cdz.b();
      cad $$2 = (cad)this.K();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.an.a(cd));
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bre.k);
      }

      this.a($$1);
   }

   public static brz.a r() {
      return gM().a(bsa.q, 32.0).a(bsa.r, 0.09F).a(bsa.m, 0.42F).a(bsa.v, 1.5);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
      $$0.a(cd, 0L);
   }

   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      cea.a(this, $$0.E_());
      this.b($$0.E().Y());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bru.b<cdz> dQ() {
      return cea.a();
   }

   @Override
   protected void z() {
   }

   @Override
   protected bru<?> a(Dynamic<?> $$0) {
      return cea.a(this.dQ().a($$0));
   }

   @Override
   public bqd e(bre $$0) {
      return $$0 == bre.k ? cH.a(this.ea()) : super.e($$0);
   }

   @Override
   protected void Y() {
      this.dM().af().a("camelBrain");
      bru<?> $$0 = this.dP();
      ((bru<cdz>)$$0).a((apu)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("camelActivityUpdate");
      cea.a(this);
      this.dM().af().c();
      super.Y();
   }

   @Override
   public void l() {
      super.l();
      if (this.y() && this.cI < 50 && (this.aC() || this.bg() || this.bO())) {
         this.w(false);
      }

      if (this.cI > 0) {
         this.cI--;
         if (this.cI == 0) {
            this.dM().a(null, this.dm(), auo.dz, aup.g, 1.0F, 1.0F);
         }
      }

      if (this.dM().x_()) {
         this.gX();
      }

      if (this.u()) {
         this.ab();
      }

      if (this.gv() && this.bc()) {
         this.gA();
      }
   }

   private void gX() {
      if (this.cJ <= 0) {
         this.cJ = this.ag.a(40) + 80;
         this.ch.a(this.ah);
      } else {
         this.cJ--;
      }

      if (this.gw()) {
         this.cg.a();
         this.ci.a();
         if (this.gY()) {
            this.ce.b(this.ah);
            this.cf.a();
         } else {
            this.ce.a();
            this.cf.b(this.ah);
         }
      } else {
         this.ce.a();
         this.cf.a();
         this.ci.a(this.y(), this.ah);
         this.cg.a(this.gx() && this.gB() >= 0L, this.ah);
      }
   }

   @Override
   protected void x(float $$0) {
      float $$1;
      if (this.ap() == bre.a && !this.ci.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F);
   }

   @Override
   public void a(esj $$0) {
      if (this.u() && this.aC()) {
         this.g(this.dp().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cka $$0, esj $$1) {
      super.a($$0, $$1);
      if ($$0.bp > 0.0F && this.gv() && !this.gx()) {
         this.gz();
      }
   }

   public boolean u() {
      return this.gv() || this.gx();
   }

   @Override
   protected float e(cka $$0) {
      float $$1 = $$0.bY() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.g(bsa.r) + $$1;
   }

   @Override
   protected esi j(bqt $$0) {
      return this.u() ? new esi(this.dE(), this.dC()) : super.j($$0);
   }

   @Override
   protected esj b(cka $$0, esj $$1) {
      return this.u() ? esj.b : super.b($$0, $$1);
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
   public boolean dF() {
      return true;
   }

   @Override
   protected void b(float $$0, esj $$1) {
      double $$2 = (double)this.fe();
      this.h(this.bI().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(bsa.r) * (double)this.aL()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cI = 55;
      this.w(true);
      this.au = true;
   }

   public boolean y() {
      return this.an.a(cc);
   }

   public void w(boolean $$0) {
      this.an.a(cc, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(auo.dy);
      this.a(dub.u);
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
   protected aun v() {
      return auo.dx;
   }

   @Override
   protected aun o_() {
      return auo.dA;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.dC;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      if ($$1.a(ave.bp)) {
         this.a(auo.dH, 1.0F, 1.0F);
      } else {
         this.a(auo.dG, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean o(crs $$0) {
      return bX.a($$0);
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if ($$0.fO() && !this.p_()) {
         this.b($$0);
         return bof.a(this.dM().B);
      } else {
         bof $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.o($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cP().size() < 2 && !this.p_()) {
               this.f($$0);
            }

            return bof.a(this.dM().B);
         }
      }
   }

   @Override
   protected void F(float $$0) {
      if ($$0 > 6.0F && this.gv() && !this.gx() && this.gn()) {
         this.gz();
      }
   }

   public boolean gn() {
      return this.g(this.gv() ? bre.a : bre.k);
   }

   @Override
   protected boolean a(cka $$0, crs $$1) {
      if (!this.o($$1)) {
         return false;
      } else {
         boolean $$2 = this.ex() < this.eO();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gC() && this.g() == 0 && this.go();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.p_();
         if ($$4) {
            this.dM().a(kn.N, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dM().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aU()) {
               aun $$5 = this.gu();
               if ($$5 != null) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), $$5, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
               }
            }

            this.a(dub.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gt() {
      return false;
   }

   @Override
   public boolean a(cci $$0) {
      if ($$0 != this && $$0 instanceof cdz $$1 && this.gU() && $$1.gU()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cdz b(apu $$0, bpu $$1) {
      return bqg.o.a((czg)$$0);
   }

   @Nullable
   @Override
   protected aun gu() {
      return auo.dB;
   }

   @Override
   protected void f(boy $$0, float $$1) {
      this.gA();
      super.f($$0, $$1);
   }

   @Override
   protected esj a(bqa $$0, bqd $$1, float $$2) {
      int $$3 = Math.max(this.cP().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dH() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cP().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cci) {
            $$5 += 0.2F;
         }
      }

      return new esj(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dC() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ea() {
      return this.p_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bqd $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gx();
      boolean $$9 = this.gv();
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

         float $$15 = axm.a((float)this.gB() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)axm.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)axm.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public esj p(float $$0) {
      bqd $$1 = this.a(this.ap());
      float $$2 = this.ea();
      return new esj(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   protected boolean r(bqa $$0) {
      return this.cP().size() <= 2;
   }

   @Override
   protected void X() {
      super.X();
      afk.a(this);
   }

   public boolean gv() {
      return this.an.a(cd) < 0L;
   }

   public boolean gw() {
      return this.gB() < 0L != this.gv();
   }

   public boolean gx() {
      long $$0 = this.gB();
      return $$0 < (long)(this.gv() ? 40 : 52);
   }

   private boolean gY() {
      return this.gv() && this.gB() < 40L && this.gB() >= 0L;
   }

   public void gy() {
      if (!this.gv()) {
         this.b(auo.dE);
         this.b(bre.k);
         this.a(dub.u);
         this.a(-this.dM().Y());
      }
   }

   public void gz() {
      if (this.gv()) {
         this.b(auo.dF);
         this.b(bre.a);
         this.a(dub.u);
         this.a(this.dM().Y());
      }
   }

   public void gA() {
      this.b(bre.a);
      this.a(dub.u);
      this.b(this.dM().Y());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.an.a(cd, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gB() {
      return this.dM().Y() - Math.abs(this.an.a(cd));
   }

   @Override
   public aun Y_() {
      return auo.dD;
   }

   @Override
   public void a(aja<?> $$0) {
      if (!this.am && cc.equals($$0)) {
         this.cI = this.cI == 0 ? 55 : this.cI;
      }

      super.a($$0);
   }

   @Override
   public boolean gC() {
      return true;
   }

   @Override
   public void b(cka $$0) {
      if (!this.dM().B) {
         $$0.a(this, this.cs);
      }
   }

   @Override
   protected bwo E() {
      return new cdz.a(this);
   }

   class a extends bwo {
      public a(cdz $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cdz.this.u()) {
            super.a();
         }
      }
   }

   class b extends bws {
      b() {
         super(cdz.this);
      }

      @Override
      public void a() {
         if (!cdz.this.cO()) {
            super.a();
         }
      }
   }

   class c extends bwt {
      public c() {
         super(cdz.this);
      }

      @Override
      public void a() {
         if (this.k == bwt.a.b && !cdz.this.gb() && cdz.this.gv() && !cdz.this.gx() && cdz.this.gn()) {
            cdz.this.gz();
         }

         super.a();
      }
   }
}

import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cim extends ciz {
   public static final float bY = 0.45F;
   public static final int bZ = 55;
   public static final int ca = 30;
   private static final float cA = 0.1F;
   private static final float cB = 1.4285F;
   private static final float cC = 22.2222F;
   private static final int cD = 5;
   private static final int cE = 40;
   private static final int cF = 52;
   private static final int cG = 80;
   private static final float cH = 1.43F;
   public static final ako<Boolean> cc = aks.a(cim.class, akq.k);
   public static final ako<Long> cd = aks.a(cim.class, akq.c);
   public final bua ce = new bua();
   public final bua cf = new bua();
   public final bua cg = new bua();
   public final bua ch = new bua();
   public final bua ci = new bua();
   private static final bul cI = bul.b(bup.o.l(), bup.o.m() - 1.43F).b(0.845F);
   private int cJ = 0;
   private int cK = 0;

   public cim(bup<? extends cim> $$0, dff $$1) {
      super($$0, $$1);
      this.bP = new cim.c();
      this.bO = new cim.b();
      cep $$2 = (cep)this.P();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.am.a(cd));
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bvq.k);
      }

      this.a($$1);
   }

   public static bwl.a q() {
      return gX().a(bwm.s, 32.0).a(bwm.v, 0.09F).a(bwm.o, 0.42F).a(bwm.B, 1.5);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
      $$0.a(cd, 0L);
   }

   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      cin.a(this, $$0.E_());
      this.b($$0.E().aa());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bwg.b<cim> ef() {
      return cin.a();
   }

   @Override
   protected void D() {
   }

   @Override
   protected bwg<?> a(Dynamic<?> $$0) {
      return cin.a(this.ef().a($$0));
   }

   @Override
   public bul e(bvq $$0) {
      return $$0 == bvq.k ? cI.a(this.el()) : super.e($$0);
   }

   @Override
   protected void ac() {
      bor $$0 = boq.a();
      $$0.a("camelBrain");
      bwg<?> $$1 = this.ee();
      ((bwg<cim>)$$1).a((arq)this.dY(), this);
      $$0.c();
      $$0.a("camelActivityUpdate");
      cin.a(this);
      $$0.c();
      super.ac();
   }

   @Override
   public void l() {
      super.l();
      if (this.y() && this.cJ < 50 && (this.aL() || this.bp() || this.cb())) {
         this.x(false);
      }

      if (this.cJ > 0) {
         this.cJ--;
         if (this.cJ == 0) {
            this.dY().a(null, this.dy(), awo.dA, awp.g, 1.0F, 1.0F);
         }
      }

      if (this.dY().y_()) {
         this.hi();
      }

      if (this.t()) {
         this.ag();
      }

      if (this.gy() && this.bl()) {
         this.gK();
      }
   }

   private void hi() {
      if (this.cK <= 0) {
         this.cK = this.af.a(40) + 80;
         this.ch.a(this.ag);
      } else {
         this.cK--;
      }

      if (this.gz()) {
         this.cg.a();
         this.ci.a();
         if (this.hj()) {
            this.ce.b(this.ag);
            this.cf.a();
         } else {
            this.ce.a();
            this.cf.b(this.ag);
         }
      } else {
         this.ce.a();
         this.cf.a();
         this.ci.a(this.y(), this.ag);
         this.cg.a(this.gH() && this.gL() >= 0L, this.ag);
      }
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.ay() == bvq.a && !this.ci.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F, this.p_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(ezr $$0) {
      if (this.t() && this.aL()) {
         this.h(this.dB().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(cor $$0, ezr $$1) {
      super.a($$0, $$1);
      if ($$0.bq > 0.0F && this.gy() && !this.gH()) {
         this.gJ();
      }
   }

   public boolean t() {
      return this.gy() || this.gH();
   }

   @Override
   protected float e(cor $$0) {
      float $$1 = $$0.cl() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(bwm.v) + $$1;
   }

   @Override
   protected ezq j(bve $$0) {
      return this.t() ? new ezq(this.dQ(), this.dO()) : super.j($$0);
   }

   @Override
   protected ezr b(cor $$0, ezr $$1) {
      return this.t() ? ezr.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cJ <= 0 && this.aL()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dR() {
      return true;
   }

   @Override
   protected void b(float $$0, ezr $$1) {
      double $$2 = (double)this.fm();
      this.i(this.bV().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(bwm.v) * (double)this.aV()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cJ = 55;
      this.x(true);
      this.as = true;
   }

   public boolean y() {
      return this.am.a(cc);
   }

   public void x(boolean $$0) {
      this.am.a(cc, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(awo.dz);
      this.a(eak.u);
      this.x(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cJ;
   }

   @Override
   protected awn w() {
      return awo.dy;
   }

   @Override
   protected awn o_() {
      return awo.dB;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.dD;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      if ($$1.a(axd.bq)) {
         this.a(awo.dI, 1.0F, 1.0F);
      } else {
         this.a(awo.dH, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.al);
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if ($$0.gb() && !this.p_()) {
         this.b($$0);
         return bsh.a;
      } else {
         bsh $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.l($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.db().size() < 2 && !this.p_()) {
               this.a($$0);
            }

            return bsh.a;
         }
      }
   }

   @Override
   public boolean a(bui $$0, float $$1) {
      if ($$1 > 6.0F && this.gy() && !this.gH() && this.gv()) {
         this.gJ();
      }

      return true;
   }

   public boolean gv() {
      return this.g(this.gy() ? bvq.a : bvq.k);
   }

   @Override
   protected boolean a(cor $$0, cwf $$1) {
      if (!this.l($$1)) {
         return false;
      } else {
         boolean $$2 = this.eH() < this.eW();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gM() && this.g() == 0 && this.gC();
         if ($$3) {
            this.f($$0);
         }

         boolean $$4 = this.p_();
         if ($$4) {
            this.dY().a(ls.O, this.d(1.0), this.dG() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dY().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.bd()) {
               awn $$5 = this.gx();
               if ($$5 != null) {
                  this.dY().a(null, this.dD(), this.dF(), this.dJ(), $$5, this.do(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
               }
            }

            this.a(eak.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gw() {
      return false;
   }

   @Override
   public boolean a(cgv $$0) {
      if ($$0 != this && $$0 instanceof cim $$1 && this.hf() && $$1.hf()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cim b(arq $$0, btz $$1) {
      return bup.o.a($$0, buo.e);
   }

   @Nullable
   @Override
   protected awn gx() {
      return awo.dC;
   }

   @Override
   protected void f(bsy $$0, float $$1) {
      this.gK();
      super.f($$0, $$1);
   }

   @Override
   protected ezr a(bui $$0, bul $$1, float $$2) {
      int $$3 = Math.max(this.db().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dT() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.db().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cgv) {
            $$5 += 0.2F;
         }
      }

      return new ezr(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dO() * (float) (Math.PI / 180.0));
   }

   @Override
   public float el() {
      return this.p_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bul $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gH();
      boolean $$9 = this.gy();
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

         float $$15 = azn.a((float)this.gL() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)azn.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)azn.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public ezr s(float $$0) {
      bul $$1 = this.a(this.ay());
      float $$2 = this.el();
      return new ezr(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ae() {
      return 30;
   }

   @Override
   protected boolean r(bui $$0) {
      return this.db().size() <= 2;
   }

   @Override
   protected void ab() {
      super.ab();
      agv.a(this);
   }

   public boolean gy() {
      return this.am.a(cd) < 0L;
   }

   public boolean gz() {
      return this.gL() < 0L != this.gy();
   }

   public boolean gH() {
      long $$0 = this.gL();
      return $$0 < (long)(this.gy() ? 40 : 52);
   }

   private boolean hj() {
      return this.gy() && this.gL() < 40L && this.gL() >= 0L;
   }

   public void gI() {
      if (!this.gy()) {
         this.b(awo.dF);
         this.b(bvq.k);
         this.a(eak.u);
         this.a(-this.dY().aa());
      }
   }

   public void gJ() {
      if (this.gy()) {
         this.b(awo.dG);
         this.b(bvq.a);
         this.a(eak.u);
         this.a(this.dY().aa());
      }
   }

   public void gK() {
      this.b(bvq.a);
      this.a(eak.u);
      this.b(this.dY().aa());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.am.a(cd, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gL() {
      return this.dY().aa() - Math.abs(this.am.a(cd));
   }

   @Override
   public awn ad_() {
      return awo.dE;
   }

   @Override
   public void a(ako<?> $$0) {
      if (!this.al && cc.equals($$0)) {
         this.cJ = this.cJ == 0 ? 55 : this.cJ;
      }

      super.a($$0);
   }

   @Override
   public boolean gM() {
      return true;
   }

   @Override
   public void b(cor $$0) {
      if (!this.dY().C) {
         $$0.a(this, this.ct);
      }
   }

   @Override
   protected cba J() {
      return new cim.a(this);
   }

   class a extends cba {
      public a(final cim $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cim.this.t()) {
            super.a();
         }
      }
   }

   class b extends cbe {
      b() {
         super(cim.this);
      }

      @Override
      public void a() {
         if (!cim.this.da()) {
            super.a();
         }
      }
   }

   class c extends cbf {
      public c() {
         super(cim.this);
      }

      @Override
      public void a() {
         if (this.k == cbf.a.b && !cim.this.M_() && cim.this.gy() && !cim.this.gH() && cim.this.gv()) {
            cim.this.gJ();
         }

         super.a();
      }
   }
}

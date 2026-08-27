import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cds extends cef implements bqy, brd {
   public static final cvg bX = cvg.a(crm.eV);
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
   public static final aiy<Boolean> cc = ajc.a(cds.class, aja.k);
   public static final aiy<Long> cd = ajc.a(cds.class, aja.c);
   public final bpq ce = new bpq();
   public final bpq cf = new bpq();
   public final bpq cg = new bpq();
   public final bpq ch = new bpq();
   public final bpq ci = new bpq();
   private static final bpy cH = bpy.b(bqb.o.k(), bqb.o.l() - 1.43F).b(0.845F);
   private int cI = 0;
   private int cJ = 0;

   public cds(bqb<? extends cds> $$0, cyx $$1) {
      super($$0, $$1);
      this.bO = new cds.c();
      this.bN = new cds.b();
      bzy $$2 = (bzy)this.K();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.an.a(cd));
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bqz.k);
      }

      this.a($$1);
   }

   public static bru.a r() {
      return gM().a(brv.q, 32.0).a(brv.r, 0.09F).a(brv.m, 0.42F).a(brv.v, 1.5);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
      $$0.a(cd, 0L);
   }

   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      cdt.a(this, $$0.E_());
      this.b($$0.E().Y());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected brp.b<cds> dQ() {
      return cdt.a();
   }

   @Override
   protected void z() {
   }

   @Override
   protected brp<?> a(Dynamic<?> $$0) {
      return cdt.a(this.dQ().a($$0));
   }

   @Override
   public bpy e(bqz $$0) {
      return $$0 == bqz.k ? cH.a(this.ea()) : super.e($$0);
   }

   @Override
   protected void Y() {
      this.dM().af().a("camelBrain");
      brp<?> $$0 = this.dP();
      ((brp<cds>)$$0).a((aps)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("camelActivityUpdate");
      cdt.a(this);
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
            this.dM().a(null, this.dm(), aum.dz, aun.g, 1.0F, 1.0F);
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
      if (this.ap() == bqz.a && !this.ci.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F);
   }

   @Override
   public void a(esa $$0) {
      if (this.u() && this.aC()) {
         this.g(this.dp().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cjt $$0, esa $$1) {
      super.a($$0, $$1);
      if ($$0.bp > 0.0F && this.gv() && !this.gx()) {
         this.gz();
      }
   }

   public boolean u() {
      return this.gv() || this.gx();
   }

   @Override
   protected float e(cjt $$0) {
      float $$1 = $$0.bY() && this.ab_() == 0 ? 0.1F : 0.0F;
      return (float)this.g(brv.r) + $$1;
   }

   @Override
   protected erz j(bqo $$0) {
      return this.u() ? new erz(this.dE(), this.dC()) : super.j($$0);
   }

   @Override
   protected esa b(cjt $$0, esa $$1) {
      return this.u() ? esa.b : super.b($$0, $$1);
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
   protected void b(float $$0, esa $$1) {
      double $$2 = (double)this.fe();
      this.h(this.bI().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(brv.r) * (double)this.aL()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.b(aum.dy);
      this.a(dts.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int ab_() {
      return this.cI;
   }

   @Override
   protected aul v() {
      return aum.dx;
   }

   @Override
   protected aul o_() {
      return aum.dA;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.dC;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      if ($$1.a(avc.bp)) {
         this.a(aum.dH, 1.0F, 1.0F);
      } else {
         this.a(aum.dG, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean o(crj $$0) {
      return bX.a($$0);
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if ($$0.fO() && !this.p_()) {
         this.b($$0);
         return boa.a(this.dM().B);
      } else {
         boa $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.o($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cP().size() < 2 && !this.p_()) {
               this.f($$0);
            }

            return boa.a(this.dM().B);
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
      return this.g(this.gv() ? bqz.a : bqz.k);
   }

   @Override
   protected boolean a(cjt $$0, crj $$1) {
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
            this.dM().a(kl.N, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dM().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aU()) {
               aul $$5 = this.gu();
               if ($$5 != null) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), $$5, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
               }
            }

            this.a(dts.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gt() {
      return false;
   }

   @Override
   public boolean a(ccd $$0) {
      if ($$0 != this && $$0 instanceof cds $$1 && this.gU() && $$1.gU()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cds b(aps $$0, bpp $$1) {
      return bqb.o.a((cyx)$$0);
   }

   @Nullable
   @Override
   protected aul gu() {
      return aum.dB;
   }

   @Override
   protected void f(bot $$0, float $$1) {
      this.gA();
      super.f($$0, $$1);
   }

   @Override
   protected esa a(bpv $$0, bpy $$1, float $$2) {
      int $$3 = Math.max(this.cP().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dH() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cP().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof ccd) {
            $$5 += 0.2F;
         }
      }

      return new esa(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dC() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ea() {
      return this.p_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bpy $$2, float $$3) {
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

         float $$15 = axk.a((float)this.gB() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)axk.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)axk.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public esa p(float $$0) {
      bpy $$1 = this.a(this.ap());
      float $$2 = this.ea();
      return new esa(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   protected boolean r(bpv $$0) {
      return this.cP().size() <= 2;
   }

   @Override
   protected void X() {
      super.X();
      afi.a(this);
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
         this.b(aum.dE);
         this.b(bqz.k);
         this.a(dts.u);
         this.a(-this.dM().Y());
      }
   }

   public void gz() {
      if (this.gv()) {
         this.b(aum.dF);
         this.b(bqz.a);
         this.a(dts.u);
         this.a(this.dM().Y());
      }
   }

   public void gA() {
      this.b(bqz.a);
      this.a(dts.u);
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
   public aul X_() {
      return aum.dD;
   }

   @Override
   public void a(aiy<?> $$0) {
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
   public void b(cjt $$0) {
      if (!this.dM().B) {
         $$0.a(this, this.cs);
      }
   }

   @Override
   protected bwj E() {
      return new cds.a(this);
   }

   class a extends bwj {
      public a(cds $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cds.this.u()) {
            super.a();
         }
      }
   }

   class b extends bwn {
      b() {
         super(cds.this);
      }

      @Override
      public void a() {
         if (!cds.this.cO()) {
            super.a();
         }
      }
   }

   class c extends bwo {
      public c() {
         super(cds.this);
      }

      @Override
      public void a() {
         if (this.k == bwo.a.b && !cds.this.gb() && cds.this.gv() && !cds.this.gx() && cds.this.gn()) {
            cds.this.gz();
         }

         super.a();
      }
   }
}

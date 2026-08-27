import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byi extends byv implements blw, bmb {
   public static final coq bT = coq.a(clr.eV);
   public static final float bU = 0.45F;
   public static final int bW = 55;
   public static final int bX = 30;
   private static final float cv = 0.1F;
   private static final float cw = 1.4285F;
   private static final float cx = 22.2222F;
   private static final int cy = 5;
   private static final int cz = 40;
   private static final int cA = 52;
   private static final int cB = 80;
   private static final float cC = 1.43F;
   public static final afs<Boolean> bY = afv.a(byi.class, afu.k);
   public static final afs<Long> bZ = afv.a(byi.class, afu.c);
   public final bkr ca = new bkr();
   public final bkr cb = new bkr();
   public final bkr cc = new bkr();
   public final bkr cd = new bkr();
   public final bkr ce = new bkr();
   private static final bkw cD = bkw.b(bkz.l.k(), bkz.l.l() - 1.43F);
   private int cE = 0;
   private int cF = 0;

   public byi(bkz<? extends byi> $$0, csf $$1) {
      super($$0, $$1);
      this.t(1.5F);
      this.bL = new byi.c();
      this.bK = new byi.b();
      but $$2 = (but)this.N();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.an.b(bZ));
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(blx.k);
      }

      this.a($$1);
   }

   public static bmq.a u() {
      return gF().a(bmr.l, 32.0).a(bmr.m, 0.09F).a(bmr.h, 0.42F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bY, false);
      this.an.a(bZ, 0L);
   }

   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      byj.a(this, $$0.F_());
      this.b($$0.D().W());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bml.b<byi> dQ() {
      return byj.a();
   }

   @Override
   protected void B() {
   }

   @Override
   protected bml<?> a(Dynamic<?> $$0) {
      return byj.a(this.dQ().a($$0));
   }

   @Override
   public bkw a(blx $$0) {
      return $$0 == blx.k ? cD.a(this.ea()) : super.a($$0);
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return $$1.b - 0.1F * this.ea();
   }

   @Override
   protected void Z() {
      this.dN().ae().a("camelBrain");
      bml<?> $$0 = this.dP();
      ((bml<byi>)$$0).a((ami)this.dN(), this);
      this.dN().ae().c();
      this.dN().ae().a("camelActivityUpdate");
      byj.a(this);
      this.dN().ae().c();
      super.Z();
   }

   @Override
   public void l() {
      super.l();
      if (this.A() && this.cE < 50 && (this.aC() || this.bd() || this.bO())) {
         this.w(false);
      }

      if (this.cE > 0) {
         this.cE--;
         if (this.cE == 0) {
            this.dN().a(null, this.dn(), aqv.cS, aqw.g, 1.0F, 1.0F);
         }
      }

      if (this.dN().y_()) {
         this.gR();
      }

      if (this.w()) {
         this.a(this, 30.0F);
      }

      if (this.gn() && this.aZ()) {
         this.gs();
      }
   }

   private void gR() {
      if (this.cF <= 0) {
         this.cF = this.ag.a(40) + 80;
         this.cd.a(this.ah);
      } else {
         this.cF--;
      }

      if (this.go()) {
         this.cc.a();
         this.ce.a();
         if (this.gS()) {
            this.ca.b(this.ah);
            this.cb.a();
         } else {
            this.ca.a();
            this.cb.b(this.ah);
         }
      } else {
         this.ca.a();
         this.cb.a();
         this.ce.a(this.A(), this.ah);
         this.cc.a(this.gp() && this.gt() >= 0L, this.ah);
      }
   }

   @Override
   protected void v(float $$0) {
      float $$1;
      if (this.ap() == blx.a && !this.ce.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aQ.a($$1, 0.2F);
   }

   @Override
   public void a(ejz $$0) {
      if (this.w() && this.aC()) {
         this.g(this.dq().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cdz $$0, ejz $$1) {
      super.a($$0, $$1);
      if ($$0.bm > 0.0F && this.gn() && !this.gp()) {
         this.gr();
      }
   }

   public boolean w() {
      return this.gn() || this.gp();
   }

   @Override
   protected float e(cdz $$0) {
      float $$1 = $$0.bY() && this.ad_() == 0 ? 0.1F : 0.0F;
      return (float)this.b(bmr.m) + $$1;
   }

   @Override
   protected ejy j(bll $$0) {
      return this.w() ? new ejy(this.dF(), this.dD()) : super.j($$0);
   }

   @Override
   protected ejz b(cdz $$0, ejz $$1) {
      return this.w() ? ejz.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.w() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cE <= 0 && this.aC()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dG() {
      return true;
   }

   @Override
   protected void b(float $$0, ejz $$1) {
      double $$2 = this.b(bmr.h) * (double)this.aK() + (double)this.fb();
      this.h(this.bF().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.b(bmr.m) * (double)this.aL()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cE = 55;
      this.w(true);
      this.au = true;
   }

   public boolean A() {
      return this.an.b(bY);
   }

   public void w(boolean $$0) {
      this.an.b(bY, $$0);
   }

   @Override
   public void c(int $$0) {
      this.a(aqv.cR, 1.0F, this.eY());
      this.a(dlx.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int ad_() {
      return this.cE;
   }

   @Override
   protected aqu y() {
      return aqv.cQ;
   }

   @Override
   protected aqu n_() {
      return aqv.cT;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.cV;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      if ($$1.a(ark.bo)) {
         this.a(aqv.da, 1.0F, 1.0F);
      } else {
         this.a(aqv.cZ, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean m(clo $$0) {
      return bT.a($$0);
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      if ($$0.fJ() && !this.o_()) {
         this.b($$0);
         return bjb.a(this.dN().B);
      } else {
         bjb $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.m($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cQ().size() < 2 && !this.o_()) {
               this.f($$0);
            }

            return bjb.a(this.dN().B);
         }
      }
   }

   @Override
   protected void D(float $$0) {
      if ($$0 > 6.0F && this.gn() && !this.gp() && this.gf()) {
         this.gr();
      }
   }

   public boolean gf() {
      return this.f(this.gn() ? blx.a : blx.k);
   }

   @Override
   protected boolean a(cdz $$0, clo $$1) {
      if (!this.m($$1)) {
         return false;
      } else {
         boolean $$2 = this.ew() < this.eN();
         if ($$2) {
            this.b(2.0F);
         }

         boolean $$3 = this.gu() && this.h() == 0 && this.gg();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.o_();
         if ($$4) {
            this.dN().a(jw.K, this.d(1.0), this.dv() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dN().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aU()) {
               aqu $$5 = this.gm();
               if ($$5 != null) {
                  this.dN().a(null, this.ds(), this.du(), this.dy(), $$5, this.dc(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
               }
            }

            this.a(dlx.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gl() {
      return false;
   }

   @Override
   public boolean a(bww $$0) {
      if ($$0 != this && $$0 instanceof byi $$1 && this.gN() && $$1.gN()) {
         return true;
      }

      return false;
   }

   @Nullable
   public byi b(ami $$0, bkq $$1) {
      return bkz.l.a((csf)$$0);
   }

   @Nullable
   @Override
   protected aqu gm() {
      return aqv.cU;
   }

   @Override
   protected void f(bjt $$0, float $$1) {
      this.gs();
      super.f($$0, $$1);
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      int $$3 = Math.max(this.cQ().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dI() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cQ().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof bww) {
            $$5 += 0.2F;
         }
      }

      return new Vector3f(0.0F, $$6, $$5 * $$2);
   }

   @Override
   public float ea() {
      return this.o_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bkw $$2, float $$3) {
      double $$4 = (double)($$2.b - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gp();
      boolean $$9 = this.gn();
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

         float $$15 = atq.a((float)this.gt() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)atq.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)atq.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public ejz p(float $$0) {
      bkw $$1 = this.a(this.ap());
      float $$2 = this.ea();
      return new ejz(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a * 0.56F));
   }

   private void a(bkv $$0, float $$1) {
      float $$2 = $$0.cp();
      float $$3 = atq.g(this.aU - $$2);
      float $$4 = atq.a(atq.g(this.aU - $$2), -$$1, $$1);
      float $$5 = $$2 + $$3 - $$4;
      $$0.n($$5);
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   protected boolean r(bkv $$0) {
      return this.cQ().size() <= 2;
   }

   @Override
   protected void Y() {
      super.Y();
      aco.a(this);
   }

   public boolean gn() {
      return this.an.b(bZ) < 0L;
   }

   public boolean go() {
      return this.gt() < 0L != this.gn();
   }

   public boolean gp() {
      long $$0 = this.gt();
      return $$0 < (long)(this.gn() ? 40 : 52);
   }

   private boolean gS() {
      return this.gn() && this.gt() < 40L && this.gt() >= 0L;
   }

   public void gq() {
      if (!this.gn()) {
         this.a(aqv.cX, 1.0F, this.eY());
         this.b(blx.k);
         this.a(dlx.u);
         this.a(-this.dN().W());
      }
   }

   public void gr() {
      if (this.gn()) {
         this.a(aqv.cY, 1.0F, this.eY());
         this.b(blx.a);
         this.a(dlx.u);
         this.a(this.dN().W());
      }
   }

   public void gs() {
      this.b(blx.a);
      this.a(dlx.u);
      this.b(this.dN().W());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.an.b(bZ, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gt() {
      return this.dN().W() - Math.abs(this.an.b(bZ));
   }

   @Override
   public aqu Z_() {
      return aqv.cW;
   }

   @Override
   public void a(afs<?> $$0) {
      if (!this.am && bY.equals($$0)) {
         this.cE = this.cE == 0 ? 55 : this.cE;
      }

      super.a($$0);
   }

   @Override
   public boolean gu() {
      return true;
   }

   @Override
   public void b(cdz $$0) {
      if (!this.dN().B) {
         $$0.a(this, this.cp);
      }
   }

   @Override
   protected bre H() {
      return new byi.a(this);
   }

   class a extends bre {
      public a(byi $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!byi.this.w()) {
            super.a();
         }
      }
   }

   class b extends bri {
      b() {
         super(byi.this);
      }

      @Override
      public void a() {
         if (!byi.this.cP()) {
            super.a();
         }
      }
   }

   class c extends brj {
      public c() {
         super(byi.this);
      }

      @Override
      public void a() {
         if (this.k == brj.a.b && !byi.this.fT() && byi.this.gn() && !byi.this.gp() && byi.this.gf()) {
            byi.this.gr();
         }

         super.a();
      }
   }
}

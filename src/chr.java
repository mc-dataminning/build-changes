import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chr extends cie {
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
   public static final akg<Boolean> cc = akk.a(chr.class, aki.k);
   public static final akg<Long> cd = akk.a(chr.class, aki.c);
   public final bti ce = new bti();
   public final bti cf = new bti();
   public final bti cg = new bti();
   public final bti ch = new bti();
   public final bti ci = new bti();
   private static final btr cI = btr.b(btv.o.l(), btv.o.m() - 1.43F).b(0.845F);
   private int cJ = 0;
   private int cK = 0;

   public chr(btv<? extends chr> $$0, deg $$1) {
      super($$0, $$1);
      this.bP = new chr.c();
      this.bO = new chr.b();
      cdu $$2 = (cdu)this.P();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.am.a(cd));
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(buw.k);
      }

      this.a($$1);
   }

   public static bvq.a q() {
      return gR().a(bvr.s, 32.0).a(bvr.v, 0.09F).a(bvr.o, 0.42F).a(bvr.B, 1.5);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
      $$0.a(cd, 0L);
   }

   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      chs.a(this, $$0.C_());
      this.b($$0.E().aa());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bvl.b<chr> dY() {
      return chs.a();
   }

   @Override
   protected void D() {
   }

   @Override
   protected bvl<?> a(Dynamic<?> $$0) {
      return chs.a(this.dY().a($$0));
   }

   @Override
   public btr e(buw $$0) {
      return $$0 == buw.k ? cI.a(this.ee()) : super.e($$0);
   }

   @Override
   protected void ad() {
      this.dS().ah().a("camelBrain");
      bvl<?> $$0 = this.dX();
      ((bvl<chr>)$$0).a((arh)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("camelActivityUpdate");
      chs.a(this);
      this.dS().ah().c();
      super.ad();
   }

   @Override
   public void l() {
      super.l();
      if (this.y() && this.cJ < 50 && (this.aH() || this.bm() || this.bW())) {
         this.x(false);
      }

      if (this.cJ > 0) {
         this.cJ--;
         if (this.cJ == 0) {
            this.dS().a(null, this.ds(), awe.dA, awf.g, 1.0F, 1.0F);
         }
      }

      if (this.dS().w_()) {
         this.hc();
      }

      if (this.t()) {
         this.ah();
      }

      if (this.gs() && this.bi()) {
         this.gE();
      }
   }

   private void hc() {
      if (this.cK <= 0) {
         this.cK = this.af.a(40) + 80;
         this.ch.a(this.ag);
      } else {
         this.cK--;
      }

      if (this.gt()) {
         this.cg.a();
         this.ci.a();
         if (this.hd()) {
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
         this.cg.a(this.gB() && this.gF() >= 0L, this.ag);
      }
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.av() == buw.a && !this.ci.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aP.a($$1, 0.2F, this.o_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(eys $$0) {
      if (this.t() && this.aH()) {
         this.h(this.dv().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(cnu $$0, eys $$1) {
      super.a($$0, $$1);
      if ($$0.bm > 0.0F && this.gs() && !this.gB()) {
         this.gD();
      }
   }

   public boolean t() {
      return this.gs() || this.gB();
   }

   @Override
   protected float e(cnu $$0) {
      float $$1 = $$0.cg() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(bvr.v) + $$1;
   }

   @Override
   protected eyr j(buk $$0) {
      return this.t() ? new eyr(this.dK(), this.dI()) : super.j($$0);
   }

   @Override
   protected eys b(cnu $$0, eys $$1) {
      return this.t() ? eys.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cJ <= 0 && this.aH()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dL() {
      return true;
   }

   @Override
   protected void b(float $$0, eys $$1) {
      double $$2 = (double)this.fg();
      this.i(this.bQ().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(bvr.v) * (double)this.aR()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.b(awe.dz);
      this.a(dzl.u);
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
   protected awd w() {
      return awe.dy;
   }

   @Override
   protected awd n_() {
      return awe.dB;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.dD;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      if ($$1.a(awt.bq)) {
         this.a(awe.dI, 1.0F, 1.0F);
      } else {
         this.a(awe.dH, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.ah);
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if ($$0.fS() && !this.o_()) {
         this.b($$0);
         return brp.a;
      } else {
         brp $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.n($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cW().size() < 2 && !this.o_()) {
               this.a($$0);
            }

            return brp.a;
         }
      }
   }

   @Override
   public boolean a(bto $$0, float $$1) {
      if ($$1 > 6.0F && this.gs() && !this.gB() && this.gp()) {
         this.gD();
      }

      return true;
   }

   public boolean gp() {
      return this.g(this.gs() ? buw.a : buw.k);
   }

   @Override
   protected boolean a(cnu $$0, cvp $$1) {
      if (!this.n($$1)) {
         return false;
      } else {
         boolean $$2 = this.eA() < this.eQ();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gG() && this.g() == 0 && this.gw();
         if ($$3) {
            this.f($$0);
         }

         boolean $$4 = this.o_();
         if ($$4) {
            this.dS().a(ln.O, this.d(1.0), this.dA() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dS().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.ba()) {
               awd $$5 = this.gr();
               if ($$5 != null) {
                  this.dS().a(null, this.dx(), this.dz(), this.dD(), $$5, this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
               }
            }

            this.a(dzl.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gq() {
      return false;
   }

   @Override
   public boolean a(cga $$0) {
      if ($$0 != this && $$0 instanceof chr $$1 && this.gZ() && $$1.gZ()) {
         return true;
      }

      return false;
   }

   @Nullable
   public chr b(arh $$0, bth $$1) {
      return btv.o.a($$0, btu.e);
   }

   @Nullable
   @Override
   protected awd gr() {
      return awe.dC;
   }

   @Override
   protected void f(bsg $$0, float $$1) {
      this.gE();
      super.f($$0, $$1);
   }

   @Override
   protected eys a(bto $$0, btr $$1, float $$2) {
      int $$3 = Math.max(this.cW().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dN() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cW().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cga) {
            $$5 += 0.2F;
         }
      }

      return new eys(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dI() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ee() {
      return this.o_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, btr $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gB();
      boolean $$9 = this.gs();
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

         float $$15 = azd.a((float)this.gF() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)azd.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)azd.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public eys s(float $$0) {
      btr $$1 = this.a(this.av());
      float $$2 = this.ee();
      return new eys(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ag() {
      return 30;
   }

   @Override
   protected boolean r(bto $$0) {
      return this.cW().size() <= 2;
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   public boolean gs() {
      return this.am.a(cd) < 0L;
   }

   public boolean gt() {
      return this.gF() < 0L != this.gs();
   }

   public boolean gB() {
      long $$0 = this.gF();
      return $$0 < (long)(this.gs() ? 40 : 52);
   }

   private boolean hd() {
      return this.gs() && this.gF() < 40L && this.gF() >= 0L;
   }

   public void gC() {
      if (!this.gs()) {
         this.b(awe.dF);
         this.b(buw.k);
         this.a(dzl.u);
         this.a(-this.dS().aa());
      }
   }

   public void gD() {
      if (this.gs()) {
         this.b(awe.dG);
         this.b(buw.a);
         this.a(dzl.u);
         this.a(this.dS().aa());
      }
   }

   public void gE() {
      this.b(buw.a);
      this.a(dzl.u);
      this.b(this.dS().aa());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.am.a(cd, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gF() {
      return this.dS().aa() - Math.abs(this.am.a(cd));
   }

   @Override
   public awd ab_() {
      return awe.dE;
   }

   @Override
   public void a(akg<?> $$0) {
      if (!this.al && cc.equals($$0)) {
         this.cJ = this.cJ == 0 ? 55 : this.cJ;
      }

      super.a($$0);
   }

   @Override
   public boolean gG() {
      return true;
   }

   @Override
   public void b(cnu $$0) {
      if (!this.dS().B) {
         $$0.a(this, this.ct);
      }
   }

   @Override
   protected caf J() {
      return new chr.a(this);
   }

   class a extends caf {
      public a(final chr $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!chr.this.t()) {
            super.a();
         }
      }
   }

   class b extends caj {
      b() {
         super(chr.this);
      }

      @Override
      public void a() {
         if (!chr.this.cV()) {
            super.a();
         }
      }
   }

   class c extends cak {
      public c() {
         super(chr.this);
      }

      @Override
      public void a() {
         if (this.k == cak.a.b && !chr.this.K_() && chr.this.gs() && !chr.this.gB() && chr.this.gp()) {
            chr.this.gD();
         }

         super.a();
      }
   }
}

import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cii extends civ {
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
   public static final akl<Boolean> cc = akp.a(cii.class, akn.k);
   public static final akl<Long> cd = akp.a(cii.class, akn.c);
   public final btw ce = new btw();
   public final btw cf = new btw();
   public final btw cg = new btw();
   public final btw ch = new btw();
   public final btw ci = new btw();
   private static final buh cI = buh.b(bul.o.l(), bul.o.m() - 1.43F).b(0.845F);
   private int cJ = 0;
   private int cK = 0;

   public cii(bul<? extends cii> $$0, dfb $$1) {
      super($$0, $$1);
      this.bP = new cii.c();
      this.bO = new cii.b();
      cel $$2 = (cel)this.P();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.am.a(cd));
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bvm.k);
      }

      this.a($$1);
   }

   public static bwh.a q() {
      return gW().a(bwi.s, 32.0).a(bwi.v, 0.09F).a(bwi.o, 0.42F).a(bwi.B, 1.5);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
      $$0.a(cd, 0L);
   }

   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      cij.a(this, $$0.E_());
      this.b($$0.E().aa());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bwc.b<cii> ee() {
      return cij.a();
   }

   @Override
   protected void D() {
   }

   @Override
   protected bwc<?> a(Dynamic<?> $$0) {
      return cij.a(this.ee().a($$0));
   }

   @Override
   public buh e(bvm $$0) {
      return $$0 == bvm.k ? cI.a(this.ek()) : super.e($$0);
   }

   @Override
   protected void ac() {
      bon $$0 = bom.a();
      $$0.a("camelBrain");
      bwc<?> $$1 = this.ed();
      ((bwc<cii>)$$1).a((arn)this.dX(), this);
      $$0.c();
      $$0.a("camelActivityUpdate");
      cij.a(this);
      $$0.c();
      super.ac();
   }

   @Override
   public void l() {
      super.l();
      if (this.y() && this.cJ < 50 && (this.aK() || this.bo() || this.ca())) {
         this.x(false);
      }

      if (this.cJ > 0) {
         this.cJ--;
         if (this.cJ == 0) {
            this.dX().a(null, this.dx(), awl.dA, awm.g, 1.0F, 1.0F);
         }
      }

      if (this.dX().y_()) {
         this.hh();
      }

      if (this.t()) {
         this.ag();
      }

      if (this.gx() && this.bk()) {
         this.gJ();
      }
   }

   private void hh() {
      if (this.cK <= 0) {
         this.cK = this.af.a(40) + 80;
         this.ch.a(this.ag);
      } else {
         this.cK--;
      }

      if (this.gy()) {
         this.cg.a();
         this.ci.a();
         if (this.hi()) {
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
         this.cg.a(this.gG() && this.gK() >= 0L, this.ag);
      }
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.ay() == bvm.a && !this.ci.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F, this.p_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(ezn $$0) {
      if (this.t() && this.aK()) {
         this.h(this.dA().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(com $$0, ezn $$1) {
      super.a($$0, $$1);
      if ($$0.bq > 0.0F && this.gx() && !this.gG()) {
         this.gI();
      }
   }

   public boolean t() {
      return this.gx() || this.gG();
   }

   @Override
   protected float e(com $$0) {
      float $$1 = $$0.ck() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(bwi.v) + $$1;
   }

   @Override
   protected ezm j(bva $$0) {
      return this.t() ? new ezm(this.dP(), this.dN()) : super.j($$0);
   }

   @Override
   protected ezn b(com $$0, ezn $$1) {
      return this.t() ? ezn.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cJ <= 0 && this.aK()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dQ() {
      return true;
   }

   @Override
   protected void b(float $$0, ezn $$1) {
      double $$2 = (double)this.fl();
      this.i(this.bU().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(bwi.v) * (double)this.aU()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.b(awl.dz);
      this.a(eag.u);
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
   protected awk w() {
      return awl.dy;
   }

   @Override
   protected awk o_() {
      return awl.dB;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.dD;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      if ($$1.a(axa.bq)) {
         this.a(awl.dI, 1.0F, 1.0F);
      } else {
         this.a(awl.dH, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.ak);
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if ($$0.ga() && !this.p_()) {
         this.b($$0);
         return bsd.a;
      } else {
         bsd $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.l($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.da().size() < 2 && !this.p_()) {
               this.a($$0);
            }

            return bsd.a;
         }
      }
   }

   @Override
   public boolean a(bue $$0, float $$1) {
      if ($$1 > 6.0F && this.gx() && !this.gG() && this.gu()) {
         this.gI();
      }

      return true;
   }

   public boolean gu() {
      return this.g(this.gx() ? bvm.a : bvm.k);
   }

   @Override
   protected boolean a(com $$0, cwb $$1) {
      if (!this.l($$1)) {
         return false;
      } else {
         boolean $$2 = this.eG() < this.eV();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gL() && this.g() == 0 && this.gB();
         if ($$3) {
            this.f($$0);
         }

         boolean $$4 = this.p_();
         if ($$4) {
            this.dX().a(lr.O, this.d(1.0), this.dF() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dX().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.bc()) {
               awk $$5 = this.gw();
               if ($$5 != null) {
                  this.dX().a(null, this.dC(), this.dE(), this.dI(), $$5, this.dn(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
               }
            }

            this.a(eag.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   public boolean a(cgr $$0) {
      if ($$0 != this && $$0 instanceof cii $$1 && this.he() && $$1.he()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cii b(arn $$0, btv $$1) {
      return bul.o.a($$0, buk.e);
   }

   @Nullable
   @Override
   protected awk gw() {
      return awl.dC;
   }

   @Override
   protected void f(bsu $$0, float $$1) {
      this.gJ();
      super.f($$0, $$1);
   }

   @Override
   protected ezn a(bue $$0, buh $$1, float $$2) {
      int $$3 = Math.max(this.da().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dS() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.da().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cgr) {
            $$5 += 0.2F;
         }
      }

      return new ezn(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dN() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ek() {
      return this.p_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, buh $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gG();
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

         float $$15 = azk.a((float)this.gK() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)azk.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)azk.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public ezn s(float $$0) {
      buh $$1 = this.a(this.ay());
      float $$2 = this.ek();
      return new ezn(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ae() {
      return 30;
   }

   @Override
   protected boolean r(bue $$0) {
      return this.da().size() <= 2;
   }

   @Override
   protected void ab() {
      super.ab();
      ags.a(this);
   }

   public boolean gx() {
      return this.am.a(cd) < 0L;
   }

   public boolean gy() {
      return this.gK() < 0L != this.gx();
   }

   public boolean gG() {
      long $$0 = this.gK();
      return $$0 < (long)(this.gx() ? 40 : 52);
   }

   private boolean hi() {
      return this.gx() && this.gK() < 40L && this.gK() >= 0L;
   }

   public void gH() {
      if (!this.gx()) {
         this.b(awl.dF);
         this.b(bvm.k);
         this.a(eag.u);
         this.a(-this.dX().aa());
      }
   }

   public void gI() {
      if (this.gx()) {
         this.b(awl.dG);
         this.b(bvm.a);
         this.a(eag.u);
         this.a(this.dX().aa());
      }
   }

   public void gJ() {
      this.b(bvm.a);
      this.a(eag.u);
      this.b(this.dX().aa());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.am.a(cd, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gK() {
      return this.dX().aa() - Math.abs(this.am.a(cd));
   }

   @Override
   public awk ad_() {
      return awl.dE;
   }

   @Override
   public void a(akl<?> $$0) {
      if (!this.al && cc.equals($$0)) {
         this.cJ = this.cJ == 0 ? 55 : this.cJ;
      }

      super.a($$0);
   }

   @Override
   public boolean gL() {
      return true;
   }

   @Override
   public void b(com $$0) {
      if (!this.dX().C) {
         $$0.a(this, this.ct);
      }
   }

   @Override
   protected caw J() {
      return new cii.a(this);
   }

   class a extends caw {
      public a(final cii $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cii.this.t()) {
            super.a();
         }
      }
   }

   class b extends cba {
      b() {
         super(cii.this);
      }

      @Override
      public void a() {
         if (!cii.this.cZ()) {
            super.a();
         }
      }
   }

   class c extends cbb {
      public c() {
         super(cii.this);
      }

      @Override
      public void a() {
         if (this.k == cbb.a.b && !cii.this.M_() && cii.this.gx() && !cii.this.gG() && cii.this.gu()) {
            cii.this.gI();
         }

         super.a();
      }
   }
}

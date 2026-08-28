import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cjj extends cjw {
   public static final float bZ = 0.45F;
   public static final int ca = 55;
   public static final int cb = 30;
   private static final float cC = 0.1F;
   private static final float cD = 1.4285F;
   private static final float cE = 22.2222F;
   private static final int cF = 5;
   private static final int cG = 40;
   private static final int cH = 52;
   private static final int cI = 80;
   private static final float cJ = 1.43F;
   public static final alc<Boolean> cd = alg.a(cjj.class, ale.k);
   public static final alc<Long> ce = alg.a(cjj.class, ale.c);
   public final bux cf = new bux();
   public final bux cg = new bux();
   public final bux ch = new bux();
   public final bux ci = new bux();
   public final bux cj = new bux();
   private static final bvi cK = bvi.b(bvm.t.l(), bvm.t.m() - 1.43F).b(0.845F);
   private int cL = 0;
   private int cM = 0;

   public cjj(bvm<? extends cjj> $$0, dha $$1) {
      super($$0, $$1);
      this.bQ = new cjj.c();
      this.bP = new cjj.b();
      cfm $$2 = (cfm)this.L();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.al.a(ce));
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bwn.k);
      }

      this.a($$1);
   }

   public static bxi.a p() {
      return gO().a(bxj.s, 32.0).a(bxj.v, 0.09F).a(bxj.o, 0.42F).a(bxj.B, 1.5);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cd, false);
      $$0.a(ce, 0L);
   }

   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      cjk.a(this, $$0.H_());
      this.b($$0.a().ac());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bxd.b<cjj> ec() {
      return cjk.a();
   }

   @Override
   protected void B() {
   }

   @Override
   protected bxd<?> a(Dynamic<?> $$0) {
      return cjk.a(this.ec().a($$0));
   }

   @Override
   public bvi e(bwn $$0) {
      return $$0 == bwn.k ? cK.a(this.ei()) : super.e($$0);
   }

   @Override
   protected void a(ash $$0) {
      bpo $$1 = bpn.a();
      $$1.a("camelBrain");
      bxd<?> $$2 = this.eb();
      ((bxd<cjj>)$$2).a($$0, this);
      $$1.c();
      $$1.a("camelActivityUpdate");
      cjk.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.x() && this.cL < 50 && (this.aJ() || this.bn() || this.bZ())) {
         this.x(false);
      }

      if (this.cL > 0) {
         this.cL--;
         if (this.cL == 0) {
            this.dV().a(null, this.dv(), axf.dA, axg.g, 1.0F, 1.0F);
         }
      }

      if (this.dV().B_()) {
         this.gY();
      }

      if (this.t()) {
         this.ab();
      }

      if (this.gp() && this.bj()) {
         this.gB();
      }
   }

   private void gY() {
      if (this.cM <= 0) {
         this.cM = this.ae.a(40) + 80;
         this.ci.a(this.af);
      } else {
         this.cM--;
      }

      if (this.gq()) {
         this.ch.a();
         this.cj.a();
         if (this.gZ()) {
            this.cf.b(this.af);
            this.cg.a();
         } else {
            this.cf.a();
            this.cg.b(this.af);
         }
      } else {
         this.cf.a();
         this.cg.a();
         this.cj.a(this.x(), this.af);
         this.ch.a(this.gy() && this.gC() >= 0L, this.af);
      }
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.aw() == bwn.a && !this.cj.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F, this.e_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(fbs $$0) {
      if (this.t() && this.aJ()) {
         this.h(this.dy().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(cps $$0, fbs $$1) {
      super.a($$0, $$1);
      if ($$0.bq > 0.0F && this.gp() && !this.gy()) {
         this.gA();
      }
   }

   public boolean t() {
      return this.gp() || this.gy();
   }

   @Override
   protected float e(cps $$0) {
      float $$1 = $$0.cj() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(bxj.v) + $$1;
   }

   @Override
   protected fbr j(bwb $$0) {
      return this.t() ? new fbr(this.dN(), this.dL()) : super.j($$0);
   }

   @Override
   protected fbs b(cps $$0, fbs $$1) {
      return this.t() ? fbs.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.j() && this.cL <= 0 && this.aJ()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dO() {
      return true;
   }

   @Override
   protected void b(float $$0, fbs $$1) {
      double $$2 = (double)this.fh();
      this.i(this.bT().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(bxj.v) * (double)this.aT()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cL = 55;
      this.x(true);
      this.ar = true;
   }

   public boolean x() {
      return this.al.a(cd);
   }

   public void x(boolean $$0) {
      this.al.a(cd, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(axf.dz);
      this.a(ecj.u);
      this.x(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cL;
   }

   @Override
   protected axe u() {
      return axf.dy;
   }

   @Override
   protected axe o_() {
      return axf.dB;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.dD;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      if ($$1.a(axu.br)) {
         this.a(axf.dI, 1.0F, 1.0F);
      } else {
         this.a(axf.dH, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.am);
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if ($$0.fW() && !this.e_()) {
         this.b($$0);
         return bte.a;
      } else {
         bte $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.j($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cZ().size() < 2 && !this.e_()) {
               this.a($$0);
            }

            return bte.a;
         }
      }
   }

   @Override
   public boolean a(bvf $$0, float $$1) {
      if ($$1 > 6.0F && this.gp() && !this.gy() && this.gm()) {
         this.gA();
      }

      return true;
   }

   public boolean gm() {
      return this.g(this.gp() ? bwn.a : bwn.k);
   }

   @Override
   protected boolean a(cps $$0, cxk $$1) {
      if (!this.j($$1)) {
         return false;
      } else {
         boolean $$2 = this.eD() < this.eR();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gD() && this.Z_() == 0 && this.gt();
         if ($$3) {
            this.f($$0);
         }

         boolean $$4 = this.e_();
         if ($$4) {
            this.dV().a(ls.O, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dV().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.bb()) {
               axe $$5 = this.go();
               if ($$5 != null) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), $$5, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
               }
            }

            this.a(ecj.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gn() {
      return false;
   }

   @Override
   public boolean a(chs $$0) {
      if ($$0 != this && $$0 instanceof cjj $$1 && this.gV() && $$1.gV()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cjj b(ash $$0, buw $$1) {
      return bvm.t.a($$0, bvl.e);
   }

   @Nullable
   @Override
   protected axe go() {
      return axf.dC;
   }

   @Override
   protected void b(ash $$0, btv $$1, float $$2) {
      this.gB();
      super.b($$0, $$1, $$2);
   }

   @Override
   protected fbs a(bvf $$0, bvi $$1, float $$2) {
      int $$3 = Math.max(this.cZ().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dQ() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cZ().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof chs) {
            $$5 += 0.2F;
         }
      }

      return new fbs(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dL() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ei() {
      return this.e_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bvi $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gy();
      boolean $$9 = this.gp();
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

         float $$15 = bae.a((float)this.gC() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)bae.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)bae.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public fbs s(float $$0) {
      bvi $$1 = this.a(this.aw());
      float $$2 = this.ei();
      return new fbs(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   protected boolean r(bvf $$0) {
      return this.cZ().size() <= 2;
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   public boolean gp() {
      return this.al.a(ce) < 0L;
   }

   public boolean gq() {
      return this.gC() < 0L != this.gp();
   }

   public boolean gy() {
      long $$0 = this.gC();
      return $$0 < (long)(this.gp() ? 40 : 52);
   }

   private boolean gZ() {
      return this.gp() && this.gC() < 40L && this.gC() >= 0L;
   }

   public void gz() {
      if (!this.gp()) {
         this.b(axf.dF);
         this.b(bwn.k);
         this.a(ecj.u);
         this.a(-this.dV().ac());
      }
   }

   public void gA() {
      if (this.gp()) {
         this.b(axf.dG);
         this.b(bwn.a);
         this.a(ecj.u);
         this.a(this.dV().ac());
      }
   }

   public void gB() {
      this.b(bwn.a);
      this.a(ecj.u);
      this.b(this.dV().ac());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.al.a(ce, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gC() {
      return this.dV().ac() - Math.abs(this.al.a(ce));
   }

   @Override
   public axe ac_() {
      return axf.dE;
   }

   @Override
   public void a(alc<?> $$0) {
      if (!this.ak && cd.equals($$0)) {
         this.cL = this.cL == 0 ? 55 : this.cL;
      }

      super.a($$0);
   }

   @Override
   public boolean gD() {
      return true;
   }

   @Override
   public void b(cps $$0) {
      if (!this.dV().C) {
         $$0.a(this, this.cu);
      }
   }

   @Override
   protected cbx G() {
      return new cjj.a(this);
   }

   class a extends cbx {
      public a(final cjj $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cjj.this.t()) {
            super.a();
         }
      }
   }

   class b extends ccb {
      b() {
         super(cjj.this);
      }

      @Override
      public void a() {
         if (!cjj.this.cY()) {
            super.a();
         }
      }
   }

   class c extends ccc {
      public c() {
         super(cjj.this);
      }

      @Override
      public void a() {
         if (this.k == ccc.a.b && !cjj.this.P_() && cjj.this.gp() && !cjj.this.gy() && cjj.this.gm()) {
            cjj.this.gA();
         }

         super.a();
      }
   }
}

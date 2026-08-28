import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clp extends cme {
   public static final float bI = 0.45F;
   public static final int bJ = 55;
   public static final int bK = 30;
   private static final float cg = 0.1F;
   private static final float ch = 1.4285F;
   private static final float ci = 22.2222F;
   private static final int cj = 5;
   private static final int ck = 40;
   private static final int cl = 52;
   private static final int cm = 80;
   private static final float cn = 1.43F;
   private static final long cq = 0L;
   public static final aku<Boolean> bM = aky.a(clp.class, akw.k);
   public static final aku<Long> bN = aky.a(clp.class, akw.c);
   public final bwv bO = new bwv();
   public final bwv bP = new bwv();
   public final bwv bQ = new bwv();
   public final bwv bR = new bwv();
   public final bwv bS = new bwv();
   private static final bxh cr = bxh.b(bxn.u.l(), bxn.u.m() - 1.43F).b(0.845F);
   private int cs = 0;
   private int ct = 0;

   public clp(bxn<? extends clp> $$0, dkj $$1) {
      super($$0, $$1);
      this.bC = new clp.c();
      this.bB = new clp.b();
      cho $$2 = (cho)this.N();
      $$2.a(true);
      $$2.d(true);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.al.a(bN).longValue());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      long $$1 = $$0.b("LastPoseTick", 0L);
      if ($$1 < 0L) {
         this.b(byr.k);
      }

      this.a($$1);
   }

   public static bzk.a m() {
      return gV().a(bzl.s, 32.0).a(bzl.v, 0.09F).a(bzl.o, 0.42F).a(bzl.B, 1.5);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bM, false);
      $$0.a(bN, 0L);
   }

   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      clq.a(this, $$0.G_());
      this.b($$0.a().ae());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bxn<clp> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.a_($$3.e()).a(axn.cm) && a($$1, $$3);
   }

   @Override
   protected bzf.b<clp> ed() {
      return clq.a();
   }

   @Override
   protected void C() {
   }

   @Override
   protected bzf<?> a(Dynamic<?> $$0) {
      return clq.a(this.ed().a($$0));
   }

   @Override
   public bxh e(byr $$0) {
      return $$0 == byr.k ? cr.a(this.ek()) : super.e($$0);
   }

   @Override
   protected void a(asb $$0) {
      brm $$1 = brl.a();
      $$1.a("camelBrain");
      bzf<?> $$2 = this.ec();
      ((bzf<clp>)$$2).a($$0, this);
      $$1.c();
      $$1.a("camelActivityUpdate");
      clq.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void g() {
      super.g();
      if (this.u() && this.cs < 50 && (this.aH() || this.bl() || this.bY())) {
         this.w(false);
      }

      if (this.cs > 0) {
         this.cs--;
         if (this.cs == 0) {
            this.dV().a(null, this.dv(), awy.dD, awz.g, 1.0F, 1.0F);
         }
      }

      if (this.dV().A_()) {
         this.he();
      }

      if (this.p()) {
         this.af();
      }

      if (this.gx() && this.bi()) {
         this.gJ();
      }
   }

   private void he() {
      if (this.ct <= 0) {
         this.ct = this.ae.a(40) + 80;
         this.bR.a(this.af);
      } else {
         this.ct--;
      }

      if (this.gy()) {
         this.bQ.a();
         this.bS.a();
         if (this.hf()) {
            this.bO.b(this.af);
            this.bP.a();
         } else {
            this.bO.a();
            this.bP.b(this.af);
         }
      } else {
         this.bO.a();
         this.bP.a();
         this.bS.a(this.u(), this.af);
         this.bQ.a(this.gG() && this.gK() >= 0L, this.af);
      }
   }

   @Override
   protected void A(float $$0) {
      float $$1;
      if (this.at() == byr.a && !this.bS.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F, this.e_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(fgc $$0) {
      if (this.p() && this.aH()) {
         this.i(this.dy().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(csi $$0, fgc $$1) {
      super.a($$0, $$1);
      if ($$0.bi > 0.0F && this.gx() && !this.gG()) {
         this.gI();
      }
   }

   public boolean p() {
      return this.gx() || this.gG();
   }

   @Override
   protected float c(csi $$0) {
      float $$1 = $$0.ci() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(bzl.v) + $$1;
   }

   @Override
   protected fgb i(byf $$0) {
      return this.p() ? new fgb(this.dN(), this.dL()) : super.i($$0);
   }

   @Override
   protected fgc b(csi $$0, fgc $$1) {
      return this.p() ? fgc.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.p() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.fZ() && this.cs <= 0 && this.aH()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dO() {
      return true;
   }

   @Override
   protected void b(float $$0, fgc $$1) {
      double $$2 = (double)this.fh();
      this.j(this.bS().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(bzl.v) * (double)this.aS()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cs = 55;
      this.w(true);
      this.ar = true;
   }

   public boolean u() {
      return this.al.a(bM);
   }

   public void w(boolean $$0) {
      this.al.a(bM, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(awy.dC);
      this.a(egq.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cs;
   }

   @Override
   protected awx s() {
      return awy.dB;
   }

   @Override
   protected awx j_() {
      return awy.dE;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.dG;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      if ($$1.a(axn.bs)) {
         this.a(awy.dL, 1.0F, 1.0F);
      } else {
         this.a(awy.dK, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.am);
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if ($$0.fY() && !this.e_()) {
         this.b($$0);
         return bvc.a;
      } else {
         bvc $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.i($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cY().size() < 2 && !this.e_()) {
               this.a($$0);
            }

            return bvc.a;
         }
      }
   }

   @Override
   public boolean a(bxe $$0, float $$1) {
      if ($$1 > 6.0F && this.gx() && !this.gG() && this.gu()) {
         this.gI();
      }

      return true;
   }

   public boolean gu() {
      return this.g(this.gx() ? byr.a : byr.k);
   }

   @Override
   protected boolean a(csi $$0, dak $$1) {
      if (!this.i($$1)) {
         return false;
      } else {
         boolean $$2 = this.eG() < this.eU();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gL() && this.Y_() == 0 && this.gB();
         if ($$3) {
            this.e($$0);
         }

         boolean $$4 = this.e_();
         if ($$4) {
            this.dV().a(lz.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dV().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.ba()) {
               awx $$5 = this.gw();
               if ($$5 != null) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), $$5, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
               }
            }

            this.a(egq.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   public boolean a(cjv $$0) {
      if ($$0 != this && $$0 instanceof clp $$1 && this.hc() && $$1.hc()) {
         return true;
      }

      return false;
   }

   @Nullable
   public clp b(asb $$0, bwu $$1) {
      return bxn.u.a($$0, bxm.e);
   }

   @Nullable
   @Override
   protected awx gw() {
      return awy.dF;
   }

   @Override
   protected void c(asb $$0, bvt $$1, float $$2) {
      this.gJ();
      super.c($$0, $$1, $$2);
   }

   @Override
   protected fgc a(bxe $$0, bxh $$1, float $$2) {
      int $$3 = Math.max(this.cY().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dQ() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cY().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cjv) {
            $$5 += 0.2F;
         }
      }

      return new fgc(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dL() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ek() {
      return this.e_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bxh $$2, float $$3) {
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

         float $$15 = azz.a((float)this.gK() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)azz.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)azz.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public fgc t(float $$0) {
      bxh $$1 = this.a(this.at());
      float $$2 = this.ek();
      return new fgc(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ae() {
      return 30;
   }

   @Override
   protected boolean r(bxe $$0) {
      return this.cY().size() <= 2;
   }

   @Override
   protected void ab() {
      super.ab();
      agx.a(this);
   }

   public boolean gx() {
      return this.al.a(bN) < 0L;
   }

   public boolean gy() {
      return this.gK() < 0L != this.gx();
   }

   public boolean gG() {
      long $$0 = this.gK();
      return $$0 < (long)(this.gx() ? 40 : 52);
   }

   private boolean hf() {
      return this.gx() && this.gK() < 40L && this.gK() >= 0L;
   }

   public void gH() {
      if (!this.gx()) {
         this.b(awy.dI);
         this.b(byr.k);
         this.a(egq.u);
         this.a(-this.dV().ae());
      }
   }

   public void gI() {
      if (this.gx()) {
         this.b(awy.dJ);
         this.b(byr.a);
         this.a(egq.u);
         this.a(this.dV().ae());
      }
   }

   public void gJ() {
      this.b(byr.a);
      this.a(egq.u);
      this.b(this.dV().ae());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.al.a(bN, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gK() {
      return this.dV().ae() - Math.abs(this.al.a(bN));
   }

   @Override
   protected jg<awx> a(bxo $$0, dak $$1, dit $$2) {
      return (jg<awx>)($$0 == bxo.h ? awy.dH : super.a($$0, $$1, $$2));
   }

   @Override
   public void a(aku<?> $$0) {
      if (!this.ak && bM.equals($$0)) {
         this.cs = this.cs == 0 ? 55 : this.cs;
      }

      super.a($$0);
   }

   @Override
   public boolean gL() {
      return true;
   }

   @Override
   public void b(csi $$0) {
      if (!this.dV().C) {
         $$0.a(this, this.ca);
      }
   }

   @Override
   protected cdz H() {
      return new clp.a(this);
   }

   class a extends cdz {
      public a(final clp $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!clp.this.p()) {
            super.a();
         }
      }
   }

   class b extends ced {
      b() {
         super(clp.this);
      }

      @Override
      public void a() {
         if (!clp.this.cX()) {
            super.a();
         }
      }
   }

   class c extends cee {
      public c() {
         super(clp.this);
      }

      @Override
      public void a() {
         if (this.k == cee.a.b && !clp.this.Q_() && clp.this.gx() && !clp.this.gG() && clp.this.gu()) {
            clp.this.gI();
         }

         super.a();
      }
   }
}

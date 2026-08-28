import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cid extends ciq {
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
   public static final akk<Boolean> cc = ako.a(cid.class, akm.k);
   public static final akk<Long> cd = ako.a(cid.class, akm.c);
   public final btr ce = new btr();
   public final btr cf = new btr();
   public final btr cg = new btr();
   public final btr ch = new btr();
   public final btr ci = new btr();
   private static final buc cI = buc.b(bug.o.l(), bug.o.m() - 1.43F).b(0.845F);
   private int cJ = 0;
   private int cK = 0;

   public cid(bug<? extends cid> $$0, dev $$1) {
      super($$0, $$1);
      this.bP = new cid.c();
      this.bO = new cid.b();
      ceg $$2 = (ceg)this.P();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.am.a(cd));
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bvh.k);
      }

      this.b($$1);
   }

   public static bwc.a q() {
      return gX().a(bwd.s, 32.0).a(bwd.v, 0.09F).a(bwd.o, 0.42F).a(bwd.B, 1.5);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
      $$0.a(cd, 0L);
   }

   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      cie.a(this, $$0.E_());
      this.c($$0.E().aa());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bvx.b<cid> ee() {
      return cie.a();
   }

   @Override
   protected void D() {
   }

   @Override
   protected bvx<?> a(Dynamic<?> $$0) {
      return cie.a(this.ee().a($$0));
   }

   @Override
   public buc e(bvh $$0) {
      return $$0 == bvh.k ? cI.a(this.ek()) : super.e($$0);
   }

   @Override
   protected void ac() {
      this.dX().ah().a("camelBrain");
      bvx<?> $$0 = this.ed();
      ((bvx<cid>)$$0).a((arm)this.dX(), this);
      this.dX().ah().c();
      this.dX().ah().a("camelActivityUpdate");
      cie.a(this);
      this.dX().ah().c();
      super.ac();
   }

   @Override
   public void l() {
      super.l();
      if (this.y() && this.cJ < 50 && (this.aJ() || this.bo() || this.ca())) {
         this.x(false);
      }

      if (this.cJ > 0) {
         this.cJ--;
         if (this.cJ == 0) {
            this.dX().a(null, this.dx(), awk.dA, awl.g, 1.0F, 1.0F);
         }
      }

      if (this.dX().y_()) {
         this.hi();
      }

      if (this.t()) {
         this.ag();
      }

      if (this.gy() && this.bk()) {
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
      if (this.ax() == bvh.a && !this.ci.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aQ.a($$1, 0.2F, this.p_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(ezh $$0) {
      if (this.t() && this.aJ()) {
         this.h(this.dA().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(coh $$0, ezh $$1) {
      super.a($$0, $$1);
      if ($$0.bn > 0.0F && this.gy() && !this.gH()) {
         this.gJ();
      }
   }

   public boolean t() {
      return this.gy() || this.gH();
   }

   @Override
   protected float e(coh $$0) {
      float $$1 = $$0.ck() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(bwd.v) + $$1;
   }

   @Override
   protected ezg j(buv $$0) {
      return this.t() ? new ezg(this.dP(), this.dN()) : super.j($$0);
   }

   @Override
   protected ezh b(coh $$0, ezh $$1) {
      return this.t() ? ezh.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cJ <= 0 && this.aJ()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dQ() {
      return true;
   }

   @Override
   protected void b(float $$0, ezh $$1) {
      double $$2 = (double)this.fl();
      this.i(this.bU().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(bwd.v) * (double)this.aT()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.b(awk.dz);
      this.a(eaa.u);
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
   protected awj w() {
      return awk.dy;
   }

   @Override
   protected awj o_() {
      return awk.dB;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.dD;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      if ($$1.a(awz.bq)) {
         this.a(awk.dI, 1.0F, 1.0F);
      } else {
         this.a(awk.dH, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.ai);
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if ($$0.ga() && !this.p_()) {
         this.b($$0);
         return bry.a;
      } else {
         bry $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.l($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.da().size() < 2 && !this.p_()) {
               this.a($$0);
            }

            return bry.a;
         }
      }
   }

   @Override
   public boolean a(btz $$0, float $$1) {
      if ($$1 > 6.0F && this.gy() && !this.gH() && this.gv()) {
         this.gJ();
      }

      return true;
   }

   public boolean gv() {
      return this.g(this.gy() ? bvh.a : bvh.k);
   }

   @Override
   protected boolean a(coh $$0, cvx $$1) {
      if (!this.l($$1)) {
         return false;
      } else {
         boolean $$2 = this.eG() < this.eV();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gM() && this.g() == 0 && this.gC();
         if ($$3) {
            this.f($$0);
         }

         boolean $$4 = this.p_();
         if ($$4) {
            this.dX().a(lq.O, this.d(1.0), this.dF() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dX().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.bc()) {
               awj $$5 = this.gx();
               if ($$5 != null) {
                  this.dX().a(null, this.dC(), this.dE(), this.dI(), $$5, this.dn(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
               }
            }

            this.a(eaa.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gw() {
      return false;
   }

   @Override
   public boolean a(cgm $$0) {
      if ($$0 != this && $$0 instanceof cid $$1 && this.hf() && $$1.hf()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cid b(arm $$0, btq $$1) {
      return bug.o.a($$0, buf.e);
   }

   @Nullable
   @Override
   protected awj gx() {
      return awk.dC;
   }

   @Override
   protected void f(bsp $$0, float $$1) {
      this.gK();
      super.f($$0, $$1);
   }

   @Override
   protected ezh a(btz $$0, buc $$1, float $$2) {
      int $$3 = Math.max(this.da().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dS() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.da().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cgm) {
            $$5 += 0.2F;
         }
      }

      return new ezh(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dN() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ek() {
      return this.p_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, buc $$2, float $$3) {
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

         float $$15 = azj.a((float)this.gL() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)azj.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)azj.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public ezh s(float $$0) {
      buc $$1 = this.a(this.ax());
      float $$2 = this.ek();
      return new ezh(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ae() {
      return 30;
   }

   @Override
   protected boolean r(btz $$0) {
      return this.da().size() <= 2;
   }

   @Override
   protected void ab() {
      super.ab();
      agr.a(this);
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
         this.b(awk.dF);
         this.b(bvh.k);
         this.a(eaa.u);
         this.b(-this.dX().aa());
      }
   }

   public void gJ() {
      if (this.gy()) {
         this.b(awk.dG);
         this.b(bvh.a);
         this.a(eaa.u);
         this.b(this.dX().aa());
      }
   }

   public void gK() {
      this.b(bvh.a);
      this.a(eaa.u);
      this.c(this.dX().aa());
   }

   @VisibleForTesting
   public void b(long $$0) {
      this.am.a(cd, $$0);
   }

   private void c(long $$0) {
      this.b(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gL() {
      return this.dX().aa() - Math.abs(this.am.a(cd));
   }

   @Override
   public awj ad_() {
      return awk.dE;
   }

   @Override
   public void a(akk<?> $$0) {
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
   public void b(coh $$0) {
      if (!this.dX().C) {
         $$0.a(this, this.ct);
      }
   }

   @Override
   protected car J() {
      return new cid.a(this);
   }

   class a extends car {
      public a(final cid $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cid.this.t()) {
            super.a();
         }
      }
   }

   class b extends cav {
      b() {
         super(cid.this);
      }

      @Override
      public void a() {
         if (!cid.this.cZ()) {
            super.a();
         }
      }
   }

   class c extends caw {
      public c() {
         super(cid.this);
      }

      @Override
      public void a() {
         if (this.k == caw.a.b && !cid.this.M_() && cid.this.gy() && !cid.this.gH() && cid.this.gv()) {
            cid.this.gJ();
         }

         super.a();
      }
   }
}

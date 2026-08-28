import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cle extends clt {
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
   public static final akl<Boolean> bM = akp.a(cle.class, akn.k);
   public static final akl<Long> bN = akp.a(cle.class, akn.c);
   public final bwk bO = new bwk();
   public final bwk bP = new bwk();
   public final bwk bQ = new bwk();
   public final bwk bR = new bwk();
   public final bwk bS = new bwk();
   private static final bww cr = bww.b(bxc.u.l(), bxc.u.m() - 1.43F).b(0.845F);
   private int cs = 0;
   private int ct = 0;

   public cle(bxc<? extends cle> $$0, djx $$1) {
      super($$0, $$1);
      this.bC = new cle.c();
      this.bB = new cle.b();
      chd $$2 = (chd)this.O();
      $$2.a(true);
      $$2.d(true);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.al.a(bN).longValue());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      long $$1 = $$0.b("LastPoseTick", 0L);
      if ($$1 < 0L) {
         this.b(byg.k);
      }

      this.a($$1);
   }

   public static byz.a q() {
      return gV().a(bza.s, 32.0).a(bza.v, 0.09F).a(bza.o, 0.42F).a(bza.B, 1.5);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bM, false);
      $$0.a(bN, 0L);
   }

   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      clf.a(this, $$0.G_());
      this.b($$0.a().ae());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bxc<cle> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.a_($$3.e()).a(axe.cm) && a($$1, $$3);
   }

   @Override
   protected byu.b<cle> ed() {
      return clf.a();
   }

   @Override
   protected void D() {
   }

   @Override
   protected byu<?> a(Dynamic<?> $$0) {
      return clf.a(this.ed().a($$0));
   }

   @Override
   public bww e(byg $$0) {
      return $$0 == byg.k ? cr.a(this.ek()) : super.e($$0);
   }

   @Override
   protected void a(ars $$0) {
      brb $$1 = bra.a();
      $$1.a("camelBrain");
      byu<?> $$2 = this.ec();
      ((byu<cle>)$$2).a($$0, this);
      $$1.c();
      $$1.a("camelActivityUpdate");
      clf.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.x() && this.cs < 50 && (this.aH() || this.bl() || this.bY())) {
         this.w(false);
      }

      if (this.cs > 0) {
         this.cs--;
         if (this.cs == 0) {
            this.dV().a(null, this.dv(), awp.dD, awq.g, 1.0F, 1.0F);
         }
      }

      if (this.dV().A_()) {
         this.he();
      }

      if (this.t()) {
         this.ag();
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
         this.bS.a(this.x(), this.af);
         this.bQ.a(this.gG() && this.gK() >= 0L, this.af);
      }
   }

   @Override
   protected void A(float $$0) {
      float $$1;
      if (this.at() == byg.a && !this.bS.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F, this.n_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(ffq $$0) {
      if (this.t() && this.aH()) {
         this.i(this.dy().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(crx $$0, ffq $$1) {
      super.a($$0, $$1);
      if ($$0.bi > 0.0F && this.gx() && !this.gG()) {
         this.gI();
      }
   }

   public boolean t() {
      return this.gx() || this.gG();
   }

   @Override
   protected float c(crx $$0) {
      float $$1 = $$0.ci() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(bza.v) + $$1;
   }

   @Override
   protected ffp i(bxu $$0) {
      return this.t() ? new ffp(this.dN(), this.dL()) : super.i($$0);
   }

   @Override
   protected ffq b(crx $$0, ffq $$1) {
      return this.t() ? ffq.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
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
   protected void b(float $$0, ffq $$1) {
      double $$2 = (double)this.fh();
      this.j(this.bS().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(bza.v) * (double)this.aS()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cs = 55;
      this.w(true);
      this.ar = true;
   }

   public boolean x() {
      return this.al.a(bM);
   }

   public void w(boolean $$0) {
      this.al.a(bM, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(awp.dC);
      this.a(ege.u);
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
   protected awo u() {
      return awp.dB;
   }

   @Override
   protected awo l_() {
      return awp.dE;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.dG;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      if ($$1.a(axe.bs)) {
         this.a(awp.dL, 1.0F, 1.0F);
      } else {
         this.a(awp.dK, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.al);
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if ($$0.fY() && !this.n_()) {
         this.b($$0);
         return bur.a;
      } else {
         bur $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.i($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cY().size() < 2 && !this.n_()) {
               this.a($$0);
            }

            return bur.a;
         }
      }
   }

   @Override
   public boolean a(bwt $$0, float $$1) {
      if ($$1 > 6.0F && this.gx() && !this.gG() && this.gu()) {
         this.gI();
      }

      return true;
   }

   public boolean gu() {
      return this.g(this.gx() ? byg.a : byg.k);
   }

   @Override
   protected boolean a(crx $$0, czy $$1) {
      if (!this.i($$1)) {
         return false;
      } else {
         boolean $$2 = this.eG() < this.eU();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gL() && this.g() == 0 && this.gB();
         if ($$3) {
            this.e($$0);
         }

         boolean $$4 = this.n_();
         if ($$4) {
            this.dV().a(ly.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dV().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.ba()) {
               awo $$5 = this.gw();
               if ($$5 != null) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), $$5, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
               }
            }

            this.a(ege.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   public boolean a(cjk $$0) {
      if ($$0 != this && $$0 instanceof cle $$1 && this.hc() && $$1.hc()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cle b(ars $$0, bwj $$1) {
      return bxc.u.a($$0, bxb.e);
   }

   @Nullable
   @Override
   protected awo gw() {
      return awp.dF;
   }

   @Override
   protected void c(ars $$0, bvi $$1, float $$2) {
      this.gJ();
      super.c($$0, $$1, $$2);
   }

   @Override
   protected ffq a(bwt $$0, bww $$1, float $$2) {
      int $$3 = Math.max(this.cY().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dQ() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cY().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cjk) {
            $$5 += 0.2F;
         }
      }

      return new ffq(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dL() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ek() {
      return this.n_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bww $$2, float $$3) {
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

         float $$15 = azo.a((float)this.gK() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)azo.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)azo.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public ffq t(float $$0) {
      bww $$1 = this.a(this.at());
      float $$2 = this.ek();
      return new ffq(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int af() {
      return 30;
   }

   @Override
   protected boolean r(bwt $$0) {
      return this.cY().size() <= 2;
   }

   @Override
   protected void ac() {
      super.ac();
      ago.a(this);
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
         this.b(awp.dI);
         this.b(byg.k);
         this.a(ege.u);
         this.a(-this.dV().ae());
      }
   }

   public void gI() {
      if (this.gx()) {
         this.b(awp.dJ);
         this.b(byg.a);
         this.a(ege.u);
         this.a(this.dV().ae());
      }
   }

   public void gJ() {
      this.b(byg.a);
      this.a(ege.u);
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
   protected jf<awo> a(bxd $$0, czy $$1, dih $$2) {
      return (jf<awo>)($$0 == bxd.h ? awp.dH : super.a($$0, $$1, $$2));
   }

   @Override
   public void a(akl<?> $$0) {
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
   public void b(crx $$0) {
      if (!this.dV().C) {
         $$0.a(this, this.ca);
      }
   }

   @Override
   protected cdo I() {
      return new cle.a(this);
   }

   class a extends cdo {
      public a(final cle $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cle.this.t()) {
            super.a();
         }
      }
   }

   class b extends cds {
      b() {
         super(cle.this);
      }

      @Override
      public void a() {
         if (!cle.this.cX()) {
            super.a();
         }
      }
   }

   class c extends cdt {
      public c() {
         super(cle.this);
      }

      @Override
      public void a() {
         if (this.k == cdt.a.b && !cle.this.S_() && cle.this.gx() && !cle.this.gG() && cle.this.gu()) {
            cle.this.gI();
         }

         super.a();
      }
   }
}

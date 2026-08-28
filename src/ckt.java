import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ckt extends cli {
   public static final float bG = 0.45F;
   public static final int bH = 55;
   public static final int bI = 30;
   private static final float ce = 0.1F;
   private static final float cf = 1.4285F;
   private static final float cg = 22.2222F;
   private static final int ch = 5;
   private static final int ci = 40;
   private static final int cj = 52;
   private static final int ck = 80;
   private static final float cl = 1.43F;
   public static final akj<Boolean> bK = akn.a(ckt.class, akl.k);
   public static final akj<Long> bL = akn.a(ckt.class, akl.c);
   public final bvz bM = new bvz();
   public final bvz bN = new bvz();
   public final bvz bO = new bvz();
   public final bvz bP = new bvz();
   public final bvz bQ = new bvz();
   private static final bwl cm = bwl.b(bwr.t.l(), bwr.t.m() - 1.43F).b(0.845F);
   private int cn = 0;
   private int cq = 0;

   public ckt(bwr<? extends ckt> $$0, djm $$1) {
      super($$0, $$1);
      this.bA = new ckt.c();
      this.bz = new ckt.b();
      cgs $$2 = (cgs)this.O();
      $$2.a(true);
      $$2.d(true);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.al.a(bL).longValue());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      long $$1 = $$0.g("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bxv.k);
      }

      this.a($$1);
   }

   public static byo.a q() {
      return gU().a(byp.s, 32.0).a(byp.v, 0.09F).a(byp.o, 0.42F).a(byp.B, 1.5);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bK, false);
      $$0.a(bL, 0L);
   }

   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      cku.a(this, $$0.C_());
      this.b($$0.a().ae());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bwr<ckt> $$0, djn $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cm) && a($$1, $$3);
   }

   @Override
   protected byj.b<ckt> ec() {
      return cku.a();
   }

   @Override
   protected void D() {
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      return cku.a(this.ec().a($$0));
   }

   @Override
   public bwl e(bxv $$0) {
      return $$0 == bxv.k ? cm.a(this.ej()) : super.e($$0);
   }

   @Override
   protected void a(arq $$0) {
      bqq $$1 = bqp.a();
      $$1.a("camelBrain");
      byj<?> $$2 = this.eb();
      ((byj<ckt>)$$2).a($$0, this);
      $$1.c();
      $$1.a("camelActivityUpdate");
      cku.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.x() && this.cn < 50 && (this.aH() || this.bk() || this.bX())) {
         this.w(false);
      }

      if (this.cn > 0) {
         this.cn--;
         if (this.cn == 0) {
            this.dU().a(null, this.du(), awn.dD, awo.g, 1.0F, 1.0F);
         }
      }

      if (this.dU().w_()) {
         this.hd();
      }

      if (this.t()) {
         this.ag();
      }

      if (this.gw() && this.bh()) {
         this.gI();
      }
   }

   private void hd() {
      if (this.cq <= 0) {
         this.cq = this.ae.a(40) + 80;
         this.bP.a(this.af);
      } else {
         this.cq--;
      }

      if (this.gx()) {
         this.bO.a();
         this.bQ.a();
         if (this.he()) {
            this.bM.b(this.af);
            this.bN.a();
         } else {
            this.bM.a();
            this.bN.b(this.af);
         }
      } else {
         this.bM.a();
         this.bN.a();
         this.bQ.a(this.x(), this.af);
         this.bO.a(this.gF() && this.gJ() >= 0L, this.af);
      }
   }

   @Override
   protected void A(float $$0) {
      float $$1;
      if (this.at() == bxv.a && !this.bQ.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F, this.n_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(ffc $$0) {
      if (this.t() && this.aH()) {
         this.i(this.dx().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(crm $$0, ffc $$1) {
      super.a($$0, $$1);
      if ($$0.bi > 0.0F && this.gw() && !this.gF()) {
         this.gH();
      }
   }

   public boolean t() {
      return this.gw() || this.gF();
   }

   @Override
   protected float c(crm $$0) {
      float $$1 = $$0.ch() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(byp.v) + $$1;
   }

   @Override
   protected ffb i(bxj $$0) {
      return this.t() ? new ffb(this.dM(), this.dK()) : super.i($$0);
   }

   @Override
   protected ffc b(crm $$0, ffc $$1) {
      return this.t() ? ffc.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.fY() && this.cn <= 0 && this.aH()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dN() {
      return true;
   }

   @Override
   protected void b(float $$0, ffc $$1) {
      double $$2 = (double)this.fg();
      this.j(this.bR().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(byp.v) * (double)this.aR()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cn = 55;
      this.w(true);
      this.ar = true;
   }

   public boolean x() {
      return this.al.a(bK);
   }

   public void w(boolean $$0) {
      this.al.a(bK, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(awn.dC);
      this.a(eft.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cn;
   }

   @Override
   protected awm u() {
      return awn.dB;
   }

   @Override
   protected awm l_() {
      return awn.dE;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.dG;
   }

   @Override
   protected void b(iv $$0, eat $$1) {
      if ($$1.a(axc.bs)) {
         this.a(awn.dL, 1.0F, 1.0F);
      } else {
         this.a(awn.dK, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean i(czn $$0) {
      return $$0.a(axk.al);
   }

   @Override
   public bug b(crm $$0, buf $$1) {
      czn $$2 = $$0.b($$1);
      if ($$0.fX() && !this.n_()) {
         this.b($$0);
         return bug.a;
      } else {
         bug $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.i($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cX().size() < 2 && !this.n_()) {
               this.a($$0);
            }

            return bug.a;
         }
      }
   }

   @Override
   public boolean a(bwi $$0, float $$1) {
      if ($$1 > 6.0F && this.gw() && !this.gF() && this.gt()) {
         this.gH();
      }

      return true;
   }

   public boolean gt() {
      return this.g(this.gw() ? bxv.a : bxv.k);
   }

   @Override
   protected boolean a(crm $$0, czn $$1) {
      if (!this.i($$1)) {
         return false;
      } else {
         boolean $$2 = this.eF() < this.eT();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gK() && this.g() == 0 && this.gA();
         if ($$3) {
            this.e($$0);
         }

         boolean $$4 = this.n_();
         if ($$4) {
            this.dU().a(ly.Q, this.d(1.0), this.dC() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dU().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aZ()) {
               awm $$5 = this.gv();
               if ($$5 != null) {
                  this.dU().a(null, this.dz(), this.dB(), this.dF(), $$5, this.dl(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
               }
            }

            this.a(eft.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gu() {
      return false;
   }

   @Override
   public boolean a(ciz $$0) {
      if ($$0 != this && $$0 instanceof ckt $$1 && this.hb() && $$1.hb()) {
         return true;
      }

      return false;
   }

   @Nullable
   public ckt b(arq $$0, bvy $$1) {
      return bwr.t.a($$0, bwq.e);
   }

   @Nullable
   @Override
   protected awm gv() {
      return awn.dF;
   }

   @Override
   protected void c(arq $$0, bux $$1, float $$2) {
      this.gI();
      super.c($$0, $$1, $$2);
   }

   @Override
   protected ffc a(bwi $$0, bwl $$1, float $$2) {
      int $$3 = Math.max(this.cX().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dP() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cX().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof ciz) {
            $$5 += 0.2F;
         }
      }

      return new ffc(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dK() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ej() {
      return this.n_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bwl $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gF();
      boolean $$9 = this.gw();
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

         float $$15 = azm.a((float)this.gJ() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)azm.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)azm.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public ffc t(float $$0) {
      bwl $$1 = this.a(this.at());
      float $$2 = this.ej();
      return new ffc(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int af() {
      return 30;
   }

   @Override
   protected boolean r(bwi $$0) {
      return this.cX().size() <= 2;
   }

   @Override
   protected void ac() {
      super.ac();
      agm.a(this);
   }

   public boolean gw() {
      return this.al.a(bL) < 0L;
   }

   public boolean gx() {
      return this.gJ() < 0L != this.gw();
   }

   public boolean gF() {
      long $$0 = this.gJ();
      return $$0 < (long)(this.gw() ? 40 : 52);
   }

   private boolean he() {
      return this.gw() && this.gJ() < 40L && this.gJ() >= 0L;
   }

   public void gG() {
      if (!this.gw()) {
         this.b(awn.dI);
         this.b(bxv.k);
         this.a(eft.u);
         this.a(-this.dU().ae());
      }
   }

   public void gH() {
      if (this.gw()) {
         this.b(awn.dJ);
         this.b(bxv.a);
         this.a(eft.u);
         this.a(this.dU().ae());
      }
   }

   public void gI() {
      this.b(bxv.a);
      this.a(eft.u);
      this.b(this.dU().ae());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.al.a(bL, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gJ() {
      return this.dU().ae() - Math.abs(this.al.a(bL));
   }

   @Override
   protected jf<awm> a(bws $$0, czn $$1, dhw $$2) {
      return (jf<awm>)($$0 == bws.h ? awn.dH : super.a($$0, $$1, $$2));
   }

   @Override
   public void a(akj<?> $$0) {
      if (!this.ak && bK.equals($$0)) {
         this.cn = this.cn == 0 ? 55 : this.cn;
      }

      super.a($$0);
   }

   @Override
   public boolean gK() {
      return true;
   }

   @Override
   public void b(crm $$0) {
      if (!this.dU().C) {
         $$0.a(this, this.bY);
      }
   }

   @Override
   protected cdd I() {
      return new ckt.a(this);
   }

   class a extends cdd {
      public a(final ckt $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!ckt.this.t()) {
            super.a();
         }
      }
   }

   class b extends cdh {
      b() {
         super(ckt.this);
      }

      @Override
      public void a() {
         if (!ckt.this.cW()) {
            super.a();
         }
      }
   }

   class c extends cdi {
      public c() {
         super(ckt.this);
      }

      @Override
      public void a() {
         if (this.k == cdi.a.b && !ckt.this.O_() && ckt.this.gw() && !ckt.this.gF() && ckt.this.gt()) {
            ckt.this.gH();
         }

         super.a();
      }
   }
}

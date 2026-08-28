import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clg extends clv {
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
   public static final akn<Boolean> bM = akr.a(clg.class, akp.k);
   public static final akn<Long> bN = akr.a(clg.class, akp.c);
   public final bwm bO = new bwm();
   public final bwm bP = new bwm();
   public final bwm bQ = new bwm();
   public final bwm bR = new bwm();
   public final bwm bS = new bwm();
   private static final bwy cr = bwy.b(bxe.u.l(), bxe.u.m() - 1.43F).b(0.845F);
   private int cs = 0;
   private int ct = 0;

   public clg(bxe<? extends clg> $$0, djz $$1) {
      super($$0, $$1);
      this.bC = new clg.c();
      this.bB = new clg.b();
      chf $$2 = (chf)this.O();
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
         this.b(byi.k);
      }

      this.a($$1);
   }

   public static bzb.a q() {
      return gV().a(bzc.s, 32.0).a(bzc.v, 0.09F).a(bzc.o, 0.42F).a(bzc.B, 1.5);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bM, false);
      $$0.a(bN, 0L);
   }

   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      clh.a(this, $$0.G_());
      this.b($$0.a().ae());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bxe<clg> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return $$1.a_($$3.e()).a(axg.cm) && a($$1, $$3);
   }

   @Override
   protected byw.b<clg> ed() {
      return clh.a();
   }

   @Override
   protected void D() {
   }

   @Override
   protected byw<?> a(Dynamic<?> $$0) {
      return clh.a(this.ed().a($$0));
   }

   @Override
   public bwy e(byi $$0) {
      return $$0 == byi.k ? cr.a(this.ek()) : super.e($$0);
   }

   @Override
   protected void a(aru $$0) {
      brd $$1 = brc.a();
      $$1.a("camelBrain");
      byw<?> $$2 = this.ec();
      ((byw<clg>)$$2).a($$0, this);
      $$1.c();
      $$1.a("camelActivityUpdate");
      clh.a(this);
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
            this.dV().a(null, this.dv(), awr.dD, aws.g, 1.0F, 1.0F);
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
      if (this.at() == byi.a && !this.bS.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F, this.n_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(ffs $$0) {
      if (this.t() && this.aH()) {
         this.i(this.dy().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(crz $$0, ffs $$1) {
      super.a($$0, $$1);
      if ($$0.bi > 0.0F && this.gx() && !this.gG()) {
         this.gI();
      }
   }

   public boolean t() {
      return this.gx() || this.gG();
   }

   @Override
   protected float c(crz $$0) {
      float $$1 = $$0.ci() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(bzc.v) + $$1;
   }

   @Override
   protected ffr i(bxw $$0) {
      return this.t() ? new ffr(this.dN(), this.dL()) : super.i($$0);
   }

   @Override
   protected ffs b(crz $$0, ffs $$1) {
      return this.t() ? ffs.c : super.b($$0, $$1);
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
   protected void b(float $$0, ffs $$1) {
      double $$2 = (double)this.fh();
      this.j(this.bS().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(bzc.v) * (double)this.aS()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.b(awr.dC);
      this.a(egg.u);
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
   protected awq u() {
      return awr.dB;
   }

   @Override
   protected awq l_() {
      return awr.dE;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.dG;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      if ($$1.a(axg.bs)) {
         this.a(awr.dL, 1.0F, 1.0F);
      } else {
         this.a(awr.dK, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.am);
   }

   @Override
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if ($$0.fY() && !this.n_()) {
         this.b($$0);
         return but.a;
      } else {
         but $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.i($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cY().size() < 2 && !this.n_()) {
               this.a($$0);
            }

            return but.a;
         }
      }
   }

   @Override
   public boolean a(bwv $$0, float $$1) {
      if ($$1 > 6.0F && this.gx() && !this.gG() && this.gu()) {
         this.gI();
      }

      return true;
   }

   public boolean gu() {
      return this.g(this.gx() ? byi.a : byi.k);
   }

   @Override
   protected boolean a(crz $$0, daa $$1) {
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
            this.dV().a(lz.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dV().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.ba()) {
               awq $$5 = this.gw();
               if ($$5 != null) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), $$5, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
               }
            }

            this.a(egg.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   public boolean a(cjm $$0) {
      if ($$0 != this && $$0 instanceof clg $$1 && this.hc() && $$1.hc()) {
         return true;
      }

      return false;
   }

   @Nullable
   public clg b(aru $$0, bwl $$1) {
      return bxe.u.a($$0, bxd.e);
   }

   @Nullable
   @Override
   protected awq gw() {
      return awr.dF;
   }

   @Override
   protected void c(aru $$0, bvk $$1, float $$2) {
      this.gJ();
      super.c($$0, $$1, $$2);
   }

   @Override
   protected ffs a(bwv $$0, bwy $$1, float $$2) {
      int $$3 = Math.max(this.cY().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dQ() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cY().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cjm) {
            $$5 += 0.2F;
         }
      }

      return new ffs(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dL() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ek() {
      return this.n_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bwy $$2, float $$3) {
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

         float $$15 = azq.a((float)this.gK() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)azq.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)azq.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public ffs t(float $$0) {
      bwy $$1 = this.a(this.at());
      float $$2 = this.ek();
      return new ffs(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int af() {
      return 30;
   }

   @Override
   protected boolean r(bwv $$0) {
      return this.cY().size() <= 2;
   }

   @Override
   protected void ac() {
      super.ac();
      agq.a(this);
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
         this.b(awr.dI);
         this.b(byi.k);
         this.a(egg.u);
         this.a(-this.dV().ae());
      }
   }

   public void gI() {
      if (this.gx()) {
         this.b(awr.dJ);
         this.b(byi.a);
         this.a(egg.u);
         this.a(this.dV().ae());
      }
   }

   public void gJ() {
      this.b(byi.a);
      this.a(egg.u);
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
   protected jg<awq> a(bxf $$0, daa $$1, dij $$2) {
      return (jg<awq>)($$0 == bxf.h ? awr.dH : super.a($$0, $$1, $$2));
   }

   @Override
   public void a(akn<?> $$0) {
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
   public void b(crz $$0) {
      if (!this.dV().C) {
         $$0.a(this, this.ca);
      }
   }

   @Override
   protected cdq I() {
      return new clg.a(this);
   }

   class a extends cdq {
      public a(final clg $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!clg.this.t()) {
            super.a();
         }
      }
   }

   class b extends cdu {
      b() {
         super(clg.this);
      }

      @Override
      public void a() {
         if (!clg.this.cX()) {
            super.a();
         }
      }
   }

   class c extends cdv {
      public c() {
         super(clg.this);
      }

      @Override
      public void a() {
         if (this.k == cdv.a.b && !clg.this.S_() && clg.this.gx() && !clg.this.gG() && clg.this.gu()) {
            clg.this.gI();
         }

         super.a();
      }
   }
}

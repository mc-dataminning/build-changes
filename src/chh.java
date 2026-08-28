import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class chh extends cfd implements bqn, btg, btv, bty, bud {
   public static final int cj = 400;
   public static final int ck = 499;
   public static final int cl = 500;
   public static final double cm = 0.15;
   private static final float bY = (float)b(() -> 0.0);
   private static final float bZ = (float)b(() -> 1.0);
   private static final float cb = (float)a(() -> 0.0);
   private static final float cc = (float)a(() -> 1.0);
   private static final float cd = a($$0 -> 0);
   private static final float ce = a($$0 -> $$0 - 1);
   private static final float cf = 0.25F;
   private static final float cg = 0.5F;
   private static final Predicate<btn> ch = $$0 -> $$0 instanceof chh && ((chh)$$0).gK();
   private static final cee ci = cee.b().a(16.0).d().a(ch);
   private static final akj<Byte> cz = akn.a(chh.class, akl.a);
   private static final int cA = 2;
   private static final int cB = 4;
   private static final int cC = 8;
   private static final int cD = 16;
   private static final int cE = 32;
   private static final int cF = 64;
   public static final int cn = 0;
   public static final int co = 1;
   private int cG;
   private int cH;
   private int cI;
   public int cp;
   public int cq;
   protected boolean cr;
   protected brb cs;
   protected int ct;
   protected float cu;
   protected boolean cv;
   private float cJ;
   private float cK;
   private float cL;
   private float cM;
   private float cN;
   private float cO;
   protected boolean cw = true;
   protected int cx;
   @Nullable
   private UUID cP;
   private final bql cQ = new exa() {
      @Override
      public cun f() {
         return chh.this.fR();
      }

      @Override
      public void b(cun $$0) {
         chh.this.m($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cmv $$0) {
         return $$0.dc() == chh.this || $$0.b(chh.this, 4.0);
      }
   };

   protected chh(bsy<? extends chh> $$0, dbw $$1) {
      super($$0, $$1);
      this.gM();
   }

   @Override
   protected void z() {
      this.bS.a(1, new cbe(this, 1.2));
      this.bS.a(1, new cbp(this, 1.2));
      this.bS.a(2, new bzx(this, 1.0, chh.class));
      this.bS.a(4, new cak(this, 1.0));
      this.bS.a(6, new cby(this, 0.7));
      this.bS.a(7, new cat(this, cmv.class, 6.0F));
      this.bS.a(8, new cbg(this));
      if (this.gw()) {
         this.bS.a(9, new cbh(this));
      }

      this.gG();
   }

   protected void gG() {
      this.bS.a(0, new caf(this));
      this.bS.a(3, new cbt(this, 1.25, $$0 -> $$0.a(awx.ag), false));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cz, (byte)0);
   }

   protected boolean u(int $$0) {
      return (this.ao.a(cz) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.ao.a(cz);
      if ($$1) {
         this.ao.a(cz, (byte)($$2 | $$0));
      } else {
         this.ao.a(cz, (byte)($$2 & ~$$0));
      }
   }

   public boolean gF() {
      return this.u(2);
   }

   @Nullable
   @Override
   public UUID W_() {
      return this.cP;
   }

   public void b(@Nullable UUID $$0) {
      this.cP = $$0;
   }

   public boolean gH() {
      return this.cr;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.cr = $$0;
   }

   @Override
   protected void F(float $$0) {
      if ($$0 > 6.0F && this.gI()) {
         this.A(false);
      }
   }

   public boolean gI() {
      return this.u(16);
   }

   public boolean gJ() {
      return this.u(32);
   }

   public boolean gK() {
      return this.u(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean f() {
      return this.bD() && !this.p_() && this.gF();
   }

   @Override
   public void a(@Nullable awa $$0) {
      this.cs.a(0, new cun(cuq.nL));
   }

   public void b(cmv $$0, cun $$1) {
      if (this.l($$1)) {
         this.m($$1.c(1));
         $$1.a(1, $$0);
      }
   }

   @Override
   public boolean i() {
      return this.u(4);
   }

   public int gL() {
      return this.ct;
   }

   public void v(int $$0) {
      this.ct = $$0;
   }

   public int w(int $$0) {
      int $$1 = ayx.a(this.gL() + $$0, 0, this.gQ());
      this.v($$1);
      return $$1;
   }

   @Override
   public boolean bA() {
      return !this.bS();
   }

   private void s() {
      this.gq();
      if (!this.aW()) {
         avy $$0 = this.gx();
         if ($$0 != null) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), $$0, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, brl $$2) {
      if ($$0 > 1.0F) {
         this.a(avz.mP, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bS()) {
            for (bss $$4 : this.cW()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eN();
         return true;
      }
   }

   protected int ab_() {
      return 1;
   }

   protected void gM() {
      brb $$0 = this.cs;
      this.cs = new brb(this.ab_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cs.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cun $$3 = $$0.a($$2);
            if (!$$3.e()) {
               this.cs.a($$2, $$3.s());
            }
         }
      }

      this.cs.a(this);
      this.gN();
   }

   protected void gN() {
      if (!this.dP().B) {
         this.d(4, !this.cs.a(0).e());
      }
   }

   @Override
   public void a(bql $$0) {
      boolean $$1 = this.i();
      this.gN();
      if (this.ai > 20 && !$$1 && this.i()) {
         this.a(this.Y_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(brl $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.ah.a(3) == 0) {
         this.gU();
      }

      return $$2;
   }

   protected boolean gw() {
      return true;
   }

   @Nullable
   protected avy gx() {
      return null;
   }

   @Nullable
   protected avy gO() {
      return null;
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      if (!$$1.k()) {
         dsa $$2 = this.dP().a_($$0.c());
         dmk $$3 = $$1.w();
         if ($$2.a(dez.dN)) {
            $$3 = $$2.w();
         }

         if (this.bS() && this.cw) {
            this.cx++;
            if (this.cx > 5 && this.cx % 3 == 0) {
               this.a($$3);
            } else if (this.cx <= 5) {
               this.a(avz.mS, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(avz.mS, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(avz.mR, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dmk $$0) {
      return $$0 == dmk.b || $$0 == dmk.aT || $$0 == dmk.B || $$0 == dmk.aU || $$0 == dmk.aS;
   }

   protected void a(dmk $$0) {
      this.a(avz.mM, $$0.a() * 0.15F, $$0.b());
   }

   public static buu.a gP() {
      return btp.A().a(buv.m, 0.7).a(buv.q, 53.0).a(buv.r, 0.225F).a(buv.v, 1.0).a(buv.s, 6.0).a(buv.i, 0.5);
   }

   @Override
   public int fQ() {
      return 6;
   }

   public int gQ() {
      return 100;
   }

   @Override
   protected float fe() {
      return 0.8F;
   }

   @Override
   public int P() {
      return 400;
   }

   @Override
   public void b(cmv $$0) {
      if (!this.dP().B && (!this.bS() || this.x($$0)) && this.gF()) {
         $$0.a(this, this.cs);
      }
   }

   public bqs c(cmv $$0, cun $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      if (this.dP().B) {
         return bqs.c;
      } else {
         return $$2 ? bqs.a : bqs.e;
      }
   }

   protected boolean a(cmv $$0, cun $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cuq.pw)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cuq.rA)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dez.ij.r())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cuq.ot)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cuq.uk)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dP().B && this.gF() && this.g() == 0 && !this.gu()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(cuq.qa) || $$1.a(cuq.qb)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dP().B && this.gF() && this.g() == 0 && !this.gu()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.eA() < this.eR() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.p_() && $$4 > 0) {
         this.dP().a(li.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dP().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gF()) && this.gL() < this.gQ() && !this.dP().B) {
         this.w($$5);
         $$2 = true;
      }

      if ($$2) {
         this.s();
         this.a(dwt.m);
      }

      return $$2;
   }

   protected void f(cmv $$0) {
      this.A(false);
      this.B(false);
      if (!this.dP().B) {
         $$0.r(this.dF());
         $$0.s(this.dH());
         $$0.n(this);
      }
   }

   @Override
   public boolean fg() {
      return super.fg() && this.bS() && this.i() || this.gI() || this.gJ();
   }

   @Override
   public boolean o(cun $$0) {
      return $$0.a(awx.af);
   }

   private void u() {
      this.cp = 1;
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.cs != null) {
         for (int $$0 = 0; $$0 < this.cs.b(); $$0++) {
            cun $$1 = this.cs.a($$0);
            if (!$$1.e() && !czz.g($$1)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void n_() {
      if (this.ah.a(200) == 0) {
         this.u();
      }

      super.n_();
      if (!this.dP().B && this.bD()) {
         if (this.ah.a(900) == 0 && this.aQ == 0) {
            this.c(1.0F);
         }

         if (this.gS()) {
            if (!this.gI() && !this.bS() && this.ah.a(300) == 0 && this.dP().a_(this.dp().d()).a(dez.i)) {
               this.A(true);
            }

            if (this.gI() && ++this.cG > 50) {
               this.cG = 0;
               this.A(false);
            }
         }

         this.gR();
      }
   }

   protected void gR() {
      if (this.gK() && this.p_() && !this.gI()) {
         btn $$0 = this.dP().a(chh.class, ci, this, this.du(), this.dw(), this.dA(), this.cK().g(16.0));
         if ($$0 != null && this.g((bss)$$0) > 4.0) {
            this.bR.a($$0, 0);
         }
      }
   }

   public boolean gS() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cH > 0 && ++this.cH > 30) {
         this.cH = 0;
         this.d(64, false);
      }

      if (this.db() && this.cI > 0 && ++this.cI > 20) {
         this.cI = 0;
         this.B(false);
      }

      if (this.cp > 0 && ++this.cp > 8) {
         this.cp = 0;
      }

      if (this.cq > 0) {
         this.cq++;
         if (this.cq > 300) {
            this.cq = 0;
         }
      }

      this.cK = this.cJ;
      if (this.gI()) {
         this.cJ = this.cJ + (1.0F - this.cJ) * 0.4F + 0.05F;
         if (this.cJ > 1.0F) {
            this.cJ = 1.0F;
         }
      } else {
         this.cJ = this.cJ + ((0.0F - this.cJ) * 0.4F - 0.05F);
         if (this.cJ < 0.0F) {
            this.cJ = 0.0F;
         }
      }

      this.cM = this.cL;
      if (this.gJ()) {
         this.cJ = 0.0F;
         this.cK = this.cJ;
         this.cL = this.cL + (1.0F - this.cL) * 0.4F + 0.05F;
         if (this.cL > 1.0F) {
            this.cL = 1.0F;
         }
      } else {
         this.cv = false;
         this.cL = this.cL + ((0.8F * this.cL * this.cL * this.cL - this.cL) * 0.6F - 0.05F);
         if (this.cL < 0.0F) {
            this.cL = 0.0F;
         }
      }

      this.cO = this.cN;
      if (this.u(64)) {
         this.cN = this.cN + (1.0F - this.cN) * 0.7F + 0.05F;
         if (this.cN > 1.0F) {
            this.cN = 1.0F;
         }
      } else {
         this.cN = this.cN + ((0.0F - this.cN) * 0.7F - 0.05F);
         if (this.cN < 0.0F) {
            this.cN = 0.0F;
         }
      }
   }

   @Override
   public bqs b(cmv $$0, bqr $$1) {
      if (this.bS() || this.p_()) {
         return super.b($$0, $$1);
      } else if (this.gF() && $$0.fR()) {
         this.b($$0);
         return bqs.a(this.dP().B);
      } else {
         cun $$2 = $$0.b($$1);
         if (!$$2.e()) {
            bqs $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.fS() && this.l($$2) && !this.fT()) {
               this.b($$0, $$2);
               return bqs.a(this.dP().B);
            }
         }

         this.f($$0);
         return bqs.a(this.dP().B);
      }
   }

   private void gq() {
      if (!this.dP().B) {
         this.cH = 1;
         this.d(64, true);
      }
   }

   public void A(boolean $$0) {
      this.d(16, $$0);
   }

   public void B(boolean $$0) {
      if ($$0) {
         this.A(false);
      }

      this.d(32, $$0);
   }

   @Nullable
   public avy gT() {
      return this.v();
   }

   public void gU() {
      if (this.gw() && this.db()) {
         this.cI = 1;
         this.B(true);
      }
   }

   public void gV() {
      if (!this.gJ()) {
         this.gU();
         this.b(this.gO());
      }
   }

   public boolean h(cmv $$0) {
      this.b($$0.cz());
      this.x(true);
      if ($$0 instanceof arf) {
         am.y.a((arf)$$0, this);
      }

      this.dP().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cmv $$0, evp $$1) {
      super.a($$0, $$1);
      evo $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.O = this.aY = this.ba = this.dF();
      if (this.da()) {
         if ($$1.e <= 0.0) {
            this.cx = 0;
         }

         if (this.aE()) {
            this.y(false);
            if (this.cu > 0.0F && !this.gH()) {
               this.b(this.cu, $$1);
            }

            this.cu = 0.0F;
         }
      }
   }

   protected evo j(btn $$0) {
      return new evo($$0.dH() * 0.5F, $$0.dF());
   }

   @Override
   protected evp b(cmv $$0, evp $$1) {
      if (this.aE() && this.cu == 0.0F && this.gJ() && !this.cv) {
         return evp.b;
      } else {
         float $$2 = $$0.bo * 0.5F;
         float $$3 = $$0.bq;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new evp((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cmv $$0) {
      return (float)this.g(buv.r);
   }

   protected void b(float $$0, evp $$1) {
      double $$2 = (double)this.w($$0);
      evp $$3 = this.ds();
      this.o($$3.c, $$2, $$3.e);
      this.y(true);
      this.av = true;
      if ($$1.e > 0.0) {
         float $$4 = ayx.a(this.dF() * (float) (Math.PI / 180.0));
         float $$5 = ayx.b(this.dF() * (float) (Math.PI / 180.0));
         this.h(this.ds().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gW() {
      this.a(avz.mO, 0.4F, 1.0F);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gI());
      $$0.a("Bred", this.gK());
      $$0.a("Temper", this.gL());
      $$0.a("Tame", this.gF());
      if (this.W_() != null) {
         $$0.a("Owner", this.W_());
      }

      if (!this.cs.a(0).e()) {
         $$0.a("SaddleItem", this.cs.a(0).a(this.dR()));
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.A($$0.q("EatingHaystack"));
      this.z($$0.q("Bred"));
      this.v($$0.h("Temper"));
      this.x($$0.q("Tame"));
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = avb.a(this.cO(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cun $$4 = cun.a(this.dR(), (vo)$$0.p("SaddleItem")).orElse(cun.l);
         if ($$4.a(cuq.nL)) {
            this.cs.a(0, $$4);
         }
      }

      this.gN();
   }

   @Override
   public boolean a(cfd $$0) {
      return false;
   }

   protected boolean gX() {
      return !this.bS() && !this.bR() && this.gF() && !this.p_() && this.eA() >= this.eR() && this.gu();
   }

   @Nullable
   @Override
   public bsm a(are $$0, bsm $$1) {
      return null;
   }

   protected void a(bsm $$0, chh $$1) {
      this.a($$0, $$1, buv.q, (double)cd, (double)ce);
      this.a($$0, $$1, buv.m, (double)cb, (double)cc);
      this.a($$0, $$1, buv.r, (double)bY, (double)bZ);
   }

   private void a(bsm $$0, chh $$1, ji<buq> $$2, double $$3, double $$4) {
      double $$5 = a(this.h($$2), $$0.h($$2), $$3, $$4, this.ah);
      $$1.f($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, azf $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = ayx.a($$0, $$2, $$3);
         $$1 = ayx.a($$1, $$2, $$3);
         double $$5 = 0.15 * ($$3 - $$2);
         double $$6 = Math.abs($$0 - $$1) + $$5 * 2.0;
         double $$7 = ($$0 + $$1) / 2.0;
         double $$8 = ($$4.j() + $$4.j() + $$4.j()) / 3.0 - 0.5;
         double $$9 = $$7 + $$6 * $$8;
         if ($$9 > $$3) {
            double $$10 = $$9 - $$3;
            return $$3 - $$10;
         } else if ($$9 < $$2) {
            double $$11 = $$2 - $$9;
            return $$2 + $$11;
         } else {
            return $$9;
         }
      }
   }

   public float G(float $$0) {
      return ayx.i($$0, this.cK, this.cJ);
   }

   public float H(float $$0) {
      return ayx.i($$0, this.cM, this.cL);
   }

   public float I(float $$0) {
      return ayx.i($$0, this.cO, this.cN);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cv = true;
            this.gU();
         }

         if ($$0 >= 90) {
            this.cu = 1.0F;
         } else {
            this.cu = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.i();
   }

   @Override
   public void c(int $$0) {
      this.cv = true;
      this.gU();
      this.gW();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      lg $$1 = $$0 ? li.Q : li.ae;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         double $$5 = this.ah.k() * 0.02;
         this.dP().a($$1, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 7) {
         this.C(true);
      } else if ($$0 == 6) {
         this.C(false);
      } else {
         super.b($$0);
      }
   }

   @Override
   protected void a(bss $$0, bss.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof btn) {
         ((btn)$$0).aY = this.aY;
      }
   }

   protected static float a(IntUnaryOperator $$0) {
      return 15.0F + (float)$$0.applyAsInt(8) + (float)$$0.applyAsInt(9);
   }

   protected static double a(DoubleSupplier $$0) {
      return 0.4F + $$0.getAsDouble() * 0.2 + $$0.getAsDouble() * 0.2 + $$0.getAsDouble() * 0.2;
   }

   protected static double b(DoubleSupplier $$0) {
      return (0.45F + $$0.getAsDouble() * 0.3 + $$0.getAsDouble() * 0.3 + $$0.getAsDouble() * 0.3) * 0.25;
   }

   @Override
   public boolean q_() {
      return false;
   }

   @Override
   public buf a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new buf() {
            @Override
            public cun a() {
               return chh.this.cs.a(0);
            }

            @Override
            public boolean a(cun $$0) {
               if (!$$0.e() && !$$0.a(cuq.nL)) {
                  return false;
               } else {
                  chh.this.cs.a(0, $$0);
                  chh.this.gN();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.cs.b() ? buf.a(this.cs, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public btn cQ() {
      if (this.i()) {
         bss var2 = this.cT();
         if (var2 instanceof cmv) {
            return (cmv)var2;
         }
      }

      return super.cQ();
   }

   @Nullable
   private evp a(evp $$0, btn $$1) {
      double $$2 = this.du() + $$0.c;
      double $$3 = this.cK().b;
      double $$4 = this.dA() + $$0.e;
      iz.a $$5 = new iz.a();
      UnmodifiableIterator var10 = $$1.fI().iterator();

      while (var10.hasNext()) {
         btz $$6 = (btz)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cK().e + 0.75;

         do {
            double $$8 = this.dP().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cow.a($$8)) {
               evk $$9 = $$1.f($$6);
               evp $$10 = new evp($$2, (double)$$5.v() + $$8, $$4);
               if (cow.a(this.dP(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(je.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public evp b(btn $$0) {
      evp $$1 = a((double)this.dj(), (double)$$0.dj(), this.dF() + ($$0.fu() == bth.b ? 90.0F : -90.0F));
      evp $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         evp $$3 = a((double)this.dj(), (double)$$0.dj(), this.dF() + ($$0.fu() == bth.a ? 90.0F : -90.0F));
         evp $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dn();
      }
   }

   protected void a(azf $$0) {
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      if ($$3 == null) {
         $$3 = new bsm.a(0.2F);
      }

      this.a($$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bql $$0) {
      return this.cs != $$0;
   }

   public int gY() {
      return this.P();
   }

   @Override
   protected evp a(bss $$0, bsv $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new evp(0.0, 0.15 * (double)this.cM * (double)$$2, -0.7 * (double)this.cM * (double)$$2).b(-this.dF() * (float) (Math.PI / 180.0)));
   }

   public final bql gZ() {
      return this.cQ;
   }
}

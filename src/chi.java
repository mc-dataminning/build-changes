import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class chi extends cfe implements bqo, bth, btw, btz, bue {
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
   private static final Predicate<bto> ch = $$0 -> $$0 instanceof chi && ((chi)$$0).gK();
   private static final cef ci = cef.b().a(16.0).d().a(ch);
   private static final akj<Byte> cz = akn.a(chi.class, akl.a);
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
   protected brc cs;
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
   private final bqm cQ = new exb() {
      @Override
      public cuo f() {
         return chi.this.fR();
      }

      @Override
      public void b(cuo $$0) {
         chi.this.m($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cmw $$0) {
         return $$0.dc() == chi.this || $$0.b(chi.this, 4.0);
      }
   };

   protected chi(bsz<? extends chi> $$0, dbx $$1) {
      super($$0, $$1);
      this.gM();
   }

   @Override
   protected void z() {
      this.bS.a(1, new cbf(this, 1.2));
      this.bS.a(1, new cbq(this, 1.2));
      this.bS.a(2, new bzy(this, 1.0, chi.class));
      this.bS.a(4, new cal(this, 1.0));
      this.bS.a(6, new cbz(this, 0.7));
      this.bS.a(7, new cau(this, cmw.class, 6.0F));
      this.bS.a(8, new cbh(this));
      if (this.gw()) {
         this.bS.a(9, new cbi(this));
      }

      this.gG();
   }

   protected void gG() {
      this.bS.a(0, new cag(this));
      this.bS.a(3, new cbu(this, 1.25, $$0 -> $$0.a(awx.ag), false));
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
      this.cs.a(0, new cuo(cur.nL));
   }

   public void b(cmw $$0, cuo $$1) {
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
      int $$1 = ayy.a(this.gL() + $$0, 0, this.gQ());
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
   public boolean a(float $$0, float $$1, brm $$2) {
      if ($$0 > 1.0F) {
         this.a(avz.mP, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bS()) {
            for (bst $$4 : this.cW()) {
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
      brc $$0 = this.cs;
      this.cs = new brc(this.ab_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cs.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cuo $$3 = $$0.a($$2);
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
   public void a(bqm $$0) {
      boolean $$1 = this.i();
      this.gN();
      if (this.ai > 20 && !$$1 && this.i()) {
         this.a(this.Y_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(brm $$0, float $$1) {
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
   protected void b(iz $$0, dsb $$1) {
      if (!$$1.k()) {
         dsb $$2 = this.dP().a_($$0.c());
         dml $$3 = $$1.w();
         if ($$2.a(dfa.dN)) {
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

   private boolean b(dml $$0) {
      return $$0 == dml.b || $$0 == dml.aT || $$0 == dml.B || $$0 == dml.aU || $$0 == dml.aS;
   }

   protected void a(dml $$0) {
      this.a(avz.mM, $$0.a() * 0.15F, $$0.b());
   }

   public static buv.a gP() {
      return btq.A().a(buw.m, 0.7).a(buw.q, 53.0).a(buw.r, 0.225F).a(buw.v, 1.0).a(buw.s, 6.0).a(buw.i, 0.5);
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
   public void b(cmw $$0) {
      if (!this.dP().B && (!this.bS() || this.x($$0)) && this.gF()) {
         $$0.a(this, this.cs);
      }
   }

   public bqt c(cmw $$0, cuo $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      if (this.dP().B) {
         return bqt.c;
      } else {
         return $$2 ? bqt.a : bqt.e;
      }
   }

   protected boolean a(cmw $$0, cuo $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cur.pw)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cur.rA)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dfa.ij.r())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cur.ot)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cur.uk)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dP().B && this.gF() && this.g() == 0 && !this.gu()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(cur.qa) || $$1.a(cur.qb)) {
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
         this.a(dwu.m);
      }

      return $$2;
   }

   protected void f(cmw $$0) {
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
   public boolean o(cuo $$0) {
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
            cuo $$1 = this.cs.a($$0);
            if (!$$1.e() && !daa.g($$1)) {
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
            if (!this.gI() && !this.bS() && this.ah.a(300) == 0 && this.dP().a_(this.dp().d()).a(dfa.i)) {
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
         bto $$0 = this.dP().a(chi.class, ci, this, this.du(), this.dw(), this.dA(), this.cK().g(16.0));
         if ($$0 != null && this.g((bst)$$0) > 4.0) {
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
   public bqt b(cmw $$0, bqs $$1) {
      if (this.bS() || this.p_()) {
         return super.b($$0, $$1);
      } else if (this.gF() && $$0.fR()) {
         this.b($$0);
         return bqt.a(this.dP().B);
      } else {
         cuo $$2 = $$0.b($$1);
         if (!$$2.e()) {
            bqt $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.fS() && this.l($$2) && !this.fT()) {
               this.b($$0, $$2);
               return bqt.a(this.dP().B);
            }
         }

         this.f($$0);
         return bqt.a(this.dP().B);
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

   public boolean h(cmw $$0) {
      this.b($$0.cz());
      this.x(true);
      if ($$0 instanceof arf) {
         am.y.a((arf)$$0, this);
      }

      this.dP().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cmw $$0, evq $$1) {
      super.a($$0, $$1);
      evp $$2 = this.j($$0);
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

   protected evp j(bto $$0) {
      return new evp($$0.dH() * 0.5F, $$0.dF());
   }

   @Override
   protected evq b(cmw $$0, evq $$1) {
      if (this.aE() && this.cu == 0.0F && this.gJ() && !this.cv) {
         return evq.b;
      } else {
         float $$2 = $$0.bo * 0.5F;
         float $$3 = $$0.bq;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new evq((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cmw $$0) {
      return (float)this.g(buw.r);
   }

   protected void b(float $$0, evq $$1) {
      double $$2 = (double)this.w($$0);
      evq $$3 = this.ds();
      this.o($$3.c, $$2, $$3.e);
      this.y(true);
      this.av = true;
      if ($$1.e > 0.0) {
         float $$4 = ayy.a(this.dF() * (float) (Math.PI / 180.0));
         float $$5 = ayy.b(this.dF() * (float) (Math.PI / 180.0));
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
         cuo $$4 = cuo.a(this.dR(), (vo)$$0.p("SaddleItem")).orElse(cuo.l);
         if ($$4.a(cur.nL)) {
            this.cs.a(0, $$4);
         }
      }

      this.gN();
   }

   @Override
   public boolean a(cfe $$0) {
      return false;
   }

   protected boolean gX() {
      return !this.bS() && !this.bR() && this.gF() && !this.p_() && this.eA() >= this.eR() && this.gu();
   }

   @Nullable
   @Override
   public bsn a(are $$0, bsn $$1) {
      return null;
   }

   protected void a(bsn $$0, chi $$1) {
      this.a($$0, $$1, buw.q, (double)cd, (double)ce);
      this.a($$0, $$1, buw.m, (double)cb, (double)cc);
      this.a($$0, $$1, buw.r, (double)bY, (double)bZ);
   }

   private void a(bsn $$0, chi $$1, ji<bur> $$2, double $$3, double $$4) {
      double $$5 = a(this.h($$2), $$0.h($$2), $$3, $$4, this.ah);
      $$1.f($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, azg $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = ayy.a($$0, $$2, $$3);
         $$1 = ayy.a($$1, $$2, $$3);
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
      return ayy.i($$0, this.cK, this.cJ);
   }

   public float H(float $$0) {
      return ayy.i($$0, this.cM, this.cL);
   }

   public float I(float $$0) {
      return ayy.i($$0, this.cO, this.cN);
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
   protected void a(bst $$0, bst.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bto) {
         ((bto)$$0).aY = this.aY;
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
   public bug a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new bug() {
            @Override
            public cuo a() {
               return chi.this.cs.a(0);
            }

            @Override
            public boolean a(cuo $$0) {
               if (!$$0.e() && !$$0.a(cur.nL)) {
                  return false;
               } else {
                  chi.this.cs.a(0, $$0);
                  chi.this.gN();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.cs.b() ? bug.a(this.cs, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public bto cQ() {
      if (this.i()) {
         bst var2 = this.cT();
         if (var2 instanceof cmw) {
            return (cmw)var2;
         }
      }

      return super.cQ();
   }

   @Nullable
   private evq a(evq $$0, bto $$1) {
      double $$2 = this.du() + $$0.c;
      double $$3 = this.cK().b;
      double $$4 = this.dA() + $$0.e;
      iz.a $$5 = new iz.a();
      UnmodifiableIterator var10 = $$1.fI().iterator();

      while (var10.hasNext()) {
         bua $$6 = (bua)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cK().e + 0.75;

         do {
            double $$8 = this.dP().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cox.a($$8)) {
               evl $$9 = $$1.f($$6);
               evq $$10 = new evq($$2, (double)$$5.v() + $$8, $$4);
               if (cox.a(this.dP(), $$1, $$9.c($$10))) {
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
   public evq b(bto $$0) {
      evq $$1 = a((double)this.dj(), (double)$$0.dj(), this.dF() + ($$0.fu() == bti.b ? 90.0F : -90.0F));
      evq $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         evq $$3 = a((double)this.dj(), (double)$$0.dj(), this.dF() + ($$0.fu() == bti.a ? 90.0F : -90.0F));
         evq $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dn();
      }
   }

   protected void a(azg $$0) {
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      if ($$3 == null) {
         $$3 = new bsn.a(0.2F);
      }

      this.a($$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bqm $$0) {
      return this.cs != $$0;
   }

   public int gY() {
      return this.P();
   }

   @Override
   protected evq a(bst $$0, bsw $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new evq(0.0, 0.15 * (double)this.cM * (double)$$2, -0.7 * (double)this.cM * (double)$$2).b(-this.dF() * (float) (Math.PI / 180.0)));
   }

   public final bqm gZ() {
      return this.cQ;
   }
}

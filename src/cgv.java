import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cgv extends cer implements bqb, bsu, btj, btm, btr {
   public static final int cl = 400;
   public static final int cm = 499;
   public static final int cn = 500;
   public static final double co = 0.15;
   private static final float ca = (float)b(() -> 0.0);
   private static final float cb = (float)b(() -> 1.0);
   private static final float cd = (float)a(() -> 0.0);
   private static final float ce = (float)a(() -> 1.0);
   private static final float cf = a($$0 -> 0);
   private static final float cg = a($$0 -> $$0 - 1);
   private static final float ch = 0.25F;
   private static final float ci = 0.5F;
   private static final Predicate<btb> cj = $$0 -> $$0 instanceof cgv && ((cgv)$$0).gI();
   private static final cds ck = cds.b().a(16.0).d().a(cj);
   private static final ajp<Byte> cB = ajt.a(cgv.class, ajr.a);
   private static final int cC = 2;
   private static final int cD = 4;
   private static final int cE = 8;
   private static final int cF = 16;
   private static final int cG = 32;
   private static final int cH = 64;
   public static final int cp = 0;
   public static final int cq = 1;
   private int cI;
   private int cJ;
   private int cK;
   public int cr;
   public int cs;
   protected boolean ct;
   protected bqp cu;
   protected int cv;
   protected float cw;
   protected boolean cx;
   private float cL;
   private float cM;
   private float cN;
   private float cO;
   private float cP;
   private float cQ;
   protected boolean cy = true;
   protected int cz;
   @Nullable
   private UUID cR;
   private final bpz cS = new exq() {
      @Override
      public cuc f() {
         return cgv.this.fO();
      }

      @Override
      public void b(cuc $$0) {
         cgv.this.m($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cmk $$0) {
         return $$0.dd() == cgv.this || $$0.b(cgv.this, 4.0);
      }
   };

   protected cgv(bsm<? extends cgv> $$0, dcf $$1) {
      super($$0, $$1);
      this.gK();
   }

   @Override
   protected void z() {
      this.bU.a(1, new cas(this, 1.2));
      this.bU.a(1, new cbd(this, 1.2));
      this.bU.a(2, new bzl(this, 1.0, cgv.class));
      this.bU.a(4, new bzy(this, 1.0));
      this.bU.a(6, new cbm(this, 0.7));
      this.bU.a(7, new cah(this, cmk.class, 6.0F));
      this.bU.a(8, new cau(this));
      if (this.gu()) {
         this.bU.a(9, new cav(this));
      }

      this.gE();
   }

   protected void gE() {
      this.bU.a(0, new bzt(this));
      this.bU.a(3, new cbh(this, 1.25, $$0 -> $$0.a(awf.ag), false));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cB, (byte)0);
   }

   protected boolean t(int $$0) {
      return (this.ao.a(cB) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.ao.a(cB);
      if ($$1) {
         this.ao.a(cB, (byte)($$2 | $$0));
      } else {
         this.ao.a(cB, (byte)($$2 & ~$$0));
      }
   }

   public boolean gD() {
      return this.t(2);
   }

   @Nullable
   @Override
   public UUID W_() {
      return this.cR;
   }

   public void b(@Nullable UUID $$0) {
      this.cR = $$0;
   }

   public boolean gF() {
      return this.ct;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.ct = $$0;
   }

   @Override
   protected void G(float $$0) {
      if ($$0 > 6.0F && this.gG()) {
         this.A(false);
      }
   }

   public boolean gG() {
      return this.t(16);
   }

   public boolean gH() {
      return this.t(32);
   }

   public boolean gI() {
      return this.t(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean f() {
      return this.bE() && !this.p_() && this.gD();
   }

   @Override
   public void a(@Nullable avi $$0) {
      this.cu.a(0, new cuc(cuf.nL));
   }

   public void b(cmk $$0, cuc $$1) {
      if (this.l($$1)) {
         this.m($$1.c(1));
         $$1.a(1, $$0);
      }
   }

   @Override
   public boolean i() {
      return this.t(4);
   }

   public int gJ() {
      return this.cv;
   }

   public void u(int $$0) {
      this.cv = $$0;
   }

   public int v(int $$0) {
      int $$1 = ayg.a(this.gJ() + $$0, 0, this.gO());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bB() {
      return !this.bT();
   }

   private void s() {
      this.go();
      if (!this.aX()) {
         avg $$0 = this.gv();
         if ($$0 != null) {
            this.dQ().a(null, this.dv(), this.dx(), this.dB(), $$0, this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bqz $$2) {
      if ($$0 > 1.0F) {
         this.a(avh.mP, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bT()) {
            for (bsg $$4 : this.cX()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eK();
         return true;
      }
   }

   protected int ab_() {
      return 1;
   }

   protected void gK() {
      bqp $$0 = this.cu;
      this.cu = new bqp(this.ab_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cu.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cuc $$3 = $$0.a($$2);
            if (!$$3.e()) {
               this.cu.a($$2, $$3.s());
            }
         }
      }

      this.cu.a(this);
      this.gL();
   }

   protected void gL() {
      if (!this.dQ().B) {
         this.d(4, !this.cu.a(0).e());
      }
   }

   @Override
   public void a(bpz $$0) {
      boolean $$1 = this.i();
      this.gL();
      if (this.ai > 20 && !$$1 && this.i()) {
         this.a(this.Y_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.ah.a(3) == 0) {
         this.gS();
      }

      return $$2;
   }

   protected boolean gu() {
      return true;
   }

   @Nullable
   protected avg gv() {
      return null;
   }

   @Nullable
   protected avg gM() {
      return null;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      if (!$$1.k()) {
         dsk $$2 = this.dQ().a_($$0.c());
         dmu $$3 = $$1.w();
         if ($$2.a(dfj.dN)) {
            $$3 = $$2.w();
         }

         if (this.bT() && this.cy) {
            this.cz++;
            if (this.cz > 5 && this.cz % 3 == 0) {
               this.a($$3);
            } else if (this.cz <= 5) {
               this.a(avh.mS, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(avh.mS, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(avh.mR, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dmu $$0) {
      return $$0 == dmu.b || $$0 == dmu.aT || $$0 == dmu.B || $$0 == dmu.aU || $$0 == dmu.aS;
   }

   protected void a(dmu $$0) {
      this.a(avh.mM, $$0.a() * 0.15F, $$0.b());
   }

   public static bui.a gN() {
      return btd.A().a(buj.o, 0.7).a(buj.s, 53.0).a(buj.v, 0.225F).a(buj.B, 1.0).a(buj.x, 6.0).a(buj.k, 0.5);
   }

   @Override
   public int fN() {
      return 6;
   }

   public int gO() {
      return 100;
   }

   @Override
   protected float fb() {
      return 0.8F;
   }

   @Override
   public int P() {
      return 400;
   }

   @Override
   public void b(cmk $$0) {
      if (!this.dQ().B && (!this.bT() || this.x($$0)) && this.gD()) {
         $$0.a(this, this.cu);
      }
   }

   public bqg c(cmk $$0, cuc $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      if (this.dQ().B) {
         return bqg.c;
      } else {
         return $$2 ? bqg.a : bqg.e;
      }
   }

   protected boolean a(cmk $$0, cuc $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cuf.pw)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cuf.rA)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dfj.ij.r())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cuf.ou)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cuf.uk)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dQ().B && this.gD() && this.g() == 0 && !this.gs()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(cuf.qa) || $$1.a(cuf.qb)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dQ().B && this.gD() && this.g() == 0 && !this.gs()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.ex() < this.eO() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.p_() && $$4 > 0) {
         this.dQ().a(lj.O, this.d(1.0), this.dy() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dQ().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gD()) && this.gJ() < this.gO() && !this.dQ().B) {
         this.v($$5);
         $$2 = true;
      }

      if ($$2) {
         this.s();
         this.a(dxg.m);
      }

      return $$2;
   }

   protected void f(cmk $$0) {
      this.A(false);
      this.B(false);
      if (!this.dQ().B) {
         $$0.s(this.dG());
         $$0.t(this.dI());
         $$0.n(this);
      }
   }

   @Override
   public boolean fd() {
      return super.fd() && this.bT() && this.i() || this.gG() || this.gH();
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.af);
   }

   private void u() {
      this.cr = 1;
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.cu != null) {
         for (int $$0 = 0; $$0 < this.cu.b(); $$0++) {
            cuc $$1 = this.cu.a($$0);
            if (!$$1.e() && !czn.a($$1, czm.D)) {
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
      if (!this.dQ().B && this.bE()) {
         if (this.ah.a(900) == 0 && this.aQ == 0) {
            this.c(1.0F);
         }

         if (this.gQ()) {
            if (!this.gG() && !this.bT() && this.ah.a(300) == 0 && this.dQ().a_(this.dq().d()).a(dfj.i)) {
               this.A(true);
            }

            if (this.gG() && ++this.cI > 50) {
               this.cI = 0;
               this.A(false);
            }
         }

         this.gP();
      }
   }

   protected void gP() {
      if (this.gI() && this.p_() && !this.gG()) {
         btb $$0 = this.dQ().a(cgv.class, ck, this, this.dv(), this.dx(), this.dB(), this.cL().g(16.0));
         if ($$0 != null && this.g((bsg)$$0) > 4.0) {
            this.bT.a($$0, 0);
         }
      }
   }

   public boolean gQ() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cJ > 0 && ++this.cJ > 30) {
         this.cJ = 0;
         this.d(64, false);
      }

      if (this.dc() && this.cK > 0 && ++this.cK > 20) {
         this.cK = 0;
         this.B(false);
      }

      if (this.cr > 0 && ++this.cr > 8) {
         this.cr = 0;
      }

      if (this.cs > 0) {
         this.cs++;
         if (this.cs > 300) {
            this.cs = 0;
         }
      }

      this.cM = this.cL;
      if (this.gG()) {
         this.cL = this.cL + (1.0F - this.cL) * 0.4F + 0.05F;
         if (this.cL > 1.0F) {
            this.cL = 1.0F;
         }
      } else {
         this.cL = this.cL + ((0.0F - this.cL) * 0.4F - 0.05F);
         if (this.cL < 0.0F) {
            this.cL = 0.0F;
         }
      }

      this.cO = this.cN;
      if (this.gH()) {
         this.cL = 0.0F;
         this.cM = this.cL;
         this.cN = this.cN + (1.0F - this.cN) * 0.4F + 0.05F;
         if (this.cN > 1.0F) {
            this.cN = 1.0F;
         }
      } else {
         this.cx = false;
         this.cN = this.cN + ((0.8F * this.cN * this.cN * this.cN - this.cN) * 0.6F - 0.05F);
         if (this.cN < 0.0F) {
            this.cN = 0.0F;
         }
      }

      this.cQ = this.cP;
      if (this.t(64)) {
         this.cP = this.cP + (1.0F - this.cP) * 0.7F + 0.05F;
         if (this.cP > 1.0F) {
            this.cP = 1.0F;
         }
      } else {
         this.cP = this.cP + ((0.0F - this.cP) * 0.7F - 0.05F);
         if (this.cP < 0.0F) {
            this.cP = 0.0F;
         }
      }
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      if (this.bT() || this.p_()) {
         return super.b($$0, $$1);
      } else if (this.gD() && $$0.fO()) {
         this.b($$0);
         return bqg.a(this.dQ().B);
      } else {
         cuc $$2 = $$0.b($$1);
         if (!$$2.e()) {
            bqg $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.fP() && this.l($$2) && !this.fQ()) {
               this.b($$0, $$2);
               return bqg.a(this.dQ().B);
            }
         }

         this.f($$0);
         return bqg.a(this.dQ().B);
      }
   }

   private void go() {
      if (!this.dQ().B) {
         this.cJ = 1;
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
   public avg gR() {
      return this.v();
   }

   public void gS() {
      if (this.gu() && this.dc()) {
         this.cK = 1;
         this.B(true);
      }
   }

   public void gT() {
      if (!this.gH()) {
         this.gS();
         this.b(this.gM());
      }
   }

   public boolean h(cmk $$0) {
      this.b($$0.cA());
      this.x(true);
      if ($$0 instanceof aqn) {
         am.y.a((aqn)$$0, this);
      }

      this.dQ().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cmk $$0, ewf $$1) {
      super.a($$0, $$1);
      ewe $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.O = this.aY = this.ba = this.dG();
      if (this.db()) {
         if ($$1.e <= 0.0) {
            this.cz = 0;
         }

         if (this.aF()) {
            this.y(false);
            if (this.cw > 0.0F && !this.gF()) {
               this.b(this.cw, $$1);
            }

            this.cw = 0.0F;
         }
      }
   }

   protected ewe j(btb $$0) {
      return new ewe($$0.dI() * 0.5F, $$0.dG());
   }

   @Override
   protected ewf b(cmk $$0, ewf $$1) {
      if (this.aF() && this.cw == 0.0F && this.gH() && !this.cx) {
         return ewf.b;
      } else {
         float $$2 = $$0.bo * 0.5F;
         float $$3 = $$0.bq;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new ewf((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cmk $$0) {
      return (float)this.g(buj.v);
   }

   protected void b(float $$0, ewf $$1) {
      double $$2 = (double)this.x($$0);
      ewf $$3 = this.dt();
      this.o($$3.c, $$2, $$3.e);
      this.y(true);
      this.av = true;
      if ($$1.e > 0.0) {
         float $$4 = ayg.a(this.dG() * (float) (Math.PI / 180.0));
         float $$5 = ayg.b(this.dG() * (float) (Math.PI / 180.0));
         this.i(this.dt().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gU() {
      this.a(avh.mO, 0.4F, 1.0F);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gG());
      $$0.a("Bred", this.gI());
      $$0.a("Temper", this.gJ());
      $$0.a("Tame", this.gD());
      if (this.W_() != null) {
         $$0.a("Owner", this.W_());
      }

      if (!this.cu.a(0).e()) {
         $$0.a("SaddleItem", this.cu.a(0).a(this.dS()));
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.A($$0.q("EatingHaystack"));
      this.z($$0.q("Bred"));
      this.u($$0.h("Temper"));
      this.x($$0.q("Tame"));
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = aui.a(this.cP(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cuc $$4 = cuc.a(this.dS(), (uu)$$0.p("SaddleItem")).orElse(cuc.l);
         if ($$4.a(cuf.nL)) {
            this.cu.a(0, $$4);
         }
      }

      this.gL();
   }

   @Override
   public boolean a(cer $$0) {
      return false;
   }

   protected boolean gV() {
      return !this.bT() && !this.bS() && this.gD() && !this.p_() && this.ex() >= this.eO() && this.gs();
   }

   @Nullable
   @Override
   public bsa a(aqm $$0, bsa $$1) {
      return null;
   }

   protected void a(bsa $$0, cgv $$1) {
      this.a($$0, $$1, buj.s, (double)cf, (double)cg);
      this.a($$0, $$1, buj.o, (double)cd, (double)ce);
      this.a($$0, $$1, buj.v, (double)ca, (double)cb);
   }

   private void a(bsa $$0, cgv $$1, jj<bue> $$2, double $$3, double $$4) {
      double $$5 = a(this.h($$2), $$0.h($$2), $$3, $$4, this.ah);
      $$1.f($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, ayo $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = ayg.a($$0, $$2, $$3);
         $$1 = ayg.a($$1, $$2, $$3);
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

   public float H(float $$0) {
      return ayg.i($$0, this.cM, this.cL);
   }

   public float I(float $$0) {
      return ayg.i($$0, this.cO, this.cN);
   }

   public float J(float $$0) {
      return ayg.i($$0, this.cQ, this.cP);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cx = true;
            this.gS();
         }

         if ($$0 >= 90) {
            this.cw = 1.0F;
         } else {
            this.cw = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.i();
   }

   @Override
   public void c(int $$0) {
      this.cx = true;
      this.gS();
      this.gU();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      lh $$1 = $$0 ? lj.Q : lj.ae;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         double $$5 = this.ah.k() * 0.02;
         this.dQ().a($$1, this.d(1.0), this.dy() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(bsg $$0, bsg.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof btb) {
         ((btb)$$0).aY = this.aY;
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
   public btt a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new btt() {
            @Override
            public cuc a() {
               return cgv.this.cu.a(0);
            }

            @Override
            public boolean a(cuc $$0) {
               if (!$$0.e() && !$$0.a(cuf.nL)) {
                  return false;
               } else {
                  cgv.this.cu.a(0, $$0);
                  cgv.this.gL();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.cu.b() ? btt.a(this.cu, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public btb cR() {
      if (this.i()) {
         bsg var2 = this.cU();
         if (var2 instanceof cmk) {
            return (cmk)var2;
         }
      }

      return super.cR();
   }

   @Nullable
   private ewf a(ewf $$0, btb $$1) {
      double $$2 = this.dv() + $$0.c;
      double $$3 = this.cL().b;
      double $$4 = this.dB() + $$0.e;
      ja.a $$5 = new ja.a();
      UnmodifiableIterator var10 = $$1.fF().iterator();

      while (var10.hasNext()) {
         btn $$6 = (btn)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cL().e + 0.75;

         do {
            double $$8 = this.dQ().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cok.a($$8)) {
               ewa $$9 = $$1.f($$6);
               ewf $$10 = new ewf($$2, (double)$$5.v() + $$8, $$4);
               if (cok.a(this.dQ(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(jf.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public ewf b(btb $$0) {
      ewf $$1 = a((double)this.dk(), (double)$$0.dk(), this.dG() + ($$0.fr() == bsv.b ? 90.0F : -90.0F));
      ewf $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ewf $$3 = a((double)this.dk(), (double)$$0.dk(), this.dG() + ($$0.fr() == bsv.a ? 90.0F : -90.0F));
         ewf $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.do();
      }
   }

   protected void a(ayo $$0) {
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      if ($$3 == null) {
         $$3 = new bsa.a(0.2F);
      }

      this.a($$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bpz $$0) {
      return this.cu != $$0;
   }

   public int gW() {
      return this.P();
   }

   @Override
   protected ewf a(bsg $$0, bsj $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new ewf(0.0, 0.15 * (double)this.cO * (double)$$2, -0.7 * (double)this.cO * (double)$$2).b(-this.dG() * (float) (Math.PI / 180.0)));
   }

   public final bpz gX() {
      return this.cS;
   }
}

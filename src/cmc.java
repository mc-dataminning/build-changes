import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmc extends bwr {
   public static final int a = 5;
   private static final boolean bC = true;
   private static final Logger bD = LogUtils.getLogger();
   public static final kk b = new kk(0.0F, 0.0F, 0.0F);
   public static final kk c = new kk(0.0F, 0.0F, 0.0F);
   public static final kk d = new kk(-10.0F, 0.0F, -10.0F);
   public static final kk e = new kk(-15.0F, 0.0F, 10.0F);
   public static final kk f = new kk(-1.0F, 0.0F, -1.0F);
   public static final kk g = new kk(1.0F, 0.0F, 1.0F);
   private static final bvv bE = bvv.c(0.0F, 0.0F);
   private static final bvv bF = bwb.f.n().a(0.5F).b(0.9875F);
   private static final double bG = 0.1;
   private static final double bH = 0.9;
   private static final double bI = 0.4;
   private static final double bJ = 1.6;
   public static final int h = 8;
   public static final int i = 16;
   public static final int j = 1;
   public static final int k = 4;
   public static final int bs = 8;
   public static final int bt = 16;
   public static final akg<Byte> bu = akk.a(cmc.class, aki.a);
   public static final akg<kk> bv = akk.a(cmc.class, aki.n);
   public static final akg<kk> bw = akk.a(cmc.class, aki.n);
   public static final akg<kk> bx = akk.a(cmc.class, aki.n);
   public static final akg<kk> by = akk.a(cmc.class, aki.n);
   public static final akg<kk> bz = akk.a(cmc.class, aki.n);
   public static final akg<kk> bA = akk.a(cmc.class, aki.n);
   private static final Predicate<bvs> bK = $$0 -> {
      if ($$0 instanceof csh $$1 && $$1.z()) {
         return true;
      }

      return false;
   };
   private bvw bL = new bvw();
   private boolean bM;
   public long bB;
   private int bN;
   private kk bO = b;
   private kk bP = c;
   private kk bQ = d;
   private kk bR = e;
   private kk bS = f;
   private kk bT = g;

   public cmc(bwb<? extends cmc> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public cmc(dhp $$0, double $$1, double $$2, double $$3) {
      this(bwb.f, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bxw.a j() {
      return ed().a(bxx.B, 0.0);
   }

   @Override
   public void i_() {
      double $$0 = this.dA();
      double $$1 = this.dC();
      double $$2 = this.dG();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   private boolean C() {
      return !this.t() && !this.bc();
   }

   @Override
   public boolean dj() {
      return super.dj() && this.C();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bu, (byte)0);
      $$0.a(bv, b);
      $$0.a(bw, c);
      $$0.a(bx, d);
      $$0.a(by, e);
      $$0.a(bz, f);
      $$0.a(bA, g);
   }

   @Override
   public cxy a(bwc $$0) {
      return this.bL.a($$0);
   }

   @Override
   public boolean e(bwc $$0) {
      return $$0 != bwc.g && $$0 != bwc.h && !this.g($$0);
   }

   @Override
   public void a(bwc $$0, cxy $$1) {
      this.d($$1);
      cxy $$2 = this.bL.a($$0, $$1);
      this.a($$0, $$2, $$1);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      if (!this.bL.a()) {
         alb<ut> $$1 = this.dX().a(uk.a);
         $$0.a("equipment", (ut)bvw.a.encodeStart($$1, this.bL).getOrThrow());
      }

      $$0.a("Invisible", this.cp());
      $$0.a("Small", this.m());
      $$0.a("ShowArms", this.n());
      $$0.a("DisabledSlots", this.bN);
      $$0.a("NoBasePlate", !this.q());
      if (this.t()) {
         $$0.a("Marker", this.t());
      }

      $$0.a("Pose", this.D());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.e("equipment")) {
         alb<ut> $$1 = this.dX().a(uk.a);
         bvw.a.parse($$1, $$0.c("equipment")).resultOrPartial($$0x -> bD.warn("Failed to parse equipment: {}", $$0x)).ifPresent($$0x -> this.bL = $$0x);
      } else {
         this.bL = new bvw();
      }

      this.k($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.bN = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.ad = !this.C();
      tw $$2 = $$0.p("Pose");
      this.c($$2);
   }

   private void c(tw $$0) {
      uc $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? b : new kk($$1));
      uc $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? c : new kk($$2));
      uc $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? d : new kk($$3));
      uc $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? e : new kk($$4));
      uc $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? f : new kk($$5));
      uc $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? g : new kk($$6));
   }

   private tw D() {
      tw $$0 = new tw();
      if (!b.equals(this.bO)) {
         $$0.a("Head", this.bO.a());
      }

      if (!c.equals(this.bP)) {
         $$0.a("Body", this.bP.a());
      }

      if (!d.equals(this.bQ)) {
         $$0.a("LeftArm", this.bQ.a());
      }

      if (!e.equals(this.bR)) {
         $$0.a("RightArm", this.bR.a());
      }

      if (!f.equals(this.bS)) {
         $$0.a("LeftLeg", this.bS.a());
      }

      if (!g.equals(this.bT)) {
         $$0.a("RightLeg", this.bT.a());
      }

      return $$0;
   }

   @Override
   public boolean bH() {
      return false;
   }

   @Override
   protected void D(bvs $$0) {
   }

   @Override
   protected void o() {
      for (bvs $$1 : this.dV().a(this, this.cR(), bK)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public btq a(cqi $$0, fcu $$1, btp $$2) {
      cxy $$3 = $$0.b($$2);
      if (this.t() || $$3.a(cyc.vP)) {
         return btq.e;
      } else if ($$0.U_()) {
         return btq.a;
      } else if ($$0.dV().C) {
         return btq.b;
      } else {
         bwc $$4 = this.g($$3);
         if ($$3.f()) {
            bwc $$5 = this.l($$1);
            bwc $$6 = this.g($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return btq.b;
            }
         } else {
            if (this.g($$4)) {
               return btq.d;
            }

            if ($$4.a() == bwc.a.a && !this.n()) {
               return btq.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return btq.b;
            }
         }

         return btq.e;
      }
   }

   private bwc l(fcu $$0) {
      bwc $$1 = bwc.a;
      boolean $$2 = this.m();
      double $$3 = $$0.e / (double)(this.ek() * this.ej());
      bwc $$4 = bwc.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = bwc.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(bwc.e)) {
         $$1 = bwc.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(bwc.d)) {
         $$1 = bwc.d;
      } else if ($$3 >= 1.6 && this.d(bwc.f)) {
         $$1 = bwc.f;
      } else if (!this.d(bwc.a) && this.d(bwc.b)) {
         $$1 = bwc.b;
      }

      return $$1;
   }

   private boolean g(bwc $$0) {
      return (this.bN & 1 << $$0.b(0)) != 0 || $$0.a() == bwc.a.a && !this.n();
   }

   private boolean a(cqi $$0, bwc $$1, cxy $$2, btp $$3) {
      cxy $$4 = this.a($$1);
      if (!$$4.f() && (this.bN & 1 << $$1.b(8)) != 0) {
         return false;
      } else if ($$4.f() && (this.bN & 1 << $$1.b(16)) != 0) {
         return false;
      } else if ($$0.fU() && $$4.f() && !$$2.f()) {
         this.a($$1, $$2.c(1));
         return true;
      } else if ($$2.f() || $$2.M() <= 1) {
         this.a($$1, $$2);
         $$0.a($$3, $$4);
         return true;
      } else if (!$$4.f()) {
         return false;
      } else {
         this.a($$1, $$2.a(1));
         return true;
      }
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (this.dQ()) {
         return false;
      } else if (!$$0.O().c(dhl.c) && $$1.d() instanceof bwt) {
         return false;
      } else if ($$1.a(axb.d)) {
         this.c($$0);
         return false;
      } else if (this.a($$0, $$1) || this.bM || this.t()) {
         return false;
      } else if ($$1.a(axb.l)) {
         this.d($$0, $$1);
         this.c($$0);
         return false;
      } else if ($$1.a(axb.u)) {
         if (this.bY()) {
            this.c($$0, $$1, 0.15F);
         } else {
            this.e(5.0F);
         }

         return false;
      } else if ($$1.a(axb.v) && this.eF() > 0.5F) {
         this.c($$0, $$1, 4.0F);
         return false;
      } else {
         boolean $$3 = $$1.a(axb.B);
         boolean $$4 = $$1.a(axb.A);
         if (!$$3 && !$$4) {
            return false;
         } else {
            if ($$1.d() instanceof cqi $$5 && !$$5.gj().e) {
               return false;
            }

            if ($$1.h()) {
               this.F();
               this.E();
               this.c($$0);
               return true;
            } else {
               long $$6 = $$0.ae();
               if ($$6 - this.bB > 5L && !$$4) {
                  $$0.a(this, (byte)32);
                  this.a(edm.o, $$1.d());
                  this.bB = $$6;
               } else {
                  this.c($$0, $$1);
                  this.E();
                  this.c($$0);
               }

               return true;
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 32) {
         if (this.dV().C) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awk.aC, this.dm(), 0.3F, 1.0F, false);
            this.bB = this.dV().ae();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cR().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void E() {
      if (this.dV() instanceof arn) {
         ((arn)this.dV())
            .a(
               new ln(lv.b, dkw.n.m()),
               this.dA(),
               this.e(0.6666666666666666),
               this.dG(),
               10,
               (double)(this.dq() / 4.0F),
               (double)(this.dr() / 4.0F),
               (double)(this.dq() / 4.0F),
               0.05
            );
      }
   }

   private void c(arn $$0, buh $$1, float $$2) {
      float $$3 = this.eF();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.d($$0, $$1);
         this.c($$0);
      } else {
         this.d($$3);
         this.a(edm.o, $$1.d());
      }
   }

   private void c(arn $$0, buh $$1) {
      cxy $$2 = new cxy(cyc.vJ);
      $$2.b(kx.g, this.an());
      dku.a(this.dV(), this.dv(), $$2);
      this.d($$0, $$1);
   }

   private void d(arn $$0, buh $$1) {
      this.F();
      this.b($$0, $$1);

      for (bwc $$2 : bwc.j) {
         cxy $$3 = this.bL.a($$2, cxy.k);
         if (!$$3.f()) {
            dku.a(this.dV(), this.dv().d(), $$3);
         }
      }
   }

   private void F() {
      this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.aA, this.dm(), 1.0F, 1.0F);
   }

   @Override
   protected void D(float $$0) {
      this.aV = this.N;
      this.aU = this.dL();
   }

   @Override
   public void a_(fcu $$0) {
      if (this.C()) {
         super.a_($$0);
      }
   }

   @Override
   public void s(float $$0) {
      this.aV = this.N = $$0;
      this.aX = this.aW = $$0;
   }

   @Override
   public void r(float $$0) {
      this.aV = this.N = $$0;
      this.aX = this.aW = $$0;
   }

   @Override
   public void h() {
      super.h();
      kk $$0 = this.al.a(bv);
      if (!this.bO.equals($$0)) {
         this.a($$0);
      }

      kk $$1 = this.al.a(bw);
      if (!this.bP.equals($$1)) {
         this.b($$1);
      }

      kk $$2 = this.al.a(bx);
      if (!this.bQ.equals($$2)) {
         this.c($$2);
      }

      kk $$3 = this.al.a(by);
      if (!this.bR.equals($$3)) {
         this.d($$3);
      }

      kk $$4 = this.al.a(bz);
      if (!this.bS.equals($$4)) {
         this.e($$4);
      }

      kk $$5 = this.al.a(bA);
      if (!this.bT.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void K() {
      this.k(this.bM);
   }

   @Override
   public void k(boolean $$0) {
      this.bM = $$0;
      super.k($$0);
   }

   @Override
   public boolean n_() {
      return this.m();
   }

   @Override
   public void c(arn $$0) {
      this.a(bvs.e.a);
      this.a(edm.p);
   }

   @Override
   public boolean a(dhi $$0) {
      return $$0.h() ? this.cp() : true;
   }

   @Override
   public euy j_() {
      return this.t() ? euy.d : super.j_();
   }

   @Override
   public boolean g_() {
      return this.t();
   }

   private void t(boolean $$0) {
      this.al.a(bu, this.a(this.al.a(bu), 1, $$0));
   }

   public boolean m() {
      return (this.al.a(bu) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.al.a(bu, this.a(this.al.a(bu), 4, $$0));
   }

   public boolean n() {
      return (this.al.a(bu) & 4) != 0;
   }

   public void b(boolean $$0) {
      this.al.a(bu, this.a(this.al.a(bu), 8, $$0));
   }

   public boolean q() {
      return (this.al.a(bu) & 8) == 0;
   }

   private void u(boolean $$0) {
      this.al.a(bu, this.a(this.al.a(bu), 16, $$0));
   }

   public boolean t() {
      return (this.al.a(bu) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(kk $$0) {
      this.bO = $$0;
      this.al.a(bv, $$0);
   }

   public void b(kk $$0) {
      this.bP = $$0;
      this.al.a(bw, $$0);
   }

   public void c(kk $$0) {
      this.bQ = $$0;
      this.al.a(bx, $$0);
   }

   public void d(kk $$0) {
      this.bR = $$0;
      this.al.a(by, $$0);
   }

   public void e(kk $$0) {
      this.bS = $$0;
      this.al.a(bz, $$0);
   }

   public void f(kk $$0) {
      this.bT = $$0;
      this.al.a(bA, $$0);
   }

   public kk u() {
      return this.bO;
   }

   public kk x() {
      return this.bP;
   }

   public kk y() {
      return this.bQ;
   }

   public kk z() {
      return this.bR;
   }

   public kk A() {
      return this.bS;
   }

   public kk B() {
      return this.bT;
   }

   @Override
   public boolean bG() {
      return super.bG() && !this.t();
   }

   @Override
   public boolean v(bvs $$0) {
      if ($$0 instanceof cqi $$1 && !this.dV().a($$1, this.dv())) {
         return true;
      }

      return false;
   }

   @Override
   public bwk fx() {
      return bwk.b;
   }

   @Override
   public bwr.a eN() {
      return new bwr.a(awk.aB, awk.aB);
   }

   @Nullable
   @Override
   protected awj e(buh $$0) {
      return awk.aC;
   }

   @Nullable
   @Override
   protected awj l_() {
      return awk.aA;
   }

   @Override
   public void a(arn $$0, bwq $$1) {
   }

   @Override
   public boolean fK() {
      return false;
   }

   @Override
   public void a(akg<?> $$0) {
      if (bu.equals($$0)) {
         this.i_();
         this.I = !this.t();
      }

      super.a($$0);
   }

   @Override
   public boolean fL() {
      return false;
   }

   @Override
   public bvv e(bxd $$0) {
      return this.v(this.t());
   }

   private bvv v(boolean $$0) {
      if ($$0) {
         return bE;
      } else {
         return this.n_() ? bF : this.aq().n();
      }
   }

   @Override
   public fcu o(float $$0) {
      if (this.t()) {
         fcp $$1 = this.v(false).a(this.dt());
         jj $$2 = this.dv();
         int $$3 = Integer.MIN_VALUE;

         for (jj $$4 : jj.c(jj.a($$1.a, $$1.b, $$1.c), jj.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dV().a(dhy.b, $$4), this.dV().a(dhy.a, $$4));
            if ($$5 == 15) {
               return fcu.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return fcu.b($$2);
      } else {
         return super.o($$0);
      }
   }

   @Override
   public cxy dI() {
      return new cxy(cyc.vJ);
   }

   @Override
   public boolean ez() {
      return !this.cp() && !this.t();
   }
}

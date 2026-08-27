import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bok extends boi implements bpf {
   private static final aie<Byte> b = aih.a(bok.class, aig.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final jd bS = new jd(1, 0, 1);
   public static final float g = 0.15F;
   public static final float bB = 0.55F;
   public static final float bC = 0.5F;
   public static final float bD = 0.25F;
   public static final String bE = "Leash";
   public static final float bF = 0.085F;
   public static final int bG = 2;
   public static final int bH = 2;
   private static final double bT = Math.sqrt(2.04F) - 0.6F;
   public int bI;
   protected int bJ;
   protected buh bK;
   protected bui bL;
   protected bug bM;
   private final bud bU;
   protected bxt bN;
   protected final bvg bO;
   protected final bvg bP;
   @Nullable
   private boi bV;
   private final byq bW;
   private final is<cpd> bX = is.a(2, cpd.h);
   protected final float[] bQ = new float[2];
   private final is<cpd> bY = is.a(4, cpd.h);
   protected final float[] bR = new float[4];
   private boolean bZ;
   private boolean ca;
   private final Map<ehh, Float> cb = Maps.newEnumMap(ehh.class);
   @Nullable
   private aiy cc;
   private long cd;
   @Nullable
   private bnq ce;
   private int cf;
   @Nullable
   private sw cg;
   private hz ch = hz.c;
   private float ci = -1.0F;

   protected bok(bnw<? extends bok> $$0, cvr $$1) {
      super($$0, $$1);
      this.bO = new bvg($$1.af());
      this.bP = new bvg($$1.af());
      this.bK = new buh(this);
      this.bL = new bui(this);
      this.bM = new bug(this);
      this.bU = this.H();
      this.bN = this.b($$1);
      this.bW = new byq(this);
      Arrays.fill(this.bR, 0.085F);
      Arrays.fill(this.bQ, 0.085F);
      if ($$1 != null && !$$1.B) {
         this.B();
      }
   }

   protected void B() {
   }

   public static bpo.a C() {
      return boi.dQ().a(bpp.i, 16.0).a(bpp.d);
   }

   protected bxt b(cvr $$0) {
      return new bxs(this, $$0);
   }

   protected boolean D() {
      return false;
   }

   public float a(ehh $$0) {
      bok $$2;
      label17: {
         if (this.da() instanceof bok $$1 && $$1.D()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cb.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(ehh $$0, float $$1) {
      this.cb.put($$0, $$1);
   }

   @Override
   public void E() {
   }

   public void G() {
   }

   protected bud H() {
      return new bud(this);
   }

   public buh I() {
      return this.bK;
   }

   public bui K() {
      return this.da() instanceof bok $$0 ? $$0.K() : this.bL;
   }

   public bug M() {
      return this.bM;
   }

   public bxt N() {
      return this.da() instanceof bok $$0 ? $$0.N() : this.bN;
   }

   @Nullable
   @Override
   public boi cN() {
      bnq $$0 = this.cQ();
      if (!this.fW() && $$0 instanceof bok $$1 && $$0.bR()) {
         return $$1;
      }

      return null;
   }

   public byq O() {
      return this.bW;
   }

   @Nullable
   @Override
   public boi q() {
      return this.bV;
   }

   public void h(@Nullable boi $$0) {
      this.bV = $$0;
   }

   @Override
   public boolean a(bnw<?> $$0) {
      return $$0 != bnw.S;
   }

   public boolean a(cpt $$0) {
      return false;
   }

   public void P() {
      this.b(dpw.m);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, (byte)0);
   }

   public int Q() {
      return 80;
   }

   public void R() {
      this.b(this.y());
   }

   @Override
   public void as() {
      super.as();
      this.dM().ae().a("mobBaseTick");
      if (this.bx() && this.af.a(1000) < this.bI++) {
         this.u();
         this.R();
      }

      this.dM().ae().c();
   }

   @Override
   protected void e(bmp $$0) {
      this.u();
      super.e($$0);
   }

   private void u() {
      this.bI = -this.Q();
   }

   @Override
   public int ef() {
      if (this.bJ > 0) {
         int $$0 = this.bJ;

         for (int $$1 = 0; $$1 < this.bY.size(); $$1++) {
            if (!this.bY.get($$1).b() && this.bR[$$1] <= 1.0F) {
               $$0 += 1 + this.af.a(3);
            }
         }

         for (int $$2 = 0; $$2 < this.bX.size(); $$2++) {
            if (!this.bX.get($$2).b() && this.bQ[$$2] <= 1.0F) {
               $$0 += 1 + this.af.a(3);
            }
         }

         return $$0;
      } else {
         return this.bJ;
      }
   }

   public void S() {
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.af.k() * 0.02;
            double $$2 = this.af.k() * 0.02;
            double $$3 = this.af.k() * 0.02;
            double $$4 = 10.0;
            this.dM().a(jz.Y, this.c(1.0) - $$1 * 10.0, this.du() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dM().a(this, (byte)20);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 20) {
         this.S();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B) {
         this.fT();
         if (this.ag % 5 == 0) {
            this.T();
         }
      }
   }

   protected void T() {
      boolean $$0 = !(this.cN() instanceof bok);
      boolean $$1 = !(this.cZ() instanceof cjg);
      this.bO.a(bvf.a.a, $$0);
      this.bO.a(bvf.a.c, $$0 && $$1);
      this.bO.a(bvf.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bU.a();
      return $$1;
   }

   @Nullable
   protected atk y() {
      return null;
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fM());
      $$0.a("PersistenceRequired", this.ca);
      tc $$1 = new tc();

      for (cpd $$2 : this.bY) {
         sw $$3 = new sw();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      tc $$4 = new tc();

      for (cpd $$5 : this.bX) {
         sw $$6 = new sw();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      tc $$7 = new tc();

      for (float $$8 : this.bR) {
         $$7.add(sz.a($$8));
      }

      $$0.a("ArmorDropChances", $$7);
      tc $$9 = new tc();

      for (float $$10 : this.bQ) {
         $$9.add(sz.a($$10));
      }

      $$0.a("HandDropChances", $$9);
      if (this.ce != null) {
         sw $$11 = new sw();
         if (this.ce instanceof boi) {
            UUID $$12 = this.ce.cw();
            $$11.a("UUID", $$12);
         } else if (this.ce instanceof cdo) {
            hz $$13 = ((cdo)this.ce).E();
            $$11.a("X", $$13.u());
            $$11.a("Y", $$13.v());
            $$11.a("Z", $$13.w());
         }

         $$0.a("Leash", $$11);
      } else if (this.cg != null) {
         $$0.a("Leash", this.cg.h());
      }

      $$0.a("LeftHanded", this.fX());
      if (this.cc != null) {
         $$0.a("DeathLootTable", this.cc.toString());
         if (this.cd != 0L) {
            $$0.a("DeathLootTableSeed", this.cd);
         }
      }

      if (this.fW()) {
         $$0.a("NoAI", this.fW());
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.s($$0.q("CanPickUpLoot"));
      }

      this.ca = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         tc $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bY.size(); $$2++) {
            this.bY.set($$2, cpd.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         tc $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bX.size(); $$4++) {
            this.bX.set($$4, cpd.a($$3.a($$4)));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         tc $$5 = $$0.c("ArmorDropChances", 5);

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            this.bR[$$6] = $$5.i($$6);
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         tc $$7 = $$0.c("HandDropChances", 5);

         for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
            this.bQ[$$8] = $$7.i($$8);
         }
      }

      if ($$0.b("Leash", 10)) {
         this.cg = $$0.p("Leash");
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cc = new aiy($$0.l("DeathLootTable"));
         this.cd = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(bmp $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cc = null;
   }

   @Override
   public final aiy eB() {
      return this.cc == null ? this.U() : this.cc;
   }

   protected aiy U() {
      return super.eB();
   }

   @Override
   public long eC() {
      return this.cd;
   }

   public void A(float $$0) {
      this.bm = $$0;
   }

   public void B(float $$0) {
      this.bl = $$0;
   }

   public void C(float $$0) {
      this.bk = $$0;
   }

   @Override
   public void w(float $$0) {
      super.w($$0);
      this.A($$0);
   }

   public void V() {
      this.N().n();
      this.C(0.0F);
      this.B(0.0F);
      this.w(0.0F);
   }

   @Override
   public void d_() {
      super.d_();
      this.dM().ae().a("looting");
      if (!this.dM().B && this.fM() && this.bx() && !this.ba && this.dM().Z().b(cvn.c)) {
         jd $$0 = this.W();

         for (cdw $$2 : this.dM().a(cdw.class, this.cH().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dH() && !$$2.q().b() && !$$2.z() && this.k($$2.q())) {
               this.b($$2);
            }
         }
      }

      this.dM().ae().c();
   }

   protected jd W() {
      return bS;
   }

   protected void b(cdw $$0) {
      cpd $$1 = $$0.q();
      cpd $$2 = this.i($$1.q());
      if (!$$2.b()) {
         this.a($$0);
         this.a($$0, $$2.M());
         $$1.h($$2.M());
         if ($$1.b()) {
            $$0.am();
         }
      }
   }

   public cpd i(cpd $$0) {
      bnx $$1 = h($$0);
      cpd $$2 = this.c($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bnx.a;
         $$2 = this.c($$1);
         $$3 = $$2.b();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.f($$1);
         if (!$$2.b() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.M() > 1) {
            cpd $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return cpd.h;
      }
   }

   @Override
   protected void b(bnx $$0, cpd $$1) {
      this.a($$0, $$1);
      this.e($$0);
      this.ca = true;
   }

   public void e(bnx $$0) {
      switch ($$0.a()) {
         case a:
            this.bQ[$$0.b()] = 2.0F;
            break;
         case b:
            this.bR[$$0.b()] = 2.0F;
      }
   }

   protected boolean b(cpd $$0, cpd $$1) {
      if ($$1.b()) {
         return true;
      } else if ($$0.d() instanceof cqo) {
         if (!($$1.d() instanceof cqo)) {
            return true;
         } else {
            cqo $$2 = (cqo)$$0.d();
            cqo $$3 = (cqo)$$1.d();
            return $$2.h() != $$3.h() ? $$2.h() > $$3.h() : this.c($$0, $$1);
         }
      } else if ($$0.d() instanceof cnb && $$1.d() instanceof cnb) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cnl && $$1.d() instanceof cnl) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cmn $$4) {
         if (ctn.d($$1)) {
            return false;
         } else if (!($$1.d() instanceof cmn)) {
            return true;
         } else {
            cmn $$5 = (cmn)$$1.d();
            if ($$4.e() != $$5.e()) {
               return $$4.e() > $$5.e();
            } else {
               return $$4.f() != $$5.f() ? $$4.f() > $$5.f() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.d() instanceof cnn) {
            if ($$1.d() instanceof cmw) {
               return true;
            }

            if ($$1.d() instanceof cnn $$6) {
               cnn $$7 = (cnn)$$0.d();
               if ($$7.d() != $$6.d()) {
                  return $$7.d() > $$6.d();
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   public boolean c(cpd $$0, cpd $$1) {
      if ($$0.l() >= $$1.l() && (!$$0.v() || $$1.v())) {
         return $$0.v() && $$1.v()
            ? $$0.w().e().stream().anyMatch($$0x -> !$$0x.equals("Damage")) && !$$1.w().e().stream().anyMatch($$0x -> !$$0x.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean j(cpd $$0) {
      return true;
   }

   public boolean k(cpd $$0) {
      return this.j($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean X() {
      return this.bO();
   }

   protected boolean Y() {
      return false;
   }

   @Override
   public void dy() {
      if (this.dM().aj() == blt.a && this.Y()) {
         this.am();
      } else if (!this.fN() && !this.X()) {
         bnq $$0 = this.dM().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.f(this);
            int $$2 = this.ai().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.am();
            }

            int $$4 = this.ai().f().g();
            int $$5 = $$4 * $$4;
            if (this.bb > 600 && this.af.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.am();
            } else if ($$1 < (double)$$5) {
               this.bb = 0;
            }
         }
      } else {
         this.bb = 0;
      }
   }

   @Override
   protected final void fi() {
      this.bb++;
      this.dM().ae().a("sensing");
      this.bW.a();
      this.dM().ae().c();
      int $$0 = this.dM().o().ak() + this.aj();
      if ($$0 % 2 != 0 && this.ag > 1) {
         this.dM().ae().a("targetSelector");
         this.bP.a(false);
         this.dM().ae().c();
         this.dM().ae().a("goalSelector");
         this.bO.a(false);
         this.dM().ae().c();
      } else {
         this.dM().ae().a("targetSelector");
         this.bP.a();
         this.dM().ae().c();
         this.dM().ae().a("goalSelector");
         this.bO.a();
         this.dM().ae().c();
      }

      this.dM().ae().a("navigation");
      this.bN.c();
      this.dM().ae().c();
      this.dM().ae().a("mob tick");
      this.aa();
      this.dM().ae().c();
      this.dM().ae().a("controls");
      this.dM().ae().a("move");
      this.bL.a();
      this.dM().ae().b("look");
      this.bK.a();
      this.dM().ae().b("jump");
      this.bM.b();
      this.dM().ae().c();
      this.dM().ae().c();
      this.Z();
   }

   protected void Z() {
      aep.a(this.dM(), this, this.bO);
   }

   protected void aa() {
   }

   public int ab() {
      return 40;
   }

   public int fH() {
      return 75;
   }

   protected void fI() {
      float $$0 = (float)this.fH();
      float $$1 = this.cp();
      float $$2 = awi.g(this.aU - $$1);
      float $$3 = awi.a(awi.g(this.aU - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.n($$4);
   }

   public int fJ() {
      return 10;
   }

   public void a(bnq $$0, float $$1, float $$2) {
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.dx() - this.dx();
      double $$6;
      if ($$0 instanceof boi $$5) {
         $$6 = $$5.dv() - this.dv();
      } else {
         $$6 = ($$0.cH().b + $$0.cH().e) / 2.0 - this.dv();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(awi.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(awi.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dE(), $$10, $$2));
      this.r(this.a(this.dC(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = awi.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bnw<? extends bok> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      hz $$5 = $$3.d();
      return $$2 == bom.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(cvs $$0, bom $$1) {
      return true;
   }

   public boolean a(cvu $$0) {
      return !$$0.d(this.cH()) && $$0.f(this);
   }

   public int fK() {
      return 4;
   }

   public boolean d(int $$0) {
      return false;
   }

   @Override
   public int cu() {
      if (this.q() == null) {
         return 3;
      } else {
         int $$0 = (int)(this.ew() - this.eN() * 0.33F);
         $$0 -= (3 - this.dM().aj().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return $$0 + 3;
      }
   }

   @Override
   public Iterable<cpd> bK() {
      return this.bX;
   }

   @Override
   public Iterable<cpd> bL() {
      return this.bY;
   }

   @Override
   public cpd c(bnx $$0) {
      switch ($$0.a()) {
         case a:
            return this.bX.get($$0.b());
         case b:
            return this.bY.get($$0.b());
         default:
            return cpd.h;
      }
   }

   @Override
   public void a(bnx $$0, cpd $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.bX.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.bY.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   protected void a(bmp $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bnx $$3 : bnx.values()) {
         cpd $$4 = this.c($$3);
         float $$5 = this.f($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.b() && !ctn.e($$4) && ($$2 || $$6) && Math.max(this.af.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.i()) {
               $$4.b($$4.m() - this.af.a(1 + this.af.a(Math.max($$4.m() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, cpd.h);
         }
      }
   }

   protected float f(bnx $$0) {
      return switch ($$0.a()) {
         case a -> this.bQ[$$0.b()];
         case b -> this.bR[$$0.b()];
         default -> 0.0F;
      };
   }

   protected void a(awp $$0, blu $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dM().aj() == blt.d ? 0.1F : 0.25F;
         if ($$0.i() < 0.095F) {
            $$2++;
         }

         if ($$0.i() < 0.095F) {
            $$2++;
         }

         if ($$0.i() < 0.095F) {
            $$2++;
         }

         boolean $$4 = true;

         for (bnx $$5 : bnx.values()) {
            if ($$5.a() == bnx.a.b) {
               cpd $$6 = this.c($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.b()) {
                  coy $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cpd($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static coy a(bnx $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cpg.px;
            } else if ($$1 == 1) {
               return cpg.pN;
            } else if ($$1 == 2) {
               return cpg.pB;
            } else if ($$1 == 3) {
               return cpg.pF;
            } else if ($$1 == 4) {
               return cpg.pJ;
            }
         case e:
            if ($$1 == 0) {
               return cpg.py;
            } else if ($$1 == 1) {
               return cpg.pO;
            } else if ($$1 == 2) {
               return cpg.pC;
            } else if ($$1 == 3) {
               return cpg.pG;
            } else if ($$1 == 4) {
               return cpg.pK;
            }
         case d:
            if ($$1 == 0) {
               return cpg.pz;
            } else if ($$1 == 1) {
               return cpg.pP;
            } else if ($$1 == 2) {
               return cpg.pD;
            } else if ($$1 == 3) {
               return cpg.pH;
            } else if ($$1 == 4) {
               return cpg.pL;
            }
         case c:
            if ($$1 == 0) {
               return cpg.pA;
            } else if ($$1 == 1) {
               return cpg.pQ;
            } else if ($$1 == 2) {
               return cpg.pE;
            } else if ($$1 == 3) {
               return cpg.pI;
            } else if ($$1 == 4) {
               return cpg.pM;
            }
         default:
            return null;
      }
   }

   protected void b(awp $$0, blu $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bnx $$3 : bnx.values()) {
         if ($$3.a() == bnx.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(awp $$0, float $$1) {
      if (!this.eT().b() && $$0.i() < 0.25F * $$1) {
         this.a(bnx.a, ctn.a($$0, this.eT(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(awp $$0, float $$1, bnx $$2) {
      cpd $$3 = this.c($$2);
      if (!$$3.b() && $$0.i() < 0.5F * $$1) {
         this.a($$2, ctn.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      awp $$5 = $$0.F_();
      this.f(bpp.i).d(new bpn("Random spawn bonus", $$5.a(0.0, 0.11485000000000001), bpn.a.b));
      if ($$5.i() < 0.05F) {
         this.u(true);
      } else {
         this.u(false);
      }

      return $$3;
   }

   public void fL() {
      this.ca = true;
   }

   public void a(bnx $$0, float $$1) {
      switch ($$0.a()) {
         case a:
            this.bQ[$$0.b()] = $$1;
            break;
         case b:
            this.bR[$$0.b()] = $$1;
      }
   }

   public boolean fM() {
      return this.bZ;
   }

   public void s(boolean $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean f(cpd $$0) {
      bnx $$1 = h($$0);
      return this.c($$1).b() && this.fM();
   }

   public boolean fN() {
      return this.ca;
   }

   @Override
   public final blw a(chl $$0, blv $$1) {
      if (!this.bx()) {
         return blw.d;
      } else if (this.fV() == $$0) {
         this.a(true, !$$0.fU().d);
         this.a(dpw.r, $$0);
         return blw.a(this.dM().B);
      } else {
         blw $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dpw.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dpw.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private blw c(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if ($$2.a(cpg.uG) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return blw.a(this.dM().B);
      } else {
         if ($$2.a(cpg.uH)) {
            blw $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.d() instanceof cqi) {
            if (this.dM() instanceof aow) {
               cqi $$4 = (cqi)$$2.d();
               Optional<bok> $$5 = $$4.a($$0, this, (bnw<? extends bok>)this.ai(), (aow)this.dM(), this.dk(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? blw.a : blw.d;
            } else {
               return blw.b;
            }
         } else {
            return blw.d;
         }
      }
   }

   protected void a(chl $$0, bok $$1) {
   }

   protected blw b(chl $$0, blv $$1) {
      return blw.d;
   }

   public boolean fO() {
      return this.a(this.dm());
   }

   public boolean a(hz $$0) {
      return this.ci == -1.0F ? true : this.ch.j($$0) < (double)(this.ci * this.ci);
   }

   public void a(hz $$0, int $$1) {
      this.ch = $$0;
      this.ci = (float)$$1;
   }

   public hz fP() {
      return this.ch;
   }

   public float fQ() {
      return this.ci;
   }

   public void fR() {
      this.ci = -1.0F;
   }

   public boolean fS() {
      return this.ci != -1.0F;
   }

   @Nullable
   public <T extends bok> T a(bnw<T> $$0, boolean $$1) {
      if (this.dH()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dM());
         if ($$2 == null) {
            return null;
         } else {
            $$2.u(this);
            $$2.a(this.o_());
            $$2.t(this.fW());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            if (this.fN()) {
               $$2.fL();
            }

            $$2.m(this.cr());
            if ($$1) {
               $$2.s(this.fM());

               for (bnx $$3 : bnx.values()) {
                  cpd $$4 = this.c($$3);
                  if (!$$4.b()) {
                     $$2.a($$3, $$4.c());
                     $$2.a($$3, this.f($$3));
                  }
               }
            }

            this.dM().b($$2);
            if (this.bO()) {
               bnq $$5 = this.cZ();
               this.ac();
               $$2.a($$5, true);
            }

            this.am();
            return $$2;
         }
      }
   }

   protected void fT() {
      if (this.cg != null) {
         this.gc();
      }

      if (this.ce != null) {
         if (!this.bx() || !this.ce.bx()) {
            this.a(true, true);
         }
      }
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.ce != null) {
         this.ce = null;
         this.cg = null;
         if (!this.dM().B && $$1) {
            this.a(cpg.uG);
         }

         if (!this.dM().B && $$0 && this.dM() instanceof aow) {
            ((aow)this.dM()).l().b(this, new adk(this, null));
         }
      }
   }

   public boolean a(chl $$0) {
      return !this.fU() && !(this instanceof cej);
   }

   public boolean fU() {
      return this.ce != null;
   }

   @Nullable
   public bnq fV() {
      if (this.ce == null && this.cf != 0 && this.dM().B) {
         this.ce = this.dM().a(this.cf);
      }

      return this.ce;
   }

   public void b(bnq $$0, boolean $$1) {
      this.ce = $$0;
      this.cg = null;
      if (!this.dM().B && $$1 && this.dM() instanceof aow) {
         ((aow)this.dM()).l().b(this, new adk(this, this.ce));
      }

      if (this.bO()) {
         this.ac();
      }
   }

   public void s(int $$0) {
      this.cf = $$0;
      this.a(false, false);
   }

   @Override
   public boolean a(bnq $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.fU()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gc() {
      if (this.cg != null && this.dM() instanceof aow) {
         if (this.cg.b("UUID")) {
            UUID $$0 = this.cg.a("UUID");
            bnq $$1 = ((aow)this.dM()).a($$0);
            if ($$1 != null) {
               this.b($$1, true);
               return;
            }
         } else if (this.cg.b("X", 99) && this.cg.b("Y", 99) && this.cg.b("Z", 99)) {
            hz $$2 = tl.b(this.cg);
            this.b(cdq.b(this.dM(), $$2), true);
            return;
         }

         if (this.ag > 100) {
            this.a(cpg.uG);
            this.cg = null;
         }
      }
   }

   @Override
   public boolean cY() {
      return super.cY() && !this.fW();
   }

   public void t(boolean $$0) {
      byte $$1 = this.am.b(b);
      this.am.b(b, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void u(boolean $$0) {
      byte $$1 = this.am.b(b);
      this.am.b(b, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void v(boolean $$0) {
      byte $$1 = this.am.b(b);
      this.am.b(b, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean fW() {
      return (this.am.b(b) & 1) != 0;
   }

   public boolean fX() {
      return (this.am.b(b) & 2) != 0;
   }

   public boolean fY() {
      return (this.am.b(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public boc fm() {
      return this.fX() ? boc.a : boc.b;
   }

   public boolean i(boi $$0) {
      return this.fZ().c($$0.eG());
   }

   protected enu fZ() {
      bnq $$0 = this.cZ();
      enu $$3;
      if ($$0 != null) {
         enu $$1 = $$0.cH();
         enu $$2 = this.cH();
         $$3 = new enu(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cH();
      }

      return $$3.c(bT, 0.0, bT);
   }

   @Override
   public boolean B(bnq $$0) {
      float $$1 = (float)this.g(bpp.c);
      float $$2 = (float)this.g(bpp.d);
      if ($$0 instanceof boi) {
         $$1 += ctn.a(this.eT(), $$0.ai());
         $$2 += (float)ctn.c(this);
      }

      int $$3 = ctn.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dN().b((boi)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof boi) {
            ((boi)$$0).q((double)($$2 * 0.5F), (double)awi.a(this.dC() * (float) (Math.PI / 180.0)), (double)(-awi.b(this.dC() * (float) (Math.PI / 180.0))));
            this.g(this.dp().d(0.6, 1.0, 0.6));
         }

         this.a(this, $$0);
         this.z($$0);
      }

      return $$4;
   }

   protected boolean ga() {
      if (this.dM().P() && !this.dM().B) {
         float $$0 = this.bo();
         hz $$1 = hz.a(this.dr(), this.dv(), this.dx());
         boolean $$2 = this.bb() || this.az || this.aA;
         if ($$0 > 0.5F && this.af.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dM().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(aup<egv> $$0) {
      if (this.N().p()) {
         super.c($$0);
      } else {
         this.g(this.dp().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gb() {
      this.c($$0 -> true);
      this.dO().h();
   }

   public void c(Predicate<bvf> $$0) {
      this.bO.a($$0);
   }

   @Override
   protected void cs() {
      super.cs();
      this.a(true, false);
      this.bM().forEach($$0 -> {
         if (!$$0.b()) {
            $$0.f(0);
         }
      });
   }

   @Nullable
   @Override
   public cpd dz() {
      cqi $$0 = cqi.a(this.ai());
      return $$0 == null ? null : new cpd($$0);
   }
}

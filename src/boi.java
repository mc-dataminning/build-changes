import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class boi extends bog implements bpb {
   private static final aie<Byte> b = aih.a(boi.class, aig.a);
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
   protected bud bK;
   protected bue bL;
   protected buc bM;
   private final btz bU;
   protected bxp bN;
   protected final bvc bO;
   protected final bvc bP;
   @Nullable
   private bog bV;
   private final bym bW;
   private final is<coz> bX = is.a(2, coz.h);
   protected final float[] bQ = new float[2];
   private final is<coz> bY = is.a(4, coz.h);
   protected final float[] bR = new float[4];
   private boolean bZ;
   private boolean ca;
   private final Map<eha, Float> cb = Maps.newEnumMap(eha.class);
   @Nullable
   private aiy cc;
   private long cd;
   @Nullable
   private bno ce;
   private int cf;
   @Nullable
   private sw cg;
   private hz ch = hz.c;
   private float ci = -1.0F;

   protected boi(bnu<? extends boi> $$0, cvn $$1) {
      super($$0, $$1);
      this.bO = new bvc($$1.ag());
      this.bP = new bvc($$1.ag());
      this.bK = new bud(this);
      this.bL = new bue(this);
      this.bM = new buc(this);
      this.bU = this.H();
      this.bN = this.b($$1);
      this.bW = new bym(this);
      Arrays.fill(this.bR, 0.085F);
      Arrays.fill(this.bQ, 0.085F);
      if ($$1 != null && !$$1.B) {
         this.B();
      }
   }

   protected void B() {
   }

   public static bpk.a C() {
      return bog.dQ().a(bpl.i, 16.0).a(bpl.d);
   }

   protected bxp b(cvn $$0) {
      return new bxo(this, $$0);
   }

   protected boolean D() {
      return false;
   }

   public float a(eha $$0) {
      boi $$2;
      label17: {
         if (this.da() instanceof boi $$1 && $$1.D()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cb.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(eha $$0, float $$1) {
      this.cb.put($$0, $$1);
   }

   @Override
   public void E() {
   }

   public void G() {
   }

   protected btz H() {
      return new btz(this);
   }

   public bud I() {
      return this.bK;
   }

   public bue K() {
      return this.da() instanceof boi $$0 ? $$0.K() : this.bL;
   }

   public buc M() {
      return this.bM;
   }

   public bxp N() {
      return this.da() instanceof boi $$0 ? $$0.N() : this.bN;
   }

   @Nullable
   @Override
   public bog cN() {
      bno $$0 = this.cQ();
      if (!this.fW() && $$0 instanceof boi $$1 && $$0.bR()) {
         return $$1;
      }

      return null;
   }

   public bym O() {
      return this.bW;
   }

   @Nullable
   @Override
   public bog q() {
      return this.bV;
   }

   public void h(@Nullable bog $$0) {
      this.bV = $$0;
   }

   @Override
   public boolean a(bnu<?> $$0) {
      return $$0 != bnu.S;
   }

   public boolean a(cpp $$0) {
      return false;
   }

   public void P() {
      this.b(dpp.m);
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
      this.dM().af().a("mobBaseTick");
      if (this.bx() && this.af.a(1000) < this.bI++) {
         this.u();
         this.R();
      }

      this.dM().af().c();
   }

   @Override
   protected void e(bmn $$0) {
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
      boolean $$0 = !(this.cN() instanceof boi);
      boolean $$1 = !(this.cZ() instanceof cjc);
      this.bO.a(bvb.a.a, $$0);
      this.bO.a(bvb.a.c, $$0 && $$1);
      this.bO.a(bvb.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bU.a();
      return $$1;
   }

   @Nullable
   protected atj y() {
      return null;
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fM());
      $$0.a("PersistenceRequired", this.ca);
      tc $$1 = new tc();

      for (coz $$2 : this.bY) {
         sw $$3 = new sw();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      tc $$4 = new tc();

      for (coz $$5 : this.bX) {
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
         if (this.ce instanceof bog) {
            UUID $$12 = this.ce.cw();
            $$11.a("UUID", $$12);
         } else if (this.ce instanceof cdk) {
            hz $$13 = ((cdk)this.ce).E();
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
            this.bY.set($$2, coz.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         tc $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bX.size(); $$4++) {
            this.bX.set($$4, coz.a($$3.a($$4)));
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
   protected void a(bmn $$0, boolean $$1) {
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
      this.dM().af().a("looting");
      if (!this.dM().B && this.fM() && this.bx() && !this.ba && this.dM().Z().b(cvj.c)) {
         jd $$0 = this.W();

         for (cds $$2 : this.dM().a(cds.class, this.cH().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dH() && !$$2.q().b() && !$$2.z() && this.k($$2.q())) {
               this.b($$2);
            }
         }
      }

      this.dM().af().c();
   }

   protected jd W() {
      return bS;
   }

   protected void b(cds $$0) {
      coz $$1 = $$0.q();
      coz $$2 = this.i($$1.q());
      if (!$$2.b()) {
         this.a($$0);
         this.a($$0, $$2.M());
         $$1.h($$2.M());
         if ($$1.b()) {
            $$0.am();
         }
      }
   }

   public coz i(coz $$0) {
      bnv $$1 = h($$0);
      coz $$2 = this.c($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bnv.a;
         $$2 = this.c($$1);
         $$3 = $$2.b();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.f($$1);
         if (!$$2.b() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.M() > 1) {
            coz $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return coz.h;
      }
   }

   @Override
   protected void b(bnv $$0, coz $$1) {
      this.a($$0, $$1);
      this.e($$0);
      this.ca = true;
   }

   public void e(bnv $$0) {
      switch ($$0.a()) {
         case a:
            this.bQ[$$0.b()] = 2.0F;
            break;
         case b:
            this.bR[$$0.b()] = 2.0F;
      }
   }

   protected boolean b(coz $$0, coz $$1) {
      if ($$1.b()) {
         return true;
      } else if ($$0.d() instanceof cqk) {
         if (!($$1.d() instanceof cqk)) {
            return true;
         } else {
            cqk $$2 = (cqk)$$0.d();
            cqk $$3 = (cqk)$$1.d();
            return $$2.h() != $$3.h() ? $$2.h() > $$3.h() : this.c($$0, $$1);
         }
      } else if ($$0.d() instanceof cmx && $$1.d() instanceof cmx) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cnh && $$1.d() instanceof cnh) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cmj $$4) {
         if (ctj.d($$1)) {
            return false;
         } else if (!($$1.d() instanceof cmj)) {
            return true;
         } else {
            cmj $$5 = (cmj)$$1.d();
            if ($$4.e() != $$5.e()) {
               return $$4.e() > $$5.e();
            } else {
               return $$4.f() != $$5.f() ? $$4.f() > $$5.f() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.d() instanceof cnj) {
            if ($$1.d() instanceof cms) {
               return true;
            }

            if ($$1.d() instanceof cnj $$6) {
               cnj $$7 = (cnj)$$0.d();
               if ($$7.d() != $$6.d()) {
                  return $$7.d() > $$6.d();
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   public boolean c(coz $$0, coz $$1) {
      if ($$0.l() >= $$1.l() && (!$$0.v() || $$1.v())) {
         return $$0.v() && $$1.v()
            ? $$0.w().e().stream().anyMatch($$0x -> !$$0x.equals("Damage")) && !$$1.w().e().stream().anyMatch($$0x -> !$$0x.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean j(coz $$0) {
      return true;
   }

   public boolean k(coz $$0) {
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
      if (this.dM().ak() == blr.a && this.Y()) {
         this.am();
      } else if (!this.fN() && !this.X()) {
         bno $$0 = this.dM().a(this, -1.0);
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
      this.dM().af().a("sensing");
      this.bW.a();
      this.dM().af().c();
      int $$0 = this.dM().o().ai() + this.aj();
      if ($$0 % 2 != 0 && this.ag > 1) {
         this.dM().af().a("targetSelector");
         this.bP.a(false);
         this.dM().af().c();
         this.dM().af().a("goalSelector");
         this.bO.a(false);
         this.dM().af().c();
      } else {
         this.dM().af().a("targetSelector");
         this.bP.a();
         this.dM().af().c();
         this.dM().af().a("goalSelector");
         this.bO.a();
         this.dM().af().c();
      }

      this.dM().af().a("navigation");
      this.bN.c();
      this.dM().af().c();
      this.dM().af().a("mob tick");
      this.aa();
      this.dM().af().c();
      this.dM().af().a("controls");
      this.dM().af().a("move");
      this.bL.a();
      this.dM().af().b("look");
      this.bK.a();
      this.dM().af().b("jump");
      this.bM.b();
      this.dM().af().c();
      this.dM().af().c();
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
      float $$2 = awh.g(this.aU - $$1);
      float $$3 = awh.a(awh.g(this.aU - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.n($$4);
   }

   public int fJ() {
      return 10;
   }

   public void a(bno $$0, float $$1, float $$2) {
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.dx() - this.dx();
      double $$6;
      if ($$0 instanceof bog $$5) {
         $$6 = $$5.dv() - this.dv();
      } else {
         $$6 = ($$0.cH().b + $$0.cH().e) / 2.0 - this.dv();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(awh.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(awh.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dE(), $$10, $$2));
      this.r(this.a(this.dC(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = awh.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bnu<? extends boi> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      hz $$5 = $$3.d();
      return $$2 == bok.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(cvo $$0, bok $$1) {
      return true;
   }

   public boolean a(cvq $$0) {
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
         $$0 -= (3 - this.dM().ak().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return $$0 + 3;
      }
   }

   @Override
   public Iterable<coz> bK() {
      return this.bX;
   }

   @Override
   public Iterable<coz> bL() {
      return this.bY;
   }

   @Override
   public coz c(bnv $$0) {
      switch ($$0.a()) {
         case a:
            return this.bX.get($$0.b());
         case b:
            return this.bY.get($$0.b());
         default:
            return coz.h;
      }
   }

   @Override
   public void a(bnv $$0, coz $$1) {
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
   protected void a(bmn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bnv $$3 : bnv.values()) {
         coz $$4 = this.c($$3);
         float $$5 = this.f($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.b() && !ctj.e($$4) && ($$2 || $$6) && Math.max(this.af.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.i()) {
               $$4.b($$4.m() - this.af.a(1 + this.af.a(Math.max($$4.m() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, coz.h);
         }
      }
   }

   protected float f(bnv $$0) {
      return switch ($$0.a()) {
         case a -> this.bQ[$$0.b()];
         case b -> this.bR[$$0.b()];
         default -> 0.0F;
      };
   }

   protected void a(awo $$0, bls $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dM().ak() == blr.d ? 0.1F : 0.25F;
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

         for (bnv $$5 : bnv.values()) {
            if ($$5.a() == bnv.a.b) {
               coz $$6 = this.c($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.b()) {
                  cou $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new coz($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cou a(bnv $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cpc.px;
            } else if ($$1 == 1) {
               return cpc.pN;
            } else if ($$1 == 2) {
               return cpc.pB;
            } else if ($$1 == 3) {
               return cpc.pF;
            } else if ($$1 == 4) {
               return cpc.pJ;
            }
         case e:
            if ($$1 == 0) {
               return cpc.py;
            } else if ($$1 == 1) {
               return cpc.pO;
            } else if ($$1 == 2) {
               return cpc.pC;
            } else if ($$1 == 3) {
               return cpc.pG;
            } else if ($$1 == 4) {
               return cpc.pK;
            }
         case d:
            if ($$1 == 0) {
               return cpc.pz;
            } else if ($$1 == 1) {
               return cpc.pP;
            } else if ($$1 == 2) {
               return cpc.pD;
            } else if ($$1 == 3) {
               return cpc.pH;
            } else if ($$1 == 4) {
               return cpc.pL;
            }
         case c:
            if ($$1 == 0) {
               return cpc.pA;
            } else if ($$1 == 1) {
               return cpc.pQ;
            } else if ($$1 == 2) {
               return cpc.pE;
            } else if ($$1 == 3) {
               return cpc.pI;
            } else if ($$1 == 4) {
               return cpc.pM;
            }
         default:
            return null;
      }
   }

   protected void b(awo $$0, bls $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bnv $$3 : bnv.values()) {
         if ($$3.a() == bnv.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(awo $$0, float $$1) {
      if (!this.eT().b() && $$0.i() < 0.25F * $$1) {
         this.a(bnv.a, ctj.a($$0, this.eT(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(awo $$0, float $$1, bnv $$2) {
      coz $$3 = this.c($$2);
      if (!$$3.b() && $$0.i() < 0.5F * $$1) {
         this.a($$2, ctj.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      awo $$5 = $$0.F_();
      this.f(bpl.i).d(new bpj("Random spawn bonus", $$5.a(0.0, 0.11485000000000001), bpj.a.b));
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

   public void a(bnv $$0, float $$1) {
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
   public boolean f(coz $$0) {
      bnv $$1 = h($$0);
      return this.c($$1).b() && this.fM();
   }

   public boolean fN() {
      return this.ca;
   }

   @Override
   public final blu a(chh $$0, blt $$1) {
      if (!this.bx()) {
         return blu.d;
      } else if (this.fV() == $$0) {
         this.a(true, !$$0.fU().d);
         this.a(dpp.r, $$0);
         return blu.a(this.dM().B);
      } else {
         blu $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dpp.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dpp.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private blu c(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if ($$2.a(cpc.uG) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return blu.a(this.dM().B);
      } else {
         if ($$2.a(cpc.uH)) {
            blu $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.d() instanceof cqe) {
            if (this.dM() instanceof aov) {
               cqe $$4 = (cqe)$$2.d();
               Optional<boi> $$5 = $$4.a($$0, this, (bnu<? extends boi>)this.ai(), (aov)this.dM(), this.dk(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? blu.a : blu.d;
            } else {
               return blu.b;
            }
         } else {
            return blu.d;
         }
      }
   }

   protected void a(chh $$0, boi $$1) {
   }

   protected blu b(chh $$0, blt $$1) {
      return blu.d;
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
   public <T extends boi> T a(bnu<T> $$0, boolean $$1) {
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

               for (bnv $$3 : bnv.values()) {
                  coz $$4 = this.c($$3);
                  if (!$$4.b()) {
                     $$2.a($$3, $$4.c());
                     $$2.a($$3, this.f($$3));
                  }
               }
            }

            this.dM().b($$2);
            if (this.bO()) {
               bno $$5 = this.cZ();
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
            this.a(cpc.uG);
         }

         if (!this.dM().B && $$0 && this.dM() instanceof aov) {
            ((aov)this.dM()).l().b(this, new adk(this, null));
         }
      }
   }

   public boolean a(chh $$0) {
      return !this.fU() && !(this instanceof cef);
   }

   public boolean fU() {
      return this.ce != null;
   }

   @Nullable
   public bno fV() {
      if (this.ce == null && this.cf != 0 && this.dM().B) {
         this.ce = this.dM().a(this.cf);
      }

      return this.ce;
   }

   public void b(bno $$0, boolean $$1) {
      this.ce = $$0;
      this.cg = null;
      if (!this.dM().B && $$1 && this.dM() instanceof aov) {
         ((aov)this.dM()).l().b(this, new adk(this, this.ce));
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
   public boolean a(bno $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.fU()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gc() {
      if (this.cg != null && this.dM() instanceof aov) {
         if (this.cg.b("UUID")) {
            UUID $$0 = this.cg.a("UUID");
            bno $$1 = ((aov)this.dM()).a($$0);
            if ($$1 != null) {
               this.b($$1, true);
               return;
            }
         } else if (this.cg.b("X", 99) && this.cg.b("Y", 99) && this.cg.b("Z", 99)) {
            hz $$2 = tl.b(this.cg);
            this.b(cdm.b(this.dM(), $$2), true);
            return;
         }

         if (this.ag > 100) {
            this.a(cpc.uG);
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
   public boa fm() {
      return this.fX() ? boa.a : boa.b;
   }

   public boolean i(bog $$0) {
      return this.fZ().c($$0.eG());
   }

   protected enn fZ() {
      bno $$0 = this.cZ();
      enn $$3;
      if ($$0 != null) {
         enn $$1 = $$0.cH();
         enn $$2 = this.cH();
         $$3 = new enn(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cH();
      }

      return $$3.c(bT, 0.0, bT);
   }

   @Override
   public boolean B(bno $$0) {
      float $$1 = (float)this.g(bpl.c);
      float $$2 = (float)this.g(bpl.d);
      if ($$0 instanceof bog) {
         $$1 += ctj.a(this.eT(), $$0.ai());
         $$2 += (float)ctj.c(this);
      }

      int $$3 = ctj.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dN().b((bog)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof bog) {
            ((bog)$$0).q((double)($$2 * 0.5F), (double)awh.a(this.dC() * (float) (Math.PI / 180.0)), (double)(-awh.b(this.dC() * (float) (Math.PI / 180.0))));
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
   protected void c(auo<ego> $$0) {
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

   public void c(Predicate<bvb> $$0) {
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
   public coz dz() {
      cqe $$0 = cqe.a(this.ai());
      return $$0 == null ? null : new coz($$0);
   }
}

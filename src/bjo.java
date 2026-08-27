import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bjo extends bjm implements bki {
   private static final aef<Byte> b = aei.a(bjo.class, aeh.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final hy bS = new hy(1, 0, 1);
   public static final float bA = 0.15F;
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
   protected bpj bK;
   protected bpk bL;
   protected bpi bM;
   private final bpf bU;
   protected bsv bN;
   protected final bqi bO;
   protected final bqi bP;
   @Nullable
   private bjm bV;
   private final btq bW;
   private final hn<cjl> bX = hn.a(2, cjl.b);
   protected final float[] bQ = new float[2];
   private final hn<cjl> bY = hn.a(4, cjl.b);
   protected final float[] bR = new float[4];
   private boolean bZ;
   private boolean ca;
   private final Map<ear, Float> cb = Maps.newEnumMap(ear.class);
   @Nullable
   private aez cc;
   private long cd;
   @Nullable
   private biw ce;
   private int cf;
   @Nullable
   private qw cg;
   private gw ch = gw.b;
   private float ci = -1.0F;

   protected bjo(bja<? extends bjo> $$0, cqb $$1) {
      super($$0, $$1);
      this.bO = new bqi($$1.ae());
      this.bP = new bqi($$1.ae());
      this.bK = new bpj(this);
      this.bL = new bpk(this);
      this.bM = new bpi(this);
      this.bU = this.F();
      this.bN = this.b($$1);
      this.bW = new btq(this);
      Arrays.fill(this.bR, 0.085F);
      Arrays.fill(this.bQ, 0.085F);
      if ($$1 != null && !$$1.B) {
         this.z();
      }
   }

   @Override
   protected void z() {
   }

   public static bkr.a A() {
      return bjm.dP().a(bks.g, 16.0).a(bks.d);
   }

   protected bsv b(cqb $$0) {
      return new bsu(this, $$0);
   }

   protected boolean B() {
      return false;
   }

   public float a(ear $$0) {
      bjo $$2;
      label17: {
         if (this.cZ() instanceof bjo $$1 && $$1.B()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cb.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(ear $$0, float $$1) {
      this.cb.put($$0, $$1);
   }

   @Override
   public void C() {
   }

   public void E() {
   }

   protected bpf F() {
      return new bpf(this);
   }

   public bpj G() {
      return this.bK;
   }

   public bpk I() {
      return this.cZ() instanceof bjo $$0 ? $$0.I() : this.bL;
   }

   public bpi K() {
      return this.bM;
   }

   public bsv L() {
      return this.cZ() instanceof bjo $$0 ? $$0.L() : this.bN;
   }

   @Nullable
   @Override
   public bjm cN() {
      biw $$0 = this.cQ();
      if (!this.fU() && $$0 instanceof bjo $$1 && $$0.bQ()) {
         return $$1;
      }

      return null;
   }

   public btq M() {
      return this.bW;
   }

   @Nullable
   @Override
   public bjm q() {
      return this.bV;
   }

   public void h(@Nullable bjm $$0) {
      this.bV = $$0;
   }

   @Override
   public boolean a(bja<?> $$0) {
      return $$0 != bja.Q;
   }

   public boolean a(ckb $$0) {
      return false;
   }

   public void N() {
      this.a(djn.m);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, (byte)0);
   }

   public int O() {
      return 80;
   }

   public void P() {
      apf $$0 = this.w();
      if ($$0 != null) {
         this.a($$0, this.eV(), this.eW());
      }
   }

   @Override
   public void aq() {
      super.aq();
      this.dL().ad().a("mobBaseTick");
      if (this.bv() && this.ag.a(1000) < this.bI++) {
         this.s();
         this.P();
      }

      this.dL().ad().c();
   }

   @Override
   protected void e(bhu $$0) {
      this.s();
      super.e($$0);
   }

   private void s() {
      this.bI = -this.O();
   }

   @Override
   public int ed() {
      if (this.bJ > 0) {
         int $$0 = this.bJ;

         for (int $$1 = 0; $$1 < this.bY.size(); $$1++) {
            if (!this.bY.get($$1).b() && this.bR[$$1] <= 1.0F) {
               $$0 += 1 + this.ag.a(3);
            }
         }

         for (int $$2 = 0; $$2 < this.bX.size(); $$2++) {
            if (!this.bX.get($$2).b() && this.bQ[$$2] <= 1.0F) {
               $$0 += 1 + this.ag.a(3);
            }
         }

         return $$0;
      } else {
         return this.bJ;
      }
   }

   public void Q() {
      if (this.dL().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.ag.k() * 0.02;
            double $$2 = this.ag.k() * 0.02;
            double $$3 = this.ag.k() * 0.02;
            double $$4 = 10.0;
            this.dL().a(iv.W, this.c(1.0) - $$1 * 10.0, this.dt() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dL().a(this, (byte)20);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 20) {
         this.Q();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B) {
         this.fR();
         if (this.ah % 5 == 0) {
            this.R();
         }
      }
   }

   protected void R() {
      boolean $$0 = !(this.cN() instanceof bjo);
      boolean $$1 = !(this.cY() instanceof cdt);
      this.bO.a(bqh.a.a, $$0);
      this.bO.a(bqh.a.c, $$0 && $$1);
      this.bO.a(bqh.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bU.a();
      return $$1;
   }

   @Nullable
   protected apf w() {
      return null;
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fK());
      $$0.a("PersistenceRequired", this.ca);
      rc $$1 = new rc();

      for (cjl $$2 : this.bY) {
         qw $$3 = new qw();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      rc $$4 = new rc();

      for (cjl $$5 : this.bX) {
         qw $$6 = new qw();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      rc $$7 = new rc();

      for (float $$8 : this.bR) {
         $$7.add(qz.a($$8));
      }

      $$0.a("ArmorDropChances", $$7);
      rc $$9 = new rc();

      for (float $$10 : this.bQ) {
         $$9.add(qz.a($$10));
      }

      $$0.a("HandDropChances", $$9);
      if (this.ce != null) {
         qw $$11 = new qw();
         if (this.ce instanceof bjm) {
            UUID $$12 = this.ce.cv();
            $$11.a("UUID", $$12);
         } else if (this.ce instanceof byl) {
            gw $$13 = ((byl)this.ce).E();
            $$11.a("X", $$13.u());
            $$11.a("Y", $$13.v());
            $$11.a("Z", $$13.w());
         }

         $$0.a("Leash", $$11);
      } else if (this.cg != null) {
         $$0.a("Leash", this.cg.h());
      }

      $$0.a("LeftHanded", this.fV());
      if (this.cc != null) {
         $$0.a("DeathLootTable", this.cc.toString());
         if (this.cd != 0L) {
            $$0.a("DeathLootTableSeed", this.cd);
         }
      }

      if (this.fU()) {
         $$0.a("NoAI", this.fU());
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.s($$0.q("CanPickUpLoot"));
      }

      this.ca = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         rc $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bY.size(); $$2++) {
            this.bY.set($$2, cjl.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         rc $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bX.size(); $$4++) {
            this.bX.set($$4, cjl.a($$3.a($$4)));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         rc $$5 = $$0.c("ArmorDropChances", 5);

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            this.bR[$$6] = $$5.i($$6);
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         rc $$7 = $$0.c("HandDropChances", 5);

         for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
            this.bQ[$$8] = $$7.i($$8);
         }
      }

      if ($$0.b("Leash", 10)) {
         this.cg = $$0.p("Leash");
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cc = new aez($$0.l("DeathLootTable"));
         this.cd = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(bhu $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cc = null;
   }

   @Override
   public final aez ez() {
      return this.cc == null ? this.S() : this.cc;
   }

   protected aez S() {
      return super.ez();
   }

   @Override
   public long eA() {
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

   @Override
   public void b_() {
      super.b_();
      this.dL().ad().a("looting");
      if (!this.dL().B && this.fK() && this.bv() && !this.ba && this.dL().X().b(cpx.c)) {
         hy $$0 = this.T();

         for (byt $$2 : this.dL().a(byt.class, this.cG().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dG() && !$$2.q().b() && !$$2.y() && this.k($$2.q())) {
               this.b($$2);
            }
         }
      }

      this.dL().ad().c();
   }

   protected hy T() {
      return bS;
   }

   protected void b(byt $$0) {
      cjl $$1 = $$0.q();
      cjl $$2 = this.i($$1.p());
      if (!$$2.b()) {
         this.a($$0);
         this.a($$0, $$2.L());
         $$1.h($$2.L());
         if ($$1.b()) {
            $$0.ak();
         }
      }
   }

   public cjl i(cjl $$0) {
      bjb $$1 = h($$0);
      cjl $$2 = this.c($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bjb.a;
         $$2 = this.c($$1);
         $$3 = $$2.b();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.f($$1);
         if (!$$2.b() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.L() > 1) {
            cjl $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return cjl.b;
      }
   }

   @Override
   protected void b(bjb $$0, cjl $$1) {
      this.a($$0, $$1);
      this.e($$0);
      this.ca = true;
   }

   public void e(bjb $$0) {
      switch ($$0.a()) {
         case a:
            this.bQ[$$0.b()] = 2.0F;
            break;
         case b:
            this.bR[$$0.b()] = 2.0F;
      }
   }

   protected boolean b(cjl $$0, cjl $$1) {
      if ($$1.b()) {
         return true;
      } else if ($$0.d() instanceof ckw) {
         if (!($$1.d() instanceof ckw)) {
            return true;
         } else {
            ckw $$2 = (ckw)$$0.d();
            ckw $$3 = (ckw)$$1.d();
            return $$2.h() != $$3.h() ? $$2.h() > $$3.h() : this.c($$0, $$1);
         }
      } else if ($$0.d() instanceof chj && $$1.d() instanceof chj) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cht && $$1.d() instanceof cht) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cgv $$4) {
         if (cnw.d($$1)) {
            return false;
         } else if (!($$1.d() instanceof cgv)) {
            return true;
         } else {
            cgv $$5 = (cgv)$$1.d();
            if ($$4.e() != $$5.e()) {
               return $$4.e() > $$5.e();
            } else {
               return $$4.f() != $$5.f() ? $$4.f() > $$5.f() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.d() instanceof chv) {
            if ($$1.d() instanceof che) {
               return true;
            }

            if ($$1.d() instanceof chv $$6) {
               chv $$7 = (chv)$$0.d();
               if ($$7.d() != $$6.d()) {
                  return $$7.d() > $$6.d();
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   public boolean c(cjl $$0, cjl $$1) {
      if ($$0.k() >= $$1.k() && (!$$0.u() || $$1.u())) {
         return $$0.u() && $$1.u()
            ? $$0.v().e().stream().anyMatch($$0x -> !$$0x.equals("Damage")) && !$$1.v().e().stream().anyMatch($$0x -> !$$0x.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean j(cjl $$0) {
      return true;
   }

   public boolean k(cjl $$0) {
      return this.j($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean U() {
      return this.bN();
   }

   protected boolean V() {
      return false;
   }

   @Override
   public void dx() {
      if (this.dL().ai() == bhb.a && this.V()) {
         this.ak();
      } else if (!this.fL() && !this.U()) {
         biw $$0 = this.dL().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.f(this);
            int $$2 = this.ag().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.ak();
            }

            int $$4 = this.ag().f().g();
            int $$5 = $$4 * $$4;
            if (this.bb > 600 && this.ag.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.ak();
            } else if ($$1 < (double)$$5) {
               this.bb = 0;
            }
         }
      } else {
         this.bb = 0;
      }
   }

   @Override
   protected final void fh() {
      this.bb++;
      this.dL().ad().a("sensing");
      this.bW.a();
      this.dL().ad().c();
      int $$0 = this.dL().n().ag() + this.ah();
      if ($$0 % 2 != 0 && this.ah > 1) {
         this.dL().ad().a("targetSelector");
         this.bP.a(false);
         this.dL().ad().c();
         this.dL().ad().a("goalSelector");
         this.bO.a(false);
         this.dL().ad().c();
      } else {
         this.dL().ad().a("targetSelector");
         this.bP.a();
         this.dL().ad().c();
         this.dL().ad().a("goalSelector");
         this.bO.a();
         this.dL().ad().c();
      }

      this.dL().ad().a("navigation");
      this.bN.c();
      this.dL().ad().c();
      this.dL().ad().a("mob tick");
      this.X();
      this.dL().ad().c();
      this.dL().ad().a("controls");
      this.dL().ad().a("move");
      this.bL.a();
      this.dL().ad().b("look");
      this.bK.a();
      this.dL().ad().b("jump");
      this.bM.b();
      this.dL().ad().c();
      this.dL().ad().c();
      this.W();
   }

   protected void W() {
      abc.a(this.dL(), this, this.bO);
   }

   protected void X() {
   }

   public int Y() {
      return 40;
   }

   public int Z() {
      return 75;
   }

   public int fH() {
      return 10;
   }

   public void a(biw $$0, float $$1, float $$2) {
      double $$3 = $$0.dq() - this.dq();
      double $$4 = $$0.dw() - this.dw();
      double $$6;
      if ($$0 instanceof bjm $$5) {
         $$6 = $$5.du() - this.du();
      } else {
         $$6 = ($$0.cG().b + $$0.cG().e) / 2.0 - this.du();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(asb.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(asb.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dD(), $$10, $$2));
      this.r(this.a(this.dB(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = asb.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bja<? extends bjo> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      gw $$5 = $$3.d();
      return $$2 == bjq.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(cqc $$0, bjq $$1) {
      return true;
   }

   public boolean a(cqe $$0) {
      return !$$0.d(this.cG()) && $$0.f(this);
   }

   public int fI() {
      return 4;
   }

   public boolean d(int $$0) {
      return false;
   }

   @Override
   public int ct() {
      if (this.q() == null) {
         return 3;
      } else {
         int $$0 = (int)(this.eu() - this.eL() * 0.33F);
         $$0 -= (3 - this.dL().ai().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return $$0 + 3;
      }
   }

   @Override
   public Iterable<cjl> bJ() {
      return this.bX;
   }

   @Override
   public Iterable<cjl> bK() {
      return this.bY;
   }

   @Override
   public cjl c(bjb $$0) {
      switch ($$0.a()) {
         case a:
            return this.bX.get($$0.b());
         case b:
            return this.bY.get($$0.b());
         default:
            return cjl.b;
      }
   }

   @Override
   public void a(bjb $$0, cjl $$1) {
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
   protected void a(bhu $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bjb $$3 : bjb.values()) {
         cjl $$4 = this.c($$3);
         float $$5 = this.f($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.b() && !cnw.e($$4) && ($$2 || $$6) && Math.max(this.ag.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.i()) {
               $$4.b($$4.l() - this.ag.a(1 + this.ag.a(Math.max($$4.l() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, cjl.b);
         }
      }
   }

   protected float f(bjb $$0) {
      return switch ($$0.a()) {
         case a -> this.bQ[$$0.b()];
         case b -> this.bR[$$0.b()];
         default -> 0.0F;
      };
   }

   protected void a(ash $$0, bhc $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dL().ai() == bhb.d ? 0.1F : 0.25F;
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

         for (bjb $$5 : bjb.values()) {
            if ($$5.a() == bjb.a.b) {
               cjl $$6 = this.c($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.b()) {
                  cjg $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cjl($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cjg a(bjb $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cjo.oK;
            } else if ($$1 == 1) {
               return cjo.pa;
            } else if ($$1 == 2) {
               return cjo.oO;
            } else if ($$1 == 3) {
               return cjo.oS;
            } else if ($$1 == 4) {
               return cjo.oW;
            }
         case e:
            if ($$1 == 0) {
               return cjo.oL;
            } else if ($$1 == 1) {
               return cjo.pb;
            } else if ($$1 == 2) {
               return cjo.oP;
            } else if ($$1 == 3) {
               return cjo.oT;
            } else if ($$1 == 4) {
               return cjo.oX;
            }
         case d:
            if ($$1 == 0) {
               return cjo.oM;
            } else if ($$1 == 1) {
               return cjo.pc;
            } else if ($$1 == 2) {
               return cjo.oQ;
            } else if ($$1 == 3) {
               return cjo.oU;
            } else if ($$1 == 4) {
               return cjo.oY;
            }
         case c:
            if ($$1 == 0) {
               return cjo.oN;
            } else if ($$1 == 1) {
               return cjo.pd;
            } else if ($$1 == 2) {
               return cjo.oR;
            } else if ($$1 == 3) {
               return cjo.oV;
            } else if ($$1 == 4) {
               return cjo.oZ;
            }
         default:
            return null;
      }
   }

   protected void b(ash $$0, bhc $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bjb $$3 : bjb.values()) {
         if ($$3.a() == bjb.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(ash $$0, float $$1) {
      if (!this.eS().b() && $$0.i() < 0.25F * $$1) {
         this.a(bjb.a, cnw.a($$0, this.eS(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(ash $$0, float $$1, bjb $$2) {
      cjl $$3 = this.c($$2);
      if (!$$3.b() && $$0.i() < 0.5F * $$1) {
         this.a($$2, cnw.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      ash $$5 = $$0.D_();
      this.a(bks.g).c(new bkq("Random spawn bonus", $$5.a(0.0, 0.11485000000000001), bkq.a.b));
      if ($$5.i() < 0.05F) {
         this.u(true);
      } else {
         this.u(false);
      }

      return $$3;
   }

   public void fJ() {
      this.ca = true;
   }

   public void a(bjb $$0, float $$1) {
      switch ($$0.a()) {
         case a:
            this.bQ[$$0.b()] = $$1;
            break;
         case b:
            this.bR[$$0.b()] = $$1;
      }
   }

   public boolean fK() {
      return this.bZ;
   }

   public void s(boolean $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean f(cjl $$0) {
      bjb $$1 = h($$0);
      return this.c($$1).b() && this.fK();
   }

   public boolean fL() {
      return this.ca;
   }

   @Override
   public final bhe a(cca $$0, bhd $$1) {
      if (!this.bv()) {
         return bhe.d;
      } else if (this.fT() == $$0) {
         this.a(true, !$$0.fT().d);
         this.a(djn.r, $$0);
         return bhe.a(this.dL().B);
      } else {
         bhe $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(djn.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(djn.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bhe c(cca $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      if ($$2.a(cjo.tQ) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bhe.a(this.dL().B);
      } else {
         if ($$2.a(cjo.tR)) {
            bhe $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.d() instanceof ckq) {
            if (this.dL() instanceof akt) {
               ckq $$4 = (ckq)$$2.d();
               Optional<bjo> $$5 = $$4.a($$0, this, (bja<? extends bjo>)this.ag(), (akt)this.dL(), this.dj(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bhe.a : bhe.d;
            } else {
               return bhe.b;
            }
         } else {
            return bhe.d;
         }
      }
   }

   protected void a(cca $$0, bjo $$1) {
   }

   protected bhe b(cca $$0, bhd $$1) {
      return bhe.d;
   }

   public boolean fM() {
      return this.a(this.dl());
   }

   public boolean a(gw $$0) {
      return this.ci == -1.0F ? true : this.ch.j($$0) < (double)(this.ci * this.ci);
   }

   public void a(gw $$0, int $$1) {
      this.ch = $$0;
      this.ci = (float)$$1;
   }

   public gw fN() {
      return this.ch;
   }

   public float fO() {
      return this.ci;
   }

   public void fP() {
      this.ci = -1.0F;
   }

   public boolean fQ() {
      return this.ci != -1.0F;
   }

   @Nullable
   public <T extends bjo> T a(bja<T> $$0, boolean $$1) {
      if (this.dG()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dL());
         if ($$2 == null) {
            return null;
         } else {
            $$2.v(this);
            $$2.a(this.m_());
            $$2.t(this.fU());
            if (this.ac()) {
               $$2.b(this.ad());
               $$2.n(this.cA());
            }

            if (this.fL()) {
               $$2.fJ();
            }

            $$2.m(this.cq());
            if ($$1) {
               $$2.s(this.fK());

               for (bjb $$3 : bjb.values()) {
                  cjl $$4 = this.c($$3);
                  if (!$$4.b()) {
                     $$2.a($$3, $$4.c());
                     $$2.a($$3, this.f($$3));
                  }
               }
            }

            this.dL().b($$2);
            if (this.bN()) {
               biw $$5 = this.cY();
               this.aa();
               $$2.a($$5, true);
            }

            this.ak();
            return $$2;
         }
      }
   }

   protected void fR() {
      if (this.cg != null) {
         this.ga();
      }

      if (this.ce != null) {
         if (!this.bv() || !this.ce.bv()) {
            this.a(true, true);
         }
      }
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.ce != null) {
         this.ce = null;
         this.cg = null;
         if (!this.dL().B && $$1) {
            this.a(cjo.tQ);
         }

         if (!this.dL().B && $$0 && this.dL() instanceof akt) {
            ((akt)this.dL()).k().b(this, new zz(this, null));
         }
      }
   }

   public boolean a(cca $$0) {
      return !this.fS() && !(this instanceof bzg);
   }

   public boolean fS() {
      return this.ce != null;
   }

   @Nullable
   public biw fT() {
      if (this.ce == null && this.cf != 0 && this.dL().B) {
         this.ce = this.dL().a(this.cf);
      }

      return this.ce;
   }

   public void b(biw $$0, boolean $$1) {
      this.ce = $$0;
      this.cg = null;
      if (!this.dL().B && $$1 && this.dL() instanceof akt) {
         ((akt)this.dL()).k().b(this, new zz(this, this.ce));
      }

      if (this.bN()) {
         this.aa();
      }
   }

   public void r(int $$0) {
      this.cf = $$0;
      this.a(false, false);
   }

   @Override
   public boolean a(biw $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.fS()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void ga() {
      if (this.cg != null && this.dL() instanceof akt) {
         if (this.cg.b("UUID")) {
            UUID $$0 = this.cg.a("UUID");
            biw $$1 = ((akt)this.dL()).a($$0);
            if ($$1 != null) {
               this.b($$1, true);
               return;
            }
         } else if (this.cg.b("X", 99) && this.cg.b("Y", 99) && this.cg.b("Z", 99)) {
            gw $$2 = rj.b(this.cg);
            this.b(byn.b(this.dL(), $$2), true);
            return;
         }

         if (this.ah > 100) {
            this.a(cjo.tQ);
            this.cg = null;
         }
      }
   }

   @Override
   public boolean cX() {
      return super.cX() && !this.fU();
   }

   public void t(boolean $$0) {
      byte $$1 = this.an.b(b);
      this.an.b(b, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void u(boolean $$0) {
      byte $$1 = this.an.b(b);
      this.an.b(b, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void v(boolean $$0) {
      byte $$1 = this.an.b(b);
      this.an.b(b, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean fU() {
      return (this.an.b(b) & 1) != 0;
   }

   public boolean fV() {
      return (this.an.b(b) & 2) != 0;
   }

   public boolean fW() {
      return (this.an.b(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bjg fm() {
      return this.fV() ? bjg.a : bjg.b;
   }

   public boolean i(bjm $$0) {
      return this.fX().c($$0.eE());
   }

   protected ehc fX() {
      biw $$0 = this.cY();
      ehc $$3;
      if ($$0 != null) {
         ehc $$1 = $$0.cG();
         ehc $$2 = this.cG();
         $$3 = new ehc(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cG();
      }

      return $$3.c(bT, 0.0, bT);
   }

   @Override
   public boolean C(biw $$0) {
      float $$1 = (float)this.b(bks.c);
      float $$2 = (float)this.b(bks.d);
      if ($$0 instanceof bjm) {
         $$1 += cnw.a(this.eS(), ((bjm)$$0).eR());
         $$2 += (float)cnw.c(this);
      }

      int $$3 = cnw.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dM().b((bjm)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof bjm) {
            ((bjm)$$0).q((double)($$2 * 0.5F), (double)asb.a(this.dB() * (float) (Math.PI / 180.0)), (double)(-asb.b(this.dB() * (float) (Math.PI / 180.0))));
            this.f(this.do().d(0.6, 1.0, 0.6));
         }

         if ($$0 instanceof cca $$5) {
            this.a($$5, this.eS(), $$5.fn() ? $$5.fp() : cjl.b);
         }

         this.a(this, $$0);
         this.A($$0);
      }

      return $$4;
   }

   private void a(cca $$0, cjl $$1, cjl $$2) {
      if (!$$1.b() && !$$2.b() && $$1.d() instanceof cha && $$2.a(cjo.uy)) {
         float $$3 = 0.25F + (float)cnw.g(this) * 0.05F;
         if (this.ag.i() < $$3) {
            $$0.gn().a(cjo.uy, 100);
            this.dL().a($$0, (byte)30);
         }
      }
   }

   protected boolean fY() {
      if (this.dL().N() && !this.dL().B) {
         float $$0 = this.bm();
         gw $$1 = gw.a(this.dq(), this.du(), this.dw());
         boolean $$2 = this.aZ() || this.aA || this.aB;
         if ($$0 > 0.5F && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dL().g($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(aqk<eaf> $$0) {
      if (this.L().p()) {
         super.c($$0);
      } else {
         this.f(this.do().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void fZ() {
      this.c($$0 -> true);
      this.dN().h();
   }

   public void c(Predicate<bqh> $$0) {
      this.bO.a($$0);
   }

   @Override
   protected void cr() {
      super.cr();
      this.a(true, false);
      this.bL().forEach($$0 -> {
         if (!$$0.b()) {
            $$0.f(0);
         }
      });
   }

   @Nullable
   @Override
   public cjl dy() {
      ckq $$0 = ckq.a(this.ag());
      return $$0 == null ? null : new cjl($$0);
   }
}

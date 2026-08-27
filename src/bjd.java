import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bjd extends bjb implements bjx {
   private static final aec<Byte> b = aef.a(bjd.class, aee.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final ib bS = new ib(1, 0, 1);
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
   protected boy bK;
   protected boz bL;
   protected box bM;
   private final bou bU;
   protected bsk bN;
   protected final bpx bO;
   protected final bpx bP;
   @Nullable
   private bjb bV;
   private final btf bW;
   private final hp<cja> bX = hp.a(2, cja.b);
   protected final float[] bQ = new float[2];
   private final hp<cja> bY = hp.a(4, cja.b);
   protected final float[] bR = new float[4];
   private boolean bZ;
   private boolean ca;
   private final Map<eas, Float> cb = Maps.newEnumMap(eas.class);
   @Nullable
   private aeu cc;
   private long cd;
   @Nullable
   private bil ce;
   private int cf;
   @Nullable
   private qu cg;
   private gw ch = gw.b;
   private float ci = -1.0F;

   protected bjd(bip<? extends bjd> $$0, cpq $$1) {
      super($$0, $$1);
      this.bO = new bpx($$1.ae());
      this.bP = new bpx($$1.ae());
      this.bK = new boy(this);
      this.bL = new boz(this);
      this.bM = new box(this);
      this.bU = this.B();
      this.bN = this.b($$1);
      this.bW = new btf(this);
      Arrays.fill(this.bR, 0.085F);
      Arrays.fill(this.bQ, 0.085F);
      if ($$1 != null && !$$1.B) {
         this.w();
      }
   }

   protected void w() {
   }

   public static bkg.a x() {
      return bjb.dO().a(bkh.b, 16.0).a(bkh.g);
   }

   protected bsk b(cpq $$0) {
      return new bsj(this, $$0);
   }

   protected boolean y() {
      return false;
   }

   public float a(eas $$0) {
      bjd $$2;
      label17: {
         if (this.cZ() instanceof bjd $$1 && $$1.y()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cb.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(eas $$0, float $$1) {
      this.cb.put($$0, $$1);
   }

   @Override
   public void z() {
   }

   public void A() {
   }

   protected bou B() {
      return new bou(this);
   }

   public boy D() {
      return this.bK;
   }

   public boz E() {
      return this.cZ() instanceof bjd $$0 ? $$0.E() : this.bL;
   }

   public box F() {
      return this.bM;
   }

   public bsk H() {
      return this.cZ() instanceof bjd $$0 ? $$0.H() : this.bN;
   }

   @Nullable
   @Override
   public bjb cN() {
      bil $$0 = this.cQ();
      if (!this.fQ() && $$0 instanceof bjd $$1 && $$0.bQ()) {
         return $$1;
      }

      return null;
   }

   public btf J() {
      return this.bW;
   }

   @Nullable
   @Override
   public bjb j() {
      return this.bV;
   }

   public void h(@Nullable bjb $$0) {
      this.bV = $$0;
   }

   @Override
   public boolean a(bip<?> $$0) {
      return $$0 != bip.Q;
   }

   public boolean a(cjq $$0) {
      return false;
   }

   public void K() {
      this.a(djo.m);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, (byte)0);
   }

   public int L() {
      return 80;
   }

   public void M() {
      aoy $$0 = this.r();
      if ($$0 != null) {
         this.a($$0, this.eU(), this.eV());
      }
   }

   @Override
   public void aq() {
      super.aq();
      this.dK().ad().a("mobBaseTick");
      if (this.bv() && this.ag.a(1000) < this.bI++) {
         this.p();
         this.M();
      }

      this.dK().ad().c();
   }

   @Override
   protected void e(bhj $$0) {
      this.p();
      super.e($$0);
   }

   private void p() {
      this.bI = -this.L();
   }

   @Override
   public int ec() {
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

   public void N() {
      if (this.dK().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.ag.k() * 0.02;
            double $$2 = this.ag.k() * 0.02;
            double $$3 = this.ag.k() * 0.02;
            double $$4 = 10.0;
            this.dK().a(ix.W, this.c(1.0) - $$1 * 10.0, this.ds() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dK().a(this, (byte)20);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 20) {
         this.N();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dK().B) {
         this.fN();
         if (this.ah % 5 == 0) {
            this.O();
         }
      }
   }

   protected void O() {
      boolean $$0 = !(this.cN() instanceof bjd);
      boolean $$1 = !(this.cY() instanceof cdi);
      this.bO.a(bpw.a.a, $$0);
      this.bO.a(bpw.a.c, $$0 && $$1);
      this.bO.a(bpw.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bU.a();
      return $$1;
   }

   @Nullable
   protected aoy r() {
      return null;
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fG());
      $$0.a("PersistenceRequired", this.ca);
      ra $$1 = new ra();

      for (cja $$2 : this.bY) {
         qu $$3 = new qu();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      ra $$4 = new ra();

      for (cja $$5 : this.bX) {
         qu $$6 = new qu();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      ra $$7 = new ra();

      for (float $$8 : this.bR) {
         $$7.add(qx.a($$8));
      }

      $$0.a("ArmorDropChances", $$7);
      ra $$9 = new ra();

      for (float $$10 : this.bQ) {
         $$9.add(qx.a($$10));
      }

      $$0.a("HandDropChances", $$9);
      if (this.ce != null) {
         qu $$11 = new qu();
         if (this.ce instanceof bjb) {
            UUID $$12 = this.ce.cv();
            $$11.a("UUID", $$12);
         } else if (this.ce instanceof bya) {
            gw $$13 = ((bya)this.ce).y();
            $$11.a("X", $$13.u());
            $$11.a("Y", $$13.v());
            $$11.a("Z", $$13.w());
         }

         $$0.a("Leash", $$11);
      } else if (this.cg != null) {
         $$0.a("Leash", this.cg.h());
      }

      $$0.a("LeftHanded", this.fR());
      if (this.cc != null) {
         $$0.a("DeathLootTable", this.cc.toString());
         if (this.cd != 0L) {
            $$0.a("DeathLootTableSeed", this.cd);
         }
      }

      if (this.fQ()) {
         $$0.a("NoAI", this.fQ());
      }
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.s($$0.q("CanPickUpLoot"));
      }

      this.ca = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         ra $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bY.size(); $$2++) {
            this.bY.set($$2, cja.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         ra $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bX.size(); $$4++) {
            this.bX.set($$4, cja.a($$3.a($$4)));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         ra $$5 = $$0.c("ArmorDropChances", 5);

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            this.bR[$$6] = $$5.i($$6);
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         ra $$7 = $$0.c("HandDropChances", 5);

         for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
            this.bQ[$$8] = $$7.i($$8);
         }
      }

      if ($$0.b("Leash", 10)) {
         this.cg = $$0.p("Leash");
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cc = new aeu($$0.l("DeathLootTable"));
         this.cd = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(bhj $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cc = null;
   }

   @Override
   public final aeu ey() {
      return this.cc == null ? this.P() : this.cc;
   }

   protected aeu P() {
      return super.ey();
   }

   @Override
   public long ez() {
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
      this.dK().ad().a("looting");
      if (!this.dK().B && this.fG() && this.bv() && !this.ba && this.dK().X().b(cpm.c)) {
         ib $$0 = this.Q();

         for (byi $$2 : this.dK().a(byi.class, this.cG().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dF() && !$$2.j().b() && !$$2.r() && this.k($$2.j())) {
               this.b($$2);
            }
         }
      }

      this.dK().ad().c();
   }

   protected ib Q() {
      return bS;
   }

   protected void b(byi $$0) {
      cja $$1 = $$0.j();
      cja $$2 = this.i($$1.p());
      if (!$$2.b()) {
         this.a($$0);
         this.a($$0, $$2.L());
         $$1.h($$2.L());
         if ($$1.b()) {
            $$0.ak();
         }
      }
   }

   public cja i(cja $$0) {
      biq $$1 = h($$0);
      cja $$2 = this.c($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = biq.a;
         $$2 = this.c($$1);
         $$3 = $$2.b();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.f($$1);
         if (!$$2.b() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.L() > 1) {
            cja $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return cja.b;
      }
   }

   @Override
   protected void b(biq $$0, cja $$1) {
      this.a($$0, $$1);
      this.e($$0);
      this.ca = true;
   }

   public void e(biq $$0) {
      switch ($$0.a()) {
         case a:
            this.bQ[$$0.b()] = 2.0F;
            break;
         case b:
            this.bR[$$0.b()] = 2.0F;
      }
   }

   protected boolean b(cja $$0, cja $$1) {
      if ($$1.b()) {
         return true;
      } else if ($$0.d() instanceof ckl) {
         if (!($$1.d() instanceof ckl)) {
            return true;
         } else {
            ckl $$2 = (ckl)$$0.d();
            ckl $$3 = (ckl)$$1.d();
            return $$2.h() != $$3.h() ? $$2.h() > $$3.h() : this.c($$0, $$1);
         }
      } else if ($$0.d() instanceof cgy && $$1.d() instanceof cgy) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof chi && $$1.d() instanceof chi) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cgk $$4) {
         if (cnl.d($$1)) {
            return false;
         } else if (!($$1.d() instanceof cgk)) {
            return true;
         } else {
            cgk $$5 = (cgk)$$1.d();
            if ($$4.e() != $$5.e()) {
               return $$4.e() > $$5.e();
            } else {
               return $$4.f() != $$5.f() ? $$4.f() > $$5.f() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.d() instanceof chk) {
            if ($$1.d() instanceof cgt) {
               return true;
            }

            if ($$1.d() instanceof chk $$6) {
               chk $$7 = (chk)$$0.d();
               if ($$7.d() != $$6.d()) {
                  return $$7.d() > $$6.d();
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   public boolean c(cja $$0, cja $$1) {
      if ($$0.k() >= $$1.k() && (!$$0.u() || $$1.u())) {
         return $$0.u() && $$1.u()
            ? $$0.v().e().stream().anyMatch($$0x -> !$$0x.equals("Damage")) && !$$1.v().e().stream().anyMatch($$0x -> !$$0x.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean j(cja $$0) {
      return true;
   }

   public boolean k(cja $$0) {
      return this.j($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean R() {
      return this.bN();
   }

   protected boolean S() {
      return false;
   }

   @Override
   public void dw() {
      if (this.dK().ai() == bgq.a && this.S()) {
         this.ak();
      } else if (!this.fH() && !this.R()) {
         bil $$0 = this.dK().a(this, -1.0);
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
   protected final void ff() {
      this.bb++;
      this.dK().ad().a("sensing");
      this.bW.a();
      this.dK().ad().c();
      int $$0 = this.dK().n().ag() + this.ah();
      if ($$0 % 2 != 0 && this.ah > 1) {
         this.dK().ad().a("targetSelector");
         this.bP.a(false);
         this.dK().ad().c();
         this.dK().ad().a("goalSelector");
         this.bO.a(false);
         this.dK().ad().c();
      } else {
         this.dK().ad().a("targetSelector");
         this.bP.a();
         this.dK().ad().c();
         this.dK().ad().a("goalSelector");
         this.bO.a();
         this.dK().ad().c();
      }

      this.dK().ad().a("navigation");
      this.bN.c();
      this.dK().ad().c();
      this.dK().ad().a("mob tick");
      this.V();
      this.dK().ad().c();
      this.dK().ad().a("controls");
      this.dK().ad().a("move");
      this.bL.a();
      this.dK().ad().b("look");
      this.bK.a();
      this.dK().ad().b("jump");
      this.bM.b();
      this.dK().ad().c();
      this.dK().ad().c();
      this.T();
   }

   protected void T() {
      aay.a(this.dK(), this, this.bO);
   }

   protected void V() {
   }

   public int W() {
      return 40;
   }

   public int X() {
      return 75;
   }

   public int Y() {
      return 10;
   }

   public void a(bil $$0, float $$1, float $$2) {
      double $$3 = $$0.dp() - this.dp();
      double $$4 = $$0.dv() - this.dv();
      double $$6;
      if ($$0 instanceof bjb $$5) {
         $$6 = $$5.dt() - this.dt();
      } else {
         $$6 = ($$0.cG().b + $$0.cG().e) / 2.0 - this.dt();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(ars.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(ars.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dC(), $$10, $$2));
      this.r(this.a(this.dA(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ars.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bip<? extends bjd> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      gw $$5 = $$3.d();
      return $$2 == bjf.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(cpr $$0, bjf $$1) {
      return true;
   }

   public boolean a(cpt $$0) {
      return !$$0.d(this.cG()) && $$0.f(this);
   }

   public int Z() {
      return 4;
   }

   public boolean d(int $$0) {
      return false;
   }

   @Override
   public int ct() {
      if (this.j() == null) {
         return 3;
      } else {
         int $$0 = (int)(this.et() - this.eK() * 0.33F);
         $$0 -= (3 - this.dK().ai().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return $$0 + 3;
      }
   }

   @Override
   public Iterable<cja> bJ() {
      return this.bX;
   }

   @Override
   public Iterable<cja> bK() {
      return this.bY;
   }

   @Override
   public cja c(biq $$0) {
      switch ($$0.a()) {
         case a:
            return this.bX.get($$0.b());
         case b:
            return this.bY.get($$0.b());
         default:
            return cja.b;
      }
   }

   @Override
   public void a(biq $$0, cja $$1) {
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
   protected void a(bhj $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (biq $$3 : biq.values()) {
         cja $$4 = this.c($$3);
         float $$5 = this.f($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.b() && !cnl.e($$4) && ($$2 || $$6) && Math.max(this.ag.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.i()) {
               $$4.b($$4.l() - this.ag.a(1 + this.ag.a(Math.max($$4.l() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, cja.b);
         }
      }
   }

   protected float f(biq $$0) {
      return switch ($$0.a()) {
         case a -> this.bQ[$$0.b()];
         case b -> this.bR[$$0.b()];
         default -> 0.0F;
      };
   }

   protected void a(arx $$0, bgr $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dK().ai() == bgq.d ? 0.1F : 0.25F;
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

         for (biq $$5 : biq.values()) {
            if ($$5.a() == biq.a.b) {
               cja $$6 = this.c($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.b()) {
                  civ $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cja($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static civ a(biq $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cjd.oK;
            } else if ($$1 == 1) {
               return cjd.pa;
            } else if ($$1 == 2) {
               return cjd.oO;
            } else if ($$1 == 3) {
               return cjd.oS;
            } else if ($$1 == 4) {
               return cjd.oW;
            }
         case e:
            if ($$1 == 0) {
               return cjd.oL;
            } else if ($$1 == 1) {
               return cjd.pb;
            } else if ($$1 == 2) {
               return cjd.oP;
            } else if ($$1 == 3) {
               return cjd.oT;
            } else if ($$1 == 4) {
               return cjd.oX;
            }
         case d:
            if ($$1 == 0) {
               return cjd.oM;
            } else if ($$1 == 1) {
               return cjd.pc;
            } else if ($$1 == 2) {
               return cjd.oQ;
            } else if ($$1 == 3) {
               return cjd.oU;
            } else if ($$1 == 4) {
               return cjd.oY;
            }
         case c:
            if ($$1 == 0) {
               return cjd.oN;
            } else if ($$1 == 1) {
               return cjd.pd;
            } else if ($$1 == 2) {
               return cjd.oR;
            } else if ($$1 == 3) {
               return cjd.oV;
            } else if ($$1 == 4) {
               return cjd.oZ;
            }
         default:
            return null;
      }
   }

   protected void b(arx $$0, bgr $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (biq $$3 : biq.values()) {
         if ($$3.a() == biq.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(arx $$0, float $$1) {
      if (!this.eR().b() && $$0.i() < 0.25F * $$1) {
         this.a(biq.a, cnl.a($$0, this.eR(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(arx $$0, float $$1, biq $$2) {
      cja $$3 = this.c($$2);
      if (!$$3.b() && $$0.i() < 0.5F * $$1) {
         this.a($$2, cnl.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      arx $$5 = $$0.y_();
      this.a(bkh.b).c(new bkf("Random spawn bonus", $$5.a(0.0, 0.11485000000000001), bkf.a.b));
      if ($$5.i() < 0.05F) {
         this.u(true);
      } else {
         this.u(false);
      }

      return $$3;
   }

   public void fF() {
      this.ca = true;
   }

   public void a(biq $$0, float $$1) {
      switch ($$0.a()) {
         case a:
            this.bQ[$$0.b()] = $$1;
            break;
         case b:
            this.bR[$$0.b()] = $$1;
      }
   }

   public boolean fG() {
      return this.bZ;
   }

   public void s(boolean $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean f(cja $$0) {
      biq $$1 = h($$0);
      return this.c($$1).b() && this.fG();
   }

   public boolean fH() {
      return this.ca;
   }

   @Override
   public final bgt a(cbp $$0, bgs $$1) {
      if (!this.bv()) {
         return bgt.d;
      } else if (this.fP() == $$0) {
         this.a(true, !$$0.fR().d);
         this.a(djo.r, $$0);
         return bgt.a(this.dK().B);
      } else {
         bgt $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(djo.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(djo.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bgt c(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if ($$2.a(cjd.tQ) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bgt.a(this.dK().B);
      } else {
         if ($$2.a(cjd.tR)) {
            bgt $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.d() instanceof ckf) {
            if (this.dK() instanceof akn) {
               ckf $$4 = (ckf)$$2.d();
               Optional<bjd> $$5 = $$4.a($$0, this, (bip<? extends bjd>)this.ag(), (akn)this.dK(), this.di(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bgt.a : bgt.d;
            } else {
               return bgt.b;
            }
         } else {
            return bgt.d;
         }
      }
   }

   protected void a(cbp $$0, bjd $$1) {
   }

   protected bgt b(cbp $$0, bgs $$1) {
      return bgt.d;
   }

   public boolean fI() {
      return this.a(this.dk());
   }

   public boolean a(gw $$0) {
      return this.ci == -1.0F ? true : this.ch.j($$0) < (double)(this.ci * this.ci);
   }

   public void a(gw $$0, int $$1) {
      this.ch = $$0;
      this.ci = (float)$$1;
   }

   public gw fJ() {
      return this.ch;
   }

   public float fK() {
      return this.ci;
   }

   public void fL() {
      this.ci = -1.0F;
   }

   public boolean fM() {
      return this.ci != -1.0F;
   }

   @Nullable
   public <T extends bjd> T a(bip<T> $$0, boolean $$1) {
      if (this.dF()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dK());
         if ($$2 == null) {
            return null;
         } else {
            $$2.v(this);
            $$2.a(this.i_());
            $$2.t(this.fQ());
            if (this.ac()) {
               $$2.b(this.ad());
               $$2.n(this.cA());
            }

            if (this.fH()) {
               $$2.fF();
            }

            $$2.m(this.cq());
            if ($$1) {
               $$2.s(this.fG());

               for (biq $$3 : biq.values()) {
                  cja $$4 = this.c($$3);
                  if (!$$4.b()) {
                     $$2.a($$3, $$4.c());
                     $$2.a($$3, this.f($$3));
                  }
               }
            }

            this.dK().b($$2);
            if (this.bN()) {
               bil $$5 = this.cY();
               this.aa();
               $$2.a($$5, true);
            }

            this.ak();
            return $$2;
         }
      }
   }

   protected void fN() {
      if (this.cg != null) {
         this.fW();
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
         if (!this.dK().B && $$1) {
            this.a(cjd.tQ);
         }

         if (!this.dK().B && $$0 && this.dK() instanceof akn) {
            ((akn)this.dK()).k().b(this, new zv(this, null));
         }
      }
   }

   public boolean a(cbp $$0) {
      return !this.fO() && !(this instanceof byv);
   }

   public boolean fO() {
      return this.ce != null;
   }

   @Nullable
   public bil fP() {
      if (this.ce == null && this.cf != 0 && this.dK().B) {
         this.ce = this.dK().a(this.cf);
      }

      return this.ce;
   }

   public void b(bil $$0, boolean $$1) {
      this.ce = $$0;
      this.cg = null;
      if (!this.dK().B && $$1 && this.dK() instanceof akn) {
         ((akn)this.dK()).k().b(this, new zv(this, this.ce));
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
   public boolean a(bil $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.fO()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void fW() {
      if (this.cg != null && this.dK() instanceof akn) {
         if (this.cg.b("UUID")) {
            UUID $$0 = this.cg.a("UUID");
            bil $$1 = ((akn)this.dK()).a($$0);
            if ($$1 != null) {
               this.b($$1, true);
               return;
            }
         } else if (this.cg.b("X", 99) && this.cg.b("Y", 99) && this.cg.b("Z", 99)) {
            gw $$2 = rg.b(this.cg);
            this.b(byc.b(this.dK(), $$2), true);
            return;
         }

         if (this.ah > 100) {
            this.a(cjd.tQ);
            this.cg = null;
         }
      }
   }

   @Override
   public boolean cX() {
      return super.cX() && !this.fQ();
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

   public boolean fQ() {
      return (this.an.b(b) & 1) != 0;
   }

   public boolean fR() {
      return (this.an.b(b) & 2) != 0;
   }

   public boolean fS() {
      return (this.an.b(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public biv fk() {
      return this.fR() ? biv.a : biv.b;
   }

   public boolean i(bjb $$0) {
      return this.fT().c($$0.eD());
   }

   protected ehd fT() {
      bil $$0 = this.cY();
      ehd $$3;
      if ($$0 != null) {
         ehd $$1 = $$0.cG();
         ehd $$2 = this.cG();
         $$3 = new ehd(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cG();
      }

      return $$3.c(bT, 0.0, bT);
   }

   @Override
   public boolean C(bil $$0) {
      float $$1 = (float)this.b(bkh.f);
      float $$2 = (float)this.b(bkh.g);
      if ($$0 instanceof bjb) {
         $$1 += cnl.a(this.eR(), ((bjb)$$0).eQ());
         $$2 += (float)cnl.c(this);
      }

      int $$3 = cnl.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dL().b((bjb)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof bjb) {
            ((bjb)$$0).q((double)($$2 * 0.5F), (double)ars.a(this.dA() * (float) (Math.PI / 180.0)), (double)(-ars.b(this.dA() * (float) (Math.PI / 180.0))));
            this.f(this.dn().d(0.6, 1.0, 0.6));
         }

         if ($$0 instanceof cbp $$5) {
            this.a($$5, this.eR(), $$5.fl() ? $$5.fn() : cja.b);
         }

         this.a(this, $$0);
         this.A($$0);
      }

      return $$4;
   }

   private void a(cbp $$0, cja $$1, cja $$2) {
      if (!$$1.b() && !$$2.b() && $$1.d() instanceof cgp && $$2.a(cjd.uy)) {
         float $$3 = 0.25F + (float)cnl.g(this) * 0.05F;
         if (this.ag.i() < $$3) {
            $$0.gl().a(cjd.uy, 100);
            this.dK().a($$0, (byte)30);
         }
      }
   }

   protected boolean fU() {
      if (this.dK().N() && !this.dK().B) {
         float $$0 = this.bm();
         gw $$1 = gw.a(this.dp(), this.dt(), this.dv());
         boolean $$2 = this.aZ() || this.aA || this.aB;
         if ($$0 > 0.5F && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dK().g($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(aqd<eag> $$0) {
      if (this.H().p()) {
         super.c($$0);
      } else {
         this.f(this.dn().b(0.0, 0.3, 0.0));
      }
   }

   public void fV() {
      this.c($$0 -> true);
      this.dM().h();
   }

   public void c(Predicate<bpw> $$0) {
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
   public cja dx() {
      ckf $$0 = ckf.a(this.ag());
      return $$0 == null ? null : new cja($$0);
   }
}

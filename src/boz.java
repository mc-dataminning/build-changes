import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class boz extends box implements bpu {
   private static final aii<Byte> b = ail.a(boz.class, aik.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final jf bU = new jf(1, 0, 1);
   public static final float g = 0.15F;
   public static final float bC = 0.55F;
   public static final float bD = 0.5F;
   public static final float bE = 0.25F;
   public static final String bF = "Leash";
   public static final float bG = 0.085F;
   public static final int bH = 2;
   public static final int bI = 2;
   private static final double bV = Math.sqrt(2.04F) - 0.6F;
   public int bJ;
   protected int bK;
   protected buw bL;
   protected bux bM;
   protected buv bN;
   private final bus bW;
   protected byi bO;
   protected final bvv bP;
   protected final bvv bQ;
   @Nullable
   private box bX;
   private final bzf bY;
   private final iu<cpq> bZ = iu.a(2, cpq.h);
   protected final float[] bR = new float[2];
   private final iu<cpq> ca = iu.a(4, cpq.h);
   protected final float[] bS = new float[4];
   private cpq cb = cpq.h;
   protected float bT;
   private boolean cc;
   private boolean cd;
   private final Map<eic, Float> ce = Maps.newEnumMap(eic.class);
   @Nullable
   private ajc cf;
   private long cg;
   @Nullable
   private bof ch;
   private int ci;
   @Nullable
   private sy cj;
   private ib ck = ib.c;
   private float cl = -1.0F;

   protected boz(bol<? extends boz> $$0, cwe $$1) {
      super($$0, $$1);
      this.bP = new bvv($$1.af());
      this.bQ = new bvv($$1.af());
      this.bL = new buw(this);
      this.bM = new bux(this);
      this.bN = new buv(this);
      this.bW = this.H();
      this.bO = this.b($$1);
      this.bY = new bzf(this);
      Arrays.fill(this.bS, 0.085F);
      Arrays.fill(this.bR, 0.085F);
      this.bT = 0.085F;
      if ($$1 != null && !$$1.B) {
         this.B();
      }
   }

   protected void B() {
   }

   public static bqd.a C() {
      return box.dO().a(bqe.i, 16.0).a(bqe.d);
   }

   protected byi b(cwe $$0) {
      return new byh(this, $$0);
   }

   protected boolean D() {
      return false;
   }

   public float a(eic $$0) {
      boz $$2;
      label17: {
         if (this.cX() instanceof boz $$1 && $$1.D()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.ce.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(eic $$0, float $$1) {
      this.ce.put($$0, $$1);
   }

   @Override
   public void E() {
   }

   public void G() {
   }

   protected bus H() {
      return new bus(this);
   }

   public buw I() {
      return this.bL;
   }

   public bux K() {
      return this.cX() instanceof boz $$0 ? $$0.K() : this.bM;
   }

   public buv M() {
      return this.bN;
   }

   public byi N() {
      return this.cX() instanceof boz $$0 ? $$0.N() : this.bO;
   }

   @Nullable
   @Override
   public box cK() {
      bof $$0 = this.cN();
      if (!this.gb() && $$0 instanceof boz $$1 && $$0.bO()) {
         return $$1;
      }

      return null;
   }

   public bzf O() {
      return this.bY;
   }

   @Nullable
   @Override
   public box q() {
      return this.bX;
   }

   public void h(@Nullable box $$0) {
      this.bX = $$0;
   }

   @Override
   public boolean a(bol<?> $$0) {
      return $$0 != bol.S;
   }

   public boolean a(cqg $$0) {
      return false;
   }

   public void P() {
      this.b(dqr.m);
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
      this.dJ().ae().a("mobBaseTick");
      if (this.bx() && this.af.a(1000) < this.bJ++) {
         this.u();
         this.R();
      }

      this.dJ().ae().c();
   }

   @Override
   protected void e(bne $$0) {
      this.u();
      super.e($$0);
   }

   private void u() {
      this.bJ = -this.Q();
   }

   @Override
   public int ed() {
      if (this.bK > 0) {
         int $$0 = this.bK;

         for (int $$1 = 0; $$1 < this.ca.size(); $$1++) {
            if (!this.ca.get($$1).b() && this.bS[$$1] <= 1.0F) {
               $$0 += 1 + this.af.a(3);
            }
         }

         for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
            if (!this.bZ.get($$2).b() && this.bR[$$2] <= 1.0F) {
               $$0 += 1 + this.af.a(3);
            }
         }

         if (!this.cb.b() && this.bT <= 1.0F) {
            $$0 += 1 + this.af.a(3);
         }

         return $$0;
      } else {
         return this.bK;
      }
   }

   public void S() {
      if (this.dJ().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.af.k() * 0.02;
            double $$2 = this.af.k() * 0.02;
            double $$3 = this.af.k() * 0.02;
            double $$4 = 10.0;
            this.dJ().a(kb.Y, this.c(1.0) - $$1 * 10.0, this.dr() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dJ().a(this, (byte)20);
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
      if (!this.dJ().B) {
         this.fY();
         if (this.ag % 5 == 0) {
            this.T();
         }
      }
   }

   protected void T() {
      boolean $$0 = !(this.cK() instanceof boz);
      boolean $$1 = !(this.cW() instanceof cjv);
      this.bP.a(bvu.a.a, $$0);
      this.bP.a(bvu.a.c, $$0 && $$1);
      this.bP.a(bvu.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bW.a();
      return $$1;
   }

   @Nullable
   protected ato y() {
      return null;
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fR());
      $$0.a("PersistenceRequired", this.cd);
      te $$1 = new te();

      for (cpq $$2 : this.ca) {
         sy $$3 = new sy();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      te $$4 = new te();

      for (float $$5 : this.bS) {
         $$4.add(tb.a($$5));
      }

      $$0.a("ArmorDropChances", $$4);
      te $$6 = new te();

      for (cpq $$7 : this.bZ) {
         sy $$8 = new sy();
         if (!$$7.b()) {
            $$7.b($$8);
         }

         $$6.add($$8);
      }

      $$0.a("HandItems", $$6);
      te $$9 = new te();

      for (float $$10 : this.bR) {
         $$9.add(tb.a($$10));
      }

      $$0.a("HandDropChances", $$9);
      if (!this.cb.b()) {
         $$0.a("body_armor_item", this.cb.b(new sy()));
         $$0.a("body_armor_drop_chance", this.bT);
      }

      if (this.ch != null) {
         sy $$11 = new sy();
         if (this.ch instanceof box) {
            UUID $$12 = this.ch.ct();
            $$11.a("UUID", $$12);
         } else if (this.ch instanceof ced) {
            ib $$13 = ((ced)this.ch).E();
            $$11.a("X", $$13.u());
            $$11.a("Y", $$13.v());
            $$11.a("Z", $$13.w());
         }

         $$0.a("Leash", $$11);
      } else if (this.cj != null) {
         $$0.a("Leash", this.cj.h());
      }

      $$0.a("LeftHanded", this.gc());
      if (this.cf != null) {
         $$0.a("DeathLootTable", this.cf.toString());
         if (this.cg != 0L) {
            $$0.a("DeathLootTableSeed", this.cg);
         }
      }

      if (this.gb()) {
         $$0.a("NoAI", this.gb());
      }
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.s($$0.q("CanPickUpLoot"));
      }

      this.cd = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         te $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ca.size(); $$2++) {
            this.ca.set($$2, cpq.a($$1.a($$2)));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         te $$3 = $$0.c("ArmorDropChances", 5);

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            this.bS[$$4] = $$3.i($$4);
         }
      }

      if ($$0.b("HandItems", 9)) {
         te $$5 = $$0.c("HandItems", 10);

         for (int $$6 = 0; $$6 < this.bZ.size(); $$6++) {
            this.bZ.set($$6, cpq.a($$5.a($$6)));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         te $$7 = $$0.c("HandDropChances", 5);

         for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
            this.bR[$$8] = $$7.i($$8);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cb = cpq.a($$0.p("body_armor_item"));
         this.bT = $$0.j("body_armor_drop_chance");
      }

      if ($$0.b("Leash", 10)) {
         this.cj = $$0.p("Leash");
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cf = new ajc($$0.l("DeathLootTable"));
         this.cg = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(bne $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cf = null;
   }

   @Override
   public final ajc ez() {
      return this.cf == null ? this.U() : this.cf;
   }

   protected ajc U() {
      return super.ez();
   }

   @Override
   public long eA() {
      return this.cg;
   }

   public void A(float $$0) {
      this.bn = $$0;
   }

   public void B(float $$0) {
      this.bm = $$0;
   }

   public void C(float $$0) {
      this.bl = $$0;
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
      this.dJ().ae().a("looting");
      if (!this.dJ().B && this.fR() && this.bx() && !this.bb && this.dJ().Z().b(cwa.c)) {
         jf $$0 = this.W();

         for (cel $$2 : this.dJ().a(cel.class, this.cE().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dE() && !$$2.q().b() && !$$2.z() && this.k($$2.q())) {
               this.b($$2);
            }
         }
      }

      this.dJ().ae().c();
   }

   protected jf W() {
      return bU;
   }

   protected void b(cel $$0) {
      cpq $$1 = $$0.q();
      cpq $$2 = this.i($$1.q());
      if (!$$2.b()) {
         this.a($$0);
         this.a($$0, $$2.M());
         $$1.h($$2.M());
         if ($$1.b()) {
            $$0.am();
         }
      }
   }

   public cpq i(cpq $$0) {
      bom $$1 = h($$0);
      cpq $$2 = this.c($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bom.a;
         $$2 = this.c($$1);
         $$3 = $$2.b();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.f($$1);
         if (!$$2.b() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.M() > 1) {
            cpq $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return cpq.h;
      }
   }

   @Override
   protected void b(bom $$0, cpq $$1) {
      this.a($$0, $$1);
      this.e($$0);
      this.cd = true;
   }

   public void e(bom $$0) {
      switch ($$0.a()) {
         case a:
            this.bR[$$0.b()] = 2.0F;
            break;
         case b:
            this.bS[$$0.b()] = 2.0F;
            break;
         case c:
            this.bT = 2.0F;
      }
   }

   protected boolean b(cpq $$0, cpq $$1) {
      if ($$1.b()) {
         return true;
      } else if ($$0.d() instanceof crb) {
         if (!($$1.d() instanceof crb)) {
            return true;
         } else {
            crb $$2 = (crb)$$0.d();
            crb $$3 = (crb)$$1.d();
            return $$2.h() != $$3.h() ? $$2.h() > $$3.h() : this.c($$0, $$1);
         }
      } else if ($$0.d() instanceof cnq && $$1.d() instanceof cnq) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof coa && $$1.d() instanceof coa) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cnc $$4) {
         if (cua.d($$1)) {
            return false;
         } else if (!($$1.d() instanceof cnc)) {
            return true;
         } else {
            cnc $$5 = (cnc)$$1.d();
            if ($$4.g() != $$5.g()) {
               return $$4.g() > $$5.g();
            } else {
               return $$4.h() != $$5.h() ? $$4.h() > $$5.h() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.d() instanceof coc) {
            if ($$1.d() instanceof cnl) {
               return true;
            }

            if ($$1.d() instanceof coc $$6) {
               coc $$7 = (coc)$$0.d();
               if ($$7.c() != $$6.c()) {
                  return $$7.c() > $$6.c();
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   public boolean c(cpq $$0, cpq $$1) {
      if ($$0.l() >= $$1.l() && (!$$0.v() || $$1.v())) {
         return $$0.v() && $$1.v()
            ? $$0.w().e().stream().anyMatch($$0x -> !$$0x.equals("Damage")) && !$$1.w().e().stream().anyMatch($$0x -> !$$0x.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean j(cpq $$0) {
      return true;
   }

   public boolean k(cpq $$0) {
      return this.j($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean X() {
      return this.bL();
   }

   protected boolean Y() {
      return false;
   }

   @Override
   public void dv() {
      if (this.dJ().aj() == bmi.a && this.Y()) {
         this.am();
      } else if (!this.fS() && !this.X()) {
         bof $$0 = this.dJ().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.f(this);
            int $$2 = this.ai().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.am();
            }

            int $$4 = this.ai().f().g();
            int $$5 = $$4 * $$4;
            if (this.bc > 600 && this.af.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.am();
            } else if ($$1 < (double)$$5) {
               this.bc = 0;
            }
         }
      } else {
         this.bc = 0;
      }
   }

   @Override
   protected final void fk() {
      this.bc++;
      bjc $$0 = this.dJ().ae();
      $$0.a("sensing");
      this.bY.a();
      $$0.c();
      int $$1 = this.dJ().o().al() + this.aj();
      if ($$1 % 2 != 0 && this.ag > 1) {
         $$0.a("targetSelector");
         this.bQ.a(false);
         $$0.c();
         $$0.a("goalSelector");
         this.bP.a(false);
         $$0.c();
      } else {
         $$0.a("targetSelector");
         this.bQ.a();
         $$0.c();
         $$0.a("goalSelector");
         this.bP.a();
         $$0.c();
      }

      $$0.a("navigation");
      this.bO.c();
      $$0.c();
      $$0.a("mob tick");
      this.aa();
      $$0.c();
      $$0.a("controls");
      $$0.a("move");
      this.bM.a();
      $$0.b("look");
      this.bL.a();
      $$0.b("jump");
      this.bN.b();
      $$0.c();
      $$0.c();
      this.Z();
   }

   protected void Z() {
      aes.a(this.dJ(), this, this.bP);
   }

   protected void aa() {
   }

   public int ab() {
      return 40;
   }

   public int fJ() {
      return 75;
   }

   protected void fK() {
      float $$0 = (float)this.fJ();
      float $$1 = this.cm();
      float $$2 = awm.g(this.aV - $$1);
      float $$3 = awm.a(awm.g(this.aV - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.n($$4);
   }

   public int fL() {
      return 10;
   }

   public void a(bof $$0, float $$1, float $$2) {
      double $$3 = $$0.do() - this.do();
      double $$4 = $$0.du() - this.du();
      double $$6;
      if ($$0 instanceof box $$5) {
         $$6 = $$5.ds() - this.ds();
      } else {
         $$6 = ($$0.cE().b + $$0.cE().e) / 2.0 - this.ds();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(awm.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(awm.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dB(), $$10, $$2));
      this.r(this.a(this.dz(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = awm.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bol<? extends boz> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      ib $$5 = $$3.d();
      return $$2 == bpb.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(cwf $$0, bpb $$1) {
      return true;
   }

   public boolean a(cwh $$0) {
      return !$$0.d(this.cE()) && $$0.f(this);
   }

   public int fM() {
      return 4;
   }

   public boolean d(int $$0) {
      return false;
   }

   @Override
   public int cr() {
      if (this.q() == null) {
         return 3;
      } else {
         int $$0 = (int)(this.eu() - this.eL() * 0.33F);
         $$0 -= (3 - this.dJ().aj().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return $$0 + 3;
      }
   }

   @Override
   public Iterable<cpq> eU() {
      return this.bZ;
   }

   @Override
   public Iterable<cpq> eT() {
      return this.ca;
   }

   public cpq fN() {
      return this.cb;
   }

   public boolean fO() {
      return false;
   }

   public boolean fP() {
      return !this.c(bom.g).b();
   }

   public boolean l(cpq $$0) {
      return false;
   }

   public void m(cpq $$0) {
      this.b(bom.g, $$0);
   }

   @Override
   public Iterable<cpq> eV() {
      return (Iterable<cpq>)(this.cb.b() ? this.ca : Iterables.concat(this.ca, List.of(this.cb)));
   }

   @Override
   public cpq c(bom $$0) {
      return switch ($$0.a()) {
         case a -> (cpq)this.bZ.get($$0.b());
         case b -> (cpq)this.ca.get($$0.b());
         case c -> this.cb;
      };
   }

   @Override
   public void a(bom $$0, cpq $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.bZ.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.ca.set($$0.b(), $$1), $$1);
            break;
         case c:
            cpq $$2 = this.cb;
            this.cb = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(bne $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bom $$3 : bom.values()) {
         cpq $$4 = this.c($$3);
         float $$5 = this.f($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.b() && !cua.e($$4) && ($$2 || $$6) && Math.max(this.af.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.i()) {
               $$4.b($$4.m() - this.af.a(1 + this.af.a(Math.max($$4.m() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, cpq.h);
         }
      }
   }

   protected float f(bom $$0) {
      return switch ($$0.a()) {
         case a -> this.bR[$$0.b()];
         case b -> this.bS[$$0.b()];
         case c -> this.bT;
      };
   }

   protected void a(awt $$0, bmj $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dJ().aj() == bmi.d ? 0.1F : 0.25F;
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

         for (bom $$5 : bom.values()) {
            if ($$5.a() == bom.a.b) {
               cpq $$6 = this.c($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.b()) {
                  cpl $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cpq($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cpl a(bom $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cpt.px;
            } else if ($$1 == 1) {
               return cpt.pN;
            } else if ($$1 == 2) {
               return cpt.pB;
            } else if ($$1 == 3) {
               return cpt.pF;
            } else if ($$1 == 4) {
               return cpt.pJ;
            }
         case e:
            if ($$1 == 0) {
               return cpt.py;
            } else if ($$1 == 1) {
               return cpt.pO;
            } else if ($$1 == 2) {
               return cpt.pC;
            } else if ($$1 == 3) {
               return cpt.pG;
            } else if ($$1 == 4) {
               return cpt.pK;
            }
         case d:
            if ($$1 == 0) {
               return cpt.pz;
            } else if ($$1 == 1) {
               return cpt.pP;
            } else if ($$1 == 2) {
               return cpt.pD;
            } else if ($$1 == 3) {
               return cpt.pH;
            } else if ($$1 == 4) {
               return cpt.pL;
            }
         case c:
            if ($$1 == 0) {
               return cpt.pA;
            } else if ($$1 == 1) {
               return cpt.pQ;
            } else if ($$1 == 2) {
               return cpt.pE;
            } else if ($$1 == 3) {
               return cpt.pI;
            } else if ($$1 == 4) {
               return cpt.pM;
            }
         default:
            return null;
      }
   }

   protected void b(awt $$0, bmj $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bom $$3 : bom.values()) {
         if ($$3.a() == bom.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(awt $$0, float $$1) {
      if (!this.eR().b() && $$0.i() < 0.25F * $$1) {
         this.a(bom.a, cua.a($$0, this.eR(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(awt $$0, float $$1, bom $$2) {
      cpq $$3 = this.c($$2);
      if (!$$3.b() && $$0.i() < 0.5F * $$1) {
         this.a($$2, cua.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      awt $$4 = $$0.F_();
      this.f(bqe.i).d(new bqc("Random spawn bonus", $$4.a(0.0, 0.11485000000000001), bqc.a.b));
      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fQ() {
      this.cd = true;
   }

   public void a(bom $$0, float $$1) {
      switch ($$0.a()) {
         case a:
            this.bR[$$0.b()] = $$1;
            break;
         case b:
            this.bS[$$0.b()] = $$1;
            break;
         case c:
            this.bT = $$1;
      }
   }

   public boolean fR() {
      return this.cc;
   }

   public void s(boolean $$0) {
      this.cc = $$0;
   }

   @Override
   public boolean f(cpq $$0) {
      bom $$1 = h($$0);
      return this.c($$1).b() && this.fR();
   }

   public boolean fS() {
      return this.cd;
   }

   @Override
   public final bml a(cia $$0, bmk $$1) {
      if (!this.bx()) {
         return bml.d;
      } else if (this.ga() == $$0) {
         this.a(true, !$$0.fW().d);
         this.a(dqr.r, $$0);
         return bml.a(this.dJ().B);
      } else {
         bml $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dqr.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dqr.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bml c(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if ($$2.a(cpt.uG) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bml.a(this.dJ().B);
      } else {
         if ($$2.a(cpt.uH)) {
            bml $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.d() instanceof cqv) {
            if (this.dJ() instanceof apa) {
               cqv $$4 = (cqv)$$2.d();
               Optional<boz> $$5 = $$4.a($$0, this, (bol<? extends boz>)this.ai(), (apa)this.dJ(), this.dh(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bml.a : bml.d;
            } else {
               return bml.b;
            }
         } else {
            return bml.d;
         }
      }
   }

   protected void a(cia $$0, boz $$1) {
   }

   protected bml b(cia $$0, bmk $$1) {
      return bml.d;
   }

   public boolean fT() {
      return this.a(this.dj());
   }

   public boolean a(ib $$0) {
      return this.cl == -1.0F ? true : this.ck.j($$0) < (double)(this.cl * this.cl);
   }

   public void a(ib $$0, int $$1) {
      this.ck = $$0;
      this.cl = (float)$$1;
   }

   public ib fU() {
      return this.ck;
   }

   public float fV() {
      return this.cl;
   }

   public void fW() {
      this.cl = -1.0F;
   }

   public boolean fX() {
      return this.cl != -1.0F;
   }

   @Nullable
   public <T extends boz> T a(bol<T> $$0, boolean $$1) {
      if (this.dE()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dJ());
         if ($$2 == null) {
            return null;
         } else {
            $$2.u(this);
            $$2.a(this.o_());
            $$2.t(this.gb());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cy());
            }

            if (this.fS()) {
               $$2.fQ();
            }

            $$2.m(this.co());
            if ($$1) {
               $$2.s(this.fR());

               for (bom $$3 : bom.values()) {
                  cpq $$4 = this.c($$3);
                  if (!$$4.b()) {
                     $$2.a($$3, $$4.c());
                     $$2.a($$3, this.f($$3));
                  }
               }
            }

            this.dJ().b($$2);
            if (this.bL()) {
               bof $$5 = this.cW();
               this.ac();
               $$2.a($$5, true);
            }

            this.am();
            return $$2;
         }
      }
   }

   protected void fY() {
      if (this.cj != null) {
         this.gh();
      }

      if (this.ch != null) {
         if (!this.bx() || !this.ch.bx()) {
            this.a(true, true);
         }
      }
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.ch != null) {
         this.ch = null;
         this.cj = null;
         if (!this.dJ().B && $$1) {
            this.a(cpt.uG);
         }

         if (!this.dJ().B && $$0 && this.dJ() instanceof apa) {
            ((apa)this.dJ()).l().b(this, new adn(this, null));
         }
      }
   }

   public boolean a(cia $$0) {
      return !this.fZ() && !(this instanceof cey);
   }

   public boolean fZ() {
      return this.ch != null;
   }

   @Nullable
   public bof ga() {
      if (this.ch == null && this.ci != 0 && this.dJ().B) {
         this.ch = this.dJ().a(this.ci);
      }

      return this.ch;
   }

   public void b(bof $$0, boolean $$1) {
      this.ch = $$0;
      this.cj = null;
      if (!this.dJ().B && $$1 && this.dJ() instanceof apa) {
         ((apa)this.dJ()).l().b(this, new adn(this, this.ch));
      }

      if (this.bL()) {
         this.ac();
      }
   }

   public void s(int $$0) {
      this.ci = $$0;
      this.a(false, false);
   }

   @Override
   public boolean a(bof $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.fZ()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gh() {
      if (this.cj != null && this.dJ() instanceof apa) {
         if (this.cj.b("UUID")) {
            UUID $$0 = this.cj.a("UUID");
            bof $$1 = ((apa)this.dJ()).a($$0);
            if ($$1 != null) {
               this.b($$1, true);
               return;
            }
         } else if (this.cj.b("X", 99) && this.cj.b("Y", 99) && this.cj.b("Z", 99)) {
            ib $$2 = tn.b(this.cj);
            this.b(cef.b(this.dJ(), $$2), true);
            return;
         }

         if (this.ag > 100) {
            this.a(cpt.uG);
            this.cj = null;
         }
      }
   }

   @Override
   public boolean cV() {
      return super.cV() && !this.gb();
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

   public boolean gb() {
      return (this.am.b(b) & 1) != 0;
   }

   public boolean gc() {
      return (this.am.b(b) & 2) != 0;
   }

   public boolean gd() {
      return (this.am.b(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bor fo() {
      return this.gc() ? bor.a : bor.b;
   }

   public boolean i(box $$0) {
      return this.ge().c($$0.eE());
   }

   protected eoq ge() {
      bof $$0 = this.cW();
      eoq $$3;
      if ($$0 != null) {
         eoq $$1 = $$0.cE();
         eoq $$2 = this.cE();
         $$3 = new eoq(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cE();
      }

      return $$3.c(bV, 0.0, bV);
   }

   @Override
   public boolean B(bof $$0) {
      float $$1 = (float)this.g(bqe.c);
      float $$2 = (float)this.g(bqe.d);
      if ($$0 instanceof box) {
         $$1 += cua.a(this.eR(), $$0.ai());
         $$2 += (float)cua.c(this);
      }

      int $$3 = cua.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dK().b((box)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof box) {
            ((box)$$0).q((double)($$2 * 0.5F), (double)awm.a(this.dz() * (float) (Math.PI / 180.0)), (double)(-awm.b(this.dz() * (float) (Math.PI / 180.0))));
            this.g(this.dm().d(0.6, 1.0, 0.6));
         }

         this.a(this, $$0);
         this.z($$0);
      }

      return $$4;
   }

   protected boolean gf() {
      if (this.dJ().P() && !this.dJ().B) {
         float $$0 = this.bo();
         ib $$1 = ib.a(this.do(), this.ds(), this.du());
         boolean $$2 = this.bb() || this.az || this.aA;
         if ($$0 > 0.5F && this.af.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dJ().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(aut<ehq> $$0) {
      if (this.N().p()) {
         super.c($$0);
      } else {
         this.g(this.dm().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gg() {
      this.c($$0 -> true);
      this.dM().h();
   }

   public void c(Predicate<bvu> $$0) {
      this.bP.a($$0);
   }

   @Override
   protected void cp() {
      super.cp();
      this.a(true, false);
      this.eW().forEach($$0 -> {
         if (!$$0.b()) {
            $$0.f(0);
         }
      });
   }

   @Nullable
   @Override
   public cpq dw() {
      cqv $$0 = cqv.a(this.ai());
      return $$0 == null ? null : new cpq($$0);
   }
}

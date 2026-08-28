import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class btn extends btl implements bta, buk {
   private static final ajv<Byte> b = ajz.a(btn.class, ajx.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final kh bZ = new kh(1, 0, 1);
   public static final float g = 0.15F;
   public static final float h = 0.55F;
   public static final float bH = 0.5F;
   public static final float bI = 0.25F;
   public static final String bJ = "leash";
   public static final float bK = 0.085F;
   public static final int bL = 2;
   public static final int bM = 2;
   private static final double ca = Math.sqrt(2.04F) - 0.6F;
   protected static final akq bN = akq.b("random_spawn_bonus");
   public int bO;
   protected int bP;
   protected bzm bQ;
   protected bzn bR;
   protected bzl bS;
   private final bzi cb;
   protected ccy bT;
   protected final cal bU;
   protected final cal bV;
   @Nullable
   private btl cc;
   private final cdv cd;
   private final jv<cuo> ce = jv.a(2, cuo.l);
   protected final float[] bW = new float[2];
   private final jv<cuo> cf = jv.a(4, cuo.l);
   protected final float[] bX = new float[4];
   private cuo cg = cuo.l;
   protected float bY;
   private boolean ch;
   private boolean ci;
   private final Map<epp, Float> cj = Maps.newEnumMap(epp.class);
   @Nullable
   private akp<erq> ck;
   private long cl;
   @Nullable
   private bsq cm;
   private int cn;
   @Nullable
   private Either<UUID, jd> co;
   private jd cp = jd.c;
   private float cq = -1.0F;

   protected btn(bsw<? extends btn> $$0, dcu $$1) {
      super($$0, $$1);
      this.bU = new cal($$1.ah());
      this.bV = new cal($$1.ah());
      this.bQ = new bzm(this);
      this.bR = new bzn(this);
      this.bS = new bzl(this);
      this.cb = this.E();
      this.bT = this.b($$1);
      this.cd = new cdv(this);
      Arrays.fill(this.bX, 0.085F);
      Arrays.fill(this.bW, 0.085F);
      this.bY = 0.085F;
      if ($$1 != null && !$$1.B) {
         this.z();
      }
   }

   @Override
   protected void z() {
   }

   public static but.a A() {
      return btl.dW().a(buu.m, 16.0);
   }

   protected ccy b(dcu $$0) {
      return new ccx(this, $$0);
   }

   protected boolean B() {
      return false;
   }

   public float a(epp $$0) {
      btn $$2;
      label17: {
         if (this.de() instanceof btn $$1 && $$1.B()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cj.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(epp $$0, float $$1) {
      this.cj.put($$0, $$1);
   }

   @Override
   public void C() {
   }

   @Override
   public void D() {
   }

   protected bzi E() {
      return new bzi(this);
   }

   public bzm F() {
      return this.bQ;
   }

   public bzn H() {
      return this.de() instanceof btn $$0 ? $$0.H() : this.bR;
   }

   public bzl I() {
      return this.bS;
   }

   public ccy J() {
      return this.de() instanceof btn $$0 ? $$0.J() : this.bT;
   }

   @Nullable
   @Override
   public btl cR() {
      bsq $$0 = this.cU();
      if (!this.gb() && $$0 instanceof btn $$1 && $$0.bV()) {
         return $$1;
      }

      return null;
   }

   public cdv L() {
      return this.cd;
   }

   @Nullable
   @Override
   public btl p() {
      return this.cc;
   }

   @Nullable
   protected final btl N() {
      return this.dU().c(ccq.o).orElse(null);
   }

   public void h(@Nullable btl $$0) {
      this.cc = $$0;
   }

   @Override
   public boolean a(bsw<?> $$0) {
      return $$0 != bsw.T;
   }

   public boolean a(cvl $$0) {
      return false;
   }

   public void O() {
      this.a(dxw.m);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   public int P() {
      return 80;
   }

   public void Q() {
      this.b(this.v());
   }

   @Override
   public void aw() {
      super.aw();
      this.dQ().ag().a("mobBaseTick");
      if (this.bE() && this.ah.a(1000) < this.bO++) {
         this.s();
         this.Q();
      }

      this.dQ().ag().c();
   }

   @Override
   protected void e(brj $$0) {
      this.s();
      super.e($$0);
   }

   private void s() {
      this.bO = -this.P();
   }

   @Override
   protected int eh() {
      if (this.bP > 0) {
         int $$0 = this.bP;

         for (int $$1 = 0; $$1 < this.cf.size(); $$1++) {
            if (!this.cf.get($$1).e() && this.bX[$$1] <= 1.0F) {
               $$0 += 1 + this.ah.a(3);
            }
         }

         for (int $$2 = 0; $$2 < this.ce.size(); $$2++) {
            if (!this.ce.get($$2).e() && this.bW[$$2] <= 1.0F) {
               $$0 += 1 + this.ah.a(3);
            }
         }

         if (!this.cg.e() && this.bY <= 1.0F) {
            $$0 += 1 + this.ah.a(3);
         }

         return $$0;
      } else {
         return this.bP;
      }
   }

   public void R() {
      if (this.dQ().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.ah.k() * 0.02;
            double $$2 = this.ah.k() * 0.02;
            double $$3 = this.ah.k() * 0.02;
            double $$4 = 10.0;
            this.dQ().a(lm.ab, this.c(1.0) - $$1 * 10.0, this.dy() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dQ().a(this, (byte)20);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 20) {
         this.R();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dQ().B) {
         this.fX();
         if (this.ai % 5 == 0) {
            this.S();
         }
      }
   }

   protected void S() {
      boolean $$0 = !(this.cR() instanceof btn);
      boolean $$1 = !(this.dd() instanceof cot);
      this.bU.a(cak.a.a, $$0);
      this.bU.a(cak.a.c, $$0 && $$1);
      this.bU.a(cak.a.b, $$0);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.cb.a();
      return $$1;
   }

   @Nullable
   protected avn v() {
      return null;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fQ());
      $$0.a("PersistenceRequired", this.ci);
      ug $$1 = new ug();

      for (cuo $$2 : this.cf) {
         if (!$$2.e()) {
            $$1.add($$2.a(this.dS()));
         } else {
            $$1.add(new ua());
         }
      }

      $$0.a("ArmorItems", $$1);
      ug $$3 = new ug();

      for (float $$4 : this.bX) {
         $$3.add(ud.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      ug $$5 = new ug();

      for (cuo $$6 : this.ce) {
         if (!$$6.e()) {
            $$5.add($$6.a(this.dS()));
         } else {
            $$5.add(new ua());
         }
      }

      $$0.a("HandItems", $$5);
      ug $$7 = new ug();

      for (float $$8 : this.bW) {
         $$7.add(ud.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.cg.e()) {
         $$0.a("body_armor_item", this.cg.a(this.dS()));
         $$0.a("body_armor_drop_chance", this.bY);
      }

      Either<UUID, jd> $$9 = this.co;
      if (this.cm instanceof btl) {
         $$9 = Either.left(this.cm.cA());
      } else if (this.cm instanceof ciz $$10) {
         $$9 = Either.right($$10.t());
      }

      if ($$9 != null) {
         $$0.a("leash", (ux)$$9.map($$0x -> {
            ua $$1x = new ua();
            $$1x.a("UUID", $$0x);
            return $$1x;
         }, up::a));
      }

      $$0.a("LeftHanded", this.gc());
      if (this.ck != null) {
         $$0.a("DeathLootTable", this.ck.a().toString());
         if (this.cl != 0L) {
            $$0.a("DeathLootTableSeed", this.cl);
         }
      }

      if (this.gb()) {
         $$0.a("NoAI", this.gb());
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.ci = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         ug $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cf.size(); $$2++) {
            ua $$3 = $$1.a($$2);
            this.cf.set($$2, cuo.a(this.dS(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         ug $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bX[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         ug $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.ce.size(); $$7++) {
            ua $$8 = $$6.a($$7);
            this.ce.set($$7, cuo.a(this.dS(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         ug $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bW[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cg = cuo.a(this.dS(), (ux)$$0.p("body_armor_item")).orElse(cuo.l);
         this.bY = $$0.j("body_armor_drop_chance");
      } else {
         this.cg = cuo.l;
      }

      if ($$0.b("leash", 10)) {
         this.co = Either.left($$0.p("leash").a("UUID"));
      } else if ($$0.b("leash", 11)) {
         this.co = up.a($$0, "leash").<Either<UUID, jd>>map(Either::right).orElse(null);
      } else {
         this.co = null;
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.ck = akp.a(lu.bc, akq.a($$0.l("DeathLootTable")));
         this.cl = $$0.i("DeathLootTableSeed");
      }

      this.c($$0.q("NoAI"));
   }

   @Override
   protected void a(brj $$0, boolean $$1) {
      super.a($$0, $$1);
      this.ck = null;
   }

   @Override
   public final akp<erq> eB() {
      return this.ck == null ? this.T() : this.ck;
   }

   protected akp<erq> T() {
      return super.eB();
   }

   @Override
   public long eC() {
      return this.cl;
   }

   public void D(float $$0) {
      this.bq = $$0;
   }

   public void E(float $$0) {
      this.bp = $$0;
   }

   public void F(float $$0) {
      this.bo = $$0;
   }

   @Override
   public void z(float $$0) {
      super.z($$0);
      this.D($$0);
   }

   public void U() {
      this.J().n();
      this.F(0.0F);
      this.E(0.0F);
      this.z(0.0F);
   }

   @Override
   public void m_() {
      super.m_();
      this.dQ().ag().a("looting");
      if (!this.dQ().B && this.fQ() && this.bE() && !this.be && this.dQ().ab().b(dcq.c)) {
         kh $$0 = this.V();

         for (cjf $$2 : this.dQ().a(cjf.class, this.cL().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dL() && !$$2.p().e() && !$$2.y() && this.k($$2.p())) {
               this.b($$2);
            }
         }
      }

      this.dQ().ag().c();
   }

   protected kh V() {
      return bZ;
   }

   protected void b(cjf $$0) {
      cuo $$1 = $$0.p();
      cuo $$2 = this.i($$1.s());
      if (!$$2.e()) {
         this.a($$0);
         this.a($$0, $$2.H());
         $$1.h($$2.H());
         if ($$1.e()) {
            $$0.aq();
         }
      }
   }

   public cuo i(cuo $$0) {
      bsx $$1 = this.h($$0);
      cuo $$2 = this.a($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bsx.a;
         $$2 = this.a($$1);
         $$3 = $$2.e();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.f($$1);
         if (!$$2.e() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         cuo $$5 = $$1.a($$0);
         this.b($$1, $$5);
         return $$5;
      } else {
         return cuo.l;
      }
   }

   @Override
   protected void b(bsx $$0, cuo $$1) {
      this.a($$0, $$1);
      this.e($$0);
      this.ci = true;
   }

   public void e(bsx $$0) {
      switch ($$0.a()) {
         case a:
            this.bW[$$0.b()] = 2.0F;
            break;
         case b:
            this.bX[$$0.b()] = 2.0F;
            break;
         case c:
            this.bY = 2.0F;
      }
   }

   protected boolean b(cuo $$0, cuo $$1) {
      if ($$1.e()) {
         return true;
      } else if ($$0.g() instanceof cwe) {
         if (!($$1.g() instanceof cwe)) {
            return true;
         } else {
            double $$2 = this.o($$0);
            double $$3 = this.o($$1);
            return $$2 != $$3 ? $$2 > $$3 : this.c($$0, $$1);
         }
      } else if ($$0.g() instanceof csr && $$1.g() instanceof csr) {
         return this.c($$0, $$1);
      } else if ($$0.g() instanceof cta && $$1.g() instanceof cta) {
         return this.c($$0, $$1);
      } else if ($$0.g() instanceof csd $$4) {
         if (dac.a($$1, dab.E)) {
            return false;
         } else if (!($$1.g() instanceof csd)) {
            return true;
         } else {
            csd $$5 = (csd)$$1.g();
            if ($$4.k() != $$5.k()) {
               return $$4.k() > $$5.k();
            } else {
               return $$4.l() != $$5.l() ? $$4.l() > $$5.l() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.g() instanceof ctc) {
            if ($$1.g() instanceof csm) {
               return true;
            }

            if ($$1.g() instanceof ctc) {
               double $$6 = this.o($$0);
               double $$7 = this.o($$1);
               if ($$6 != $$7) {
                  return $$6 > $$7;
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   private double o(cuo $$0) {
      cxl $$1 = $$0.a(kq.n, cxl.a);
      return $$1.a(this.h(buu.c), bsx.a);
   }

   public boolean c(cuo $$0, cuo $$1) {
      return $$0.n() < $$1.n() ? true : p($$0) && !p($$1);
   }

   private static boolean p(cuo $$0) {
      km $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(kq.e);
   }

   public boolean j(cuo $$0) {
      return true;
   }

   public boolean k(cuo $$0) {
      return this.j($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean W() {
      return this.bS();
   }

   protected boolean X() {
      return false;
   }

   @Override
   public void dC() {
      if (this.dQ().al() == bqn.a && this.X()) {
         this.aq();
      } else if (!this.fR() && !this.W()) {
         bsq $$0 = this.dQ().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.am().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.aq();
            }

            int $$4 = this.am().f().g();
            int $$5 = $$4 * $$4;
            if (this.bf > 600 && this.ah.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.aq();
            } else if ($$1 < (double)$$5) {
               this.bf = 0;
            }
         }
      } else {
         this.bf = 0;
      }
   }

   @Override
   protected final void fn() {
      this.bf++;
      bne $$0 = this.dQ().ag();
      $$0.a("sensing");
      this.cd.a();
      $$0.c();
      int $$1 = this.ai + this.an();
      if ($$1 % 2 != 0 && this.ai > 1) {
         $$0.a("targetSelector");
         this.bV.a(false);
         $$0.c();
         $$0.a("goalSelector");
         this.bU.a(false);
         $$0.c();
      } else {
         $$0.a("targetSelector");
         this.bV.a();
         $$0.c();
         $$0.a("goalSelector");
         this.bU.a();
         $$0.c();
      }

      $$0.a("navigation");
      this.bT.c();
      $$0.c();
      $$0.a("mob tick");
      this.Z();
      $$0.c();
      $$0.a("controls");
      $$0.a("move");
      this.bR.a();
      $$0.b("look");
      this.bQ.a();
      $$0.b("jump");
      this.bS.b();
      $$0.c();
      $$0.c();
      this.Y();
   }

   protected void Y() {
      age.a(this.dQ(), this, this.bU);
   }

   protected void Z() {
   }

   public int aa() {
      return 40;
   }

   public int ab() {
      return 75;
   }

   protected void ac() {
      float $$0 = (float)this.ab();
      float $$1 = this.ct();
      float $$2 = ayn.g(this.aY - $$1);
      float $$3 = ayn.a(ayn.g(this.aY - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.o($$4);
   }

   public int ae() {
      return 10;
   }

   public void a(bsq $$0, float $$1, float $$2) {
      double $$3 = $$0.dv() - this.dv();
      double $$4 = $$0.dB() - this.dB();
      double $$6;
      if ($$0 instanceof btl $$5) {
         $$6 = $$5.dz() - this.dz();
      } else {
         $$6 = ($$0.cL().b + $$0.cL().e) / 2.0 - this.dz();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(ayn.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(ayn.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.t(this.a(this.dI(), $$10, $$2));
      this.s(this.a(this.dG(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ayn.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bsw<? extends btn> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      jd $$5 = $$3.d();
      return $$2 == btp.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dcv $$0, btp $$1) {
      return true;
   }

   public boolean a(dcx $$0) {
      return !$$0.d(this.cL()) && $$0.f(this);
   }

   public int af() {
      return 4;
   }

   public boolean d(int $$0) {
      return false;
   }

   @Override
   public int cy() {
      if (this.p() == null) {
         return this.v(0.0F);
      } else {
         int $$0 = (int)(this.ex() - this.eO() * 0.33F);
         $$0 -= (3 - this.dQ().al().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.v((float)$$0);
      }
   }

   @Override
   public Iterable<cuo> eX() {
      return this.ce;
   }

   @Override
   public Iterable<cuo> eW() {
      return this.cf;
   }

   public cuo fN() {
      return this.cg;
   }

   @Override
   public boolean d(bsx $$0) {
      return $$0 != bsx.g;
   }

   public boolean fO() {
      return !this.a(bsx.g).e();
   }

   public boolean l(cuo $$0) {
      return false;
   }

   public void m(cuo $$0) {
      this.b(bsx.g, $$0);
   }

   @Override
   public Iterable<cuo> eY() {
      return (Iterable<cuo>)(this.cg.e() ? this.cf : Iterables.concat(this.cf, List.of(this.cg)));
   }

   @Override
   public cuo a(bsx $$0) {
      return switch ($$0.a()) {
         case a -> (cuo)this.ce.get($$0.b());
         case b -> (cuo)this.cf.get($$0.b());
         case c -> this.cg;
      };
   }

   @Override
   public void a(bsx $$0, cuo $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cf.set($$0.b(), $$1), $$1);
            break;
         case c:
            cuo $$2 = this.cg;
            this.cg = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(aqt $$0, brj $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bsx $$3 : bsx.values()) {
         cuo $$4 = this.a($$3);
         float $$5 = this.f($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = $$5 > 1.0F;
            bsq var13 = $$1.d();
            if (var13 instanceof btl) {
               btl $$7 = (btl)var13;
               if (this.dQ() instanceof aqt $$8) {
                  $$5 = dac.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.e() && !dac.a($$4, dab.D) && ($$2 || $$6) && this.ah.i() < $$5) {
               if (!$$6 && $$4.l()) {
                  $$4.b($$4.o() - this.ah.a(1 + this.ah.a(Math.max($$4.o() - 3, 1))));
               }

               this.b($$4);
               this.a($$3, cuo.l);
            }
         }
      }
   }

   protected float f(bsx $$0) {
      return switch ($$0.a()) {
         case a -> this.bW[$$0.b()];
         case b -> this.bX[$$0.b()];
         case c -> this.bY;
      };
   }

   private ero a(aqt $$0) {
      return new ero.a($$0).a(euh.f, this.do()).a(euh.a, this).a(eug.h);
   }

   public void a(bsz $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(akp<erq> $$0, Map<bsx, Float> $$1) {
      if (this.dQ() instanceof aqt $$2) {
         this.a($$0, this.a($$2), $$1);
      }
   }

   protected void a(ayv $$0, bqo $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dQ().al() == bqn.d ? 0.1F : 0.25F;
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

         for (bsx $$5 : bsx.values()) {
            if ($$5.a() == bsx.a.b) {
               cuo $$6 = this.a($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.e()) {
                  cuj $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cuo($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cuj a(bsx $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cur.py;
            } else if ($$1 == 1) {
               return cur.pO;
            } else if ($$1 == 2) {
               return cur.pC;
            } else if ($$1 == 3) {
               return cur.pG;
            } else if ($$1 == 4) {
               return cur.pK;
            }
         case e:
            if ($$1 == 0) {
               return cur.pz;
            } else if ($$1 == 1) {
               return cur.pP;
            } else if ($$1 == 2) {
               return cur.pD;
            } else if ($$1 == 3) {
               return cur.pH;
            } else if ($$1 == 4) {
               return cur.pL;
            }
         case d:
            if ($$1 == 0) {
               return cur.pA;
            } else if ($$1 == 1) {
               return cur.pQ;
            } else if ($$1 == 2) {
               return cur.pE;
            } else if ($$1 == 3) {
               return cur.pI;
            } else if ($$1 == 4) {
               return cur.pM;
            }
         case c:
            if ($$1 == 0) {
               return cur.pB;
            } else if ($$1 == 1) {
               return cur.pR;
            } else if ($$1 == 2) {
               return cur.pF;
            } else if ($$1 == 3) {
               return cur.pJ;
            } else if ($$1 == 4) {
               return cur.pN;
            }
         default:
            return null;
      }
   }

   protected void a(ddj $$0, ayv $$1, bqo $$2) {
      this.b($$0, $$1, $$2);

      for (bsx $$3 : bsx.values()) {
         if ($$3.a() == bsx.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(ddj $$0, ayv $$1, bqo $$2) {
      this.a($$0, bsx.a, $$1, 0.25F, $$2);
   }

   protected void a(ddj $$0, ayv $$1, bsx $$2, bqo $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(ddj $$0, bsx $$1, ayv $$2, float $$3, bqo $$4) {
      cuo $$5 = this.a($$1);
      if (!$$5.e() && $$2.i() < $$3 * $$4.d()) {
         dac.a($$5, $$0.H_(), dbn.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      ayv $$4 = $$0.E_();
      buq $$5 = Objects.requireNonNull(this.f(buu.m));
      if (!$$5.b(bN)) {
         $$5.c(new bus(bN, $$4.a(0.0, 0.11485000000000001), bus.a.b));
      }

      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fP() {
      this.ci = true;
   }

   @Override
   public void a(bsx $$0, float $$1) {
      switch ($$0.a()) {
         case a:
            this.bW[$$0.b()] = $$1;
            break;
         case b:
            this.bX[$$0.b()] = $$1;
            break;
         case c:
            this.bY = $$1;
      }
   }

   public boolean fQ() {
      return this.ch;
   }

   public void a_(boolean $$0) {
      this.ch = $$0;
   }

   @Override
   public boolean f(cuo $$0) {
      bsx $$1 = this.h($$0);
      return this.a($$1).e() && this.fQ();
   }

   public boolean fR() {
      return this.ci;
   }

   @Override
   public final bqq a(cmv $$0, bqp $$1) {
      if (!this.bE()) {
         return bqq.e;
      } else if (this.ga() == $$0) {
         this.a(true, !$$0.fM());
         this.a(dxw.r, $$0);
         return bqq.a(this.dQ().B);
      } else {
         bqq $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dxw.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dxw.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bqq c(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.uK) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bqq.a(this.dQ().B);
      } else {
         if ($$2.a(cur.uL)) {
            bqq $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.g() instanceof cvy) {
            if (this.dQ() instanceof aqt) {
               cvy $$4 = (cvy)$$2.g();
               Optional<btn> $$5 = $$4.a($$0, this, (bsw<? extends btn>)this.am(), (aqt)this.dQ(), this.do(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bqq.a : bqq.e;
            } else {
               return bqq.c;
            }
         } else {
            return bqq.e;
         }
      }
   }

   protected void a(cmv $$0, btn $$1) {
   }

   protected bqq b(cmv $$0, bqp $$1) {
      return bqq.e;
   }

   public boolean fS() {
      return this.a(this.dq());
   }

   public boolean a(jd $$0) {
      return this.cq == -1.0F ? true : this.cp.j($$0) < (double)(this.cq * this.cq);
   }

   public void a(jd $$0, int $$1) {
      this.cp = $$0;
      this.cq = (float)$$1;
   }

   public jd fT() {
      return this.cp;
   }

   public float fU() {
      return this.cq;
   }

   public void fV() {
      this.cq = -1.0F;
   }

   public boolean fW() {
      return this.cq != -1.0F;
   }

   @Nullable
   public <T extends btn> T a(bsw<T> $$0, boolean $$1) {
      if (this.dL()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dQ());
         if ($$2 == null) {
            return null;
         } else {
            $$2.v(this);
            $$2.a(this.o_());
            $$2.c(this.gb());
            if (this.ai()) {
               $$2.b(this.aj());
               $$2.p(this.cF());
            }

            if (this.fR()) {
               $$2.fP();
            }

            $$2.o(this.cv());
            if ($$1) {
               $$2.a_(this.fQ());

               for (bsx $$3 : bsx.values()) {
                  cuo $$4 = this.a($$3);
                  if (!$$4.e()) {
                     $$2.a($$3, $$4.f());
                     $$2.a($$3, this.f($$3));
                  }
               }
            }

            this.dQ().b($$2);
            if (this.bS()) {
               bsq $$5 = this.dd();
               this.ad();
               $$2.a($$5, true);
            }

            this.aq();
            return $$2;
         }
      }
   }

   protected void fX() {
      if (this.co != null) {
         this.gi();
      }

      if (this.cm != null) {
         if (!this.bE() || !this.cm.bE()) {
            this.a(true, true);
         }
      }
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.cm != null) {
         this.cm = null;
         this.co = null;
         this.fV();
         if (!this.dQ().B && $$1) {
            this.a(cur.uK);
         }

         if (!this.dQ().B && $$0 && this.dQ() instanceof aqt) {
            ((aqt)this.dQ()).l().b(this, new aez(this, null));
         }
      }
   }

   public boolean a(cmv $$0) {
      return !this.fY() && !(this instanceof cjt);
   }

   public boolean fY() {
      return this.cm != null;
   }

   public boolean fZ() {
      return this.fY() || this.co != null;
   }

   @Nullable
   public bsq ga() {
      if (this.cm == null && this.cn != 0 && this.dQ().B) {
         this.cm = this.dQ().a(this.cn);
      }

      return this.cm;
   }

   public void b(bsq $$0, boolean $$1) {
      this.cm = $$0;
      this.co = null;
      if (!this.dQ().B && $$1 && this.dQ() instanceof aqt) {
         ((aqt)this.dQ()).l().b(this, new aez(this, this.cm));
      }

      if (this.bS()) {
         this.ad();
      }
   }

   public void r(int $$0) {
      this.cn = $$0;
      this.a(false, false);
   }

   @Override
   public boolean a(bsq $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.fY()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gi() {
      if (this.co != null && this.dQ() instanceof aqt $$0) {
         Optional<UUID> $$1 = this.co.left();
         Optional<jd> $$2 = this.co.right();
         if ($$1.isPresent()) {
            bsq $$3 = $$0.a($$1.get());
            if ($$3 != null) {
               this.b($$3, true);
               return;
            }
         } else if ($$2.isPresent()) {
            this.b(ciz.b(this.dQ(), $$2.get()), true);
            return;
         }

         if (this.ai > 100) {
            this.a(cur.uK);
            this.co = null;
         }
      }
   }

   @Override
   public boolean dc() {
      return super.dc() && !this.gb();
   }

   public void c(boolean $$0) {
      byte $$1 = this.ao.a(b);
      this.ao.a(b, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void u(boolean $$0) {
      byte $$1 = this.ao.a(b);
      this.ao.a(b, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void v(boolean $$0) {
      byte $$1 = this.ao.a(b);
      this.ao.a(b, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean gb() {
      return (this.ao.a(b) & 1) != 0;
   }

   public boolean gc() {
      return (this.ao.a(b) & 2) != 0;
   }

   public boolean gd() {
      return (this.ao.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public btf fr() {
      return this.gc() ? btf.a : btf.b;
   }

   public boolean i(btl $$0) {
      return this.ge().c($$0.eG());
   }

   protected ewr ge() {
      bsq $$0 = this.dd();
      ewr $$3;
      if ($$0 != null) {
         ewr $$1 = $$0.cL();
         ewr $$2 = this.cL();
         $$3 = new ewr(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cL();
      }

      return $$3.c(ca, 0.0, ca);
   }

   @Override
   public boolean D(bsq $$0) {
      float $$1 = (float)this.g(buu.c);
      brj $$2 = this.dR().b((btl)this);
      if (this.dQ() instanceof aqt $$3) {
         $$1 = dac.a($$3, this.eU(), $$0, $$2, $$1);
      }

      boolean $$4 = $$0.a($$2, $$1);
      if ($$4) {
         float $$5 = this.a($$0, $$2);
         if ($$5 > 0.0F && $$0 instanceof btl $$6) {
            $$6.p((double)($$5 * 0.5F), (double)ayn.a(this.dG() * (float) (Math.PI / 180.0)), (double)(-ayn.b(this.dG() * (float) (Math.PI / 180.0))));
            this.i(this.dt().d(0.6, 1.0, 0.6));
         }

         if (this.dQ() instanceof aqt $$7) {
            dac.a($$7, $$0, $$2);
         }

         this.A($$0);
         this.gf();
      }

      return $$4;
   }

   protected void gf() {
   }

   protected boolean gg() {
      if (this.dQ().R() && !this.dQ().B) {
         float $$0 = this.bu();
         jd $$1 = jd.a(this.dv(), this.dz(), this.dB());
         boolean $$2 = this.bh() || this.az || this.aA;
         if ($$0 > 0.5F && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dQ().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(awt<eox> $$0) {
      if (this.J().p()) {
         super.c($$0);
      } else {
         this.i(this.dt().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gh() {
      this.c($$0 -> true);
      this.dU().h();
   }

   public void c(Predicate<cak> $$0) {
      this.bU.a($$0);
   }

   @Override
   protected void cw() {
      super.cw();
      this.a(true, false);
      this.eZ().forEach($$0 -> {
         if (!$$0.e()) {
            $$0.e(0);
         }
      });
   }

   @Nullable
   @Override
   public cuo dD() {
      cvy $$0 = cvy.a(this.am());
      return $$0 == null ? null : new cuo($$0);
   }
}

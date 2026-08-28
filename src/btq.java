import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class btq extends bto implements btd, bum {
   private static final akj<Byte> b = akn.a(btq.class, akl.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final kd bX = new kd(1, 0, 1);
   public static final float g = 0.15F;
   public static final float bF = 0.55F;
   public static final float bG = 0.5F;
   public static final float bH = 0.25F;
   public static final String bI = "leash";
   public static final float bJ = 0.085F;
   public static final int bK = 2;
   public static final int bL = 2;
   private static final double bY = Math.sqrt(2.04F) - 0.6F;
   public int bM;
   protected int bN;
   protected bzo bO;
   protected bzp bP;
   protected bzn bQ;
   private final bzk bZ;
   protected cda bR;
   protected final can bS;
   protected final can bT;
   @Nullable
   private bto ca;
   private final cdx cb;
   private final jr<cuo> cc = jr.a(2, cuo.l);
   protected final float[] bU = new float[2];
   private final jr<cuo> cd = jr.a(4, cuo.l);
   protected final float[] bV = new float[4];
   private cuo ce = cuo.l;
   protected float bW;
   private boolean cf;
   private boolean cg;
   private final Map<eol, Float> ch = Maps.newEnumMap(eol.class);
   @Nullable
   private ald<eqm> ci;
   private long cj;
   @Nullable
   private bst ck;
   private int cl;
   @Nullable
   private Either<UUID, iz> cm;
   private iz cn = iz.c;
   private float co = -1.0F;

   protected btq(bsz<? extends btq> $$0, dbx $$1) {
      super($$0, $$1);
      this.bS = new can($$1.ah());
      this.bT = new can($$1.ah());
      this.bO = new bzo(this);
      this.bP = new bzp(this);
      this.bQ = new bzn(this);
      this.bZ = this.E();
      this.bR = this.b($$1);
      this.cb = new cdx(this);
      Arrays.fill(this.bV, 0.085F);
      Arrays.fill(this.bU, 0.085F);
      this.bW = 0.085F;
      if ($$1 != null && !$$1.B) {
         this.z();
      }
   }

   @Override
   protected void z() {
   }

   public static buv.a A() {
      return bto.dU().a(buw.k, 16.0).a(buw.d);
   }

   protected cda b(dbx $$0) {
      return new ccz(this, $$0);
   }

   protected boolean B() {
      return false;
   }

   public float a(eol $$0) {
      btq $$2;
      label17: {
         if (this.dd() instanceof btq $$1 && $$1.B()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.ch.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(eol $$0, float $$1) {
      this.ch.put($$0, $$1);
   }

   @Override
   public void C() {
   }

   @Override
   public void D() {
   }

   protected bzk E() {
      return new bzk(this);
   }

   public bzo G() {
      return this.bO;
   }

   public bzp H() {
      return this.dd() instanceof btq $$0 ? $$0.H() : this.bP;
   }

   public bzn I() {
      return this.bQ;
   }

   public cda K() {
      return this.dd() instanceof btq $$0 ? $$0.K() : this.bR;
   }

   @Nullable
   @Override
   public bto cQ() {
      bst $$0 = this.cT();
      if (!this.gg() && $$0 instanceof btq $$1 && $$0.bU()) {
         return $$1;
      }

      return null;
   }

   public cdx M() {
      return this.cb;
   }

   @Nullable
   @Override
   public bto p() {
      return this.ca;
   }

   @Nullable
   protected final bto N() {
      return this.dS().c(ccs.o).orElse(null);
   }

   public void h(@Nullable bto $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(bsz<?> $$0) {
      return $$0 != bsz.T;
   }

   public boolean a(cvh $$0) {
      return false;
   }

   public void O() {
      this.a(dwu.m);
   }

   @Override
   protected void a(akn.a $$0) {
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
   public void au() {
      super.au();
      this.dP().ag().a("mobBaseTick");
      if (this.bD() && this.ah.a(1000) < this.bM++) {
         this.s();
         this.Q();
      }

      this.dP().ag().c();
   }

   @Override
   protected void e(brm $$0) {
      this.s();
      super.e($$0);
   }

   private void s() {
      this.bM = -this.P();
   }

   @Override
   public int ej() {
      if (this.bN > 0) {
         int $$0 = this.bN;

         for (int $$1 = 0; $$1 < this.cd.size(); $$1++) {
            if (!this.cd.get($$1).e() && this.bV[$$1] <= 1.0F) {
               $$0 += 1 + this.ah.a(3);
            }
         }

         for (int $$2 = 0; $$2 < this.cc.size(); $$2++) {
            if (!this.cc.get($$2).e() && this.bU[$$2] <= 1.0F) {
               $$0 += 1 + this.ah.a(3);
            }
         }

         if (!this.ce.e() && this.bW <= 1.0F) {
            $$0 += 1 + this.ah.a(3);
         }

         return $$0;
      } else {
         return this.bN;
      }
   }

   public void R() {
      if (this.dP().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.ah.k() * 0.02;
            double $$2 = this.ah.k() * 0.02;
            double $$3 = this.ah.k() * 0.02;
            double $$4 = 10.0;
            this.dP().a(li.ab, this.c(1.0) - $$1 * 10.0, this.dx() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dP().a(this, (byte)20);
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
      if (!this.dP().B) {
         this.gc();
         if (this.ai % 5 == 0) {
            this.S();
         }
      }
   }

   protected void S() {
      boolean $$0 = !(this.cQ() instanceof btq);
      boolean $$1 = !(this.dc() instanceof cou);
      this.bS.a(cam.a.a, $$0);
      this.bS.a(cam.a.c, $$0 && $$1);
      this.bS.a(cam.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bZ.a();
      return $$1;
   }

   @Nullable
   protected avy v() {
      return null;
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fV());
      $$0.a("PersistenceRequired", this.cg);
      ux $$1 = new ux();

      for (cuo $$2 : this.cd) {
         if (!$$2.e()) {
            $$1.add($$2.a(this.dR()));
         } else {
            $$1.add(new ur());
         }
      }

      $$0.a("ArmorItems", $$1);
      ux $$3 = new ux();

      for (float $$4 : this.bV) {
         $$3.add(uu.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      ux $$5 = new ux();

      for (cuo $$6 : this.cc) {
         if (!$$6.e()) {
            $$5.add($$6.a(this.dR()));
         } else {
            $$5.add(new ur());
         }
      }

      $$0.a("HandItems", $$5);
      ux $$7 = new ux();

      for (float $$8 : this.bU) {
         $$7.add(uu.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.ce.e()) {
         $$0.a("body_armor_item", this.ce.a(this.dR()));
         $$0.a("body_armor_drop_chance", this.bW);
      }

      Either<UUID, iz> $$9 = this.cm;
      if (this.ck instanceof bto) {
         $$9 = Either.left(this.ck.cz());
      } else if (this.ck instanceof ciy $$10) {
         $$9 = Either.right($$10.D());
      }

      if ($$9 != null) {
         $$0.a("leash", (vo)$$9.map($$0x -> {
            ur $$1x = new ur();
            $$1x.a("UUID", $$0x);
            return $$1x;
         }, vg::a));
      }

      $$0.a("LeftHanded", this.gh());
      if (this.ci != null) {
         $$0.a("DeathLootTable", this.ci.a().toString());
         if (this.cj != 0L) {
            $$0.a("DeathLootTableSeed", this.cj);
         }
      }

      if (this.gg()) {
         $$0.a("NoAI", this.gg());
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.cg = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         ux $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cd.size(); $$2++) {
            ur $$3 = $$1.a($$2);
            this.cd.set($$2, cuo.a(this.dR(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         ux $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bV[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         ux $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.cc.size(); $$7++) {
            ur $$8 = $$6.a($$7);
            this.cc.set($$7, cuo.a(this.dR(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         ux $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bU[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.ce = cuo.a(this.dR(), (vo)$$0.p("body_armor_item")).orElse(cuo.l);
         this.bW = $$0.j("body_armor_drop_chance");
      } else {
         this.ce = cuo.l;
      }

      if ($$0.b("leash", 10)) {
         this.cm = Either.left($$0.p("leash").a("UUID"));
      } else if ($$0.b("leash", 11)) {
         this.cm = vg.a($$0, "leash").<Either<UUID, iz>>map(Either::right).orElse(null);
      } else {
         this.cm = null;
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.ci = ald.a(lq.aU, new ale($$0.l("DeathLootTable")));
         this.cj = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(brm $$0, boolean $$1) {
      super.a($$0, $$1);
      this.ci = null;
   }

   @Override
   public final ald<eqm> eF() {
      return this.ci == null ? this.T() : this.ci;
   }

   protected ald<eqm> T() {
      return super.eF();
   }

   @Override
   public long eG() {
      return this.cj;
   }

   public void C(float $$0) {
      this.bq = $$0;
   }

   public void D(float $$0) {
      this.bp = $$0;
   }

   public void E(float $$0) {
      this.bo = $$0;
   }

   @Override
   public void y(float $$0) {
      super.y($$0);
      this.C($$0);
   }

   public void U() {
      this.K().n();
      this.E(0.0F);
      this.D(0.0F);
      this.y(0.0F);
   }

   @Override
   public void n_() {
      super.n_();
      this.dP().ag().a("looting");
      if (!this.dP().B && this.fV() && this.bD() && !this.be && this.dP().ab().b(dbt.c)) {
         kd $$0 = this.V();

         for (cjg $$2 : this.dP().a(cjg.class, this.cK().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dK() && !$$2.p().e() && !$$2.y() && this.k($$2.p())) {
               this.b($$2);
            }
         }
      }

      this.dP().ag().c();
   }

   protected kd V() {
      return bX;
   }

   protected void b(cjg $$0) {
      cuo $$1 = $$0.p();
      cuo $$2 = this.i($$1.s());
      if (!$$2.e()) {
         this.a($$0);
         this.a($$0, $$2.I());
         $$1.h($$2.I());
         if ($$1.e()) {
            $$0.ao();
         }
      }
   }

   public cuo i(cuo $$0) {
      bta $$1 = h($$0);
      cuo $$2 = this.a($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bta.a;
         $$2 = this.a($$1);
         $$3 = $$2.e();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.g($$1);
         if (!$$2.e() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.I() > 1) {
            cuo $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return cuo.l;
      }
   }

   @Override
   protected void b(bta $$0, cuo $$1) {
      this.a($$0, $$1);
      this.f($$0);
      this.cg = true;
   }

   public void f(bta $$0) {
      switch ($$0.a()) {
         case a:
            this.bU[$$0.b()] = 2.0F;
            break;
         case b:
            this.bV[$$0.b()] = 2.0F;
            break;
         case c:
            this.bW = 2.0F;
      }
   }

   protected boolean b(cuo $$0, cuo $$1) {
      if ($$1.e()) {
         return true;
      } else if ($$0.g() instanceof cwb) {
         if (!($$1.g() instanceof cwb)) {
            return true;
         } else {
            double $$2 = this.o($$0);
            double $$3 = this.o($$1);
            return $$2 != $$3 ? $$2 > $$3 : this.c($$0, $$1);
         }
      } else if ($$0.g() instanceof csr && $$1.g() instanceof csr) {
         return this.c($$0, $$1);
      } else if ($$0.g() instanceof ctb && $$1.g() instanceof ctb) {
         return this.c($$0, $$1);
      } else if ($$0.g() instanceof csd $$4) {
         if (daa.f($$1)) {
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
         if ($$0.g() instanceof ctd) {
            if ($$1.g() instanceof csm) {
               return true;
            }

            if ($$1.g() instanceof ctd) {
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
      cxj $$1 = $$0.a(km.n, cxj.a);
      return $$1.a(this.h(buw.c), bta.a);
   }

   public boolean c(cuo $$0, cuo $$1) {
      return $$0.n() < $$1.n() ? true : p($$0) && !p($$1);
   }

   private static boolean p(cuo $$0) {
      ki $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(km.e);
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
      return this.bR();
   }

   protected boolean X() {
      return false;
   }

   @Override
   public void dB() {
      if (this.dP().al() == bqq.a && this.X()) {
         this.ao();
      } else if (!this.fW() && !this.W()) {
         bst $$0 = this.dP().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.ak().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.ao();
            }

            int $$4 = this.ak().f().g();
            int $$5 = $$4 * $$4;
            if (this.bf > 600 && this.ah.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.ao();
            } else if ($$1 < (double)$$5) {
               this.bf = 0;
            }
         }
      } else {
         this.bf = 0;
      }
   }

   @Override
   protected final void fq() {
      this.bf++;
      bnh $$0 = this.dP().ag();
      $$0.a("sensing");
      this.cb.a();
      $$0.c();
      int $$1 = this.ai + this.al();
      if ($$1 % 2 != 0 && this.ai > 1) {
         $$0.a("targetSelector");
         this.bT.a(false);
         $$0.c();
         $$0.a("goalSelector");
         this.bS.a(false);
         $$0.c();
      } else {
         $$0.a("targetSelector");
         this.bT.a();
         $$0.c();
         $$0.a("goalSelector");
         this.bS.a();
         $$0.c();
      }

      $$0.a("navigation");
      this.bR.c();
      $$0.c();
      $$0.a("mob tick");
      this.Z();
      $$0.c();
      $$0.a("controls");
      $$0.a("move");
      this.bP.a();
      $$0.b("look");
      this.bO.a();
      $$0.b("jump");
      this.bQ.b();
      $$0.c();
      $$0.c();
      this.Y();
   }

   protected void Y() {
      ags.a(this.dP(), this, this.bS);
   }

   protected void Z() {
   }

   public int aa() {
      return 40;
   }

   public int ab() {
      return 75;
   }

   protected void ad() {
      float $$0 = (float)this.ab();
      float $$1 = this.cs();
      float $$2 = ayy.g(this.aY - $$1);
      float $$3 = ayy.a(ayy.g(this.aY - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.n($$4);
   }

   public int ae() {
      return 10;
   }

   public void a(bst $$0, float $$1, float $$2) {
      double $$3 = $$0.du() - this.du();
      double $$4 = $$0.dA() - this.dA();
      double $$6;
      if ($$0 instanceof bto $$5) {
         $$6 = $$5.dy() - this.dy();
      } else {
         $$6 = ($$0.cK().b + $$0.cK().e) / 2.0 - this.dy();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(ayy.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(ayy.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dH(), $$10, $$2));
      this.r(this.a(this.dF(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ayy.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bsz<? extends btq> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      iz $$5 = $$3.d();
      return $$2 == bts.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dby $$0, bts $$1) {
      return true;
   }

   public boolean a(dca $$0) {
      return !$$0.d(this.cK()) && $$0.f(this);
   }

   public int fQ() {
      return 4;
   }

   public boolean d(int $$0) {
      return false;
   }

   @Override
   public int cx() {
      if (this.p() == null) {
         return this.u(0.0F);
      } else {
         int $$0 = (int)(this.eA() - this.eR() * 0.33F);
         $$0 -= (3 - this.dP().al().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.u((float)$$0);
      }
   }

   @Override
   public Iterable<cuo> fa() {
      return this.cc;
   }

   @Override
   public Iterable<cuo> eZ() {
      return this.cd;
   }

   public cuo fR() {
      return this.ce;
   }

   public boolean fS() {
      return false;
   }

   @Override
   public boolean d(bta $$0) {
      return true;
   }

   public boolean fT() {
      return !this.a(bta.g).e();
   }

   public boolean l(cuo $$0) {
      return false;
   }

   public void m(cuo $$0) {
      this.b(bta.g, $$0);
   }

   @Override
   public Iterable<cuo> fb() {
      return (Iterable<cuo>)(this.ce.e() ? this.cd : Iterables.concat(this.cd, List.of(this.ce)));
   }

   @Override
   public cuo a(bta $$0) {
      return switch ($$0.a()) {
         case a -> (cuo)this.cc.get($$0.b());
         case b -> (cuo)this.cd.get($$0.b());
         case c -> this.ce;
      };
   }

   @Override
   public void a(bta $$0, cuo $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cc.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cd.set($$0.b(), $$1), $$1);
            break;
         case c:
            cuo $$2 = this.ce;
            this.ce = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(brm $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bta $$3 : bta.values()) {
         cuo $$4 = this.a($$3);
         float $$5 = this.g($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.e() && !daa.g($$4) && ($$2 || $$6) && Math.max(this.ah.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.l()) {
               $$4.b($$4.o() - this.ah.a(1 + this.ah.a(Math.max($$4.o() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, cuo.l);
         }
      }
   }

   protected float g(bta $$0) {
      return switch ($$0.a()) {
         case a -> this.bU[$$0.b()];
         case b -> this.bV[$$0.b()];
         case c -> this.bW;
      };
   }

   private eqk c(are $$0) {
      return new eqk.a($$0).a(etd.f, this.dn()).a(etd.a, this).a(etc.h);
   }

   public void a(btc $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(ald<eqm> $$0, Map<bta, Float> $$1) {
      if (this.dP() instanceof are $$2) {
         this.a($$0, this.c($$2), $$1);
      }
   }

   protected void a(azg $$0, bqr $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dP().al() == bqq.d ? 0.1F : 0.25F;
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

         for (bta $$5 : bta.values()) {
            if ($$5.a() == bta.a.b) {
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
   public static cuj a(bta $$0, int $$1) {
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

   protected void b(azg $$0, bqr $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bta $$3 : bta.values()) {
         if ($$3.a() == bta.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(azg $$0, float $$1) {
      if (!this.eX().e() && $$0.i() < 0.25F * $$1) {
         this.a(bta.a, daa.a(this.dP().J(), $$0, this.eX(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(azg $$0, float $$1, bta $$2) {
      cuo $$3 = this.a($$2);
      if (!$$3.e() && $$0.i() < 0.5F * $$1) {
         this.a($$2, daa.a(this.dP().J(), $$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      azg $$4 = $$0.E_();
      this.f(buw.k).d(new buu("Random spawn bonus", $$4.a(0.0, 0.11485000000000001), buu.a.b));
      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fU() {
      this.cg = true;
   }

   @Override
   public void a(bta $$0, float $$1) {
      switch ($$0.a()) {
         case a:
            this.bU[$$0.b()] = $$1;
            break;
         case b:
            this.bV[$$0.b()] = $$1;
            break;
         case c:
            this.bW = $$1;
      }
   }

   public boolean fV() {
      return this.cf;
   }

   public void a_(boolean $$0) {
      this.cf = $$0;
   }

   @Override
   public boolean f(cuo $$0) {
      bta $$1 = h($$0);
      return this.a($$1).e() && this.fV();
   }

   public boolean fW() {
      return this.cg;
   }

   @Override
   public final bqt a(cmw $$0, bqs $$1) {
      if (!this.bD()) {
         return bqt.e;
      } else if (this.gf() == $$0) {
         this.a(true, !$$0.fP());
         this.a(dwu.r, $$0);
         return bqt.a(this.dP().B);
      } else {
         bqt $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dwu.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dwu.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bqt c(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.uK) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bqt.a(this.dP().B);
      } else {
         if ($$2.a(cur.uL)) {
            bqt $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.g() instanceof cvv) {
            if (this.dP() instanceof are) {
               cvv $$4 = (cvv)$$2.g();
               Optional<btq> $$5 = $$4.a($$0, this, (bsz<? extends btq>)this.ak(), (are)this.dP(), this.dn(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bqt.a : bqt.e;
            } else {
               return bqt.c;
            }
         } else {
            return bqt.e;
         }
      }
   }

   protected void a(cmw $$0, btq $$1) {
   }

   protected bqt b(cmw $$0, bqs $$1) {
      return bqt.e;
   }

   public boolean fX() {
      return this.a(this.dp());
   }

   public boolean a(iz $$0) {
      return this.co == -1.0F ? true : this.cn.j($$0) < (double)(this.co * this.co);
   }

   public void a(iz $$0, int $$1) {
      this.cn = $$0;
      this.co = (float)$$1;
   }

   public iz fY() {
      return this.cn;
   }

   public float fZ() {
      return this.co;
   }

   public void ga() {
      this.co = -1.0F;
   }

   public boolean gb() {
      return this.co != -1.0F;
   }

   @Nullable
   public <T extends btq> T a(bsz<T> $$0, boolean $$1) {
      if (this.dK()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dP());
         if ($$2 == null) {
            return null;
         } else {
            $$2.v(this);
            $$2.a(this.p_());
            $$2.t(this.gg());
            if (this.ag()) {
               $$2.b(this.ah());
               $$2.o(this.cE());
            }

            if (this.fW()) {
               $$2.fU();
            }

            $$2.n(this.cu());
            if ($$1) {
               $$2.a_(this.fV());

               for (bta $$3 : bta.values()) {
                  cuo $$4 = this.a($$3);
                  if (!$$4.e()) {
                     $$2.a($$3, $$4.f());
                     $$2.a($$3, this.g($$3));
                  }
               }
            }

            this.dP().b($$2);
            if (this.bR()) {
               bst $$5 = this.dc();
               this.ac();
               $$2.a($$5, true);
            }

            this.ao();
            return $$2;
         }
      }
   }

   protected void gc() {
      if (this.cm != null) {
         this.gm();
      }

      if (this.ck != null) {
         if (!this.bD() || !this.ck.bD()) {
            this.a(true, true);
         }
      }
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.ck != null) {
         this.ck = null;
         this.cm = null;
         this.ga();
         if (!this.dP().B && $$1) {
            this.a(cur.uK);
         }

         if (!this.dP().B && $$0 && this.dP() instanceof are) {
            ((are)this.dP()).l().b(this, new afn(this, null));
         }
      }
   }

   public boolean a(cmw $$0) {
      return !this.gd() && !(this instanceof cju);
   }

   public boolean gd() {
      return this.ck != null;
   }

   public boolean ge() {
      return this.gd() || this.cm != null;
   }

   @Nullable
   public bst gf() {
      if (this.ck == null && this.cl != 0 && this.dP().B) {
         this.ck = this.dP().a(this.cl);
      }

      return this.ck;
   }

   public void b(bst $$0, boolean $$1) {
      this.ck = $$0;
      this.cm = null;
      if (!this.dP().B && $$1 && this.dP() instanceof are) {
         ((are)this.dP()).l().b(this, new afn(this, this.ck));
      }

      if (this.bR()) {
         this.ac();
      }
   }

   public void s(int $$0) {
      this.cl = $$0;
      this.a(false, false);
   }

   @Override
   public boolean a(bst $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.gd()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gm() {
      if (this.cm != null && this.dP() instanceof are $$0) {
         Optional<UUID> $$1 = this.cm.left();
         Optional<iz> $$2 = this.cm.right();
         if ($$1.isPresent()) {
            bst $$3 = $$0.a($$1.get());
            if ($$3 != null) {
               this.b($$3, true);
               return;
            }
         } else if ($$2.isPresent()) {
            this.b(cja.b(this.dP(), $$2.get()), true);
            return;
         }

         if (this.ai > 100) {
            this.a(cur.uK);
            this.cm = null;
         }
      }
   }

   @Override
   public boolean db() {
      return super.db() && !this.gg();
   }

   public void t(boolean $$0) {
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

   public boolean gg() {
      return (this.ao.a(b) & 1) != 0;
   }

   public boolean gh() {
      return (this.ao.a(b) & 2) != 0;
   }

   public boolean gi() {
      return (this.ao.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bti fu() {
      return this.gh() ? bti.a : bti.b;
   }

   public boolean i(bto $$0) {
      return this.gj().c($$0.eK());
   }

   protected evl gj() {
      bst $$0 = this.dc();
      evl $$3;
      if ($$0 != null) {
         evl $$1 = $$0.cK();
         evl $$2 = this.cK();
         $$3 = new evl(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cK();
      }

      return $$3.c(bY, 0.0, bY);
   }

   @Override
   public boolean C(bst $$0) {
      float $$1 = (float)this.g(buw.c);
      float $$2 = (float)this.g(buw.d);
      if ($$0 instanceof bto) {
         $$1 += daa.a(this.eX(), $$0.ak());
         $$2 += (float)daa.c(this);
      }

      int $$3 = daa.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dQ().b((bto)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof bto) {
            ((bto)$$0).q((double)($$2 * 0.5F), (double)ayy.a(this.dF() * (float) (Math.PI / 180.0)), (double)(-ayy.b(this.dF() * (float) (Math.PI / 180.0))));
            this.h(this.ds().d(0.6, 1.0, 0.6));
         }

         this.a(this, $$0);
         this.A($$0);
      }

      return $$4;
   }

   protected boolean gk() {
      if (this.dP().R() && !this.dP().B) {
         float $$0 = this.bt();
         iz $$1 = iz.a(this.du(), this.dy(), this.dA());
         boolean $$2 = this.bg() || this.aB || this.aC;
         if ($$0 > 0.5F && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dP().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(axe<ent> $$0) {
      if (this.K().p()) {
         super.c($$0);
      } else {
         this.h(this.ds().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gl() {
      this.c($$0 -> true);
      this.dS().h();
   }

   public void c(Predicate<cam> $$0) {
      this.bS.a($$0);
   }

   @Override
   protected void cv() {
      super.cv();
      this.a(true, false);
      this.fc().forEach($$0 -> {
         if (!$$0.e()) {
            $$0.e(0);
         }
      });
   }

   @Nullable
   @Override
   public cuo dC() {
      cvv $$0 = cvv.a(this.ak());
      return $$0 == null ? null : new cuo($$0);
   }
}

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

public abstract class bts extends btq implements btf, buo {
   private static final akk<Byte> b = ako.a(bts.class, akm.a);
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
   protected bzq bO;
   protected bzr bP;
   protected bzp bQ;
   private final bzm bZ;
   protected cdc bR;
   protected final cap bS;
   protected final cap bT;
   @Nullable
   private btq ca;
   private final cdz cb;
   private final jr<cuq> cc = jr.a(2, cuq.l);
   protected final float[] bU = new float[2];
   private final jr<cuq> cd = jr.a(4, cuq.l);
   protected final float[] bV = new float[4];
   private cuq ce = cuq.l;
   protected float bW;
   private boolean cf;
   private boolean cg;
   private final Map<eon, Float> ch = Maps.newEnumMap(eon.class);
   @Nullable
   private ale<eqo> ci;
   private long cj;
   @Nullable
   private bsv ck;
   private int cl;
   @Nullable
   private Either<UUID, iz> cm;
   private iz cn = iz.c;
   private float co = -1.0F;

   protected bts(btb<? extends bts> $$0, dbz $$1) {
      super($$0, $$1);
      this.bS = new cap($$1.ah());
      this.bT = new cap($$1.ah());
      this.bO = new bzq(this);
      this.bP = new bzr(this);
      this.bQ = new bzp(this);
      this.bZ = this.E();
      this.bR = this.b($$1);
      this.cb = new cdz(this);
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

   public static bux.a A() {
      return btq.dU().a(buy.k, 16.0).a(buy.d);
   }

   protected cdc b(dbz $$0) {
      return new cdb(this, $$0);
   }

   protected boolean B() {
      return false;
   }

   public float a(eon $$0) {
      bts $$2;
      label17: {
         if (this.dd() instanceof bts $$1 && $$1.B()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.ch.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(eon $$0, float $$1) {
      this.ch.put($$0, $$1);
   }

   @Override
   public void C() {
   }

   @Override
   public void D() {
   }

   protected bzm E() {
      return new bzm(this);
   }

   public bzq G() {
      return this.bO;
   }

   public bzr H() {
      return this.dd() instanceof bts $$0 ? $$0.H() : this.bP;
   }

   public bzp I() {
      return this.bQ;
   }

   public cdc K() {
      return this.dd() instanceof bts $$0 ? $$0.K() : this.bR;
   }

   @Nullable
   @Override
   public btq cQ() {
      bsv $$0 = this.cT();
      if (!this.gg() && $$0 instanceof bts $$1 && $$0.bU()) {
         return $$1;
      }

      return null;
   }

   public cdz M() {
      return this.cb;
   }

   @Nullable
   @Override
   public btq p() {
      return this.ca;
   }

   @Nullable
   protected final btq N() {
      return this.dS().c(ccu.o).orElse(null);
   }

   public void h(@Nullable btq $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(btb<?> $$0) {
      return $$0 != btb.T;
   }

   public boolean a(cvj $$0) {
      return false;
   }

   public void O() {
      this.a(dww.m);
   }

   @Override
   protected void a(ako.a $$0) {
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
   protected void e(bro $$0) {
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
      boolean $$0 = !(this.cQ() instanceof bts);
      boolean $$1 = !(this.dc() instanceof cow);
      this.bS.a(cao.a.a, $$0);
      this.bS.a(cao.a.c, $$0 && $$1);
      this.bS.a(cao.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bZ.a();
      return $$1;
   }

   @Nullable
   protected avz v() {
      return null;
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fV());
      $$0.a("PersistenceRequired", this.cg);
      uy $$1 = new uy();

      for (cuq $$2 : this.cd) {
         if (!$$2.e()) {
            $$1.add($$2.a(this.dR()));
         } else {
            $$1.add(new us());
         }
      }

      $$0.a("ArmorItems", $$1);
      uy $$3 = new uy();

      for (float $$4 : this.bV) {
         $$3.add(uv.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      uy $$5 = new uy();

      for (cuq $$6 : this.cc) {
         if (!$$6.e()) {
            $$5.add($$6.a(this.dR()));
         } else {
            $$5.add(new us());
         }
      }

      $$0.a("HandItems", $$5);
      uy $$7 = new uy();

      for (float $$8 : this.bU) {
         $$7.add(uv.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.ce.e()) {
         $$0.a("body_armor_item", this.ce.a(this.dR()));
         $$0.a("body_armor_drop_chance", this.bW);
      }

      Either<UUID, iz> $$9 = this.cm;
      if (this.ck instanceof btq) {
         $$9 = Either.left(this.ck.cz());
      } else if (this.ck instanceof cja $$10) {
         $$9 = Either.right($$10.D());
      }

      if ($$9 != null) {
         $$0.a("leash", (vp)$$9.map($$0x -> {
            us $$1x = new us();
            $$1x.a("UUID", $$0x);
            return $$1x;
         }, vh::a));
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
   public void a(us $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.cg = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         uy $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cd.size(); $$2++) {
            us $$3 = $$1.a($$2);
            this.cd.set($$2, cuq.a(this.dR(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         uy $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bV[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         uy $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.cc.size(); $$7++) {
            us $$8 = $$6.a($$7);
            this.cc.set($$7, cuq.a(this.dR(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         uy $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bU[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.ce = cuq.a(this.dR(), (vp)$$0.p("body_armor_item")).orElse(cuq.l);
         this.bW = $$0.j("body_armor_drop_chance");
      } else {
         this.ce = cuq.l;
      }

      if ($$0.b("leash", 10)) {
         this.cm = Either.left($$0.p("leash").a("UUID"));
      } else if ($$0.b("leash", 11)) {
         this.cm = vh.a($$0, "leash").<Either<UUID, iz>>map(Either::right).orElse(null);
      } else {
         this.cm = null;
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.ci = ale.a(lq.aU, new alf($$0.l("DeathLootTable")));
         this.cj = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(bro $$0, boolean $$1) {
      super.a($$0, $$1);
      this.ci = null;
   }

   @Override
   public final ale<eqo> eF() {
      return this.ci == null ? this.T() : this.ci;
   }

   protected ale<eqo> T() {
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
      if (!this.dP().B && this.fV() && this.bD() && !this.be && this.dP().ab().b(dbv.c)) {
         kd $$0 = this.V();

         for (cji $$2 : this.dP().a(cji.class, this.cK().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
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

   protected void b(cji $$0) {
      cuq $$1 = $$0.p();
      cuq $$2 = this.i($$1.s());
      if (!$$2.e()) {
         this.a($$0);
         this.a($$0, $$2.I());
         $$1.h($$2.I());
         if ($$1.e()) {
            $$0.ao();
         }
      }
   }

   public cuq i(cuq $$0) {
      btc $$1 = h($$0);
      cuq $$2 = this.a($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = btc.a;
         $$2 = this.a($$1);
         $$3 = $$2.e();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.g($$1);
         if (!$$2.e() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.I() > 1) {
            cuq $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return cuq.l;
      }
   }

   @Override
   protected void b(btc $$0, cuq $$1) {
      this.a($$0, $$1);
      this.f($$0);
      this.cg = true;
   }

   public void f(btc $$0) {
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

   protected boolean b(cuq $$0, cuq $$1) {
      if ($$1.e()) {
         return true;
      } else if ($$0.g() instanceof cwd) {
         if (!($$1.g() instanceof cwd)) {
            return true;
         } else {
            double $$2 = this.o($$0);
            double $$3 = this.o($$1);
            return $$2 != $$3 ? $$2 > $$3 : this.c($$0, $$1);
         }
      } else if ($$0.g() instanceof cst && $$1.g() instanceof cst) {
         return this.c($$0, $$1);
      } else if ($$0.g() instanceof ctd && $$1.g() instanceof ctd) {
         return this.c($$0, $$1);
      } else if ($$0.g() instanceof csf $$4) {
         if (dac.f($$1)) {
            return false;
         } else if (!($$1.g() instanceof csf)) {
            return true;
         } else {
            csf $$5 = (csf)$$1.g();
            if ($$4.k() != $$5.k()) {
               return $$4.k() > $$5.k();
            } else {
               return $$4.l() != $$5.l() ? $$4.l() > $$5.l() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.g() instanceof ctf) {
            if ($$1.g() instanceof cso) {
               return true;
            }

            if ($$1.g() instanceof ctf) {
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

   private double o(cuq $$0) {
      cxl $$1 = $$0.a(km.n, cxl.a);
      return $$1.a(this.h(buy.c), btc.a);
   }

   public boolean c(cuq $$0, cuq $$1) {
      return $$0.n() < $$1.n() ? true : p($$0) && !p($$1);
   }

   private static boolean p(cuq $$0) {
      ki $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(km.e);
   }

   public boolean j(cuq $$0) {
      return true;
   }

   public boolean k(cuq $$0) {
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
      if (this.dP().al() == bqs.a && this.X()) {
         this.ao();
      } else if (!this.fW() && !this.W()) {
         bsv $$0 = this.dP().a(this, -1.0);
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
      bnj $$0 = this.dP().ag();
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
      agt.a(this.dP(), this, this.bS);
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
      float $$2 = ayz.g(this.aY - $$1);
      float $$3 = ayz.a(ayz.g(this.aY - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.n($$4);
   }

   public int ae() {
      return 10;
   }

   public void a(bsv $$0, float $$1, float $$2) {
      double $$3 = $$0.du() - this.du();
      double $$4 = $$0.dA() - this.dA();
      double $$6;
      if ($$0 instanceof btq $$5) {
         $$6 = $$5.dy() - this.dy();
      } else {
         $$6 = ($$0.cK().b + $$0.cK().e) / 2.0 - this.dy();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(ayz.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(ayz.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dH(), $$10, $$2));
      this.r(this.a(this.dF(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ayz.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(btb<? extends bts> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
      iz $$5 = $$3.d();
      return $$2 == btu.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dca $$0, btu $$1) {
      return true;
   }

   public boolean a(dcc $$0) {
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
   public Iterable<cuq> fa() {
      return this.cc;
   }

   @Override
   public Iterable<cuq> eZ() {
      return this.cd;
   }

   public cuq fR() {
      return this.ce;
   }

   public boolean fS() {
      return false;
   }

   @Override
   public boolean d(btc $$0) {
      return true;
   }

   public boolean fT() {
      return !this.a(btc.g).e();
   }

   public boolean l(cuq $$0) {
      return false;
   }

   public void m(cuq $$0) {
      this.b(btc.g, $$0);
   }

   @Override
   public Iterable<cuq> fb() {
      return (Iterable<cuq>)(this.ce.e() ? this.cd : Iterables.concat(this.cd, List.of(this.ce)));
   }

   @Override
   public cuq a(btc $$0) {
      return switch ($$0.a()) {
         case a -> (cuq)this.cc.get($$0.b());
         case b -> (cuq)this.cd.get($$0.b());
         case c -> this.ce;
      };
   }

   @Override
   public void a(btc $$0, cuq $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cc.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cd.set($$0.b(), $$1), $$1);
            break;
         case c:
            cuq $$2 = this.ce;
            this.ce = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(bro $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (btc $$3 : btc.values()) {
         cuq $$4 = this.a($$3);
         float $$5 = this.g($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.e() && !dac.g($$4) && ($$2 || $$6) && Math.max(this.ah.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.l()) {
               $$4.b($$4.o() - this.ah.a(1 + this.ah.a(Math.max($$4.o() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, cuq.l);
         }
      }
   }

   protected float g(btc $$0) {
      return switch ($$0.a()) {
         case a -> this.bU[$$0.b()];
         case b -> this.bV[$$0.b()];
         case c -> this.bW;
      };
   }

   private eqm c(arf $$0) {
      return new eqm.a($$0).a(etf.f, this.dn()).a(etf.a, this).a(ete.h);
   }

   public void a(bte $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(ale<eqo> $$0, Map<btc, Float> $$1) {
      if (this.dP() instanceof arf $$2) {
         this.a($$0, this.c($$2), $$1);
      }
   }

   protected void a(azh $$0, bqt $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dP().al() == bqs.d ? 0.1F : 0.25F;
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

         for (btc $$5 : btc.values()) {
            if ($$5.a() == btc.a.b) {
               cuq $$6 = this.a($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.e()) {
                  cul $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cuq($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cul a(btc $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cut.py;
            } else if ($$1 == 1) {
               return cut.pO;
            } else if ($$1 == 2) {
               return cut.pC;
            } else if ($$1 == 3) {
               return cut.pG;
            } else if ($$1 == 4) {
               return cut.pK;
            }
         case e:
            if ($$1 == 0) {
               return cut.pz;
            } else if ($$1 == 1) {
               return cut.pP;
            } else if ($$1 == 2) {
               return cut.pD;
            } else if ($$1 == 3) {
               return cut.pH;
            } else if ($$1 == 4) {
               return cut.pL;
            }
         case d:
            if ($$1 == 0) {
               return cut.pA;
            } else if ($$1 == 1) {
               return cut.pQ;
            } else if ($$1 == 2) {
               return cut.pE;
            } else if ($$1 == 3) {
               return cut.pI;
            } else if ($$1 == 4) {
               return cut.pM;
            }
         case c:
            if ($$1 == 0) {
               return cut.pB;
            } else if ($$1 == 1) {
               return cut.pR;
            } else if ($$1 == 2) {
               return cut.pF;
            } else if ($$1 == 3) {
               return cut.pJ;
            } else if ($$1 == 4) {
               return cut.pN;
            }
         default:
            return null;
      }
   }

   protected void b(azh $$0, bqt $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (btc $$3 : btc.values()) {
         if ($$3.a() == btc.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(azh $$0, float $$1) {
      if (!this.eX().e() && $$0.i() < 0.25F * $$1) {
         this.a(btc.a, dac.a(this.dP().J(), $$0, this.eX(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(azh $$0, float $$1, btc $$2) {
      cuq $$3 = this.a($$2);
      if (!$$3.e() && $$0.i() < 0.5F * $$1) {
         this.a($$2, dac.a(this.dP().J(), $$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      azh $$4 = $$0.E_();
      this.f(buy.k).d(new buw("Random spawn bonus", $$4.a(0.0, 0.11485000000000001), buw.a.b));
      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fU() {
      this.cg = true;
   }

   @Override
   public void a(btc $$0, float $$1) {
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
   public boolean f(cuq $$0) {
      btc $$1 = h($$0);
      return this.a($$1).e() && this.fV();
   }

   public boolean fW() {
      return this.cg;
   }

   @Override
   public final bqv a(cmy $$0, bqu $$1) {
      if (!this.bD()) {
         return bqv.e;
      } else if (this.gf() == $$0) {
         this.a(true, !$$0.fP());
         this.a(dww.r, $$0);
         return bqv.a(this.dP().B);
      } else {
         bqv $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dww.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dww.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bqv c(cmy $$0, bqu $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.uK) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bqv.a(this.dP().B);
      } else {
         if ($$2.a(cut.uL)) {
            bqv $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.g() instanceof cvx) {
            if (this.dP() instanceof arf) {
               cvx $$4 = (cvx)$$2.g();
               Optional<bts> $$5 = $$4.a($$0, this, (btb<? extends bts>)this.ak(), (arf)this.dP(), this.dn(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bqv.a : bqv.e;
            } else {
               return bqv.c;
            }
         } else {
            return bqv.e;
         }
      }
   }

   protected void a(cmy $$0, bts $$1) {
   }

   protected bqv b(cmy $$0, bqu $$1) {
      return bqv.e;
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
   public <T extends bts> T a(btb<T> $$0, boolean $$1) {
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

               for (btc $$3 : btc.values()) {
                  cuq $$4 = this.a($$3);
                  if (!$$4.e()) {
                     $$2.a($$3, $$4.f());
                     $$2.a($$3, this.g($$3));
                  }
               }
            }

            this.dP().b($$2);
            if (this.bR()) {
               bsv $$5 = this.dc();
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
            this.a(cut.uK);
         }

         if (!this.dP().B && $$0 && this.dP() instanceof arf) {
            ((arf)this.dP()).l().b(this, new afo(this, null));
         }
      }
   }

   public boolean a(cmy $$0) {
      return !this.gd() && !(this instanceof cjw);
   }

   public boolean gd() {
      return this.ck != null;
   }

   public boolean ge() {
      return this.gd() || this.cm != null;
   }

   @Nullable
   public bsv gf() {
      if (this.ck == null && this.cl != 0 && this.dP().B) {
         this.ck = this.dP().a(this.cl);
      }

      return this.ck;
   }

   public void b(bsv $$0, boolean $$1) {
      this.ck = $$0;
      this.cm = null;
      if (!this.dP().B && $$1 && this.dP() instanceof arf) {
         ((arf)this.dP()).l().b(this, new afo(this, this.ck));
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
   public boolean a(bsv $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.gd()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gm() {
      if (this.cm != null && this.dP() instanceof arf $$0) {
         Optional<UUID> $$1 = this.cm.left();
         Optional<iz> $$2 = this.cm.right();
         if ($$1.isPresent()) {
            bsv $$3 = $$0.a($$1.get());
            if ($$3 != null) {
               this.b($$3, true);
               return;
            }
         } else if ($$2.isPresent()) {
            this.b(cjc.b(this.dP(), $$2.get()), true);
            return;
         }

         if (this.ai > 100) {
            this.a(cut.uK);
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
   public btk fu() {
      return this.gh() ? btk.a : btk.b;
   }

   public boolean i(btq $$0) {
      return this.gj().c($$0.eK());
   }

   protected evn gj() {
      bsv $$0 = this.dc();
      evn $$3;
      if ($$0 != null) {
         evn $$1 = $$0.cK();
         evn $$2 = this.cK();
         $$3 = new evn(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cK();
      }

      return $$3.c(bY, 0.0, bY);
   }

   @Override
   public boolean C(bsv $$0) {
      float $$1 = (float)this.g(buy.c);
      float $$2 = (float)this.g(buy.d);
      if ($$0 instanceof btq) {
         $$1 += dac.a(this.eX(), $$0.ak());
         $$2 += (float)dac.c(this);
      }

      int $$3 = dac.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dQ().b((btq)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof btq) {
            ((btq)$$0).q((double)($$2 * 0.5F), (double)ayz.a(this.dF() * (float) (Math.PI / 180.0)), (double)(-ayz.b(this.dF() * (float) (Math.PI / 180.0))));
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
   protected void c(axf<env> $$0) {
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

   public void c(Predicate<cao> $$0) {
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
   public cuq dC() {
      cvx $$0 = cvx.a(this.ak());
      return $$0 == null ? null : new cuq($$0);
   }
}

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

public abstract class brg extends bre implements bsb {
   private static final ajk<Byte> b = ajo.a(brg.class, ajm.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final jq bX = new jq(1, 0, 1);
   public static final float g = 0.15F;
   public static final float h = 0.55F;
   public static final float bG = 0.5F;
   public static final float bH = 0.25F;
   public static final String bI = "leash";
   public static final float bJ = 0.085F;
   public static final int bK = 2;
   public static final int bL = 2;
   private static final double bY = Math.sqrt(2.04F) - 0.6F;
   public int bM;
   protected int bN;
   protected bxd bO;
   protected bxe bP;
   protected bxc bQ;
   private final bwz bZ;
   protected cap bR;
   protected final byc bS;
   protected final byc bT;
   @Nullable
   private bre ca;
   private final cbm cb;
   private final je<csd> cc = je.a(2, csd.i);
   protected final float[] bU = new float[2];
   private final je<csd> cd = je.a(4, csd.i);
   protected final float[] bV = new float[4];
   private csd ce = csd.i;
   protected float bW;
   private boolean cf;
   private boolean cg;
   private final Map<emi, Float> ch = Maps.newEnumMap(emi.class);
   @Nullable
   private akf ci;
   private long cj;
   @Nullable
   private bql ck;
   private int cl;
   @Nullable
   private Either<UUID, im> cm;
   private im cn = im.c;
   private float co = -1.0F;

   protected brg(bqr<? extends brg> $$0, czu $$1) {
      super($$0, $$1);
      this.bS = new byc($$1.ag());
      this.bT = new byc($$1.ag());
      this.bO = new bxd(this);
      this.bP = new bxe(this);
      this.bQ = new bxc(this);
      this.bZ = this.E();
      this.bR = this.b($$1);
      this.cb = new cbm(this);
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

   public static bsk.a A() {
      return bre.dS().a(bsl.k, 16.0).a(bsl.d);
   }

   protected cap b(czu $$0) {
      return new cao(this, $$0);
   }

   protected boolean B() {
      return false;
   }

   public float a(emi $$0) {
      brg $$2;
      label17: {
         if (this.db() instanceof brg $$1 && $$1.B()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.ch.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(emi $$0, float $$1) {
      this.ch.put($$0, $$1);
   }

   @Override
   public void C() {
   }

   @Override
   public void D() {
   }

   protected bwz E() {
      return new bwz(this);
   }

   public bxd G() {
      return this.bO;
   }

   public bxe H() {
      return this.db() instanceof brg $$0 ? $$0.H() : this.bP;
   }

   public bxc I() {
      return this.bQ;
   }

   public cap K() {
      return this.db() instanceof brg $$0 ? $$0.K() : this.bR;
   }

   @Nullable
   @Override
   public bre cO() {
      bql $$0 = this.cR();
      if (!this.gf() && $$0 instanceof brg $$1 && $$0.bS()) {
         return $$1;
      }

      return null;
   }

   public cbm M() {
      return this.cb;
   }

   @Nullable
   @Override
   public bre p() {
      return this.ca;
   }

   public void h(@Nullable bre $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(bqr<?> $$0) {
      return $$0 != bqr.T;
   }

   public boolean a(csu $$0) {
      return false;
   }

   public void N() {
      this.a(dur.m);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   public int O() {
      return 80;
   }

   public void P() {
      this.b(this.v());
   }

   @Override
   public void as() {
      super.as();
      this.dN().af().a("mobBaseTick");
      if (this.bB() && this.ah.a(1000) < this.bM++) {
         this.r();
         this.P();
      }

      this.dN().af().c();
   }

   @Override
   protected void e(bpj $$0) {
      this.r();
      super.e($$0);
   }

   private void r() {
      this.bM = -this.O();
   }

   @Override
   public int eh() {
      if (this.bN > 0) {
         int $$0 = this.bN;

         for (int $$1 = 0; $$1 < this.cd.size(); $$1++) {
            if (!this.cd.get($$1).d() && this.bV[$$1] <= 1.0F) {
               $$0 += 1 + this.ah.a(3);
            }
         }

         for (int $$2 = 0; $$2 < this.cc.size(); $$2++) {
            if (!this.cc.get($$2).d() && this.bU[$$2] <= 1.0F) {
               $$0 += 1 + this.ah.a(3);
            }
         }

         if (!this.ce.d() && this.bW <= 1.0F) {
            $$0 += 1 + this.ah.a(3);
         }

         return $$0;
      } else {
         return this.bN;
      }
   }

   public void Q() {
      if (this.dN().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.ah.k() * 0.02;
            double $$2 = this.ah.k() * 0.02;
            double $$3 = this.ah.k() * 0.02;
            double $$4 = 10.0;
            this.dN().a(kw.Y, this.c(1.0) - $$1 * 10.0, this.dv() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dN().a(this, (byte)20);
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
      if (!this.dN().B) {
         this.gb();
         if (this.ai % 5 == 0) {
            this.R();
         }
      }
   }

   protected void R() {
      boolean $$0 = !(this.cO() instanceof brg);
      boolean $$1 = !(this.da() instanceof cmi);
      this.bS.a(byb.a.a, $$0);
      this.bS.a(byb.a.c, $$0 && $$1);
      this.bS.a(byb.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bZ.a();
      return $$1;
   }

   @Nullable
   protected auy v() {
      return null;
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fU());
      $$0.a("PersistenceRequired", this.cg);
      ue $$1 = new ue();

      for (csd $$2 : this.cd) {
         if (!$$2.d()) {
            $$1.add($$2.a(this.dP()));
         } else {
            $$1.add(new ty());
         }
      }

      $$0.a("ArmorItems", $$1);
      ue $$3 = new ue();

      for (float $$4 : this.bV) {
         $$3.add(ub.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      ue $$5 = new ue();

      for (csd $$6 : this.cc) {
         if (!$$6.d()) {
            $$5.add($$6.a(this.dP()));
         } else {
            $$5.add(new ty());
         }
      }

      $$0.a("HandItems", $$5);
      ue $$7 = new ue();

      for (float $$8 : this.bU) {
         $$7.add(ub.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.ce.d()) {
         $$0.a("body_armor_item", this.ce.a(this.dP()));
         $$0.a("body_armor_drop_chance", this.bW);
      }

      Either<UUID, im> $$9 = this.cm;
      if (this.ck instanceof bre) {
         $$9 = Either.left(this.ck.cx());
      } else if (this.ck instanceof cgn $$10) {
         $$9 = Either.right($$10.D());
      }

      if ($$9 != null) {
         $$0.a("leash", (uv)$$9.map($$0x -> {
            ty $$1x = new ty();
            $$1x.a("UUID", $$0x);
            return $$1x;
         }, un::a));
      }

      $$0.a("LeftHanded", this.gg());
      if (this.ci != null) {
         $$0.a("DeathLootTable", this.ci.toString());
         if (this.cj != 0L) {
            $$0.a("DeathLootTableSeed", this.cj);
         }
      }

      if (this.gf()) {
         $$0.a("NoAI", this.gf());
      }
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.cg = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         ue $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cd.size(); $$2++) {
            ty $$3 = $$1.a($$2);
            this.cd.set($$2, csd.a(this.dP(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         ue $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bV[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         ue $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.cc.size(); $$7++) {
            ty $$8 = $$6.a($$7);
            this.cc.set($$7, csd.a(this.dP(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         ue $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bU[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.ce = csd.a(this.dP(), (uv)$$0.p("body_armor_item")).orElse(csd.i);
         this.bW = $$0.j("body_armor_drop_chance");
      } else {
         this.ce = csd.i;
      }

      if ($$0.b("leash", 10)) {
         this.cm = Either.left($$0.p("leash").a("UUID"));
      } else if ($$0.b("leash", 11)) {
         this.cm = un.a($$0, "leash").<Either<UUID, im>>map(Either::right).orElse(null);
      } else {
         this.cm = null;
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.ci = new akf($$0.l("DeathLootTable"));
         this.cj = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(bpj $$0, boolean $$1) {
      super.a($$0, $$1);
      this.ci = null;
   }

   @Override
   public final akf eD() {
      return this.ci == null ? this.S() : this.ci;
   }

   protected akf S() {
      return super.eD();
   }

   @Override
   public long eE() {
      return this.cj;
   }

   public void C(float $$0) {
      this.br = $$0;
   }

   public void D(float $$0) {
      this.bq = $$0;
   }

   public void E(float $$0) {
      this.bp = $$0;
   }

   @Override
   public void y(float $$0) {
      super.y($$0);
      this.C($$0);
   }

   public void T() {
      this.K().n();
      this.E(0.0F);
      this.D(0.0F);
      this.y(0.0F);
   }

   @Override
   public void n_() {
      super.n_();
      this.dN().af().a("looting");
      if (!this.dN().B && this.fU() && this.bB() && !this.bf && this.dN().aa().b(czq.c)) {
         jq $$0 = this.U();

         for (cgv $$2 : this.dN().a(cgv.class, this.cI().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dI() && !$$2.p().d() && !$$2.y() && this.k($$2.p())) {
               this.b($$2);
            }
         }
      }

      this.dN().af().c();
   }

   protected jq U() {
      return bX;
   }

   protected void b(cgv $$0) {
      csd $$1 = $$0.p();
      csd $$2 = this.i($$1.r());
      if (!$$2.d()) {
         this.a($$0);
         this.a($$0, $$2.G());
         $$1.g($$2.G());
         if ($$1.d()) {
            $$0.am();
         }
      }
   }

   public csd i(csd $$0) {
      bqs $$1 = h($$0);
      csd $$2 = this.d($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bqs.a;
         $$2 = this.d($$1);
         $$3 = $$2.d();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.g($$1);
         if (!$$2.d() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.G() > 1) {
            csd $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return csd.i;
      }
   }

   @Override
   protected void b(bqs $$0, csd $$1) {
      this.a($$0, $$1);
      this.f($$0);
      this.cg = true;
   }

   public void f(bqs $$0) {
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

   protected boolean b(csd $$0, csd $$1) {
      if ($$1.d()) {
         return true;
      } else if ($$0.f() instanceof cto) {
         if (!($$1.f() instanceof cto)) {
            return true;
         } else {
            double $$2 = this.o($$0);
            double $$3 = this.o($$1);
            return $$2 != $$3 ? $$2 > $$3 : this.c($$0, $$1);
         }
      } else if ($$0.f() instanceof cqg && $$1.f() instanceof cqg) {
         return this.c($$0, $$1);
      } else if ($$0.f() instanceof cqq && $$1.f() instanceof cqq) {
         return this.c($$0, $$1);
      } else if ($$0.f() instanceof cps $$4) {
         if (cxo.f($$1)) {
            return false;
         } else if (!($$1.f() instanceof cps)) {
            return true;
         } else {
            cps $$5 = (cps)$$1.f();
            if ($$4.i() != $$5.i()) {
               return $$4.i() > $$5.i();
            } else {
               return $$4.j() != $$5.j() ? $$4.j() > $$5.j() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.f() instanceof cqs) {
            if ($$1.f() instanceof cqb) {
               return true;
            }

            if ($$1.f() instanceof cqs) {
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

   private double o(csd $$0) {
      cuw $$1 = $$0.a(jz.i, cuw.a);
      return $$1.a(this.h(bsl.c), bqs.a);
   }

   public boolean c(csd $$0, csd $$1) {
      return $$0.m() < $$1.m() ? true : p($$0) && !p($$1);
   }

   private static boolean p(csd $$0) {
      jv $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(jz.b);
   }

   public boolean j(csd $$0) {
      return true;
   }

   public boolean k(csd $$0) {
      return this.j($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean V() {
      return this.bP();
   }

   protected boolean W() {
      return false;
   }

   @Override
   public void dz() {
      if (this.dN().ak() == bon.a && this.W()) {
         this.am();
      } else if (!this.fV() && !this.V()) {
         bql $$0 = this.dN().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.ai().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.am();
            }

            int $$4 = this.ai().f().g();
            int $$5 = $$4 * $$4;
            if (this.bg > 600 && this.ah.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.am();
            } else if ($$1 < (double)$$5) {
               this.bg = 0;
            }
         }
      } else {
         this.bg = 0;
      }
   }

   @Override
   protected final void fo() {
      this.bg++;
      ble $$0 = this.dN().af();
      $$0.a("sensing");
      this.cb.a();
      $$0.c();
      int $$1 = this.ai + this.aj();
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
      this.Y();
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
      this.X();
   }

   protected void X() {
      afu.a(this.dN(), this, this.bS);
   }

   protected void Y() {
   }

   public int Z() {
      return 40;
   }

   public int aa() {
      return 75;
   }

   protected void ab() {
      float $$0 = (float)this.aa();
      float $$1 = this.cq();
      float $$2 = axw.g(this.aZ - $$1);
      float $$3 = axw.a(axw.g(this.aZ - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.n($$4);
   }

   public int fO() {
      return 10;
   }

   public void a(bql $$0, float $$1, float $$2) {
      double $$3 = $$0.ds() - this.ds();
      double $$4 = $$0.dy() - this.dy();
      double $$6;
      if ($$0 instanceof bre $$5) {
         $$6 = $$5.dw() - this.dw();
      } else {
         $$6 = ($$0.cI().b + $$0.cI().e) / 2.0 - this.dw();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(axw.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(axw.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dF(), $$10, $$2));
      this.r(this.a(this.dD(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = axw.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bqr<? extends brg> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      im $$5 = $$3.d();
      return $$2 == bri.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(czv $$0, bri $$1) {
      return true;
   }

   public boolean a(czx $$0) {
      return !$$0.d(this.cI()) && $$0.f(this);
   }

   public int fP() {
      return 4;
   }

   public boolean d(int $$0) {
      return false;
   }

   @Override
   public int cv() {
      if (this.p() == null) {
         return this.u(0.0F);
      } else {
         int $$0 = (int)(this.ey() - this.eP() * 0.33F);
         $$0 -= (3 - this.dN().ak().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.u((float)$$0);
      }
   }

   @Override
   public Iterable<csd> eY() {
      return this.cc;
   }

   @Override
   public Iterable<csd> eX() {
      return this.cd;
   }

   public csd fQ() {
      return this.ce;
   }

   public boolean fR() {
      return false;
   }

   @Override
   public boolean c(bqs $$0) {
      return true;
   }

   public boolean fS() {
      return !this.d(bqs.g).d();
   }

   public boolean l(csd $$0) {
      return false;
   }

   public void m(csd $$0) {
      this.b(bqs.g, $$0);
   }

   @Override
   public Iterable<csd> eZ() {
      return (Iterable<csd>)(this.ce.d() ? this.cd : Iterables.concat(this.cd, List.of(this.ce)));
   }

   @Override
   public csd d(bqs $$0) {
      return switch ($$0.a()) {
         case a -> (csd)this.cc.get($$0.b());
         case b -> (csd)this.cd.get($$0.b());
         case c -> this.ce;
      };
   }

   @Override
   public void a(bqs $$0, csd $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cc.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cd.set($$0.b(), $$1), $$1);
            break;
         case c:
            csd $$2 = this.ce;
            this.ce = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(bpj $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bqs $$3 : bqs.values()) {
         csd $$4 = this.d($$3);
         float $$5 = this.g($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.d() && !cxo.g($$4) && ($$2 || $$6) && Math.max(this.ah.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.k()) {
               $$4.b($$4.n() - this.ah.a(1 + this.ah.a(Math.max($$4.n() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, csd.i);
         }
      }
   }

   protected float g(bqs $$0) {
      return switch ($$0.a()) {
         case a -> this.bU[$$0.b()];
         case b -> this.bV[$$0.b()];
         case c -> this.bW;
      };
   }

   protected void a(ayd $$0, boo $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dN().ak() == bon.d ? 0.1F : 0.25F;
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

         for (bqs $$5 : bqs.values()) {
            if ($$5.a() == bqs.a.b) {
               csd $$6 = this.d($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.d()) {
                  cry $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new csd($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cry a(bqs $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return csg.py;
            } else if ($$1 == 1) {
               return csg.pO;
            } else if ($$1 == 2) {
               return csg.pC;
            } else if ($$1 == 3) {
               return csg.pG;
            } else if ($$1 == 4) {
               return csg.pK;
            }
         case e:
            if ($$1 == 0) {
               return csg.pz;
            } else if ($$1 == 1) {
               return csg.pP;
            } else if ($$1 == 2) {
               return csg.pD;
            } else if ($$1 == 3) {
               return csg.pH;
            } else if ($$1 == 4) {
               return csg.pL;
            }
         case d:
            if ($$1 == 0) {
               return csg.pA;
            } else if ($$1 == 1) {
               return csg.pQ;
            } else if ($$1 == 2) {
               return csg.pE;
            } else if ($$1 == 3) {
               return csg.pI;
            } else if ($$1 == 4) {
               return csg.pM;
            }
         case c:
            if ($$1 == 0) {
               return csg.pB;
            } else if ($$1 == 1) {
               return csg.pR;
            } else if ($$1 == 2) {
               return csg.pF;
            } else if ($$1 == 3) {
               return csg.pJ;
            } else if ($$1 == 4) {
               return csg.pN;
            }
         default:
            return null;
      }
   }

   protected void b(ayd $$0, boo $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bqs $$3 : bqs.values()) {
         if ($$3.a() == bqs.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(ayd $$0, float $$1) {
      if (!this.eV().d() && $$0.i() < 0.25F * $$1) {
         this.a(bqs.a, cxo.a($$0, this.eV(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(ayd $$0, float $$1, bqs $$2) {
      csd $$3 = this.d($$2);
      if (!$$3.d() && $$0.i() < 0.5F * $$1) {
         this.a($$2, cxo.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      ayd $$4 = $$0.E_();
      this.f(bsl.k).d(new bsj("Random spawn bonus", $$4.a(0.0, 0.11485000000000001), bsj.a.b));
      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fT() {
      this.cg = true;
   }

   public void a(bqs $$0, float $$1) {
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

   public boolean fU() {
      return this.cf;
   }

   public void a_(boolean $$0) {
      this.cf = $$0;
   }

   @Override
   public boolean f(csd $$0) {
      bqs $$1 = h($$0);
      return this.d($$1).d() && this.fU();
   }

   public boolean fV() {
      return this.cg;
   }

   @Override
   public final boq a(ckl $$0, bop $$1) {
      if (!this.bB()) {
         return boq.d;
      } else if (this.ge() == $$0) {
         this.a(true, !$$0.fN());
         this.a(dur.r, $$0);
         return boq.a(this.dN().B);
      } else {
         boq $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dur.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dur.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private boq c(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if ($$2.a(csg.uK) && this.a($$0)) {
         this.b($$0, true);
         $$2.g(1);
         return boq.a(this.dN().B);
      } else {
         if ($$2.a(csg.uL)) {
            boq $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.f() instanceof cti) {
            if (this.dN() instanceof aqe) {
               cti $$4 = (cti)$$2.f();
               Optional<brg> $$5 = $$4.a($$0, this, (bqr<? extends brg>)this.ai(), (aqe)this.dN(), this.dl(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? boq.a : boq.d;
            } else {
               return boq.b;
            }
         } else {
            return boq.d;
         }
      }
   }

   protected void a(ckl $$0, brg $$1) {
   }

   protected boq b(ckl $$0, bop $$1) {
      return boq.d;
   }

   public boolean fW() {
      return this.a(this.dn());
   }

   public boolean a(im $$0) {
      return this.co == -1.0F ? true : this.cn.j($$0) < (double)(this.co * this.co);
   }

   public void a(im $$0, int $$1) {
      this.cn = $$0;
      this.co = (float)$$1;
   }

   public im fX() {
      return this.cn;
   }

   public float fY() {
      return this.co;
   }

   public void fZ() {
      this.co = -1.0F;
   }

   public boolean ga() {
      return this.co != -1.0F;
   }

   @Nullable
   public <T extends brg> T a(bqr<T> $$0, boolean $$1) {
      if (this.dI()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dN());
         if ($$2 == null) {
            return null;
         } else {
            $$2.v(this);
            $$2.a(this.p_());
            $$2.t(this.gf());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.o(this.cC());
            }

            if (this.fV()) {
               $$2.fT();
            }

            $$2.n(this.cs());
            if ($$1) {
               $$2.a_(this.fU());

               for (bqs $$3 : bqs.values()) {
                  csd $$4 = this.d($$3);
                  if (!$$4.d()) {
                     $$2.a($$3, $$4.e());
                     $$2.a($$3, this.g($$3));
                  }
               }
            }

            this.dN().b($$2);
            if (this.bP()) {
               bql $$5 = this.da();
               this.ac();
               $$2.a($$5, true);
            }

            this.am();
            return $$2;
         }
      }
   }

   protected void gb() {
      if (this.cm != null) {
         this.gl();
      }

      if (this.ck != null) {
         if (!this.bB() || !this.ck.bB()) {
            this.a(true, true);
         }
      }
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.ck != null) {
         this.ck = null;
         this.cm = null;
         this.fZ();
         if (!this.dN().B && $$1) {
            this.a(csg.uK);
         }

         if (!this.dN().B && $$0 && this.dN() instanceof aqe) {
            ((aqe)this.dN()).l().b(this, new aep(this, null));
         }
      }
   }

   public boolean a(ckl $$0) {
      return !this.gc() && !(this instanceof chj);
   }

   public boolean gc() {
      return this.ck != null;
   }

   public boolean gd() {
      return this.gc() || this.cm != null;
   }

   @Nullable
   public bql ge() {
      if (this.ck == null && this.cl != 0 && this.dN().B) {
         this.ck = this.dN().a(this.cl);
      }

      return this.ck;
   }

   public void b(bql $$0, boolean $$1) {
      this.ck = $$0;
      this.cm = null;
      if (!this.dN().B && $$1 && this.dN() instanceof aqe) {
         ((aqe)this.dN()).l().b(this, new aep(this, this.ck));
      }

      if (this.bP()) {
         this.ac();
      }
   }

   public void s(int $$0) {
      this.cl = $$0;
      this.a(false, false);
   }

   @Override
   public boolean a(bql $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.gc()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gl() {
      if (this.cm != null && this.dN() instanceof aqe $$0) {
         Optional<UUID> $$1 = this.cm.left();
         Optional<im> $$2 = this.cm.right();
         if ($$1.isPresent()) {
            bql $$3 = $$0.a($$1.get());
            if ($$3 != null) {
               this.b($$3, true);
               return;
            }
         } else if ($$2.isPresent()) {
            this.b(cgp.b(this.dN(), $$2.get()), true);
            return;
         }

         if (this.ai > 100) {
            this.a(csg.uK);
            this.cm = null;
         }
      }
   }

   @Override
   public boolean cZ() {
      return super.cZ() && !this.gf();
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

   public boolean gf() {
      return (this.ao.a(b) & 1) != 0;
   }

   public boolean gg() {
      return (this.ao.a(b) & 2) != 0;
   }

   public boolean gh() {
      return (this.ao.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bqy fs() {
      return this.gg() ? bqy.a : bqy.b;
   }

   public boolean i(bre $$0) {
      return this.gi().c($$0.eI());
   }

   protected eta gi() {
      bql $$0 = this.da();
      eta $$3;
      if ($$0 != null) {
         eta $$1 = $$0.cI();
         eta $$2 = this.cI();
         $$3 = new eta(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cI();
      }

      return $$3.c(bY, 0.0, bY);
   }

   @Override
   public boolean C(bql $$0) {
      float $$1 = (float)this.g(bsl.c);
      float $$2 = (float)this.g(bsl.d);
      if ($$0 instanceof bre) {
         $$1 += cxo.a(this.eV(), $$0.ai());
         $$2 += (float)cxo.c(this);
      }

      int $$3 = cxo.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dO().b((bre)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof bre) {
            ((bre)$$0).q((double)($$2 * 0.5F), (double)axw.a(this.dD() * (float) (Math.PI / 180.0)), (double)(-axw.b(this.dD() * (float) (Math.PI / 180.0))));
            this.g(this.dq().d(0.6, 1.0, 0.6));
         }

         this.a(this, $$0);
         this.A($$0);
      }

      return $$4;
   }

   protected boolean gj() {
      if (this.dN().Q() && !this.dN().B) {
         float $$0 = this.br();
         im $$1 = im.a(this.ds(), this.dw(), this.dy());
         boolean $$2 = this.be() || this.aB || this.aC;
         if ($$0 > 0.5F && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dN().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(awd<elq> $$0) {
      if (this.K().p()) {
         super.c($$0);
      } else {
         this.g(this.dq().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gk() {
      this.c($$0 -> true);
      this.dQ().h();
   }

   public void c(Predicate<byb> $$0) {
      this.bS.a($$0);
   }

   @Override
   protected void ct() {
      super.ct();
      this.a(true, false);
      this.fa().forEach($$0 -> {
         if (!$$0.d()) {
            $$0.e(0);
         }
      });
   }

   @Nullable
   @Override
   public csd dA() {
      cti $$0 = cti.a(this.ai());
      return $$0 == null ? null : new csd($$0);
   }
}

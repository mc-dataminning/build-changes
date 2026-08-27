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

public abstract class bqq extends bqo implements brl {
   private static final aiy<Byte> b = ajc.a(bqq.class, aja.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final jg bW = new jg(1, 0, 1);
   public static final float g = 0.15F;
   public static final float bE = 0.55F;
   public static final float bF = 0.5F;
   public static final float bG = 0.25F;
   public static final String bH = "leash";
   public static final float bI = 0.085F;
   public static final int bJ = 2;
   public static final int bK = 2;
   private static final double bX = Math.sqrt(2.04F) - 0.6F;
   public int bL;
   protected int bM;
   protected bwn bN;
   protected bwo bO;
   protected bwm bP;
   private final bwj bY;
   protected bzz bQ;
   protected final bxm bR;
   protected final bxm bS;
   @Nullable
   private bqo bZ;
   private final caw ca;
   private final iu<crj> cb = iu.a(2, crj.i);
   protected final float[] bT = new float[2];
   private final iu<crj> cc = iu.a(4, crj.i);
   protected final float[] bU = new float[4];
   private crj cd = crj.i;
   protected float bV;
   private boolean ce;
   private boolean cf;
   private final Map<elj, Float> cg = Maps.newEnumMap(elj.class);
   @Nullable
   private ajt ch;
   private long ci;
   @Nullable
   private bpv cj;
   private int ck;
   @Nullable
   private Either<UUID, ib> cl;
   private ib cm = ib.c;
   private float cn = -1.0F;

   protected bqq(bqb<? extends bqq> $$0, cyx $$1) {
      super($$0, $$1);
      this.bR = new bxm($$1.ag());
      this.bS = new bxm($$1.ag());
      this.bN = new bwn(this);
      this.bO = new bwo(this);
      this.bP = new bwm(this);
      this.bY = this.E();
      this.bQ = this.b($$1);
      this.ca = new caw(this);
      Arrays.fill(this.bU, 0.085F);
      Arrays.fill(this.bT, 0.085F);
      this.bV = 0.085F;
      if ($$1 != null && !$$1.B) {
         this.z();
      }
   }

   @Override
   protected void z() {
   }

   public static bru.a A() {
      return bqo.dR().a(brv.k, 16.0).a(brv.d);
   }

   protected bzz b(cyx $$0) {
      return new bzy(this, $$0);
   }

   protected boolean B() {
      return false;
   }

   public float a(elj $$0) {
      bqq $$2;
      label17: {
         if (this.da() instanceof bqq $$1 && $$1.B()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cg.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(elj $$0, float $$1) {
      this.cg.put($$0, $$1);
   }

   @Override
   public void C() {
   }

   public void D() {
   }

   protected bwj E() {
      return new bwj(this);
   }

   public bwn G() {
      return this.bN;
   }

   public bwo H() {
      return this.da() instanceof bqq $$0 ? $$0.H() : this.bO;
   }

   public bwm I() {
      return this.bP;
   }

   public bzz K() {
      return this.da() instanceof bqq $$0 ? $$0.K() : this.bQ;
   }

   @Nullable
   @Override
   public bqo cN() {
      bpv $$0 = this.cQ();
      if (!this.gd() && $$0 instanceof bqq $$1 && $$0.bR()) {
         return $$1;
      }

      return null;
   }

   public caw M() {
      return this.ca;
   }

   @Nullable
   @Override
   public bqo p() {
      return this.bZ;
   }

   public void h(@Nullable bqo $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean a(bqb<?> $$0) {
      return $$0 != bqb.T;
   }

   public boolean a(crz $$0) {
      return false;
   }

   public void N() {
      this.a(dts.m);
   }

   @Override
   protected void a(ajc.a $$0) {
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
      this.dM().af().a("mobBaseTick");
      if (this.bA() && this.ag.a(1000) < this.bL++) {
         this.r();
         this.P();
      }

      this.dM().af().c();
   }

   @Override
   protected void e(bot $$0) {
      this.r();
      super.e($$0);
   }

   private void r() {
      this.bL = -this.O();
   }

   @Override
   public int eg() {
      if (this.bM > 0) {
         int $$0 = this.bM;

         for (int $$1 = 0; $$1 < this.cc.size(); $$1++) {
            if (!this.cc.get($$1).d() && this.bU[$$1] <= 1.0F) {
               $$0 += 1 + this.ag.a(3);
            }
         }

         for (int $$2 = 0; $$2 < this.cb.size(); $$2++) {
            if (!this.cb.get($$2).d() && this.bT[$$2] <= 1.0F) {
               $$0 += 1 + this.ag.a(3);
            }
         }

         if (!this.cd.d() && this.bV <= 1.0F) {
            $$0 += 1 + this.ag.a(3);
         }

         return $$0;
      } else {
         return this.bM;
      }
   }

   public void Q() {
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.ag.k() * 0.02;
            double $$2 = this.ag.k() * 0.02;
            double $$3 = this.ag.k() * 0.02;
            double $$4 = 10.0;
            this.dM().a(kl.Z, this.c(1.0) - $$1 * 10.0, this.du() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dM().a(this, (byte)20);
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
      if (!this.dM().B) {
         this.ga();
         if (this.ah % 5 == 0) {
            this.R();
         }
      }
   }

   protected void R() {
      boolean $$0 = !(this.cN() instanceof bqq);
      boolean $$1 = !(this.cZ() instanceof clq);
      this.bR.a(bxl.a.a, $$0);
      this.bR.a(bxl.a.c, $$0 && $$1);
      this.bR.a(bxl.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bY.a();
      return $$1;
   }

   @Nullable
   protected aul v() {
      return null;
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fT());
      $$0.a("PersistenceRequired", this.cf);
      ts $$1 = new ts();

      for (crj $$2 : this.cc) {
         if (!$$2.d()) {
            $$1.add($$2.a(this.dO()));
         } else {
            $$1.add(new tm());
         }
      }

      $$0.a("ArmorItems", $$1);
      ts $$3 = new ts();

      for (float $$4 : this.bU) {
         $$3.add(tp.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      ts $$5 = new ts();

      for (crj $$6 : this.cb) {
         if (!$$6.d()) {
            $$5.add($$6.a(this.dO()));
         } else {
            $$5.add(new tm());
         }
      }

      $$0.a("HandItems", $$5);
      ts $$7 = new ts();

      for (float $$8 : this.bT) {
         $$7.add(tp.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.cd.d()) {
         $$0.a("body_armor_item", this.cd.a(this.dO()));
         $$0.a("body_armor_drop_chance", this.bV);
      }

      Either<UUID, ib> $$9 = this.cl;
      if (this.cj instanceof bqo) {
         $$9 = Either.left(this.cj.cw());
      } else if (this.cj instanceof cfv $$10) {
         $$9 = Either.right($$10.D());
      }

      if ($$9 != null) {
         $$0.a("leash", (uj)$$9.map($$0x -> {
            tm $$1x = new tm();
            $$1x.a("UUID", $$0x);
            return $$1x;
         }, ub::a));
      }

      $$0.a("LeftHanded", this.ge());
      if (this.ch != null) {
         $$0.a("DeathLootTable", this.ch.toString());
         if (this.ci != 0L) {
            $$0.a("DeathLootTableSeed", this.ci);
         }
      }

      if (this.gd()) {
         $$0.a("NoAI", this.gd());
      }
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.s($$0.q("CanPickUpLoot"));
      }

      this.cf = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         ts $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cc.size(); $$2++) {
            tm $$3 = $$1.a($$2);
            this.cc.set($$2, crj.a(this.dO(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         ts $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bU[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         ts $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.cb.size(); $$7++) {
            tm $$8 = $$6.a($$7);
            this.cb.set($$7, crj.a(this.dO(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         ts $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bT[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cd = crj.a(this.dO(), (uj)$$0.p("body_armor_item")).orElse(crj.i);
         this.bV = $$0.j("body_armor_drop_chance");
      } else {
         this.cd = crj.i;
      }

      if ($$0.b("leash", 10)) {
         this.cl = Either.left($$0.p("leash").a("UUID"));
      } else if ($$0.b("leash", 11)) {
         this.cl = ub.a($$0, "leash").<Either<UUID, ib>>map(Either::right).orElse(null);
      } else {
         this.cl = null;
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.ch = new ajt($$0.l("DeathLootTable"));
         this.ci = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(bot $$0, boolean $$1) {
      super.a($$0, $$1);
      this.ch = null;
   }

   @Override
   public final ajt eC() {
      return this.ch == null ? this.S() : this.ch;
   }

   protected ajt S() {
      return super.eC();
   }

   @Override
   public long eD() {
      return this.ci;
   }

   public void C(float $$0) {
      this.bp = $$0;
   }

   public void D(float $$0) {
      this.bo = $$0;
   }

   public void E(float $$0) {
      this.bn = $$0;
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
      this.dM().af().a("looting");
      if (!this.dM().B && this.fT() && this.bA() && !this.bd && this.dM().aa().b(cyt.c)) {
         jg $$0 = this.U();

         for (cgd $$2 : this.dM().a(cgd.class, this.cH().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dH() && !$$2.p().d() && !$$2.y() && this.k($$2.p())) {
               this.b($$2);
            }
         }
      }

      this.dM().af().c();
   }

   protected jg U() {
      return bW;
   }

   protected void b(cgd $$0) {
      crj $$1 = $$0.p();
      crj $$2 = this.i($$1.r());
      if (!$$2.d()) {
         this.a($$0);
         this.a($$0, $$2.G());
         $$1.g($$2.G());
         if ($$1.d()) {
            $$0.am();
         }
      }
   }

   public crj i(crj $$0) {
      bqc $$1 = h($$0);
      crj $$2 = this.d($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bqc.a;
         $$2 = this.d($$1);
         $$3 = $$2.d();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.g($$1);
         if (!$$2.d() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.G() > 1) {
            crj $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return crj.i;
      }
   }

   @Override
   protected void b(bqc $$0, crj $$1) {
      this.a($$0, $$1);
      this.f($$0);
      this.cf = true;
   }

   public void f(bqc $$0) {
      switch ($$0.a()) {
         case a:
            this.bT[$$0.b()] = 2.0F;
            break;
         case b:
            this.bU[$$0.b()] = 2.0F;
            break;
         case c:
            this.bV = 2.0F;
      }
   }

   protected boolean b(crj $$0, crj $$1) {
      if ($$1.d()) {
         return true;
      } else if ($$0.f() instanceof cst) {
         if (!($$1.f() instanceof cst)) {
            return true;
         } else {
            double $$2 = this.o($$0);
            double $$3 = this.o($$1);
            return $$2 != $$3 ? $$2 > $$3 : this.c($$0, $$1);
         }
      } else if ($$0.f() instanceof cpm && $$1.f() instanceof cpm) {
         return this.c($$0, $$1);
      } else if ($$0.f() instanceof cpw && $$1.f() instanceof cpw) {
         return this.c($$0, $$1);
      } else if ($$0.f() instanceof coy $$4) {
         if (cwr.e($$1)) {
            return false;
         } else if (!($$1.f() instanceof coy)) {
            return true;
         } else {
            coy $$5 = (coy)$$1.f();
            if ($$4.i() != $$5.i()) {
               return $$4.i() > $$5.i();
            } else {
               return $$4.j() != $$5.j() ? $$4.j() > $$5.j() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.f() instanceof cpy) {
            if ($$1.f() instanceof cph) {
               return true;
            }

            if ($$1.f() instanceof cpy) {
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

   private double o(crj $$0) {
      ctz $$1 = $$0.a(jp.i, ctz.a);
      return $$1.a(this.h(brv.c), bqc.a);
   }

   public boolean c(crj $$0, crj $$1) {
      return $$0.m() < $$1.m() ? true : p($$0) && !p($$1);
   }

   private static boolean p(crj $$0) {
      jl $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(jp.b);
   }

   public boolean j(crj $$0) {
      return true;
   }

   public boolean k(crj $$0) {
      return this.j($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean V() {
      return this.bO();
   }

   protected boolean W() {
      return false;
   }

   @Override
   public void dy() {
      if (this.dM().ak() == bnx.a && this.W()) {
         this.am();
      } else if (!this.fU() && !this.V()) {
         bpv $$0 = this.dM().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.ai().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.am();
            }

            int $$4 = this.ai().f().g();
            int $$5 = $$4 * $$4;
            if (this.be > 600 && this.ag.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.am();
            } else if ($$1 < (double)$$5) {
               this.be = 0;
            }
         }
      } else {
         this.be = 0;
      }
   }

   @Override
   protected final void fn() {
      this.be++;
      bko $$0 = this.dM().af();
      $$0.a("sensing");
      this.ca.a();
      $$0.c();
      int $$1 = this.ah + this.aj();
      if ($$1 % 2 != 0 && this.ah > 1) {
         $$0.a("targetSelector");
         this.bS.a(false);
         $$0.c();
         $$0.a("goalSelector");
         this.bR.a(false);
         $$0.c();
      } else {
         $$0.a("targetSelector");
         this.bS.a();
         $$0.c();
         $$0.a("goalSelector");
         this.bR.a();
         $$0.c();
      }

      $$0.a("navigation");
      this.bQ.c();
      $$0.c();
      $$0.a("mob tick");
      this.Y();
      $$0.c();
      $$0.a("controls");
      $$0.a("move");
      this.bO.a();
      $$0.b("look");
      this.bN.a();
      $$0.b("jump");
      this.bP.b();
      $$0.c();
      $$0.c();
      this.X();
   }

   protected void X() {
      afi.a(this.dM(), this, this.bR);
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
      float $$1 = this.cp();
      float $$2 = axk.g(this.aX - $$1);
      float $$3 = axk.a(axk.g(this.aX - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.n($$4);
   }

   public int fN() {
      return 10;
   }

   public void a(bpv $$0, float $$1, float $$2) {
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.dx() - this.dx();
      double $$6;
      if ($$0 instanceof bqo $$5) {
         $$6 = $$5.dv() - this.dv();
      } else {
         $$6 = ($$0.cH().b + $$0.cH().e) / 2.0 - this.dv();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(axk.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(axk.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dE(), $$10, $$2));
      this.r(this.a(this.dC(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = axk.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bqb<? extends bqq> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      ib $$5 = $$3.d();
      return $$2 == bqs.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(cyy $$0, bqs $$1) {
      return true;
   }

   public boolean a(cza $$0) {
      return !$$0.d(this.cH()) && $$0.f(this);
   }

   public int fO() {
      return 4;
   }

   public boolean d(int $$0) {
      return false;
   }

   @Override
   public int cu() {
      if (this.p() == null) {
         return this.u(0.0F);
      } else {
         int $$0 = (int)(this.ex() - this.eO() * 0.33F);
         $$0 -= (3 - this.dM().ak().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.u((float)$$0);
      }
   }

   @Override
   public Iterable<crj> eX() {
      return this.cb;
   }

   @Override
   public Iterable<crj> eW() {
      return this.cc;
   }

   public crj fP() {
      return this.cd;
   }

   public boolean fQ() {
      return false;
   }

   @Override
   public boolean c(bqc $$0) {
      return true;
   }

   public boolean fR() {
      return !this.d(bqc.g).d();
   }

   public boolean l(crj $$0) {
      return false;
   }

   public void m(crj $$0) {
      this.b(bqc.g, $$0);
   }

   @Override
   public Iterable<crj> eY() {
      return (Iterable<crj>)(this.cd.d() ? this.cc : Iterables.concat(this.cc, List.of(this.cd)));
   }

   @Override
   public crj d(bqc $$0) {
      return switch ($$0.a()) {
         case a -> (crj)this.cb.get($$0.b());
         case b -> (crj)this.cc.get($$0.b());
         case c -> this.cd;
      };
   }

   @Override
   public void a(bqc $$0, crj $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cb.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cc.set($$0.b(), $$1), $$1);
            break;
         case c:
            crj $$2 = this.cd;
            this.cd = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(bot $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bqc $$3 : bqc.values()) {
         crj $$4 = this.d($$3);
         float $$5 = this.g($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.d() && !cwr.f($$4) && ($$2 || $$6) && Math.max(this.ag.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.k()) {
               $$4.b($$4.n() - this.ag.a(1 + this.ag.a(Math.max($$4.n() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, crj.i);
         }
      }
   }

   protected float g(bqc $$0) {
      return switch ($$0.a()) {
         case a -> this.bT[$$0.b()];
         case b -> this.bU[$$0.b()];
         case c -> this.bV;
      };
   }

   protected void a(axr $$0, bny $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dM().ak() == bnx.d ? 0.1F : 0.25F;
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

         for (bqc $$5 : bqc.values()) {
            if ($$5.a() == bqc.a.b) {
               crj $$6 = this.d($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.d()) {
                  cre $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new crj($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cre a(bqc $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return crm.px;
            } else if ($$1 == 1) {
               return crm.pN;
            } else if ($$1 == 2) {
               return crm.pB;
            } else if ($$1 == 3) {
               return crm.pF;
            } else if ($$1 == 4) {
               return crm.pJ;
            }
         case e:
            if ($$1 == 0) {
               return crm.py;
            } else if ($$1 == 1) {
               return crm.pO;
            } else if ($$1 == 2) {
               return crm.pC;
            } else if ($$1 == 3) {
               return crm.pG;
            } else if ($$1 == 4) {
               return crm.pK;
            }
         case d:
            if ($$1 == 0) {
               return crm.pz;
            } else if ($$1 == 1) {
               return crm.pP;
            } else if ($$1 == 2) {
               return crm.pD;
            } else if ($$1 == 3) {
               return crm.pH;
            } else if ($$1 == 4) {
               return crm.pL;
            }
         case c:
            if ($$1 == 0) {
               return crm.pA;
            } else if ($$1 == 1) {
               return crm.pQ;
            } else if ($$1 == 2) {
               return crm.pE;
            } else if ($$1 == 3) {
               return crm.pI;
            } else if ($$1 == 4) {
               return crm.pM;
            }
         default:
            return null;
      }
   }

   protected void b(axr $$0, bny $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bqc $$3 : bqc.values()) {
         if ($$3.a() == bqc.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(axr $$0, float $$1) {
      if (!this.eU().d() && $$0.i() < 0.25F * $$1) {
         this.a(bqc.a, cwr.a($$0, this.eU(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(axr $$0, float $$1, bqc $$2) {
      crj $$3 = this.d($$2);
      if (!$$3.d() && $$0.i() < 0.5F * $$1) {
         this.a($$2, cwr.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      axr $$4 = $$0.E_();
      this.f(brv.k).d(new brt("Random spawn bonus", $$4.a(0.0, 0.11485000000000001), brt.a.b));
      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fS() {
      this.cf = true;
   }

   public void a(bqc $$0, float $$1) {
      switch ($$0.a()) {
         case a:
            this.bT[$$0.b()] = $$1;
            break;
         case b:
            this.bU[$$0.b()] = $$1;
            break;
         case c:
            this.bV = $$1;
      }
   }

   public boolean fT() {
      return this.ce;
   }

   public void s(boolean $$0) {
      this.ce = $$0;
   }

   @Override
   public boolean f(crj $$0) {
      bqc $$1 = h($$0);
      return this.d($$1).d() && this.fT();
   }

   public boolean fU() {
      return this.cf;
   }

   @Override
   public final boa a(cjt $$0, bnz $$1) {
      if (!this.bA()) {
         return boa.d;
      } else if (this.gc() == $$0) {
         this.a(true, !$$0.fM());
         this.a(dts.r, $$0);
         return boa.a(this.dM().B);
      } else {
         boa $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dts.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dts.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private boa c(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if ($$2.a(crm.uI) && this.a($$0)) {
         this.b($$0, true);
         $$2.g(1);
         return boa.a(this.dM().B);
      } else {
         if ($$2.a(crm.uJ)) {
            boa $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.f() instanceof csn) {
            if (this.dM() instanceof aps) {
               csn $$4 = (csn)$$2.f();
               Optional<bqq> $$5 = $$4.a($$0, this, (bqb<? extends bqq>)this.ai(), (aps)this.dM(), this.dk(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? boa.a : boa.d;
            } else {
               return boa.b;
            }
         } else {
            return boa.d;
         }
      }
   }

   protected void a(cjt $$0, bqq $$1) {
   }

   protected boa b(cjt $$0, bnz $$1) {
      return boa.d;
   }

   public boolean fV() {
      return this.a(this.dm());
   }

   public boolean a(ib $$0) {
      return this.cn == -1.0F ? true : this.cm.j($$0) < (double)(this.cn * this.cn);
   }

   public void a(ib $$0, int $$1) {
      this.cm = $$0;
      this.cn = (float)$$1;
   }

   public ib fW() {
      return this.cm;
   }

   public float fX() {
      return this.cn;
   }

   public void fY() {
      this.cn = -1.0F;
   }

   public boolean fZ() {
      return this.cn != -1.0F;
   }

   @Nullable
   public <T extends bqq> T a(bqb<T> $$0, boolean $$1) {
      if (this.dH()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dM());
         if ($$2 == null) {
            return null;
         } else {
            $$2.v(this);
            $$2.a(this.p_());
            $$2.t(this.gd());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            if (this.fU()) {
               $$2.fS();
            }

            $$2.m(this.cr());
            if ($$1) {
               $$2.s(this.fT());

               for (bqc $$3 : bqc.values()) {
                  crj $$4 = this.d($$3);
                  if (!$$4.d()) {
                     $$2.a($$3, $$4.e());
                     $$2.a($$3, this.g($$3));
                  }
               }
            }

            this.dM().b($$2);
            if (this.bO()) {
               bpv $$5 = this.cZ();
               this.ac();
               $$2.a($$5, true);
            }

            this.am();
            return $$2;
         }
      }
   }

   protected void ga() {
      if (this.cl != null) {
         this.gj();
      }

      if (this.cj != null) {
         if (!this.bA() || !this.cj.bA()) {
            this.a(true, true);
         }
      }
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.cj != null) {
         this.cj = null;
         this.cl = null;
         if (!this.dM().B && $$1) {
            this.a(crm.uI);
         }

         if (!this.dM().B && $$0 && this.dM() instanceof aps) {
            ((aps)this.dM()).l().b(this, new aed(this, null));
         }
      }
   }

   public boolean a(cjt $$0) {
      return !this.gb() && !(this instanceof cgr);
   }

   public boolean gb() {
      return this.cj != null;
   }

   @Nullable
   public bpv gc() {
      if (this.cj == null && this.ck != 0 && this.dM().B) {
         this.cj = this.dM().a(this.ck);
      }

      return this.cj;
   }

   public void b(bpv $$0, boolean $$1) {
      this.cj = $$0;
      this.cl = null;
      if (!this.dM().B && $$1 && this.dM() instanceof aps) {
         ((aps)this.dM()).l().b(this, new aed(this, this.cj));
      }

      if (this.bO()) {
         this.ac();
      }
   }

   public void s(int $$0) {
      this.ck = $$0;
      this.a(false, false);
   }

   @Override
   public boolean a(bpv $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.gb()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gj() {
      if (this.cl != null && this.dM() instanceof aps $$0) {
         Optional<UUID> $$1 = this.cl.left();
         Optional<ib> $$2 = this.cl.right();
         if ($$1.isPresent()) {
            bpv $$3 = $$0.a($$1.get());
            if ($$3 != null) {
               this.b($$3, true);
               return;
            }
         } else if ($$2.isPresent()) {
            this.b(cfx.b(this.dM(), $$2.get()), true);
            return;
         }

         if (this.ah > 100) {
            this.a(crm.uI);
            this.cl = null;
         }
      }
   }

   @Override
   public boolean cY() {
      return super.cY() && !this.gd();
   }

   public void t(boolean $$0) {
      byte $$1 = this.an.a(b);
      this.an.a(b, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void u(boolean $$0) {
      byte $$1 = this.an.a(b);
      this.an.a(b, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void v(boolean $$0) {
      byte $$1 = this.an.a(b);
      this.an.a(b, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean gd() {
      return (this.an.a(b) & 1) != 0;
   }

   public boolean ge() {
      return (this.an.a(b) & 2) != 0;
   }

   public boolean gf() {
      return (this.an.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bqi fr() {
      return this.ge() ? bqi.a : bqi.b;
   }

   public boolean i(bqo $$0) {
      return this.gg().c($$0.eH());
   }

   protected erv gg() {
      bpv $$0 = this.cZ();
      erv $$3;
      if ($$0 != null) {
         erv $$1 = $$0.cH();
         erv $$2 = this.cH();
         $$3 = new erv(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cH();
      }

      return $$3.c(bX, 0.0, bX);
   }

   @Override
   public boolean C(bpv $$0) {
      float $$1 = (float)this.g(brv.c);
      float $$2 = (float)this.g(brv.d);
      if ($$0 instanceof bqo) {
         $$1 += cwr.a(this.eU(), $$0.ai());
         $$2 += (float)cwr.c(this);
      }

      int $$3 = cwr.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dN().b((bqo)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof bqo) {
            ((bqo)$$0).q((double)($$2 * 0.5F), (double)axk.a(this.dC() * (float) (Math.PI / 180.0)), (double)(-axk.b(this.dC() * (float) (Math.PI / 180.0))));
            this.g(this.dp().d(0.6, 1.0, 0.6));
         }

         this.a(this, $$0);
         this.A($$0);
      }

      return $$4;
   }

   protected boolean gh() {
      if (this.dM().Q() && !this.dM().B) {
         float $$0 = this.br();
         ib $$1 = ib.a(this.dr(), this.dv(), this.dx());
         boolean $$2 = this.be() || this.aA || this.aB;
         if ($$0 > 0.5F && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dM().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(avr<ekr> $$0) {
      if (this.K().p()) {
         super.c($$0);
      } else {
         this.g(this.dp().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gi() {
      this.c($$0 -> true);
      this.dP().h();
   }

   public void c(Predicate<bxl> $$0) {
      this.bR.a($$0);
   }

   @Override
   protected void cs() {
      super.cs();
      this.a(true, false);
      this.eZ().forEach($$0 -> {
         if (!$$0.d()) {
            $$0.e(0);
         }
      });
   }

   @Nullable
   @Override
   public crj dz() {
      csn $$0 = csn.a(this.ai());
      return $$0 == null ? null : new crj($$0);
   }
}

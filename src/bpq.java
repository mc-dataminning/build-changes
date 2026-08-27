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

public abstract class bpq extends bpo implements bql {
   private static final aim<Byte> b = aiq.a(bpq.class, aio.a);
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
   protected bvn bN;
   protected bvo bO;
   protected bvm bP;
   private final bvj bY;
   protected byz bQ;
   protected final bwm bR;
   protected final bwm bS;
   @Nullable
   private bpo bZ;
   private final bzw ca;
   private final iu<cqk> cb = iu.a(2, cqk.h);
   protected final float[] bT = new float[2];
   private final iu<cqk> cc = iu.a(4, cqk.h);
   protected final float[] bU = new float[4];
   private cqk cd = cqk.h;
   protected float bV;
   private boolean ce;
   private boolean cf;
   private final Map<eiy, Float> cg = Maps.newEnumMap(eiy.class);
   @Nullable
   private ajh ch;
   private long ci;
   @Nullable
   private bow cj;
   private int ck;
   @Nullable
   private Either<UUID, ib> cl;
   private ib cm = ib.c;
   private float cn = -1.0F;

   protected bpq(bpc<? extends bpq> $$0, cwz $$1) {
      super($$0, $$1);
      this.bR = new bwm($$1.af());
      this.bS = new bwm($$1.af());
      this.bN = new bvn(this);
      this.bO = new bvo(this);
      this.bP = new bvm(this);
      this.bY = this.E();
      this.bQ = this.b($$1);
      this.ca = new bzw(this);
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

   public static bqu.a A() {
      return bpo.dR().a(bqv.k, 16.0).a(bqv.d);
   }

   protected byz b(cwz $$0) {
      return new byy(this, $$0);
   }

   protected boolean B() {
      return false;
   }

   public float a(eiy $$0) {
      bpq $$2;
      label17: {
         if (this.da() instanceof bpq $$1 && $$1.B()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cg.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(eiy $$0, float $$1) {
      this.cg.put($$0, $$1);
   }

   @Override
   public void C() {
   }

   public void D() {
   }

   protected bvj E() {
      return new bvj(this);
   }

   public bvn G() {
      return this.bN;
   }

   public bvo H() {
      return this.da() instanceof bpq $$0 ? $$0.H() : this.bO;
   }

   public bvm I() {
      return this.bP;
   }

   public byz K() {
      return this.da() instanceof bpq $$0 ? $$0.K() : this.bQ;
   }

   @Nullable
   @Override
   public bpo cN() {
      bow $$0 = this.cQ();
      if (!this.gd() && $$0 instanceof bpq $$1 && $$0.bR()) {
         return $$1;
      }

      return null;
   }

   public bzw M() {
      return this.ca;
   }

   @Nullable
   @Override
   public bpo p() {
      return this.bZ;
   }

   public void h(@Nullable bpo $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean a(bpc<?> $$0) {
      return $$0 != bpc.T;
   }

   public boolean a(cra $$0) {
      return false;
   }

   public void N() {
      this.b(drn.m);
   }

   @Override
   protected void a(aiq.a $$0) {
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
      this.dM().ae().a("mobBaseTick");
      if (this.bA() && this.ag.a(1000) < this.bL++) {
         this.r();
         this.P();
      }

      this.dM().ae().c();
   }

   @Override
   protected void e(bnv $$0) {
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
            if (!this.cc.get($$1).b() && this.bU[$$1] <= 1.0F) {
               $$0 += 1 + this.ag.a(3);
            }
         }

         for (int $$2 = 0; $$2 < this.cb.size(); $$2++) {
            if (!this.cb.get($$2).b() && this.bT[$$2] <= 1.0F) {
               $$0 += 1 + this.ag.a(3);
            }
         }

         if (!this.cd.b() && this.bV <= 1.0F) {
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
            this.dM().a(kc.Z, this.c(1.0) - $$1 * 10.0, this.du() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
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
      boolean $$0 = !(this.cN() instanceof bpq);
      boolean $$1 = !(this.cZ() instanceof ckp);
      this.bR.a(bwl.a.a, $$0);
      this.bR.a(bwl.a.c, $$0 && $$1);
      this.bR.a(bwl.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bY.a();
      return $$1;
   }

   @Nullable
   protected atx v() {
      return null;
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fT());
      $$0.a("PersistenceRequired", this.cf);
      tg $$1 = new tg();

      for (cqk $$2 : this.cc) {
         ta $$3 = new ta();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      tg $$4 = new tg();

      for (float $$5 : this.bU) {
         $$4.add(td.a($$5));
      }

      $$0.a("ArmorDropChances", $$4);
      tg $$6 = new tg();

      for (cqk $$7 : this.cb) {
         ta $$8 = new ta();
         if (!$$7.b()) {
            $$7.b($$8);
         }

         $$6.add($$8);
      }

      $$0.a("HandItems", $$6);
      tg $$9 = new tg();

      for (float $$10 : this.bT) {
         $$9.add(td.a($$10));
      }

      $$0.a("HandDropChances", $$9);
      if (!this.cd.b()) {
         $$0.a("body_armor_item", this.cd.b(new ta()));
         $$0.a("body_armor_drop_chance", this.bV);
      }

      Either<UUID, ib> $$11 = this.cl;
      if (this.cj instanceof bpo) {
         $$11 = Either.left(this.cj.cw());
      } else if (this.cj instanceof cev $$12) {
         $$11 = Either.right($$12.D());
      }

      if ($$11 != null) {
         $$0.a("leash", (tx)$$11.map($$0x -> {
            ta $$1x = new ta();
            $$1x.a("UUID", $$0x);
            return $$1x;
         }, tp::a));
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
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.s($$0.q("CanPickUpLoot"));
      }

      this.cf = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         tg $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cc.size(); $$2++) {
            this.cc.set($$2, cqk.a($$1.a($$2)));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         tg $$3 = $$0.c("ArmorDropChances", 5);

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            this.bU[$$4] = $$3.i($$4);
         }
      }

      if ($$0.b("HandItems", 9)) {
         tg $$5 = $$0.c("HandItems", 10);

         for (int $$6 = 0; $$6 < this.cb.size(); $$6++) {
            this.cb.set($$6, cqk.a($$5.a($$6)));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         tg $$7 = $$0.c("HandDropChances", 5);

         for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
            this.bT[$$8] = $$7.i($$8);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cd = cqk.a($$0.p("body_armor_item"));
         this.bV = $$0.j("body_armor_drop_chance");
      }

      if ($$0.b("leash", 10)) {
         this.cl = Either.left($$0.p("leash").a("UUID"));
      } else if ($$0.b("leash", 11)) {
         this.cl = tp.a($$0, "leash").<Either<UUID, ib>>map(Either::right).orElse(null);
      } else {
         this.cl = null;
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.ch = new ajh($$0.l("DeathLootTable"));
         this.ci = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(bnv $$0, boolean $$1) {
      super.a($$0, $$1);
      this.ch = null;
   }

   @Override
   public final ajh eC() {
      return this.ch == null ? this.S() : this.ch;
   }

   protected ajh S() {
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
   public void m_() {
      super.m_();
      this.dM().ae().a("looting");
      if (!this.dM().B && this.fT() && this.bA() && !this.bd && this.dM().Z().b(cwv.c)) {
         jg $$0 = this.U();

         for (cfd $$2 : this.dM().a(cfd.class, this.cH().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dH() && !$$2.p().b() && !$$2.y() && this.k($$2.p())) {
               this.b($$2);
            }
         }
      }

      this.dM().ae().c();
   }

   protected jg U() {
      return bW;
   }

   protected void b(cfd $$0) {
      cqk $$1 = $$0.p();
      cqk $$2 = this.i($$1.q());
      if (!$$2.b()) {
         this.a($$0);
         this.a($$0, $$2.M());
         $$1.h($$2.M());
         if ($$1.b()) {
            $$0.am();
         }
      }
   }

   public cqk i(cqk $$0) {
      bpd $$1 = h($$0);
      cqk $$2 = this.d($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bpd.a;
         $$2 = this.d($$1);
         $$3 = $$2.b();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.g($$1);
         if (!$$2.b() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.M() > 1) {
            cqk $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return cqk.h;
      }
   }

   @Override
   protected void b(bpd $$0, cqk $$1) {
      this.a($$0, $$1);
      this.f($$0);
      this.cf = true;
   }

   public void f(bpd $$0) {
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

   protected boolean b(cqk $$0, cqk $$1) {
      if ($$1.b()) {
         return true;
      } else if ($$0.d() instanceof crv) {
         if (!($$1.d() instanceof crv)) {
            return true;
         } else {
            crv $$2 = (crv)$$0.d();
            crv $$3 = (crv)$$1.d();
            return $$2.h() != $$3.h() ? $$2.h() > $$3.h() : this.c($$0, $$1);
         }
      } else if ($$0.d() instanceof cok && $$1.d() instanceof cok) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cov && $$1.d() instanceof cov) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cnw $$4) {
         if (cuv.d($$1)) {
            return false;
         } else if (!($$1.d() instanceof cnw)) {
            return true;
         } else {
            cnw $$5 = (cnw)$$1.d();
            if ($$4.g() != $$5.g()) {
               return $$4.g() > $$5.g();
            } else {
               return $$4.h() != $$5.h() ? $$4.h() > $$5.h() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.d() instanceof cox) {
            if ($$1.d() instanceof cof) {
               return true;
            }

            if ($$1.d() instanceof cox $$6) {
               cox $$7 = (cox)$$0.d();
               if ($$7.c() != $$6.c()) {
                  return $$7.c() > $$6.c();
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   public boolean c(cqk $$0, cqk $$1) {
      if ($$0.l() >= $$1.l() && (!$$0.v() || $$1.v())) {
         return $$0.v() && $$1.v()
            ? $$0.w().e().stream().anyMatch($$0x -> !$$0x.equals("Damage")) && !$$1.w().e().stream().anyMatch($$0x -> !$$0x.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean j(cqk $$0) {
      return true;
   }

   public boolean k(cqk $$0) {
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
      if (this.dM().aj() == bmz.a && this.W()) {
         this.am();
      } else if (!this.fU() && !this.V()) {
         bow $$0 = this.dM().a(this, -1.0);
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
      bjq $$0 = this.dM().ae();
      $$0.a("sensing");
      this.ca.a();
      $$0.c();
      int $$1 = this.dM().o().al() + this.aj();
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
      aew.a(this.dM(), this, this.bR);
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
      float $$2 = aww.g(this.aX - $$1);
      float $$3 = aww.a(aww.g(this.aX - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.n($$4);
   }

   public int fN() {
      return 10;
   }

   public void a(bow $$0, float $$1, float $$2) {
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.dx() - this.dx();
      double $$6;
      if ($$0 instanceof bpo $$5) {
         $$6 = $$5.dv() - this.dv();
      } else {
         $$6 = ($$0.cH().b + $$0.cH().e) / 2.0 - this.dv();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(aww.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(aww.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dE(), $$10, $$2));
      this.r(this.a(this.dC(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = aww.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bpc<? extends bpq> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      ib $$5 = $$3.d();
      return $$2 == bps.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(cxa $$0, bps $$1) {
      return true;
   }

   public boolean a(cxc $$0) {
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
         $$0 -= (3 - this.dM().aj().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.u((float)$$0);
      }
   }

   @Override
   public Iterable<cqk> eX() {
      return this.cb;
   }

   @Override
   public Iterable<cqk> eW() {
      return this.cc;
   }

   public cqk fP() {
      return this.cd;
   }

   public boolean fQ() {
      return false;
   }

   @Override
   public boolean c(bpd $$0) {
      return true;
   }

   public boolean fR() {
      return !this.d(bpd.g).b();
   }

   public boolean l(cqk $$0) {
      return false;
   }

   public void m(cqk $$0) {
      this.b(bpd.g, $$0);
   }

   @Override
   public Iterable<cqk> eY() {
      return (Iterable<cqk>)(this.cd.b() ? this.cc : Iterables.concat(this.cc, List.of(this.cd)));
   }

   @Override
   public cqk d(bpd $$0) {
      return switch ($$0.a()) {
         case a -> (cqk)this.cb.get($$0.b());
         case b -> (cqk)this.cc.get($$0.b());
         case c -> this.cd;
      };
   }

   @Override
   public void a(bpd $$0, cqk $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cb.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cc.set($$0.b(), $$1), $$1);
            break;
         case c:
            cqk $$2 = this.cd;
            this.cd = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(bnv $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bpd $$3 : bpd.values()) {
         cqk $$4 = this.d($$3);
         float $$5 = this.g($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.b() && !cuv.e($$4) && ($$2 || $$6) && Math.max(this.ag.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.i()) {
               $$4.b($$4.m() - this.ag.a(1 + this.ag.a(Math.max($$4.m() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, cqk.h);
         }
      }
   }

   protected float g(bpd $$0) {
      return switch ($$0.a()) {
         case a -> this.bT[$$0.b()];
         case b -> this.bU[$$0.b()];
         case c -> this.bV;
      };
   }

   protected void a(axd $$0, bna $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dM().aj() == bmz.d ? 0.1F : 0.25F;
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

         for (bpd $$5 : bpd.values()) {
            if ($$5.a() == bpd.a.b) {
               cqk $$6 = this.d($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.b()) {
                  cqf $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cqk($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cqf a(bpd $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cqn.px;
            } else if ($$1 == 1) {
               return cqn.pN;
            } else if ($$1 == 2) {
               return cqn.pB;
            } else if ($$1 == 3) {
               return cqn.pF;
            } else if ($$1 == 4) {
               return cqn.pJ;
            }
         case e:
            if ($$1 == 0) {
               return cqn.py;
            } else if ($$1 == 1) {
               return cqn.pO;
            } else if ($$1 == 2) {
               return cqn.pC;
            } else if ($$1 == 3) {
               return cqn.pG;
            } else if ($$1 == 4) {
               return cqn.pK;
            }
         case d:
            if ($$1 == 0) {
               return cqn.pz;
            } else if ($$1 == 1) {
               return cqn.pP;
            } else if ($$1 == 2) {
               return cqn.pD;
            } else if ($$1 == 3) {
               return cqn.pH;
            } else if ($$1 == 4) {
               return cqn.pL;
            }
         case c:
            if ($$1 == 0) {
               return cqn.pA;
            } else if ($$1 == 1) {
               return cqn.pQ;
            } else if ($$1 == 2) {
               return cqn.pE;
            } else if ($$1 == 3) {
               return cqn.pI;
            } else if ($$1 == 4) {
               return cqn.pM;
            }
         default:
            return null;
      }
   }

   protected void b(axd $$0, bna $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bpd $$3 : bpd.values()) {
         if ($$3.a() == bpd.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(axd $$0, float $$1) {
      if (!this.eU().b() && $$0.i() < 0.25F * $$1) {
         this.a(bpd.a, cuv.a($$0, this.eU(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(axd $$0, float $$1, bpd $$2) {
      cqk $$3 = this.d($$2);
      if (!$$3.b() && $$0.i() < 0.5F * $$1) {
         this.a($$2, cuv.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      axd $$4 = $$0.E_();
      this.f(bqv.k).d(new bqt("Random spawn bonus", $$4.a(0.0, 0.11485000000000001), bqt.a.b));
      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fS() {
      this.cf = true;
   }

   public void a(bpd $$0, float $$1) {
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
   public boolean f(cqk $$0) {
      bpd $$1 = h($$0);
      return this.d($$1).b() && this.fT();
   }

   public boolean fU() {
      return this.cf;
   }

   @Override
   public final bnc a(cis $$0, bnb $$1) {
      if (!this.bA()) {
         return bnc.d;
      } else if (this.gc() == $$0) {
         this.a(true, !$$0.fM());
         this.a(drn.r, $$0);
         return bnc.a(this.dM().B);
      } else {
         bnc $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(drn.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(drn.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bnc c(cis $$0, bnb $$1) {
      cqk $$2 = $$0.b($$1);
      if ($$2.a(cqn.uH) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bnc.a(this.dM().B);
      } else {
         if ($$2.a(cqn.uI)) {
            bnc $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.d() instanceof crp) {
            if (this.dM() instanceof apf) {
               crp $$4 = (crp)$$2.d();
               Optional<bpq> $$5 = $$4.a($$0, this, (bpc<? extends bpq>)this.ai(), (apf)this.dM(), this.dk(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bnc.a : bnc.d;
            } else {
               return bnc.b;
            }
         } else {
            return bnc.d;
         }
      }
   }

   protected void a(cis $$0, bpq $$1) {
   }

   protected bnc b(cis $$0, bnb $$1) {
      return bnc.d;
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
   public <T extends bpq> T a(bpc<T> $$0, boolean $$1) {
      if (this.dH()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dM());
         if ($$2 == null) {
            return null;
         } else {
            $$2.v(this);
            $$2.a(this.o_());
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

               for (bpd $$3 : bpd.values()) {
                  cqk $$4 = this.d($$3);
                  if (!$$4.b()) {
                     $$2.a($$3, $$4.c());
                     $$2.a($$3, this.g($$3));
                  }
               }
            }

            this.dM().b($$2);
            if (this.bO()) {
               bow $$5 = this.cZ();
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
            this.a(cqn.uH);
         }

         if (!this.dM().B && $$0 && this.dM() instanceof apf) {
            ((apf)this.dM()).l().b(this, new adr(this, null));
         }
      }
   }

   public boolean a(cis $$0) {
      return !this.gb() && !(this instanceof cfq);
   }

   public boolean gb() {
      return this.cj != null;
   }

   @Nullable
   public bow gc() {
      if (this.cj == null && this.ck != 0 && this.dM().B) {
         this.cj = this.dM().a(this.ck);
      }

      return this.cj;
   }

   public void b(bow $$0, boolean $$1) {
      this.cj = $$0;
      this.cl = null;
      if (!this.dM().B && $$1 && this.dM() instanceof apf) {
         ((apf)this.dM()).l().b(this, new adr(this, this.cj));
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
   public boolean a(bow $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.gb()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gj() {
      if (this.cl != null && this.dM() instanceof apf $$0) {
         Optional<UUID> $$1 = this.cl.left();
         Optional<ib> $$2 = this.cl.right();
         if ($$1.isPresent()) {
            bow $$3 = $$0.a($$1.get());
            if ($$3 != null) {
               this.b($$3, true);
               return;
            }
         } else if ($$2.isPresent()) {
            this.b(cex.b(this.dM(), $$2.get()), true);
            return;
         }

         if (this.ah > 100) {
            this.a(cqn.uH);
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
   public bpi fr() {
      return this.ge() ? bpi.a : bpi.b;
   }

   public boolean i(bpo $$0) {
      return this.gg().c($$0.eH());
   }

   protected epm gg() {
      bow $$0 = this.cZ();
      epm $$3;
      if ($$0 != null) {
         epm $$1 = $$0.cH();
         epm $$2 = this.cH();
         $$3 = new epm(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cH();
      }

      return $$3.c(bX, 0.0, bX);
   }

   @Override
   public boolean C(bow $$0) {
      float $$1 = (float)this.g(bqv.c);
      float $$2 = (float)this.g(bqv.d);
      if ($$0 instanceof bpo) {
         $$1 += cuv.a(this.eU(), $$0.ai());
         $$2 += (float)cuv.c(this);
      }

      int $$3 = cuv.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dN().b((bpo)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof bpo) {
            ((bpo)$$0).q((double)($$2 * 0.5F), (double)aww.a(this.dC() * (float) (Math.PI / 180.0)), (double)(-aww.b(this.dC() * (float) (Math.PI / 180.0))));
            this.g(this.dp().d(0.6, 1.0, 0.6));
         }

         this.a(this, $$0);
         this.A($$0);
      }

      return $$4;
   }

   protected boolean gh() {
      if (this.dM().P() && !this.dM().B) {
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
   protected void c(avd<eim> $$0) {
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

   public void c(Predicate<bwl> $$0) {
      this.bR.a($$0);
   }

   @Override
   protected void cs() {
      super.cs();
      this.a(true, false);
      this.eZ().forEach($$0 -> {
         if (!$$0.b()) {
            $$0.f(0);
         }
      });
   }

   @Nullable
   @Override
   public cqk dz() {
      crp $$0 = crp.a(this.ai());
      return $$0 == null ? null : new cqk($$0);
   }
}

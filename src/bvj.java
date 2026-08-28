import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bvj extends bvh implements buw, bvf, bwf {
   private static final akm<Byte> a = akq.a(bvj.class, ako.a);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   protected static final int h = 1;
   private static final kl bX = new kl(1, 0, 1);
   private static final List<but> bY = List.of(but.f, but.e, but.d, but.c);
   public static final float i = 0.15F;
   public static final float j = 0.55F;
   public static final float k = 0.5F;
   public static final float bG = 0.25F;
   public static final float bH = 0.085F;
   public static final float bI = 1.0F;
   public static final int bJ = 2;
   public static final int bK = 2;
   private static final double bZ = Math.sqrt(2.04F) - 0.6F;
   protected static final alj bL = alj.b("random_spawn_bonus");
   public int bM;
   protected int bN;
   protected cbh bO;
   protected cbi bP;
   protected cbg bQ;
   private final cbd ca;
   protected cet bR;
   protected final ccg bS;
   protected final ccg bT;
   @Nullable
   private bvh cb;
   private final cfq cc;
   private final jz<cwm> cd = jz.a(2, cwm.k);
   protected final float[] bU = new float[2];
   private final jz<cwm> ce = jz.a(4, cwm.k);
   protected final float[] bV = new float[4];
   private cwm cf = cwm.k;
   protected float bW;
   private boolean cg;
   private boolean ch;
   private final Map<esm, Float> ci = Maps.newEnumMap(esm.class);
   private Optional<ali<eus>> cj = Optional.empty();
   private long ck;
   @Nullable
   private bvf.a cl;
   private jh cm = jh.c;
   private float cn = -1.0F;

   protected bvj(bus<? extends bvj> $$0, dfm $$1) {
      super($$0, $$1);
      this.bS = new ccg();
      this.bT = new ccg();
      this.bO = new cbh(this);
      this.bP = new cbi(this);
      this.bQ = new cbg(this);
      this.ca = this.G();
      this.bR = this.b($$1);
      this.cc = new cfq(this);
      Arrays.fill(this.bV, 0.085F);
      Arrays.fill(this.bU, 0.085F);
      this.bW = 0.085F;
      if ($$1 instanceof arp) {
         this.B();
      }
   }

   @Override
   protected void B() {
   }

   public static bwo.a C() {
      return bvh.ed().a(bwp.m, 16.0);
   }

   protected cet b(dfm $$0) {
      return new ces(this, $$0);
   }

   protected boolean D() {
      return false;
   }

   public float a(esm $$0) {
      bvj $$2;
      label17: {
         if (this.dl() instanceof bvj $$1 && $$1.D()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.ci.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(esm $$0, float $$1) {
      this.ci.put($$0, $$1);
   }

   @Override
   public void E() {
   }

   @Override
   public void F() {
   }

   protected cbd G() {
      return new cbd(this);
   }

   public cbh H() {
      return this.bO;
   }

   public cbi I() {
      return this.dl() instanceof bvj $$0 ? $$0.I() : this.bP;
   }

   public cbg J() {
      return this.bQ;
   }

   public cet L() {
      return this.dl() instanceof bvj $$0 ? $$0.L() : this.bR;
   }

   @Nullable
   @Override
   public bvh cX() {
      bul $$0 = this.da();
      if (!this.fZ() && $$0 instanceof bvj $$1 && $$0.cc()) {
         return $$1;
      }

      return null;
   }

   public cfq N() {
      return this.cc;
   }

   @Nullable
   @Override
   public bvh aa_() {
      return this.cb;
   }

   @Nullable
   protected final bvh O() {
      return this.eb().c(cel.o).orElse(null);
   }

   public void h(@Nullable bvh $$0) {
      this.cb = $$0;
   }

   @Override
   public boolean a(bus<?> $$0) {
      return $$0 != bus.ac;
   }

   public boolean a(cxi $$0) {
      return false;
   }

   public void P() {
      this.a(ear.m);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   public int Q() {
      return 80;
   }

   public void R() {
      this.b(this.t());
   }

   @Override
   public void az() {
      super.az();
      bou $$0 = bot.a();
      $$0.a("mobBaseTick");
      if (this.bL() && this.ae.a(1000) < this.bM++) {
         this.n();
         this.R();
      }

      $$0.c();
   }

   @Override
   protected void f(btb $$0) {
      this.n();
      super.f($$0);
   }

   private void n() {
      this.bM = -this.Q();
   }

   @Override
   protected int e(arp $$0) {
      if (this.bN > 0) {
         int $$1 = this.bN;

         for (int $$2 = 0; $$2 < this.ce.size(); $$2++) {
            if (!this.ce.get($$2).f() && this.bV[$$2] <= 1.0F) {
               $$1 += 1 + this.ae.a(3);
            }
         }

         for (int $$3 = 0; $$3 < this.cd.size(); $$3++) {
            if (!this.cd.get($$3).f() && this.bU[$$3] <= 1.0F) {
               $$1 += 1 + this.ae.a(3);
            }
         }

         if (!this.cf.f() && this.bW <= 1.0F) {
            $$1 += 1 + this.ae.a(3);
         }

         return $$1;
      } else {
         return this.bN;
      }
   }

   public void S() {
      if (this.dV().C) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.ae.k() * 0.02;
            double $$2 = this.ae.k() * 0.02;
            double $$3 = this.ae.k() * 0.02;
            double $$4 = 10.0;
            this.dV().a(ls.ab, this.c(1.0) - $$1 * 10.0, this.dD() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dV().a(this, (byte)20);
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
   public void h() {
      super.h();
      if (!this.dV().C && this.af % 5 == 0) {
         this.T();
      }
   }

   protected void T() {
      boolean $$0 = !(this.cX() instanceof bvj);
      boolean $$1 = !(this.dk() instanceof cqr);
      this.bS.a(ccf.a.a, $$0);
      this.bS.a(ccf.a.c, $$0 && $$1);
      this.bS.a(ccf.a.b, $$0);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.ca.a();
      return $$1;
   }

   @Nullable
   protected awm t() {
      return null;
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fL());
      $$0.a("PersistenceRequired", this.ch);
      ur $$1 = new ur();

      for (cwm $$2 : this.ce) {
         if (!$$2.f()) {
            $$1.add($$2.a(this.dX()));
         } else {
            $$1.add(new ul());
         }
      }

      $$0.a("ArmorItems", $$1);
      ur $$3 = new ur();

      for (float $$4 : this.bV) {
         $$3.add(uo.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      ur $$5 = new ur();

      for (cwm $$6 : this.cd) {
         if (!$$6.f()) {
            $$5.add($$6.a(this.dX()));
         } else {
            $$5.add(new ul());
         }
      }

      $$0.a("HandItems", $$5);
      ur $$7 = new ur();

      for (float $$8 : this.bU) {
         $$7.add(uo.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.cf.f()) {
         $$0.a("body_armor_item", this.cf.a(this.dX()));
         $$0.a("body_armor_drop_chance", this.bW);
      }

      this.a($$0, this.cl);
      $$0.a("LeftHanded", this.ga());
      if (this.cj.isPresent()) {
         $$0.a("DeathLootTable", this.cj.get().a().toString());
         if (this.ck != 0L) {
            $$0.a("DeathLootTableSeed", this.ck);
         }
      }

      if (this.fZ()) {
         $$0.a("NoAI", this.fZ());
      }
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 99)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.ch = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         ur $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ce.size(); $$2++) {
            ul $$3 = $$1.a($$2);
            this.ce.set($$2, cwm.a(this.dX(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         ur $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bV[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         ur $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.cd.size(); $$7++) {
            ul $$8 = $$6.a($$7);
            this.cd.set($$7, cwm.a(this.dX(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         ur $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bU[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cf = cwm.a(this.dX(), (vi)$$0.p("body_armor_item")).orElse(cwm.k);
         this.bW = $$0.j("body_armor_drop_chance");
      } else {
         this.cf = cwm.k;
      }

      this.cl = this.c($$0);
      this.v($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cj = Optional.of(ali.a(ma.bd, alj.a($$0.l("DeathLootTable"))));
         this.ck = $$0.i("DeathLootTableSeed");
      }

      this.u($$0.q("NoAI"));
   }

   @Override
   protected void b(arp $$0, btb $$1, boolean $$2) {
      super.b($$0, $$1, $$2);
      this.cj = Optional.empty();
   }

   @Override
   public final Optional<ali<eus>> ea() {
      return this.cj.isPresent() ? this.cj : super.ea();
   }

   @Override
   public long eG() {
      return this.ck;
   }

   public void G(float $$0) {
      this.bp = $$0;
   }

   public void H(float $$0) {
      this.bo = $$0;
   }

   public void I(float $$0) {
      this.bn = $$0;
   }

   @Override
   public void C(float $$0) {
      super.C($$0);
      this.G($$0);
   }

   public void U() {
      this.L().o();
      this.I(0.0F);
      this.H(0.0F);
      this.C(0.0F);
   }

   @Override
   public void d_() {
      super.d_();
      bou $$0 = bot.a();
      $$0.a("looting");
      if (this.dV() instanceof arp $$1 && this.fL() && this.bL() && !this.bd && $$1.N().b(dfi.c)) {
         kl $$2 = this.V();

         for (clc $$4 : this.dV().a(clc.class, this.cR().c((double)$$2.u(), (double)$$2.v(), (double)$$2.w()))) {
            if (!$$4.dQ() && !$$4.j().f() && !$$4.t() && this.c($$1, $$4.j())) {
               this.a($$1, $$4);
            }
         }
      }

      $$0.c();
   }

   protected kl V() {
      return bX;
   }

   protected void a(arp $$0, clc $$1) {
      cwm $$2 = $$1.j();
      cwm $$3 = this.b($$0, $$2.v());
      if (!$$3.f()) {
         this.a($$1);
         this.a($$1, $$3.L());
         $$2.h($$3.L());
         if ($$2.f()) {
            $$1.at();
         }
      }
   }

   public cwm b(arp $$0, cwm $$1) {
      but $$2 = this.f($$1);
      cwm $$3 = this.a($$2);
      boolean $$4 = this.a($$1, $$3, $$2);
      if ($$2.f() && !$$4) {
         $$2 = but.a;
         $$3 = this.a($$2);
         $$4 = $$3.f();
      }

      if ($$4 && this.g($$1)) {
         double $$5 = (double)this.h($$2);
         if (!$$3.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$5) {
            this.a($$0, $$3);
         }

         cwm $$6 = $$2.a($$1);
         this.b($$2, $$6);
         return $$6;
      } else {
         return cwm.k;
      }
   }

   @Override
   protected void b(but $$0, cwm $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.ch = true;
   }

   public void g(but $$0) {
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

   protected boolean a(cwm $$0, cwm $$1, but $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$0.h() instanceof cya) {
         if (!($$1.h() instanceof cya)) {
            return true;
         } else {
            double $$3 = this.a($$0, bwp.c, $$2);
            double $$4 = this.a($$1, bwp.c, $$2);
            return $$3 != $$4 ? $$3 > $$4 : this.b($$0, $$1);
         }
      } else if ($$0.h() instanceof cuw && $$1.h() instanceof cuw) {
         return this.b($$0, $$1);
      } else if ($$0.h() instanceof cvd && $$1.h() instanceof cvd) {
         return this.b($$0, $$1);
      } else if ($$0.h() instanceof cul) {
         if (dcf.a($$1, dce.E)) {
            return false;
         } else if (!($$1.h() instanceof cul)) {
            return true;
         } else {
            double $$5 = this.a($$0, bwp.a, $$2);
            double $$6 = this.a($$1, bwp.a, $$2);
            double $$7 = this.a($$0, bwp.b, $$2);
            double $$8 = this.a($$1, bwp.b, $$2);
            if ($$5 != $$6) {
               return $$5 > $$6;
            } else {
               return $$7 != $$8 ? $$7 > $$8 : this.b($$0, $$1);
            }
         }
      } else {
         if ($$0.h() instanceof cvf) {
            if ($$1.h() instanceof cus) {
               return true;
            }

            if ($$1.h() instanceof cvf) {
               double $$9 = this.a($$0, bwp.c, $$2);
               double $$10 = this.a($$1, bwp.c, $$2);
               if ($$9 != $$10) {
                  return $$9 > $$10;
               }

               return this.b($$0, $$1);
            }
         }

         return false;
      }
   }

   private double a(cwm $$0, jq<bwk> $$1, but $$2) {
      double $$3 = this.eW().b($$1) ? this.i($$1) : 0.0;
      czd $$4 = $$0.a(ku.o, czd.a);
      return $$4.a($$3, $$2);
   }

   public boolean b(cwm $$0, cwm $$1) {
      return $$0.o() < $$1.o() ? true : j($$0) && !j($$1);
   }

   private static boolean j(cwm $$0) {
      kq $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(ku.e);
   }

   public boolean g(cwm $$0) {
      return true;
   }

   public boolean c(arp $$0, cwm $$1) {
      return this.g($$1);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean W() {
      return this.bZ();
   }

   protected boolean X() {
      return false;
   }

   @Override
   public void dH() {
      if (this.dV().ak() == bsh.a && this.X()) {
         this.at();
      } else if (!this.aj() && !this.W()) {
         bul $$0 = this.dV().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.aq().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.at();
            }

            int $$4 = this.aq().f().g();
            int $$5 = $$4 * $$4;
            if (this.be > 600 && this.ae.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.at();
            } else if ($$1 < (double)$$5) {
               this.be = 0;
            }
         }
      } else {
         this.be = 0;
      }
   }

   @Override
   protected final void fs() {
      this.be++;
      bou $$0 = bot.a();
      $$0.a("sensing");
      this.cc.a();
      $$0.c();
      int $$1 = this.af + this.ar();
      if ($$1 % 2 != 0 && this.af > 1) {
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
      this.a((arp)this.dV());
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
      agt.a(this.dV(), this, this.bS);
   }

   protected void a(arp $$0) {
   }

   public int Z() {
      return 40;
   }

   public int aa() {
      return 75;
   }

   protected void ab() {
      float $$0 = (float)this.aa();
      float $$1 = this.cA();
      float $$2 = azm.h(this.aW - $$1);
      float $$3 = azm.a(azm.h(this.aW - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.q($$4);
   }

   public int ac() {
      return 10;
   }

   public void a(bul $$0, float $$1, float $$2) {
      double $$3 = $$0.dA() - this.dA();
      double $$4 = $$0.dG() - this.dG();
      double $$6;
      if ($$0 instanceof bvh $$5) {
         $$6 = $$5.dE() - this.dE();
      } else {
         $$6 = ($$0.cR().b + $$0.cR().e) / 2.0 - this.dE();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(azm.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(azm.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.w(this.a(this.dN(), $$10, $$2));
      this.v(this.a(this.dL(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azm.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bus<? extends bvj> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      jh $$5 = $$3.e();
      return bur.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dfn $$0, bur $$1) {
      return true;
   }

   public boolean a(dfp $$0) {
      return !$$0.d(this.cR()) && $$0.f(this);
   }

   public int ad() {
      return 4;
   }

   public boolean q(int $$0) {
      return false;
   }

   @Override
   public int cE() {
      if (this.aa_() == null) {
         return this.y(0.0F);
      } else {
         int $$0 = (int)(this.eD() - this.eR() * 0.33F);
         $$0 -= (3 - this.dV().ak().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.y((float)$$0);
      }
   }

   @Override
   public Iterable<cwm> fa() {
      return this.cd;
   }

   @Override
   public Iterable<cwm> eZ() {
      return this.ce;
   }

   public cwm af() {
      return this.cf;
   }

   @Override
   public boolean e(but $$0) {
      return $$0 != but.g;
   }

   public boolean ag() {
      return !this.a(but.g).f();
   }

   public void h(cwm $$0) {
      this.b(but.g, $$0);
   }

   @Override
   public Iterable<cwm> fb() {
      return (Iterable<cwm>)(this.cf.f() ? this.ce : Iterables.concat(this.ce, List.of(this.cf)));
   }

   @Override
   public cwm a(but $$0) {
      return switch ($$0.a()) {
         case a -> (cwm)this.cd.get($$0.b());
         case b -> (cwm)this.ce.get($$0.b());
         case c -> this.cf;
      };
   }

   @Override
   public void a(but $$0, cwm $$1) {
      this.c($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cd.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
            break;
         case c:
            cwm $$2 = this.cf;
            this.cf = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(arp $$0, btb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (but $$3 : but.i) {
         cwm $$4 = this.a($$3);
         float $$5 = this.h($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = $$5 > 1.0F;
            bul var11 = $$1.d();
            if (var11 instanceof bvh) {
               bvh $$7 = (bvh)var11;
               if (this.dV() instanceof arp $$8) {
                  $$5 = dcf.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !dcf.a($$4, dce.D) && ($$2 || $$6) && this.ae.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.ae.a(1 + this.ae.a(Math.max($$4.p() - 3, 1))));
               }

               this.a($$0, $$4);
               this.a($$3, cwm.k);
            }
         }
      }
   }

   protected float h(but $$0) {
      return switch ($$0.a()) {
         case a -> this.bU[$$0.b()];
         case b -> this.bV[$$0.b()];
         case c -> this.bW;
      };
   }

   public void b(arp $$0) {
      this.a($$0, $$0x -> true);
   }

   public Set<but> a(arp $$0, Predicate<cwm> $$1) {
      Set<but> $$2 = new HashSet<>();

      for (but $$3 : but.i) {
         cwm $$4 = this.a($$3);
         if (!$$4.f()) {
            if (!$$1.test($$4)) {
               $$2.add($$3);
            } else {
               double $$5 = (double)this.h($$3);
               if ($$5 > 1.0) {
                  this.a($$3, cwm.k);
                  this.a($$0, $$4);
               }
            }
         }
      }

      return $$2;
   }

   private euq g(arp $$0) {
      return new euq.a($$0).a(exj.f, this.dt()).a(exj.a, this).a(exi.h);
   }

   public void a(buv $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(ali<eus> $$0, Map<but, Float> $$1) {
      if (this.dV() instanceof arp $$2) {
         this.a($$0, this.g($$2), $$1);
      }
   }

   protected void a(azu $$0, bsi $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dV().ak() == bsh.d ? 0.1F : 0.25F;
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

         for (but $$5 : bY) {
            cwm $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               cwi $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new cwm($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static cwi a(but $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cwq.pz;
            } else if ($$1 == 1) {
               return cwq.pP;
            } else if ($$1 == 2) {
               return cwq.pD;
            } else if ($$1 == 3) {
               return cwq.pH;
            } else if ($$1 == 4) {
               return cwq.pL;
            }
         case e:
            if ($$1 == 0) {
               return cwq.pA;
            } else if ($$1 == 1) {
               return cwq.pQ;
            } else if ($$1 == 2) {
               return cwq.pE;
            } else if ($$1 == 3) {
               return cwq.pI;
            } else if ($$1 == 4) {
               return cwq.pM;
            }
         case d:
            if ($$1 == 0) {
               return cwq.pB;
            } else if ($$1 == 1) {
               return cwq.pR;
            } else if ($$1 == 2) {
               return cwq.pF;
            } else if ($$1 == 3) {
               return cwq.pJ;
            } else if ($$1 == 4) {
               return cwq.pN;
            }
         case c:
            if ($$1 == 0) {
               return cwq.pC;
            } else if ($$1 == 1) {
               return cwq.pS;
            } else if ($$1 == 2) {
               return cwq.pG;
            } else if ($$1 == 3) {
               return cwq.pK;
            } else if ($$1 == 4) {
               return cwq.pO;
            }
         default:
            return null;
      }
   }

   protected void a(dgd $$0, azu $$1, bsi $$2) {
      this.b($$0, $$1, $$2);

      for (but $$3 : but.i) {
         if ($$3.a() == but.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dgd $$0, azu $$1, bsi $$2) {
      this.a($$0, but.a, $$1, 0.25F, $$2);
   }

   protected void a(dgd $$0, azu $$1, but $$2, bsi $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dgd $$0, but $$1, azu $$2, float $$3, bsi $$4) {
      cwm $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         dcf.a($$5, $$0.J_(), ddr.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      azu $$4 = $$0.G_();
      bwl $$5 = Objects.requireNonNull(this.g(bwp.m));
      if (!$$5.b(bL)) {
         $$5.d(new bwn(bL, $$4.a(0.0, 0.11485000000000001), bwn.a.b));
      }

      this.v($$4.i() < 0.05F);
      return $$3;
   }

   public void ai() {
      this.ch = true;
   }

   @Override
   public void a(but $$0, float $$1) {
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

   @Override
   public boolean fL() {
      return this.cg;
   }

   public void a_(boolean $$0) {
      this.cg = $$0;
   }

   @Override
   protected boolean f(but $$0) {
      return this.fL();
   }

   public boolean aj() {
      return this.ch;
   }

   @Override
   public final bsk a(cou $$0, bsj $$1) {
      if (!this.bL()) {
         return bsk.e;
      } else {
         bsk $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(ear.r, $$0);
            return $$2;
         } else {
            bsk $$3 = super.a($$0, $$1);
            if ($$3 != bsk.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(ear.r, $$0);
                  return $$2;
               } else {
                  return bsk.e;
               }
            }
         }
      }
   }

   private bsk c(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if ($$2.a(cwq.vd)) {
         bsk $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof cxv) {
         if (this.dV() instanceof arp) {
            cxv $$4 = (cxv)$$2.h();
            Optional<bvj> $$5 = $$4.a($$0, this, (bus<? extends bvj>)this.aq(), (arp)this.dV(), this.dt(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return bsk.e;
            }
         }

         return bsk.b;
      } else {
         return bsk.e;
      }
   }

   protected void a(cou $$0, bvj $$1) {
   }

   protected bsk b(cou $$0, bsj $$1) {
      return bsk.e;
   }

   public boolean ak() {
      return this.a(this.dv());
   }

   public boolean a(jh $$0) {
      return this.cn == -1.0F ? true : this.cm.j($$0) < (double)(this.cn * this.cn);
   }

   public void a(jh $$0, int $$1) {
      this.cm = $$0;
      this.cn = (float)$$1;
   }

   public jh fV() {
      return this.cm;
   }

   public float fW() {
      return this.cn;
   }

   public void fX() {
      this.cn = -1.0F;
   }

   public boolean fY() {
      return this.cn != -1.0F;
   }

   @Nullable
   public <T extends bvj> T a(bus<T> $$0, bug $$1, bur $$2, bug.a<T> $$3) {
      if (this.dQ()) {
         return null;
      } else {
         T $$4 = (T)$$0.a(this.dV(), $$2);
         if ($$4 == null) {
            return null;
         } else {
            $$1.a().a(this, $$4, $$1);
            $$3.finalizeConversion($$4);
            if (this.dV() instanceof arp $$5) {
               $$5.b($$4);
            }

            if ($$1.a().a()) {
               this.at();
            }

            return $$4;
         }
      }
   }

   @Nullable
   public <T extends bvj> T a(bus<T> $$0, bug $$1, bug.a<T> $$2) {
      return this.a($$0, $$1, bur.i, $$2);
   }

   @Nullable
   @Override
   public bvf.a R_() {
      return this.cl;
   }

   @Override
   public void a(@Nullable bvf.a $$0) {
      this.cl = $$0;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      bvf.super.a($$0, $$1);
      if (this.R_() == null) {
         this.fX();
      }
   }

   @Override
   public void z() {
      bvf.super.z();
      this.bS.a(ccf.a.a);
   }

   @Override
   public boolean y() {
      return !(this instanceof clq);
   }

   @Override
   public boolean a(bul $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.N_()) {
         this.a(true, true);
      }

      return $$2;
   }

   @Override
   public boolean dj() {
      return super.dj() && !this.fZ();
   }

   public void u(boolean $$0) {
      byte $$1 = this.al.a(a);
      this.al.a(a, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void v(boolean $$0) {
      byte $$1 = this.al.a(a);
      this.al.a(a, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void w(boolean $$0) {
      byte $$1 = this.al.a(a);
      this.al.a(a, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean fZ() {
      return (this.al.a(a) & 1) != 0;
   }

   public boolean ga() {
      return (this.al.a(a) & 2) != 0;
   }

   public boolean gb() {
      return (this.al.a(a) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bvb fw() {
      return this.ga() ? bvb.a : bvb.b;
   }

   public boolean i(bvh $$0) {
      return this.gc().c($$0.eK());
   }

   protected ezt gc() {
      bul $$0 = this.dk();
      ezt $$3;
      if ($$0 != null) {
         ezt $$1 = $$0.cR();
         ezt $$2 = this.cR();
         $$3 = new ezt(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cR();
      }

      return $$3.c(bZ, 0.0, bZ);
   }

   @Override
   public boolean c(arp $$0, bul $$1) {
      float $$2 = (float)this.h(bwp.c);
      cwm $$3 = this.dZ();
      btb $$4 = Optional.ofNullable($$3.h().a(this)).orElse(this.dW().b((bvh)this));
      $$2 = dcf.a($$0, $$3, $$1, $$4, $$2);
      $$2 += $$3.h().a($$1, $$2, $$4);
      boolean $$5 = $$1.a($$0, $$4, $$2);
      if ($$5) {
         float $$6 = this.a($$1, $$4);
         if ($$6 > 0.0F && $$1 instanceof bvh $$7) {
            $$7.p((double)($$6 * 0.5F), (double)azm.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azm.b(this.dL() * (float) (Math.PI / 180.0))));
            this.h(this.dy().d(0.6, 1.0, 0.6));
         }

         if ($$1 instanceof bvh $$8) {
            $$3.a($$8, this);
         }

         dcf.a($$0, $$1, $$4);
         this.B($$1);
         this.gd();
      }

      return $$5;
   }

   protected void gd() {
   }

   protected boolean ge() {
      if (this.dV().T() && !this.dV().C) {
         float $$0 = this.by();
         jh $$1 = jh.a(this.dA(), this.dE(), this.dG());
         boolean $$2 = this.bl() || this.av || this.aw;
         if ($$0 > 0.5F && this.ae.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dV().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(axs<eru> $$0) {
      if (this.L().q()) {
         super.c($$0);
      } else {
         this.h(this.dy().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gf() {
      this.c($$0 -> true);
      this.eb().h();
   }

   public void c(Predicate<ccf> $$0) {
      this.bS.a($$0);
   }

   @Override
   protected void cD() {
      super.cD();
      this.fc().forEach($$0 -> {
         if (!$$0.f()) {
            $$0.e(0);
         }
      });
   }

   @Nullable
   @Override
   public cwm dI() {
      cxv $$0 = cxv.a(this.aq());
      return $$0 == null ? null : new cwm($$0);
   }

   @Override
   protected void f(jq<bwk> $$0) {
      super.f($$0);
      if ($$0.a(bwp.m) || $$0.a(bwp.E)) {
         this.L().g();
      }
   }

   @VisibleForTesting
   public float[] gg() {
      return this.bU;
   }

   @VisibleForTesting
   public float[] gh() {
      return this.bV;
   }
}

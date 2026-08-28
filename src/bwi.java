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

public abstract class bwi extends bwg implements bvv, bwe, bxe {
   private static final alc<Byte> a = alg.a(bwi.class, ale.a);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   protected static final int h = 1;
   private static final kl bY = new kl(1, 0, 1);
   private static final List<bvs> bZ = List.of(bvs.f, bvs.e, bvs.d, bvs.c);
   public static final float i = 0.15F;
   public static final float j = 0.55F;
   public static final float k = 0.5F;
   public static final float bH = 0.25F;
   public static final float bI = 0.085F;
   public static final float bJ = 1.0F;
   public static final int bK = 2;
   public static final int bL = 2;
   private static final double ca = Math.sqrt(2.04F) - 0.6F;
   protected static final alz bM = alz.b("random_spawn_bonus");
   public int bN;
   protected int bO;
   protected ccg bP;
   protected cch bQ;
   protected ccf bR;
   private final ccc cb;
   protected cfs bS;
   protected final cdf bT;
   protected final cdf bU;
   @Nullable
   private bwg cc;
   private final cgp cd;
   private final jz<cxp> ce = jz.a(2, cxp.j);
   protected final float[] bV = new float[2];
   private final jz<cxp> cf = jz.a(4, cxp.j);
   protected final float[] bW = new float[4];
   private cxp cg = cxp.j;
   protected float bX;
   private boolean ch;
   private boolean ci;
   private final Map<euo, Float> cj = Maps.newEnumMap(euo.class);
   private Optional<aly<ewu>> ck = Optional.empty();
   private long cl;
   @Nullable
   private bwe.a cm;
   private jh cn = jh.c;
   private float co = -1.0F;

   protected bwi(bvr<? extends bwi> $$0, dhi $$1) {
      super($$0, $$1);
      this.bT = new cdf();
      this.bU = new cdf();
      this.bP = new ccg(this);
      this.bQ = new cch(this);
      this.bR = new ccf(this);
      this.cb = this.G();
      this.bS = this.b($$1);
      this.cd = new cgp(this);
      Arrays.fill(this.bW, 0.085F);
      Arrays.fill(this.bV, 0.085F);
      this.bX = 0.085F;
      if ($$1 instanceof ash) {
         this.B();
      }
   }

   @Override
   protected void B() {
   }

   public static bxn.a C() {
      return bwg.ee().a(bxo.m, 16.0);
   }

   protected cfs b(dhi $$0) {
      return new cfr(this, $$0);
   }

   protected boolean D() {
      return false;
   }

   public float a(euo $$0) {
      bwi $$2;
      label17: {
         if (this.dm() instanceof bwi $$1 && $$1.D()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cj.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(euo $$0, float $$1) {
      this.cj.put($$0, $$1);
   }

   @Override
   public void E() {
   }

   @Override
   public void F() {
   }

   protected ccc G() {
      return new ccc(this);
   }

   public ccg H() {
      return this.bP;
   }

   public cch I() {
      return this.dm() instanceof bwi $$0 ? $$0.I() : this.bQ;
   }

   public ccf J() {
      return this.bR;
   }

   public cfs L() {
      return this.dm() instanceof bwi $$0 ? $$0.L() : this.bS;
   }

   @Nullable
   @Override
   public bwg cX() {
      bvk $$0 = this.da();
      if (!this.gb() && $$0 instanceof bwi $$1 && $$0.cc()) {
         return $$1;
      }

      return null;
   }

   public cgp N() {
      return this.cd;
   }

   @Nullable
   @Override
   public bwg O_() {
      return this.cc;
   }

   @Nullable
   protected final bwg O() {
      return this.ec().c(cfk.o).orElse(null);
   }

   public void h(@Nullable bwg $$0) {
      this.cc = $$0;
   }

   @Override
   public boolean a(bvr<?> $$0) {
      return $$0 != bvr.ae;
   }

   public boolean a(cyl $$0) {
      return false;
   }

   public void P() {
      this.a(ecr.m);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   public int Q() {
      return 80;
   }

   public void R() {
      this.b(this.u());
   }

   @Override
   public void az() {
      super.az();
      bpt $$0 = bps.a();
      $$0.a("mobBaseTick");
      if (this.bL() && this.ae.a(1000) < this.bN++) {
         this.m();
         this.R();
      }

      $$0.c();
   }

   @Override
   protected void f(bua $$0) {
      this.m();
      super.f($$0);
   }

   private void m() {
      this.bN = -this.Q();
   }

   @Override
   protected int e(ash $$0) {
      if (this.bO > 0) {
         int $$1 = this.bO;

         for (int $$2 = 0; $$2 < this.cf.size(); $$2++) {
            if (!this.cf.get($$2).f() && this.bW[$$2] <= 1.0F) {
               $$1 += 1 + this.ae.a(3);
            }
         }

         for (int $$3 = 0; $$3 < this.ce.size(); $$3++) {
            if (!this.ce.get($$3).f() && this.bV[$$3] <= 1.0F) {
               $$1 += 1 + this.ae.a(3);
            }
         }

         if (!this.cg.f() && this.bX <= 1.0F) {
            $$1 += 1 + this.ae.a(3);
         }

         return $$1;
      } else {
         return this.bO;
      }
   }

   public void S() {
      if (this.dW().C) {
         this.eW();
      } else {
         this.dW().a(this, (byte)20);
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
      if (!this.dW().C && this.af % 5 == 0) {
         this.T();
      }
   }

   protected void T() {
      boolean $$0 = !(this.cX() instanceof bwi);
      boolean $$1 = !(this.dl() instanceof cru);
      this.bT.a(cde.a.a, $$0);
      this.bT.a(cde.a.c, $$0 && $$1);
      this.bT.a(cde.a.b, $$0);
   }

   @Override
   protected float g(float $$0, float $$1) {
      this.cb.a();
      return $$1;
   }

   @Nullable
   protected axe u() {
      return null;
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fN());
      $$0.a("PersistenceRequired", this.ci);
      vd $$1 = new vd();

      for (cxp $$2 : this.cf) {
         if (!$$2.f()) {
            $$1.add($$2.a(this.dY()));
         } else {
            $$1.add(new ux());
         }
      }

      $$0.a("ArmorItems", $$1);
      vd $$3 = new vd();

      for (float $$4 : this.bW) {
         $$3.add(va.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      vd $$5 = new vd();

      for (cxp $$6 : this.ce) {
         if (!$$6.f()) {
            $$5.add($$6.a(this.dY()));
         } else {
            $$5.add(new ux());
         }
      }

      $$0.a("HandItems", $$5);
      vd $$7 = new vd();

      for (float $$8 : this.bV) {
         $$7.add(va.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.cg.f()) {
         $$0.a("body_armor_item", this.cg.a(this.dY()));
         $$0.a("body_armor_drop_chance", this.bX);
      }

      this.a($$0, this.cm);
      $$0.a("LeftHanded", this.gc());
      if (this.ck.isPresent()) {
         $$0.a("DeathLootTable", this.ck.get().a().toString());
         if (this.cl != 0L) {
            $$0.a("DeathLootTableSeed", this.cl);
         }
      }

      if (this.gb()) {
         $$0.a("NoAI", this.gb());
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 99)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.ci = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         vd $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cf.size(); $$2++) {
            ux $$3 = $$1.a($$2);
            this.cf.set($$2, cxp.a(this.dY(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         vd $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bW[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         vd $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.ce.size(); $$7++) {
            ux $$8 = $$6.a($$7);
            this.ce.set($$7, cxp.a(this.dY(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         vd $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bV[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cg = cxp.a(this.dY(), (vu)$$0.p("body_armor_item")).orElse(cxp.j);
         this.bX = $$0.j("body_armor_drop_chance");
      } else {
         this.cg = cxp.j;
      }

      this.cm = this.c($$0);
      this.v($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.ck = Optional.of(aly.a(mb.bg, alz.a($$0.l("DeathLootTable"))));
         this.cl = $$0.i("DeathLootTableSeed");
      }

      this.u($$0.q("NoAI"));
   }

   @Override
   protected void b(ash $$0, bua $$1, boolean $$2) {
      super.b($$0, $$1, $$2);
      this.ck = Optional.empty();
   }

   @Override
   public final Optional<aly<ewu>> eb() {
      return this.ck.isPresent() ? this.ck : super.eb();
   }

   @Override
   public long eH() {
      return this.cl;
   }

   public void G(float $$0) {
      this.bq = $$0;
   }

   public void H(float $$0) {
      this.bp = $$0;
   }

   public void I(float $$0) {
      this.bo = $$0;
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
      bpt $$0 = bps.a();
      $$0.a("looting");
      if (this.dW() instanceof ash $$1 && this.fN() && this.bL() && !this.be && $$1.N().b(dhe.c)) {
         kl $$2 = this.V();

         for (cmb $$4 : this.dW().a(cmb.class, this.cR().c((double)$$2.u(), (double)$$2.v(), (double)$$2.w()))) {
            if (!$$4.dR() && !$$4.l().f() && !$$4.v() && this.c($$1, $$4.l())) {
               this.a($$1, $$4);
            }
         }
      }

      $$0.c();
   }

   protected kl V() {
      return bY;
   }

   protected void a(ash $$0, cmb $$1) {
      cxp $$2 = $$1.l();
      cxp $$3 = this.b($$0, $$2.v());
      if (!$$3.f()) {
         this.a($$1);
         this.a($$1, $$3.L());
         $$2.h($$3.L());
         if ($$2.f()) {
            $$1.at();
         }
      }
   }

   public cxp b(ash $$0, cxp $$1) {
      bvs $$2 = this.f($$1);
      cxp $$3 = this.a($$2);
      boolean $$4 = this.a($$1, $$3, $$2);
      if ($$2.f() && !$$4) {
         $$2 = bvs.a;
         $$3 = this.a($$2);
         $$4 = $$3.f();
      }

      if ($$4 && this.g($$1)) {
         double $$5 = (double)this.h($$2);
         if (!$$3.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$5) {
            this.a($$0, $$3);
         }

         cxp $$6 = $$2.a($$1);
         this.b($$2, $$6);
         return $$6;
      } else {
         return cxp.j;
      }
   }

   @Override
   protected void b(bvs $$0, cxp $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.ci = true;
   }

   public void g(bvs $$0) {
      switch ($$0.a()) {
         case a:
            this.bV[$$0.b()] = 2.0F;
            break;
         case b:
            this.bW[$$0.b()] = 2.0F;
            break;
         case c:
            this.bX = 2.0F;
      }
   }

   protected boolean a(cxp $$0, cxp $$1, bvs $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$0.h() instanceof czd) {
         if (!($$1.h() instanceof czd)) {
            return true;
         } else {
            double $$3 = this.a($$0, bxo.c, $$2);
            double $$4 = this.a($$1, bxo.c, $$2);
            return $$3 != $$4 ? $$3 > $$4 : this.b($$0, $$1);
         }
      } else if ($$0.h() instanceof cvz && $$1.h() instanceof cvz) {
         return this.b($$0, $$1);
      } else if ($$0.h() instanceof cwg && $$1.h() instanceof cwg) {
         return this.b($$0, $$1);
      } else if ($$0.h() instanceof cvo) {
         if (deb.a($$1, dea.E)) {
            return false;
         } else if (!($$1.h() instanceof cvo)) {
            return true;
         } else {
            double $$5 = this.a($$0, bxo.a, $$2);
            double $$6 = this.a($$1, bxo.a, $$2);
            double $$7 = this.a($$0, bxo.b, $$2);
            double $$8 = this.a($$1, bxo.b, $$2);
            if ($$5 != $$6) {
               return $$5 > $$6;
            } else {
               return $$7 != $$8 ? $$7 > $$8 : this.b($$0, $$1);
            }
         }
      } else {
         if ($$0.h() instanceof cwi) {
            if ($$1.h() instanceof cvv) {
               return true;
            }

            if ($$1.h() instanceof cwi) {
               double $$9 = this.a($$0, bxo.c, $$2);
               double $$10 = this.a($$1, bxo.c, $$2);
               if ($$9 != $$10) {
                  return $$9 > $$10;
               }

               return this.b($$0, $$1);
            }
         }

         return false;
      }
   }

   private double a(cxp $$0, jq<bxj> $$1, bvs $$2) {
      double $$3 = this.eY().b($$1) ? this.i($$1) : 0.0;
      dag $$4 = $$0.a(ku.o, dag.a);
      return $$4.a($$3, $$2);
   }

   public boolean b(cxp $$0, cxp $$1) {
      return $$0.o() < $$1.o() ? true : j($$0) && !j($$1);
   }

   private static boolean j(cxp $$0) {
      kq $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(ku.e);
   }

   public boolean g(cxp $$0) {
      return true;
   }

   public boolean c(ash $$0, cxp $$1) {
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
   public void dI() {
      if (this.dW().al() == btg.a && this.X()) {
         this.at();
      } else if (!this.aj() && !this.W()) {
         bvk $$0 = this.dW().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.aq().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.at();
            }

            int $$4 = this.aq().f().g();
            int $$5 = $$4 * $$4;
            if (this.bf > 600 && this.ae.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.at();
            } else if ($$1 < (double)$$5) {
               this.bf = 0;
            }
         }
      } else {
         this.bf = 0;
      }
   }

   @Override
   protected final void fu() {
      this.bf++;
      bpt $$0 = bps.a();
      $$0.a("sensing");
      this.cd.a();
      $$0.c();
      int $$1 = this.af + this.ar();
      if ($$1 % 2 != 0 && this.af > 1) {
         $$0.a("targetSelector");
         this.bU.a(false);
         $$0.c();
         $$0.a("goalSelector");
         this.bT.a(false);
         $$0.c();
      } else {
         $$0.a("targetSelector");
         this.bU.a();
         $$0.c();
         $$0.a("goalSelector");
         this.bT.a();
         $$0.c();
      }

      $$0.a("navigation");
      this.bS.c();
      $$0.c();
      $$0.a("mob tick");
      this.a((ash)this.dW());
      $$0.c();
      $$0.a("controls");
      $$0.a("move");
      this.bQ.a();
      $$0.b("look");
      this.bP.a();
      $$0.b("jump");
      this.bR.b();
      $$0.c();
      $$0.c();
      this.Y();
   }

   protected void Y() {
      ahj.a(this.dW(), this, this.bT);
   }

   protected void a(ash $$0) {
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
      float $$2 = bae.h(this.aX - $$1);
      float $$3 = bae.a(bae.h(this.aX - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.q($$4);
   }

   public int ac() {
      return 10;
   }

   public void a(bvk $$0, float $$1, float $$2) {
      double $$3 = $$0.dB() - this.dB();
      double $$4 = $$0.dH() - this.dH();
      double $$6;
      if ($$0 instanceof bwg $$5) {
         $$6 = $$5.dF() - this.dF();
      } else {
         $$6 = ($$0.cR().b + $$0.cR().e) / 2.0 - this.dF();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(bae.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(bae.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.w(this.a(this.dO(), $$10, $$2));
      this.v(this.a(this.dM(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = bae.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bvr<? extends bwi> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      jh $$5 = $$3.e();
      return bvq.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dhj $$0, bvq $$1) {
      return true;
   }

   public boolean a(dhl $$0) {
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
      if (this.O_() == null) {
         return this.y(0.0F);
      } else {
         int $$0 = (int)(this.eE() - this.eS() * 0.33F);
         $$0 -= (3 - this.dW().al().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.y((float)$$0);
      }
   }

   @Override
   public Iterable<cxp> fc() {
      return this.ce;
   }

   @Override
   public Iterable<cxp> fb() {
      return this.cf;
   }

   public cxp af() {
      return this.cg;
   }

   @Override
   public boolean e(bvs $$0) {
      return $$0 != bvs.g;
   }

   public boolean ag() {
      return !this.a(bvs.g).f();
   }

   public void h(cxp $$0) {
      this.b(bvs.g, $$0);
   }

   @Override
   public Iterable<cxp> fd() {
      return (Iterable<cxp>)(this.cg.f() ? this.cf : Iterables.concat(this.cf, List.of(this.cg)));
   }

   @Override
   public cxp a(bvs $$0) {
      return switch ($$0.a()) {
         case a -> (cxp)this.ce.get($$0.b());
         case b -> (cxp)this.cf.get($$0.b());
         case c -> this.cg;
      };
   }

   @Override
   public void a(bvs $$0, cxp $$1) {
      this.c($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cf.set($$0.b(), $$1), $$1);
            break;
         case c:
            cxp $$2 = this.cg;
            this.cg = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(ash $$0, bua $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bvs $$3 : bvs.i) {
         cxp $$4 = this.a($$3);
         float $$5 = this.h($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = $$5 > 1.0F;
            bvk var11 = $$1.d();
            if (var11 instanceof bwg) {
               bwg $$7 = (bwg)var11;
               if (this.dW() instanceof ash $$8) {
                  $$5 = deb.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !deb.a($$4, dea.D) && ($$2 || $$6) && this.ae.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.ae.a(1 + this.ae.a(Math.max($$4.p() - 3, 1))));
               }

               this.a($$0, $$4);
               this.a($$3, cxp.j);
            }
         }
      }
   }

   protected float h(bvs $$0) {
      return switch ($$0.a()) {
         case a -> this.bV[$$0.b()];
         case b -> this.bW[$$0.b()];
         case c -> this.bX;
      };
   }

   public void b(ash $$0) {
      this.a($$0, $$0x -> true);
   }

   public Set<bvs> a(ash $$0, Predicate<cxp> $$1) {
      Set<bvs> $$2 = new HashSet<>();

      for (bvs $$3 : bvs.i) {
         cxp $$4 = this.a($$3);
         if (!$$4.f()) {
            if (!$$1.test($$4)) {
               $$2.add($$3);
            } else {
               double $$5 = (double)this.h($$3);
               if ($$5 > 1.0) {
                  this.a($$3, cxp.j);
                  this.a($$0, $$4);
               }
            }
         }
      }

      return $$2;
   }

   private ews g(ash $$0) {
      return new ews.a($$0).a(ezj.f, this.du()).a(ezj.a, this).a(ezi.h);
   }

   public void a(bvu $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(aly<ewu> $$0, Map<bvs, Float> $$1) {
      if (this.dW() instanceof ash $$2) {
         this.a($$0, this.g($$2), $$1);
      }
   }

   protected void a(bam $$0, bth $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dW().al() == btg.d ? 0.1F : 0.25F;
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

         for (bvs $$5 : bZ) {
            cxp $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               cxl $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new cxp($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static cxl a(bvs $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cxt.pU;
            } else if ($$1 == 1) {
               return cxt.qk;
            } else if ($$1 == 2) {
               return cxt.pY;
            } else if ($$1 == 3) {
               return cxt.qc;
            } else if ($$1 == 4) {
               return cxt.qg;
            }
         case e:
            if ($$1 == 0) {
               return cxt.pV;
            } else if ($$1 == 1) {
               return cxt.ql;
            } else if ($$1 == 2) {
               return cxt.pZ;
            } else if ($$1 == 3) {
               return cxt.qd;
            } else if ($$1 == 4) {
               return cxt.qh;
            }
         case d:
            if ($$1 == 0) {
               return cxt.pW;
            } else if ($$1 == 1) {
               return cxt.qm;
            } else if ($$1 == 2) {
               return cxt.qa;
            } else if ($$1 == 3) {
               return cxt.qe;
            } else if ($$1 == 4) {
               return cxt.qi;
            }
         case c:
            if ($$1 == 0) {
               return cxt.pX;
            } else if ($$1 == 1) {
               return cxt.qn;
            } else if ($$1 == 2) {
               return cxt.qb;
            } else if ($$1 == 3) {
               return cxt.qf;
            } else if ($$1 == 4) {
               return cxt.qj;
            }
         default:
            return null;
      }
   }

   protected void a(dhz $$0, bam $$1, bth $$2) {
      this.b($$0, $$1, $$2);

      for (bvs $$3 : bvs.i) {
         if ($$3.a() == bvs.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dhz $$0, bam $$1, bth $$2) {
      this.a($$0, bvs.a, $$1, 0.25F, $$2);
   }

   protected void a(dhz $$0, bam $$1, bvs $$2, bth $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dhz $$0, bvs $$1, bam $$2, float $$3, bth $$4) {
      cxp $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         deb.a($$5, $$0.K_(), dfn.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      bam $$4 = $$0.H_();
      bxk $$5 = Objects.requireNonNull(this.g(bxo.m));
      if (!$$5.b(bM)) {
         $$5.d(new bxm(bM, $$4.a(0.0, 0.11485000000000001), bxm.a.b));
      }

      this.v($$4.i() < 0.05F);
      return $$3;
   }

   public void ai() {
      this.ci = true;
   }

   @Override
   public void a(bvs $$0, float $$1) {
      switch ($$0.a()) {
         case a:
            this.bV[$$0.b()] = $$1;
            break;
         case b:
            this.bW[$$0.b()] = $$1;
            break;
         case c:
            this.bX = $$1;
      }
   }

   @Override
   public boolean fN() {
      return this.ch;
   }

   public void a_(boolean $$0) {
      this.ch = $$0;
   }

   @Override
   protected boolean f(bvs $$0) {
      return this.fN();
   }

   public boolean aj() {
      return this.ci;
   }

   @Override
   public final btj a(cpx $$0, bti $$1) {
      if (!this.bL()) {
         return btj.e;
      } else {
         btj $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(ecr.r, $$0);
            return $$2;
         } else {
            btj $$3 = super.a($$0, $$1);
            if ($$3 != btj.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(ecr.r, $$0);
                  return $$2;
               } else {
                  return btj.e;
               }
            }
         }
      }
   }

   private btj c(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if ($$2.a(cxt.vB)) {
         btj $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof cyy) {
         if (this.dW() instanceof ash) {
            cyy $$4 = (cyy)$$2.h();
            Optional<bwi> $$5 = $$4.a($$0, this, (bvr<? extends bwi>)this.aq(), (ash)this.dW(), this.du(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return btj.e;
            }
         }

         return btj.b;
      } else {
         return btj.e;
      }
   }

   protected void a(cpx $$0, bwi $$1) {
   }

   protected btj b(cpx $$0, bti $$1) {
      return btj.e;
   }

   public boolean ak() {
      return this.a(this.dw());
   }

   public boolean a(jh $$0) {
      return this.co == -1.0F ? true : this.cn.j($$0) < (double)(this.co * this.co);
   }

   public void a(jh $$0, int $$1) {
      this.cn = $$0;
      this.co = (float)$$1;
   }

   public jh fX() {
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
   public <T extends bwi> T a(bvr<T> $$0, bvf $$1, bvq $$2, bvf.a<T> $$3) {
      if (this.dR()) {
         return null;
      } else {
         T $$4 = (T)$$0.a(this.dW(), $$2);
         if ($$4 == null) {
            return null;
         } else {
            $$1.a().a(this, $$4, $$1);
            $$3.finalizeConversion($$4);
            if (this.dW() instanceof ash $$5) {
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
   public <T extends bwi> T a(bvr<T> $$0, bvf $$1, bvf.a<T> $$2) {
      return this.a($$0, $$1, bvq.i, $$2);
   }

   @Nullable
   @Override
   public bwe.a T_() {
      return this.cm;
   }

   @Override
   public void a(@Nullable bwe.a $$0) {
      this.cm = $$0;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      bwe.super.a($$0, $$1);
      if (this.T_() == null) {
         this.fZ();
      }
   }

   @Override
   public void z() {
      bwe.super.z();
      this.bT.a(cde.a.a);
   }

   @Override
   public boolean y() {
      return !(this instanceof cmp);
   }

   @Override
   public boolean a(bvk $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.P_()) {
         this.a(true, true);
      }

      return $$2;
   }

   @Override
   public boolean dk() {
      return super.dk() && !this.gb();
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

   public boolean gb() {
      return (this.al.a(a) & 1) != 0;
   }

   public boolean gc() {
      return (this.al.a(a) & 2) != 0;
   }

   public boolean gd() {
      return (this.al.a(a) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bwa fy() {
      return this.gc() ? bwa.a : bwa.b;
   }

   public boolean i(bwg $$0) {
      return this.ge().c($$0.eL());
   }

   protected fbt ge() {
      bvk $$0 = this.dl();
      fbt $$3;
      if ($$0 != null) {
         fbt $$1 = $$0.cR();
         fbt $$2 = this.cR();
         $$3 = new fbt(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cR();
      }

      return $$3.c(ca, 0.0, ca);
   }

   @Override
   public boolean c(ash $$0, bvk $$1) {
      float $$2 = (float)this.h(bxo.c);
      cxp $$3 = this.ea();
      bua $$4 = Optional.ofNullable($$3.h().a(this)).orElse(this.dX().b((bwg)this));
      $$2 = deb.a($$0, $$3, $$1, $$4, $$2);
      $$2 += $$3.h().a($$1, $$2, $$4);
      boolean $$5 = $$1.a($$0, $$4, $$2);
      if ($$5) {
         float $$6 = this.a($$1, $$4);
         if ($$6 > 0.0F && $$1 instanceof bwg $$7) {
            $$7.p((double)($$6 * 0.5F), (double)bae.a(this.dM() * (float) (Math.PI / 180.0)), (double)(-bae.b(this.dM() * (float) (Math.PI / 180.0))));
            this.h(this.dz().d(0.6, 1.0, 0.6));
         }

         if ($$1 instanceof bwg $$8) {
            $$3.a($$8, this);
         }

         deb.a($$0, $$1, $$4);
         this.B($$1);
         this.gf();
      }

      return $$5;
   }

   protected void gf() {
   }

   protected boolean gg() {
      if (this.dW().U() && !this.dW().C) {
         float $$0 = this.by();
         jh $$1 = jh.a(this.dB(), this.dF(), this.dH());
         boolean $$2 = this.bl() || this.av || this.aw;
         if ($$0 > 0.5F && this.ae.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dW().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(ayk<etw> $$0) {
      if (this.L().q()) {
         super.c($$0);
      } else {
         this.h(this.dz().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gh() {
      this.c($$0 -> true);
      this.ec().h();
   }

   public void c(Predicate<cde> $$0) {
      this.bT.a($$0);
   }

   @Override
   protected void cD() {
      super.cD();
      this.fe().forEach($$0 -> {
         if (!$$0.f()) {
            $$0.e(0);
         }
      });
   }

   @Nullable
   @Override
   public cxp dJ() {
      cyy $$0 = cyy.a(this.aq());
      return $$0 == null ? null : new cxp($$0);
   }

   @Override
   protected void f(jq<bxj> $$0) {
      super.f($$0);
      if ($$0.a(bxo.m) || $$0.a(bxo.E)) {
         this.L().g();
      }
   }

   @VisibleForTesting
   public float[] gi() {
      return this.bV;
   }

   @VisibleForTesting
   public float[] gj() {
      return this.bW;
   }
}

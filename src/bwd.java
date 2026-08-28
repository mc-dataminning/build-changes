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

public abstract class bwd extends bwb implements bvq, bvz, bwz {
   private static final alc<Byte> a = alg.a(bwd.class, ale.a);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   protected static final int h = 1;
   private static final kl bY = new kl(1, 0, 1);
   private static final List<bvn> bZ = List.of(bvn.f, bvn.e, bvn.d, bvn.c);
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
   protected ccb bP;
   protected ccc bQ;
   protected cca bR;
   private final cbx cb;
   protected cfn bS;
   protected final cda bT;
   protected final cda bU;
   @Nullable
   private bwb cc;
   private final cgk cd;
   private final jz<cxk> ce = jz.a(2, cxk.k);
   protected final float[] bV = new float[2];
   private final jz<cxk> cf = jz.a(4, cxk.k);
   protected final float[] bW = new float[4];
   private cxk cg = cxk.k;
   protected float bX;
   private boolean ch;
   private boolean ci;
   private final Map<eug, Float> cj = Maps.newEnumMap(eug.class);
   private Optional<aly<ewm>> ck = Optional.empty();
   private long cl;
   @Nullable
   private bvz.a cm;
   private jh cn = jh.c;
   private float co = -1.0F;

   protected bwd(bvm<? extends bwd> $$0, dha $$1) {
      super($$0, $$1);
      this.bT = new cda();
      this.bU = new cda();
      this.bP = new ccb(this);
      this.bQ = new ccc(this);
      this.bR = new cca(this);
      this.cb = this.G();
      this.bS = this.b($$1);
      this.cd = new cgk(this);
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

   public static bxi.a C() {
      return bwb.ed().a(bxj.m, 16.0);
   }

   protected cfn b(dha $$0) {
      return new cfm(this, $$0);
   }

   protected boolean D() {
      return false;
   }

   public float a(eug $$0) {
      bwd $$2;
      label17: {
         if (this.dl() instanceof bwd $$1 && $$1.D()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cj.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(eug $$0, float $$1) {
      this.cj.put($$0, $$1);
   }

   @Override
   public void E() {
   }

   @Override
   public void F() {
   }

   protected cbx G() {
      return new cbx(this);
   }

   public ccb H() {
      return this.bP;
   }

   public ccc I() {
      return this.dl() instanceof bwd $$0 ? $$0.I() : this.bQ;
   }

   public cca J() {
      return this.bR;
   }

   public cfn L() {
      return this.dl() instanceof bwd $$0 ? $$0.L() : this.bS;
   }

   @Nullable
   @Override
   public bwb cX() {
      bvf $$0 = this.da();
      if (!this.fZ() && $$0 instanceof bwd $$1 && $$0.cc()) {
         return $$1;
      }

      return null;
   }

   public cgk N() {
      return this.cd;
   }

   @Nullable
   @Override
   public bwb O_() {
      return this.cc;
   }

   @Nullable
   protected final bwb O() {
      return this.eb().c(cff.o).orElse(null);
   }

   public void h(@Nullable bwb $$0) {
      this.cc = $$0;
   }

   @Override
   public boolean a(bvm<?> $$0) {
      return $$0 != bvm.ae;
   }

   public boolean a(cyg $$0) {
      return false;
   }

   public void P() {
      this.a(ecj.m);
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
      bpo $$0 = bpn.a();
      $$0.a("mobBaseTick");
      if (this.bL() && this.ae.a(1000) < this.bN++) {
         this.m();
         this.R();
      }

      $$0.c();
   }

   @Override
   protected void f(btv $$0) {
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
      if (this.dV().C) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.ae.k() * 0.02;
            double $$2 = this.ae.k() * 0.02;
            double $$3 = this.ae.k() * 0.02;
            double $$4 = 10.0;
            this.dV().a(ls.ac, this.c(1.0) - $$1 * 10.0, this.dD() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
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
      boolean $$0 = !(this.cX() instanceof bwd);
      boolean $$1 = !(this.dk() instanceof crp);
      this.bT.a(ccz.a.a, $$0);
      this.bT.a(ccz.a.c, $$0 && $$1);
      this.bT.a(ccz.a.b, $$0);
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
      $$0.a("CanPickUpLoot", this.fL());
      $$0.a("PersistenceRequired", this.ci);
      vd $$1 = new vd();

      for (cxk $$2 : this.cf) {
         if (!$$2.f()) {
            $$1.add($$2.a(this.dX()));
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

      for (cxk $$6 : this.ce) {
         if (!$$6.f()) {
            $$5.add($$6.a(this.dX()));
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
         $$0.a("body_armor_item", this.cg.a(this.dX()));
         $$0.a("body_armor_drop_chance", this.bX);
      }

      this.a($$0, this.cm);
      $$0.a("LeftHanded", this.ga());
      if (this.ck.isPresent()) {
         $$0.a("DeathLootTable", this.ck.get().a().toString());
         if (this.cl != 0L) {
            $$0.a("DeathLootTableSeed", this.cl);
         }
      }

      if (this.fZ()) {
         $$0.a("NoAI", this.fZ());
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
            this.cf.set($$2, cxk.a(this.dX(), $$3));
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
            this.ce.set($$7, cxk.a(this.dX(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         vd $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bV[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cg = cxk.a(this.dX(), (vu)$$0.p("body_armor_item")).orElse(cxk.k);
         this.bX = $$0.j("body_armor_drop_chance");
      } else {
         this.cg = cxk.k;
      }

      this.cm = this.c($$0);
      this.v($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.ck = Optional.of(aly.a(mb.bf, alz.a($$0.l("DeathLootTable"))));
         this.cl = $$0.i("DeathLootTableSeed");
      }

      this.u($$0.q("NoAI"));
   }

   @Override
   protected void b(ash $$0, btv $$1, boolean $$2) {
      super.b($$0, $$1, $$2);
      this.ck = Optional.empty();
   }

   @Override
   public final Optional<aly<ewm>> ea() {
      return this.ck.isPresent() ? this.ck : super.ea();
   }

   @Override
   public long eG() {
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
      bpo $$0 = bpn.a();
      $$0.a("looting");
      if (this.dV() instanceof ash $$1 && this.fL() && this.bL() && !this.be && $$1.N().b(dgw.c)) {
         kl $$2 = this.V();

         for (clw $$4 : this.dV().a(clw.class, this.cR().c((double)$$2.u(), (double)$$2.v(), (double)$$2.w()))) {
            if (!$$4.dQ() && !$$4.l().f() && !$$4.v() && this.c($$1, $$4.l())) {
               this.a($$1, $$4);
            }
         }
      }

      $$0.c();
   }

   protected kl V() {
      return bY;
   }

   protected void a(ash $$0, clw $$1) {
      cxk $$2 = $$1.l();
      cxk $$3 = this.b($$0, $$2.v());
      if (!$$3.f()) {
         this.a($$1);
         this.a($$1, $$3.L());
         $$2.h($$3.L());
         if ($$2.f()) {
            $$1.at();
         }
      }
   }

   public cxk b(ash $$0, cxk $$1) {
      bvn $$2 = this.f($$1);
      cxk $$3 = this.a($$2);
      boolean $$4 = this.a($$1, $$3, $$2);
      if ($$2.f() && !$$4) {
         $$2 = bvn.a;
         $$3 = this.a($$2);
         $$4 = $$3.f();
      }

      if ($$4 && this.g($$1)) {
         double $$5 = (double)this.h($$2);
         if (!$$3.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$5) {
            this.a($$0, $$3);
         }

         cxk $$6 = $$2.a($$1);
         this.b($$2, $$6);
         return $$6;
      } else {
         return cxk.k;
      }
   }

   @Override
   protected void b(bvn $$0, cxk $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.ci = true;
   }

   public void g(bvn $$0) {
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

   protected boolean a(cxk $$0, cxk $$1, bvn $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$0.h() instanceof cyy) {
         if (!($$1.h() instanceof cyy)) {
            return true;
         } else {
            double $$3 = this.a($$0, bxj.c, $$2);
            double $$4 = this.a($$1, bxj.c, $$2);
            return $$3 != $$4 ? $$3 > $$4 : this.b($$0, $$1);
         }
      } else if ($$0.h() instanceof cvu && $$1.h() instanceof cvu) {
         return this.b($$0, $$1);
      } else if ($$0.h() instanceof cwb && $$1.h() instanceof cwb) {
         return this.b($$0, $$1);
      } else if ($$0.h() instanceof cvj) {
         if (ddt.a($$1, dds.E)) {
            return false;
         } else if (!($$1.h() instanceof cvj)) {
            return true;
         } else {
            double $$5 = this.a($$0, bxj.a, $$2);
            double $$6 = this.a($$1, bxj.a, $$2);
            double $$7 = this.a($$0, bxj.b, $$2);
            double $$8 = this.a($$1, bxj.b, $$2);
            if ($$5 != $$6) {
               return $$5 > $$6;
            } else {
               return $$7 != $$8 ? $$7 > $$8 : this.b($$0, $$1);
            }
         }
      } else {
         if ($$0.h() instanceof cwd) {
            if ($$1.h() instanceof cvq) {
               return true;
            }

            if ($$1.h() instanceof cwd) {
               double $$9 = this.a($$0, bxj.c, $$2);
               double $$10 = this.a($$1, bxj.c, $$2);
               if ($$9 != $$10) {
                  return $$9 > $$10;
               }

               return this.b($$0, $$1);
            }
         }

         return false;
      }
   }

   private double a(cxk $$0, jq<bxe> $$1, bvn $$2) {
      double $$3 = this.eW().b($$1) ? this.i($$1) : 0.0;
      dab $$4 = $$0.a(ku.o, dab.a);
      return $$4.a($$3, $$2);
   }

   public boolean b(cxk $$0, cxk $$1) {
      return $$0.o() < $$1.o() ? true : j($$0) && !j($$1);
   }

   private static boolean j(cxk $$0) {
      kq $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(ku.e);
   }

   public boolean g(cxk $$0) {
      return true;
   }

   public boolean c(ash $$0, cxk $$1) {
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
      if (this.dV().al() == btb.a && this.X()) {
         this.at();
      } else if (!this.aj() && !this.W()) {
         bvf $$0 = this.dV().a(this, -1.0);
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
   protected final void fs() {
      this.bf++;
      bpo $$0 = bpn.a();
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
      this.a((ash)this.dV());
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
      ahj.a(this.dV(), this, this.bT);
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

   public void a(bvf $$0, float $$1, float $$2) {
      double $$3 = $$0.dA() - this.dA();
      double $$4 = $$0.dG() - this.dG();
      double $$6;
      if ($$0 instanceof bwb $$5) {
         $$6 = $$5.dE() - this.dE();
      } else {
         $$6 = ($$0.cR().b + $$0.cR().e) / 2.0 - this.dE();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(bae.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(bae.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.w(this.a(this.dN(), $$10, $$2));
      this.v(this.a(this.dL(), $$9, $$1));
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

   public static boolean a(bvm<? extends bwd> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      jh $$5 = $$3.e();
      return bvl.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dhb $$0, bvl $$1) {
      return true;
   }

   public boolean a(dhd $$0) {
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
         int $$0 = (int)(this.eD() - this.eR() * 0.33F);
         $$0 -= (3 - this.dV().al().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.y((float)$$0);
      }
   }

   @Override
   public Iterable<cxk> fa() {
      return this.ce;
   }

   @Override
   public Iterable<cxk> eZ() {
      return this.cf;
   }

   public cxk af() {
      return this.cg;
   }

   @Override
   public boolean e(bvn $$0) {
      return $$0 != bvn.g;
   }

   public boolean ag() {
      return !this.a(bvn.g).f();
   }

   public void h(cxk $$0) {
      this.b(bvn.g, $$0);
   }

   @Override
   public Iterable<cxk> fb() {
      return (Iterable<cxk>)(this.cg.f() ? this.cf : Iterables.concat(this.cf, List.of(this.cg)));
   }

   @Override
   public cxk a(bvn $$0) {
      return switch ($$0.a()) {
         case a -> (cxk)this.ce.get($$0.b());
         case b -> (cxk)this.cf.get($$0.b());
         case c -> this.cg;
      };
   }

   @Override
   public void a(bvn $$0, cxk $$1) {
      this.c($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cf.set($$0.b(), $$1), $$1);
            break;
         case c:
            cxk $$2 = this.cg;
            this.cg = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(ash $$0, btv $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bvn $$3 : bvn.i) {
         cxk $$4 = this.a($$3);
         float $$5 = this.h($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = $$5 > 1.0F;
            bvf var11 = $$1.d();
            if (var11 instanceof bwb) {
               bwb $$7 = (bwb)var11;
               if (this.dV() instanceof ash $$8) {
                  $$5 = ddt.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !ddt.a($$4, dds.D) && ($$2 || $$6) && this.ae.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.ae.a(1 + this.ae.a(Math.max($$4.p() - 3, 1))));
               }

               this.a($$0, $$4);
               this.a($$3, cxk.k);
            }
         }
      }
   }

   protected float h(bvn $$0) {
      return switch ($$0.a()) {
         case a -> this.bV[$$0.b()];
         case b -> this.bW[$$0.b()];
         case c -> this.bX;
      };
   }

   public void b(ash $$0) {
      this.a($$0, $$0x -> true);
   }

   public Set<bvn> a(ash $$0, Predicate<cxk> $$1) {
      Set<bvn> $$2 = new HashSet<>();

      for (bvn $$3 : bvn.i) {
         cxk $$4 = this.a($$3);
         if (!$$4.f()) {
            if (!$$1.test($$4)) {
               $$2.add($$3);
            } else {
               double $$5 = (double)this.h($$3);
               if ($$5 > 1.0) {
                  this.a($$3, cxk.k);
                  this.a($$0, $$4);
               }
            }
         }
      }

      return $$2;
   }

   private ewk g(ash $$0) {
      return new ewk.a($$0).a(ezd.f, this.dt()).a(ezd.a, this).a(ezc.h);
   }

   public void a(bvp $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(aly<ewm> $$0, Map<bvn, Float> $$1) {
      if (this.dV() instanceof ash $$2) {
         this.a($$0, this.g($$2), $$1);
      }
   }

   protected void a(bam $$0, btc $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dV().al() == btb.d ? 0.1F : 0.25F;
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

         for (bvn $$5 : bZ) {
            cxk $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               cxg $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new cxk($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static cxg a(bvn $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cxo.pU;
            } else if ($$1 == 1) {
               return cxo.qk;
            } else if ($$1 == 2) {
               return cxo.pY;
            } else if ($$1 == 3) {
               return cxo.qc;
            } else if ($$1 == 4) {
               return cxo.qg;
            }
         case e:
            if ($$1 == 0) {
               return cxo.pV;
            } else if ($$1 == 1) {
               return cxo.ql;
            } else if ($$1 == 2) {
               return cxo.pZ;
            } else if ($$1 == 3) {
               return cxo.qd;
            } else if ($$1 == 4) {
               return cxo.qh;
            }
         case d:
            if ($$1 == 0) {
               return cxo.pW;
            } else if ($$1 == 1) {
               return cxo.qm;
            } else if ($$1 == 2) {
               return cxo.qa;
            } else if ($$1 == 3) {
               return cxo.qe;
            } else if ($$1 == 4) {
               return cxo.qi;
            }
         case c:
            if ($$1 == 0) {
               return cxo.pX;
            } else if ($$1 == 1) {
               return cxo.qn;
            } else if ($$1 == 2) {
               return cxo.qb;
            } else if ($$1 == 3) {
               return cxo.qf;
            } else if ($$1 == 4) {
               return cxo.qj;
            }
         default:
            return null;
      }
   }

   protected void a(dhr $$0, bam $$1, btc $$2) {
      this.b($$0, $$1, $$2);

      for (bvn $$3 : bvn.i) {
         if ($$3.a() == bvn.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dhr $$0, bam $$1, btc $$2) {
      this.a($$0, bvn.a, $$1, 0.25F, $$2);
   }

   protected void a(dhr $$0, bam $$1, bvn $$2, btc $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dhr $$0, bvn $$1, bam $$2, float $$3, btc $$4) {
      cxk $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         ddt.a($$5, $$0.K_(), dff.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      bam $$4 = $$0.H_();
      bxf $$5 = Objects.requireNonNull(this.g(bxj.m));
      if (!$$5.b(bM)) {
         $$5.d(new bxh(bM, $$4.a(0.0, 0.11485000000000001), bxh.a.b));
      }

      this.v($$4.i() < 0.05F);
      return $$3;
   }

   public void ai() {
      this.ci = true;
   }

   @Override
   public void a(bvn $$0, float $$1) {
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
   public boolean fL() {
      return this.ch;
   }

   public void a_(boolean $$0) {
      this.ch = $$0;
   }

   @Override
   protected boolean f(bvn $$0) {
      return this.fL();
   }

   public boolean aj() {
      return this.ci;
   }

   @Override
   public final bte a(cps $$0, btd $$1) {
      if (!this.bL()) {
         return bte.e;
      } else {
         bte $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(ecj.r, $$0);
            return $$2;
         } else {
            bte $$3 = super.a($$0, $$1);
            if ($$3 != bte.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(ecj.r, $$0);
                  return $$2;
               } else {
                  return bte.e;
               }
            }
         }
      }
   }

   private bte c(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if ($$2.a(cxo.vB)) {
         bte $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof cyt) {
         if (this.dV() instanceof ash) {
            cyt $$4 = (cyt)$$2.h();
            Optional<bwd> $$5 = $$4.a($$0, this, (bvm<? extends bwd>)this.aq(), (ash)this.dV(), this.dt(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return bte.e;
            }
         }

         return bte.b;
      } else {
         return bte.e;
      }
   }

   protected void a(cps $$0, bwd $$1) {
   }

   protected bte b(cps $$0, btd $$1) {
      return bte.e;
   }

   public boolean ak() {
      return this.a(this.dv());
   }

   public boolean a(jh $$0) {
      return this.co == -1.0F ? true : this.cn.j($$0) < (double)(this.co * this.co);
   }

   public void a(jh $$0, int $$1) {
      this.cn = $$0;
      this.co = (float)$$1;
   }

   public jh fV() {
      return this.cn;
   }

   public float fW() {
      return this.co;
   }

   public void fX() {
      this.co = -1.0F;
   }

   public boolean fY() {
      return this.co != -1.0F;
   }

   @Nullable
   public <T extends bwd> T a(bvm<T> $$0, bva $$1, bvl $$2, bva.a<T> $$3) {
      if (this.dQ()) {
         return null;
      } else {
         T $$4 = (T)$$0.a(this.dV(), $$2);
         if ($$4 == null) {
            return null;
         } else {
            $$1.a().a(this, $$4, $$1);
            $$3.finalizeConversion($$4);
            if (this.dV() instanceof ash $$5) {
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
   public <T extends bwd> T a(bvm<T> $$0, bva $$1, bva.a<T> $$2) {
      return this.a($$0, $$1, bvl.i, $$2);
   }

   @Nullable
   @Override
   public bvz.a T_() {
      return this.cm;
   }

   @Override
   public void a(@Nullable bvz.a $$0) {
      this.cm = $$0;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      bvz.super.a($$0, $$1);
      if (this.T_() == null) {
         this.fX();
      }
   }

   @Override
   public void z() {
      bvz.super.z();
      this.bT.a(ccz.a.a);
   }

   @Override
   public boolean y() {
      return !(this instanceof cmk);
   }

   @Override
   public boolean a(bvf $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.P_()) {
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
   public bvv fw() {
      return this.ga() ? bvv.a : bvv.b;
   }

   public boolean i(bwb $$0) {
      return this.gc().c($$0.eK());
   }

   protected fbn gc() {
      bvf $$0 = this.dk();
      fbn $$3;
      if ($$0 != null) {
         fbn $$1 = $$0.cR();
         fbn $$2 = this.cR();
         $$3 = new fbn(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cR();
      }

      return $$3.c(ca, 0.0, ca);
   }

   @Override
   public boolean c(ash $$0, bvf $$1) {
      float $$2 = (float)this.h(bxj.c);
      cxk $$3 = this.dZ();
      btv $$4 = Optional.ofNullable($$3.h().a(this)).orElse(this.dW().b((bwb)this));
      $$2 = ddt.a($$0, $$3, $$1, $$4, $$2);
      $$2 += $$3.h().a($$1, $$2, $$4);
      boolean $$5 = $$1.a($$0, $$4, $$2);
      if ($$5) {
         float $$6 = this.a($$1, $$4);
         if ($$6 > 0.0F && $$1 instanceof bwb $$7) {
            $$7.p((double)($$6 * 0.5F), (double)bae.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-bae.b(this.dL() * (float) (Math.PI / 180.0))));
            this.h(this.dy().d(0.6, 1.0, 0.6));
         }

         if ($$1 instanceof bwb $$8) {
            $$3.a($$8, this);
         }

         ddt.a($$0, $$1, $$4);
         this.B($$1);
         this.gd();
      }

      return $$5;
   }

   protected void gd() {
   }

   protected boolean ge() {
      if (this.dV().U() && !this.dV().C) {
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
   protected void c(ayk<eto> $$0) {
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

   public void c(Predicate<ccz> $$0) {
      this.bT.a($$0);
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
   public cxk dI() {
      cyt $$0 = cyt.a(this.aq());
      return $$0 == null ? null : new cxk($$0);
   }

   @Override
   protected void f(jq<bxe> $$0) {
      super.f($$0);
      if ($$0.a(bxj.m) || $$0.a(bxj.E)) {
         this.L().g();
      }
   }

   @VisibleForTesting
   public float[] gg() {
      return this.bV;
   }

   @VisibleForTesting
   public float[] gh() {
      return this.bW;
   }
}

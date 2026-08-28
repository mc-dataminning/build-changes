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

public abstract class bvc extends bva implements bup, buy, bvy {
   private static final akl<Byte> b = akp.a(bvc.class, akn.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int h = 1;
   private static final kl bX = new kl(1, 0, 1);
   private static final List<bum> bY = List.of(bum.f, bum.e, bum.d, bum.c);
   public static final float i = 0.15F;
   public static final float j = 0.55F;
   public static final float k = 0.5F;
   public static final float l = 0.25F;
   public static final float bH = 0.085F;
   public static final float bI = 1.0F;
   public static final int bJ = 2;
   public static final int bK = 2;
   private static final double bZ = Math.sqrt(2.04F) - 0.6F;
   protected static final ali bL = ali.b("random_spawn_bonus");
   public int bM;
   protected int bN;
   protected cba bO;
   protected cbb bP;
   protected caz bQ;
   private final caw ca;
   protected cem bR;
   protected final cbz bS;
   protected final cbz bT;
   @Nullable
   private bva cb;
   private final cfj cc;
   private final jz<cwb> cd = jz.a(2, cwb.k);
   protected final float[] bU = new float[2];
   private final jz<cwb> ce = jz.a(4, cwb.k);
   protected final float[] bV = new float[4];
   private cwb cf = cwb.k;
   protected float bW;
   private boolean cg;
   private boolean ch;
   private final Map<esb, Float> ci = Maps.newEnumMap(esb.class);
   private Optional<alh<euh>> cj = Optional.empty();
   private long ck;
   @Nullable
   private buy.a cl;
   private jh cm = jh.c;
   private float cn = -1.0F;

   protected bvc(bul<? extends bvc> $$0, dfb $$1) {
      super($$0, $$1);
      this.bS = new cbz();
      this.bT = new cbz();
      this.bO = new cba(this);
      this.bP = new cbb(this);
      this.bQ = new caz(this);
      this.ca = this.J();
      this.bR = this.b($$1);
      this.cc = new cfj(this);
      Arrays.fill(this.bV, 0.085F);
      Arrays.fill(this.bU, 0.085F);
      this.bW = 0.085F;
      if ($$1 != null && !$$1.C) {
         this.D();
      }
   }

   @Override
   protected void D() {
   }

   public static bwh.a E() {
      return bva.ef().a(bwi.m, 16.0);
   }

   protected cem b(dfb $$0) {
      return new cel(this, $$0);
   }

   protected boolean F() {
      return false;
   }

   public float a(esb $$0) {
      bvc $$2;
      label17: {
         if (this.dm() instanceof bvc $$1 && $$1.F()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.ci.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(esb $$0, float $$1) {
      this.ci.put($$0, $$1);
   }

   @Override
   public void G() {
   }

   @Override
   public void I() {
   }

   protected caw J() {
      return new caw(this);
   }

   public cba K() {
      return this.bO;
   }

   public cbb M() {
      return this.dm() instanceof bvc $$0 ? $$0.M() : this.bP;
   }

   public caz O() {
      return this.bQ;
   }

   public cem P() {
      return this.dm() instanceof bvc $$0 ? $$0.P() : this.bR;
   }

   @Nullable
   @Override
   public bva cY() {
      bue $$0 = this.db();
      if (!this.gh() && $$0 instanceof bvc $$1 && $$0.cd()) {
         return $$1;
      }

      return null;
   }

   public cfj Q() {
      return this.cc;
   }

   @Nullable
   @Override
   public bva m() {
      return this.cb;
   }

   @Nullable
   protected final bva R() {
      return this.ed().c(cee.o).orElse(null);
   }

   public void h(@Nullable bva $$0) {
      this.cb = $$0;
   }

   @Override
   public boolean a(bul<?> $$0) {
      return $$0 != bul.T;
   }

   public boolean a(cwx $$0) {
      return false;
   }

   public void S() {
      this.a(eag.m);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   public int T() {
      return 80;
   }

   public void U() {
      this.b(this.w());
   }

   @Override
   public void aB() {
      super.aB();
      bon $$0 = bom.a();
      $$0.a("mobBaseTick");
      if (this.bM() && this.af.a(1000) < this.bM++) {
         this.q();
         this.U();
      }

      $$0.c();
   }

   @Override
   protected void e(bsu $$0) {
      this.q();
      super.e($$0);
   }

   private void q() {
      this.bM = -this.T();
   }

   @Override
   protected int eq() {
      if (this.bN > 0) {
         int $$0 = this.bN;

         for (int $$1 = 0; $$1 < this.ce.size(); $$1++) {
            if (!this.ce.get($$1).f() && this.bV[$$1] <= 1.0F) {
               $$0 += 1 + this.af.a(3);
            }
         }

         for (int $$2 = 0; $$2 < this.cd.size(); $$2++) {
            if (!this.cd.get($$2).f() && this.bU[$$2] <= 1.0F) {
               $$0 += 1 + this.af.a(3);
            }
         }

         if (!this.cf.f() && this.bW <= 1.0F) {
            $$0 += 1 + this.af.a(3);
         }

         return $$0;
      } else {
         return this.bN;
      }
   }

   public void V() {
      if (this.dX().C) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.af.k() * 0.02;
            double $$2 = this.af.k() * 0.02;
            double $$3 = this.af.k() * 0.02;
            double $$4 = 10.0;
            this.dX().a(lr.ab, this.c(1.0) - $$1 * 10.0, this.dF() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dX().a(this, (byte)20);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 20) {
         this.V();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dX().C && this.ag % 5 == 0) {
         this.W();
      }
   }

   protected void W() {
      boolean $$0 = !(this.cY() instanceof bvc);
      boolean $$1 = !(this.dl() instanceof cqm);
      this.bS.a(cby.a.a, $$0);
      this.bS.a(cby.a.c, $$0 && $$1);
      this.bS.a(cby.a.b, $$0);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.ca.a();
      return $$1;
   }

   @Nullable
   protected awk w() {
      return null;
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fP());
      $$0.a("PersistenceRequired", this.ch);
      uq $$1 = new uq();

      for (cwb $$2 : this.ce) {
         if (!$$2.f()) {
            $$1.add($$2.a(this.dZ()));
         } else {
            $$1.add(new uk());
         }
      }

      $$0.a("ArmorItems", $$1);
      uq $$3 = new uq();

      for (float $$4 : this.bV) {
         $$3.add(un.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      uq $$5 = new uq();

      for (cwb $$6 : this.cd) {
         if (!$$6.f()) {
            $$5.add($$6.a(this.dZ()));
         } else {
            $$5.add(new uk());
         }
      }

      $$0.a("HandItems", $$5);
      uq $$7 = new uq();

      for (float $$8 : this.bU) {
         $$7.add(un.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.cf.f()) {
         $$0.a("body_armor_item", this.cf.a(this.dZ()));
         $$0.a("body_armor_drop_chance", this.bW);
      }

      this.a($$0, this.cl);
      $$0.a("LeftHanded", this.gi());
      if (this.cj.isPresent()) {
         $$0.a("DeathLootTable", this.cj.get().a().toString());
         if (this.ck != 0L) {
            $$0.a("DeathLootTableSeed", this.ck);
         }
      }

      if (this.gh()) {
         $$0.a("NoAI", this.gh());
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 99)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.ch = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         uq $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ce.size(); $$2++) {
            uk $$3 = $$1.a($$2);
            this.ce.set($$2, cwb.a(this.dZ(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         uq $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bV[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         uq $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.cd.size(); $$7++) {
            uk $$8 = $$6.a($$7);
            this.cd.set($$7, cwb.a(this.dZ(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         uq $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bU[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cf = cwb.a(this.dZ(), (vh)$$0.p("body_armor_item")).orElse(cwb.k);
         this.bW = $$0.j("body_armor_drop_chance");
      } else {
         this.cf = cwb.k;
      }

      this.cl = this.c($$0);
      this.v($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cj = Optional.of(alh.a(lz.bd, ali.a($$0.l("DeathLootTable"))));
         this.ck = $$0.i("DeathLootTableSeed");
      }

      this.u($$0.q("NoAI"));
   }

   @Override
   protected void a(bsu $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cj = Optional.empty();
   }

   @Override
   public final Optional<alh<euh>> ec() {
      return this.cj.isPresent() ? this.cj : super.ec();
   }

   @Override
   public long eK() {
      return this.ck;
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

   public void X() {
      this.P().o();
      this.I(0.0F);
      this.H(0.0F);
      this.C(0.0F);
   }

   @Override
   public void n_() {
      super.n_();
      bon $$0 = bom.a();
      $$0.a("looting");
      if (!this.dX().C && this.fP() && this.bM() && !this.be && this.dX().ac().b(dex.c)) {
         kl $$1 = this.Y();

         for (ckv $$3 : this.dX().a(ckv.class, this.cS().c((double)$$1.u(), (double)$$1.v(), (double)$$1.w()))) {
            if (!$$3.dS() && !$$3.m().f() && !$$3.w() && this.i($$3.m())) {
               this.b($$3);
            }
         }
      }

      $$0.c();
   }

   protected kl Y() {
      return bX;
   }

   protected void b(ckv $$0) {
      cwb $$1 = $$0.m();
      cwb $$2 = this.g($$1.v());
      if (!$$2.f()) {
         this.a($$0);
         this.a($$0, $$2.L());
         $$1.h($$2.L());
         if ($$1.f()) {
            $$0.av();
         }
      }
   }

   public cwb g(cwb $$0) {
      bum $$1 = this.f($$0);
      cwb $$2 = this.a($$1);
      boolean $$3 = this.a($$0, $$2, $$1);
      if ($$1.f() && !$$3) {
         $$1 = bum.a;
         $$2 = this.a($$1);
         $$3 = $$2.f();
      }

      if ($$3 && this.h($$0)) {
         double $$4 = (double)this.h($$1);
         if (!$$2.f() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         cwb $$5 = $$1.a($$0);
         this.b($$1, $$5);
         return $$5;
      } else {
         return cwb.k;
      }
   }

   @Override
   protected void b(bum $$0, cwb $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.ch = true;
   }

   public void g(bum $$0) {
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

   protected boolean a(cwb $$0, cwb $$1, bum $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$0.h() instanceof cxp) {
         if (!($$1.h() instanceof cxp)) {
            return true;
         } else {
            double $$3 = this.a($$0, bwi.c, $$2);
            double $$4 = this.a($$1, bwi.c, $$2);
            return $$3 != $$4 ? $$3 > $$4 : this.b($$0, $$1);
         }
      } else if ($$0.h() instanceof cul && $$1.h() instanceof cul) {
         return this.b($$0, $$1);
      } else if ($$0.h() instanceof cus && $$1.h() instanceof cus) {
         return this.b($$0, $$1);
      } else if ($$0.h() instanceof cua) {
         if (dbu.a($$1, dbt.E)) {
            return false;
         } else if (!($$1.h() instanceof cua)) {
            return true;
         } else {
            double $$5 = this.a($$0, bwi.a, $$2);
            double $$6 = this.a($$1, bwi.a, $$2);
            double $$7 = this.a($$0, bwi.b, $$2);
            double $$8 = this.a($$1, bwi.b, $$2);
            if ($$5 != $$6) {
               return $$5 > $$6;
            } else {
               return $$7 != $$8 ? $$7 > $$8 : this.b($$0, $$1);
            }
         }
      } else {
         if ($$0.h() instanceof cuu) {
            if ($$1.h() instanceof cuh) {
               return true;
            }

            if ($$1.h() instanceof cuu) {
               double $$9 = this.a($$0, bwi.c, $$2);
               double $$10 = this.a($$1, bwi.c, $$2);
               if ($$9 != $$10) {
                  return $$9 > $$10;
               }

               return this.b($$0, $$1);
            }
         }

         return false;
      }
   }

   private double a(cwb $$0, jq<bwd> $$1, bum $$2) {
      double $$3 = this.fa().b($$1) ? this.i($$1) : 0.0;
      cys $$4 = $$0.a(ku.o, cys.a);
      return $$4.a($$3, $$2);
   }

   public boolean b(cwb $$0, cwb $$1) {
      return $$0.o() < $$1.o() ? true : l($$0) && !l($$1);
   }

   private static boolean l(cwb $$0) {
      kq $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(ku.e);
   }

   public boolean h(cwb $$0) {
      return true;
   }

   public boolean i(cwb $$0) {
      return this.h($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean Z() {
      return this.ca();
   }

   protected boolean aa() {
      return false;
   }

   @Override
   public void dJ() {
      if (this.dX().ak() == bsa.a && this.aa()) {
         this.av();
      } else if (!this.gb() && !this.Z()) {
         bue $$0 = this.dX().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.ar().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.av();
            }

            int $$4 = this.ar().f().g();
            int $$5 = $$4 * $$4;
            if (this.bf > 600 && this.af.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.av();
            } else if ($$1 < (double)$$5) {
               this.bf = 0;
            }
         }
      } else {
         this.bf = 0;
      }
   }

   @Override
   protected final void fw() {
      this.bf++;
      bon $$0 = bom.a();
      $$0.a("sensing");
      this.cc.a();
      $$0.c();
      int $$1 = this.ag + this.as();
      if ($$1 % 2 != 0 && this.ag > 1) {
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
      this.ac();
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
      this.ab();
   }

   protected void ab() {
      ags.a(this.dX(), this, this.bS);
   }

   protected void ac() {
   }

   public int ad() {
      return 40;
   }

   public int ae() {
      return 75;
   }

   protected void ag() {
      float $$0 = (float)this.ae();
      float $$1 = this.cB();
      float $$2 = azk.h(this.aX - $$1);
      float $$3 = azk.a(azk.h(this.aX - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.q($$4);
   }

   public int ah() {
      return 10;
   }

   public void a(bue $$0, float $$1, float $$2) {
      double $$3 = $$0.dC() - this.dC();
      double $$4 = $$0.dI() - this.dI();
      double $$6;
      if ($$0 instanceof bva $$5) {
         $$6 = $$5.dG() - this.dG();
      } else {
         $$6 = ($$0.cS().b + $$0.cS().e) / 2.0 - this.dG();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(azk.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(azk.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.w(this.a(this.dP(), $$10, $$2));
      this.v(this.a(this.dN(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azk.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bul<? extends bvc> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      jh $$5 = $$3.e();
      return buk.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dfc $$0, buk $$1) {
      return true;
   }

   public boolean a(dfe $$0) {
      return !$$0.d(this.cS()) && $$0.f(this);
   }

   public int aj() {
      return 4;
   }

   public boolean r(int $$0) {
      return false;
   }

   @Override
   public int cF() {
      if (this.m() == null) {
         return this.y(0.0F);
      } else {
         int $$0 = (int)(this.eG() - this.eV() * 0.33F);
         $$0 -= (3 - this.dX().ak().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.y((float)$$0);
      }
   }

   @Override
   public Iterable<cwb> fe() {
      return this.cd;
   }

   @Override
   public Iterable<cwb> fd() {
      return this.ce;
   }

   public cwb ak() {
      return this.cf;
   }

   @Override
   public boolean e(bum $$0) {
      return $$0 != bum.g;
   }

   public boolean al() {
      return !this.a(bum.g).f();
   }

   public void j(cwb $$0) {
      this.b(bum.g, $$0);
   }

   @Override
   public Iterable<cwb> ff() {
      return (Iterable<cwb>)(this.cf.f() ? this.ce : Iterables.concat(this.ce, List.of(this.cf)));
   }

   @Override
   public cwb a(bum $$0) {
      return switch ($$0.a()) {
         case a -> (cwb)this.cd.get($$0.b());
         case b -> (cwb)this.ce.get($$0.b());
         case c -> this.cf;
      };
   }

   @Override
   public void a(bum $$0, cwb $$1) {
      this.c($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cd.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
            break;
         case c:
            cwb $$2 = this.cf;
            this.cf = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(arn $$0, bsu $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bum $$3 : bum.i) {
         cwb $$4 = this.a($$3);
         float $$5 = this.h($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = $$5 > 1.0F;
            bue var11 = $$1.d();
            if (var11 instanceof bva) {
               bva $$7 = (bva)var11;
               if (this.dX() instanceof arn $$8) {
                  $$5 = dbu.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !dbu.a($$4, dbt.D) && ($$2 || $$6) && this.af.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.af.a(1 + this.af.a(Math.max($$4.p() - 3, 1))));
               }

               this.b($$4);
               this.a($$3, cwb.k);
            }
         }
      }
   }

   protected float h(bum $$0) {
      return switch ($$0.a()) {
         case a -> this.bU[$$0.b()];
         case b -> this.bV[$$0.b()];
         case c -> this.bW;
      };
   }

   public void fZ() {
      this.c($$0 -> true);
   }

   public Set<bum> c(Predicate<cwb> $$0) {
      Set<bum> $$1 = new HashSet<>();

      for (bum $$2 : bum.i) {
         cwb $$3 = this.a($$2);
         if (!$$3.f()) {
            if (!$$0.test($$3)) {
               $$1.add($$2);
            } else {
               double $$4 = (double)this.h($$2);
               if ($$4 > 1.0) {
                  this.a($$2, cwb.k);
                  this.b($$3);
               }
            }
         }
      }

      return $$1;
   }

   private euf a(arn $$0) {
      return new euf.a($$0).a(ewy.f, this.dv()).a(ewy.a, this).a(ewx.h);
   }

   public void a(buo $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(alh<euh> $$0, Map<bum, Float> $$1) {
      if (this.dX() instanceof arn $$2) {
         this.a($$0, this.a($$2), $$1);
      }
   }

   protected void a(azs $$0, bsb $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dX().ak() == bsa.d ? 0.1F : 0.25F;
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

         for (bum $$5 : bY) {
            cwb $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               cvx $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new cwb($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static cvx a(bum $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cwf.pz;
            } else if ($$1 == 1) {
               return cwf.pP;
            } else if ($$1 == 2) {
               return cwf.pD;
            } else if ($$1 == 3) {
               return cwf.pH;
            } else if ($$1 == 4) {
               return cwf.pL;
            }
         case e:
            if ($$1 == 0) {
               return cwf.pA;
            } else if ($$1 == 1) {
               return cwf.pQ;
            } else if ($$1 == 2) {
               return cwf.pE;
            } else if ($$1 == 3) {
               return cwf.pI;
            } else if ($$1 == 4) {
               return cwf.pM;
            }
         case d:
            if ($$1 == 0) {
               return cwf.pB;
            } else if ($$1 == 1) {
               return cwf.pR;
            } else if ($$1 == 2) {
               return cwf.pF;
            } else if ($$1 == 3) {
               return cwf.pJ;
            } else if ($$1 == 4) {
               return cwf.pN;
            }
         case c:
            if ($$1 == 0) {
               return cwf.pC;
            } else if ($$1 == 1) {
               return cwf.pS;
            } else if ($$1 == 2) {
               return cwf.pG;
            } else if ($$1 == 3) {
               return cwf.pK;
            } else if ($$1 == 4) {
               return cwf.pO;
            }
         default:
            return null;
      }
   }

   protected void a(dfr $$0, azs $$1, bsb $$2) {
      this.b($$0, $$1, $$2);

      for (bum $$3 : bum.i) {
         if ($$3.a() == bum.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dfr $$0, azs $$1, bsb $$2) {
      this.a($$0, bum.a, $$1, 0.25F, $$2);
   }

   protected void a(dfr $$0, azs $$1, bum $$2, bsb $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dfr $$0, bum $$1, azs $$2, float $$3, bsb $$4) {
      cwb $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         dbu.a($$5, $$0.H_(), ddg.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      azs $$4 = $$0.E_();
      bwe $$5 = Objects.requireNonNull(this.g(bwi.m));
      if (!$$5.b(bL)) {
         $$5.d(new bwg(bL, $$4.a(0.0, 0.11485000000000001), bwg.a.b));
      }

      this.v($$4.i() < 0.05F);
      return $$3;
   }

   public void ga() {
      this.ch = true;
   }

   @Override
   public void a(bum $$0, float $$1) {
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
   public boolean fP() {
      return this.cg;
   }

   public void a_(boolean $$0) {
      this.cg = $$0;
   }

   @Override
   protected boolean f(bum $$0) {
      return this.fP();
   }

   public boolean gb() {
      return this.ch;
   }

   @Override
   public final bsd a(com $$0, bsc $$1) {
      if (!this.bM()) {
         return bsd.e;
      } else {
         bsd $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(eag.r, $$0);
            return $$2;
         } else {
            bsd $$3 = super.a($$0, $$1);
            if ($$3 != bsd.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(eag.r, $$0);
                  return $$2;
               } else {
                  return bsd.e;
               }
            }
         }
      }
   }

   private bsd c(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if ($$2.a(cwf.uN)) {
         bsd $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof cxk) {
         if (this.dX() instanceof arn) {
            cxk $$4 = (cxk)$$2.h();
            Optional<bvc> $$5 = $$4.a($$0, this, (bul<? extends bvc>)this.ar(), (arn)this.dX(), this.dv(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return bsd.e;
            }
         }

         return bsd.b;
      } else {
         return bsd.e;
      }
   }

   protected void a(com $$0, bvc $$1) {
   }

   protected bsd b(com $$0, bsc $$1) {
      return bsd.e;
   }

   public boolean gc() {
      return this.a(this.dx());
   }

   public boolean a(jh $$0) {
      return this.cn == -1.0F ? true : this.cm.j($$0) < (double)(this.cn * this.cn);
   }

   public void a(jh $$0, int $$1) {
      this.cm = $$0;
      this.cn = (float)$$1;
   }

   public jh gd() {
      return this.cm;
   }

   public float ge() {
      return this.cn;
   }

   public void gf() {
      this.cn = -1.0F;
   }

   public boolean gg() {
      return this.cn != -1.0F;
   }

   @Nullable
   public <T extends bvc> T a(bul<T> $$0, btz $$1, buk $$2, btz.a<T> $$3) {
      if (this.dS()) {
         return null;
      } else {
         T $$4 = (T)$$0.a(this.dX(), $$2);
         if ($$4 == null) {
            return null;
         } else {
            $$1.a().a(this, $$4, $$1);
            $$3.finalizeConversion($$4);
            if (this.dX() instanceof arn $$5) {
               $$5.b($$4);
            }

            if ($$1.a().a()) {
               this.av();
            }

            return $$4;
         }
      }
   }

   @Nullable
   public <T extends bvc> T a(bul<T> $$0, btz $$1, btz.a<T> $$2) {
      return this.a($$0, $$1, buk.i, $$2);
   }

   @Nullable
   @Override
   public buy.a Y_() {
      return this.cl;
   }

   @Override
   public void a(@Nullable buy.a $$0) {
      this.cl = $$0;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      buy.super.a($$0, $$1);
      if (this.Y_() == null) {
         this.gf();
      }
   }

   @Override
   public void B() {
      buy.super.B();
      this.bS.a(cby.a.a);
   }

   @Override
   public boolean A() {
      return !(this instanceof clj);
   }

   @Override
   public boolean a(bue $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.M_()) {
         this.a(true, true);
      }

      return $$2;
   }

   @Override
   public boolean dk() {
      return super.dk() && !this.gh();
   }

   public void u(boolean $$0) {
      byte $$1 = this.am.a(b);
      this.am.a(b, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void v(boolean $$0) {
      byte $$1 = this.am.a(b);
      this.am.a(b, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void w(boolean $$0) {
      byte $$1 = this.am.a(b);
      this.am.a(b, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean gh() {
      return (this.am.a(b) & 1) != 0;
   }

   public boolean gi() {
      return (this.am.a(b) & 2) != 0;
   }

   public boolean gj() {
      return (this.am.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public buu fA() {
      return this.gi() ? buu.a : buu.b;
   }

   public boolean i(bva $$0) {
      return this.gk().c($$0.eO());
   }

   protected ezi gk() {
      bue $$0 = this.dl();
      ezi $$3;
      if ($$0 != null) {
         ezi $$1 = $$0.cS();
         ezi $$2 = this.cS();
         $$3 = new ezi(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cS();
      }

      return $$3.c(bZ, 0.0, bZ);
   }

   @Override
   public boolean E(bue $$0) {
      float $$1 = (float)this.h(bwi.c);
      cwb $$2 = this.eb();
      bsu $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dY().b((bva)this));
      if (this.dX() instanceof arn $$4) {
         $$1 = dbu.a($$4, $$2, $$0, $$3, $$1);
      }

      $$1 += $$2.h().a($$0, $$1, $$3);
      boolean $$5 = $$0.a($$3, $$1);
      if ($$5) {
         float $$6 = this.a($$0, $$3);
         if ($$6 > 0.0F && $$0 instanceof bva $$7) {
            $$7.p((double)($$6 * 0.5F), (double)azk.a(this.dN() * (float) (Math.PI / 180.0)), (double)(-azk.b(this.dN() * (float) (Math.PI / 180.0))));
            this.h(this.dA().d(0.6, 1.0, 0.6));
         }

         if (this.dX() instanceof arn $$8) {
            if ($$0 instanceof bva $$9) {
               $$2.a($$9, this);
            }

            dbu.a($$8, $$0, $$3);
         }

         this.B($$0);
         this.gl();
      }

      return $$5;
   }

   protected void gl() {
   }

   protected boolean gm() {
      if (this.dX().S() && !this.dX().C) {
         float $$0 = this.bz();
         jh $$1 = jh.a(this.dC(), this.dG(), this.dI());
         boolean $$2 = this.bm() || this.aw || this.ax;
         if ($$0 > 0.5F && this.af.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dX().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(axq<erj> $$0) {
      if (this.P().q()) {
         super.c($$0);
      } else {
         this.h(this.dA().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gn() {
      this.d($$0 -> true);
      this.ed().h();
   }

   public void d(Predicate<cby> $$0) {
      this.bS.a($$0);
   }

   @Override
   protected void cE() {
      super.cE();
      this.fg().forEach($$0 -> {
         if (!$$0.f()) {
            $$0.e(0);
         }
      });
   }

   @Nullable
   @Override
   public cwb dK() {
      cxk $$0 = cxk.a(this.ar());
      return $$0 == null ? null : new cwb($$0);
   }

   @Override
   protected void f(jq<bwd> $$0) {
      super.f($$0);
      if ($$0.a(bwi.m) || $$0.a(bwi.E)) {
         this.P().g();
      }
   }

   @VisibleForTesting
   public float[] go() {
      return this.bU;
   }

   @VisibleForTesting
   public float[] gp() {
      return this.bV;
   }
}

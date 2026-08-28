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

public abstract class btd extends btb implements bsq, btz {
   private static final ajp<Byte> b = ajt.a(btd.class, ajr.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final ke bZ = new ke(1, 0, 1);
   public static final float g = 0.15F;
   public static final float bH = 0.55F;
   public static final float bI = 0.5F;
   public static final float bJ = 0.25F;
   public static final String bK = "leash";
   public static final float bL = 0.085F;
   public static final int bM = 2;
   public static final int bN = 2;
   private static final double ca = Math.sqrt(2.04F) - 0.6F;
   public int bO;
   protected int bP;
   protected bzb bQ;
   protected bzc bR;
   protected bza bS;
   private final byx cb;
   protected ccn bT;
   protected final caa bU;
   protected final caa bV;
   @Nullable
   private btb cc;
   private final cdk cd;
   private final js<cuc> ce = js.a(2, cuc.l);
   protected final float[] bW = new float[2];
   private final js<cuc> cf = js.a(4, cuc.l);
   protected final float[] bX = new float[4];
   private cuc cg = cuc.l;
   protected float bY;
   private boolean ch;
   private boolean ci;
   private final Map<eoy, Float> cj = Maps.newEnumMap(eoy.class);
   @Nullable
   private akj<eqz> ck;
   private long cl;
   @Nullable
   private bsg cm;
   private int cn;
   @Nullable
   private Either<UUID, ja> co;
   private ja cp = ja.c;
   private float cq = -1.0F;

   protected btd(bsm<? extends btd> $$0, dcf $$1) {
      super($$0, $$1);
      this.bU = new caa($$1.ah());
      this.bV = new caa($$1.ah());
      this.bQ = new bzb(this);
      this.bR = new bzc(this);
      this.bS = new bza(this);
      this.cb = this.E();
      this.bT = this.b($$1);
      this.cd = new cdk(this);
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

   public static bui.a A() {
      return btb.dW().a(buj.m, 16.0);
   }

   protected ccn b(dcf $$0) {
      return new ccm(this, $$0);
   }

   protected boolean B() {
      return false;
   }

   public float a(eoy $$0) {
      btd $$2;
      label17: {
         if (this.de() instanceof btd $$1 && $$1.B()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cj.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(eoy $$0, float $$1) {
      this.cj.put($$0, $$1);
   }

   @Override
   public void C() {
   }

   @Override
   public void D() {
   }

   protected byx E() {
      return new byx(this);
   }

   public bzb G() {
      return this.bQ;
   }

   public bzc H() {
      return this.de() instanceof btd $$0 ? $$0.H() : this.bR;
   }

   public bza I() {
      return this.bS;
   }

   public ccn K() {
      return this.de() instanceof btd $$0 ? $$0.K() : this.bT;
   }

   @Nullable
   @Override
   public btb cR() {
      bsg $$0 = this.cU();
      if (!this.gd() && $$0 instanceof btd $$1 && $$0.bV()) {
         return $$1;
      }

      return null;
   }

   public cdk M() {
      return this.cd;
   }

   @Nullable
   @Override
   public btb p() {
      return this.cc;
   }

   @Nullable
   protected final btb N() {
      return this.dU().c(ccf.o).orElse(null);
   }

   public void h(@Nullable btb $$0) {
      this.cc = $$0;
   }

   @Override
   public boolean a(bsm<?> $$0) {
      return $$0 != bsm.T;
   }

   public boolean a(cuv $$0) {
      return false;
   }

   public void O() {
      this.a(dxg.m);
   }

   @Override
   protected void a(ajt.a $$0) {
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
   public void av() {
      super.av();
      this.dQ().ag().a("mobBaseTick");
      if (this.bE() && this.ah.a(1000) < this.bO++) {
         this.s();
         this.Q();
      }

      this.dQ().ag().c();
   }

   @Override
   protected void e(bqz $$0) {
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
            this.dQ().a(lj.ab, this.c(1.0) - $$1 * 10.0, this.dy() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
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
         this.fZ();
         if (this.ai % 5 == 0) {
            this.S();
         }
      }
   }

   protected void S() {
      boolean $$0 = !(this.cR() instanceof btd);
      boolean $$1 = !(this.dd() instanceof coh);
      this.bU.a(bzz.a.a, $$0);
      this.bU.a(bzz.a.c, $$0 && $$1);
      this.bU.a(bzz.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.cb.a();
      return $$1;
   }

   @Nullable
   protected avg v() {
      return null;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fS());
      $$0.a("PersistenceRequired", this.ci);
      ud $$1 = new ud();

      for (cuc $$2 : this.cf) {
         if (!$$2.e()) {
            $$1.add($$2.a(this.dS()));
         } else {
            $$1.add(new tx());
         }
      }

      $$0.a("ArmorItems", $$1);
      ud $$3 = new ud();

      for (float $$4 : this.bX) {
         $$3.add(ua.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      ud $$5 = new ud();

      for (cuc $$6 : this.ce) {
         if (!$$6.e()) {
            $$5.add($$6.a(this.dS()));
         } else {
            $$5.add(new tx());
         }
      }

      $$0.a("HandItems", $$5);
      ud $$7 = new ud();

      for (float $$8 : this.bW) {
         $$7.add(ua.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.cg.e()) {
         $$0.a("body_armor_item", this.cg.a(this.dS()));
         $$0.a("body_armor_drop_chance", this.bY);
      }

      Either<UUID, ja> $$9 = this.co;
      if (this.cm instanceof btb) {
         $$9 = Either.left(this.cm.cA());
      } else if (this.cm instanceof cio $$10) {
         $$9 = Either.right($$10.u());
      }

      if ($$9 != null) {
         $$0.a("leash", (uu)$$9.map($$0x -> {
            tx $$1x = new tx();
            $$1x.a("UUID", $$0x);
            return $$1x;
         }, um::a));
      }

      $$0.a("LeftHanded", this.ge());
      if (this.ck != null) {
         $$0.a("DeathLootTable", this.ck.a().toString());
         if (this.cl != 0L) {
            $$0.a("DeathLootTableSeed", this.cl);
         }
      }

      if (this.gd()) {
         $$0.a("NoAI", this.gd());
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.ci = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         ud $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cf.size(); $$2++) {
            tx $$3 = $$1.a($$2);
            this.cf.set($$2, cuc.a(this.dS(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         ud $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bX[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         ud $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.ce.size(); $$7++) {
            tx $$8 = $$6.a($$7);
            this.ce.set($$7, cuc.a(this.dS(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         ud $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bW[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cg = cuc.a(this.dS(), (uu)$$0.p("body_armor_item")).orElse(cuc.l);
         this.bY = $$0.j("body_armor_drop_chance");
      } else {
         this.cg = cuc.l;
      }

      if ($$0.b("leash", 10)) {
         this.co = Either.left($$0.p("leash").a("UUID"));
      } else if ($$0.b("leash", 11)) {
         this.co = um.a($$0, "leash").<Either<UUID, ja>>map(Either::right).orElse(null);
      } else {
         this.co = null;
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.ck = akj.a(lr.bb, new akk($$0.l("DeathLootTable")));
         this.cl = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void b(bqz $$0, boolean $$1) {
      super.b($$0, $$1);
      this.ck = null;
   }

   @Override
   public final akj<eqz> eB() {
      return this.ck == null ? this.T() : this.ck;
   }

   protected akj<eqz> T() {
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
      this.K().n();
      this.F(0.0F);
      this.E(0.0F);
      this.z(0.0F);
   }

   @Override
   public void n_() {
      super.n_();
      this.dQ().ag().a("looting");
      if (!this.dQ().B && this.fS() && this.bE() && !this.be && this.dQ().ab().b(dcb.c)) {
         ke $$0 = this.V();

         for (ciu $$2 : this.dQ().a(ciu.class, this.cL().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dL() && !$$2.p().e() && !$$2.y() && this.k($$2.p())) {
               this.b($$2);
            }
         }
      }

      this.dQ().ag().c();
   }

   protected ke V() {
      return bZ;
   }

   protected void b(ciu $$0) {
      cuc $$1 = $$0.p();
      cuc $$2 = this.i($$1.s());
      if (!$$2.e()) {
         this.a($$0);
         this.a($$0, $$2.H());
         $$1.h($$2.H());
         if ($$1.e()) {
            $$0.ap();
         }
      }
   }

   public cuc i(cuc $$0) {
      bsn $$1 = h($$0);
      cuc $$2 = this.a($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bsn.a;
         $$2 = this.a($$1);
         $$3 = $$2.e();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.g($$1);
         if (!$$2.e() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.H() > 1) {
            cuc $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return cuc.l;
      }
   }

   @Override
   protected void b(bsn $$0, cuc $$1) {
      this.a($$0, $$1);
      this.f($$0);
      this.ci = true;
   }

   public void f(bsn $$0) {
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

   protected boolean b(cuc $$0, cuc $$1) {
      if ($$1.e()) {
         return true;
      } else if ($$0.g() instanceof cvp) {
         if (!($$1.g() instanceof cvp)) {
            return true;
         } else {
            double $$2 = this.o($$0);
            double $$3 = this.o($$1);
            return $$2 != $$3 ? $$2 > $$3 : this.c($$0, $$1);
         }
      } else if ($$0.g() instanceof csg && $$1.g() instanceof csg) {
         return this.c($$0, $$1);
      } else if ($$0.g() instanceof csp && $$1.g() instanceof csp) {
         return this.c($$0, $$1);
      } else if ($$0.g() instanceof crs $$4) {
         if (czn.a($$1, czm.E)) {
            return false;
         } else if (!($$1.g() instanceof crs)) {
            return true;
         } else {
            crs $$5 = (crs)$$1.g();
            if ($$4.k() != $$5.k()) {
               return $$4.k() > $$5.k();
            } else {
               return $$4.l() != $$5.l() ? $$4.l() > $$5.l() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.g() instanceof csr) {
            if ($$1.g() instanceof csb) {
               return true;
            }

            if ($$1.g() instanceof csr) {
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

   private double o(cuc $$0) {
      cww $$1 = $$0.a(kn.n, cww.a);
      return $$1.a(this.h(buj.c), bsn.a);
   }

   public boolean c(cuc $$0, cuc $$1) {
      return $$0.n() < $$1.n() ? true : p($$0) && !p($$1);
   }

   private static boolean p(cuc $$0) {
      kj $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(kn.e);
   }

   public boolean j(cuc $$0) {
      return true;
   }

   public boolean k(cuc $$0) {
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
      if (this.dQ().al() == bqd.a && this.X()) {
         this.ap();
      } else if (!this.fT() && !this.W()) {
         bsg $$0 = this.dQ().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.al().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.ap();
            }

            int $$4 = this.al().f().g();
            int $$5 = $$4 * $$4;
            if (this.bf > 600 && this.ah.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.ap();
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
      bmu $$0 = this.dQ().ag();
      $$0.a("sensing");
      this.cd.a();
      $$0.c();
      int $$1 = this.ai + this.am();
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
      afy.a(this.dQ(), this, this.bU);
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
      float $$1 = this.ct();
      float $$2 = ayg.g(this.aY - $$1);
      float $$3 = ayg.a(ayg.g(this.aY - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.o($$4);
   }

   public int ae() {
      return 10;
   }

   public void a(bsg $$0, float $$1, float $$2) {
      double $$3 = $$0.dv() - this.dv();
      double $$4 = $$0.dB() - this.dB();
      double $$6;
      if ($$0 instanceof btb $$5) {
         $$6 = $$5.dz() - this.dz();
      } else {
         $$6 = ($$0.cL().b + $$0.cL().e) / 2.0 - this.dz();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(ayg.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(ayg.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.t(this.a(this.dI(), $$10, $$2));
      this.s(this.a(this.dG(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ayg.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bsm<? extends btd> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      ja $$5 = $$3.d();
      return $$2 == btf.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dcg $$0, btf $$1) {
      return true;
   }

   public boolean a(dci $$0) {
      return !$$0.d(this.cL()) && $$0.f(this);
   }

   public int fN() {
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
   public Iterable<cuc> eX() {
      return this.ce;
   }

   @Override
   public Iterable<cuc> eW() {
      return this.cf;
   }

   public cuc fO() {
      return this.cg;
   }

   public boolean fP() {
      return false;
   }

   @Override
   public boolean d(bsn $$0) {
      return true;
   }

   public boolean fQ() {
      return !this.a(bsn.g).e();
   }

   public boolean l(cuc $$0) {
      return false;
   }

   public void m(cuc $$0) {
      this.b(bsn.g, $$0);
   }

   @Override
   public Iterable<cuc> eY() {
      return (Iterable<cuc>)(this.cg.e() ? this.cf : Iterables.concat(this.cf, List.of(this.cg)));
   }

   @Override
   public cuc a(bsn $$0) {
      return switch ($$0.a()) {
         case a -> (cuc)this.ce.get($$0.b());
         case b -> (cuc)this.cf.get($$0.b());
         case c -> this.cg;
      };
   }

   @Override
   public void a(bsn $$0, cuc $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cf.set($$0.b(), $$1), $$1);
            break;
         case c:
            cuc $$2 = this.cg;
            this.cg = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(bqz $$0, boolean $$1) {
      super.a($$0, $$1);

      for (bsn $$2 : bsn.values()) {
         cuc $$3 = this.a($$2);
         float $$4 = this.g($$2);
         if ($$4 != 0.0F) {
            boolean $$5 = $$4 > 1.0F;
            bsg var12 = $$0.d();
            if (var12 instanceof btb) {
               btb $$6 = (btb)var12;
               if (this.dQ() instanceof aqm $$7) {
                  $$4 = czn.a($$7, $$6, $$0, $$4);
               }
            }

            if (!$$3.e() && !czn.a($$3, czm.D) && ($$1 || $$5) && this.ah.i() < $$4) {
               if (!$$5 && $$3.l()) {
                  $$3.b($$3.o() - this.ah.a(1 + this.ah.a(Math.max($$3.o() - 3, 1))));
               }

               this.b($$3);
               this.a($$2, cuc.l);
            }
         }
      }
   }

   protected float g(bsn $$0) {
      return switch ($$0.a()) {
         case a -> this.bW[$$0.b()];
         case b -> this.bX[$$0.b()];
         case c -> this.bY;
      };
   }

   private eqx c(aqm $$0) {
      return new eqx.a($$0).a(etq.f, this.do()).a(etq.a, this).a(etp.h);
   }

   public void a(bsp $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(akj<eqz> $$0, Map<bsn, Float> $$1) {
      if (this.dQ() instanceof aqm $$2) {
         this.a($$0, this.c($$2), $$1);
      }
   }

   protected void a(ayo $$0, bqe $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dQ().al() == bqd.d ? 0.1F : 0.25F;
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

         for (bsn $$5 : bsn.values()) {
            if ($$5.a() == bsn.a.b) {
               cuc $$6 = this.a($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.e()) {
                  ctx $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cuc($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static ctx a(bsn $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cuf.py;
            } else if ($$1 == 1) {
               return cuf.pO;
            } else if ($$1 == 2) {
               return cuf.pC;
            } else if ($$1 == 3) {
               return cuf.pG;
            } else if ($$1 == 4) {
               return cuf.pK;
            }
         case e:
            if ($$1 == 0) {
               return cuf.pz;
            } else if ($$1 == 1) {
               return cuf.pP;
            } else if ($$1 == 2) {
               return cuf.pD;
            } else if ($$1 == 3) {
               return cuf.pH;
            } else if ($$1 == 4) {
               return cuf.pL;
            }
         case d:
            if ($$1 == 0) {
               return cuf.pA;
            } else if ($$1 == 1) {
               return cuf.pQ;
            } else if ($$1 == 2) {
               return cuf.pE;
            } else if ($$1 == 3) {
               return cuf.pI;
            } else if ($$1 == 4) {
               return cuf.pM;
            }
         case c:
            if ($$1 == 0) {
               return cuf.pB;
            } else if ($$1 == 1) {
               return cuf.pR;
            } else if ($$1 == 2) {
               return cuf.pF;
            } else if ($$1 == 3) {
               return cuf.pJ;
            } else if ($$1 == 4) {
               return cuf.pN;
            }
         default:
            return null;
      }
   }

   protected void b(ayo $$0, bqe $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bsn $$3 : bsn.values()) {
         if ($$3.a() == bsn.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(ayo $$0, float $$1) {
      this.a(bsn.a, $$0, 0.25F, $$1);
   }

   protected void a(ayo $$0, float $$1, bsn $$2) {
      this.a($$2, $$0, 0.5F, $$1);
   }

   private void a(bsn $$0, ayo $$1, float $$2, float $$3) {
      cuc $$4 = this.a($$0);
      if (!$$4.e() && $$1.i() < $$2 * $$3) {
         czn.a($$4, day.a, this.dQ(), this.dq(), $$1);
         this.a($$0, $$4);
      }
   }

   @Nullable
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      ayo $$4 = $$0.E_();
      this.f(buj.m).d(new buh("Random spawn bonus", $$4.a(0.0, 0.11485000000000001), buh.a.b));
      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fR() {
      this.ci = true;
   }

   @Override
   public void a(bsn $$0, float $$1) {
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

   public boolean fS() {
      return this.ch;
   }

   public void a_(boolean $$0) {
      this.ch = $$0;
   }

   @Override
   public boolean f(cuc $$0) {
      bsn $$1 = h($$0);
      return this.a($$1).e() && this.fS();
   }

   public boolean fT() {
      return this.ci;
   }

   @Override
   public final bqg a(cmk $$0, bqf $$1) {
      if (!this.bE()) {
         return bqg.e;
      } else if (this.gc() == $$0) {
         this.a(true, !$$0.fM());
         this.a(dxg.r, $$0);
         return bqg.a(this.dQ().B);
      } else {
         bqg $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dxg.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dxg.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bqg c(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if ($$2.a(cuf.uK) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bqg.a(this.dQ().B);
      } else {
         if ($$2.a(cuf.uL)) {
            bqg $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.g() instanceof cvj) {
            if (this.dQ() instanceof aqm) {
               cvj $$4 = (cvj)$$2.g();
               Optional<btd> $$5 = $$4.a($$0, this, (bsm<? extends btd>)this.al(), (aqm)this.dQ(), this.do(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bqg.a : bqg.e;
            } else {
               return bqg.c;
            }
         } else {
            return bqg.e;
         }
      }
   }

   protected void a(cmk $$0, btd $$1) {
   }

   protected bqg b(cmk $$0, bqf $$1) {
      return bqg.e;
   }

   public boolean fU() {
      return this.a(this.dq());
   }

   public boolean a(ja $$0) {
      return this.cq == -1.0F ? true : this.cp.j($$0) < (double)(this.cq * this.cq);
   }

   public void a(ja $$0, int $$1) {
      this.cp = $$0;
      this.cq = (float)$$1;
   }

   public ja fV() {
      return this.cp;
   }

   public float fW() {
      return this.cq;
   }

   public void fX() {
      this.cq = -1.0F;
   }

   public boolean fY() {
      return this.cq != -1.0F;
   }

   @Nullable
   public <T extends btd> T a(bsm<T> $$0, boolean $$1) {
      if (this.dL()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dQ());
         if ($$2 == null) {
            return null;
         } else {
            $$2.v(this);
            $$2.a(this.p_());
            $$2.t(this.gd());
            if (this.ah()) {
               $$2.b(this.ai());
               $$2.o(this.cF());
            }

            if (this.fT()) {
               $$2.fR();
            }

            $$2.n(this.cv());
            if ($$1) {
               $$2.a_(this.fS());

               for (bsn $$3 : bsn.values()) {
                  cuc $$4 = this.a($$3);
                  if (!$$4.e()) {
                     $$2.a($$3, $$4.f());
                     $$2.a($$3, this.g($$3));
                  }
               }
            }

            this.dQ().b($$2);
            if (this.bS()) {
               bsg $$5 = this.dd();
               this.ac();
               $$2.a($$5, true);
            }

            this.ap();
            return $$2;
         }
      }
   }

   protected void fZ() {
      if (this.co != null) {
         this.gk();
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
         this.fX();
         if (!this.dQ().B && $$1) {
            this.a(cuf.uK);
         }

         if (!this.dQ().B && $$0 && this.dQ() instanceof aqm) {
            ((aqm)this.dQ()).l().b(this, new aet(this, null));
         }
      }
   }

   public boolean a(cmk $$0) {
      return !this.ga() && !(this instanceof cji);
   }

   public boolean ga() {
      return this.cm != null;
   }

   public boolean gb() {
      return this.ga() || this.co != null;
   }

   @Nullable
   public bsg gc() {
      if (this.cm == null && this.cn != 0 && this.dQ().B) {
         this.cm = this.dQ().a(this.cn);
      }

      return this.cm;
   }

   public void b(bsg $$0, boolean $$1) {
      this.cm = $$0;
      this.co = null;
      if (!this.dQ().B && $$1 && this.dQ() instanceof aqm) {
         ((aqm)this.dQ()).l().b(this, new aet(this, this.cm));
      }

      if (this.bS()) {
         this.ac();
      }
   }

   public void r(int $$0) {
      this.cn = $$0;
      this.a(false, false);
   }

   @Override
   public boolean a(bsg $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.ga()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gk() {
      if (this.co != null && this.dQ() instanceof aqm $$0) {
         Optional<UUID> $$1 = this.co.left();
         Optional<ja> $$2 = this.co.right();
         if ($$1.isPresent()) {
            bsg $$3 = $$0.a($$1.get());
            if ($$3 != null) {
               this.b($$3, true);
               return;
            }
         } else if ($$2.isPresent()) {
            this.b(cio.b(this.dQ(), $$2.get()), true);
            return;
         }

         if (this.ai > 100) {
            this.a(cuf.uK);
            this.co = null;
         }
      }
   }

   @Override
   public boolean dc() {
      return super.dc() && !this.gd();
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

   public boolean gd() {
      return (this.ao.a(b) & 1) != 0;
   }

   public boolean ge() {
      return (this.ao.a(b) & 2) != 0;
   }

   public boolean gf() {
      return (this.ao.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bsv fr() {
      return this.ge() ? bsv.a : bsv.b;
   }

   public boolean i(btb $$0) {
      return this.gg().c($$0.eG());
   }

   protected ewa gg() {
      bsg $$0 = this.dd();
      ewa $$3;
      if ($$0 != null) {
         ewa $$1 = $$0.cL();
         ewa $$2 = this.cL();
         $$3 = new ewa(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cL();
      }

      return $$3.c(ca, 0.0, ca);
   }

   @Override
   public boolean D(bsg $$0) {
      float $$1 = (float)this.g(buj.c);
      bqz $$2 = this.dR().b((btb)this);
      if (this.dQ() instanceof aqm $$3) {
         $$1 = czn.a($$3, this.eU(), $$0, $$2, $$1);
      }

      boolean $$4 = $$0.a($$2, $$1);
      if ($$4) {
         float $$5 = this.a($$0, $$2);
         if ($$5 > 0.0F && $$0 instanceof btb $$6) {
            $$6.q((double)($$5 * 0.5F), (double)ayg.a(this.dG() * (float) (Math.PI / 180.0)), (double)(-ayg.b(this.dG() * (float) (Math.PI / 180.0))));
            this.i(this.dt().d(0.6, 1.0, 0.6));
         }

         if (this.dQ() instanceof aqm $$7) {
            czn.a($$7, $$0, $$2);
         }

         this.A($$0);
         this.gh();
      }

      return $$4;
   }

   protected void gh() {
   }

   protected boolean gi() {
      if (this.dQ().R() && !this.dQ().B) {
         float $$0 = this.bu();
         ja $$1 = ja.a(this.dv(), this.dz(), this.dB());
         boolean $$2 = this.bh() || this.aB || this.aC;
         if ($$0 > 0.5F && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dQ().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(awm<eog> $$0) {
      if (this.K().p()) {
         super.c($$0);
      } else {
         this.i(this.dt().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gj() {
      this.c($$0 -> true);
      this.dU().h();
   }

   public void c(Predicate<bzz> $$0) {
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
   public cuc dD() {
      cvj $$0 = cvj.a(this.al());
      return $$0 == null ? null : new cuc($$0);
   }
}

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

public abstract class bte extends btc implements bsr, bua {
   private static final ajp<Byte> b = ajt.a(bte.class, ajr.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final ke bZ = new ke(1, 0, 1);
   public static final float g = 0.15F;
   public static final float h = 0.55F;
   public static final float bI = 0.5F;
   public static final float bJ = 0.25F;
   public static final String bK = "leash";
   public static final float bL = 0.085F;
   public static final int bM = 2;
   public static final int bN = 2;
   private static final double ca = Math.sqrt(2.04F) - 0.6F;
   public int bO;
   protected int bP;
   protected bzc bQ;
   protected bzd bR;
   protected bzb bS;
   private final byy cb;
   protected cco bT;
   protected final cab bU;
   protected final cab bV;
   @Nullable
   private btc cc;
   private final cdl cd;
   private final js<cud> ce = js.a(2, cud.l);
   protected final float[] bW = new float[2];
   private final js<cud> cf = js.a(4, cud.l);
   protected final float[] bX = new float[4];
   private cud cg = cud.l;
   protected float bY;
   private boolean ch;
   private boolean ci;
   private final Map<epa, Float> cj = Maps.newEnumMap(epa.class);
   @Nullable
   private akj<erb> ck;
   private long cl;
   @Nullable
   private bsh cm;
   private int cn;
   @Nullable
   private Either<UUID, ja> co;
   private ja cp = ja.c;
   private float cq = -1.0F;

   protected bte(bsn<? extends bte> $$0, dcg $$1) {
      super($$0, $$1);
      this.bU = new cab($$1.ah());
      this.bV = new cab($$1.ah());
      this.bQ = new bzc(this);
      this.bR = new bzd(this);
      this.bS = new bzb(this);
      this.cb = this.E();
      this.bT = this.b($$1);
      this.cd = new cdl(this);
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

   public static buj.a A() {
      return btc.dX().a(buk.m, 16.0);
   }

   protected cco b(dcg $$0) {
      return new ccn(this, $$0);
   }

   protected boolean B() {
      return false;
   }

   public float a(epa $$0) {
      bte $$2;
      label17: {
         if (this.df() instanceof bte $$1 && $$1.B()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cj.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(epa $$0, float $$1) {
      this.cj.put($$0, $$1);
   }

   @Override
   public void C() {
   }

   @Override
   public void D() {
   }

   protected byy E() {
      return new byy(this);
   }

   public bzc F() {
      return this.bQ;
   }

   public bzd H() {
      return this.df() instanceof bte $$0 ? $$0.H() : this.bR;
   }

   public bzb I() {
      return this.bS;
   }

   public cco J() {
      return this.df() instanceof bte $$0 ? $$0.J() : this.bT;
   }

   @Nullable
   @Override
   public btc cS() {
      bsh $$0 = this.cV();
      if (!this.gc() && $$0 instanceof bte $$1 && $$0.bW()) {
         return $$1;
      }

      return null;
   }

   public cdl L() {
      return this.cd;
   }

   @Nullable
   @Override
   public btc p() {
      return this.cc;
   }

   @Nullable
   protected final btc N() {
      return this.dV().c(ccg.o).orElse(null);
   }

   public void h(@Nullable btc $$0) {
      this.cc = $$0;
   }

   @Override
   public boolean a(bsn<?> $$0) {
      return $$0 != bsn.T;
   }

   public boolean a(cuw $$0) {
      return false;
   }

   public void O() {
      this.a(dxh.m);
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
   public void aw() {
      super.aw();
      this.dR().ag().a("mobBaseTick");
      if (this.bF() && this.ah.a(1000) < this.bO++) {
         this.s();
         this.Q();
      }

      this.dR().ag().c();
   }

   @Override
   protected void e(bra $$0) {
      this.s();
      super.e($$0);
   }

   private void s() {
      this.bO = -this.P();
   }

   @Override
   protected int ei() {
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
      if (this.dR().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.ah.k() * 0.02;
            double $$2 = this.ah.k() * 0.02;
            double $$3 = this.ah.k() * 0.02;
            double $$4 = 10.0;
            this.dR().a(lj.ab, this.c(1.0) - $$1 * 10.0, this.dz() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dR().a(this, (byte)20);
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
      if (!this.dR().B) {
         this.fY();
         if (this.ai % 5 == 0) {
            this.S();
         }
      }
   }

   protected void S() {
      boolean $$0 = !(this.cS() instanceof bte);
      boolean $$1 = !(this.de() instanceof coi);
      this.bU.a(caa.a.a, $$0);
      this.bU.a(caa.a.c, $$0 && $$1);
      this.bU.a(caa.a.b, $$0);
   }

   @Override
   protected float f(float $$0, float $$1) {
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
      $$0.a("CanPickUpLoot", this.fR());
      $$0.a("PersistenceRequired", this.ci);
      ud $$1 = new ud();

      for (cud $$2 : this.cf) {
         if (!$$2.e()) {
            $$1.add($$2.a(this.dT()));
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

      for (cud $$6 : this.ce) {
         if (!$$6.e()) {
            $$5.add($$6.a(this.dT()));
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
         $$0.a("body_armor_item", this.cg.a(this.dT()));
         $$0.a("body_armor_drop_chance", this.bY);
      }

      Either<UUID, ja> $$9 = this.co;
      if (this.cm instanceof btc) {
         $$9 = Either.left(this.cm.cB());
      } else if (this.cm instanceof cip $$10) {
         $$9 = Either.right($$10.t());
      }

      if ($$9 != null) {
         $$0.a("leash", (uu)$$9.map($$0x -> {
            tx $$1x = new tx();
            $$1x.a("UUID", $$0x);
            return $$1x;
         }, um::a));
      }

      $$0.a("LeftHanded", this.gd());
      if (this.ck != null) {
         $$0.a("DeathLootTable", this.ck.a().toString());
         if (this.cl != 0L) {
            $$0.a("DeathLootTableSeed", this.cl);
         }
      }

      if (this.gc()) {
         $$0.a("NoAI", this.gc());
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
            this.cf.set($$2, cud.a(this.dT(), $$3));
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
            this.ce.set($$7, cud.a(this.dT(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         ud $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bW[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cg = cud.a(this.dT(), (uu)$$0.p("body_armor_item")).orElse(cud.l);
         this.bY = $$0.j("body_armor_drop_chance");
      } else {
         this.cg = cud.l;
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

      this.c($$0.q("NoAI"));
   }

   @Override
   protected void a(bra $$0, boolean $$1) {
      super.a($$0, $$1);
      this.ck = null;
   }

   @Override
   public final akj<erb> eC() {
      return this.ck == null ? this.T() : this.ck;
   }

   protected akj<erb> T() {
      return super.eC();
   }

   @Override
   public long eD() {
      return this.cl;
   }

   public void D(float $$0) {
      this.br = $$0;
   }

   public void E(float $$0) {
      this.bq = $$0;
   }

   public void F(float $$0) {
      this.bp = $$0;
   }

   @Override
   public void z(float $$0) {
      super.z($$0);
      this.D($$0);
   }

   public void U() {
      this.J().n();
      this.F(0.0F);
      this.E(0.0F);
      this.z(0.0F);
   }

   @Override
   public void m_() {
      super.m_();
      this.dR().ag().a("looting");
      if (!this.dR().B && this.fR() && this.bF() && !this.bf && this.dR().ab().b(dcc.c)) {
         ke $$0 = this.V();

         for (civ $$2 : this.dR().a(civ.class, this.cM().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dM() && !$$2.p().e() && !$$2.y() && this.k($$2.p())) {
               this.b($$2);
            }
         }
      }

      this.dR().ag().c();
   }

   protected ke V() {
      return bZ;
   }

   protected void b(civ $$0) {
      cud $$1 = $$0.p();
      cud $$2 = this.i($$1.s());
      if (!$$2.e()) {
         this.a($$0);
         this.a($$0, $$2.H());
         $$1.h($$2.H());
         if ($$1.e()) {
            $$0.aq();
         }
      }
   }

   public cud i(cud $$0) {
      bso $$1 = this.h($$0);
      cud $$2 = this.a($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bso.a;
         $$2 = this.a($$1);
         $$3 = $$2.e();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.f($$1);
         if (!$$2.e() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         cud $$5 = $$1.a($$0);
         this.b($$1, $$5);
         return $$5;
      } else {
         return cud.l;
      }
   }

   @Override
   protected void b(bso $$0, cud $$1) {
      this.a($$0, $$1);
      this.e($$0);
      this.ci = true;
   }

   public void e(bso $$0) {
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

   protected boolean b(cud $$0, cud $$1) {
      if ($$1.e()) {
         return true;
      } else if ($$0.g() instanceof cvq) {
         if (!($$1.g() instanceof cvq)) {
            return true;
         } else {
            double $$2 = this.o($$0);
            double $$3 = this.o($$1);
            return $$2 != $$3 ? $$2 > $$3 : this.c($$0, $$1);
         }
      } else if ($$0.g() instanceof csh && $$1.g() instanceof csh) {
         return this.c($$0, $$1);
      } else if ($$0.g() instanceof csq && $$1.g() instanceof csq) {
         return this.c($$0, $$1);
      } else if ($$0.g() instanceof crt $$4) {
         if (czo.a($$1, czn.E)) {
            return false;
         } else if (!($$1.g() instanceof crt)) {
            return true;
         } else {
            crt $$5 = (crt)$$1.g();
            if ($$4.k() != $$5.k()) {
               return $$4.k() > $$5.k();
            } else {
               return $$4.l() != $$5.l() ? $$4.l() > $$5.l() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.g() instanceof css) {
            if ($$1.g() instanceof csc) {
               return true;
            }

            if ($$1.g() instanceof css) {
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

   private double o(cud $$0) {
      cwx $$1 = $$0.a(kn.n, cwx.a);
      return $$1.a(this.h(buk.c), bso.a);
   }

   public boolean c(cud $$0, cud $$1) {
      return $$0.n() < $$1.n() ? true : p($$0) && !p($$1);
   }

   private static boolean p(cud $$0) {
      kj $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(kn.e);
   }

   public boolean j(cud $$0) {
      return true;
   }

   public boolean k(cud $$0) {
      return this.j($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean W() {
      return this.bT();
   }

   protected boolean X() {
      return false;
   }

   @Override
   public void dD() {
      if (this.dR().al() == bqe.a && this.X()) {
         this.aq();
      } else if (!this.fS() && !this.W()) {
         bsh $$0 = this.dR().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.am().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.aq();
            }

            int $$4 = this.am().f().g();
            int $$5 = $$4 * $$4;
            if (this.bg > 600 && this.ah.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.aq();
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
      bmv $$0 = this.dR().ag();
      $$0.a("sensing");
      this.cd.a();
      $$0.c();
      int $$1 = this.ai + this.an();
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
      afy.a(this.dR(), this, this.bU);
   }

   protected void Z() {
   }

   public int aa() {
      return 40;
   }

   public int ab() {
      return 75;
   }

   protected void ac() {
      float $$0 = (float)this.ab();
      float $$1 = this.cu();
      float $$2 = ayg.g(this.aZ - $$1);
      float $$3 = ayg.a(ayg.g(this.aZ - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.o($$4);
   }

   public int ae() {
      return 10;
   }

   public void a(bsh $$0, float $$1, float $$2) {
      double $$3 = $$0.dw() - this.dw();
      double $$4 = $$0.dC() - this.dC();
      double $$6;
      if ($$0 instanceof btc $$5) {
         $$6 = $$5.dA() - this.dA();
      } else {
         $$6 = ($$0.cM().b + $$0.cM().e) / 2.0 - this.dA();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(ayg.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(ayg.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.t(this.a(this.dJ(), $$10, $$2));
      this.s(this.a(this.dH(), $$9, $$1));
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

   public static boolean a(bsn<? extends bte> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      ja $$5 = $$3.d();
      return $$2 == btg.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dch $$0, btg $$1) {
      return true;
   }

   public boolean a(dcj $$0) {
      return !$$0.d(this.cM()) && $$0.f(this);
   }

   public int af() {
      return 4;
   }

   public boolean d(int $$0) {
      return false;
   }

   @Override
   public int cz() {
      if (this.p() == null) {
         return this.v(0.0F);
      } else {
         int $$0 = (int)(this.ey() - this.eP() * 0.33F);
         $$0 -= (3 - this.dR().al().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.v((float)$$0);
      }
   }

   @Override
   public Iterable<cud> eY() {
      return this.ce;
   }

   @Override
   public Iterable<cud> eX() {
      return this.cf;
   }

   public cud fO() {
      return this.cg;
   }

   @Override
   public boolean d(bso $$0) {
      return $$0 != bso.g;
   }

   public boolean fP() {
      return !this.a(bso.g).e();
   }

   public boolean l(cud $$0) {
      return false;
   }

   public void m(cud $$0) {
      this.b(bso.g, $$0);
   }

   @Override
   public Iterable<cud> eZ() {
      return (Iterable<cud>)(this.cg.e() ? this.cf : Iterables.concat(this.cf, List.of(this.cg)));
   }

   @Override
   public cud a(bso $$0) {
      return switch ($$0.a()) {
         case a -> (cud)this.ce.get($$0.b());
         case b -> (cud)this.cf.get($$0.b());
         case c -> this.cg;
      };
   }

   @Override
   public void a(bso $$0, cud $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cf.set($$0.b(), $$1), $$1);
            break;
         case c:
            cud $$2 = this.cg;
            this.cg = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(aqm $$0, bra $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bso $$3 : bso.values()) {
         cud $$4 = this.a($$3);
         float $$5 = this.f($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = $$5 > 1.0F;
            bsh var13 = $$1.d();
            if (var13 instanceof btc) {
               btc $$7 = (btc)var13;
               if (this.dR() instanceof aqm $$8) {
                  $$5 = czo.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.e() && !czo.a($$4, czn.D) && ($$2 || $$6) && this.ah.i() < $$5) {
               if (!$$6 && $$4.l()) {
                  $$4.b($$4.o() - this.ah.a(1 + this.ah.a(Math.max($$4.o() - 3, 1))));
               }

               this.b($$4);
               this.a($$3, cud.l);
            }
         }
      }
   }

   protected float f(bso $$0) {
      return switch ($$0.a()) {
         case a -> this.bW[$$0.b()];
         case b -> this.bX[$$0.b()];
         case c -> this.bY;
      };
   }

   private eqz b(aqm $$0) {
      return new eqz.a($$0).a(ets.f, this.dp()).a(ets.a, this).a(etr.h);
   }

   public void a(bsq $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(akj<erb> $$0, Map<bso, Float> $$1) {
      if (this.dR() instanceof aqm $$2) {
         this.a($$0, this.b($$2), $$1);
      }
   }

   protected void a(ayo $$0, bqf $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dR().al() == bqe.d ? 0.1F : 0.25F;
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

         for (bso $$5 : bso.values()) {
            if ($$5.a() == bso.a.b) {
               cud $$6 = this.a($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.e()) {
                  cty $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cud($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cty a(bso $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cug.py;
            } else if ($$1 == 1) {
               return cug.pO;
            } else if ($$1 == 2) {
               return cug.pC;
            } else if ($$1 == 3) {
               return cug.pG;
            } else if ($$1 == 4) {
               return cug.pK;
            }
         case e:
            if ($$1 == 0) {
               return cug.pz;
            } else if ($$1 == 1) {
               return cug.pP;
            } else if ($$1 == 2) {
               return cug.pD;
            } else if ($$1 == 3) {
               return cug.pH;
            } else if ($$1 == 4) {
               return cug.pL;
            }
         case d:
            if ($$1 == 0) {
               return cug.pA;
            } else if ($$1 == 1) {
               return cug.pQ;
            } else if ($$1 == 2) {
               return cug.pE;
            } else if ($$1 == 3) {
               return cug.pI;
            } else if ($$1 == 4) {
               return cug.pM;
            }
         case c:
            if ($$1 == 0) {
               return cug.pB;
            } else if ($$1 == 1) {
               return cug.pR;
            } else if ($$1 == 2) {
               return cug.pF;
            } else if ($$1 == 3) {
               return cug.pJ;
            } else if ($$1 == 4) {
               return cug.pN;
            }
         default:
            return null;
      }
   }

   protected void a(dcv $$0, ayo $$1, bqf $$2) {
      this.b($$0, $$1, $$2);

      for (bso $$3 : bso.values()) {
         if ($$3.a() == bso.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dcv $$0, ayo $$1, bqf $$2) {
      this.a($$0, bso.a, $$1, 0.25F, $$2);
   }

   protected void a(dcv $$0, ayo $$1, bso $$2, bqf $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dcv $$0, bso $$1, ayo $$2, float $$3, bqf $$4) {
      cud $$5 = this.a($$1);
      if (!$$5.e() && $$2.i() < $$3 * $$4.d()) {
         czo.a($$5, $$0.H_(), daz.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      ayo $$4 = $$0.E_();
      this.f(buk.m).d(new bui("Random spawn bonus", $$4.a(0.0, 0.11485000000000001), bui.a.b));
      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fQ() {
      this.ci = true;
   }

   @Override
   public void a(bso $$0, float $$1) {
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

   public boolean fR() {
      return this.ch;
   }

   public void a_(boolean $$0) {
      this.ch = $$0;
   }

   @Override
   public boolean f(cud $$0) {
      bso $$1 = this.h($$0);
      return this.a($$1).e() && this.fR();
   }

   public boolean fS() {
      return this.ci;
   }

   @Override
   public final bqh a(cml $$0, bqg $$1) {
      if (!this.bF()) {
         return bqh.e;
      } else if (this.gb() == $$0) {
         this.a(true, !$$0.fN());
         this.a(dxh.r, $$0);
         return bqh.a(this.dR().B);
      } else {
         bqh $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dxh.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dxh.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bqh c(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if ($$2.a(cug.uK) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bqh.a(this.dR().B);
      } else {
         if ($$2.a(cug.uL)) {
            bqh $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.g() instanceof cvk) {
            if (this.dR() instanceof aqm) {
               cvk $$4 = (cvk)$$2.g();
               Optional<bte> $$5 = $$4.a($$0, this, (bsn<? extends bte>)this.am(), (aqm)this.dR(), this.dp(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bqh.a : bqh.e;
            } else {
               return bqh.c;
            }
         } else {
            return bqh.e;
         }
      }
   }

   protected void a(cml $$0, bte $$1) {
   }

   protected bqh b(cml $$0, bqg $$1) {
      return bqh.e;
   }

   public boolean fT() {
      return this.a(this.dr());
   }

   public boolean a(ja $$0) {
      return this.cq == -1.0F ? true : this.cp.j($$0) < (double)(this.cq * this.cq);
   }

   public void a(ja $$0, int $$1) {
      this.cp = $$0;
      this.cq = (float)$$1;
   }

   public ja fU() {
      return this.cp;
   }

   public float fV() {
      return this.cq;
   }

   public void fW() {
      this.cq = -1.0F;
   }

   public boolean fX() {
      return this.cq != -1.0F;
   }

   @Nullable
   public <T extends bte> T a(bsn<T> $$0, boolean $$1) {
      if (this.dM()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dR());
         if ($$2 == null) {
            return null;
         } else {
            $$2.v(this);
            $$2.a(this.o_());
            $$2.c(this.gc());
            if (this.ai()) {
               $$2.b(this.aj());
               $$2.p(this.cG());
            }

            if (this.fS()) {
               $$2.fQ();
            }

            $$2.o(this.cw());
            if ($$1) {
               $$2.a_(this.fR());

               for (bso $$3 : bso.values()) {
                  cud $$4 = this.a($$3);
                  if (!$$4.e()) {
                     $$2.a($$3, $$4.f());
                     $$2.a($$3, this.f($$3));
                  }
               }
            }

            this.dR().b($$2);
            if (this.bT()) {
               bsh $$5 = this.de();
               this.ad();
               $$2.a($$5, true);
            }

            this.aq();
            return $$2;
         }
      }
   }

   protected void fY() {
      if (this.co != null) {
         this.gj();
      }

      if (this.cm != null) {
         if (!this.bF() || !this.cm.bF()) {
            this.a(true, true);
         }
      }
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.cm != null) {
         this.cm = null;
         this.co = null;
         this.fW();
         if (!this.dR().B && $$1) {
            this.a(cug.uK);
         }

         if (!this.dR().B && $$0 && this.dR() instanceof aqm) {
            ((aqm)this.dR()).l().b(this, new aet(this, null));
         }
      }
   }

   public boolean a(cml $$0) {
      return !this.fZ() && !(this instanceof cjj);
   }

   public boolean fZ() {
      return this.cm != null;
   }

   public boolean ga() {
      return this.fZ() || this.co != null;
   }

   @Nullable
   public bsh gb() {
      if (this.cm == null && this.cn != 0 && this.dR().B) {
         this.cm = this.dR().a(this.cn);
      }

      return this.cm;
   }

   public void b(bsh $$0, boolean $$1) {
      this.cm = $$0;
      this.co = null;
      if (!this.dR().B && $$1 && this.dR() instanceof aqm) {
         ((aqm)this.dR()).l().b(this, new aet(this, this.cm));
      }

      if (this.bT()) {
         this.ad();
      }
   }

   public void r(int $$0) {
      this.cn = $$0;
      this.a(false, false);
   }

   @Override
   public boolean a(bsh $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.fZ()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gj() {
      if (this.co != null && this.dR() instanceof aqm $$0) {
         Optional<UUID> $$1 = this.co.left();
         Optional<ja> $$2 = this.co.right();
         if ($$1.isPresent()) {
            bsh $$3 = $$0.a($$1.get());
            if ($$3 != null) {
               this.b($$3, true);
               return;
            }
         } else if ($$2.isPresent()) {
            this.b(cip.b(this.dR(), $$2.get()), true);
            return;
         }

         if (this.ai > 100) {
            this.a(cug.uK);
            this.co = null;
         }
      }
   }

   @Override
   public boolean dd() {
      return super.dd() && !this.gc();
   }

   public void c(boolean $$0) {
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

   public boolean gc() {
      return (this.ao.a(b) & 1) != 0;
   }

   public boolean gd() {
      return (this.ao.a(b) & 2) != 0;
   }

   public boolean ge() {
      return (this.ao.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bsw fs() {
      return this.gd() ? bsw.a : bsw.b;
   }

   public boolean i(btc $$0) {
      return this.gf().c($$0.eH());
   }

   protected ewc gf() {
      bsh $$0 = this.de();
      ewc $$3;
      if ($$0 != null) {
         ewc $$1 = $$0.cM();
         ewc $$2 = this.cM();
         $$3 = new ewc(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cM();
      }

      return $$3.c(ca, 0.0, ca);
   }

   @Override
   public boolean D(bsh $$0) {
      float $$1 = (float)this.g(buk.c);
      bra $$2 = this.dS().b((btc)this);
      if (this.dR() instanceof aqm $$3) {
         $$1 = czo.a($$3, this.eV(), $$0, $$2, $$1);
      }

      boolean $$4 = $$0.a($$2, $$1);
      if ($$4) {
         float $$5 = this.a($$0, $$2);
         if ($$5 > 0.0F && $$0 instanceof btc $$6) {
            $$6.q((double)($$5 * 0.5F), (double)ayg.a(this.dH() * (float) (Math.PI / 180.0)), (double)(-ayg.b(this.dH() * (float) (Math.PI / 180.0))));
            this.j(this.du().d(0.6, 1.0, 0.6));
         }

         if (this.dR() instanceof aqm $$7) {
            czo.a($$7, $$0, $$2);
         }

         this.A($$0);
         this.gg();
      }

      return $$4;
   }

   protected void gg() {
   }

   protected boolean gh() {
      if (this.dR().R() && !this.dR().B) {
         float $$0 = this.bv();
         ja $$1 = ja.a(this.dw(), this.dA(), this.dC());
         boolean $$2 = this.bi() || this.aB || this.aC;
         if ($$0 > 0.5F && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dR().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(awm<eoi> $$0) {
      if (this.J().p()) {
         super.c($$0);
      } else {
         this.j(this.du().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gi() {
      this.c($$0 -> true);
      this.dV().h();
   }

   public void c(Predicate<caa> $$0) {
      this.bU.a($$0);
   }

   @Override
   protected void cx() {
      super.cx();
      this.a(true, false);
      this.fa().forEach($$0 -> {
         if (!$$0.e()) {
            $$0.e(0);
         }
      });
   }

   @Nullable
   @Override
   public cud dE() {
      cvk $$0 = cvk.a(this.am());
      return $$0 == null ? null : new cud($$0);
   }
}

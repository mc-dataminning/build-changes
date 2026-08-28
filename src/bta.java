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

public abstract class bta extends bsy implements bsn, btw {
   private static final ajp<Byte> b = ajt.a(bta.class, ajr.a);
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
   protected byy bQ;
   protected byz bR;
   protected byx bS;
   private final byu cb;
   protected cck bT;
   protected final bzx bU;
   protected final bzx bV;
   @Nullable
   private bsy cc;
   private final cdh cd;
   private final js<cua> ce = js.a(2, cua.l);
   protected final float[] bW = new float[2];
   private final js<cua> cf = js.a(4, cua.l);
   protected final float[] bX = new float[4];
   private cua cg = cua.l;
   protected float bY;
   private boolean ch;
   private boolean ci;
   private final Map<eos, Float> cj = Maps.newEnumMap(eos.class);
   @Nullable
   private akj<eqt> ck;
   private long cl;
   @Nullable
   private bsd cm;
   private int cn;
   @Nullable
   private Either<UUID, ja> co;
   private ja cp = ja.c;
   private float cq = -1.0F;

   protected bta(bsj<? extends bta> $$0, dcd $$1) {
      super($$0, $$1);
      this.bU = new bzx($$1.ah());
      this.bV = new bzx($$1.ah());
      this.bQ = new byy(this);
      this.bR = new byz(this);
      this.bS = new byx(this);
      this.cb = this.E();
      this.bT = this.b($$1);
      this.cd = new cdh(this);
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

   public static buf.a A() {
      return bsy.dV().a(bug.m, 16.0);
   }

   protected cck b(dcd $$0) {
      return new ccj(this, $$0);
   }

   protected boolean B() {
      return false;
   }

   public float a(eos $$0) {
      bta $$2;
      label17: {
         if (this.dd() instanceof bta $$1 && $$1.B()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cj.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(eos $$0, float $$1) {
      this.cj.put($$0, $$1);
   }

   @Override
   public void C() {
   }

   @Override
   public void D() {
   }

   protected byu E() {
      return new byu(this);
   }

   public byy G() {
      return this.bQ;
   }

   public byz H() {
      return this.dd() instanceof bta $$0 ? $$0.H() : this.bR;
   }

   public byx I() {
      return this.bS;
   }

   public cck K() {
      return this.dd() instanceof bta $$0 ? $$0.K() : this.bT;
   }

   @Nullable
   @Override
   public bsy cQ() {
      bsd $$0 = this.cT();
      if (!this.gc() && $$0 instanceof bta $$1 && $$0.bU()) {
         return $$1;
      }

      return null;
   }

   public cdh M() {
      return this.cd;
   }

   @Nullable
   @Override
   public bsy p() {
      return this.cc;
   }

   @Nullable
   protected final bsy N() {
      return this.dT().c(ccc.o).orElse(null);
   }

   public void h(@Nullable bsy $$0) {
      this.cc = $$0;
   }

   @Override
   public boolean a(bsj<?> $$0) {
      return $$0 != bsj.T;
   }

   public boolean a(cut $$0) {
      return false;
   }

   public void O() {
      this.a(dxa.m);
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
   public void au() {
      super.au();
      this.dP().ag().a("mobBaseTick");
      if (this.bD() && this.ah.a(1000) < this.bO++) {
         this.s();
         this.Q();
      }

      this.dP().ag().c();
   }

   @Override
   protected void e(bqw $$0) {
      this.s();
      super.e($$0);
   }

   private void s() {
      this.bO = -this.P();
   }

   @Override
   protected int eg() {
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
      if (this.dP().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.ah.k() * 0.02;
            double $$2 = this.ah.k() * 0.02;
            double $$3 = this.ah.k() * 0.02;
            double $$4 = 10.0;
            this.dP().a(lj.ab, this.c(1.0) - $$1 * 10.0, this.dx() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
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
         this.fY();
         if (this.ai % 5 == 0) {
            this.S();
         }
      }
   }

   protected void S() {
      boolean $$0 = !(this.cQ() instanceof bta);
      boolean $$1 = !(this.dc() instanceof coe);
      this.bU.a(bzw.a.a, $$0);
      this.bU.a(bzw.a.c, $$0 && $$1);
      this.bU.a(bzw.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.cb.a();
      return $$1;
   }

   @Nullable
   protected ave v() {
      return null;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fR());
      $$0.a("PersistenceRequired", this.ci);
      ud $$1 = new ud();

      for (cua $$2 : this.cf) {
         if (!$$2.e()) {
            $$1.add($$2.a(this.dR()));
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

      for (cua $$6 : this.ce) {
         if (!$$6.e()) {
            $$5.add($$6.a(this.dR()));
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
         $$0.a("body_armor_item", this.cg.a(this.dR()));
         $$0.a("body_armor_drop_chance", this.bY);
      }

      Either<UUID, ja> $$9 = this.co;
      if (this.cm instanceof bsy) {
         $$9 = Either.left(this.cm.cz());
      } else if (this.cm instanceof cil $$10) {
         $$9 = Either.right($$10.u());
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
            this.cf.set($$2, cua.a(this.dR(), $$3));
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
            this.ce.set($$7, cua.a(this.dR(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         ud $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bW[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cg = cua.a(this.dR(), (uu)$$0.p("body_armor_item")).orElse(cua.l);
         this.bY = $$0.j("body_armor_drop_chance");
      } else {
         this.cg = cua.l;
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
   protected void b(bqw $$0, boolean $$1) {
      super.b($$0, $$1);
      this.ck = null;
   }

   @Override
   public final akj<eqt> eA() {
      return this.ck == null ? this.T() : this.ck;
   }

   protected akj<eqt> T() {
      return super.eA();
   }

   @Override
   public long eB() {
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
      this.dP().ag().a("looting");
      if (!this.dP().B && this.fR() && this.bD() && !this.be && this.dP().ab().b(dbz.c)) {
         ke $$0 = this.V();

         for (cir $$2 : this.dP().a(cir.class, this.cK().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dK() && !$$2.p().e() && !$$2.y() && this.k($$2.p())) {
               this.b($$2);
            }
         }
      }

      this.dP().ag().c();
   }

   protected ke V() {
      return bZ;
   }

   protected void b(cir $$0) {
      cua $$1 = $$0.p();
      cua $$2 = this.i($$1.s());
      if (!$$2.e()) {
         this.a($$0);
         this.a($$0, $$2.H());
         $$1.h($$2.H());
         if ($$1.e()) {
            $$0.ao();
         }
      }
   }

   public cua i(cua $$0) {
      bsk $$1 = h($$0);
      cua $$2 = this.a($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bsk.a;
         $$2 = this.a($$1);
         $$3 = $$2.e();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.g($$1);
         if (!$$2.e() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.H() > 1) {
            cua $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return cua.l;
      }
   }

   @Override
   protected void b(bsk $$0, cua $$1) {
      this.a($$0, $$1);
      this.f($$0);
      this.ci = true;
   }

   public void f(bsk $$0) {
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

   protected boolean b(cua $$0, cua $$1) {
      if ($$1.e()) {
         return true;
      } else if ($$0.g() instanceof cvn) {
         if (!($$1.g() instanceof cvn)) {
            return true;
         } else {
            double $$2 = this.o($$0);
            double $$3 = this.o($$1);
            return $$2 != $$3 ? $$2 > $$3 : this.c($$0, $$1);
         }
      } else if ($$0.g() instanceof csd && $$1.g() instanceof csd) {
         return this.c($$0, $$1);
      } else if ($$0.g() instanceof csn && $$1.g() instanceof csn) {
         return this.c($$0, $$1);
      } else if ($$0.g() instanceof crp $$4) {
         if (czl.a($$1, czk.F)) {
            return false;
         } else if (!($$1.g() instanceof crp)) {
            return true;
         } else {
            crp $$5 = (crp)$$1.g();
            if ($$4.k() != $$5.k()) {
               return $$4.k() > $$5.k();
            } else {
               return $$4.l() != $$5.l() ? $$4.l() > $$5.l() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.g() instanceof csp) {
            if ($$1.g() instanceof cry) {
               return true;
            }

            if ($$1.g() instanceof csp) {
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

   private double o(cua $$0) {
      cwu $$1 = $$0.a(kn.n, cwu.a);
      return $$1.a(this.h(bug.c), bsk.a);
   }

   public boolean c(cua $$0, cua $$1) {
      return $$0.n() < $$1.n() ? true : p($$0) && !p($$1);
   }

   private static boolean p(cua $$0) {
      kj $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(kn.e);
   }

   public boolean j(cua $$0) {
      return true;
   }

   public boolean k(cua $$0) {
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
      if (this.dP().al() == bqa.a && this.X()) {
         this.ao();
      } else if (!this.fS() && !this.W()) {
         bsd $$0 = this.dP().a(this, -1.0);
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
   protected final void fm() {
      this.bf++;
      bmr $$0 = this.dP().ag();
      $$0.a("sensing");
      this.cd.a();
      $$0.c();
      int $$1 = this.ai + this.al();
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
      afy.a(this.dP(), this, this.bU);
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
      float $$2 = aye.g(this.aY - $$1);
      float $$3 = aye.a(aye.g(this.aY - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.o($$4);
   }

   public int ae() {
      return 10;
   }

   public void a(bsd $$0, float $$1, float $$2) {
      double $$3 = $$0.du() - this.du();
      double $$4 = $$0.dA() - this.dA();
      double $$6;
      if ($$0 instanceof bsy $$5) {
         $$6 = $$5.dy() - this.dy();
      } else {
         $$6 = ($$0.cK().b + $$0.cK().e) / 2.0 - this.dy();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(aye.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(aye.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.t(this.a(this.dH(), $$10, $$2));
      this.s(this.a(this.dF(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = aye.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bsj<? extends bta> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      ja $$5 = $$3.d();
      return $$2 == btc.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dce $$0, btc $$1) {
      return true;
   }

   public boolean a(dcg $$0) {
      return !$$0.d(this.cK()) && $$0.f(this);
   }

   public int fM() {
      return 4;
   }

   public boolean d(int $$0) {
      return false;
   }

   @Override
   public int cx() {
      if (this.p() == null) {
         return this.v(0.0F);
      } else {
         int $$0 = (int)(this.ew() - this.eN() * 0.33F);
         $$0 -= (3 - this.dP().al().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.v((float)$$0);
      }
   }

   @Override
   public Iterable<cua> eW() {
      return this.ce;
   }

   @Override
   public Iterable<cua> eV() {
      return this.cf;
   }

   public cua fN() {
      return this.cg;
   }

   public boolean fO() {
      return false;
   }

   @Override
   public boolean d(bsk $$0) {
      return true;
   }

   public boolean fP() {
      return !this.a(bsk.g).e();
   }

   public boolean l(cua $$0) {
      return false;
   }

   public void m(cua $$0) {
      this.b(bsk.g, $$0);
   }

   @Override
   public Iterable<cua> eX() {
      return (Iterable<cua>)(this.cg.e() ? this.cf : Iterables.concat(this.cf, List.of(this.cg)));
   }

   @Override
   public cua a(bsk $$0) {
      return switch ($$0.a()) {
         case a -> (cua)this.ce.get($$0.b());
         case b -> (cua)this.cf.get($$0.b());
         case c -> this.cg;
      };
   }

   @Override
   public void a(bsk $$0, cua $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cf.set($$0.b(), $$1), $$1);
            break;
         case c:
            cua $$2 = this.cg;
            this.cg = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(bqw $$0, boolean $$1) {
      super.a($$0, $$1);

      for (bsk $$2 : bsk.values()) {
         cua $$3 = this.a($$2);
         float $$4 = this.g($$2);
         if ($$4 != 0.0F) {
            boolean $$5 = $$4 > 1.0F;
            bsd var12 = $$0.d();
            if (var12 instanceof bsy) {
               bsy $$6 = (bsy)var12;
               if (this.dP() instanceof aqk $$7) {
                  $$4 = czl.a($$7, $$6, $$0, $$4);
               }
            }

            if (!$$3.e() && !czl.a($$3, czk.E) && ($$1 || $$5) && this.ah.i() < $$4) {
               if (!$$5 && $$3.l()) {
                  $$3.b($$3.o() - this.ah.a(1 + this.ah.a(Math.max($$3.o() - 3, 1))));
               }

               this.b($$3);
               this.a($$2, cua.l);
            }
         }
      }
   }

   protected float g(bsk $$0) {
      return switch ($$0.a()) {
         case a -> this.bW[$$0.b()];
         case b -> this.bX[$$0.b()];
         case c -> this.bY;
      };
   }

   private eqr c(aqk $$0) {
      return new eqr.a($$0).a(etk.f, this.dn()).a(etk.a, this).a(etj.h);
   }

   public void a(bsm $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(akj<eqt> $$0, Map<bsk, Float> $$1) {
      if (this.dP() instanceof aqk $$2) {
         this.a($$0, this.c($$2), $$1);
      }
   }

   protected void a(aym $$0, bqb $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dP().al() == bqa.d ? 0.1F : 0.25F;
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

         for (bsk $$5 : bsk.values()) {
            if ($$5.a() == bsk.a.b) {
               cua $$6 = this.a($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.e()) {
                  ctv $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cua($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static ctv a(bsk $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cud.py;
            } else if ($$1 == 1) {
               return cud.pO;
            } else if ($$1 == 2) {
               return cud.pC;
            } else if ($$1 == 3) {
               return cud.pG;
            } else if ($$1 == 4) {
               return cud.pK;
            }
         case e:
            if ($$1 == 0) {
               return cud.pz;
            } else if ($$1 == 1) {
               return cud.pP;
            } else if ($$1 == 2) {
               return cud.pD;
            } else if ($$1 == 3) {
               return cud.pH;
            } else if ($$1 == 4) {
               return cud.pL;
            }
         case d:
            if ($$1 == 0) {
               return cud.pA;
            } else if ($$1 == 1) {
               return cud.pQ;
            } else if ($$1 == 2) {
               return cud.pE;
            } else if ($$1 == 3) {
               return cud.pI;
            } else if ($$1 == 4) {
               return cud.pM;
            }
         case c:
            if ($$1 == 0) {
               return cud.pB;
            } else if ($$1 == 1) {
               return cud.pR;
            } else if ($$1 == 2) {
               return cud.pF;
            } else if ($$1 == 3) {
               return cud.pJ;
            } else if ($$1 == 4) {
               return cud.pN;
            }
         default:
            return null;
      }
   }

   protected void b(aym $$0, bqb $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bsk $$3 : bsk.values()) {
         if ($$3.a() == bsk.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(aym $$0, float $$1) {
      this.a(bsk.a, $$0, 0.25F, $$1);
   }

   protected void a(aym $$0, float $$1, bsk $$2) {
      this.a($$2, $$0, 0.5F, $$1);
   }

   private void a(bsk $$0, aym $$1, float $$2, float $$3) {
      cua $$4 = this.a($$0);
      if (!$$4.e() && $$1.i() < $$2 * $$3) {
         czl.a($$4, daw.a, this.dP(), this.dp(), $$1);
         this.a($$0, $$4);
      }
   }

   @Nullable
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      aym $$4 = $$0.E_();
      this.f(bug.m).d(new bue("Random spawn bonus", $$4.a(0.0, 0.11485000000000001), bue.a.b));
      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fQ() {
      this.ci = true;
   }

   @Override
   public void a(bsk $$0, float $$1) {
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
   public boolean f(cua $$0) {
      bsk $$1 = h($$0);
      return this.a($$1).e() && this.fR();
   }

   public boolean fS() {
      return this.ci;
   }

   @Override
   public final bqd a(cmh $$0, bqc $$1) {
      if (!this.bD()) {
         return bqd.e;
      } else if (this.gb() == $$0) {
         this.a(true, !$$0.fL());
         this.a(dxa.r, $$0);
         return bqd.a(this.dP().B);
      } else {
         bqd $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dxa.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dxa.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bqd c(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if ($$2.a(cud.uK) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bqd.a(this.dP().B);
      } else {
         if ($$2.a(cud.uL)) {
            bqd $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.g() instanceof cvh) {
            if (this.dP() instanceof aqk) {
               cvh $$4 = (cvh)$$2.g();
               Optional<bta> $$5 = $$4.a($$0, this, (bsj<? extends bta>)this.ak(), (aqk)this.dP(), this.dn(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bqd.a : bqd.e;
            } else {
               return bqd.c;
            }
         } else {
            return bqd.e;
         }
      }
   }

   protected void a(cmh $$0, bta $$1) {
   }

   protected bqd b(cmh $$0, bqc $$1) {
      return bqd.e;
   }

   public boolean fT() {
      return this.a(this.dp());
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
   public <T extends bta> T a(bsj<T> $$0, boolean $$1) {
      if (this.dK()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dP());
         if ($$2 == null) {
            return null;
         } else {
            $$2.v(this);
            $$2.a(this.p_());
            $$2.t(this.gc());
            if (this.ag()) {
               $$2.b(this.ah());
               $$2.o(this.cE());
            }

            if (this.fS()) {
               $$2.fQ();
            }

            $$2.n(this.cu());
            if ($$1) {
               $$2.a_(this.fR());

               for (bsk $$3 : bsk.values()) {
                  cua $$4 = this.a($$3);
                  if (!$$4.e()) {
                     $$2.a($$3, $$4.f());
                     $$2.a($$3, this.g($$3));
                  }
               }
            }

            this.dP().b($$2);
            if (this.bR()) {
               bsd $$5 = this.dc();
               this.ac();
               $$2.a($$5, true);
            }

            this.ao();
            return $$2;
         }
      }
   }

   protected void fY() {
      if (this.co != null) {
         this.gj();
      }

      if (this.cm != null) {
         if (!this.bD() || !this.cm.bD()) {
            this.a(true, true);
         }
      }
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.cm != null) {
         this.cm = null;
         this.co = null;
         this.fW();
         if (!this.dP().B && $$1) {
            this.a(cud.uK);
         }

         if (!this.dP().B && $$0 && this.dP() instanceof aqk) {
            ((aqk)this.dP()).l().b(this, new aet(this, null));
         }
      }
   }

   public boolean a(cmh $$0) {
      return !this.fZ() && !(this instanceof cjf);
   }

   public boolean fZ() {
      return this.cm != null;
   }

   public boolean ga() {
      return this.fZ() || this.co != null;
   }

   @Nullable
   public bsd gb() {
      if (this.cm == null && this.cn != 0 && this.dP().B) {
         this.cm = this.dP().a(this.cn);
      }

      return this.cm;
   }

   public void b(bsd $$0, boolean $$1) {
      this.cm = $$0;
      this.co = null;
      if (!this.dP().B && $$1 && this.dP() instanceof aqk) {
         ((aqk)this.dP()).l().b(this, new aet(this, this.cm));
      }

      if (this.bR()) {
         this.ac();
      }
   }

   public void r(int $$0) {
      this.cn = $$0;
      this.a(false, false);
   }

   @Override
   public boolean a(bsd $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.fZ()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gj() {
      if (this.co != null && this.dP() instanceof aqk $$0) {
         Optional<UUID> $$1 = this.co.left();
         Optional<ja> $$2 = this.co.right();
         if ($$1.isPresent()) {
            bsd $$3 = $$0.a($$1.get());
            if ($$3 != null) {
               this.b($$3, true);
               return;
            }
         } else if ($$2.isPresent()) {
            this.b(cil.b(this.dP(), $$2.get()), true);
            return;
         }

         if (this.ai > 100) {
            this.a(cud.uK);
            this.co = null;
         }
      }
   }

   @Override
   public boolean db() {
      return super.db() && !this.gc();
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
   public bss fq() {
      return this.gd() ? bss.a : bss.b;
   }

   public boolean i(bsy $$0) {
      return this.gf().c($$0.eF());
   }

   protected evu gf() {
      bsd $$0 = this.dc();
      evu $$3;
      if ($$0 != null) {
         evu $$1 = $$0.cK();
         evu $$2 = this.cK();
         $$3 = new evu(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cK();
      }

      return $$3.c(ca, 0.0, ca);
   }

   @Override
   public boolean D(bsd $$0) {
      float $$1 = (float)this.g(bug.c);
      bqw $$2 = this.dQ().b((bsy)this);
      if (this.dP() instanceof aqk $$3) {
         $$1 = czl.a($$3, this.eT(), $$0, $$2, $$1);
      }

      boolean $$4 = $$0.a($$2, $$1);
      if ($$4) {
         float $$5 = this.a($$0, $$2);
         if ($$5 > 0.0F && $$0 instanceof bsy $$6) {
            $$6.q((double)($$5 * 0.5F), (double)aye.a(this.dF() * (float) (Math.PI / 180.0)), (double)(-aye.b(this.dF() * (float) (Math.PI / 180.0))));
            this.h(this.ds().d(0.6, 1.0, 0.6));
         }

         if (this.dP() instanceof aqk $$7) {
            czl.a($$7, $$0, $$2);
         }

         this.A($$0);
         this.gg();
      }

      return $$4;
   }

   protected void gg() {
   }

   protected boolean gh() {
      if (this.dP().R() && !this.dP().B) {
         float $$0 = this.bt();
         ja $$1 = ja.a(this.du(), this.dy(), this.dA());
         boolean $$2 = this.bg() || this.aB || this.aC;
         if ($$0 > 0.5F && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dP().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(awk<eoa> $$0) {
      if (this.K().p()) {
         super.c($$0);
      } else {
         this.h(this.ds().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gi() {
      this.c($$0 -> true);
      this.dT().h();
   }

   public void c(Predicate<bzw> $$0) {
      this.bU.a($$0);
   }

   @Override
   protected void cv() {
      super.cv();
      this.a(true, false);
      this.eY().forEach($$0 -> {
         if (!$$0.e()) {
            $$0.e(0);
         }
      });
   }

   @Nullable
   @Override
   public cua dC() {
      cvh $$0 = cvh.a(this.ak());
      return $$0 == null ? null : new cua($$0);
   }
}

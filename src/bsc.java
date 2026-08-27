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

public abstract class bsc extends bsa implements bsx {
   private static final ajm<Byte> b = ajq.a(bsc.class, ajo.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final jr bX = new jr(1, 0, 1);
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
   protected bxz bO;
   protected bya bP;
   protected bxy bQ;
   private final bxv bZ;
   protected cbl bR;
   protected final byy bS;
   protected final byy bT;
   @Nullable
   private bsa ca;
   private final cci cb;
   private final jf<csz> cc = jf.a(2, csz.i);
   protected final float[] bU = new float[2];
   private final jf<csz> cd = jf.a(4, csz.i);
   protected final float[] bV = new float[4];
   private csz ce = csz.i;
   protected float bW;
   private boolean cf;
   private boolean cg;
   private final Map<emr, Float> ch = Maps.newEnumMap(emr.class);
   @Nullable
   private akg<eoq> ci;
   private long cj;
   @Nullable
   private brh ck;
   private int cl;
   @Nullable
   private Either<UUID, in> cm;
   private in cn = in.c;
   private float co = -1.0F;

   protected bsc(brn<? extends bsc> $$0, dad $$1) {
      super($$0, $$1);
      this.bS = new byy($$1.ag());
      this.bT = new byy($$1.ag());
      this.bO = new bxz(this);
      this.bP = new bya(this);
      this.bQ = new bxy(this);
      this.bZ = this.E();
      this.bR = this.b($$1);
      this.cb = new cci(this);
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

   public static btg.a A() {
      return bsa.dS().a(bth.k, 16.0).a(bth.d);
   }

   protected cbl b(dad $$0) {
      return new cbk(this, $$0);
   }

   protected boolean B() {
      return false;
   }

   public float a(emr $$0) {
      bsc $$2;
      label17: {
         if (this.db() instanceof bsc $$1 && $$1.B()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.ch.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(emr $$0, float $$1) {
      this.ch.put($$0, $$1);
   }

   @Override
   public void C() {
   }

   @Override
   public void D() {
   }

   protected bxv E() {
      return new bxv(this);
   }

   public bxz G() {
      return this.bO;
   }

   public bya H() {
      return this.db() instanceof bsc $$0 ? $$0.H() : this.bP;
   }

   public bxy I() {
      return this.bQ;
   }

   public cbl K() {
      return this.db() instanceof bsc $$0 ? $$0.K() : this.bR;
   }

   @Nullable
   @Override
   public bsa cO() {
      brh $$0 = this.cR();
      if (!this.gf() && $$0 instanceof bsc $$1 && $$0.bS()) {
         return $$1;
      }

      return null;
   }

   public cci M() {
      return this.cb;
   }

   @Nullable
   @Override
   public bsa p() {
      return this.ca;
   }

   public void h(@Nullable bsa $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(brn<?> $$0) {
      return $$0 != brn.T;
   }

   public boolean a(ctq $$0) {
      return false;
   }

   public void N() {
      this.a(dva.m);
   }

   @Override
   protected void a(ajq.a $$0) {
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
   protected void e(bqf $$0) {
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
            this.dN().a(kx.Y, this.c(1.0) - $$1 * 10.0, this.dv() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
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
      boolean $$0 = !(this.cO() instanceof bsc);
      boolean $$1 = !(this.da() instanceof cne);
      this.bS.a(byx.a.a, $$0);
      this.bS.a(byx.a.c, $$0 && $$1);
      this.bS.a(byx.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bZ.a();
      return $$1;
   }

   @Nullable
   protected avb v() {
      return null;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fU());
      $$0.a("PersistenceRequired", this.cg);
      ug $$1 = new ug();

      for (csz $$2 : this.cd) {
         if (!$$2.d()) {
            $$1.add($$2.a(this.dP()));
         } else {
            $$1.add(new ua());
         }
      }

      $$0.a("ArmorItems", $$1);
      ug $$3 = new ug();

      for (float $$4 : this.bV) {
         $$3.add(ud.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      ug $$5 = new ug();

      for (csz $$6 : this.cc) {
         if (!$$6.d()) {
            $$5.add($$6.a(this.dP()));
         } else {
            $$5.add(new ua());
         }
      }

      $$0.a("HandItems", $$5);
      ug $$7 = new ug();

      for (float $$8 : this.bU) {
         $$7.add(ud.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.ce.d()) {
         $$0.a("body_armor_item", this.ce.a(this.dP()));
         $$0.a("body_armor_drop_chance", this.bW);
      }

      Either<UUID, in> $$9 = this.cm;
      if (this.ck instanceof bsa) {
         $$9 = Either.left(this.ck.cx());
      } else if (this.ck instanceof chj $$10) {
         $$9 = Either.right($$10.D());
      }

      if ($$9 != null) {
         $$0.a("leash", (ux)$$9.map($$0x -> {
            ua $$1x = new ua();
            $$1x.a("UUID", $$0x);
            return $$1x;
         }, up::a));
      }

      $$0.a("LeftHanded", this.gg());
      if (this.ci != null) {
         $$0.a("DeathLootTable", this.ci.a().toString());
         if (this.cj != 0L) {
            $$0.a("DeathLootTableSeed", this.cj);
         }
      }

      if (this.gf()) {
         $$0.a("NoAI", this.gf());
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.cg = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         ug $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cd.size(); $$2++) {
            ua $$3 = $$1.a($$2);
            this.cd.set($$2, csz.a(this.dP(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         ug $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bV[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         ug $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.cc.size(); $$7++) {
            ua $$8 = $$6.a($$7);
            this.cc.set($$7, csz.a(this.dP(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         ug $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bU[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.ce = csz.a(this.dP(), (ux)$$0.p("body_armor_item")).orElse(csz.i);
         this.bW = $$0.j("body_armor_drop_chance");
      } else {
         this.ce = csz.i;
      }

      if ($$0.b("leash", 10)) {
         this.cm = Either.left($$0.p("leash").a("UUID"));
      } else if ($$0.b("leash", 11)) {
         this.cm = up.a($$0, "leash").<Either<UUID, in>>map(Either::right).orElse(null);
      } else {
         this.cm = null;
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.ci = akg.a(le.aU, new akh($$0.l("DeathLootTable")));
         this.cj = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(bqf $$0, boolean $$1) {
      super.a($$0, $$1);
      this.ci = null;
   }

   @Override
   public final akg<eoq> eD() {
      return this.ci == null ? this.S() : this.ci;
   }

   protected akg<eoq> S() {
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
      if (!this.dN().B && this.fU() && this.bB() && !this.bf && this.dN().aa().b(czz.c)) {
         jr $$0 = this.U();

         for (chr $$2 : this.dN().a(chr.class, this.cI().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dI() && !$$2.p().d() && !$$2.y() && this.k($$2.p())) {
               this.b($$2);
            }
         }
      }

      this.dN().af().c();
   }

   protected jr U() {
      return bX;
   }

   protected void b(chr $$0) {
      csz $$1 = $$0.p();
      csz $$2 = this.i($$1.r());
      if (!$$2.d()) {
         this.a($$0);
         this.a($$0, $$2.G());
         $$1.h($$2.G());
         if ($$1.d()) {
            $$0.am();
         }
      }
   }

   public csz i(csz $$0) {
      bro $$1 = h($$0);
      csz $$2 = this.d($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bro.a;
         $$2 = this.d($$1);
         $$3 = $$2.d();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.g($$1);
         if (!$$2.d() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.G() > 1) {
            csz $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return csz.i;
      }
   }

   @Override
   protected void b(bro $$0, csz $$1) {
      this.a($$0, $$1);
      this.f($$0);
      this.cg = true;
   }

   public void f(bro $$0) {
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

   protected boolean b(csz $$0, csz $$1) {
      if ($$1.d()) {
         return true;
      } else if ($$0.f() instanceof cuk) {
         if (!($$1.f() instanceof cuk)) {
            return true;
         } else {
            double $$2 = this.o($$0);
            double $$3 = this.o($$1);
            return $$2 != $$3 ? $$2 > $$3 : this.c($$0, $$1);
         }
      } else if ($$0.f() instanceof crc && $$1.f() instanceof crc) {
         return this.c($$0, $$1);
      } else if ($$0.f() instanceof crm && $$1.f() instanceof crm) {
         return this.c($$0, $$1);
      } else if ($$0.f() instanceof cqo $$4) {
         if (cyh.f($$1)) {
            return false;
         } else if (!($$1.f() instanceof cqo)) {
            return true;
         } else {
            cqo $$5 = (cqo)$$1.f();
            if ($$4.i() != $$5.i()) {
               return $$4.i() > $$5.i();
            } else {
               return $$4.j() != $$5.j() ? $$4.j() > $$5.j() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.f() instanceof cro) {
            if ($$1.f() instanceof cqx) {
               return true;
            }

            if ($$1.f() instanceof cro) {
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

   private double o(csz $$0) {
      cvs $$1 = $$0.a(ka.l, cvs.a);
      return $$1.a(this.h(bth.c), bro.a);
   }

   public boolean c(csz $$0, csz $$1) {
      return $$0.m() < $$1.m() ? true : p($$0) && !p($$1);
   }

   private static boolean p(csz $$0) {
      jw $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(ka.d);
   }

   public boolean j(csz $$0) {
      return true;
   }

   public boolean k(csz $$0) {
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
      if (this.dN().ak() == bpj.a && this.W()) {
         this.am();
      } else if (!this.fV() && !this.V()) {
         brh $$0 = this.dN().a(this, -1.0);
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
      bma $$0 = this.dN().af();
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
      afw.a(this.dN(), this, this.bS);
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
      float $$2 = axz.g(this.aZ - $$1);
      float $$3 = axz.a(axz.g(this.aZ - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.n($$4);
   }

   public int fO() {
      return 10;
   }

   public void a(brh $$0, float $$1, float $$2) {
      double $$3 = $$0.ds() - this.ds();
      double $$4 = $$0.dy() - this.dy();
      double $$6;
      if ($$0 instanceof bsa $$5) {
         $$6 = $$5.dw() - this.dw();
      } else {
         $$6 = ($$0.cI().b + $$0.cI().e) / 2.0 - this.dw();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(axz.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(axz.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dF(), $$10, $$2));
      this.r(this.a(this.dD(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = axz.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(brn<? extends bsc> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      in $$5 = $$3.d();
      return $$2 == bse.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dae $$0, bse $$1) {
      return true;
   }

   public boolean a(dag $$0) {
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
   public Iterable<csz> eY() {
      return this.cc;
   }

   @Override
   public Iterable<csz> eX() {
      return this.cd;
   }

   public csz fQ() {
      return this.ce;
   }

   public boolean fR() {
      return false;
   }

   @Override
   public boolean c(bro $$0) {
      return true;
   }

   public boolean fS() {
      return !this.d(bro.g).d();
   }

   public boolean l(csz $$0) {
      return false;
   }

   public void m(csz $$0) {
      this.b(bro.g, $$0);
   }

   @Override
   public Iterable<csz> eZ() {
      return (Iterable<csz>)(this.ce.d() ? this.cd : Iterables.concat(this.cd, List.of(this.ce)));
   }

   @Override
   public csz d(bro $$0) {
      return switch ($$0.a()) {
         case a -> (csz)this.cc.get($$0.b());
         case b -> (csz)this.cd.get($$0.b());
         case c -> this.ce;
      };
   }

   @Override
   public void a(bro $$0, csz $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cc.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cd.set($$0.b(), $$1), $$1);
            break;
         case c:
            csz $$2 = this.ce;
            this.ce = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(bqf $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bro $$3 : bro.values()) {
         csz $$4 = this.d($$3);
         float $$5 = this.g($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.d() && !cyh.g($$4) && ($$2 || $$6) && Math.max(this.ah.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.k()) {
               $$4.b($$4.n() - this.ah.a(1 + this.ah.a(Math.max($$4.n() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, csz.i);
         }
      }
   }

   protected float g(bro $$0) {
      return switch ($$0.a()) {
         case a -> this.bU[$$0.b()];
         case b -> this.bV[$$0.b()];
         case c -> this.bW;
      };
   }

   protected void a(ayg $$0, bpk $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dN().ak() == bpj.d ? 0.1F : 0.25F;
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

         for (bro $$5 : bro.values()) {
            if ($$5.a() == bro.a.b) {
               csz $$6 = this.d($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.d()) {
                  csu $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new csz($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static csu a(bro $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return ctc.py;
            } else if ($$1 == 1) {
               return ctc.pO;
            } else if ($$1 == 2) {
               return ctc.pC;
            } else if ($$1 == 3) {
               return ctc.pG;
            } else if ($$1 == 4) {
               return ctc.pK;
            }
         case e:
            if ($$1 == 0) {
               return ctc.pz;
            } else if ($$1 == 1) {
               return ctc.pP;
            } else if ($$1 == 2) {
               return ctc.pD;
            } else if ($$1 == 3) {
               return ctc.pH;
            } else if ($$1 == 4) {
               return ctc.pL;
            }
         case d:
            if ($$1 == 0) {
               return ctc.pA;
            } else if ($$1 == 1) {
               return ctc.pQ;
            } else if ($$1 == 2) {
               return ctc.pE;
            } else if ($$1 == 3) {
               return ctc.pI;
            } else if ($$1 == 4) {
               return ctc.pM;
            }
         case c:
            if ($$1 == 0) {
               return ctc.pB;
            } else if ($$1 == 1) {
               return ctc.pR;
            } else if ($$1 == 2) {
               return ctc.pF;
            } else if ($$1 == 3) {
               return ctc.pJ;
            } else if ($$1 == 4) {
               return ctc.pN;
            }
         default:
            return null;
      }
   }

   protected void b(ayg $$0, bpk $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bro $$3 : bro.values()) {
         if ($$3.a() == bro.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(ayg $$0, float $$1) {
      if (!this.eV().d() && $$0.i() < 0.25F * $$1) {
         this.a(bro.a, cyh.a($$0, this.eV(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(ayg $$0, float $$1, bro $$2) {
      csz $$3 = this.d($$2);
      if (!$$3.d() && $$0.i() < 0.5F * $$1) {
         this.a($$2, cyh.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      ayg $$4 = $$0.E_();
      this.f(bth.k).d(new btf("Random spawn bonus", $$4.a(0.0, 0.11485000000000001), btf.a.b));
      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fT() {
      this.cg = true;
   }

   public void a(bro $$0, float $$1) {
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
   public boolean f(csz $$0) {
      bro $$1 = h($$0);
      return this.d($$1).d() && this.fU();
   }

   public boolean fV() {
      return this.cg;
   }

   @Override
   public final bpm a(clh $$0, bpl $$1) {
      if (!this.bB()) {
         return bpm.d;
      } else if (this.ge() == $$0) {
         this.a(true, !$$0.fN());
         this.a(dva.r, $$0);
         return bpm.a(this.dN().B);
      } else {
         bpm $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dva.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dva.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bpm c(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if ($$2.a(ctc.uK) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bpm.a(this.dN().B);
      } else {
         if ($$2.a(ctc.uL)) {
            bpm $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.f() instanceof cue) {
            if (this.dN() instanceof aqh) {
               cue $$4 = (cue)$$2.f();
               Optional<bsc> $$5 = $$4.a($$0, this, (brn<? extends bsc>)this.ai(), (aqh)this.dN(), this.dl(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bpm.a : bpm.d;
            } else {
               return bpm.b;
            }
         } else {
            return bpm.d;
         }
      }
   }

   protected void a(clh $$0, bsc $$1) {
   }

   protected bpm b(clh $$0, bpl $$1) {
      return bpm.d;
   }

   public boolean fW() {
      return this.a(this.dn());
   }

   public boolean a(in $$0) {
      return this.co == -1.0F ? true : this.cn.j($$0) < (double)(this.co * this.co);
   }

   public void a(in $$0, int $$1) {
      this.cn = $$0;
      this.co = (float)$$1;
   }

   public in fX() {
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
   public <T extends bsc> T a(brn<T> $$0, boolean $$1) {
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

               for (bro $$3 : bro.values()) {
                  csz $$4 = this.d($$3);
                  if (!$$4.d()) {
                     $$2.a($$3, $$4.e());
                     $$2.a($$3, this.g($$3));
                  }
               }
            }

            this.dN().b($$2);
            if (this.bP()) {
               brh $$5 = this.da();
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
            this.a(ctc.uK);
         }

         if (!this.dN().B && $$0 && this.dN() instanceof aqh) {
            ((aqh)this.dN()).l().b(this, new aer(this, null));
         }
      }
   }

   public boolean a(clh $$0) {
      return !this.gc() && !(this instanceof cif);
   }

   public boolean gc() {
      return this.ck != null;
   }

   public boolean gd() {
      return this.gc() || this.cm != null;
   }

   @Nullable
   public brh ge() {
      if (this.ck == null && this.cl != 0 && this.dN().B) {
         this.ck = this.dN().a(this.cl);
      }

      return this.ck;
   }

   public void b(brh $$0, boolean $$1) {
      this.ck = $$0;
      this.cm = null;
      if (!this.dN().B && $$1 && this.dN() instanceof aqh) {
         ((aqh)this.dN()).l().b(this, new aer(this, this.ck));
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
   public boolean a(brh $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.gc()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gl() {
      if (this.cm != null && this.dN() instanceof aqh $$0) {
         Optional<UUID> $$1 = this.cm.left();
         Optional<in> $$2 = this.cm.right();
         if ($$1.isPresent()) {
            brh $$3 = $$0.a($$1.get());
            if ($$3 != null) {
               this.b($$3, true);
               return;
            }
         } else if ($$2.isPresent()) {
            this.b(chl.b(this.dN(), $$2.get()), true);
            return;
         }

         if (this.ai > 100) {
            this.a(ctc.uK);
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
   public bru fs() {
      return this.gg() ? bru.a : bru.b;
   }

   public boolean i(bsa $$0) {
      return this.gi().c($$0.eI());
   }

   protected etk gi() {
      brh $$0 = this.da();
      etk $$3;
      if ($$0 != null) {
         etk $$1 = $$0.cI();
         etk $$2 = this.cI();
         $$3 = new etk(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cI();
      }

      return $$3.c(bY, 0.0, bY);
   }

   @Override
   public boolean C(brh $$0) {
      float $$1 = (float)this.g(bth.c);
      float $$2 = (float)this.g(bth.d);
      if ($$0 instanceof bsa) {
         $$1 += cyh.a(this.eV(), $$0.ai());
         $$2 += (float)cyh.c(this);
      }

      int $$3 = cyh.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dO().b((bsa)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof bsa) {
            ((bsa)$$0).q((double)($$2 * 0.5F), (double)axz.a(this.dD() * (float) (Math.PI / 180.0)), (double)(-axz.b(this.dD() * (float) (Math.PI / 180.0))));
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
         in $$1 = in.a(this.ds(), this.dw(), this.dy());
         boolean $$2 = this.be() || this.aB || this.aC;
         if ($$0 > 0.5F && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dN().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(awg<elz> $$0) {
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

   public void c(Predicate<byx> $$0) {
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
   public csz dA() {
      cue $$0 = cue.a(this.ai());
      return $$0 == null ? null : new csz($$0);
   }
}

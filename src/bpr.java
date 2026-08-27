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

public abstract class bpr extends bpp implements bqm {
   private static final aim<Byte> b = aiq.a(bpr.class, aio.a);
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
   protected bvo bN;
   protected bvp bO;
   protected bvn bP;
   private final bvk bY;
   protected bza bQ;
   protected final bwn bR;
   protected final bwn bS;
   @Nullable
   private bpp bZ;
   private final bzx ca;
   private final iu<cqm> cb = iu.a(2, cqm.h);
   protected final float[] bT = new float[2];
   private final iu<cqm> cc = iu.a(4, cqm.h);
   protected final float[] bU = new float[4];
   private cqm cd = cqm.h;
   protected float bV;
   private boolean ce;
   private boolean cf;
   private final Map<ejg, Float> cg = Maps.newEnumMap(ejg.class);
   @Nullable
   private ajh ch;
   private long ci;
   @Nullable
   private box cj;
   private int ck;
   @Nullable
   private Either<UUID, ib> cl;
   private ib cm = ib.c;
   private float cn = -1.0F;

   protected bpr(bpd<? extends bpr> $$0, cxb $$1) {
      super($$0, $$1);
      this.bR = new bwn($$1.af());
      this.bS = new bwn($$1.af());
      this.bN = new bvo(this);
      this.bO = new bvp(this);
      this.bP = new bvn(this);
      this.bY = this.E();
      this.bQ = this.b($$1);
      this.ca = new bzx(this);
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

   public static bqv.a A() {
      return bpp.dR().a(bqw.k, 16.0).a(bqw.d);
   }

   protected bza b(cxb $$0) {
      return new byz(this, $$0);
   }

   protected boolean B() {
      return false;
   }

   public float a(ejg $$0) {
      bpr $$2;
      label17: {
         if (this.da() instanceof bpr $$1 && $$1.B()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cg.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(ejg $$0, float $$1) {
      this.cg.put($$0, $$1);
   }

   @Override
   public void C() {
   }

   public void D() {
   }

   protected bvk E() {
      return new bvk(this);
   }

   public bvo G() {
      return this.bN;
   }

   public bvp H() {
      return this.da() instanceof bpr $$0 ? $$0.H() : this.bO;
   }

   public bvn I() {
      return this.bP;
   }

   public bza K() {
      return this.da() instanceof bpr $$0 ? $$0.K() : this.bQ;
   }

   @Nullable
   @Override
   public bpp cN() {
      box $$0 = this.cQ();
      if (!this.gd() && $$0 instanceof bpr $$1 && $$0.bR()) {
         return $$1;
      }

      return null;
   }

   public bzx M() {
      return this.ca;
   }

   @Nullable
   @Override
   public bpp p() {
      return this.bZ;
   }

   public void h(@Nullable bpp $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean a(bpd<?> $$0) {
      return $$0 != bpd.U;
   }

   public boolean a(crc $$0) {
      return false;
   }

   public void N() {
      this.b(drp.m);
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
   protected void e(bnw $$0) {
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
      boolean $$0 = !(this.cN() instanceof bpr);
      boolean $$1 = !(this.cZ() instanceof ckr);
      this.bR.a(bwm.a.a, $$0);
      this.bR.a(bwm.a.c, $$0 && $$1);
      this.bR.a(bwm.a.b, $$0);
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

      for (cqm $$2 : this.cc) {
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

      for (cqm $$7 : this.cb) {
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
      if (this.cj instanceof bpp) {
         $$11 = Either.left(this.cj.cw());
      } else if (this.cj instanceof cew $$12) {
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
            this.cc.set($$2, cqm.a($$1.a($$2)));
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
            this.cb.set($$6, cqm.a($$5.a($$6)));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         tg $$7 = $$0.c("HandDropChances", 5);

         for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
            this.bT[$$8] = $$7.i($$8);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cd = cqm.a($$0.p("body_armor_item"));
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
   protected void a(bnw $$0, boolean $$1) {
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
      if (!this.dM().B && this.fT() && this.bA() && !this.bd && this.dM().Z().b(cwx.c)) {
         jg $$0 = this.U();

         for (cfe $$2 : this.dM().a(cfe.class, this.cH().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
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

   protected void b(cfe $$0) {
      cqm $$1 = $$0.p();
      cqm $$2 = this.i($$1.q());
      if (!$$2.b()) {
         this.a($$0);
         this.a($$0, $$2.M());
         $$1.h($$2.M());
         if ($$1.b()) {
            $$0.am();
         }
      }
   }

   public cqm i(cqm $$0) {
      bpe $$1 = h($$0);
      cqm $$2 = this.d($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bpe.a;
         $$2 = this.d($$1);
         $$3 = $$2.b();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.g($$1);
         if (!$$2.b() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.M() > 1) {
            cqm $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return cqm.h;
      }
   }

   @Override
   protected void b(bpe $$0, cqm $$1) {
      this.a($$0, $$1);
      this.f($$0);
      this.cf = true;
   }

   public void f(bpe $$0) {
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

   protected boolean b(cqm $$0, cqm $$1) {
      if ($$1.b()) {
         return true;
      } else if ($$0.d() instanceof crx) {
         if (!($$1.d() instanceof crx)) {
            return true;
         } else {
            crx $$2 = (crx)$$0.d();
            crx $$3 = (crx)$$1.d();
            return $$2.h() != $$3.h() ? $$2.h() > $$3.h() : this.c($$0, $$1);
         }
      } else if ($$0.d() instanceof com && $$1.d() instanceof com) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cox && $$1.d() instanceof cox) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cny $$4) {
         if (cux.d($$1)) {
            return false;
         } else if (!($$1.d() instanceof cny)) {
            return true;
         } else {
            cny $$5 = (cny)$$1.d();
            if ($$4.g() != $$5.g()) {
               return $$4.g() > $$5.g();
            } else {
               return $$4.h() != $$5.h() ? $$4.h() > $$5.h() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.d() instanceof coz) {
            if ($$1.d() instanceof coh) {
               return true;
            }

            if ($$1.d() instanceof coz $$6) {
               coz $$7 = (coz)$$0.d();
               if ($$7.c() != $$6.c()) {
                  return $$7.c() > $$6.c();
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   public boolean c(cqm $$0, cqm $$1) {
      if ($$0.l() >= $$1.l() && (!$$0.v() || $$1.v())) {
         return $$0.v() && $$1.v()
            ? $$0.w().e().stream().anyMatch($$0x -> !$$0x.equals("Damage")) && !$$1.w().e().stream().anyMatch($$0x -> !$$0x.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean j(cqm $$0) {
      return true;
   }

   public boolean k(cqm $$0) {
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
      if (this.dM().aj() == bna.a && this.W()) {
         this.am();
      } else if (!this.fU() && !this.V()) {
         box $$0 = this.dM().a(this, -1.0);
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
      bjr $$0 = this.dM().ae();
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

   public void a(box $$0, float $$1, float $$2) {
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.dx() - this.dx();
      double $$6;
      if ($$0 instanceof bpp $$5) {
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

   public static boolean a(bpd<? extends bpr> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      ib $$5 = $$3.d();
      return $$2 == bpt.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(cxc $$0, bpt $$1) {
      return true;
   }

   public boolean a(cxe $$0) {
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
   public Iterable<cqm> eX() {
      return this.cb;
   }

   @Override
   public Iterable<cqm> eW() {
      return this.cc;
   }

   public cqm fP() {
      return this.cd;
   }

   public boolean fQ() {
      return false;
   }

   @Override
   public boolean c(bpe $$0) {
      return true;
   }

   public boolean fR() {
      return !this.d(bpe.g).b();
   }

   public boolean l(cqm $$0) {
      return false;
   }

   public void m(cqm $$0) {
      this.b(bpe.g, $$0);
   }

   @Override
   public Iterable<cqm> eY() {
      return (Iterable<cqm>)(this.cd.b() ? this.cc : Iterables.concat(this.cc, List.of(this.cd)));
   }

   @Override
   public cqm d(bpe $$0) {
      return switch ($$0.a()) {
         case a -> (cqm)this.cb.get($$0.b());
         case b -> (cqm)this.cc.get($$0.b());
         case c -> this.cd;
      };
   }

   @Override
   public void a(bpe $$0, cqm $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cb.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cc.set($$0.b(), $$1), $$1);
            break;
         case c:
            cqm $$2 = this.cd;
            this.cd = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(bnw $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bpe $$3 : bpe.values()) {
         cqm $$4 = this.d($$3);
         float $$5 = this.g($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.b() && !cux.e($$4) && ($$2 || $$6) && Math.max(this.ag.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.i()) {
               $$4.b($$4.m() - this.ag.a(1 + this.ag.a(Math.max($$4.m() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, cqm.h);
         }
      }
   }

   protected float g(bpe $$0) {
      return switch ($$0.a()) {
         case a -> this.bT[$$0.b()];
         case b -> this.bU[$$0.b()];
         case c -> this.bV;
      };
   }

   protected void a(axd $$0, bnb $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dM().aj() == bna.d ? 0.1F : 0.25F;
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

         for (bpe $$5 : bpe.values()) {
            if ($$5.a() == bpe.a.b) {
               cqm $$6 = this.d($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.b()) {
                  cqh $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cqm($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cqh a(bpe $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cqp.px;
            } else if ($$1 == 1) {
               return cqp.pN;
            } else if ($$1 == 2) {
               return cqp.pB;
            } else if ($$1 == 3) {
               return cqp.pF;
            } else if ($$1 == 4) {
               return cqp.pJ;
            }
         case e:
            if ($$1 == 0) {
               return cqp.py;
            } else if ($$1 == 1) {
               return cqp.pO;
            } else if ($$1 == 2) {
               return cqp.pC;
            } else if ($$1 == 3) {
               return cqp.pG;
            } else if ($$1 == 4) {
               return cqp.pK;
            }
         case d:
            if ($$1 == 0) {
               return cqp.pz;
            } else if ($$1 == 1) {
               return cqp.pP;
            } else if ($$1 == 2) {
               return cqp.pD;
            } else if ($$1 == 3) {
               return cqp.pH;
            } else if ($$1 == 4) {
               return cqp.pL;
            }
         case c:
            if ($$1 == 0) {
               return cqp.pA;
            } else if ($$1 == 1) {
               return cqp.pQ;
            } else if ($$1 == 2) {
               return cqp.pE;
            } else if ($$1 == 3) {
               return cqp.pI;
            } else if ($$1 == 4) {
               return cqp.pM;
            }
         default:
            return null;
      }
   }

   protected void b(axd $$0, bnb $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bpe $$3 : bpe.values()) {
         if ($$3.a() == bpe.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(axd $$0, float $$1) {
      if (!this.eU().b() && $$0.i() < 0.25F * $$1) {
         this.a(bpe.a, cux.a($$0, this.eU(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(axd $$0, float $$1, bpe $$2) {
      cqm $$3 = this.d($$2);
      if (!$$3.b() && $$0.i() < 0.5F * $$1) {
         this.a($$2, cux.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      axd $$4 = $$0.E_();
      this.f(bqw.k).d(new bqu("Random spawn bonus", $$4.a(0.0, 0.11485000000000001), bqu.a.b));
      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fS() {
      this.cf = true;
   }

   public void a(bpe $$0, float $$1) {
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
   public boolean f(cqm $$0) {
      bpe $$1 = h($$0);
      return this.d($$1).b() && this.fT();
   }

   public boolean fU() {
      return this.cf;
   }

   @Override
   public final bnd a(ciu $$0, bnc $$1) {
      if (!this.bA()) {
         return bnd.d;
      } else if (this.gc() == $$0) {
         this.a(true, !$$0.fM());
         this.a(drp.r, $$0);
         return bnd.a(this.dM().B);
      } else {
         bnd $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(drp.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(drp.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bnd c(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if ($$2.a(cqp.uI) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bnd.a(this.dM().B);
      } else {
         if ($$2.a(cqp.uJ)) {
            bnd $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.d() instanceof crr) {
            if (this.dM() instanceof apf) {
               crr $$4 = (crr)$$2.d();
               Optional<bpr> $$5 = $$4.a($$0, this, (bpd<? extends bpr>)this.ai(), (apf)this.dM(), this.dk(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bnd.a : bnd.d;
            } else {
               return bnd.b;
            }
         } else {
            return bnd.d;
         }
      }
   }

   protected void a(ciu $$0, bpr $$1) {
   }

   protected bnd b(ciu $$0, bnc $$1) {
      return bnd.d;
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
   public <T extends bpr> T a(bpd<T> $$0, boolean $$1) {
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

               for (bpe $$3 : bpe.values()) {
                  cqm $$4 = this.d($$3);
                  if (!$$4.b()) {
                     $$2.a($$3, $$4.c());
                     $$2.a($$3, this.g($$3));
                  }
               }
            }

            this.dM().b($$2);
            if (this.bO()) {
               box $$5 = this.cZ();
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
            this.a(cqp.uI);
         }

         if (!this.dM().B && $$0 && this.dM() instanceof apf) {
            ((apf)this.dM()).l().b(this, new adr(this, null));
         }
      }
   }

   public boolean a(ciu $$0) {
      return !this.gb() && !(this instanceof cfs);
   }

   public boolean gb() {
      return this.cj != null;
   }

   @Nullable
   public box gc() {
      if (this.cj == null && this.ck != 0 && this.dM().B) {
         this.cj = this.dM().a(this.ck);
      }

      return this.cj;
   }

   public void b(box $$0, boolean $$1) {
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
   public boolean a(box $$0, boolean $$1) {
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
            box $$3 = $$0.a($$1.get());
            if ($$3 != null) {
               this.b($$3, true);
               return;
            }
         } else if ($$2.isPresent()) {
            this.b(cey.b(this.dM(), $$2.get()), true);
            return;
         }

         if (this.ah > 100) {
            this.a(cqp.uI);
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
   public bpj fr() {
      return this.ge() ? bpj.a : bpj.b;
   }

   public boolean i(bpp $$0) {
      return this.gg().c($$0.eH());
   }

   protected epo gg() {
      box $$0 = this.cZ();
      epo $$3;
      if ($$0 != null) {
         epo $$1 = $$0.cH();
         epo $$2 = this.cH();
         $$3 = new epo(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cH();
      }

      return $$3.c(bX, 0.0, bX);
   }

   @Override
   public boolean C(box $$0) {
      float $$1 = (float)this.g(bqw.c);
      float $$2 = (float)this.g(bqw.d);
      if ($$0 instanceof bpp) {
         $$1 += cux.a(this.eU(), $$0.ai());
         $$2 += (float)cux.c(this);
      }

      int $$3 = cux.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dN().b((bpp)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof bpp) {
            ((bpp)$$0).q((double)($$2 * 0.5F), (double)aww.a(this.dC() * (float) (Math.PI / 180.0)), (double)(-aww.b(this.dC() * (float) (Math.PI / 180.0))));
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
   protected void c(avd<eio> $$0) {
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

   public void c(Predicate<bwm> $$0) {
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
   public cqm dz() {
      crr $$0 = crr.a(this.ai());
      return $$0 == null ? null : new cqm($$0);
   }
}

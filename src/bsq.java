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

public abstract class bsq extends bso implements btl {
   private static final ajy<Byte> b = akc.a(bsq.class, aka.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final jv cg = new jv(1, 0, 1);
   public static final float g = 0.15F;
   public static final float h = 0.55F;
   public static final float i = 0.5F;
   public static final float bQ = 0.25F;
   public static final String bR = "leash";
   public static final float bS = 0.085F;
   public static final int bT = 2;
   public static final int bU = 2;
   private static final double ch = Math.sqrt(2.04F) - 0.6F;
   public int bV;
   protected int bW;
   protected byn bX;
   protected byo bY;
   protected bym bZ;
   private final byj ci;
   protected cbz ca;
   protected final bzm cb;
   protected final bzm cc;
   @Nullable
   private bso cj;
   private final ccw ck;
   private final jj<cuh> cl = jj.a(2, cuh.i);
   protected final float[] cd = new float[2];
   private final jj<cuh> cm = jj.a(4, cuh.i);
   protected final float[] ce = new float[4];
   private cuh cn = cuh.i;
   protected float cf;
   private boolean co;
   private boolean cp;
   private final Map<epv, Float> cq = Maps.newEnumMap(epv.class);
   @Nullable
   private aks<eru> cr;
   private long cs;
   @Nullable
   private brv ct;
   private int cu;
   @Nullable
   private Either<UUID, ir> cv;
   private ir cw = ir.c;
   private float cx = -1.0F;

   protected bsq(bsb<? extends bsq> $$0, dca $$1) {
      super($$0, $$1);
      this.cb = new bzm($$1.ah());
      this.cc = new bzm($$1.ah());
      this.bX = new byn(this);
      this.bY = new byo(this);
      this.bZ = new bym(this);
      this.ci = this.E();
      this.ca = this.b($$1);
      this.ck = new ccw(this);
      Arrays.fill(this.ce, 0.085F);
      Arrays.fill(this.cd, 0.085F);
      this.cf = 0.085F;
      if ($$1 != null && !$$1.C) {
         this.y();
      }
   }

   @Override
   protected void y() {
   }

   public static btu.a A() {
      return bso.eb().a(btv.k, 16.0).a(btv.d);
   }

   protected cbz b(dca $$0) {
      return new cby(this, $$0);
   }

   protected boolean B() {
      return false;
   }

   public float a(epv $$0) {
      bsq $$2;
      label17: {
         if (this.di() instanceof bsq $$1 && $$1.B()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cq.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(epv $$0, float $$1) {
      this.cq.put($$0, $$1);
   }

   @Override
   public void C() {
   }

   @Override
   public void D() {
   }

   protected byj E() {
      return new byj(this);
   }

   public byn F() {
      return this.bX;
   }

   public byo G() {
      return this.di() instanceof bsq $$0 ? $$0.G() : this.bY;
   }

   public bym I() {
      return this.bZ;
   }

   public cbz J() {
      return this.di() instanceof bsq $$0 ? $$0.J() : this.ca;
   }

   @Nullable
   @Override
   public bso cV() {
      brv $$0 = this.cY();
      if (!this.go() && $$0 instanceof bsq $$1 && $$0.bZ()) {
         return $$1;
      }

      return null;
   }

   public ccw K() {
      return this.ck;
   }

   @Nullable
   @Override
   public bso p() {
      return this.cj;
   }

   public void h(@Nullable bso $$0) {
      this.cj = $$0;
   }

   @Override
   public boolean a(bsb<?> $$0) {
      return $$0 != bsb.V;
   }

   public boolean a(cvi $$0) {
      return false;
   }

   public void M() {
      this.a(dxv.m);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   public int O() {
      return 80;
   }

   public void P() {
      this.b(this.u());
   }

   @Override
   public void au() {
      super.au();
      this.dU().ag().a("mobBaseTick");
      if (this.bI() && this.al.a(1000) < this.bV++) {
         this.r();
         this.P();
      }

      this.dU().ag().c();
   }

   @Override
   protected void e(bqt $$0) {
      this.r();
      super.e($$0);
   }

   private void r() {
      this.bV = -this.O();
   }

   @Override
   public int er() {
      if (this.bW > 0) {
         int $$0 = this.bW;

         for (int $$1 = 0; $$1 < this.cm.size(); $$1++) {
            if (!this.cm.get($$1).d() && this.ce[$$1] <= 1.0F) {
               $$0 += 1 + this.al.a(3);
            }
         }

         for (int $$2 = 0; $$2 < this.cl.size(); $$2++) {
            if (!this.cl.get($$2).d() && this.cd[$$2] <= 1.0F) {
               $$0 += 1 + this.al.a(3);
            }
         }

         if (!this.cn.d() && this.cf <= 1.0F) {
            $$0 += 1 + this.al.a(3);
         }

         return $$0;
      } else {
         return this.bW;
      }
   }

   public void Q() {
      if (this.dU().C) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.al.k() * 0.02;
            double $$2 = this.al.k() * 0.02;
            double $$3 = this.al.k() * 0.02;
            double $$4 = 10.0;
            this.dU().a(lb.Z, this.c(1.0) - $$1 * 10.0, this.dC() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dU().a(this, (byte)20);
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
      if (!this.dU().C) {
         this.gk();
         if (this.am % 5 == 0) {
            this.R();
         }
      }
   }

   protected void R() {
      boolean $$0 = !(this.cV() instanceof bsq);
      boolean $$1 = !(this.dh() instanceof cny);
      this.cb.a(bzl.a.a, $$0);
      this.cb.a(bzl.a.c, $$0 && $$1);
      this.cb.a(bzl.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.ci.a();
      return $$1;
   }

   @Nullable
   protected avn u() {
      return null;
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.gd());
      $$0.a("PersistenceRequired", this.cp);
      uq $$1 = new uq();

      for (cuh $$2 : this.cm) {
         if (!$$2.d()) {
            $$1.add($$2.a(this.dY()));
         } else {
            $$1.add(new uk());
         }
      }

      $$0.a("ArmorItems", $$1);
      uq $$3 = new uq();

      for (float $$4 : this.ce) {
         $$3.add(un.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      uq $$5 = new uq();

      for (cuh $$6 : this.cl) {
         if (!$$6.d()) {
            $$5.add($$6.a(this.dY()));
         } else {
            $$5.add(new uk());
         }
      }

      $$0.a("HandItems", $$5);
      uq $$7 = new uq();

      for (float $$8 : this.cd) {
         $$7.add(un.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.cn.d()) {
         $$0.a("body_armor_item", this.cn.a(this.dY()));
         $$0.a("body_armor_drop_chance", this.cf);
      }

      Either<UUID, ir> $$9 = this.cv;
      if (this.ct instanceof bso) {
         $$9 = Either.left(this.ct.cE());
      } else if (this.ct instanceof chy $$10) {
         $$9 = Either.right($$10.D());
      }

      if ($$9 != null) {
         $$0.a("leash", (vh)$$9.map($$0x -> {
            uk $$1x = new uk();
            $$1x.a("UUID", $$0x);
            return $$1x;
         }, uz::a));
      }

      $$0.a("LeftHanded", this.gp());
      if (this.cr != null) {
         $$0.a("DeathLootTable", this.cr.a().toString());
         if (this.cs != 0L) {
            $$0.a("DeathLootTableSeed", this.cs);
         }
      }

      if (this.go()) {
         $$0.a("NoAI", this.go());
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.cp = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         uq $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cm.size(); $$2++) {
            uk $$3 = $$1.a($$2);
            this.cm.set($$2, cuh.a(this.dY(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         uq $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.ce[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         uq $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.cl.size(); $$7++) {
            uk $$8 = $$6.a($$7);
            this.cl.set($$7, cuh.a(this.dY(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         uq $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.cd[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cn = cuh.a(this.dY(), (vh)$$0.p("body_armor_item")).orElse(cuh.i);
         this.cf = $$0.j("body_armor_drop_chance");
      } else {
         this.cn = cuh.i;
      }

      if ($$0.b("leash", 10)) {
         this.cv = Either.left($$0.p("leash").a("UUID"));
      } else if ($$0.b("leash", 11)) {
         this.cv = uz.a($$0, "leash").<Either<UUID, ir>>map(Either::right).orElse(null);
      } else {
         this.cv = null;
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cr = aks.a(li.aU, new akt($$0.l("DeathLootTable")));
         this.cs = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(bqt $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cr = null;
   }

   @Override
   public final aks<eru> eM() {
      return this.cr == null ? this.S() : this.cr;
   }

   protected aks<eru> S() {
      return super.eM();
   }

   @Override
   public long eN() {
      return this.cs;
   }

   public void C(float $$0) {
      this.bB = $$0;
   }

   public void D(float $$0) {
      this.bA = $$0;
   }

   public void E(float $$0) {
      this.bz = $$0;
   }

   @Override
   public void y(float $$0) {
      super.y($$0);
      this.C($$0);
   }

   public void T() {
      this.J().n();
      this.E(0.0F);
      this.D(0.0F);
      this.y(0.0F);
   }

   @Override
   public void m_() {
      super.m_();
      this.dU().ag().a("looting");
      if (!this.dU().C && this.gd() && this.bI() && !this.bp && this.dU().ab().b(dbw.c)) {
         jv $$0 = this.U();

         for (cig $$2 : this.dU().a(cig.class, this.cP().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dP() && !$$2.p().d() && !$$2.y() && this.k($$2.p())) {
               this.b($$2);
            }
         }
      }

      this.dU().ag().c();
   }

   protected jv U() {
      return cg;
   }

   protected void b(cig $$0) {
      cuh $$1 = $$0.p();
      cuh $$2 = this.i($$1.r());
      if (!$$2.d()) {
         this.a($$0);
         this.a($$0, $$2.G());
         $$1.h($$2.G());
         if ($$1.d()) {
            $$0.ao();
         }
      }
   }

   public cuh i(cuh $$0) {
      bsc $$1 = h($$0);
      cuh $$2 = this.d($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bsc.a;
         $$2 = this.d($$1);
         $$3 = $$2.d();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.g($$1);
         if (!$$2.d() && (double)Math.max(this.al.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.G() > 1) {
            cuh $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return cuh.i;
      }
   }

   @Override
   protected void b(bsc $$0, cuh $$1) {
      this.a($$0, $$1);
      this.f($$0);
      this.cp = true;
   }

   public void f(bsc $$0) {
      switch ($$0.a()) {
         case a:
            this.cd[$$0.b()] = 2.0F;
            break;
         case b:
            this.ce[$$0.b()] = 2.0F;
            break;
         case c:
            this.cf = 2.0F;
      }
   }

   protected boolean b(cuh $$0, cuh $$1) {
      if ($$1.d()) {
         return true;
      } else if ($$0.f() instanceof cwc) {
         if (!($$1.f() instanceof cwc)) {
            return true;
         } else {
            double $$2 = this.o($$0);
            double $$3 = this.o($$1);
            return $$2 != $$3 ? $$2 > $$3 : this.c($$0, $$1);
         }
      } else if ($$0.f() instanceof csh && $$1.f() instanceof csh) {
         return this.c($$0, $$1);
      } else if ($$0.f() instanceof css && $$1.f() instanceof css) {
         return this.c($$0, $$1);
      } else if ($$0.f() instanceof crt $$4) {
         if (dae.f($$1)) {
            return false;
         } else if (!($$1.f() instanceof crt)) {
            return true;
         } else {
            crt $$5 = (crt)$$1.f();
            if ($$4.i() != $$5.i()) {
               return $$4.i() > $$5.i();
            } else {
               return $$4.j() != $$5.j() ? $$4.j() > $$5.j() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.f() instanceof csu) {
            if ($$1.f() instanceof csc) {
               return true;
            }

            if ($$1.f() instanceof csu) {
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

   private double o(cuh $$0) {
      cxl $$1 = $$0.a(ke.l, cxl.a);
      return $$1.a(this.h(btv.c), bsc.a);
   }

   public boolean c(cuh $$0, cuh $$1) {
      return $$0.m() < $$1.m() ? true : p($$0) && !p($$1);
   }

   private static boolean p(cuh $$0) {
      ka $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(ke.d);
   }

   public boolean j(cuh $$0) {
      return true;
   }

   public boolean k(cuh $$0) {
      return this.j($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean V() {
      return this.bW();
   }

   protected boolean W() {
      return false;
   }

   @Override
   public void dG() {
      if (this.dU().al() == bpx.a && this.W()) {
         this.ao();
      } else if (!this.ge() && !this.V()) {
         brv $$0 = this.dU().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.ak().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.ao();
            }

            int $$4 = this.ak().f().g();
            int $$5 = $$4 * $$4;
            if (this.bq > 600 && this.al.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.ao();
            } else if ($$1 < (double)$$5) {
               this.bq = 0;
            }
         }
      } else {
         this.bq = 0;
      }
   }

   @Override
   protected final void fz() {
      this.bq++;
      bmo $$0 = this.dU().ag();
      $$0.a("sensing");
      this.ck.a();
      $$0.c();
      int $$1 = this.am + this.al();
      if ($$1 % 2 != 0 && this.am > 1) {
         $$0.a("targetSelector");
         this.cc.a(false);
         $$0.c();
         $$0.a("goalSelector");
         this.cb.a(false);
         $$0.c();
      } else {
         $$0.a("targetSelector");
         this.cc.a();
         $$0.c();
         $$0.a("goalSelector");
         this.cb.a();
         $$0.c();
      }

      $$0.a("navigation");
      this.ca.c();
      $$0.c();
      $$0.a("mob tick");
      this.Y();
      $$0.c();
      $$0.a("controls");
      $$0.a("move");
      this.bY.a();
      $$0.b("look");
      this.bX.a();
      $$0.b("jump");
      this.bZ.b();
      $$0.c();
      $$0.c();
      this.X();
   }

   protected void X() {
      agi.a(this.dU(), this, this.cb);
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
      float $$1 = this.cx();
      float $$2 = aym.g(this.bj - $$1);
      float $$3 = aym.a(aym.g(this.bj - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.n($$4);
   }

   public int ac() {
      return 10;
   }

   public void a(brv $$0, float $$1, float $$2) {
      double $$3 = $$0.dz() - this.dz();
      double $$4 = $$0.dF() - this.dF();
      double $$6;
      if ($$0 instanceof bso $$5) {
         $$6 = $$5.dD() - this.dD();
      } else {
         $$6 = ($$0.cP().b + $$0.cP().e) / 2.0 - this.dD();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(aym.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(aym.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dM(), $$10, $$2));
      this.r(this.a(this.dK(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = aym.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bsb<? extends bsq> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      ir $$5 = $$3.d();
      return $$2 == bss.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dcb $$0, bss $$1) {
      return true;
   }

   public boolean a(dcd $$0) {
      return !$$0.d(this.cP()) && $$0.f(this);
   }

   public int ad() {
      return 4;
   }

   public boolean d(int $$0) {
      return false;
   }

   @Override
   public int cC() {
      if (this.p() == null) {
         return this.u(0.0F);
      } else {
         int $$0 = (int)(this.eI() - this.eZ() * 0.33F);
         $$0 -= (3 - this.dU().al().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.u((float)$$0);
      }
   }

   @Override
   public Iterable<cuh> fj() {
      return this.cl;
   }

   @Override
   public Iterable<cuh> fi() {
      return this.cm;
   }

   public cuh fZ() {
      return this.cn;
   }

   public boolean ga() {
      return false;
   }

   @Override
   public boolean c(bsc $$0) {
      return true;
   }

   public boolean gb() {
      return !this.d(bsc.g).d();
   }

   public boolean l(cuh $$0) {
      return false;
   }

   public void m(cuh $$0) {
      this.b(bsc.g, $$0);
   }

   @Override
   public Iterable<cuh> fk() {
      return (Iterable<cuh>)(this.cn.d() ? this.cm : Iterables.concat(this.cm, List.of(this.cn)));
   }

   @Override
   public cuh d(bsc $$0) {
      return switch ($$0.a()) {
         case a -> (cuh)this.cl.get($$0.b());
         case b -> (cuh)this.cm.get($$0.b());
         case c -> this.cn;
      };
   }

   @Override
   public void a(bsc $$0, cuh $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cl.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cm.set($$0.b(), $$1), $$1);
            break;
         case c:
            cuh $$2 = this.cn;
            this.cn = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(bqt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bsc $$3 : bsc.values()) {
         cuh $$4 = this.d($$3);
         float $$5 = this.g($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.d() && !dae.g($$4) && ($$2 || $$6) && Math.max(this.al.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.k()) {
               $$4.b($$4.n() - this.al.a(1 + this.al.a(Math.max($$4.n() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, cuh.i);
         }
      }
   }

   protected float g(bsc $$0) {
      return switch ($$0.a()) {
         case a -> this.cd[$$0.b()];
         case b -> this.ce[$$0.b()];
         case c -> this.cf;
      };
   }

   protected void a(ayt $$0, bpy $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dU().al() == bpx.d ? 0.1F : 0.25F;
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

         for (bsc $$5 : bsc.values()) {
            if ($$5.a() == bsc.a.b) {
               cuh $$6 = this.d($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.d()) {
                  cuc $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cuh($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cuc a(bsc $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cuk.qR;
            } else if ($$1 == 1) {
               return cuk.rh;
            } else if ($$1 == 2) {
               return cuk.qV;
            } else if ($$1 == 3) {
               return cuk.qZ;
            } else if ($$1 == 4) {
               return cuk.rd;
            }
         case e:
            if ($$1 == 0) {
               return cuk.qS;
            } else if ($$1 == 1) {
               return cuk.ri;
            } else if ($$1 == 2) {
               return cuk.qW;
            } else if ($$1 == 3) {
               return cuk.ra;
            } else if ($$1 == 4) {
               return cuk.re;
            }
         case d:
            if ($$1 == 0) {
               return cuk.qT;
            } else if ($$1 == 1) {
               return cuk.rj;
            } else if ($$1 == 2) {
               return cuk.qX;
            } else if ($$1 == 3) {
               return cuk.rb;
            } else if ($$1 == 4) {
               return cuk.rf;
            }
         case c:
            if ($$1 == 0) {
               return cuk.qU;
            } else if ($$1 == 1) {
               return cuk.rk;
            } else if ($$1 == 2) {
               return cuk.qY;
            } else if ($$1 == 3) {
               return cuk.rc;
            } else if ($$1 == 4) {
               return cuk.rg;
            }
         default:
            return null;
      }
   }

   protected void b(ayt $$0, bpy $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bsc $$3 : bsc.values()) {
         if ($$3.a() == bsc.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(ayt $$0, float $$1) {
      if (!this.fg().d() && $$0.i() < 0.25F * $$1) {
         this.a(bsc.a, dae.a($$0, this.fg(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(ayt $$0, float $$1, bsc $$2) {
      cuh $$3 = this.d($$2);
      if (!$$3.d() && $$0.i() < 0.5F * $$1) {
         this.a($$2, dae.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      ayt $$4 = $$0.F_();
      this.f(btv.k).d(new btt("Random spawn bonus", $$4.a(0.0, 0.11485000000000001), btt.a.b));
      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void gc() {
      this.cp = true;
   }

   public void a(bsc $$0, float $$1) {
      switch ($$0.a()) {
         case a:
            this.cd[$$0.b()] = $$1;
            break;
         case b:
            this.ce[$$0.b()] = $$1;
            break;
         case c:
            this.cf = $$1;
      }
   }

   public boolean gd() {
      return this.co;
   }

   public void a_(boolean $$0) {
      this.co = $$0;
   }

   @Override
   public boolean f(cuh $$0) {
      bsc $$1 = h($$0);
      return this.d($$1).d() && this.gd();
   }

   public boolean ge() {
      return this.cp;
   }

   @Override
   public final bqa a(cly $$0, bpz $$1) {
      if (!this.bI()) {
         return bqa.d;
      } else if (this.gn() == $$0) {
         this.a(true, !$$0.fY());
         this.a(dxv.r, $$0);
         return bqa.a(this.dU().C);
      } else {
         bqa $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dxv.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dxv.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bqa c(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if ($$2.a(cuk.wv) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bqa.a(this.dU().C);
      } else {
         if ($$2.a(cuk.ww)) {
            bqa $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.f() instanceof cvw) {
            if (this.dU() instanceof aqt) {
               cvw $$4 = (cvw)$$2.f();
               Optional<bsq> $$5 = $$4.a($$0, this, (bsb<? extends bsq>)this.ak(), (aqt)this.dU(), this.ds(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bqa.a : bqa.d;
            } else {
               return bqa.b;
            }
         } else {
            return bqa.d;
         }
      }
   }

   protected void a(cly $$0, bsq $$1) {
   }

   protected bqa b(cly $$0, bpz $$1) {
      return bqa.d;
   }

   public boolean gf() {
      return this.a(this.du());
   }

   public boolean a(ir $$0) {
      return this.cx == -1.0F ? true : this.cw.j($$0) < (double)(this.cx * this.cx);
   }

   public void a(ir $$0, int $$1) {
      this.cw = $$0;
      this.cx = (float)$$1;
   }

   public ir gg() {
      return this.cw;
   }

   public float gh() {
      return this.cx;
   }

   public void gi() {
      this.cx = -1.0F;
   }

   public boolean gj() {
      return this.cx != -1.0F;
   }

   @Nullable
   public <T extends bsq> T a(bsb<T> $$0, boolean $$1) {
      if (this.dP()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dU());
         if ($$2 == null) {
            return null;
         } else {
            $$2.v(this);
            $$2.a(this.o_());
            $$2.t(this.go());
            if (this.ag()) {
               $$2.b(this.ah());
               $$2.o(this.cJ());
            }

            if (this.ge()) {
               $$2.gc();
            }

            $$2.n(this.cz());
            if ($$1) {
               $$2.a_(this.gd());

               for (bsc $$3 : bsc.values()) {
                  cuh $$4 = this.d($$3);
                  if (!$$4.d()) {
                     $$2.a($$3, $$4.e());
                     $$2.a($$3, this.g($$3));
                  }
               }
            }

            this.dU().b($$2);
            if (this.bW()) {
               brv $$5 = this.dh();
               this.ae();
               $$2.a($$5, true);
            }

            this.ao();
            return $$2;
         }
      }
   }

   protected void gk() {
      if (this.cv != null) {
         this.gu();
      }

      if (this.ct != null) {
         if (!this.bI() || !this.ct.bI()) {
            this.a(true, true);
         }
      }
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.ct != null) {
         this.ct = null;
         this.cv = null;
         this.gi();
         if (!this.dU().C && $$1) {
            this.a(cuk.wv);
         }

         if (!this.dU().C && $$0 && this.dU() instanceof aqt) {
            ((aqt)this.dU()).l().b(this, new afc(this, null));
         }
      }
   }

   public boolean a(cly $$0) {
      return !this.gl() && !(this instanceof ciu);
   }

   public boolean gl() {
      return this.ct != null;
   }

   public boolean gm() {
      return this.gl() || this.cv != null;
   }

   @Nullable
   public brv gn() {
      if (this.ct == null && this.cu != 0 && this.dU().C) {
         this.ct = this.dU().a(this.cu);
      }

      return this.ct;
   }

   public void b(brv $$0, boolean $$1) {
      this.ct = $$0;
      this.cv = null;
      if (!this.dU().C && $$1 && this.dU() instanceof aqt) {
         ((aqt)this.dU()).l().b(this, new afc(this, this.ct));
      }

      if (this.bW()) {
         this.ae();
      }
   }

   public void t(int $$0) {
      this.cu = $$0;
      this.a(false, false);
   }

   @Override
   public boolean a(brv $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.gl()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gu() {
      if (this.cv != null && this.dU() instanceof aqt $$0) {
         Optional<UUID> $$1 = this.cv.left();
         Optional<ir> $$2 = this.cv.right();
         if ($$1.isPresent()) {
            brv $$3 = $$0.a($$1.get());
            if ($$3 != null) {
               this.b($$3, true);
               return;
            }
         } else if ($$2.isPresent()) {
            this.b(cia.b(this.dU(), $$2.get()), true);
            return;
         }

         if (this.am > 100) {
            this.a(cuk.wv);
            this.cv = null;
         }
      }
   }

   @Override
   public boolean dg() {
      return super.dg() && !this.go();
   }

   public void t(boolean $$0) {
      byte $$1 = this.as.a(b);
      this.as.a(b, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void u(boolean $$0) {
      byte $$1 = this.as.a(b);
      this.as.a(b, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void v(boolean $$0) {
      byte $$1 = this.as.a(b);
      this.as.a(b, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean go() {
      return (this.as.a(b) & 1) != 0;
   }

   public boolean gp() {
      return (this.as.a(b) & 2) != 0;
   }

   public boolean gq() {
      return (this.as.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bsi fD() {
      return this.gp() ? bsi.a : bsi.b;
   }

   public boolean i(bso $$0) {
      return this.gr().c($$0.eR());
   }

   protected ewp gr() {
      brv $$0 = this.dh();
      ewp $$3;
      if ($$0 != null) {
         ewp $$1 = $$0.cP();
         ewp $$2 = this.cP();
         $$3 = new ewp(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cP();
      }

      return $$3.c(ch, 0.0, ch);
   }

   @Override
   public boolean C(brv $$0) {
      float $$1 = (float)this.g(btv.c);
      float $$2 = (float)this.g(btv.d);
      if ($$0 instanceof bso) {
         $$1 += dae.a(this.fg(), $$0.ak());
         $$2 += (float)dae.c(this);
      }

      int $$3 = dae.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dX().b((bso)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof bso) {
            ((bso)$$0).q((double)($$2 * 0.5F), (double)aym.a(this.dK() * (float) (Math.PI / 180.0)), (double)(-aym.b(this.dK() * (float) (Math.PI / 180.0))));
            this.g(this.dx().d(0.6, 1.0, 0.6));
         }

         this.a(this, $$0);
         this.A($$0);
      }

      return $$4;
   }

   protected boolean gs() {
      if (this.dU().R() && !this.dU().C) {
         float $$0 = this.by();
         ir $$1 = ir.a(this.dz(), this.dD(), this.dF());
         boolean $$2 = this.bk() || this.aF || this.aG;
         if ($$0 > 0.5F && this.al.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dU().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(awt<epd> $$0) {
      if (this.J().p()) {
         super.c($$0);
      } else {
         this.g(this.dx().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gt() {
      this.c($$0 -> true);
      this.dZ().h();
   }

   public void c(Predicate<bzl> $$0) {
      this.cb.a($$0);
   }

   @Override
   protected void cA() {
      super.cA();
      this.a(true, false);
      this.fl().forEach($$0 -> {
         if (!$$0.d()) {
            $$0.e(0);
         }
      });
   }

   @Nullable
   @Override
   public cuh dH() {
      cvw $$0 = cvw.a(this.ak());
      return $$0 == null ? null : new cuh($$0);
   }
}

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

public abstract class btp extends btn implements btb, btk, bum {
   private static final ajw<Byte> b = aka.a(btp.class, ajy.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final kh bZ = new kh(1, 0, 1);
   public static final float g = 0.15F;
   public static final float h = 0.55F;
   public static final float bH = 0.5F;
   public static final float bI = 0.25F;
   public static final float bJ = 0.085F;
   public static final float bK = 1.0F;
   public static final int bL = 2;
   public static final int bM = 2;
   private static final double ca = Math.sqrt(2.04F) - 0.6F;
   protected static final akr bN = akr.b("random_spawn_bonus");
   public int bO;
   protected int bP;
   protected bzo bQ;
   protected bzp bR;
   protected bzn bS;
   private final bzk cb;
   protected cda bT;
   protected final can bU;
   protected final can bV;
   @Nullable
   private btn cc;
   private final cdx cd;
   private final jv<cuq> ce = jv.a(2, cuq.l);
   protected final float[] bW = new float[2];
   private final jv<cuq> cf = jv.a(4, cuq.l);
   protected final float[] bX = new float[4];
   private cuq cg = cuq.l;
   protected float bY;
   private boolean ch;
   private boolean ci;
   private final Map<ept, Float> cj = Maps.newEnumMap(ept.class);
   @Nullable
   private akq<eru> ck;
   private long cl;
   @Nullable
   private btk.a cm;
   private jd cn = jd.c;
   private float co = -1.0F;

   protected btp(bsx<? extends btp> $$0, dcw $$1) {
      super($$0, $$1);
      this.bU = new can($$1.ah());
      this.bV = new can($$1.ah());
      this.bQ = new bzo(this);
      this.bR = new bzp(this);
      this.bS = new bzn(this);
      this.cb = this.H();
      this.bT = this.b($$1);
      this.cd = new cdx(this);
      Arrays.fill(this.bX, 0.085F);
      Arrays.fill(this.bW, 0.085F);
      this.bY = 0.085F;
      if ($$1 != null && !$$1.B) {
         this.B();
      }
   }

   @Override
   protected void B() {
   }

   public static buv.a C() {
      return btn.dW().a(buw.m, 16.0);
   }

   protected cda b(dcw $$0) {
      return new ccz(this, $$0);
   }

   protected boolean D() {
      return false;
   }

   public float a(ept $$0) {
      btp $$2;
      label17: {
         if (this.de() instanceof btp $$1 && $$1.D()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cj.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(ept $$0, float $$1) {
      this.cj.put($$0, $$1);
   }

   @Override
   public void E() {
   }

   @Override
   public void F() {
   }

   protected bzk H() {
      return new bzk(this);
   }

   public bzo I() {
      return this.bQ;
   }

   public bzp J() {
      return this.de() instanceof btp $$0 ? $$0.J() : this.bR;
   }

   public bzn L() {
      return this.bS;
   }

   public cda N() {
      return this.de() instanceof btp $$0 ? $$0.N() : this.bT;
   }

   @Nullable
   @Override
   public btn cR() {
      bsr $$0 = this.cU();
      if (!this.ga() && $$0 instanceof btp $$1 && $$0.bV()) {
         return $$1;
      }

      return null;
   }

   public cdx O() {
      return this.cd;
   }

   @Nullable
   @Override
   public btn p() {
      return this.cc;
   }

   @Nullable
   protected final btn P() {
      return this.dU().c(ccs.o).orElse(null);
   }

   public void h(@Nullable btn $$0) {
      this.cc = $$0;
   }

   @Override
   public boolean a(bsx<?> $$0) {
      return $$0 != bsx.T;
   }

   public boolean a(cvn $$0) {
      return false;
   }

   public void Q() {
      this.a(dxz.m);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   public int R() {
      return 80;
   }

   public void S() {
      this.b(this.v());
   }

   @Override
   public void aw() {
      super.aw();
      this.dP().ag().a("mobBaseTick");
      if (this.bE() && this.ah.a(1000) < this.bO++) {
         this.s();
         this.S();
      }

      this.dP().ag().c();
   }

   @Override
   protected void e(brk $$0) {
      this.s();
      super.e($$0);
   }

   private void s() {
      this.bO = -this.R();
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

   public void T() {
      if (this.dP().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.ah.k() * 0.02;
            double $$2 = this.ah.k() * 0.02;
            double $$3 = this.ah.k() * 0.02;
            double $$4 = 10.0;
            this.dP().a(lm.ab, this.c(1.0) - $$1 * 10.0, this.dx() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dP().a(this, (byte)20);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 20) {
         this.T();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dP().B && this.ai % 5 == 0) {
         this.U();
      }
   }

   protected void U() {
      boolean $$0 = !(this.cR() instanceof btp);
      boolean $$1 = !(this.dd() instanceof cov);
      this.bU.a(cam.a.a, $$0);
      this.bU.a(cam.a.c, $$0 && $$1);
      this.bU.a(cam.a.b, $$0);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.cb.a();
      return $$1;
   }

   @Nullable
   protected avo v() {
      return null;
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fT());
      $$0.a("PersistenceRequired", this.ci);
      uh $$1 = new uh();

      for (cuq $$2 : this.cf) {
         if (!$$2.e()) {
            $$1.add($$2.a(this.dR()));
         } else {
            $$1.add(new ub());
         }
      }

      $$0.a("ArmorItems", $$1);
      uh $$3 = new uh();

      for (float $$4 : this.bX) {
         $$3.add(ue.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      uh $$5 = new uh();

      for (cuq $$6 : this.ce) {
         if (!$$6.e()) {
            $$5.add($$6.a(this.dR()));
         } else {
            $$5.add(new ub());
         }
      }

      $$0.a("HandItems", $$5);
      uh $$7 = new uh();

      for (float $$8 : this.bW) {
         $$7.add(ue.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.cg.e()) {
         $$0.a("body_armor_item", this.cg.a(this.dR()));
         $$0.a("body_armor_drop_chance", this.bY);
      }

      this.a($$0, this.cm);
      $$0.a("LeftHanded", this.gb());
      if (this.ck != null) {
         $$0.a("DeathLootTable", this.ck.a().toString());
         if (this.cl != 0L) {
            $$0.a("DeathLootTableSeed", this.cl);
         }
      }

      if (this.ga()) {
         $$0.a("NoAI", this.ga());
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.ci = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         uh $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cf.size(); $$2++) {
            ub $$3 = $$1.a($$2);
            this.cf.set($$2, cuq.a(this.dR(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         uh $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bX[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         uh $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.ce.size(); $$7++) {
            ub $$8 = $$6.a($$7);
            this.ce.set($$7, cuq.a(this.dR(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         uh $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bW[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cg = cuq.a(this.dR(), (uy)$$0.p("body_armor_item")).orElse(cuq.l);
         this.bY = $$0.j("body_armor_drop_chance");
      } else {
         this.cg = cuq.l;
      }

      this.cm = this.c($$0);
      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.ck = akq.a(lu.bc, akr.a($$0.l("DeathLootTable")));
         this.cl = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(brk $$0, boolean $$1) {
      super.a($$0, $$1);
      this.ck = null;
   }

   @Override
   public final akq<eru> eB() {
      return this.ck == null ? this.V() : this.ck;
   }

   protected akq<eru> V() {
      return super.eB();
   }

   @Override
   public long eC() {
      return this.cl;
   }

   public void E(float $$0) {
      this.bq = $$0;
   }

   public void F(float $$0) {
      this.bp = $$0;
   }

   public void G(float $$0) {
      this.bo = $$0;
   }

   @Override
   public void A(float $$0) {
      super.A($$0);
      this.E($$0);
   }

   public void W() {
      this.N().n();
      this.G(0.0F);
      this.F(0.0F);
      this.A(0.0F);
   }

   @Override
   public void m_() {
      super.m_();
      this.dP().ag().a("looting");
      if (!this.dP().B && this.fT() && this.bE() && !this.be && this.dP().ab().b(dcs.c)) {
         kh $$0 = this.X();

         for (cjh $$2 : this.dP().a(cjh.class, this.cL().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dK() && !$$2.p().e() && !$$2.y() && this.k($$2.p())) {
               this.b($$2);
            }
         }
      }

      this.dP().ag().c();
   }

   protected kh X() {
      return bZ;
   }

   protected void b(cjh $$0) {
      cuq $$1 = $$0.p();
      cuq $$2 = this.i($$1.s());
      if (!$$2.e()) {
         this.a($$0);
         this.a($$0, $$2.H());
         $$1.h($$2.H());
         if ($$1.e()) {
            $$0.aq();
         }
      }
   }

   public cuq i(cuq $$0) {
      bsy $$1 = this.h($$0);
      cuq $$2 = this.a($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bsy.a;
         $$2 = this.a($$1);
         $$3 = $$2.e();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.f($$1);
         if (!$$2.e() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         cuq $$5 = $$1.a($$0);
         this.b($$1, $$5);
         return $$5;
      } else {
         return cuq.l;
      }
   }

   @Override
   protected void b(bsy $$0, cuq $$1) {
      this.a($$0, $$1);
      this.e($$0);
      this.ci = true;
   }

   public void e(bsy $$0) {
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

   protected boolean b(cuq $$0, cuq $$1) {
      if ($$1.e()) {
         return true;
      } else if ($$0.g() instanceof cwg) {
         if (!($$1.g() instanceof cwg)) {
            return true;
         } else {
            double $$2 = this.o($$0);
            double $$3 = this.o($$1);
            return $$2 != $$3 ? $$2 > $$3 : this.c($$0, $$1);
         }
      } else if ($$0.g() instanceof cst && $$1.g() instanceof cst) {
         return this.c($$0, $$1);
      } else if ($$0.g() instanceof ctc && $$1.g() instanceof ctc) {
         return this.c($$0, $$1);
      } else if ($$0.g() instanceof csf $$4) {
         if (dae.a($$1, dad.E)) {
            return false;
         } else if (!($$1.g() instanceof csf)) {
            return true;
         } else {
            csf $$5 = (csf)$$1.g();
            if ($$4.k() != $$5.k()) {
               return $$4.k() > $$5.k();
            } else {
               return $$4.l() != $$5.l() ? $$4.l() > $$5.l() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.g() instanceof cte) {
            if ($$1.g() instanceof cso) {
               return true;
            }

            if ($$1.g() instanceof cte) {
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

   private double o(cuq $$0) {
      cxn $$1 = $$0.a(kq.n, cxn.a);
      return $$1.a(this.h(buw.c), bsy.a);
   }

   public boolean c(cuq $$0, cuq $$1) {
      return $$0.n() < $$1.n() ? true : p($$0) && !p($$1);
   }

   private static boolean p(cuq $$0) {
      km $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(kq.e);
   }

   public boolean j(cuq $$0) {
      return true;
   }

   public boolean k(cuq $$0) {
      return this.j($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean Y() {
      return this.bS();
   }

   protected boolean Z() {
      return false;
   }

   @Override
   public void dB() {
      if (this.dP().al() == bqo.a && this.Z()) {
         this.aq();
      } else if (!this.fU() && !this.Y()) {
         bsr $$0 = this.dP().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.am().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.aq();
            }

            int $$4 = this.am().f().g();
            int $$5 = $$4 * $$4;
            if (this.bf > 600 && this.ah.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.aq();
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
      bnf $$0 = this.dP().ag();
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
      this.ab();
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
      this.aa();
   }

   protected void aa() {
      agf.a(this.dP(), this, this.bU);
   }

   protected void ab() {
   }

   public int ac() {
      return 40;
   }

   public int ae() {
      return 75;
   }

   protected void af() {
      float $$0 = (float)this.ae();
      float $$1 = this.ct();
      float $$2 = ayo.g(this.aY - $$1);
      float $$3 = ayo.a(ayo.g(this.aY - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.o($$4);
   }

   public int fN() {
      return 10;
   }

   public void a(bsr $$0, float $$1, float $$2) {
      double $$3 = $$0.du() - this.du();
      double $$4 = $$0.dA() - this.dA();
      double $$6;
      if ($$0 instanceof btn $$5) {
         $$6 = $$5.dy() - this.dy();
      } else {
         $$6 = ($$0.cL().b + $$0.cL().e) / 2.0 - this.dy();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(ayo.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(ayo.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.u(this.a(this.dH(), $$10, $$2));
      this.t(this.a(this.dF(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ayo.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bsx<? extends btp> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      jd $$5 = $$3.e();
      return $$2 == btr.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dcx $$0, btr $$1) {
      return true;
   }

   public boolean a(dcz $$0) {
      return !$$0.d(this.cL()) && $$0.f(this);
   }

   public int fO() {
      return 4;
   }

   public boolean r(int $$0) {
      return false;
   }

   @Override
   public int cy() {
      if (this.p() == null) {
         return this.w(0.0F);
      } else {
         int $$0 = (int)(this.ex() - this.eO() * 0.33F);
         $$0 -= (3 - this.dP().al().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.w((float)$$0);
      }
   }

   @Override
   public Iterable<cuq> eX() {
      return this.ce;
   }

   @Override
   public Iterable<cuq> eW() {
      return this.cf;
   }

   public cuq fP() {
      return this.cg;
   }

   @Override
   public boolean d(bsy $$0) {
      return $$0 != bsy.g;
   }

   public boolean fQ() {
      return !this.a(bsy.g).e();
   }

   public boolean l(cuq $$0) {
      return false;
   }

   public void m(cuq $$0) {
      this.b(bsy.g, $$0);
   }

   @Override
   public Iterable<cuq> eY() {
      return (Iterable<cuq>)(this.cg.e() ? this.cf : Iterables.concat(this.cf, List.of(this.cg)));
   }

   @Override
   public cuq a(bsy $$0) {
      return switch ($$0.a()) {
         case a -> (cuq)this.ce.get($$0.b());
         case b -> (cuq)this.cf.get($$0.b());
         case c -> this.cg;
      };
   }

   @Override
   public void a(bsy $$0, cuq $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cf.set($$0.b(), $$1), $$1);
            break;
         case c:
            cuq $$2 = this.cg;
            this.cg = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(aqu $$0, brk $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bsy $$3 : bsy.values()) {
         cuq $$4 = this.a($$3);
         float $$5 = this.f($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = $$5 > 1.0F;
            bsr var13 = $$1.d();
            if (var13 instanceof btn) {
               btn $$7 = (btn)var13;
               if (this.dP() instanceof aqu $$8) {
                  $$5 = dae.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.e() && !dae.a($$4, dad.D) && ($$2 || $$6) && this.ah.i() < $$5) {
               if (!$$6 && $$4.l()) {
                  $$4.b($$4.o() - this.ah.a(1 + this.ah.a(Math.max($$4.o() - 3, 1))));
               }

               this.b($$4);
               this.a($$3, cuq.l);
            }
         }
      }
   }

   protected float f(bsy $$0) {
      return switch ($$0.a()) {
         case a -> this.bW[$$0.b()];
         case b -> this.bX[$$0.b()];
         case c -> this.bY;
      };
   }

   public void fR() {
      this.c($$0 -> true);
   }

   public Set<bsy> c(Predicate<cuq> $$0) {
      Set<bsy> $$1 = new HashSet<>();

      for (bsy $$2 : bsy.values()) {
         cuq $$3 = this.a($$2);
         if (!$$3.e()) {
            if (!$$0.test($$3)) {
               $$1.add($$2);
            } else {
               double $$4 = (double)this.f($$2);
               if ($$4 > 1.0) {
                  this.a($$2, cuq.l);
                  this.b($$3);
               }
            }
         }
      }

      return $$1;
   }

   private ers a(aqu $$0) {
      return new ers.a($$0).a(eul.f, this.dn()).a(eul.a, this).a(euk.h);
   }

   public void a(bta $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(akq<eru> $$0, Map<bsy, Float> $$1) {
      if (this.dP() instanceof aqu $$2) {
         this.a($$0, this.a($$2), $$1);
      }
   }

   protected void a(ayw $$0, bqp $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dP().al() == bqo.d ? 0.1F : 0.25F;
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

         for (bsy $$5 : bsy.values()) {
            if ($$5.a() == bsy.a.b) {
               cuq $$6 = this.a($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.e()) {
                  cul $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cuq($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cul a(bsy $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cut.py;
            } else if ($$1 == 1) {
               return cut.pO;
            } else if ($$1 == 2) {
               return cut.pC;
            } else if ($$1 == 3) {
               return cut.pG;
            } else if ($$1 == 4) {
               return cut.pK;
            }
         case e:
            if ($$1 == 0) {
               return cut.pz;
            } else if ($$1 == 1) {
               return cut.pP;
            } else if ($$1 == 2) {
               return cut.pD;
            } else if ($$1 == 3) {
               return cut.pH;
            } else if ($$1 == 4) {
               return cut.pL;
            }
         case d:
            if ($$1 == 0) {
               return cut.pA;
            } else if ($$1 == 1) {
               return cut.pQ;
            } else if ($$1 == 2) {
               return cut.pE;
            } else if ($$1 == 3) {
               return cut.pI;
            } else if ($$1 == 4) {
               return cut.pM;
            }
         case c:
            if ($$1 == 0) {
               return cut.pB;
            } else if ($$1 == 1) {
               return cut.pR;
            } else if ($$1 == 2) {
               return cut.pF;
            } else if ($$1 == 3) {
               return cut.pJ;
            } else if ($$1 == 4) {
               return cut.pN;
            }
         default:
            return null;
      }
   }

   protected void a(ddl $$0, ayw $$1, bqp $$2) {
      this.b($$0, $$1, $$2);

      for (bsy $$3 : bsy.values()) {
         if ($$3.a() == bsy.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(ddl $$0, ayw $$1, bqp $$2) {
      this.a($$0, bsy.a, $$1, 0.25F, $$2);
   }

   protected void a(ddl $$0, ayw $$1, bsy $$2, bqp $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(ddl $$0, bsy $$1, ayw $$2, float $$3, bqp $$4) {
      cuq $$5 = this.a($$1);
      if (!$$5.e() && $$2.i() < $$3 * $$4.d()) {
         dae.a($$5, $$0.H_(), dbp.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      ayw $$4 = $$0.E_();
      bus $$5 = Objects.requireNonNull(this.f(buw.m));
      if (!$$5.b(bN)) {
         $$5.c(new buu(bN, $$4.a(0.0, 0.11485000000000001), buu.a.b));
      }

      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fS() {
      this.ci = true;
   }

   @Override
   public void a(bsy $$0, float $$1) {
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

   public boolean fT() {
      return this.ch;
   }

   public void a_(boolean $$0) {
      this.ch = $$0;
   }

   @Override
   public boolean f(cuq $$0) {
      bsy $$1 = this.h($$0);
      return this.a($$1).e() && this.fT();
   }

   public boolean fU() {
      return this.ci;
   }

   @Override
   public final bqr a(cmx $$0, bqq $$1) {
      if (!this.bE()) {
         return bqr.e;
      } else {
         bqr $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dxz.r, $$0);
            return $$2;
         } else {
            bqr $$3 = super.a($$0, $$1);
            if ($$3 != bqr.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(dxz.r, $$0);
                  return $$2;
               } else {
                  return bqr.e;
               }
            }
         }
      }
   }

   private bqr c(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.uL)) {
         bqr $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.g() instanceof cwa) {
         if (this.dP() instanceof aqu) {
            cwa $$4 = (cwa)$$2.g();
            Optional<btp> $$5 = $$4.a($$0, this, (bsx<? extends btp>)this.am(), (aqu)this.dP(), this.dn(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            return $$5.isPresent() ? bqr.a : bqr.e;
         } else {
            return bqr.c;
         }
      } else {
         return bqr.e;
      }
   }

   protected void a(cmx $$0, btp $$1) {
   }

   protected bqr b(cmx $$0, bqq $$1) {
      return bqr.e;
   }

   public boolean fV() {
      return this.a(this.dp());
   }

   public boolean a(jd $$0) {
      return this.co == -1.0F ? true : this.cn.j($$0) < (double)(this.co * this.co);
   }

   public void a(jd $$0, int $$1) {
      this.cn = $$0;
      this.co = (float)$$1;
   }

   public jd fW() {
      return this.cn;
   }

   public float fX() {
      return this.co;
   }

   public void fY() {
      this.co = -1.0F;
   }

   public boolean fZ() {
      return this.co != -1.0F;
   }

   @Nullable
   public <T extends btp> T a(bsx<T> $$0, boolean $$1) {
      if (this.dK()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dP());
         if ($$2 == null) {
            return null;
         } else {
            $$2.v(this);
            $$2.a(this.o_());
            $$2.t(this.ga());
            if (this.ai()) {
               $$2.b(this.aj());
               $$2.o(this.cF());
            }

            if (this.fU()) {
               $$2.fS();
            }

            $$2.n(this.cv());
            if ($$1) {
               $$2.a_(this.fT());

               for (bsy $$3 : bsy.values()) {
                  cuq $$4 = this.a($$3);
                  if (!$$4.e()) {
                     $$2.a($$3, $$4.f());
                     $$2.a($$3, this.f($$3));
                  }
               }
            }

            this.dP().b($$2);
            if (this.bS()) {
               bsr $$5 = this.dd();
               this.ad();
               $$2.a($$5, true);
            }

            this.aq();
            return $$2;
         }
      }
   }

   @Nullable
   @Override
   public btk.a X_() {
      return this.cm;
   }

   @Override
   public void a(@Nullable btk.a $$0) {
      this.cm = $$0;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      btk.super.a($$0, $$1);
      if (this.X_() == null) {
         this.fY();
      }
   }

   @Override
   public void z() {
      btk.super.z();
      this.bU.a(cam.a.a);
   }

   @Override
   public boolean y() {
      return !(this instanceof cjv);
   }

   @Override
   public boolean a(bsr $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.N_()) {
         this.a(true, true);
      }

      return $$2;
   }

   @Override
   public boolean dc() {
      return super.dc() && !this.ga();
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

   public boolean ga() {
      return (this.ao.a(b) & 1) != 0;
   }

   public boolean gb() {
      return (this.ao.a(b) & 2) != 0;
   }

   public boolean gc() {
      return (this.ao.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public btg fr() {
      return this.gb() ? btg.a : btg.b;
   }

   public boolean i(btn $$0) {
      return this.gd().c($$0.eG());
   }

   protected ewv gd() {
      bsr $$0 = this.dd();
      ewv $$3;
      if ($$0 != null) {
         ewv $$1 = $$0.cL();
         ewv $$2 = this.cL();
         $$3 = new ewv(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cL();
      }

      return $$3.c(ca, 0.0, ca);
   }

   @Override
   public boolean D(bsr $$0) {
      float $$1 = (float)this.g(buw.c);
      brk $$2 = this.dQ().b((btn)this);
      if (this.dP() instanceof aqu $$3) {
         $$1 = dae.a($$3, this.dT(), $$0, $$2, $$1);
      }

      boolean $$4 = $$0.a($$2, $$1);
      if ($$4) {
         float $$5 = this.a($$0, $$2);
         if ($$5 > 0.0F && $$0 instanceof btn $$6) {
            $$6.p((double)($$5 * 0.5F), (double)ayo.a(this.dF() * (float) (Math.PI / 180.0)), (double)(-ayo.b(this.dF() * (float) (Math.PI / 180.0))));
            this.i(this.ds().d(0.6, 1.0, 0.6));
         }

         if (this.dP() instanceof aqu $$7) {
            dae.a($$7, $$0, $$2);
         }

         this.A($$0);
         this.ge();
      }

      return $$4;
   }

   protected void ge() {
   }

   protected boolean gf() {
      if (this.dP().R() && !this.dP().B) {
         float $$0 = this.bu();
         jd $$1 = jd.a(this.du(), this.dy(), this.dA());
         boolean $$2 = this.bh() || this.az || this.aA;
         if ($$0 > 0.5F && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dP().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(awu<epb> $$0) {
      if (this.N().p()) {
         super.c($$0);
      } else {
         this.i(this.ds().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gg() {
      this.d($$0 -> true);
      this.dU().h();
   }

   public void d(Predicate<cam> $$0) {
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
   public cuq dC() {
      cwa $$0 = cwa.a(this.am());
      return $$0 == null ? null : new cuq($$0);
   }
}

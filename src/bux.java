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

public abstract class bux extends buv implements buk, but, bvt {
   private static final akk<Byte> b = ako.a(bux.class, akm.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int h = 1;
   private static final kk bX = new kk(1, 0, 1);
   private static final List<buh> bY = List.of(buh.f, buh.e, buh.d, buh.c);
   public static final float i = 0.15F;
   public static final float bE = 0.55F;
   public static final float bF = 0.5F;
   public static final float bG = 0.25F;
   public static final float bH = 0.085F;
   public static final float bI = 1.0F;
   public static final int bJ = 2;
   public static final int bK = 2;
   private static final double bZ = Math.sqrt(2.04F) - 0.6F;
   protected static final alh bL = alh.b("random_spawn_bonus");
   public int bM;
   protected int bN;
   protected cav bO;
   protected caw bP;
   protected cau bQ;
   private final car ca;
   protected ceh bR;
   protected final cbu bS;
   protected final cbu bT;
   @Nullable
   private buv cb;
   private final cfe cc;
   private final jy<cvx> cd = jy.a(2, cvx.k);
   protected final float[] bU = new float[2];
   private final jy<cvx> ce = jy.a(4, cvx.k);
   protected final float[] bV = new float[4];
   private cvx cf = cvx.k;
   protected float bW;
   private boolean cg;
   private boolean ch;
   private final Map<erv, Float> ci = Maps.newEnumMap(erv.class);
   private Optional<alg<eub>> cj = Optional.empty();
   private long ck;
   @Nullable
   private but.a cl;
   private jg cm = jg.c;
   private float cn = -1.0F;

   protected bux(bug<? extends bux> $$0, dev $$1) {
      super($$0, $$1);
      this.bS = new cbu($$1.ai());
      this.bT = new cbu($$1.ai());
      this.bO = new cav(this);
      this.bP = new caw(this);
      this.bQ = new cau(this);
      this.ca = this.J();
      this.bR = this.b($$1);
      this.cc = new cfe(this);
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

   public static bwc.a E() {
      return buv.ef().a(bwd.m, 16.0);
   }

   protected ceh b(dev $$0) {
      return new ceg(this, $$0);
   }

   protected boolean F() {
      return false;
   }

   public float a(erv $$0) {
      bux $$2;
      label17: {
         if (this.dm() instanceof bux $$1 && $$1.F()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.ci.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(erv $$0, float $$1) {
      this.ci.put($$0, $$1);
   }

   @Override
   public void G() {
   }

   @Override
   public void I() {
   }

   protected car J() {
      return new car(this);
   }

   public cav K() {
      return this.bO;
   }

   public caw M() {
      return this.dm() instanceof bux $$0 ? $$0.M() : this.bP;
   }

   public cau O() {
      return this.bQ;
   }

   public ceh P() {
      return this.dm() instanceof bux $$0 ? $$0.P() : this.bR;
   }

   @Nullable
   @Override
   public buv cY() {
      btz $$0 = this.db();
      if (!this.gi() && $$0 instanceof bux $$1 && $$0.cd()) {
         return $$1;
      }

      return null;
   }

   public cfe Q() {
      return this.cc;
   }

   @Nullable
   @Override
   public buv m() {
      return this.cb;
   }

   @Nullable
   protected final buv R() {
      return this.ed().c(cdz.o).orElse(null);
   }

   public void h(@Nullable buv $$0) {
      this.cb = $$0;
   }

   @Override
   public boolean a(bug<?> $$0) {
      return $$0 != bug.T;
   }

   public boolean a(cwt $$0) {
      return false;
   }

   public void S() {
      this.a(eaa.m);
   }

   @Override
   protected void a(ako.a $$0) {
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
   public void aA() {
      super.aA();
      this.dX().ah().a("mobBaseTick");
      if (this.bM() && this.af.a(1000) < this.bM++) {
         this.q();
         this.U();
      }

      this.dX().ah().c();
   }

   @Override
   protected void e(bsp $$0) {
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
            this.dX().a(lq.ab, this.c(1.0) - $$1 * 10.0, this.dF() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
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
      boolean $$0 = !(this.cY() instanceof bux);
      boolean $$1 = !(this.dl() instanceof cqh);
      this.bS.a(cbt.a.a, $$0);
      this.bS.a(cbt.a.c, $$0 && $$1);
      this.bS.a(cbt.a.b, $$0);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.ca.a();
      return $$1;
   }

   @Nullable
   protected awj w() {
      return null;
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fP());
      $$0.a("PersistenceRequired", this.ch);
      up $$1 = new up();

      for (cvx $$2 : this.ce) {
         if (!$$2.f()) {
            $$1.add($$2.a(this.dZ()));
         } else {
            $$1.add(new uj());
         }
      }

      $$0.a("ArmorItems", $$1);
      up $$3 = new up();

      for (float $$4 : this.bV) {
         $$3.add(um.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      up $$5 = new up();

      for (cvx $$6 : this.cd) {
         if (!$$6.f()) {
            $$5.add($$6.a(this.dZ()));
         } else {
            $$5.add(new uj());
         }
      }

      $$0.a("HandItems", $$5);
      up $$7 = new up();

      for (float $$8 : this.bU) {
         $$7.add(um.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.cf.f()) {
         $$0.a("body_armor_item", this.cf.a(this.dZ()));
         $$0.a("body_armor_drop_chance", this.bW);
      }

      this.a($$0, this.cl);
      $$0.a("LeftHanded", this.gj());
      if (this.cj.isPresent()) {
         $$0.a("DeathLootTable", this.cj.get().a().toString());
         if (this.ck != 0L) {
            $$0.a("DeathLootTableSeed", this.ck);
         }
      }

      if (this.gi()) {
         $$0.a("NoAI", this.gi());
      }
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 99)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.ch = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         up $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ce.size(); $$2++) {
            uj $$3 = $$1.a($$2);
            this.ce.set($$2, cvx.a(this.dZ(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         up $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bV[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         up $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.cd.size(); $$7++) {
            uj $$8 = $$6.a($$7);
            this.cd.set($$7, cvx.a(this.dZ(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         up $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bU[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cf = cvx.a(this.dZ(), (vg)$$0.p("body_armor_item")).orElse(cvx.k);
         this.bW = $$0.j("body_armor_drop_chance");
      } else {
         this.cf = cvx.k;
      }

      this.cl = this.c($$0);
      this.v($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cj = Optional.of(alg.a(ly.bd, alh.a($$0.l("DeathLootTable"))));
         this.ck = $$0.i("DeathLootTableSeed");
      }

      this.u($$0.q("NoAI"));
   }

   @Override
   protected void a(bsp $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cj = Optional.empty();
   }

   @Override
   public final Optional<alg<eub>> ec() {
      return this.cj.isPresent() ? this.cj : super.ec();
   }

   @Override
   public long eK() {
      return this.ck;
   }

   public void G(float $$0) {
      this.bn = $$0;
   }

   public void H(float $$0) {
      this.bm = $$0;
   }

   public void I(float $$0) {
      this.bl = $$0;
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
      this.dX().ah().a("looting");
      if (!this.dX().C && this.fP() && this.bM() && !this.bb && this.dX().ac().b(der.c)) {
         kk $$0 = this.Y();

         for (ckq $$2 : this.dX().a(ckq.class, this.cS().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dS() && !$$2.m().f() && !$$2.w() && this.i($$2.m())) {
               this.b($$2);
            }
         }
      }

      this.dX().ah().c();
   }

   protected kk Y() {
      return bX;
   }

   protected void b(ckq $$0) {
      cvx $$1 = $$0.m();
      cvx $$2 = this.g($$1.v());
      if (!$$2.f()) {
         this.a($$0);
         this.a($$0, $$2.L());
         $$1.h($$2.L());
         if ($$1.f()) {
            $$0.au();
         }
      }
   }

   public cvx g(cvx $$0) {
      buh $$1 = this.f($$0);
      cvx $$2 = this.a($$1);
      boolean $$3 = this.a($$0, $$2, $$1);
      if ($$1.f() && !$$3) {
         $$1 = buh.a;
         $$2 = this.a($$1);
         $$3 = $$2.f();
      }

      if ($$3 && this.h($$0)) {
         double $$4 = (double)this.h($$1);
         if (!$$2.f() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         cvx $$5 = $$1.a($$0);
         this.b($$1, $$5);
         return $$5;
      } else {
         return cvx.k;
      }
   }

   @Override
   protected void b(buh $$0, cvx $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.ch = true;
   }

   public void g(buh $$0) {
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

   protected boolean a(cvx $$0, cvx $$1, buh $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$0.h() instanceof cxl) {
         if (!($$1.h() instanceof cxl)) {
            return true;
         } else {
            double $$3 = this.a($$0, bwd.c, $$2);
            double $$4 = this.a($$1, bwd.c, $$2);
            return $$3 != $$4 ? $$3 > $$4 : this.b($$0, $$1);
         }
      } else if ($$0.h() instanceof cug && $$1.h() instanceof cug) {
         return this.b($$0, $$1);
      } else if ($$0.h() instanceof cuo && $$1.h() instanceof cuo) {
         return this.b($$0, $$1);
      } else if ($$0.h() instanceof ctv) {
         if (dbo.a($$1, dbn.E)) {
            return false;
         } else if (!($$1.h() instanceof ctv)) {
            return true;
         } else {
            double $$5 = this.a($$0, bwd.a, $$2);
            double $$6 = this.a($$1, bwd.a, $$2);
            double $$7 = this.a($$0, bwd.b, $$2);
            double $$8 = this.a($$1, bwd.b, $$2);
            if ($$5 != $$6) {
               return $$5 > $$6;
            } else {
               return $$7 != $$8 ? $$7 > $$8 : this.b($$0, $$1);
            }
         }
      } else {
         if ($$0.h() instanceof cuq) {
            if ($$1.h() instanceof cuc) {
               return true;
            }

            if ($$1.h() instanceof cuq) {
               double $$9 = this.a($$0, bwd.c, $$2);
               double $$10 = this.a($$1, bwd.c, $$2);
               if ($$9 != $$10) {
                  return $$9 > $$10;
               }

               return this.b($$0, $$1);
            }
         }

         return false;
      }
   }

   private double a(cvx $$0, jp<bvy> $$1, buh $$2) {
      cym $$3 = $$0.a(kt.o, cym.a);
      return $$3.a(this.i($$1), $$2);
   }

   public boolean b(cvx $$0, cvx $$1) {
      return $$0.o() < $$1.o() ? true : l($$0) && !l($$1);
   }

   private static boolean l(cvx $$0) {
      kp $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(kt.e);
   }

   public boolean h(cvx $$0) {
      return true;
   }

   public boolean i(cvx $$0) {
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
      if (this.dX().am() == brv.a && this.aa()) {
         this.au();
      } else if (!this.gc() && !this.Z()) {
         btz $$0 = this.dX().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.aq().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.au();
            }

            int $$4 = this.aq().f().g();
            int $$5 = $$4 * $$4;
            if (this.bc > 600 && this.af.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.au();
            } else if ($$1 < (double)$$5) {
               this.bc = 0;
            }
         }
      } else {
         this.bc = 0;
      }
   }

   @Override
   protected final void fw() {
      this.bc++;
      bok $$0 = this.dX().ah();
      $$0.a("sensing");
      this.cc.a();
      $$0.c();
      int $$1 = this.ag + this.ar();
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
      agr.a(this.dX(), this, this.bS);
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
      float $$2 = azj.h(this.aU - $$1);
      float $$3 = azj.a(azj.h(this.aU - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.q($$4);
   }

   public int ah() {
      return 10;
   }

   public void a(btz $$0, float $$1, float $$2) {
      double $$3 = $$0.dC() - this.dC();
      double $$4 = $$0.dI() - this.dI();
      double $$6;
      if ($$0 instanceof buv $$5) {
         $$6 = $$5.dG() - this.dG();
      } else {
         $$6 = ($$0.cS().b + $$0.cS().e) / 2.0 - this.dG();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(azj.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(azj.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.w(this.a(this.dP(), $$10, $$2));
      this.v(this.a(this.dN(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azj.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bug<? extends bux> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      jg $$5 = $$3.e();
      return buf.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dew $$0, buf $$1) {
      return true;
   }

   public boolean a(dey $$0) {
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
         $$0 -= (3 - this.dX().am().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.y((float)$$0);
      }
   }

   @Override
   public Iterable<cvx> fe() {
      return this.cd;
   }

   @Override
   public Iterable<cvx> fd() {
      return this.ce;
   }

   public cvx ak() {
      return this.cf;
   }

   @Override
   public boolean e(buh $$0) {
      return $$0 != buh.g;
   }

   public boolean fZ() {
      return !this.a(buh.g).f();
   }

   public void j(cvx $$0) {
      this.b(buh.g, $$0);
   }

   @Override
   public Iterable<cvx> ff() {
      return (Iterable<cvx>)(this.cf.f() ? this.ce : Iterables.concat(this.ce, List.of(this.cf)));
   }

   @Override
   public cvx a(buh $$0) {
      return switch ($$0.a()) {
         case a -> (cvx)this.cd.get($$0.b());
         case b -> (cvx)this.ce.get($$0.b());
         case c -> this.cf;
      };
   }

   @Override
   public void a(buh $$0, cvx $$1) {
      this.c($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cd.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
            break;
         case c:
            cvx $$2 = this.cf;
            this.cf = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(arm $$0, bsp $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (buh $$3 : buh.i) {
         cvx $$4 = this.a($$3);
         float $$5 = this.h($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = $$5 > 1.0F;
            btz var11 = $$1.d();
            if (var11 instanceof buv) {
               buv $$7 = (buv)var11;
               if (this.dX() instanceof arm $$8) {
                  $$5 = dbo.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !dbo.a($$4, dbn.D) && ($$2 || $$6) && this.af.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.af.a(1 + this.af.a(Math.max($$4.p() - 3, 1))));
               }

               this.b($$4);
               this.a($$3, cvx.k);
            }
         }
      }
   }

   protected float h(buh $$0) {
      return switch ($$0.a()) {
         case a -> this.bU[$$0.b()];
         case b -> this.bV[$$0.b()];
         case c -> this.bW;
      };
   }

   public void ga() {
      this.c($$0 -> true);
   }

   public Set<buh> c(Predicate<cvx> $$0) {
      Set<buh> $$1 = new HashSet<>();

      for (buh $$2 : buh.i) {
         cvx $$3 = this.a($$2);
         if (!$$3.f()) {
            if (!$$0.test($$3)) {
               $$1.add($$2);
            } else {
               double $$4 = (double)this.h($$2);
               if ($$4 > 1.0) {
                  this.a($$2, cvx.k);
                  this.b($$3);
               }
            }
         }
      }

      return $$1;
   }

   private etz a(arm $$0) {
      return new etz.a($$0).a(ews.f, this.dv()).a(ews.a, this).a(ewr.h);
   }

   public void a(buj $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(alg<eub> $$0, Map<buh, Float> $$1) {
      if (this.dX() instanceof arm $$2) {
         this.a($$0, this.a($$2), $$1);
      }
   }

   protected void a(azr $$0, brw $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dX().am() == brv.d ? 0.1F : 0.25F;
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

         for (buh $$5 : bY) {
            cvx $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               cvt $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new cvx($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static cvt a(buh $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cwb.pz;
            } else if ($$1 == 1) {
               return cwb.pP;
            } else if ($$1 == 2) {
               return cwb.pD;
            } else if ($$1 == 3) {
               return cwb.pH;
            } else if ($$1 == 4) {
               return cwb.pL;
            }
         case e:
            if ($$1 == 0) {
               return cwb.pA;
            } else if ($$1 == 1) {
               return cwb.pQ;
            } else if ($$1 == 2) {
               return cwb.pE;
            } else if ($$1 == 3) {
               return cwb.pI;
            } else if ($$1 == 4) {
               return cwb.pM;
            }
         case d:
            if ($$1 == 0) {
               return cwb.pB;
            } else if ($$1 == 1) {
               return cwb.pR;
            } else if ($$1 == 2) {
               return cwb.pF;
            } else if ($$1 == 3) {
               return cwb.pJ;
            } else if ($$1 == 4) {
               return cwb.pN;
            }
         case c:
            if ($$1 == 0) {
               return cwb.pC;
            } else if ($$1 == 1) {
               return cwb.pS;
            } else if ($$1 == 2) {
               return cwb.pG;
            } else if ($$1 == 3) {
               return cwb.pK;
            } else if ($$1 == 4) {
               return cwb.pO;
            }
         default:
            return null;
      }
   }

   protected void a(dfl $$0, azr $$1, brw $$2) {
      this.b($$0, $$1, $$2);

      for (buh $$3 : buh.i) {
         if ($$3.a() == buh.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dfl $$0, azr $$1, brw $$2) {
      this.a($$0, buh.a, $$1, 0.25F, $$2);
   }

   protected void a(dfl $$0, azr $$1, buh $$2, brw $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dfl $$0, buh $$1, azr $$2, float $$3, brw $$4) {
      cvx $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         dbo.a($$5, $$0.H_(), dda.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      azr $$4 = $$0.E_();
      bvz $$5 = Objects.requireNonNull(this.g(bwd.m));
      if (!$$5.b(bL)) {
         $$5.d(new bwb(bL, $$4.a(0.0, 0.11485000000000001), bwb.a.b));
      }

      this.v($$4.i() < 0.05F);
      return $$3;
   }

   public void gb() {
      this.ch = true;
   }

   @Override
   public void a(buh $$0, float $$1) {
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
   protected boolean f(buh $$0) {
      return this.fP();
   }

   public boolean gc() {
      return this.ch;
   }

   @Override
   public final bry a(coh $$0, brx $$1) {
      if (!this.bM()) {
         return bry.e;
      } else {
         bry $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(eaa.r, $$0);
            return $$2;
         } else {
            bry $$3 = super.a($$0, $$1);
            if ($$3 != bry.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(eaa.r, $$0);
                  return $$2;
               } else {
                  return bry.e;
               }
            }
         }
      }
   }

   private bry c(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if ($$2.a(cwb.uN)) {
         bry $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof cxg) {
         if (this.dX() instanceof arm) {
            cxg $$4 = (cxg)$$2.h();
            Optional<bux> $$5 = $$4.a($$0, this, (bug<? extends bux>)this.aq(), (arm)this.dX(), this.dv(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return bry.e;
            }
         }

         return bry.b;
      } else {
         return bry.e;
      }
   }

   protected void a(coh $$0, bux $$1) {
   }

   protected bry b(coh $$0, brx $$1) {
      return bry.e;
   }

   public boolean gd() {
      return this.a(this.dx());
   }

   public boolean a(jg $$0) {
      return this.cn == -1.0F ? true : this.cm.j($$0) < (double)(this.cn * this.cn);
   }

   public void a(jg $$0, int $$1) {
      this.cm = $$0;
      this.cn = (float)$$1;
   }

   public jg ge() {
      return this.cm;
   }

   public float gf() {
      return this.cn;
   }

   public void gg() {
      this.cn = -1.0F;
   }

   public boolean gh() {
      return this.cn != -1.0F;
   }

   @Nullable
   public <T extends bux> T a(bug<T> $$0, btu $$1, buf $$2, btu.a<T> $$3) {
      if (this.dS()) {
         return null;
      } else {
         T $$4 = (T)$$0.a(this.dX(), $$2);
         if ($$4 == null) {
            return null;
         } else {
            $$1.a().a(this, $$4, $$1);
            $$3.finalizeConversion($$4);
            if (this.dX() instanceof arm $$5) {
               $$5.a_($$4);
            }

            if ($$1.a().a()) {
               this.au();
            }

            return $$4;
         }
      }
   }

   @Nullable
   public <T extends bux> T a(bug<T> $$0, btu $$1, btu.a<T> $$2) {
      return this.a($$0, $$1, buf.i, $$2);
   }

   @Nullable
   @Override
   public but.a Y_() {
      return this.cl;
   }

   @Override
   public void a(@Nullable but.a $$0) {
      this.cl = $$0;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      but.super.a($$0, $$1);
      if (this.Y_() == null) {
         this.gg();
      }
   }

   @Override
   public void B() {
      but.super.B();
      this.bS.a(cbt.a.a);
   }

   @Override
   public boolean A() {
      return !(this instanceof cle);
   }

   @Override
   public boolean a(btz $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.M_()) {
         this.a(true, true);
      }

      return $$2;
   }

   @Override
   public boolean dk() {
      return super.dk() && !this.gi();
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

   public boolean gi() {
      return (this.am.a(b) & 1) != 0;
   }

   public boolean gj() {
      return (this.am.a(b) & 2) != 0;
   }

   public boolean gk() {
      return (this.am.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bup fA() {
      return this.gj() ? bup.a : bup.b;
   }

   public boolean i(buv $$0) {
      return this.gl().c($$0.eO());
   }

   protected ezc gl() {
      btz $$0 = this.dl();
      ezc $$3;
      if ($$0 != null) {
         ezc $$1 = $$0.cS();
         ezc $$2 = this.cS();
         $$3 = new ezc(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cS();
      }

      return $$3.c(bZ, 0.0, bZ);
   }

   @Override
   public boolean E(btz $$0) {
      float $$1 = (float)this.h(bwd.c);
      cvx $$2 = this.eb();
      bsp $$3 = this.dY().b((buv)this);
      if (this.dX() instanceof arm $$4) {
         $$1 = dbo.a($$4, $$2, $$0, $$3, $$1);
      }

      boolean $$5 = $$0.a($$3, $$1);
      if ($$5) {
         float $$6 = this.a($$0, $$3);
         if ($$6 > 0.0F && $$0 instanceof buv $$7) {
            $$7.p((double)($$6 * 0.5F), (double)azj.a(this.dN() * (float) (Math.PI / 180.0)), (double)(-azj.b(this.dN() * (float) (Math.PI / 180.0))));
            this.h(this.dA().d(0.6, 1.0, 0.6));
         }

         if (this.dX() instanceof arm $$8) {
            if ($$0 instanceof buv $$9) {
               $$2.a($$9, this);
            }

            dbo.a($$8, $$0, $$3);
         }

         this.B($$0);
         this.gm();
      }

      return $$5;
   }

   protected void gm() {
   }

   protected boolean gn() {
      if (this.dX().S() && !this.dX().C) {
         float $$0 = this.bz();
         jg $$1 = jg.a(this.dC(), this.dG(), this.dI());
         boolean $$2 = this.bm() || this.aw || this.ax;
         if ($$0 > 0.5F && this.af.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dX().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(axp<erd> $$0) {
      if (this.P().q()) {
         super.c($$0);
      } else {
         this.h(this.dA().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void go() {
      this.d($$0 -> true);
      this.ed().h();
   }

   public void d(Predicate<cbt> $$0) {
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
   public cvx dK() {
      cxg $$0 = cxg.a(this.aq());
      return $$0 == null ? null : new cvx($$0);
   }

   @Override
   protected void f(jp<bvy> $$0) {
      super.f($$0);
      if ($$0.a(bwd.m) || $$0.a(bwd.E)) {
         this.P().g();
      }
   }

   @VisibleForTesting
   public float[] gp() {
      return this.bU;
   }

   @VisibleForTesting
   public float[] gq() {
      return this.bV;
   }

   public void a(Optional<alg<eub>> $$0) {
      this.cj = $$0;
   }

   public void a(long $$0) {
      this.ck = $$0;
   }
}

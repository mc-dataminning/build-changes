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

public abstract class bup extends bun implements buc, bul, bvk {
   private static final akh<Byte> b = akl.a(bup.class, akj.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int h = 1;
   private static final kj bX = new kj(1, 0, 1);
   private static final List<btz> bY = List.of(btz.f, btz.e, btz.d, btz.c);
   public static final float bD = 0.15F;
   public static final float bE = 0.55F;
   public static final float bF = 0.5F;
   public static final float bG = 0.25F;
   public static final float bH = 0.085F;
   public static final float bI = 1.0F;
   public static final int bJ = 2;
   public static final int bK = 2;
   private static final double bZ = Math.sqrt(2.04F) - 0.6F;
   protected static final ale bL = ale.b("random_spawn_bonus");
   public int bM;
   protected int bN;
   protected cam bO;
   protected can bP;
   protected cal bQ;
   private final cai ca;
   protected cdy bR;
   protected final cbl bS;
   protected final cbl bT;
   @Nullable
   private bun cb;
   private final cev cc;
   private final jx<cvs> cd = jx.a(2, cvs.k);
   protected final float[] bU = new float[2];
   private final jx<cvs> ce = jx.a(4, cvs.k);
   protected final float[] bV = new float[4];
   private cvs cf = cvs.k;
   protected float bW;
   private boolean cg;
   private boolean ch;
   private final Map<erk, Float> ci = Maps.newEnumMap(erk.class);
   private Optional<ald<etq>> cj = Optional.empty();
   private long ck;
   @Nullable
   private bul.a cl;
   private jf cm = jf.c;
   private float cn = -1.0F;

   protected bup(bty<? extends bup> $$0, dej $$1) {
      super($$0, $$1);
      this.bS = new cbl($$1.ai());
      this.bT = new cbl($$1.ai());
      this.bO = new cam(this);
      this.bP = new can(this);
      this.bQ = new cal(this);
      this.ca = this.J();
      this.bR = this.b($$1);
      this.cc = new cev(this);
      Arrays.fill(this.bV, 0.085F);
      Arrays.fill(this.bU, 0.085F);
      this.bW = 0.085F;
      if ($$1 != null && !$$1.B) {
         this.D();
      }
   }

   @Override
   protected void D() {
   }

   public static bvt.a E() {
      return bun.ea().a(bvu.m, 16.0);
   }

   protected cdy b(dej $$0) {
      return new cdx(this, $$0);
   }

   protected boolean F() {
      return false;
   }

   public float a(erk $$0) {
      bup $$2;
      label17: {
         if (this.dh() instanceof bup $$1 && $$1.F()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.ci.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(erk $$0, float $$1) {
      this.ci.put($$0, $$1);
   }

   @Override
   public void G() {
   }

   @Override
   public void I() {
   }

   protected cai J() {
      return new cai(this);
   }

   public cam K() {
      return this.bO;
   }

   public can M() {
      return this.dh() instanceof bup $$0 ? $$0.M() : this.bP;
   }

   public cal O() {
      return this.bQ;
   }

   public cdy P() {
      return this.dh() instanceof bup $$0 ? $$0.P() : this.bR;
   }

   @Nullable
   @Override
   public bun cU() {
      btr $$0 = this.cX();
      if (!this.gd() && $$0 instanceof bup $$1 && $$0.bZ()) {
         return $$1;
      }

      return null;
   }

   public cev Q() {
      return this.cc;
   }

   @Nullable
   @Override
   public bun m() {
      return this.cb;
   }

   @Nullable
   protected final bun R() {
      return this.dY().c(cdq.o).orElse(null);
   }

   public void h(@Nullable bun $$0) {
      this.cb = $$0;
   }

   @Override
   public boolean a(bty<?> $$0) {
      return $$0 != bty.T;
   }

   public boolean a(cwo $$0) {
      return false;
   }

   public void S() {
      this.a(dzp.m);
   }

   @Override
   protected void a(akl.a $$0) {
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
   public void ay() {
      super.ay();
      this.dS().ah().a("mobBaseTick");
      if (this.bI() && this.af.a(1000) < this.bM++) {
         this.q();
         this.U();
      }

      this.dS().ah().c();
   }

   @Override
   protected void e(bsj $$0) {
      this.q();
      super.e($$0);
   }

   private void q() {
      this.bM = -this.T();
   }

   @Override
   protected int el() {
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
      if (this.dS().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.af.k() * 0.02;
            double $$2 = this.af.k() * 0.02;
            double $$3 = this.af.k() * 0.02;
            double $$4 = 10.0;
            this.dS().a(lo.ab, this.c(1.0) - $$1 * 10.0, this.dA() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dS().a(this, (byte)20);
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
      if (!this.dS().B && this.ag % 5 == 0) {
         this.W();
      }
   }

   protected void W() {
      boolean $$0 = !(this.cU() instanceof bup);
      boolean $$1 = !(this.dg() instanceof cpx);
      this.bS.a(cbk.a.a, $$0);
      this.bS.a(cbk.a.c, $$0 && $$1);
      this.bS.a(cbk.a.b, $$0);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.ca.a();
      return $$1;
   }

   @Nullable
   protected awf w() {
      return null;
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fJ());
      $$0.a("PersistenceRequired", this.ch);
      um $$1 = new um();

      for (cvs $$2 : this.ce) {
         if (!$$2.f()) {
            $$1.add($$2.a(this.dU()));
         } else {
            $$1.add(new ug());
         }
      }

      $$0.a("ArmorItems", $$1);
      um $$3 = new um();

      for (float $$4 : this.bV) {
         $$3.add(uj.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      um $$5 = new um();

      for (cvs $$6 : this.cd) {
         if (!$$6.f()) {
            $$5.add($$6.a(this.dU()));
         } else {
            $$5.add(new ug());
         }
      }

      $$0.a("HandItems", $$5);
      um $$7 = new um();

      for (float $$8 : this.bU) {
         $$7.add(uj.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.cf.f()) {
         $$0.a("body_armor_item", this.cf.a(this.dU()));
         $$0.a("body_armor_drop_chance", this.bW);
      }

      this.a($$0, this.cl);
      $$0.a("LeftHanded", this.ge());
      if (this.cj.isPresent()) {
         $$0.a("DeathLootTable", this.cj.get().a().toString());
         if (this.ck != 0L) {
            $$0.a("DeathLootTableSeed", this.ck);
         }
      }

      if (this.gd()) {
         $$0.a("NoAI", this.gd());
      }
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 99)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.ch = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         um $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ce.size(); $$2++) {
            ug $$3 = $$1.a($$2);
            this.ce.set($$2, cvs.a(this.dU(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         um $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bV[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         um $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.cd.size(); $$7++) {
            ug $$8 = $$6.a($$7);
            this.cd.set($$7, cvs.a(this.dU(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         um $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bU[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cf = cvs.a(this.dU(), (vd)$$0.p("body_armor_item")).orElse(cvs.k);
         this.bW = $$0.j("body_armor_drop_chance");
      } else {
         this.cf = cvs.k;
      }

      this.cl = this.c($$0);
      this.v($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cj = Optional.of(ald.a(lw.be, ale.a($$0.l("DeathLootTable"))));
         this.ck = $$0.i("DeathLootTableSeed");
      }

      this.u($$0.q("NoAI"));
   }

   @Override
   protected void a(bsj $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cj = Optional.empty();
   }

   @Override
   public final Optional<ald<etq>> dX() {
      return this.cj.isPresent() ? this.cj : super.dX();
   }

   @Override
   public long eF() {
      return this.ck;
   }

   public void G(float $$0) {
      this.bm = $$0;
   }

   public void H(float $$0) {
      this.bl = $$0;
   }

   public void I(float $$0) {
      this.bk = $$0;
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
      this.dS().ah().a("looting");
      if (!this.dS().B && this.fJ() && this.bI() && !this.ba && this.dS().ac().b(def.c)) {
         kj $$0 = this.Y();

         for (ckh $$2 : this.dS().a(ckh.class, this.cO().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dN() && !$$2.m().f() && !$$2.w() && this.j($$2.m())) {
               this.b($$2);
            }
         }
      }

      this.dS().ah().c();
   }

   protected kj Y() {
      return bX;
   }

   protected void b(ckh $$0) {
      cvs $$1 = $$0.m();
      cvs $$2 = this.h($$1.u());
      if (!$$2.f()) {
         this.a($$0);
         this.a($$0, $$2.K());
         $$1.h($$2.K());
         if ($$1.f()) {
            $$0.as();
         }
      }
   }

   public cvs h(cvs $$0) {
      btz $$1 = this.g($$0);
      cvs $$2 = this.a($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = btz.a;
         $$2 = this.a($$1);
         $$3 = $$2.f();
      }

      if ($$3 && this.i($$0)) {
         double $$4 = (double)this.g($$1);
         if (!$$2.f() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         cvs $$5 = $$1.a($$0);
         this.b($$1, $$5);
         return $$5;
      } else {
         return cvs.k;
      }
   }

   @Override
   protected void b(btz $$0, cvs $$1) {
      this.a($$0, $$1);
      this.f($$0);
      this.ch = true;
   }

   public void f(btz $$0) {
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

   protected boolean b(cvs $$0, cvs $$1) {
      if ($$1.f()) {
         return true;
      } else if ($$0.h() instanceof cxg) {
         if (!($$1.h() instanceof cxg)) {
            return true;
         } else {
            double $$2 = this.n($$0);
            double $$3 = this.n($$1);
            return $$2 != $$3 ? $$2 > $$3 : this.c($$0, $$1);
         }
      } else if ($$0.h() instanceof cty && $$1.h() instanceof cty) {
         return this.c($$0, $$1);
      } else if ($$0.h() instanceof cug && $$1.h() instanceof cug) {
         return this.c($$0, $$1);
      } else if ($$0.h() instanceof ctl $$4) {
         if (dbp.a($$1, dbo.E)) {
            return false;
         } else if (!($$1.h() instanceof ctl)) {
            return true;
         } else {
            ctl $$5 = (ctl)$$1.h();
            if ($$4.j() != $$5.j()) {
               return $$4.j() > $$5.j();
            } else {
               return $$4.k() != $$5.k() ? $$4.k() > $$5.k() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.h() instanceof cui) {
            if ($$1.h() instanceof ctu) {
               return true;
            }

            if ($$1.h() instanceof cui) {
               double $$6 = this.n($$0);
               double $$7 = this.n($$1);
               if ($$6 != $$7) {
                  return $$6 > $$7;
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   private double n(cvs $$0) {
      cyn $$1 = $$0.a(ks.n, cyn.a);
      return $$1.a(this.i(bvu.c), btz.a);
   }

   public boolean c(cvs $$0, cvs $$1) {
      return $$0.o() < $$1.o() ? true : o($$0) && !o($$1);
   }

   private static boolean o(cvs $$0) {
      ko $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(ks.e);
   }

   public boolean i(cvs $$0) {
      return true;
   }

   public boolean j(cvs $$0) {
      return this.i($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean Z() {
      return this.bW();
   }

   protected boolean aa() {
      return false;
   }

   @Override
   public void dE() {
      if (this.dS().am() == brp.a && this.aa()) {
         this.as();
      } else if (!this.fX() && !this.Z()) {
         btr $$0 = this.dS().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.ao().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.as();
            }

            int $$4 = this.ao().f().g();
            int $$5 = $$4 * $$4;
            if (this.bb > 600 && this.af.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.as();
            } else if ($$1 < (double)$$5) {
               this.bb = 0;
            }
         }
      } else {
         this.bb = 0;
      }
   }

   @Override
   protected final void fq() {
      this.bb++;
      bog $$0 = this.dS().ah();
      $$0.a("sensing");
      this.cc.a();
      $$0.c();
      int $$1 = this.ag + this.ap();
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
      ago.a(this.dS(), this, this.bS);
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
      float $$1 = this.cx();
      float $$2 = azf.h(this.aT - $$1);
      float $$3 = azf.a(azf.h(this.aT - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.q($$4);
   }

   public int ah() {
      return 10;
   }

   public void a(btr $$0, float $$1, float $$2) {
      double $$3 = $$0.dx() - this.dx();
      double $$4 = $$0.dD() - this.dD();
      double $$6;
      if ($$0 instanceof bun $$5) {
         $$6 = $$5.dB() - this.dB();
      } else {
         $$6 = ($$0.cO().b + $$0.cO().e) / 2.0 - this.dB();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(azf.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(azf.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.w(this.a(this.dK(), $$10, $$2));
      this.v(this.a(this.dI(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azf.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bty<? extends bup> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      jf $$5 = $$3.e();
      return btx.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dek $$0, btx $$1) {
      return true;
   }

   public boolean a(dem $$0) {
      return !$$0.d(this.cO()) && $$0.f(this);
   }

   public int fS() {
      return 4;
   }

   public boolean r(int $$0) {
      return false;
   }

   @Override
   public int cB() {
      if (this.m() == null) {
         return this.y(0.0F);
      } else {
         int $$0 = (int)(this.eB() - this.eQ() * 0.33F);
         $$0 -= (3 - this.dS().am().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.y((float)$$0);
      }
   }

   @Override
   public Iterable<cvs> eZ() {
      return this.cd;
   }

   @Override
   public Iterable<cvs> eY() {
      return this.ce;
   }

   public cvs fT() {
      return this.cf;
   }

   @Override
   public boolean e(btz $$0) {
      return $$0 != btz.g;
   }

   public boolean fU() {
      return !this.a(btz.g).f();
   }

   public boolean k(cvs $$0) {
      return false;
   }

   public void l(cvs $$0) {
      this.b(btz.g, $$0);
   }

   @Override
   public Iterable<cvs> fa() {
      return (Iterable<cvs>)(this.cf.f() ? this.ce : Iterables.concat(this.ce, List.of(this.cf)));
   }

   @Override
   public cvs a(btz $$0) {
      return switch ($$0.a()) {
         case a -> (cvs)this.cd.get($$0.b());
         case b -> (cvs)this.ce.get($$0.b());
         case c -> this.cf;
      };
   }

   @Override
   public void a(btz $$0, cvs $$1) {
      this.c($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cd.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
            break;
         case c:
            cvs $$2 = this.cf;
            this.cf = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(arj $$0, bsj $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (btz $$3 : btz.values()) {
         cvs $$4 = this.a($$3);
         float $$5 = this.g($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = $$5 > 1.0F;
            btr var13 = $$1.d();
            if (var13 instanceof bun) {
               bun $$7 = (bun)var13;
               if (this.dS() instanceof arj $$8) {
                  $$5 = dbp.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !dbp.a($$4, dbo.D) && ($$2 || $$6) && this.af.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.af.a(1 + this.af.a(Math.max($$4.p() - 3, 1))));
               }

               this.b($$4);
               this.a($$3, cvs.k);
            }
         }
      }
   }

   protected float g(btz $$0) {
      return switch ($$0.a()) {
         case a -> this.bU[$$0.b()];
         case b -> this.bV[$$0.b()];
         case c -> this.bW;
      };
   }

   public void fV() {
      this.c($$0 -> true);
   }

   public Set<btz> c(Predicate<cvs> $$0) {
      Set<btz> $$1 = new HashSet<>();

      for (btz $$2 : btz.values()) {
         cvs $$3 = this.a($$2);
         if (!$$3.f()) {
            if (!$$0.test($$3)) {
               $$1.add($$2);
            } else {
               double $$4 = (double)this.g($$2);
               if ($$4 > 1.0) {
                  this.a($$2, cvs.k);
                  this.b($$3);
               }
            }
         }
      }

      return $$1;
   }

   private eto a(arj $$0) {
      return new eto.a($$0).a(ewh.f, this.dq()).a(ewh.a, this).a(ewg.h);
   }

   public void a(bub $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(ald<etq> $$0, Map<btz, Float> $$1) {
      if (this.dS() instanceof arj $$2) {
         this.a($$0, this.a($$2), $$1);
      }
   }

   protected void a(azn $$0, brq $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dS().am() == brp.d ? 0.1F : 0.25F;
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

         for (btz $$5 : bY) {
            cvs $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               cvn $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new cvs($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static cvn a(btz $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cvw.pz;
            } else if ($$1 == 1) {
               return cvw.pP;
            } else if ($$1 == 2) {
               return cvw.pD;
            } else if ($$1 == 3) {
               return cvw.pH;
            } else if ($$1 == 4) {
               return cvw.pL;
            }
         case e:
            if ($$1 == 0) {
               return cvw.pA;
            } else if ($$1 == 1) {
               return cvw.pQ;
            } else if ($$1 == 2) {
               return cvw.pE;
            } else if ($$1 == 3) {
               return cvw.pI;
            } else if ($$1 == 4) {
               return cvw.pM;
            }
         case d:
            if ($$1 == 0) {
               return cvw.pB;
            } else if ($$1 == 1) {
               return cvw.pR;
            } else if ($$1 == 2) {
               return cvw.pF;
            } else if ($$1 == 3) {
               return cvw.pJ;
            } else if ($$1 == 4) {
               return cvw.pN;
            }
         case c:
            if ($$1 == 0) {
               return cvw.pC;
            } else if ($$1 == 1) {
               return cvw.pS;
            } else if ($$1 == 2) {
               return cvw.pG;
            } else if ($$1 == 3) {
               return cvw.pK;
            } else if ($$1 == 4) {
               return cvw.pO;
            }
         default:
            return null;
      }
   }

   protected void a(dez $$0, azn $$1, brq $$2) {
      this.b($$0, $$1, $$2);

      for (btz $$3 : btz.values()) {
         if ($$3.a() == btz.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dez $$0, azn $$1, brq $$2) {
      this.a($$0, btz.a, $$1, 0.25F, $$2);
   }

   protected void a(dez $$0, azn $$1, btz $$2, brq $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dez $$0, btz $$1, azn $$2, float $$3, brq $$4) {
      cvs $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         dbp.a($$5, $$0.G_(), ddb.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      azn $$4 = $$0.D_();
      bvq $$5 = Objects.requireNonNull(this.g(bvu.m));
      if (!$$5.b(bL)) {
         $$5.d(new bvs(bL, $$4.a(0.0, 0.11485000000000001), bvs.a.b));
      }

      this.v($$4.i() < 0.05F);
      return $$3;
   }

   public void fW() {
      this.ch = true;
   }

   @Override
   public void a(btz $$0, float $$1) {
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
   public boolean fJ() {
      return this.cg;
   }

   public void a_(boolean $$0) {
      this.cg = $$0;
   }

   @Override
   public boolean e(cvs $$0) {
      btz $$1 = this.g($$0);
      return this.a($$1).f() && this.fJ();
   }

   public boolean fX() {
      return this.ch;
   }

   @Override
   public final brs a(cnx $$0, brr $$1) {
      if (!this.bI()) {
         return brs.e;
      } else {
         brs $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dzp.r, $$0);
            return $$2;
         } else {
            brs $$3 = super.a($$0, $$1);
            if ($$3 != brs.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(dzp.r, $$0);
                  return $$2;
               } else {
                  return brs.e;
               }
            }
         }
      }
   }

   private brs c(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if ($$2.a(cvw.uN)) {
         brs $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof cxb) {
         if (this.dS() instanceof arj) {
            cxb $$4 = (cxb)$$2.h();
            Optional<bup> $$5 = $$4.a($$0, this, (bty<? extends bup>)this.ao(), (arj)this.dS(), this.dq(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return brs.e;
            }
         }

         return brs.b;
      } else {
         return brs.e;
      }
   }

   protected void a(cnx $$0, bup $$1) {
   }

   protected brs b(cnx $$0, brr $$1) {
      return brs.e;
   }

   public boolean fY() {
      return this.a(this.ds());
   }

   public boolean a(jf $$0) {
      return this.cn == -1.0F ? true : this.cm.j($$0) < (double)(this.cn * this.cn);
   }

   public void a(jf $$0, int $$1) {
      this.cm = $$0;
      this.cn = (float)$$1;
   }

   public jf fZ() {
      return this.cm;
   }

   public float ga() {
      return this.cn;
   }

   public void gb() {
      this.cn = -1.0F;
   }

   public boolean gc() {
      return this.cn != -1.0F;
   }

   @Nullable
   public <T extends bup> T a(bty<T> $$0, boolean $$1) {
      if (this.dN()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dS(), btx.i);
         if ($$2 == null) {
            return null;
         } else {
            $$2.w(this);
            $$2.a(this.p_());
            $$2.u(this.gd());
            if (this.ak()) {
               $$2.b(this.al());
               $$2.p(this.cI());
            }

            if (this.fX()) {
               $$2.fW();
            }

            $$2.n(this.cz());
            if ($$1) {
               $$2.a_(this.fJ());

               for (btz $$3 : btz.values()) {
                  cvs $$4 = this.a($$3);
                  if (!$$4.f()) {
                     $$2.a($$3, $$4.g());
                     $$2.a($$3, this.g($$3));
                  }
               }
            }

            this.dS().b($$2);
            if (this.bW()) {
               btr $$5 = this.dg();
               this.af();
               $$2.a($$5, true);
            }

            this.as();
            return $$2;
         }
      }
   }

   @Nullable
   @Override
   public bul.a X_() {
      return this.cl;
   }

   @Override
   public void a(@Nullable bul.a $$0) {
      this.cl = $$0;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      bul.super.a($$0, $$1);
      if (this.X_() == null) {
         this.gb();
      }
   }

   @Override
   public void B() {
      bul.super.B();
      this.bS.a(cbk.a.a);
   }

   @Override
   public boolean A() {
      return !(this instanceof ckv);
   }

   @Override
   public boolean a(btr $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.L_()) {
         this.a(true, true);
      }

      return $$2;
   }

   @Override
   public boolean df() {
      return super.df() && !this.gd();
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

   public boolean gd() {
      return (this.am.a(b) & 1) != 0;
   }

   public boolean ge() {
      return (this.am.a(b) & 2) != 0;
   }

   public boolean gf() {
      return (this.am.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public buh fu() {
      return this.ge() ? buh.a : buh.b;
   }

   public boolean i(bun $$0) {
      return this.gg().c($$0.eJ());
   }

   protected eyr gg() {
      btr $$0 = this.dg();
      eyr $$3;
      if ($$0 != null) {
         eyr $$1 = $$0.cO();
         eyr $$2 = this.cO();
         $$3 = new eyr(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cO();
      }

      return $$3.c(bZ, 0.0, bZ);
   }

   @Override
   public boolean E(btr $$0) {
      float $$1 = (float)this.h(bvu.c);
      cvs $$2 = this.dW();
      bsj $$3 = this.dT().b((bun)this);
      if (this.dS() instanceof arj $$4) {
         $$1 = dbp.a($$4, $$2, $$0, $$3, $$1);
      }

      boolean $$5 = $$0.a($$3, $$1);
      if ($$5) {
         float $$6 = this.a($$0, $$3);
         if ($$6 > 0.0F && $$0 instanceof bun $$7) {
            $$7.p((double)($$6 * 0.5F), (double)azf.a(this.dI() * (float) (Math.PI / 180.0)), (double)(-azf.b(this.dI() * (float) (Math.PI / 180.0))));
            this.h(this.dv().d(0.6, 1.0, 0.6));
         }

         if (this.dS() instanceof arj $$8) {
            if ($$0 instanceof bun $$9) {
               $$2.a($$9, this);
            }

            dbp.a($$8, $$0, $$3);
         }

         this.B($$0);
         this.gh();
      }

      return $$5;
   }

   protected void gh() {
   }

   protected boolean gi() {
      if (this.dS().S() && !this.dS().B) {
         float $$0 = this.bx();
         jf $$1 = jf.a(this.dx(), this.dB(), this.dD());
         boolean $$2 = this.bk() || this.aw || this.ax;
         if ($$0 > 0.5F && this.af.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dS().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(axl<eqs> $$0) {
      if (this.P().q()) {
         super.c($$0);
      } else {
         this.h(this.dv().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gj() {
      this.d($$0 -> true);
      this.dY().h();
   }

   public void d(Predicate<cbk> $$0) {
      this.bS.a($$0);
   }

   @Override
   protected void cA() {
      super.cA();
      this.fb().forEach($$0 -> {
         if (!$$0.f()) {
            $$0.e(0);
         }
      });
   }

   @Nullable
   @Override
   public cvs dF() {
      cxb $$0 = cxb.a(this.ao());
      return $$0 == null ? null : new cvs($$0);
   }

   @Override
   protected void f(jo<bvp> $$0) {
      super.f($$0);
      if ($$0.a(bvu.m) || $$0.a(bvu.E)) {
         this.P().g();
      }
   }
}

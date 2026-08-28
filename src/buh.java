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

public abstract class buh extends buf implements btu, bud, bvc {
   private static final akg<Byte> b = akk.a(buh.class, aki.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int h = 1;
   private static final ki bY = new ki(1, 0, 1);
   private static final List<btr> bZ = List.of(btr.f, btr.e, btr.d, btr.c);
   public static final float bE = 0.15F;
   public static final float bF = 0.55F;
   public static final float bG = 0.5F;
   public static final float bH = 0.25F;
   public static final float bI = 0.085F;
   public static final float bJ = 1.0F;
   public static final int bK = 2;
   public static final int bL = 2;
   private static final double ca = Math.sqrt(2.04F) - 0.6F;
   protected static final alb bM = alb.b("random_spawn_bonus");
   public int bN;
   protected int bO;
   protected cae bP;
   protected caf bQ;
   protected cad bR;
   private final caa cb;
   protected cdq bS;
   protected final cbd bT;
   protected final cbd bU;
   @Nullable
   private buf cc;
   private final cen cd;
   private final jw<cvl> ce = jw.a(2, cvl.k);
   protected final float[] bV = new float[2];
   private final jw<cvl> cf = jw.a(4, cvl.k);
   protected final float[] bW = new float[4];
   private cvl cg = cvl.k;
   protected float bX;
   private boolean ch;
   private boolean ci;
   private final Map<eqs, Float> cj = Maps.newEnumMap(eqs.class);
   @Nullable
   private ala<esy> ck;
   private long cl;
   @Nullable
   private bud.a cm;
   private je cn = je.c;
   private float co = -1.0F;

   protected buh(btq<? extends buh> $$0, dds $$1) {
      super($$0, $$1);
      this.bT = new cbd($$1.ai());
      this.bU = new cbd($$1.ai());
      this.bP = new cae(this);
      this.bQ = new caf(this);
      this.bR = new cad(this);
      this.cb = this.J();
      this.bS = this.b($$1);
      this.cd = new cen(this);
      Arrays.fill(this.bW, 0.085F);
      Arrays.fill(this.bV, 0.085F);
      this.bX = 0.085F;
      if ($$1 != null && !$$1.B) {
         this.D();
      }
   }

   @Override
   protected void D() {
   }

   public static bvl.a E() {
      return buf.dZ().a(bvm.m, 16.0);
   }

   protected cdq b(dds $$0) {
      return new cdp(this, $$0);
   }

   protected boolean F() {
      return false;
   }

   public float a(eqs $$0) {
      buh $$2;
      label17: {
         if (this.dh() instanceof buh $$1 && $$1.F()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cj.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(eqs $$0, float $$1) {
      this.cj.put($$0, $$1);
   }

   @Override
   public void G() {
   }

   @Override
   public void I() {
   }

   protected caa J() {
      return new caa(this);
   }

   public cae K() {
      return this.bP;
   }

   public caf M() {
      return this.dh() instanceof buh $$0 ? $$0.M() : this.bQ;
   }

   public cad O() {
      return this.bR;
   }

   public cdq P() {
      return this.dh() instanceof buh $$0 ? $$0.P() : this.bS;
   }

   @Nullable
   @Override
   public buf cU() {
      btj $$0 = this.cX();
      if (!this.gd() && $$0 instanceof buh $$1 && $$0.bZ()) {
         return $$1;
      }

      return null;
   }

   public cen Q() {
      return this.cd;
   }

   @Nullable
   @Override
   public buf m() {
      return this.cc;
   }

   @Nullable
   protected final buf R() {
      return this.dX().c(cdi.o).orElse(null);
   }

   public void h(@Nullable buf $$0) {
      this.cc = $$0;
   }

   @Override
   public boolean a(btq<?> $$0) {
      return $$0 != btq.T;
   }

   public boolean a(cwi $$0) {
      return false;
   }

   public void S() {
      this.a(dyx.m);
   }

   @Override
   protected void a(akk.a $$0) {
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
      if (this.bI() && this.af.a(1000) < this.bN++) {
         this.q();
         this.U();
      }

      this.dS().ah().c();
   }

   @Override
   protected void e(bsb $$0) {
      this.q();
      super.e($$0);
   }

   private void q() {
      this.bN = -this.T();
   }

   @Override
   protected int ek() {
      if (this.bO > 0) {
         int $$0 = this.bO;

         for (int $$1 = 0; $$1 < this.cf.size(); $$1++) {
            if (!this.cf.get($$1).f() && this.bW[$$1] <= 1.0F) {
               $$0 += 1 + this.af.a(3);
            }
         }

         for (int $$2 = 0; $$2 < this.ce.size(); $$2++) {
            if (!this.ce.get($$2).f() && this.bV[$$2] <= 1.0F) {
               $$0 += 1 + this.af.a(3);
            }
         }

         if (!this.cg.f() && this.bX <= 1.0F) {
            $$0 += 1 + this.af.a(3);
         }

         return $$0;
      } else {
         return this.bO;
      }
   }

   public void V() {
      if (this.dS().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.af.k() * 0.02;
            double $$2 = this.af.k() * 0.02;
            double $$3 = this.af.k() * 0.02;
            double $$4 = 10.0;
            this.dS().a(ln.ab, this.c(1.0) - $$1 * 10.0, this.dA() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
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
      boolean $$0 = !(this.cU() instanceof buh);
      boolean $$1 = !(this.dg() instanceof cpo);
      this.bT.a(cbc.a.a, $$0);
      this.bT.a(cbc.a.c, $$0 && $$1);
      this.bT.a(cbc.a.b, $$0);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.cb.a();
      return $$1;
   }

   @Nullable
   protected awc w() {
      return null;
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fW());
      $$0.a("PersistenceRequired", this.ci);
      ul $$1 = new ul();

      for (cvl $$2 : this.cf) {
         if (!$$2.f()) {
            $$1.add($$2.a(this.dU()));
         } else {
            $$1.add(new uf());
         }
      }

      $$0.a("ArmorItems", $$1);
      ul $$3 = new ul();

      for (float $$4 : this.bW) {
         $$3.add(ui.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      ul $$5 = new ul();

      for (cvl $$6 : this.ce) {
         if (!$$6.f()) {
            $$5.add($$6.a(this.dU()));
         } else {
            $$5.add(new uf());
         }
      }

      $$0.a("HandItems", $$5);
      ul $$7 = new ul();

      for (float $$8 : this.bV) {
         $$7.add(ui.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.cg.f()) {
         $$0.a("body_armor_item", this.cg.a(this.dU()));
         $$0.a("body_armor_drop_chance", this.bX);
      }

      this.a($$0, this.cm);
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
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 99)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.ci = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         ul $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cf.size(); $$2++) {
            uf $$3 = $$1.a($$2);
            this.cf.set($$2, cvl.a(this.dU(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         ul $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bW[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         ul $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.ce.size(); $$7++) {
            uf $$8 = $$6.a($$7);
            this.ce.set($$7, cvl.a(this.dU(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         ul $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bV[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cg = cvl.a(this.dU(), (vc)$$0.p("body_armor_item")).orElse(cvl.k);
         this.bX = $$0.j("body_armor_drop_chance");
      } else {
         this.cg = cvl.k;
      }

      this.cm = this.c($$0);
      this.v($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.ck = ala.a(lv.bc, alb.a($$0.l("DeathLootTable")));
         this.cl = $$0.i("DeathLootTableSeed");
      }

      this.u($$0.q("NoAI"));
   }

   @Override
   protected void a(bsb $$0, boolean $$1) {
      super.a($$0, $$1);
      this.ck = null;
   }

   @Override
   public final ala<esy> eE() {
      return this.ck == null ? this.X() : this.ck;
   }

   protected ala<esy> X() {
      return super.eE();
   }

   @Override
   public long eF() {
      return this.cl;
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

   public void Y() {
      this.P().o();
      this.I(0.0F);
      this.H(0.0F);
      this.C(0.0F);
   }

   @Override
   public void m_() {
      super.m_();
      this.dS().ah().a("looting");
      if (!this.dS().B && this.fW() && this.bI() && !this.bb && this.dS().ac().b(ddo.c)) {
         ki $$0 = this.Z();

         for (cjz $$2 : this.dS().a(cjz.class, this.cO().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dN() && !$$2.m().f() && !$$2.w() && this.l($$2.m())) {
               this.b($$2);
            }
         }
      }

      this.dS().ah().c();
   }

   protected ki Z() {
      return bY;
   }

   protected void b(cjz $$0) {
      cvl $$1 = $$0.m();
      cvl $$2 = this.j($$1.u());
      if (!$$2.f()) {
         this.a($$0);
         this.a($$0, $$2.J());
         $$1.h($$2.J());
         if ($$1.f()) {
            $$0.as();
         }
      }
   }

   public cvl j(cvl $$0) {
      btr $$1 = this.i($$0);
      cvl $$2 = this.a($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = btr.a;
         $$2 = this.a($$1);
         $$3 = $$2.f();
      }

      if ($$3 && this.k($$0)) {
         double $$4 = (double)this.g($$1);
         if (!$$2.f() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         cvl $$5 = $$1.a($$0);
         this.b($$1, $$5);
         return $$5;
      } else {
         return cvl.k;
      }
   }

   @Override
   protected void b(btr $$0, cvl $$1) {
      this.a($$0, $$1);
      this.f($$0);
      this.ci = true;
   }

   public void f(btr $$0) {
      switch ($$0.a()) {
         case a:
            this.bV[$$0.b()] = 2.0F;
            break;
         case b:
            this.bW[$$0.b()] = 2.0F;
            break;
         case c:
            this.bX = 2.0F;
      }
   }

   protected boolean b(cvl $$0, cvl $$1) {
      if ($$1.f()) {
         return true;
      } else if ($$0.h() instanceof cxb) {
         if (!($$1.h() instanceof cxb)) {
            return true;
         } else {
            double $$2 = this.p($$0);
            double $$3 = this.p($$1);
            return $$2 != $$3 ? $$2 > $$3 : this.c($$0, $$1);
         }
      } else if ($$0.h() instanceof ctp && $$1.h() instanceof ctp) {
         return this.c($$0, $$1);
      } else if ($$0.h() instanceof cty && $$1.h() instanceof cty) {
         return this.c($$0, $$1);
      } else if ($$0.h() instanceof ctc $$4) {
         if (day.a($$1, dax.E)) {
            return false;
         } else if (!($$1.h() instanceof ctc)) {
            return true;
         } else {
            ctc $$5 = (ctc)$$1.h();
            if ($$4.k() != $$5.k()) {
               return $$4.k() > $$5.k();
            } else {
               return $$4.l() != $$5.l() ? $$4.l() > $$5.l() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.h() instanceof cua) {
            if ($$1.h() instanceof ctl) {
               return true;
            }

            if ($$1.h() instanceof cua) {
               double $$6 = this.p($$0);
               double $$7 = this.p($$1);
               if ($$6 != $$7) {
                  return $$6 > $$7;
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   private double p(cvl $$0) {
      cyg $$1 = $$0.a(kr.n, cyg.a);
      return $$1.a(this.i(bvm.c), btr.a);
   }

   public boolean c(cvl $$0, cvl $$1) {
      return $$0.o() < $$1.o() ? true : q($$0) && !q($$1);
   }

   private static boolean q(cvl $$0) {
      kn $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(kr.e);
   }

   public boolean k(cvl $$0) {
      return true;
   }

   public boolean l(cvl $$0) {
      return this.k($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean aa() {
      return this.bW();
   }

   protected boolean ab() {
      return false;
   }

   @Override
   public void dE() {
      if (this.dS().am() == brh.a && this.ab()) {
         this.as();
      } else if (!this.fX() && !this.aa()) {
         btj $$0 = this.dS().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.ao().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.as();
            }

            int $$4 = this.ao().f().g();
            int $$5 = $$4 * $$4;
            if (this.bc > 600 && this.af.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.as();
            } else if ($$1 < (double)$$5) {
               this.bc = 0;
            }
         }
      } else {
         this.bc = 0;
      }
   }

   @Override
   protected final void fq() {
      this.bc++;
      bny $$0 = this.dS().ah();
      $$0.a("sensing");
      this.cd.a();
      $$0.c();
      int $$1 = this.ag + this.ap();
      if ($$1 % 2 != 0 && this.ag > 1) {
         $$0.a("targetSelector");
         this.bU.a(false);
         $$0.c();
         $$0.a("goalSelector");
         this.bT.a(false);
         $$0.c();
      } else {
         $$0.a("targetSelector");
         this.bU.a();
         $$0.c();
         $$0.a("goalSelector");
         this.bT.a();
         $$0.c();
      }

      $$0.a("navigation");
      this.bS.c();
      $$0.c();
      $$0.a("mob tick");
      this.ad();
      $$0.c();
      $$0.a("controls");
      $$0.a("move");
      this.bQ.a();
      $$0.b("look");
      this.bP.a();
      $$0.b("jump");
      this.bR.b();
      $$0.c();
      $$0.c();
      this.ac();
   }

   protected void ac() {
      agn.a(this.dS(), this, this.bT);
   }

   protected void ad() {
   }

   public int ae() {
      return 40;
   }

   public int ag() {
      return 75;
   }

   protected void ah() {
      float $$0 = (float)this.ag();
      float $$1 = this.cx();
      float $$2 = azc.g(this.aU - $$1);
      float $$3 = azc.a(azc.g(this.aU - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.q($$4);
   }

   public int fQ() {
      return 10;
   }

   public void a(btj $$0, float $$1, float $$2) {
      double $$3 = $$0.dx() - this.dx();
      double $$4 = $$0.dD() - this.dD();
      double $$6;
      if ($$0 instanceof buf $$5) {
         $$6 = $$5.dB() - this.dB();
      } else {
         $$6 = ($$0.cO().b + $$0.cO().e) / 2.0 - this.dB();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(azc.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(azc.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.w(this.a(this.dK(), $$10, $$2));
      this.v(this.a(this.dI(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azc.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(btq<? extends buh> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      je $$5 = $$3.e();
      return btp.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(ddt $$0, btp $$1) {
      return true;
   }

   public boolean a(ddv $$0) {
      return !$$0.d(this.cO()) && $$0.f(this);
   }

   public int fR() {
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
         int $$0 = (int)(this.eA() - this.eQ() * 0.33F);
         $$0 -= (3 - this.dS().am().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.y((float)$$0);
      }
   }

   @Override
   public Iterable<cvl> eZ() {
      return this.ce;
   }

   @Override
   public Iterable<cvl> eY() {
      return this.cf;
   }

   public cvl fS() {
      return this.cg;
   }

   @Override
   public boolean e(btr $$0) {
      return $$0 != btr.g;
   }

   public boolean fT() {
      return !this.a(btr.g).f();
   }

   public boolean m(cvl $$0) {
      return false;
   }

   public void n(cvl $$0) {
      this.b(btr.g, $$0);
   }

   @Override
   public Iterable<cvl> fa() {
      return (Iterable<cvl>)(this.cg.f() ? this.cf : Iterables.concat(this.cf, List.of(this.cg)));
   }

   @Override
   public cvl a(btr $$0) {
      return switch ($$0.a()) {
         case a -> (cvl)this.ce.get($$0.b());
         case b -> (cvl)this.cf.get($$0.b());
         case c -> this.cg;
      };
   }

   @Override
   public void a(btr $$0, cvl $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cf.set($$0.b(), $$1), $$1);
            break;
         case c:
            cvl $$2 = this.cg;
            this.cg = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(arg $$0, bsb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (btr $$3 : btr.values()) {
         cvl $$4 = this.a($$3);
         float $$5 = this.g($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = $$5 > 1.0F;
            btj var13 = $$1.d();
            if (var13 instanceof buf) {
               buf $$7 = (buf)var13;
               if (this.dS() instanceof arg $$8) {
                  $$5 = day.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !day.a($$4, dax.D) && ($$2 || $$6) && this.af.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.af.a(1 + this.af.a(Math.max($$4.p() - 3, 1))));
               }

               this.b($$4);
               this.a($$3, cvl.k);
            }
         }
      }
   }

   protected float g(btr $$0) {
      return switch ($$0.a()) {
         case a -> this.bV[$$0.b()];
         case b -> this.bW[$$0.b()];
         case c -> this.bX;
      };
   }

   public void fU() {
      this.c($$0 -> true);
   }

   public Set<btr> c(Predicate<cvl> $$0) {
      Set<btr> $$1 = new HashSet<>();

      for (btr $$2 : btr.values()) {
         cvl $$3 = this.a($$2);
         if (!$$3.f()) {
            if (!$$0.test($$3)) {
               $$1.add($$2);
            } else {
               double $$4 = (double)this.g($$2);
               if ($$4 > 1.0) {
                  this.a($$2, cvl.k);
                  this.b($$3);
               }
            }
         }
      }

      return $$1;
   }

   private esw a(arg $$0) {
      return new esw.a($$0).a(evp.f, this.dq()).a(evp.a, this).a(evo.h);
   }

   public void a(btt $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(ala<esy> $$0, Map<btr, Float> $$1) {
      if (this.dS() instanceof arg $$2) {
         this.a($$0, this.a($$2), $$1);
      }
   }

   protected void a(azk $$0, bri $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dS().am() == brh.d ? 0.1F : 0.25F;
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

         for (btr $$5 : bZ) {
            cvl $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               cvg $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new cvl($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static cvg a(btr $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cvo.pz;
            } else if ($$1 == 1) {
               return cvo.pP;
            } else if ($$1 == 2) {
               return cvo.pD;
            } else if ($$1 == 3) {
               return cvo.pH;
            } else if ($$1 == 4) {
               return cvo.pL;
            }
         case e:
            if ($$1 == 0) {
               return cvo.pA;
            } else if ($$1 == 1) {
               return cvo.pQ;
            } else if ($$1 == 2) {
               return cvo.pE;
            } else if ($$1 == 3) {
               return cvo.pI;
            } else if ($$1 == 4) {
               return cvo.pM;
            }
         case d:
            if ($$1 == 0) {
               return cvo.pB;
            } else if ($$1 == 1) {
               return cvo.pR;
            } else if ($$1 == 2) {
               return cvo.pF;
            } else if ($$1 == 3) {
               return cvo.pJ;
            } else if ($$1 == 4) {
               return cvo.pN;
            }
         case c:
            if ($$1 == 0) {
               return cvo.pC;
            } else if ($$1 == 1) {
               return cvo.pS;
            } else if ($$1 == 2) {
               return cvo.pG;
            } else if ($$1 == 3) {
               return cvo.pK;
            } else if ($$1 == 4) {
               return cvo.pO;
            }
         default:
            return null;
      }
   }

   protected void a(dei $$0, azk $$1, bri $$2) {
      this.b($$0, $$1, $$2);

      for (btr $$3 : btr.values()) {
         if ($$3.a() == btr.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dei $$0, azk $$1, bri $$2) {
      this.a($$0, btr.a, $$1, 0.25F, $$2);
   }

   protected void a(dei $$0, azk $$1, btr $$2, bri $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dei $$0, btr $$1, azk $$2, float $$3, bri $$4) {
      cvl $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         day.a($$5, $$0.F_(), dck.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      azk $$4 = $$0.C_();
      bvi $$5 = Objects.requireNonNull(this.g(bvm.m));
      if (!$$5.b(bM)) {
         $$5.d(new bvk(bM, $$4.a(0.0, 0.11485000000000001), bvk.a.b));
      }

      this.v($$4.i() < 0.05F);
      return $$3;
   }

   public void fV() {
      this.ci = true;
   }

   @Override
   public void a(btr $$0, float $$1) {
      switch ($$0.a()) {
         case a:
            this.bV[$$0.b()] = $$1;
            break;
         case b:
            this.bW[$$0.b()] = $$1;
            break;
         case c:
            this.bX = $$1;
      }
   }

   public boolean fW() {
      return this.ch;
   }

   public void a_(boolean $$0) {
      this.ch = $$0;
   }

   @Override
   public boolean g(cvl $$0) {
      btr $$1 = this.i($$0);
      return this.a($$1).f() && this.fW();
   }

   public boolean fX() {
      return this.ci;
   }

   @Override
   public final brk a(cnp $$0, brj $$1) {
      if (!this.bI()) {
         return brk.e;
      } else {
         brk $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dyx.r, $$0);
            return $$2;
         } else {
            brk $$3 = super.a($$0, $$1);
            if ($$3 != brk.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(dyx.r, $$0);
                  return $$2;
               } else {
                  return brk.e;
               }
            }
         }
      }
   }

   private brk c(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if ($$2.a(cvo.uN)) {
         brk $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof cwv) {
         if (this.dS() instanceof arg) {
            cwv $$4 = (cwv)$$2.h();
            Optional<buh> $$5 = $$4.a($$0, this, (btq<? extends buh>)this.ao(), (arg)this.dS(), this.dq(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return brk.e;
            }
         }

         return brk.b;
      } else {
         return brk.e;
      }
   }

   protected void a(cnp $$0, buh $$1) {
   }

   protected brk b(cnp $$0, brj $$1) {
      return brk.e;
   }

   public boolean fY() {
      return this.a(this.ds());
   }

   public boolean a(je $$0) {
      return this.co == -1.0F ? true : this.cn.j($$0) < (double)(this.co * this.co);
   }

   public void a(je $$0, int $$1) {
      this.cn = $$0;
      this.co = (float)$$1;
   }

   public je fZ() {
      return this.cn;
   }

   public float ga() {
      return this.co;
   }

   public void gb() {
      this.co = -1.0F;
   }

   public boolean gc() {
      return this.co != -1.0F;
   }

   @Nullable
   public <T extends buh> T a(btq<T> $$0, boolean $$1) {
      if (this.dN()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dS(), btp.i);
         if ($$2 == null) {
            return null;
         } else {
            $$2.w(this);
            $$2.a(this.o_());
            $$2.u(this.gd());
            if (this.ak()) {
               $$2.b(this.al());
               $$2.p(this.cI());
            }

            if (this.fX()) {
               $$2.fV();
            }

            $$2.n(this.cz());
            if ($$1) {
               $$2.a_(this.fW());

               for (btr $$3 : btr.values()) {
                  cvl $$4 = this.a($$3);
                  if (!$$4.f()) {
                     $$2.a($$3, $$4.g());
                     $$2.a($$3, this.g($$3));
                  }
               }
            }

            this.dS().b($$2);
            if (this.bW()) {
               btj $$5 = this.dg();
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
   public bud.a W_() {
      return this.cm;
   }

   @Override
   public void a(@Nullable bud.a $$0) {
      this.cm = $$0;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      bud.super.a($$0, $$1);
      if (this.W_() == null) {
         this.gb();
      }
   }

   @Override
   public void B() {
      bud.super.B();
      this.bT.a(cbc.a.a);
   }

   @Override
   public boolean A() {
      return !(this instanceof ckn);
   }

   @Override
   public boolean a(btj $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.K_()) {
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
   public btz fu() {
      return this.ge() ? btz.a : btz.b;
   }

   public boolean i(buf $$0) {
      return this.gg().c($$0.eJ());
   }

   protected exz gg() {
      btj $$0 = this.dg();
      exz $$3;
      if ($$0 != null) {
         exz $$1 = $$0.cO();
         exz $$2 = this.cO();
         $$3 = new exz(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cO();
      }

      return $$3.c(ca, 0.0, ca);
   }

   @Override
   public boolean E(btj $$0) {
      float $$1 = (float)this.h(bvm.c);
      cvl $$2 = this.dW();
      bsb $$3 = this.dT().b((buf)this);
      if (this.dS() instanceof arg $$4) {
         $$1 = day.a($$4, $$2, $$0, $$3, $$1);
      }

      boolean $$5 = $$0.a($$3, $$1);
      if ($$5) {
         float $$6 = this.a($$0, $$3);
         if ($$6 > 0.0F && $$0 instanceof buf $$7) {
            $$7.p((double)($$6 * 0.5F), (double)azc.a(this.dI() * (float) (Math.PI / 180.0)), (double)(-azc.b(this.dI() * (float) (Math.PI / 180.0))));
            this.h(this.dv().d(0.6, 1.0, 0.6));
         }

         if (this.dS() instanceof arg $$8) {
            if ($$0 instanceof buf $$9) {
               $$2.a($$9, this);
            }

            day.a($$8, $$0, $$3);
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
         je $$1 = je.a(this.dx(), this.dB(), this.dD());
         boolean $$2 = this.bk() || this.aw || this.ax;
         if ($$0 > 0.5F && this.af.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dS().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(axi<eqa> $$0) {
      if (this.P().q()) {
         super.c($$0);
      } else {
         this.h(this.dv().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gj() {
      this.d($$0 -> true);
      this.dX().h();
   }

   public void d(Predicate<cbc> $$0) {
      this.bT.a($$0);
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
   public cvl dF() {
      cwv $$0 = cwv.a(this.ao());
      return $$0 == null ? null : new cvl($$0);
   }

   @Override
   protected void f(jn<bvh> $$0) {
      super.f($$0);
      if ($$0.a(bvm.m) || $$0.a(bvm.E)) {
         this.P().g();
      }
   }
}

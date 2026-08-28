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

public abstract class bum extends buk implements btz, bui, bvh {
   private static final akg<Byte> b = akk.a(bum.class, aki.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int h = 1;
   private static final ki bX = new ki(1, 0, 1);
   private static final List<btw> bY = List.of(btw.f, btw.e, btw.d, btw.c);
   public static final float bD = 0.15F;
   public static final float bE = 0.55F;
   public static final float bF = 0.5F;
   public static final float bG = 0.25F;
   public static final float bH = 0.085F;
   public static final float bI = 1.0F;
   public static final int bJ = 2;
   public static final int bK = 2;
   private static final double bZ = Math.sqrt(2.04F) - 0.6F;
   protected static final alc bL = alc.b("random_spawn_bonus");
   public int bM;
   protected int bN;
   protected caj bO;
   protected cak bP;
   protected cai bQ;
   private final caf ca;
   protected cdv bR;
   protected final cbi bS;
   protected final cbi bT;
   @Nullable
   private buk cb;
   private final ces cc;
   private final jw<cvp> cd = jw.a(2, cvp.k);
   protected final float[] bU = new float[2];
   private final jw<cvp> ce = jw.a(4, cvp.k);
   protected final float[] bV = new float[4];
   private cvp cf = cvp.k;
   protected float bW;
   private boolean cg;
   private boolean ch;
   private final Map<erg, Float> ci = Maps.newEnumMap(erg.class);
   @Nullable
   private alb<etm> cj;
   private long ck;
   @Nullable
   private bui.a cl;
   private je cm = je.c;
   private float cn = -1.0F;

   protected bum(btv<? extends bum> $$0, deg $$1) {
      super($$0, $$1);
      this.bS = new cbi($$1.ai());
      this.bT = new cbi($$1.ai());
      this.bO = new caj(this);
      this.bP = new cak(this);
      this.bQ = new cai(this);
      this.ca = this.J();
      this.bR = this.b($$1);
      this.cc = new ces(this);
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

   public static bvq.a E() {
      return buk.dZ().a(bvr.m, 16.0);
   }

   protected cdv b(deg $$0) {
      return new cdu(this, $$0);
   }

   protected boolean F() {
      return false;
   }

   public float a(erg $$0) {
      bum $$2;
      label17: {
         if (this.dh() instanceof bum $$1 && $$1.F()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.ci.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(erg $$0, float $$1) {
      this.ci.put($$0, $$1);
   }

   @Override
   public void G() {
   }

   @Override
   public void I() {
   }

   protected caf J() {
      return new caf(this);
   }

   public caj K() {
      return this.bO;
   }

   public cak M() {
      return this.dh() instanceof bum $$0 ? $$0.M() : this.bP;
   }

   public cai O() {
      return this.bQ;
   }

   public cdv P() {
      return this.dh() instanceof bum $$0 ? $$0.P() : this.bR;
   }

   @Nullable
   @Override
   public buk cU() {
      bto $$0 = this.cX();
      if (!this.ge() && $$0 instanceof bum $$1 && $$0.bZ()) {
         return $$1;
      }

      return null;
   }

   public ces Q() {
      return this.cc;
   }

   @Nullable
   @Override
   public buk m() {
      return this.cb;
   }

   @Nullable
   protected final buk R() {
      return this.dX().c(cdn.o).orElse(null);
   }

   public void h(@Nullable buk $$0) {
      this.cb = $$0;
   }

   @Override
   public boolean a(btv<?> $$0) {
      return $$0 != btv.T;
   }

   public boolean a(cwl $$0) {
      return false;
   }

   public void S() {
      this.a(dzl.m);
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
      if (this.bI() && this.af.a(1000) < this.bM++) {
         this.q();
         this.U();
      }

      this.dS().ah().c();
   }

   @Override
   protected void e(bsg $$0) {
      this.q();
      super.e($$0);
   }

   private void q() {
      this.bM = -this.T();
   }

   @Override
   protected int ek() {
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
      boolean $$0 = !(this.cU() instanceof bum);
      boolean $$1 = !(this.dg() instanceof cpu);
      this.bS.a(cbh.a.a, $$0);
      this.bS.a(cbh.a.c, $$0 && $$1);
      this.bS.a(cbh.a.b, $$0);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.ca.a();
      return $$1;
   }

   @Nullable
   protected awd w() {
      return null;
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fX());
      $$0.a("PersistenceRequired", this.ch);
      ul $$1 = new ul();

      for (cvp $$2 : this.ce) {
         if (!$$2.f()) {
            $$1.add($$2.a(this.dU()));
         } else {
            $$1.add(new uf());
         }
      }

      $$0.a("ArmorItems", $$1);
      ul $$3 = new ul();

      for (float $$4 : this.bV) {
         $$3.add(ui.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      ul $$5 = new ul();

      for (cvp $$6 : this.cd) {
         if (!$$6.f()) {
            $$5.add($$6.a(this.dU()));
         } else {
            $$5.add(new uf());
         }
      }

      $$0.a("HandItems", $$5);
      ul $$7 = new ul();

      for (float $$8 : this.bU) {
         $$7.add(ui.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.cf.f()) {
         $$0.a("body_armor_item", this.cf.a(this.dU()));
         $$0.a("body_armor_drop_chance", this.bW);
      }

      this.a($$0, this.cl);
      $$0.a("LeftHanded", this.gf());
      if (this.cj != null) {
         $$0.a("DeathLootTable", this.cj.a().toString());
         if (this.ck != 0L) {
            $$0.a("DeathLootTableSeed", this.ck);
         }
      }

      if (this.ge()) {
         $$0.a("NoAI", this.ge());
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 99)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.ch = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         ul $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ce.size(); $$2++) {
            uf $$3 = $$1.a($$2);
            this.ce.set($$2, cvp.a(this.dU(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         ul $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bV[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         ul $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.cd.size(); $$7++) {
            uf $$8 = $$6.a($$7);
            this.cd.set($$7, cvp.a(this.dU(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         ul $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bU[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cf = cvp.a(this.dU(), (vc)$$0.p("body_armor_item")).orElse(cvp.k);
         this.bW = $$0.j("body_armor_drop_chance");
      } else {
         this.cf = cvp.k;
      }

      this.cl = this.c($$0);
      this.v($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cj = alb.a(lv.bd, alc.a($$0.l("DeathLootTable")));
         this.ck = $$0.i("DeathLootTableSeed");
      }

      this.u($$0.q("NoAI"));
   }

   @Override
   protected void a(bsg $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cj = null;
   }

   @Override
   public final alb<etm> eE() {
      return this.cj == null ? this.X() : this.cj;
   }

   protected alb<etm> X() {
      return super.eE();
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
      if (!this.dS().B && this.fX() && this.bI() && !this.ba && this.dS().ac().b(dec.c)) {
         ki $$0 = this.Z();

         for (cke $$2 : this.dS().a(cke.class, this.cO().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dN() && !$$2.m().f() && !$$2.w() && this.j($$2.m())) {
               this.b($$2);
            }
         }
      }

      this.dS().ah().c();
   }

   protected ki Z() {
      return bX;
   }

   protected void b(cke $$0) {
      cvp $$1 = $$0.m();
      cvp $$2 = this.h($$1.u());
      if (!$$2.f()) {
         this.a($$0);
         this.a($$0, $$2.J());
         $$1.h($$2.J());
         if ($$1.f()) {
            $$0.as();
         }
      }
   }

   public cvp h(cvp $$0) {
      btw $$1 = this.g($$0);
      cvp $$2 = this.a($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = btw.a;
         $$2 = this.a($$1);
         $$3 = $$2.f();
      }

      if ($$3 && this.i($$0)) {
         double $$4 = (double)this.g($$1);
         if (!$$2.f() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         cvp $$5 = $$1.a($$0);
         this.b($$1, $$5);
         return $$5;
      } else {
         return cvp.k;
      }
   }

   @Override
   protected void b(btw $$0, cvp $$1) {
      this.a($$0, $$1);
      this.f($$0);
      this.ch = true;
   }

   public void f(btw $$0) {
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

   protected boolean b(cvp $$0, cvp $$1) {
      if ($$1.f()) {
         return true;
      } else if ($$0.h() instanceof cxd) {
         if (!($$1.h() instanceof cxd)) {
            return true;
         } else {
            double $$2 = this.n($$0);
            double $$3 = this.n($$1);
            return $$2 != $$3 ? $$2 > $$3 : this.c($$0, $$1);
         }
      } else if ($$0.h() instanceof ctv && $$1.h() instanceof ctv) {
         return this.c($$0, $$1);
      } else if ($$0.h() instanceof cud && $$1.h() instanceof cud) {
         return this.c($$0, $$1);
      } else if ($$0.h() instanceof cti $$4) {
         if (dbm.a($$1, dbl.E)) {
            return false;
         } else if (!($$1.h() instanceof cti)) {
            return true;
         } else {
            cti $$5 = (cti)$$1.h();
            if ($$4.j() != $$5.j()) {
               return $$4.j() > $$5.j();
            } else {
               return $$4.k() != $$5.k() ? $$4.k() > $$5.k() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.h() instanceof cuf) {
            if ($$1.h() instanceof ctr) {
               return true;
            }

            if ($$1.h() instanceof cuf) {
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

   private double n(cvp $$0) {
      cyk $$1 = $$0.a(kr.n, cyk.a);
      return $$1.a(this.i(bvr.c), btw.a);
   }

   public boolean c(cvp $$0, cvp $$1) {
      return $$0.o() < $$1.o() ? true : o($$0) && !o($$1);
   }

   private static boolean o(cvp $$0) {
      kn $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(kr.e);
   }

   public boolean i(cvp $$0) {
      return true;
   }

   public boolean j(cvp $$0) {
      return this.i($$0);
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
      if (this.dS().am() == brm.a && this.ab()) {
         this.as();
      } else if (!this.fY() && !this.aa()) {
         bto $$0 = this.dS().a(this, -1.0);
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
      bod $$0 = this.dS().ah();
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
      this.ad();
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
      this.ac();
   }

   protected void ac() {
      agn.a(this.dS(), this, this.bS);
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
      float $$2 = azd.g(this.aT - $$1);
      float $$3 = azd.a(azd.g(this.aT - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.q($$4);
   }

   public int fR() {
      return 10;
   }

   public void a(bto $$0, float $$1, float $$2) {
      double $$3 = $$0.dx() - this.dx();
      double $$4 = $$0.dD() - this.dD();
      double $$6;
      if ($$0 instanceof buk $$5) {
         $$6 = $$5.dB() - this.dB();
      } else {
         $$6 = ($$0.cO().b + $$0.cO().e) / 2.0 - this.dB();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(azd.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(azd.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.w(this.a(this.dK(), $$10, $$2));
      this.v(this.a(this.dI(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azd.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(btv<? extends bum> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      je $$5 = $$3.e();
      return btu.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(deh $$0, btu $$1) {
      return true;
   }

   public boolean a(dej $$0) {
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
         int $$0 = (int)(this.eA() - this.eQ() * 0.33F);
         $$0 -= (3 - this.dS().am().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.y((float)$$0);
      }
   }

   @Override
   public Iterable<cvp> eZ() {
      return this.cd;
   }

   @Override
   public Iterable<cvp> eY() {
      return this.ce;
   }

   public cvp fT() {
      return this.cf;
   }

   @Override
   public boolean e(btw $$0) {
      return $$0 != btw.g;
   }

   public boolean fU() {
      return !this.a(btw.g).f();
   }

   public boolean k(cvp $$0) {
      return false;
   }

   public void l(cvp $$0) {
      this.b(btw.g, $$0);
   }

   @Override
   public Iterable<cvp> fa() {
      return (Iterable<cvp>)(this.cf.f() ? this.ce : Iterables.concat(this.ce, List.of(this.cf)));
   }

   @Override
   public cvp a(btw $$0) {
      return switch ($$0.a()) {
         case a -> (cvp)this.cd.get($$0.b());
         case b -> (cvp)this.ce.get($$0.b());
         case c -> this.cf;
      };
   }

   @Override
   public void a(btw $$0, cvp $$1) {
      this.c($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cd.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
            break;
         case c:
            cvp $$2 = this.cf;
            this.cf = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(arh $$0, bsg $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (btw $$3 : btw.values()) {
         cvp $$4 = this.a($$3);
         float $$5 = this.g($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = $$5 > 1.0F;
            bto var13 = $$1.d();
            if (var13 instanceof buk) {
               buk $$7 = (buk)var13;
               if (this.dS() instanceof arh $$8) {
                  $$5 = dbm.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !dbm.a($$4, dbl.D) && ($$2 || $$6) && this.af.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.af.a(1 + this.af.a(Math.max($$4.p() - 3, 1))));
               }

               this.b($$4);
               this.a($$3, cvp.k);
            }
         }
      }
   }

   protected float g(btw $$0) {
      return switch ($$0.a()) {
         case a -> this.bU[$$0.b()];
         case b -> this.bV[$$0.b()];
         case c -> this.bW;
      };
   }

   public void fV() {
      this.c($$0 -> true);
   }

   public Set<btw> c(Predicate<cvp> $$0) {
      Set<btw> $$1 = new HashSet<>();

      for (btw $$2 : btw.values()) {
         cvp $$3 = this.a($$2);
         if (!$$3.f()) {
            if (!$$0.test($$3)) {
               $$1.add($$2);
            } else {
               double $$4 = (double)this.g($$2);
               if ($$4 > 1.0) {
                  this.a($$2, cvp.k);
                  this.b($$3);
               }
            }
         }
      }

      return $$1;
   }

   private etk a(arh $$0) {
      return new etk.a($$0).a(ewd.f, this.dq()).a(ewd.a, this).a(ewc.h);
   }

   public void a(bty $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(alb<etm> $$0, Map<btw, Float> $$1) {
      if (this.dS() instanceof arh $$2) {
         this.a($$0, this.a($$2), $$1);
      }
   }

   protected void a(azl $$0, brn $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dS().am() == brm.d ? 0.1F : 0.25F;
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

         for (btw $$5 : bY) {
            cvp $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               cvk $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new cvp($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static cvk a(btw $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cvt.pz;
            } else if ($$1 == 1) {
               return cvt.pP;
            } else if ($$1 == 2) {
               return cvt.pD;
            } else if ($$1 == 3) {
               return cvt.pH;
            } else if ($$1 == 4) {
               return cvt.pL;
            }
         case e:
            if ($$1 == 0) {
               return cvt.pA;
            } else if ($$1 == 1) {
               return cvt.pQ;
            } else if ($$1 == 2) {
               return cvt.pE;
            } else if ($$1 == 3) {
               return cvt.pI;
            } else if ($$1 == 4) {
               return cvt.pM;
            }
         case d:
            if ($$1 == 0) {
               return cvt.pB;
            } else if ($$1 == 1) {
               return cvt.pR;
            } else if ($$1 == 2) {
               return cvt.pF;
            } else if ($$1 == 3) {
               return cvt.pJ;
            } else if ($$1 == 4) {
               return cvt.pN;
            }
         case c:
            if ($$1 == 0) {
               return cvt.pC;
            } else if ($$1 == 1) {
               return cvt.pS;
            } else if ($$1 == 2) {
               return cvt.pG;
            } else if ($$1 == 3) {
               return cvt.pK;
            } else if ($$1 == 4) {
               return cvt.pO;
            }
         default:
            return null;
      }
   }

   protected void a(dew $$0, azl $$1, brn $$2) {
      this.b($$0, $$1, $$2);

      for (btw $$3 : btw.values()) {
         if ($$3.a() == btw.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dew $$0, azl $$1, brn $$2) {
      this.a($$0, btw.a, $$1, 0.25F, $$2);
   }

   protected void a(dew $$0, azl $$1, btw $$2, brn $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dew $$0, btw $$1, azl $$2, float $$3, brn $$4) {
      cvp $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         dbm.a($$5, $$0.F_(), dcy.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      azl $$4 = $$0.C_();
      bvn $$5 = Objects.requireNonNull(this.g(bvr.m));
      if (!$$5.b(bL)) {
         $$5.d(new bvp(bL, $$4.a(0.0, 0.11485000000000001), bvp.a.b));
      }

      this.v($$4.i() < 0.05F);
      return $$3;
   }

   public void fW() {
      this.ch = true;
   }

   @Override
   public void a(btw $$0, float $$1) {
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

   public boolean fX() {
      return this.cg;
   }

   public void a_(boolean $$0) {
      this.cg = $$0;
   }

   @Override
   public boolean e(cvp $$0) {
      btw $$1 = this.g($$0);
      return this.a($$1).f() && this.fX();
   }

   public boolean fY() {
      return this.ch;
   }

   @Override
   public final brp a(cnu $$0, bro $$1) {
      if (!this.bI()) {
         return brp.e;
      } else {
         brp $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dzl.r, $$0);
            return $$2;
         } else {
            brp $$3 = super.a($$0, $$1);
            if ($$3 != brp.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(dzl.r, $$0);
                  return $$2;
               } else {
                  return brp.e;
               }
            }
         }
      }
   }

   private brp c(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if ($$2.a(cvt.uN)) {
         brp $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof cwy) {
         if (this.dS() instanceof arh) {
            cwy $$4 = (cwy)$$2.h();
            Optional<bum> $$5 = $$4.a($$0, this, (btv<? extends bum>)this.ao(), (arh)this.dS(), this.dq(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return brp.e;
            }
         }

         return brp.b;
      } else {
         return brp.e;
      }
   }

   protected void a(cnu $$0, bum $$1) {
   }

   protected brp b(cnu $$0, bro $$1) {
      return brp.e;
   }

   public boolean fZ() {
      return this.a(this.ds());
   }

   public boolean a(je $$0) {
      return this.cn == -1.0F ? true : this.cm.j($$0) < (double)(this.cn * this.cn);
   }

   public void a(je $$0, int $$1) {
      this.cm = $$0;
      this.cn = (float)$$1;
   }

   public je ga() {
      return this.cm;
   }

   public float gb() {
      return this.cn;
   }

   public void gc() {
      this.cn = -1.0F;
   }

   public boolean gd() {
      return this.cn != -1.0F;
   }

   @Nullable
   public <T extends bum> T a(btv<T> $$0, boolean $$1) {
      if (this.dN()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dS(), btu.i);
         if ($$2 == null) {
            return null;
         } else {
            $$2.w(this);
            $$2.a(this.o_());
            $$2.u(this.ge());
            if (this.ak()) {
               $$2.b(this.al());
               $$2.p(this.cI());
            }

            if (this.fY()) {
               $$2.fW();
            }

            $$2.n(this.cz());
            if ($$1) {
               $$2.a_(this.fX());

               for (btw $$3 : btw.values()) {
                  cvp $$4 = this.a($$3);
                  if (!$$4.f()) {
                     $$2.a($$3, $$4.g());
                     $$2.a($$3, this.g($$3));
                  }
               }
            }

            this.dS().b($$2);
            if (this.bW()) {
               bto $$5 = this.dg();
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
   public bui.a W_() {
      return this.cl;
   }

   @Override
   public void a(@Nullable bui.a $$0) {
      this.cl = $$0;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      bui.super.a($$0, $$1);
      if (this.W_() == null) {
         this.gc();
      }
   }

   @Override
   public void B() {
      bui.super.B();
      this.bS.a(cbh.a.a);
   }

   @Override
   public boolean A() {
      return !(this instanceof cks);
   }

   @Override
   public boolean a(bto $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.K_()) {
         this.a(true, true);
      }

      return $$2;
   }

   @Override
   public boolean df() {
      return super.df() && !this.ge();
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

   public boolean ge() {
      return (this.am.a(b) & 1) != 0;
   }

   public boolean gf() {
      return (this.am.a(b) & 2) != 0;
   }

   public boolean gg() {
      return (this.am.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bue fu() {
      return this.gf() ? bue.a : bue.b;
   }

   public boolean i(buk $$0) {
      return this.gh().c($$0.eJ());
   }

   protected eyn gh() {
      bto $$0 = this.dg();
      eyn $$3;
      if ($$0 != null) {
         eyn $$1 = $$0.cO();
         eyn $$2 = this.cO();
         $$3 = new eyn(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cO();
      }

      return $$3.c(bZ, 0.0, bZ);
   }

   @Override
   public boolean E(bto $$0) {
      float $$1 = (float)this.h(bvr.c);
      cvp $$2 = this.dW();
      bsg $$3 = this.dT().b((buk)this);
      if (this.dS() instanceof arh $$4) {
         $$1 = dbm.a($$4, $$2, $$0, $$3, $$1);
      }

      boolean $$5 = $$0.a($$3, $$1);
      if ($$5) {
         float $$6 = this.a($$0, $$3);
         if ($$6 > 0.0F && $$0 instanceof buk $$7) {
            $$7.p((double)($$6 * 0.5F), (double)azd.a(this.dI() * (float) (Math.PI / 180.0)), (double)(-azd.b(this.dI() * (float) (Math.PI / 180.0))));
            this.h(this.dv().d(0.6, 1.0, 0.6));
         }

         if (this.dS() instanceof arh $$8) {
            if ($$0 instanceof buk $$9) {
               $$2.a($$9, this);
            }

            dbm.a($$8, $$0, $$3);
         }

         this.B($$0);
         this.gi();
      }

      return $$5;
   }

   protected void gi() {
   }

   protected boolean gj() {
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
   protected void c(axj<eqo> $$0) {
      if (this.P().q()) {
         super.c($$0);
      } else {
         this.h(this.dv().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gk() {
      this.d($$0 -> true);
      this.dX().h();
   }

   public void d(Predicate<cbh> $$0) {
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
   public cvp dF() {
      cwy $$0 = cwy.a(this.ao());
      return $$0 == null ? null : new cvp($$0);
   }

   @Override
   protected void f(jn<bvm> $$0) {
      super.f($$0);
      if ($$0.a(bvr.m) || $$0.a(bvr.E)) {
         this.P().g();
      }
   }
}

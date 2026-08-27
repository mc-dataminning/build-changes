import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bmq extends bmo implements bnk {
   private static final agn<Byte> b = agq.a(bmq.class, agp.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final jb bT = new jb(1, 0, 1);
   public static final float bB = 0.15F;
   public static final float bC = 0.55F;
   public static final float bD = 0.5F;
   public static final float bE = 0.25F;
   public static final String bF = "Leash";
   public static final float bG = 0.085F;
   public static final int bH = 2;
   public static final int bI = 2;
   private static final double bU = Math.sqrt(2.04F) - 0.6F;
   public int bJ;
   protected int bK;
   protected bsm bL;
   protected bsn bM;
   protected bsl bN;
   private final bsi bV;
   protected bvy bO;
   protected final btl bP;
   protected final btl bQ;
   @Nullable
   private bmo bW;
   private final bwv bX;
   private final iq<cng> bY = iq.a(2, cng.f);
   protected final float[] bR = new float[2];
   private final iq<cng> bZ = iq.a(4, cng.f);
   protected final float[] bS = new float[4];
   private boolean ca;
   private boolean cb;
   private final Map<efk, Float> cc = Maps.newEnumMap(efk.class);
   @Nullable
   private ahh cd;
   private long ce;
   @Nullable
   private blw cf;
   private int cg;
   @Nullable
   private so ch;
   private hx ci = hx.b;
   private float cj = -1.0F;

   protected bmq(bmc<? extends bmq> $$0, ctx $$1) {
      super($$0, $$1);
      this.bP = new btl($$1.ag());
      this.bQ = new btl($$1.ag());
      this.bL = new bsm(this);
      this.bM = new bsn(this);
      this.bN = new bsl(this);
      this.bV = this.H();
      this.bO = this.b($$1);
      this.bX = new bwv(this);
      Arrays.fill(this.bS, 0.085F);
      Arrays.fill(this.bR, 0.085F);
      if ($$1 != null && !$$1.B) {
         this.B();
      }
   }

   protected void B() {
   }

   public static bnt.a C() {
      return bmo.dP().a(bnu.i, 16.0).a(bnu.d);
   }

   protected bvy b(ctx $$0) {
      return new bvx(this, $$0);
   }

   protected boolean D() {
      return false;
   }

   public float a(efk $$0) {
      bmq $$2;
      label17: {
         if (this.da() instanceof bmq $$1 && $$1.D()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cc.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(efk $$0, float $$1) {
      this.cc.put($$0, $$1);
   }

   @Override
   public void E() {
   }

   public void G() {
   }

   protected bsi H() {
      return new bsi(this);
   }

   public bsm I() {
      return this.bL;
   }

   public bsn K() {
      return this.da() instanceof bmq $$0 ? $$0.K() : this.bM;
   }

   public bsl M() {
      return this.bN;
   }

   public bvy N() {
      return this.da() instanceof bmq $$0 ? $$0.N() : this.bO;
   }

   @Nullable
   @Override
   public bmo cN() {
      blw $$0 = this.cQ();
      if (!this.fV() && $$0 instanceof bmq $$1 && $$0.bR()) {
         return $$1;
      }

      return null;
   }

   public bwv O() {
      return this.bX;
   }

   @Nullable
   @Override
   public bmo q() {
      return this.bW;
   }

   public void h(@Nullable bmo $$0) {
      this.bW = $$0;
   }

   @Override
   public boolean a(bmc<?> $$0) {
      return $$0 != bmc.S;
   }

   public boolean a(cnw $$0) {
      return false;
   }

   public void P() {
      this.b(dnz.m);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, (byte)0);
   }

   public int Q() {
      return 80;
   }

   public void R() {
      ars $$0 = this.y();
      if ($$0 != null) {
         this.a($$0, this.eW(), this.eX());
      }
   }

   @Override
   public void as() {
      super.as();
      this.dL().af().a("mobBaseTick");
      if (this.bx() && this.ag.a(1000) < this.bJ++) {
         this.u();
         this.R();
      }

      this.dL().af().c();
   }

   @Override
   protected void e(bkv $$0) {
      this.u();
      super.e($$0);
   }

   private void u() {
      this.bJ = -this.Q();
   }

   @Override
   public int ee() {
      if (this.bK > 0) {
         int $$0 = this.bK;

         for (int $$1 = 0; $$1 < this.bZ.size(); $$1++) {
            if (!this.bZ.get($$1).b() && this.bS[$$1] <= 1.0F) {
               $$0 += 1 + this.ag.a(3);
            }
         }

         for (int $$2 = 0; $$2 < this.bY.size(); $$2++) {
            if (!this.bY.get($$2).b() && this.bR[$$2] <= 1.0F) {
               $$0 += 1 + this.ag.a(3);
            }
         }

         return $$0;
      } else {
         return this.bK;
      }
   }

   public void S() {
      if (this.dL().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.ag.k() * 0.02;
            double $$2 = this.ag.k() * 0.02;
            double $$3 = this.ag.k() * 0.02;
            double $$4 = 10.0;
            this.dL().a(jx.Y, this.c(1.0) - $$1 * 10.0, this.dt() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dL().a(this, (byte)20);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 20) {
         this.S();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B) {
         this.fS();
         if (this.ah % 5 == 0) {
            this.T();
         }
      }
   }

   protected void T() {
      boolean $$0 = !(this.cN() instanceof bmq);
      boolean $$1 = !(this.cZ() instanceof chk);
      this.bP.a(btk.a.a, $$0);
      this.bP.a(btk.a.c, $$0 && $$1);
      this.bP.a(btk.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bV.a();
      return $$1;
   }

   @Nullable
   protected ars y() {
      return null;
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fL());
      $$0.a("PersistenceRequired", this.cb);
      su $$1 = new su();

      for (cng $$2 : this.bZ) {
         so $$3 = new so();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      su $$4 = new su();

      for (cng $$5 : this.bY) {
         so $$6 = new so();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      su $$7 = new su();

      for (float $$8 : this.bS) {
         $$7.add(sr.a($$8));
      }

      $$0.a("ArmorDropChances", $$7);
      su $$9 = new su();

      for (float $$10 : this.bR) {
         $$9.add(sr.a($$10));
      }

      $$0.a("HandDropChances", $$9);
      if (this.cf != null) {
         so $$11 = new so();
         if (this.cf instanceof bmo) {
            UUID $$12 = this.cf.cw();
            $$11.a("UUID", $$12);
         } else if (this.cf instanceof cbt) {
            hx $$13 = ((cbt)this.cf).E();
            $$11.a("X", $$13.u());
            $$11.a("Y", $$13.v());
            $$11.a("Z", $$13.w());
         }

         $$0.a("Leash", $$11);
      } else if (this.ch != null) {
         $$0.a("Leash", this.ch.h());
      }

      $$0.a("LeftHanded", this.fW());
      if (this.cd != null) {
         $$0.a("DeathLootTable", this.cd.toString());
         if (this.ce != 0L) {
            $$0.a("DeathLootTableSeed", this.ce);
         }
      }

      if (this.fV()) {
         $$0.a("NoAI", this.fV());
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.s($$0.q("CanPickUpLoot"));
      }

      this.cb = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         su $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
            this.bZ.set($$2, cng.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         su $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bY.size(); $$4++) {
            this.bY.set($$4, cng.a($$3.a($$4)));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         su $$5 = $$0.c("ArmorDropChances", 5);

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            this.bS[$$6] = $$5.i($$6);
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         su $$7 = $$0.c("HandDropChances", 5);

         for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
            this.bR[$$8] = $$7.i($$8);
         }
      }

      if ($$0.b("Leash", 10)) {
         this.ch = $$0.p("Leash");
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cd = new ahh($$0.l("DeathLootTable"));
         this.ce = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(bkv $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cd = null;
   }

   @Override
   public final ahh eA() {
      return this.cd == null ? this.U() : this.cd;
   }

   protected ahh U() {
      return super.eA();
   }

   @Override
   public long eB() {
      return this.ce;
   }

   public void z(float $$0) {
      this.bm = $$0;
   }

   public void A(float $$0) {
      this.bl = $$0;
   }

   public void B(float $$0) {
      this.bk = $$0;
   }

   @Override
   public void v(float $$0) {
      super.v($$0);
      this.z($$0);
   }

   public void V() {
      this.N().n();
      this.B(0.0F);
      this.A(0.0F);
      this.v(0.0F);
   }

   @Override
   public void d_() {
      super.d_();
      this.dL().af().a("looting");
      if (!this.dL().B && this.fL() && this.bx() && !this.ba && this.dL().Z().b(ctt.c)) {
         jb $$0 = this.W();

         for (ccb $$2 : this.dL().a(ccb.class, this.cH().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dG() && !$$2.q().b() && !$$2.z() && this.k($$2.q())) {
               this.b($$2);
            }
         }
      }

      this.dL().af().c();
   }

   protected jb W() {
      return bT;
   }

   protected void b(ccb $$0) {
      cng $$1 = $$0.q();
      cng $$2 = this.i($$1.p());
      if (!$$2.b()) {
         this.a($$0);
         this.a($$0, $$2.L());
         $$1.h($$2.L());
         if ($$1.b()) {
            $$0.am();
         }
      }
   }

   public cng i(cng $$0) {
      bmd $$1 = h($$0);
      cng $$2 = this.c($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bmd.a;
         $$2 = this.c($$1);
         $$3 = $$2.b();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.f($$1);
         if (!$$2.b() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.L() > 1) {
            cng $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return cng.f;
      }
   }

   @Override
   protected void b(bmd $$0, cng $$1) {
      this.a($$0, $$1);
      this.e($$0);
      this.cb = true;
   }

   public void e(bmd $$0) {
      switch ($$0.a()) {
         case a:
            this.bR[$$0.b()] = 2.0F;
            break;
         case b:
            this.bS[$$0.b()] = 2.0F;
      }
   }

   protected boolean b(cng $$0, cng $$1) {
      if ($$1.b()) {
         return true;
      } else if ($$0.d() instanceof cos) {
         if (!($$1.d() instanceof cos)) {
            return true;
         } else {
            cos $$2 = (cos)$$0.d();
            cos $$3 = (cos)$$1.d();
            return $$2.h() != $$3.h() ? $$2.h() > $$3.h() : this.c($$0, $$1);
         }
      } else if ($$0.d() instanceof clf && $$1.d() instanceof clf) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof clp && $$1.d() instanceof clp) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof ckr $$4) {
         if (crt.d($$1)) {
            return false;
         } else if (!($$1.d() instanceof ckr)) {
            return true;
         } else {
            ckr $$5 = (ckr)$$1.d();
            if ($$4.e() != $$5.e()) {
               return $$4.e() > $$5.e();
            } else {
               return $$4.f() != $$5.f() ? $$4.f() > $$5.f() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.d() instanceof clr) {
            if ($$1.d() instanceof cla) {
               return true;
            }

            if ($$1.d() instanceof clr $$6) {
               clr $$7 = (clr)$$0.d();
               if ($$7.d() != $$6.d()) {
                  return $$7.d() > $$6.d();
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   public boolean c(cng $$0, cng $$1) {
      if ($$0.k() >= $$1.k() && (!$$0.u() || $$1.u())) {
         return $$0.u() && $$1.u()
            ? $$0.v().e().stream().anyMatch($$0x -> !$$0x.equals("Damage")) && !$$1.v().e().stream().anyMatch($$0x -> !$$0x.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean j(cng $$0) {
      return true;
   }

   public boolean k(cng $$0) {
      return this.j($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean X() {
      return this.bO();
   }

   protected boolean Y() {
      return false;
   }

   @Override
   public void dx() {
      if (this.dL().ak() == bjz.a && this.Y()) {
         this.am();
      } else if (!this.fM() && !this.X()) {
         blw $$0 = this.dL().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.f(this);
            int $$2 = this.ai().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.am();
            }

            int $$4 = this.ai().f().g();
            int $$5 = $$4 * $$4;
            if (this.bb > 600 && this.ag.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.am();
            } else if ($$1 < (double)$$5) {
               this.bb = 0;
            }
         }
      } else {
         this.bb = 0;
      }
   }

   @Override
   protected final void fi() {
      this.bb++;
      this.dL().af().a("sensing");
      this.bX.a();
      this.dL().af().c();
      int $$0 = this.dL().o().ai() + this.aj();
      if ($$0 % 2 != 0 && this.ah > 1) {
         this.dL().af().a("targetSelector");
         this.bQ.a(false);
         this.dL().af().c();
         this.dL().af().a("goalSelector");
         this.bP.a(false);
         this.dL().af().c();
      } else {
         this.dL().af().a("targetSelector");
         this.bQ.a();
         this.dL().af().c();
         this.dL().af().a("goalSelector");
         this.bP.a();
         this.dL().af().c();
      }

      this.dL().af().a("navigation");
      this.bO.c();
      this.dL().af().c();
      this.dL().af().a("mob tick");
      this.aa();
      this.dL().af().c();
      this.dL().af().a("controls");
      this.dL().af().a("move");
      this.bM.a();
      this.dL().af().b("look");
      this.bL.a();
      this.dL().af().b("jump");
      this.bN.b();
      this.dL().af().c();
      this.dL().af().c();
      this.Z();
   }

   protected void Z() {
      adj.a(this.dL(), this, this.bP);
   }

   protected void aa() {
   }

   public int ab() {
      return 40;
   }

   public int fH() {
      return 75;
   }

   public int fI() {
      return 10;
   }

   public void a(blw $$0, float $$1, float $$2) {
      double $$3 = $$0.dq() - this.dq();
      double $$4 = $$0.dw() - this.dw();
      double $$6;
      if ($$0 instanceof bmo $$5) {
         $$6 = $$5.du() - this.du();
      } else {
         $$6 = ($$0.cH().b + $$0.cH().e) / 2.0 - this.du();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(aup.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(aup.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dD(), $$10, $$2));
      this.r(this.a(this.dB(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = aup.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bmc<? extends bmq> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      hx $$5 = $$3.d();
      return $$2 == bms.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(cty $$0, bms $$1) {
      return true;
   }

   public boolean a(cua $$0) {
      return !$$0.d(this.cH()) && $$0.f(this);
   }

   public int fJ() {
      return 4;
   }

   public boolean d(int $$0) {
      return false;
   }

   @Override
   public int cu() {
      if (this.q() == null) {
         return 3;
      } else {
         int $$0 = (int)(this.ev() - this.eM() * 0.33F);
         $$0 -= (3 - this.dL().ak().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return $$0 + 3;
      }
   }

   @Override
   public Iterable<cng> bK() {
      return this.bY;
   }

   @Override
   public Iterable<cng> bL() {
      return this.bZ;
   }

   @Override
   public cng c(bmd $$0) {
      switch ($$0.a()) {
         case a:
            return this.bY.get($$0.b());
         case b:
            return this.bZ.get($$0.b());
         default:
            return cng.f;
      }
   }

   @Override
   public void a(bmd $$0, cng $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.bY.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.bZ.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   protected void a(bkv $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bmd $$3 : bmd.values()) {
         cng $$4 = this.c($$3);
         float $$5 = this.f($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.b() && !crt.e($$4) && ($$2 || $$6) && Math.max(this.ag.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.i()) {
               $$4.b($$4.l() - this.ag.a(1 + this.ag.a(Math.max($$4.l() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, cng.f);
         }
      }
   }

   protected float f(bmd $$0) {
      return switch ($$0.a()) {
         case a -> this.bR[$$0.b()];
         case b -> this.bS[$$0.b()];
         default -> 0.0F;
      };
   }

   protected void a(auw $$0, bka $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dL().ak() == bjz.d ? 0.1F : 0.25F;
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

         for (bmd $$5 : bmd.values()) {
            if ($$5.a() == bmd.a.b) {
               cng $$6 = this.c($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.b()) {
                  cnb $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cng($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cnb a(bmd $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cnj.px;
            } else if ($$1 == 1) {
               return cnj.pN;
            } else if ($$1 == 2) {
               return cnj.pB;
            } else if ($$1 == 3) {
               return cnj.pF;
            } else if ($$1 == 4) {
               return cnj.pJ;
            }
         case e:
            if ($$1 == 0) {
               return cnj.py;
            } else if ($$1 == 1) {
               return cnj.pO;
            } else if ($$1 == 2) {
               return cnj.pC;
            } else if ($$1 == 3) {
               return cnj.pG;
            } else if ($$1 == 4) {
               return cnj.pK;
            }
         case d:
            if ($$1 == 0) {
               return cnj.pz;
            } else if ($$1 == 1) {
               return cnj.pP;
            } else if ($$1 == 2) {
               return cnj.pD;
            } else if ($$1 == 3) {
               return cnj.pH;
            } else if ($$1 == 4) {
               return cnj.pL;
            }
         case c:
            if ($$1 == 0) {
               return cnj.pA;
            } else if ($$1 == 1) {
               return cnj.pQ;
            } else if ($$1 == 2) {
               return cnj.pE;
            } else if ($$1 == 3) {
               return cnj.pI;
            } else if ($$1 == 4) {
               return cnj.pM;
            }
         default:
            return null;
      }
   }

   protected void b(auw $$0, bka $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bmd $$3 : bmd.values()) {
         if ($$3.a() == bmd.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(auw $$0, float $$1) {
      if (!this.eT().b() && $$0.i() < 0.25F * $$1) {
         this.a(bmd.a, crt.a($$0, this.eT(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(auw $$0, float $$1, bmd $$2) {
      cng $$3 = this.c($$2);
      if (!$$3.b() && $$0.i() < 0.5F * $$1) {
         this.a($$2, crt.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      auw $$5 = $$0.F_();
      this.f(bnu.i).d(new bns("Random spawn bonus", $$5.a(0.0, 0.11485000000000001), bns.a.b));
      if ($$5.i() < 0.05F) {
         this.u(true);
      } else {
         this.u(false);
      }

      return $$3;
   }

   public void fK() {
      this.cb = true;
   }

   public void a(bmd $$0, float $$1) {
      switch ($$0.a()) {
         case a:
            this.bR[$$0.b()] = $$1;
            break;
         case b:
            this.bS[$$0.b()] = $$1;
      }
   }

   public boolean fL() {
      return this.ca;
   }

   public void s(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean f(cng $$0) {
      bmd $$1 = h($$0);
      return this.c($$1).b() && this.fL();
   }

   public boolean fM() {
      return this.cb;
   }

   @Override
   public final bkc a(cfq $$0, bkb $$1) {
      if (!this.bx()) {
         return bkc.d;
      } else if (this.fU() == $$0) {
         this.a(true, !$$0.fT().d);
         this.a(dnz.r, $$0);
         return bkc.a(this.dL().B);
      } else {
         bkc $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dnz.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dnz.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bkc c(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if ($$2.a(cnj.uG) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bkc.a(this.dL().B);
      } else {
         if ($$2.a(cnj.uH)) {
            bkc $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.d() instanceof col) {
            if (this.dL() instanceof ane) {
               col $$4 = (col)$$2.d();
               Optional<bmq> $$5 = $$4.a($$0, this, (bmc<? extends bmq>)this.ai(), (ane)this.dL(), this.dj(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bkc.a : bkc.d;
            } else {
               return bkc.b;
            }
         } else {
            return bkc.d;
         }
      }
   }

   protected void a(cfq $$0, bmq $$1) {
   }

   protected bkc b(cfq $$0, bkb $$1) {
      return bkc.d;
   }

   public boolean fN() {
      return this.a(this.dl());
   }

   public boolean a(hx $$0) {
      return this.cj == -1.0F ? true : this.ci.j($$0) < (double)(this.cj * this.cj);
   }

   public void a(hx $$0, int $$1) {
      this.ci = $$0;
      this.cj = (float)$$1;
   }

   public hx fO() {
      return this.ci;
   }

   public float fP() {
      return this.cj;
   }

   public void fQ() {
      this.cj = -1.0F;
   }

   public boolean fR() {
      return this.cj != -1.0F;
   }

   @Nullable
   public <T extends bmq> T a(bmc<T> $$0, boolean $$1) {
      if (this.dG()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dL());
         if ($$2 == null) {
            return null;
         } else {
            $$2.u(this);
            $$2.a(this.o_());
            $$2.t(this.fV());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            if (this.fM()) {
               $$2.fK();
            }

            $$2.m(this.cr());
            if ($$1) {
               $$2.s(this.fL());

               for (bmd $$3 : bmd.values()) {
                  cng $$4 = this.c($$3);
                  if (!$$4.b()) {
                     $$2.a($$3, $$4.c());
                     $$2.a($$3, this.f($$3));
                  }
               }
            }

            this.dL().b($$2);
            if (this.bO()) {
               blw $$5 = this.cZ();
               this.ac();
               $$2.a($$5, true);
            }

            this.am();
            return $$2;
         }
      }
   }

   protected void fS() {
      if (this.ch != null) {
         this.gb();
      }

      if (this.cf != null) {
         if (!this.bx() || !this.cf.bx()) {
            this.a(true, true);
         }
      }
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.cf != null) {
         this.cf = null;
         this.ch = null;
         if (!this.dL().B && $$1) {
            this.a(cnj.uG);
         }

         if (!this.dL().B && $$0 && this.dL() instanceof ane) {
            ((ane)this.dL()).l().b(this, new ace(this, null));
         }
      }
   }

   public boolean a(cfq $$0) {
      return !this.fT() && !(this instanceof cco);
   }

   public boolean fT() {
      return this.cf != null;
   }

   @Nullable
   public blw fU() {
      if (this.cf == null && this.cg != 0 && this.dL().B) {
         this.cf = this.dL().a(this.cg);
      }

      return this.cf;
   }

   public void b(blw $$0, boolean $$1) {
      this.cf = $$0;
      this.ch = null;
      if (!this.dL().B && $$1 && this.dL() instanceof ane) {
         ((ane)this.dL()).l().b(this, new ace(this, this.cf));
      }

      if (this.bO()) {
         this.ac();
      }
   }

   public void r(int $$0) {
      this.cg = $$0;
      this.a(false, false);
   }

   @Override
   public boolean a(blw $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.fT()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gb() {
      if (this.ch != null && this.dL() instanceof ane) {
         if (this.ch.b("UUID")) {
            UUID $$0 = this.ch.a("UUID");
            blw $$1 = ((ane)this.dL()).a($$0);
            if ($$1 != null) {
               this.b($$1, true);
               return;
            }
         } else if (this.ch.b("X", 99) && this.ch.b("Y", 99) && this.ch.b("Z", 99)) {
            hx $$2 = td.b(this.ch);
            this.b(cbv.b(this.dL(), $$2), true);
            return;
         }

         if (this.ah > 100) {
            this.a(cnj.uG);
            this.ch = null;
         }
      }
   }

   @Override
   public boolean cY() {
      return super.cY() && !this.fV();
   }

   public void t(boolean $$0) {
      byte $$1 = this.an.b(b);
      this.an.b(b, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void u(boolean $$0) {
      byte $$1 = this.an.b(b);
      this.an.b(b, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void v(boolean $$0) {
      byte $$1 = this.an.b(b);
      this.an.b(b, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean fV() {
      return (this.an.b(b) & 1) != 0;
   }

   public boolean fW() {
      return (this.an.b(b) & 2) != 0;
   }

   public boolean fX() {
      return (this.an.b(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bmi fm() {
      return this.fW() ? bmi.a : bmi.b;
   }

   public boolean i(bmo $$0) {
      return this.fY().c($$0.eF());
   }

   protected elx fY() {
      blw $$0 = this.cZ();
      elx $$3;
      if ($$0 != null) {
         elx $$1 = $$0.cH();
         elx $$2 = this.cH();
         $$3 = new elx(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cH();
      }

      return $$3.c(bU, 0.0, bU);
   }

   @Override
   public boolean B(blw $$0) {
      float $$1 = (float)this.g(bnu.c);
      float $$2 = (float)this.g(bnu.d);
      if ($$0 instanceof bmo) {
         $$1 += crt.a(this.eT(), ((bmo)$$0).eS());
         $$2 += (float)crt.c(this);
      }

      int $$3 = crt.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dM().b((bmo)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof bmo) {
            ((bmo)$$0).q((double)($$2 * 0.5F), (double)aup.a(this.dB() * (float) (Math.PI / 180.0)), (double)(-aup.b(this.dB() * (float) (Math.PI / 180.0))));
            this.g(this.do().d(0.6, 1.0, 0.6));
         }

         if ($$0 instanceof cfq $$5) {
            this.a($$5, this.eT(), $$5.fn() ? $$5.fp() : cng.f);
         }

         this.a(this, $$0);
         this.z($$0);
      }

      return $$4;
   }

   private void a(cfq $$0, cng $$1, cng $$2) {
      if (!$$1.b() && !$$2.b() && $$1.d() instanceof ckw && $$2.a(cnj.vo)) {
         float $$3 = 0.25F + (float)crt.g(this) * 0.05F;
         if (this.ag.i() < $$3) {
            $$0.gn().a(cnj.vo, 100);
            this.dL().a($$0, (byte)30);
         }
      }
   }

   protected boolean fZ() {
      if (this.dL().P() && !this.dL().B) {
         float $$0 = this.bo();
         hx $$1 = hx.a(this.dq(), this.du(), this.dw());
         boolean $$2 = this.bb() || this.aA || this.aB;
         if ($$0 > 0.5F && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dL().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(asx<eey> $$0) {
      if (this.N().p()) {
         super.c($$0);
      } else {
         this.g(this.do().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void ga() {
      this.c($$0 -> true);
      this.dN().h();
   }

   public void c(Predicate<btk> $$0) {
      this.bP.a($$0);
   }

   @Override
   protected void cs() {
      super.cs();
      this.a(true, false);
      this.bM().forEach($$0 -> {
         if (!$$0.b()) {
            $$0.f(0);
         }
      });
   }

   @Nullable
   @Override
   public cng dy() {
      col $$0 = col.a(this.ai());
      return $$0 == null ? null : new cng($$0);
   }
}

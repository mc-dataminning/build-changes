import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class blx extends blv implements bmr {
   private static final afz<Byte> b = agc.a(blx.class, agb.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final iz bS = new iz(1, 0, 1);
   public static final float bA = 0.15F;
   public static final float bB = 0.55F;
   public static final float bC = 0.5F;
   public static final float bD = 0.25F;
   public static final String bE = "Leash";
   public static final float bF = 0.085F;
   public static final int bG = 2;
   public static final int bH = 2;
   private static final double bT = Math.sqrt(2.04F) - 0.6F;
   public int bI;
   protected int bJ;
   protected brt bK;
   protected bru bL;
   protected brs bM;
   private final brp bU;
   protected bvf bN;
   protected final bss bO;
   protected final bss bP;
   @Nullable
   private blv bV;
   private final bwb bW;
   private final io<cmh> bX = io.a(2, cmh.f);
   protected final float[] bQ = new float[2];
   private final io<cmh> bY = io.a(4, cmh.f);
   protected final float[] bR = new float[4];
   private boolean bZ;
   private boolean ca;
   private final Map<eek, Float> cb = Maps.newEnumMap(eek.class);
   @Nullable
   private agt cc;
   private long cd;
   @Nullable
   private blf ce;
   private int cf;
   @Nullable
   private sj cg;
   private hv ch = hv.b;
   private float ci = -1.0F;

   protected blx(blj<? extends blx> $$0, csy $$1) {
      super($$0, $$1);
      this.bO = new bss($$1.af());
      this.bP = new bss($$1.af());
      this.bK = new brt(this);
      this.bL = new bru(this);
      this.bM = new brs(this);
      this.bU = this.H();
      this.bN = this.b($$1);
      this.bW = new bwb(this);
      Arrays.fill(this.bR, 0.085F);
      Arrays.fill(this.bQ, 0.085F);
      if ($$1 != null && !$$1.B) {
         this.B();
      }
   }

   protected void B() {
   }

   public static bna.a C() {
      return blv.dQ().a(bnb.g, 16.0).a(bnb.d);
   }

   protected bvf b(csy $$0) {
      return new bve(this, $$0);
   }

   protected boolean D() {
      return false;
   }

   public float a(eek $$0) {
      blx $$2;
      label17: {
         if (this.da() instanceof blx $$1 && $$1.D()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cb.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(eek $$0, float $$1) {
      this.cb.put($$0, $$1);
   }

   @Override
   public void E() {
   }

   public void G() {
   }

   protected brp H() {
      return new brp(this);
   }

   public brt I() {
      return this.bK;
   }

   public bru K() {
      return this.da() instanceof blx $$0 ? $$0.K() : this.bL;
   }

   public brs M() {
      return this.bM;
   }

   public bvf N() {
      return this.da() instanceof blx $$0 ? $$0.N() : this.bN;
   }

   @Nullable
   @Override
   public blv cN() {
      blf $$0 = this.cQ();
      if (!this.fU() && $$0 instanceof blx $$1 && $$0.bR()) {
         return $$1;
      }

      return null;
   }

   public bwb O() {
      return this.bW;
   }

   @Nullable
   @Override
   public blv q() {
      return this.bV;
   }

   public void h(@Nullable blv $$0) {
      this.bV = $$0;
   }

   @Override
   public boolean a(blj<?> $$0) {
      return $$0 != blj.R;
   }

   public boolean a(cmx $$0) {
      return false;
   }

   public void P() {
      this.a(dmz.m);
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
      arb $$0 = this.y();
      if ($$0 != null) {
         this.a($$0, this.eW(), this.eX());
      }
   }

   @Override
   public void as() {
      super.as();
      this.dM().ae().a("mobBaseTick");
      if (this.bx() && this.ag.a(1000) < this.bI++) {
         this.u();
         this.R();
      }

      this.dM().ae().c();
   }

   @Override
   protected void e(bkd $$0) {
      this.u();
      super.e($$0);
   }

   private void u() {
      this.bI = -this.Q();
   }

   @Override
   public int ee() {
      if (this.bJ > 0) {
         int $$0 = this.bJ;

         for (int $$1 = 0; $$1 < this.bY.size(); $$1++) {
            if (!this.bY.get($$1).b() && this.bR[$$1] <= 1.0F) {
               $$0 += 1 + this.ag.a(3);
            }
         }

         for (int $$2 = 0; $$2 < this.bX.size(); $$2++) {
            if (!this.bX.get($$2).b() && this.bQ[$$2] <= 1.0F) {
               $$0 += 1 + this.ag.a(3);
            }
         }

         return $$0;
      } else {
         return this.bJ;
      }
   }

   public void S() {
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.ag.k() * 0.02;
            double $$2 = this.ag.k() * 0.02;
            double $$3 = this.ag.k() * 0.02;
            double $$4 = 10.0;
            this.dM().a(jv.Y, this.c(1.0) - $$1 * 10.0, this.du() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dM().a(this, (byte)20);
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
      if (!this.dM().B) {
         this.fR();
         if (this.ah % 5 == 0) {
            this.T();
         }
      }
   }

   protected void T() {
      boolean $$0 = !(this.cN() instanceof blx);
      boolean $$1 = !(this.cZ() instanceof cgl);
      this.bO.a(bsr.a.a, $$0);
      this.bO.a(bsr.a.c, $$0 && $$1);
      this.bO.a(bsr.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bU.a();
      return $$1;
   }

   @Nullable
   protected arb y() {
      return null;
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fK());
      $$0.a("PersistenceRequired", this.ca);
      sp $$1 = new sp();

      for (cmh $$2 : this.bY) {
         sj $$3 = new sj();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      sp $$4 = new sp();

      for (cmh $$5 : this.bX) {
         sj $$6 = new sj();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      sp $$7 = new sp();

      for (float $$8 : this.bR) {
         $$7.add(sm.a($$8));
      }

      $$0.a("ArmorDropChances", $$7);
      sp $$9 = new sp();

      for (float $$10 : this.bQ) {
         $$9.add(sm.a($$10));
      }

      $$0.a("HandDropChances", $$9);
      if (this.ce != null) {
         sj $$11 = new sj();
         if (this.ce instanceof blv) {
            UUID $$12 = this.ce.cw();
            $$11.a("UUID", $$12);
         } else if (this.ce instanceof caw) {
            hv $$13 = ((caw)this.ce).E();
            $$11.a("X", $$13.u());
            $$11.a("Y", $$13.v());
            $$11.a("Z", $$13.w());
         }

         $$0.a("Leash", $$11);
      } else if (this.cg != null) {
         $$0.a("Leash", this.cg.h());
      }

      $$0.a("LeftHanded", this.fV());
      if (this.cc != null) {
         $$0.a("DeathLootTable", this.cc.toString());
         if (this.cd != 0L) {
            $$0.a("DeathLootTableSeed", this.cd);
         }
      }

      if (this.fU()) {
         $$0.a("NoAI", this.fU());
      }
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.s($$0.q("CanPickUpLoot"));
      }

      this.ca = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         sp $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bY.size(); $$2++) {
            this.bY.set($$2, cmh.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         sp $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bX.size(); $$4++) {
            this.bX.set($$4, cmh.a($$3.a($$4)));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         sp $$5 = $$0.c("ArmorDropChances", 5);

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            this.bR[$$6] = $$5.i($$6);
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         sp $$7 = $$0.c("HandDropChances", 5);

         for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
            this.bQ[$$8] = $$7.i($$8);
         }
      }

      if ($$0.b("Leash", 10)) {
         this.cg = $$0.p("Leash");
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cc = new agt($$0.l("DeathLootTable"));
         this.cd = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(bkd $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cc = null;
   }

   @Override
   public final agt eA() {
      return this.cc == null ? this.U() : this.cc;
   }

   protected agt U() {
      return super.eA();
   }

   @Override
   public long eB() {
      return this.cd;
   }

   public void A(float $$0) {
      this.bm = $$0;
   }

   public void B(float $$0) {
      this.bl = $$0;
   }

   public void C(float $$0) {
      this.bk = $$0;
   }

   @Override
   public void w(float $$0) {
      super.w($$0);
      this.A($$0);
   }

   @Override
   public void d_() {
      super.d_();
      this.dM().ae().a("looting");
      if (!this.dM().B && this.fK() && this.bx() && !this.ba && this.dM().Y().b(csu.c)) {
         iz $$0 = this.V();

         for (cbe $$2 : this.dM().a(cbe.class, this.cH().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dH() && !$$2.q().b() && !$$2.z() && this.k($$2.q())) {
               this.b($$2);
            }
         }
      }

      this.dM().ae().c();
   }

   protected iz V() {
      return bS;
   }

   protected void b(cbe $$0) {
      cmh $$1 = $$0.q();
      cmh $$2 = this.i($$1.p());
      if (!$$2.b()) {
         this.a($$0);
         this.a($$0, $$2.L());
         $$1.h($$2.L());
         if ($$1.b()) {
            $$0.am();
         }
      }
   }

   public cmh i(cmh $$0) {
      blk $$1 = h($$0);
      cmh $$2 = this.c($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = blk.a;
         $$2 = this.c($$1);
         $$3 = $$2.b();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.f($$1);
         if (!$$2.b() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.L() > 1) {
            cmh $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return cmh.f;
      }
   }

   @Override
   protected void b(blk $$0, cmh $$1) {
      this.a($$0, $$1);
      this.e($$0);
      this.ca = true;
   }

   public void e(blk $$0) {
      switch ($$0.a()) {
         case a:
            this.bQ[$$0.b()] = 2.0F;
            break;
         case b:
            this.bR[$$0.b()] = 2.0F;
      }
   }

   protected boolean b(cmh $$0, cmh $$1) {
      if ($$1.b()) {
         return true;
      } else if ($$0.d() instanceof cns) {
         if (!($$1.d() instanceof cns)) {
            return true;
         } else {
            cns $$2 = (cns)$$0.d();
            cns $$3 = (cns)$$1.d();
            return $$2.h() != $$3.h() ? $$2.h() > $$3.h() : this.c($$0, $$1);
         }
      } else if ($$0.d() instanceof ckf && $$1.d() instanceof ckf) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof ckp && $$1.d() instanceof ckp) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cjr $$4) {
         if (cqu.d($$1)) {
            return false;
         } else if (!($$1.d() instanceof cjr)) {
            return true;
         } else {
            cjr $$5 = (cjr)$$1.d();
            if ($$4.e() != $$5.e()) {
               return $$4.e() > $$5.e();
            } else {
               return $$4.f() != $$5.f() ? $$4.f() > $$5.f() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.d() instanceof ckr) {
            if ($$1.d() instanceof cka) {
               return true;
            }

            if ($$1.d() instanceof ckr $$6) {
               ckr $$7 = (ckr)$$0.d();
               if ($$7.d() != $$6.d()) {
                  return $$7.d() > $$6.d();
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   public boolean c(cmh $$0, cmh $$1) {
      if ($$0.k() >= $$1.k() && (!$$0.u() || $$1.u())) {
         return $$0.u() && $$1.u()
            ? $$0.v().e().stream().anyMatch($$0x -> !$$0x.equals("Damage")) && !$$1.v().e().stream().anyMatch($$0x -> !$$0x.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean j(cmh $$0) {
      return true;
   }

   public boolean k(cmh $$0) {
      return this.j($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean W() {
      return this.bO();
   }

   protected boolean X() {
      return false;
   }

   @Override
   public void dy() {
      if (this.dM().aj() == bji.a && this.X()) {
         this.am();
      } else if (!this.fL() && !this.W()) {
         blf $$0 = this.dM().a(this, -1.0);
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
      this.dM().ae().a("sensing");
      this.bW.a();
      this.dM().ae().c();
      int $$0 = this.dM().n().ai() + this.aj();
      if ($$0 % 2 != 0 && this.ah > 1) {
         this.dM().ae().a("targetSelector");
         this.bP.a(false);
         this.dM().ae().c();
         this.dM().ae().a("goalSelector");
         this.bO.a(false);
         this.dM().ae().c();
      } else {
         this.dM().ae().a("targetSelector");
         this.bP.a();
         this.dM().ae().c();
         this.dM().ae().a("goalSelector");
         this.bO.a();
         this.dM().ae().c();
      }

      this.dM().ae().a("navigation");
      this.bN.c();
      this.dM().ae().c();
      this.dM().ae().a("mob tick");
      this.Z();
      this.dM().ae().c();
      this.dM().ae().a("controls");
      this.dM().ae().a("move");
      this.bL.a();
      this.dM().ae().b("look");
      this.bK.a();
      this.dM().ae().b("jump");
      this.bM.b();
      this.dM().ae().c();
      this.dM().ae().c();
      this.Y();
   }

   protected void Y() {
      acv.a(this.dM(), this, this.bO);
   }

   protected void Z() {
   }

   public int aa() {
      return 40;
   }

   public int ab() {
      return 75;
   }

   public int fH() {
      return 10;
   }

   public void a(blf $$0, float $$1, float $$2) {
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.dx() - this.dx();
      double $$6;
      if ($$0 instanceof blv $$5) {
         $$6 = $$5.dv() - this.dv();
      } else {
         $$6 = ($$0.cH().b + $$0.cH().e) / 2.0 - this.dv();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(aty.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(aty.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dE(), $$10, $$2));
      this.r(this.a(this.dC(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = aty.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(blj<? extends blx> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      hv $$5 = $$3.d();
      return $$2 == blz.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(csz $$0, blz $$1) {
      return true;
   }

   public boolean a(ctb $$0) {
      return !$$0.d(this.cH()) && $$0.f(this);
   }

   public int fI() {
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
         $$0 -= (3 - this.dM().aj().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return $$0 + 3;
      }
   }

   @Override
   public Iterable<cmh> bK() {
      return this.bX;
   }

   @Override
   public Iterable<cmh> bL() {
      return this.bY;
   }

   @Override
   public cmh c(blk $$0) {
      switch ($$0.a()) {
         case a:
            return this.bX.get($$0.b());
         case b:
            return this.bY.get($$0.b());
         default:
            return cmh.f;
      }
   }

   @Override
   public void a(blk $$0, cmh $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.bX.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.bY.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   protected void a(bkd $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (blk $$3 : blk.values()) {
         cmh $$4 = this.c($$3);
         float $$5 = this.f($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.b() && !cqu.e($$4) && ($$2 || $$6) && Math.max(this.ag.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.i()) {
               $$4.b($$4.l() - this.ag.a(1 + this.ag.a(Math.max($$4.l() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, cmh.f);
         }
      }
   }

   protected float f(blk $$0) {
      return switch ($$0.a()) {
         case a -> this.bQ[$$0.b()];
         case b -> this.bR[$$0.b()];
         default -> 0.0F;
      };
   }

   protected void a(auf $$0, bjj $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dM().aj() == bji.d ? 0.1F : 0.25F;
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

         for (blk $$5 : blk.values()) {
            if ($$5.a() == blk.a.b) {
               cmh $$6 = this.c($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.b()) {
                  cmc $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cmh($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cmc a(blk $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cmk.pv;
            } else if ($$1 == 1) {
               return cmk.pL;
            } else if ($$1 == 2) {
               return cmk.pz;
            } else if ($$1 == 3) {
               return cmk.pD;
            } else if ($$1 == 4) {
               return cmk.pH;
            }
         case e:
            if ($$1 == 0) {
               return cmk.pw;
            } else if ($$1 == 1) {
               return cmk.pM;
            } else if ($$1 == 2) {
               return cmk.pA;
            } else if ($$1 == 3) {
               return cmk.pE;
            } else if ($$1 == 4) {
               return cmk.pI;
            }
         case d:
            if ($$1 == 0) {
               return cmk.px;
            } else if ($$1 == 1) {
               return cmk.pN;
            } else if ($$1 == 2) {
               return cmk.pB;
            } else if ($$1 == 3) {
               return cmk.pF;
            } else if ($$1 == 4) {
               return cmk.pJ;
            }
         case c:
            if ($$1 == 0) {
               return cmk.py;
            } else if ($$1 == 1) {
               return cmk.pO;
            } else if ($$1 == 2) {
               return cmk.pC;
            } else if ($$1 == 3) {
               return cmk.pG;
            } else if ($$1 == 4) {
               return cmk.pK;
            }
         default:
            return null;
      }
   }

   protected void b(auf $$0, bjj $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (blk $$3 : blk.values()) {
         if ($$3.a() == blk.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(auf $$0, float $$1) {
      if (!this.eT().b() && $$0.i() < 0.25F * $$1) {
         this.a(blk.a, cqu.a($$0, this.eT(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(auf $$0, float $$1, blk $$2) {
      cmh $$3 = this.c($$2);
      if (!$$3.b() && $$0.i() < 0.5F * $$1) {
         this.a($$2, cqu.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      auf $$5 = $$0.F_();
      this.a(bnb.g).c(new bmz("Random spawn bonus", $$5.a(0.0, 0.11485000000000001), bmz.a.b));
      if ($$5.i() < 0.05F) {
         this.u(true);
      } else {
         this.u(false);
      }

      return $$3;
   }

   public void fJ() {
      this.ca = true;
   }

   public void a(blk $$0, float $$1) {
      switch ($$0.a()) {
         case a:
            this.bQ[$$0.b()] = $$1;
            break;
         case b:
            this.bR[$$0.b()] = $$1;
      }
   }

   public boolean fK() {
      return this.bZ;
   }

   public void s(boolean $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean f(cmh $$0) {
      blk $$1 = h($$0);
      return this.c($$1).b() && this.fK();
   }

   public boolean fL() {
      return this.ca;
   }

   @Override
   public final bjl a(cer $$0, bjk $$1) {
      if (!this.bx()) {
         return bjl.d;
      } else if (this.fT() == $$0) {
         this.a(true, !$$0.fT().d);
         this.a(dmz.r, $$0);
         return bjl.a(this.dM().B);
      } else {
         bjl $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dmz.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dmz.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bjl c(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if ($$2.a(cmk.uD) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bjl.a(this.dM().B);
      } else {
         if ($$2.a(cmk.uE)) {
            bjl $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.d() instanceof cnm) {
            if (this.dM() instanceof amp) {
               cnm $$4 = (cnm)$$2.d();
               Optional<blx> $$5 = $$4.a($$0, this, (blj<? extends blx>)this.ai(), (amp)this.dM(), this.dk(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bjl.a : bjl.d;
            } else {
               return bjl.b;
            }
         } else {
            return bjl.d;
         }
      }
   }

   protected void a(cer $$0, blx $$1) {
   }

   protected bjl b(cer $$0, bjk $$1) {
      return bjl.d;
   }

   public boolean fM() {
      return this.a(this.dm());
   }

   public boolean a(hv $$0) {
      return this.ci == -1.0F ? true : this.ch.j($$0) < (double)(this.ci * this.ci);
   }

   public void a(hv $$0, int $$1) {
      this.ch = $$0;
      this.ci = (float)$$1;
   }

   public hv fN() {
      return this.ch;
   }

   public float fO() {
      return this.ci;
   }

   public void fP() {
      this.ci = -1.0F;
   }

   public boolean fQ() {
      return this.ci != -1.0F;
   }

   @Nullable
   public <T extends blx> T a(blj<T> $$0, boolean $$1) {
      if (this.dH()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dM());
         if ($$2 == null) {
            return null;
         } else {
            $$2.v(this);
            $$2.a(this.o_());
            $$2.t(this.fU());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            if (this.fL()) {
               $$2.fJ();
            }

            $$2.m(this.cr());
            if ($$1) {
               $$2.s(this.fK());

               for (blk $$3 : blk.values()) {
                  cmh $$4 = this.c($$3);
                  if (!$$4.b()) {
                     $$2.a($$3, $$4.c());
                     $$2.a($$3, this.f($$3));
                  }
               }
            }

            this.dM().b($$2);
            if (this.bO()) {
               blf $$5 = this.cZ();
               this.ac();
               $$2.a($$5, true);
            }

            this.am();
            return $$2;
         }
      }
   }

   protected void fR() {
      if (this.cg != null) {
         this.ga();
      }

      if (this.ce != null) {
         if (!this.bx() || !this.ce.bx()) {
            this.a(true, true);
         }
      }
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.ce != null) {
         this.ce = null;
         this.cg = null;
         if (!this.dM().B && $$1) {
            this.a(cmk.uD);
         }

         if (!this.dM().B && $$0 && this.dM() instanceof amp) {
            ((amp)this.dM()).k().b(this, new abq(this, null));
         }
      }
   }

   public boolean a(cer $$0) {
      return !this.fS() && !(this instanceof cbr);
   }

   public boolean fS() {
      return this.ce != null;
   }

   @Nullable
   public blf fT() {
      if (this.ce == null && this.cf != 0 && this.dM().B) {
         this.ce = this.dM().a(this.cf);
      }

      return this.ce;
   }

   public void b(blf $$0, boolean $$1) {
      this.ce = $$0;
      this.cg = null;
      if (!this.dM().B && $$1 && this.dM() instanceof amp) {
         ((amp)this.dM()).k().b(this, new abq(this, this.ce));
      }

      if (this.bO()) {
         this.ac();
      }
   }

   public void r(int $$0) {
      this.cf = $$0;
      this.a(false, false);
   }

   @Override
   public boolean a(blf $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.fS()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void ga() {
      if (this.cg != null && this.dM() instanceof amp) {
         if (this.cg.b("UUID")) {
            UUID $$0 = this.cg.a("UUID");
            blf $$1 = ((amp)this.dM()).a($$0);
            if ($$1 != null) {
               this.b($$1, true);
               return;
            }
         } else if (this.cg.b("X", 99) && this.cg.b("Y", 99) && this.cg.b("Z", 99)) {
            hv $$2 = sy.b(this.cg);
            this.b(cay.b(this.dM(), $$2), true);
            return;
         }

         if (this.ah > 100) {
            this.a(cmk.uD);
            this.cg = null;
         }
      }
   }

   @Override
   public boolean cY() {
      return super.cY() && !this.fU();
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

   public boolean fU() {
      return (this.an.b(b) & 1) != 0;
   }

   public boolean fV() {
      return (this.an.b(b) & 2) != 0;
   }

   public boolean fW() {
      return (this.an.b(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public blp fm() {
      return this.fV() ? blp.a : blp.b;
   }

   public boolean i(blv $$0) {
      return this.fX().c($$0.eF());
   }

   protected ekw fX() {
      blf $$0 = this.cZ();
      ekw $$3;
      if ($$0 != null) {
         ekw $$1 = $$0.cH();
         ekw $$2 = this.cH();
         $$3 = new ekw(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cH();
      }

      return $$3.c(bT, 0.0, bT);
   }

   @Override
   public boolean C(blf $$0) {
      float $$1 = (float)this.b(bnb.c);
      float $$2 = (float)this.b(bnb.d);
      if ($$0 instanceof blv) {
         $$1 += cqu.a(this.eT(), ((blv)$$0).eS());
         $$2 += (float)cqu.c(this);
      }

      int $$3 = cqu.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dN().b((blv)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof blv) {
            ((blv)$$0).q((double)($$2 * 0.5F), (double)aty.a(this.dC() * (float) (Math.PI / 180.0)), (double)(-aty.b(this.dC() * (float) (Math.PI / 180.0))));
            this.g(this.dp().d(0.6, 1.0, 0.6));
         }

         if ($$0 instanceof cer $$5) {
            this.a($$5, this.eT(), $$5.fn() ? $$5.fp() : cmh.f);
         }

         this.a(this, $$0);
         this.A($$0);
      }

      return $$4;
   }

   private void a(cer $$0, cmh $$1, cmh $$2) {
      if (!$$1.b() && !$$2.b() && $$1.d() instanceof cjw && $$2.a(cmk.vl)) {
         float $$3 = 0.25F + (float)cqu.g(this) * 0.05F;
         if (this.ag.i() < $$3) {
            $$0.gn().a(cmk.vl, 100);
            this.dM().a($$0, (byte)30);
         }
      }
   }

   protected boolean fY() {
      if (this.dM().O() && !this.dM().B) {
         float $$0 = this.bo();
         hv $$1 = hv.a(this.dr(), this.dv(), this.dx());
         boolean $$2 = this.bb() || this.aA || this.aB;
         if ($$0 > 0.5F && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dM().g($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(asg<edy> $$0) {
      if (this.N().p()) {
         super.c($$0);
      } else {
         this.g(this.dp().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void fZ() {
      this.c($$0 -> true);
      this.dO().h();
   }

   public void c(Predicate<bsr> $$0) {
      this.bO.a($$0);
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
   public cmh dz() {
      cnm $$0 = cnm.a(this.ai());
      return $$0 == null ? null : new cmh($$0);
   }
}

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bmn extends bml implements bnh {
   private static final agm<Byte> b = agp.a(bmn.class, ago.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final jb bS = new jb(1, 0, 1);
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
   protected bsj bK;
   protected bsk bL;
   protected bsi bM;
   private final bsf bU;
   protected bvv bN;
   protected final bti bO;
   protected final bti bP;
   @Nullable
   private bml bV;
   private final bwr bW;
   private final iq<cmy> bX = iq.a(2, cmy.f);
   protected final float[] bQ = new float[2];
   private final iq<cmy> bY = iq.a(4, cmy.f);
   protected final float[] bR = new float[4];
   private boolean bZ;
   private boolean ca;
   private final Map<efc, Float> cb = Maps.newEnumMap(efc.class);
   @Nullable
   private ahg cc;
   private long cd;
   @Nullable
   private blv ce;
   private int cf;
   @Nullable
   private sn cg;
   private hx ch = hx.b;
   private float ci = -1.0F;

   protected bmn(blz<? extends bmn> $$0, ctp $$1) {
      super($$0, $$1);
      this.bO = new bti($$1.ag());
      this.bP = new bti($$1.ag());
      this.bK = new bsj(this);
      this.bL = new bsk(this);
      this.bM = new bsi(this);
      this.bU = this.H();
      this.bN = this.b($$1);
      this.bW = new bwr(this);
      Arrays.fill(this.bR, 0.085F);
      Arrays.fill(this.bQ, 0.085F);
      if ($$1 != null && !$$1.B) {
         this.B();
      }
   }

   protected void B() {
   }

   public static bnq.a C() {
      return bml.dQ().a(bnr.g, 16.0).a(bnr.d);
   }

   protected bvv b(ctp $$0) {
      return new bvu(this, $$0);
   }

   protected boolean D() {
      return false;
   }

   public float a(efc $$0) {
      bmn $$2;
      label17: {
         if (this.da() instanceof bmn $$1 && $$1.D()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cb.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(efc $$0, float $$1) {
      this.cb.put($$0, $$1);
   }

   @Override
   public void E() {
   }

   public void G() {
   }

   protected bsf H() {
      return new bsf(this);
   }

   public bsj I() {
      return this.bK;
   }

   public bsk K() {
      return this.da() instanceof bmn $$0 ? $$0.K() : this.bL;
   }

   public bsi M() {
      return this.bM;
   }

   public bvv N() {
      return this.da() instanceof bmn $$0 ? $$0.N() : this.bN;
   }

   @Nullable
   @Override
   public bml cN() {
      blv $$0 = this.cQ();
      if (!this.fU() && $$0 instanceof bmn $$1 && $$0.bR()) {
         return $$1;
      }

      return null;
   }

   public bwr O() {
      return this.bW;
   }

   @Nullable
   @Override
   public bml q() {
      return this.bV;
   }

   public void h(@Nullable bml $$0) {
      this.bV = $$0;
   }

   @Override
   public boolean a(blz<?> $$0) {
      return $$0 != blz.R;
   }

   public boolean a(cno $$0) {
      return false;
   }

   public void P() {
      this.a(dnr.m);
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
      arr $$0 = this.y();
      if ($$0 != null) {
         this.a($$0, this.eW(), this.eX());
      }
   }

   @Override
   public void as() {
      super.as();
      this.dM().af().a("mobBaseTick");
      if (this.bx() && this.ag.a(1000) < this.bI++) {
         this.u();
         this.R();
      }

      this.dM().af().c();
   }

   @Override
   protected void e(bkt $$0) {
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
            this.dM().a(jx.Y, this.c(1.0) - $$1 * 10.0, this.du() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
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
      boolean $$0 = !(this.cN() instanceof bmn);
      boolean $$1 = !(this.cZ() instanceof chc);
      this.bO.a(bth.a.a, $$0);
      this.bO.a(bth.a.c, $$0 && $$1);
      this.bO.a(bth.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bU.a();
      return $$1;
   }

   @Nullable
   protected arr y() {
      return null;
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fK());
      $$0.a("PersistenceRequired", this.ca);
      st $$1 = new st();

      for (cmy $$2 : this.bY) {
         sn $$3 = new sn();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      st $$4 = new st();

      for (cmy $$5 : this.bX) {
         sn $$6 = new sn();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      st $$7 = new st();

      for (float $$8 : this.bR) {
         $$7.add(sq.a($$8));
      }

      $$0.a("ArmorDropChances", $$7);
      st $$9 = new st();

      for (float $$10 : this.bQ) {
         $$9.add(sq.a($$10));
      }

      $$0.a("HandDropChances", $$9);
      if (this.ce != null) {
         sn $$11 = new sn();
         if (this.ce instanceof bml) {
            UUID $$12 = this.ce.cw();
            $$11.a("UUID", $$12);
         } else if (this.ce instanceof cbm) {
            hx $$13 = ((cbm)this.ce).E();
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
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.s($$0.q("CanPickUpLoot"));
      }

      this.ca = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         st $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bY.size(); $$2++) {
            this.bY.set($$2, cmy.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         st $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bX.size(); $$4++) {
            this.bX.set($$4, cmy.a($$3.a($$4)));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         st $$5 = $$0.c("ArmorDropChances", 5);

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            this.bR[$$6] = $$5.i($$6);
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         st $$7 = $$0.c("HandDropChances", 5);

         for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
            this.bQ[$$8] = $$7.i($$8);
         }
      }

      if ($$0.b("Leash", 10)) {
         this.cg = $$0.p("Leash");
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cc = new ahg($$0.l("DeathLootTable"));
         this.cd = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(bkt $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cc = null;
   }

   @Override
   public final ahg eA() {
      return this.cc == null ? this.U() : this.cc;
   }

   protected ahg U() {
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
      this.dM().af().a("looting");
      if (!this.dM().B && this.fK() && this.bx() && !this.ba && this.dM().Z().b(ctl.c)) {
         jb $$0 = this.V();

         for (cbu $$2 : this.dM().a(cbu.class, this.cH().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dH() && !$$2.q().b() && !$$2.z() && this.k($$2.q())) {
               this.b($$2);
            }
         }
      }

      this.dM().af().c();
   }

   protected jb V() {
      return bS;
   }

   protected void b(cbu $$0) {
      cmy $$1 = $$0.q();
      cmy $$2 = this.i($$1.p());
      if (!$$2.b()) {
         this.a($$0);
         this.a($$0, $$2.L());
         $$1.h($$2.L());
         if ($$1.b()) {
            $$0.am();
         }
      }
   }

   public cmy i(cmy $$0) {
      bma $$1 = h($$0);
      cmy $$2 = this.c($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bma.a;
         $$2 = this.c($$1);
         $$3 = $$2.b();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.f($$1);
         if (!$$2.b() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.L() > 1) {
            cmy $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return cmy.f;
      }
   }

   @Override
   protected void b(bma $$0, cmy $$1) {
      this.a($$0, $$1);
      this.e($$0);
      this.ca = true;
   }

   public void e(bma $$0) {
      switch ($$0.a()) {
         case a:
            this.bQ[$$0.b()] = 2.0F;
            break;
         case b:
            this.bR[$$0.b()] = 2.0F;
      }
   }

   protected boolean b(cmy $$0, cmy $$1) {
      if ($$1.b()) {
         return true;
      } else if ($$0.d() instanceof coj) {
         if (!($$1.d() instanceof coj)) {
            return true;
         } else {
            coj $$2 = (coj)$$0.d();
            coj $$3 = (coj)$$1.d();
            return $$2.h() != $$3.h() ? $$2.h() > $$3.h() : this.c($$0, $$1);
         }
      } else if ($$0.d() instanceof ckw && $$1.d() instanceof ckw) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof clg && $$1.d() instanceof clg) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cki $$4) {
         if (crl.d($$1)) {
            return false;
         } else if (!($$1.d() instanceof cki)) {
            return true;
         } else {
            cki $$5 = (cki)$$1.d();
            if ($$4.e() != $$5.e()) {
               return $$4.e() > $$5.e();
            } else {
               return $$4.f() != $$5.f() ? $$4.f() > $$5.f() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.d() instanceof cli) {
            if ($$1.d() instanceof ckr) {
               return true;
            }

            if ($$1.d() instanceof cli $$6) {
               cli $$7 = (cli)$$0.d();
               if ($$7.d() != $$6.d()) {
                  return $$7.d() > $$6.d();
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   public boolean c(cmy $$0, cmy $$1) {
      if ($$0.k() >= $$1.k() && (!$$0.u() || $$1.u())) {
         return $$0.u() && $$1.u()
            ? $$0.v().e().stream().anyMatch($$0x -> !$$0x.equals("Damage")) && !$$1.v().e().stream().anyMatch($$0x -> !$$0x.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean j(cmy $$0) {
      return true;
   }

   public boolean k(cmy $$0) {
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
      if (this.dM().ak() == bjy.a && this.X()) {
         this.am();
      } else if (!this.fL() && !this.W()) {
         blv $$0 = this.dM().a(this, -1.0);
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
      this.dM().af().a("sensing");
      this.bW.a();
      this.dM().af().c();
      int $$0 = this.dM().o().ai() + this.aj();
      if ($$0 % 2 != 0 && this.ah > 1) {
         this.dM().af().a("targetSelector");
         this.bP.a(false);
         this.dM().af().c();
         this.dM().af().a("goalSelector");
         this.bO.a(false);
         this.dM().af().c();
      } else {
         this.dM().af().a("targetSelector");
         this.bP.a();
         this.dM().af().c();
         this.dM().af().a("goalSelector");
         this.bO.a();
         this.dM().af().c();
      }

      this.dM().af().a("navigation");
      this.bN.c();
      this.dM().af().c();
      this.dM().af().a("mob tick");
      this.Z();
      this.dM().af().c();
      this.dM().af().a("controls");
      this.dM().af().a("move");
      this.bL.a();
      this.dM().af().b("look");
      this.bK.a();
      this.dM().af().b("jump");
      this.bM.b();
      this.dM().af().c();
      this.dM().af().c();
      this.Y();
   }

   protected void Y() {
      adi.a(this.dM(), this, this.bO);
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

   public void a(blv $$0, float $$1, float $$2) {
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.dx() - this.dx();
      double $$6;
      if ($$0 instanceof bml $$5) {
         $$6 = $$5.dv() - this.dv();
      } else {
         $$6 = ($$0.cH().b + $$0.cH().e) / 2.0 - this.dv();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(auo.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(auo.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dE(), $$10, $$2));
      this.r(this.a(this.dC(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = auo.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(blz<? extends bmn> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      hx $$5 = $$3.d();
      return $$2 == bmp.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(ctq $$0, bmp $$1) {
      return true;
   }

   public boolean a(cts $$0) {
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
         $$0 -= (3 - this.dM().ak().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return $$0 + 3;
      }
   }

   @Override
   public Iterable<cmy> bK() {
      return this.bX;
   }

   @Override
   public Iterable<cmy> bL() {
      return this.bY;
   }

   @Override
   public cmy c(bma $$0) {
      switch ($$0.a()) {
         case a:
            return this.bX.get($$0.b());
         case b:
            return this.bY.get($$0.b());
         default:
            return cmy.f;
      }
   }

   @Override
   public void a(bma $$0, cmy $$1) {
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
   protected void a(bkt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bma $$3 : bma.values()) {
         cmy $$4 = this.c($$3);
         float $$5 = this.f($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.b() && !crl.e($$4) && ($$2 || $$6) && Math.max(this.ag.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.i()) {
               $$4.b($$4.l() - this.ag.a(1 + this.ag.a(Math.max($$4.l() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, cmy.f);
         }
      }
   }

   protected float f(bma $$0) {
      return switch ($$0.a()) {
         case a -> this.bQ[$$0.b()];
         case b -> this.bR[$$0.b()];
         default -> 0.0F;
      };
   }

   protected void a(auv $$0, bjz $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dM().ak() == bjy.d ? 0.1F : 0.25F;
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

         for (bma $$5 : bma.values()) {
            if ($$5.a() == bma.a.b) {
               cmy $$6 = this.c($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.b()) {
                  cmt $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cmy($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cmt a(bma $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cnb.pv;
            } else if ($$1 == 1) {
               return cnb.pL;
            } else if ($$1 == 2) {
               return cnb.pz;
            } else if ($$1 == 3) {
               return cnb.pD;
            } else if ($$1 == 4) {
               return cnb.pH;
            }
         case e:
            if ($$1 == 0) {
               return cnb.pw;
            } else if ($$1 == 1) {
               return cnb.pM;
            } else if ($$1 == 2) {
               return cnb.pA;
            } else if ($$1 == 3) {
               return cnb.pE;
            } else if ($$1 == 4) {
               return cnb.pI;
            }
         case d:
            if ($$1 == 0) {
               return cnb.px;
            } else if ($$1 == 1) {
               return cnb.pN;
            } else if ($$1 == 2) {
               return cnb.pB;
            } else if ($$1 == 3) {
               return cnb.pF;
            } else if ($$1 == 4) {
               return cnb.pJ;
            }
         case c:
            if ($$1 == 0) {
               return cnb.py;
            } else if ($$1 == 1) {
               return cnb.pO;
            } else if ($$1 == 2) {
               return cnb.pC;
            } else if ($$1 == 3) {
               return cnb.pG;
            } else if ($$1 == 4) {
               return cnb.pK;
            }
         default:
            return null;
      }
   }

   protected void b(auv $$0, bjz $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bma $$3 : bma.values()) {
         if ($$3.a() == bma.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(auv $$0, float $$1) {
      if (!this.eT().b() && $$0.i() < 0.25F * $$1) {
         this.a(bma.a, crl.a($$0, this.eT(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(auv $$0, float $$1, bma $$2) {
      cmy $$3 = this.c($$2);
      if (!$$3.b() && $$0.i() < 0.5F * $$1) {
         this.a($$2, crl.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      auv $$5 = $$0.F_();
      this.a(bnr.g).c(new bnp("Random spawn bonus", $$5.a(0.0, 0.11485000000000001), bnp.a.b));
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

   public void a(bma $$0, float $$1) {
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
   public boolean f(cmy $$0) {
      bma $$1 = h($$0);
      return this.c($$1).b() && this.fK();
   }

   public boolean fL() {
      return this.ca;
   }

   @Override
   public final bkb a(cfi $$0, bka $$1) {
      if (!this.bx()) {
         return bkb.d;
      } else if (this.fT() == $$0) {
         this.a(true, !$$0.fT().d);
         this.a(dnr.r, $$0);
         return bkb.a(this.dM().B);
      } else {
         bkb $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dnr.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dnr.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bkb c(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      if ($$2.a(cnb.uD) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bkb.a(this.dM().B);
      } else {
         if ($$2.a(cnb.uE)) {
            bkb $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.d() instanceof cod) {
            if (this.dM() instanceof and) {
               cod $$4 = (cod)$$2.d();
               Optional<bmn> $$5 = $$4.a($$0, this, (blz<? extends bmn>)this.ai(), (and)this.dM(), this.dk(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bkb.a : bkb.d;
            } else {
               return bkb.b;
            }
         } else {
            return bkb.d;
         }
      }
   }

   protected void a(cfi $$0, bmn $$1) {
   }

   protected bkb b(cfi $$0, bka $$1) {
      return bkb.d;
   }

   public boolean fM() {
      return this.a(this.dm());
   }

   public boolean a(hx $$0) {
      return this.ci == -1.0F ? true : this.ch.j($$0) < (double)(this.ci * this.ci);
   }

   public void a(hx $$0, int $$1) {
      this.ch = $$0;
      this.ci = (float)$$1;
   }

   public hx fN() {
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
   public <T extends bmn> T a(blz<T> $$0, boolean $$1) {
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

               for (bma $$3 : bma.values()) {
                  cmy $$4 = this.c($$3);
                  if (!$$4.b()) {
                     $$2.a($$3, $$4.c());
                     $$2.a($$3, this.f($$3));
                  }
               }
            }

            this.dM().b($$2);
            if (this.bO()) {
               blv $$5 = this.cZ();
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
            this.a(cnb.uD);
         }

         if (!this.dM().B && $$0 && this.dM() instanceof and) {
            ((and)this.dM()).l().b(this, new acd(this, null));
         }
      }
   }

   public boolean a(cfi $$0) {
      return !this.fS() && !(this instanceof cch);
   }

   public boolean fS() {
      return this.ce != null;
   }

   @Nullable
   public blv fT() {
      if (this.ce == null && this.cf != 0 && this.dM().B) {
         this.ce = this.dM().a(this.cf);
      }

      return this.ce;
   }

   public void b(blv $$0, boolean $$1) {
      this.ce = $$0;
      this.cg = null;
      if (!this.dM().B && $$1 && this.dM() instanceof and) {
         ((and)this.dM()).l().b(this, new acd(this, this.ce));
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
   public boolean a(blv $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.fS()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void ga() {
      if (this.cg != null && this.dM() instanceof and) {
         if (this.cg.b("UUID")) {
            UUID $$0 = this.cg.a("UUID");
            blv $$1 = ((and)this.dM()).a($$0);
            if ($$1 != null) {
               this.b($$1, true);
               return;
            }
         } else if (this.cg.b("X", 99) && this.cg.b("Y", 99) && this.cg.b("Z", 99)) {
            hx $$2 = tc.b(this.cg);
            this.b(cbo.b(this.dM(), $$2), true);
            return;
         }

         if (this.ah > 100) {
            this.a(cnb.uD);
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
   public bmf fm() {
      return this.fV() ? bmf.a : bmf.b;
   }

   public boolean i(bml $$0) {
      return this.fX().c($$0.eF());
   }

   protected elo fX() {
      blv $$0 = this.cZ();
      elo $$3;
      if ($$0 != null) {
         elo $$1 = $$0.cH();
         elo $$2 = this.cH();
         $$3 = new elo(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cH();
      }

      return $$3.c(bT, 0.0, bT);
   }

   @Override
   public boolean C(blv $$0) {
      float $$1 = (float)this.b(bnr.c);
      float $$2 = (float)this.b(bnr.d);
      if ($$0 instanceof bml) {
         $$1 += crl.a(this.eT(), ((bml)$$0).eS());
         $$2 += (float)crl.c(this);
      }

      int $$3 = crl.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dN().b((bml)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof bml) {
            ((bml)$$0).q((double)($$2 * 0.5F), (double)auo.a(this.dC() * (float) (Math.PI / 180.0)), (double)(-auo.b(this.dC() * (float) (Math.PI / 180.0))));
            this.g(this.dp().d(0.6, 1.0, 0.6));
         }

         if ($$0 instanceof cfi $$5) {
            this.a($$5, this.eT(), $$5.fn() ? $$5.fp() : cmy.f);
         }

         this.a(this, $$0);
         this.A($$0);
      }

      return $$4;
   }

   private void a(cfi $$0, cmy $$1, cmy $$2) {
      if (!$$1.b() && !$$2.b() && $$1.d() instanceof ckn && $$2.a(cnb.vl)) {
         float $$3 = 0.25F + (float)crl.g(this) * 0.05F;
         if (this.ag.i() < $$3) {
            $$0.gn().a(cnb.vl, 100);
            this.dM().a($$0, (byte)30);
         }
      }
   }

   protected boolean fY() {
      if (this.dM().P() && !this.dM().B) {
         float $$0 = this.bo();
         hx $$1 = hx.a(this.dr(), this.dv(), this.dx());
         boolean $$2 = this.bb() || this.aA || this.aB;
         if ($$0 > 0.5F && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dM().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(asw<eeq> $$0) {
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

   public void c(Predicate<bth> $$0) {
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
   public cmy dz() {
      cod $$0 = cod.a(this.ai());
      return $$0 == null ? null : new cmy($$0);
   }
}

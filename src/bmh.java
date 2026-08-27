import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bmh extends bmf implements bnb {
   private static final agj<Byte> b = agm.a(bmh.class, agl.a);
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
   protected bsd bK;
   protected bse bL;
   protected bsc bM;
   private final brz bU;
   protected bvp bN;
   protected final btc bO;
   protected final btc bP;
   @Nullable
   private bmf bV;
   private final bwl bW;
   private final iq<cmr> bX = iq.a(2, cmr.f);
   protected final float[] bQ = new float[2];
   private final iq<cmr> bY = iq.a(4, cmr.f);
   protected final float[] bR = new float[4];
   private boolean bZ;
   private boolean ca;
   private final Map<eev, Float> cb = Maps.newEnumMap(eev.class);
   @Nullable
   private ahd cc;
   private long cd;
   @Nullable
   private blp ce;
   private int cf;
   @Nullable
   private sl cg;
   private hx ch = hx.b;
   private float ci = -1.0F;

   protected bmh(blt<? extends bmh> $$0, cti $$1) {
      super($$0, $$1);
      this.bO = new btc($$1.ag());
      this.bP = new btc($$1.ag());
      this.bK = new bsd(this);
      this.bL = new bse(this);
      this.bM = new bsc(this);
      this.bU = this.H();
      this.bN = this.b($$1);
      this.bW = new bwl(this);
      Arrays.fill(this.bR, 0.085F);
      Arrays.fill(this.bQ, 0.085F);
      if ($$1 != null && !$$1.B) {
         this.B();
      }
   }

   protected void B() {
   }

   public static bnk.a C() {
      return bmf.dQ().a(bnl.g, 16.0).a(bnl.d);
   }

   protected bvp b(cti $$0) {
      return new bvo(this, $$0);
   }

   protected boolean D() {
      return false;
   }

   public float a(eev $$0) {
      bmh $$2;
      label17: {
         if (this.da() instanceof bmh $$1 && $$1.D()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cb.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(eev $$0, float $$1) {
      this.cb.put($$0, $$1);
   }

   @Override
   public void E() {
   }

   public void G() {
   }

   protected brz H() {
      return new brz(this);
   }

   public bsd I() {
      return this.bK;
   }

   public bse K() {
      return this.da() instanceof bmh $$0 ? $$0.K() : this.bL;
   }

   public bsc M() {
      return this.bM;
   }

   public bvp N() {
      return this.da() instanceof bmh $$0 ? $$0.N() : this.bN;
   }

   @Nullable
   @Override
   public bmf cN() {
      blp $$0 = this.cQ();
      if (!this.fU() && $$0 instanceof bmh $$1 && $$0.bR()) {
         return $$1;
      }

      return null;
   }

   public bwl O() {
      return this.bW;
   }

   @Nullable
   @Override
   public bmf q() {
      return this.bV;
   }

   public void h(@Nullable bmf $$0) {
      this.bV = $$0;
   }

   @Override
   public boolean a(blt<?> $$0) {
      return $$0 != blt.R;
   }

   public boolean a(cnh $$0) {
      return false;
   }

   public void P() {
      this.a(dnk.m);
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
      arl $$0 = this.y();
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
   protected void e(bkn $$0) {
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
      boolean $$0 = !(this.cN() instanceof bmh);
      boolean $$1 = !(this.cZ() instanceof cgv);
      this.bO.a(btb.a.a, $$0);
      this.bO.a(btb.a.c, $$0 && $$1);
      this.bO.a(btb.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bU.a();
      return $$1;
   }

   @Nullable
   protected arl y() {
      return null;
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fK());
      $$0.a("PersistenceRequired", this.ca);
      sr $$1 = new sr();

      for (cmr $$2 : this.bY) {
         sl $$3 = new sl();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      sr $$4 = new sr();

      for (cmr $$5 : this.bX) {
         sl $$6 = new sl();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      sr $$7 = new sr();

      for (float $$8 : this.bR) {
         $$7.add(so.a($$8));
      }

      $$0.a("ArmorDropChances", $$7);
      sr $$9 = new sr();

      for (float $$10 : this.bQ) {
         $$9.add(so.a($$10));
      }

      $$0.a("HandDropChances", $$9);
      if (this.ce != null) {
         sl $$11 = new sl();
         if (this.ce instanceof bmf) {
            UUID $$12 = this.ce.cw();
            $$11.a("UUID", $$12);
         } else if (this.ce instanceof cbg) {
            hx $$13 = ((cbg)this.ce).E();
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
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.s($$0.q("CanPickUpLoot"));
      }

      this.ca = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         sr $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bY.size(); $$2++) {
            this.bY.set($$2, cmr.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         sr $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bX.size(); $$4++) {
            this.bX.set($$4, cmr.a($$3.a($$4)));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         sr $$5 = $$0.c("ArmorDropChances", 5);

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            this.bR[$$6] = $$5.i($$6);
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         sr $$7 = $$0.c("HandDropChances", 5);

         for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
            this.bQ[$$8] = $$7.i($$8);
         }
      }

      if ($$0.b("Leash", 10)) {
         this.cg = $$0.p("Leash");
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cc = new ahd($$0.l("DeathLootTable"));
         this.cd = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(bkn $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cc = null;
   }

   @Override
   public final ahd eA() {
      return this.cc == null ? this.U() : this.cc;
   }

   protected ahd U() {
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
      if (!this.dM().B && this.fK() && this.bx() && !this.ba && this.dM().Z().b(cte.c)) {
         jb $$0 = this.V();

         for (cbo $$2 : this.dM().a(cbo.class, this.cH().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
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

   protected void b(cbo $$0) {
      cmr $$1 = $$0.q();
      cmr $$2 = this.i($$1.p());
      if (!$$2.b()) {
         this.a($$0);
         this.a($$0, $$2.L());
         $$1.h($$2.L());
         if ($$1.b()) {
            $$0.am();
         }
      }
   }

   public cmr i(cmr $$0) {
      blu $$1 = h($$0);
      cmr $$2 = this.c($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = blu.a;
         $$2 = this.c($$1);
         $$3 = $$2.b();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.f($$1);
         if (!$$2.b() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.L() > 1) {
            cmr $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return cmr.f;
      }
   }

   @Override
   protected void b(blu $$0, cmr $$1) {
      this.a($$0, $$1);
      this.e($$0);
      this.ca = true;
   }

   public void e(blu $$0) {
      switch ($$0.a()) {
         case a:
            this.bQ[$$0.b()] = 2.0F;
            break;
         case b:
            this.bR[$$0.b()] = 2.0F;
      }
   }

   protected boolean b(cmr $$0, cmr $$1) {
      if ($$1.b()) {
         return true;
      } else if ($$0.d() instanceof coc) {
         if (!($$1.d() instanceof coc)) {
            return true;
         } else {
            coc $$2 = (coc)$$0.d();
            coc $$3 = (coc)$$1.d();
            return $$2.h() != $$3.h() ? $$2.h() > $$3.h() : this.c($$0, $$1);
         }
      } else if ($$0.d() instanceof ckp && $$1.d() instanceof ckp) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof ckz && $$1.d() instanceof ckz) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof ckb $$4) {
         if (cre.d($$1)) {
            return false;
         } else if (!($$1.d() instanceof ckb)) {
            return true;
         } else {
            ckb $$5 = (ckb)$$1.d();
            if ($$4.e() != $$5.e()) {
               return $$4.e() > $$5.e();
            } else {
               return $$4.f() != $$5.f() ? $$4.f() > $$5.f() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.d() instanceof clb) {
            if ($$1.d() instanceof ckk) {
               return true;
            }

            if ($$1.d() instanceof clb $$6) {
               clb $$7 = (clb)$$0.d();
               if ($$7.d() != $$6.d()) {
                  return $$7.d() > $$6.d();
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   public boolean c(cmr $$0, cmr $$1) {
      if ($$0.k() >= $$1.k() && (!$$0.u() || $$1.u())) {
         return $$0.u() && $$1.u()
            ? $$0.v().e().stream().anyMatch($$0x -> !$$0x.equals("Damage")) && !$$1.v().e().stream().anyMatch($$0x -> !$$0x.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean j(cmr $$0) {
      return true;
   }

   public boolean k(cmr $$0) {
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
      if (this.dM().ak() == bjs.a && this.X()) {
         this.am();
      } else if (!this.fL() && !this.W()) {
         blp $$0 = this.dM().a(this, -1.0);
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
      adf.a(this.dM(), this, this.bO);
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

   public void a(blp $$0, float $$1, float $$2) {
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.dx() - this.dx();
      double $$6;
      if ($$0 instanceof bmf $$5) {
         $$6 = $$5.dv() - this.dv();
      } else {
         $$6 = ($$0.cH().b + $$0.cH().e) / 2.0 - this.dv();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(aui.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(aui.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dE(), $$10, $$2));
      this.r(this.a(this.dC(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = aui.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(blt<? extends bmh> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      hx $$5 = $$3.d();
      return $$2 == bmj.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(ctj $$0, bmj $$1) {
      return true;
   }

   public boolean a(ctl $$0) {
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
   public Iterable<cmr> bK() {
      return this.bX;
   }

   @Override
   public Iterable<cmr> bL() {
      return this.bY;
   }

   @Override
   public cmr c(blu $$0) {
      switch ($$0.a()) {
         case a:
            return this.bX.get($$0.b());
         case b:
            return this.bY.get($$0.b());
         default:
            return cmr.f;
      }
   }

   @Override
   public void a(blu $$0, cmr $$1) {
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
   protected void a(bkn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (blu $$3 : blu.values()) {
         cmr $$4 = this.c($$3);
         float $$5 = this.f($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.b() && !cre.e($$4) && ($$2 || $$6) && Math.max(this.ag.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.i()) {
               $$4.b($$4.l() - this.ag.a(1 + this.ag.a(Math.max($$4.l() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, cmr.f);
         }
      }
   }

   protected float f(blu $$0) {
      return switch ($$0.a()) {
         case a -> this.bQ[$$0.b()];
         case b -> this.bR[$$0.b()];
         default -> 0.0F;
      };
   }

   protected void a(aup $$0, bjt $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dM().ak() == bjs.d ? 0.1F : 0.25F;
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

         for (blu $$5 : blu.values()) {
            if ($$5.a() == blu.a.b) {
               cmr $$6 = this.c($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.b()) {
                  cmm $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cmr($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cmm a(blu $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cmu.pv;
            } else if ($$1 == 1) {
               return cmu.pL;
            } else if ($$1 == 2) {
               return cmu.pz;
            } else if ($$1 == 3) {
               return cmu.pD;
            } else if ($$1 == 4) {
               return cmu.pH;
            }
         case e:
            if ($$1 == 0) {
               return cmu.pw;
            } else if ($$1 == 1) {
               return cmu.pM;
            } else if ($$1 == 2) {
               return cmu.pA;
            } else if ($$1 == 3) {
               return cmu.pE;
            } else if ($$1 == 4) {
               return cmu.pI;
            }
         case d:
            if ($$1 == 0) {
               return cmu.px;
            } else if ($$1 == 1) {
               return cmu.pN;
            } else if ($$1 == 2) {
               return cmu.pB;
            } else if ($$1 == 3) {
               return cmu.pF;
            } else if ($$1 == 4) {
               return cmu.pJ;
            }
         case c:
            if ($$1 == 0) {
               return cmu.py;
            } else if ($$1 == 1) {
               return cmu.pO;
            } else if ($$1 == 2) {
               return cmu.pC;
            } else if ($$1 == 3) {
               return cmu.pG;
            } else if ($$1 == 4) {
               return cmu.pK;
            }
         default:
            return null;
      }
   }

   protected void b(aup $$0, bjt $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (blu $$3 : blu.values()) {
         if ($$3.a() == blu.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(aup $$0, float $$1) {
      if (!this.eT().b() && $$0.i() < 0.25F * $$1) {
         this.a(blu.a, cre.a($$0, this.eT(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(aup $$0, float $$1, blu $$2) {
      cmr $$3 = this.c($$2);
      if (!$$3.b() && $$0.i() < 0.5F * $$1) {
         this.a($$2, cre.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      aup $$5 = $$0.F_();
      this.a(bnl.g).c(new bnj("Random spawn bonus", $$5.a(0.0, 0.11485000000000001), bnj.a.b));
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

   public void a(blu $$0, float $$1) {
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
   public boolean f(cmr $$0) {
      blu $$1 = h($$0);
      return this.c($$1).b() && this.fK();
   }

   public boolean fL() {
      return this.ca;
   }

   @Override
   public final bjv a(cfb $$0, bju $$1) {
      if (!this.bx()) {
         return bjv.d;
      } else if (this.fT() == $$0) {
         this.a(true, !$$0.fT().d);
         this.a(dnk.r, $$0);
         return bjv.a(this.dM().B);
      } else {
         bjv $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dnk.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dnk.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bjv c(cfb $$0, bju $$1) {
      cmr $$2 = $$0.b($$1);
      if ($$2.a(cmu.uD) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bjv.a(this.dM().B);
      } else {
         if ($$2.a(cmu.uE)) {
            bjv $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.d() instanceof cnw) {
            if (this.dM() instanceof amz) {
               cnw $$4 = (cnw)$$2.d();
               Optional<bmh> $$5 = $$4.a($$0, this, (blt<? extends bmh>)this.ai(), (amz)this.dM(), this.dk(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bjv.a : bjv.d;
            } else {
               return bjv.b;
            }
         } else {
            return bjv.d;
         }
      }
   }

   protected void a(cfb $$0, bmh $$1) {
   }

   protected bjv b(cfb $$0, bju $$1) {
      return bjv.d;
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
   public <T extends bmh> T a(blt<T> $$0, boolean $$1) {
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

               for (blu $$3 : blu.values()) {
                  cmr $$4 = this.c($$3);
                  if (!$$4.b()) {
                     $$2.a($$3, $$4.c());
                     $$2.a($$3, this.f($$3));
                  }
               }
            }

            this.dM().b($$2);
            if (this.bO()) {
               blp $$5 = this.cZ();
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
            this.a(cmu.uD);
         }

         if (!this.dM().B && $$0 && this.dM() instanceof amz) {
            ((amz)this.dM()).l().b(this, new aca(this, null));
         }
      }
   }

   public boolean a(cfb $$0) {
      return !this.fS() && !(this instanceof ccb);
   }

   public boolean fS() {
      return this.ce != null;
   }

   @Nullable
   public blp fT() {
      if (this.ce == null && this.cf != 0 && this.dM().B) {
         this.ce = this.dM().a(this.cf);
      }

      return this.ce;
   }

   public void b(blp $$0, boolean $$1) {
      this.ce = $$0;
      this.cg = null;
      if (!this.dM().B && $$1 && this.dM() instanceof amz) {
         ((amz)this.dM()).l().b(this, new aca(this, this.ce));
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
   public boolean a(blp $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.fS()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void ga() {
      if (this.cg != null && this.dM() instanceof amz) {
         if (this.cg.b("UUID")) {
            UUID $$0 = this.cg.a("UUID");
            blp $$1 = ((amz)this.dM()).a($$0);
            if ($$1 != null) {
               this.b($$1, true);
               return;
            }
         } else if (this.cg.b("X", 99) && this.cg.b("Y", 99) && this.cg.b("Z", 99)) {
            hx $$2 = ta.b(this.cg);
            this.b(cbi.b(this.dM(), $$2), true);
            return;
         }

         if (this.ah > 100) {
            this.a(cmu.uD);
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
   public blz fm() {
      return this.fV() ? blz.a : blz.b;
   }

   public boolean i(bmf $$0) {
      return this.fX().c($$0.eF());
   }

   protected elh fX() {
      blp $$0 = this.cZ();
      elh $$3;
      if ($$0 != null) {
         elh $$1 = $$0.cH();
         elh $$2 = this.cH();
         $$3 = new elh(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cH();
      }

      return $$3.c(bT, 0.0, bT);
   }

   @Override
   public boolean C(blp $$0) {
      float $$1 = (float)this.b(bnl.c);
      float $$2 = (float)this.b(bnl.d);
      if ($$0 instanceof bmf) {
         $$1 += cre.a(this.eT(), ((bmf)$$0).eS());
         $$2 += (float)cre.c(this);
      }

      int $$3 = cre.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dN().b((bmf)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof bmf) {
            ((bmf)$$0).q((double)($$2 * 0.5F), (double)aui.a(this.dC() * (float) (Math.PI / 180.0)), (double)(-aui.b(this.dC() * (float) (Math.PI / 180.0))));
            this.g(this.dp().d(0.6, 1.0, 0.6));
         }

         if ($$0 instanceof cfb $$5) {
            this.a($$5, this.eT(), $$5.fn() ? $$5.fp() : cmr.f);
         }

         this.a(this, $$0);
         this.A($$0);
      }

      return $$4;
   }

   private void a(cfb $$0, cmr $$1, cmr $$2) {
      if (!$$1.b() && !$$2.b() && $$1.d() instanceof ckg && $$2.a(cmu.vl)) {
         float $$3 = 0.25F + (float)cre.g(this) * 0.05F;
         if (this.ag.i() < $$3) {
            $$0.gn().a(cmu.vl, 100);
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
   protected void c(asq<eej> $$0) {
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

   public void c(Predicate<btb> $$0) {
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
   public cmr dz() {
      cnw $$0 = cnw.a(this.ai());
      return $$0 == null ? null : new cmr($$0);
   }
}

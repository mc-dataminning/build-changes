import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bli extends blg implements bmc {
   private static final afo<Byte> b = afr.a(bli.class, afq.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final iw bS = new iw(1, 0, 1);
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
   protected brd bK;
   protected bre bL;
   protected brc bM;
   private final bqz bU;
   protected bup bN;
   protected final bsc bO;
   protected final bsc bP;
   @Nullable
   private blg bV;
   private final bvk bW;
   private final il<clj> bX = il.a(2, clj.b);
   protected final float[] bQ = new float[2];
   private final il<clj> bY = il.a(4, clj.b);
   protected final float[] bR = new float[4];
   private boolean bZ;
   private boolean ca;
   private final Map<edd, Float> cb = Maps.newEnumMap(edd.class);
   @Nullable
   private agi cc;
   private long cd;
   @Nullable
   private bkq ce;
   private int cf;
   @Nullable
   private rz cg;
   private ht ch = ht.b;
   private float ci = -1.0F;

   protected bli(bku<? extends bli> $$0, csa $$1) {
      super($$0, $$1);
      this.bO = new bsc($$1.af());
      this.bP = new bsc($$1.af());
      this.bK = new brd(this);
      this.bL = new bre(this);
      this.bM = new brc(this);
      this.bU = this.H();
      this.bN = this.b($$1);
      this.bW = new bvk(this);
      Arrays.fill(this.bR, 0.085F);
      Arrays.fill(this.bQ, 0.085F);
      if ($$1 != null && !$$1.B) {
         this.B();
      }
   }

   protected void B() {
   }

   public static bml.a C() {
      return blg.dR().a(bmm.g, 16.0).a(bmm.d);
   }

   protected bup b(csa $$0) {
      return new buo(this, $$0);
   }

   protected boolean D() {
      return false;
   }

   public float a(edd $$0) {
      bli $$2;
      label17: {
         if (this.db() instanceof bli $$1 && $$1.D()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.cb.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(edd $$0, float $$1) {
      this.cb.put($$0, $$1);
   }

   @Override
   public void E() {
   }

   public void G() {
   }

   protected bqz H() {
      return new bqz(this);
   }

   public brd I() {
      return this.bK;
   }

   public bre K() {
      return this.db() instanceof bli $$0 ? $$0.K() : this.bL;
   }

   public brc M() {
      return this.bM;
   }

   public bup N() {
      return this.db() instanceof bli $$0 ? $$0.N() : this.bN;
   }

   @Nullable
   @Override
   public blg cO() {
      bkq $$0 = this.cR();
      if (!this.fV() && $$0 instanceof bli $$1 && $$0.bR()) {
         return $$1;
      }

      return null;
   }

   public bvk O() {
      return this.bW;
   }

   @Nullable
   @Override
   public blg q() {
      return this.bV;
   }

   public void h(@Nullable blg $$0) {
      this.bV = $$0;
   }

   @Override
   public boolean a(bku<?> $$0) {
      return $$0 != bku.Q;
   }

   public boolean a(clz $$0) {
      return false;
   }

   public void P() {
      this.a(dls.m);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, (byte)0);
   }

   public int Q() {
      return 80;
   }

   public void R() {
      aqq $$0 = this.y();
      if ($$0 != null) {
         this.a($$0, this.eX(), this.eY());
      }
   }

   @Override
   public void as() {
      super.as();
      this.dN().ae().a("mobBaseTick");
      if (this.bx() && this.ag.a(1000) < this.bI++) {
         this.u();
         this.R();
      }

      this.dN().ae().c();
   }

   @Override
   protected void e(bjo $$0) {
      this.u();
      super.e($$0);
   }

   private void u() {
      this.bI = -this.Q();
   }

   @Override
   public int ef() {
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
      if (this.dN().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.ag.k() * 0.02;
            double $$2 = this.ag.k() * 0.02;
            double $$3 = this.ag.k() * 0.02;
            double $$4 = 10.0;
            this.dN().a(js.W, this.c(1.0) - $$1 * 10.0, this.dv() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dN().a(this, (byte)20);
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
      if (!this.dN().B) {
         this.fS();
         if (this.ah % 5 == 0) {
            this.T();
         }
      }
   }

   protected void T() {
      boolean $$0 = !(this.cO() instanceof bli);
      boolean $$1 = !(this.da() instanceof cfn);
      this.bO.a(bsb.a.a, $$0);
      this.bO.a(bsb.a.c, $$0 && $$1);
      this.bO.a(bsb.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bU.a();
      return $$1;
   }

   @Nullable
   protected aqq y() {
      return null;
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fL());
      $$0.a("PersistenceRequired", this.ca);
      sf $$1 = new sf();

      for (clj $$2 : this.bY) {
         rz $$3 = new rz();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      sf $$4 = new sf();

      for (clj $$5 : this.bX) {
         rz $$6 = new rz();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      sf $$7 = new sf();

      for (float $$8 : this.bR) {
         $$7.add(sc.a($$8));
      }

      $$0.a("ArmorDropChances", $$7);
      sf $$9 = new sf();

      for (float $$10 : this.bQ) {
         $$9.add(sc.a($$10));
      }

      $$0.a("HandDropChances", $$9);
      if (this.ce != null) {
         rz $$11 = new rz();
         if (this.ce instanceof blg) {
            UUID $$12 = this.ce.cw();
            $$11.a("UUID", $$12);
         } else if (this.ce instanceof caf) {
            ht $$13 = ((caf)this.ce).E();
            $$11.a("X", $$13.u());
            $$11.a("Y", $$13.v());
            $$11.a("Z", $$13.w());
         }

         $$0.a("Leash", $$11);
      } else if (this.cg != null) {
         $$0.a("Leash", this.cg.h());
      }

      $$0.a("LeftHanded", this.fW());
      if (this.cc != null) {
         $$0.a("DeathLootTable", this.cc.toString());
         if (this.cd != 0L) {
            $$0.a("DeathLootTableSeed", this.cd);
         }
      }

      if (this.fV()) {
         $$0.a("NoAI", this.fV());
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.s($$0.q("CanPickUpLoot"));
      }

      this.ca = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         sf $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bY.size(); $$2++) {
            this.bY.set($$2, clj.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         sf $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bX.size(); $$4++) {
            this.bX.set($$4, clj.a($$3.a($$4)));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         sf $$5 = $$0.c("ArmorDropChances", 5);

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            this.bR[$$6] = $$5.i($$6);
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         sf $$7 = $$0.c("HandDropChances", 5);

         for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
            this.bQ[$$8] = $$7.i($$8);
         }
      }

      if ($$0.b("Leash", 10)) {
         this.cg = $$0.p("Leash");
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cc = new agi($$0.l("DeathLootTable"));
         this.cd = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(bjo $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cc = null;
   }

   @Override
   public final agi eB() {
      return this.cc == null ? this.U() : this.cc;
   }

   protected agi U() {
      return super.eB();
   }

   @Override
   public long eC() {
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
   public void c_() {
      super.c_();
      this.dN().ae().a("looting");
      if (!this.dN().B && this.fL() && this.bx() && !this.ba && this.dN().Y().b(crw.c)) {
         iw $$0 = this.V();

         for (can $$2 : this.dN().a(can.class, this.cH().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dI() && !$$2.q().b() && !$$2.z() && this.k($$2.q())) {
               this.b($$2);
            }
         }
      }

      this.dN().ae().c();
   }

   protected iw V() {
      return bS;
   }

   protected void b(can $$0) {
      clj $$1 = $$0.q();
      clj $$2 = this.i($$1.p());
      if (!$$2.b()) {
         this.a($$0);
         this.a($$0, $$2.L());
         $$1.h($$2.L());
         if ($$1.b()) {
            $$0.am();
         }
      }
   }

   public clj i(clj $$0) {
      bkv $$1 = h($$0);
      clj $$2 = this.c($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bkv.a;
         $$2 = this.c($$1);
         $$3 = $$2.b();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.f($$1);
         if (!$$2.b() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.L() > 1) {
            clj $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return clj.b;
      }
   }

   @Override
   protected void b(bkv $$0, clj $$1) {
      this.a($$0, $$1);
      this.e($$0);
      this.ca = true;
   }

   public void e(bkv $$0) {
      switch ($$0.a()) {
         case a:
            this.bQ[$$0.b()] = 2.0F;
            break;
         case b:
            this.bR[$$0.b()] = 2.0F;
      }
   }

   protected boolean b(clj $$0, clj $$1) {
      if ($$1.b()) {
         return true;
      } else if ($$0.d() instanceof cmu) {
         if (!($$1.d() instanceof cmu)) {
            return true;
         } else {
            cmu $$2 = (cmu)$$0.d();
            cmu $$3 = (cmu)$$1.d();
            return $$2.h() != $$3.h() ? $$2.h() > $$3.h() : this.c($$0, $$1);
         }
      } else if ($$0.d() instanceof cjh && $$1.d() instanceof cjh) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cjr && $$1.d() instanceof cjr) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cit $$4) {
         if (cpw.d($$1)) {
            return false;
         } else if (!($$1.d() instanceof cit)) {
            return true;
         } else {
            cit $$5 = (cit)$$1.d();
            if ($$4.e() != $$5.e()) {
               return $$4.e() > $$5.e();
            } else {
               return $$4.f() != $$5.f() ? $$4.f() > $$5.f() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.d() instanceof cjt) {
            if ($$1.d() instanceof cjc) {
               return true;
            }

            if ($$1.d() instanceof cjt $$6) {
               cjt $$7 = (cjt)$$0.d();
               if ($$7.d() != $$6.d()) {
                  return $$7.d() > $$6.d();
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   public boolean c(clj $$0, clj $$1) {
      if ($$0.k() >= $$1.k() && (!$$0.u() || $$1.u())) {
         return $$0.u() && $$1.u()
            ? $$0.v().e().stream().anyMatch($$0x -> !$$0x.equals("Damage")) && !$$1.v().e().stream().anyMatch($$0x -> !$$0x.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean j(clj $$0) {
      return true;
   }

   public boolean k(clj $$0) {
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
   public void dz() {
      if (this.dN().aj() == biu.a && this.X()) {
         this.am();
      } else if (!this.fM() && !this.W()) {
         bkq $$0 = this.dN().a(this, -1.0);
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
   protected final void fj() {
      this.bb++;
      this.dN().ae().a("sensing");
      this.bW.a();
      this.dN().ae().c();
      int $$0 = this.dN().n().ai() + this.aj();
      if ($$0 % 2 != 0 && this.ah > 1) {
         this.dN().ae().a("targetSelector");
         this.bP.a(false);
         this.dN().ae().c();
         this.dN().ae().a("goalSelector");
         this.bO.a(false);
         this.dN().ae().c();
      } else {
         this.dN().ae().a("targetSelector");
         this.bP.a();
         this.dN().ae().c();
         this.dN().ae().a("goalSelector");
         this.bO.a();
         this.dN().ae().c();
      }

      this.dN().ae().a("navigation");
      this.bN.c();
      this.dN().ae().c();
      this.dN().ae().a("mob tick");
      this.Z();
      this.dN().ae().c();
      this.dN().ae().a("controls");
      this.dN().ae().a("move");
      this.bL.a();
      this.dN().ae().b("look");
      this.bK.a();
      this.dN().ae().b("jump");
      this.bM.b();
      this.dN().ae().c();
      this.dN().ae().c();
      this.Y();
   }

   protected void Y() {
      ack.a(this.dN(), this, this.bO);
   }

   protected void Z() {
   }

   public int aa() {
      return 40;
   }

   public int ab() {
      return 75;
   }

   public int fI() {
      return 10;
   }

   public void a(bkq $$0, float $$1, float $$2) {
      double $$3 = $$0.ds() - this.ds();
      double $$4 = $$0.dy() - this.dy();
      double $$6;
      if ($$0 instanceof blg $$5) {
         $$6 = $$5.dw() - this.dw();
      } else {
         $$6 = ($$0.cH().b + $$0.cH().e) / 2.0 - this.dw();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(atm.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(atm.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dF(), $$10, $$2));
      this.r(this.a(this.dD(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = atm.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bku<? extends bli> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      ht $$5 = $$3.d();
      return $$2 == blk.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(csb $$0, blk $$1) {
      return true;
   }

   public boolean a(csd $$0) {
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
         int $$0 = (int)(this.ew() - this.eN() * 0.33F);
         $$0 -= (3 - this.dN().aj().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return $$0 + 3;
      }
   }

   @Override
   public Iterable<clj> bK() {
      return this.bX;
   }

   @Override
   public Iterable<clj> bL() {
      return this.bY;
   }

   @Override
   public clj c(bkv $$0) {
      switch ($$0.a()) {
         case a:
            return this.bX.get($$0.b());
         case b:
            return this.bY.get($$0.b());
         default:
            return clj.b;
      }
   }

   @Override
   public void a(bkv $$0, clj $$1) {
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
   protected void a(bjo $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bkv $$3 : bkv.values()) {
         clj $$4 = this.c($$3);
         float $$5 = this.f($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.b() && !cpw.e($$4) && ($$2 || $$6) && Math.max(this.ag.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.i()) {
               $$4.b($$4.l() - this.ag.a(1 + this.ag.a(Math.max($$4.l() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, clj.b);
         }
      }
   }

   protected float f(bkv $$0) {
      return switch ($$0.a()) {
         case a -> this.bQ[$$0.b()];
         case b -> this.bR[$$0.b()];
         default -> 0.0F;
      };
   }

   protected void a(ats $$0, biv $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dN().aj() == biu.d ? 0.1F : 0.25F;
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

         for (bkv $$5 : bkv.values()) {
            if ($$5.a() == bkv.a.b) {
               clj $$6 = this.c($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.b()) {
                  cle $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new clj($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cle a(bkv $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return clm.pv;
            } else if ($$1 == 1) {
               return clm.pL;
            } else if ($$1 == 2) {
               return clm.pz;
            } else if ($$1 == 3) {
               return clm.pD;
            } else if ($$1 == 4) {
               return clm.pH;
            }
         case e:
            if ($$1 == 0) {
               return clm.pw;
            } else if ($$1 == 1) {
               return clm.pM;
            } else if ($$1 == 2) {
               return clm.pA;
            } else if ($$1 == 3) {
               return clm.pE;
            } else if ($$1 == 4) {
               return clm.pI;
            }
         case d:
            if ($$1 == 0) {
               return clm.px;
            } else if ($$1 == 1) {
               return clm.pN;
            } else if ($$1 == 2) {
               return clm.pB;
            } else if ($$1 == 3) {
               return clm.pF;
            } else if ($$1 == 4) {
               return clm.pJ;
            }
         case c:
            if ($$1 == 0) {
               return clm.py;
            } else if ($$1 == 1) {
               return clm.pO;
            } else if ($$1 == 2) {
               return clm.pC;
            } else if ($$1 == 3) {
               return clm.pG;
            } else if ($$1 == 4) {
               return clm.pK;
            }
         default:
            return null;
      }
   }

   protected void b(ats $$0, biv $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bkv $$3 : bkv.values()) {
         if ($$3.a() == bkv.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(ats $$0, float $$1) {
      if (!this.eU().b() && $$0.i() < 0.25F * $$1) {
         this.a(bkv.a, cpw.a($$0, this.eU(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(ats $$0, float $$1, bkv $$2) {
      clj $$3 = this.c($$2);
      if (!$$3.b() && $$0.i() < 0.5F * $$1) {
         this.a($$2, cpw.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      ats $$5 = $$0.E_();
      this.a(bmm.g).c(new bmk("Random spawn bonus", $$5.a(0.0, 0.11485000000000001), bmk.a.b));
      if ($$5.i() < 0.05F) {
         this.u(true);
      } else {
         this.u(false);
      }

      return $$3;
   }

   public void fK() {
      this.ca = true;
   }

   public void a(bkv $$0, float $$1) {
      switch ($$0.a()) {
         case a:
            this.bQ[$$0.b()] = $$1;
            break;
         case b:
            this.bR[$$0.b()] = $$1;
      }
   }

   public boolean fL() {
      return this.bZ;
   }

   public void s(boolean $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean f(clj $$0) {
      bkv $$1 = h($$0);
      return this.c($$1).b() && this.fL();
   }

   public boolean fM() {
      return this.ca;
   }

   @Override
   public final bix a(cdu $$0, biw $$1) {
      if (!this.bx()) {
         return bix.d;
      } else if (this.fU() == $$0) {
         this.a(true, !$$0.fU().d);
         this.a(dls.r, $$0);
         return bix.a(this.dN().B);
      } else {
         bix $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dls.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dls.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bix c(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if ($$2.a(clm.uC) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bix.a(this.dN().B);
      } else {
         if ($$2.a(clm.uD)) {
            bix $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.d() instanceof cmo) {
            if (this.dN() instanceof ame) {
               cmo $$4 = (cmo)$$2.d();
               Optional<bli> $$5 = $$4.a($$0, this, (bku<? extends bli>)this.ai(), (ame)this.dN(), this.dl(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bix.a : bix.d;
            } else {
               return bix.b;
            }
         } else {
            return bix.d;
         }
      }
   }

   protected void a(cdu $$0, bli $$1) {
   }

   protected bix b(cdu $$0, biw $$1) {
      return bix.d;
   }

   public boolean fN() {
      return this.a(this.dn());
   }

   public boolean a(ht $$0) {
      return this.ci == -1.0F ? true : this.ch.j($$0) < (double)(this.ci * this.ci);
   }

   public void a(ht $$0, int $$1) {
      this.ch = $$0;
      this.ci = (float)$$1;
   }

   public ht fO() {
      return this.ch;
   }

   public float fP() {
      return this.ci;
   }

   public void fQ() {
      this.ci = -1.0F;
   }

   public boolean fR() {
      return this.ci != -1.0F;
   }

   @Nullable
   public <T extends bli> T a(bku<T> $$0, boolean $$1) {
      if (this.dI()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dN());
         if ($$2 == null) {
            return null;
         } else {
            $$2.v(this);
            $$2.a(this.n_());
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

               for (bkv $$3 : bkv.values()) {
                  clj $$4 = this.c($$3);
                  if (!$$4.b()) {
                     $$2.a($$3, $$4.c());
                     $$2.a($$3, this.f($$3));
                  }
               }
            }

            this.dN().b($$2);
            if (this.bO()) {
               bkq $$5 = this.da();
               this.ac();
               $$2.a($$5, true);
            }

            this.am();
            return $$2;
         }
      }
   }

   protected void fS() {
      if (this.cg != null) {
         this.gb();
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
         if (!this.dN().B && $$1) {
            this.a(clm.uC);
         }

         if (!this.dN().B && $$0 && this.dN() instanceof ame) {
            ((ame)this.dN()).k().b(this, new abf(this, null));
         }
      }
   }

   public boolean a(cdu $$0) {
      return !this.fT() && !(this instanceof cba);
   }

   public boolean fT() {
      return this.ce != null;
   }

   @Nullable
   public bkq fU() {
      if (this.ce == null && this.cf != 0 && this.dN().B) {
         this.ce = this.dN().a(this.cf);
      }

      return this.ce;
   }

   public void b(bkq $$0, boolean $$1) {
      this.ce = $$0;
      this.cg = null;
      if (!this.dN().B && $$1 && this.dN() instanceof ame) {
         ((ame)this.dN()).k().b(this, new abf(this, this.ce));
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
   public boolean a(bkq $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.fT()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gb() {
      if (this.cg != null && this.dN() instanceof ame) {
         if (this.cg.b("UUID")) {
            UUID $$0 = this.cg.a("UUID");
            bkq $$1 = ((ame)this.dN()).a($$0);
            if ($$1 != null) {
               this.b($$1, true);
               return;
            }
         } else if (this.cg.b("X", 99) && this.cg.b("Y", 99) && this.cg.b("Z", 99)) {
            ht $$2 = so.b(this.cg);
            this.b(cah.b(this.dN(), $$2), true);
            return;
         }

         if (this.ah > 100) {
            this.a(clm.uC);
            this.cg = null;
         }
      }
   }

   @Override
   public boolean cZ() {
      return super.cZ() && !this.fV();
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
   public bla fn() {
      return this.fW() ? bla.a : bla.b;
   }

   public boolean i(blg $$0) {
      return this.fY().c($$0.eG());
   }

   protected ejp fY() {
      bkq $$0 = this.da();
      ejp $$3;
      if ($$0 != null) {
         ejp $$1 = $$0.cH();
         ejp $$2 = this.cH();
         $$3 = new ejp(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cH();
      }

      return $$3.c(bT, 0.0, bT);
   }

   @Override
   public boolean C(bkq $$0) {
      float $$1 = (float)this.b(bmm.c);
      float $$2 = (float)this.b(bmm.d);
      if ($$0 instanceof blg) {
         $$1 += cpw.a(this.eU(), ((blg)$$0).eT());
         $$2 += (float)cpw.c(this);
      }

      int $$3 = cpw.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dO().b((blg)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof blg) {
            ((blg)$$0).q((double)($$2 * 0.5F), (double)atm.a(this.dD() * (float) (Math.PI / 180.0)), (double)(-atm.b(this.dD() * (float) (Math.PI / 180.0))));
            this.g(this.dq().d(0.6, 1.0, 0.6));
         }

         if ($$0 instanceof cdu $$5) {
            this.a($$5, this.eU(), $$5.fo() ? $$5.fq() : clj.b);
         }

         this.a(this, $$0);
         this.A($$0);
      }

      return $$4;
   }

   private void a(cdu $$0, clj $$1, clj $$2) {
      if (!$$1.b() && !$$2.b() && $$1.d() instanceof ciy && $$2.a(clm.vk)) {
         float $$3 = 0.25F + (float)cpw.g(this) * 0.05F;
         if (this.ag.i() < $$3) {
            $$0.go().a(clm.vk, 100);
            this.dN().a($$0, (byte)30);
         }
      }
   }

   protected boolean fZ() {
      if (this.dN().O() && !this.dN().B) {
         float $$0 = this.bo();
         ht $$1 = ht.a(this.ds(), this.dw(), this.dy());
         boolean $$2 = this.bb() || this.aA || this.aB;
         if ($$0 > 0.5F && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dN().g($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(arv<ecr> $$0) {
      if (this.N().p()) {
         super.c($$0);
      } else {
         this.g(this.dq().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void ga() {
      this.c($$0 -> true);
      this.dP().h();
   }

   public void c(Predicate<bsb> $$0) {
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
   public clj dA() {
      cmo $$0 = cmo.a(this.ai());
      return $$0 == null ? null : new clj($$0);
   }
}

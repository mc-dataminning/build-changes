import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bgb extends bfz implements bgw {
   private static final aby<Byte> b = acb.a(bgb.class, aca.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final hz bS = new hz(1, 0, 1);
   public static final float g = 0.15F;
   public static final float bB = 0.55F;
   public static final float bC = 0.5F;
   public static final float bD = 0.25F;
   public static final String bE = "Leash";
   public static final float bF = 0.085F;
   public static final int bG = 2;
   public static final int bH = 2;
   public int bI;
   protected int bJ;
   protected blx bK;
   protected bly bL;
   protected blw bM;
   private final blt bT;
   protected bpj bN;
   protected final bmw bO;
   protected final bmw bP;
   @Nullable
   private bfz bU;
   private final bqe bV;
   private final hn<cfz> bW = hn.a(2, cfz.b);
   protected final float[] bQ = new float[2];
   private final hn<cfz> bX = hn.a(4, cfz.b);
   protected final float[] bR = new float[4];
   private boolean bY;
   private boolean bZ;
   private final Map<dxp, Float> ca = Maps.newEnumMap(dxp.class);
   @Nullable
   private acq cb;
   private long cc;
   @Nullable
   private bfj cd;
   private int ce;
   @Nullable
   private qr cf;
   private gu cg = gu.b;
   private float ch = -1.0F;

   protected bgb(bfn<? extends bgb> $$0, cmm $$1) {
      super($$0, $$1);
      this.bO = new bmw($$1.ae());
      this.bP = new bmw($$1.ae());
      this.bK = new blx(this);
      this.bL = new bly(this);
      this.bM = new blw(this);
      this.bT = this.D();
      this.bN = this.b($$1);
      this.bV = new bqe(this);
      Arrays.fill(this.bR, 0.085F);
      Arrays.fill(this.bQ, 0.085F);
      if ($$1 != null && !$$1.B) {
         this.x();
      }
   }

   @Override
   protected void x() {
   }

   public static bhf.a y() {
      return bfz.dM().a(bhg.b, 16.0).a(bhg.g);
   }

   protected bpj b(cmm $$0) {
      return new bpi(this, $$0);
   }

   protected boolean z() {
      return false;
   }

   public float a(dxp $$0) {
      bgb $$2;
      label17: {
         if (this.cX() instanceof bgb $$1 && $$1.z()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.ca.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(dxp $$0, float $$1) {
      this.ca.put($$0, $$1);
   }

   public void A() {
   }

   @Override
   public void C() {
   }

   protected blt D() {
      return new blt(this);
   }

   public blx E() {
      return this.bK;
   }

   public bly G() {
      return this.cX() instanceof bgb $$0 ? $$0.G() : this.bL;
   }

   public blw I() {
      return this.bM;
   }

   public bpj J() {
      return this.cX() instanceof bgb $$0 ? $$0.J() : this.bN;
   }

   @Nullable
   @Override
   public bfz cL() {
      return !this.fQ() && this.cO() instanceof bgb $$0 ? $$0 : null;
   }

   public bqe K() {
      return this.bV;
   }

   @Nullable
   @Override
   public bfz j() {
      return this.bU;
   }

   public void h(@Nullable bfz $$0) {
      this.bU = $$0;
   }

   @Override
   public boolean a(bfn<?> $$0) {
      return $$0 != bfn.Q;
   }

   public boolean a(cgp $$0) {
      return false;
   }

   public void L() {
      this.a(dgl.m);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(b, (byte)0);
   }

   public int M() {
      return 80;
   }

   public void N() {
      amg $$0 = this.s();
      if ($$0 != null) {
         this.a($$0, this.eR(), this.eS());
      }
   }

   @Override
   public void ao() {
      super.ao();
      this.dI().ad().a("mobBaseTick");
      if (this.bs() && this.af.a(1000) < this.bI++) {
         this.q();
         this.N();
      }

      this.dI().ad().c();
   }

   @Override
   protected void e(ben $$0) {
      this.q();
      super.e($$0);
   }

   private void q() {
      this.bI = -this.M();
   }

   @Override
   public int ea() {
      if (this.bJ > 0) {
         int $$0 = this.bJ;

         for (int $$1 = 0; $$1 < this.bX.size(); $$1++) {
            if (!this.bX.get($$1).b() && this.bR[$$1] <= 1.0F) {
               $$0 += 1 + this.af.a(3);
            }
         }

         for (int $$2 = 0; $$2 < this.bW.size(); $$2++) {
            if (!this.bW.get($$2).b() && this.bQ[$$2] <= 1.0F) {
               $$0 += 1 + this.af.a(3);
            }
         }

         return $$0;
      } else {
         return this.bJ;
      }
   }

   public void O() {
      if (this.dI().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.af.k() * 0.02;
            double $$2 = this.af.k() * 0.02;
            double $$3 = this.af.k() * 0.02;
            double $$4 = 10.0;
            this.dI().a(iv.W, this.c(1.0) - $$1 * 10.0, this.dq() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dI().a(this, (byte)20);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 20) {
         this.O();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dI().B) {
         this.fN();
         if (this.ag % 5 == 0) {
            this.P();
         }
      }
   }

   protected void P() {
      boolean $$0 = !(this.cL() instanceof bgb);
      boolean $$1 = !(this.cW() instanceof cah);
      this.bO.a(bmv.a.a, $$0);
      this.bO.a(bmv.a.c, $$0 && $$1);
      this.bO.a(bmv.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bT.a();
      return $$1;
   }

   @Nullable
   protected amg s() {
      return null;
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fG());
      $$0.a("PersistenceRequired", this.bZ);
      qx $$1 = new qx();

      for (cfz $$2 : this.bX) {
         qr $$3 = new qr();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      qx $$4 = new qx();

      for (cfz $$5 : this.bW) {
         qr $$6 = new qr();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      qx $$7 = new qx();

      for (float $$8 : this.bR) {
         $$7.add(qu.a($$8));
      }

      $$0.a("ArmorDropChances", $$7);
      qx $$9 = new qx();

      for (float $$10 : this.bQ) {
         $$9.add(qu.a($$10));
      }

      $$0.a("HandDropChances", $$9);
      if (this.cd != null) {
         qr $$11 = new qr();
         if (this.cd instanceof bfz) {
            UUID $$12 = this.cd.ct();
            $$11.a("UUID", $$12);
         } else if (this.cd instanceof buz) {
            gu $$13 = ((buz)this.cd).y();
            $$11.a("X", $$13.u());
            $$11.a("Y", $$13.v());
            $$11.a("Z", $$13.w());
         }

         $$0.a("Leash", $$11);
      } else if (this.cf != null) {
         $$0.a("Leash", this.cf.h());
      }

      $$0.a("LeftHanded", this.fR());
      if (this.cb != null) {
         $$0.a("DeathLootTable", this.cb.toString());
         if (this.cc != 0L) {
            $$0.a("DeathLootTableSeed", this.cc);
         }
      }

      if (this.fQ()) {
         $$0.a("NoAI", this.fQ());
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.s($$0.q("CanPickUpLoot"));
      }

      this.bZ = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         qx $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bX.size(); $$2++) {
            this.bX.set($$2, cfz.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         qx $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bW.size(); $$4++) {
            this.bW.set($$4, cfz.a($$3.a($$4)));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         qx $$5 = $$0.c("ArmorDropChances", 5);

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            this.bR[$$6] = $$5.i($$6);
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         qx $$7 = $$0.c("HandDropChances", 5);

         for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
            this.bQ[$$8] = $$7.i($$8);
         }
      }

      if ($$0.b("Leash", 10)) {
         this.cf = $$0.p("Leash");
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cb = new acq($$0.l("DeathLootTable"));
         this.cc = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(ben $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cb = null;
   }

   @Override
   public final acq ew() {
      return this.cb == null ? this.Q() : this.cb;
   }

   protected acq Q() {
      return super.ew();
   }

   @Override
   public long ex() {
      return this.cc;
   }

   public void z(float $$0) {
      this.bn = $$0;
   }

   public void A(float $$0) {
      this.bm = $$0;
   }

   public void B(float $$0) {
      this.bl = $$0;
   }

   @Override
   public void w(float $$0) {
      super.w($$0);
      this.z($$0);
   }

   @Override
   public void b_() {
      super.b_();
      this.dI().ad().a("looting");
      if (!this.dI().B && this.fG() && this.bs() && !this.bb && this.dI().X().b(cmi.c)) {
         hz $$0 = this.R();

         for (bvh $$2 : this.dI().a(bvh.class, this.cE().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dD() && !$$2.j().b() && !$$2.r() && this.k($$2.j())) {
               this.b($$2);
            }
         }
      }

      this.dI().ad().c();
   }

   protected hz R() {
      return bS;
   }

   protected void b(bvh $$0) {
      cfz $$1 = $$0.j();
      cfz $$2 = this.i($$1.p());
      if (!$$2.b()) {
         this.a($$0);
         this.a($$0, $$2.L());
         $$1.h($$2.L());
         if ($$1.b()) {
            $$0.ai();
         }
      }
   }

   public cfz i(cfz $$0) {
      bfo $$1 = h($$0);
      cfz $$2 = this.c($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.e() && !$$3) {
         $$1 = bfo.a;
         $$2 = this.c($$1);
         $$3 = $$2.b();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.f($$1);
         if (!$$2.b() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.e() && $$0.L() > 1) {
            cfz $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return cfz.b;
      }
   }

   @Override
   protected void b(bfo $$0, cfz $$1) {
      this.a($$0, $$1);
      this.e($$0);
      this.bZ = true;
   }

   public void e(bfo $$0) {
      switch ($$0.a()) {
         case a:
            this.bQ[$$0.b()] = 2.0F;
            break;
         case b:
            this.bR[$$0.b()] = 2.0F;
      }
   }

   protected boolean b(cfz $$0, cfz $$1) {
      if ($$1.b()) {
         return true;
      } else if ($$0.d() instanceof chk) {
         if (!($$1.d() instanceof chk)) {
            return true;
         } else {
            chk $$2 = (chk)$$0.d();
            chk $$3 = (chk)$$1.d();
            return $$2.h() != $$3.h() ? $$2.h() > $$3.h() : this.c($$0, $$1);
         }
      } else if ($$0.d() instanceof cdx && $$1.d() instanceof cdx) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof ceh && $$1.d() instanceof ceh) {
         return this.c($$0, $$1);
      } else if ($$0.d() instanceof cdj) {
         if (cki.d($$1)) {
            return false;
         } else if (!($$1.d() instanceof cdj)) {
            return true;
         } else {
            cdj $$4 = (cdj)$$0.d();
            cdj $$5 = (cdj)$$1.d();
            if ($$4.e() != $$5.e()) {
               return $$4.e() > $$5.e();
            } else {
               return $$4.f() != $$5.f() ? $$4.f() > $$5.f() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.d() instanceof cej) {
            if ($$1.d() instanceof cds) {
               return true;
            }

            if ($$1.d() instanceof cej) {
               cej $$6 = (cej)$$0.d();
               cej $$7 = (cej)$$1.d();
               if ($$6.d() != $$7.d()) {
                  return $$6.d() > $$7.d();
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   public boolean c(cfz $$0, cfz $$1) {
      if ($$0.k() >= $$1.k() && (!$$0.u() || $$1.u())) {
         return $$0.u() && $$1.u()
            ? $$0.v().e().stream().anyMatch($$0x -> !$$0x.equals("Damage")) && !$$1.v().e().stream().anyMatch($$0x -> !$$0x.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean j(cfz $$0) {
      return true;
   }

   public boolean k(cfz $$0) {
      return this.j($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean T() {
      return this.bM();
   }

   protected boolean U() {
      return false;
   }

   @Override
   public void du() {
      if (this.dI().ai() == bdu.a && this.U()) {
         this.ai();
      } else if (!this.fH() && !this.T()) {
         bfj $$0 = this.dI().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.f(this);
            int $$2 = this.ae().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.ai();
            }

            int $$4 = this.ae().f().g();
            int $$5 = $$4 * $$4;
            if (this.bc > 600 && this.af.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.ai();
            } else if ($$1 < (double)$$5) {
               this.bc = 0;
            }
         }
      } else {
         this.bc = 0;
      }
   }

   @Override
   protected final void fc() {
      this.bc++;
      this.dI().ad().a("sensing");
      this.bV.a();
      this.dI().ad().c();
      int $$0 = this.dI().n().ag() + this.af();
      if ($$0 % 2 != 0 && this.ag > 1) {
         this.dI().ad().a("targetSelector");
         this.bP.a(false);
         this.dI().ad().c();
         this.dI().ad().a("goalSelector");
         this.bO.a(false);
         this.dI().ad().c();
      } else {
         this.dI().ad().a("targetSelector");
         this.bP.a();
         this.dI().ad().c();
         this.dI().ad().a("goalSelector");
         this.bO.a();
         this.dI().ad().c();
      }

      this.dI().ad().a("navigation");
      this.bN.c();
      this.dI().ad().c();
      this.dI().ad().a("mob tick");
      this.W();
      this.dI().ad().c();
      this.dI().ad().a("controls");
      this.dI().ad().a("move");
      this.bL.a();
      this.dI().ad().b("look");
      this.bK.a();
      this.dI().ad().b("jump");
      this.bM.b();
      this.dI().ad().c();
      this.dI().ad().c();
      this.V();
   }

   protected void V() {
      za.a(this.dI(), this, this.bO);
   }

   protected void W() {
   }

   public int X() {
      return 40;
   }

   public int fC() {
      return 75;
   }

   public int fD() {
      return 10;
   }

   public void a(bfj $$0, float $$1, float $$2) {
      double $$3 = $$0.dn() - this.dn();
      double $$4 = $$0.dt() - this.dt();
      double $$6;
      if ($$0 instanceof bfz $$5) {
         $$6 = $$5.dr() - this.dr();
      } else {
         $$6 = ($$0.cE().b + $$0.cE().e) / 2.0 - this.dr();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(apa.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(apa.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.b_(this.a(this.dA(), $$10, $$2));
      this.a_(this.a(this.dy(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = apa.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bfn<? extends bgb> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      gu $$5 = $$3.d();
      return $$2 == bgd.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(cmn $$0, bgd $$1) {
      return true;
   }

   public boolean a(cmp $$0) {
      return !$$0.d(this.cE()) && $$0.f(this);
   }

   public int fE() {
      return 4;
   }

   public boolean d(int $$0) {
      return false;
   }

   @Override
   public int cr() {
      if (this.j() == null) {
         return 3;
      } else {
         int $$0 = (int)(this.er() - this.eI() * 0.33F);
         $$0 -= (3 - this.dI().ai().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return $$0 + 3;
      }
   }

   @Override
   public Iterable<cfz> bI() {
      return this.bW;
   }

   @Override
   public Iterable<cfz> bJ() {
      return this.bX;
   }

   @Override
   public cfz c(bfo $$0) {
      switch ($$0.a()) {
         case a:
            return this.bW.get($$0.b());
         case b:
            return this.bX.get($$0.b());
         default:
            return cfz.b;
      }
   }

   @Override
   public void a(bfo $$0, cfz $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.bW.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.bX.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   protected void a(ben $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bfo $$3 : bfo.values()) {
         cfz $$4 = this.c($$3);
         float $$5 = this.f($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.b() && !cki.e($$4) && ($$2 || $$6) && Math.max(this.af.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.i()) {
               $$4.b($$4.l() - this.af.a(1 + this.af.a(Math.max($$4.l() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, cfz.b);
         }
      }
   }

   protected float f(bfo $$0) {
      return switch ($$0.a()) {
         case a -> this.bQ[$$0.b()];
         case b -> this.bR[$$0.b()];
         default -> 0.0F;
      };
   }

   protected void a(apf $$0, bdv $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dI().ai() == bdu.d ? 0.1F : 0.25F;
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

         for (bfo $$5 : bfo.values()) {
            if ($$5.a() == bfo.a.b) {
               cfz $$6 = this.c($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.b()) {
                  cfu $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cfz($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static cfu a(bfo $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cgc.oK;
            } else if ($$1 == 1) {
               return cgc.pa;
            } else if ($$1 == 2) {
               return cgc.oO;
            } else if ($$1 == 3) {
               return cgc.oS;
            } else if ($$1 == 4) {
               return cgc.oW;
            }
         case e:
            if ($$1 == 0) {
               return cgc.oL;
            } else if ($$1 == 1) {
               return cgc.pb;
            } else if ($$1 == 2) {
               return cgc.oP;
            } else if ($$1 == 3) {
               return cgc.oT;
            } else if ($$1 == 4) {
               return cgc.oX;
            }
         case d:
            if ($$1 == 0) {
               return cgc.oM;
            } else if ($$1 == 1) {
               return cgc.pc;
            } else if ($$1 == 2) {
               return cgc.oQ;
            } else if ($$1 == 3) {
               return cgc.oU;
            } else if ($$1 == 4) {
               return cgc.oY;
            }
         case c:
            if ($$1 == 0) {
               return cgc.oN;
            } else if ($$1 == 1) {
               return cgc.pd;
            } else if ($$1 == 2) {
               return cgc.oR;
            } else if ($$1 == 3) {
               return cgc.oV;
            } else if ($$1 == 4) {
               return cgc.oZ;
            }
         default:
            return null;
      }
   }

   protected void b(apf $$0, bdv $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bfo $$3 : bfo.values()) {
         if ($$3.a() == bfo.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(apf $$0, float $$1) {
      if (!this.eO().b() && $$0.i() < 0.25F * $$1) {
         this.a(bfo.a, cki.a($$0, this.eO(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(apf $$0, float $$1, bfo $$2) {
      cfz $$3 = this.c($$2);
      if (!$$3.b() && $$0.i() < 0.5F * $$1) {
         this.a($$2, cki.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      apf $$5 = $$0.y_();
      this.a(bhg.b).c(new bhe("Random spawn bonus", $$5.a(0.0, 0.11485000000000001), bhe.a.b));
      if ($$5.i() < 0.05F) {
         this.u(true);
      } else {
         this.u(false);
      }

      return $$3;
   }

   public void fF() {
      this.bZ = true;
   }

   public void a(bfo $$0, float $$1) {
      switch ($$0.a()) {
         case a:
            this.bQ[$$0.b()] = $$1;
            break;
         case b:
            this.bR[$$0.b()] = $$1;
      }
   }

   public boolean fG() {
      return this.bY;
   }

   public void s(boolean $$0) {
      this.bY = $$0;
   }

   @Override
   public boolean f(cfz $$0) {
      bfo $$1 = h($$0);
      return this.c($$1).b() && this.fG();
   }

   public boolean fH() {
      return this.bZ;
   }

   @Override
   public final bdx a(byo $$0, bdw $$1) {
      if (!this.bs()) {
         return bdx.d;
      } else if (this.fP() == $$0) {
         this.a(true, !$$0.fO().d);
         this.a(dgl.r, $$0);
         return bdx.a(this.dI().B);
      } else {
         bdx $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dgl.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dgl.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bdx c(byo $$0, bdw $$1) {
      cfz $$2 = $$0.b($$1);
      if ($$2.a(cgc.tQ) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bdx.a(this.dI().B);
      } else {
         if ($$2.a(cgc.tR)) {
            bdx $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.d() instanceof che) {
            if (this.dI() instanceof aif) {
               che $$4 = (che)$$2.d();
               Optional<bgb> $$5 = $$4.a($$0, this, (bfn<? extends bgb>)this.ae(), (aif)this.dI(), this.dg(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bdx.a : bdx.d;
            } else {
               return bdx.b;
            }
         } else {
            return bdx.d;
         }
      }
   }

   protected void a(byo $$0, bgb $$1) {
   }

   protected bdx b(byo $$0, bdw $$1) {
      return bdx.d;
   }

   public boolean fI() {
      return this.a(this.di());
   }

   public boolean a(gu $$0) {
      return this.ch == -1.0F ? true : this.cg.j($$0) < (double)(this.ch * this.ch);
   }

   public void a(gu $$0, int $$1) {
      this.cg = $$0;
      this.ch = (float)$$1;
   }

   public gu fJ() {
      return this.cg;
   }

   public float fK() {
      return this.ch;
   }

   public void fL() {
      this.ch = -1.0F;
   }

   public boolean fM() {
      return this.ch != -1.0F;
   }

   @Nullable
   public <T extends bgb> T a(bfn<T> $$0, boolean $$1) {
      if (this.dD()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dI());
         if ($$2 == null) {
            return null;
         } else {
            $$2.s(this);
            $$2.a(this.h_());
            $$2.t(this.fQ());
            if (this.aa()) {
               $$2.b(this.ab());
               $$2.n(this.cy());
            }

            if (this.fH()) {
               $$2.fF();
            }

            $$2.m(this.co());
            if ($$1) {
               $$2.s(this.fG());

               for (bfo $$3 : bfo.values()) {
                  cfz $$4 = this.c($$3);
                  if (!$$4.b()) {
                     $$2.a($$3, $$4.c());
                     $$2.a($$3, this.f($$3));
                  }
               }
            }

            this.dI().b($$2);
            if (this.bM()) {
               bfj $$5 = this.cW();
               this.Y();
               $$2.a($$5, true);
            }

            this.ai();
            return $$2;
         }
      }
   }

   protected void fN() {
      if (this.cf != null) {
         this.fV();
      }

      if (this.cd != null) {
         if (!this.bs() || !this.cd.bs()) {
            this.a(true, true);
         }
      }
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.cd != null) {
         this.cd = null;
         this.cf = null;
         if (!this.dI().B && $$1) {
            this.a(cgc.tQ);
         }

         if (!this.dI().B && $$0 && this.dI() instanceof aif) {
            ((aif)this.dI()).k().b(this, new xx(this, null));
         }
      }
   }

   public boolean a(byo $$0) {
      return !this.fO() && !(this instanceof bvu);
   }

   public boolean fO() {
      return this.cd != null;
   }

   @Nullable
   public bfj fP() {
      if (this.cd == null && this.ce != 0 && this.dI().B) {
         this.cd = this.dI().a(this.ce);
      }

      return this.cd;
   }

   public void b(bfj $$0, boolean $$1) {
      this.cd = $$0;
      this.cf = null;
      if (!this.dI().B && $$1 && this.dI() instanceof aif) {
         ((aif)this.dI()).k().b(this, new xx(this, this.cd));
      }

      if (this.bM()) {
         this.Y();
      }
   }

   public void r(int $$0) {
      this.ce = $$0;
      this.a(false, false);
   }

   @Override
   public boolean a(bfj $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.fO()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void fV() {
      if (this.cf != null && this.dI() instanceof aif) {
         if (this.cf.b("UUID")) {
            UUID $$0 = this.cf.a("UUID");
            bfj $$1 = ((aif)this.dI()).a($$0);
            if ($$1 != null) {
               this.b($$1, true);
               return;
            }
         } else if (this.cf.b("X", 99) && this.cf.b("Y", 99) && this.cf.b("Z", 99)) {
            gu $$2 = rd.b(this.cf);
            this.b(bvb.b(this.dI(), $$2), true);
            return;
         }

         if (this.ag > 100) {
            this.a(cgc.tQ);
            this.cf = null;
         }
      }
   }

   @Override
   public boolean cV() {
      return super.cV() && !this.fQ();
   }

   public void t(boolean $$0) {
      byte $$1 = this.am.b(b);
      this.am.b(b, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void u(boolean $$0) {
      byte $$1 = this.am.b(b);
      this.am.b(b, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void v(boolean $$0) {
      byte $$1 = this.am.b(b);
      this.am.b(b, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean fQ() {
      return (this.am.b(b) & 1) != 0;
   }

   public boolean fR() {
      return (this.am.b(b) & 2) != 0;
   }

   public boolean fS() {
      return (this.am.b(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bft fh() {
      return this.fR() ? bft.a : bft.b;
   }

   public double i(bfz $$0) {
      return (double)(this.dd() * 2.0F * this.dd() * 2.0F + $$0.dd());
   }

   public double j(bfz $$0) {
      return Math.max(this.e($$0.eA()), this.e($$0.dg()));
   }

   public boolean k(bfz $$0) {
      double $$1 = this.j($$0);
      return $$1 <= this.i($$0);
   }

   @Override
   public boolean z(bfj $$0) {
      float $$1 = (float)this.b(bhg.f);
      float $$2 = (float)this.b(bhg.g);
      if ($$0 instanceof bfz) {
         $$1 += cki.a(this.eO(), ((bfz)$$0).eN());
         $$2 += (float)cki.c(this);
      }

      int $$3 = cki.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dJ().b((bfz)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof bfz) {
            ((bfz)$$0).q((double)($$2 * 0.5F), (double)apa.a(this.dy() * (float) (Math.PI / 180.0)), (double)(-apa.b(this.dy() * (float) (Math.PI / 180.0))));
            this.f(this.dl().d(0.6, 1.0, 0.6));
         }

         if ($$0 instanceof byo $$5) {
            this.a($$5, this.eO(), $$5.fi() ? $$5.fk() : cfz.b);
         }

         this.a(this, $$0);
         this.x($$0);
      }

      return $$4;
   }

   private void a(byo $$0, cfz $$1, cfz $$2) {
      if (!$$1.b() && !$$2.b() && $$1.d() instanceof cdo && $$2.a(cgc.uy)) {
         float $$3 = 0.25F + (float)cki.g(this) * 0.05F;
         if (this.af.i() < $$3) {
            $$0.gi().a(cgc.uy, 100);
            this.dI().a($$0, (byte)30);
         }
      }
   }

   protected boolean fT() {
      if (this.dI().N() && !this.dI().B) {
         float $$0 = this.bj();
         gu $$1 = gu.a(this.dn(), this.dr(), this.dt());
         boolean $$2 = this.aX() || this.az || this.aA;
         if ($$0 > 0.5F && this.af.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dI().g($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(anl<dxd> $$0) {
      if (this.J().q()) {
         super.c($$0);
      } else {
         this.f(this.dl().b(0.0, 0.3, 0.0));
      }
   }

   public void fU() {
      this.c($$0 -> true);
      this.dK().h();
   }

   public void c(Predicate<bmv> $$0) {
      this.bO.a($$0);
   }

   @Override
   protected void cp() {
      super.cp();
      this.a(true, false);
      this.bK().forEach($$0 -> {
         if (!$$0.b()) {
            $$0.f(0);
         }
      });
   }

   @Nullable
   @Override
   public cfz dv() {
      che $$0 = che.a(this.ae());
      return $$0 == null ? null : new cfz($$0);
   }
}

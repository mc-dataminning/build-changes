import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bss extends bsq implements bsf, bto {
   private static final ajs<Byte> b = ajw.a(bss.class, aju.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final js bX = new js(1, 0, 1);
   public static final float g = 0.15F;
   public static final float bF = 0.55F;
   public static final float bG = 0.5F;
   public static final float bH = 0.25F;
   public static final String bI = "leash";
   public static final float bJ = 0.085F;
   public static final int bK = 2;
   public static final int bL = 2;
   private static final double bY = Math.sqrt(2.04F) - 0.6F;
   public int bM;
   protected int bN;
   protected byq bO;
   protected byr bP;
   protected byp bQ;
   private final bym bZ;
   protected ccc bR;
   protected final bzp bS;
   protected final bzp bT;
   @Nullable
   private bsq ca;
   private final ccz cb;
   private final jg<ctq> cc = jg.a(2, ctq.i);
   protected final float[] bU = new float[2];
   private final jg<ctq> cd = jg.a(4, ctq.i);
   protected final float[] bV = new float[4];
   private ctq ce = ctq.i;
   protected float bW;
   private boolean cf;
   private boolean cg;
   private final Map<enn, Float> ch = Maps.newEnumMap(enn.class);
   @Nullable
   private akm<epm> ci;
   private long cj;
   @Nullable
   private brw ck;
   private int cl;
   @Nullable
   private Either<UUID, io> cm;
   private io cn = io.c;
   private float co = -1.0F;

   protected bss(bsc<? extends bss> $$0, daz $$1) {
      super($$0, $$1);
      this.bS = new bzp($$1.ag());
      this.bT = new bzp($$1.ag());
      this.bO = new byq(this);
      this.bP = new byr(this);
      this.bQ = new byp(this);
      this.bZ = this.E();
      this.bR = this.b($$1);
      this.cb = new ccz(this);
      Arrays.fill(this.bV, 0.085F);
      Arrays.fill(this.bU, 0.085F);
      this.bW = 0.085F;
      if ($$1 != null && !$$1.B) {
         this.z();
      }
   }

   @Override
   protected void z() {
   }

   public static btx.a A() {
      return bsq.dU().a(bty.k, 16.0).a(bty.d);
   }

   protected ccc b(daz $$0) {
      return new ccb(this, $$0);
   }

   protected boolean B() {
      return false;
   }

   public float a(enn $$0) {
      bss $$2;
      label17: {
         if (this.dd() instanceof bss $$1 && $$1.B()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.ch.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(enn $$0, float $$1) {
      this.ch.put($$0, $$1);
   }

   @Override
   public void C() {
   }

   @Override
   public void D() {
   }

   protected bym E() {
      return new bym(this);
   }

   public byq G() {
      return this.bO;
   }

   public byr H() {
      return this.dd() instanceof bss $$0 ? $$0.H() : this.bP;
   }

   public byp I() {
      return this.bQ;
   }

   public ccc K() {
      return this.dd() instanceof bss $$0 ? $$0.K() : this.bR;
   }

   @Nullable
   @Override
   public bsq cQ() {
      brw $$0 = this.cT();
      if (!this.gf() && $$0 instanceof bss $$1 && $$0.bU()) {
         return $$1;
      }

      return null;
   }

   public ccz M() {
      return this.cb;
   }

   @Nullable
   @Override
   public bsq p() {
      return this.ca;
   }

   public void h(@Nullable bsq $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(bsc<?> $$0) {
      return $$0 != bsc.T;
   }

   public boolean a(cuj $$0) {
      return false;
   }

   public void N() {
      this.a(dvw.m);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   public int O() {
      return 80;
   }

   public void P() {
      this.b(this.v());
   }

   @Override
   public void au() {
      super.au();
      this.dP().af().a("mobBaseTick");
      if (this.bD() && this.ah.a(1000) < this.bM++) {
         this.s();
         this.P();
      }

      this.dP().af().c();
   }

   @Override
   protected void e(bqp $$0) {
      this.s();
      super.e($$0);
   }

   private void s() {
      this.bM = -this.O();
   }

   @Override
   public int ej() {
      if (this.bN > 0) {
         int $$0 = this.bN;

         for (int $$1 = 0; $$1 < this.cd.size(); $$1++) {
            if (!this.cd.get($$1).e() && this.bV[$$1] <= 1.0F) {
               $$0 += 1 + this.ah.a(3);
            }
         }

         for (int $$2 = 0; $$2 < this.cc.size(); $$2++) {
            if (!this.cc.get($$2).e() && this.bU[$$2] <= 1.0F) {
               $$0 += 1 + this.ah.a(3);
            }
         }

         if (!this.ce.e() && this.bW <= 1.0F) {
            $$0 += 1 + this.ah.a(3);
         }

         return $$0;
      } else {
         return this.bN;
      }
   }

   public void Q() {
      if (this.dP().B) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.ah.k() * 0.02;
            double $$2 = this.ah.k() * 0.02;
            double $$3 = this.ah.k() * 0.02;
            double $$4 = 10.0;
            this.dP().a(ky.ab, this.c(1.0) - $$1 * 10.0, this.dx() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dP().a(this, (byte)20);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 20) {
         this.Q();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dP().B) {
         this.gb();
         if (this.ai % 5 == 0) {
            this.R();
         }
      }
   }

   protected void R() {
      boolean $$0 = !(this.cQ() instanceof bss);
      boolean $$1 = !(this.dc() instanceof cnv);
      this.bS.a(bzo.a.a, $$0);
      this.bS.a(bzo.a.c, $$0 && $$1);
      this.bS.a(bzo.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bZ.a();
      return $$1;
   }

   @Nullable
   protected avh v() {
      return null;
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fU());
      $$0.a("PersistenceRequired", this.cg);
      uj $$1 = new uj();

      for (ctq $$2 : this.cd) {
         if (!$$2.e()) {
            $$1.add($$2.a(this.dR()));
         } else {
            $$1.add(new ud());
         }
      }

      $$0.a("ArmorItems", $$1);
      uj $$3 = new uj();

      for (float $$4 : this.bV) {
         $$3.add(ug.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      uj $$5 = new uj();

      for (ctq $$6 : this.cc) {
         if (!$$6.e()) {
            $$5.add($$6.a(this.dR()));
         } else {
            $$5.add(new ud());
         }
      }

      $$0.a("HandItems", $$5);
      uj $$7 = new uj();

      for (float $$8 : this.bU) {
         $$7.add(ug.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.ce.e()) {
         $$0.a("body_armor_item", this.ce.a(this.dR()));
         $$0.a("body_armor_drop_chance", this.bW);
      }

      Either<UUID, io> $$9 = this.cm;
      if (this.ck instanceof bsq) {
         $$9 = Either.left(this.ck.cz());
      } else if (this.ck instanceof cia $$10) {
         $$9 = Either.right($$10.D());
      }

      if ($$9 != null) {
         $$0.a("leash", (va)$$9.map($$0x -> {
            ud $$1x = new ud();
            $$1x.a("UUID", $$0x);
            return $$1x;
         }, us::a));
      }

      $$0.a("LeftHanded", this.gg());
      if (this.ci != null) {
         $$0.a("DeathLootTable", this.ci.a().toString());
         if (this.cj != 0L) {
            $$0.a("DeathLootTableSeed", this.cj);
         }
      }

      if (this.gf()) {
         $$0.a("NoAI", this.gf());
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.cg = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         uj $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cd.size(); $$2++) {
            ud $$3 = $$1.a($$2);
            this.cd.set($$2, ctq.a(this.dR(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         uj $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bV[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         uj $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.cc.size(); $$7++) {
            ud $$8 = $$6.a($$7);
            this.cc.set($$7, ctq.a(this.dR(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         uj $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bU[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.ce = ctq.a(this.dR(), (va)$$0.p("body_armor_item")).orElse(ctq.i);
         this.bW = $$0.j("body_armor_drop_chance");
      } else {
         this.ce = ctq.i;
      }

      if ($$0.b("leash", 10)) {
         this.cm = Either.left($$0.p("leash").a("UUID"));
      } else if ($$0.b("leash", 11)) {
         this.cm = us.a($$0, "leash").<Either<UUID, io>>map(Either::right).orElse(null);
      } else {
         this.cm = null;
      }

      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.ci = akm.a(lf.aU, new akn($$0.l("DeathLootTable")));
         this.cj = $$0.i("DeathLootTableSeed");
      }

      this.t($$0.q("NoAI"));
   }

   @Override
   protected void a(bqp $$0, boolean $$1) {
      super.a($$0, $$1);
      this.ci = null;
   }

   @Override
   public final akm<epm> eF() {
      return this.ci == null ? this.S() : this.ci;
   }

   protected akm<epm> S() {
      return super.eF();
   }

   @Override
   public long eG() {
      return this.cj;
   }

   public void C(float $$0) {
      this.bq = $$0;
   }

   public void D(float $$0) {
      this.bp = $$0;
   }

   public void E(float $$0) {
      this.bo = $$0;
   }

   @Override
   public void y(float $$0) {
      super.y($$0);
      this.C($$0);
   }

   public void T() {
      this.K().n();
      this.E(0.0F);
      this.D(0.0F);
      this.y(0.0F);
   }

   @Override
   public void n_() {
      super.n_();
      this.dP().af().a("looting");
      if (!this.dP().B && this.fU() && this.bD() && !this.be && this.dP().aa().b(dav.c)) {
         js $$0 = this.U();

         for (cii $$2 : this.dP().a(cii.class, this.cK().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dK() && !$$2.p().e() && !$$2.y() && this.k($$2.p())) {
               this.b($$2);
            }
         }
      }

      this.dP().af().c();
   }

   protected js U() {
      return bX;
   }

   protected void b(cii $$0) {
      ctq $$1 = $$0.p();
      ctq $$2 = this.i($$1.s());
      if (!$$2.e()) {
         this.a($$0);
         this.a($$0, $$2.I());
         $$1.h($$2.I());
         if ($$1.e()) {
            $$0.ao();
         }
      }
   }

   public ctq i(ctq $$0) {
      bsd $$1 = h($$0);
      ctq $$2 = this.a($$1);
      boolean $$3 = this.b($$0, $$2);
      if ($$1.f() && !$$3) {
         $$1 = bsd.a;
         $$2 = this.a($$1);
         $$3 = $$2.e();
      }

      if ($$3 && this.j($$0)) {
         double $$4 = (double)this.g($$1);
         if (!$$2.e() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         if ($$1.f() && $$0.I() > 1) {
            ctq $$5 = $$0.c(1);
            this.b($$1, $$5);
            return $$5;
         } else {
            this.b($$1, $$0);
            return $$0;
         }
      } else {
         return ctq.i;
      }
   }

   @Override
   protected void b(bsd $$0, ctq $$1) {
      this.a($$0, $$1);
      this.f($$0);
      this.cg = true;
   }

   public void f(bsd $$0) {
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

   protected boolean b(ctq $$0, ctq $$1) {
      if ($$1.e()) {
         return true;
      } else if ($$0.g() instanceof cvd) {
         if (!($$1.g() instanceof cvd)) {
            return true;
         } else {
            double $$2 = this.o($$0);
            double $$3 = this.o($$1);
            return $$2 != $$3 ? $$2 > $$3 : this.c($$0, $$1);
         }
      } else if ($$0.g() instanceof crt && $$1.g() instanceof crt) {
         return this.c($$0, $$1);
      } else if ($$0.g() instanceof csd && $$1.g() instanceof csd) {
         return this.c($$0, $$1);
      } else if ($$0.g() instanceof crf $$4) {
         if (czc.f($$1)) {
            return false;
         } else if (!($$1.g() instanceof crf)) {
            return true;
         } else {
            crf $$5 = (crf)$$1.g();
            if ($$4.k() != $$5.k()) {
               return $$4.k() > $$5.k();
            } else {
               return $$4.l() != $$5.l() ? $$4.l() > $$5.l() : this.c($$0, $$1);
            }
         }
      } else {
         if ($$0.g() instanceof csf) {
            if ($$1.g() instanceof cro) {
               return true;
            }

            if ($$1.g() instanceof csf) {
               double $$6 = this.o($$0);
               double $$7 = this.o($$1);
               if ($$6 != $$7) {
                  return $$6 > $$7;
               }

               return this.c($$0, $$1);
            }
         }

         return false;
      }
   }

   private double o(ctq $$0) {
      cwl $$1 = $$0.a(kb.m, cwl.a);
      return $$1.a(this.h(bty.c), bsd.a);
   }

   public boolean c(ctq $$0, ctq $$1) {
      return $$0.n() < $$1.n() ? true : p($$0) && !p($$1);
   }

   private static boolean p(ctq $$0) {
      jx $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(kb.d);
   }

   public boolean j(ctq $$0) {
      return true;
   }

   public boolean k(ctq $$0) {
      return this.j($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean V() {
      return this.bR();
   }

   protected boolean W() {
      return false;
   }

   @Override
   public void dB() {
      if (this.dP().ak() == bpt.a && this.W()) {
         this.ao();
      } else if (!this.fV() && !this.V()) {
         brw $$0 = this.dP().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.ak().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.ao();
            }

            int $$4 = this.ak().f().g();
            int $$5 = $$4 * $$4;
            if (this.bf > 600 && this.ah.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.ao();
            } else if ($$1 < (double)$$5) {
               this.bf = 0;
            }
         }
      } else {
         this.bf = 0;
      }
   }

   @Override
   protected final void fq() {
      this.bf++;
      bmk $$0 = this.dP().af();
      $$0.a("sensing");
      this.cb.a();
      $$0.c();
      int $$1 = this.ai + this.al();
      if ($$1 % 2 != 0 && this.ai > 1) {
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
      this.Y();
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
      this.X();
   }

   protected void X() {
      agb.a(this.dP(), this, this.bS);
   }

   protected void Y() {
   }

   public int Z() {
      return 40;
   }

   public int aa() {
      return 75;
   }

   protected void ab() {
      float $$0 = (float)this.aa();
      float $$1 = this.cs();
      float $$2 = ayf.g(this.aY - $$1);
      float $$3 = ayf.a(ayf.g(this.aY - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.n($$4);
   }

   public int ad() {
      return 10;
   }

   public void a(brw $$0, float $$1, float $$2) {
      double $$3 = $$0.du() - this.du();
      double $$4 = $$0.dA() - this.dA();
      double $$6;
      if ($$0 instanceof bsq $$5) {
         $$6 = $$5.dy() - this.dy();
      } else {
         $$6 = ($$0.cK().b + $$0.cK().e) / 2.0 - this.dy();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(ayf.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(ayf.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.s(this.a(this.dH(), $$10, $$2));
      this.r(this.a(this.dF(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ayf.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bsc<? extends bss> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      io $$5 = $$3.d();
      return $$2 == bsu.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dba $$0, bsu $$1) {
      return true;
   }

   public boolean a(dbc $$0) {
      return !$$0.d(this.cK()) && $$0.f(this);
   }

   public int ae() {
      return 4;
   }

   public boolean d(int $$0) {
      return false;
   }

   @Override
   public int cx() {
      if (this.p() == null) {
         return this.u(0.0F);
      } else {
         int $$0 = (int)(this.eA() - this.eR() * 0.33F);
         $$0 -= (3 - this.dP().ak().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.u((float)$$0);
      }
   }

   @Override
   public Iterable<ctq> fa() {
      return this.cc;
   }

   @Override
   public Iterable<ctq> eZ() {
      return this.cd;
   }

   public ctq fQ() {
      return this.ce;
   }

   public boolean fR() {
      return false;
   }

   @Override
   public boolean d(bsd $$0) {
      return true;
   }

   public boolean fS() {
      return !this.a(bsd.g).e();
   }

   public boolean l(ctq $$0) {
      return false;
   }

   public void m(ctq $$0) {
      this.b(bsd.g, $$0);
   }

   @Override
   public Iterable<ctq> fb() {
      return (Iterable<ctq>)(this.ce.e() ? this.cd : Iterables.concat(this.cd, List.of(this.ce)));
   }

   @Override
   public ctq a(bsd $$0) {
      return switch ($$0.a()) {
         case a -> (ctq)this.cc.get($$0.b());
         case b -> (ctq)this.cd.get($$0.b());
         case c -> this.ce;
      };
   }

   @Override
   public void a(bsd $$0, ctq $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cc.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cd.set($$0.b(), $$1), $$1);
            break;
         case c:
            ctq $$2 = this.ce;
            this.ce = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(bqp $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bsd $$3 : bsd.values()) {
         ctq $$4 = this.a($$3);
         float $$5 = this.g($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.e() && !czc.g($$4) && ($$2 || $$6) && Math.max(this.ah.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.l()) {
               $$4.b($$4.o() - this.ah.a(1 + this.ah.a(Math.max($$4.o() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, ctq.i);
         }
      }
   }

   protected float g(bsd $$0) {
      return switch ($$0.a()) {
         case a -> this.bU[$$0.b()];
         case b -> this.bV[$$0.b()];
         case c -> this.bW;
      };
   }

   private epk c(aqn $$0) {
      return new epk.a($$0).a(erz.f, this.dn()).a(erz.a, this).a(ery.h);
   }

   public void a(akn $$0) {
      if (this.dP() instanceof aqn $$1) {
         this.a($$0, this.c($$1));
      }
   }

   protected void a(aym $$0, bpu $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dP().ak() == bpt.d ? 0.1F : 0.25F;
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

         for (bsd $$5 : bsd.values()) {
            if ($$5.a() == bsd.a.b) {
               ctq $$6 = this.a($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.e()) {
                  ctl $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new ctq($$7));
                  }
               }
            }
         }
      }
   }

   @Nullable
   public static ctl a(bsd $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return ctt.py;
            } else if ($$1 == 1) {
               return ctt.pO;
            } else if ($$1 == 2) {
               return ctt.pC;
            } else if ($$1 == 3) {
               return ctt.pG;
            } else if ($$1 == 4) {
               return ctt.pK;
            }
         case e:
            if ($$1 == 0) {
               return ctt.pz;
            } else if ($$1 == 1) {
               return ctt.pP;
            } else if ($$1 == 2) {
               return ctt.pD;
            } else if ($$1 == 3) {
               return ctt.pH;
            } else if ($$1 == 4) {
               return ctt.pL;
            }
         case d:
            if ($$1 == 0) {
               return ctt.pA;
            } else if ($$1 == 1) {
               return ctt.pQ;
            } else if ($$1 == 2) {
               return ctt.pE;
            } else if ($$1 == 3) {
               return ctt.pI;
            } else if ($$1 == 4) {
               return ctt.pM;
            }
         case c:
            if ($$1 == 0) {
               return ctt.pB;
            } else if ($$1 == 1) {
               return ctt.pR;
            } else if ($$1 == 2) {
               return ctt.pF;
            } else if ($$1 == 3) {
               return ctt.pJ;
            } else if ($$1 == 4) {
               return ctt.pN;
            }
         default:
            return null;
      }
   }

   protected void b(aym $$0, bpu $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for (bsd $$3 : bsd.values()) {
         if ($$3.a() == bsd.a.b) {
            this.a($$0, $$2, $$3);
         }
      }
   }

   protected void a(aym $$0, float $$1) {
      if (!this.eX().e() && $$0.i() < 0.25F * $$1) {
         this.a(bsd.a, czc.a(this.dP().J(), $$0, this.eX(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   protected void a(aym $$0, float $$1, bsd $$2) {
      ctq $$3 = this.a($$2);
      if (!$$3.e() && $$0.i() < 0.5F * $$1) {
         this.a($$2, czc.a(this.dP().J(), $$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }
   }

   @Nullable
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      aym $$4 = $$0.E_();
      this.f(bty.k).d(new btw("Random spawn bonus", $$4.a(0.0, 0.11485000000000001), btw.a.b));
      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fT() {
      this.cg = true;
   }

   @Override
   public void a(bsd $$0, float $$1) {
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

   public boolean fU() {
      return this.cf;
   }

   public void a_(boolean $$0) {
      this.cf = $$0;
   }

   @Override
   public boolean f(ctq $$0) {
      bsd $$1 = h($$0);
      return this.a($$1).e() && this.fU();
   }

   public boolean fV() {
      return this.cg;
   }

   @Override
   public final bpw a(cly $$0, bpv $$1) {
      if (!this.bD()) {
         return bpw.d;
      } else if (this.ge() == $$0) {
         this.a(true, !$$0.fP());
         this.a(dvw.r, $$0);
         return bpw.a(this.dP().B);
      } else {
         bpw $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(dvw.r, $$0);
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(dvw.r, $$0);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private bpw c(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      if ($$2.a(ctt.uK) && this.a($$0)) {
         this.b($$0, true);
         $$2.h(1);
         return bpw.a(this.dP().B);
      } else {
         if ($$2.a(ctt.uL)) {
            bpw $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.g() instanceof cux) {
            if (this.dP() instanceof aqn) {
               cux $$4 = (cux)$$2.g();
               Optional<bss> $$5 = $$4.a($$0, this, (bsc<? extends bss>)this.ak(), (aqn)this.dP(), this.dn(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? bpw.a : bpw.d;
            } else {
               return bpw.b;
            }
         } else {
            return bpw.d;
         }
      }
   }

   protected void a(cly $$0, bss $$1) {
   }

   protected bpw b(cly $$0, bpv $$1) {
      return bpw.d;
   }

   public boolean fW() {
      return this.a(this.dp());
   }

   public boolean a(io $$0) {
      return this.co == -1.0F ? true : this.cn.j($$0) < (double)(this.co * this.co);
   }

   public void a(io $$0, int $$1) {
      this.cn = $$0;
      this.co = (float)$$1;
   }

   public io fX() {
      return this.cn;
   }

   public float fY() {
      return this.co;
   }

   public void fZ() {
      this.co = -1.0F;
   }

   public boolean ga() {
      return this.co != -1.0F;
   }

   @Nullable
   public <T extends bss> T a(bsc<T> $$0, boolean $$1) {
      if (this.dK()) {
         return null;
      } else {
         T $$2 = (T)$$0.a(this.dP());
         if ($$2 == null) {
            return null;
         } else {
            $$2.v(this);
            $$2.a(this.p_());
            $$2.t(this.gf());
            if (this.ag()) {
               $$2.b(this.ah());
               $$2.o(this.cE());
            }

            if (this.fV()) {
               $$2.fT();
            }

            $$2.n(this.cu());
            if ($$1) {
               $$2.a_(this.fU());

               for (bsd $$3 : bsd.values()) {
                  ctq $$4 = this.a($$3);
                  if (!$$4.e()) {
                     $$2.a($$3, $$4.f());
                     $$2.a($$3, this.g($$3));
                  }
               }
            }

            this.dP().b($$2);
            if (this.bR()) {
               brw $$5 = this.dc();
               this.ac();
               $$2.a($$5, true);
            }

            this.ao();
            return $$2;
         }
      }
   }

   protected void gb() {
      if (this.cm != null) {
         this.gl();
      }

      if (this.ck != null) {
         if (!this.bD() || !this.ck.bD()) {
            this.a(true, true);
         }
      }
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.ck != null) {
         this.ck = null;
         this.cm = null;
         this.fZ();
         if (!this.dP().B && $$1) {
            this.a(ctt.uK);
         }

         if (!this.dP().B && $$0 && this.dP() instanceof aqn) {
            ((aqn)this.dP()).l().b(this, new aew(this, null));
         }
      }
   }

   public boolean a(cly $$0) {
      return !this.gc() && !(this instanceof ciw);
   }

   public boolean gc() {
      return this.ck != null;
   }

   public boolean gd() {
      return this.gc() || this.cm != null;
   }

   @Nullable
   public brw ge() {
      if (this.ck == null && this.cl != 0 && this.dP().B) {
         this.ck = this.dP().a(this.cl);
      }

      return this.ck;
   }

   public void b(brw $$0, boolean $$1) {
      this.ck = $$0;
      this.cm = null;
      if (!this.dP().B && $$1 && this.dP() instanceof aqn) {
         ((aqn)this.dP()).l().b(this, new aew(this, this.ck));
      }

      if (this.bR()) {
         this.ac();
      }
   }

   public void s(int $$0) {
      this.cl = $$0;
      this.a(false, false);
   }

   @Override
   public boolean a(brw $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.gc()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void gl() {
      if (this.cm != null && this.dP() instanceof aqn $$0) {
         Optional<UUID> $$1 = this.cm.left();
         Optional<io> $$2 = this.cm.right();
         if ($$1.isPresent()) {
            brw $$3 = $$0.a($$1.get());
            if ($$3 != null) {
               this.b($$3, true);
               return;
            }
         } else if ($$2.isPresent()) {
            this.b(cic.b(this.dP(), $$2.get()), true);
            return;
         }

         if (this.ai > 100) {
            this.a(ctt.uK);
            this.cm = null;
         }
      }
   }

   @Override
   public boolean db() {
      return super.db() && !this.gf();
   }

   public void t(boolean $$0) {
      byte $$1 = this.ao.a(b);
      this.ao.a(b, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void u(boolean $$0) {
      byte $$1 = this.ao.a(b);
      this.ao.a(b, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void v(boolean $$0) {
      byte $$1 = this.ao.a(b);
      this.ao.a(b, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean gf() {
      return (this.ao.a(b) & 1) != 0;
   }

   public boolean gg() {
      return (this.ao.a(b) & 2) != 0;
   }

   public boolean gh() {
      return (this.ao.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bsk fu() {
      return this.gg() ? bsk.a : bsk.b;
   }

   public boolean i(bsq $$0) {
      return this.gi().c($$0.eK());
   }

   protected euh gi() {
      brw $$0 = this.dc();
      euh $$3;
      if ($$0 != null) {
         euh $$1 = $$0.cK();
         euh $$2 = this.cK();
         $$3 = new euh(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cK();
      }

      return $$3.c(bY, 0.0, bY);
   }

   @Override
   public boolean C(brw $$0) {
      float $$1 = (float)this.g(bty.c);
      float $$2 = (float)this.g(bty.d);
      if ($$0 instanceof bsq) {
         $$1 += czc.a(this.eX(), $$0.ak());
         $$2 += (float)czc.c(this);
      }

      int $$3 = czc.d(this);
      if ($$3 > 0) {
         $$0.g($$3 * 4);
      }

      boolean $$4 = $$0.a(this.dQ().b((bsq)this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof bsq) {
            ((bsq)$$0).q((double)($$2 * 0.5F), (double)ayf.a(this.dF() * (float) (Math.PI / 180.0)), (double)(-ayf.b(this.dF() * (float) (Math.PI / 180.0))));
            this.g(this.ds().d(0.6, 1.0, 0.6));
         }

         this.a(this, $$0);
         this.A($$0);
      }

      return $$4;
   }

   protected boolean gj() {
      if (this.dP().Q() && !this.dP().B) {
         float $$0 = this.bt();
         io $$1 = io.a(this.du(), this.dy(), this.dA());
         boolean $$2 = this.bg() || this.aB || this.aC;
         if ($$0 > 0.5F && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dP().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(awm<emv> $$0) {
      if (this.K().p()) {
         super.c($$0);
      } else {
         this.g(this.ds().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gk() {
      this.c($$0 -> true);
      this.dS().h();
   }

   public void c(Predicate<bzo> $$0) {
      this.bS.a($$0);
   }

   @Override
   protected void cv() {
      super.cv();
      this.a(true, false);
      this.fc().forEach($$0 -> {
         if (!$$0.e()) {
            $$0.e(0);
         }
      });
   }

   @Nullable
   @Override
   public ctq dC() {
      cux $$0 = cux.a(this.ak());
      return $$0 == null ? null : new ctq($$0);
   }
}

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class bwa extends bvy implements bvm, bvw, bww {
   private static final Logger a = LogUtils.getLogger();
   private static final ajx<Byte> b = akb.a(bwa.class, ajz.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int bE = 4;
   protected static final int h = 1;
   private static final km bF = new km(1, 0, 1);
   private static final List<bvj> bG = List.of(bvj.f, bvj.e, bvj.d, bvj.c);
   public static final float i = 0.15F;
   public static final float j = 0.55F;
   public static final float k = 0.5F;
   public static final float bt = 0.25F;
   public static final int bu = 2;
   private static final double bH = Math.sqrt(2.04F) - 0.6F;
   protected static final aku bv = aku.b("random_spawn_bonus");
   public int bw;
   protected int bx;
   protected cby by;
   protected cbz bz;
   protected cbx bA;
   private final cbu bI;
   protected cfk bB;
   protected final ccx bC;
   protected final ccx bD;
   @Nullable
   private bvy bJ;
   private final cgh bK;
   private final ka<cxh> bL = ka.a(2, cxh.k);
   private final ka<cxh> bM = ka.a(4, cxh.k);
   private cxh bN = cxh.k;
   private buy bO = buy.d;
   private boolean bP;
   private boolean bQ;
   private final Map<eun, Float> bR = Maps.newEnumMap(eun.class);
   private Optional<akt<ewt>> bS = Optional.empty();
   private long bT;
   @Nullable
   private bvw.a bU;
   private ji bV = ji.c;
   private float bW = -1.0F;

   protected bwa(bvi<? extends bwa> $$0, dgz $$1) {
      super($$0, $$1);
      this.bC = new ccx();
      this.bD = new ccx();
      this.by = new cby(this);
      this.bz = new cbz(this);
      this.bA = new cbx(this);
      this.bI = this.I();
      this.bB = this.b($$1);
      this.bK = new cgh(this);
      if ($$1 instanceof ard) {
         this.D();
      }
   }

   @Override
   protected void D() {
   }

   public static bxf.a E() {
      return bvy.ec().a(bxg.m, 16.0);
   }

   protected cfk b(dgz $$0) {
      return new cfj(this, $$0);
   }

   protected boolean F() {
      return false;
   }

   public float a(eun $$0) {
      bwa $$2;
      label17: {
         if (this.dk() instanceof bwa $$1 && $$1.F()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.bR.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(eun $$0, float $$1) {
      this.bR.put($$0, $$1);
   }

   @Override
   public void G() {
   }

   @Override
   public void H() {
   }

   protected cbu I() {
      return new cbu(this);
   }

   public cby J() {
      return this.by;
   }

   public cbz L() {
      return this.dk() instanceof bwa $$0 ? $$0.L() : this.bz;
   }

   public cbx N() {
      return this.bA;
   }

   public cfk O() {
      return this.dk() instanceof bwa $$0 ? $$0.O() : this.bB;
   }

   @Nullable
   @Override
   public bvy cV() {
      bva $$0 = this.cY();
      if (!this.gh() && $$0 instanceof bwa $$1 && $$0.cb()) {
         return $$1;
      }

      return null;
   }

   public cgh P() {
      return this.bK;
   }

   @Nullable
   @Override
   public bvy f() {
      return this.bJ;
   }

   @Nullable
   protected final bvy Q() {
      return this.ea().c(cfc.o).orElse(null);
   }

   public void h(@Nullable bvy $$0) {
      this.bJ = $$0;
   }

   @Override
   public boolean a(bvi<?> $$0) {
      return $$0 != bvi.ad;
   }

   public boolean a(cyc $$0) {
      return false;
   }

   public void R() {
      this.a(ecp.m);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   public int S() {
      return 80;
   }

   public void T() {
      this.b(this.u());
   }

   @Override
   public void az() {
      super.az();
      bpj $$0 = bpi.a();
      $$0.a("mobBaseTick");
      if (this.bJ() && this.ae.a(1000) < this.bw++) {
         this.q();
         this.T();
      }

      $$0.c();
   }

   @Override
   protected void h(btp $$0) {
      this.q();
      super.h($$0);
   }

   private void q() {
      this.bw = -this.S();
   }

   @Override
   protected int e(ard $$0) {
      if (this.bx > 0) {
         int $$1 = this.bx;

         for (bvj $$2 : bvj.i) {
            cxh $$3 = this.a($$2);
            if (!$$3.f() && this.bO.b($$2) <= 1.0F) {
               $$1 += 1 + this.ae.a(3);
            }
         }

         return $$1;
      } else {
         return this.bx;
      }
   }

   public void U() {
      if (this.dU().C) {
         this.eW();
      } else {
         this.dU().a(this, (byte)20);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 20) {
         this.U();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void h() {
      super.h();
      if (!this.dU().C && this.af % 5 == 0) {
         this.V();
      }
   }

   protected void V() {
      boolean $$0 = !(this.cV() instanceof bwa);
      boolean $$1 = !(this.dj() instanceof cro);
      this.bC.a(ccw.a.a, $$0);
      this.bC.a(ccw.a.c, $$0 && $$1);
      this.bC.a(ccw.a.b, $$0);
   }

   @Override
   protected void D(float $$0) {
      this.bI.a();
   }

   @Nullable
   protected avz u() {
      return null;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fP());
      $$0.a("PersistenceRequired", this.bQ);
      tw $$1 = new tw();

      for (cxh $$2 : this.bM) {
         if (!$$2.f()) {
            $$1.add($$2.a(this.dW()));
         } else {
            $$1.add(new tq());
         }
      }

      $$0.a("ArmorItems", $$1);
      if (!this.bO.equals(buy.d)) {
         $$0.a("drop_chances", (un)buy.e.encodeStart(ue.a, this.bO).getOrThrow());
      }

      tw $$3 = new tw();

      for (cxh $$4 : this.bL) {
         if (!$$4.f()) {
            $$3.add($$4.a(this.dW()));
         } else {
            $$3.add(new tq());
         }
      }

      $$0.a("HandItems", $$3);
      if (!this.bN.f()) {
         $$0.a("body_armor_item", this.bN.a(this.dW()));
      }

      this.a($$0, this.bU);
      $$0.a("LeftHanded", this.gi());
      if (this.bS.isPresent()) {
         $$0.a("DeathLootTable", this.bS.get().a().toString());
      }

      if (this.bT != 0L) {
         $$0.a("DeathLootTableSeed", this.bT);
      }

      if (this.gh()) {
         $$0.a("NoAI", this.gh());
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a_($$0.q("CanPickUpLoot"));
      this.bQ = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         tw $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bM.size(); $$2++) {
            tq $$3 = $$1.a($$2);
            this.bM.set($$2, cxh.a(this.dW(), $$3));
         }
      } else {
         Collections.fill(this.bM, cxh.k);
      }

      if ($$0.e("drop_chances")) {
         buy.e
            .parse(ue.a, $$0.c("drop_chances"))
            .resultOrPartial($$0x -> a.warn("Failed to parse mob drop chances: {}", $$0x))
            .ifPresent($$0x -> this.bO = $$0x);
      } else {
         this.bO = buy.d;
      }

      if ($$0.b("HandItems", 9)) {
         tw $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.bL.size(); $$5++) {
            tq $$6 = $$4.a($$5);
            this.bL.set($$5, cxh.a(this.dW(), $$6));
         }
      } else {
         Collections.fill(this.bL, cxh.k);
      }

      if ($$0.b("body_armor_item", 10)) {
         this.bN = cxh.a(this.dW(), (un)$$0.p("body_armor_item")).orElse(cxh.k);
      } else {
         this.bN = cxh.k;
      }

      this.c($$0);
      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.bS = Optional.of(akt.a(mc.bi, aku.a($$0.l("DeathLootTable"))));
      } else {
         this.bS = Optional.empty();
      }

      this.bT = $$0.i("DeathLootTableSeed");
      this.t($$0.q("NoAI"));
   }

   @Override
   protected void b(ard $$0, btp $$1, boolean $$2) {
      super.b($$0, $$1, $$2);
      this.bS = Optional.empty();
   }

   @Override
   public final Optional<akt<ewt>> dZ() {
      return this.bS.isPresent() ? this.bS : super.dZ();
   }

   @Override
   public long eH() {
      return this.bT;
   }

   public void H(float $$0) {
      this.bi = $$0;
   }

   public void I(float $$0) {
      this.bh = $$0;
   }

   public void J(float $$0) {
      this.bg = $$0;
   }

   @Override
   public void C(float $$0) {
      super.C($$0);
      this.H($$0);
   }

   public void W() {
      this.O().m();
      this.J(0.0F);
      this.I(0.0F);
      this.C(0.0F);
   }

   @Override
   public void k_() {
      super.k_();
      bpj $$0 = bpi.a();
      $$0.a("looting");
      if (this.dU() instanceof ard $$1 && this.fP() && this.bJ() && !this.bc && $$1.O().b(dgv.c)) {
         km $$2 = this.X();

         for (clw $$4 : this.dU().a(clw.class, this.cQ().c((double)$$2.u(), (double)$$2.v(), (double)$$2.w()))) {
            if (!$$4.dP() && !$$4.f().f() && !$$4.o() && this.c($$1, $$4.f())) {
               this.a($$1, $$4);
            }
         }
      }

      $$0.c();
   }

   protected km X() {
      return bF;
   }

   protected void a(ard $$0, clw $$1) {
      cxh $$2 = $$1.f();
      cxh $$3 = this.b($$0, $$2.v());
      if (!$$3.f()) {
         this.a($$1);
         this.a($$1, $$3.M());
         $$2.h($$3.M());
         if ($$2.f()) {
            $$1.at();
         }
      }
   }

   public cxh b(ard $$0, cxh $$1) {
      bvj $$2 = this.f($$1);
      cxh $$3 = this.a($$2);
      boolean $$4 = this.a($$1, $$3, $$2);
      if ($$2.f() && !$$4) {
         $$2 = bvj.a;
         $$3 = this.a($$2);
         $$4 = $$3.f();
      }

      if ($$4 && this.g($$1)) {
         double $$5 = (double)this.bO.b($$2);
         if (!$$3.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$5) {
            this.a($$0, $$3);
         }

         cxh $$6 = $$2.a($$1);
         this.b($$2, $$6);
         return $$6;
      } else {
         return cxh.k;
      }
   }

   @Override
   protected void b(bvj $$0, cxh $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.bQ = true;
   }

   public void g(bvj $$0) {
      this.bO = this.bO.a($$0);
   }

   protected boolean a(cxh $$0, cxh $$1, bvj $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$2.f()) {
         return this.b($$0, $$1, $$2);
      } else {
         return $$2 == bvj.a ? this.c($$0, $$1, $$2) : false;
      }
   }

   private boolean b(cxh $$0, cxh $$1, bvj $$2) {
      if (ddt.a($$1, dds.E)) {
         return false;
      } else {
         double $$3 = this.a($$0, bxg.a, $$2);
         double $$4 = this.a($$1, bxg.a, $$2);
         double $$5 = this.a($$0, bxg.b, $$2);
         double $$6 = this.a($$1, bxg.b, $$2);
         if ($$3 != $$4) {
            return $$3 > $$4;
         } else {
            return $$5 != $$6 ? $$5 > $$6 : this.b($$0, $$1);
         }
      }
   }

   private boolean c(cxh $$0, cxh $$1, bvj $$2) {
      axf<cxd> $$3 = this.Y();
      if ($$3 != null) {
         if ($$1.a($$3) && !$$0.a($$3)) {
            return false;
         }

         if (!$$1.a($$3) && $$0.a($$3)) {
            return true;
         }
      }

      double $$4 = this.a($$0, bxg.c, $$2);
      double $$5 = this.a($$1, bxg.c, $$2);
      return $$4 != $$5 ? $$4 > $$5 : this.b($$0, $$1);
   }

   private double a(cxh $$0, jr<bxb> $$1, bvj $$2) {
      double $$3 = this.eY().b($$1) ? this.i($$1) : 0.0;
      czw $$4 = $$0.a(kv.o, czw.a);
      return $$4.a($$3, $$2);
   }

   public boolean b(cxh $$0, cxh $$1) {
      Set<Entry<jr<ddr>>> $$2 = $$1.a(kv.l, ddx.a).b();
      Set<Entry<jr<ddr>>> $$3 = $$0.a(kv.l, ddx.a).b();
      if ($$3.size() != $$2.size()) {
         return $$3.size() > $$2.size();
      } else {
         int $$4 = $$0.o();
         int $$5 = $$1.o();
         return $$4 != $$5 ? $$4 < $$5 : $$0.b(kv.g) && !$$1.b(kv.g);
      }
   }

   public boolean g(cxh $$0) {
      return true;
   }

   public boolean c(ard $$0, cxh $$1) {
      return this.g($$1);
   }

   @Nullable
   public axf<cxd> Y() {
      return null;
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean Z() {
      return this.bY();
   }

   protected boolean aa() {
      return false;
   }

   @Override
   public void dG() {
      if (this.dU().an() == bsv.a && this.aa()) {
         this.at();
      } else if (!this.gb() && !this.Z()) {
         bva $$0 = this.dU().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.aq().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.at();
            }

            int $$4 = this.aq().f().g();
            int $$5 = $$4 * $$4;
            if (this.bd > 600 && this.ae.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.at();
            } else if ($$1 < (double)$$5) {
               this.bd = 0;
            }
         }
      } else {
         this.bd = 0;
      }
   }

   @Override
   protected final void fw() {
      this.bd++;
      bpj $$0 = bpi.a();
      $$0.a("sensing");
      this.bK.a();
      $$0.c();
      int $$1 = this.af + this.ar();
      if ($$1 % 2 != 0 && this.af > 1) {
         $$0.a("targetSelector");
         this.bD.a(false);
         $$0.c();
         $$0.a("goalSelector");
         this.bC.a(false);
         $$0.c();
      } else {
         $$0.a("targetSelector");
         this.bD.a();
         $$0.c();
         $$0.a("goalSelector");
         this.bC.a();
         $$0.c();
      }

      $$0.a("navigation");
      this.bB.c();
      $$0.c();
      $$0.a("mob tick");
      this.a((ard)this.dU());
      $$0.c();
      $$0.a("controls");
      $$0.a("move");
      this.bz.a();
      $$0.b("look");
      this.by.a();
      $$0.b("jump");
      this.bA.b();
      $$0.c();
      $$0.c();
      this.ab();
   }

   protected void ab() {
      agc.a(this.dU(), this, this.bC);
   }

   protected void a(ard $$0) {
   }

   public int ac() {
      return 40;
   }

   public int ad() {
      return 75;
   }

   protected void af() {
      float $$0 = (float)this.ad();
      float $$1 = this.cz();
      float $$2 = ayz.h(this.aV - $$1);
      float $$3 = ayz.a(ayz.h(this.aV - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.r($$4);
   }

   public int ag() {
      return 10;
   }

   public void a(bva $$0, float $$1, float $$2) {
      double $$3 = $$0.dz() - this.dz();
      double $$4 = $$0.dF() - this.dF();
      double $$6;
      if ($$0 instanceof bvy $$5) {
         $$6 = $$5.dD() - this.dD();
      } else {
         $$6 = ($$0.cQ().b + $$0.cQ().e) / 2.0 - this.dD();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(ayz.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(ayz.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.x(this.a(this.dM(), $$10, $$2));
      this.w(this.a(this.dK(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ayz.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bvi<? extends bwa> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      ji $$5 = $$3.e();
      return bvh.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dha $$0, bvh $$1) {
      return true;
   }

   public boolean a(dhc $$0) {
      return !$$0.d(this.cQ()) && $$0.f(this);
   }

   public int ai() {
      return 4;
   }

   public boolean q(int $$0) {
      return false;
   }

   @Override
   public int cD() {
      if (this.f() == null) {
         return this.y(0.0F);
      } else {
         int $$0 = (int)(this.eE() - this.eS() * 0.33F);
         $$0 -= (3 - this.dU().an().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.y((float)$$0);
      }
   }

   @Override
   public Iterable<cxh> fc() {
      return this.bL;
   }

   @Override
   public Iterable<cxh> fb() {
      return this.bM;
   }

   public cxh aj() {
      return this.bN;
   }

   @Override
   public boolean e(bvj $$0) {
      return $$0 != bvj.g;
   }

   public boolean ak() {
      return !this.a(bvj.g).f();
   }

   public void h(cxh $$0) {
      this.b(bvj.g, $$0);
   }

   @Override
   public Iterable<cxh> fd() {
      return (Iterable<cxh>)(this.bN.f() ? this.bM : Iterables.concat(this.bM, List.of(this.bN)));
   }

   @Override
   public cxh a(bvj $$0) {
      return switch ($$0.a()) {
         case a -> (cxh)this.bL.get($$0.b());
         case b -> (cxh)this.bM.get($$0.b());
         case c -> this.bN;
      };
   }

   @Override
   public void a(bvj $$0, cxh $$1) {
      this.c($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.bL.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.bM.set($$0.b(), $$1), $$1);
            break;
         case c:
            cxh $$2 = this.bN;
            this.bN = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(ard $$0, btp $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bvj $$3 : bvj.i) {
         cxh $$4 = this.a($$3);
         float $$5 = this.bO.b($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = this.bO.c($$3);
            bva var11 = $$1.d();
            if (var11 instanceof bvy) {
               bvy $$7 = (bvy)var11;
               if (this.dU() instanceof ard $$8) {
                  $$5 = ddt.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !ddt.a($$4, dds.D) && ($$2 || $$6) && this.ae.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.ae.a(1 + this.ae.a(Math.max($$4.p() - 3, 1))));
               }

               this.a($$0, $$4);
               this.a($$3, cxh.k);
            }
         }
      }
   }

   public buy fZ() {
      return this.bO;
   }

   public void b(ard $$0) {
      this.a($$0, $$0x -> true);
   }

   public Set<bvj> a(ard $$0, Predicate<cxh> $$1) {
      Set<bvj> $$2 = new HashSet<>();

      for (bvj $$3 : bvj.i) {
         cxh $$4 = this.a($$3);
         if (!$$4.f()) {
            if (!$$1.test($$4)) {
               $$2.add($$3);
            } else if (this.bO.c($$3)) {
               this.a($$3, cxh.k);
               this.a($$0, $$4);
            }
         }
      }

      return $$2;
   }

   private ewr g(ard $$0) {
      return new ewr.a($$0).a(ezi.f, this.ds()).a(ezi.a, this).a(ezh.h);
   }

   public void a(bvl $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(akt<ewt> $$0, Map<bvj, Float> $$1) {
      if (this.dU() instanceof ard $$2) {
         this.a($$0, this.g($$2), $$1);
      }
   }

   protected void a(azh $$0, bsw $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dU().an() == bsv.d ? 0.1F : 0.25F;
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

         for (bvj $$5 : bG) {
            cxh $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               cxd $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new cxh($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static cxd a(bvj $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cxl.qf;
            } else if ($$1 == 1) {
               return cxl.qv;
            } else if ($$1 == 2) {
               return cxl.qj;
            } else if ($$1 == 3) {
               return cxl.qn;
            } else if ($$1 == 4) {
               return cxl.qr;
            }
         case e:
            if ($$1 == 0) {
               return cxl.qg;
            } else if ($$1 == 1) {
               return cxl.qw;
            } else if ($$1 == 2) {
               return cxl.qk;
            } else if ($$1 == 3) {
               return cxl.qo;
            } else if ($$1 == 4) {
               return cxl.qs;
            }
         case d:
            if ($$1 == 0) {
               return cxl.qh;
            } else if ($$1 == 1) {
               return cxl.qx;
            } else if ($$1 == 2) {
               return cxl.ql;
            } else if ($$1 == 3) {
               return cxl.qp;
            } else if ($$1 == 4) {
               return cxl.qt;
            }
         case c:
            if ($$1 == 0) {
               return cxl.qi;
            } else if ($$1 == 1) {
               return cxl.qy;
            } else if ($$1 == 2) {
               return cxl.qm;
            } else if ($$1 == 3) {
               return cxl.qq;
            } else if ($$1 == 4) {
               return cxl.qu;
            }
         default:
            return null;
      }
   }

   protected void a(dhq $$0, azh $$1, bsw $$2) {
      this.b($$0, $$1, $$2);

      for (bvj $$3 : bvj.i) {
         if ($$3.a() == bvj.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dhq $$0, azh $$1, bsw $$2) {
      this.a($$0, bvj.a, $$1, 0.25F, $$2);
   }

   protected void a(dhq $$0, azh $$1, bvj $$2, bsw $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dhq $$0, bvj $$1, azh $$2, float $$3, bsw $$4) {
      cxh $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         ddt.a($$5, $$0.F_(), dff.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      azh $$4 = $$0.C_();
      bxc $$5 = Objects.requireNonNull(this.g(bxg.m));
      if (!$$5.b(bv)) {
         $$5.d(new bxe(bv, $$4.a(0.0, 0.11485000000000001), bxe.a.b));
      }

      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void ga() {
      this.bQ = true;
   }

   @Override
   public void a(bvj $$0, float $$1) {
      this.bO = this.bO.a($$0, $$1);
   }

   @Override
   public boolean fP() {
      return this.bP;
   }

   public void a_(boolean $$0) {
      this.bP = $$0;
   }

   @Override
   protected boolean f(bvj $$0) {
      return this.fP();
   }

   public boolean gb() {
      return this.bQ;
   }

   @Override
   public final bsy a(cpr $$0, bsx $$1) {
      if (!this.bJ()) {
         return bsy.e;
      } else {
         bsy $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(ecp.r, $$0);
            return $$2;
         } else {
            bsy $$3 = super.a($$0, $$1);
            if ($$3 != bsy.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(ecp.r, $$0);
                  return $$2;
               } else {
                  return bsy.e;
               }
            }
         }
      }
   }

   private bsy c(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if ($$2.a(cxl.vN)) {
         bsy $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof cyp) {
         if (this.dU() instanceof ard) {
            cyp $$4 = (cyp)$$2.h();
            Optional<bwa> $$5 = $$4.a($$0, this, (bvi<? extends bwa>)this.aq(), (ard)this.dU(), this.ds(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return bsy.e;
            }
         }

         return bsy.b;
      } else {
         return bsy.e;
      }
   }

   protected void a(cpr $$0, bwa $$1) {
   }

   protected bsy b(cpr $$0, bsx $$1) {
      return bsy.e;
   }

   public boolean gc() {
      return this.a(this.du());
   }

   public boolean a(ji $$0) {
      return this.bW == -1.0F ? true : this.bV.j($$0) < (double)(this.bW * this.bW);
   }

   public void a(ji $$0, int $$1) {
      this.bV = $$0;
      this.bW = (float)$$1;
   }

   public ji gd() {
      return this.bV;
   }

   public float ge() {
      return this.bW;
   }

   public void gf() {
      this.bW = -1.0F;
   }

   public boolean gg() {
      return this.bW != -1.0F;
   }

   @Nullable
   public <T extends bwa> T a(bvi<T> $$0, buu $$1, bvh $$2, buu.a<T> $$3) {
      if (this.dP()) {
         return null;
      } else {
         T $$4 = (T)$$0.a(this.dU(), $$2);
         if ($$4 == null) {
            return null;
         } else {
            $$1.a().a(this, $$4, $$1);
            $$3.finalizeConversion($$4);
            if (this.dU() instanceof ard $$5) {
               $$5.b($$4);
            }

            if ($$1.a().a()) {
               this.at();
            }

            return $$4;
         }
      }
   }

   @Nullable
   public <T extends bwa> T a(bvi<T> $$0, buu $$1, buu.a<T> $$2) {
      return this.a($$0, $$1, bvh.i, $$2);
   }

   @Nullable
   @Override
   public bvw.a T_() {
      return this.bU;
   }

   @Override
   public void a(@Nullable bvw.a $$0) {
      this.bU = $$0;
   }

   @Override
   public void A() {
      if (this.T_() == null) {
         this.gf();
      }
   }

   @Override
   public void B() {
      bvw.super.B();
      this.bC.a(ccw.a.a);
   }

   @Override
   public boolean w() {
      return !(this instanceof cmk);
   }

   @Override
   public boolean a(bva $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.O_()) {
         this.y();
      }

      return $$2;
   }

   @Override
   public boolean dh() {
      return super.dh() && !this.gh();
   }

   @Override
   public boolean di() {
      return super.di() && !this.gh();
   }

   public void t(boolean $$0) {
      byte $$1 = this.al.a(b);
      this.al.a(b, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void u(boolean $$0) {
      byte $$1 = this.al.a(b);
      this.al.a(b, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void v(boolean $$0) {
      byte $$1 = this.al.a(b);
      this.al.a(b, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean gh() {
      return (this.al.a(b) & 1) != 0;
   }

   public boolean gi() {
      return (this.al.a(b) & 2) != 0;
   }

   public boolean gj() {
      return (this.al.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bvr fA() {
      return this.gi() ? bvr.a : bvr.b;
   }

   public boolean i(bvy $$0) {
      return this.gk().c($$0.eL());
   }

   protected fbs gk() {
      bva $$0 = this.dj();
      fbs $$3;
      if ($$0 != null) {
         fbs $$1 = $$0.cQ();
         fbs $$2 = this.cQ();
         $$3 = new fbs(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cQ();
      }

      return $$3.c(bH, 0.0, bH);
   }

   @Override
   public boolean c(ard $$0, bva $$1) {
      float $$2 = (float)this.h(bxg.c);
      cxh $$3 = this.dY();
      btp $$4 = Optional.ofNullable($$3.h().a(this)).orElse(this.dV().b((bvy)this));
      $$2 = ddt.a($$0, $$3, $$1, $$4, $$2);
      $$2 += $$3.h().a($$1, $$2, $$4);
      boolean $$5 = $$1.a($$0, $$4, $$2);
      if ($$5) {
         float $$6 = this.b($$1, $$4);
         if ($$6 > 0.0F && $$1 instanceof bvy $$7) {
            $$7.p((double)($$6 * 0.5F), (double)ayz.a(this.dK() * (float) (Math.PI / 180.0)), (double)(-ayz.b(this.dK() * (float) (Math.PI / 180.0))));
            this.i(this.dx().d(0.6, 1.0, 0.6));
         }

         if ($$1 instanceof bvy $$8) {
            $$3.a($$8, this);
         }

         ddt.a($$0, $$1, $$4);
         this.B($$1);
         this.gl();
      }

      return $$5;
   }

   protected void gl() {
   }

   protected boolean gm() {
      if (this.dU().V() && !this.dU().C) {
         float $$0 = this.bw();
         ji $$1 = ji.a(this.dz(), this.dD(), this.dF());
         boolean $$2 = this.bk() || this.av || this.aw;
         if ($$0 > 0.5F && this.ae.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dU().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(axf<etv> $$0) {
      if (this.O().o()) {
         super.c($$0);
      } else {
         this.i(this.dx().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gn() {
      this.c($$0 -> true);
      this.ea().h();
   }

   public void c(Predicate<ccw> $$0) {
      this.bC.a($$0);
   }

   @Override
   protected void cC() {
      super.cC();
      this.fe().forEach($$0 -> {
         if (!$$0.f()) {
            $$0.e(0);
         }
      });
   }

   @Nullable
   @Override
   public cxh dH() {
      cyp $$0 = cyp.a(this.aq());
      return $$0 == null ? null : new cxh($$0);
   }

   @Override
   protected void f(jr<bxb> $$0) {
      super.f($$0);
      if ($$0.a(bxg.m) || $$0.a(bxg.E)) {
         this.O().e();
      }
   }
}

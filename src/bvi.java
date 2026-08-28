import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bvi extends bvg implements buv, bve, bwe {
   private static final ajx<Byte> a = akb.a(bvi.class, ajz.a);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   protected static final int h = 1;
   private static final km bX = new km(1, 0, 1);
   private static final List<bus> bY = List.of(bus.f, bus.e, bus.d, bus.c);
   public static final float i = 0.15F;
   public static final float j = 0.55F;
   public static final float k = 0.5F;
   public static final float bG = 0.25F;
   public static final float bH = 0.085F;
   public static final float bI = 1.0F;
   public static final int bJ = 2;
   public static final int bK = 2;
   private static final double bZ = Math.sqrt(2.04F) - 0.6F;
   protected static final aku bL = aku.b("random_spawn_bonus");
   public int bM;
   protected int bN;
   protected cbg bO;
   protected cbh bP;
   protected cbf bQ;
   private final cbc ca;
   protected ces bR;
   protected final ccf bS;
   protected final ccf bT;
   @Nullable
   private bvg cb;
   private final cfp cc;
   private final ka<cwp> cd = ka.a(2, cwp.j);
   protected final float[] bU = new float[2];
   private final ka<cwp> ce = ka.a(4, cwp.j);
   protected final float[] bV = new float[4];
   private cwp cf = cwp.j;
   protected float bW;
   private boolean cg;
   private boolean ch;
   private final Map<etq, Float> ci = Maps.newEnumMap(etq.class);
   private Optional<akt<evw>> cj = Optional.empty();
   private long ck;
   @Nullable
   private bve.a cl;
   private ji cm = ji.c;
   private float cn = -1.0F;

   protected bvi(bur<? extends bvi> $$0, dgi $$1) {
      super($$0, $$1);
      this.bS = new ccf();
      this.bT = new ccf();
      this.bO = new cbg(this);
      this.bP = new cbh(this);
      this.bQ = new cbf(this);
      this.ca = this.G();
      this.bR = this.b($$1);
      this.cc = new cfp(this);
      Arrays.fill(this.bV, 0.085F);
      Arrays.fill(this.bU, 0.085F);
      this.bW = 0.085F;
      if ($$1 instanceof arc) {
         this.B();
      }
   }

   @Override
   protected void B() {
   }

   public static bwn.a C() {
      return bvg.ee().a(bwo.m, 16.0);
   }

   protected ces b(dgi $$0) {
      return new cer(this, $$0);
   }

   protected boolean D() {
      return false;
   }

   public float a(etq $$0) {
      bvi $$2;
      label17: {
         if (this.dm() instanceof bvi $$1 && $$1.D()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.ci.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(etq $$0, float $$1) {
      this.ci.put($$0, $$1);
   }

   @Override
   public void E() {
   }

   @Override
   public void F() {
   }

   protected cbc G() {
      return new cbc(this);
   }

   public cbg H() {
      return this.bO;
   }

   public cbh I() {
      return this.dm() instanceof bvi $$0 ? $$0.I() : this.bP;
   }

   public cbf J() {
      return this.bQ;
   }

   public ces L() {
      return this.dm() instanceof bvi $$0 ? $$0.L() : this.bR;
   }

   @Nullable
   @Override
   public bvg cX() {
      buk $$0 = this.da();
      if (!this.gc() && $$0 instanceof bvi $$1 && $$0.cc()) {
         return $$1;
      }

      return null;
   }

   public cfp N() {
      return this.cc;
   }

   @Nullable
   @Override
   public bvg O_() {
      return this.cb;
   }

   @Nullable
   protected final bvg O() {
      return this.ec().c(cek.o).orElse(null);
   }

   public void h(@Nullable bvg $$0) {
      this.cb = $$0;
   }

   @Override
   public boolean a(bur<?> $$0) {
      return $$0 != bur.ae;
   }

   public boolean a(cxl $$0) {
      return false;
   }

   public void P() {
      this.a(ebt.m);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   public int Q() {
      return 80;
   }

   public void R() {
      this.b(this.u());
   }

   @Override
   public void az() {
      super.az();
      bos $$0 = bor.a();
      $$0.a("mobBaseTick");
      if (this.bL() && this.ae.a(1000) < this.bM++) {
         this.m();
         this.R();
      }

      $$0.c();
   }

   @Override
   protected void g(bta $$0) {
      this.m();
      super.g($$0);
   }

   private void m() {
      this.bM = -this.Q();
   }

   @Override
   protected int e(arc $$0) {
      if (this.bN > 0) {
         int $$1 = this.bN;

         for (int $$2 = 0; $$2 < this.ce.size(); $$2++) {
            if (!this.ce.get($$2).f() && this.bV[$$2] <= 1.0F) {
               $$1 += 1 + this.ae.a(3);
            }
         }

         for (int $$3 = 0; $$3 < this.cd.size(); $$3++) {
            if (!this.cd.get($$3).f() && this.bU[$$3] <= 1.0F) {
               $$1 += 1 + this.ae.a(3);
            }
         }

         if (!this.cf.f() && this.bW <= 1.0F) {
            $$1 += 1 + this.ae.a(3);
         }

         return $$1;
      } else {
         return this.bN;
      }
   }

   public void S() {
      if (this.dW().C) {
         this.eW();
      } else {
         this.dW().a(this, (byte)20);
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
   public void h() {
      super.h();
      if (!this.dW().C && this.af % 5 == 0) {
         this.T();
      }
   }

   protected void T() {
      boolean $$0 = !(this.cX() instanceof bvi);
      boolean $$1 = !(this.dl() instanceof cqu);
      this.bS.a(cce.a.a, $$0);
      this.bS.a(cce.a.c, $$0 && $$1);
      this.bS.a(cce.a.b, $$0);
   }

   @Override
   protected float g(float $$0, float $$1) {
      this.ca.a();
      return $$1;
   }

   @Nullable
   protected avz u() {
      return null;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fN());
      $$0.a("PersistenceRequired", this.ch);
      tw $$1 = new tw();

      for (cwp $$2 : this.ce) {
         if (!$$2.f()) {
            $$1.add($$2.a(this.dY()));
         } else {
            $$1.add(new tq());
         }
      }

      $$0.a("ArmorItems", $$1);
      tw $$3 = new tw();

      for (float $$4 : this.bV) {
         $$3.add(tt.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      tw $$5 = new tw();

      for (cwp $$6 : this.cd) {
         if (!$$6.f()) {
            $$5.add($$6.a(this.dY()));
         } else {
            $$5.add(new tq());
         }
      }

      $$0.a("HandItems", $$5);
      tw $$7 = new tw();

      for (float $$8 : this.bU) {
         $$7.add(tt.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.cf.f()) {
         $$0.a("body_armor_item", this.cf.a(this.dY()));
         $$0.a("body_armor_drop_chance", this.bW);
      }

      this.a($$0, this.cl);
      $$0.a("LeftHanded", this.gd());
      if (this.cj.isPresent()) {
         $$0.a("DeathLootTable", this.cj.get().a().toString());
         if (this.ck != 0L) {
            $$0.a("DeathLootTableSeed", this.ck);
         }
      }

      if (this.gc()) {
         $$0.a("NoAI", this.gc());
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 99)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.ch = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         tw $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ce.size(); $$2++) {
            tq $$3 = $$1.a($$2);
            this.ce.set($$2, cwp.a(this.dY(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         tw $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bV[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         tw $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.cd.size(); $$7++) {
            tq $$8 = $$6.a($$7);
            this.cd.set($$7, cwp.a(this.dY(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         tw $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bU[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cf = cwp.a(this.dY(), (un)$$0.p("body_armor_item")).orElse(cwp.j);
         this.bW = $$0.j("body_armor_drop_chance");
      } else {
         this.cf = cwp.j;
      }

      this.cl = this.c($$0);
      this.v($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cj = Optional.of(akt.a(mc.bg, aku.a($$0.l("DeathLootTable"))));
         this.ck = $$0.i("DeathLootTableSeed");
      }

      this.u($$0.q("NoAI"));
   }

   @Override
   protected void b(arc $$0, bta $$1, boolean $$2) {
      super.b($$0, $$1, $$2);
      this.cj = Optional.empty();
   }

   @Override
   public final Optional<akt<evw>> eb() {
      return this.cj.isPresent() ? this.cj : super.eb();
   }

   @Override
   public long eH() {
      return this.ck;
   }

   public void G(float $$0) {
      this.bp = $$0;
   }

   public void H(float $$0) {
      this.bo = $$0;
   }

   public void I(float $$0) {
      this.bn = $$0;
   }

   @Override
   public void C(float $$0) {
      super.C($$0);
      this.G($$0);
   }

   public void U() {
      this.L().m();
      this.I(0.0F);
      this.H(0.0F);
      this.C(0.0F);
   }

   @Override
   public void d_() {
      super.d_();
      bos $$0 = bor.a();
      $$0.a("looting");
      if (this.dW() instanceof arc $$1 && this.fN() && this.bL() && !this.be && $$1.O().b(dge.c)) {
         km $$2 = this.V();

         for (clb $$4 : this.dW().a(clb.class, this.cR().c((double)$$2.u(), (double)$$2.v(), (double)$$2.w()))) {
            if (!$$4.dR() && !$$4.l().f() && !$$4.v() && this.c($$1, $$4.l())) {
               this.a($$1, $$4);
            }
         }
      }

      $$0.c();
   }

   protected km V() {
      return bX;
   }

   protected void a(arc $$0, clb $$1) {
      cwp $$2 = $$1.l();
      cwp $$3 = this.b($$0, $$2.v());
      if (!$$3.f()) {
         this.a($$1);
         this.a($$1, $$3.M());
         $$2.h($$3.M());
         if ($$2.f()) {
            $$1.at();
         }
      }
   }

   public cwp b(arc $$0, cwp $$1) {
      bus $$2 = this.f($$1);
      cwp $$3 = this.a($$2);
      boolean $$4 = this.a($$1, $$3, $$2);
      if ($$2.f() && !$$4) {
         $$2 = bus.a;
         $$3 = this.a($$2);
         $$4 = $$3.f();
      }

      if ($$4 && this.g($$1)) {
         double $$5 = (double)this.h($$2);
         if (!$$3.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$5) {
            this.a($$0, $$3);
         }

         cwp $$6 = $$2.a($$1);
         this.b($$2, $$6);
         return $$6;
      } else {
         return cwp.j;
      }
   }

   @Override
   protected void b(bus $$0, cwp $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.ch = true;
   }

   public void g(bus $$0) {
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

   protected boolean a(cwp $$0, cwp $$1, bus $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$2.f()) {
         return this.b($$0, $$1, $$2);
      } else {
         return $$2 == bus.a ? this.c($$0, $$1, $$2) : false;
      }
   }

   private boolean b(cwp $$0, cwp $$1, bus $$2) {
      if (ddb.a($$1, dda.E)) {
         return false;
      } else {
         double $$3 = this.a($$0, bwo.a, $$2);
         double $$4 = this.a($$1, bwo.a, $$2);
         double $$5 = this.a($$0, bwo.b, $$2);
         double $$6 = this.a($$1, bwo.b, $$2);
         if ($$3 != $$4) {
            return $$3 > $$4;
         } else {
            return $$5 != $$6 ? $$5 > $$6 : this.b($$0, $$1);
         }
      }
   }

   private boolean c(cwp $$0, cwp $$1, bus $$2) {
      axf<cwl> $$3 = this.W();
      if ($$3 != null) {
         if ($$1.a($$3) && !$$0.a($$3)) {
            return false;
         }

         if (!$$1.a($$3) && $$0.a($$3)) {
            return true;
         }
      }

      double $$4 = this.a($$0, bwo.c, $$2);
      double $$5 = this.a($$1, bwo.c, $$2);
      return $$4 != $$5 ? $$4 > $$5 : this.b($$0, $$1);
   }

   private double a(cwp $$0, jr<bwj> $$1, bus $$2) {
      double $$3 = this.eY().b($$1) ? this.i($$1) : 0.0;
      czg $$4 = $$0.a(kv.o, czg.a);
      return $$4.a($$3, $$2);
   }

   public boolean b(cwp $$0, cwp $$1) {
      Set<Entry<jr<dcz>>> $$2 = $$1.a(kv.l, ddf.a).b();
      Set<Entry<jr<dcz>>> $$3 = $$0.a(kv.l, ddf.a).b();
      if ($$3.size() != $$2.size()) {
         return $$3.size() > $$2.size();
      } else {
         int $$4 = $$0.o();
         int $$5 = $$1.o();
         return $$4 != $$5 ? $$4 < $$5 : $$0.b(kv.g) && !$$1.b(kv.g);
      }
   }

   public boolean g(cwp $$0) {
      return true;
   }

   public boolean c(arc $$0, cwp $$1) {
      return this.g($$1);
   }

   @Nullable
   public axf<cwl> W() {
      return null;
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean X() {
      return this.bZ();
   }

   protected boolean Y() {
      return false;
   }

   @Override
   public void dI() {
      if (this.dW().am() == bsg.a && this.Y()) {
         this.at();
      } else if (!this.ak() && !this.X()) {
         buk $$0 = this.dW().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.aq().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.at();
            }

            int $$4 = this.aq().f().g();
            int $$5 = $$4 * $$4;
            if (this.bf > 600 && this.ae.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.at();
            } else if ($$1 < (double)$$5) {
               this.bf = 0;
            }
         }
      } else {
         this.bf = 0;
      }
   }

   @Override
   protected final void fu() {
      this.bf++;
      bos $$0 = bor.a();
      $$0.a("sensing");
      this.cc.a();
      $$0.c();
      int $$1 = this.af + this.ar();
      if ($$1 % 2 != 0 && this.af > 1) {
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
      this.a((arc)this.dW());
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
      this.Z();
   }

   protected void Z() {
      agc.a(this.dW(), this, this.bS);
   }

   protected void a(arc $$0) {
   }

   public int aa() {
      return 40;
   }

   public int ab() {
      return 75;
   }

   protected void ac() {
      float $$0 = (float)this.ab();
      float $$1 = this.cA();
      float $$2 = ayz.h(this.aX - $$1);
      float $$3 = ayz.a(ayz.h(this.aX - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.q($$4);
   }

   public int ad() {
      return 10;
   }

   public void a(buk $$0, float $$1, float $$2) {
      double $$3 = $$0.dB() - this.dB();
      double $$4 = $$0.dH() - this.dH();
      double $$6;
      if ($$0 instanceof bvg $$5) {
         $$6 = $$5.dF() - this.dF();
      } else {
         $$6 = ($$0.cR().b + $$0.cR().e) / 2.0 - this.dF();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(ayz.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(ayz.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.w(this.a(this.dO(), $$10, $$2));
      this.v(this.a(this.dM(), $$9, $$1));
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

   public static boolean a(bur<? extends bvi> $$0, dgj $$1, buq $$2, ji $$3, azh $$4) {
      ji $$5 = $$3.e();
      return buq.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dgj $$0, buq $$1) {
      return true;
   }

   public boolean a(dgl $$0) {
      return !$$0.d(this.cR()) && $$0.f(this);
   }

   public int af() {
      return 4;
   }

   public boolean q(int $$0) {
      return false;
   }

   @Override
   public int cE() {
      if (this.O_() == null) {
         return this.y(0.0F);
      } else {
         int $$0 = (int)(this.eE() - this.eS() * 0.33F);
         $$0 -= (3 - this.dW().am().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.y((float)$$0);
      }
   }

   @Override
   public Iterable<cwp> fc() {
      return this.cd;
   }

   @Override
   public Iterable<cwp> fb() {
      return this.ce;
   }

   public cwp ag() {
      return this.cf;
   }

   @Override
   public boolean e(bus $$0) {
      return $$0 != bus.g;
   }

   public boolean ai() {
      return !this.a(bus.g).f();
   }

   public void h(cwp $$0) {
      this.b(bus.g, $$0);
   }

   @Override
   public Iterable<cwp> fd() {
      return (Iterable<cwp>)(this.cf.f() ? this.ce : Iterables.concat(this.ce, List.of(this.cf)));
   }

   @Override
   public cwp a(bus $$0) {
      return switch ($$0.a()) {
         case a -> (cwp)this.cd.get($$0.b());
         case b -> (cwp)this.ce.get($$0.b());
         case c -> this.cf;
      };
   }

   @Override
   public void a(bus $$0, cwp $$1) {
      this.c($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cd.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
            break;
         case c:
            cwp $$2 = this.cf;
            this.cf = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(arc $$0, bta $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bus $$3 : bus.i) {
         cwp $$4 = this.a($$3);
         float $$5 = this.h($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = $$5 > 1.0F;
            buk var11 = $$1.d();
            if (var11 instanceof bvg) {
               bvg $$7 = (bvg)var11;
               if (this.dW() instanceof arc $$8) {
                  $$5 = ddb.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !ddb.a($$4, dda.D) && ($$2 || $$6) && this.ae.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.ae.a(1 + this.ae.a(Math.max($$4.p() - 3, 1))));
               }

               this.a($$0, $$4);
               this.a($$3, cwp.j);
            }
         }
      }
   }

   protected float h(bus $$0) {
      return switch ($$0.a()) {
         case a -> this.bU[$$0.b()];
         case b -> this.bV[$$0.b()];
         case c -> this.bW;
      };
   }

   public void b(arc $$0) {
      this.a($$0, $$0x -> true);
   }

   public Set<bus> a(arc $$0, Predicate<cwp> $$1) {
      Set<bus> $$2 = new HashSet<>();

      for (bus $$3 : bus.i) {
         cwp $$4 = this.a($$3);
         if (!$$4.f()) {
            if (!$$1.test($$4)) {
               $$2.add($$3);
            } else {
               double $$5 = (double)this.h($$3);
               if ($$5 > 1.0) {
                  this.a($$3, cwp.j);
                  this.a($$0, $$4);
               }
            }
         }
      }

      return $$2;
   }

   private evu g(arc $$0) {
      return new evu.a($$0).a(eyl.f, this.du()).a(eyl.a, this).a(eyk.h);
   }

   public void a(buu $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(akt<evw> $$0, Map<bus, Float> $$1) {
      if (this.dW() instanceof arc $$2) {
         this.a($$0, this.g($$2), $$1);
      }
   }

   protected void a(azh $$0, bsh $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dW().am() == bsg.d ? 0.1F : 0.25F;
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

         for (bus $$5 : bY) {
            cwp $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               cwl $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new cwp($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static cwl a(bus $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cwt.qd;
            } else if ($$1 == 1) {
               return cwt.qt;
            } else if ($$1 == 2) {
               return cwt.qh;
            } else if ($$1 == 3) {
               return cwt.ql;
            } else if ($$1 == 4) {
               return cwt.qp;
            }
         case e:
            if ($$1 == 0) {
               return cwt.qe;
            } else if ($$1 == 1) {
               return cwt.qu;
            } else if ($$1 == 2) {
               return cwt.qi;
            } else if ($$1 == 3) {
               return cwt.qm;
            } else if ($$1 == 4) {
               return cwt.qq;
            }
         case d:
            if ($$1 == 0) {
               return cwt.qf;
            } else if ($$1 == 1) {
               return cwt.qv;
            } else if ($$1 == 2) {
               return cwt.qj;
            } else if ($$1 == 3) {
               return cwt.qn;
            } else if ($$1 == 4) {
               return cwt.qr;
            }
         case c:
            if ($$1 == 0) {
               return cwt.qg;
            } else if ($$1 == 1) {
               return cwt.qw;
            } else if ($$1 == 2) {
               return cwt.qk;
            } else if ($$1 == 3) {
               return cwt.qo;
            } else if ($$1 == 4) {
               return cwt.qs;
            }
         default:
            return null;
      }
   }

   protected void a(dgz $$0, azh $$1, bsh $$2) {
      this.b($$0, $$1, $$2);

      for (bus $$3 : bus.i) {
         if ($$3.a() == bus.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dgz $$0, azh $$1, bsh $$2) {
      this.a($$0, bus.a, $$1, 0.25F, $$2);
   }

   protected void a(dgz $$0, azh $$1, bus $$2, bsh $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dgz $$0, bus $$1, azh $$2, float $$3, bsh $$4) {
      cwp $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         ddb.a($$5, $$0.K_(), den.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      azh $$4 = $$0.H_();
      bwk $$5 = Objects.requireNonNull(this.g(bwo.m));
      if (!$$5.b(bL)) {
         $$5.d(new bwm(bL, $$4.a(0.0, 0.11485000000000001), bwm.a.b));
      }

      this.v($$4.i() < 0.05F);
      return $$3;
   }

   public void aj() {
      this.ch = true;
   }

   @Override
   public void a(bus $$0, float $$1) {
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

   @Override
   public boolean fN() {
      return this.cg;
   }

   public void a_(boolean $$0) {
      this.cg = $$0;
   }

   @Override
   protected boolean f(bus $$0) {
      return this.fN();
   }

   public boolean ak() {
      return this.ch;
   }

   @Override
   public final bsj a(cox $$0, bsi $$1) {
      if (!this.bL()) {
         return bsj.e;
      } else {
         bsj $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(ebt.r, $$0);
            return $$2;
         } else {
            bsj $$3 = super.a($$0, $$1);
            if ($$3 != bsj.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(ebt.r, $$0);
                  return $$2;
               } else {
                  return bsj.e;
               }
            }
         }
      }
   }

   private bsj c(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      if ($$2.a(cwt.vL)) {
         bsj $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof cxy) {
         if (this.dW() instanceof arc) {
            cxy $$4 = (cxy)$$2.h();
            Optional<bvi> $$5 = $$4.a($$0, this, (bur<? extends bvi>)this.aq(), (arc)this.dW(), this.du(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return bsj.e;
            }
         }

         return bsj.b;
      } else {
         return bsj.e;
      }
   }

   protected void a(cox $$0, bvi $$1) {
   }

   protected bsj b(cox $$0, bsi $$1) {
      return bsj.e;
   }

   public boolean fX() {
      return this.a(this.dw());
   }

   public boolean a(ji $$0) {
      return this.cn == -1.0F ? true : this.cm.j($$0) < (double)(this.cn * this.cn);
   }

   public void a(ji $$0, int $$1) {
      this.cm = $$0;
      this.cn = (float)$$1;
   }

   public ji fY() {
      return this.cm;
   }

   public float fZ() {
      return this.cn;
   }

   public void ga() {
      this.cn = -1.0F;
   }

   public boolean gb() {
      return this.cn != -1.0F;
   }

   @Nullable
   public <T extends bvi> T a(bur<T> $$0, buf $$1, buq $$2, buf.a<T> $$3) {
      if (this.dR()) {
         return null;
      } else {
         T $$4 = (T)$$0.a(this.dW(), $$2);
         if ($$4 == null) {
            return null;
         } else {
            $$1.a().a(this, $$4, $$1);
            $$3.finalizeConversion($$4);
            if (this.dW() instanceof arc $$5) {
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
   public <T extends bvi> T a(bur<T> $$0, buf $$1, buf.a<T> $$2) {
      return this.a($$0, $$1, buq.i, $$2);
   }

   @Nullable
   @Override
   public bve.a T_() {
      return this.cl;
   }

   @Override
   public void a(@Nullable bve.a $$0) {
      this.cl = $$0;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      bve.super.a($$0, $$1);
      if (this.T_() == null) {
         this.ga();
      }
   }

   @Override
   public void z() {
      bve.super.z();
      this.bS.a(cce.a.a);
   }

   @Override
   public boolean y() {
      return !(this instanceof clp);
   }

   @Override
   public boolean a(buk $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.P_()) {
         this.a(true, true);
      }

      return $$2;
   }

   @Override
   public boolean dk() {
      return super.dk() && !this.gc();
   }

   public void u(boolean $$0) {
      byte $$1 = this.al.a(a);
      this.al.a(a, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void v(boolean $$0) {
      byte $$1 = this.al.a(a);
      this.al.a(a, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void w(boolean $$0) {
      byte $$1 = this.al.a(a);
      this.al.a(a, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean gc() {
      return (this.al.a(a) & 1) != 0;
   }

   public boolean gd() {
      return (this.al.a(a) & 2) != 0;
   }

   public boolean ge() {
      return (this.al.a(a) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bva fy() {
      return this.gd() ? bva.a : bva.b;
   }

   public boolean i(bvg $$0) {
      return this.gf().c($$0.eL());
   }

   protected fav gf() {
      buk $$0 = this.dl();
      fav $$3;
      if ($$0 != null) {
         fav $$1 = $$0.cR();
         fav $$2 = this.cR();
         $$3 = new fav(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cR();
      }

      return $$3.c(bZ, 0.0, bZ);
   }

   @Override
   public boolean c(arc $$0, buk $$1) {
      float $$2 = (float)this.h(bwo.c);
      cwp $$3 = this.ea();
      bta $$4 = Optional.ofNullable($$3.h().a(this)).orElse(this.dX().b((bvg)this));
      $$2 = ddb.a($$0, $$3, $$1, $$4, $$2);
      $$2 += $$3.h().a($$1, $$2, $$4);
      boolean $$5 = $$1.a($$0, $$4, $$2);
      if ($$5) {
         float $$6 = this.b($$1, $$4);
         if ($$6 > 0.0F && $$1 instanceof bvg $$7) {
            $$7.p((double)($$6 * 0.5F), (double)ayz.a(this.dM() * (float) (Math.PI / 180.0)), (double)(-ayz.b(this.dM() * (float) (Math.PI / 180.0))));
            this.h(this.dz().d(0.6, 1.0, 0.6));
         }

         if ($$1 instanceof bvg $$8) {
            $$3.a($$8, this);
         }

         ddb.a($$0, $$1, $$4);
         this.B($$1);
         this.gg();
      }

      return $$5;
   }

   protected void gg() {
   }

   protected boolean gh() {
      if (this.dW().V() && !this.dW().C) {
         float $$0 = this.by();
         ji $$1 = ji.a(this.dB(), this.dF(), this.dH());
         boolean $$2 = this.bl() || this.av || this.aw;
         if ($$0 > 0.5F && this.ae.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dW().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(axf<esy> $$0) {
      if (this.L().o()) {
         super.c($$0);
      } else {
         this.h(this.dz().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gi() {
      this.c($$0 -> true);
      this.ec().h();
   }

   public void c(Predicate<cce> $$0) {
      this.bS.a($$0);
   }

   @Override
   protected void cD() {
      super.cD();
      this.fe().forEach($$0 -> {
         if (!$$0.f()) {
            $$0.e(0);
         }
      });
   }

   @Nullable
   @Override
   public cwp dJ() {
      cxy $$0 = cxy.a(this.aq());
      return $$0 == null ? null : new cwp($$0);
   }

   @Override
   protected void f(jr<bwj> $$0) {
      super.f($$0);
      if ($$0.a(bwo.m) || $$0.a(bwo.E)) {
         this.L().e();
      }
   }

   @VisibleForTesting
   public float[] gj() {
      return this.bU;
   }

   @VisibleForTesting
   public float[] gk() {
      return this.bV;
   }
}

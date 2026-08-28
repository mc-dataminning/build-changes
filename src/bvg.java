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

public abstract class bvg extends bve implements but, bvc, bwc {
   private static final ako<Byte> b = aks.a(bvg.class, akq.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int h = 1;
   private static final kl bX = new kl(1, 0, 1);
   private static final List<buq> bY = List.of(buq.f, buq.e, buq.d, buq.c);
   public static final float i = 0.15F;
   public static final float j = 0.55F;
   public static final float k = 0.5F;
   public static final float l = 0.25F;
   public static final float bH = 0.085F;
   public static final float bI = 1.0F;
   public static final int bJ = 2;
   public static final int bK = 2;
   private static final double bZ = Math.sqrt(2.04F) - 0.6F;
   protected static final all bL = all.b("random_spawn_bonus");
   public int bM;
   protected int bN;
   protected cbe bO;
   protected cbf bP;
   protected cbd bQ;
   private final cba ca;
   protected ceq bR;
   protected final ccd bS;
   protected final ccd bT;
   @Nullable
   private bve cb;
   private final cfn cc;
   private final jz<cwf> cd = jz.a(2, cwf.k);
   protected final float[] bU = new float[2];
   private final jz<cwf> ce = jz.a(4, cwf.k);
   protected final float[] bV = new float[4];
   private cwf cf = cwf.k;
   protected float bW;
   private boolean cg;
   private boolean ch;
   private final Map<esf, Float> ci = Maps.newEnumMap(esf.class);
   private Optional<alk<eul>> cj = Optional.empty();
   private long ck;
   @Nullable
   private bvc.a cl;
   private jh cm = jh.c;
   private float cn = -1.0F;

   protected bvg(bup<? extends bvg> $$0, dff $$1) {
      super($$0, $$1);
      this.bS = new ccd();
      this.bT = new ccd();
      this.bO = new cbe(this);
      this.bP = new cbf(this);
      this.bQ = new cbd(this);
      this.ca = this.J();
      this.bR = this.b($$1);
      this.cc = new cfn(this);
      Arrays.fill(this.bV, 0.085F);
      Arrays.fill(this.bU, 0.085F);
      this.bW = 0.085F;
      if ($$1 != null && !$$1.C) {
         this.D();
      }
   }

   @Override
   protected void D() {
   }

   public static bwl.a E() {
      return bve.eg().a(bwm.m, 16.0);
   }

   protected ceq b(dff $$0) {
      return new cep(this, $$0);
   }

   protected boolean F() {
      return false;
   }

   public float a(esf $$0) {
      bvg $$2;
      label17: {
         if (this.dn() instanceof bvg $$1 && $$1.F()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.ci.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(esf $$0, float $$1) {
      this.ci.put($$0, $$1);
   }

   @Override
   public void G() {
   }

   @Override
   public void I() {
   }

   protected cba J() {
      return new cba(this);
   }

   public cbe K() {
      return this.bO;
   }

   public cbf M() {
      return this.dn() instanceof bvg $$0 ? $$0.M() : this.bP;
   }

   public cbd O() {
      return this.bQ;
   }

   public ceq P() {
      return this.dn() instanceof bvg $$0 ? $$0.P() : this.bR;
   }

   @Nullable
   @Override
   public bve cZ() {
      bui $$0 = this.dc();
      if (!this.gi() && $$0 instanceof bvg $$1 && $$0.ce()) {
         return $$1;
      }

      return null;
   }

   public cfn Q() {
      return this.cc;
   }

   @Nullable
   @Override
   public bve m() {
      return this.cb;
   }

   @Nullable
   protected final bve R() {
      return this.ee().c(cei.o).orElse(null);
   }

   public void h(@Nullable bve $$0) {
      this.cb = $$0;
   }

   @Override
   public boolean a(bup<?> $$0) {
      return $$0 != bup.T;
   }

   public boolean a(cxb $$0) {
      return false;
   }

   public void S() {
      this.a(eak.m);
   }

   @Override
   protected void a(aks.a $$0) {
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
   public void aB() {
      super.aB();
      bor $$0 = boq.a();
      $$0.a("mobBaseTick");
      if (this.bN() && this.af.a(1000) < this.bM++) {
         this.q();
         this.U();
      }

      $$0.c();
   }

   @Override
   protected void e(bsy $$0) {
      this.q();
      super.e($$0);
   }

   private void q() {
      this.bM = -this.T();
   }

   @Override
   protected int er() {
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
      if (this.dY().C) {
         for (int $$0 = 0; $$0 < 20; $$0++) {
            double $$1 = this.af.k() * 0.02;
            double $$2 = this.af.k() * 0.02;
            double $$3 = this.af.k() * 0.02;
            double $$4 = 10.0;
            this.dY().a(ls.ab, this.c(1.0) - $$1 * 10.0, this.dG() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.dY().a(this, (byte)20);
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
      if (!this.dY().C && this.ag % 5 == 0) {
         this.W();
      }
   }

   protected void W() {
      boolean $$0 = !(this.cZ() instanceof bvg);
      boolean $$1 = !(this.dm() instanceof cqq);
      this.bS.a(ccc.a.a, $$0);
      this.bS.a(ccc.a.c, $$0 && $$1);
      this.bS.a(ccc.a.b, $$0);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.ca.a();
      return $$1;
   }

   @Nullable
   protected awn w() {
      return null;
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fQ());
      $$0.a("PersistenceRequired", this.ch);
      ut $$1 = new ut();

      for (cwf $$2 : this.ce) {
         if (!$$2.f()) {
            $$1.add($$2.a(this.ea()));
         } else {
            $$1.add(new un());
         }
      }

      $$0.a("ArmorItems", $$1);
      ut $$3 = new ut();

      for (float $$4 : this.bV) {
         $$3.add(uq.a($$4));
      }

      $$0.a("ArmorDropChances", $$3);
      ut $$5 = new ut();

      for (cwf $$6 : this.cd) {
         if (!$$6.f()) {
            $$5.add($$6.a(this.ea()));
         } else {
            $$5.add(new un());
         }
      }

      $$0.a("HandItems", $$5);
      ut $$7 = new ut();

      for (float $$8 : this.bU) {
         $$7.add(uq.a($$8));
      }

      $$0.a("HandDropChances", $$7);
      if (!this.cf.f()) {
         $$0.a("body_armor_item", this.cf.a(this.ea()));
         $$0.a("body_armor_drop_chance", this.bW);
      }

      this.a($$0, this.cl);
      $$0.a("LeftHanded", this.gj());
      if (this.cj.isPresent()) {
         $$0.a("DeathLootTable", this.cj.get().a().toString());
         if (this.ck != 0L) {
            $$0.a("DeathLootTableSeed", this.ck);
         }
      }

      if (this.gi()) {
         $$0.a("NoAI", this.gi());
      }
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 99)) {
         this.a_($$0.q("CanPickUpLoot"));
      }

      this.ch = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         ut $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ce.size(); $$2++) {
            un $$3 = $$1.a($$2);
            this.ce.set($$2, cwf.a(this.ea(), $$3));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         ut $$4 = $$0.c("ArmorDropChances", 5);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.bV[$$5] = $$4.i($$5);
         }
      }

      if ($$0.b("HandItems", 9)) {
         ut $$6 = $$0.c("HandItems", 10);

         for (int $$7 = 0; $$7 < this.cd.size(); $$7++) {
            un $$8 = $$6.a($$7);
            this.cd.set($$7, cwf.a(this.ea(), $$8));
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         ut $$9 = $$0.c("HandDropChances", 5);

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            this.bU[$$10] = $$9.i($$10);
         }
      }

      if ($$0.b("body_armor_item", 10)) {
         this.cf = cwf.a(this.ea(), (vk)$$0.p("body_armor_item")).orElse(cwf.k);
         this.bW = $$0.j("body_armor_drop_chance");
      } else {
         this.cf = cwf.k;
      }

      this.cl = this.c($$0);
      this.v($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cj = Optional.of(alk.a(ma.bd, all.a($$0.l("DeathLootTable"))));
         this.ck = $$0.i("DeathLootTableSeed");
      }

      this.u($$0.q("NoAI"));
   }

   @Override
   protected void a(bsy $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cj = Optional.empty();
   }

   @Override
   public final Optional<alk<eul>> ed() {
      return this.cj.isPresent() ? this.cj : super.ed();
   }

   @Override
   public long eL() {
      return this.ck;
   }

   public void G(float $$0) {
      this.bq = $$0;
   }

   public void H(float $$0) {
      this.bp = $$0;
   }

   public void I(float $$0) {
      this.bo = $$0;
   }

   @Override
   public void C(float $$0) {
      super.C($$0);
      this.G($$0);
   }

   public void X() {
      this.P().o();
      this.I(0.0F);
      this.H(0.0F);
      this.C(0.0F);
   }

   @Override
   public void n_() {
      super.n_();
      bor $$0 = boq.a();
      $$0.a("looting");
      if (!this.dY().C && this.fQ() && this.bN() && !this.be && this.dY().ac().b(dfb.c)) {
         kl $$1 = this.Y();

         for (ckz $$3 : this.dY().a(ckz.class, this.cT().c((double)$$1.u(), (double)$$1.v(), (double)$$1.w()))) {
            if (!$$3.dT() && !$$3.m().f() && !$$3.w() && this.i($$3.m())) {
               this.b($$3);
            }
         }
      }

      $$0.c();
   }

   protected kl Y() {
      return bX;
   }

   protected void b(ckz $$0) {
      cwf $$1 = $$0.m();
      cwf $$2 = this.g($$1.v());
      if (!$$2.f()) {
         this.a($$0);
         this.a($$0, $$2.L());
         $$1.h($$2.L());
         if ($$1.f()) {
            $$0.av();
         }
      }
   }

   public cwf g(cwf $$0) {
      buq $$1 = this.f($$0);
      cwf $$2 = this.a($$1);
      boolean $$3 = this.a($$0, $$2, $$1);
      if ($$1.f() && !$$3) {
         $$1 = buq.a;
         $$2 = this.a($$1);
         $$3 = $$2.f();
      }

      if ($$3 && this.h($$0)) {
         double $$4 = (double)this.h($$1);
         if (!$$2.f() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         cwf $$5 = $$1.a($$0);
         this.b($$1, $$5);
         return $$5;
      } else {
         return cwf.k;
      }
   }

   @Override
   protected void b(buq $$0, cwf $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.ch = true;
   }

   public void g(buq $$0) {
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

   protected boolean a(cwf $$0, cwf $$1, buq $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$0.h() instanceof cxt) {
         if (!($$1.h() instanceof cxt)) {
            return true;
         } else {
            double $$3 = this.a($$0, bwm.c, $$2);
            double $$4 = this.a($$1, bwm.c, $$2);
            return $$3 != $$4 ? $$3 > $$4 : this.b($$0, $$1);
         }
      } else if ($$0.h() instanceof cup && $$1.h() instanceof cup) {
         return this.b($$0, $$1);
      } else if ($$0.h() instanceof cuw && $$1.h() instanceof cuw) {
         return this.b($$0, $$1);
      } else if ($$0.h() instanceof cue) {
         if (dby.a($$1, dbx.E)) {
            return false;
         } else if (!($$1.h() instanceof cue)) {
            return true;
         } else {
            double $$5 = this.a($$0, bwm.a, $$2);
            double $$6 = this.a($$1, bwm.a, $$2);
            double $$7 = this.a($$0, bwm.b, $$2);
            double $$8 = this.a($$1, bwm.b, $$2);
            if ($$5 != $$6) {
               return $$5 > $$6;
            } else {
               return $$7 != $$8 ? $$7 > $$8 : this.b($$0, $$1);
            }
         }
      } else {
         if ($$0.h() instanceof cuy) {
            if ($$1.h() instanceof cul) {
               return true;
            }

            if ($$1.h() instanceof cuy) {
               double $$9 = this.a($$0, bwm.c, $$2);
               double $$10 = this.a($$1, bwm.c, $$2);
               if ($$9 != $$10) {
                  return $$9 > $$10;
               }

               return this.b($$0, $$1);
            }
         }

         return false;
      }
   }

   private double a(cwf $$0, jq<bwh> $$1, buq $$2) {
      double $$3 = this.fb().b($$1) ? this.i($$1) : 0.0;
      cyw $$4 = $$0.a(ku.o, cyw.a);
      return $$4.a($$3, $$2);
   }

   public boolean b(cwf $$0, cwf $$1) {
      return $$0.o() < $$1.o() ? true : l($$0) && !l($$1);
   }

   private static boolean l(cwf $$0) {
      kq $$1 = $$0.a();
      int $$2 = $$1.d();
      return $$2 > 1 || $$2 == 1 && !$$1.b(ku.e);
   }

   public boolean h(cwf $$0) {
      return true;
   }

   public boolean i(cwf $$0) {
      return this.h($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean Z() {
      return this.cb();
   }

   protected boolean aa() {
      return false;
   }

   @Override
   public void dK() {
      if (this.dY().ak() == bse.a && this.aa()) {
         this.av();
      } else if (!this.gc() && !this.Z()) {
         bui $$0 = this.dY().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.ar().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.av();
            }

            int $$4 = this.ar().f().g();
            int $$5 = $$4 * $$4;
            if (this.bf > 600 && this.af.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.av();
            } else if ($$1 < (double)$$5) {
               this.bf = 0;
            }
         }
      } else {
         this.bf = 0;
      }
   }

   @Override
   protected final void fx() {
      this.bf++;
      bor $$0 = boq.a();
      $$0.a("sensing");
      this.cc.a();
      $$0.c();
      int $$1 = this.ag + this.as();
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
      this.ac();
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
      this.ab();
   }

   protected void ab() {
      agv.a(this.dY(), this, this.bS);
   }

   protected void ac() {
   }

   public int ad() {
      return 40;
   }

   public int ae() {
      return 75;
   }

   protected void ag() {
      float $$0 = (float)this.ae();
      float $$1 = this.cC();
      float $$2 = azn.h(this.aX - $$1);
      float $$3 = azn.a(azn.h(this.aX - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.q($$4);
   }

   public int ah() {
      return 10;
   }

   public void a(bui $$0, float $$1, float $$2) {
      double $$3 = $$0.dD() - this.dD();
      double $$4 = $$0.dJ() - this.dJ();
      double $$6;
      if ($$0 instanceof bve $$5) {
         $$6 = $$5.dH() - this.dH();
      } else {
         $$6 = ($$0.cT().b + $$0.cT().e) / 2.0 - this.dH();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(azn.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(azn.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.w(this.a(this.dQ(), $$10, $$2));
      this.v(this.a(this.dO(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azn.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bup<? extends bvg> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      jh $$5 = $$3.e();
      return buo.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dfg $$0, buo $$1) {
      return true;
   }

   public boolean a(dfi $$0) {
      return !$$0.d(this.cT()) && $$0.f(this);
   }

   public int aj() {
      return 4;
   }

   public boolean r(int $$0) {
      return false;
   }

   @Override
   public int cG() {
      if (this.m() == null) {
         return this.y(0.0F);
      } else {
         int $$0 = (int)(this.eH() - this.eW() * 0.33F);
         $$0 -= (3 - this.dY().ak().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.y((float)$$0);
      }
   }

   @Override
   public Iterable<cwf> ff() {
      return this.cd;
   }

   @Override
   public Iterable<cwf> fe() {
      return this.ce;
   }

   public cwf ak() {
      return this.cf;
   }

   @Override
   public boolean e(buq $$0) {
      return $$0 != buq.g;
   }

   public boolean al() {
      return !this.a(buq.g).f();
   }

   public void j(cwf $$0) {
      this.b(buq.g, $$0);
   }

   @Override
   public Iterable<cwf> fg() {
      return (Iterable<cwf>)(this.cf.f() ? this.ce : Iterables.concat(this.ce, List.of(this.cf)));
   }

   @Override
   public cwf a(buq $$0) {
      return switch ($$0.a()) {
         case a -> (cwf)this.cd.get($$0.b());
         case b -> (cwf)this.ce.get($$0.b());
         case c -> this.cf;
      };
   }

   @Override
   public void a(buq $$0, cwf $$1) {
      this.c($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cd.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
            break;
         case c:
            cwf $$2 = this.cf;
            this.cf = $$1;
            this.a($$0, $$2, $$1);
      }
   }

   @Override
   protected void a(arq $$0, bsy $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (buq $$3 : buq.i) {
         cwf $$4 = this.a($$3);
         float $$5 = this.h($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = $$5 > 1.0F;
            bui var11 = $$1.d();
            if (var11 instanceof bve) {
               bve $$7 = (bve)var11;
               if (this.dY() instanceof arq $$8) {
                  $$5 = dby.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !dby.a($$4, dbx.D) && ($$2 || $$6) && this.af.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.af.a(1 + this.af.a(Math.max($$4.p() - 3, 1))));
               }

               this.b($$4);
               this.a($$3, cwf.k);
            }
         }
      }
   }

   protected float h(buq $$0) {
      return switch ($$0.a()) {
         case a -> this.bU[$$0.b()];
         case b -> this.bV[$$0.b()];
         case c -> this.bW;
      };
   }

   public void ga() {
      this.c($$0 -> true);
   }

   public Set<buq> c(Predicate<cwf> $$0) {
      Set<buq> $$1 = new HashSet<>();

      for (buq $$2 : buq.i) {
         cwf $$3 = this.a($$2);
         if (!$$3.f()) {
            if (!$$0.test($$3)) {
               $$1.add($$2);
            } else {
               double $$4 = (double)this.h($$2);
               if ($$4 > 1.0) {
                  this.a($$2, cwf.k);
                  this.b($$3);
               }
            }
         }
      }

      return $$1;
   }

   private euj a(arq $$0) {
      return new euj.a($$0).a(exc.f, this.dw()).a(exc.a, this).a(exb.h);
   }

   public void a(bus $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(alk<eul> $$0, Map<buq, Float> $$1) {
      if (this.dY() instanceof arq $$2) {
         this.a($$0, this.a($$2), $$1);
      }
   }

   protected void a(azv $$0, bsf $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dY().ak() == bse.d ? 0.1F : 0.25F;
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

         for (buq $$5 : bY) {
            cwf $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               cwb $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new cwf($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static cwb a(buq $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cwj.pz;
            } else if ($$1 == 1) {
               return cwj.pP;
            } else if ($$1 == 2) {
               return cwj.pD;
            } else if ($$1 == 3) {
               return cwj.pH;
            } else if ($$1 == 4) {
               return cwj.pL;
            }
         case e:
            if ($$1 == 0) {
               return cwj.pA;
            } else if ($$1 == 1) {
               return cwj.pQ;
            } else if ($$1 == 2) {
               return cwj.pE;
            } else if ($$1 == 3) {
               return cwj.pI;
            } else if ($$1 == 4) {
               return cwj.pM;
            }
         case d:
            if ($$1 == 0) {
               return cwj.pB;
            } else if ($$1 == 1) {
               return cwj.pR;
            } else if ($$1 == 2) {
               return cwj.pF;
            } else if ($$1 == 3) {
               return cwj.pJ;
            } else if ($$1 == 4) {
               return cwj.pN;
            }
         case c:
            if ($$1 == 0) {
               return cwj.pC;
            } else if ($$1 == 1) {
               return cwj.pS;
            } else if ($$1 == 2) {
               return cwj.pG;
            } else if ($$1 == 3) {
               return cwj.pK;
            } else if ($$1 == 4) {
               return cwj.pO;
            }
         default:
            return null;
      }
   }

   protected void a(dfw $$0, azv $$1, bsf $$2) {
      this.b($$0, $$1, $$2);

      for (buq $$3 : buq.i) {
         if ($$3.a() == buq.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dfw $$0, azv $$1, bsf $$2) {
      this.a($$0, buq.a, $$1, 0.25F, $$2);
   }

   protected void a(dfw $$0, azv $$1, buq $$2, bsf $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dfw $$0, buq $$1, azv $$2, float $$3, bsf $$4) {
      cwf $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         dby.a($$5, $$0.H_(), ddk.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      azv $$4 = $$0.E_();
      bwi $$5 = Objects.requireNonNull(this.g(bwm.m));
      if (!$$5.b(bL)) {
         $$5.d(new bwk(bL, $$4.a(0.0, 0.11485000000000001), bwk.a.b));
      }

      this.v($$4.i() < 0.05F);
      return $$3;
   }

   public void gb() {
      this.ch = true;
   }

   @Override
   public void a(buq $$0, float $$1) {
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
   public boolean fQ() {
      return this.cg;
   }

   public void a_(boolean $$0) {
      this.cg = $$0;
   }

   @Override
   protected boolean f(buq $$0) {
      return this.fQ();
   }

   public boolean gc() {
      return this.ch;
   }

   @Override
   public final bsh a(cor $$0, bsg $$1) {
      if (!this.bN()) {
         return bsh.e;
      } else {
         bsh $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(eak.r, $$0);
            return $$2;
         } else {
            bsh $$3 = super.a($$0, $$1);
            if ($$3 != bsh.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(eak.r, $$0);
                  return $$2;
               } else {
                  return bsh.e;
               }
            }
         }
      }
   }

   private bsh c(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if ($$2.a(cwj.vd)) {
         bsh $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof cxo) {
         if (this.dY() instanceof arq) {
            cxo $$4 = (cxo)$$2.h();
            Optional<bvg> $$5 = $$4.a($$0, this, (bup<? extends bvg>)this.ar(), (arq)this.dY(), this.dw(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return bsh.e;
            }
         }

         return bsh.b;
      } else {
         return bsh.e;
      }
   }

   protected void a(cor $$0, bvg $$1) {
   }

   protected bsh b(cor $$0, bsg $$1) {
      return bsh.e;
   }

   public boolean gd() {
      return this.a(this.dy());
   }

   public boolean a(jh $$0) {
      return this.cn == -1.0F ? true : this.cm.j($$0) < (double)(this.cn * this.cn);
   }

   public void a(jh $$0, int $$1) {
      this.cm = $$0;
      this.cn = (float)$$1;
   }

   public jh ge() {
      return this.cm;
   }

   public float gf() {
      return this.cn;
   }

   public void gg() {
      this.cn = -1.0F;
   }

   public boolean gh() {
      return this.cn != -1.0F;
   }

   @Nullable
   public <T extends bvg> T a(bup<T> $$0, bud $$1, buo $$2, bud.a<T> $$3) {
      if (this.dT()) {
         return null;
      } else {
         T $$4 = (T)$$0.a(this.dY(), $$2);
         if ($$4 == null) {
            return null;
         } else {
            $$1.a().a(this, $$4, $$1);
            $$3.finalizeConversion($$4);
            if (this.dY() instanceof arq $$5) {
               $$5.b($$4);
            }

            if ($$1.a().a()) {
               this.av();
            }

            return $$4;
         }
      }
   }

   @Nullable
   public <T extends bvg> T a(bup<T> $$0, bud $$1, bud.a<T> $$2) {
      return this.a($$0, $$1, buo.i, $$2);
   }

   @Nullable
   @Override
   public bvc.a Y_() {
      return this.cl;
   }

   @Override
   public void a(@Nullable bvc.a $$0) {
      this.cl = $$0;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      bvc.super.a($$0, $$1);
      if (this.Y_() == null) {
         this.gg();
      }
   }

   @Override
   public void B() {
      bvc.super.B();
      this.bS.a(ccc.a.a);
   }

   @Override
   public boolean A() {
      return !(this instanceof cln);
   }

   @Override
   public boolean a(bui $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.M_()) {
         this.a(true, true);
      }

      return $$2;
   }

   @Override
   public boolean dl() {
      return super.dl() && !this.gi();
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

   public boolean gi() {
      return (this.am.a(b) & 1) != 0;
   }

   public boolean gj() {
      return (this.am.a(b) & 2) != 0;
   }

   public boolean gk() {
      return (this.am.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public buy fB() {
      return this.gj() ? buy.a : buy.b;
   }

   public boolean i(bve $$0) {
      return this.gl().c($$0.eP());
   }

   protected ezm gl() {
      bui $$0 = this.dm();
      ezm $$3;
      if ($$0 != null) {
         ezm $$1 = $$0.cT();
         ezm $$2 = this.cT();
         $$3 = new ezm(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cT();
      }

      return $$3.c(bZ, 0.0, bZ);
   }

   @Override
   public boolean E(bui $$0) {
      float $$1 = (float)this.h(bwm.c);
      cwf $$2 = this.ec();
      bsy $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dZ().b((bve)this));
      if (this.dY() instanceof arq $$4) {
         $$1 = dby.a($$4, $$2, $$0, $$3, $$1);
      }

      $$1 += $$2.h().a($$0, $$1, $$3);
      boolean $$5 = $$0.a($$3, $$1);
      if ($$5) {
         float $$6 = this.a($$0, $$3);
         if ($$6 > 0.0F && $$0 instanceof bve $$7) {
            $$7.p((double)($$6 * 0.5F), (double)azn.a(this.dO() * (float) (Math.PI / 180.0)), (double)(-azn.b(this.dO() * (float) (Math.PI / 180.0))));
            this.h(this.dB().d(0.6, 1.0, 0.6));
         }

         if (this.dY() instanceof arq $$8) {
            if ($$0 instanceof bve $$9) {
               $$2.a($$9, this);
            }

            dby.a($$8, $$0, $$3);
         }

         this.B($$0);
         this.gm();
      }

      return $$5;
   }

   protected void gm() {
   }

   protected boolean gn() {
      if (this.dY().S() && !this.dY().C) {
         float $$0 = this.bA();
         jh $$1 = jh.a(this.dD(), this.dH(), this.dJ());
         boolean $$2 = this.bn() || this.aw || this.ax;
         if ($$0 > 0.5F && this.af.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dY().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(axt<ern> $$0) {
      if (this.P().q()) {
         super.c($$0);
      } else {
         this.h(this.dB().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void go() {
      this.d($$0 -> true);
      this.ee().h();
   }

   public void d(Predicate<ccc> $$0) {
      this.bS.a($$0);
   }

   @Override
   protected void cF() {
      super.cF();
      this.fh().forEach($$0 -> {
         if (!$$0.f()) {
            $$0.e(0);
         }
      });
   }

   @Nullable
   @Override
   public cwf dL() {
      cxo $$0 = cxo.a(this.ar());
      return $$0 == null ? null : new cwf($$0);
   }

   @Override
   protected void f(jq<bwh> $$0) {
      super.f($$0);
      if ($$0.a(bwm.m) || $$0.a(bwm.E)) {
         this.P().g();
      }
   }

   @VisibleForTesting
   public float[] gp() {
      return this.bU;
   }

   @VisibleForTesting
   public float[] gq() {
      return this.bV;
   }
}

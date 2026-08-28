import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class bxc extends bwd implements bvw {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "active_effects";
   private static final alg c = alg.b("powder_snow");
   private static final alg d = alg.b("sprinting");
   private static final byg k = new byg(d, 0.3F, byg.a.c);
   public static final int l = 98;
   public static final int m = 100;
   public static final int n = 105;
   public static final int o = 106;
   public static final int p = 6;
   public static final int q = 100;
   private static final int bt = 40;
   public static final double r = 0.003;
   public static final double s = 0.08;
   public static final int t = 20;
   protected static final float u = 0.98F;
   private static final int bu = 10;
   private static final int bv = 2;
   public static final float ay = 0.42F;
   private static final double bw = 128.0;
   protected static final int az = 1;
   protected static final int aA = 2;
   protected static final int aB = 4;
   protected static final akj<Byte> aC = akn.a(bxc.class, akl.a);
   private static final akj<Float> bx = akn.a(bxc.class, akl.d);
   private static final akj<List<lv>> by = akn.a(bxc.class, akl.m);
   private static final akj<Boolean> bz = akn.a(bxc.class, akl.k);
   private static final akj<Integer> bA = akn.a(bxc.class, akl.b);
   private static final akj<Integer> bB = akn.a(bxc.class, akl.b);
   private static final akj<Optional<iu>> bC = akn.a(bxc.class, akl.p);
   private static final int bD = 15;
   protected static final bwg aD = bwg.c(0.2F, 0.2F).b(0.2F);
   public static final float aE = 0.5F;
   public static final float aF = 0.5F;
   public static final String aG = "attributes";
   public static final Predicate<bxc> aH = $$0 -> {
      if ($$0 instanceof cqy $$1) {
         cyy $$3 = $$1.a(bwn.f);
         return !$$3.a(axk.cr);
      } else {
         return true;
      }
   };
   private final byf bE;
   private final bup bF = new bup(this);
   private final Map<je<bvf>, bvh> bG = Maps.newHashMap();
   private final Map<bwn, cyy> bH = af.a(bwn.class, $$0x -> cyy.k);
   public boolean aI;
   private boolean bI = false;
   public bua aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final byb aT = new byb();
   public final int aU = 20;
   public float aV;
   public float aW;
   public float aX;
   public float aY;
   public final bwc aZ = new bwc(this);
   @Nullable
   protected bwj<cqy> ba;
   protected int bb;
   protected boolean bc;
   protected int bd;
   protected float be;
   protected boolean bf;
   public float bg;
   public float bh;
   public float bi;
   protected bwx bj = new bwx(this);
   protected double bk;
   protected int bl;
   private boolean bJ = true;
   @Nullable
   private bwj<bxc> bK;
   private int bL;
   @Nullable
   private bxc bM;
   private int bN;
   private float bO;
   private int bP;
   private float bQ;
   protected cyy bm = cyy.k;
   protected int bn;
   protected int bo;
   private iu bR;
   private Optional<iu> bS = Optional.empty();
   @Nullable
   private bus bT;
   private long bU;
   protected int bp;
   protected float bq;
   @Nullable
   protected cyy br;
   private float bV;
   private float bW;
   protected byc<?> bs;
   private boolean bX;
   private final EnumMap<bwn, Reference2ObjectMap<dfl, Set<dgd>>> bY = new EnumMap<>(bwn.class);

   protected bxc(bwm<? extends bxc> $$0, div $$1) {
      super($$0, $$1);
      this.bE = new byf(byj.a($$0));
      this.d(this.eT());
      this.I = true;
      this.ay();
      this.w((float)(Math.random() * (float) (Math.PI * 2)));
      this.aX = this.dL();
      un $$2 = un.a;
      this.bs = this.a(new Dynamic($$2, (uw)$$2.createMap(ImmutableMap.of($$2.a("memories"), (uw)$$2.emptyMap()))));
   }

   public byc<?> eb() {
      return this.bs;
   }

   protected byc.b<?> ec() {
      return byc.a(ImmutableList.of(), ImmutableList.of());
   }

   protected byc<?> a(Dynamic<?> $$0) {
      return this.ec().a($$0);
   }

   @Override
   public void c(arq $$0) {
      this.a($$0, this.dW().y(), Float.MAX_VALUE);
   }

   public boolean a(bwm<?> $$0) {
      return true;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(aC, (byte)0);
      $$0.a(by, List.of());
      $$0.a(bz, false);
      $$0.a(bA, 0);
      $$0.a(bB, 0);
      $$0.a(bx, 1.0F);
      $$0.a(bC, Optional.empty());
   }

   public static byh.a ed() {
      return byh.a()
         .a(byi.s)
         .a(byi.p)
         .a(byi.v)
         .a(byi.a)
         .a(byi.b)
         .a(byi.r)
         .a(byi.B)
         .a(byi.y)
         .a(byi.n)
         .a(byi.x)
         .a(byi.k)
         .a(byi.o)
         .a(byi.w)
         .a(byi.h)
         .a(byi.i)
         .a(byi.F)
         .a(byi.u)
         .a(byi.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dzz $$2, iu $$3) {
      if (!this.bj()) {
         this.bq();
      }

      if (this.dV() instanceof arq $$4 && $$1 && this.Z > 0.0) {
         this.b($$4, $$3);
         double $$5 = (double)Math.max(0, azm.a(this.h(this.Z)));
         if ($$5 > 0.0 && !$$2.l()) {
            double $$6 = this.dA();
            double $$7 = this.dC();
            double $$8 = this.dG();
            iu $$9 = this.dv();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            double $$13 = Math.min(0.2F + $$5 / 15.0, 2.5);
            int $$14 = (int)(150.0 * $$13);
            $$4.a(new lp(lx.b, $$2), $$6, $$7, $$8, $$14, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.bS = Optional.empty();
      }
   }

   public final boolean ee() {
      return this.aq().a(axf.m);
   }

   public float a(float $$0) {
      return azm.h($$0, this.bW, this.bV);
   }

   public boolean ef() {
      return this.dy().b() < 1.0E-5F && this.bm();
   }

   @Override
   public void az() {
      this.aQ = this.aR;
      if (this.ak) {
         this.fO().ifPresent(this::a);
      }

      if (this.dV() instanceof arq $$0) {
         dfn.b($$0, this);
      }

      super.az();
      bqm $$1 = bql.a();
      $$1.a("livingEntityBaseTick");
      if (this.bi() || this.dV().C) {
         this.aH();
      }

      if (this.bK() && this.dV() instanceof arq $$2) {
         boolean $$3 = this instanceof cqy;
         if (this.bL()) {
            this.a($$2, this.dW().g(), 1.0F);
         } else if ($$3 && !$$2.A_().a(this.cR())) {
            double $$4 = $$2.A_().a(this) + $$2.A_().n();
            if ($$4 < 0.0) {
               double $$5 = $$2.A_().o();
               if ($$5 > 0.0) {
                  this.a($$2, this.dW().x(), (float)Math.max(1, azm.a(-$$4 * $$5)));
               }
            }
         }

         if (this.a(axh.a) && !$$2.a_(iu.a(this.dA(), this.dE(), this.dG())).a(dmc.nG)) {
            boolean $$6 = !this.ee() && !bvi.c(this) && (!$$3 || !((cqy)this).gj().a);
            if ($$6) {
               this.j(this.l(this.ct()));
               if (this.ct() == -20) {
                  this.j(0);
                  $$2.a(this, (byte)67);
                  this.a($$2, this.dW().i(), 2.0F);
               }
            } else if (this.ct() < this.cs()) {
               this.j(this.m(this.ct()));
            }

            if (this.bZ() && this.dk() != null && this.dk().cb()) {
               this.bP();
            }
         } else if (this.ct() < this.cs()) {
            this.j(this.m(this.ct()));
         }

         iu $$7 = this.dv();
         if (!Objects.equal(this.bR, $$7)) {
            this.bR = $$7;
            this.b($$2, $$7);
         }
      }

      if (this.bK() && this.bk()) {
         this.aN();
      }

      if (this.aN > 0) {
         this.aN--;
      }

      if (this.aj > 0 && !(this instanceof arr)) {
         this.aj--;
      }

      if (this.eG() && this.dV().h(this)) {
         this.em();
      }

      if (this.bb > 0) {
         this.bb--;
      } else {
         this.ba = null;
      }

      if (this.bM != null && !this.bM.bK()) {
         this.bM = null;
      }

      bxc $$8 = this.eq();
      if ($$8 != null) {
         if (!$$8.bK()) {
            this.a(null);
         } else if (this.af - this.bL > 100) {
            this.a(null);
         }
      }

      this.ex();
      this.aY = this.aX;
      this.aW = this.aV;
      this.N = this.dL();
      this.O = this.dN();
      $$1.c();
   }

   @Override
   protected float aT() {
      return azm.h((float)this.h(byi.u), super.aT(), 1.0F);
   }

   public float eg() {
      return 0.0F;
   }

   protected void eh() {
      bye $$0 = this.g(byi.v);
      if ($$0 != null) {
         if ($$0.a(c) != null) {
            $$0.c(c);
         }
      }
   }

   protected void ei() {
      if (!this.bs().l()) {
         int $$0 = this.cu();
         if ($$0 > 0) {
            bye $$1 = this.g(byi.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cv();
            $$1.b(new byg(c, (double)$$2, byg.a.a));
         }
      }
   }

   protected void b(arq $$0, iu $$1) {
      dfn.a($$0, this);
   }

   public boolean n_() {
      return false;
   }

   public float ej() {
      return this.n_() ? 0.5F : 1.0F;
   }

   public final float ek() {
      byf $$0 = this.eZ();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(byi.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   public boolean el() {
      return true;
   }

   protected void em() {
      this.aP++;
      if (this.aP >= 20 && !this.dV().w_() && !this.dQ()) {
         this.dV().a(this, (byte)60);
         this.a(bwd.e.a);
      }
   }

   public boolean en() {
      return !this.n_();
   }

   protected boolean eo() {
      return !this.n_();
   }

   protected int l(int $$0) {
      bye $$1 = this.g(byi.w);
      double $$2;
      if ($$1 != null) {
         $$2 = $$1.g();
      } else {
         $$2 = 0.0;
      }

      return $$2 > 0.0 && this.ae.j() >= 1.0 / ($$2 + 1.0) ? $$0 : $$0 - 1;
   }

   protected int m(int $$0) {
      return Math.min($$0 + 4, this.cs());
   }

   public final int a(arq $$0, @Nullable bwd $$1) {
      return dfn.a($$0, $$1, this, this.e($$0));
   }

   protected int e(arq $$0) {
      return 0;
   }

   protected boolean ep() {
      return false;
   }

   @Nullable
   public bxc eq() {
      return bwj.a(this.bK, this.dV(), bxc.class);
   }

   @Nullable
   public cqy er() {
      return bwj.a(this.ba, this.dV(), cqy.class);
   }

   @Override
   public bxc am() {
      return this.eq();
   }

   public int es() {
      return this.bL;
   }

   public void a(cqy $$0, int $$1) {
      this.a(new bwj<>($$0), $$1);
   }

   public void a(UUID $$0, int $$1) {
      this.a(new bwj<>($$0), $$1);
   }

   private void a(bwj<cqy> $$0, int $$1) {
      this.ba = $$0;
      this.bb = $$1;
   }

   public void a(@Nullable bxc $$0) {
      this.bK = $$0 != null ? new bwj<>($$0) : null;
      this.bL = this.af;
   }

   @Nullable
   public bxc et() {
      return this.bM;
   }

   public int eu() {
      return this.bN;
   }

   public void B(bwd $$0) {
      if ($$0 instanceof bxc) {
         this.bM = (bxc)$$0;
      } else {
         this.bM = null;
      }

      this.bN = this.af;
   }

   public int ev() {
      return this.bd;
   }

   public void n(int $$0) {
      this.bd = $$0;
   }

   public boolean ew() {
      return this.bI;
   }

   public void q(boolean $$0) {
      this.bI = $$0;
   }

   protected boolean b(bwn $$0) {
      return true;
   }

   public void a(bwn $$0, cyy $$1, cyy $$2) {
      if (!this.dV().w_() && !this.U_()) {
         if (!cyy.c($$1, $$2) && !this.ak) {
            dhh $$3 = $$2.a(kj.D);
            if (!this.bb() && $$3 != null && $$0 == $$3.b()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), this.a($$0, $$2, $$3), this.dm(), 1.0F, 1.0F, this.ae.g());
            }

            if (this.b($$0)) {
               this.a($$3 != null ? eez.v : eez.S);
            }
         }
      }
   }

   protected je<awm> a(bwn $$0, cyy $$1, dhh $$2) {
      return $$2.c();
   }

   @Override
   public void a(bwd.e $$0) {
      if (($$0 == bwd.e.a || $$0 == bwd.e.b) && this.dV() instanceof arq $$1) {
         this.a($$1, $$0);
      }

      super.a($$0);
      this.bs.a();
   }

   protected void a(arq $$0, bwd.e $$1) {
      for (bvh $$2 : this.eC()) {
         $$2.a($$0, this, $$1);
      }

      this.bG.clear();
   }

   @Override
   public void b(tz $$0) {
      $$0.a("Health", this.eF());
      $$0.a("HurtTime", (short)this.aN);
      $$0.a("HurtByTimestamp", this.bL);
      $$0.a("DeathTime", (short)this.aP);
      $$0.a("AbsorptionAmount", this.fv());
      $$0.a("attributes", this.eZ().d());
      ale<uw> $$1 = this.dX().a(un.a);
      if (!this.bG.isEmpty()) {
         $$0.a("active_effects", bvh.d.listOf(), $$1, List.copyOf(this.bG.values()));
      }

      $$0.a("FallFlying", this.fI());
      this.fO().ifPresent($$1x -> {
         $$0.a("SleepingX", $$1x.u());
         $$0.a("SleepingY", $$1x.v());
         $$0.a("SleepingZ", $$1x.w());
      });
      DataResult<uw> $$2 = this.bs.a(un.a);
      $$2.resultOrPartial(a::error).ifPresent($$1x -> $$0.a("Brain", $$1x));
      if (this.ba != null) {
         this.ba.a($$0, "last_hurt_by_player");
         $$0.a("last_hurt_by_player_memory_time", this.bb);
      }

      if (this.bK != null) {
         this.bK.a($$0, "last_hurt_by_mob");
         $$0.a("ticks_since_last_hurt_by_mob", this.af - this.bL);
      }
   }

   @Override
   public void a(tz $$0) {
      this.F($$0.j("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dV() != null && !this.dV().C) {
         this.eZ().a($$0.c("attributes", 10));
      }

      ale<uw> $$1 = this.dX().a(un.a);
      List<bvh> $$2 = $$0.<List<bvh>>a("active_effects", bvh.d.listOf(), $$1).orElse(List.of());
      this.bG.clear();

      for (bvh $$3 : $$2) {
         this.bG.put($$3.c(), $$3);
      }

      if ($$0.b("Health", 99)) {
         this.d($$0.j("Health"));
      }

      this.aN = $$0.g("HurtTime");
      this.aP = $$0.g("DeathTime");
      this.bL = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$4 = $$0.l("Team");
         ffn $$5 = this.dV().R();
         ffi $$6 = $$5.b($$4);
         boolean $$7 = $$6 != null && $$5.a(this.cH(), $$6);
         if (!$$7) {
            a.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$4);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         iu $$8 = new iu($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$8);
         this.al.a(aq, bxo.c);
         if (!this.ak) {
            this.a($$8);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bs = this.a(new Dynamic(un.a, $$0.c("Brain")));
      }

      this.ba = bwj.b($$0, "last_hurt_by_player");
      this.bb = $$0.h("last_hurt_by_player_memory_time");
      this.bK = bwj.b($$0, "last_hurt_by_mob");
      this.bL = $$0.h("ticks_since_last_hurt_by_mob") + this.af;
   }

   protected void ex() {
      if (this.dV() instanceof arq $$0) {
         Iterator<je<bvf>> $$1 = this.bG.keySet().iterator();

         try {
            while ($$1.hasNext()) {
               je<bvf> $$2 = $$1.next();
               bvh $$3 = this.bG.get($$2);
               if (!$$3.a($$0, this, () -> this.a($$3, true, null))) {
                  $$1.remove();
                  this.c(List.of($$3));
               } else if ($$3.d() % 600 == 0) {
                  this.a($$3, false, null);
               }
            }
         } catch (ConcurrentModificationException var6) {
         }

         if (this.bJ) {
            this.K();
            this.q();
            this.bJ = false;
         }
      } else {
         for (bvh $$4 : this.bG.values()) {
            $$4.i();
         }

         List<lv> $$5 = this.al.a(by);
         if (!$$5.isEmpty()) {
            boolean $$6 = this.al.a(bz);
            int $$7 = this.cp() ? 15 : 4;
            int $$8 = $$6 ? 5 : 1;
            if (this.ae.a($$7 * $$8) == 0) {
               this.dV().a(af.a($$5, this.ae), this.d(0.5), this.dD(), this.g(0.5), 1.0, 1.0, 1.0);
            }
         }
      }
   }

   protected void K() {
      if (this.bG.isEmpty()) {
         this.eA();
         this.k(false);
      } else {
         this.k(this.b(bvj.n));
         this.j();
      }
   }

   private void j() {
      List<lv> $$0 = this.bG.values().stream().filter(bvh::g).map(bvh::a).toList();
      this.al.a(by, $$0);
      this.al.a(bz, d(this.bG.values()));
   }

   private void q() {
      boolean $$0 = this.co();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable bwd $$0) {
      double $$1 = 1.0;
      if (this.cg()) {
         $$1 *= 0.8;
      }

      if (this.cp()) {
         float $$2 = this.fc();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cyy $$3 = this.a(bwn.f);
         bwm<?> $$4 = $$0.aq();
         if ($$4 == bwm.bf && $$3.a(czc.vq)
            || $$4 == bwm.bO && $$3.a(czc.vt)
            || $$4 == bwm.aR && $$3.a(czc.vw)
            || $$4 == bwm.aS && $$3.a(czc.vw)
            || $$4 == bwm.E && $$3.a(czc.vu)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bxc $$0) {
      return $$0 instanceof cqy && this.dV().an() == bty.a ? false : $$0.ey();
   }

   public boolean ey() {
      return !this.cC() && this.ez();
   }

   public boolean ez() {
      return !this.U_() && this.bK();
   }

   public static boolean d(Collection<bvh> $$0) {
      for (bvh $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void eA() {
      this.al.a(by, List.of());
   }

   public boolean eB() {
      if (this.dV().C) {
         return false;
      } else if (this.bG.isEmpty()) {
         return false;
      } else {
         Map<je<bvf>, bvh> $$0 = Maps.newHashMap(this.bG);
         this.bG.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<bvh> eC() {
      return this.bG.values();
   }

   public Map<je<bvf>, bvh> eD() {
      return this.bG;
   }

   public boolean b(je<bvf> $$0) {
      return this.bG.containsKey($$0);
   }

   @Nullable
   public bvh c(je<bvf> $$0) {
      return this.bG.get($$0);
   }

   public float a(je<bvf> $$0, float $$1) {
      bvh $$2 = this.c($$0);
      return $$2 != null ? $$2.a(this, $$1) : 0.0F;
   }

   public final boolean a(bvh $$0) {
      return this.b($$0, null);
   }

   public boolean b(bvh $$0, @Nullable bwd $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         bvh $$2 = this.bG.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bG.put($$0.c(), $$0);
            this.a($$0, $$1);
            $$3 = true;
            $$0.b(this);
         } else if ($$2.b($$0)) {
            this.a($$2, true, $$1);
            $$3 = true;
         }

         $$0.a(this);
         return $$3;
      }
   }

   public boolean b(bvh $$0) {
      if (this.aq().a(axf.G)) {
         return !$$0.a(bvj.M);
      } else if (this.aq().a(axf.F)) {
         return !$$0.a(bvj.L);
      } else {
         return !this.aq().a(axf.w) ? true : !$$0.a(bvj.j) && !$$0.a(bvj.s);
      }
   }

   public void c(bvh $$0, @Nullable bwd $$1) {
      if (this.b($$0)) {
         bvh $$2 = this.bG.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eE() {
      return this.aq().a(axf.x);
   }

   @Nullable
   public final bvh d(je<bvf> $$0) {
      return this.bG.remove($$0);
   }

   public boolean e(je<bvf> $$0) {
      bvh $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(bvh $$0, @Nullable bwd $$1) {
      if (!this.dV().C) {
         this.bJ = true;
         $$0.c().a().a(this.eZ(), $$0.e());
         this.c($$0);
      }
   }

   public void c(bvh $$0) {
      for (bwd $$1 : this.cY()) {
         if ($$1 instanceof arr $$2) {
            $$2.f.b(new agi(this.ar(), $$0, false));
         }
      }
   }

   protected void a(bvh $$0, boolean $$1, @Nullable bwd $$2) {
      if (!this.dV().C) {
         this.bJ = true;
         if ($$1) {
            bvf $$3 = $$0.c().a();
            $$3.a(this.eZ());
            $$3.a(this.eZ(), $$0.e());
            this.u();
         }

         this.c($$0);
      }
   }

   protected void c(Collection<bvh> $$0) {
      if (!this.dV().C) {
         this.bJ = true;

         for (bvh $$1 : $$0) {
            $$1.c().a().a(this.eZ());

            for (bwd $$2 : this.cY()) {
               if ($$2 instanceof arr $$3) {
                  $$3.f.b(new aek(this.ar(), $$1.c()));
               }
            }
         }

         this.u();
      }
   }

   private void u() {
      Set<bye> $$0 = this.eZ().b();

      for (bye $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(je<byd> $$0) {
      if ($$0.a(byi.s)) {
         float $$1 = this.eT();
         if (this.eF() > $$1) {
            this.d($$1);
         }
      } else if ($$0.a(byi.r)) {
         float $$2 = this.eU();
         if (this.fv() > $$2) {
            this.E($$2);
         }
      } else if ($$0.a(byi.y)) {
         this.i_();
      }
   }

   public void c(float $$0) {
      float $$1 = this.eF();
      if ($$1 > 0.0F) {
         this.d($$1 + $$0);
      }
   }

   public float eF() {
      return this.al.a(bx);
   }

   public void d(float $$0) {
      this.al.a(bx, azm.a($$0, 0.0F, this.eT()));
   }

   public boolean eG() {
      return this.eF() <= 0.0F;
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.eG()) {
         return false;
      } else if ($$1.a(axd.i) && this.b(bvj.l)) {
         return false;
      } else {
         if (this.fQ()) {
            this.fR();
         }

         this.bd = 0;
         if ($$2 < 0.0F) {
            $$2 = 0.0F;
         }

         float $$4 = this.b($$0, $$1, $$2);
         $$2 -= $$4;
         boolean $$5 = $$4 > 0.0F;
         if ($$1.a(axd.o) && this.aq().a(axf.l)) {
            $$2 *= 5.0F;
         }

         if ($$1.a(axd.a) && !this.a(bwn.f).f()) {
            this.d($$1, $$2);
            $$2 *= 0.75F;
         }

         if (Float.isNaN($$2) || Float.isInfinite($$2)) {
            $$2 = Float.MAX_VALUE;
         }

         boolean $$6 = true;
         if ((float)this.aj > 10.0F && !$$1.a(axd.e)) {
            if ($$2 <= this.be) {
               return false;
            }

            this.c($$0, $$1, $$2 - this.be);
            this.be = $$2;
            $$6 = false;
         } else {
            this.be = $$2;
            this.aj = 20;
            this.c($$0, $$1, $$2);
            this.aO = 10;
            this.aN = this.aO;
         }

         this.f($$1);
         this.g($$1);
         if ($$6) {
            daz $$7 = this.fA().a(kj.I);
            if ($$5 && $$7 != null) {
               $$7.a($$0, this);
            } else {
               $$0.a(this, $$1);
            }

            if (!$$1.a(axd.r) && (!$$5 || $$2 > 0.0F)) {
               this.bC();
            }

            if (!$$1.a(axd.z)) {
               double $$8 = 0.0;
               double $$9 = 0.0;
               if ($$1.c() instanceof crs $$10) {
                  DoubleDoubleImmutablePair $$11 = $$10.a_(this, $$1);
                  $$8 = -$$11.leftDouble();
                  $$9 = -$$11.rightDouble();
               } else if ($$1.i() != null) {
                  $$8 = $$1.i().a() - this.dA();
                  $$9 = $$1.i().c() - this.dG();
               }

               this.p(0.4F, $$8, $$9);
               if (!$$5) {
                  this.a($$8, $$9);
               }
            }
         }

         if (this.eG()) {
            if (!this.j($$1)) {
               if ($$6) {
                  this.b(this.l_());
                  this.i($$1);
               }

               this.a($$1);
            }
         } else if ($$6) {
            this.h($$1);
            this.i($$1);
         }

         boolean $$12 = !$$5 || $$2 > 0.0F;
         if ($$12) {
            this.bT = $$1;
            this.bU = this.dV().ae();

            for (bvh $$13 : this.eC()) {
               $$13.a($$0, this, $$1, $$2);
            }
         }

         if (this instanceof arr $$14) {
            ap.i.a($$14, $$1, $$2, $$2, $$5);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               $$14.a(awx.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$1.d() instanceof arr $$15) {
            ap.h.a($$15, this, $$1, $$2, $$2, $$5);
         }

         return $$12;
      }
   }

   public float b(arq $$0, bus $$1, float $$2) {
      if ($$2 <= 0.0F) {
         return 0.0F;
      } else {
         cyy $$3 = this.fG();
         if ($$3 == null) {
            return 0.0F;
         } else {
            daz $$4 = $$3.a(kj.I);
            if ($$4 != null && !$$4.f().map($$1::a).orElse(false)) {
               if ($$1.c() instanceof crf $$5 && $$5.u() > 0) {
                  return 0.0F;
               }

               fei $$6 = $$1.i();
               double $$9;
               if ($$6 != null) {
                  fei $$7 = this.d(0.0F, this.cA());
                  fei $$8 = $$6.d(this.dt());
                  $$8 = new fei($$8.d, 0.0, $$8.f).d();
                  $$9 = Math.acos($$8.b($$7));
               } else {
                  $$9 = 0.0;
               }

               float $$11 = $$4.a($$1, $$2, $$9);
               $$4.a(this.dV(), $$3, this, this.fz(), $$11);
               if (!$$1.a(axd.j) && $$1.c() instanceof bxc $$13) {
                  this.b($$0, $$13);
               }

               return $$11;
            } else {
               return 0.0F;
            }
         }
      }
   }

   private void i(bus $$0) {
      if ($$0.a(buv.P)) {
         awo $$1 = this instanceof cqy ? awo.h : awo.f;
         this.dV().a(null, this.dt().d, this.dt().e, this.dt().f, awn.Ay, $$1);
      }
   }

   protected void f(bus $$0) {
      if ($$0.d() instanceof bxc $$1 && !$$0.a(axd.q) && (!$$0.a(buv.I) || !this.aq().a(axf.E))) {
         this.a($$1);
      }
   }

   @Nullable
   protected cqy g(bus $$0) {
      bwd $$1 = $$0.d();
      if ($$1 instanceof cqy $$2) {
         this.a($$2, 100);
      } else if ($$1 instanceof cka $$3 && $$3.q()) {
         if ($$3.d() != null) {
            this.a($$3.d().c(), 100);
         } else {
            this.ba = null;
            this.bb = 0;
         }
      }

      return bwj.a(this.ba, this.dV(), cqy.class);
   }

   protected void b(arq $$0, bxc $$1) {
      $$1.d(this);
   }

   protected void d(bxc $$0) {
      $$0.p(0.5, $$0.dA() - this.dA(), $$0.dG() - this.dG());
   }

   private boolean j(bus $$0) {
      if ($$0.a(axd.d)) {
         return false;
      } else {
         cyy $$1 = null;
         dbj $$2 = null;

         for (bua $$3 : bua.values()) {
            cyy $$4 = this.b($$3);
            $$2 = $$4.a(kj.H);
            if ($$2 != null) {
               $$1 = $$4.v();
               $$4.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof arr $$5) {
               $$5.b(awx.c.b($$1.h()));
               ap.C.a($$5, $$1);
               this.a(eez.C);
            }

            this.d(1.0F);
            $$2.a($$1, this);
            this.dV().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public bus eH() {
      if (this.dV().ae() - this.bU > 40L) {
         this.bT = null;
      }

      return this.bT;
   }

   protected void h(bus $$0) {
      this.b(this.e($$0));
   }

   public void b(@Nullable awm $$0) {
      if ($$0 != null) {
         this.a($$0, this.fd(), this.fe());
      }
   }

   private void h(cyy $$0) {
      if (!$$0.f()) {
         je<awm> $$1 = $$0.a(kj.au);
         if ($$1 != null && !this.bb()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), $$1.a(), this.dm(), 0.8F, 0.8F + this.dV().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(bus $$0) {
      if (!this.dQ() && !this.bc) {
         bwd $$1 = $$0.d();
         bxc $$2 = this.eS();
         if ($$2 != null) {
            $$2.a(this, $$0);
         }

         if (this.fQ()) {
            this.fR();
         }

         if (!this.dV().C && this.h_()) {
            a.info("Named entity {} died: {}", this, this.eR().a().getString());
         }

         this.bc = true;
         this.eR().c();
         if (this.dV() instanceof arq $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(eez.p);
               this.b($$3, $$0);
               this.e($$2);
            }

            this.dV().a(this, (byte)3);
         }

         this.b(bxo.h);
      }
   }

   protected void e(@Nullable bxc $$0) {
      if (this.dV() instanceof arq $$1) {
         boolean var6 = false;
         if ($$0 instanceof cmq) {
            if ($$1.O().c(dir.c)) {
               iu $$4 = this.dv();
               dzz $$5 = dmc.cl.m();
               if (this.dV().a_($$4).l() && $$5.a((diy)this.dV(), $$4)) {
                  this.dV().a($$4, $$5, 3);
                  var6 = true;
               }
            }

            if (!var6) {
               cnd $$6 = new cnd(this.dV(), this.dA(), this.dC(), this.dG(), new cyy(czc.dH));
               this.dV().b($$6);
            }
         }
      }
   }

   protected void b(arq $$0, bus $$1) {
      boolean $$2 = this.bb > 0;
      if (this.eo() && $$0.O().c(dir.f)) {
         this.b($$0, $$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.f($$0);
      this.b($$0, $$1.d());
   }

   protected void f(arq $$0) {
   }

   protected void b(arq $$0, @Nullable bwd $$1) {
      if (!this.eK() && (this.ep() || this.bb > 0 && this.en() && $$0.O().c(dir.f))) {
         bwr.a($$0, this.dt(), this.a($$0, $$1));
      }
   }

   protected void a(arq $$0, bus $$1, boolean $$2) {
   }

   public long eI() {
      return 0L;
   }

   protected float b(bwd $$0, bus $$1) {
      float $$2 = (float)this.h(byi.d);
      return this.dV() instanceof arq $$3 ? dfn.d($$3, this.dZ(), $$0, $$1, $$2) : $$2;
   }

   protected void b(arq $$0, bus $$1, boolean $$2) {
      Optional<alf<eze>> $$3 = this.ea();
      if (!$$3.isEmpty()) {
         eze $$4 = $$0.p().bc().b($$3.get());
         ezc.a $$5 = new ezc.a($$0).a(fbt.a, this).a(fbt.f, this.dt()).a(fbt.c, $$1).b(fbt.d, $$1.d()).b(fbt.e, $$1.c());
         cqy $$6 = this.er();
         if ($$2 && $$6 != null) {
            $$5 = $$5.a(fbt.b, $$6).a($$6.eg());
         }

         ezc $$7 = $$5.a(fbs.g);
         $$4.a($$7, this.eI(), $$1x -> this.a($$0, $$1x));
      }
   }

   public boolean a(arq $$0, alf<eze> $$1, BiConsumer<arq, cyy> $$2) {
      return this.a($$0, $$1, $$0x -> $$0x.a(fbt.f, this.dt()).a(fbt.a, this).a(fbs.j), $$2);
   }

   protected void a(arq $$0, alf<eze> $$1, cyy $$2, BiConsumer<arq, cyy> $$3) {
      this.a($$0, $$1, $$1x -> $$1x.a(fbt.f, this.dt()).a(fbt.a, this).a(fbt.i, $$2).a(fbs.s), $$3);
   }

   protected boolean a(arq $$0, alf<eze> $$1, Function<ezc.a, ezc> $$2, BiConsumer<arq, cyy> $$3) {
      eze $$4 = $$0.p().bc().b($$1);
      ezc $$5 = $$2.apply(new ezc.a($$0));
      List<cyy> $$6 = $$4.a($$5);
      if (!$$6.isEmpty()) {
         $$6.forEach($$2x -> $$3.accept($$0, $$2x));
         return true;
      } else {
         return false;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(byi.p);
      if (!($$0 <= 0.0)) {
         this.ar = true;
         fei $$3 = this.dy();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         fei $$4 = new fei($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aJ() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected awm e(bus $$0) {
      return awn.kH;
   }

   @Nullable
   protected awm l_() {
      return awn.kC;
   }

   private awm q(int $$0) {
      return $$0 > 4 ? this.eN().b() : this.eN().a();
   }

   public void eJ() {
      this.bX = true;
   }

   public boolean eK() {
      return this.bX;
   }

   public float eL() {
      return 0.0F;
   }

   protected fed eM() {
      fed $$0 = this.cR();
      bwd $$1 = this.dk();
      if ($$1 != null) {
         fei $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dfl, Set<dgd>> c(bwn $$0) {
      return (Map<dfl, Set<dgd>>)this.bY.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public bxc.a eN() {
      return new bxc.a(awn.kI, awn.kA);
   }

   public Optional<iu> eO() {
      return this.bS;
   }

   public boolean d_() {
      if (this.U_()) {
         return false;
      } else {
         iu $$0 = this.dv();
         dzz $$1 = this.dw();
         if ($$1.a(axc.aS)) {
            this.bS = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof duz && this.c($$0, $$1)) {
            this.bS = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(iu $$0, dzz $$1) {
      if (!$$1.c(duz.b)) {
         return false;
      } else {
         dzz $$2 = this.dV().a_($$0.e());
         return $$2.a(dmc.cY) && $$2.c(dqk.b) == $$1.c(duz.e);
      }
   }

   @Override
   public boolean bK() {
      return !this.dQ() && this.eF() > 0.0F;
   }

   public boolean a(bxc $$0, double $$1, boolean $$2, boolean $$3, double... $$4) {
      fei $$5 = $$0.h(1.0F).d();

      for (double $$6 : $$4) {
         fei $$7 = new fei(this.dA() - $$0.dA(), $$6 - $$0.dE(), this.dG() - $$0.dG());
         double $$8 = $$7.g();
         $$7 = $$7.d();
         double $$9 = $$5.b($$7);
         if ($$9 > 1.0 - $$1 / ($$2 ? $$8 : 1.0) && $$0.a(this, $$3 ? die.a.c : die.a.a, die.b.a, $$6)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public int cE() {
      return this.y(0.0F);
   }

   protected final int y(float $$0) {
      return azm.d($$0 + 3.0F);
   }

   @Override
   public boolean a(double $$0, float $$1, bus $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.a($$0, $$1);
      if ($$4 > 0) {
         this.a(this.q($$4), 1.0F, 1.0F);
         this.eP();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int a(double $$0, float $$1) {
      if (this.aq().a(axf.o)) {
         return 0;
      } else {
         double $$2 = this.h($$0);
         return azm.a($$2 * (double)$$1 * this.h(byi.k));
      }
   }

   private double h(double $$0) {
      return $$0 + 1.0E-6 - this.h(byi.x);
   }

   protected void eP() {
      if (!this.bb()) {
         int $$0 = azm.a(this.dA());
         int $$1 = azm.a(this.dC() - 0.2F);
         int $$2 = azm.a(this.dG());
         dzz $$3 = this.dV().a_(new iu($$0, $$1, $$2));
         if (!$$3.l()) {
            dtv $$4 = $$3.A();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void q(float $$0) {
      this.aO = 10;
      this.aN = this.aO;
   }

   public int eQ() {
      return azm.a(this.h(byi.a));
   }

   protected void c(bus $$0, float $$1) {
   }

   protected void d(bus $$0, float $$1) {
   }

   protected void a(bus $$0, float $$1, bwn... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bwn $$4 : $$2) {
            cyy $$5 = this.a($$4);
            dhh $$6 = $$5.a(kj.D);
            if ($$6 != null && $$6.i() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float e(bus $$0, float $$1) {
      if (!$$0.a(axd.b)) {
         this.c($$0, $$1);
         $$1 = buo.a(this, $$1, $$0, (float)this.eQ(), (float)this.h(byi.b));
      }

      return $$1;
   }

   protected float f(bus $$0, float $$1) {
      if ($$0.a(axd.f)) {
         return $$1;
      } else {
         if (this.b(bvj.k) && !$$0.a(axd.g)) {
            int $$2 = (this.c(bvj.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof arr) {
                  ((arr)this).a(awx.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof arr) {
                  ((arr)$$0.d()).a(awx.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(axd.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dV() instanceof arq $$7) {
               $$8 = dfn.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = buo.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void c(arq $$0, bus $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var10 = Math.max($$2 - this.fv(), 0.0F);
         this.E(this.fv() - ($$2 - var10));
         float $$4 = $$2 - var10;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F && $$1.d() instanceof arr $$5) {
            $$5.a(awx.H, Math.round($$4 * 10.0F));
         }

         if (var10 != 0.0F) {
            this.eR().a($$1, var10);
            this.d(this.eF() - var10);
            this.E(this.fv() - var10);
            this.a(eez.o);
         }
      }
   }

   public bup eR() {
      return this.bF;
   }

   @Nullable
   public bxc eS() {
      if (this.ba != null) {
         return this.ba.a(this.dV(), cqy.class);
      } else {
         return this.bK != null ? this.bK.a(this.dV(), bxc.class) : null;
      }
   }

   public final float eT() {
      return (float)this.h(byi.s);
   }

   public final float eU() {
      return (float)this.h(byi.r);
   }

   public final int eV() {
      return this.al.a(bA);
   }

   public final void o(int $$0) {
      this.al.a(bA, $$0);
   }

   public final int eW() {
      return this.al.a(bB);
   }

   public final void p(int $$0) {
      this.al.a(bB, $$0);
   }

   private int D() {
      if (bvi.a(this)) {
         return 6 - (1 + bvi.b(this));
      } else {
         return this.b(bvj.d) ? 6 + (1 + this.c(bvj.d).e()) * 2 : 6;
      }
   }

   public void a(bua $$0) {
      this.a($$0, false);
   }

   public void a(bua $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.D() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dV() instanceof arq) {
            abw $$2 = new abw(this, $$0 == bua.a ? 0 : 3);
            arn $$3 = ((arq)this.dV()).m();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bus $$0) {
      this.aT.a(1.5F);
      this.aj = 20;
      this.aO = 10;
      this.aN = this.aO;
      awm $$1 = this.e($$0);
      if ($$1 != null) {
         this.a($$1, this.fd(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }

      this.bT = $$0;
      this.bU = this.dV().ae();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            awm $$1 = this.l_();
            if ($$1 != null) {
               this.a($$1, this.fd(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cqy)) {
               this.d(0.0F);
               this.a(this.dW().p());
            }
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ae.i() - 0.5F) * 0.2F;
               float $$6 = (this.ae.i() - 0.5F) * 0.2F;
               float $$7 = (this.ae.i() - 0.5F) * 0.2F;
               double $$8 = azm.d($$4, this.K, this.dA()) + (this.ae.j() - 0.5) * (double)this.dq() * 2.0;
               double $$9 = azm.d($$4, this.L, this.dC()) + this.ae.j() * (double)this.dr();
               double $$10 = azm.d($$4, this.M, this.dG()) + (this.ae.j() - 0.5) * (double)this.dq() * 2.0;
               this.dV().a(lx.af, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.h(this.a(bwn.a));
            break;
         case 48:
            this.h(this.a(bwn.b));
            break;
         case 49:
            this.h(this.a(bwn.f));
            break;
         case 50:
            this.h(this.a(bwn.e));
            break;
         case 51:
            this.h(this.a(bwn.d));
            break;
         case 52:
            this.h(this.a(bwn.c));
            break;
         case 54:
            dpy.b(this);
            break;
         case 55:
            this.F();
            break;
         case 60:
            this.eX();
            break;
         case 65:
            this.h(this.a(bwn.g));
            break;
         case 67:
            this.E();
            break;
         case 68:
            this.h(this.a(bwn.h));
            break;
         default:
            super.b($$0);
      }
   }

   public void eX() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ae.k() * 0.02;
         double $$2 = this.ae.k() * 0.02;
         double $$3 = this.ae.k() * 0.02;
         double $$4 = 10.0;
         this.dV().a(lx.ae, this.d(1.0) - $$1 * 10.0, this.dD() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
      }
   }

   private void E() {
      fei $$0 = this.dy();

      for (int $$1 = 0; $$1 < 8; $$1++) {
         double $$2 = this.ae.a(0.0, 1.0);
         double $$3 = this.ae.a(0.0, 1.0);
         double $$4 = this.ae.a(0.0, 1.0);
         this.dV().a(lx.d, this.dA() + $$2, this.dC() + $$3, this.dG() + $$4, $$0.d, $$0.e, $$0.f);
      }
   }

   private void F() {
      cyy $$0 = this.a(bwn.b);
      this.a(bwn.b, this.a(bwn.a));
      this.a(bwn.a, $$0);
   }

   @Override
   protected void aI() {
      this.a(this.dW().o(), 4.0F);
   }

   protected void eY() {
      int $$0 = this.D();
      if (this.aI) {
         this.aK++;
         if (this.aK >= $$0) {
            this.aK = 0;
            this.aI = false;
         }
      } else {
         this.aK = 0;
      }

      this.aR = (float)this.aK / (float)$$0;
   }

   @Nullable
   public bye g(je<byd> $$0) {
      return this.eZ().a($$0);
   }

   public double h(je<byd> $$0) {
      return this.eZ().c($$0);
   }

   public double i(je<byd> $$0) {
      return this.eZ().d($$0);
   }

   public byf eZ() {
      return this.bE;
   }

   public cyy fa() {
      return this.a(bwn.a);
   }

   public cyy fb() {
      return this.a(bwn.b);
   }

   public cyy a(bwv $$0) {
      return this.fx() == $$0 ? this.fa() : this.fb();
   }

   @Nonnull
   @Override
   public cyy dZ() {
      return this.fa();
   }

   public boolean b(cyu $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cyy> $$0) {
      return $$0.test(this.fa()) || $$0.test(this.fb());
   }

   public cyy b(bua $$0) {
      if ($$0 == bua.a) {
         return this.a(bwn.a);
      } else if ($$0 == bua.b) {
         return this.a(bwn.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bua $$0, cyy $$1) {
      if ($$0 == bua.a) {
         this.a(bwn.a, $$1);
      } else {
         if ($$0 != bua.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bwn.b, $$1);
      }
   }

   public boolean d(bwn $$0) {
      return !this.a($$0).f();
   }

   public boolean e(bwn $$0) {
      return true;
   }

   public abstract cyy a(bwn var1);

   public abstract void a(bwn var1, cyy var2);

   protected void d(cyy $$0) {
      $$0.h().l($$0);
   }

   public float fc() {
      int $$0 = 0;
      int $$1 = 0;

      for (bwn $$2 : bwo.i) {
         if ($$2.a() == bwn.a.b) {
            cyy $$3 = this.a($$2);
            if (!$$3.f()) {
               $$1++;
            }

            $$0++;
         }
      }

      return $$0 > 0 ? (float)$$1 / (float)$$0 : 0.0F;
   }

   @Override
   public void h(boolean $$0) {
      super.h($$0);
      bye $$1 = this.g(byi.v);
      $$1.c(k.a());
      if ($$0) {
         $$1.b(k);
      }
   }

   protected float fd() {
      return 1.0F;
   }

   public float fe() {
      return this.n_() ? (this.ae.i() - this.ae.i()) * 0.2F + 1.5F : (this.ae.i() - this.ae.i()) * 0.2F + 1.0F;
   }

   protected boolean ff() {
      return this.eG();
   }

   @Override
   public void h(bwd $$0) {
      if (!this.fQ()) {
         super.h($$0);
      }
   }

   private void c(bwd $$0) {
      fei $$1;
      if (this.dQ()) {
         $$1 = this.dt();
      } else if (!$$0.dQ() && !this.dV().a_($$0.dv()).a(axc.aM)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dC(), $$0.dC());
         $$1 = new fei(this.dA(), $$2, this.dG());
         boolean $$4 = this.dq() <= 4.0F && this.dr() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.dr() / 2.0;
            fei $$6 = $$1.b(0.0, $$5, 0.0);
            ffc $$7 = fez.a(fed.a($$6, (double)this.dq(), (double)this.dr(), (double)this.dq()));
            $$1 = this.dV().a(this, $$7, $$6, (double)this.dq(), (double)this.dr(), (double)this.dq()).map($$1x -> $$1x.b(0.0, -$$5, 0.0)).orElse($$1);
         }
      }

      this.a($$1.d, $$1.e, $$1.f);
   }

   @Override
   public boolean cM() {
      return this.cL();
   }

   protected float fg() {
      return this.z(1.0F);
   }

   protected float z(float $$0) {
      return (float)this.h(byi.o) * $$0 * this.aS() + this.fh();
   }

   public float fh() {
      return this.b(bvj.h) ? 0.1F * ((float)this.c(bvj.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void s() {
      float $$0 = this.fg();
      if (!($$0 <= 1.0E-5F)) {
         fei $$1 = this.dy();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.cj()) {
            float $$2 = this.dL() * (float) (Math.PI / 180.0);
            this.j(new fei((double)(-azm.a($$2)) * 0.2, 0.0, (double)azm.b($$2) * 0.2));
         }

         this.ar = true;
      }
   }

   protected void fi() {
      this.i(this.dy().b(0.0, -0.04F, 0.0));
   }

   protected void c(axr<ewf> $$0) {
      this.i(this.dy().b(0.0, 0.04F, 0.0));
   }

   protected float fj() {
      return 0.8F;
   }

   public boolean a(ewg $$0) {
      return false;
   }

   @Override
   protected double bd() {
      return this.h(byi.n);
   }

   protected double fk() {
      boolean $$0 = this.dy().e <= 0.0;
      return $$0 && this.b(bvj.B) ? Math.min(this.be(), 0.01) : this.be();
   }

   public void a_(fei $$0) {
      ewg $$1 = this.dV().b_(this.dv());
      if ((this.bj() || this.bw()) && this.el() && !this.a($$1)) {
         this.m($$0);
      } else if (this.fI()) {
         this.n($$0);
      } else {
         this.l($$0);
      }
   }

   private void l(fei $$0) {
      iu $$1 = this.aQ();
      float $$2 = this.aJ() ? this.dV().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      fei $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      bvh $$6 = this.c(bvj.y);
      if ($$6 != null) {
         $$5 += (0.05 * (double)($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.dV().C || this.dV().C($$1)) {
         $$5 -= this.fk();
      } else if (this.dC() > (double)this.dV().G_()) {
         $$5 = -0.1;
      } else {
         $$5 = 0.0;
      }

      if (this.ew()) {
         this.n($$4.d, $$5, $$4.f);
      } else {
         float $$7 = this instanceof cje ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void m(fei $$0) {
      boolean $$1 = this.dy().e <= 0.0;
      double $$2 = this.dC();
      double $$3 = this.fk();
      if (this.bj()) {
         float $$4 = this.cj() ? 0.9F : this.fj();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(byi.F);
         if (!this.aJ()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fn() - $$5) * $$6;
         }

         if (this.b(bvj.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bxg.a, this.dy());
         fei $$7 = this.dy();
         if (this.P && this.d_()) {
            $$7 = new fei($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.i(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bxg.a, this.dy());
         if (this.b(axh.b) <= this.dp()) {
            this.i(this.dy().d(0.5, 0.8F, 0.5));
            fei $$8 = this.a($$3, $$1, this.dy());
            this.i($$8);
         } else {
            this.i(this.dy().c(0.5));
         }

         if ($$3 != 0.0) {
            this.i(this.dy().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      fei $$9 = this.dy();
      if (this.P && this.g($$9.d, $$9.e + 0.6F - this.dC() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void n(fei $$0) {
      if (this.d_()) {
         this.l($$0);
         this.fl();
      } else {
         fei $$1 = this.dy();
         double $$2 = $$1.i();
         this.i(this.o($$1));
         this.a(bxg.a, this.dy());
         if (!this.dV().C) {
            double $$3 = this.dy().i();
            this.c($$2, $$3);
         }
      }
   }

   public void fl() {
      this.b(7, true);
      this.b(7, false);
   }

   private fei o(fei $$0) {
      fei $$1 = this.bT();
      float $$2 = this.dN() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fk();
      double $$6 = azm.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-azm.a($$2)) * 0.04;
         $$0 = $$0.b(-$$1.d * $$8 / $$3, $$8 * 3.2, -$$1.f * $$8 / $$3);
      }

      if ($$3 > 0.0) {
         $$0 = $$0.b(($$1.d / $$3 * $$4 - $$0.d) * 0.1, 0.0, ($$1.f / $$3 * $$4 - $$0.f) * 0.1);
      }

      return $$0.d(0.99F, 0.98F, 0.99F);
   }

   private void c(double $$0, double $$1) {
      if (this.P) {
         double $$2 = $$0 - $$1;
         float $$3 = (float)($$2 * 10.0 - 3.0);
         if ($$3 > 0.0F) {
            this.a(this.q((int)$$3), 1.0F, 1.0F);
            this.a(this.dW().n(), $$3);
         }
      }
   }

   private void c(cqy $$0, fei $$1) {
      fei $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.di()) {
         this.B(this.c($$0));
         this.a_($$2);
      } else {
         this.i(fei.c);
      }
   }

   protected void a(cqy $$0, fei $$1) {
   }

   protected fei b(cqy $$0, fei $$1) {
      return $$1;
   }

   protected float c(cqy $$0) {
      return this.fn();
   }

   public void r(boolean $$0) {
      float $$1 = (float)azm.g(this.dA() - this.K, $$0 ? this.dC() - this.L : 0.0, this.dG() - this.M);
      if (!this.bZ() && this.bK()) {
         this.A($$1);
      } else {
         this.aT.a();
      }
   }

   protected void A(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aT.a($$1, 0.4F, this.n_() ? 3.0F : 1.0F);
   }

   private fei a(fei $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.i(this.p(this.dy()));
      this.a(bxg.a, this.dy());
      fei $$2 = this.dy();
      if ((this.P || this.bf) && (this.d_() || this.dw().a(dmc.ru) && dsa.a(this))) {
         $$2 = new fei($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public fei a(double $$0, boolean $$1, fei $$2) {
      if ($$0 != 0.0 && !this.cj()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new fei($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private fei p(fei $$0) {
      if (this.d_()) {
         this.k();
         float $$1 = 0.15F;
         double $$2 = azm.a($$0.d, -0.15F, 0.15F);
         double $$3 = azm.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dw().a(dmc.ov) && this.fH() && this instanceof cqy) {
            $$4 = 0.0;
         }

         $$0 = new fei($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aJ() ? this.fn() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fm();
   }

   protected float fm() {
      return this.cW() instanceof cqy ? this.fn() * 0.1F : 0.02F;
   }

   public float fn() {
      return this.bO;
   }

   public void B(float $$0) {
      this.bO = $$0;
   }

   public boolean c(arq $$0, bwd $$1) {
      this.B($$1);
      return false;
   }

   @Override
   public void h() {
      super.h();
      this.I();
      this.J();
      if (!this.dV().C) {
         int $$0 = this.eV();
         if ($$0 > 0) {
            if (this.aL <= 0) {
               this.aL = 20 * (30 - $$0);
            }

            this.aL--;
            if (this.aL <= 0) {
               this.o($$0 - 1);
            }
         }

         int $$1 = this.eW();
         if ($$1 > 0) {
            if (this.aM <= 0) {
               this.aM = 20 * (30 - $$1);
            }

            this.aM--;
            if (this.aM <= 0) {
               this.p($$1 - 1);
            }
         }

         this.G();
         if (this.af % 20 == 0) {
            this.eR().c();
         }

         if (this.fQ() && !this.L()) {
            this.fR();
         }
      }

      if (!this.dQ()) {
         this.k_();
      }

      double $$2 = this.dA() - this.K;
      double $$3 = this.dG() - this.M;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aV;
      if ($$4 > 0.0025000002F) {
         float $$6 = (float)azm.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$7 = azm.e(azm.h(this.dL()) - $$6);
         if (95.0F < $$7 && $$7 < 265.0F) {
            $$5 = $$6 - 180.0F;
         } else {
            $$5 = $$6;
         }
      }

      if (this.aR > 0.0F) {
         $$5 = this.dL();
      }

      bqm $$8 = bql.a();
      $$8.a("headTurn");
      this.C($$5);
      $$8.c();
      $$8.a("rangeChecks");

      while (this.dL() - this.N < -180.0F) {
         this.N -= 360.0F;
      }

      while (this.dL() - this.N >= 180.0F) {
         this.N += 360.0F;
      }

      while (this.aV - this.aW < -180.0F) {
         this.aW -= 360.0F;
      }

      while (this.aV - this.aW >= 180.0F) {
         this.aW += 360.0F;
      }

      while (this.dN() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dN() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aX - this.aY < -180.0F) {
         this.aY -= 360.0F;
      }

      while (this.aX - this.aY >= 180.0F) {
         this.aY += 360.0F;
      }

      $$8.c();
      if (this.fI()) {
         this.bo++;
      } else {
         this.bo = 0;
      }

      if (this.fQ()) {
         this.x(0.0F);
      }

      this.u();
      this.aZ.a();
   }

   private void G() {
      Map<bwn, cyy> $$0 = this.H();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bwn, cyy> H() {
      Map<bwn, cyy> $$0 = null;

      for (bwn $$1 : bwn.j) {
         cyy $$2 = this.bH.get($$1);
         cyy $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bwn.class);
            }

            $$0.put($$1, $$3);
            byf $$4 = this.eZ();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<bwn, cyy> $$5 : $$0.entrySet()) {
            bwn $$6 = $$5.getKey();
            cyy $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1x) -> {
                  bye $$2 = this.bE.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1x.a());
                     $$2.b($$1x);
                  }
               });
               if (this.dV() instanceof arq $$8) {
                  dfn.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(cyy $$0, cyy $$1) {
      return !cyy.a($$1, $$0);
   }

   private void a(Map<bwn, cyy> $$0) {
      cyy $$1 = $$0.get(bwn.a);
      cyy $$2 = $$0.get(bwn.b);
      if ($$1 != null && $$2 != null && cyy.a($$1, this.bH.get(bwn.b)) && cyy.a($$2, this.bH.get(bwn.a))) {
         ((arq)this.dV()).m().b(this, new acx(this, (byte)55));
         $$0.remove(bwn.a);
         $$0.remove(bwn.b);
         this.bH.put(bwn.a, $$1.v());
         this.bH.put(bwn.b, $$2.v());
      }
   }

   private void b(Map<bwn, cyy> $$0) {
      List<Pair<bwn, cyy>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cyy $$3 = $$2.v();
         $$1.add(Pair.of($$1x, $$3));
         this.bH.put($$1x, $$3);
      });
      ((arq)this.dV()).m().b(this, new afg(this.ar(), $$1));
   }

   protected void C(float $$0) {
      float $$1 = azm.h($$0 - this.aV);
      this.aV += $$1 * 0.3F;
      float $$2 = azm.h(this.dL() - this.aV);
      float $$3 = this.fo();
      if (Math.abs($$2) > $$3) {
         this.aV = this.aV + ($$2 - (float)azm.j((double)$$2) * $$3);
      }
   }

   protected float fo() {
      return 50.0F;
   }

   public void k_() {
      if (this.bP > 0) {
         this.bP--;
      }

      if (this.bR()) {
         this.N_().e();
      } else if (!this.di()) {
         this.i(this.dy().c(0.98));
      }

      if (this.bl > 0) {
         this.a(this.bl, this.bk);
         this.bl--;
      }

      fei $$0 = this.dy();
      double $$1 = $$0.d;
      double $$2 = $$0.e;
      double $$3 = $$0.f;
      if (this.aq().equals(bwm.bS)) {
         if ($$0.j() < 9.0E-6) {
            $$1 = 0.0;
            $$3 = 0.0;
         }
      } else {
         if (Math.abs($$0.d) < 0.003) {
            $$1 = 0.0;
         }

         if (Math.abs($$0.f) < 0.003) {
            $$3 = 0.0;
         }
      }

      if (Math.abs($$0.e) < 0.003) {
         $$2 = 0.0;
      }

      this.n($$1, $$2, $$3);
      bqm $$4 = bql.a();
      $$4.a("ai");
      this.fp();
      if (this.ff()) {
         this.bf = false;
         this.bg = 0.0F;
         this.bi = 0.0F;
      } else if (this.dj() && !this.dV().C) {
         $$4.a("newAi");
         this.ft();
         $$4.c();
      }

      $$4.c();
      $$4.a("jump");
      if (this.bf && this.el()) {
         double $$5;
         if (this.bw()) {
            $$5 = this.b(axh.b);
         } else {
            $$5 = this.b(axh.a);
         }

         boolean $$7 = this.bj() && $$5 > 0.0;
         double $$8 = this.dp();
         if (!$$7 || this.aJ() && !($$5 > $$8)) {
            if (!this.bw() || this.aJ() && !($$5 > $$8)) {
               if ((this.aJ() || $$7 && $$5 <= $$8) && this.bP == 0) {
                  this.s();
                  this.bP = 10;
               }
            } else {
               this.c(axh.b);
            }
         } else {
            this.c(axh.a);
         }
      } else {
         this.bP = 0;
      }

      $$4.c();
      $$4.a("travel");
      if (this.fI()) {
         this.fr();
      }

      fed $$9 = this.cR();
      fei $$10 = new fei((double)this.bg, (double)this.bh, (double)this.bi);
      if (this.b(bvj.B) || this.b(bvj.y)) {
         this.k();
      }

      label126: {
         if (this.cW() instanceof cqy $$11 && this.bK()) {
            this.c($$11, $$10);
            break label126;
         }

         if (this.di()) {
            this.a_($$10);
         }
      }

      if (!this.dV().w_() || this.dg()) {
         this.aK();
      }

      if (this.dV().w_()) {
         this.r(this instanceof cje);
      }

      $$4.c();
      if (this.dV() instanceof arq $$12) {
         $$4.a("freezing");
         if (!this.eG()) {
            int $$13 = this.cu();
            if (this.av && this.dJ()) {
               this.k(Math.min(this.cx(), $$13 + 1));
            } else {
               this.k(Math.max(0, $$13 - 2));
            }
         }

         this.eh();
         this.ei();
         if (this.af % 40 == 0 && this.cw() && this.dJ()) {
            this.a($$12, this.dW().v(), 1.0F);
         }

         $$4.c();
      }

      $$4.a("push");
      if (this.bp > 0) {
         this.bp--;
         this.a($$9, this.cR());
      }

      this.o();
      $$4.c();
      if (this.dV() instanceof arq $$14 && this.fq() && this.bl()) {
         this.a($$14, this.dW().i(), 1.0F);
      }
   }

   protected void fp() {
      this.bg *= 0.98F;
      this.bi *= 0.98F;
   }

   public boolean fq() {
      return false;
   }

   protected void fr() {
      this.cy();
      if (!this.dV().C) {
         if (!this.fs()) {
            this.b(7, false);
            return;
         }

         int $$0 = this.bo + 1;
         if ($$0 % 10 == 0) {
            int $$1 = $$0 / 10;
            if ($$1 % 2 == 0) {
               List<bwn> $$2 = bwn.j.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               bwn $$3 = af.a($$2, this.ae);
               this.a($$3).a(1, this, $$3);
            }

            this.a(eez.n);
         }
      }
   }

   protected boolean fs() {
      if (!this.aJ() && !this.bZ() && !this.b(bvj.y)) {
         for (bwn $$0 : bwn.j) {
            if (b(this.a($$0), $$0)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   protected void ft() {
   }

   @Override
   protected void o() {
      List<bwd> $$0 = this.dV().i(this, this.cR());
      if (!$$0.isEmpty()) {
         if (this.dV() instanceof arq $$1) {
            int $$2 = $$1.O().d(dir.v);
            if ($$2 > 0 && $$0.size() > $$2 - 1 && this.ae.a(4) == 0) {
               int $$3 = 0;

               for (bwd $$4 : $$0) {
                  if (!$$4.bZ()) {
                     $$3++;
                  }
               }

               if ($$3 > $$2 - 1) {
                  this.a($$1, this.dW().h(), 6.0F);
               }
            }
         }

         for (bwd $$5 : $$0) {
            this.D($$5);
         }
      }
   }

   protected void a(fed $$0, fed $$1) {
      fed $$2 = $$0.b($$1);
      List<bwd> $$3 = this.dV().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bwd $$4 : $$3) {
            if ($$4 instanceof bxc) {
               this.f((bxc)$$4);
               this.bp = 0;
               this.i(this.dy().c(-0.2));
               break;
            }
         }
      } else if (this.P) {
         this.bp = 0;
      }

      if (!this.dV().C && this.bp <= 0) {
         this.c(4, false);
         this.bq = 0.0F;
         this.br = null;
      }
   }

   protected void D(bwd $$0) {
      $$0.h(this);
   }

   protected void f(bxc $$0) {
   }

   public boolean fu() {
      return (this.al.a(aC) & 4) != 0;
   }

   @Override
   public void bP() {
      bwd $$0 = this.dk();
      super.bP();
      if ($$0 != null && $$0 != this.dk() && !this.dV().C) {
         this.c($$0);
      }
   }

   @Override
   public void r() {
      super.r();
      this.k();
   }

   @Override
   public bwx N_() {
      return this.bj;
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bk = (double)$$0;
      this.bl = $$1;
   }

   public void s(boolean $$0) {
      this.bf = $$0;
   }

   public void a(cnd $$0) {
      bwd $$1 = $$0.q();
      if ($$1 instanceof arr) {
         ap.R.a((arr)$$1, $$0.f(), this);
      }
   }

   public void a(bwd $$0, int $$1) {
      if (!$$0.dQ() && !this.dV().C && ($$0 instanceof cnd || $$0 instanceof crf || $$0 instanceof bwr)) {
         ((arq)this.dV()).m().b($$0, new agb($$0.ar(), this.ar(), $$1));
      }
   }

   public boolean E(bwd $$0) {
      return this.a($$0, die.a.a, die.b.a, $$0.dE());
   }

   public boolean a(bwd $$0, die.a $$1, die.b $$2, double $$3) {
      if ($$0.dV() != this.dV()) {
         return false;
      } else {
         fei $$4 = new fei(this.dA(), this.dE(), this.dG());
         fei $$5 = new fei($$0.dA(), $$3, $$0.dG());
         return $$5.f($$4) > 128.0 ? false : this.dV().a(new die($$4, $$5, $$1, $$2, this)).d() == feg.a.a;
      }
   }

   @Override
   public float j(float $$0) {
      return $$0 == 1.0F ? this.aX : azm.i($$0, this.aY, this.aX);
   }

   public float D(float $$0) {
      float $$1 = this.aR - this.aQ;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aQ + $$1 * $$0;
   }

   @Override
   public boolean bG() {
      return !this.dQ();
   }

   @Override
   public boolean bH() {
      return this.bK() && !this.U_() && !this.d_();
   }

   @Override
   public float cA() {
      return this.aX;
   }

   @Override
   public void r(float $$0) {
      this.aX = $$0;
   }

   @Override
   public void s(float $$0) {
      this.aV = $$0;
   }

   @Override
   public fei a(ja.a $$0, l.a $$1) {
      return k(super.a($$0, $$1));
   }

   public static fei k(fei $$0) {
      return new fei($$0.d, $$0.e, 0.0);
   }

   public float fv() {
      return this.bQ;
   }

   public final void E(float $$0) {
      this.F(azm.a($$0, 0.0F, this.eU()));
   }

   protected void F(float $$0) {
      this.bQ = $$0;
   }

   public void e_() {
   }

   public void J_() {
   }

   protected void fw() {
      this.bJ = true;
   }

   public abstract bwv fx();

   public boolean fy() {
      return (this.al.a(aC) & 1) > 0;
   }

   public bua fz() {
      return (this.al.a(aC) & 2) > 0 ? bua.b : bua.a;
   }

   private void I() {
      if (this.fy()) {
         if (cyy.b(this.b(this.fz()), this.bm)) {
            this.bm = this.b(this.fz());
            this.a(this.bm);
         } else {
            this.fE();
         }
      }
   }

   protected void a(cyy $$0) {
      $$0.b(this.dV(), this, this.fB());
      if (--this.bn == 0 && !this.dV().C && !$$0.x()) {
         this.K_();
      }
   }

   private void J() {
      this.bW = this.bV;
      if (this.cl()) {
         this.bV = Math.min(1.0F, this.bV + 0.09F);
      } else {
         this.bV = Math.max(0.0F, this.bV - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.al.a(aC);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.al.a(aC, (byte)$$2);
   }

   public void c(bua $$0) {
      cyy $$1 = this.b($$0);
      if (!$$1.f() && !this.fy()) {
         this.bm = $$1;
         this.bn = $$1.a(this);
         if (!this.dV().C) {
            this.c(1, true);
            this.c(2, $$0 == bua.b);
            this.a(eez.D);
         }
      }
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (bC.equals($$0)) {
         if (this.dV().C) {
            this.fO().ifPresent(this::a);
         }
      } else if (aC.equals($$0) && this.dV().C) {
         if (this.fy() && this.bm.f()) {
            this.bm = this.b(this.fz());
            if (!this.bm.f()) {
               this.bn = this.bm.a(this);
            }
         } else if (!this.fy() && !this.bm.f()) {
            this.bm = cyy.k;
            this.bn = 0;
         }
      }
   }

   @Override
   public void a(eu.a $$0, fei $$1) {
      super.a($$0, $$1);
      this.aY = this.aX;
      this.aV = this.aX;
      this.aW = this.aV;
   }

   @Override
   public float u(float $$0) {
      return azm.h($$0, this.aW, this.aV);
   }

   public void b(cyy $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         fei $$3 = new fei(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dN() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dL() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ae.i()) * 0.6 - 0.3;
         fei $$5 = new fei(((double)this.ae.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dN() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dL() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dA(), this.dE(), this.dG());
         this.dV().a(new lt(lx.U, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void K_() {
      if (!this.dV().C || this.fy()) {
         bua $$0 = this.fz();
         if (!this.bm.equals(this.b($$0))) {
            this.fD();
         } else {
            if (!this.bm.f() && this.fy()) {
               cyy $$1 = this.bm.a(this.dV(), this);
               if ($$1 != this.bm) {
                  this.a($$0, $$1);
               }

               this.fE();
            }
         }
      }
   }

   public void b(cyy $$0) {
   }

   public cyy fA() {
      return this.bm;
   }

   public int fB() {
      return this.bn;
   }

   public int fC() {
      return this.fy() ? this.bm.a(this) - this.fB() : 0;
   }

   public void fD() {
      if (!this.bm.f()) {
         this.bm.a(this.dV(), this, this.fB());
         if (this.bm.x()) {
            this.I();
         }
      }

      this.fE();
   }

   public void fE() {
      if (!this.dV().C) {
         boolean $$0 = this.fy();
         this.c(1, false);
         if ($$0) {
            this.a(eez.C);
         }
      }

      this.bm = cyy.k;
      this.bn = 0;
   }

   public boolean fF() {
      return this.fG() != null;
   }

   @Nullable
   public cyy fG() {
      if (!this.fy()) {
         return null;
      } else {
         daz $$0 = this.bm.a(kj.I);
         if ($$0 != null) {
            int $$1 = this.bm.h().a(this.bm, this) - this.bn;
            if ($$1 >= $$0.a()) {
               return this.bm;
            }
         }

         return null;
      }
   }

   public boolean fH() {
      return this.cd();
   }

   public boolean fI() {
      return this.i(7);
   }

   @Override
   public boolean cl() {
      return super.cl() || !this.fI() && this.c(bxo.b);
   }

   public int fJ() {
      return this.bo;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dA();
      double $$5 = this.dC();
      double $$6 = this.dG();
      double $$7 = $$1;
      boolean $$8 = false;
      iu $$9 = iu.a($$0, $$1, $$2);
      div $$10 = this.dV();
      if ($$10.C($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.G_()) {
            iu $$12 = $$9.e();
            dzz $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cR())) {
               $$8 = true;
            }
         }
      }

      if (!$$8) {
         this.c($$4, $$5, $$6);
         return false;
      } else {
         if ($$3) {
            $$10.a(this, (byte)46);
         }

         if (this instanceof bxk $$14) {
            $$14.O().m();
         }

         return true;
      }
   }

   public boolean fK() {
      return !this.eG();
   }

   public boolean fL() {
      return true;
   }

   public void a(iu $$0, boolean $$1) {
   }

   public boolean fM() {
      return false;
   }

   @Override
   public final bwg a(bxo $$0) {
      return $$0 == bxo.c ? aD : this.e($$0).a(this.ek());
   }

   protected bwg e(bxo $$0) {
      return this.aq().n().a(this.ej());
   }

   public ImmutableList<bxo> fN() {
      return ImmutableList.of(bxo.a);
   }

   public fed f(bxo $$0) {
      bwg $$1 = this.a($$0);
      return new fed((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bxo $$0) {
      fed $$1 = this.a($$0).a(this.dt());
      return this.dV().b(this, $$1);
   }

   @Override
   public boolean n(boolean $$0) {
      return super.n($$0) && !this.fQ();
   }

   public Optional<iu> fO() {
      return this.al.a(bC);
   }

   public void g(iu $$0) {
      this.al.a(bC, Optional.of($$0));
   }

   public void fP() {
      this.al.a(bC, Optional.empty());
   }

   public boolean fQ() {
      return this.fO().isPresent();
   }

   public void b(iu $$0) {
      if (this.bZ()) {
         this.bP();
      }

      dzz $$1 = this.dV().a_($$0);
      if ($$1.b() instanceof dlt) {
         this.dV().a($$0, $$1.b(dlt.c, Boolean.valueOf(true)), 3);
      }

      this.b(bxo.c);
      this.a($$0);
      this.g($$0);
      this.i(fei.c);
      this.ar = true;
   }

   private void a(iu $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean L() {
      return this.fO().map($$0 -> this.dV().a_($$0).b() instanceof dlt).orElse(false);
   }

   public void fR() {
      this.fO().filter(this.dV()::C).ifPresent($$0x -> {
         dzz $$1 = this.dV().a_($$0x);
         if ($$1.b() instanceof dlt) {
            ja $$2 = $$1.c(dlt.e);
            this.dV().a($$0x, $$1.b(dlt.c, Boolean.valueOf(false)), 3);
            fei $$3 = dlt.a(this.aq(), this.dV(), $$0x, $$2, this.dL()).orElseGet(() -> {
               iu $$1x = $$0x.d();
               return new fei((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            fei $$4 = fei.c($$0x).d($$3).d();
            float $$5 = (float)azm.d(azm.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.w($$5);
            this.x(0.0F);
         }
      });
      fei $$0 = this.dt();
      this.b(bxo.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fP();
   }

   @Nullable
   public ja fS() {
      iu $$0 = this.fO().orElse(null);
      return $$0 != null ? dlt.a(this.dV(), $$0) : null;
   }

   @Override
   public boolean bL() {
      return !this.fQ() && super.bL();
   }

   public cyy e(cyy $$0) {
      return cyy.k;
   }

   private static byte g(bwn $$0) {
      return switch ($$0) {
         case a -> 47;
         case b -> 48;
         case f -> 49;
         case e -> 50;
         case c -> 52;
         case d -> 51;
         case g -> 65;
         case h -> 68;
      };
   }

   public void a(cyu $$0, bwn $$1) {
      this.dV().a(this, g($$1));
      this.a(this.a($$1), $$1, this.bE);
   }

   private void a(cyy $$0, bwn $$1, byf $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         bye $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      dfn.a($$0, this, $$1);
   }

   public static bwn d(bua $$0) {
      return $$0 == bua.a ? bwn.a : bwn.b;
   }

   public final boolean f(cyy $$0) {
      if (this.bK() && !this.U_()) {
         dhh $$1 = $$0.a(kj.D);
         if ($$1 != null && $$1.g()) {
            bwn $$2 = $$1.b();
            return this.e($$2) && $$1.a(this.aq()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(bwn $$0) {
      return true;
   }

   public final bwn g(cyy $$0) {
      dhh $$1 = $$0.a(kj.D);
      return $$1 != null && this.e($$1.b()) ? $$1.b() : bwn.a;
   }

   public final boolean a(cyy $$0, bwn $$1) {
      dhh $$2 = $$0.a(kj.D);
      return $$2 == null ? $$1 == bwn.a && this.e(bwn.a) : $$1 == $$2.b() && this.e($$2.b()) && $$2.a(this.aq());
   }

   private static bxt a(bxc $$0, bwn $$1) {
      return $$1 != bwn.f && $$1 != bwn.a && $$1 != bwn.b ? bxt.a($$0, $$1, $$2 -> $$2.f() || $$0.g($$2) == $$1) : bxt.a($$0, $$1);
   }

   @Nullable
   private static bwn r(int $$0) {
      if ($$0 == 100 + bwn.f.b()) {
         return bwn.f;
      } else if ($$0 == 100 + bwn.e.b()) {
         return bwn.e;
      } else if ($$0 == 100 + bwn.d.b()) {
         return bwn.d;
      } else if ($$0 == 100 + bwn.c.b()) {
         return bwn.c;
      } else if ($$0 == 98) {
         return bwn.a;
      } else if ($$0 == 99) {
         return bwn.b;
      } else if ($$0 == 105) {
         return bwn.g;
      } else {
         return $$0 == 106 ? bwn.h : null;
      }
   }

   @Override
   public bxt a_(int $$0) {
      bwn $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dJ() {
      if (this.U_()) {
         return false;
      } else {
         for (bwn $$0 : bwo.i) {
            if (this.a($$0).a(axk.bq)) {
               return false;
            }
         }

         return super.dJ();
      }
   }

   @Override
   public boolean co() {
      return !this.dV().w_() && this.b(bvj.x) || super.co();
   }

   @Override
   public float dM() {
      return this.aV;
   }

   @Override
   public void a(abv $$0) {
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      float $$4 = $$0.n();
      float $$5 = $$0.m();
      this.f($$1, $$2, $$3);
      this.aV = $$0.o();
      this.aX = $$0.o();
      this.aW = this.aV;
      this.aY = this.aX;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.n($$0.j(), $$0.k(), $$0.l());
   }

   public float fT() {
      dcg $$0 = this.dZ().a(kj.B);
      return $$0 != null ? $$0.b() : 0.0F;
   }

   @Override
   public float dP() {
      float $$0 = (float)this.h(byi.B);
      return this.cW() instanceof cqy ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public fei m(bwd $$0) {
      return this.dt().e(this.a($$0, this.a(this.aw()), this.ek() * this.ej()));
   }

   protected void a(int $$0, double $$1) {
      this.aX = (float)azm.e(1.0 / (double)$$0, (double)this.aX, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(azm.c((double)$$0 * this.h(byi.h)));
   }

   public boolean fU() {
      return false;
   }

   public boolean a(arq $$0, bus $$1) {
      return this.d($$1) || dfn.a($$0, this, $$1);
   }

   public static boolean b(cyy $$0, bwn $$1) {
      if (!$$0.c(kj.F)) {
         return false;
      } else {
         dhh $$2 = $$0.a(kj.D);
         return $$2 != null && $$1 == $$2.b() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fV() {
      return this.bb;
   }

   public static record a(awm a, awm b) {
   }
}

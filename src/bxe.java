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
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.slf4j.Logger;

public abstract class bxe extends bwf implements bvy {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "active_effects";
   private static final alg c = alg.b("powder_snow");
   private static final alg d = alg.b("sprinting");
   private static final byi k = new byi(d, 0.3F, byi.a.c);
   public static final int l = 98;
   public static final int m = 100;
   public static final int n = 105;
   public static final int o = 106;
   public static final int p = 6;
   public static final int q = 100;
   private static final int bu = 40;
   public static final double r = 0.003;
   public static final double s = 0.08;
   public static final int t = 20;
   protected static final float u = 0.98F;
   private static final int bv = 10;
   private static final int bw = 2;
   public static final float ay = 0.42F;
   private static final double bx = 128.0;
   protected static final int az = 1;
   protected static final int aA = 2;
   protected static final int aB = 4;
   protected static final akj<Byte> aC = akn.a(bxe.class, akl.a);
   private static final akj<Float> by = akn.a(bxe.class, akl.d);
   private static final akj<List<lv>> bz = akn.a(bxe.class, akl.m);
   private static final akj<Boolean> bA = akn.a(bxe.class, akl.k);
   private static final akj<Integer> bB = akn.a(bxe.class, akl.b);
   private static final akj<Integer> bC = akn.a(bxe.class, akl.b);
   private static final akj<Optional<iu>> bD = akn.a(bxe.class, akl.p);
   private static final int bE = 15;
   protected static final bwi aD = bwi.c(0.2F, 0.2F).b(0.2F);
   public static final float aE = 0.5F;
   public static final float aF = 0.5F;
   public static final String aG = "attributes";
   public static final Predicate<bxe> aH = $$0 -> {
      if ($$0 instanceof crc $$1) {
         czd $$3 = $$1.a(bwp.f);
         return !$$3.a(axk.cs);
      } else {
         return true;
      }
   };
   private final byh bF;
   private final bur bG = new bur(this);
   private final Map<je<bvh>, bvj> bH = Maps.newHashMap();
   private final Map<bwp, czd> bI = af.a(bwp.class, $$0x -> czd.k);
   public boolean aI;
   private boolean bJ = false;
   public buc aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final byd aT = new byd();
   public final int aU = 20;
   public float aV;
   public float aW;
   public float aX;
   public float aY;
   public final bwe aZ = new bwe(this);
   @Nullable
   protected bwl<crc> ba;
   protected int bb;
   protected boolean bc;
   protected int bd;
   protected float be;
   protected boolean bf;
   public float bg;
   public float bh;
   public float bi;
   protected bwz bj = new bwz(this);
   protected double bk;
   protected int bl;
   private boolean bK = true;
   @Nullable
   private bwl<bxe> bL;
   private int bM;
   @Nullable
   private bxe bN;
   private int bO;
   private float bP;
   private int bQ;
   private float bR;
   protected czd bm = czd.k;
   protected int bn;
   protected int bo;
   private iu bS;
   private Optional<iu> bT = Optional.empty();
   @Nullable
   private buu bU;
   private long bV;
   protected int bp;
   protected float bq;
   @Nullable
   protected czd br;
   private float bW;
   private float bX;
   protected bye<?> bs;
   private boolean bY;
   private final EnumMap<bwp, Reference2ObjectMap<dfq, Set<dgi>>> bZ = new EnumMap<>(bwp.class);
   protected final bwj bt;

   protected bxe(bwo<? extends bxe> $$0, dja $$1) {
      super($$0, $$1);
      this.bF = new byh(byl.a($$0));
      this.d(this.eU());
      this.bt = this.eb();
      this.I = true;
      this.ay();
      this.w((float)(Math.random() * (float) (Math.PI * 2)));
      this.aX = this.dL();
      un $$2 = un.a;
      this.bs = this.a(new Dynamic($$2, (uw)$$2.createMap(ImmutableMap.of($$2.a("memories"), (uw)$$2.emptyMap()))));
   }

   @SideEffectFree
   protected bwj eb() {
      return new bwj();
   }

   public bye<?> ec() {
      return this.bs;
   }

   protected bye.b<?> ed() {
      return bye.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bye<?> a(Dynamic<?> $$0) {
      return this.ed().a($$0);
   }

   @Override
   public void c(arq $$0) {
      this.a($$0, this.dW().y(), Float.MAX_VALUE);
   }

   public boolean a(bwo<?> $$0) {
      return true;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(aC, (byte)0);
      $$0.a(bz, List.of());
      $$0.a(bA, false);
      $$0.a(bB, 0);
      $$0.a(bC, 0);
      $$0.a(by, 1.0F);
      $$0.a(bD, Optional.empty());
   }

   public static byj.a ee() {
      return byj.a()
         .a(byk.s)
         .a(byk.p)
         .a(byk.v)
         .a(byk.a)
         .a(byk.b)
         .a(byk.r)
         .a(byk.B)
         .a(byk.y)
         .a(byk.n)
         .a(byk.x)
         .a(byk.k)
         .a(byk.o)
         .a(byk.w)
         .a(byk.h)
         .a(byk.i)
         .a(byk.F)
         .a(byk.u)
         .a(byk.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, eah $$2, iu $$3) {
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
         this.bT = Optional.empty();
      }
   }

   public final boolean ef() {
      return this.aq().a(axf.m);
   }

   public float a(float $$0) {
      return azm.h($$0, this.bX, this.bW);
   }

   public boolean eg() {
      return this.dy().b() < 1.0E-5F && this.bm();
   }

   @Override
   public void az() {
      this.aQ = this.aR;
      if (this.ak) {
         this.fP().ifPresent(this::a);
      }

      if (this.dV() instanceof arq $$0) {
         dfs.b($$0, this);
      }

      super.az();
      bqo $$1 = bqn.a();
      $$1.a("livingEntityBaseTick");
      if (this.bi() || this.dV().C) {
         this.aH();
      }

      if (this.bK() && this.dV() instanceof arq $$2) {
         boolean $$3 = this instanceof crc;
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

         if (this.a(axh.a) && !$$2.a_(iu.a(this.dA(), this.dE(), this.dG())).a(dmh.nJ)) {
            boolean $$6 = !this.ef() && !bvk.c(this) && (!$$3 || !((crc)this).gk().a);
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
         if (!Objects.equal(this.bS, $$7)) {
            this.bS = $$7;
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

      if (this.eH() && this.dV().h(this)) {
         this.en();
      }

      if (this.bb > 0) {
         this.bb--;
      } else {
         this.ba = null;
      }

      if (this.bN != null && !this.bN.bK()) {
         this.bN = null;
      }

      bxe $$8 = this.er();
      if ($$8 != null) {
         if (!$$8.bK()) {
            this.a(null);
         } else if (this.af - this.bM > 100) {
            this.a(null);
         }
      }

      this.ey();
      this.aY = this.aX;
      this.aW = this.aV;
      this.N = this.dL();
      this.O = this.dN();
      $$1.c();
   }

   @Override
   protected float aT() {
      return azm.h((float)this.h(byk.u), super.aT(), 1.0F);
   }

   public float eh() {
      return 0.0F;
   }

   protected void ei() {
      byg $$0 = this.g(byk.v);
      if ($$0 != null) {
         if ($$0.a(c) != null) {
            $$0.c(c);
         }
      }
   }

   protected void ej() {
      if (!this.bs().l()) {
         int $$0 = this.cu();
         if ($$0 > 0) {
            byg $$1 = this.g(byk.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cv();
            $$1.b(new byi(c, (double)$$2, byi.a.a));
         }
      }
   }

   protected void b(arq $$0, iu $$1) {
      dfs.a($$0, this);
   }

   public boolean n_() {
      return false;
   }

   public float ek() {
      return this.n_() ? 0.5F : 1.0F;
   }

   public final float el() {
      byh $$0 = this.fa();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(byk.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   public boolean em() {
      return true;
   }

   protected void en() {
      this.aP++;
      if (this.aP >= 20 && !this.dV().w_() && !this.dQ()) {
         this.dV().a(this, (byte)60);
         this.a(bwf.e.a);
      }
   }

   public boolean eo() {
      return !this.n_();
   }

   protected boolean ep() {
      return !this.n_();
   }

   protected int l(int $$0) {
      byg $$1 = this.g(byk.w);
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

   public final int a(arq $$0, @Nullable bwf $$1) {
      return dfs.a($$0, $$1, this, this.e($$0));
   }

   protected int e(arq $$0) {
      return 0;
   }

   protected boolean eq() {
      return false;
   }

   @Nullable
   public bxe er() {
      return bwl.a(this.bL, this.dV(), bxe.class);
   }

   @Nullable
   public crc es() {
      return bwl.a(this.ba, this.dV(), crc.class);
   }

   @Override
   public bxe am() {
      return this.er();
   }

   public int et() {
      return this.bM;
   }

   public void a(crc $$0, int $$1) {
      this.a(new bwl<>($$0), $$1);
   }

   public void a(UUID $$0, int $$1) {
      this.a(new bwl<>($$0), $$1);
   }

   private void a(bwl<crc> $$0, int $$1) {
      this.ba = $$0;
      this.bb = $$1;
   }

   public void a(@Nullable bxe $$0) {
      this.bL = $$0 != null ? new bwl<>($$0) : null;
      this.bM = this.af;
   }

   @Nullable
   public bxe eu() {
      return this.bN;
   }

   public int ev() {
      return this.bO;
   }

   public void B(bwf $$0) {
      if ($$0 instanceof bxe) {
         this.bN = (bxe)$$0;
      } else {
         this.bN = null;
      }

      this.bO = this.af;
   }

   public int ew() {
      return this.bd;
   }

   public void n(int $$0) {
      this.bd = $$0;
   }

   public boolean ex() {
      return this.bJ;
   }

   public void q(boolean $$0) {
      this.bJ = $$0;
   }

   protected boolean b(bwp $$0) {
      return true;
   }

   public void a(bwp $$0, czd $$1, czd $$2) {
      if (!this.dV().w_() && !this.V_()) {
         if (!czd.c($$1, $$2) && !this.ak) {
            dhm $$3 = $$2.a(kj.D);
            if (!this.bb() && $$3 != null && $$0 == $$3.b()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), this.a($$0, $$2, $$3), this.dm(), 1.0F, 1.0F, this.ae.g());
            }

            if (this.b($$0)) {
               this.a($$3 != null ? efh.v : efh.S);
            }
         }
      }
   }

   protected je<awm> a(bwp $$0, czd $$1, dhm $$2) {
      return $$2.c();
   }

   @Override
   public void a(bwf.e $$0) {
      if (($$0 == bwf.e.a || $$0 == bwf.e.b) && this.dV() instanceof arq $$1) {
         this.a($$1, $$0);
      }

      super.a($$0);
      this.bs.a();
   }

   protected void a(arq $$0, bwf.e $$1) {
      for (bvj $$2 : this.eD()) {
         $$2.a($$0, this, $$1);
      }

      this.bH.clear();
   }

   @Override
   public void b(tz $$0) {
      $$0.a("Health", this.eG());
      $$0.a("HurtTime", (short)this.aN);
      $$0.a("HurtByTimestamp", this.bM);
      $$0.a("DeathTime", (short)this.aP);
      $$0.a("AbsorptionAmount", this.fw());
      $$0.a("attributes", this.fa().d());
      ale<uw> $$1 = this.dX().a(un.a);
      if (!this.bH.isEmpty()) {
         $$0.a("active_effects", bvj.d.listOf(), $$1, List.copyOf(this.bH.values()));
      }

      $$0.a("FallFlying", this.fJ());
      this.fP().ifPresent($$1x -> {
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

      if (this.bL != null) {
         this.bL.a($$0, "last_hurt_by_mob");
         $$0.a("ticks_since_last_hurt_by_mob", this.af - this.bM);
      }

      if (!this.bt.a()) {
         $$0.a("equipment", bwj.a, $$1, this.bt);
      }
   }

   @Nullable
   public cnh a(czd $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else if (this.dV().C) {
         this.a(buc.a);
         return null;
      } else {
         cnh $$3 = this.b($$0, $$1, $$2);
         if ($$3 != null) {
            this.dV().b($$3);
         }

         return $$3;
      }
   }

   @Override
   public void a(tz $$0) {
      this.F($$0.j("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dV() != null && !this.dV().C) {
         this.fa().a($$0.c("attributes", 10));
      }

      ale<uw> $$1 = this.dX().a(un.a);
      List<bvj> $$2 = $$0.<List<bvj>>a("active_effects", bvj.d.listOf(), $$1).orElse(List.of());
      this.bH.clear();

      for (bvj $$3 : $$2) {
         this.bH.put($$3.c(), $$3);
      }

      if ($$0.b("Health", 99)) {
         this.d($$0.j("Health"));
      }

      this.aN = $$0.g("HurtTime");
      this.aP = $$0.g("DeathTime");
      this.bM = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$4 = $$0.l("Team");
         ffv $$5 = this.dV().R();
         ffq $$6 = $$5.b($$4);
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
         this.al.a(aq, bxq.c);
         if (!this.ak) {
            this.a($$8);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bs = this.a(new Dynamic(un.a, $$0.c("Brain")));
      }

      this.ba = bwl.b($$0, "last_hurt_by_player");
      this.bb = $$0.h("last_hurt_by_player_memory_time");
      this.bL = bwl.b($$0, "last_hurt_by_mob");
      this.bM = $$0.h("ticks_since_last_hurt_by_mob") + this.af;
      this.bt.a($$0.<bwj>a("equipment", bwj.a, $$1).orElseGet(bwj::new));
   }

   protected void ey() {
      if (this.dV() instanceof arq $$0) {
         Iterator<je<bvh>> $$1 = this.bH.keySet().iterator();

         try {
            while ($$1.hasNext()) {
               je<bvh> $$2 = $$1.next();
               bvj $$3 = this.bH.get($$2);
               if (!$$3.a($$0, this, () -> this.a($$3, true, null))) {
                  $$1.remove();
                  this.c(List.of($$3));
               } else if ($$3.d() % 600 == 0) {
                  this.a($$3, false, null);
               }
            }
         } catch (ConcurrentModificationException var6) {
         }

         if (this.bK) {
            this.K();
            this.q();
            this.bK = false;
         }
      } else {
         for (bvj $$4 : this.bH.values()) {
            $$4.i();
         }

         List<lv> $$5 = this.al.a(bz);
         if (!$$5.isEmpty()) {
            boolean $$6 = this.al.a(bA);
            int $$7 = this.cp() ? 15 : 4;
            int $$8 = $$6 ? 5 : 1;
            if (this.ae.a($$7 * $$8) == 0) {
               this.dV().a(af.a($$5, this.ae), this.d(0.5), this.dD(), this.g(0.5), 1.0, 1.0, 1.0);
            }
         }
      }
   }

   protected void K() {
      if (this.bH.isEmpty()) {
         this.eB();
         this.k(false);
      } else {
         this.k(this.b(bvl.n));
         this.j();
      }
   }

   private void j() {
      List<lv> $$0 = this.bH.values().stream().filter(bvj::g).map(bvj::a).toList();
      this.al.a(bz, $$0);
      this.al.a(bA, d(this.bH.values()));
   }

   private void q() {
      boolean $$0 = this.co();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable bwf $$0) {
      double $$1 = 1.0;
      if (this.cg()) {
         $$1 *= 0.8;
      }

      if (this.cp()) {
         float $$2 = this.fd();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         czd $$3 = this.a(bwp.f);
         bwo<?> $$4 = $$0.aq();
         if ($$4 == bwo.bf && $$3.a(czh.vv)
            || $$4 == bwo.bO && $$3.a(czh.vy)
            || $$4 == bwo.aR && $$3.a(czh.vB)
            || $$4 == bwo.aS && $$3.a(czh.vB)
            || $$4 == bwo.E && $$3.a(czh.vz)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bxe $$0) {
      return $$0 instanceof crc && this.dV().an() == bua.a ? false : $$0.ez();
   }

   public boolean ez() {
      return !this.cC() && this.eA();
   }

   public boolean eA() {
      return !this.V_() && this.bK();
   }

   public static boolean d(Collection<bvj> $$0) {
      for (bvj $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void eB() {
      this.al.a(bz, List.of());
   }

   public boolean eC() {
      if (this.dV().C) {
         return false;
      } else if (this.bH.isEmpty()) {
         return false;
      } else {
         Map<je<bvh>, bvj> $$0 = Maps.newHashMap(this.bH);
         this.bH.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<bvj> eD() {
      return this.bH.values();
   }

   public Map<je<bvh>, bvj> eE() {
      return this.bH;
   }

   public boolean b(je<bvh> $$0) {
      return this.bH.containsKey($$0);
   }

   @Nullable
   public bvj c(je<bvh> $$0) {
      return this.bH.get($$0);
   }

   public float a(je<bvh> $$0, float $$1) {
      bvj $$2 = this.c($$0);
      return $$2 != null ? $$2.a(this, $$1) : 0.0F;
   }

   public final boolean a(bvj $$0) {
      return this.b($$0, null);
   }

   public boolean b(bvj $$0, @Nullable bwf $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         bvj $$2 = this.bH.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bH.put($$0.c(), $$0);
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

   public boolean b(bvj $$0) {
      if (this.aq().a(axf.G)) {
         return !$$0.a(bvl.M);
      } else if (this.aq().a(axf.F)) {
         return !$$0.a(bvl.L);
      } else {
         return !this.aq().a(axf.w) ? true : !$$0.a(bvl.j) && !$$0.a(bvl.s);
      }
   }

   public void c(bvj $$0, @Nullable bwf $$1) {
      if (this.b($$0)) {
         bvj $$2 = this.bH.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eF() {
      return this.aq().a(axf.x);
   }

   @Nullable
   public final bvj d(je<bvh> $$0) {
      return this.bH.remove($$0);
   }

   public boolean e(je<bvh> $$0) {
      bvj $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(bvj $$0, @Nullable bwf $$1) {
      if (!this.dV().C) {
         this.bK = true;
         $$0.c().a().a(this.fa(), $$0.e());
         this.c($$0);
      }
   }

   public void c(bvj $$0) {
      for (bwf $$1 : this.cY()) {
         if ($$1 instanceof arr $$2) {
            $$2.f.b(new agi(this.ar(), $$0, false));
         }
      }
   }

   protected void a(bvj $$0, boolean $$1, @Nullable bwf $$2) {
      if (!this.dV().C) {
         this.bK = true;
         if ($$1) {
            bvh $$3 = $$0.c().a();
            $$3.a(this.fa());
            $$3.a(this.fa(), $$0.e());
            this.u();
         }

         this.c($$0);
      }
   }

   protected void c(Collection<bvj> $$0) {
      if (!this.dV().C) {
         this.bK = true;

         for (bvj $$1 : $$0) {
            $$1.c().a().a(this.fa());

            for (bwf $$2 : this.cY()) {
               if ($$2 instanceof arr $$3) {
                  $$3.f.b(new aek(this.ar(), $$1.c()));
               }
            }
         }

         this.u();
      }
   }

   private void u() {
      Set<byg> $$0 = this.fa().b();

      for (byg $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(je<byf> $$0) {
      if ($$0.a(byk.s)) {
         float $$1 = this.eU();
         if (this.eG() > $$1) {
            this.d($$1);
         }
      } else if ($$0.a(byk.r)) {
         float $$2 = this.eV();
         if (this.fw() > $$2) {
            this.E($$2);
         }
      } else if ($$0.a(byk.y)) {
         this.i_();
      }
   }

   public void c(float $$0) {
      float $$1 = this.eG();
      if ($$1 > 0.0F) {
         this.d($$1 + $$0);
      }
   }

   public float eG() {
      return this.al.a(by);
   }

   public void d(float $$0) {
      this.al.a(by, azm.a($$0, 0.0F, this.eU()));
   }

   public boolean eH() {
      return this.eG() <= 0.0F;
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.eH()) {
         return false;
      } else if ($$1.a(axd.i) && this.b(bvl.l)) {
         return false;
      } else {
         if (this.fR()) {
            this.fS();
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

         if ($$1.a(axd.a) && !this.a(bwp.f).f()) {
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
            dbe $$7 = this.fB().a(kj.I);
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
               if ($$1.c() instanceof crx $$10) {
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

         if (this.eH()) {
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
            this.bU = $$1;
            this.bV = this.dV().ae();

            for (bvj $$13 : this.eD()) {
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

   public float b(arq $$0, buu $$1, float $$2) {
      if ($$2 <= 0.0F) {
         return 0.0F;
      } else {
         czd $$3 = this.fH();
         if ($$3 == null) {
            return 0.0F;
         } else {
            dbe $$4 = $$3.a(kj.I);
            if ($$4 != null && !$$4.f().map($$1::a).orElse(false)) {
               if ($$1.c() instanceof crk $$5 && $$5.u() > 0) {
                  return 0.0F;
               }

               feq $$6 = $$1.i();
               double $$9;
               if ($$6 != null) {
                  feq $$7 = this.d(0.0F, this.cA());
                  feq $$8 = $$6.d(this.dt());
                  $$8 = new feq($$8.d, 0.0, $$8.f).d();
                  $$9 = Math.acos($$8.b($$7));
               } else {
                  $$9 = 0.0;
               }

               float $$11 = $$4.a($$1, $$2, $$9);
               $$4.a(this.dV(), $$3, this, this.fA(), $$11);
               if (!$$1.a(axd.j) && $$1.c() instanceof bxe $$13) {
                  this.b($$0, $$13);
               }

               return $$11;
            } else {
               return 0.0F;
            }
         }
      }
   }

   private void i(buu $$0) {
      if ($$0.a(bux.P)) {
         awo $$1 = this instanceof crc ? awo.h : awo.f;
         this.dV().a(null, this.dt().d, this.dt().e, this.dt().f, awn.AB, $$1);
      }
   }

   protected void f(buu $$0) {
      if ($$0.d() instanceof bxe $$1 && !$$0.a(axd.q) && (!$$0.a(bux.I) || !this.aq().a(axf.E))) {
         this.a($$1);
      }
   }

   @Nullable
   protected crc g(buu $$0) {
      bwf $$1 = $$0.d();
      if ($$1 instanceof crc $$2) {
         this.a($$2, 100);
      } else if ($$1 instanceof cke $$3 && $$3.q()) {
         if ($$3.d() != null) {
            this.a($$3.d().c(), 100);
         } else {
            this.ba = null;
            this.bb = 0;
         }
      }

      return bwl.a(this.ba, this.dV(), crc.class);
   }

   protected void b(arq $$0, bxe $$1) {
      $$1.d(this);
   }

   protected void d(bxe $$0) {
      $$0.p(0.5, $$0.dA() - this.dA(), $$0.dG() - this.dG());
   }

   private boolean j(buu $$0) {
      if ($$0.a(axd.d)) {
         return false;
      } else {
         czd $$1 = null;
         dbo $$2 = null;

         for (buc $$3 : buc.values()) {
            czd $$4 = this.b($$3);
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
               this.a(efh.C);
            }

            this.d(1.0F);
            $$2.a($$1, this);
            this.dV().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public buu eI() {
      if (this.dV().ae() - this.bV > 40L) {
         this.bU = null;
      }

      return this.bU;
   }

   protected void h(buu $$0) {
      this.b(this.e($$0));
   }

   public void b(@Nullable awm $$0) {
      if ($$0 != null) {
         this.a($$0, this.fe(), this.ff());
      }
   }

   private void g(czd $$0) {
      if (!$$0.f()) {
         je<awm> $$1 = $$0.a(kj.au);
         if ($$1 != null && !this.bb()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), $$1.a(), this.dm(), 0.8F, 0.8F + this.dV().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(buu $$0) {
      if (!this.dQ() && !this.bc) {
         bwf $$1 = $$0.d();
         bxe $$2 = this.eT();
         if ($$2 != null) {
            $$2.a(this, $$0);
         }

         if (this.fR()) {
            this.fS();
         }

         if (!this.dV().C && this.h_()) {
            a.info("Named entity {} died: {}", this, this.eS().a().getString());
         }

         this.bc = true;
         this.eS().c();
         if (this.dV() instanceof arq $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(efh.p);
               this.b($$3, $$0);
               this.e($$2);
            }

            this.dV().a(this, (byte)3);
         }

         this.b(bxq.h);
      }
   }

   protected void e(@Nullable bxe $$0) {
      if (this.dV() instanceof arq $$1) {
         boolean var6 = false;
         if ($$0 instanceof cmu) {
            if ($$1.O().c(diw.d)) {
               iu $$4 = this.dv();
               eah $$5 = dmh.cn.m();
               if (this.dV().a_($$4).l() && $$5.a((djd)this.dV(), $$4)) {
                  this.dV().a($$4, $$5, 3);
                  var6 = true;
               }
            }

            if (!var6) {
               cnh $$6 = new cnh(this.dV(), this.dA(), this.dC(), this.dG(), new czd(czh.dJ));
               this.dV().b($$6);
            }
         }
      }
   }

   protected void b(arq $$0, buu $$1) {
      boolean $$2 = this.bb > 0;
      if (this.ep() && $$0.O().c(diw.g)) {
         this.b($$0, $$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.f($$0);
      this.b($$0, $$1.d());
   }

   protected void f(arq $$0) {
   }

   protected void b(arq $$0, @Nullable bwf $$1) {
      if (!this.eL() && (this.eq() || this.bb > 0 && this.eo() && $$0.O().c(diw.g))) {
         bwt.a($$0, this.dt(), this.a($$0, $$1));
      }
   }

   protected void a(arq $$0, buu $$1, boolean $$2) {
   }

   public long eJ() {
      return 0L;
   }

   protected float b(bwf $$0, buu $$1) {
      float $$2 = (float)this.h(byk.d);
      return this.dV() instanceof arq $$3 ? dfs.d($$3, this.dZ(), $$0, $$1, $$2) : $$2;
   }

   protected void b(arq $$0, buu $$1, boolean $$2) {
      Optional<alf<ezm>> $$3 = this.ea();
      if (!$$3.isEmpty()) {
         ezm $$4 = $$0.p().bc().b($$3.get());
         ezk.a $$5 = new ezk.a($$0).a(fcb.a, this).a(fcb.f, this.dt()).a(fcb.c, $$1).b(fcb.d, $$1.d()).b(fcb.e, $$1.c());
         crc $$6 = this.es();
         if ($$2 && $$6 != null) {
            $$5 = $$5.a(fcb.b, $$6).a($$6.eh());
         }

         ezk $$7 = $$5.a(fca.g);
         $$4.a($$7, this.eJ(), $$1x -> this.a($$0, $$1x));
      }
   }

   public boolean a(arq $$0, alf<ezm> $$1, BiConsumer<arq, czd> $$2) {
      return this.a($$0, $$1, $$0x -> $$0x.a(fcb.f, this.dt()).a(fcb.a, this).a(fca.j), $$2);
   }

   protected void a(arq $$0, alf<ezm> $$1, czd $$2, BiConsumer<arq, czd> $$3) {
      this.a($$0, $$1, $$1x -> $$1x.a(fcb.f, this.dt()).a(fcb.a, this).a(fcb.i, $$2).a(fca.s), $$3);
   }

   protected boolean a(arq $$0, alf<ezm> $$1, Function<ezk.a, ezk> $$2, BiConsumer<arq, czd> $$3) {
      ezm $$4 = $$0.p().bc().b($$1);
      ezk $$5 = $$2.apply(new ezk.a($$0));
      List<czd> $$6 = $$4.a($$5);
      if (!$$6.isEmpty()) {
         $$6.forEach($$2x -> $$3.accept($$0, $$2x));
         return true;
      } else {
         return false;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(byk.p);
      if (!($$0 <= 0.0)) {
         this.ar = true;
         feq $$3 = this.dy();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         feq $$4 = new feq($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aJ() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected awm e(buu $$0) {
      return awn.kK;
   }

   @Nullable
   protected awm l_() {
      return awn.kF;
   }

   private awm q(int $$0) {
      return $$0 > 4 ? this.eO().b() : this.eO().a();
   }

   public void eK() {
      this.bY = true;
   }

   public boolean eL() {
      return this.bY;
   }

   public float eM() {
      return 0.0F;
   }

   protected fel eN() {
      fel $$0 = this.cR();
      bwf $$1 = this.dk();
      if ($$1 != null) {
         feq $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dfq, Set<dgi>> c(bwp $$0) {
      return (Map<dfq, Set<dgi>>)this.bZ.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public bxe.a eO() {
      return new bxe.a(awn.kL, awn.kD);
   }

   public Optional<iu> eP() {
      return this.bT;
   }

   public boolean d_() {
      if (this.V_()) {
         return false;
      } else {
         iu $$0 = this.dv();
         eah $$1 = this.dw();
         if ($$1.a(axc.aS)) {
            this.bT = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dvh && this.c($$0, $$1)) {
            this.bT = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(iu $$0, eah $$1) {
      if (!$$1.c(dvh.b)) {
         return false;
      } else {
         eah $$2 = this.dV().a_($$0.e());
         return $$2.a(dmh.da) && $$2.c(dqq.b) == $$1.c(dvh.e);
      }
   }

   @Override
   public boolean bK() {
      return !this.dQ() && this.eG() > 0.0F;
   }

   public boolean a(bxe $$0, double $$1, boolean $$2, boolean $$3, double... $$4) {
      feq $$5 = $$0.h(1.0F).d();

      for (double $$6 : $$4) {
         feq $$7 = new feq(this.dA() - $$0.dA(), $$6 - $$0.dE(), this.dG() - $$0.dG());
         double $$8 = $$7.g();
         $$7 = $$7.d();
         double $$9 = $$5.b($$7);
         if ($$9 > 1.0 - $$1 / ($$2 ? $$8 : 1.0) && $$0.a(this, $$3 ? dij.a.c : dij.a.a, dij.b.a, $$6)) {
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
   public boolean a(double $$0, float $$1, buu $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.a($$0, $$1);
      if ($$4 > 0) {
         this.a(this.q($$4), 1.0F, 1.0F);
         this.eQ();
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
         return azm.a($$2 * (double)$$1 * this.h(byk.k));
      }
   }

   private double h(double $$0) {
      return $$0 + 1.0E-6 - this.h(byk.x);
   }

   protected void eQ() {
      if (!this.bb()) {
         int $$0 = azm.a(this.dA());
         int $$1 = azm.a(this.dC() - 0.2F);
         int $$2 = azm.a(this.dG());
         eah $$3 = this.dV().a_(new iu($$0, $$1, $$2));
         if (!$$3.l()) {
            duc $$4 = $$3.A();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void q(float $$0) {
      this.aO = 10;
      this.aN = this.aO;
   }

   public int eR() {
      return azm.a(this.h(byk.a));
   }

   protected void c(buu $$0, float $$1) {
   }

   protected void d(buu $$0, float $$1) {
   }

   protected void a(buu $$0, float $$1, bwp... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bwp $$4 : $$2) {
            czd $$5 = this.a($$4);
            dhm $$6 = $$5.a(kj.D);
            if ($$6 != null && $$6.i() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float e(buu $$0, float $$1) {
      if (!$$0.a(axd.b)) {
         this.c($$0, $$1);
         $$1 = buq.a(this, $$1, $$0, (float)this.eR(), (float)this.h(byk.b));
      }

      return $$1;
   }

   protected float f(buu $$0, float $$1) {
      if ($$0.a(axd.f)) {
         return $$1;
      } else {
         if (this.b(bvl.k) && !$$0.a(axd.g)) {
            int $$2 = (this.c(bvl.k).e() + 1) * 5;
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
               $$8 = dfs.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = buq.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void c(arq $$0, buu $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var10 = Math.max($$2 - this.fw(), 0.0F);
         this.E(this.fw() - ($$2 - var10));
         float $$4 = $$2 - var10;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F && $$1.d() instanceof arr $$5) {
            $$5.a(awx.H, Math.round($$4 * 10.0F));
         }

         if (var10 != 0.0F) {
            this.eS().a($$1, var10);
            this.d(this.eG() - var10);
            this.E(this.fw() - var10);
            this.a(efh.o);
         }
      }
   }

   public bur eS() {
      return this.bG;
   }

   @Nullable
   public bxe eT() {
      if (this.ba != null) {
         return this.ba.a(this.dV(), crc.class);
      } else {
         return this.bL != null ? this.bL.a(this.dV(), bxe.class) : null;
      }
   }

   public final float eU() {
      return (float)this.h(byk.s);
   }

   public final float eV() {
      return (float)this.h(byk.r);
   }

   public final int eW() {
      return this.al.a(bB);
   }

   public final void o(int $$0) {
      this.al.a(bB, $$0);
   }

   public final int eX() {
      return this.al.a(bC);
   }

   public final void p(int $$0) {
      this.al.a(bC, $$0);
   }

   private int D() {
      if (bvk.a(this)) {
         return 6 - (1 + bvk.b(this));
      } else {
         return this.b(bvl.d) ? 6 + (1 + this.c(bvl.d).e()) * 2 : 6;
      }
   }

   public void a(buc $$0) {
      this.a($$0, false);
   }

   public void a(buc $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.D() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dV() instanceof arq) {
            abw $$2 = new abw(this, $$0 == buc.a ? 0 : 3);
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
   public void c(buu $$0) {
      this.aT.a(1.5F);
      this.aj = 20;
      this.aO = 10;
      this.aN = this.aO;
      awm $$1 = this.e($$0);
      if ($$1 != null) {
         this.a($$1, this.fe(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }

      this.bU = $$0;
      this.bV = this.dV().ae();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            awm $$1 = this.l_();
            if ($$1 != null) {
               this.a($$1, this.fe(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof crc)) {
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
            this.g(this.a(bwp.a));
            break;
         case 48:
            this.g(this.a(bwp.b));
            break;
         case 49:
            this.g(this.a(bwp.f));
            break;
         case 50:
            this.g(this.a(bwp.e));
            break;
         case 51:
            this.g(this.a(bwp.d));
            break;
         case 52:
            this.g(this.a(bwp.c));
            break;
         case 54:
            dqe.b(this);
            break;
         case 55:
            this.F();
            break;
         case 60:
            this.eY();
            break;
         case 65:
            this.g(this.a(bwp.g));
            break;
         case 67:
            this.E();
            break;
         case 68:
            this.g(this.a(bwp.h));
            break;
         default:
            super.b($$0);
      }
   }

   public void eY() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ae.k() * 0.02;
         double $$2 = this.ae.k() * 0.02;
         double $$3 = this.ae.k() * 0.02;
         double $$4 = 10.0;
         this.dV().a(lx.ae, this.d(1.0) - $$1 * 10.0, this.dD() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
      }
   }

   private void E() {
      feq $$0 = this.dy();

      for (int $$1 = 0; $$1 < 8; $$1++) {
         double $$2 = this.ae.a(0.0, 1.0);
         double $$3 = this.ae.a(0.0, 1.0);
         double $$4 = this.ae.a(0.0, 1.0);
         this.dV().a(lx.d, this.dA() + $$2, this.dC() + $$3, this.dG() + $$4, $$0.d, $$0.e, $$0.f);
      }
   }

   private void F() {
      czd $$0 = this.a(bwp.b);
      this.a(bwp.b, this.a(bwp.a));
      this.a(bwp.a, $$0);
   }

   @Override
   protected void aI() {
      this.a(this.dW().o(), 4.0F);
   }

   protected void eZ() {
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
   public byg g(je<byf> $$0) {
      return this.fa().a($$0);
   }

   public double h(je<byf> $$0) {
      return this.fa().c($$0);
   }

   public double i(je<byf> $$0) {
      return this.fa().d($$0);
   }

   public byh fa() {
      return this.bF;
   }

   public czd fb() {
      return this.a(bwp.a);
   }

   public czd fc() {
      return this.a(bwp.b);
   }

   public czd a(bwx $$0) {
      return this.fy() == $$0 ? this.fb() : this.fc();
   }

   @Nonnull
   @Override
   public czd dZ() {
      return this.fb();
   }

   public boolean b(cyz $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<czd> $$0) {
      return $$0.test(this.fb()) || $$0.test(this.fc());
   }

   public czd b(buc $$0) {
      if ($$0 == buc.a) {
         return this.a(bwp.a);
      } else if ($$0 == buc.b) {
         return this.a(bwp.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(buc $$0, czd $$1) {
      if ($$0 == buc.a) {
         this.a(bwp.a, $$1);
      } else {
         if ($$0 != buc.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bwp.b, $$1);
      }
   }

   public boolean d(bwp $$0) {
      return !this.a($$0).f();
   }

   public boolean e(bwp $$0) {
      return true;
   }

   public czd a(bwp $$0) {
      return this.bt.a($$0);
   }

   public void a(bwp $$0, czd $$1) {
      this.a($$0, this.bt.a($$0, $$1), $$1);
   }

   public float fd() {
      int $$0 = 0;
      int $$1 = 0;

      for (bwp $$2 : bwq.i) {
         if ($$2.a() == bwp.a.b) {
            czd $$3 = this.a($$2);
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
      byg $$1 = this.g(byk.v);
      $$1.c(k.a());
      if ($$0) {
         $$1.b(k);
      }
   }

   protected float fe() {
      return 1.0F;
   }

   public float ff() {
      return this.n_() ? (this.ae.i() - this.ae.i()) * 0.2F + 1.5F : (this.ae.i() - this.ae.i()) * 0.2F + 1.0F;
   }

   protected boolean fg() {
      return this.eH();
   }

   @Override
   public void h(bwf $$0) {
      if (!this.fR()) {
         super.h($$0);
      }
   }

   private void c(bwf $$0) {
      feq $$1;
      if (this.dQ()) {
         $$1 = this.dt();
      } else if (!$$0.dQ() && !this.dV().a_($$0.dv()).a(axc.aM)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dC(), $$0.dC());
         $$1 = new feq(this.dA(), $$2, this.dG());
         boolean $$4 = this.dq() <= 4.0F && this.dr() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.dr() / 2.0;
            feq $$6 = $$1.b(0.0, $$5, 0.0);
            ffk $$7 = ffh.a(fel.a($$6, (double)this.dq(), (double)this.dr(), (double)this.dq()));
            $$1 = this.dV().a(this, $$7, $$6, (double)this.dq(), (double)this.dr(), (double)this.dq()).map($$1x -> $$1x.b(0.0, -$$5, 0.0)).orElse($$1);
         }
      }

      this.m($$1.d, $$1.e, $$1.f);
   }

   @Override
   public boolean cM() {
      return this.cL();
   }

   protected float fh() {
      return this.z(1.0F);
   }

   protected float z(float $$0) {
      return (float)this.h(byk.o) * $$0 * this.aS() + this.fi();
   }

   public float fi() {
      return this.b(bvl.h) ? 0.1F * ((float)this.c(bvl.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void s() {
      float $$0 = this.fh();
      if (!($$0 <= 1.0E-5F)) {
         feq $$1 = this.dy();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.cj()) {
            float $$2 = this.dL() * (float) (Math.PI / 180.0);
            this.j(new feq((double)(-azm.a($$2)) * 0.2, 0.0, (double)azm.b($$2) * 0.2));
         }

         this.ar = true;
      }
   }

   protected void fj() {
      this.i(this.dy().b(0.0, -0.04F, 0.0));
   }

   protected void c(axr<ewn> $$0) {
      this.i(this.dy().b(0.0, 0.04F, 0.0));
   }

   protected float fk() {
      return 0.8F;
   }

   public boolean a(ewo $$0) {
      return false;
   }

   @Override
   protected double bd() {
      return this.h(byk.n);
   }

   protected double fl() {
      boolean $$0 = this.dy().e <= 0.0;
      return $$0 && this.b(bvl.B) ? Math.min(this.be(), 0.01) : this.be();
   }

   public void a_(feq $$0) {
      ewo $$1 = this.dV().b_(this.dv());
      if ((this.bj() || this.bw()) && this.em() && !this.a($$1)) {
         this.m($$0);
      } else if (this.fJ()) {
         this.n($$0);
      } else {
         this.l($$0);
      }
   }

   private void l(feq $$0) {
      iu $$1 = this.aQ();
      float $$2 = this.aJ() ? this.dV().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      feq $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      bvj $$6 = this.c(bvl.y);
      if ($$6 != null) {
         $$5 += (0.05 * (double)($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.dV().C || this.dV().C($$1)) {
         $$5 -= this.fl();
      } else if (this.dC() > (double)this.dV().G_()) {
         $$5 = -0.1;
      } else {
         $$5 = 0.0;
      }

      if (this.ex()) {
         this.n($$4.d, $$5, $$4.f);
      } else {
         float $$7 = this instanceof cji ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void m(feq $$0) {
      boolean $$1 = this.dy().e <= 0.0;
      double $$2 = this.dC();
      double $$3 = this.fl();
      if (this.bj()) {
         float $$4 = this.cj() ? 0.9F : this.fk();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(byk.F);
         if (!this.aJ()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fo() - $$5) * $$6;
         }

         if (this.b(bvl.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bxi.a, this.dy());
         feq $$7 = this.dy();
         if (this.P && this.d_()) {
            $$7 = new feq($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.i(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bxi.a, this.dy());
         if (this.b(axh.b) <= this.dp()) {
            this.i(this.dy().d(0.5, 0.8F, 0.5));
            feq $$8 = this.a($$3, $$1, this.dy());
            this.i($$8);
         } else {
            this.i(this.dy().c(0.5));
         }

         if ($$3 != 0.0) {
            this.i(this.dy().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      feq $$9 = this.dy();
      if (this.P && this.f($$9.d, $$9.e + 0.6F - this.dC() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void n(feq $$0) {
      if (this.d_()) {
         this.l($$0);
         this.fm();
      } else {
         feq $$1 = this.dy();
         double $$2 = $$1.i();
         this.i(this.o($$1));
         this.a(bxi.a, this.dy());
         if (!this.dV().C) {
            double $$3 = this.dy().i();
            this.c($$2, $$3);
         }
      }
   }

   public void fm() {
      this.b(7, true);
      this.b(7, false);
   }

   private feq o(feq $$0) {
      feq $$1 = this.bT();
      float $$2 = this.dN() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fl();
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

   private void c(crc $$0, feq $$1) {
      feq $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.di()) {
         this.B(this.c($$0));
         this.a_($$2);
      } else {
         this.i(feq.c);
      }
   }

   protected void a(crc $$0, feq $$1) {
   }

   protected feq b(crc $$0, feq $$1) {
      return $$1;
   }

   protected float c(crc $$0) {
      return this.fo();
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

   private feq a(feq $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.i(this.p(this.dy()));
      this.a(bxi.a, this.dy());
      feq $$2 = this.dy();
      if ((this.P || this.bf) && (this.d_() || this.dw().a(dmh.rx) && dsg.a(this))) {
         $$2 = new feq($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public feq a(double $$0, boolean $$1, feq $$2) {
      if ($$0 != 0.0 && !this.cj()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new feq($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private feq p(feq $$0) {
      if (this.d_()) {
         this.k();
         float $$1 = 0.15F;
         double $$2 = azm.a($$0.d, -0.15F, 0.15F);
         double $$3 = azm.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dw().a(dmh.oy) && this.fI() && this instanceof crc) {
            $$4 = 0.0;
         }

         $$0 = new feq($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aJ() ? this.fo() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fn();
   }

   protected float fn() {
      return this.cW() instanceof crc ? this.fo() * 0.1F : 0.02F;
   }

   public float fo() {
      return this.bP;
   }

   public void B(float $$0) {
      this.bP = $$0;
   }

   public boolean c(arq $$0, bwf $$1) {
      this.B($$1);
      return false;
   }

   @Override
   public void h() {
      super.h();
      this.I();
      this.J();
      if (!this.dV().C) {
         int $$0 = this.eW();
         if ($$0 > 0) {
            if (this.aL <= 0) {
               this.aL = 20 * (30 - $$0);
            }

            this.aL--;
            if (this.aL <= 0) {
               this.o($$0 - 1);
            }
         }

         int $$1 = this.eX();
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
            this.eS().c();
         }

         if (this.fR() && !this.L()) {
            this.fS();
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

      bqo $$8 = bqn.a();
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
      if (this.fJ()) {
         this.bo++;
      } else {
         this.bo = 0;
      }

      if (this.fR()) {
         this.x(0.0F);
      }

      this.u();
      this.aZ.a();
   }

   private void G() {
      Map<bwp, czd> $$0 = this.H();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bwp, czd> H() {
      Map<bwp, czd> $$0 = null;

      for (bwp $$1 : bwp.j) {
         czd $$2 = this.bI.get($$1);
         czd $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bwp.class);
            }

            $$0.put($$1, $$3);
            byh $$4 = this.fa();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<bwp, czd> $$5 : $$0.entrySet()) {
            bwp $$6 = $$5.getKey();
            czd $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1x) -> {
                  byg $$2 = this.bF.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1x.a());
                     $$2.b($$1x);
                  }
               });
               if (this.dV() instanceof arq $$8) {
                  dfs.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(czd $$0, czd $$1) {
      return !czd.a($$1, $$0);
   }

   private void a(Map<bwp, czd> $$0) {
      czd $$1 = $$0.get(bwp.a);
      czd $$2 = $$0.get(bwp.b);
      if ($$1 != null && $$2 != null && czd.a($$1, this.bI.get(bwp.b)) && czd.a($$2, this.bI.get(bwp.a))) {
         ((arq)this.dV()).m().b(this, new acx(this, (byte)55));
         $$0.remove(bwp.a);
         $$0.remove(bwp.b);
         this.bI.put(bwp.a, $$1.v());
         this.bI.put(bwp.b, $$2.v());
      }
   }

   private void b(Map<bwp, czd> $$0) {
      List<Pair<bwp, czd>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         czd $$3 = $$2.v();
         $$1.add(Pair.of($$1x, $$3));
         this.bI.put($$1x, $$3);
      });
      ((arq)this.dV()).m().b(this, new afg(this.ar(), $$1));
   }

   protected void C(float $$0) {
      float $$1 = azm.h($$0 - this.aV);
      this.aV += $$1 * 0.3F;
      float $$2 = azm.h(this.dL() - this.aV);
      float $$3 = this.fp();
      if (Math.abs($$2) > $$3) {
         this.aV = this.aV + ($$2 - (float)azm.j((double)$$2) * $$3);
      }
   }

   protected float fp() {
      return 50.0F;
   }

   public void k_() {
      if (this.bQ > 0) {
         this.bQ--;
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

      this.bt.a((bwf)this);
      feq $$0 = this.dy();
      double $$1 = $$0.d;
      double $$2 = $$0.e;
      double $$3 = $$0.f;
      if (this.aq().equals(bwo.bS)) {
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
      bqo $$4 = bqn.a();
      $$4.a("ai");
      this.fq();
      if (this.fg()) {
         this.bf = false;
         this.bg = 0.0F;
         this.bi = 0.0F;
      } else if (this.dj() && !this.dV().C) {
         $$4.a("newAi");
         this.fu();
         $$4.c();
      }

      $$4.c();
      $$4.a("jump");
      if (this.bf && this.em()) {
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
               if ((this.aJ() || $$7 && $$5 <= $$8) && this.bQ == 0) {
                  this.s();
                  this.bQ = 10;
               }
            } else {
               this.c(axh.b);
            }
         } else {
            this.c(axh.a);
         }
      } else {
         this.bQ = 0;
      }

      $$4.c();
      $$4.a("travel");
      if (this.fJ()) {
         this.fs();
      }

      fel $$9 = this.cR();
      feq $$10 = new feq((double)this.bg, (double)this.bh, (double)this.bi);
      if (this.b(bvl.B) || this.b(bvl.y)) {
         this.k();
      }

      label126: {
         if (this.cW() instanceof crc $$11 && this.bK()) {
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
         this.r(this instanceof cji);
      }

      $$4.c();
      if (this.dV() instanceof arq $$12) {
         $$4.a("freezing");
         if (!this.eH()) {
            int $$13 = this.cu();
            if (this.av && this.dJ()) {
               this.k(Math.min(this.cx(), $$13 + 1));
            } else {
               this.k(Math.max(0, $$13 - 2));
            }
         }

         this.ei();
         this.ej();
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
      if (this.dV() instanceof arq $$14 && this.fr() && this.bl()) {
         this.a($$14, this.dW().i(), 1.0F);
      }
   }

   protected void fq() {
      this.bg *= 0.98F;
      this.bi *= 0.98F;
   }

   public boolean fr() {
      return false;
   }

   protected void fs() {
      this.cy();
      if (!this.dV().C) {
         if (!this.ft()) {
            this.b(7, false);
            return;
         }

         int $$0 = this.bo + 1;
         if ($$0 % 10 == 0) {
            int $$1 = $$0 / 10;
            if ($$1 % 2 == 0) {
               List<bwp> $$2 = bwp.j.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               bwp $$3 = af.a($$2, this.ae);
               this.a($$3).a(1, this, $$3);
            }

            this.a(efh.n);
         }
      }
   }

   protected boolean ft() {
      if (!this.aJ() && !this.bZ() && !this.b(bvl.y)) {
         for (bwp $$0 : bwp.j) {
            if (b(this.a($$0), $$0)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   protected void fu() {
   }

   @Override
   protected void o() {
      List<bwf> $$0 = this.dV().i(this, this.cR());
      if (!$$0.isEmpty()) {
         if (this.dV() instanceof arq $$1) {
            int $$2 = $$1.O().d(diw.w);
            if ($$2 > 0 && $$0.size() > $$2 - 1 && this.ae.a(4) == 0) {
               int $$3 = 0;

               for (bwf $$4 : $$0) {
                  if (!$$4.bZ()) {
                     $$3++;
                  }
               }

               if ($$3 > $$2 - 1) {
                  this.a($$1, this.dW().h(), 6.0F);
               }
            }
         }

         for (bwf $$5 : $$0) {
            this.D($$5);
         }
      }
   }

   protected void a(fel $$0, fel $$1) {
      fel $$2 = $$0.b($$1);
      List<bwf> $$3 = this.dV().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bwf $$4 : $$3) {
            if ($$4 instanceof bxe) {
               this.f((bxe)$$4);
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

   protected void D(bwf $$0) {
      $$0.h(this);
   }

   protected void f(bxe $$0) {
   }

   public boolean fv() {
      return (this.al.a(aC) & 4) != 0;
   }

   @Override
   public void bP() {
      bwf $$0 = this.dk();
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
   public bwz N_() {
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

   public void a(cnh $$0) {
      bwf $$1 = $$0.q();
      if ($$1 instanceof arr) {
         ap.R.a((arr)$$1, $$0.f(), this);
      }
   }

   public void a(bwf $$0, int $$1) {
      if (!$$0.dQ() && !this.dV().C && ($$0 instanceof cnh || $$0 instanceof crk || $$0 instanceof bwt)) {
         ((arq)this.dV()).m().b($$0, new agb($$0.ar(), this.ar(), $$1));
      }
   }

   public boolean E(bwf $$0) {
      return this.a($$0, dij.a.a, dij.b.a, $$0.dE());
   }

   public boolean a(bwf $$0, dij.a $$1, dij.b $$2, double $$3) {
      if ($$0.dV() != this.dV()) {
         return false;
      } else {
         feq $$4 = new feq(this.dA(), this.dE(), this.dG());
         feq $$5 = new feq($$0.dA(), $$3, $$0.dG());
         return $$5.f($$4) > 128.0 ? false : this.dV().a(new dij($$4, $$5, $$1, $$2, this)).d() == feo.a.a;
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
      return this.bK() && !this.V_() && !this.d_();
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
   public feq a(ja.a $$0, l.a $$1) {
      return k(super.a($$0, $$1));
   }

   public static feq k(feq $$0) {
      return new feq($$0.d, $$0.e, 0.0);
   }

   public float fw() {
      return this.bR;
   }

   public final void E(float $$0) {
      this.F(azm.a($$0, 0.0F, this.eV()));
   }

   protected void F(float $$0) {
      this.bR = $$0;
   }

   public void e_() {
   }

   public void J_() {
   }

   protected void fx() {
      this.bK = true;
   }

   public abstract bwx fy();

   public boolean fz() {
      return (this.al.a(aC) & 1) > 0;
   }

   public buc fA() {
      return (this.al.a(aC) & 2) > 0 ? buc.b : buc.a;
   }

   private void I() {
      if (this.fz()) {
         if (czd.b(this.b(this.fA()), this.bm)) {
            this.bm = this.b(this.fA());
            this.a(this.bm);
         } else {
            this.fF();
         }
      }
   }

   @Nullable
   private cnh b(czd $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dE() - 0.3F;
         cnh $$4 = new cnh(this.dV(), this.dA(), $$3, this.dG(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ae.i() * 0.5F;
            float $$6 = this.ae.i() * (float) (Math.PI * 2);
            $$4.n((double)(-azm.a($$6) * $$5), 0.2F, (double)(azm.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = azm.a(this.dN() * (float) (Math.PI / 180.0));
            float $$9 = azm.b(this.dN() * (float) (Math.PI / 180.0));
            float $$10 = azm.a(this.dL() * (float) (Math.PI / 180.0));
            float $$11 = azm.b(this.dL() * (float) (Math.PI / 180.0));
            float $$12 = this.ae.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.ae.i();
            $$4.n(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.ae.i() - this.ae.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   protected void a(czd $$0) {
      $$0.b(this.dV(), this, this.fC());
      if (--this.bn == 0 && !this.dV().C && !$$0.x()) {
         this.K_();
      }
   }

   private void J() {
      this.bX = this.bW;
      if (this.cl()) {
         this.bW = Math.min(1.0F, this.bW + 0.09F);
      } else {
         this.bW = Math.max(0.0F, this.bW - 0.09F);
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

   public void c(buc $$0) {
      czd $$1 = this.b($$0);
      if (!$$1.f() && !this.fz()) {
         this.bm = $$1;
         this.bn = $$1.a(this);
         if (!this.dV().C) {
            this.c(1, true);
            this.c(2, $$0 == buc.b);
            this.a(efh.D);
         }
      }
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (bD.equals($$0)) {
         if (this.dV().C) {
            this.fP().ifPresent(this::a);
         }
      } else if (aC.equals($$0) && this.dV().C) {
         if (this.fz() && this.bm.f()) {
            this.bm = this.b(this.fA());
            if (!this.bm.f()) {
               this.bn = this.bm.a(this);
            }
         } else if (!this.fz() && !this.bm.f()) {
            this.bm = czd.k;
            this.bn = 0;
         }
      }
   }

   @Override
   public void a(eu.a $$0, feq $$1) {
      super.a($$0, $$1);
      this.aY = this.aX;
      this.aV = this.aX;
      this.aW = this.aV;
   }

   @Override
   public float u(float $$0) {
      return azm.h($$0, this.aW, this.aV);
   }

   public void b(czd $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         feq $$3 = new feq(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dN() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dL() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ae.i()) * 0.6 - 0.3;
         feq $$5 = new feq(((double)this.ae.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dN() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dL() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dA(), this.dE(), this.dG());
         this.dV().a(new lt(lx.U, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void K_() {
      if (!this.dV().C || this.fz()) {
         buc $$0 = this.fA();
         if (!this.bm.equals(this.b($$0))) {
            this.fE();
         } else {
            if (!this.bm.f() && this.fz()) {
               czd $$1 = this.bm.a(this.dV(), this);
               if ($$1 != this.bm) {
                  this.a($$0, $$1);
               }

               this.fF();
            }
         }
      }
   }

   public void b(czd $$0) {
   }

   public czd fB() {
      return this.bm;
   }

   public int fC() {
      return this.bn;
   }

   public int fD() {
      return this.fz() ? this.bm.a(this) - this.fC() : 0;
   }

   public void fE() {
      if (!this.bm.f()) {
         this.bm.a(this.dV(), this, this.fC());
         if (this.bm.x()) {
            this.I();
         }
      }

      this.fF();
   }

   public void fF() {
      if (!this.dV().C) {
         boolean $$0 = this.fz();
         this.c(1, false);
         if ($$0) {
            this.a(efh.C);
         }
      }

      this.bm = czd.k;
      this.bn = 0;
   }

   public boolean fG() {
      return this.fH() != null;
   }

   @Nullable
   public czd fH() {
      if (!this.fz()) {
         return null;
      } else {
         dbe $$0 = this.bm.a(kj.I);
         if ($$0 != null) {
            int $$1 = this.bm.h().a(this.bm, this) - this.bn;
            if ($$1 >= $$0.a()) {
               return this.bm;
            }
         }

         return null;
      }
   }

   public boolean fI() {
      return this.cd();
   }

   public boolean fJ() {
      return this.i(7);
   }

   @Override
   public boolean cl() {
      return super.cl() || !this.fJ() && this.c(bxq.b);
   }

   public int fK() {
      return this.bo;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dA();
      double $$5 = this.dC();
      double $$6 = this.dG();
      double $$7 = $$1;
      boolean $$8 = false;
      iu $$9 = iu.a($$0, $$1, $$2);
      dja $$10 = this.dV();
      if ($$10.C($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.G_()) {
            iu $$12 = $$9.e();
            eah $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.b($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cR())) {
               $$8 = true;
            }
         }
      }

      if (!$$8) {
         this.b($$4, $$5, $$6);
         return false;
      } else {
         if ($$3) {
            $$10.a(this, (byte)46);
         }

         if (this instanceof bxm $$14) {
            $$14.O().m();
         }

         return true;
      }
   }

   public boolean fL() {
      return !this.eH();
   }

   public boolean fM() {
      return true;
   }

   public void a(iu $$0, boolean $$1) {
   }

   public boolean fN() {
      return false;
   }

   @Override
   public final bwi a(bxq $$0) {
      return $$0 == bxq.c ? aD : this.e($$0).a(this.el());
   }

   protected bwi e(bxq $$0) {
      return this.aq().n().a(this.ek());
   }

   public ImmutableList<bxq> fO() {
      return ImmutableList.of(bxq.a);
   }

   public fel f(bxq $$0) {
      bwi $$1 = this.a($$0);
      return new fel((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bxq $$0) {
      fel $$1 = this.a($$0).a(this.dt());
      return this.dV().b(this, $$1);
   }

   @Override
   public boolean n(boolean $$0) {
      return super.n($$0) && !this.fR();
   }

   public Optional<iu> fP() {
      return this.al.a(bD);
   }

   public void g(iu $$0) {
      this.al.a(bD, Optional.of($$0));
   }

   public void fQ() {
      this.al.a(bD, Optional.empty());
   }

   public boolean fR() {
      return this.fP().isPresent();
   }

   public void b(iu $$0) {
      if (this.bZ()) {
         this.bP();
      }

      eah $$1 = this.dV().a_($$0);
      if ($$1.b() instanceof dly) {
         this.dV().a($$0, $$1.b(dly.c, Boolean.valueOf(true)), 3);
      }

      this.b(bxq.c);
      this.a($$0);
      this.g($$0);
      this.i(feq.c);
      this.ar = true;
   }

   private void a(iu $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean L() {
      return this.fP().map($$0 -> this.dV().a_($$0).b() instanceof dly).orElse(false);
   }

   public void fS() {
      this.fP().filter(this.dV()::C).ifPresent($$0x -> {
         eah $$1 = this.dV().a_($$0x);
         if ($$1.b() instanceof dly) {
            ja $$2 = $$1.c(dly.e);
            this.dV().a($$0x, $$1.b(dly.c, Boolean.valueOf(false)), 3);
            feq $$3 = dly.a(this.aq(), this.dV(), $$0x, $$2, this.dL()).orElseGet(() -> {
               iu $$1x = $$0x.d();
               return new feq((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            feq $$4 = feq.c($$0x).d($$3).d();
            float $$5 = (float)azm.d(azm.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.w($$5);
            this.x(0.0F);
         }
      });
      feq $$0 = this.dt();
      this.b(bxq.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fQ();
   }

   @Nullable
   public ja fT() {
      iu $$0 = this.fP().orElse(null);
      return $$0 != null ? dly.a(this.dV(), $$0) : null;
   }

   @Override
   public boolean bL() {
      return !this.fR() && super.bL();
   }

   public czd d(czd $$0) {
      return czd.k;
   }

   private static byte g(bwp $$0) {
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

   public void a(cyz $$0, bwp $$1) {
      this.dV().a(this, g($$1));
      this.a(this.a($$1), $$1, this.bF);
   }

   private void a(czd $$0, bwp $$1, byh $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         byg $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      dfs.a($$0, this, $$1);
   }

   public static bwp d(buc $$0) {
      return $$0 == buc.a ? bwp.a : bwp.b;
   }

   public final boolean e(czd $$0) {
      if (this.bK() && !this.V_()) {
         dhm $$1 = $$0.a(kj.D);
         if ($$1 != null && $$1.g()) {
            bwp $$2 = $$1.b();
            return this.e($$2) && $$1.a(this.aq()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(bwp $$0) {
      return true;
   }

   public final bwp f(czd $$0) {
      dhm $$1 = $$0.a(kj.D);
      return $$1 != null && this.e($$1.b()) ? $$1.b() : bwp.a;
   }

   public final boolean a(czd $$0, bwp $$1) {
      dhm $$2 = $$0.a(kj.D);
      return $$2 == null ? $$1 == bwp.a && this.e(bwp.a) : $$1 == $$2.b() && this.e($$2.b()) && $$2.a(this.aq());
   }

   private static bxv a(bxe $$0, bwp $$1) {
      return $$1 != bwp.f && $$1 != bwp.a && $$1 != bwp.b ? bxv.a($$0, $$1, $$2 -> $$2.f() || $$0.f($$2) == $$1) : bxv.a($$0, $$1);
   }

   @Nullable
   private static bwp r(int $$0) {
      if ($$0 == 100 + bwp.f.b()) {
         return bwp.f;
      } else if ($$0 == 100 + bwp.e.b()) {
         return bwp.e;
      } else if ($$0 == 100 + bwp.d.b()) {
         return bwp.d;
      } else if ($$0 == 100 + bwp.c.b()) {
         return bwp.c;
      } else if ($$0 == 98) {
         return bwp.a;
      } else if ($$0 == 99) {
         return bwp.b;
      } else if ($$0 == 105) {
         return bwp.g;
      } else {
         return $$0 == 106 ? bwp.h : null;
      }
   }

   @Override
   public bxv a_(int $$0) {
      bwp $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dJ() {
      if (this.V_()) {
         return false;
      } else {
         for (bwp $$0 : bwq.i) {
            if (this.a($$0).a(axk.br)) {
               return false;
            }
         }

         return super.dJ();
      }
   }

   @Override
   public boolean co() {
      return !this.dV().w_() && this.b(bvl.x) || super.co();
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
      this.e($$1, $$2, $$3);
      this.aV = $$0.o();
      this.aX = $$0.o();
      this.aW = this.aV;
      this.aY = this.aX;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.n($$0.j(), $$0.k(), $$0.l());
   }

   public float fU() {
      dcl $$0 = this.dZ().a(kj.B);
      return $$0 != null ? $$0.b() : 0.0F;
   }

   @Override
   public float dP() {
      float $$0 = (float)this.h(byk.B);
      return this.cW() instanceof crc ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public feq m(bwf $$0) {
      return this.dt().e(this.a($$0, this.a(this.aw()), this.el() * this.ek()));
   }

   protected void a(int $$0, double $$1) {
      this.aX = (float)azm.e(1.0 / (double)$$0, (double)this.aX, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(azm.c((double)$$0 * this.h(byk.h)));
   }

   public boolean fV() {
      return false;
   }

   public boolean a(arq $$0, buu $$1) {
      return this.d($$1) || dfs.a($$0, this, $$1);
   }

   public static boolean b(czd $$0, bwp $$1) {
      if (!$$0.c(kj.F)) {
         return false;
      } else {
         dhm $$2 = $$0.a(kj.D);
         return $$2 != null && $$1 == $$2.b() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fW() {
      return this.bb;
   }

   public static record a(awm a, awm b) {
   }
}

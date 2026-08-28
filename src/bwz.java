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

public abstract class bwz extends bwa implements bvt {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "active_effects";
   private static final ale c = ale.b("powder_snow");
   private static final ale d = ale.b("sprinting");
   private static final byd k = new byd(d, 0.3F, byd.a.c);
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
   protected static final akh<Byte> aC = akl.a(bwz.class, akj.a);
   private static final akh<Float> bx = akl.a(bwz.class, akj.d);
   private static final akh<List<lv>> by = akl.a(bwz.class, akj.m);
   private static final akh<Boolean> bz = akl.a(bwz.class, akj.k);
   private static final akh<Integer> bA = akl.a(bwz.class, akj.b);
   private static final akh<Integer> bB = akl.a(bwz.class, akj.b);
   private static final akh<Optional<iu>> bC = akl.a(bwz.class, akj.p);
   private static final int bD = 15;
   protected static final bwd aD = bwd.c(0.2F, 0.2F).b(0.2F);
   public static final float aE = 0.5F;
   public static final float aF = 0.5F;
   public static final String aG = "attributes";
   public static final Predicate<bwz> aH = $$0 -> {
      if ($$0 instanceof cqs $$1) {
         cys $$3 = $$1.a(bwk.f);
         return !$$3.a(axi.cr);
      } else {
         return true;
      }
   };
   private final byc bE;
   private final bum bF = new bum(this);
   private final Map<je<bvc>, bve> bG = Maps.newHashMap();
   private final Map<bwk, cys> bH = af.a(bwk.class, $$0x -> cys.k);
   public boolean aI;
   private boolean bI = false;
   public btx aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final bxy aT = new bxy();
   public final int aU = 20;
   public float aV;
   public float aW;
   public float aX;
   public float aY;
   public final bvz aZ = new bvz(this);
   @Nullable
   protected bwg<cqs> ba;
   protected int bb;
   protected boolean bc;
   protected int bd;
   protected float be;
   protected boolean bf;
   public float bg;
   public float bh;
   public float bi;
   protected bwu bj = new bwu(this);
   protected double bk;
   protected int bl;
   private boolean bJ = true;
   @Nullable
   private bwg<bwz> bK;
   private int bL;
   @Nullable
   private bwz bM;
   private int bN;
   private float bO;
   private int bP;
   private float bQ;
   protected cys bm = cys.k;
   protected int bn;
   protected int bo;
   private iu bR;
   private Optional<iu> bS = Optional.empty();
   @Nullable
   private bup bT;
   private long bU;
   protected int bp;
   protected float bq;
   @Nullable
   protected cys br;
   private float bV;
   private float bW;
   protected bxz<?> bs;
   private boolean bX;
   private final EnumMap<bwk, Reference2ObjectMap<dff, Set<dfx>>> bY = new EnumMap<>(bwk.class);

   protected bwz(bwj<? extends bwz> $$0, dip $$1) {
      super($$0, $$1);
      this.bE = new byc(byg.a($$0));
      this.d(this.eT());
      this.I = true;
      this.ay();
      this.w((float)(Math.random() * (float) (Math.PI * 2)));
      this.aX = this.dL();
      ul $$2 = ul.a;
      this.bs = this.a(new Dynamic($$2, (uu)$$2.createMap(ImmutableMap.of($$2.a("memories"), (uu)$$2.emptyMap()))));
   }

   public bxz<?> eb() {
      return this.bs;
   }

   protected bxz.b<?> ec() {
      return bxz.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bxz<?> a(Dynamic<?> $$0) {
      return this.ec().a($$0);
   }

   @Override
   public void c(aro $$0) {
      this.a($$0, this.dW().y(), Float.MAX_VALUE);
   }

   public boolean a(bwj<?> $$0) {
      return true;
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(aC, (byte)0);
      $$0.a(by, List.of());
      $$0.a(bz, false);
      $$0.a(bA, 0);
      $$0.a(bB, 0);
      $$0.a(bx, 1.0F);
      $$0.a(bC, Optional.empty());
   }

   public static bye.a ed() {
      return bye.a()
         .a(byf.s)
         .a(byf.p)
         .a(byf.v)
         .a(byf.a)
         .a(byf.b)
         .a(byf.r)
         .a(byf.B)
         .a(byf.y)
         .a(byf.n)
         .a(byf.x)
         .a(byf.k)
         .a(byf.o)
         .a(byf.w)
         .a(byf.h)
         .a(byf.i)
         .a(byf.F)
         .a(byf.u)
         .a(byf.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dzo $$2, iu $$3) {
      if (!this.bj()) {
         this.bq();
      }

      if (this.dV() instanceof aro $$4 && $$1 && this.Z > 0.0) {
         this.b($$4, $$3);
         double $$5 = (double)Math.max(0, azk.a(this.h(this.Z)));
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
      return this.aq().a(axd.m);
   }

   public float a(float $$0) {
      return azk.h($$0, this.bW, this.bV);
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

      if (this.dV() instanceof aro $$0) {
         dfh.b($$0, this);
      }

      super.az();
      bqj $$1 = bqi.a();
      $$1.a("livingEntityBaseTick");
      if (this.bi() || this.dV().C) {
         this.aH();
      }

      if (this.bK() && this.dV() instanceof aro $$2) {
         boolean $$3 = this instanceof cqs;
         if (this.bL()) {
            this.a($$2, this.dW().g(), 1.0F);
         } else if ($$3 && !$$2.A_().a(this.cR())) {
            double $$4 = $$2.A_().a(this) + $$2.A_().n();
            if ($$4 < 0.0) {
               double $$5 = $$2.A_().o();
               if ($$5 > 0.0) {
                  this.a($$2, this.dW().x(), (float)Math.max(1, azk.a(-$$4 * $$5)));
               }
            }
         }

         if (this.a(axf.a) && !$$2.a_(iu.a(this.dA(), this.dE(), this.dG())).a(dlw.nF)) {
            boolean $$6 = !this.ee() && !bvf.c(this) && (!$$3 || !((cqs)this).gj().a);
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

      if (this.aj > 0 && !(this instanceof arp)) {
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

      bwz $$8 = this.eq();
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
      return azk.h((float)this.h(byf.u), super.aT(), 1.0F);
   }

   public float eg() {
      return 0.0F;
   }

   protected void eh() {
      byb $$0 = this.g(byf.v);
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
            byb $$1 = this.g(byf.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cv();
            $$1.b(new byd(c, (double)$$2, byd.a.a));
         }
      }
   }

   protected void b(aro $$0, iu $$1) {
      dfh.a($$0, this);
   }

   public boolean n_() {
      return false;
   }

   public float ej() {
      return this.n_() ? 0.5F : 1.0F;
   }

   public final float ek() {
      byc $$0 = this.eZ();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(byf.y));
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
         this.a(bwa.e.a);
      }
   }

   public boolean en() {
      return !this.n_();
   }

   protected boolean eo() {
      return !this.n_();
   }

   protected int l(int $$0) {
      byb $$1 = this.g(byf.w);
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

   public final int a(aro $$0, @Nullable bwa $$1) {
      return dfh.a($$0, $$1, this, this.e($$0));
   }

   protected int e(aro $$0) {
      return 0;
   }

   protected boolean ep() {
      return false;
   }

   @Nullable
   public bwz eq() {
      return bwg.a(this.bK, this.dV(), bwz.class);
   }

   @Nullable
   public cqs er() {
      return bwg.a(this.ba, this.dV(), cqs.class);
   }

   @Override
   public bwz am() {
      return this.eq();
   }

   public int es() {
      return this.bL;
   }

   public void a(cqs $$0, int $$1) {
      this.a(new bwg<>($$0), $$1);
   }

   public void a(UUID $$0, int $$1) {
      this.a(new bwg<>($$0), $$1);
   }

   private void a(bwg<cqs> $$0, int $$1) {
      this.ba = $$0;
      this.bb = $$1;
   }

   public void a(@Nullable bwz $$0) {
      this.bK = $$0 != null ? new bwg<>($$0) : null;
      this.bL = this.af;
   }

   @Nullable
   public bwz et() {
      return this.bM;
   }

   public int eu() {
      return this.bN;
   }

   public void B(bwa $$0) {
      if ($$0 instanceof bwz) {
         this.bM = (bwz)$$0;
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

   protected boolean b(bwk $$0) {
      return true;
   }

   public void a(bwk $$0, cys $$1, cys $$2) {
      if (!this.dV().w_() && !this.U_()) {
         if (!cys.c($$1, $$2) && !this.ak) {
            dhb $$3 = $$2.a(kj.D);
            if (!this.bb() && $$3 != null && $$0 == $$3.b()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), this.a($$0, $$2, $$3), this.dm(), 1.0F, 1.0F, this.ae.g());
            }

            if (this.b($$0)) {
               this.a($$3 != null ? eeo.v : eeo.S);
            }
         }
      }
   }

   protected je<awk> a(bwk $$0, cys $$1, dhb $$2) {
      return $$2.c();
   }

   @Override
   public void a(bwa.e $$0) {
      if (($$0 == bwa.e.a || $$0 == bwa.e.b) && this.dV() instanceof aro $$1) {
         this.a($$1, $$0);
      }

      super.a($$0);
      this.bs.a();
   }

   protected void a(aro $$0, bwa.e $$1) {
      for (bve $$2 : this.eC()) {
         $$2.a($$0, this, $$1);
      }

      this.bG.clear();
   }

   @Override
   public void b(tx $$0) {
      $$0.a("Health", this.eF());
      $$0.a("HurtTime", (short)this.aN);
      $$0.a("HurtByTimestamp", this.bL);
      $$0.a("DeathTime", (short)this.aP);
      $$0.a("AbsorptionAmount", this.fv());
      $$0.a("attributes", this.eZ().d());
      if (!this.bG.isEmpty()) {
         ud $$1 = new ud();

         for (bve $$2 : this.bG.values()) {
            $$1.add($$2.k());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fI());
      this.fO().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<uu> $$3 = this.bs.a(ul.a);
      $$3.resultOrPartial(a::error).ifPresent($$1 -> $$0.a("Brain", $$1));
      this.ba = bwg.b($$0, "last_hurt_by_player");
      this.bb = $$0.h("last_hurt_by_player_memory_time");
      this.bK = bwg.b($$0, "last_hurt_by_mob");
      this.bL = $$0.h("ticks_since_last_hurt_by_mob") + this.af;
   }

   @Override
   public void a(tx $$0) {
      this.F($$0.j("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dV() != null && !this.dV().C) {
         this.eZ().a($$0.c("attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         ud $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tx $$3 = $$1.a($$2);
            bve $$4 = bve.a($$3);
            if ($$4 != null) {
               this.bG.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.d($$0.j("Health"));
      }

      this.aN = $$0.g("HurtTime");
      this.aP = $$0.g("DeathTime");
      this.bL = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         ffb $$6 = this.dV().R();
         few $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cH(), $$7);
         if (!$$8) {
            a.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         iu $$9 = new iu($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$9);
         this.al.a(aq, bxl.c);
         if (!this.ak) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bs = this.a(new Dynamic(ul.a, $$0.c("Brain")));
      }

      if (this.ba != null) {
         this.ba.a($$0, "last_hurt_by_player");
         $$0.a("last_hurt_by_player_memory_time", this.bb);
      }

      if (this.bK != null) {
         this.bK.a($$0, "last_hurt_by_mob");
         $$0.a("ticks_since_last_hurt_by_mob", this.af - this.bL);
      }
   }

   protected void ex() {
      if (this.dV() instanceof aro $$0) {
         Iterator<je<bvc>> $$1 = this.bG.keySet().iterator();

         try {
            while ($$1.hasNext()) {
               je<bvc> $$2 = $$1.next();
               bve $$3 = this.bG.get($$2);
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
         for (bve $$4 : this.bG.values()) {
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
         this.k(this.b(bvg.n));
         this.j();
      }
   }

   private void j() {
      List<lv> $$0 = this.bG.values().stream().filter(bve::g).map(bve::a).toList();
      this.al.a(by, $$0);
      this.al.a(bz, d(this.bG.values()));
   }

   private void q() {
      boolean $$0 = this.co();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable bwa $$0) {
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
         cys $$3 = this.a(bwk.f);
         bwj<?> $$4 = $$0.aq();
         if ($$4 == bwj.bf && $$3.a(cyw.vo)
            || $$4 == bwj.bO && $$3.a(cyw.vr)
            || $$4 == bwj.aR && $$3.a(cyw.vu)
            || $$4 == bwj.aS && $$3.a(cyw.vu)
            || $$4 == bwj.E && $$3.a(cyw.vs)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bwz $$0) {
      return $$0 instanceof cqs && this.dV().an() == btv.a ? false : $$0.ey();
   }

   public boolean ey() {
      return !this.cC() && this.ez();
   }

   public boolean ez() {
      return !this.U_() && this.bK();
   }

   public static boolean d(Collection<bve> $$0) {
      for (bve $$1 : $$0) {
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
         Map<je<bvc>, bve> $$0 = Maps.newHashMap(this.bG);
         this.bG.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<bve> eC() {
      return this.bG.values();
   }

   public Map<je<bvc>, bve> eD() {
      return this.bG;
   }

   public boolean b(je<bvc> $$0) {
      return this.bG.containsKey($$0);
   }

   @Nullable
   public bve c(je<bvc> $$0) {
      return this.bG.get($$0);
   }

   public float a(je<bvc> $$0, float $$1) {
      bve $$2 = this.c($$0);
      return $$2 != null ? $$2.a(this, $$1) : 0.0F;
   }

   public final boolean a(bve $$0) {
      return this.b($$0, null);
   }

   public boolean b(bve $$0, @Nullable bwa $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         bve $$2 = this.bG.get($$0.c());
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

   public boolean b(bve $$0) {
      if (this.aq().a(axd.G)) {
         return !$$0.a(bvg.M);
      } else if (this.aq().a(axd.F)) {
         return !$$0.a(bvg.L);
      } else {
         return !this.aq().a(axd.w) ? true : !$$0.a(bvg.j) && !$$0.a(bvg.s);
      }
   }

   public void c(bve $$0, @Nullable bwa $$1) {
      if (this.b($$0)) {
         bve $$2 = this.bG.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eE() {
      return this.aq().a(axd.x);
   }

   @Nullable
   public final bve d(je<bvc> $$0) {
      return this.bG.remove($$0);
   }

   public boolean e(je<bvc> $$0) {
      bve $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(bve $$0, @Nullable bwa $$1) {
      if (!this.dV().C) {
         this.bJ = true;
         $$0.c().a().a(this.eZ(), $$0.e());
         this.c($$0);
      }
   }

   public void c(bve $$0) {
      for (bwa $$1 : this.cY()) {
         if ($$1 instanceof arp $$2) {
            $$2.f.b(new agg(this.ar(), $$0, false));
         }
      }
   }

   protected void a(bve $$0, boolean $$1, @Nullable bwa $$2) {
      if (!this.dV().C) {
         this.bJ = true;
         if ($$1) {
            bvc $$3 = $$0.c().a();
            $$3.a(this.eZ());
            $$3.a(this.eZ(), $$0.e());
            this.u();
         }

         this.c($$0);
      }
   }

   protected void c(Collection<bve> $$0) {
      if (!this.dV().C) {
         this.bJ = true;

         for (bve $$1 : $$0) {
            $$1.c().a().a(this.eZ());

            for (bwa $$2 : this.cY()) {
               if ($$2 instanceof arp $$3) {
                  $$3.f.b(new aei(this.ar(), $$1.c()));
               }
            }
         }

         this.u();
      }
   }

   private void u() {
      Set<byb> $$0 = this.eZ().b();

      for (byb $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(je<bya> $$0) {
      if ($$0.a(byf.s)) {
         float $$1 = this.eT();
         if (this.eF() > $$1) {
            this.d($$1);
         }
      } else if ($$0.a(byf.r)) {
         float $$2 = this.eU();
         if (this.fv() > $$2) {
            this.E($$2);
         }
      } else if ($$0.a(byf.y)) {
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
      this.al.a(bx, azk.a($$0, 0.0F, this.eT()));
   }

   public boolean eG() {
      return this.eF() <= 0.0F;
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.eG()) {
         return false;
      } else if ($$1.a(axb.i) && this.b(bvg.l)) {
         return false;
      } else {
         if (this.fQ()) {
            this.fR();
         }

         this.bd = 0;
         if ($$2 < 0.0F) {
            $$2 = 0.0F;
         }

         float $$3 = $$2;
         boolean $$4 = false;
         float $$5 = 0.0F;
         dat $$6 = this.fA().a(kj.I);
         if ($$2 > 0.0F && this.i($$1)) {
            if ($$6 != null) {
               $$6.a(this.dV(), this.fA(), this, this.fz(), $$5);
               $$5 = $$6.a($$1, $$2);
            } else {
               $$5 = $$2;
            }

            $$2 -= $$5;
            if (!$$1.a(axb.j) && $$1.c() instanceof bwz $$8) {
               this.b($$0, $$8);
            }

            $$4 = true;
         }

         if ($$1.a(axb.o) && this.aq().a(axd.l)) {
            $$2 *= 5.0F;
         }

         if ($$1.a(axb.a) && !this.a(bwk.f).f()) {
            this.d($$1, $$2);
            $$2 *= 0.75F;
         }

         if (Float.isNaN($$2) || Float.isInfinite($$2)) {
            $$2 = Float.MAX_VALUE;
         }

         boolean $$9 = true;
         if ((float)this.aj > 10.0F && !$$1.a(axb.e)) {
            if ($$2 <= this.be) {
               return false;
            }

            this.b($$0, $$1, $$2 - this.be);
            this.be = $$2;
            $$9 = false;
         } else {
            this.be = $$2;
            this.aj = 20;
            this.b($$0, $$1, $$2);
            this.aO = 10;
            this.aN = this.aO;
         }

         this.f($$1);
         this.g($$1);
         if ($$9) {
            if ($$4 && $$6 != null) {
               $$6.a($$0, this);
            } else {
               $$0.a(this, $$1);
            }

            if (!$$1.a(axb.r) && (!$$4 || $$2 > 0.0F)) {
               this.bC();
            }

            if (!$$1.a(axb.z)) {
               double $$10 = 0.0;
               double $$11 = 0.0;
               if ($$1.c() instanceof crm $$12) {
                  DoubleDoubleImmutablePair $$13 = $$12.a_(this, $$1);
                  $$10 = -$$13.leftDouble();
                  $$11 = -$$13.rightDouble();
               } else if ($$1.i() != null) {
                  $$10 = $$1.i().a() - this.dA();
                  $$11 = $$1.i().c() - this.dG();
               }

               this.p(0.4F, $$10, $$11);
               if (!$$4) {
                  this.a($$10, $$11);
               }
            }
         }

         if (this.eG()) {
            if (!this.k($$1)) {
               if ($$9) {
                  this.b(this.l_());
                  this.j($$1);
               }

               this.a($$1);
            }
         } else if ($$9) {
            this.h($$1);
            this.j($$1);
         }

         boolean $$14 = !$$4 || $$2 > 0.0F;
         if ($$14) {
            this.bT = $$1;
            this.bU = this.dV().ae();

            for (bve $$15 : this.eC()) {
               $$15.a($$0, this, $$1, $$2);
            }
         }

         if (this instanceof arp $$16) {
            ap.i.a($$16, $$1, $$3, $$2, $$4);
            if ($$5 > 0.0F && $$5 < 3.4028235E37F) {
               $$16.a(awv.K, Math.round($$5 * 10.0F));
            }
         }

         if ($$1.d() instanceof arp $$17) {
            ap.h.a($$17, this, $$1, $$3, $$2, $$4);
         }

         return $$14;
      }
   }

   private void j(bup $$0) {
      if ($$0.a(bus.P)) {
         awm $$1 = this instanceof cqs ? awm.h : awm.f;
         this.dV().a(null, this.dt().d, this.dt().e, this.dt().f, awl.Av, $$1);
      }
   }

   protected void f(bup $$0) {
      if ($$0.d() instanceof bwz $$1 && !$$0.a(axb.q) && (!$$0.a(bus.I) || !this.aq().a(axd.E))) {
         this.a($$1);
      }
   }

   @Nullable
   protected cqs g(bup $$0) {
      bwa $$1 = $$0.d();
      if ($$1 instanceof cqs $$2) {
         this.a($$2, 100);
      } else if ($$1 instanceof cju $$3 && $$3.q()) {
         if ($$3.d() != null) {
            this.a($$3.d().c(), 100);
         } else {
            this.ba = null;
            this.bb = 0;
         }
      }

      return bwg.a(this.ba, this.dV(), cqs.class);
   }

   protected void b(aro $$0, bwz $$1) {
      $$1.d(this);
   }

   protected void d(bwz $$0) {
      $$0.p(0.5, $$0.dA() - this.dA(), $$0.dG() - this.dG());
   }

   private boolean k(bup $$0) {
      if ($$0.a(axb.d)) {
         return false;
      } else {
         cys $$1 = null;
         dbd $$2 = null;

         for (btx $$3 : btx.values()) {
            cys $$4 = this.b($$3);
            $$2 = $$4.a(kj.H);
            if ($$2 != null) {
               $$1 = $$4.v();
               $$4.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof arp $$5) {
               $$5.b(awv.c.b($$1.h()));
               ap.C.a($$5, $$1);
               this.a(eeo.C);
            }

            this.d(1.0F);
            $$2.a($$1, this);
            this.dV().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public bup eH() {
      if (this.dV().ae() - this.bU > 40L) {
         this.bT = null;
      }

      return this.bT;
   }

   protected void h(bup $$0) {
      this.b(this.e($$0));
   }

   public void b(@Nullable awk $$0) {
      if ($$0 != null) {
         this.a($$0, this.fd(), this.fe());
      }
   }

   public boolean i(bup $$0) {
      bwa $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cqz $$3 && $$3.u() > 0) {
         $$2 = true;
      }

      if (!$$0.a(axb.c) && this.fF() && !$$2) {
         fdw $$4 = $$0.i();
         if ($$4 != null) {
            fdw $$5 = this.d(0.0F, this.cA());
            fdw $$6 = $$4.a(this.dt());
            $$6 = new fdw($$6.d, 0.0, $$6.f).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void h(cys $$0) {
      if (!$$0.f()) {
         je<awk> $$1 = $$0.a(kj.au);
         if ($$1 != null && !this.bb()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), $$1.a(), this.dm(), 0.8F, 0.8F + this.dV().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(bup $$0) {
      if (!this.dQ() && !this.bc) {
         bwa $$1 = $$0.d();
         bwz $$2 = this.eS();
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
         if (this.dV() instanceof aro $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(eeo.p);
               this.b($$3, $$0);
               this.e($$2);
            }

            this.dV().a(this, (byte)3);
         }

         this.b(bxl.h);
      }
   }

   protected void e(@Nullable bwz $$0) {
      if (this.dV() instanceof aro $$1) {
         boolean var6 = false;
         if ($$0 instanceof cmk) {
            if ($$1.O().c(dil.c)) {
               iu $$4 = this.dv();
               dzo $$5 = dlw.ck.m();
               if (this.dV().a_($$4).l() && $$5.a((dis)this.dV(), $$4)) {
                  this.dV().a($$4, $$5, 3);
                  var6 = true;
               }
            }

            if (!var6) {
               cmx $$6 = new cmx(this.dV(), this.dA(), this.dC(), this.dG(), new cys(cyw.dF));
               this.dV().b($$6);
            }
         }
      }
   }

   protected void b(aro $$0, bup $$1) {
      boolean $$2 = this.bb > 0;
      if (this.eo() && $$0.O().c(dil.f)) {
         this.b($$0, $$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.f($$0);
      this.b($$0, $$1.d());
   }

   protected void f(aro $$0) {
   }

   protected void b(aro $$0, @Nullable bwa $$1) {
      if (!this.eK() && (this.ep() || this.bb > 0 && this.en() && $$0.O().c(dil.f))) {
         bwo.a($$0, this.dt(), this.a($$0, $$1));
      }
   }

   protected void a(aro $$0, bup $$1, boolean $$2) {
   }

   public long eI() {
      return 0L;
   }

   protected float b(bwa $$0, bup $$1) {
      float $$2 = (float)this.h(byf.d);
      return this.dV() instanceof aro $$3 ? dfh.d($$3, this.dZ(), $$0, $$1, $$2) : $$2;
   }

   protected void b(aro $$0, bup $$1, boolean $$2) {
      Optional<ald<eys>> $$3 = this.ea();
      if (!$$3.isEmpty()) {
         eys $$4 = $$0.p().bc().b($$3.get());
         eyq.a $$5 = new eyq.a($$0).a(fbh.a, this).a(fbh.f, this.dt()).a(fbh.c, $$1).b(fbh.d, $$1.d()).b(fbh.e, $$1.c());
         cqs $$6 = this.er();
         if ($$2 && $$6 != null) {
            $$5 = $$5.a(fbh.b, $$6).a($$6.eg());
         }

         eyq $$7 = $$5.a(fbg.g);
         $$4.a($$7, this.eI(), $$1x -> this.a($$0, $$1x));
      }
   }

   public boolean a(aro $$0, ald<eys> $$1, BiConsumer<aro, cys> $$2) {
      return this.a($$0, $$1, $$0x -> $$0x.a(fbh.f, this.dt()).a(fbh.a, this).a(fbg.j), $$2);
   }

   protected void a(aro $$0, ald<eys> $$1, cys $$2, BiConsumer<aro, cys> $$3) {
      this.a($$0, $$1, $$1x -> $$1x.a(fbh.f, this.dt()).a(fbh.a, this).a(fbh.i, $$2).a(fbg.s), $$3);
   }

   protected boolean a(aro $$0, ald<eys> $$1, Function<eyq.a, eyq> $$2, BiConsumer<aro, cys> $$3) {
      eys $$4 = $$0.p().bc().b($$1);
      eyq $$5 = $$2.apply(new eyq.a($$0));
      List<cys> $$6 = $$4.a($$5);
      if (!$$6.isEmpty()) {
         $$6.forEach($$2x -> $$3.accept($$0, $$2x));
         return true;
      } else {
         return false;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(byf.p);
      if (!($$0 <= 0.0)) {
         this.ar = true;
         fdw $$3 = this.dy();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         fdw $$4 = new fdw($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aJ() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected awk e(bup $$0) {
      return awl.kG;
   }

   @Nullable
   protected awk l_() {
      return awl.kB;
   }

   private awk q(int $$0) {
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

   protected fdr eM() {
      fdr $$0 = this.cR();
      bwa $$1 = this.dk();
      if ($$1 != null) {
         fdw $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dff, Set<dfx>> c(bwk $$0) {
      return (Map<dff, Set<dfx>>)this.bY.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public bwz.a eN() {
      return new bwz.a(awl.kH, awl.kz);
   }

   public Optional<iu> eO() {
      return this.bS;
   }

   public boolean d_() {
      if (this.U_()) {
         return false;
      } else {
         iu $$0 = this.dv();
         dzo $$1 = this.dw();
         if ($$1.a(axa.aS)) {
            this.bS = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof duq && this.c($$0, $$1)) {
            this.bS = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(iu $$0, dzo $$1) {
      if (!$$1.c(duq.b)) {
         return false;
      } else {
         dzo $$2 = this.dV().a_($$0.e());
         return $$2.a(dlw.cX) && $$2.c(dqd.b) == $$1.c(duq.e);
      }
   }

   @Override
   public boolean bK() {
      return !this.dQ() && this.eF() > 0.0F;
   }

   public boolean a(bwz $$0, double $$1, boolean $$2, boolean $$3, double... $$4) {
      fdw $$5 = $$0.h(1.0F).d();

      for (double $$6 : $$4) {
         fdw $$7 = new fdw(this.dA() - $$0.dA(), $$6 - $$0.dE(), this.dG() - $$0.dG());
         double $$8 = $$7.g();
         $$7 = $$7.d();
         double $$9 = $$5.b($$7);
         if ($$9 > 1.0 - $$1 / ($$2 ? $$8 : 1.0) && $$0.a(this, $$3 ? dhy.a.c : dhy.a.a, dhy.b.a, $$6)) {
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
      return azk.d($$0 + 3.0F);
   }

   @Override
   public boolean a(double $$0, float $$1, bup $$2) {
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
      if (this.aq().a(axd.o)) {
         return 0;
      } else {
         double $$2 = this.h($$0);
         return azk.a($$2 * (double)$$1 * this.h(byf.k));
      }
   }

   private double h(double $$0) {
      return $$0 + 1.0E-6 - this.h(byf.x);
   }

   protected void eP() {
      if (!this.bb()) {
         int $$0 = azk.a(this.dA());
         int $$1 = azk.a(this.dC() - 0.2F);
         int $$2 = azk.a(this.dG());
         dzo $$3 = this.dV().a_(new iu($$0, $$1, $$2));
         if (!$$3.l()) {
            dtn $$4 = $$3.A();
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
      return azk.a(this.h(byf.a));
   }

   protected void c(bup $$0, float $$1) {
   }

   protected void d(bup $$0, float $$1) {
   }

   protected void a(bup $$0, float $$1, bwk... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bwk $$4 : $$2) {
            cys $$5 = this.a($$4);
            dhb $$6 = $$5.a(kj.D);
            if ($$6 != null && $$6.i() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float e(bup $$0, float $$1) {
      if (!$$0.a(axb.b)) {
         this.c($$0, $$1);
         $$1 = bul.a(this, $$1, $$0, (float)this.eQ(), (float)this.h(byf.b));
      }

      return $$1;
   }

   protected float f(bup $$0, float $$1) {
      if ($$0.a(axb.f)) {
         return $$1;
      } else {
         if (this.b(bvg.k) && !$$0.a(axb.g)) {
            int $$2 = (this.c(bvg.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof arp) {
                  ((arp)this).a(awv.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof arp) {
                  ((arp)$$0.d()).a(awv.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(axb.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dV() instanceof aro $$7) {
               $$8 = dfh.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bul.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void b(aro $$0, bup $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var10 = Math.max($$2 - this.fv(), 0.0F);
         this.E(this.fv() - ($$2 - var10));
         float $$4 = $$2 - var10;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F && $$1.d() instanceof arp $$5) {
            $$5.a(awv.H, Math.round($$4 * 10.0F));
         }

         if (var10 != 0.0F) {
            this.eR().a($$1, var10);
            this.d(this.eF() - var10);
            this.E(this.fv() - var10);
            this.a(eeo.o);
         }
      }
   }

   public bum eR() {
      return this.bF;
   }

   @Nullable
   public bwz eS() {
      if (this.ba != null) {
         return this.ba.a(this.dV(), cqs.class);
      } else {
         return this.bK != null ? this.bK.a(this.dV(), bwz.class) : null;
      }
   }

   public final float eT() {
      return (float)this.h(byf.s);
   }

   public final float eU() {
      return (float)this.h(byf.r);
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
      if (bvf.a(this)) {
         return 6 - (1 + bvf.b(this));
      } else {
         return this.b(bvg.d) ? 6 + (1 + this.c(bvg.d).e()) * 2 : 6;
      }
   }

   public void a(btx $$0) {
      this.a($$0, false);
   }

   public void a(btx $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.D() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dV() instanceof aro) {
            abu $$2 = new abu(this, $$0 == btx.a ? 0 : 3);
            arl $$3 = ((aro)this.dV()).m();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bup $$0) {
      this.aT.a(1.5F);
      this.aj = 20;
      this.aO = 10;
      this.aN = this.aO;
      awk $$1 = this.e($$0);
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
            awk $$1 = this.l_();
            if ($$1 != null) {
               this.a($$1, this.fd(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cqs)) {
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
               double $$8 = azk.d($$4, this.K, this.dA()) + (this.ae.j() - 0.5) * (double)this.dq() * 2.0;
               double $$9 = azk.d($$4, this.L, this.dC()) + this.ae.j() * (double)this.dr();
               double $$10 = azk.d($$4, this.M, this.dG()) + (this.ae.j() - 0.5) * (double)this.dq() * 2.0;
               this.dV().a(lx.af, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.h(this.a(bwk.a));
            break;
         case 48:
            this.h(this.a(bwk.b));
            break;
         case 49:
            this.h(this.a(bwk.f));
            break;
         case 50:
            this.h(this.a(bwk.e));
            break;
         case 51:
            this.h(this.a(bwk.d));
            break;
         case 52:
            this.h(this.a(bwk.c));
            break;
         case 54:
            dpr.b(this);
            break;
         case 55:
            this.F();
            break;
         case 60:
            this.eX();
            break;
         case 65:
            this.h(this.a(bwk.g));
            break;
         case 67:
            this.E();
            break;
         case 68:
            this.h(this.a(bwk.h));
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
      fdw $$0 = this.dy();

      for (int $$1 = 0; $$1 < 8; $$1++) {
         double $$2 = this.ae.a(0.0, 1.0);
         double $$3 = this.ae.a(0.0, 1.0);
         double $$4 = this.ae.a(0.0, 1.0);
         this.dV().a(lx.d, this.dA() + $$2, this.dC() + $$3, this.dG() + $$4, $$0.d, $$0.e, $$0.f);
      }
   }

   private void F() {
      cys $$0 = this.a(bwk.b);
      this.a(bwk.b, this.a(bwk.a));
      this.a(bwk.a, $$0);
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
   public byb g(je<bya> $$0) {
      return this.eZ().a($$0);
   }

   public double h(je<bya> $$0) {
      return this.eZ().c($$0);
   }

   public double i(je<bya> $$0) {
      return this.eZ().d($$0);
   }

   public byc eZ() {
      return this.bE;
   }

   public cys fa() {
      return this.a(bwk.a);
   }

   public cys fb() {
      return this.a(bwk.b);
   }

   public cys a(bws $$0) {
      return this.fx() == $$0 ? this.fa() : this.fb();
   }

   @Nonnull
   @Override
   public cys dZ() {
      return this.fa();
   }

   public boolean b(cyo $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cys> $$0) {
      return $$0.test(this.fa()) || $$0.test(this.fb());
   }

   public cys b(btx $$0) {
      if ($$0 == btx.a) {
         return this.a(bwk.a);
      } else if ($$0 == btx.b) {
         return this.a(bwk.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(btx $$0, cys $$1) {
      if ($$0 == btx.a) {
         this.a(bwk.a, $$1);
      } else {
         if ($$0 != btx.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bwk.b, $$1);
      }
   }

   public boolean d(bwk $$0) {
      return !this.a($$0).f();
   }

   public boolean e(bwk $$0) {
      return true;
   }

   public abstract cys a(bwk var1);

   public abstract void a(bwk var1, cys var2);

   protected void d(cys $$0) {
      $$0.h().l($$0);
   }

   public float fc() {
      int $$0 = 0;
      int $$1 = 0;

      for (bwk $$2 : bwl.i) {
         if ($$2.a() == bwk.a.b) {
            cys $$3 = this.a($$2);
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
      byb $$1 = this.g(byf.v);
      $$1.c(k.b());
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
   public void h(bwa $$0) {
      if (!this.fQ()) {
         super.h($$0);
      }
   }

   private void c(bwa $$0) {
      fdw $$1;
      if (this.dQ()) {
         $$1 = this.dt();
      } else if (!$$0.dQ() && !this.dV().a_($$0.dv()).a(axa.aM)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dC(), $$0.dC());
         $$1 = new fdw(this.dA(), $$2, this.dG());
         boolean $$4 = this.dq() <= 4.0F && this.dr() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.dr() / 2.0;
            fdw $$6 = $$1.b(0.0, $$5, 0.0);
            feq $$7 = fen.a(fdr.a($$6, (double)this.dq(), (double)this.dr(), (double)this.dq()));
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
      return (float)this.h(byf.o) * $$0 * this.aS() + this.fh();
   }

   public float fh() {
      return this.b(bvg.h) ? 0.1F * ((float)this.c(bvg.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void s() {
      float $$0 = this.fg();
      if (!($$0 <= 1.0E-5F)) {
         fdw $$1 = this.dy();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.cj()) {
            float $$2 = this.dL() * (float) (Math.PI / 180.0);
            this.j(new fdw((double)(-azk.a($$2)) * 0.2, 0.0, (double)azk.b($$2) * 0.2));
         }

         this.ar = true;
      }
   }

   protected void fi() {
      this.i(this.dy().b(0.0, -0.04F, 0.0));
   }

   protected void c(axp<evu> $$0) {
      this.i(this.dy().b(0.0, 0.04F, 0.0));
   }

   protected float fj() {
      return 0.8F;
   }

   public boolean a(evv $$0) {
      return false;
   }

   @Override
   protected double bd() {
      return this.h(byf.n);
   }

   protected double fk() {
      boolean $$0 = this.dy().e <= 0.0;
      return $$0 && this.b(bvg.B) ? Math.min(this.be(), 0.01) : this.be();
   }

   public void a_(fdw $$0) {
      evv $$1 = this.dV().b_(this.dv());
      if ((this.bj() || this.bw()) && this.el() && !this.a($$1)) {
         this.m($$0);
      } else if (this.fI()) {
         this.n($$0);
      } else {
         this.l($$0);
      }
   }

   private void l(fdw $$0) {
      iu $$1 = this.aQ();
      float $$2 = this.aJ() ? this.dV().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      fdw $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      bve $$6 = this.c(bvg.y);
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
         float $$7 = this instanceof ciy ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void m(fdw $$0) {
      boolean $$1 = this.dy().e <= 0.0;
      double $$2 = this.dC();
      double $$3 = this.fk();
      if (this.bj()) {
         float $$4 = this.cj() ? 0.9F : this.fj();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(byf.F);
         if (!this.aJ()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fn() - $$5) * $$6;
         }

         if (this.b(bvg.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bxd.a, this.dy());
         fdw $$7 = this.dy();
         if (this.P && this.d_()) {
            $$7 = new fdw($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.i(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bxd.a, this.dy());
         if (this.b(axf.b) <= this.dp()) {
            this.i(this.dy().d(0.5, 0.8F, 0.5));
            fdw $$8 = this.a($$3, $$1, this.dy());
            this.i($$8);
         } else {
            this.i(this.dy().c(0.5));
         }

         if ($$3 != 0.0) {
            this.i(this.dy().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      fdw $$9 = this.dy();
      if (this.P && this.g($$9.d, $$9.e + 0.6F - this.dC() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void n(fdw $$0) {
      if (this.d_()) {
         this.l($$0);
         this.fl();
      } else {
         fdw $$1 = this.dy();
         double $$2 = $$1.i();
         this.i(this.o($$1));
         this.a(bxd.a, this.dy());
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

   private fdw o(fdw $$0) {
      fdw $$1 = this.bT();
      float $$2 = this.dN() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fk();
      double $$6 = azk.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-azk.a($$2)) * 0.04;
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

   private void c(cqs $$0, fdw $$1) {
      fdw $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.di()) {
         this.B(this.c($$0));
         this.a_($$2);
      } else {
         this.i(fdw.c);
      }
   }

   protected void a(cqs $$0, fdw $$1) {
   }

   protected fdw b(cqs $$0, fdw $$1) {
      return $$1;
   }

   protected float c(cqs $$0) {
      return this.fn();
   }

   public void r(boolean $$0) {
      float $$1 = (float)azk.g(this.dA() - this.K, $$0 ? this.dC() - this.L : 0.0, this.dG() - this.M);
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

   private fdw a(fdw $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.i(this.p(this.dy()));
      this.a(bxd.a, this.dy());
      fdw $$2 = this.dy();
      if ((this.P || this.bf) && (this.d_() || this.dw().a(dlw.rt) && drt.a(this))) {
         $$2 = new fdw($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public fdw a(double $$0, boolean $$1, fdw $$2) {
      if ($$0 != 0.0 && !this.cj()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new fdw($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private fdw p(fdw $$0) {
      if (this.d_()) {
         this.k();
         float $$1 = 0.15F;
         double $$2 = azk.a($$0.d, -0.15F, 0.15F);
         double $$3 = azk.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dw().a(dlw.ou) && this.fH() && this instanceof cqs) {
            $$4 = 0.0;
         }

         $$0 = new fdw($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aJ() ? this.fn() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fm();
   }

   protected float fm() {
      return this.cW() instanceof cqs ? this.fn() * 0.1F : 0.02F;
   }

   public float fn() {
      return this.bO;
   }

   public void B(float $$0) {
      this.bO = $$0;
   }

   public boolean c(aro $$0, bwa $$1) {
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
         float $$6 = (float)azk.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$7 = azk.e(azk.h(this.dL()) - $$6);
         if (95.0F < $$7 && $$7 < 265.0F) {
            $$5 = $$6 - 180.0F;
         } else {
            $$5 = $$6;
         }
      }

      if (this.aR > 0.0F) {
         $$5 = this.dL();
      }

      bqj $$8 = bqi.a();
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
      Map<bwk, cys> $$0 = this.H();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bwk, cys> H() {
      Map<bwk, cys> $$0 = null;

      for (bwk $$1 : bwk.j) {
         cys $$2 = this.bH.get($$1);
         cys $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bwk.class);
            }

            $$0.put($$1, $$3);
            byc $$4 = this.eZ();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<bwk, cys> $$5 : $$0.entrySet()) {
            bwk $$6 = $$5.getKey();
            cys $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1x) -> {
                  byb $$2 = this.bE.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1x.b());
                     $$2.b($$1x);
                  }
               });
               if (this.dV() instanceof aro $$8) {
                  dfh.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(cys $$0, cys $$1) {
      return !cys.a($$1, $$0);
   }

   private void a(Map<bwk, cys> $$0) {
      cys $$1 = $$0.get(bwk.a);
      cys $$2 = $$0.get(bwk.b);
      if ($$1 != null && $$2 != null && cys.a($$1, this.bH.get(bwk.b)) && cys.a($$2, this.bH.get(bwk.a))) {
         ((aro)this.dV()).m().b(this, new acv(this, (byte)55));
         $$0.remove(bwk.a);
         $$0.remove(bwk.b);
         this.bH.put(bwk.a, $$1.v());
         this.bH.put(bwk.b, $$2.v());
      }
   }

   private void b(Map<bwk, cys> $$0) {
      List<Pair<bwk, cys>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cys $$3 = $$2.v();
         $$1.add(Pair.of($$1x, $$3));
         this.bH.put($$1x, $$3);
      });
      ((aro)this.dV()).m().b(this, new afe(this.ar(), $$1));
   }

   protected void C(float $$0) {
      float $$1 = azk.h($$0 - this.aV);
      this.aV += $$1 * 0.3F;
      float $$2 = azk.h(this.dL() - this.aV);
      float $$3 = this.fo();
      if (Math.abs($$2) > $$3) {
         this.aV = this.aV + ($$2 - (float)azk.j((double)$$2) * $$3);
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

      fdw $$0 = this.dy();
      double $$1 = $$0.d;
      double $$2 = $$0.e;
      double $$3 = $$0.f;
      if (this.aq().equals(bwj.bS)) {
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
      bqj $$4 = bqi.a();
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
            $$5 = this.b(axf.b);
         } else {
            $$5 = this.b(axf.a);
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
               this.c(axf.b);
            }
         } else {
            this.c(axf.a);
         }
      } else {
         this.bP = 0;
      }

      $$4.c();
      $$4.a("travel");
      if (this.fI()) {
         this.fr();
      }

      fdr $$9 = this.cR();
      fdw $$10 = new fdw((double)this.bg, (double)this.bh, (double)this.bi);
      if (this.b(bvg.B) || this.b(bvg.y)) {
         this.k();
      }

      label126: {
         if (this.cW() instanceof cqs $$11 && this.bK()) {
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
         this.r(this instanceof ciy);
      }

      $$4.c();
      if (this.dV() instanceof aro $$12) {
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
      if (this.dV() instanceof aro $$14 && this.fq() && this.bl()) {
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
               List<bwk> $$2 = bwk.j.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               bwk $$3 = af.a($$2, this.ae);
               this.a($$3).a(1, this, $$3);
            }

            this.a(eeo.n);
         }
      }
   }

   protected boolean fs() {
      if (!this.aJ() && !this.bZ() && !this.b(bvg.y)) {
         for (bwk $$0 : bwk.j) {
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
      List<bwa> $$0 = this.dV().i(this, this.cR());
      if (!$$0.isEmpty()) {
         if (this.dV() instanceof aro $$1) {
            int $$2 = $$1.O().d(dil.v);
            if ($$2 > 0 && $$0.size() > $$2 - 1 && this.ae.a(4) == 0) {
               int $$3 = 0;

               for (bwa $$4 : $$0) {
                  if (!$$4.bZ()) {
                     $$3++;
                  }
               }

               if ($$3 > $$2 - 1) {
                  this.a($$1, this.dW().h(), 6.0F);
               }
            }
         }

         for (bwa $$5 : $$0) {
            this.D($$5);
         }
      }
   }

   protected void a(fdr $$0, fdr $$1) {
      fdr $$2 = $$0.b($$1);
      List<bwa> $$3 = this.dV().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bwa $$4 : $$3) {
            if ($$4 instanceof bwz) {
               this.f((bwz)$$4);
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

   protected void D(bwa $$0) {
      $$0.h(this);
   }

   protected void f(bwz $$0) {
   }

   public boolean fu() {
      return (this.al.a(aC) & 4) != 0;
   }

   @Override
   public void bP() {
      bwa $$0 = this.dk();
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
   public bwu N_() {
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

   public void a(cmx $$0) {
      bwa $$1 = $$0.q();
      if ($$1 instanceof arp) {
         ap.R.a((arp)$$1, $$0.f(), this);
      }
   }

   public void a(bwa $$0, int $$1) {
      if (!$$0.dQ() && !this.dV().C && ($$0 instanceof cmx || $$0 instanceof cqz || $$0 instanceof bwo)) {
         ((aro)this.dV()).m().b($$0, new afz($$0.ar(), this.ar(), $$1));
      }
   }

   public boolean E(bwa $$0) {
      return this.a($$0, dhy.a.a, dhy.b.a, $$0.dE());
   }

   public boolean a(bwa $$0, dhy.a $$1, dhy.b $$2, double $$3) {
      if ($$0.dV() != this.dV()) {
         return false;
      } else {
         fdw $$4 = new fdw(this.dA(), this.dE(), this.dG());
         fdw $$5 = new fdw($$0.dA(), $$3, $$0.dG());
         return $$5.f($$4) > 128.0 ? false : this.dV().a(new dhy($$4, $$5, $$1, $$2, this)).d() == fdu.a.a;
      }
   }

   @Override
   public float j(float $$0) {
      return $$0 == 1.0F ? this.aX : azk.i($$0, this.aY, this.aX);
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
   public fdw a(ja.a $$0, l.a $$1) {
      return k(super.a($$0, $$1));
   }

   public static fdw k(fdw $$0) {
      return new fdw($$0.d, $$0.e, 0.0);
   }

   public float fv() {
      return this.bQ;
   }

   public final void E(float $$0) {
      this.F(azk.a($$0, 0.0F, this.eU()));
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

   public abstract bws fx();

   public boolean fy() {
      return (this.al.a(aC) & 1) > 0;
   }

   public btx fz() {
      return (this.al.a(aC) & 2) > 0 ? btx.b : btx.a;
   }

   private void I() {
      if (this.fy()) {
         if (cys.b(this.b(this.fz()), this.bm)) {
            this.bm = this.b(this.fz());
            this.a(this.bm);
         } else {
            this.fE();
         }
      }
   }

   protected void a(cys $$0) {
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

   public void c(btx $$0) {
      cys $$1 = this.b($$0);
      if (!$$1.f() && !this.fy()) {
         this.bm = $$1;
         this.bn = $$1.a(this);
         if (!this.dV().C) {
            this.c(1, true);
            this.c(2, $$0 == btx.b);
            this.a(eeo.D);
         }
      }
   }

   @Override
   public void a(akh<?> $$0) {
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
            this.bm = cys.k;
            this.bn = 0;
         }
      }
   }

   @Override
   public void a(eu.a $$0, fdw $$1) {
      super.a($$0, $$1);
      this.aY = this.aX;
      this.aV = this.aX;
      this.aW = this.aV;
   }

   @Override
   public float u(float $$0) {
      return azk.h($$0, this.aW, this.aV);
   }

   public void b(cys $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         fdw $$3 = new fdw(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dN() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dL() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ae.i()) * 0.6 - 0.3;
         fdw $$5 = new fdw(((double)this.ae.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dN() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dL() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dA(), this.dE(), this.dG());
         this.dV().a(new lt(lx.U, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void K_() {
      if (!this.dV().C || this.fy()) {
         btx $$0 = this.fz();
         if (!this.bm.equals(this.b($$0))) {
            this.fD();
         } else {
            if (!this.bm.f() && this.fy()) {
               cys $$1 = this.bm.a(this.dV(), this);
               if ($$1 != this.bm) {
                  this.a($$0, $$1);
               }

               this.fE();
            }
         }
      }
   }

   public void b(cys $$0) {
   }

   public cys fA() {
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
            this.a(eeo.C);
         }
      }

      this.bm = cys.k;
      this.bn = 0;
   }

   public boolean fF() {
      return this.fG() != null;
   }

   @Nullable
   public cys fG() {
      if (!this.fy()) {
         return null;
      } else {
         dat $$0 = this.bm.a(kj.I);
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
      return super.cl() || !this.fI() && this.c(bxl.b);
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
      dip $$10 = this.dV();
      if ($$10.C($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.G_()) {
            iu $$12 = $$9.e();
            dzo $$13 = $$10.a_($$12);
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

         if (this instanceof bxh $$14) {
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
   public final bwd a(bxl $$0) {
      return $$0 == bxl.c ? aD : this.e($$0).a(this.ek());
   }

   protected bwd e(bxl $$0) {
      return this.aq().n().a(this.ej());
   }

   public ImmutableList<bxl> fN() {
      return ImmutableList.of(bxl.a);
   }

   public fdr f(bxl $$0) {
      bwd $$1 = this.a($$0);
      return new fdr((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bxl $$0) {
      fdr $$1 = this.a($$0).a(this.dt());
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

      dzo $$1 = this.dV().a_($$0);
      if ($$1.b() instanceof dln) {
         this.dV().a($$0, $$1.b(dln.c, Boolean.valueOf(true)), 3);
      }

      this.b(bxl.c);
      this.a($$0);
      this.g($$0);
      this.i(fdw.c);
      this.ar = true;
   }

   private void a(iu $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean L() {
      return this.fO().map($$0 -> this.dV().a_($$0).b() instanceof dln).orElse(false);
   }

   public void fR() {
      this.fO().filter(this.dV()::C).ifPresent($$0x -> {
         dzo $$1 = this.dV().a_($$0x);
         if ($$1.b() instanceof dln) {
            ja $$2 = $$1.c(dln.e);
            this.dV().a($$0x, $$1.b(dln.c, Boolean.valueOf(false)), 3);
            fdw $$3 = dln.a(this.aq(), this.dV(), $$0x, $$2, this.dL()).orElseGet(() -> {
               iu $$1x = $$0x.d();
               return new fdw((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            fdw $$4 = fdw.c($$0x).d($$3).d();
            float $$5 = (float)azk.d(azk.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.w($$5);
            this.x(0.0F);
         }
      });
      fdw $$0 = this.dt();
      this.b(bxl.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fP();
   }

   @Nullable
   public ja fS() {
      iu $$0 = this.fO().orElse(null);
      return $$0 != null ? dln.a(this.dV(), $$0) : null;
   }

   @Override
   public boolean bL() {
      return !this.fQ() && super.bL();
   }

   public cys e(cys $$0) {
      return cys.k;
   }

   private static byte g(bwk $$0) {
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

   public void a(cyo $$0, bwk $$1) {
      this.dV().a(this, g($$1));
      this.a(this.a($$1), $$1, this.bE);
   }

   private void a(cys $$0, bwk $$1, byc $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         byb $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      dfh.a($$0, this, $$1);
   }

   public static bwk d(btx $$0) {
      return $$0 == btx.a ? bwk.a : bwk.b;
   }

   public final boolean f(cys $$0) {
      if (this.bK() && !this.U_()) {
         dhb $$1 = $$0.a(kj.D);
         if ($$1 != null && $$1.g()) {
            bwk $$2 = $$1.b();
            return this.e($$2) && $$1.a(this.aq()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(bwk $$0) {
      return true;
   }

   public final bwk g(cys $$0) {
      dhb $$1 = $$0.a(kj.D);
      return $$1 != null && this.e($$1.b()) ? $$1.b() : bwk.a;
   }

   public final boolean a(cys $$0, bwk $$1) {
      dhb $$2 = $$0.a(kj.D);
      return $$2 == null ? $$1 == bwk.a && this.e(bwk.a) : $$1 == $$2.b() && this.e($$2.b()) && $$2.a(this.aq());
   }

   private static bxq a(bwz $$0, bwk $$1) {
      return $$1 != bwk.f && $$1 != bwk.a && $$1 != bwk.b ? bxq.a($$0, $$1, $$2 -> $$2.f() || $$0.g($$2) == $$1) : bxq.a($$0, $$1);
   }

   @Nullable
   private static bwk r(int $$0) {
      if ($$0 == 100 + bwk.f.b()) {
         return bwk.f;
      } else if ($$0 == 100 + bwk.e.b()) {
         return bwk.e;
      } else if ($$0 == 100 + bwk.d.b()) {
         return bwk.d;
      } else if ($$0 == 100 + bwk.c.b()) {
         return bwk.c;
      } else if ($$0 == 98) {
         return bwk.a;
      } else if ($$0 == 99) {
         return bwk.b;
      } else if ($$0 == 105) {
         return bwk.g;
      } else {
         return $$0 == 106 ? bwk.h : null;
      }
   }

   @Override
   public bxq a_(int $$0) {
      bwk $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dJ() {
      if (this.U_()) {
         return false;
      } else {
         for (bwk $$0 : bwl.i) {
            if (this.a($$0).a(axi.bq)) {
               return false;
            }
         }

         return super.dJ();
      }
   }

   @Override
   public boolean co() {
      return !this.dV().w_() && this.b(bvg.x) || super.co();
   }

   @Override
   public float dM() {
      return this.aV;
   }

   @Override
   public void a(abt $$0) {
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
      dca $$0 = this.dZ().a(kj.B);
      return $$0 != null ? $$0.b() : 0.0F;
   }

   @Override
   public float dP() {
      float $$0 = (float)this.h(byf.B);
      return this.cW() instanceof cqs ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public fdw m(bwa $$0) {
      return this.dt().e(this.a($$0, this.a(this.aw()), this.ek() * this.ej()));
   }

   protected void a(int $$0, double $$1) {
      this.aX = (float)azk.e(1.0 / (double)$$0, (double)this.aX, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(azk.c((double)$$0 * this.h(byf.h)));
   }

   public boolean fU() {
      return false;
   }

   public boolean a(aro $$0, bup $$1) {
      return this.d($$1) || dfh.a($$0, this, $$1);
   }

   public static boolean b(cys $$0, bwk $$1) {
      if (!$$0.c(kj.F)) {
         return false;
      } else {
         dhb $$2 = $$0.a(kj.D);
         return $$2 != null && $$1 == $$2.b() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fV() {
      return this.bb;
   }

   public static record a(awk a, awk b) {
   }
}

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
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
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class bwb extends bvf implements buz {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "active_effects";
   private static final alz c = alz.b("powder_snow");
   private static final alz d = alz.b("sprinting");
   private static final bxh k = new bxh(d, 0.3F, bxh.a.c);
   public static final int l = 2;
   public static final int m = 4;
   public static final int n = 98;
   public static final int o = 100;
   public static final int p = 105;
   public static final int q = 6;
   public static final int r = 100;
   private static final int bH = 40;
   public static final double s = 0.003;
   public static final double t = 0.08;
   public static final int u = 20;
   private static final int bI = 10;
   private static final int bJ = 2;
   public static final float ay = 0.42F;
   private static final double bK = 128.0;
   protected static final int az = 1;
   protected static final int aA = 2;
   protected static final int aB = 4;
   protected static final alc<Byte> aC = alg.a(bwb.class, ale.a);
   private static final alc<Float> bL = alg.a(bwb.class, ale.d);
   private static final alc<List<lq>> bM = alg.a(bwb.class, ale.m);
   private static final alc<Boolean> bN = alg.a(bwb.class, ale.k);
   private static final alc<Integer> bO = alg.a(bwb.class, ale.b);
   private static final alc<Integer> bP = alg.a(bwb.class, ale.b);
   private static final alc<Optional<jh>> bQ = alg.a(bwb.class, ale.p);
   private static final int bR = 15;
   protected static final bvi aD = bvi.c(0.2F, 0.2F).b(0.2F);
   public static final float aE = 0.5F;
   public static final float aF = 0.5F;
   public static final String aG = "attributes";
   public static final Predicate<bwb> aH = $$0 -> {
      if ($$0 instanceof cps $$1) {
         cxk $$3 = $$1.a(bvn.f);
         return !$$3.a(ayd.co);
      } else {
         return true;
      }
   };
   private final bxg bS;
   private final bts bT = new bts(this);
   private final Map<jq<bui>, buk> bU = Maps.newHashMap();
   private final jz<cxk> bV = jz.a(2, cxk.k);
   private final jz<cxk> bW = jz.a(4, cxk.k);
   private cxk bX = cxk.k;
   public boolean aI;
   private boolean bY = false;
   public btd aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final bxc aT = new bxc();
   public final int aU = 20;
   public final float aV;
   public final float aW;
   public float aX;
   public float aY;
   public float aZ;
   public float ba;
   public final bve bb = new bve(this);
   @Nullable
   protected cps bc;
   protected int bd;
   protected boolean be;
   protected int bf;
   protected float bg;
   protected float bh;
   protected float bi;
   protected float bj;
   protected float bk;
   protected int bl;
   protected float bm;
   protected boolean bn;
   public float bo;
   public float bp;
   public float bq;
   protected int br;
   protected double bs;
   protected double bt;
   protected double bu;
   protected double bv;
   protected double bw;
   protected double bx;
   protected int by;
   private boolean bZ = true;
   @Nullable
   private bwb ca;
   private int cb;
   @Nullable
   private bwb cc;
   private int cd;
   private float ce;
   private int cf;
   private float cg;
   protected cxk bz = cxk.k;
   protected int bA;
   protected int bB;
   private jh ch;
   private Optional<jh> ci = Optional.empty();
   @Nullable
   private btv cj;
   private long ck;
   protected int bC;
   protected float bD;
   @Nullable
   protected cxk bE;
   private float cl;
   private float cm;
   protected bxd<?> bF;
   private boolean cn;
   private final EnumMap<bvn, Reference2ObjectMap<ddr, Set<dej>>> co = new EnumMap<>(bvn.class);
   protected float bG = 1.0F;

   protected bwb(bvm<? extends bwb> $$0, dha $$1) {
      super($$0, $$1);
      this.bS = new bxg(bxk.a($$0));
      this.x(this.eR());
      this.I = true;
      this.aW = (float)((Math.random() + 1.0) * 0.01F);
      this.ay();
      this.aV = (float)Math.random() * 12398.0F;
      this.v((float)(Math.random() * (float) (Math.PI * 2)));
      this.aZ = this.dL();
      vl $$2 = vl.a;
      this.bF = this.a(new Dynamic($$2, (vu)$$2.createMap(ImmutableMap.of($$2.a("memories"), (vu)$$2.emptyMap()))));
   }

   public bxd<?> eb() {
      return this.bF;
   }

   protected bxd.b<?> ec() {
      return bxd.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bxd<?> a(Dynamic<?> $$0) {
      return this.ec().a($$0);
   }

   @Override
   public void c(ash $$0) {
      this.a($$0, this.dW().y(), Float.MAX_VALUE);
   }

   public boolean a(bvm<?> $$0) {
      return true;
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(aC, (byte)0);
      $$0.a(bM, List.of());
      $$0.a(bN, false);
      $$0.a(bO, 0);
      $$0.a(bP, 0);
      $$0.a(bL, 1.0F);
      $$0.a(bQ, Optional.empty());
   }

   public static bxi.a ed() {
      return bxi.a()
         .a(bxj.s)
         .a(bxj.p)
         .a(bxj.v)
         .a(bxj.a)
         .a(bxj.b)
         .a(bxj.r)
         .a(bxj.B)
         .a(bxj.y)
         .a(bxj.n)
         .a(bxj.x)
         .a(bxj.k)
         .a(bxj.o)
         .a(bxj.w)
         .a(bxj.h)
         .a(bxj.i)
         .a(bxj.F)
         .a(bxj.u)
         .a(bxj.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxn $$2, jh $$3) {
      if (!this.bj()) {
         this.br();
      }

      if (this.dV() instanceof ash $$4 && $$1 && this.Z > 0.0F) {
         this.b($$4, $$3);
         double $$5 = this.h(bxj.x);
         if ((double)this.Z > $$5 && !$$2.l()) {
            double $$6 = this.dA();
            double $$7 = this.dC();
            double $$8 = this.dG();
            jh $$9 = this.dv();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            float $$13 = (float)bae.c((double)this.Z - $$5);
            double $$14 = Math.min((double)(0.2F + $$13 / 15.0F), 2.5);
            int $$15 = (int)(150.0 * $$14);
            $$4.a(new lk(ls.b, $$2), $$6, $$7, $$8, $$15, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.ci = Optional.empty();
      }
   }

   public final boolean ee() {
      return this.aq().a(axy.m);
   }

   public float a(float $$0) {
      return bae.h($$0, this.cm, this.cl);
   }

   public boolean ef() {
      return this.dy().b() < 1.0E-5F && this.bn();
   }

   @Override
   public void az() {
      this.aQ = this.aR;
      if (this.ak) {
         this.fN().ifPresent(this::a);
      }

      if (this.dV() instanceof ash $$0) {
         ddt.b($$0, this);
      }

      super.az();
      bpo $$1 = bpn.a();
      $$1.a("livingEntityBaseTick");
      if (this.bi() || this.dV().C) {
         this.aH();
      }

      if (this.bL()) {
         boolean $$2 = this instanceof cps;
         if (this.dV() instanceof ash $$3) {
            if (this.bM()) {
               this.a($$3, this.dW().g(), 1.0F);
            } else if ($$2 && !this.dV().F_().a(this.cR())) {
               double $$4 = this.dV().F_().a(this) + this.dV().F_().n();
               if ($$4 < 0.0) {
                  double $$5 = this.dV().F_().o();
                  if ($$5 > 0.0) {
                     this.a($$3, this.dW().x(), (float)Math.max(1, bae.a(-$$4 * $$5)));
                  }
               }
            }
         }

         if (this.a(aya.a) && !this.dV().a_(jh.a(this.dA(), this.dE(), this.dG())).a(dkg.ny)) {
            boolean $$6 = !this.ee() && !bul.c(this) && (!$$2 || !((cps)this).gh().a);
            if ($$6) {
               this.j(this.l(this.ct()));
               if (this.ct() == -20) {
                  this.j(0);
                  fbs $$7 = this.dy();

                  for (int $$8 = 0; $$8 < 8; $$8++) {
                     double $$9 = this.ae.j() - this.ae.j();
                     double $$10 = this.ae.j() - this.ae.j();
                     double $$11 = this.ae.j() - this.ae.j();
                     this.dV().a(ls.d, this.dA() + $$9, this.dC() + $$10, this.dG() + $$11, $$7.d, $$7.e, $$7.f);
                  }

                  this.a(this.dW().i(), 2.0F);
               }
            }

            if (!this.dV().C && this.bZ() && this.dk() != null && this.dk().cb()) {
               this.ae();
            }
         } else if (this.ct() < this.cs()) {
            this.j(this.m(this.ct()));
         }

         if (this.dV() instanceof ash $$12) {
            jh $$13 = this.dv();
            if (!Objects.equal(this.ch, $$13)) {
               this.ch = $$13;
               this.b($$12, $$13);
            }
         }
      }

      if (this.bL() && (this.bl() || this.av)) {
         this.aN();
      }

      if (this.aN > 0) {
         this.aN--;
      }

      if (this.aj > 0 && !(this instanceof asi)) {
         this.aj--;
      }

      if (this.eE() && this.dV().h(this)) {
         this.el();
      }

      if (this.bd > 0) {
         this.bd--;
      } else {
         this.bc = null;
      }

      if (this.cc != null && !this.cc.bL()) {
         this.cc = null;
      }

      if (this.ca != null) {
         if (!this.ca.bL()) {
            this.a(null);
         } else if (this.af - this.cb > 100) {
            this.a(null);
         }
      }

      this.ev();
      this.bj = this.bi;
      this.aY = this.aX;
      this.ba = this.aZ;
      this.N = this.dL();
      this.O = this.dN();
      $$1.c();
   }

   @Override
   protected float aT() {
      return bae.h((float)this.h(bxj.u), super.aT(), 1.0F);
   }

   protected void eg() {
      bxf $$0 = this.g(bxj.v);
      if ($$0 != null) {
         if ($$0.a(c) != null) {
            $$0.c(c);
         }
      }
   }

   protected void eh() {
      if (!this.bt().l()) {
         int $$0 = this.cu();
         if ($$0 > 0) {
            bxf $$1 = this.g(bxj.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cv();
            $$1.b(new bxh(c, (double)$$2, bxh.a.a));
         }
      }
   }

   protected void b(ash $$0, jh $$1) {
      ddt.a($$0, this);
   }

   public boolean e_() {
      return false;
   }

   public float ei() {
      return this.e_() ? 0.5F : 1.0F;
   }

   public final float ej() {
      bxg $$0 = this.eW();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bxj.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean ek() {
      return true;
   }

   protected void el() {
      this.aP++;
      if (this.aP >= 20 && !this.dV().B_() && !this.dQ()) {
         this.dV().a(this, (byte)60);
         this.a(bvf.c.a);
      }
   }

   public boolean em() {
      return !this.e_();
   }

   protected boolean en() {
      return !this.e_();
   }

   protected int l(int $$0) {
      bxf $$1 = this.g(bxj.w);
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

   public final int a(ash $$0, @Nullable bvf $$1) {
      return ddt.a($$0, $$1, this, this.e($$0));
   }

   protected int e(ash $$0) {
      return 0;
   }

   protected boolean eo() {
      return false;
   }

   @Nullable
   public bwb ep() {
      return this.ca;
   }

   @Override
   public bwb am() {
      return this.ep();
   }

   public int eq() {
      return this.cb;
   }

   public void c(@Nullable cps $$0) {
      this.bc = $$0;
      this.bd = this.af;
   }

   public void a(@Nullable bwb $$0) {
      this.ca = $$0;
      this.cb = this.af;
   }

   @Nullable
   public bwb er() {
      return this.cc;
   }

   public int es() {
      return this.cd;
   }

   public void B(bvf $$0) {
      if ($$0 instanceof bwb) {
         this.cc = (bwb)$$0;
      } else {
         this.cc = null;
      }

      this.cd = this.af;
   }

   public int et() {
      return this.bf;
   }

   public void n(int $$0) {
      this.bf = $$0;
   }

   public boolean eu() {
      return this.bY;
   }

   public void r(boolean $$0) {
      this.bY = $$0;
   }

   protected boolean b(bvn $$0) {
      return true;
   }

   public void a(bvn $$0, cxk $$1, cxk $$2) {
      if (!this.dV().B_() && !this.aa_()) {
         boolean $$3 = $$2.f() && $$1.f();
         if (!$$3 && !cxk.c($$1, $$2) && !this.ak) {
            dfm $$4 = $$2.a(ku.D);
            if (!this.bb() && $$4 != null && $$0 == $$4.a()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), $$4.b(), this.dm(), 1.0F, 1.0F, this.ae.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? ecj.v : ecj.S);
            }
         }
      }
   }

   @Override
   public void a(bvf.c $$0) {
      if (($$0 == bvf.c.a || $$0 == bvf.c.b) && this.dV() instanceof ash $$1) {
         this.a($$1, $$0);
      }

      super.a($$0);
      this.bF.a();
   }

   protected void a(ash $$0, bvf.c $$1) {
      for (buk $$2 : this.eA()) {
         $$2.a($$0, this, $$1);
      }

      this.bU.clear();
   }

   @Override
   public void b(ux $$0) {
      $$0.a("Health", this.eD());
      $$0.a("HurtTime", (short)this.aN);
      $$0.a("HurtByTimestamp", this.cb);
      $$0.a("DeathTime", (short)this.aP);
      $$0.a("AbsorptionAmount", this.fu());
      $$0.a("attributes", this.eW().d());
      if (!this.bU.isEmpty()) {
         vd $$1 = new vd();

         for (buk $$2 : this.bU.values()) {
            $$1.add($$2.j());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fH());
      this.fN().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<vu> $$3 = this.bF.a(vl.a);
      $$3.resultOrPartial(a::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(ux $$0) {
      this.F($$0.j("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dV() != null && !this.dV().C) {
         this.eW().a($$0.c("attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         vd $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ux $$3 = $$1.a($$2);
            buk $$4 = buk.a($$3);
            if ($$4 != null) {
               this.bU.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.x($$0.j("Health"));
      }

      this.aN = $$0.g("HurtTime");
      this.aP = $$0.g("DeathTime");
      this.cb = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         fcx $$6 = this.dV().Q();
         fcs $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cH(), $$7);
         if (!$$8) {
            a.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         jh $$9 = new jh($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$9);
         this.al.a(aq, bwn.c);
         if (!this.ak) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bF = this.a(new Dynamic(vl.a, $$0.c("Brain")));
      }
   }

   protected void ev() {
      Iterator<jq<bui>> $$0 = this.bU.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jq<bui> $$1 = $$0.next();
            buk $$2 = this.bU.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dV().C) {
                  $$0.remove();
                  this.c(List.of($$2));
               }
            } else if ($$2.d() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var6) {
      }

      if (this.bZ) {
         if (!this.dV().C) {
            this.K();
            this.u();
         }

         this.bZ = false;
      }

      List<lq> $$3 = this.al.a(bM);
      if (!$$3.isEmpty()) {
         boolean $$4 = this.al.a(bN);
         int $$5 = this.cp() ? 15 : 4;
         int $$6 = $$4 ? 5 : 1;
         if (this.ae.a($$5 * $$6) == 0) {
            this.dV().a(ae.a($$3, this.ae), this.d(0.5), this.dD(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void K() {
      if (this.bU.isEmpty()) {
         this.ey();
         this.k(false);
      } else {
         this.k(this.b(bum.n));
         this.m();
      }
   }

   private void m() {
      List<lq> $$0 = this.bU.values().stream().filter(buk::g).map(buk::a).toList();
      this.al.a(bM, $$0);
      this.al.a(bN, d(this.bU.values()));
   }

   private void u() {
      boolean $$0 = this.co();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable bvf $$0) {
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
         cxk $$3 = this.a(bvn.f);
         bvm<?> $$4 = $$0.aq();
         if ($$4 == bvm.bf && $$3.a(cxo.vb)
            || $$4 == bvm.bO && $$3.a(cxo.ve)
            || $$4 == bvm.aS && $$3.a(cxo.vh)
            || $$4 == bvm.aT && $$3.a(cxo.vh)
            || $$4 == bvm.F && $$3.a(cxo.vf)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bwb $$0) {
      return $$0 instanceof cps && this.dV().al() == btb.a ? false : $$0.ew();
   }

   public boolean ew() {
      return !this.cC() && this.ex();
   }

   public boolean ex() {
      return !this.aa_() && this.bL();
   }

   public static boolean d(Collection<buk> $$0) {
      for (buk $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void ey() {
      this.al.a(bM, List.of());
   }

   public boolean ez() {
      if (this.dV().C) {
         return false;
      } else if (this.bU.isEmpty()) {
         return false;
      } else {
         Map<jq<bui>, buk> $$0 = Maps.newHashMap(this.bU);
         this.bU.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<buk> eA() {
      return this.bU.values();
   }

   public Map<jq<bui>, buk> eB() {
      return this.bU;
   }

   public boolean b(jq<bui> $$0) {
      return this.bU.containsKey($$0);
   }

   @Nullable
   public buk c(jq<bui> $$0) {
      return this.bU.get($$0);
   }

   public final boolean a(buk $$0) {
      return this.b($$0, null);
   }

   public boolean b(buk $$0, @Nullable bvf $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         buk $$2 = this.bU.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bU.put($$0.c(), $$0);
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

   public boolean b(buk $$0) {
      if (this.aq().a(axy.G)) {
         return !$$0.a(bum.M);
      } else if (this.aq().a(axy.F)) {
         return !$$0.a(bum.L);
      } else {
         return !this.aq().a(axy.w) ? true : !$$0.a(bum.j) && !$$0.a(bum.s);
      }
   }

   public void c(buk $$0, @Nullable bvf $$1) {
      if (this.b($$0)) {
         buk $$2 = this.bU.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eC() {
      return this.aq().a(axy.x);
   }

   @Nullable
   public buk d(jq<bui> $$0) {
      return this.bU.remove($$0);
   }

   public boolean e(jq<bui> $$0) {
      buk $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(buk $$0, @Nullable bvf $$1) {
      this.bZ = true;
      if (!this.dV().C) {
         $$0.c().a().a(this.eW(), $$0.e());
         this.c($$0);
      }
   }

   public void c(buk $$0) {
      for (bvf $$1 : this.cZ()) {
         if ($$1 instanceof asi $$2) {
            $$2.f.b(new ahf(this.ar(), $$0, false));
         }
      }
   }

   protected void a(buk $$0, boolean $$1, @Nullable bvf $$2) {
      this.bZ = true;
      if ($$1 && !this.dV().C) {
         bui $$3 = $$0.c().a();
         $$3.a(this.eW());
         $$3.a(this.eW(), $$0.e());
         this.B();
      }

      if (!this.dV().C) {
         this.c($$0);
      }
   }

   protected void c(Collection<buk> $$0) {
      this.bZ = true;
      if (!this.dV().C) {
         for (buk $$1 : $$0) {
            $$1.c().a().a(this.eW());

            for (bvf $$2 : this.cZ()) {
               if ($$2 instanceof asi $$3) {
                  $$3.f.b(new afi(this.ar(), $$1.c()));
               }
            }
         }

         this.B();
      }
   }

   private void B() {
      Set<bxf> $$0 = this.eW().b();

      for (bxf $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jq<bxe> $$0) {
      if ($$0.a(bxj.s)) {
         float $$1 = this.eR();
         if (this.eD() > $$1) {
            this.x($$1);
         }
      } else if ($$0.a(bxj.r)) {
         float $$2 = this.eS();
         if (this.fu() > $$2) {
            this.E($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.eD();
      if ($$1 > 0.0F) {
         this.x($$1 + $$0);
      }
   }

   public float eD() {
      return this.al.a(bL);
   }

   public void x(float $$0) {
      this.al.a(bL, bae.a($$0, 0.0F, this.eR()));
   }

   public boolean eE() {
      return this.eD() <= 0.0F;
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.eE()) {
         return false;
      } else if ($$1.a(axw.i) && this.b(bum.l)) {
         return false;
      } else {
         if (this.fP()) {
            this.fQ();
         }

         this.bf = 0;
         if ($$2 < 0.0F) {
            $$2 = 0.0F;
         }

         float $$3 = $$2;
         boolean $$4 = false;
         float $$5 = 0.0F;
         if ($$2 > 0.0F && this.g($$1)) {
            this.z($$2);
            $$5 = $$2;
            $$2 = 0.0F;
            if (!$$1.a(axw.j) && $$1.c() instanceof bwb $$7) {
               this.d($$7);
            }

            $$4 = true;
         }

         if ($$1.a(axw.o) && this.aq().a(axy.l)) {
            $$2 *= 5.0F;
         }

         if ($$1.a(axw.a) && !this.a(bvn.f).f()) {
            this.d($$1, $$2);
            $$2 *= 0.75F;
         }

         this.aT.a(1.5F);
         if (Float.isNaN($$2) || Float.isInfinite($$2)) {
            $$2 = Float.MAX_VALUE;
         }

         boolean $$8 = true;
         if ((float)this.aj > 10.0F && !$$1.a(axw.e)) {
            if ($$2 <= this.bm) {
               return false;
            }

            this.b($$0, $$1, $$2 - this.bm);
            this.bm = $$2;
            $$8 = false;
         } else {
            this.bm = $$2;
            this.aj = 20;
            this.b($$0, $$1, $$2);
            this.aO = 10;
            this.aN = this.aO;
         }

         bvf $$9 = $$1.d();
         if ($$9 != null) {
            if ($$9 instanceof bwb $$10 && !$$1.a(axw.q) && (!$$1.a(bty.I) || !this.aq().a(axy.E))) {
               this.a($$10);
            }

            if ($$9 instanceof cps $$11) {
               this.bd = 100;
               this.bc = $$11;
            } else if ($$9 instanceof civ $$12 && $$12.p()) {
               this.bd = 100;
               if ($$12.ah_() instanceof cps $$13) {
                  this.bc = $$13;
               } else {
                  this.bc = null;
               }
            }
         }

         if ($$8) {
            if ($$4) {
               $$0.a(this, (byte)29);
            } else {
               $$0.a(this, $$1);
            }

            if (!$$1.a(axw.r) && (!$$4 || $$2 > 0.0F)) {
               this.bD();
            }

            if (!$$1.a(axw.z)) {
               double $$14 = 0.0;
               double $$15 = 0.0;
               if ($$1.c() instanceof cql $$16) {
                  DoubleDoubleImmutablePair $$17 = $$16.a_(this, $$1);
                  $$14 = -$$17.leftDouble();
                  $$15 = -$$17.rightDouble();
               } else if ($$1.i() != null) {
                  $$14 = $$1.i().a() - this.dA();
                  $$15 = $$1.i().c() - this.dG();
               }

               this.p(0.4F, $$14, $$15);
               if (!$$4) {
                  this.a($$14, $$15);
               }
            }
         }

         if (this.eE()) {
            if (!this.h($$1)) {
               if ($$8) {
                  this.b(this.o_());
               }

               this.a($$1);
            }
         } else if ($$8) {
            this.f($$1);
         }

         boolean $$18 = !$$4 || $$2 > 0.0F;
         if ($$18) {
            this.cj = $$1;
            this.ck = this.dV().ac();

            for (buk $$19 : this.eA()) {
               $$19.a($$0, this, $$1, $$2);
            }
         }

         if (this instanceof asi $$20) {
            ao.i.a($$20, $$1, $$3, $$2, $$4);
            if ($$5 > 0.0F && $$5 < 3.4028235E37F) {
               $$20.a(axp.K, Math.round($$5 * 10.0F));
            }
         }

         if ($$9 instanceof asi $$21) {
            ao.h.a($$21, this, $$1, $$3, $$2, $$4);
         }

         return $$18;
      }
   }

   protected void d(bwb $$0) {
      $$0.e(this);
   }

   protected void e(bwb $$0) {
      $$0.p(0.5, $$0.dA() - this.dA(), $$0.dG() - this.dG());
   }

   private boolean h(btv $$0) {
      if ($$0.a(axw.d)) {
         return false;
      } else {
         cxk $$1 = null;
         czw $$2 = null;

         for (btd $$3 : btd.values()) {
            cxk $$4 = this.b($$3);
            $$2 = $$4.a(ku.H);
            if ($$2 != null) {
               $$1 = $$4.v();
               $$4.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof asi $$5) {
               $$5.b(axp.c.b($$1.h()));
               ao.C.a($$5, $$1);
               this.a(ecj.C);
            }

            this.x(1.0F);
            $$2.a($$1, this);
            this.dV().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public btv eF() {
      if (this.dV().ac() - this.ck > 40L) {
         this.cj = null;
      }

      return this.cj;
   }

   protected void f(btv $$0) {
      this.b(this.e($$0));
   }

   public void b(@Nullable axe $$0) {
      if ($$0 != null) {
         this.a($$0, this.fe(), this.ff());
      }
   }

   public boolean g(btv $$0) {
      bvf $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cpz $$3 && $$3.y() > 0) {
         $$2 = true;
      }

      if (!$$0.a(axw.c) && this.fE() && !$$2) {
         fbs $$4 = $$0.i();
         if ($$4 != null) {
            fbs $$5 = this.d(0.0F, this.cA());
            fbs $$6 = $$4.a(this.dt());
            $$6 = new fbs($$6.d, 0.0, $$6.f).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void g(cxk $$0) {
      if (!$$0.f()) {
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), $$0.M(), this.dm(), 0.8F, 0.8F + this.dV().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(btv $$0) {
      if (!this.dQ() && !this.be) {
         bvf $$1 = $$0.d();
         bwb $$2 = this.eQ();
         if (this.bl >= 0 && $$2 != null) {
            $$2.a(this, this.bl, $$0);
         }

         if (this.fP()) {
            this.fQ();
         }

         if (!this.dV().C && this.l_()) {
            a.info("Named entity {} died: {}", this, this.eP().a().getString());
         }

         this.be = true;
         this.eP().c();
         if (this.dV() instanceof ash $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(ecj.p);
               this.b($$3, $$0);
               this.f($$2);
            }

            this.dV().a(this, (byte)3);
         }

         this.b(bwn.h);
      }
   }

   protected void f(@Nullable bwb $$0) {
      if (this.dV() instanceof ash $$1) {
         boolean var6 = false;
         if ($$0 instanceof clj) {
            if ($$1.N().b(dgw.c)) {
               jh $$4 = this.dv();
               dxn $$5 = dkg.ck.m();
               if (this.dV().a_($$4).l() && $$5.a((dhd)this.dV(), $$4)) {
                  this.dV().a($$4, $$5, 3);
                  var6 = true;
               }
            }

            if (!var6) {
               clw $$6 = new clw(this.dV(), this.dA(), this.dC(), this.dG(), new cxk(cxo.dD));
               this.dV().b($$6);
            }
         }
      }
   }

   protected void b(ash $$0, btv $$1) {
      boolean $$2 = this.bd > 0;
      if (this.en() && $$0.N().b(dgw.f)) {
         this.b($$0, $$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.f($$0);
      this.b($$0, $$1.d());
   }

   protected void f(ash $$0) {
   }

   protected void b(ash $$0, @Nullable bvf $$1) {
      if (!this.eI() && (this.eo() || this.bd > 0 && this.em() && $$0.N().b(dgw.f))) {
         bvr.a($$0, this.dt(), this.a($$0, $$1));
      }
   }

   protected void a(ash $$0, btv $$1, boolean $$2) {
   }

   public long eG() {
      return 0L;
   }

   protected float a(bvf $$0, btv $$1) {
      float $$2 = (float)this.h(bxj.d);
      return this.dV() instanceof ash $$3 ? ddt.d($$3, this.dZ(), $$0, $$1, $$2) : $$2;
   }

   protected void b(ash $$0, btv $$1, boolean $$2) {
      Optional<aly<ewm>> $$3 = this.ea();
      if (!$$3.isEmpty()) {
         ewm $$4 = $$0.p().bc().b($$3.get());
         ewk.a $$5 = new ewk.a($$0).a(ezd.a, this).a(ezd.f, this.dt()).a(ezd.c, $$1).b(ezd.d, $$1.d()).b(ezd.e, $$1.c());
         if ($$2 && this.bc != null) {
            $$5 = $$5.a(ezd.b, this.bc).a(this.bc.gD());
         }

         ewk $$6 = $$5.a(ezc.g);
         $$4.a($$6, this.eG(), $$1x -> this.a($$0, $$1x));
      }
   }

   public boolean a(ash $$0, aly<ewm> $$1, BiConsumer<ash, cxk> $$2) {
      return this.a($$0, $$1, $$0x -> $$0x.a(ezd.f, this.dt()).a(ezd.a, this).a(ezc.j), $$2);
   }

   protected void a(ash $$0, aly<ewm> $$1, cxk $$2, BiConsumer<ash, cxk> $$3) {
      this.a($$0, $$1, $$1x -> $$1x.a(ezd.f, this.dt()).a(ezd.a, this).a(ezd.i, $$2).a(ezc.s), $$3);
   }

   protected boolean a(ash $$0, aly<ewm> $$1, Function<ewk.a, ewk> $$2, BiConsumer<ash, cxk> $$3) {
      ewm $$4 = $$0.p().bc().b($$1);
      ewk $$5 = $$2.apply(new ewk.a($$0));
      List<cxk> $$6 = $$4.a($$5);
      if (!$$6.isEmpty()) {
         $$6.forEach($$2x -> $$3.accept($$0, $$2x));
         return true;
      } else {
         return false;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(bxj.p);
      if (!($$0 <= 0.0)) {
         this.ar = true;
         fbs $$3 = this.dy();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         fbs $$4 = new fbs($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aJ() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected axe e(btv $$0) {
      return axf.kz;
   }

   @Nullable
   protected axe o_() {
      return axf.ku;
   }

   private axe q(int $$0) {
      return $$0 > 4 ? this.eL().b() : this.eL().a();
   }

   public void eH() {
      this.cn = true;
   }

   public boolean eI() {
      return this.cn;
   }

   public float eJ() {
      return 0.0F;
   }

   protected fbn eK() {
      fbn $$0 = this.cR();
      bvf $$1 = this.dk();
      if ($$1 != null) {
         fbs $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<ddr, Set<dej>> c(bvn $$0) {
      return (Map<ddr, Set<dej>>)this.co.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public bwb.a eL() {
      return new bwb.a(axf.kA, axf.ks);
   }

   public Optional<jh> eM() {
      return this.ci;
   }

   public boolean q_() {
      if (this.aa_()) {
         return false;
      } else {
         jh $$0 = this.dv();
         dxn $$1 = this.dw();
         if ($$1.a(axu.aS)) {
            this.ci = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dsu && this.c($$0, $$1)) {
            this.ci = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(jh $$0, dxn $$1) {
      if (!$$1.c(dsu.b)) {
         return false;
      } else {
         dxn $$2 = this.dV().a_($$0.e());
         return $$2.a(dkg.cX) && $$2.c(dom.b) == $$1.c(dsu.aF);
      }
   }

   @Override
   public boolean bL() {
      return !this.dQ() && this.eD() > 0.0F;
   }

   public boolean a(bwb $$0, double $$1, boolean $$2, boolean $$3, Predicate<bwb> $$4, DoubleSupplier... $$5) {
      if (!$$4.test($$0)) {
         return false;
      } else {
         fbs $$6 = $$0.g(1.0F).d();

         for (DoubleSupplier $$7 : $$5) {
            fbs $$8 = new fbs(this.dA() - $$0.dA(), $$7.getAsDouble() - $$0.dE(), this.dG() - $$0.dG());
            double $$9 = $$8.g();
            $$8 = $$8.d();
            double $$10 = $$6.b($$8);
            if ($$10 > 1.0 - $$1 / ($$2 ? $$9 : 1.0)) {
               return $$0.a(this, $$3 ? dgi.a.c : dgi.a.a, dgi.b.a, $$7);
            }
         }

         return false;
      }
   }

   @Override
   public int cE() {
      return this.y(0.0F);
   }

   protected final int y(float $$0) {
      return bae.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, btv $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.f($$0, $$1);
      if ($$4 > 0) {
         this.a(this.q($$4), 1.0F, 1.0F);
         this.eN();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int f(float $$0, float $$1) {
      if (this.aq().a(axy.o)) {
         return 0;
      } else {
         float $$2 = (float)this.h(bxj.x);
         float $$3 = $$0 - $$2;
         return bae.c((double)($$3 * $$1) * this.h(bxj.k));
      }
   }

   protected void eN() {
      if (!this.bb()) {
         int $$0 = bae.a(this.dA());
         int $$1 = bae.a(this.dC() - 0.2F);
         int $$2 = bae.a(this.dG());
         dxn $$3 = this.dV().a_(new jh($$0, $$1, $$2));
         if (!$$3.l()) {
            dru $$4 = $$3.A();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void p(float $$0) {
      this.aO = 10;
      this.aN = this.aO;
   }

   public int eO() {
      return bae.a(this.h(bxj.a));
   }

   protected void c(btv $$0, float $$1) {
   }

   protected void d(btv $$0, float $$1) {
   }

   protected void z(float $$0) {
   }

   protected void a(btv $$0, float $$1, bvn... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bvn $$4 : $$2) {
            cxk $$5 = this.a($$4);
            dfm $$6 = $$5.a(ku.D);
            if ($$6 != null && $$6.g() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float e(btv $$0, float $$1) {
      if (!$$0.a(axw.b)) {
         this.c($$0, $$1);
         $$1 = btr.a(this, $$1, $$0, (float)this.eO(), (float)this.h(bxj.b));
      }

      return $$1;
   }

   protected float f(btv $$0, float $$1) {
      if ($$0.a(axw.f)) {
         return $$1;
      } else {
         if (this.b(bum.k) && !$$0.a(axw.g)) {
            int $$2 = (this.c(bum.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof asi) {
                  ((asi)this).a(axp.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof asi) {
                  ((asi)$$0.d()).a(axp.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(axw.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dV() instanceof ash $$7) {
               $$8 = ddt.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = btr.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void b(ash $$0, btv $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var10 = Math.max($$2 - this.fu(), 0.0F);
         this.E(this.fu() - ($$2 - var10));
         float $$4 = $$2 - var10;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F && $$1.d() instanceof asi $$5) {
            $$5.a(axp.H, Math.round($$4 * 10.0F));
         }

         if (var10 != 0.0F) {
            this.eP().a($$1, var10);
            this.x(this.eD() - var10);
            this.E(this.fu() - var10);
            this.a(ecj.o);
         }
      }
   }

   public bts eP() {
      return this.bT;
   }

   @Nullable
   public bwb eQ() {
      if (this.bc != null) {
         return this.bc;
      } else {
         return this.ca != null ? this.ca : null;
      }
   }

   public final float eR() {
      return (float)this.h(bxj.s);
   }

   public final float eS() {
      return (float)this.h(bxj.r);
   }

   public final int eT() {
      return this.al.a(bO);
   }

   public final void o(int $$0) {
      this.al.a(bO, $$0);
   }

   public final int eU() {
      return this.al.a(bP);
   }

   public final void p(int $$0) {
      this.al.a(bP, $$0);
   }

   private int C() {
      if (bul.a(this)) {
         return 6 - (1 + bul.b(this));
      } else {
         return this.b(bum.d) ? 6 + (1 + this.c(bum.d).e()) * 2 : 6;
      }
   }

   public void a(btd $$0) {
      this.a($$0, false);
   }

   public void a(btd $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.C() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dV() instanceof ash) {
            acu $$2 = new acu(this, $$0 == btd.a ? 0 : 3);
            ase $$3 = ((ash)this.dV()).m();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(btv $$0) {
      this.aT.a(1.5F);
      this.aj = 20;
      this.aO = 10;
      this.aN = this.aO;
      axe $$1 = this.e($$0);
      if ($$1 != null) {
         this.a($$1, this.fe(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }

      this.cj = $$0;
      this.ck = this.dV().ac();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            axe $$1 = this.o_();
            if ($$1 != null) {
               this.a($$1, this.fe(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cps)) {
               this.x(0.0F);
               this.a(this.dW().p());
            }
            break;
         case 29:
            this.a(axf.wW, 1.0F, 0.8F + this.dV().A.i() * 0.4F);
            break;
         case 30:
            this.a(axf.wX, 0.8F, 0.8F + this.dV().A.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ae.i() - 0.5F) * 0.2F;
               float $$6 = (this.ae.i() - 0.5F) * 0.2F;
               float $$7 = (this.ae.i() - 0.5F) * 0.2F;
               double $$8 = bae.d($$4, this.K, this.dA()) + (this.ae.j() - 0.5) * (double)this.dq() * 2.0;
               double $$9 = bae.d($$4, this.L, this.dC()) + this.ae.j() * (double)this.dr();
               double $$10 = bae.d($$4, this.M, this.dG()) + (this.ae.j() - 0.5) * (double)this.dq() * 2.0;
               this.dV().a(ls.ad, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.g(this.a(bvn.a));
            break;
         case 48:
            this.g(this.a(bvn.b));
            break;
         case 49:
            this.g(this.a(bvn.f));
            break;
         case 50:
            this.g(this.a(bvn.e));
            break;
         case 51:
            this.g(this.a(bvn.d));
            break;
         case 52:
            this.g(this.a(bvn.c));
            break;
         case 54:
            doa.b(this);
            break;
         case 55:
            this.E();
            break;
         case 60:
            this.D();
            break;
         case 65:
            this.g(this.a(bvn.g));
            break;
         default:
            super.b($$0);
      }
   }

   private void D() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ae.k() * 0.02;
         double $$2 = this.ae.k() * 0.02;
         double $$3 = this.ae.k() * 0.02;
         this.dV().a(ls.ac, this.d(1.0), this.dD(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void E() {
      cxk $$0 = this.a(bvn.b);
      this.a(bvn.b, this.a(bvn.a));
      this.a(bvn.a, $$0);
   }

   @Override
   protected void aI() {
      this.a(this.dW().o(), 4.0F);
   }

   protected void eV() {
      int $$0 = this.C();
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
   public bxf g(jq<bxe> $$0) {
      return this.eW().a($$0);
   }

   public double h(jq<bxe> $$0) {
      return this.eW().c($$0);
   }

   public double i(jq<bxe> $$0) {
      return this.eW().d($$0);
   }

   public bxg eW() {
      return this.bS;
   }

   public cxk eX() {
      return this.a(bvn.a);
   }

   public cxk eY() {
      return this.a(bvn.b);
   }

   public cxk a(bvv $$0) {
      return this.fw() == $$0 ? this.eX() : this.eY();
   }

   @Nonnull
   @Override
   public cxk dZ() {
      return this.eX();
   }

   public boolean b(cxg $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cxk> $$0) {
      return $$0.test(this.eX()) || $$0.test(this.eY());
   }

   public cxk b(btd $$0) {
      if ($$0 == btd.a) {
         return this.a(bvn.a);
      } else if ($$0 == btd.b) {
         return this.a(bvn.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(btd $$0, cxk $$1) {
      if ($$0 == btd.a) {
         this.a(bvn.a, $$1);
      } else {
         if ($$0 != btd.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bvn.b, $$1);
      }
   }

   public boolean d(bvn $$0) {
      return !this.a($$0).f();
   }

   public boolean e(bvn $$0) {
      return false;
   }

   public abstract Iterable<cxk> eZ();

   public abstract cxk a(bvn var1);

   public abstract void a(bvn var1, cxk var2);

   public Iterable<cxk> fa() {
      return List.of();
   }

   public Iterable<cxk> fb() {
      return this.eZ();
   }

   public Iterable<cxk> fc() {
      return Iterables.concat(this.fa(), this.fb());
   }

   protected void c(cxk $$0) {
      $$0.h().l($$0);
   }

   public float fd() {
      Iterable<cxk> $$0 = this.eZ();
      int $$1 = 0;
      int $$2 = 0;

      for (cxk $$3 : $$0) {
         if (!$$3.f()) {
            $$2++;
         }

         $$1++;
      }

      return $$1 > 0 ? (float)$$2 / (float)$$1 : 0.0F;
   }

   @Override
   public void h(boolean $$0) {
      super.h($$0);
      bxf $$1 = this.g(bxj.v);
      $$1.c(k.b());
      if ($$0) {
         $$1.b(k);
      }
   }

   protected float fe() {
      return 1.0F;
   }

   public float ff() {
      return this.e_() ? (this.ae.i() - this.ae.i()) * 0.2F + 1.5F : (this.ae.i() - this.ae.i()) * 0.2F + 1.0F;
   }

   protected boolean fg() {
      return this.eE();
   }

   @Override
   public void h(bvf $$0) {
      if (!this.fP()) {
         super.h($$0);
      }
   }

   private void c(bvf $$0) {
      fbs $$1;
      if (this.dQ()) {
         $$1 = this.dt();
      } else if (!$$0.dQ() && !this.dV().a_($$0.dv()).a(axu.aM)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dC(), $$0.dC());
         $$1 = new fbs(this.dA(), $$2, this.dG());
         boolean $$4 = this.dq() <= 4.0F && this.dr() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.dr() / 2.0;
            fbs $$6 = $$1.b(0.0, $$5, 0.0);
            fcm $$7 = fcj.a(fbn.a($$6, (double)this.dq(), (double)this.dr(), (double)this.dq()));
            $$1 = this.dV().a(this, $$7, $$6, (double)this.dq(), (double)this.dr(), (double)this.dq()).map($$1x -> $$1x.b(0.0, -$$5, 0.0)).orElse($$1);
         }
      }

      this.a($$1.d, $$1.e, $$1.f);
   }

   @Override
   public boolean cM() {
      return this.cL();
   }

   protected float fh() {
      return this.A(1.0F);
   }

   protected float A(float $$0) {
      return (float)this.h(bxj.o) * $$0 * this.aS() + this.fi();
   }

   public float fi() {
      return this.b(bum.h) ? 0.1F * ((float)this.c(bum.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void s() {
      float $$0 = this.fh();
      if (!($$0 <= 1.0E-5F)) {
         fbs $$1 = this.dy();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.cj()) {
            float $$2 = this.dL() * (float) (Math.PI / 180.0);
            this.i(new fbs((double)(-bae.a($$2)) * 0.2, 0.0, (double)bae.b($$2) * 0.2));
         }

         this.ar = true;
      }
   }

   protected void fj() {
      this.h(this.dy().b(0.0, -0.04F, 0.0));
   }

   protected void c(ayk<eto> $$0) {
      this.h(this.dy().b(0.0, 0.04F, 0.0));
   }

   protected float fk() {
      return 0.8F;
   }

   public boolean a(etp $$0) {
      return false;
   }

   @Override
   protected double bd() {
      return this.h(bxj.n);
   }

   protected double fl() {
      boolean $$0 = this.dy().e <= 0.0;
      return $$0 && this.b(bum.B) ? Math.min(this.be(), 0.01) : this.be();
   }

   public void a_(fbs $$0) {
      if (this.di()) {
         etp $$1 = this.dV().b_(this.dv());
         if ((this.bj() || this.bx()) && this.ek() && !this.a($$1)) {
            this.l($$0);
         } else if (this.fH()) {
            this.F();
         } else {
            this.k($$0);
         }
      }
   }

   private void k(fbs $$0) {
      jh $$1 = this.aQ();
      float $$2 = this.aJ() ? this.dV().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      fbs $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      buk $$6 = this.c(bum.y);
      if ($$6 != null) {
         $$5 += (0.05 * (double)($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.dV().C || this.dV().B($$1)) {
         $$5 -= this.fl();
      } else if (this.dC() > (double)this.dV().L_()) {
         $$5 = -0.1;
      } else {
         $$5 = 0.0;
      }

      if (this.eu()) {
         this.n($$4.d, $$5, $$4.f);
      } else {
         float $$7 = this instanceof cib ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void l(fbs $$0) {
      boolean $$1 = this.dy().e <= 0.0;
      double $$2 = this.dC();
      double $$3 = this.fl();
      if (this.bj()) {
         float $$4 = this.cj() ? 0.9F : this.fk();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bxj.F);
         if (!this.aJ()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fn() - $$5) * $$6;
         }

         if (this.b(bum.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bwf.a, this.dy());
         fbs $$7 = this.dy();
         if (this.P && this.q_()) {
            $$7 = new fbs($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.h(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bwf.a, this.dy());
         if (this.b(aya.b) <= this.dp()) {
            this.h(this.dy().d(0.5, 0.8F, 0.5));
            fbs $$8 = this.a($$3, $$1, this.dy());
            this.h($$8);
         } else {
            this.h(this.dy().c(0.5));
         }

         if ($$3 != 0.0) {
            this.h(this.dy().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      fbs $$9 = this.dy();
      if (this.P && this.g($$9.d, $$9.e + 0.6F - this.dC() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void F() {
      fbs $$0 = this.dy();
      double $$1 = $$0.i();
      this.h(this.m($$0));
      this.a(bwf.a, this.dy());
      if (!this.dV().C) {
         double $$2 = this.dy().i();
         this.c($$1, $$2);
      }
   }

   private fbs m(fbs $$0) {
      fbs $$1 = this.bT();
      float $$2 = this.dN() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fl();
      double $$6 = bae.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-bae.a($$2)) * 0.04;
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

   private void c(cps $$0, fbs $$1) {
      fbs $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.di()) {
         this.C(this.e($$0));
         this.a_($$2);
      } else {
         this.h(fbs.c);
      }
   }

   protected void a(cps $$0, fbs $$1) {
   }

   protected fbs b(cps $$0, fbs $$1) {
      return $$1;
   }

   protected float e(cps $$0) {
      return this.fn();
   }

   public void s(boolean $$0) {
      float $$1 = (float)bae.g(this.dA() - this.K, $$0 ? this.dC() - this.L : 0.0, this.dG() - this.M);
      if (!this.bZ() && this.bL()) {
         this.B($$1);
      } else {
         this.aT.a();
      }
   }

   protected void B(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aT.a($$1, 0.4F, this.e_() ? 3.0F : 1.0F);
   }

   private fbs a(fbs $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.h(this.n(this.dy()));
      this.a(bwf.a, this.dy());
      fbs $$2 = this.dy();
      if ((this.P || this.bn) && (this.q_() || this.dw().a(dkg.rk) && dqb.a(this))) {
         $$2 = new fbs($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public fbs a(double $$0, boolean $$1, fbs $$2) {
      if ($$0 != 0.0 && !this.cj()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new fbs($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private fbs n(fbs $$0) {
      if (this.q_()) {
         this.k();
         float $$1 = 0.15F;
         double $$2 = bae.a($$0.d, -0.15F, 0.15F);
         double $$3 = bae.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dw().a(dkg.on) && this.fG() && this instanceof cps) {
            $$4 = 0.0;
         }

         $$0 = new fbs($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aJ() ? this.fn() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fm();
   }

   protected float fm() {
      return this.cX() instanceof cps ? this.fn() * 0.1F : 0.02F;
   }

   public float fn() {
      return this.ce;
   }

   public void C(float $$0) {
      this.ce = $$0;
   }

   public boolean c(ash $$0, bvf $$1) {
      this.B($$1);
      return false;
   }

   @Override
   public void h() {
      super.h();
      this.I();
      this.J();
      if (!this.dV().C) {
         int $$0 = this.eT();
         if ($$0 > 0) {
            if (this.aL <= 0) {
               this.aL = 20 * (30 - $$0);
            }

            this.aL--;
            if (this.aL <= 0) {
               this.o($$0 - 1);
            }
         }

         int $$1 = this.eU();
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
            this.eP().c();
         }

         if (this.fP() && !this.L()) {
            this.fQ();
         }
      }

      if (!this.dQ()) {
         this.d_();
      }

      double $$2 = this.dA() - this.K;
      double $$3 = this.dG() - this.M;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aX;
      float $$6 = 0.0F;
      this.bg = this.bh;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)bae.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = bae.e(bae.h(this.dL()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aR > 0.0F) {
         $$5 = this.dL();
      }

      if (!this.aJ()) {
         $$7 = 0.0F;
      }

      this.bh = this.bh + ($$7 - this.bh) * 0.3F;
      bpo $$10 = bpn.a();
      $$10.a("headTurn");
      $$6 = this.g($$5, $$6);
      $$10.c();
      $$10.a("rangeChecks");

      while (this.dL() - this.N < -180.0F) {
         this.N -= 360.0F;
      }

      while (this.dL() - this.N >= 180.0F) {
         this.N += 360.0F;
      }

      while (this.aX - this.aY < -180.0F) {
         this.aY -= 360.0F;
      }

      while (this.aX - this.aY >= 180.0F) {
         this.aY += 360.0F;
      }

      while (this.dN() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dN() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aZ - this.ba < -180.0F) {
         this.ba -= 360.0F;
      }

      while (this.aZ - this.ba >= 180.0F) {
         this.ba += 360.0F;
      }

      $$10.c();
      this.bi += $$6;
      if (this.fH()) {
         this.bB++;
      } else {
         this.bB = 0;
      }

      if (this.fP()) {
         this.w(0.0F);
      }

      this.B();
      float $$11 = this.ej();
      if ($$11 != this.bG) {
         this.bG = $$11;
         this.m_();
      }

      this.bb.a();
   }

   private void G() {
      Map<bvn, cxk> $$0 = this.H();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bvn, cxk> H() {
      Map<bvn, cxk> $$0 = null;

      for (bvn $$1 : bvn.i) {
         cxk $$2 = switch ($$1.a()) {
            case a -> this.h($$1);
            case b -> this.g($$1);
            case c -> this.bX;
         };
         cxk $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bvn.class);
            }

            $$0.put($$1, $$3);
            bxg $$4 = this.eW();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<bvn, cxk> $$5 : $$0.entrySet()) {
            bvn $$6 = $$5.getKey();
            cxk $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1) -> {
                  bxf $$2 = this.bS.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1.b());
                     $$2.b($$1);
                  }
               });
               if (this.dV() instanceof ash $$8) {
                  ddt.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(cxk $$0, cxk $$1) {
      return !cxk.a($$1, $$0);
   }

   private void a(Map<bvn, cxk> $$0) {
      cxk $$1 = $$0.get(bvn.a);
      cxk $$2 = $$0.get(bvn.b);
      if ($$1 != null && $$2 != null && cxk.a($$1, this.h(bvn.b)) && cxk.a($$2, this.h(bvn.a))) {
         ((ash)this.dV()).m().b(this, new adv(this, (byte)55));
         $$0.remove(bvn.a);
         $$0.remove(bvn.b);
         this.c(bvn.a, $$1.v());
         this.c(bvn.b, $$2.v());
      }
   }

   private void b(Map<bvn, cxk> $$0) {
      List<Pair<bvn, cxk>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cxk $$3 = $$2.v();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
               break;
            case c:
               this.bX = $$3;
         }
      });
      ((ash)this.dV()).m().b(this, new age(this.ar(), $$1));
   }

   private cxk g(bvn $$0) {
      return this.bW.get($$0.b());
   }

   private void b(bvn $$0, cxk $$1) {
      this.bW.set($$0.b(), $$1);
   }

   private cxk h(bvn $$0) {
      return this.bV.get($$0.b());
   }

   private void c(bvn $$0, cxk $$1) {
      this.bV.set($$0.b(), $$1);
   }

   protected float g(float $$0, float $$1) {
      float $$2 = bae.h($$0 - this.aX);
      this.aX += $$2 * 0.3F;
      float $$3 = bae.h(this.dL() - this.aX);
      float $$4 = this.fo();
      if (Math.abs($$3) > $$4) {
         this.aX = this.aX + ($$3 - (float)bae.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fo() {
      return 50.0F;
   }

   public void d_() {
      if (this.cf > 0) {
         this.cf--;
      }

      if (this.br > 0) {
         this.a(this.br, this.bs, this.bt, this.bu, this.bv, this.bw);
         this.br--;
      } else if (!this.dj()) {
         this.h(this.dy().c(0.98));
      }

      if (this.by > 0) {
         this.a(this.by, this.bx);
         this.by--;
      }

      fbs $$0 = this.dy();
      double $$1 = $$0.d;
      double $$2 = $$0.e;
      double $$3 = $$0.f;
      if (Math.abs($$0.d) < 0.003) {
         $$1 = 0.0;
      }

      if (Math.abs($$0.e) < 0.003) {
         $$2 = 0.0;
      }

      if (Math.abs($$0.f) < 0.003) {
         $$3 = 0.0;
      }

      this.n($$1, $$2, $$3);
      bpo $$4 = bpn.a();
      $$4.a("ai");
      if (this.fg()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      } else if (this.dj()) {
         $$4.a("newAi");
         this.fs();
         $$4.c();
      }

      $$4.c();
      $$4.a("jump");
      if (this.bn && this.ek()) {
         double $$5;
         if (this.bx()) {
            $$5 = this.b(aya.b);
         } else {
            $$5 = this.b(aya.a);
         }

         boolean $$7 = this.bj() && $$5 > 0.0;
         double $$8 = this.dp();
         if (!$$7 || this.aJ() && !($$5 > $$8)) {
            if (!this.bx() || this.aJ() && !($$5 > $$8)) {
               if ((this.aJ() || $$7 && $$5 <= $$8) && this.cf == 0) {
                  this.s();
                  this.cf = 10;
               }
            } else {
               this.c(aya.b);
            }
         } else {
            this.c(aya.a);
         }
      } else {
         this.cf = 0;
      }

      $$4.c();
      $$4.a("travel");
      this.bo *= 0.98F;
      this.bq *= 0.98F;
      if (this.fH()) {
         this.fq();
      }

      fbn $$9 = this.cR();
      fbs $$10 = new fbs((double)this.bo, (double)this.bp, (double)this.bq);
      if (this.b(bum.B) || this.b(bum.y)) {
         this.k();
      }

      label112: {
         if (this.cX() instanceof cps $$11 && this.bL()) {
            this.c($$11, $$10);
            break label112;
         }

         this.a_($$10);
      }

      if (!this.dV().B_() || this.di()) {
         this.aK();
      }

      this.s(this instanceof cib);
      $$4.c();
      $$4.a("freezing");
      if (!this.dV().C && !this.eE()) {
         int $$12 = this.cu();
         if (this.av && this.dJ()) {
            this.k(Math.min(this.cx(), $$12 + 1));
         } else {
            this.k(Math.max(0, $$12 - 2));
         }
      }

      this.eg();
      this.eh();
      if (this.dV() instanceof ash $$13 && this.af % 40 == 0 && this.cw() && this.dJ()) {
         this.a($$13, this.dW().v(), 1.0F);
      }

      $$4.c();
      $$4.a("push");
      if (this.bC > 0) {
         this.bC--;
         this.a($$9, this.cR());
      }

      this.o();
      $$4.c();
      if (this.dV() instanceof ash $$14 && this.fp() && this.bl()) {
         this.a($$14, this.dW().i(), 1.0F);
      }
   }

   public boolean fp() {
      return false;
   }

   protected void fq() {
      this.cy();
      if (!this.dV().C) {
         if (!this.fr()) {
            this.b(7, false);
            return;
         }

         int $$0 = this.bB + 1;
         if ($$0 % 10 == 0) {
            int $$1 = $$0 / 10;
            if ($$1 % 2 == 0) {
               List<bvn> $$2 = bvn.i.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               bvn $$3 = ae.a($$2, this.ae);
               this.a($$3).a(1, this, $$3);
            }

            this.a(ecj.n);
         }
      }
   }

   protected boolean fr() {
      if (!this.aJ() && !this.bZ() && !this.b(bum.y)) {
         for (bvn $$0 : bvn.i) {
            if (b(this.a($$0), $$0)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   protected void fs() {
   }

   protected void o() {
      if (!(this.dV() instanceof ash $$0)) {
         this.dV().a(ebx.a(cps.class), this.cR(), bvk.a(this)).forEach(this::D);
      } else {
         List<bvf> $$2 = this.dV().a(this, this.cR(), bvk.a(this));
         if (!$$2.isEmpty()) {
            int $$3 = $$0.N().c(dgw.u);
            if ($$3 > 0 && $$2.size() > $$3 - 1 && this.ae.a(4) == 0) {
               int $$4 = 0;

               for (bvf $$5 : $$2) {
                  if (!$$5.bZ()) {
                     $$4++;
                  }
               }

               if ($$4 > $$3 - 1) {
                  this.a($$0, this.dW().h(), 6.0F);
               }
            }

            for (bvf $$6 : $$2) {
               this.D($$6);
            }
         }
      }
   }

   protected void a(fbn $$0, fbn $$1) {
      fbn $$2 = $$0.b($$1);
      List<bvf> $$3 = this.dV().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bvf $$4 : $$3) {
            if ($$4 instanceof bwb) {
               this.g((bwb)$$4);
               this.bC = 0;
               this.h(this.dy().c(-0.2));
               break;
            }
         }
      } else if (this.P) {
         this.bC = 0;
      }

      if (!this.dV().C && this.bC <= 0) {
         this.c(4, false);
         this.bD = 0.0F;
         this.bE = null;
      }
   }

   protected void D(bvf $$0) {
      $$0.h(this);
   }

   protected void g(bwb $$0) {
   }

   public boolean ft() {
      return (this.al.a(aC) & 4) != 0;
   }

   @Override
   public void ae() {
      bvf $$0 = this.dk();
      super.ae();
      if ($$0 != null && $$0 != this.dk() && !this.dV().C) {
         this.c($$0);
      }
   }

   @Override
   public void r() {
      super.r();
      this.bg = this.bh;
      this.bh = 0.0F;
      this.k();
   }

   @Override
   public void f_() {
      this.br = 0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.bs = $$0;
      this.bt = $$1;
      this.bu = $$2;
      this.bv = (double)$$3;
      this.bw = (double)$$4;
      this.br = $$5;
   }

   @Override
   public double R_() {
      return this.br > 0 ? this.bs : this.dA();
   }

   @Override
   public double S_() {
      return this.br > 0 ? this.bt : this.dC();
   }

   @Override
   public double g_() {
      return this.br > 0 ? this.bu : this.dG();
   }

   @Override
   public float r_() {
      return this.br > 0 ? (float)this.bw : this.dN();
   }

   @Override
   public float h_() {
      return this.br > 0 ? (float)this.bv : this.dL();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bx = (double)$$0;
      this.by = $$1;
   }

   public void t(boolean $$0) {
      this.bn = $$0;
   }

   public void a(clw $$0) {
      bvf $$1 = $$0.p();
      if ($$1 instanceof asi) {
         ao.R.a((asi)$$1, $$0.l(), this);
      }
   }

   public void a(bvf $$0, int $$1) {
      if (!$$0.dQ() && !this.dV().C && ($$0 instanceof clw || $$0 instanceof cpz || $$0 instanceof bvr)) {
         ((ash)this.dV()).m().b($$0, new agz($$0.ar(), this.ar(), $$1));
      }
   }

   public boolean E(bvf $$0) {
      return this.a($$0, dgi.a.a, dgi.b.a, $$0::dE);
   }

   public boolean a(bvf $$0, dgi.a $$1, dgi.b $$2, DoubleSupplier $$3) {
      if ($$0.dV() != this.dV()) {
         return false;
      } else {
         fbs $$4 = new fbs(this.dA(), this.dE(), this.dG());
         fbs $$5 = new fbs($$0.dA(), $$3.getAsDouble(), $$0.dG());
         return $$5.f($$4) > 128.0 ? false : this.dV().a(new dgi($$4, $$5, $$1, $$2, this)).d() == fbq.a.a;
      }
   }

   @Override
   public float i(float $$0) {
      return $$0 == 1.0F ? this.aZ : bae.i($$0, this.ba, this.aZ);
   }

   public float D(float $$0) {
      float $$1 = this.aR - this.aQ;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aQ + $$1 * $$0;
   }

   @Override
   public boolean bH() {
      return !this.dQ();
   }

   @Override
   public boolean bI() {
      return this.bL() && !this.aa_() && !this.q_();
   }

   @Override
   public float cA() {
      return this.aZ;
   }

   @Override
   public void q(float $$0) {
      this.aZ = $$0;
   }

   @Override
   public void r(float $$0) {
      this.aX = $$0;
   }

   @Override
   public fbs a(jm.a $$0, l.a $$1) {
      return j(super.a($$0, $$1));
   }

   public static fbs j(fbs $$0) {
      return new fbs($$0.d, $$0.e, 0.0);
   }

   public float fu() {
      return this.cg;
   }

   public final void E(float $$0) {
      this.F(bae.a($$0, 0.0F, this.eS()));
   }

   protected void F(float $$0) {
      this.cg = $$0;
   }

   public void i_() {
   }

   public void j_() {
   }

   protected void fv() {
      this.bZ = true;
   }

   public abstract bvv fw();

   public boolean fx() {
      return (this.al.a(aC) & 1) > 0;
   }

   public btd fy() {
      return (this.al.a(aC) & 2) > 0 ? btd.b : btd.a;
   }

   private void I() {
      if (this.fx()) {
         if (cxk.b(this.b(this.fy()), this.bz)) {
            this.bz = this.b(this.fy());
            this.a(this.bz);
         } else {
            this.fD();
         }
      }
   }

   protected void a(cxk $$0) {
      $$0.b(this.dV(), this, this.fA());
      if (--this.bA == 0 && !this.dV().C && !$$0.x()) {
         this.w();
      }
   }

   private void J() {
      this.cm = this.cl;
      if (this.cl()) {
         this.cl = Math.min(1.0F, this.cl + 0.09F);
      } else {
         this.cl = Math.max(0.0F, this.cl - 0.09F);
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

   public void c(btd $$0) {
      cxk $$1 = this.b($$0);
      if (!$$1.f() && !this.fx()) {
         this.bz = $$1;
         this.bA = $$1.a(this);
         if (!this.dV().C) {
            this.c(1, true);
            this.c(2, $$0 == btd.b);
            this.a(ecj.D);
         }
      }
   }

   @Override
   public void a(alc<?> $$0) {
      super.a($$0);
      if (bQ.equals($$0)) {
         if (this.dV().C) {
            this.fN().ifPresent(this::a);
         }
      } else if (aC.equals($$0) && this.dV().C) {
         if (this.fx() && this.bz.f()) {
            this.bz = this.b(this.fy());
            if (!this.bz.f()) {
               this.bA = this.bz.a(this);
            }
         } else if (!this.fx() && !this.bz.f()) {
            this.bz = cxk.k;
            this.bA = 0;
         }
      }
   }

   @Override
   public void a(fi.a $$0, fbs $$1) {
      super.a($$0, $$1);
      this.ba = this.aZ;
      this.aX = this.aZ;
      this.aY = this.aX;
   }

   @Override
   public float t(float $$0) {
      return bae.h($$0, this.aY, this.aX);
   }

   public void b(cxk $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         fbs $$3 = new fbs(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dN() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dL() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ae.i()) * 0.6 - 0.3;
         fbs $$5 = new fbs(((double)this.ae.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dN() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dL() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dA(), this.dE(), this.dG());
         this.dV().a(new lo(ls.S, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void w() {
      if (!this.dV().C || this.fx()) {
         btd $$0 = this.fy();
         if (!this.bz.equals(this.b($$0))) {
            this.fC();
         } else {
            if (!this.bz.f() && this.fx()) {
               cxk $$1 = this.bz.a(this.dV(), this);
               if ($$1 != this.bz) {
                  this.a($$0, $$1);
               }

               this.fD();
            }
         }
      }
   }

   public void b(cxk $$0) {
   }

   public cxk fz() {
      return this.bz;
   }

   public int fA() {
      return this.bA;
   }

   public int fB() {
      return this.fx() ? this.bz.a(this) - this.fA() : 0;
   }

   public void fC() {
      if (!this.bz.f()) {
         this.bz.a(this.dV(), this, this.fA());
         if (this.bz.x()) {
            this.I();
         }
      }

      this.fD();
   }

   public void fD() {
      if (!this.dV().C) {
         boolean $$0 = this.fx();
         this.c(1, false);
         if ($$0) {
            this.a(ecj.C);
         }
      }

      this.bz = cxk.k;
      this.bA = 0;
   }

   public boolean fE() {
      return this.fF() != null;
   }

   @Nullable
   public cxk fF() {
      if (this.fx() && !this.bz.f()) {
         cxg $$0 = this.bz.h();
         if ($$0.b(this.bz) != cxm.d) {
            return null;
         } else {
            return $$0.a(this.bz, this) - this.bA < 5 ? null : this.bz;
         }
      } else {
         return null;
      }
   }

   public boolean fG() {
      return this.cd();
   }

   public boolean fH() {
      return this.i(7);
   }

   @Override
   public boolean cl() {
      return super.cl() || !this.fH() && this.c(bwn.b);
   }

   public int fI() {
      return this.bB;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dA();
      double $$5 = this.dC();
      double $$6 = this.dG();
      double $$7 = $$1;
      boolean $$8 = false;
      jh $$9 = jh.a($$0, $$1, $$2);
      dha $$10 = this.dV();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.L_()) {
            jh $$12 = $$9.e();
            dxn $$13 = $$10.a_($$12);
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

         if (this instanceof bwj $$14) {
            $$14.L().o();
         }

         return true;
      }
   }

   public boolean fJ() {
      return !this.eE();
   }

   public boolean fK() {
      return true;
   }

   public void a(jh $$0, boolean $$1) {
   }

   public boolean fL() {
      return false;
   }

   @Override
   public final bvi a(bwn $$0) {
      return $$0 == bwn.c ? aD : this.e($$0).a(this.ej());
   }

   protected bvi e(bwn $$0) {
      return this.aq().n().a(this.ei());
   }

   public ImmutableList<bwn> fM() {
      return ImmutableList.of(bwn.a);
   }

   public fbn f(bwn $$0) {
      bvi $$1 = this.a($$0);
      return new fbn((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bwn $$0) {
      fbn $$1 = this.a($$0).a(this.dt());
      return this.dV().b(this, $$1);
   }

   @Override
   public boolean o(boolean $$0) {
      return super.o($$0) && !this.fP();
   }

   public Optional<jh> fN() {
      return this.al.a(bQ);
   }

   public void g(jh $$0) {
      this.al.a(bQ, Optional.of($$0));
   }

   public void fO() {
      this.al.a(bQ, Optional.empty());
   }

   public boolean fP() {
      return this.fN().isPresent();
   }

   public void b(jh $$0) {
      if (this.bZ()) {
         this.ae();
      }

      dxn $$1 = this.dV().a_($$0);
      if ($$1.b() instanceof djx) {
         this.dV().a($$0, $$1.b(djx.c, Boolean.valueOf(true)), 3);
      }

      this.b(bwn.c);
      this.a($$0);
      this.g($$0);
      this.h(fbs.c);
      this.ar = true;
   }

   private void a(jh $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean L() {
      return this.fN().map($$0 -> this.dV().a_($$0).b() instanceof djx).orElse(false);
   }

   public void fQ() {
      this.fN().filter(this.dV()::B).ifPresent($$0x -> {
         dxn $$1 = this.dV().a_($$0x);
         if ($$1.b() instanceof djx) {
            jm $$2 = $$1.c(djx.aF);
            this.dV().a($$0x, $$1.b(djx.c, Boolean.valueOf(false)), 3);
            fbs $$3 = djx.a(this.aq(), this.dV(), $$0x, $$2, this.dL()).orElseGet(() -> {
               jh $$1x = $$0x.d();
               return new fbs((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            fbs $$4 = fbs.c($$0x).d($$3).d();
            float $$5 = (float)bae.d(bae.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.v($$5);
            this.w(0.0F);
         }
      });
      fbs $$0 = this.dt();
      this.b(bwn.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fO();
   }

   @Nullable
   public jm fR() {
      jh $$0 = this.fN().orElse(null);
      return $$0 != null ? djx.a(this.dV(), $$0) : null;
   }

   @Override
   public boolean bM() {
      return !this.fP() && super.bM();
   }

   public cxk d(cxk $$0) {
      return cxk.k;
   }

   private static byte i(bvn $$0) {
      return switch ($$0) {
         case a -> 47;
         case b -> 48;
         case f -> 49;
         case e -> 50;
         case c -> 52;
         case d -> 51;
         case g -> 65;
      };
   }

   public void a(cxg $$0, bvn $$1) {
      this.dV().a(this, i($$1));
      this.a(this.a($$1), $$1, this.bS);
   }

   private void a(cxk $$0, bvn $$1, bxg $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         bxf $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      ddt.a($$0, this, $$1);
   }

   public static bvn d(btd $$0) {
      return $$0 == btd.a ? bvn.a : bvn.b;
   }

   public final boolean e(cxk $$0) {
      if (this.bL() && !this.aa_()) {
         dfm $$1 = $$0.a(ku.D);
         if ($$1 != null && $$1.e()) {
            bvn $$2 = $$1.a();
            return this.e($$2) && $$1.a(this.aq()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(bvn $$0) {
      return true;
   }

   public final bvn f(cxk $$0) {
      dfm $$1 = $$0.a(ku.D);
      return $$1 != null && this.e($$1.a()) ? $$1.a() : bvn.a;
   }

   public final boolean a(cxk $$0, bvn $$1) {
      dfm $$2 = $$0.a(ku.D);
      return $$2 == null ? $$1 == bvn.a && this.e(bvn.a) : $$1 == $$2.a() && this.e($$2.a()) && $$2.a(this.aq());
   }

   private static bwt a(bwb $$0, bvn $$1) {
      return $$1 != bvn.f && $$1 != bvn.a && $$1 != bvn.b ? bwt.a($$0, $$1, $$2 -> $$2.f() || $$0.f($$2) == $$1) : bwt.a($$0, $$1);
   }

   @Nullable
   private static bvn r(int $$0) {
      if ($$0 == 100 + bvn.f.b()) {
         return bvn.f;
      } else if ($$0 == 100 + bvn.e.b()) {
         return bvn.e;
      } else if ($$0 == 100 + bvn.d.b()) {
         return bvn.d;
      } else if ($$0 == 100 + bvn.c.b()) {
         return bvn.c;
      } else if ($$0 == 98) {
         return bvn.a;
      } else if ($$0 == 99) {
         return bvn.b;
      } else {
         return $$0 == 105 ? bvn.g : null;
      }
   }

   @Override
   public bwt a_(int $$0) {
      bvn $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dJ() {
      if (this.aa_()) {
         return false;
      } else {
         boolean $$0 = !this.a(bvn.f).a(ayd.bs) && !this.a(bvn.e).a(ayd.bs) && !this.a(bvn.d).a(ayd.bs) && !this.a(bvn.c).a(ayd.bs) && !this.a(bvn.g).a(ayd.bs);
         return $$0 && super.dJ();
      }
   }

   @Override
   public boolean co() {
      return !this.dV().B_() && this.b(bum.x) || super.co();
   }

   @Override
   public float dM() {
      return this.aX;
   }

   @Override
   public void a(acs $$0) {
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      float $$4 = $$0.n();
      float $$5 = $$0.m();
      this.f($$1, $$2, $$3);
      this.aX = $$0.o();
      this.aZ = $$0.o();
      this.aY = this.aX;
      this.ba = this.aZ;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.n($$0.j(), $$0.k(), $$0.l());
   }

   public boolean fS() {
      return this.dZ().h() instanceof cvm;
   }

   @Override
   public float dP() {
      float $$0 = (float)this.h(bxj.B);
      return this.cX() instanceof cps ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public fbs m(bvf $$0) {
      return this.dt().e(this.a($$0, this.a(this.aw()), this.ej() * this.ei()));
   }

   protected void a(int $$0, double $$1) {
      this.aZ = (float)bae.e(1.0 / (double)$$0, (double)this.aZ, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(bae.c((double)$$0 * this.h(bxj.h)));
   }

   public boolean fT() {
      return false;
   }

   public boolean a(ash $$0, btv $$1) {
      return this.d($$1) || ddt.a($$0, this, $$1);
   }

   public static boolean b(cxk $$0, bvn $$1) {
      if (!$$0.b(ku.F)) {
         return false;
      } else {
         dfm $$2 = $$0.a(ku.D);
         return $$2 != null && $$1 == $$2.a() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fU() {
      return this.bd;
   }

   public static record a(axe a, axe b) {
   }
}

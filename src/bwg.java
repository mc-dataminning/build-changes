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

public abstract class bwg extends bvk implements bve {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "active_effects";
   private static final alz c = alz.b("powder_snow");
   private static final alz d = alz.b("sprinting");
   private static final bxm k = new bxm(d, 0.3F, bxm.a.c);
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
   protected static final alc<Byte> aC = alg.a(bwg.class, ale.a);
   private static final alc<Float> bL = alg.a(bwg.class, ale.d);
   private static final alc<List<lq>> bM = alg.a(bwg.class, ale.m);
   private static final alc<Boolean> bN = alg.a(bwg.class, ale.k);
   private static final alc<Integer> bO = alg.a(bwg.class, ale.b);
   private static final alc<Integer> bP = alg.a(bwg.class, ale.b);
   private static final alc<Optional<jh>> bQ = alg.a(bwg.class, ale.p);
   private static final int bR = 15;
   protected static final bvn aD = bvn.c(0.2F, 0.2F).b(0.2F);
   public static final float aE = 0.5F;
   public static final float aF = 0.5F;
   public static final String aG = "attributes";
   public static final Predicate<bwg> aH = $$0 -> {
      if ($$0 instanceof cpx $$1) {
         cxp $$3 = $$1.a(bvs.f);
         return !$$3.a(ayd.co);
      } else {
         return true;
      }
   };
   private final bxl bS;
   private final btx bT = new btx(this);
   private final Map<jq<bun>, bup> bU = Maps.newHashMap();
   private final jz<cxp> bV = jz.a(2, cxp.j);
   private final jz<cxp> bW = jz.a(4, cxp.j);
   private cxp bX = cxp.j;
   public boolean aI;
   private boolean bY = false;
   public bti aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final bxh aT = new bxh();
   public final int aU = 20;
   public final float aV;
   public final float aW;
   public float aX;
   public float aY;
   public float aZ;
   public float ba;
   public final bvj bb = new bvj(this);
   @Nullable
   protected cpx bc;
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
   private bwg ca;
   private int cb;
   @Nullable
   private bwg cc;
   private int cd;
   private float ce;
   private int cf;
   private float cg;
   protected cxp bz = cxp.j;
   protected int bA;
   protected int bB;
   private jh ch;
   private Optional<jh> ci = Optional.empty();
   @Nullable
   private bua cj;
   private long ck;
   protected int bC;
   protected float bD;
   @Nullable
   protected cxp bE;
   private float cl;
   private float cm;
   protected bxi<?> bF;
   private boolean cn;
   private final EnumMap<bvs, Reference2ObjectMap<ddz, Set<der>>> co = new EnumMap<>(bvs.class);
   protected float bG = 1.0F;

   protected bwg(bvr<? extends bwg> $$0, dhi $$1) {
      super($$0, $$1);
      this.bS = new bxl(bxp.a($$0));
      this.x(this.eS());
      this.I = true;
      this.aW = (float)((Math.random() + 1.0) * 0.01F);
      this.ay();
      this.aV = (float)Math.random() * 12398.0F;
      this.v((float)(Math.random() * (float) (Math.PI * 2)));
      this.aZ = this.dM();
      vl $$2 = vl.a;
      this.bF = this.a(new Dynamic($$2, (vu)$$2.createMap(ImmutableMap.of($$2.a("memories"), (vu)$$2.emptyMap()))));
   }

   public bxi<?> ec() {
      return this.bF;
   }

   protected bxi.b<?> ed() {
      return bxi.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bxi<?> a(Dynamic<?> $$0) {
      return this.ed().a($$0);
   }

   @Override
   public void c(ash $$0) {
      this.a($$0, this.dX().y(), Float.MAX_VALUE);
   }

   public boolean a(bvr<?> $$0) {
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

   public static bxn.a ee() {
      return bxn.a()
         .a(bxo.s)
         .a(bxo.p)
         .a(bxo.v)
         .a(bxo.a)
         .a(bxo.b)
         .a(bxo.r)
         .a(bxo.B)
         .a(bxo.y)
         .a(bxo.n)
         .a(bxo.x)
         .a(bxo.k)
         .a(bxo.o)
         .a(bxo.w)
         .a(bxo.h)
         .a(bxo.i)
         .a(bxo.F)
         .a(bxo.u)
         .a(bxo.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxv $$2, jh $$3) {
      if (!this.bj()) {
         this.br();
      }

      if (this.dW() instanceof ash $$4 && $$1 && this.Z > 0.0F) {
         this.b($$4, $$3);
         double $$5 = this.h(bxo.x);
         if ((double)this.Z > $$5 && !$$2.l()) {
            double $$6 = this.dB();
            double $$7 = this.dD();
            double $$8 = this.dH();
            jh $$9 = this.dw();
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

   public final boolean ef() {
      return this.aq().a(axy.m);
   }

   public float a(float $$0) {
      return bae.h($$0, this.cm, this.cl);
   }

   public boolean eg() {
      return this.dz().b() < 1.0E-5F && this.bn();
   }

   @Override
   public void az() {
      this.aQ = this.aR;
      if (this.ak) {
         this.fP().ifPresent(this::a);
      }

      if (this.dW() instanceof ash $$0) {
         deb.b($$0, this);
      }

      super.az();
      bpt $$1 = bps.a();
      $$1.a("livingEntityBaseTick");
      if (this.bi() || this.dW().C) {
         this.aH();
      }

      if (this.bL()) {
         boolean $$2 = this instanceof cpx;
         if (this.dW() instanceof ash $$3) {
            if (this.bM()) {
               this.a($$3, this.dX().g(), 1.0F);
            } else if ($$2 && !this.dW().F_().a(this.cR())) {
               double $$4 = this.dW().F_().a(this) + this.dW().F_().n();
               if ($$4 < 0.0) {
                  double $$5 = this.dW().F_().o();
                  if ($$5 > 0.0) {
                     this.a($$3, this.dX().x(), (float)Math.max(1, bae.a(-$$4 * $$5)));
                  }
               }
            }
         }

         if (this.a(aya.a) && !this.dW().a_(jh.a(this.dB(), this.dF(), this.dH())).a(dko.ny)) {
            boolean $$6 = !this.ef() && !buq.c(this) && (!$$2 || !((cpx)this).gj().a);
            if ($$6) {
               this.j(this.l(this.ct()));
               if (this.ct() == -20) {
                  this.j(0);
                  fby $$7 = this.dz();

                  for (int $$8 = 0; $$8 < 8; $$8++) {
                     double $$9 = this.ae.j() - this.ae.j();
                     double $$10 = this.ae.j() - this.ae.j();
                     double $$11 = this.ae.j() - this.ae.j();
                     this.dW().a(ls.d, this.dB() + $$9, this.dD() + $$10, this.dH() + $$11, $$7.d, $$7.e, $$7.f);
                  }

                  this.a(this.dX().i(), 2.0F);
               }
            }

            if (!this.dW().C && this.bZ() && this.dl() != null && this.dl().cb()) {
               this.ae();
            }
         } else if (this.ct() < this.cs()) {
            this.j(this.m(this.ct()));
         }

         if (this.dW() instanceof ash $$12) {
            jh $$13 = this.dw();
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

      if (this.eF() && this.dW().h(this)) {
         this.em();
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

      this.ew();
      this.bj = this.bi;
      this.aY = this.aX;
      this.ba = this.aZ;
      this.N = this.dM();
      this.O = this.dO();
      $$1.c();
   }

   @Override
   protected float aT() {
      return bae.h((float)this.h(bxo.u), super.aT(), 1.0F);
   }

   protected void eh() {
      bxk $$0 = this.g(bxo.v);
      if ($$0 != null) {
         if ($$0.a(c) != null) {
            $$0.c(c);
         }
      }
   }

   protected void ei() {
      if (!this.bt().l()) {
         int $$0 = this.cu();
         if ($$0 > 0) {
            bxk $$1 = this.g(bxo.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cv();
            $$1.b(new bxm(c, (double)$$2, bxm.a.a));
         }
      }
   }

   protected void b(ash $$0, jh $$1) {
      deb.a($$0, this);
   }

   public boolean e_() {
      return false;
   }

   public float ej() {
      return this.e_() ? 0.5F : 1.0F;
   }

   public final float ek() {
      bxl $$0 = this.eY();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bxo.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean el() {
      return true;
   }

   protected void em() {
      this.aP++;
      if (this.aP >= 20 && !this.dW().B_() && !this.dR()) {
         this.dW().a(this, (byte)60);
         this.a(bvk.d.a);
      }
   }

   public boolean en() {
      return !this.e_();
   }

   protected boolean eo() {
      return !this.e_();
   }

   protected int l(int $$0) {
      bxk $$1 = this.g(bxo.w);
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

   public final int a(ash $$0, @Nullable bvk $$1) {
      return deb.a($$0, $$1, this, this.e($$0));
   }

   protected int e(ash $$0) {
      return 0;
   }

   protected boolean ep() {
      return false;
   }

   @Nullable
   public bwg eq() {
      return this.ca;
   }

   @Override
   public bwg am() {
      return this.eq();
   }

   public int er() {
      return this.cb;
   }

   public void c(@Nullable cpx $$0) {
      this.bc = $$0;
      this.bd = this.af;
   }

   public void a(@Nullable bwg $$0) {
      this.ca = $$0;
      this.cb = this.af;
   }

   @Nullable
   public bwg es() {
      return this.cc;
   }

   public int et() {
      return this.cd;
   }

   public void B(bvk $$0) {
      if ($$0 instanceof bwg) {
         this.cc = (bwg)$$0;
      } else {
         this.cc = null;
      }

      this.cd = this.af;
   }

   public int eu() {
      return this.bf;
   }

   public void n(int $$0) {
      this.bf = $$0;
   }

   public boolean ev() {
      return this.bY;
   }

   public void r(boolean $$0) {
      this.bY = $$0;
   }

   protected boolean b(bvs $$0) {
      return true;
   }

   public void a(bvs $$0, cxp $$1, cxp $$2) {
      if (!this.dW().B_() && !this.aa_()) {
         boolean $$3 = $$2.f() && $$1.f();
         if (!$$3 && !cxp.c($$1, $$2) && !this.ak) {
            dfu $$4 = $$2.a(ku.D);
            if (!this.bb() && $$4 != null && $$0 == $$4.a()) {
               this.dW().a(null, this.dB(), this.dD(), this.dH(), $$4.b(), this.dn(), 1.0F, 1.0F, this.ae.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? ecr.v : ecr.S);
            }
         }
      }
   }

   @Override
   public void a(bvk.d $$0) {
      if (($$0 == bvk.d.a || $$0 == bvk.d.b) && this.dW() instanceof ash $$1) {
         this.a($$1, $$0);
      }

      super.a($$0);
      this.bF.a();
   }

   protected void a(ash $$0, bvk.d $$1) {
      for (bup $$2 : this.eB()) {
         $$2.a($$0, this, $$1);
      }

      this.bU.clear();
   }

   @Override
   public void b(ux $$0) {
      $$0.a("Health", this.eE());
      $$0.a("HurtTime", (short)this.aN);
      $$0.a("HurtByTimestamp", this.cb);
      $$0.a("DeathTime", (short)this.aP);
      $$0.a("AbsorptionAmount", this.fw());
      $$0.a("attributes", this.eY().d());
      if (!this.bU.isEmpty()) {
         vd $$1 = new vd();

         for (bup $$2 : this.bU.values()) {
            $$1.add($$2.j());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fJ());
      this.fP().ifPresent($$1 -> {
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
      if ($$0.b("attributes", 9) && this.dW() != null && !this.dW().C) {
         this.eY().a($$0.c("attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         vd $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ux $$3 = $$1.a($$2);
            bup $$4 = bup.a($$3);
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
         fdd $$6 = this.dW().Q();
         fcy $$7 = $$6.b($$5);
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
         this.al.a(aq, bws.c);
         if (!this.ak) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bF = this.a(new Dynamic(vl.a, $$0.c("Brain")));
      }
   }

   protected void ew() {
      Iterator<jq<bun>> $$0 = this.bU.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jq<bun> $$1 = $$0.next();
            bup $$2 = this.bU.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dW().C) {
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
         if (!this.dW().C) {
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
            this.dW().a(ae.a($$3, this.ae), this.d(0.5), this.dE(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void K() {
      if (this.bU.isEmpty()) {
         this.ez();
         this.k(false);
      } else {
         this.k(this.b(bur.n));
         this.m();
      }
   }

   private void m() {
      List<lq> $$0 = this.bU.values().stream().filter(bup::g).map(bup::a).toList();
      this.al.a(bM, $$0);
      this.al.a(bN, d(this.bU.values()));
   }

   private void u() {
      boolean $$0 = this.co();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable bvk $$0) {
      double $$1 = 1.0;
      if (this.cg()) {
         $$1 *= 0.8;
      }

      if (this.cp()) {
         float $$2 = this.ff();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cxp $$3 = this.a(bvs.f);
         bvr<?> $$4 = $$0.aq();
         if ($$4 == bvr.bf && $$3.a(cxt.vb)
            || $$4 == bvr.bO && $$3.a(cxt.ve)
            || $$4 == bvr.aS && $$3.a(cxt.vh)
            || $$4 == bvr.aT && $$3.a(cxt.vh)
            || $$4 == bvr.F && $$3.a(cxt.vf)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bwg $$0) {
      return $$0 instanceof cpx && this.dW().al() == btg.a ? false : $$0.ex();
   }

   public boolean ex() {
      return !this.cC() && this.ey();
   }

   public boolean ey() {
      return !this.aa_() && this.bL();
   }

   public static boolean d(Collection<bup> $$0) {
      for (bup $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void ez() {
      this.al.a(bM, List.of());
   }

   public boolean eA() {
      if (this.dW().C) {
         return false;
      } else if (this.bU.isEmpty()) {
         return false;
      } else {
         Map<jq<bun>, bup> $$0 = Maps.newHashMap(this.bU);
         this.bU.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<bup> eB() {
      return this.bU.values();
   }

   public Map<jq<bun>, bup> eC() {
      return this.bU;
   }

   public boolean b(jq<bun> $$0) {
      return this.bU.containsKey($$0);
   }

   @Nullable
   public bup c(jq<bun> $$0) {
      return this.bU.get($$0);
   }

   public final boolean a(bup $$0) {
      return this.b($$0, null);
   }

   public boolean b(bup $$0, @Nullable bvk $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         bup $$2 = this.bU.get($$0.c());
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

   public boolean b(bup $$0) {
      if (this.aq().a(axy.G)) {
         return !$$0.a(bur.M);
      } else if (this.aq().a(axy.F)) {
         return !$$0.a(bur.L);
      } else {
         return !this.aq().a(axy.w) ? true : !$$0.a(bur.j) && !$$0.a(bur.s);
      }
   }

   public void c(bup $$0, @Nullable bvk $$1) {
      if (this.b($$0)) {
         bup $$2 = this.bU.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eD() {
      return this.aq().a(axy.x);
   }

   @Nullable
   public bup d(jq<bun> $$0) {
      return this.bU.remove($$0);
   }

   public boolean e(jq<bun> $$0) {
      bup $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(bup $$0, @Nullable bvk $$1) {
      this.bZ = true;
      if (!this.dW().C) {
         $$0.c().a().a(this.eY(), $$0.e());
         this.c($$0);
      }
   }

   public void c(bup $$0) {
      for (bvk $$1 : this.cZ()) {
         if ($$1 instanceof asi $$2) {
            $$2.f.b(new ahf(this.ar(), $$0, false));
         }
      }
   }

   protected void a(bup $$0, boolean $$1, @Nullable bvk $$2) {
      this.bZ = true;
      if ($$1 && !this.dW().C) {
         bun $$3 = $$0.c().a();
         $$3.a(this.eY());
         $$3.a(this.eY(), $$0.e());
         this.B();
      }

      if (!this.dW().C) {
         this.c($$0);
      }
   }

   protected void c(Collection<bup> $$0) {
      this.bZ = true;
      if (!this.dW().C) {
         for (bup $$1 : $$0) {
            $$1.c().a().a(this.eY());

            for (bvk $$2 : this.cZ()) {
               if ($$2 instanceof asi $$3) {
                  $$3.f.b(new afi(this.ar(), $$1.c()));
               }
            }
         }

         this.B();
      }
   }

   private void B() {
      Set<bxk> $$0 = this.eY().b();

      for (bxk $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jq<bxj> $$0) {
      if ($$0.a(bxo.s)) {
         float $$1 = this.eS();
         if (this.eE() > $$1) {
            this.x($$1);
         }
      } else if ($$0.a(bxo.r)) {
         float $$2 = this.eT();
         if (this.fw() > $$2) {
            this.E($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.eE();
      if ($$1 > 0.0F) {
         this.x($$1 + $$0);
      }
   }

   public float eE() {
      return this.al.a(bL);
   }

   public void x(float $$0) {
      this.al.a(bL, bae.a($$0, 0.0F, this.eS()));
   }

   public boolean eF() {
      return this.eE() <= 0.0F;
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.eF()) {
         return false;
      } else if ($$1.a(axw.i) && this.b(bur.l)) {
         return false;
      } else {
         if (this.fR()) {
            this.fS();
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
            if (!$$1.a(axw.j) && $$1.c() instanceof bwg $$7) {
               this.d($$7);
            }

            $$4 = true;
         }

         if ($$1.a(axw.o) && this.aq().a(axy.l)) {
            $$2 *= 5.0F;
         }

         if ($$1.a(axw.a) && !this.a(bvs.f).f()) {
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

         bvk $$9 = $$1.d();
         if ($$9 != null) {
            if ($$9 instanceof bwg $$10 && !$$1.a(axw.q) && (!$$1.a(bud.I) || !this.aq().a(axy.E))) {
               this.a($$10);
            }

            if ($$9 instanceof cpx $$11) {
               this.bd = 100;
               this.bc = $$11;
            } else if ($$9 instanceof cja $$12 && $$12.p()) {
               this.bd = 100;
               if ($$12.ah_() instanceof cpx $$13) {
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
               if ($$1.c() instanceof cqq $$16) {
                  DoubleDoubleImmutablePair $$17 = $$16.a_(this, $$1);
                  $$14 = -$$17.leftDouble();
                  $$15 = -$$17.rightDouble();
               } else if ($$1.i() != null) {
                  $$14 = $$1.i().a() - this.dB();
                  $$15 = $$1.i().c() - this.dH();
               }

               this.p(0.4F, $$14, $$15);
               if (!$$4) {
                  this.a($$14, $$15);
               }
            }
         }

         if (this.eF()) {
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
            this.ck = this.dW().ac();

            for (bup $$19 : this.eB()) {
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

   protected void d(bwg $$0) {
      $$0.e(this);
   }

   protected void e(bwg $$0) {
      $$0.p(0.5, $$0.dB() - this.dB(), $$0.dH() - this.dH());
   }

   private boolean h(bua $$0) {
      if ($$0.a(axw.d)) {
         return false;
      } else {
         cxp $$1 = null;
         dab $$2 = null;

         for (bti $$3 : bti.values()) {
            cxp $$4 = this.b($$3);
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
               this.a(ecr.C);
            }

            this.x(1.0F);
            $$2.a($$1, this);
            this.dW().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public bua eG() {
      if (this.dW().ac() - this.ck > 40L) {
         this.cj = null;
      }

      return this.cj;
   }

   protected void f(bua $$0) {
      this.b(this.e($$0));
   }

   public void b(@Nullable axe $$0) {
      if ($$0 != null) {
         this.a($$0, this.fg(), this.fh());
      }
   }

   public boolean g(bua $$0) {
      bvk $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cqe $$3 && $$3.z() > 0) {
         $$2 = true;
      }

      cxp $$4 = this.fH();
      if (!$$0.a(axw.c) && $$4 != null && $$4.h() instanceof cyr && !$$2) {
         fby $$5 = $$0.i();
         if ($$5 != null) {
            fby $$6 = this.d(0.0F, this.cA());
            fby $$7 = $$5.a(this.du());
            $$7 = new fby($$7.d, 0.0, $$7.f).d();
            return $$7.b($$6) < 0.0;
         }
      }

      return false;
   }

   private void g(cxp $$0) {
      if (!$$0.f()) {
         if (!this.bb()) {
            this.dW().a(this.dB(), this.dD(), this.dH(), $$0.M(), this.dn(), 0.8F, 0.8F + this.dW().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(bua $$0) {
      if (!this.dR() && !this.be) {
         bvk $$1 = $$0.d();
         bwg $$2 = this.eR();
         if (this.bl >= 0 && $$2 != null) {
            $$2.a(this, this.bl, $$0);
         }

         if (this.fR()) {
            this.fS();
         }

         if (!this.dW().C && this.l_()) {
            a.info("Named entity {} died: {}", this, this.eQ().a().getString());
         }

         this.be = true;
         this.eQ().c();
         if (this.dW() instanceof ash $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(ecr.p);
               this.b($$3, $$0);
               this.f($$2);
            }

            this.dW().a(this, (byte)3);
         }

         this.b(bws.h);
      }
   }

   protected void f(@Nullable bwg $$0) {
      if (this.dW() instanceof ash $$1) {
         boolean var6 = false;
         if ($$0 instanceof clo) {
            if ($$1.N().b(dhe.c)) {
               jh $$4 = this.dw();
               dxv $$5 = dko.ck.m();
               if (this.dW().a_($$4).l() && $$5.a((dhl)this.dW(), $$4)) {
                  this.dW().a($$4, $$5, 3);
                  var6 = true;
               }
            }

            if (!var6) {
               cmb $$6 = new cmb(this.dW(), this.dB(), this.dD(), this.dH(), new cxp(cxt.dD));
               this.dW().b($$6);
            }
         }
      }
   }

   protected void b(ash $$0, bua $$1) {
      boolean $$2 = this.bd > 0;
      if (this.eo() && $$0.N().b(dhe.f)) {
         this.b($$0, $$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.f($$0);
      this.b($$0, $$1.d());
   }

   protected void f(ash $$0) {
   }

   protected void b(ash $$0, @Nullable bvk $$1) {
      if (!this.eJ() && (this.ep() || this.bd > 0 && this.en() && $$0.N().b(dhe.f))) {
         bvw.a($$0, this.du(), this.a($$0, $$1));
      }
   }

   protected void a(ash $$0, bua $$1, boolean $$2) {
   }

   public long eH() {
      return 0L;
   }

   protected float a(bvk $$0, bua $$1) {
      float $$2 = (float)this.h(bxo.d);
      return this.dW() instanceof ash $$3 ? deb.d($$3, this.ea(), $$0, $$1, $$2) : $$2;
   }

   protected void b(ash $$0, bua $$1, boolean $$2) {
      Optional<aly<ewu>> $$3 = this.eb();
      if (!$$3.isEmpty()) {
         ewu $$4 = $$0.p().bc().b($$3.get());
         ews.a $$5 = new ews.a($$0).a(ezj.a, this).a(ezj.f, this.du()).a(ezj.c, $$1).b(ezj.d, $$1.d()).b(ezj.e, $$1.c());
         if ($$2 && this.bc != null) {
            $$5 = $$5.a(ezj.b, this.bc).a(this.bc.gF());
         }

         ews $$6 = $$5.a(ezi.g);
         $$4.a($$6, this.eH(), $$1x -> this.a($$0, $$1x));
      }
   }

   public boolean a(ash $$0, aly<ewu> $$1, BiConsumer<ash, cxp> $$2) {
      return this.a($$0, $$1, $$0x -> $$0x.a(ezj.f, this.du()).a(ezj.a, this).a(ezi.j), $$2);
   }

   protected void a(ash $$0, aly<ewu> $$1, cxp $$2, BiConsumer<ash, cxp> $$3) {
      this.a($$0, $$1, $$1x -> $$1x.a(ezj.f, this.du()).a(ezj.a, this).a(ezj.i, $$2).a(ezi.s), $$3);
   }

   protected boolean a(ash $$0, aly<ewu> $$1, Function<ews.a, ews> $$2, BiConsumer<ash, cxp> $$3) {
      ewu $$4 = $$0.p().bc().b($$1);
      ews $$5 = $$2.apply(new ews.a($$0));
      List<cxp> $$6 = $$4.a($$5);
      if (!$$6.isEmpty()) {
         $$6.forEach($$2x -> $$3.accept($$0, $$2x));
         return true;
      } else {
         return false;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(bxo.p);
      if (!($$0 <= 0.0)) {
         this.ar = true;
         fby $$3 = this.dz();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         fby $$4 = new fby($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aJ() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected axe e(bua $$0) {
      return axf.kA;
   }

   @Nullable
   protected axe o_() {
      return axf.kv;
   }

   private axe q(int $$0) {
      return $$0 > 4 ? this.eM().b() : this.eM().a();
   }

   public void eI() {
      this.cn = true;
   }

   public boolean eJ() {
      return this.cn;
   }

   public float eK() {
      return 0.0F;
   }

   protected fbt eL() {
      fbt $$0 = this.cR();
      bvk $$1 = this.dl();
      if ($$1 != null) {
         fby $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<ddz, Set<der>> c(bvs $$0) {
      return (Map<ddz, Set<der>>)this.co.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public bwg.a eM() {
      return new bwg.a(axf.kB, axf.kt);
   }

   public Optional<jh> eN() {
      return this.ci;
   }

   public boolean q_() {
      if (this.aa_()) {
         return false;
      } else {
         jh $$0 = this.dw();
         dxv $$1 = this.dx();
         if ($$1.a(axu.aS)) {
            this.ci = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dtc && this.c($$0, $$1)) {
            this.ci = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(jh $$0, dxv $$1) {
      if (!$$1.c(dtc.b)) {
         return false;
      } else {
         dxv $$2 = this.dW().a_($$0.e());
         return $$2.a(dko.cX) && $$2.c(dou.b) == $$1.c(dtc.aF);
      }
   }

   @Override
   public boolean bL() {
      return !this.dR() && this.eE() > 0.0F;
   }

   public boolean a(bwg $$0, double $$1, boolean $$2, boolean $$3, Predicate<bwg> $$4, DoubleSupplier... $$5) {
      if (!$$4.test($$0)) {
         return false;
      } else {
         fby $$6 = $$0.g(1.0F).d();

         for (DoubleSupplier $$7 : $$5) {
            fby $$8 = new fby(this.dB() - $$0.dB(), $$7.getAsDouble() - $$0.dF(), this.dH() - $$0.dH());
            double $$9 = $$8.g();
            $$8 = $$8.d();
            double $$10 = $$6.b($$8);
            if ($$10 > 1.0 - $$1 / ($$2 ? $$9 : 1.0)) {
               return $$0.a(this, $$3 ? dgq.a.c : dgq.a.a, dgq.b.a, $$7);
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
   public boolean a(float $$0, float $$1, bua $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.f($$0, $$1);
      if ($$4 > 0) {
         this.a(this.q($$4), 1.0F, 1.0F);
         this.eO();
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
         float $$2 = (float)this.h(bxo.x);
         float $$3 = $$0 - $$2;
         return bae.c((double)($$3 * $$1) * this.h(bxo.k));
      }
   }

   protected void eO() {
      if (!this.bb()) {
         int $$0 = bae.a(this.dB());
         int $$1 = bae.a(this.dD() - 0.2F);
         int $$2 = bae.a(this.dH());
         dxv $$3 = this.dW().a_(new jh($$0, $$1, $$2));
         if (!$$3.l()) {
            dsc $$4 = $$3.A();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void p(float $$0) {
      this.aO = 10;
      this.aN = this.aO;
   }

   public int eP() {
      return bae.a(this.h(bxo.a));
   }

   protected void c(bua $$0, float $$1) {
   }

   protected void d(bua $$0, float $$1) {
   }

   protected void z(float $$0) {
   }

   protected void a(bua $$0, float $$1, bvs... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bvs $$4 : $$2) {
            cxp $$5 = this.a($$4);
            dfu $$6 = $$5.a(ku.D);
            if ($$6 != null && $$6.h() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float e(bua $$0, float $$1) {
      if (!$$0.a(axw.b)) {
         this.c($$0, $$1);
         $$1 = btw.a(this, $$1, $$0, (float)this.eP(), (float)this.h(bxo.b));
      }

      return $$1;
   }

   protected float f(bua $$0, float $$1) {
      if ($$0.a(axw.f)) {
         return $$1;
      } else {
         if (this.b(bur.k) && !$$0.a(axw.g)) {
            int $$2 = (this.c(bur.k).e() + 1) * 5;
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
            if (this.dW() instanceof ash $$7) {
               $$8 = deb.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = btw.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void b(ash $$0, bua $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var10 = Math.max($$2 - this.fw(), 0.0F);
         this.E(this.fw() - ($$2 - var10));
         float $$4 = $$2 - var10;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F && $$1.d() instanceof asi $$5) {
            $$5.a(axp.H, Math.round($$4 * 10.0F));
         }

         if (var10 != 0.0F) {
            this.eQ().a($$1, var10);
            this.x(this.eE() - var10);
            this.E(this.fw() - var10);
            this.a(ecr.o);
         }
      }
   }

   public btx eQ() {
      return this.bT;
   }

   @Nullable
   public bwg eR() {
      if (this.bc != null) {
         return this.bc;
      } else {
         return this.ca != null ? this.ca : null;
      }
   }

   public final float eS() {
      return (float)this.h(bxo.s);
   }

   public final float eT() {
      return (float)this.h(bxo.r);
   }

   public final int eU() {
      return this.al.a(bO);
   }

   public final void o(int $$0) {
      this.al.a(bO, $$0);
   }

   public final int eV() {
      return this.al.a(bP);
   }

   public final void p(int $$0) {
      this.al.a(bP, $$0);
   }

   private int C() {
      if (buq.a(this)) {
         return 6 - (1 + buq.b(this));
      } else {
         return this.b(bur.d) ? 6 + (1 + this.c(bur.d).e()) * 2 : 6;
      }
   }

   public void a(bti $$0) {
      this.a($$0, false);
   }

   public void a(bti $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.C() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dW() instanceof ash) {
            acu $$2 = new acu(this, $$0 == bti.a ? 0 : 3);
            ase $$3 = ((ash)this.dW()).m();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bua $$0) {
      this.aT.a(1.5F);
      this.aj = 20;
      this.aO = 10;
      this.aN = this.aO;
      axe $$1 = this.e($$0);
      if ($$1 != null) {
         this.a($$1, this.fg(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }

      this.cj = $$0;
      this.ck = this.dW().ac();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            axe $$1 = this.o_();
            if ($$1 != null) {
               this.a($$1, this.fg(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cpx)) {
               this.x(0.0F);
               this.a(this.dX().p());
            }
            break;
         case 29:
            this.a(axf.wX, 1.0F, 0.8F + this.dW().A.i() * 0.4F);
            break;
         case 30:
            this.a(axf.wY, 0.8F, 0.8F + this.dW().A.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ae.i() - 0.5F) * 0.2F;
               float $$6 = (this.ae.i() - 0.5F) * 0.2F;
               float $$7 = (this.ae.i() - 0.5F) * 0.2F;
               double $$8 = bae.d($$4, this.K, this.dB()) + (this.ae.j() - 0.5) * (double)this.dr() * 2.0;
               double $$9 = bae.d($$4, this.L, this.dD()) + this.ae.j() * (double)this.ds();
               double $$10 = bae.d($$4, this.M, this.dH()) + (this.ae.j() - 0.5) * (double)this.dr() * 2.0;
               this.dW().a(ls.ad, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.g(this.a(bvs.a));
            break;
         case 48:
            this.g(this.a(bvs.b));
            break;
         case 49:
            this.g(this.a(bvs.f));
            break;
         case 50:
            this.g(this.a(bvs.e));
            break;
         case 51:
            this.g(this.a(bvs.d));
            break;
         case 52:
            this.g(this.a(bvs.c));
            break;
         case 54:
            doi.b(this);
            break;
         case 55:
            this.D();
            break;
         case 60:
            this.eW();
            break;
         case 65:
            this.g(this.a(bvs.g));
            break;
         default:
            super.b($$0);
      }
   }

   public void eW() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ae.k() * 0.02;
         double $$2 = this.ae.k() * 0.02;
         double $$3 = this.ae.k() * 0.02;
         double $$4 = 10.0;
         this.dW().a(ls.ac, this.d(1.0) - $$1 * 10.0, this.dE() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
      }
   }

   private void D() {
      cxp $$0 = this.a(bvs.b);
      this.a(bvs.b, this.a(bvs.a));
      this.a(bvs.a, $$0);
   }

   @Override
   protected void aI() {
      this.a(this.dX().o(), 4.0F);
   }

   protected void eX() {
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
   public bxk g(jq<bxj> $$0) {
      return this.eY().a($$0);
   }

   public double h(jq<bxj> $$0) {
      return this.eY().c($$0);
   }

   public double i(jq<bxj> $$0) {
      return this.eY().d($$0);
   }

   public bxl eY() {
      return this.bS;
   }

   public cxp eZ() {
      return this.a(bvs.a);
   }

   public cxp fa() {
      return this.a(bvs.b);
   }

   public cxp a(bwa $$0) {
      return this.fy() == $$0 ? this.eZ() : this.fa();
   }

   @Nonnull
   @Override
   public cxp ea() {
      return this.eZ();
   }

   public boolean b(cxl $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cxp> $$0) {
      return $$0.test(this.eZ()) || $$0.test(this.fa());
   }

   public cxp b(bti $$0) {
      if ($$0 == bti.a) {
         return this.a(bvs.a);
      } else if ($$0 == bti.b) {
         return this.a(bvs.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bti $$0, cxp $$1) {
      if ($$0 == bti.a) {
         this.a(bvs.a, $$1);
      } else {
         if ($$0 != bti.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bvs.b, $$1);
      }
   }

   public boolean d(bvs $$0) {
      return !this.a($$0).f();
   }

   public boolean e(bvs $$0) {
      return false;
   }

   public abstract Iterable<cxp> fb();

   public abstract cxp a(bvs var1);

   public abstract void a(bvs var1, cxp var2);

   public Iterable<cxp> fc() {
      return List.of();
   }

   public Iterable<cxp> fd() {
      return this.fb();
   }

   public Iterable<cxp> fe() {
      return Iterables.concat(this.fc(), this.fd());
   }

   protected void c(cxp $$0) {
      $$0.h().l($$0);
   }

   public float ff() {
      Iterable<cxp> $$0 = this.fb();
      int $$1 = 0;
      int $$2 = 0;

      for (cxp $$3 : $$0) {
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
      bxk $$1 = this.g(bxo.v);
      $$1.c(k.b());
      if ($$0) {
         $$1.b(k);
      }
   }

   protected float fg() {
      return 1.0F;
   }

   public float fh() {
      return this.e_() ? (this.ae.i() - this.ae.i()) * 0.2F + 1.5F : (this.ae.i() - this.ae.i()) * 0.2F + 1.0F;
   }

   protected boolean fi() {
      return this.eF();
   }

   @Override
   public void h(bvk $$0) {
      if (!this.fR()) {
         super.h($$0);
      }
   }

   private void c(bvk $$0) {
      fby $$1;
      if (this.dR()) {
         $$1 = this.du();
      } else if (!$$0.dR() && !this.dW().a_($$0.dw()).a(axu.aM)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dD(), $$0.dD());
         $$1 = new fby(this.dB(), $$2, this.dH());
         boolean $$4 = this.dr() <= 4.0F && this.ds() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.ds() / 2.0;
            fby $$6 = $$1.b(0.0, $$5, 0.0);
            fcs $$7 = fcp.a(fbt.a($$6, (double)this.dr(), (double)this.ds(), (double)this.dr()));
            $$1 = this.dW().a(this, $$7, $$6, (double)this.dr(), (double)this.ds(), (double)this.dr()).map($$1x -> $$1x.b(0.0, -$$5, 0.0)).orElse($$1);
         }
      }

      this.a($$1.d, $$1.e, $$1.f);
   }

   @Override
   public boolean cM() {
      return this.cL();
   }

   protected float fj() {
      return this.A(1.0F);
   }

   protected float A(float $$0) {
      return (float)this.h(bxo.o) * $$0 * this.aS() + this.fk();
   }

   public float fk() {
      return this.b(bur.h) ? 0.1F * ((float)this.c(bur.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void s() {
      float $$0 = this.fj();
      if (!($$0 <= 1.0E-5F)) {
         fby $$1 = this.dz();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.cj()) {
            float $$2 = this.dM() * (float) (Math.PI / 180.0);
            this.i(new fby((double)(-bae.a($$2)) * 0.2, 0.0, (double)bae.b($$2) * 0.2));
         }

         this.ar = true;
      }
   }

   protected void fl() {
      this.h(this.dz().b(0.0, -0.04F, 0.0));
   }

   protected void c(ayk<etw> $$0) {
      this.h(this.dz().b(0.0, 0.04F, 0.0));
   }

   protected float fm() {
      return 0.8F;
   }

   public boolean a(etx $$0) {
      return false;
   }

   @Override
   protected double bd() {
      return this.h(bxo.n);
   }

   protected double fn() {
      boolean $$0 = this.dz().e <= 0.0;
      return $$0 && this.b(bur.B) ? Math.min(this.be(), 0.01) : this.be();
   }

   public void a_(fby $$0) {
      if (this.di()) {
         etx $$1 = this.dW().b_(this.dw());
         if ((this.bj() || this.bx()) && this.el() && !this.a($$1)) {
            this.l($$0);
         } else if (this.fJ()) {
            this.E();
         } else {
            this.k($$0);
         }
      }
   }

   private void k(fby $$0) {
      jh $$1 = this.aQ();
      float $$2 = this.aJ() ? this.dW().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      fby $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      bup $$6 = this.c(bur.y);
      if ($$6 != null) {
         $$5 += (0.05 * (double)($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.dW().C || this.dW().B($$1)) {
         $$5 -= this.fn();
      } else if (this.dD() > (double)this.dW().L_()) {
         $$5 = -0.1;
      } else {
         $$5 = 0.0;
      }

      if (this.ev()) {
         this.n($$4.d, $$5, $$4.f);
      } else {
         float $$7 = this instanceof cig ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void l(fby $$0) {
      boolean $$1 = this.dz().e <= 0.0;
      double $$2 = this.dD();
      double $$3 = this.fn();
      if (this.bj()) {
         float $$4 = this.cj() ? 0.9F : this.fm();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bxo.F);
         if (!this.aJ()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fp() - $$5) * $$6;
         }

         if (this.b(bur.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bwk.a, this.dz());
         fby $$7 = this.dz();
         if (this.P && this.q_()) {
            $$7 = new fby($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.h(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bwk.a, this.dz());
         if (this.b(aya.b) <= this.dq()) {
            this.h(this.dz().d(0.5, 0.8F, 0.5));
            fby $$8 = this.a($$3, $$1, this.dz());
            this.h($$8);
         } else {
            this.h(this.dz().c(0.5));
         }

         if ($$3 != 0.0) {
            this.h(this.dz().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      fby $$9 = this.dz();
      if (this.P && this.g($$9.d, $$9.e + 0.6F - this.dD() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void E() {
      fby $$0 = this.dz();
      double $$1 = $$0.i();
      this.h(this.m($$0));
      this.a(bwk.a, this.dz());
      if (!this.dW().C) {
         double $$2 = this.dz().i();
         this.c($$1, $$2);
      }
   }

   private fby m(fby $$0) {
      fby $$1 = this.bT();
      float $$2 = this.dO() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fn();
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
            this.a(this.dX().n(), $$3);
         }
      }
   }

   private void c(cpx $$0, fby $$1) {
      fby $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.di()) {
         this.C(this.e($$0));
         this.a_($$2);
      } else {
         this.h(fby.c);
      }
   }

   protected void a(cpx $$0, fby $$1) {
   }

   protected fby b(cpx $$0, fby $$1) {
      return $$1;
   }

   protected float e(cpx $$0) {
      return this.fp();
   }

   public void s(boolean $$0) {
      float $$1 = (float)bae.g(this.dB() - this.K, $$0 ? this.dD() - this.L : 0.0, this.dH() - this.M);
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

   private fby a(fby $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.h(this.n(this.dz()));
      this.a(bwk.a, this.dz());
      fby $$2 = this.dz();
      if ((this.P || this.bn) && (this.q_() || this.dx().a(dko.rk) && dqj.a(this))) {
         $$2 = new fby($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public fby a(double $$0, boolean $$1, fby $$2) {
      if ($$0 != 0.0 && !this.cj()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new fby($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private fby n(fby $$0) {
      if (this.q_()) {
         this.k();
         float $$1 = 0.15F;
         double $$2 = bae.a($$0.d, -0.15F, 0.15F);
         double $$3 = bae.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dx().a(dko.on) && this.fI() && this instanceof cpx) {
            $$4 = 0.0;
         }

         $$0 = new fby($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aJ() ? this.fp() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fo();
   }

   protected float fo() {
      return this.cX() instanceof cpx ? this.fp() * 0.1F : 0.02F;
   }

   public float fp() {
      return this.ce;
   }

   public void C(float $$0) {
      this.ce = $$0;
   }

   public boolean c(ash $$0, bvk $$1) {
      this.B($$1);
      return false;
   }

   @Override
   public void h() {
      super.h();
      this.H();
      this.I();
      if (!this.dW().C) {
         int $$0 = this.eU();
         if ($$0 > 0) {
            if (this.aL <= 0) {
               this.aL = 20 * (30 - $$0);
            }

            this.aL--;
            if (this.aL <= 0) {
               this.o($$0 - 1);
            }
         }

         int $$1 = this.eV();
         if ($$1 > 0) {
            if (this.aM <= 0) {
               this.aM = 20 * (30 - $$1);
            }

            this.aM--;
            if (this.aM <= 0) {
               this.p($$1 - 1);
            }
         }

         this.F();
         if (this.af % 20 == 0) {
            this.eQ().c();
         }

         if (this.fR() && !this.J()) {
            this.fS();
         }
      }

      if (!this.dR()) {
         this.d_();
      }

      double $$2 = this.dB() - this.K;
      double $$3 = this.dH() - this.M;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aX;
      float $$6 = 0.0F;
      this.bg = this.bh;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)bae.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = bae.e(bae.h(this.dM()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aR > 0.0F) {
         $$5 = this.dM();
      }

      if (!this.aJ()) {
         $$7 = 0.0F;
      }

      this.bh = this.bh + ($$7 - this.bh) * 0.3F;
      bpt $$10 = bps.a();
      $$10.a("headTurn");
      $$6 = this.g($$5, $$6);
      $$10.c();
      $$10.a("rangeChecks");

      while (this.dM() - this.N < -180.0F) {
         this.N -= 360.0F;
      }

      while (this.dM() - this.N >= 180.0F) {
         this.N += 360.0F;
      }

      while (this.aX - this.aY < -180.0F) {
         this.aY -= 360.0F;
      }

      while (this.aX - this.aY >= 180.0F) {
         this.aY += 360.0F;
      }

      while (this.dO() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dO() - this.O >= 180.0F) {
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
      if (this.fJ()) {
         this.bB++;
      } else {
         this.bB = 0;
      }

      if (this.fR()) {
         this.w(0.0F);
      }

      this.B();
      float $$11 = this.ek();
      if ($$11 != this.bG) {
         this.bG = $$11;
         this.m_();
      }

      this.bb.a();
   }

   private void F() {
      Map<bvs, cxp> $$0 = this.G();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bvs, cxp> G() {
      Map<bvs, cxp> $$0 = null;

      for (bvs $$1 : bvs.i) {
         cxp $$2 = switch ($$1.a()) {
            case a -> this.h($$1);
            case b -> this.g($$1);
            case c -> this.bX;
         };
         cxp $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bvs.class);
            }

            $$0.put($$1, $$3);
            bxl $$4 = this.eY();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<bvs, cxp> $$5 : $$0.entrySet()) {
            bvs $$6 = $$5.getKey();
            cxp $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1) -> {
                  bxk $$2 = this.bS.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1.b());
                     $$2.b($$1);
                  }
               });
               if (this.dW() instanceof ash $$8) {
                  deb.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(cxp $$0, cxp $$1) {
      return !cxp.a($$1, $$0);
   }

   private void a(Map<bvs, cxp> $$0) {
      cxp $$1 = $$0.get(bvs.a);
      cxp $$2 = $$0.get(bvs.b);
      if ($$1 != null && $$2 != null && cxp.a($$1, this.h(bvs.b)) && cxp.a($$2, this.h(bvs.a))) {
         ((ash)this.dW()).m().b(this, new adv(this, (byte)55));
         $$0.remove(bvs.a);
         $$0.remove(bvs.b);
         this.c(bvs.a, $$1.v());
         this.c(bvs.b, $$2.v());
      }
   }

   private void b(Map<bvs, cxp> $$0) {
      List<Pair<bvs, cxp>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cxp $$3 = $$2.v();
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
      ((ash)this.dW()).m().b(this, new age(this.ar(), $$1));
   }

   private cxp g(bvs $$0) {
      return this.bW.get($$0.b());
   }

   private void b(bvs $$0, cxp $$1) {
      this.bW.set($$0.b(), $$1);
   }

   private cxp h(bvs $$0) {
      return this.bV.get($$0.b());
   }

   private void c(bvs $$0, cxp $$1) {
      this.bV.set($$0.b(), $$1);
   }

   protected float g(float $$0, float $$1) {
      float $$2 = bae.h($$0 - this.aX);
      this.aX += $$2 * 0.3F;
      float $$3 = bae.h(this.dM() - this.aX);
      float $$4 = this.fq();
      if (Math.abs($$3) > $$4) {
         this.aX = this.aX + ($$3 - (float)bae.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fq() {
      return 50.0F;
   }

   public void d_() {
      if (this.cf > 0) {
         this.cf--;
      }

      if (this.br > 0) {
         this.a(this.br, this.bs, this.bt, this.bu, this.bv, this.bw);
         this.br--;
      } else if (!this.dk()) {
         this.h(this.dz().c(0.98));
      }

      if (this.by > 0) {
         this.a(this.by, this.bx);
         this.by--;
      }

      fby $$0 = this.dz();
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
      bpt $$4 = bps.a();
      $$4.a("ai");
      if (this.fi()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      } else if (this.dk()) {
         $$4.a("newAi");
         this.fu();
         $$4.c();
      }

      $$4.c();
      $$4.a("jump");
      if (this.bn && this.el()) {
         double $$5;
         if (this.bx()) {
            $$5 = this.b(aya.b);
         } else {
            $$5 = this.b(aya.a);
         }

         boolean $$7 = this.bj() && $$5 > 0.0;
         double $$8 = this.dq();
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
      if (this.fJ()) {
         this.fs();
      }

      fbt $$9 = this.cR();
      fby $$10 = new fby((double)this.bo, (double)this.bp, (double)this.bq);
      if (this.b(bur.B) || this.b(bur.y)) {
         this.k();
      }

      label112: {
         if (this.cX() instanceof cpx $$11 && this.bL()) {
            this.c($$11, $$10);
            break label112;
         }

         this.a_($$10);
      }

      if (!this.dW().B_() || this.di()) {
         this.aK();
      }

      this.s(this instanceof cig);
      $$4.c();
      $$4.a("freezing");
      if (!this.dW().C && !this.eF()) {
         int $$12 = this.cu();
         if (this.av && this.dK()) {
            this.k(Math.min(this.cx(), $$12 + 1));
         } else {
            this.k(Math.max(0, $$12 - 2));
         }
      }

      this.eh();
      this.ei();
      if (this.dW() instanceof ash $$13 && this.af % 40 == 0 && this.cw() && this.dK()) {
         this.a($$13, this.dX().v(), 1.0F);
      }

      $$4.c();
      $$4.a("push");
      if (this.bC > 0) {
         this.bC--;
         this.a($$9, this.cR());
      }

      this.o();
      $$4.c();
      if (this.dW() instanceof ash $$14 && this.fr() && this.bl()) {
         this.a($$14, this.dX().i(), 1.0F);
      }
   }

   public boolean fr() {
      return false;
   }

   protected void fs() {
      this.cy();
      if (!this.dW().C) {
         if (!this.ft()) {
            this.b(7, false);
            return;
         }

         int $$0 = this.bB + 1;
         if ($$0 % 10 == 0) {
            int $$1 = $$0 / 10;
            if ($$1 % 2 == 0) {
               List<bvs> $$2 = bvs.i.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               bvs $$3 = ae.a($$2, this.ae);
               this.a($$3).a(1, this, $$3);
            }

            this.a(ecr.n);
         }
      }
   }

   protected boolean ft() {
      if (!this.aJ() && !this.bZ() && !this.b(bur.y)) {
         for (bvs $$0 : bvs.i) {
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

   protected void o() {
      if (!(this.dW() instanceof ash $$0)) {
         this.dW().a(ecf.a(cpx.class), this.cR(), bvp.a(this)).forEach(this::D);
      } else {
         List<bvk> $$2 = this.dW().a(this, this.cR(), bvp.a(this));
         if (!$$2.isEmpty()) {
            int $$3 = $$0.N().c(dhe.v);
            if ($$3 > 0 && $$2.size() > $$3 - 1 && this.ae.a(4) == 0) {
               int $$4 = 0;

               for (bvk $$5 : $$2) {
                  if (!$$5.bZ()) {
                     $$4++;
                  }
               }

               if ($$4 > $$3 - 1) {
                  this.a($$0, this.dX().h(), 6.0F);
               }
            }

            for (bvk $$6 : $$2) {
               this.D($$6);
            }
         }
      }
   }

   protected void a(fbt $$0, fbt $$1) {
      fbt $$2 = $$0.b($$1);
      List<bvk> $$3 = this.dW().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bvk $$4 : $$3) {
            if ($$4 instanceof bwg) {
               this.g((bwg)$$4);
               this.bC = 0;
               this.h(this.dz().c(-0.2));
               break;
            }
         }
      } else if (this.P) {
         this.bC = 0;
      }

      if (!this.dW().C && this.bC <= 0) {
         this.c(4, false);
         this.bD = 0.0F;
         this.bE = null;
      }
   }

   protected void D(bvk $$0) {
      $$0.h(this);
   }

   protected void g(bwg $$0) {
   }

   public boolean fv() {
      return (this.al.a(aC) & 4) != 0;
   }

   @Override
   public void ae() {
      bvk $$0 = this.dl();
      super.ae();
      if ($$0 != null && $$0 != this.dl() && !this.dW().C) {
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
      return this.br > 0 ? this.bs : this.dB();
   }

   @Override
   public double S_() {
      return this.br > 0 ? this.bt : this.dD();
   }

   @Override
   public double g_() {
      return this.br > 0 ? this.bu : this.dH();
   }

   @Override
   public float r_() {
      return this.br > 0 ? (float)this.bw : this.dO();
   }

   @Override
   public float h_() {
      return this.br > 0 ? (float)this.bv : this.dM();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bx = (double)$$0;
      this.by = $$1;
   }

   public void t(boolean $$0) {
      this.bn = $$0;
   }

   public void a(cmb $$0) {
      bvk $$1 = $$0.p();
      if ($$1 instanceof asi) {
         ao.R.a((asi)$$1, $$0.l(), this);
      }
   }

   public void a(bvk $$0, int $$1) {
      if (!$$0.dR() && !this.dW().C && ($$0 instanceof cmb || $$0 instanceof cqe || $$0 instanceof bvw)) {
         ((ash)this.dW()).m().b($$0, new agz($$0.ar(), this.ar(), $$1));
      }
   }

   public boolean E(bvk $$0) {
      return this.a($$0, dgq.a.a, dgq.b.a, $$0::dF);
   }

   public boolean a(bvk $$0, dgq.a $$1, dgq.b $$2, DoubleSupplier $$3) {
      if ($$0.dW() != this.dW()) {
         return false;
      } else {
         fby $$4 = new fby(this.dB(), this.dF(), this.dH());
         fby $$5 = new fby($$0.dB(), $$3.getAsDouble(), $$0.dH());
         return $$5.f($$4) > 128.0 ? false : this.dW().a(new dgq($$4, $$5, $$1, $$2, this)).d() == fbw.a.a;
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
      return !this.dR();
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
   public fby a(jm.a $$0, l.a $$1) {
      return j(super.a($$0, $$1));
   }

   public static fby j(fby $$0) {
      return new fby($$0.d, $$0.e, 0.0);
   }

   public float fw() {
      return this.cg;
   }

   public final void E(float $$0) {
      this.F(bae.a($$0, 0.0F, this.eT()));
   }

   protected void F(float $$0) {
      this.cg = $$0;
   }

   public void i_() {
   }

   public void j_() {
   }

   protected void fx() {
      this.bZ = true;
   }

   public abstract bwa fy();

   public boolean fz() {
      return (this.al.a(aC) & 1) > 0;
   }

   public bti fA() {
      return (this.al.a(aC) & 2) > 0 ? bti.b : bti.a;
   }

   private void H() {
      if (this.fz()) {
         if (cxp.b(this.b(this.fA()), this.bz)) {
            this.bz = this.b(this.fA());
            this.a(this.bz);
         } else {
            this.fF();
         }
      }
   }

   protected void a(cxp $$0) {
      $$0.b(this.dW(), this, this.fC());
      if (--this.bA == 0 && !this.dW().C && !$$0.x()) {
         this.w();
      }
   }

   private void I() {
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

   public void c(bti $$0) {
      cxp $$1 = this.b($$0);
      if (!$$1.f() && !this.fz()) {
         this.bz = $$1;
         this.bA = $$1.a(this);
         if (!this.dW().C) {
            this.c(1, true);
            this.c(2, $$0 == bti.b);
            this.a(ecr.D);
         }
      }
   }

   @Override
   public void a(alc<?> $$0) {
      super.a($$0);
      if (bQ.equals($$0)) {
         if (this.dW().C) {
            this.fP().ifPresent(this::a);
         }
      } else if (aC.equals($$0) && this.dW().C) {
         if (this.fz() && this.bz.f()) {
            this.bz = this.b(this.fA());
            if (!this.bz.f()) {
               this.bA = this.bz.a(this);
            }
         } else if (!this.fz() && !this.bz.f()) {
            this.bz = cxp.j;
            this.bA = 0;
         }
      }
   }

   @Override
   public void a(fi.a $$0, fby $$1) {
      super.a($$0, $$1);
      this.ba = this.aZ;
      this.aX = this.aZ;
      this.aY = this.aX;
   }

   @Override
   public float t(float $$0) {
      return bae.h($$0, this.aY, this.aX);
   }

   public void b(cxp $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         fby $$3 = new fby(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dO() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dM() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ae.i()) * 0.6 - 0.3;
         fby $$5 = new fby(((double)this.ae.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dO() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dM() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dB(), this.dF(), this.dH());
         this.dW().a(new lo(ls.S, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void w() {
      if (!this.dW().C || this.fz()) {
         bti $$0 = this.fA();
         if (!this.bz.equals(this.b($$0))) {
            this.fE();
         } else {
            if (!this.bz.f() && this.fz()) {
               cxp $$1 = this.bz.a(this.dW(), this);
               if ($$1 != this.bz) {
                  this.a($$0, $$1);
               }

               this.fF();
            }
         }
      }
   }

   public void b(cxp $$0) {
   }

   public cxp fB() {
      return this.bz;
   }

   public int fC() {
      return this.bA;
   }

   public int fD() {
      return this.fz() ? this.bz.a(this) - this.fC() : 0;
   }

   public void fE() {
      if (!this.bz.f()) {
         this.bz.a(this.dW(), this, this.fC());
         if (this.bz.x()) {
            this.H();
         }
      }

      this.fF();
   }

   public void fF() {
      if (!this.dW().C) {
         boolean $$0 = this.fz();
         this.c(1, false);
         if ($$0) {
            this.a(ecr.C);
         }
      }

      this.bz = cxp.j;
      this.bA = 0;
   }

   public boolean fG() {
      return this.fH() != null;
   }

   @Nullable
   public cxp fH() {
      if (this.fz() && !this.bz.f()) {
         cxl $$0 = this.bz.h();
         if ($$0.b(this.bz) != cxr.d) {
            return null;
         } else {
            return $$0.a(this.bz, this) - this.bA < 5 ? null : this.bz;
         }
      } else {
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
      return super.cl() || !this.fJ() && this.c(bws.b);
   }

   public int fK() {
      return this.bB;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dB();
      double $$5 = this.dD();
      double $$6 = this.dH();
      double $$7 = $$1;
      boolean $$8 = false;
      jh $$9 = jh.a($$0, $$1, $$2);
      dhi $$10 = this.dW();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.L_()) {
            jh $$12 = $$9.e();
            dxv $$13 = $$10.a_($$12);
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

         if (this instanceof bwo $$14) {
            $$14.L().o();
         }

         return true;
      }
   }

   public boolean fL() {
      return !this.eF();
   }

   public boolean fM() {
      return true;
   }

   public void a(jh $$0, boolean $$1) {
   }

   public boolean fN() {
      return false;
   }

   @Override
   public final bvn a(bws $$0) {
      return $$0 == bws.c ? aD : this.e($$0).a(this.ek());
   }

   protected bvn e(bws $$0) {
      return this.aq().n().a(this.ej());
   }

   public ImmutableList<bws> fO() {
      return ImmutableList.of(bws.a);
   }

   public fbt f(bws $$0) {
      bvn $$1 = this.a($$0);
      return new fbt((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bws $$0) {
      fbt $$1 = this.a($$0).a(this.du());
      return this.dW().b(this, $$1);
   }

   @Override
   public boolean o(boolean $$0) {
      return super.o($$0) && !this.fR();
   }

   public Optional<jh> fP() {
      return this.al.a(bQ);
   }

   public void g(jh $$0) {
      this.al.a(bQ, Optional.of($$0));
   }

   public void fQ() {
      this.al.a(bQ, Optional.empty());
   }

   public boolean fR() {
      return this.fP().isPresent();
   }

   public void b(jh $$0) {
      if (this.bZ()) {
         this.ae();
      }

      dxv $$1 = this.dW().a_($$0);
      if ($$1.b() instanceof dkf) {
         this.dW().a($$0, $$1.b(dkf.c, Boolean.valueOf(true)), 3);
      }

      this.b(bws.c);
      this.a($$0);
      this.g($$0);
      this.h(fby.c);
      this.ar = true;
   }

   private void a(jh $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean J() {
      return this.fP().map($$0 -> this.dW().a_($$0).b() instanceof dkf).orElse(false);
   }

   public void fS() {
      this.fP().filter(this.dW()::B).ifPresent($$0x -> {
         dxv $$1 = this.dW().a_($$0x);
         if ($$1.b() instanceof dkf) {
            jm $$2 = $$1.c(dkf.aF);
            this.dW().a($$0x, $$1.b(dkf.c, Boolean.valueOf(false)), 3);
            fby $$3 = dkf.a(this.aq(), this.dW(), $$0x, $$2, this.dM()).orElseGet(() -> {
               jh $$1x = $$0x.d();
               return new fby((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            fby $$4 = fby.c($$0x).d($$3).d();
            float $$5 = (float)bae.d(bae.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.v($$5);
            this.w(0.0F);
         }
      });
      fby $$0 = this.du();
      this.b(bws.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fQ();
   }

   @Nullable
   public jm fT() {
      jh $$0 = this.fP().orElse(null);
      return $$0 != null ? dkf.a(this.dW(), $$0) : null;
   }

   @Override
   public boolean bM() {
      return !this.fR() && super.bM();
   }

   public cxp d(cxp $$0) {
      return cxp.j;
   }

   private static byte i(bvs $$0) {
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

   public void a(cxl $$0, bvs $$1) {
      this.dW().a(this, i($$1));
      this.a(this.a($$1), $$1, this.bS);
   }

   private void a(cxp $$0, bvs $$1, bxl $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         bxk $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      deb.a($$0, this, $$1);
   }

   public static bvs d(bti $$0) {
      return $$0 == bti.a ? bvs.a : bvs.b;
   }

   public final boolean e(cxp $$0) {
      if (this.bL() && !this.aa_()) {
         dfu $$1 = $$0.a(ku.D);
         if ($$1 != null && $$1.f()) {
            bvs $$2 = $$1.a();
            return this.e($$2) && $$1.a(this.aq()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(bvs $$0) {
      return true;
   }

   public final bvs f(cxp $$0) {
      dfu $$1 = $$0.a(ku.D);
      return $$1 != null && this.e($$1.a()) ? $$1.a() : bvs.a;
   }

   public final boolean a(cxp $$0, bvs $$1) {
      dfu $$2 = $$0.a(ku.D);
      return $$2 == null ? $$1 == bvs.a && this.e(bvs.a) : $$1 == $$2.a() && this.e($$2.a()) && $$2.a(this.aq());
   }

   private static bwy a(bwg $$0, bvs $$1) {
      return $$1 != bvs.f && $$1 != bvs.a && $$1 != bvs.b ? bwy.a($$0, $$1, $$2 -> $$2.f() || $$0.f($$2) == $$1) : bwy.a($$0, $$1);
   }

   @Nullable
   private static bvs r(int $$0) {
      if ($$0 == 100 + bvs.f.b()) {
         return bvs.f;
      } else if ($$0 == 100 + bvs.e.b()) {
         return bvs.e;
      } else if ($$0 == 100 + bvs.d.b()) {
         return bvs.d;
      } else if ($$0 == 100 + bvs.c.b()) {
         return bvs.c;
      } else if ($$0 == 98) {
         return bvs.a;
      } else if ($$0 == 99) {
         return bvs.b;
      } else {
         return $$0 == 105 ? bvs.g : null;
      }
   }

   @Override
   public bwy a_(int $$0) {
      bvs $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dK() {
      if (this.aa_()) {
         return false;
      } else {
         boolean $$0 = !this.a(bvs.f).a(ayd.bs) && !this.a(bvs.e).a(ayd.bs) && !this.a(bvs.d).a(ayd.bs) && !this.a(bvs.c).a(ayd.bs) && !this.a(bvs.g).a(ayd.bs);
         return $$0 && super.dK();
      }
   }

   @Override
   public boolean co() {
      return !this.dW().B_() && this.b(bur.x) || super.co();
   }

   @Override
   public float dN() {
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

   public boolean fU() {
      return this.ea().h() instanceof cvr;
   }

   @Override
   public float dQ() {
      float $$0 = (float)this.h(bxo.B);
      return this.cX() instanceof cpx ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public fby m(bvk $$0) {
      return this.du().e(this.a($$0, this.a(this.aw()), this.ek() * this.ej()));
   }

   protected void a(int $$0, double $$1) {
      this.aZ = (float)bae.e(1.0 / (double)$$0, (double)this.aZ, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(bae.c((double)$$0 * this.h(bxo.h)));
   }

   public boolean fV() {
      return false;
   }

   public boolean a(ash $$0, bua $$1) {
      return this.d($$1) || deb.a($$0, this, $$1);
   }

   public static boolean b(cxp $$0, bvs $$1) {
      if (!$$0.b(ku.F)) {
         return false;
      } else {
         dfu $$2 = $$0.a(ku.D);
         return $$2 != null && $$1 == $$2.a() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fW() {
      return this.bd;
   }

   public static record a(axe a, axe b) {
   }
}

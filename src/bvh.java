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
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class bvh extends bul implements buf {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "active_effects";
   private static final akv c = akv.b("powder_snow");
   private static final akv d = akv.b("sprinting");
   private static final bwn k = new bwn(d, 0.3F, bwn.a.c);
   public static final int l = 2;
   public static final int m = 4;
   public static final int n = 98;
   public static final int o = 100;
   public static final int p = 105;
   public static final int q = 6;
   public static final int r = 100;
   private static final int bG = 40;
   public static final double s = 0.003;
   public static final double t = 0.08;
   public static final int u = 20;
   private static final int bH = 10;
   private static final int bI = 2;
   public static final float ay = 0.42F;
   private static final double bJ = 128.0;
   protected static final int az = 1;
   protected static final int aA = 2;
   protected static final int aB = 4;
   protected static final ajy<Byte> aC = akc.a(bvh.class, aka.a);
   private static final ajy<Float> bK = akc.a(bvh.class, aka.d);
   private static final ajy<List<lr>> bL = akc.a(bvh.class, aka.m);
   private static final ajy<Boolean> bM = akc.a(bvh.class, aka.k);
   private static final ajy<Integer> bN = akc.a(bvh.class, aka.b);
   private static final ajy<Integer> bO = akc.a(bvh.class, aka.b);
   private static final ajy<Optional<ji>> bP = akc.a(bvh.class, aka.p);
   private static final int bQ = 15;
   protected static final buo aD = buo.c(0.2F, 0.2F).b(0.2F);
   public static final float aE = 0.5F;
   public static final float aF = 0.5F;
   public static final String aG = "attributes";
   public static final Predicate<bvh> aH = $$0 -> {
      if ($$0 instanceof cox $$1) {
         cwp $$3 = $$1.a(but.f);
         return !$$3.a(awy.cq);
      } else {
         return true;
      }
   };
   private final bwm bR;
   private final bsy bS = new bsy(this);
   private final Map<jr<bto>, btq> bT = Maps.newHashMap();
   private final ka<cwp> bU = ka.a(2, cwp.j);
   private final ka<cwp> bV = ka.a(4, cwp.j);
   private cwp bW = cwp.j;
   public boolean aI;
   private boolean bX = false;
   public bsj aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final bwi aT = new bwi();
   public final int aU = 20;
   public final float aV;
   public final float aW;
   public float aX;
   public float aY;
   public float aZ;
   public float ba;
   public final buk bb = new buk(this);
   @Nullable
   protected cox bc;
   protected int bd;
   protected boolean be;
   protected int bf;
   protected float bg;
   protected float bh;
   protected float bi;
   protected float bj;
   protected float bk;
   protected float bl;
   protected boolean bm;
   public float bn;
   public float bo;
   public float bp;
   protected int bq;
   protected double br;
   protected double bs;
   protected double bt;
   protected double bu;
   protected double bv;
   protected double bw;
   protected int bx;
   private boolean bY = true;
   @Nullable
   private bvh bZ;
   private int ca;
   @Nullable
   private bvh cb;
   private int cc;
   private float cd;
   private int ce;
   private float cf;
   protected cwp by = cwp.j;
   protected int bz;
   protected int bA;
   private ji cg;
   private Optional<ji> ch = Optional.empty();
   @Nullable
   private btb ci;
   private long cj;
   protected int bB;
   protected float bC;
   @Nullable
   protected cwp bD;
   private float ck;
   private float cl;
   protected bwj<?> bE;
   private boolean cm;
   private final EnumMap<but, Reference2ObjectMap<dcz, Set<ddr>>> cn = new EnumMap<>(but.class);
   protected float bF = 1.0F;

   protected bvh(bus<? extends bvh> $$0, dgi $$1) {
      super($$0, $$1);
      this.bR = new bwm(bwq.a($$0));
      this.x(this.eS());
      this.I = true;
      this.aW = (float)((Math.random() + 1.0) * 0.01F);
      this.ay();
      this.aV = (float)Math.random() * 12398.0F;
      this.v((float)(Math.random() * (float) (Math.PI * 2)));
      this.aZ = this.dL();
      ue $$2 = ue.a;
      this.bE = this.a(new Dynamic($$2, (un)$$2.createMap(ImmutableMap.of($$2.a("memories"), (un)$$2.emptyMap()))));
   }

   public bwj<?> eb() {
      return this.bE;
   }

   protected bwj.b<?> ec() {
      return bwj.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bwj<?> a(Dynamic<?> $$0) {
      return this.ec().a($$0);
   }

   @Override
   public void c(ard $$0) {
      this.a($$0, this.dW().y(), Float.MAX_VALUE);
   }

   public boolean a(bus<?> $$0) {
      return true;
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(aC, (byte)0);
      $$0.a(bL, List.of());
      $$0.a(bM, false);
      $$0.a(bN, 0);
      $$0.a(bO, 0);
      $$0.a(bK, 1.0F);
      $$0.a(bP, Optional.empty());
   }

   public static bwo.a ed() {
      return bwo.a()
         .a(bwp.s)
         .a(bwp.p)
         .a(bwp.v)
         .a(bwp.a)
         .a(bwp.b)
         .a(bwp.r)
         .a(bwp.B)
         .a(bwp.y)
         .a(bwp.n)
         .a(bwp.x)
         .a(bwp.k)
         .a(bwp.o)
         .a(bwp.w)
         .a(bwp.h)
         .a(bwp.i)
         .a(bwp.F)
         .a(bwp.u)
         .a(bwp.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dwx $$2, ji $$3) {
      if (!this.bj()) {
         this.br();
      }

      if (this.dV() instanceof ard $$4 && $$1 && this.Z > 0.0F) {
         this.b($$4, $$3);
         double $$5 = this.h(bwp.x);
         if ((double)this.Z > $$5 && !$$2.l()) {
            double $$6 = this.dA();
            double $$7 = this.dC();
            double $$8 = this.dG();
            ji $$9 = this.dv();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            float $$13 = (float)ayz.c((double)this.Z - $$5);
            double $$14 = Math.min((double)(0.2F + $$13 / 15.0F), 2.5);
            int $$15 = (int)(150.0 * $$14);
            $$4.a(new ll(lt.b, $$2), $$6, $$7, $$8, $$15, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.ch = Optional.empty();
      }
   }

   public final boolean ee() {
      return this.aq().a(awt.m);
   }

   public float a(float $$0) {
      return ayz.h($$0, this.cl, this.ck);
   }

   public boolean ef() {
      return this.dy().b() < 1.0E-5F && this.bn();
   }

   @Override
   public void az() {
      this.aQ = this.aR;
      if (this.ak) {
         this.fP().ifPresent(this::a);
      }

      if (this.dV() instanceof ard $$0) {
         ddb.b($$0, this);
      }

      super.az();
      bot $$1 = bos.a();
      $$1.a("livingEntityBaseTick");
      if (this.bi() || this.dV().C) {
         this.aH();
      }

      if (this.bL()) {
         boolean $$2 = this instanceof cox;
         if (this.dV() instanceof ard $$3) {
            if (this.bM()) {
               this.a($$3, this.dW().g(), 1.0F);
            } else if ($$2 && !this.dV().F_().a(this.cR())) {
               double $$4 = this.dV().F_().a(this) + this.dV().F_().n();
               if ($$4 < 0.0) {
                  double $$5 = this.dV().F_().o();
                  if ($$5 > 0.0) {
                     this.a($$3, this.dW().x(), (float)Math.max(1, ayz.a(-$$4 * $$5)));
                  }
               }
            }
         }

         if (this.a(awv.a) && !this.dV().a_(ji.a(this.dA(), this.dE(), this.dG())).a(djo.nF)) {
            boolean $$6 = !this.ee() && !btr.c(this) && (!$$2 || !((cox)this).gj().a);
            if ($$6) {
               this.j(this.l(this.ct()));
               if (this.ct() == -20) {
                  this.j(0);
                  fba $$7 = this.dy();

                  for (int $$8 = 0; $$8 < 8; $$8++) {
                     double $$9 = this.ae.j() - this.ae.j();
                     double $$10 = this.ae.j() - this.ae.j();
                     double $$11 = this.ae.j() - this.ae.j();
                     this.dV().a(lt.d, this.dA() + $$9, this.dC() + $$10, this.dG() + $$11, $$7.d, $$7.e, $$7.f);
                  }

                  this.a(this.dW().i(), 2.0F);
               }
            } else if (this.ct() < this.cs()) {
               this.j(this.m(this.ct()));
            }

            if (!this.dV().C && this.bZ() && this.dk() != null && this.dk().cb()) {
               this.ae();
            }
         } else if (this.ct() < this.cs()) {
            this.j(this.m(this.ct()));
         }

         if (this.dV() instanceof ard $$12) {
            ji $$13 = this.dv();
            if (!Objects.equal(this.cg, $$13)) {
               this.cg = $$13;
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

      if (this.aj > 0 && !(this instanceof are)) {
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

      if (this.cb != null && !this.cb.bL()) {
         this.cb = null;
      }

      if (this.bZ != null) {
         if (!this.bZ.bL()) {
            this.a(null);
         } else if (this.af - this.ca > 100) {
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
      return ayz.h((float)this.h(bwp.u), super.aT(), 1.0F);
   }

   protected void eg() {
      bwl $$0 = this.g(bwp.v);
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
            bwl $$1 = this.g(bwp.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cv();
            $$1.b(new bwn(c, (double)$$2, bwn.a.a));
         }
      }
   }

   protected void b(ard $$0, ji $$1) {
      ddb.a($$0, this);
   }

   public boolean e_() {
      return false;
   }

   public float ei() {
      return this.e_() ? 0.5F : 1.0F;
   }

   public final float ej() {
      bwm $$0 = this.eY();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bwp.y));
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
         this.a(bul.d.a);
      }
   }

   public boolean em() {
      return !this.e_();
   }

   protected boolean en() {
      return !this.e_();
   }

   protected int l(int $$0) {
      bwl $$1 = this.g(bwp.w);
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

   public final int a(ard $$0, @Nullable bul $$1) {
      return ddb.a($$0, $$1, this, this.e($$0));
   }

   protected int e(ard $$0) {
      return 0;
   }

   protected boolean eo() {
      return false;
   }

   @Nullable
   public bvh ep() {
      return this.bZ;
   }

   @Override
   public bvh am() {
      return this.ep();
   }

   public int eq() {
      return this.ca;
   }

   public void c(@Nullable cox $$0) {
      this.bc = $$0;
      this.bd = this.af;
   }

   public void a(@Nullable bvh $$0) {
      this.bZ = $$0;
      this.ca = this.af;
   }

   @Nullable
   public bvh er() {
      return this.cb;
   }

   public int es() {
      return this.cc;
   }

   public void B(bul $$0) {
      if ($$0 instanceof bvh) {
         this.cb = (bvh)$$0;
      } else {
         this.cb = null;
      }

      this.cc = this.af;
   }

   public int et() {
      return this.bf;
   }

   public void n(int $$0) {
      this.bf = $$0;
   }

   public boolean eu() {
      return this.bX;
   }

   public void r(boolean $$0) {
      this.bX = $$0;
   }

   protected boolean b(but $$0) {
      return true;
   }

   public void a(but $$0, cwp $$1, cwp $$2) {
      if (!this.dV().B_() && !this.Z_()) {
         boolean $$3 = $$2.f() && $$1.f();
         if (!$$3 && !cwp.c($$1, $$2) && !this.ak) {
            deu $$4 = $$2.a(kv.D);
            if (!this.bb() && $$4 != null && $$0 == $$4.a()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), $$4.b(), this.dm(), 1.0F, 1.0F, this.ae.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? ebt.v : ebt.S);
            }
         }
      }
   }

   @Override
   public void a(bul.d $$0) {
      if (($$0 == bul.d.a || $$0 == bul.d.b) && this.dV() instanceof ard $$1) {
         this.a($$1, $$0);
      }

      super.a($$0);
      this.bE.a();
   }

   protected void a(ard $$0, bul.d $$1) {
      for (btq $$2 : this.eA()) {
         $$2.a($$0, this, $$1);
      }

      this.bT.clear();
   }

   @Override
   public void b(tq $$0) {
      $$0.a("Health", this.eD());
      $$0.a("HurtTime", (short)this.aN);
      $$0.a("HurtByTimestamp", this.ca);
      $$0.a("DeathTime", (short)this.aP);
      $$0.a("AbsorptionAmount", this.fw());
      $$0.a("attributes", this.eY().d());
      if (!this.bT.isEmpty()) {
         tw $$1 = new tw();

         for (btq $$2 : this.bT.values()) {
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
      DataResult<un> $$3 = this.bE.a(ue.a);
      $$3.resultOrPartial(a::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(tq $$0) {
      this.F($$0.j("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dV() != null && !this.dV().C) {
         this.eY().a($$0.c("attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         tw $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tq $$3 = $$1.a($$2);
            btq $$4 = btq.a($$3);
            if ($$4 != null) {
               this.bT.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.x($$0.j("Health"));
      }

      this.aN = $$0.g("HurtTime");
      this.aP = $$0.g("DeathTime");
      this.ca = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         fcf $$6 = this.dV().R();
         fca $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cH(), $$7);
         if (!$$8) {
            a.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         ji $$9 = new ji($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$9);
         this.al.a(aq, bvt.c);
         if (!this.ak) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bE = this.a(new Dynamic(ue.a, $$0.c("Brain")));
      }
   }

   protected void ev() {
      Iterator<jr<bto>> $$0 = this.bT.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jr<bto> $$1 = $$0.next();
            btq $$2 = this.bT.get($$1);
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

      if (this.bY) {
         if (!this.dV().C) {
            this.K();
            this.u();
         }

         this.bY = false;
      }

      List<lr> $$3 = this.al.a(bL);
      if (!$$3.isEmpty()) {
         boolean $$4 = this.al.a(bM);
         int $$5 = this.cp() ? 15 : 4;
         int $$6 = $$4 ? 5 : 1;
         if (this.ae.a($$5 * $$6) == 0) {
            this.dV().a(af.a($$3, this.ae), this.d(0.5), this.dD(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void K() {
      if (this.bT.isEmpty()) {
         this.ey();
         this.k(false);
      } else {
         this.k(this.b(bts.n));
         this.m();
      }
   }

   private void m() {
      List<lr> $$0 = this.bT.values().stream().filter(btq::g).map(btq::a).toList();
      this.al.a(bL, $$0);
      this.al.a(bM, d(this.bT.values()));
   }

   private void u() {
      boolean $$0 = this.co();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable bul $$0) {
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
         cwp $$3 = this.a(but.f);
         bus<?> $$4 = $$0.aq();
         if ($$4 == bus.be && $$3.a(cwt.vk)
            || $$4 == bus.bN && $$3.a(cwt.vn)
            || $$4 == bus.aR && $$3.a(cwt.vq)
            || $$4 == bus.aS && $$3.a(cwt.vq)
            || $$4 == bus.E && $$3.a(cwt.vo)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bvh $$0) {
      return $$0 instanceof cox && this.dV().am() == bsh.a ? false : $$0.ew();
   }

   public boolean ew() {
      return !this.cC() && this.ex();
   }

   public boolean ex() {
      return !this.Z_() && this.bL();
   }

   public static boolean d(Collection<btq> $$0) {
      for (btq $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void ey() {
      this.al.a(bL, List.of());
   }

   public boolean ez() {
      if (this.dV().C) {
         return false;
      } else if (this.bT.isEmpty()) {
         return false;
      } else {
         Map<jr<bto>, btq> $$0 = Maps.newHashMap(this.bT);
         this.bT.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<btq> eA() {
      return this.bT.values();
   }

   public Map<jr<bto>, btq> eB() {
      return this.bT;
   }

   public boolean b(jr<bto> $$0) {
      return this.bT.containsKey($$0);
   }

   @Nullable
   public btq c(jr<bto> $$0) {
      return this.bT.get($$0);
   }

   public final boolean a(btq $$0) {
      return this.b($$0, null);
   }

   public boolean b(btq $$0, @Nullable bul $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         btq $$2 = this.bT.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bT.put($$0.c(), $$0);
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

   public boolean b(btq $$0) {
      if (this.aq().a(awt.G)) {
         return !$$0.a(bts.M);
      } else if (this.aq().a(awt.F)) {
         return !$$0.a(bts.L);
      } else {
         return !this.aq().a(awt.w) ? true : !$$0.a(bts.j) && !$$0.a(bts.s);
      }
   }

   public void c(btq $$0, @Nullable bul $$1) {
      if (this.b($$0)) {
         btq $$2 = this.bT.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eC() {
      return this.aq().a(awt.x);
   }

   @Nullable
   public btq d(jr<bto> $$0) {
      return this.bT.remove($$0);
   }

   public boolean e(jr<bto> $$0) {
      btq $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(btq $$0, @Nullable bul $$1) {
      this.bY = true;
      if (!this.dV().C) {
         $$0.c().a().a(this.eY(), $$0.e());
         this.c($$0);
      }
   }

   public void c(btq $$0) {
      for (bul $$1 : this.cY()) {
         if ($$1 instanceof are $$2) {
            $$2.f.b(new afz(this.ar(), $$0, false));
         }
      }
   }

   protected void a(btq $$0, boolean $$1, @Nullable bul $$2) {
      this.bY = true;
      if ($$1 && !this.dV().C) {
         bto $$3 = $$0.c().a();
         $$3.a(this.eY());
         $$3.a(this.eY(), $$0.e());
         this.E();
      }

      if (!this.dV().C) {
         this.c($$0);
      }
   }

   protected void c(Collection<btq> $$0) {
      this.bY = true;
      if (!this.dV().C) {
         for (btq $$1 : $$0) {
            $$1.c().a().a(this.eY());

            for (bul $$2 : this.cY()) {
               if ($$2 instanceof are $$3) {
                  $$3.f.b(new aec(this.ar(), $$1.c()));
               }
            }
         }

         this.E();
      }
   }

   private void E() {
      Set<bwl> $$0 = this.eY().b();

      for (bwl $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jr<bwk> $$0) {
      if ($$0.a(bwp.s)) {
         float $$1 = this.eS();
         if (this.eD() > $$1) {
            this.x($$1);
         }
      } else if ($$0.a(bwp.r)) {
         float $$2 = this.eT();
         if (this.fw() > $$2) {
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
      return this.al.a(bK);
   }

   public void x(float $$0) {
      this.al.a(bK, ayz.a($$0, 0.0F, this.eS()));
   }

   public boolean eE() {
      return this.eD() <= 0.0F;
   }

   @Override
   public boolean a(ard $$0, btb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.eE()) {
         return false;
      } else if ($$1.a(awr.i) && this.b(bts.l)) {
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
         if ($$2 > 0.0F && this.i($$1)) {
            this.z($$2);
            $$5 = $$2;
            $$2 = 0.0F;
            if (!$$1.a(awr.j) && $$1.c() instanceof bvh $$7) {
               this.d($$7);
            }

            $$4 = true;
         }

         if ($$1.a(awr.o) && this.aq().a(awt.l)) {
            $$2 *= 5.0F;
         }

         if ($$1.a(awr.a) && !this.a(but.f).f()) {
            this.d($$1, $$2);
            $$2 *= 0.75F;
         }

         this.aT.a(1.5F);
         if (Float.isNaN($$2) || Float.isInfinite($$2)) {
            $$2 = Float.MAX_VALUE;
         }

         boolean $$8 = true;
         if ((float)this.aj > 10.0F && !$$1.a(awr.e)) {
            if ($$2 <= this.bl) {
               return false;
            }

            this.b($$0, $$1, $$2 - this.bl);
            this.bl = $$2;
            $$8 = false;
         } else {
            this.bl = $$2;
            this.aj = 20;
            this.b($$0, $$1, $$2);
            this.aO = 10;
            this.aN = this.aO;
         }

         this.f($$1);
         this.g($$1);
         if ($$8) {
            if ($$4) {
               $$0.a(this, (byte)29);
            } else {
               $$0.a(this, $$1);
            }

            if (!$$1.a(awr.r) && (!$$4 || $$2 > 0.0F)) {
               this.bD();
            }

            if (!$$1.a(awr.z)) {
               double $$9 = 0.0;
               double $$10 = 0.0;
               if ($$1.c() instanceof cpq $$11) {
                  DoubleDoubleImmutablePair $$12 = $$11.a_(this, $$1);
                  $$9 = -$$12.leftDouble();
                  $$10 = -$$12.rightDouble();
               } else if ($$1.i() != null) {
                  $$9 = $$1.i().a() - this.dA();
                  $$10 = $$1.i().c() - this.dG();
               }

               this.p(0.4F, $$9, $$10);
               if (!$$4) {
                  this.a($$9, $$10);
               }
            }
         }

         if (this.eE()) {
            if (!this.j($$1)) {
               if ($$8) {
                  this.b(this.o_());
               }

               this.a($$1);
            }
         } else if ($$8) {
            this.h($$1);
         }

         boolean $$13 = !$$4 || $$2 > 0.0F;
         if ($$13) {
            this.ci = $$1;
            this.cj = this.dV().ad();

            for (btq $$14 : this.eA()) {
               $$14.a($$0, this, $$1, $$2);
            }
         }

         if (this instanceof are $$15) {
            ap.i.a($$15, $$1, $$3, $$2, $$4);
            if ($$5 > 0.0F && $$5 < 3.4028235E37F) {
               $$15.a(awk.K, Math.round($$5 * 10.0F));
            }
         }

         if ($$1.d() instanceof are $$16) {
            ap.h.a($$16, this, $$1, $$3, $$2, $$4);
         }

         return $$13;
      }
   }

   protected void f(btb $$0) {
      if ($$0.d() instanceof bvh $$1 && !$$0.a(awr.q) && (!$$0.a(bte.I) || !this.aq().a(awt.E))) {
         this.a($$1);
      }
   }

   @Nullable
   protected cox g(btb $$0) {
      bul $$1 = $$0.d();
      if ($$1 instanceof cox $$2) {
         this.bd = 100;
         this.bc = $$2;
         return $$2;
      } else {
         if ($$1 instanceof cib $$3 && $$3.p()) {
            this.bd = 100;
            if ($$3.ag_() instanceof cox $$4) {
               this.bc = $$4;
            } else {
               this.bc = null;
            }

            return this.bc;
         }

         return null;
      }
   }

   protected void d(bvh $$0) {
      $$0.e(this);
   }

   protected void e(bvh $$0) {
      $$0.p(0.5, $$0.dA() - this.dA(), $$0.dG() - this.dG());
   }

   private boolean j(btb $$0) {
      if ($$0.a(awr.d)) {
         return false;
      } else {
         cwp $$1 = null;
         czb $$2 = null;

         for (bsj $$3 : bsj.values()) {
            cwp $$4 = this.b($$3);
            $$2 = $$4.a(kv.H);
            if ($$2 != null) {
               $$1 = $$4.v();
               $$4.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof are $$5) {
               $$5.b(awk.c.b($$1.h()));
               ap.C.a($$5, $$1);
               this.a(ebt.C);
            }

            this.x(1.0F);
            $$2.a($$1, this);
            this.dV().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public btb eF() {
      if (this.dV().ad() - this.cj > 40L) {
         this.ci = null;
      }

      return this.ci;
   }

   protected void h(btb $$0) {
      this.b(this.e($$0));
   }

   public void b(@Nullable avz $$0) {
      if ($$0 != null) {
         this.a($$0, this.fg(), this.fh());
      }
   }

   public boolean i(btb $$0) {
      bul $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cpe $$3 && $$3.z() > 0) {
         $$2 = true;
      }

      cwp $$4 = this.fH();
      if (!$$0.a(awr.c) && $$4 != null && $$4.h() instanceof cxr && !$$2) {
         fba $$5 = $$0.i();
         if ($$5 != null) {
            fba $$6 = this.d(0.0F, this.cA());
            fba $$7 = $$5.a(this.dt());
            $$7 = new fba($$7.d, 0.0, $$7.f).d();
            return $$7.b($$6) < 0.0;
         }
      }

      return false;
   }

   private void g(cwp $$0) {
      if (!$$0.f()) {
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), $$0.N(), this.dm(), 0.8F, 0.8F + this.dV().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(btb $$0) {
      if (!this.dQ() && !this.be) {
         bul $$1 = $$0.d();
         bvh $$2 = this.eR();
         if ($$2 != null) {
            $$2.a(this, $$0);
         }

         if (this.fR()) {
            this.fS();
         }

         if (!this.dV().C && this.l_()) {
            a.info("Named entity {} died: {}", this, this.eQ().a().getString());
         }

         this.be = true;
         this.eQ().c();
         if (this.dV() instanceof ard $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(ebt.p);
               this.b($$3, $$0);
               this.f($$2);
            }

            this.dV().a(this, (byte)3);
         }

         this.b(bvt.h);
      }
   }

   protected void f(@Nullable bvh $$0) {
      if (this.dV() instanceof ard $$1) {
         boolean var6 = false;
         if ($$0 instanceof ckp) {
            if ($$1.O().b(dge.c)) {
               ji $$4 = this.dv();
               dwx $$5 = djo.ck.m();
               if (this.dV().a_($$4).l() && $$5.a((dgl)this.dV(), $$4)) {
                  this.dV().a($$4, $$5, 3);
                  var6 = true;
               }
            }

            if (!var6) {
               clc $$6 = new clc(this.dV(), this.dA(), this.dC(), this.dG(), new cwp(cwt.dF));
               this.dV().b($$6);
            }
         }
      }
   }

   protected void b(ard $$0, btb $$1) {
      boolean $$2 = this.bd > 0;
      if (this.en() && $$0.O().b(dge.f)) {
         this.b($$0, $$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.f($$0);
      this.b($$0, $$1.d());
   }

   protected void f(ard $$0) {
   }

   protected void b(ard $$0, @Nullable bul $$1) {
      if (!this.eI() && (this.eo() || this.bd > 0 && this.em() && $$0.O().b(dge.f))) {
         bux.a($$0, this.dt(), this.a($$0, $$1));
      }
   }

   protected void a(ard $$0, btb $$1, boolean $$2) {
   }

   public long eG() {
      return 0L;
   }

   protected float b(bul $$0, btb $$1) {
      float $$2 = (float)this.h(bwp.d);
      return this.dV() instanceof ard $$3 ? ddb.d($$3, this.dZ(), $$0, $$1, $$2) : $$2;
   }

   protected void b(ard $$0, btb $$1, boolean $$2) {
      Optional<aku<evw>> $$3 = this.ea();
      if (!$$3.isEmpty()) {
         evw $$4 = $$0.p().bc().b($$3.get());
         evu.a $$5 = new evu.a($$0).a(eyl.a, this).a(eyl.f, this.dt()).a(eyl.c, $$1).b(eyl.d, $$1.d()).b(eyl.e, $$1.c());
         if ($$2 && this.bc != null) {
            $$5 = $$5.a(eyl.b, this.bc).a(this.bc.gF());
         }

         evu $$6 = $$5.a(eyk.g);
         $$4.a($$6, this.eG(), $$1x -> this.a($$0, $$1x));
      }
   }

   public boolean a(ard $$0, aku<evw> $$1, BiConsumer<ard, cwp> $$2) {
      return this.a($$0, $$1, $$0x -> $$0x.a(eyl.f, this.dt()).a(eyl.a, this).a(eyk.j), $$2);
   }

   protected void a(ard $$0, aku<evw> $$1, cwp $$2, BiConsumer<ard, cwp> $$3) {
      this.a($$0, $$1, $$1x -> $$1x.a(eyl.f, this.dt()).a(eyl.a, this).a(eyl.i, $$2).a(eyk.s), $$3);
   }

   protected boolean a(ard $$0, aku<evw> $$1, Function<evu.a, evu> $$2, BiConsumer<ard, cwp> $$3) {
      evw $$4 = $$0.p().bc().b($$1);
      evu $$5 = $$2.apply(new evu.a($$0));
      List<cwp> $$6 = $$4.a($$5);
      if (!$$6.isEmpty()) {
         $$6.forEach($$2x -> $$3.accept($$0, $$2x));
         return true;
      } else {
         return false;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(bwp.p);
      if (!($$0 <= 0.0)) {
         this.ar = true;
         fba $$3 = this.dy();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         fba $$4 = new fba($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aJ() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected avz e(btb $$0) {
      return awa.kG;
   }

   @Nullable
   protected avz o_() {
      return awa.kB;
   }

   private avz q(int $$0) {
      return $$0 > 4 ? this.eM().b() : this.eM().a();
   }

   public void eH() {
      this.cm = true;
   }

   public boolean eI() {
      return this.cm;
   }

   public float eJ() {
      return 0.0F;
   }

   protected fav eK() {
      fav $$0 = this.cR();
      bul $$1 = this.dk();
      if ($$1 != null) {
         fba $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dcz, Set<ddr>> c(but $$0) {
      return (Map<dcz, Set<ddr>>)this.cn.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public boolean eL() {
      return true;
   }

   public bvh.a eM() {
      return new bvh.a(awa.kH, awa.kz);
   }

   public Optional<ji> eN() {
      return this.ch;
   }

   public boolean q_() {
      if (this.Z_()) {
         return false;
      } else {
         ji $$0 = this.dv();
         dwx $$1 = this.dw();
         if ($$1.a(awp.aS)) {
            this.ch = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dse && this.c($$0, $$1)) {
            this.ch = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(ji $$0, dwx $$1) {
      if (!$$1.c(dse.b)) {
         return false;
      } else {
         dwx $$2 = this.dV().a_($$0.e());
         return $$2.a(djo.cX) && $$2.c(dnu.b) == $$1.c(dse.aF);
      }
   }

   @Override
   public boolean bL() {
      return !this.dQ() && this.eD() > 0.0F;
   }

   public boolean a(bvh $$0, double $$1, boolean $$2, boolean $$3, double... $$4) {
      fba $$5 = $$0.g(1.0F).d();

      for (double $$6 : $$4) {
         fba $$7 = new fba(this.dA() - $$0.dA(), $$6 - $$0.dE(), this.dG() - $$0.dG());
         double $$8 = $$7.g();
         $$7 = $$7.d();
         double $$9 = $$5.b($$7);
         if ($$9 > 1.0 - $$1 / ($$2 ? $$8 : 1.0) && $$0.a(this, $$3 ? dfq.a.c : dfq.a.a, dfq.b.a, $$6)) {
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
      return ayz.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, btb $$2) {
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
      if (this.aq().a(awt.o)) {
         return 0;
      } else {
         float $$2 = (float)this.h(bwp.x);
         float $$3 = $$0 - $$2;
         return ayz.c((double)($$3 * $$1) * this.h(bwp.k));
      }
   }

   protected void eO() {
      if (!this.bb()) {
         int $$0 = ayz.a(this.dA());
         int $$1 = ayz.a(this.dC() - 0.2F);
         int $$2 = ayz.a(this.dG());
         dwx $$3 = this.dV().a_(new ji($$0, $$1, $$2));
         if (!$$3.l()) {
            dre $$4 = $$3.A();
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
      return ayz.a(this.h(bwp.a));
   }

   protected void c(btb $$0, float $$1) {
   }

   protected void d(btb $$0, float $$1) {
   }

   protected void z(float $$0) {
   }

   protected void a(btb $$0, float $$1, but... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (but $$4 : $$2) {
            cwp $$5 = this.a($$4);
            deu $$6 = $$5.a(kv.D);
            if ($$6 != null && $$6.h() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float e(btb $$0, float $$1) {
      if (!$$0.a(awr.b)) {
         this.c($$0, $$1);
         $$1 = bsx.a(this, $$1, $$0, (float)this.eP(), (float)this.h(bwp.b));
      }

      return $$1;
   }

   protected float f(btb $$0, float $$1) {
      if ($$0.a(awr.f)) {
         return $$1;
      } else {
         if (this.b(bts.k) && !$$0.a(awr.g)) {
            int $$2 = (this.c(bts.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof are) {
                  ((are)this).a(awk.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof are) {
                  ((are)$$0.d()).a(awk.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(awr.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dV() instanceof ard $$7) {
               $$8 = ddb.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bsx.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void b(ard $$0, btb $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var10 = Math.max($$2 - this.fw(), 0.0F);
         this.E(this.fw() - ($$2 - var10));
         float $$4 = $$2 - var10;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F && $$1.d() instanceof are $$5) {
            $$5.a(awk.H, Math.round($$4 * 10.0F));
         }

         if (var10 != 0.0F) {
            this.eQ().a($$1, var10);
            this.x(this.eD() - var10);
            this.E(this.fw() - var10);
            this.a(ebt.o);
         }
      }
   }

   public bsy eQ() {
      return this.bS;
   }

   @Nullable
   public bvh eR() {
      if (this.bc != null) {
         return this.bc;
      } else {
         return this.bZ != null ? this.bZ : null;
      }
   }

   public final float eS() {
      return (float)this.h(bwp.s);
   }

   public final float eT() {
      return (float)this.h(bwp.r);
   }

   public final int eU() {
      return this.al.a(bN);
   }

   public final void o(int $$0) {
      this.al.a(bN, $$0);
   }

   public final int eV() {
      return this.al.a(bO);
   }

   public final void p(int $$0) {
      this.al.a(bO, $$0);
   }

   private int F() {
      if (btr.a(this)) {
         return 6 - (1 + btr.b(this));
      } else {
         return this.b(bts.d) ? 6 + (1 + this.c(bts.d).e()) * 2 : 6;
      }
   }

   public void a(bsj $$0) {
      this.a($$0, false);
   }

   public void a(bsj $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.F() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dV() instanceof ard) {
            abo $$2 = new abo(this, $$0 == bsj.a ? 0 : 3);
            ara $$3 = ((ard)this.dV()).m();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(btb $$0) {
      this.aT.a(1.5F);
      this.aj = 20;
      this.aO = 10;
      this.aN = this.aO;
      avz $$1 = this.e($$0);
      if ($$1 != null) {
         this.a($$1, this.fg(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }

      this.ci = $$0;
      this.cj = this.dV().ad();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            avz $$1 = this.o_();
            if ($$1 != null) {
               this.a($$1, this.fg(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cox)) {
               this.x(0.0F);
               this.a(this.dW().p());
            }
            break;
         case 29:
            this.a(awa.xd, 1.0F, 0.8F + this.dV().A.i() * 0.4F);
            break;
         case 30:
            this.a(awa.xe, 0.8F, 0.8F + this.dV().A.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ae.i() - 0.5F) * 0.2F;
               float $$6 = (this.ae.i() - 0.5F) * 0.2F;
               float $$7 = (this.ae.i() - 0.5F) * 0.2F;
               double $$8 = ayz.d($$4, this.K, this.dA()) + (this.ae.j() - 0.5) * (double)this.dq() * 2.0;
               double $$9 = ayz.d($$4, this.L, this.dC()) + this.ae.j() * (double)this.dr();
               double $$10 = ayz.d($$4, this.M, this.dG()) + (this.ae.j() - 0.5) * (double)this.dq() * 2.0;
               this.dV().a(lt.ae, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.g(this.a(but.a));
            break;
         case 48:
            this.g(this.a(but.b));
            break;
         case 49:
            this.g(this.a(but.f));
            break;
         case 50:
            this.g(this.a(but.e));
            break;
         case 51:
            this.g(this.a(but.d));
            break;
         case 52:
            this.g(this.a(but.c));
            break;
         case 54:
            dni.b(this);
            break;
         case 55:
            this.G();
            break;
         case 60:
            this.eW();
            break;
         case 65:
            this.g(this.a(but.g));
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
         this.dV().a(lt.ad, this.d(1.0) - $$1 * 10.0, this.dD() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
      }
   }

   private void G() {
      cwp $$0 = this.a(but.b);
      this.a(but.b, this.a(but.a));
      this.a(but.a, $$0);
   }

   @Override
   protected void aI() {
      this.a(this.dW().o(), 4.0F);
   }

   protected void eX() {
      int $$0 = this.F();
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
   public bwl g(jr<bwk> $$0) {
      return this.eY().a($$0);
   }

   public double h(jr<bwk> $$0) {
      return this.eY().c($$0);
   }

   public double i(jr<bwk> $$0) {
      return this.eY().d($$0);
   }

   public bwm eY() {
      return this.bR;
   }

   public cwp eZ() {
      return this.a(but.a);
   }

   public cwp fa() {
      return this.a(but.b);
   }

   public cwp a(bvb $$0) {
      return this.fy() == $$0 ? this.eZ() : this.fa();
   }

   @Nonnull
   @Override
   public cwp dZ() {
      return this.eZ();
   }

   public boolean b(cwl $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cwp> $$0) {
      return $$0.test(this.eZ()) || $$0.test(this.fa());
   }

   public cwp b(bsj $$0) {
      if ($$0 == bsj.a) {
         return this.a(but.a);
      } else if ($$0 == bsj.b) {
         return this.a(but.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bsj $$0, cwp $$1) {
      if ($$0 == bsj.a) {
         this.a(but.a, $$1);
      } else {
         if ($$0 != bsj.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(but.b, $$1);
      }
   }

   public boolean d(but $$0) {
      return !this.a($$0).f();
   }

   public boolean e(but $$0) {
      return false;
   }

   public abstract Iterable<cwp> fb();

   public abstract cwp a(but var1);

   public abstract void a(but var1, cwp var2);

   public Iterable<cwp> fc() {
      return List.of();
   }

   public Iterable<cwp> fd() {
      return this.fb();
   }

   public Iterable<cwp> fe() {
      return Iterables.concat(this.fc(), this.fd());
   }

   protected void c(cwp $$0) {
      $$0.h().l($$0);
   }

   public float ff() {
      Iterable<cwp> $$0 = this.fb();
      int $$1 = 0;
      int $$2 = 0;

      for (cwp $$3 : $$0) {
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
      bwl $$1 = this.g(bwp.v);
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
      return this.eE();
   }

   @Override
   public void h(bul $$0) {
      if (!this.fR()) {
         super.h($$0);
      }
   }

   private void c(bul $$0) {
      fba $$1;
      if (this.dQ()) {
         $$1 = this.dt();
      } else if (!$$0.dQ() && !this.dV().a_($$0.dv()).a(awp.aM)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dC(), $$0.dC());
         $$1 = new fba(this.dA(), $$2, this.dG());
         boolean $$4 = this.dq() <= 4.0F && this.dr() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.dr() / 2.0;
            fba $$6 = $$1.b(0.0, $$5, 0.0);
            fbu $$7 = fbr.a(fav.a($$6, (double)this.dq(), (double)this.dr(), (double)this.dq()));
            $$1 = this.dV().a(this, $$7, $$6, (double)this.dq(), (double)this.dr(), (double)this.dq()).map($$1x -> $$1x.b(0.0, -$$5, 0.0)).orElse($$1);
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
      return (float)this.h(bwp.o) * $$0 * this.aS() + this.fk();
   }

   public float fk() {
      return this.b(bts.h) ? 0.1F * ((float)this.c(bts.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void s() {
      float $$0 = this.fj();
      if (!($$0 <= 1.0E-5F)) {
         fba $$1 = this.dy();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.cj()) {
            float $$2 = this.dL() * (float) (Math.PI / 180.0);
            this.j(new fba((double)(-ayz.a($$2)) * 0.2, 0.0, (double)ayz.b($$2) * 0.2));
         }

         this.ar = true;
      }
   }

   protected void fl() {
      this.i(this.dy().b(0.0, -0.04F, 0.0));
   }

   protected void c(axf<esy> $$0) {
      this.i(this.dy().b(0.0, 0.04F, 0.0));
   }

   protected float fm() {
      return 0.8F;
   }

   public boolean a(esz $$0) {
      return false;
   }

   @Override
   protected double bd() {
      return this.h(bwp.n);
   }

   protected double fn() {
      boolean $$0 = this.dy().e <= 0.0;
      return $$0 && this.b(bts.B) ? Math.min(this.be(), 0.01) : this.be();
   }

   public void a_(fba $$0) {
      if (this.dh()) {
         esz $$1 = this.dV().b_(this.dv());
         if ((this.bj() || this.bx()) && this.ek() && !this.a($$1)) {
            this.m($$0);
         } else if (this.fJ()) {
            this.H();
         } else {
            this.l($$0);
         }
      }
   }

   private void l(fba $$0) {
      ji $$1 = this.aQ();
      float $$2 = this.aJ() ? this.dV().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      fba $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      btq $$6 = this.c(bts.y);
      if ($$6 != null) {
         $$5 += (0.05 * (double)($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.dV().C || this.dV().B($$1)) {
         $$5 -= this.fn();
      } else if (this.dC() > (double)this.dV().L_()) {
         $$5 = -0.1;
      } else {
         $$5 = 0.0;
      }

      if (this.eu()) {
         this.n($$4.d, $$5, $$4.f);
      } else {
         float $$7 = this instanceof chh ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void m(fba $$0) {
      boolean $$1 = this.dy().e <= 0.0;
      double $$2 = this.dC();
      double $$3 = this.fn();
      if (this.bj()) {
         float $$4 = this.cj() ? 0.9F : this.fm();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bwp.F);
         if (!this.aJ()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fp() - $$5) * $$6;
         }

         if (this.b(bts.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bvl.a, this.dy());
         fba $$7 = this.dy();
         if (this.P && this.q_()) {
            $$7 = new fba($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.i(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bvl.a, this.dy());
         if (this.b(awv.b) <= this.dp()) {
            this.i(this.dy().d(0.5, 0.8F, 0.5));
            fba $$8 = this.a($$3, $$1, this.dy());
            this.i($$8);
         } else {
            this.i(this.dy().c(0.5));
         }

         if ($$3 != 0.0) {
            this.i(this.dy().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      fba $$9 = this.dy();
      if (this.P && this.g($$9.d, $$9.e + 0.6F - this.dC() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void H() {
      fba $$0 = this.dy();
      double $$1 = $$0.i();
      this.i(this.n($$0));
      this.a(bvl.a, this.dy());
      if (!this.dV().C) {
         double $$2 = this.dy().i();
         this.c($$1, $$2);
      }
   }

   private fba n(fba $$0) {
      fba $$1 = this.bT();
      float $$2 = this.dN() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fn();
      double $$6 = ayz.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-ayz.a($$2)) * 0.04;
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

   private void c(cox $$0, fba $$1) {
      fba $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.dh()) {
         this.C(this.e($$0));
         this.a_($$2);
      } else {
         this.i(fba.c);
      }
   }

   protected void a(cox $$0, fba $$1) {
   }

   protected fba b(cox $$0, fba $$1) {
      return $$1;
   }

   protected float e(cox $$0) {
      return this.fp();
   }

   public void s(boolean $$0) {
      float $$1 = (float)ayz.g(this.dA() - this.K, $$0 ? this.dC() - this.L : 0.0, this.dG() - this.M);
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

   private fba a(fba $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.i(this.o(this.dy()));
      this.a(bvl.a, this.dy());
      fba $$2 = this.dy();
      if ((this.P || this.bm) && (this.q_() || this.dw().a(djo.rr) && dpl.a(this))) {
         $$2 = new fba($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public fba a(double $$0, boolean $$1, fba $$2) {
      if ($$0 != 0.0 && !this.cj()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new fba($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private fba o(fba $$0) {
      if (this.q_()) {
         this.k();
         float $$1 = 0.15F;
         double $$2 = ayz.a($$0.d, -0.15F, 0.15F);
         double $$3 = ayz.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dw().a(djo.ou) && this.fI() && this instanceof cox) {
            $$4 = 0.0;
         }

         $$0 = new fba($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aJ() ? this.fp() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fo();
   }

   protected float fo() {
      return this.cW() instanceof cox ? this.fp() * 0.1F : 0.02F;
   }

   public float fp() {
      return this.cd;
   }

   public void C(float $$0) {
      this.cd = $$0;
   }

   public boolean c(ard $$0, bul $$1) {
      this.B($$1);
      return false;
   }

   @Override
   public void h() {
      super.h();
      this.L();
      this.N();
      if (!this.dV().C) {
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

         this.I();
         if (this.af % 20 == 0) {
            this.eQ().c();
         }

         if (this.fR() && !this.O()) {
            this.fS();
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
         float $$8 = (float)ayz.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ayz.e(ayz.h(this.dL()) - $$8);
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
      bot $$10 = bos.a();
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
      if (this.fJ()) {
         this.bA++;
      } else {
         this.bA = 0;
      }

      if (this.fR()) {
         this.w(0.0F);
      }

      this.E();
      float $$11 = this.ej();
      if ($$11 != this.bF) {
         this.bF = $$11;
         this.m_();
      }

      this.bb.a();
   }

   private void I() {
      Map<but, cwp> $$0 = this.J();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<but, cwp> J() {
      Map<but, cwp> $$0 = null;

      for (but $$1 : but.i) {
         cwp $$2 = switch ($$1.a()) {
            case a -> this.h($$1);
            case b -> this.g($$1);
            case c -> this.bW;
         };
         cwp $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(but.class);
            }

            $$0.put($$1, $$3);
            bwm $$4 = this.eY();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<but, cwp> $$5 : $$0.entrySet()) {
            but $$6 = $$5.getKey();
            cwp $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1) -> {
                  bwl $$2 = this.bR.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1.b());
                     $$2.b($$1);
                  }
               });
               if (this.dV() instanceof ard $$8) {
                  ddb.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(cwp $$0, cwp $$1) {
      return !cwp.a($$1, $$0);
   }

   private void a(Map<but, cwp> $$0) {
      cwp $$1 = $$0.get(but.a);
      cwp $$2 = $$0.get(but.b);
      if ($$1 != null && $$2 != null && cwp.a($$1, this.h(but.b)) && cwp.a($$2, this.h(but.a))) {
         ((ard)this.dV()).m().b(this, new acp(this, (byte)55));
         $$0.remove(but.a);
         $$0.remove(but.b);
         this.c(but.a, $$1.v());
         this.c(but.b, $$2.v());
      }
   }

   private void b(Map<but, cwp> $$0) {
      List<Pair<but, cwp>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cwp $$3 = $$2.v();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
               break;
            case c:
               this.bW = $$3;
         }
      });
      ((ard)this.dV()).m().b(this, new aey(this.ar(), $$1));
   }

   private cwp g(but $$0) {
      return this.bV.get($$0.b());
   }

   private void b(but $$0, cwp $$1) {
      this.bV.set($$0.b(), $$1);
   }

   private cwp h(but $$0) {
      return this.bU.get($$0.b());
   }

   private void c(but $$0, cwp $$1) {
      this.bU.set($$0.b(), $$1);
   }

   protected float g(float $$0, float $$1) {
      float $$2 = ayz.h($$0 - this.aX);
      this.aX += $$2 * 0.3F;
      float $$3 = ayz.h(this.dL() - this.aX);
      float $$4 = this.fq();
      if (Math.abs($$3) > $$4) {
         this.aX = this.aX + ($$3 - (float)ayz.j((double)$$3) * $$4);
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
      if (this.ce > 0) {
         this.ce--;
      }

      if (this.bq > 0) {
         this.a(this.bq, this.br, this.bs, this.bt, this.bu, this.bv);
         this.bq--;
      } else if (!this.dj()) {
         this.i(this.dy().c(0.98));
      }

      if (this.bx > 0) {
         this.a(this.bx, this.bw);
         this.bx--;
      }

      fba $$0 = this.dy();
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
      bot $$4 = bos.a();
      $$4.a("ai");
      if (this.fi()) {
         this.bm = false;
         this.bn = 0.0F;
         this.bp = 0.0F;
      } else if (this.dj()) {
         $$4.a("newAi");
         this.fu();
         $$4.c();
      }

      $$4.c();
      $$4.a("jump");
      if (this.bm && this.ek()) {
         double $$5;
         if (this.bx()) {
            $$5 = this.b(awv.b);
         } else {
            $$5 = this.b(awv.a);
         }

         boolean $$7 = this.bj() && $$5 > 0.0;
         double $$8 = this.dp();
         if (!$$7 || this.aJ() && !($$5 > $$8)) {
            if (!this.bx() || this.aJ() && !($$5 > $$8)) {
               if ((this.aJ() || $$7 && $$5 <= $$8) && this.ce == 0) {
                  this.s();
                  this.ce = 10;
               }
            } else {
               this.c(awv.b);
            }
         } else {
            this.c(awv.a);
         }
      } else {
         this.ce = 0;
      }

      $$4.c();
      $$4.a("travel");
      this.bn *= 0.98F;
      this.bp *= 0.98F;
      if (this.fJ()) {
         this.fs();
      }

      fav $$9 = this.cR();
      fba $$10 = new fba((double)this.bn, (double)this.bo, (double)this.bp);
      if (this.b(bts.B) || this.b(bts.y)) {
         this.k();
      }

      label112: {
         if (this.cW() instanceof cox $$11 && this.bL()) {
            this.c($$11, $$10);
            break label112;
         }

         this.a_($$10);
      }

      if (!this.dV().B_() || this.dh()) {
         this.aK();
      }

      this.s(this instanceof chh);
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
      if (this.dV() instanceof ard $$13 && this.af % 40 == 0 && this.cw() && this.dJ()) {
         this.a($$13, this.dW().v(), 1.0F);
      }

      $$4.c();
      $$4.a("push");
      if (this.bB > 0) {
         this.bB--;
         this.a($$9, this.cR());
      }

      this.o();
      $$4.c();
      if (this.dV() instanceof ard $$14 && this.fr() && this.bl()) {
         this.a($$14, this.dW().i(), 1.0F);
      }
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

         int $$0 = this.bA + 1;
         if ($$0 % 10 == 0) {
            int $$1 = $$0 / 10;
            if ($$1 % 2 == 0) {
               List<but> $$2 = but.i.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               but $$3 = af.a($$2, this.ae);
               this.a($$3).a(1, this, $$3);
            }

            this.a(ebt.n);
         }
      }
   }

   protected boolean ft() {
      if (!this.aJ() && !this.bZ() && !this.b(bts.y)) {
         for (but $$0 : but.i) {
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
      if (!(this.dV() instanceof ard $$0)) {
         this.dV().a(ebh.a(cox.class), this.cR(), buq.a(this)).forEach(this::D);
      } else {
         List<bul> $$2 = this.dV().a(this, this.cR(), buq.a(this));
         if (!$$2.isEmpty()) {
            int $$3 = $$0.O().c(dge.v);
            if ($$3 > 0 && $$2.size() > $$3 - 1 && this.ae.a(4) == 0) {
               int $$4 = 0;

               for (bul $$5 : $$2) {
                  if (!$$5.bZ()) {
                     $$4++;
                  }
               }

               if ($$4 > $$3 - 1) {
                  this.a($$0, this.dW().h(), 6.0F);
               }
            }

            for (bul $$6 : $$2) {
               this.D($$6);
            }
         }
      }
   }

   protected void a(fav $$0, fav $$1) {
      fav $$2 = $$0.b($$1);
      List<bul> $$3 = this.dV().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bul $$4 : $$3) {
            if ($$4 instanceof bvh) {
               this.g((bvh)$$4);
               this.bB = 0;
               this.i(this.dy().c(-0.2));
               break;
            }
         }
      } else if (this.P) {
         this.bB = 0;
      }

      if (!this.dV().C && this.bB <= 0) {
         this.c(4, false);
         this.bC = 0.0F;
         this.bD = null;
      }
   }

   protected void D(bul $$0) {
      $$0.h(this);
   }

   protected void g(bvh $$0) {
   }

   public boolean fv() {
      return (this.al.a(aC) & 4) != 0;
   }

   @Override
   public void ae() {
      bul $$0 = this.dk();
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
      this.bq = 0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.br = $$0;
      this.bs = $$1;
      this.bt = $$2;
      this.bu = (double)$$3;
      this.bv = (double)$$4;
      this.bq = $$5;
   }

   @Override
   public double R_() {
      return this.bq > 0 ? this.br : this.dA();
   }

   @Override
   public double S_() {
      return this.bq > 0 ? this.bs : this.dC();
   }

   @Override
   public double g_() {
      return this.bq > 0 ? this.bt : this.dG();
   }

   @Override
   public float r_() {
      return this.bq > 0 ? (float)this.bv : this.dN();
   }

   @Override
   public float h_() {
      return this.bq > 0 ? (float)this.bu : this.dL();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bw = (double)$$0;
      this.bx = $$1;
   }

   public void t(boolean $$0) {
      this.bm = $$0;
   }

   public void a(clc $$0) {
      bul $$1 = $$0.p();
      if ($$1 instanceof are) {
         ap.R.a((are)$$1, $$0.l(), this);
      }
   }

   public void a(bul $$0, int $$1) {
      if (!$$0.dQ() && !this.dV().C && ($$0 instanceof clc || $$0 instanceof cpe || $$0 instanceof bux)) {
         ((ard)this.dV()).m().b($$0, new aft($$0.ar(), this.ar(), $$1));
      }
   }

   public boolean E(bul $$0) {
      return this.a($$0, dfq.a.a, dfq.b.a, $$0.dE());
   }

   public boolean a(bul $$0, dfq.a $$1, dfq.b $$2, double $$3) {
      if ($$0.dV() != this.dV()) {
         return false;
      } else {
         fba $$4 = new fba(this.dA(), this.dE(), this.dG());
         fba $$5 = new fba($$0.dA(), $$3, $$0.dG());
         return $$5.f($$4) > 128.0 ? false : this.dV().a(new dfq($$4, $$5, $$1, $$2, this)).d() == fay.a.a;
      }
   }

   @Override
   public float i(float $$0) {
      return $$0 == 1.0F ? this.aZ : ayz.i($$0, this.ba, this.aZ);
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
      return this.bL() && !this.Z_() && !this.q_();
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
   public fba a(jn.a $$0, l.a $$1) {
      return k(super.a($$0, $$1));
   }

   public static fba k(fba $$0) {
      return new fba($$0.d, $$0.e, 0.0);
   }

   public float fw() {
      return this.cf;
   }

   public final void E(float $$0) {
      this.F(ayz.a($$0, 0.0F, this.eT()));
   }

   protected void F(float $$0) {
      this.cf = $$0;
   }

   public void i_() {
   }

   public void j_() {
   }

   protected void fx() {
      this.bY = true;
   }

   public abstract bvb fy();

   public boolean fz() {
      return (this.al.a(aC) & 1) > 0;
   }

   public bsj fA() {
      return (this.al.a(aC) & 2) > 0 ? bsj.b : bsj.a;
   }

   private void L() {
      if (this.fz()) {
         if (cwp.b(this.b(this.fA()), this.by)) {
            this.by = this.b(this.fA());
            this.a(this.by);
         } else {
            this.fF();
         }
      }
   }

   protected void a(cwp $$0) {
      $$0.b(this.dV(), this, this.fC());
      if (--this.bz == 0 && !this.dV().C && !$$0.x()) {
         this.w();
      }
   }

   private void N() {
      this.cl = this.ck;
      if (this.cl()) {
         this.ck = Math.min(1.0F, this.ck + 0.09F);
      } else {
         this.ck = Math.max(0.0F, this.ck - 0.09F);
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

   public void c(bsj $$0) {
      cwp $$1 = this.b($$0);
      if (!$$1.f() && !this.fz()) {
         this.by = $$1;
         this.bz = $$1.a(this);
         if (!this.dV().C) {
            this.c(1, true);
            this.c(2, $$0 == bsj.b);
            this.a(ebt.D);
         }
      }
   }

   @Override
   public void a(ajy<?> $$0) {
      super.a($$0);
      if (bP.equals($$0)) {
         if (this.dV().C) {
            this.fP().ifPresent(this::a);
         }
      } else if (aC.equals($$0) && this.dV().C) {
         if (this.fz() && this.by.f()) {
            this.by = this.b(this.fA());
            if (!this.by.f()) {
               this.bz = this.by.a(this);
            }
         } else if (!this.fz() && !this.by.f()) {
            this.by = cwp.j;
            this.bz = 0;
         }
      }
   }

   @Override
   public void a(fj.a $$0, fba $$1) {
      super.a($$0, $$1);
      this.ba = this.aZ;
      this.aX = this.aZ;
      this.aY = this.aX;
   }

   @Override
   public float t(float $$0) {
      return ayz.h($$0, this.aY, this.aX);
   }

   public void b(cwp $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         fba $$3 = new fba(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dN() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dL() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ae.i()) * 0.6 - 0.3;
         fba $$5 = new fba(((double)this.ae.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dN() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dL() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dA(), this.dE(), this.dG());
         this.dV().a(new lp(lt.T, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void w() {
      if (!this.dV().C || this.fz()) {
         bsj $$0 = this.fA();
         if (!this.by.equals(this.b($$0))) {
            this.fE();
         } else {
            if (!this.by.f() && this.fz()) {
               cwp $$1 = this.by.a(this.dV(), this);
               if ($$1 != this.by) {
                  this.a($$0, $$1);
               }

               this.fF();
            }
         }
      }
   }

   public void b(cwp $$0) {
   }

   public cwp fB() {
      return this.by;
   }

   public int fC() {
      return this.bz;
   }

   public int fD() {
      return this.fz() ? this.by.a(this) - this.fC() : 0;
   }

   public void fE() {
      if (!this.by.f()) {
         this.by.a(this.dV(), this, this.fC());
         if (this.by.x()) {
            this.L();
         }
      }

      this.fF();
   }

   public void fF() {
      if (!this.dV().C) {
         boolean $$0 = this.fz();
         this.c(1, false);
         if ($$0) {
            this.a(ebt.C);
         }
      }

      this.by = cwp.j;
      this.bz = 0;
   }

   public boolean fG() {
      return this.fH() != null;
   }

   @Nullable
   public cwp fH() {
      if (this.fz() && !this.by.f()) {
         cwl $$0 = this.by.h();
         if ($$0.b(this.by) != cwr.d) {
            return null;
         } else {
            return $$0.a(this.by, this) - this.bz < 5 ? null : this.by;
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
      return super.cl() || !this.fJ() && this.c(bvt.b);
   }

   public int fK() {
      return this.bA;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dA();
      double $$5 = this.dC();
      double $$6 = this.dG();
      double $$7 = $$1;
      boolean $$8 = false;
      ji $$9 = ji.a($$0, $$1, $$2);
      dgi $$10 = this.dV();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.L_()) {
            ji $$12 = $$9.e();
            dwx $$13 = $$10.a_($$12);
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

         if (this instanceof bvp $$14) {
            $$14.P().m();
         }

         return true;
      }
   }

   public boolean fL() {
      return !this.eE();
   }

   public boolean fM() {
      return true;
   }

   public void a(ji $$0, boolean $$1) {
   }

   public boolean fN() {
      return false;
   }

   @Override
   public final buo a(bvt $$0) {
      return $$0 == bvt.c ? aD : this.e($$0).a(this.ej());
   }

   protected buo e(bvt $$0) {
      return this.aq().n().a(this.ei());
   }

   public ImmutableList<bvt> fO() {
      return ImmutableList.of(bvt.a);
   }

   public fav f(bvt $$0) {
      buo $$1 = this.a($$0);
      return new fav((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bvt $$0) {
      fav $$1 = this.a($$0).a(this.dt());
      return this.dV().b(this, $$1);
   }

   @Override
   public boolean o(boolean $$0) {
      return super.o($$0) && !this.fR();
   }

   public Optional<ji> fP() {
      return this.al.a(bP);
   }

   public void g(ji $$0) {
      this.al.a(bP, Optional.of($$0));
   }

   public void fQ() {
      this.al.a(bP, Optional.empty());
   }

   public boolean fR() {
      return this.fP().isPresent();
   }

   public void b(ji $$0) {
      if (this.bZ()) {
         this.ae();
      }

      dwx $$1 = this.dV().a_($$0);
      if ($$1.b() instanceof djf) {
         this.dV().a($$0, $$1.b(djf.c, Boolean.valueOf(true)), 3);
      }

      this.b(bvt.c);
      this.a($$0);
      this.g($$0);
      this.i(fba.c);
      this.ar = true;
   }

   private void a(ji $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean O() {
      return this.fP().map($$0 -> this.dV().a_($$0).b() instanceof djf).orElse(false);
   }

   public void fS() {
      this.fP().filter(this.dV()::B).ifPresent($$0x -> {
         dwx $$1 = this.dV().a_($$0x);
         if ($$1.b() instanceof djf) {
            jn $$2 = $$1.c(djf.aF);
            this.dV().a($$0x, $$1.b(djf.c, Boolean.valueOf(false)), 3);
            fba $$3 = djf.a(this.aq(), this.dV(), $$0x, $$2, this.dL()).orElseGet(() -> {
               ji $$1x = $$0x.d();
               return new fba((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            fba $$4 = fba.c($$0x).d($$3).d();
            float $$5 = (float)ayz.d(ayz.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.v($$5);
            this.w(0.0F);
         }
      });
      fba $$0 = this.dt();
      this.b(bvt.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fQ();
   }

   @Nullable
   public jn fT() {
      ji $$0 = this.fP().orElse(null);
      return $$0 != null ? djf.a(this.dV(), $$0) : null;
   }

   @Override
   public boolean bM() {
      return !this.fR() && super.bM();
   }

   public cwp d(cwp $$0) {
      return cwp.j;
   }

   private static byte i(but $$0) {
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

   public void a(cwl $$0, but $$1) {
      this.dV().a(this, i($$1));
      this.a(this.a($$1), $$1, this.bR);
   }

   private void a(cwp $$0, but $$1, bwm $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         bwl $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      ddb.a($$0, this, $$1);
   }

   public static but d(bsj $$0) {
      return $$0 == bsj.a ? but.a : but.b;
   }

   public final boolean e(cwp $$0) {
      if (this.bL() && !this.Z_()) {
         deu $$1 = $$0.a(kv.D);
         if ($$1 != null && $$1.f()) {
            but $$2 = $$1.a();
            return this.e($$2) && $$1.a(this.aq()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(but $$0) {
      return true;
   }

   public final but f(cwp $$0) {
      deu $$1 = $$0.a(kv.D);
      return $$1 != null && this.e($$1.a()) ? $$1.a() : but.a;
   }

   public final boolean a(cwp $$0, but $$1) {
      deu $$2 = $$0.a(kv.D);
      return $$2 == null ? $$1 == but.a && this.e(but.a) : $$1 == $$2.a() && this.e($$2.a()) && $$2.a(this.aq());
   }

   private static bvz a(bvh $$0, but $$1) {
      return $$1 != but.f && $$1 != but.a && $$1 != but.b ? bvz.a($$0, $$1, $$2 -> $$2.f() || $$0.f($$2) == $$1) : bvz.a($$0, $$1);
   }

   @Nullable
   private static but r(int $$0) {
      if ($$0 == 100 + but.f.b()) {
         return but.f;
      } else if ($$0 == 100 + but.e.b()) {
         return but.e;
      } else if ($$0 == 100 + but.d.b()) {
         return but.d;
      } else if ($$0 == 100 + but.c.b()) {
         return but.c;
      } else if ($$0 == 98) {
         return but.a;
      } else if ($$0 == 99) {
         return but.b;
      } else {
         return $$0 == 105 ? but.g : null;
      }
   }

   @Override
   public bvz a_(int $$0) {
      but $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dJ() {
      if (this.Z_()) {
         return false;
      } else {
         boolean $$0 = !this.a(but.f).a(awy.bq) && !this.a(but.e).a(awy.bq) && !this.a(but.d).a(awy.bq) && !this.a(but.c).a(awy.bq) && !this.a(but.g).a(awy.bq);
         return $$0 && super.dJ();
      }
   }

   @Override
   public boolean co() {
      return !this.dV().B_() && this.b(bts.x) || super.co();
   }

   @Override
   public float dM() {
      return this.aX;
   }

   @Override
   public void a(abm $$0) {
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
      return this.dZ().h() instanceof cur;
   }

   @Override
   public float dP() {
      float $$0 = (float)this.h(bwp.B);
      return this.cW() instanceof cox ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public fba m(bul $$0) {
      return this.dt().e(this.a($$0, this.a(this.aw()), this.ej() * this.ei()));
   }

   protected void a(int $$0, double $$1) {
      this.aZ = (float)ayz.e(1.0 / (double)$$0, (double)this.aZ, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(ayz.c((double)$$0 * this.h(bwp.h)));
   }

   public boolean fV() {
      return false;
   }

   public boolean a(ard $$0, btb $$1) {
      return this.d($$1) || ddb.a($$0, this, $$1);
   }

   public static boolean b(cwp $$0, but $$1) {
      if (!$$0.b(kv.F)) {
         return false;
      } else {
         deu $$2 = $$0.a(kv.D);
         return $$2 != null && $$1 == $$2.a() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fW() {
      return this.bd;
   }

   public static record a(avz a, avz b) {
   }
}

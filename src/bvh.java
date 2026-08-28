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
   private static final alj c = alj.b("powder_snow");
   private static final alj d = alj.b("sprinting");
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
   protected static final akm<Byte> aC = akq.a(bvh.class, ako.a);
   private static final akm<Float> bK = akq.a(bvh.class, ako.d);
   private static final akm<List<lq>> bL = akq.a(bvh.class, ako.m);
   private static final akm<Boolean> bM = akq.a(bvh.class, ako.k);
   private static final akm<Integer> bN = akq.a(bvh.class, ako.b);
   private static final akm<Integer> bO = akq.a(bvh.class, ako.b);
   private static final akm<Optional<jh>> bP = akq.a(bvh.class, ako.p);
   private static final int bQ = 15;
   protected static final buo aD = buo.c(0.2F, 0.2F).b(0.2F);
   public static final float aE = 0.5F;
   public static final float aF = 0.5F;
   public static final String aG = "attributes";
   private final bwm bR;
   private final bsy bS = new bsy(this);
   private final Map<jq<bto>, btq> bT = Maps.newHashMap();
   private final jz<cwm> bU = jz.a(2, cwm.k);
   private final jz<cwm> bV = jz.a(4, cwm.k);
   private cwm bW = cwm.k;
   public boolean aH;
   private boolean bX = false;
   public bsj aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public float aP;
   public float aQ;
   protected int aR;
   public final bwi aS = new bwi();
   public final int aT = 20;
   public final float aU;
   public final float aV;
   public float aW;
   public float aX;
   public float aY;
   public float aZ;
   public final buk ba = new buk(this);
   @Nullable
   protected cou bb;
   protected int bc;
   protected boolean bd;
   protected int be;
   protected float bf;
   protected float bg;
   protected float bh;
   protected float bi;
   protected float bj;
   protected int bk;
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
   protected cwm by = cwm.k;
   protected int bz;
   protected int bA;
   private jh cg;
   private Optional<jh> ch = Optional.empty();
   @Nullable
   private btb ci;
   private long cj;
   protected int bB;
   protected float bC;
   @Nullable
   protected cwm bD;
   private float ck;
   private float cl;
   protected bwj<?> bE;
   private boolean cm;
   private final EnumMap<but, Reference2ObjectMap<dcd, Set<dcv>>> cn = new EnumMap<>(but.class);
   protected float bF = 1.0F;

   protected bvh(bus<? extends bvh> $$0, dfm $$1) {
      super($$0, $$1);
      this.bR = new bwm(bwq.a($$0));
      this.x(this.eR());
      this.I = true;
      this.aV = (float)((Math.random() + 1.0) * 0.01F);
      this.ay();
      this.aU = (float)Math.random() * 12398.0F;
      this.v((float)(Math.random() * (float) (Math.PI * 2)));
      this.aY = this.dL();
      uz $$2 = uz.a;
      this.bE = this.a(new Dynamic($$2, (vi)$$2.createMap(ImmutableMap.of($$2.a("memories"), (vi)$$2.emptyMap()))));
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
   public void c(arp $$0) {
      this.a($$0, this.dW().y(), Float.MAX_VALUE);
   }

   public boolean a(bus<?> $$0) {
      return true;
   }

   @Override
   protected void a(akq.a $$0) {
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
   protected void a(double $$0, boolean $$1, dvv $$2, jh $$3) {
      if (!this.bj()) {
         this.br();
      }

      if (this.dV() instanceof arp $$4 && $$1 && this.Z > 0.0F) {
         this.b($$4, $$3);
         double $$5 = this.h(bwp.x);
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

            float $$13 = (float)azm.c((double)this.Z - $$5);
            double $$14 = Math.min((double)(0.2F + $$13 / 15.0F), 2.5);
            int $$15 = (int)(150.0 * $$14);
            $$4.a(new lk(ls.b, $$2), $$6, $$7, $$8, $$15, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.ch = Optional.empty();
      }
   }

   public final boolean ee() {
      return this.aq().a(axg.m);
   }

   public float a(float $$0) {
      return azm.h($$0, this.cl, this.ck);
   }

   public boolean ef() {
      return this.dy().b() < 1.0E-5F && this.bn();
   }

   @Override
   public void az() {
      this.aP = this.aQ;
      if (this.ak) {
         this.fN().ifPresent(this::a);
      }

      if (this.dV() instanceof arp $$0) {
         dcf.b($$0, this);
      }

      super.az();
      bou $$1 = bot.a();
      $$1.a("livingEntityBaseTick");
      if (this.bi() || this.dV().C) {
         this.aH();
      }

      if (this.bL()) {
         boolean $$2 = this instanceof cou;
         if (this.dV() instanceof arp $$3) {
            if (this.bM()) {
               this.a($$3, this.dW().g(), 1.0F);
            } else if ($$2 && !this.dV().E_().a(this.cR())) {
               double $$4 = this.dV().E_().a(this) + this.dV().E_().n();
               if ($$4 < 0.0) {
                  double $$5 = this.dV().E_().o();
                  if ($$5 > 0.0) {
                     this.a($$3, this.dW().x(), (float)Math.max(1, azm.a(-$$4 * $$5)));
                  }
               }
            }
         }

         if (this.a(axi.a) && !this.dV().a_(jh.a(this.dA(), this.dE(), this.dG())).a(dis.nd)) {
            boolean $$6 = !this.ee() && !btr.c(this) && (!$$2 || !((cou)this).gh().a);
            if ($$6) {
               this.j(this.l(this.ct()));
               if (this.ct() == -20) {
                  this.j(0);
                  ezy $$7 = this.dy();

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

         if (this.dV() instanceof arp $$12) {
            jh $$13 = this.dv();
            if (!Objects.equal(this.cg, $$13)) {
               this.cg = $$13;
               this.b($$12, $$13);
            }
         }
      }

      if (this.bL() && (this.bl() || this.av)) {
         this.aN();
      }

      if (this.aM > 0) {
         this.aM--;
      }

      if (this.aj > 0 && !(this instanceof arq)) {
         this.aj--;
      }

      if (this.eE() && this.dV().h(this)) {
         this.el();
      }

      if (this.bc > 0) {
         this.bc--;
      } else {
         this.bb = null;
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
      this.bi = this.bh;
      this.aX = this.aW;
      this.aZ = this.aY;
      this.N = this.dL();
      this.O = this.dN();
      $$1.c();
   }

   @Override
   protected float aT() {
      return azm.h((float)this.h(bwp.u), super.aT(), 1.0F);
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

   protected void b(arp $$0, jh $$1) {
      dcf.a($$0, this);
   }

   public boolean e_() {
      return false;
   }

   public float ei() {
      return this.e_() ? 0.5F : 1.0F;
   }

   public final float ej() {
      bwm $$0 = this.eW();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bwp.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean ek() {
      return true;
   }

   protected void el() {
      this.aO++;
      if (this.aO >= 20 && !this.dV().A_() && !this.dQ()) {
         this.dV().a(this, (byte)60);
         this.a(bul.c.a);
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

   public final int a(arp $$0, @Nullable bul $$1) {
      return dcf.a($$0, $$1, this, this.e($$0));
   }

   protected int e(arp $$0) {
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

   public void c(@Nullable cou $$0) {
      this.bb = $$0;
      this.bc = this.af;
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
      return this.be;
   }

   public void n(int $$0) {
      this.be = $$0;
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

   public void a(but $$0, cwm $$1, cwm $$2) {
      if (!this.dV().A_() && !this.Y_()) {
         boolean $$3 = $$2.f() && $$1.f();
         if (!$$3 && !cwm.c($$1, $$2) && !this.ak) {
            ddy $$4 = $$2.a(ku.D);
            if (!this.bb() && $$4 != null && $$0 == $$4.a()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), $$4.b(), this.dm(), 1.0F, 1.0F, this.ae.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? ear.v : ear.S);
            }
         }
      }
   }

   @Override
   public void a(bul.c $$0) {
      if (($$0 == bul.c.a || $$0 == bul.c.b) && this.dV() instanceof arp $$1) {
         this.a($$1, $$0);
      }

      super.a($$0);
      this.bE.a();
   }

   protected void a(arp $$0, bul.c $$1) {
      for (btq $$2 : this.eA()) {
         $$2.a($$0, this, $$1);
      }

      this.bT.clear();
   }

   @Override
   public void b(ul $$0) {
      $$0.a("Health", this.eD());
      $$0.a("HurtTime", (short)this.aM);
      $$0.a("HurtByTimestamp", this.ca);
      $$0.a("DeathTime", (short)this.aO);
      $$0.a("AbsorptionAmount", this.fu());
      $$0.a("attributes", this.eW().d());
      if (!this.bT.isEmpty()) {
         ur $$1 = new ur();

         for (btq $$2 : this.bT.values()) {
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
      DataResult<vi> $$3 = this.bE.a(uz.a);
      $$3.resultOrPartial(a::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(ul $$0) {
      this.F($$0.j("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dV() != null && !this.dV().C) {
         this.eW().a($$0.c("attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         ur $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ul $$3 = $$1.a($$2);
            btq $$4 = btq.a($$3);
            if ($$4 != null) {
               this.bT.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.x($$0.j("Health"));
      }

      this.aM = $$0.g("HurtTime");
      this.aO = $$0.g("DeathTime");
      this.ca = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         fbd $$6 = this.dV().P();
         fay $$7 = $$6.b($$5);
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
         this.al.a(aq, bvt.c);
         if (!this.ak) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bE = this.a(new Dynamic(uz.a, $$0.c("Brain")));
      }
   }

   protected void ev() {
      Iterator<jq<bto>> $$0 = this.bT.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jq<bto> $$1 = $$0.next();
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
            this.t();
         }

         this.bY = false;
      }

      List<lq> $$3 = this.al.a(bL);
      if (!$$3.isEmpty()) {
         boolean $$4 = this.al.a(bM);
         int $$5 = this.cp() ? 15 : 4;
         int $$6 = $$4 ? 5 : 1;
         if (this.ae.a($$5 * $$6) == 0) {
            this.dV().a(ae.a($$3, this.ae), this.d(0.5), this.dD(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void K() {
      if (this.bT.isEmpty()) {
         this.ey();
         this.k(false);
      } else {
         this.k(this.b(bts.n));
         this.n();
      }
   }

   private void n() {
      List<lq> $$0 = this.bT.values().stream().filter(btq::g).map(btq::a).toList();
      this.al.a(bL, $$0);
      this.al.a(bM, d(this.bT.values()));
   }

   private void t() {
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
         float $$2 = this.fd();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cwm $$3 = this.a(but.f);
         bus<?> $$4 = $$0.aq();
         if ($$4 == bus.bb && $$3.a(cwq.uD)
            || $$4 == bus.bK && $$3.a(cwq.uG)
            || $$4 == bus.aO && $$3.a(cwq.uJ)
            || $$4 == bus.aP && $$3.a(cwq.uJ)
            || $$4 == bus.D && $$3.a(cwq.uH)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bvh $$0) {
      return $$0 instanceof cou && this.dV().ak() == bsh.a ? false : $$0.ew();
   }

   public boolean ew() {
      return !this.cC() && this.ex();
   }

   public boolean ex() {
      return !this.Y_() && this.bL();
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
         Map<jq<bto>, btq> $$0 = Maps.newHashMap(this.bT);
         this.bT.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<btq> eA() {
      return this.bT.values();
   }

   public Map<jq<bto>, btq> eB() {
      return this.bT;
   }

   public boolean b(jq<bto> $$0) {
      return this.bT.containsKey($$0);
   }

   @Nullable
   public btq c(jq<bto> $$0) {
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
      if (this.aq().a(axg.G)) {
         return !$$0.a(bts.M);
      } else if (this.aq().a(axg.F)) {
         return !$$0.a(bts.L);
      } else {
         return !this.aq().a(axg.w) ? true : !$$0.a(bts.j) && !$$0.a(bts.s);
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
      return this.aq().a(axg.x);
   }

   @Nullable
   public btq d(jq<bto> $$0) {
      return this.bT.remove($$0);
   }

   public boolean e(jq<bto> $$0) {
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
         $$0.c().a().a(this.eW(), $$0.e());
         this.c($$0);
      }
   }

   public void c(btq $$0) {
      for (bul $$1 : this.cZ()) {
         if ($$1 instanceof arq $$2) {
            $$2.f.b(new agp(this.ar(), $$0, false));
         }
      }
   }

   protected void a(btq $$0, boolean $$1, @Nullable bul $$2) {
      this.bY = true;
      if ($$1 && !this.dV().C) {
         bto $$3 = $$0.c().a();
         $$3.a(this.eW());
         $$3.a(this.eW(), $$0.e());
         this.B();
      }

      if (!this.dV().C) {
         this.c($$0);
      }
   }

   protected void c(Collection<btq> $$0) {
      this.bY = true;
      if (!this.dV().C) {
         for (btq $$1 : $$0) {
            $$1.c().a().a(this.eW());

            for (bul $$2 : this.cZ()) {
               if ($$2 instanceof arq $$3) {
                  $$3.f.b(new aes(this.ar(), $$1.c()));
               }
            }
         }

         this.B();
      }
   }

   private void B() {
      Set<bwl> $$0 = this.eW().b();

      for (bwl $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jq<bwk> $$0) {
      if ($$0.a(bwp.s)) {
         float $$1 = this.eR();
         if (this.eD() > $$1) {
            this.x($$1);
         }
      } else if ($$0.a(bwp.r)) {
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
      return this.al.a(bK);
   }

   public void x(float $$0) {
      this.al.a(bK, azm.a($$0, 0.0F, this.eR()));
   }

   public boolean eE() {
      return this.eD() <= 0.0F;
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.eE()) {
         return false;
      } else if ($$1.a(axe.i) && this.b(bts.l)) {
         return false;
      } else {
         if (this.fP()) {
            this.fQ();
         }

         this.be = 0;
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
            if (!$$1.a(axe.j) && $$1.c() instanceof bvh $$7) {
               this.d($$7);
            }

            $$4 = true;
         }

         if ($$1.a(axe.o) && this.aq().a(axg.l)) {
            $$2 *= 5.0F;
         }

         if ($$1.a(axe.a) && !this.a(but.f).f()) {
            this.d($$1, $$2);
            $$2 *= 0.75F;
         }

         this.aS.a(1.5F);
         if (Float.isNaN($$2) || Float.isInfinite($$2)) {
            $$2 = Float.MAX_VALUE;
         }

         boolean $$8 = true;
         if ((float)this.aj > 10.0F && !$$1.a(axe.e)) {
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
            this.aN = 10;
            this.aM = this.aN;
         }

         bul $$9 = $$1.d();
         if ($$9 != null) {
            if ($$9 instanceof bvh $$10 && !$$1.a(axe.q) && (!$$1.a(bte.I) || !this.aq().a(axg.E))) {
               this.a($$10);
            }

            if ($$9 instanceof cou $$11) {
               this.bc = 100;
               this.bb = $$11;
            } else if ($$9 instanceof cib $$12 && $$12.n()) {
               this.bc = 100;
               if ($$12.ag_() instanceof cou $$13) {
                  this.bb = $$13;
               } else {
                  this.bb = null;
               }
            }
         }

         if ($$8) {
            if ($$4) {
               $$0.a(this, (byte)29);
            } else {
               $$0.a(this, $$1);
            }

            if (!$$1.a(axe.r) && (!$$4 || $$2 > 0.0F)) {
               this.bD();
            }

            if (!$$1.a(axe.z)) {
               double $$14 = 0.0;
               double $$15 = 0.0;
               if ($$1.c() instanceof cpn $$16) {
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
                  this.b(this.n_());
               }

               this.a($$1);
            }
         } else if ($$8) {
            this.f($$1);
         }

         boolean $$18 = !$$4 || $$2 > 0.0F;
         if ($$18) {
            this.ci = $$1;
            this.cj = this.dV().ab();

            for (btq $$19 : this.eA()) {
               $$19.a($$0, this, $$1, $$2);
            }
         }

         if (this instanceof arq $$20) {
            ao.i.a($$20, $$1, $$3, $$2, $$4);
            if ($$5 > 0.0F && $$5 < 3.4028235E37F) {
               $$20.a(awx.K, Math.round($$5 * 10.0F));
            }
         }

         if ($$9 instanceof arq $$21) {
            ao.h.a($$21, this, $$1, $$3, $$2, $$4);
         }

         return $$18;
      }
   }

   protected void d(bvh $$0) {
      $$0.e(this);
   }

   protected void e(bvh $$0) {
      $$0.p(0.5, $$0.dA() - this.dA(), $$0.dG() - this.dG());
   }

   private boolean h(btb $$0) {
      if ($$0.a(axe.d)) {
         return false;
      } else {
         cwm $$1 = null;
         cyy $$2 = null;

         for (bsj $$3 : bsj.values()) {
            cwm $$4 = this.b($$3);
            $$2 = $$4.a(ku.H);
            if ($$2 != null) {
               $$1 = $$4.v();
               $$4.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof arq $$5) {
               $$5.b(awx.c.b($$1.h()));
               ao.C.a($$5, $$1);
               this.a(ear.C);
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
      if (this.dV().ab() - this.cj > 40L) {
         this.ci = null;
      }

      return this.ci;
   }

   protected void f(btb $$0) {
      this.b(this.e($$0));
   }

   public void b(@Nullable awm $$0) {
      if ($$0 != null) {
         this.a($$0, this.fe(), this.ff());
      }
   }

   public boolean g(btb $$0) {
      bul $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cpb $$3 && $$3.w() > 0) {
         $$2 = true;
      }

      if (!$$0.a(axe.c) && this.fE() && !$$2) {
         ezy $$4 = $$0.i();
         if ($$4 != null) {
            ezy $$5 = this.c(0.0F, this.cA());
            ezy $$6 = $$4.a(this.dt());
            $$6 = new ezy($$6.d, 0.0, $$6.f).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void g(cwm $$0) {
      if (!$$0.f()) {
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), $$0.M(), this.dm(), 0.8F, 0.8F + this.dV().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(btb $$0) {
      if (!this.dQ() && !this.bd) {
         bul $$1 = $$0.d();
         bvh $$2 = this.eQ();
         if (this.bk >= 0 && $$2 != null) {
            $$2.a(this, this.bk, $$0);
         }

         if (this.fP()) {
            this.fQ();
         }

         if (!this.dV().C && this.k_()) {
            a.info("Named entity {} died: {}", this, this.eP().a().getString());
         }

         this.bd = true;
         this.eP().c();
         if (this.dV() instanceof arp $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(ear.p);
               this.b($$3, $$0);
               this.f($$2);
            }

            this.dV().a(this, (byte)3);
         }

         this.b(bvt.h);
      }
   }

   protected void f(@Nullable bvh $$0) {
      if (this.dV() instanceof arp $$1) {
         boolean var6 = false;
         if ($$0 instanceof ckp) {
            if ($$1.N().b(dfi.c)) {
               jh $$4 = this.dv();
               dvv $$5 = dis.cd.m();
               if (this.dV().a_($$4).l() && $$5.a((dfp)this.dV(), $$4)) {
                  this.dV().a($$4, $$5, 3);
                  var6 = true;
               }
            }

            if (!var6) {
               clc $$6 = new clc(this.dV(), this.dA(), this.dC(), this.dG(), new cwm(cwq.dw));
               this.dV().b($$6);
            }
         }
      }
   }

   protected void b(arp $$0, btb $$1) {
      boolean $$2 = this.bc > 0;
      if (this.en() && $$0.N().b(dfi.f)) {
         this.b($$0, $$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.f($$0);
      this.b($$0, $$1.d());
   }

   protected void f(arp $$0) {
   }

   protected void b(arp $$0, @Nullable bul $$1) {
      if (!this.eI() && (this.eo() || this.bc > 0 && this.em() && $$0.N().b(dfi.f))) {
         bux.a($$0, this.dt(), this.a($$0, $$1));
      }
   }

   protected void a(arp $$0, btb $$1, boolean $$2) {
   }

   public long eG() {
      return 0L;
   }

   protected float a(bul $$0, btb $$1) {
      float $$2 = (float)this.h(bwp.d);
      return this.dV() instanceof arp $$3 ? dcf.d($$3, this.dZ(), $$0, $$1, $$2) : $$2;
   }

   protected void b(arp $$0, btb $$1, boolean $$2) {
      Optional<ali<eus>> $$3 = this.ea();
      if (!$$3.isEmpty()) {
         eus $$4 = $$0.p().bc().b($$3.get());
         euq.a $$5 = new euq.a($$0).a(exj.a, this).a(exj.f, this.dt()).a(exj.c, $$1).b(exj.d, $$1.d()).b(exj.e, $$1.c());
         if ($$2 && this.bb != null) {
            $$5 = $$5.a(exj.b, this.bb).a(this.bb.gD());
         }

         euq $$6 = $$5.a(exi.g);
         $$4.a($$6, this.eG(), $$1x -> this.a($$0, $$1x));
      }
   }

   public boolean a(arp $$0, ali<eus> $$1, BiConsumer<arp, cwm> $$2) {
      return this.a($$0, $$1, $$0x -> $$0x.a(exj.f, this.dt()).a(exj.a, this).a(exi.j), $$2);
   }

   protected void a(arp $$0, ali<eus> $$1, cwm $$2, BiConsumer<arp, cwm> $$3) {
      this.a($$0, $$1, $$1x -> $$1x.a(exj.f, this.dt()).a(exj.a, this).a(exj.i, $$2).a(exi.s), $$3);
   }

   protected boolean a(arp $$0, ali<eus> $$1, Function<euq.a, euq> $$2, BiConsumer<arp, cwm> $$3) {
      eus $$4 = $$0.p().bc().b($$1);
      euq $$5 = $$2.apply(new euq.a($$0));
      List<cwm> $$6 = $$4.a($$5);
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
         ezy $$3 = this.dy();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         ezy $$4 = new ezy($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aJ() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected awm e(btb $$0) {
      return awn.kh;
   }

   @Nullable
   protected awm n_() {
      return awn.kc;
   }

   private awm q(int $$0) {
      return $$0 > 4 ? this.eL().b() : this.eL().a();
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

   protected ezt eK() {
      ezt $$0 = this.cR();
      bul $$1 = this.dk();
      if ($$1 != null) {
         ezy $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dcd, Set<dcv>> c(but $$0) {
      return (Map<dcd, Set<dcv>>)this.cn.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public bvh.a eL() {
      return new bvh.a(awn.ki, awn.ka);
   }

   public Optional<jh> eM() {
      return this.ch;
   }

   public boolean p_() {
      if (this.Y_()) {
         return false;
      } else {
         jh $$0 = this.dv();
         dvv $$1 = this.dw();
         if ($$1.a(axc.aR)) {
            this.ch = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof drd && this.c($$0, $$1)) {
            this.ch = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(jh $$0, dvv $$1) {
      if (!$$1.c(drd.b)) {
         return false;
      } else {
         dvv $$2 = this.dV().a_($$0.e());
         return $$2.a(dis.cO) && $$2.c(dmv.b) == $$1.c(drd.aF);
      }
   }

   @Override
   public boolean bL() {
      return !this.dQ() && this.eD() > 0.0F;
   }

   @Override
   public int cE() {
      return this.y(0.0F);
   }

   protected final int y(float $$0) {
      return azm.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, btb $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.e($$0, $$1);
      if ($$4 > 0) {
         this.a(this.q($$4), 1.0F, 1.0F);
         this.eN();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int e(float $$0, float $$1) {
      if (this.aq().a(axg.o)) {
         return 0;
      } else {
         float $$2 = (float)this.h(bwp.x);
         float $$3 = $$0 - $$2;
         return azm.c((double)($$3 * $$1) * this.h(bwp.k));
      }
   }

   protected void eN() {
      if (!this.bb()) {
         int $$0 = azm.a(this.dA());
         int $$1 = azm.a(this.dC() - 0.2F);
         int $$2 = azm.a(this.dG());
         dvv $$3 = this.dV().a_(new jh($$0, $$1, $$2));
         if (!$$3.l()) {
            dqd $$4 = $$3.A();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void p(float $$0) {
      this.aN = 10;
      this.aM = this.aN;
   }

   public int eO() {
      return azm.a(this.h(bwp.a));
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
            cwm $$5 = this.a($$4);
            ddy $$6 = $$5.a(ku.D);
            if ($$6 != null && $$6.g() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float e(btb $$0, float $$1) {
      if (!$$0.a(axe.b)) {
         this.c($$0, $$1);
         $$1 = bsx.a(this, $$1, $$0, (float)this.eO(), (float)this.h(bwp.b));
      }

      return $$1;
   }

   protected float f(btb $$0, float $$1) {
      if ($$0.a(axe.f)) {
         return $$1;
      } else {
         if (this.b(bts.k) && !$$0.a(axe.g)) {
            int $$2 = (this.c(bts.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof arq) {
                  ((arq)this).a(awx.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof arq) {
                  ((arq)$$0.d()).a(awx.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(axe.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dV() instanceof arp $$7) {
               $$8 = dcf.b($$7, this, $$0);
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

   protected void b(arp $$0, btb $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var10 = Math.max($$2 - this.fu(), 0.0F);
         this.E(this.fu() - ($$2 - var10));
         float $$4 = $$2 - var10;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F && $$1.d() instanceof arq $$5) {
            $$5.a(awx.H, Math.round($$4 * 10.0F));
         }

         if (var10 != 0.0F) {
            this.eP().a($$1, var10);
            this.x(this.eD() - var10);
            this.E(this.fu() - var10);
            this.a(ear.o);
         }
      }
   }

   public bsy eP() {
      return this.bS;
   }

   @Nullable
   public bvh eQ() {
      if (this.bb != null) {
         return this.bb;
      } else {
         return this.bZ != null ? this.bZ : null;
      }
   }

   public final float eR() {
      return (float)this.h(bwp.s);
   }

   public final float eS() {
      return (float)this.h(bwp.r);
   }

   public final int eT() {
      return this.al.a(bN);
   }

   public final void o(int $$0) {
      this.al.a(bN, $$0);
   }

   public final int eU() {
      return this.al.a(bO);
   }

   public final void p(int $$0) {
      this.al.a(bO, $$0);
   }

   private int C() {
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
      if (!this.aH || this.aJ >= this.C() / 2 || this.aJ < 0) {
         this.aJ = -1;
         this.aH = true;
         this.aI = $$0;
         if (this.dV() instanceof arp) {
            aci $$2 = new aci(this, $$0 == bsj.a ? 0 : 3);
            arm $$3 = ((arp)this.dV()).m();
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
      this.aS.a(1.5F);
      this.aj = 20;
      this.aN = 10;
      this.aM = this.aN;
      awm $$1 = this.e($$0);
      if ($$1 != null) {
         this.a($$1, this.fe(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }

      this.ci = $$0;
      this.cj = this.dV().ab();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            awm $$1 = this.n_();
            if ($$1 != null) {
               this.a($$1, this.fe(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cou)) {
               this.x(0.0F);
               this.a(this.dW().p());
            }
            break;
         case 29:
            this.a(awn.wC, 1.0F, 0.8F + this.dV().A.i() * 0.4F);
            break;
         case 30:
            this.a(awn.wD, 0.8F, 0.8F + this.dV().A.i() * 0.4F);
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
               this.dV().a(ls.ac, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
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
            dmj.b(this);
            break;
         case 55:
            this.E();
            break;
         case 60:
            this.D();
            break;
         case 65:
            this.g(this.a(but.g));
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
         this.dV().a(ls.ab, this.d(1.0), this.dD(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void E() {
      cwm $$0 = this.a(but.b);
      this.a(but.b, this.a(but.a));
      this.a(but.a, $$0);
   }

   @Override
   protected void aI() {
      this.a(this.dW().o(), 4.0F);
   }

   protected void eV() {
      int $$0 = this.C();
      if (this.aH) {
         this.aJ++;
         if (this.aJ >= $$0) {
            this.aJ = 0;
            this.aH = false;
         }
      } else {
         this.aJ = 0;
      }

      this.aQ = (float)this.aJ / (float)$$0;
   }

   @Nullable
   public bwl g(jq<bwk> $$0) {
      return this.eW().a($$0);
   }

   public double h(jq<bwk> $$0) {
      return this.eW().c($$0);
   }

   public double i(jq<bwk> $$0) {
      return this.eW().d($$0);
   }

   public bwm eW() {
      return this.bR;
   }

   public cwm eX() {
      return this.a(but.a);
   }

   public cwm eY() {
      return this.a(but.b);
   }

   public cwm a(bvb $$0) {
      return this.fw() == $$0 ? this.eX() : this.eY();
   }

   @Nonnull
   @Override
   public cwm dZ() {
      return this.eX();
   }

   public boolean b(cwi $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cwm> $$0) {
      return $$0.test(this.eX()) || $$0.test(this.eY());
   }

   public cwm b(bsj $$0) {
      if ($$0 == bsj.a) {
         return this.a(but.a);
      } else if ($$0 == bsj.b) {
         return this.a(but.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bsj $$0, cwm $$1) {
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

   public abstract Iterable<cwm> eZ();

   public abstract cwm a(but var1);

   public abstract void a(but var1, cwm var2);

   public Iterable<cwm> fa() {
      return List.of();
   }

   public Iterable<cwm> fb() {
      return this.eZ();
   }

   public Iterable<cwm> fc() {
      return Iterables.concat(this.fa(), this.fb());
   }

   protected void c(cwm $$0) {
      $$0.h().l($$0);
   }

   public float fd() {
      Iterable<cwm> $$0 = this.eZ();
      int $$1 = 0;
      int $$2 = 0;

      for (cwm $$3 : $$0) {
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
   public void h(bul $$0) {
      if (!this.fP()) {
         super.h($$0);
      }
   }

   private void c(bul $$0) {
      ezy $$1;
      if (this.dQ()) {
         $$1 = this.dt();
      } else if (!$$0.dQ() && !this.dV().a_($$0.dv()).a(axc.aL)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dC(), $$0.dC());
         $$1 = new ezy(this.dA(), $$2, this.dG());
         boolean $$4 = this.dq() <= 4.0F && this.dr() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.dr() / 2.0;
            ezy $$6 = $$1.b(0.0, $$5, 0.0);
            fas $$7 = fap.a(ezt.a($$6, (double)this.dq(), (double)this.dr(), (double)this.dq()));
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
      return (float)this.h(bwp.o) * $$0 * this.aS() + this.fi();
   }

   public float fi() {
      return this.b(bts.h) ? 0.1F * ((float)this.c(bts.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void s() {
      float $$0 = this.fh();
      if (!($$0 <= 1.0E-5F)) {
         ezy $$1 = this.dy();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.cj()) {
            float $$2 = this.dL() * (float) (Math.PI / 180.0);
            this.i(new ezy((double)(-azm.a($$2)) * 0.2, 0.0, (double)azm.b($$2) * 0.2));
         }

         this.ar = true;
      }
   }

   protected void fj() {
      this.h(this.dy().b(0.0, -0.04F, 0.0));
   }

   protected void c(axs<eru> $$0) {
      this.h(this.dy().b(0.0, 0.04F, 0.0));
   }

   protected float fk() {
      return 0.8F;
   }

   public boolean a(erv $$0) {
      return false;
   }

   @Override
   protected double bd() {
      return this.h(bwp.n);
   }

   protected double fl() {
      boolean $$0 = this.dy().e <= 0.0;
      return $$0 && this.b(bts.B) ? Math.min(this.be(), 0.01) : this.be();
   }

   public void a_(ezy $$0) {
      if (this.di()) {
         erv $$1 = this.dV().b_(this.dv());
         if ((this.bj() || this.bx()) && this.ek() && !this.a($$1)) {
            this.l($$0);
         } else if (this.fH()) {
            this.F();
         } else {
            this.k($$0);
         }
      }
   }

   private void k(ezy $$0) {
      jh $$1 = this.aQ();
      float $$2 = this.aJ() ? this.dV().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      ezy $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      btq $$6 = this.c(bts.y);
      if ($$6 != null) {
         $$5 += (0.05 * (double)($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.dV().C || this.dV().B($$1)) {
         $$5 -= this.fl();
      } else if (this.dC() > (double)this.dV().K_()) {
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

   private void l(ezy $$0) {
      boolean $$1 = this.dy().e <= 0.0;
      double $$2 = this.dC();
      double $$3 = this.fl();
      if (this.bj()) {
         float $$4 = this.cj() ? 0.9F : this.fk();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bwp.F);
         if (!this.aJ()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fn() - $$5) * $$6;
         }

         if (this.b(bts.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bvl.a, this.dy());
         ezy $$7 = this.dy();
         if (this.P && this.p_()) {
            $$7 = new ezy($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.h(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bvl.a, this.dy());
         if (this.b(axi.b) <= this.dp()) {
            this.h(this.dy().d(0.5, 0.8F, 0.5));
            ezy $$8 = this.a($$3, $$1, this.dy());
            this.h($$8);
         } else {
            this.h(this.dy().c(0.5));
         }

         if ($$3 != 0.0) {
            this.h(this.dy().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      ezy $$9 = this.dy();
      if (this.P && this.g($$9.d, $$9.e + 0.6F - this.dC() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void F() {
      ezy $$0 = this.dy();
      double $$1 = $$0.i();
      this.h(this.m($$0));
      this.a(bvl.a, this.dy());
      if (!this.dV().C) {
         double $$2 = this.dy().i();
         this.c($$1, $$2);
      }
   }

   private ezy m(ezy $$0) {
      ezy $$1 = this.bT();
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

   private void c(cou $$0, ezy $$1) {
      ezy $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.di()) {
         this.C(this.e($$0));
         this.a_($$2);
      } else {
         this.h(ezy.c);
      }
   }

   protected void a(cou $$0, ezy $$1) {
   }

   protected ezy b(cou $$0, ezy $$1) {
      return $$1;
   }

   protected float e(cou $$0) {
      return this.fn();
   }

   public void s(boolean $$0) {
      float $$1 = (float)azm.g(this.dA() - this.K, $$0 ? this.dC() - this.L : 0.0, this.dG() - this.M);
      if (!this.bZ() && this.bL()) {
         this.B($$1);
      } else {
         this.aS.a();
      }
   }

   protected void B(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aS.a($$1, 0.4F, this.e_() ? 3.0F : 1.0F);
   }

   private ezy a(ezy $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.h(this.n(this.dy()));
      this.a(bvl.a, this.dy());
      ezy $$2 = this.dy();
      if ((this.P || this.bm) && (this.p_() || this.dw().a(dis.qP) && dok.a(this))) {
         $$2 = new ezy($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public ezy a(double $$0, boolean $$1, ezy $$2) {
      if ($$0 != 0.0 && !this.cj()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new ezy($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private ezy n(ezy $$0) {
      if (this.p_()) {
         this.k();
         float $$1 = 0.15F;
         double $$2 = azm.a($$0.d, -0.15F, 0.15F);
         double $$3 = azm.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dw().a(dis.nS) && this.fG() && this instanceof cou) {
            $$4 = 0.0;
         }

         $$0 = new ezy($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aJ() ? this.fn() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fm();
   }

   protected float fm() {
      return this.cX() instanceof cou ? this.fn() * 0.1F : 0.02F;
   }

   public float fn() {
      return this.cd;
   }

   public void C(float $$0) {
      this.cd = $$0;
   }

   public boolean c(arp $$0, bul $$1) {
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
            if (this.aK <= 0) {
               this.aK = 20 * (30 - $$0);
            }

            this.aK--;
            if (this.aK <= 0) {
               this.o($$0 - 1);
            }
         }

         int $$1 = this.eU();
         if ($$1 > 0) {
            if (this.aL <= 0) {
               this.aL = 20 * (30 - $$1);
            }

            this.aL--;
            if (this.aL <= 0) {
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
      float $$5 = this.aW;
      float $$6 = 0.0F;
      this.bf = this.bg;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)azm.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = azm.e(azm.h(this.dL()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aQ > 0.0F) {
         $$5 = this.dL();
      }

      if (!this.aJ()) {
         $$7 = 0.0F;
      }

      this.bg = this.bg + ($$7 - this.bg) * 0.3F;
      bou $$10 = bot.a();
      $$10.a("headTurn");
      $$6 = this.f($$5, $$6);
      $$10.c();
      $$10.a("rangeChecks");

      while (this.dL() - this.N < -180.0F) {
         this.N -= 360.0F;
      }

      while (this.dL() - this.N >= 180.0F) {
         this.N += 360.0F;
      }

      while (this.aW - this.aX < -180.0F) {
         this.aX -= 360.0F;
      }

      while (this.aW - this.aX >= 180.0F) {
         this.aX += 360.0F;
      }

      while (this.dN() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dN() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aY - this.aZ < -180.0F) {
         this.aZ -= 360.0F;
      }

      while (this.aY - this.aZ >= 180.0F) {
         this.aZ += 360.0F;
      }

      $$10.c();
      this.bh += $$6;
      if (this.fH()) {
         this.bA++;
      } else {
         this.bA = 0;
      }

      if (this.fP()) {
         this.w(0.0F);
      }

      this.B();
      float $$11 = this.ej();
      if ($$11 != this.bF) {
         this.bF = $$11;
         this.l_();
      }

      this.ba.a();
   }

   private void G() {
      Map<but, cwm> $$0 = this.H();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<but, cwm> H() {
      Map<but, cwm> $$0 = null;

      for (but $$1 : but.i) {
         cwm $$2 = switch ($$1.a()) {
            case a -> this.h($$1);
            case b -> this.g($$1);
            case c -> this.bW;
         };
         cwm $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(but.class);
            }

            $$0.put($$1, $$3);
            bwm $$4 = this.eW();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<but, cwm> $$5 : $$0.entrySet()) {
            but $$6 = $$5.getKey();
            cwm $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1) -> {
                  bwl $$2 = this.bR.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1.b());
                     $$2.b($$1);
                  }
               });
               if (this.dV() instanceof arp $$8) {
                  dcf.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(cwm $$0, cwm $$1) {
      return !cwm.a($$1, $$0);
   }

   private void a(Map<but, cwm> $$0) {
      cwm $$1 = $$0.get(but.a);
      cwm $$2 = $$0.get(but.b);
      if ($$1 != null && $$2 != null && cwm.a($$1, this.h(but.b)) && cwm.a($$2, this.h(but.a))) {
         ((arp)this.dV()).m().b(this, new adj(this, (byte)55));
         $$0.remove(but.a);
         $$0.remove(but.b);
         this.c(but.a, $$1.v());
         this.c(but.b, $$2.v());
      }
   }

   private void b(Map<but, cwm> $$0) {
      List<Pair<but, cwm>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cwm $$3 = $$2.v();
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
      ((arp)this.dV()).m().b(this, new afo(this.ar(), $$1));
   }

   private cwm g(but $$0) {
      return this.bV.get($$0.b());
   }

   private void b(but $$0, cwm $$1) {
      this.bV.set($$0.b(), $$1);
   }

   private cwm h(but $$0) {
      return this.bU.get($$0.b());
   }

   private void c(but $$0, cwm $$1) {
      this.bU.set($$0.b(), $$1);
   }

   protected float f(float $$0, float $$1) {
      float $$2 = azm.h($$0 - this.aW);
      this.aW += $$2 * 0.3F;
      float $$3 = azm.h(this.dL() - this.aW);
      float $$4 = this.fo();
      if (Math.abs($$3) > $$4) {
         this.aW = this.aW + ($$3 - (float)azm.j((double)$$3) * $$4);
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
      if (this.ce > 0) {
         this.ce--;
      }

      if (this.di()) {
         this.bq = 0;
         this.f(this.dA(), this.dC(), this.dG());
      }

      if (this.bq > 0) {
         this.a(this.bq, this.br, this.bs, this.bt, this.bu, this.bv);
         this.bq--;
      } else if (!this.dj()) {
         this.h(this.dy().c(0.98));
      }

      if (this.bx > 0) {
         this.a(this.bx, this.bw);
         this.bx--;
      }

      ezy $$0 = this.dy();
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
      bou $$4 = bot.a();
      $$4.a("ai");
      if (this.fg()) {
         this.bm = false;
         this.bn = 0.0F;
         this.bp = 0.0F;
      } else if (this.dj()) {
         $$4.a("newAi");
         this.fs();
         $$4.c();
      }

      $$4.c();
      $$4.a("jump");
      if (this.bm && this.ek()) {
         double $$5;
         if (this.bx()) {
            $$5 = this.b(axi.b);
         } else {
            $$5 = this.b(axi.a);
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
               this.c(axi.b);
            }
         } else {
            this.c(axi.a);
         }
      } else {
         this.ce = 0;
      }

      $$4.c();
      $$4.a("travel");
      this.bn *= 0.98F;
      this.bp *= 0.98F;
      if (this.fH()) {
         this.fq();
      }

      ezt $$9 = this.cR();
      ezy $$10 = new ezy((double)this.bn, (double)this.bo, (double)this.bp);
      if (this.b(bts.B) || this.b(bts.y)) {
         this.k();
      }

      label115: {
         if (this.cX() instanceof cou $$11 && this.bL()) {
            this.c($$11, $$10);
            break label115;
         }

         this.a_($$10);
      }

      if (!this.dV().A_() || this.di()) {
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
      if (this.dV() instanceof arp $$13 && this.af % 40 == 0 && this.cw() && this.dJ()) {
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
      if (this.dV() instanceof arp $$14 && this.fp() && this.bl()) {
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

         int $$0 = this.bA + 1;
         if ($$0 % 10 == 0) {
            int $$1 = $$0 / 10;
            if ($$1 % 2 == 0) {
               List<but> $$2 = but.i.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               but $$3 = ae.a($$2, this.ae);
               this.a($$3).a(1, this, $$3);
            }

            this.a(ear.n);
         }
      }
   }

   protected boolean fr() {
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

   protected void fs() {
   }

   protected void o() {
      if (!(this.dV() instanceof arp $$0)) {
         this.dV().a(eaf.a(cou.class), this.cR(), buq.a(this)).forEach(this::D);
      } else {
         List<bul> $$2 = this.dV().a(this, this.cR(), buq.a(this));
         if (!$$2.isEmpty()) {
            int $$3 = $$0.N().c(dfi.u);
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

   protected void a(ezt $$0, ezt $$1) {
      ezt $$2 = $$0.b($$1);
      List<bul> $$3 = this.dV().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bul $$4 : $$3) {
            if ($$4 instanceof bvh) {
               this.g((bvh)$$4);
               this.bB = 0;
               this.h(this.dy().c(-0.2));
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

   public boolean ft() {
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
      this.bf = this.bg;
      this.bg = 0.0F;
      this.k();
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
   public double f_() {
      return this.bq > 0 ? this.br : this.dA();
   }

   @Override
   public double P_() {
      return this.bq > 0 ? this.bs : this.dC();
   }

   @Override
   public double Q_() {
      return this.bq > 0 ? this.bt : this.dG();
   }

   @Override
   public float g_() {
      return this.bq > 0 ? (float)this.bv : this.dN();
   }

   @Override
   public float q_() {
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
      if ($$1 instanceof arq) {
         ao.R.a((arq)$$1, $$0.j(), this);
      }
   }

   public void a(bul $$0, int $$1) {
      if (!$$0.dQ() && !this.dV().C && ($$0 instanceof clc || $$0 instanceof cpb || $$0 instanceof bux)) {
         ((arp)this.dV()).m().b($$0, new agj($$0.ar(), this.ar(), $$1));
      }
   }

   public boolean E(bul $$0) {
      if ($$0.dV() != this.dV()) {
         return false;
      } else {
         ezy $$1 = new ezy(this.dA(), this.dE(), this.dG());
         ezy $$2 = new ezy($$0.dA(), $$0.dE(), $$0.dG());
         return $$2.f($$1) > 128.0 ? false : this.dV().a(new deu($$1, $$2, deu.a.a, deu.b.a, this)).d() == ezw.a.a;
      }
   }

   @Override
   public float i(float $$0) {
      return $$0 == 1.0F ? this.aY : azm.i($$0, this.aZ, this.aY);
   }

   public float D(float $$0) {
      float $$1 = this.aQ - this.aP;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aP + $$1 * $$0;
   }

   @Override
   public boolean bH() {
      return !this.dQ();
   }

   @Override
   public boolean bI() {
      return this.bL() && !this.Y_() && !this.p_();
   }

   @Override
   public float cA() {
      return this.aY;
   }

   @Override
   public void q(float $$0) {
      this.aY = $$0;
   }

   @Override
   public void r(float $$0) {
      this.aW = $$0;
   }

   @Override
   public ezy a(jm.a $$0, l.a $$1) {
      return j(super.a($$0, $$1));
   }

   public static ezy j(ezy $$0) {
      return new ezy($$0.d, $$0.e, 0.0);
   }

   public float fu() {
      return this.cf;
   }

   public final void E(float $$0) {
      this.F(azm.a($$0, 0.0F, this.eS()));
   }

   protected void F(float $$0) {
      this.cf = $$0;
   }

   public void h_() {
   }

   public void i_() {
   }

   protected void fv() {
      this.bY = true;
   }

   public abstract bvb fw();

   public boolean fx() {
      return (this.al.a(aC) & 1) > 0;
   }

   public bsj fy() {
      return (this.al.a(aC) & 2) > 0 ? bsj.b : bsj.a;
   }

   private void I() {
      if (this.fx()) {
         if (cwm.b(this.b(this.fy()), this.by)) {
            this.by = this.b(this.fy());
            this.a(this.by);
         } else {
            this.fD();
         }
      }
   }

   protected void a(cwm $$0) {
      $$0.b(this.dV(), this, this.fA());
      if (--this.bz == 0 && !this.dV().C && !$$0.x()) {
         this.w();
      }
   }

   private void J() {
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
      cwm $$1 = this.b($$0);
      if (!$$1.f() && !this.fx()) {
         this.by = $$1;
         this.bz = $$1.a(this);
         if (!this.dV().C) {
            this.c(1, true);
            this.c(2, $$0 == bsj.b);
            this.a(ear.D);
         }
      }
   }

   @Override
   public void a(akm<?> $$0) {
      super.a($$0);
      if (bP.equals($$0)) {
         if (this.dV().C) {
            this.fN().ifPresent(this::a);
         }
      } else if (aC.equals($$0) && this.dV().C) {
         if (this.fx() && this.by.f()) {
            this.by = this.b(this.fy());
            if (!this.by.f()) {
               this.bz = this.by.a(this);
            }
         } else if (!this.fx() && !this.by.f()) {
            this.by = cwm.k;
            this.bz = 0;
         }
      }
   }

   @Override
   public void a(fi.a $$0, ezy $$1) {
      super.a($$0, $$1);
      this.aZ = this.aY;
      this.aW = this.aY;
      this.aX = this.aW;
   }

   @Override
   public float t(float $$0) {
      return azm.h($$0, this.aX, this.aW);
   }

   public void b(cwm $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ezy $$3 = new ezy(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dN() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dL() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ae.i()) * 0.6 - 0.3;
         ezy $$5 = new ezy(((double)this.ae.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dN() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dL() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dA(), this.dE(), this.dG());
         this.dV().a(new lo(ls.S, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void w() {
      if (!this.dV().C || this.fx()) {
         bsj $$0 = this.fy();
         if (!this.by.equals(this.b($$0))) {
            this.fC();
         } else {
            if (!this.by.f() && this.fx()) {
               cwm $$1 = this.by.a(this.dV(), this);
               if ($$1 != this.by) {
                  this.a($$0, $$1);
               }

               this.fD();
            }
         }
      }
   }

   public void b(cwm $$0) {
   }

   public cwm fz() {
      return this.by;
   }

   public int fA() {
      return this.bz;
   }

   public int fB() {
      return this.fx() ? this.by.a(this) - this.fA() : 0;
   }

   public void fC() {
      if (!this.by.f()) {
         this.by.a(this.dV(), this, this.fA());
         if (this.by.x()) {
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
            this.a(ear.C);
         }
      }

      this.by = cwm.k;
      this.bz = 0;
   }

   public boolean fE() {
      return this.fF() != null;
   }

   @Nullable
   public cwm fF() {
      if (this.fx() && !this.by.f()) {
         cwi $$0 = this.by.h();
         if ($$0.b(this.by) != cwo.d) {
            return null;
         } else {
            return $$0.a(this.by, this) - this.bz < 5 ? null : this.by;
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
      return super.cl() || !this.fH() && this.c(bvt.b);
   }

   public int fI() {
      return this.bA;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dA();
      double $$5 = this.dC();
      double $$6 = this.dG();
      double $$7 = $$1;
      boolean $$8 = false;
      jh $$9 = jh.a($$0, $$1, $$2);
      dfm $$10 = this.dV();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.K_()) {
            jh $$12 = $$9.e();
            dvv $$13 = $$10.a_($$12);
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
   public final buo a(bvt $$0) {
      return $$0 == bvt.c ? aD : this.e($$0).a(this.ej());
   }

   protected buo e(bvt $$0) {
      return this.aq().n().a(this.ei());
   }

   public ImmutableList<bvt> fM() {
      return ImmutableList.of(bvt.a);
   }

   public ezt f(bvt $$0) {
      buo $$1 = this.a($$0);
      return new ezt((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bvt $$0) {
      ezt $$1 = this.a($$0).a(this.dt());
      return this.dV().b(this, $$1);
   }

   @Override
   public boolean o(boolean $$0) {
      return super.o($$0) && !this.fP();
   }

   public Optional<jh> fN() {
      return this.al.a(bP);
   }

   public void g(jh $$0) {
      this.al.a(bP, Optional.of($$0));
   }

   public void fO() {
      this.al.a(bP, Optional.empty());
   }

   public boolean fP() {
      return this.fN().isPresent();
   }

   public void b(jh $$0) {
      if (this.bZ()) {
         this.ae();
      }

      dvv $$1 = this.dV().a_($$0);
      if ($$1.b() instanceof dij) {
         this.dV().a($$0, $$1.b(dij.c, Boolean.valueOf(true)), 3);
      }

      this.b(bvt.c);
      this.a($$0);
      this.g($$0);
      this.h(ezy.c);
      this.ar = true;
   }

   private void a(jh $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean L() {
      return this.fN().map($$0 -> this.dV().a_($$0).b() instanceof dij).orElse(false);
   }

   public void fQ() {
      this.fN().filter(this.dV()::B).ifPresent($$0x -> {
         dvv $$1 = this.dV().a_($$0x);
         if ($$1.b() instanceof dij) {
            jm $$2 = $$1.c(dij.aF);
            this.dV().a($$0x, $$1.b(dij.c, Boolean.valueOf(false)), 3);
            ezy $$3 = dij.a(this.aq(), this.dV(), $$0x, $$2, this.dL()).orElseGet(() -> {
               jh $$1x = $$0x.d();
               return new ezy((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ezy $$4 = ezy.c($$0x).d($$3).d();
            float $$5 = (float)azm.d(azm.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.v($$5);
            this.w(0.0F);
         }
      });
      ezy $$0 = this.dt();
      this.b(bvt.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fO();
   }

   @Nullable
   public jm fR() {
      jh $$0 = this.fN().orElse(null);
      return $$0 != null ? dij.a(this.dV(), $$0) : null;
   }

   @Override
   public boolean bM() {
      return !this.fP() && super.bM();
   }

   public cwm d(cwm $$0) {
      return cwm.k;
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

   public void a(cwi $$0, but $$1) {
      this.dV().a(this, i($$1));
      this.a(this.a($$1), $$1, this.bR);
   }

   private void a(cwm $$0, but $$1, bwm $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         bwl $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      dcf.a($$0, this, $$1);
   }

   public static but d(bsj $$0) {
      return $$0 == bsj.a ? but.a : but.b;
   }

   public final boolean e(cwm $$0) {
      if (this.bL() && !this.Y_()) {
         ddy $$1 = $$0.a(ku.D);
         if ($$1 != null && $$1.e()) {
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

   public final but f(cwm $$0) {
      ddy $$1 = $$0.a(ku.D);
      return $$1 != null && this.e($$1.a()) ? $$1.a() : but.a;
   }

   public final boolean a(cwm $$0, but $$1) {
      ddy $$2 = $$0.a(ku.D);
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
      if (this.Y_()) {
         return false;
      } else {
         boolean $$0 = !this.a(but.f).a(axl.br) && !this.a(but.e).a(axl.br) && !this.a(but.d).a(axl.br) && !this.a(but.c).a(axl.br) && !this.a(but.g).a(axl.br);
         return $$0 && super.dJ();
      }
   }

   @Override
   public boolean co() {
      return !this.dV().A_() && this.b(bts.x) || super.co();
   }

   @Override
   public float dM() {
      return this.aW;
   }

   @Override
   public void a(acg $$0) {
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      float $$4 = $$0.n();
      float $$5 = $$0.m();
      this.f($$1, $$2, $$3);
      this.aW = $$0.o();
      this.aY = $$0.o();
      this.aX = this.aW;
      this.aZ = this.aY;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.n($$0.j(), $$0.k(), $$0.l());
   }

   public boolean fS() {
      return this.dZ().h() instanceof cuo;
   }

   @Override
   public float dP() {
      float $$0 = (float)this.h(bwp.B);
      return this.cX() instanceof cou ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ezy m(bul $$0) {
      return this.dt().e(this.a($$0, this.a(this.aw()), this.ej() * this.ei()));
   }

   protected void a(int $$0, double $$1) {
      this.aY = (float)azm.e(1.0 / (double)$$0, (double)this.aY, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(azm.c((double)$$0 * this.h(bwp.h)));
   }

   public boolean fT() {
      return false;
   }

   public boolean a(arp $$0, btb $$1) {
      return this.d($$1) || dcf.a($$0, this, $$1);
   }

   public static boolean b(cwm $$0, but $$1) {
      if (!$$0.b(ku.F)) {
         return false;
      } else {
         ddy $$2 = $$0.a(ku.D);
         return $$2 != null && $$1 == $$2.a() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fU() {
      return this.bc;
   }

   public static record a(awm a, awm b) {
   }
}

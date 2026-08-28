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

public abstract class bvg extends buk implements bue {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "active_effects";
   private static final akv c = akv.b("powder_snow");
   private static final akv d = akv.b("sprinting");
   private static final bwm k = new bwm(d, 0.3F, bwm.a.c);
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
   protected static final ajy<Byte> aC = akc.a(bvg.class, aka.a);
   private static final ajy<Float> bK = akc.a(bvg.class, aka.d);
   private static final ajy<List<lr>> bL = akc.a(bvg.class, aka.m);
   private static final ajy<Boolean> bM = akc.a(bvg.class, aka.k);
   private static final ajy<Integer> bN = akc.a(bvg.class, aka.b);
   private static final ajy<Integer> bO = akc.a(bvg.class, aka.b);
   private static final ajy<Optional<ji>> bP = akc.a(bvg.class, aka.p);
   private static final int bQ = 15;
   protected static final bun aD = bun.c(0.2F, 0.2F).b(0.2F);
   public static final float aE = 0.5F;
   public static final float aF = 0.5F;
   public static final String aG = "attributes";
   public static final Predicate<bvg> aH = $$0 -> {
      if ($$0 instanceof cow $$1) {
         cwo $$3 = $$1.a(bus.f);
         return !$$3.a(awy.cq);
      } else {
         return true;
      }
   };
   private final bwl bR;
   private final bsx bS = new bsx(this);
   private final Map<jr<btn>, btp> bT = Maps.newHashMap();
   private final ka<cwo> bU = ka.a(2, cwo.j);
   private final ka<cwo> bV = ka.a(4, cwo.j);
   private cwo bW = cwo.j;
   public boolean aI;
   private boolean bX = false;
   public bsi aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final bwh aT = new bwh();
   public final int aU = 20;
   public final float aV;
   public final float aW;
   public float aX;
   public float aY;
   public float aZ;
   public float ba;
   public final buj bb = new buj(this);
   @Nullable
   protected cow bc;
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
   private bvg bZ;
   private int ca;
   @Nullable
   private bvg cb;
   private int cc;
   private float cd;
   private int ce;
   private float cf;
   protected cwo by = cwo.j;
   protected int bz;
   protected int bA;
   private ji cg;
   private Optional<ji> ch = Optional.empty();
   @Nullable
   private bta ci;
   private long cj;
   protected int bB;
   protected float bC;
   @Nullable
   protected cwo bD;
   private float ck;
   private float cl;
   protected bwi<?> bE;
   private boolean cm;
   private final EnumMap<bus, Reference2ObjectMap<dcy, Set<ddq>>> cn = new EnumMap<>(bus.class);
   protected float bF = 1.0F;

   protected bvg(bur<? extends bvg> $$0, dgh $$1) {
      super($$0, $$1);
      this.bR = new bwl(bwp.a($$0));
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

   public bwi<?> eb() {
      return this.bE;
   }

   protected bwi.b<?> ec() {
      return bwi.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bwi<?> a(Dynamic<?> $$0) {
      return this.ec().a($$0);
   }

   @Override
   public void c(ard $$0) {
      this.a($$0, this.dW().y(), Float.MAX_VALUE);
   }

   public boolean a(bur<?> $$0) {
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

   public static bwn.a ed() {
      return bwn.a()
         .a(bwo.s)
         .a(bwo.p)
         .a(bwo.v)
         .a(bwo.a)
         .a(bwo.b)
         .a(bwo.r)
         .a(bwo.B)
         .a(bwo.y)
         .a(bwo.n)
         .a(bwo.x)
         .a(bwo.k)
         .a(bwo.o)
         .a(bwo.w)
         .a(bwo.h)
         .a(bwo.i)
         .a(bwo.F)
         .a(bwo.u)
         .a(bwo.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dww $$2, ji $$3) {
      if (!this.bj()) {
         this.br();
      }

      if (this.dV() instanceof ard $$4 && $$1 && this.Z > 0.0F) {
         this.b($$4, $$3);
         double $$5 = this.h(bwo.x);
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
         dda.b($$0, this);
      }

      super.az();
      bos $$1 = bor.a();
      $$1.a("livingEntityBaseTick");
      if (this.bi() || this.dV().C) {
         this.aH();
      }

      if (this.bL()) {
         boolean $$2 = this instanceof cow;
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

         if (this.a(awv.a) && !this.dV().a_(ji.a(this.dA(), this.dE(), this.dG())).a(djn.nF)) {
            boolean $$6 = !this.ee() && !btq.c(this) && (!$$2 || !((cow)this).gj().a);
            if ($$6) {
               this.j(this.l(this.ct()));
               if (this.ct() == -20) {
                  this.j(0);
                  faz $$7 = this.dy();

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
      return ayz.h((float)this.h(bwo.u), super.aT(), 1.0F);
   }

   protected void eg() {
      bwk $$0 = this.g(bwo.v);
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
            bwk $$1 = this.g(bwo.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cv();
            $$1.b(new bwm(c, (double)$$2, bwm.a.a));
         }
      }
   }

   protected void b(ard $$0, ji $$1) {
      dda.a($$0, this);
   }

   public boolean e_() {
      return false;
   }

   public float ei() {
      return this.e_() ? 0.5F : 1.0F;
   }

   public final float ej() {
      bwl $$0 = this.eY();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bwo.y));
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
         this.a(buk.d.a);
      }
   }

   public boolean em() {
      return !this.e_();
   }

   protected boolean en() {
      return !this.e_();
   }

   protected int l(int $$0) {
      bwk $$1 = this.g(bwo.w);
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

   public final int a(ard $$0, @Nullable buk $$1) {
      return dda.a($$0, $$1, this, this.e($$0));
   }

   protected int e(ard $$0) {
      return 0;
   }

   protected boolean eo() {
      return false;
   }

   @Nullable
   public bvg ep() {
      return this.bZ;
   }

   @Override
   public bvg am() {
      return this.ep();
   }

   public int eq() {
      return this.ca;
   }

   public void c(@Nullable cow $$0) {
      this.bc = $$0;
      this.bd = this.af;
   }

   public void a(@Nullable bvg $$0) {
      this.bZ = $$0;
      this.ca = this.af;
   }

   @Nullable
   public bvg er() {
      return this.cb;
   }

   public int es() {
      return this.cc;
   }

   public void B(buk $$0) {
      if ($$0 instanceof bvg) {
         this.cb = (bvg)$$0;
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

   protected boolean b(bus $$0) {
      return true;
   }

   public void a(bus $$0, cwo $$1, cwo $$2) {
      if (!this.dV().B_() && !this.Z_()) {
         boolean $$3 = $$2.f() && $$1.f();
         if (!$$3 && !cwo.c($$1, $$2) && !this.ak) {
            det $$4 = $$2.a(kv.D);
            if (!this.bb() && $$4 != null && $$0 == $$4.a()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), $$4.b(), this.dm(), 1.0F, 1.0F, this.ae.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? ebs.v : ebs.S);
            }
         }
      }
   }

   @Override
   public void a(buk.d $$0) {
      if (($$0 == buk.d.a || $$0 == buk.d.b) && this.dV() instanceof ard $$1) {
         this.a($$1, $$0);
      }

      super.a($$0);
      this.bE.a();
   }

   protected void a(ard $$0, buk.d $$1) {
      for (btp $$2 : this.eA()) {
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

         for (btp $$2 : this.bT.values()) {
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
            btp $$4 = btp.a($$3);
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
         fce $$6 = this.dV().R();
         fbz $$7 = $$6.b($$5);
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
         this.al.a(aq, bvs.c);
         if (!this.ak) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bE = this.a(new Dynamic(ue.a, $$0.c("Brain")));
      }
   }

   protected void ev() {
      Iterator<jr<btn>> $$0 = this.bT.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jr<btn> $$1 = $$0.next();
            btp $$2 = this.bT.get($$1);
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
         this.k(this.b(btr.n));
         this.m();
      }
   }

   private void m() {
      List<lr> $$0 = this.bT.values().stream().filter(btp::g).map(btp::a).toList();
      this.al.a(bL, $$0);
      this.al.a(bM, d(this.bT.values()));
   }

   private void u() {
      boolean $$0 = this.co();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable buk $$0) {
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
         cwo $$3 = this.a(bus.f);
         bur<?> $$4 = $$0.aq();
         if ($$4 == bur.be && $$3.a(cws.vk)
            || $$4 == bur.bN && $$3.a(cws.vn)
            || $$4 == bur.aR && $$3.a(cws.vq)
            || $$4 == bur.aS && $$3.a(cws.vq)
            || $$4 == bur.E && $$3.a(cws.vo)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bvg $$0) {
      return $$0 instanceof cow && this.dV().am() == bsg.a ? false : $$0.ew();
   }

   public boolean ew() {
      return !this.cC() && this.ex();
   }

   public boolean ex() {
      return !this.Z_() && this.bL();
   }

   public static boolean d(Collection<btp> $$0) {
      for (btp $$1 : $$0) {
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
         Map<jr<btn>, btp> $$0 = Maps.newHashMap(this.bT);
         this.bT.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<btp> eA() {
      return this.bT.values();
   }

   public Map<jr<btn>, btp> eB() {
      return this.bT;
   }

   public boolean b(jr<btn> $$0) {
      return this.bT.containsKey($$0);
   }

   @Nullable
   public btp c(jr<btn> $$0) {
      return this.bT.get($$0);
   }

   public final boolean a(btp $$0) {
      return this.b($$0, null);
   }

   public boolean b(btp $$0, @Nullable buk $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         btp $$2 = this.bT.get($$0.c());
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

   public boolean b(btp $$0) {
      if (this.aq().a(awt.G)) {
         return !$$0.a(btr.M);
      } else if (this.aq().a(awt.F)) {
         return !$$0.a(btr.L);
      } else {
         return !this.aq().a(awt.w) ? true : !$$0.a(btr.j) && !$$0.a(btr.s);
      }
   }

   public void c(btp $$0, @Nullable buk $$1) {
      if (this.b($$0)) {
         btp $$2 = this.bT.put($$0.c(), $$0);
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
   public btp d(jr<btn> $$0) {
      return this.bT.remove($$0);
   }

   public boolean e(jr<btn> $$0) {
      btp $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(btp $$0, @Nullable buk $$1) {
      this.bY = true;
      if (!this.dV().C) {
         $$0.c().a().a(this.eY(), $$0.e());
         this.c($$0);
      }
   }

   public void c(btp $$0) {
      for (buk $$1 : this.cY()) {
         if ($$1 instanceof are $$2) {
            $$2.f.b(new afz(this.ar(), $$0, false));
         }
      }
   }

   protected void a(btp $$0, boolean $$1, @Nullable buk $$2) {
      this.bY = true;
      if ($$1 && !this.dV().C) {
         btn $$3 = $$0.c().a();
         $$3.a(this.eY());
         $$3.a(this.eY(), $$0.e());
         this.E();
      }

      if (!this.dV().C) {
         this.c($$0);
      }
   }

   protected void c(Collection<btp> $$0) {
      this.bY = true;
      if (!this.dV().C) {
         for (btp $$1 : $$0) {
            $$1.c().a().a(this.eY());

            for (buk $$2 : this.cY()) {
               if ($$2 instanceof are $$3) {
                  $$3.f.b(new aec(this.ar(), $$1.c()));
               }
            }
         }

         this.E();
      }
   }

   private void E() {
      Set<bwk> $$0 = this.eY().b();

      for (bwk $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jr<bwj> $$0) {
      if ($$0.a(bwo.s)) {
         float $$1 = this.eS();
         if (this.eD() > $$1) {
            this.x($$1);
         }
      } else if ($$0.a(bwo.r)) {
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
   public boolean a(ard $$0, bta $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.eE()) {
         return false;
      } else if ($$1.a(awr.i) && this.b(btr.l)) {
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
            if (!$$1.a(awr.j) && $$1.c() instanceof bvg $$7) {
               this.d($$7);
            }

            $$4 = true;
         }

         if ($$1.a(awr.o) && this.aq().a(awt.l)) {
            $$2 *= 5.0F;
         }

         if ($$1.a(awr.a) && !this.a(bus.f).f()) {
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
               if ($$1.c() instanceof cpp $$11) {
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

            for (btp $$14 : this.eA()) {
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

   protected void f(bta $$0) {
      if ($$0.d() instanceof bvg $$1 && !$$0.a(awr.q) && (!$$0.a(btd.I) || !this.aq().a(awt.E))) {
         this.a($$1);
      }
   }

   @Nullable
   protected cow g(bta $$0) {
      buk $$1 = $$0.d();
      if ($$1 instanceof cow $$2) {
         this.bd = 100;
         this.bc = $$2;
         return $$2;
      } else {
         if ($$1 instanceof cia $$3 && $$3.p()) {
            this.bd = 100;
            if ($$3.ag_() instanceof cow $$4) {
               this.bc = $$4;
            } else {
               this.bc = null;
            }

            return this.bc;
         }

         return null;
      }
   }

   protected void d(bvg $$0) {
      $$0.e(this);
   }

   protected void e(bvg $$0) {
      $$0.p(0.5, $$0.dA() - this.dA(), $$0.dG() - this.dG());
   }

   private boolean j(bta $$0) {
      if ($$0.a(awr.d)) {
         return false;
      } else {
         cwo $$1 = null;
         cza $$2 = null;

         for (bsi $$3 : bsi.values()) {
            cwo $$4 = this.b($$3);
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
               this.a(ebs.C);
            }

            this.x(1.0F);
            $$2.a($$1, this);
            this.dV().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public bta eF() {
      if (this.dV().ad() - this.cj > 40L) {
         this.ci = null;
      }

      return this.ci;
   }

   protected void h(bta $$0) {
      this.b(this.e($$0));
   }

   public void b(@Nullable avz $$0) {
      if ($$0 != null) {
         this.a($$0, this.fg(), this.fh());
      }
   }

   public boolean i(bta $$0) {
      buk $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cpd $$3 && $$3.z() > 0) {
         $$2 = true;
      }

      cwo $$4 = this.fH();
      if (!$$0.a(awr.c) && $$4 != null && $$4.h() instanceof cxq && !$$2) {
         faz $$5 = $$0.i();
         if ($$5 != null) {
            faz $$6 = this.d(0.0F, this.cA());
            faz $$7 = $$5.a(this.dt());
            $$7 = new faz($$7.d, 0.0, $$7.f).d();
            return $$7.b($$6) < 0.0;
         }
      }

      return false;
   }

   private void g(cwo $$0) {
      if (!$$0.f()) {
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), $$0.N(), this.dm(), 0.8F, 0.8F + this.dV().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(bta $$0) {
      if (!this.dQ() && !this.be) {
         buk $$1 = $$0.d();
         bvg $$2 = this.eR();
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
               this.a(ebs.p);
               this.b($$3, $$0);
               this.f($$2);
            }

            this.dV().a(this, (byte)3);
         }

         this.b(bvs.h);
      }
   }

   protected void f(@Nullable bvg $$0) {
      if (this.dV() instanceof ard $$1) {
         boolean var6 = false;
         if ($$0 instanceof cko) {
            if ($$1.O().b(dgd.c)) {
               ji $$4 = this.dv();
               dww $$5 = djn.ck.m();
               if (this.dV().a_($$4).l() && $$5.a((dgk)this.dV(), $$4)) {
                  this.dV().a($$4, $$5, 3);
                  var6 = true;
               }
            }

            if (!var6) {
               clb $$6 = new clb(this.dV(), this.dA(), this.dC(), this.dG(), new cwo(cws.dF));
               this.dV().b($$6);
            }
         }
      }
   }

   protected void b(ard $$0, bta $$1) {
      boolean $$2 = this.bd > 0;
      if (this.en() && $$0.O().b(dgd.f)) {
         this.b($$0, $$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.f($$0);
      this.b($$0, $$1.d());
   }

   protected void f(ard $$0) {
   }

   protected void b(ard $$0, @Nullable buk $$1) {
      if (!this.eI() && (this.eo() || this.bd > 0 && this.em() && $$0.O().b(dgd.f))) {
         buw.a($$0, this.dt(), this.a($$0, $$1));
      }
   }

   protected void a(ard $$0, bta $$1, boolean $$2) {
   }

   public long eG() {
      return 0L;
   }

   protected float b(buk $$0, bta $$1) {
      float $$2 = (float)this.h(bwo.d);
      return this.dV() instanceof ard $$3 ? dda.d($$3, this.dZ(), $$0, $$1, $$2) : $$2;
   }

   protected void b(ard $$0, bta $$1, boolean $$2) {
      Optional<aku<evv>> $$3 = this.ea();
      if (!$$3.isEmpty()) {
         evv $$4 = $$0.p().bc().b($$3.get());
         evt.a $$5 = new evt.a($$0).a(eyk.a, this).a(eyk.f, this.dt()).a(eyk.c, $$1).b(eyk.d, $$1.d()).b(eyk.e, $$1.c());
         if ($$2 && this.bc != null) {
            $$5 = $$5.a(eyk.b, this.bc).a(this.bc.gF());
         }

         evt $$6 = $$5.a(eyj.g);
         $$4.a($$6, this.eG(), $$1x -> this.a($$0, $$1x));
      }
   }

   public boolean a(ard $$0, aku<evv> $$1, BiConsumer<ard, cwo> $$2) {
      return this.a($$0, $$1, $$0x -> $$0x.a(eyk.f, this.dt()).a(eyk.a, this).a(eyj.j), $$2);
   }

   protected void a(ard $$0, aku<evv> $$1, cwo $$2, BiConsumer<ard, cwo> $$3) {
      this.a($$0, $$1, $$1x -> $$1x.a(eyk.f, this.dt()).a(eyk.a, this).a(eyk.i, $$2).a(eyj.s), $$3);
   }

   protected boolean a(ard $$0, aku<evv> $$1, Function<evt.a, evt> $$2, BiConsumer<ard, cwo> $$3) {
      evv $$4 = $$0.p().bc().b($$1);
      evt $$5 = $$2.apply(new evt.a($$0));
      List<cwo> $$6 = $$4.a($$5);
      if (!$$6.isEmpty()) {
         $$6.forEach($$2x -> $$3.accept($$0, $$2x));
         return true;
      } else {
         return false;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(bwo.p);
      if (!($$0 <= 0.0)) {
         this.ar = true;
         faz $$3 = this.dy();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         faz $$4 = new faz($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aJ() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected avz e(bta $$0) {
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

   protected fau eK() {
      fau $$0 = this.cR();
      buk $$1 = this.dk();
      if ($$1 != null) {
         faz $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dcy, Set<ddq>> c(bus $$0) {
      return (Map<dcy, Set<ddq>>)this.cn.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public boolean eL() {
      return true;
   }

   public bvg.a eM() {
      return new bvg.a(awa.kH, awa.kz);
   }

   public Optional<ji> eN() {
      return this.ch;
   }

   public boolean q_() {
      if (this.Z_()) {
         return false;
      } else {
         ji $$0 = this.dv();
         dww $$1 = this.dw();
         if ($$1.a(awp.aS)) {
            this.ch = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dsd && this.c($$0, $$1)) {
            this.ch = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(ji $$0, dww $$1) {
      if (!$$1.c(dsd.b)) {
         return false;
      } else {
         dww $$2 = this.dV().a_($$0.e());
         return $$2.a(djn.cX) && $$2.c(dnt.b) == $$1.c(dsd.aF);
      }
   }

   @Override
   public boolean bL() {
      return !this.dQ() && this.eD() > 0.0F;
   }

   public boolean a(bvg $$0, double $$1, boolean $$2, boolean $$3, double... $$4) {
      faz $$5 = $$0.g(1.0F).d();

      for (double $$6 : $$4) {
         faz $$7 = new faz(this.dA() - $$0.dA(), $$6 - $$0.dE(), this.dG() - $$0.dG());
         double $$8 = $$7.g();
         $$7 = $$7.d();
         double $$9 = $$5.b($$7);
         if ($$9 > 1.0 - $$1 / ($$2 ? $$8 : 1.0)) {
            return $$0.a(this, $$3 ? dfp.a.c : dfp.a.a, dfp.b.a, $$6);
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
   public boolean a(float $$0, float $$1, bta $$2) {
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
         float $$2 = (float)this.h(bwo.x);
         float $$3 = $$0 - $$2;
         return ayz.c((double)($$3 * $$1) * this.h(bwo.k));
      }
   }

   protected void eO() {
      if (!this.bb()) {
         int $$0 = ayz.a(this.dA());
         int $$1 = ayz.a(this.dC() - 0.2F);
         int $$2 = ayz.a(this.dG());
         dww $$3 = this.dV().a_(new ji($$0, $$1, $$2));
         if (!$$3.l()) {
            drd $$4 = $$3.A();
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
      return ayz.a(this.h(bwo.a));
   }

   protected void c(bta $$0, float $$1) {
   }

   protected void d(bta $$0, float $$1) {
   }

   protected void z(float $$0) {
   }

   protected void a(bta $$0, float $$1, bus... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bus $$4 : $$2) {
            cwo $$5 = this.a($$4);
            det $$6 = $$5.a(kv.D);
            if ($$6 != null && $$6.h() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float e(bta $$0, float $$1) {
      if (!$$0.a(awr.b)) {
         this.c($$0, $$1);
         $$1 = bsw.a(this, $$1, $$0, (float)this.eP(), (float)this.h(bwo.b));
      }

      return $$1;
   }

   protected float f(bta $$0, float $$1) {
      if ($$0.a(awr.f)) {
         return $$1;
      } else {
         if (this.b(btr.k) && !$$0.a(awr.g)) {
            int $$2 = (this.c(btr.k).e() + 1) * 5;
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
               $$8 = dda.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bsw.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void b(ard $$0, bta $$1, float $$2) {
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
            this.a(ebs.o);
         }
      }
   }

   public bsx eQ() {
      return this.bS;
   }

   @Nullable
   public bvg eR() {
      if (this.bc != null) {
         return this.bc;
      } else {
         return this.bZ != null ? this.bZ : null;
      }
   }

   public final float eS() {
      return (float)this.h(bwo.s);
   }

   public final float eT() {
      return (float)this.h(bwo.r);
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
      if (btq.a(this)) {
         return 6 - (1 + btq.b(this));
      } else {
         return this.b(btr.d) ? 6 + (1 + this.c(btr.d).e()) * 2 : 6;
      }
   }

   public void a(bsi $$0) {
      this.a($$0, false);
   }

   public void a(bsi $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.F() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dV() instanceof ard) {
            abo $$2 = new abo(this, $$0 == bsi.a ? 0 : 3);
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
   public void c(bta $$0) {
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

            if (!(this instanceof cow)) {
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
            this.g(this.a(bus.a));
            break;
         case 48:
            this.g(this.a(bus.b));
            break;
         case 49:
            this.g(this.a(bus.f));
            break;
         case 50:
            this.g(this.a(bus.e));
            break;
         case 51:
            this.g(this.a(bus.d));
            break;
         case 52:
            this.g(this.a(bus.c));
            break;
         case 54:
            dnh.b(this);
            break;
         case 55:
            this.G();
            break;
         case 60:
            this.eW();
            break;
         case 65:
            this.g(this.a(bus.g));
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
      cwo $$0 = this.a(bus.b);
      this.a(bus.b, this.a(bus.a));
      this.a(bus.a, $$0);
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
   public bwk g(jr<bwj> $$0) {
      return this.eY().a($$0);
   }

   public double h(jr<bwj> $$0) {
      return this.eY().c($$0);
   }

   public double i(jr<bwj> $$0) {
      return this.eY().d($$0);
   }

   public bwl eY() {
      return this.bR;
   }

   public cwo eZ() {
      return this.a(bus.a);
   }

   public cwo fa() {
      return this.a(bus.b);
   }

   public cwo a(bva $$0) {
      return this.fy() == $$0 ? this.eZ() : this.fa();
   }

   @Nonnull
   @Override
   public cwo dZ() {
      return this.eZ();
   }

   public boolean b(cwk $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cwo> $$0) {
      return $$0.test(this.eZ()) || $$0.test(this.fa());
   }

   public cwo b(bsi $$0) {
      if ($$0 == bsi.a) {
         return this.a(bus.a);
      } else if ($$0 == bsi.b) {
         return this.a(bus.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bsi $$0, cwo $$1) {
      if ($$0 == bsi.a) {
         this.a(bus.a, $$1);
      } else {
         if ($$0 != bsi.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bus.b, $$1);
      }
   }

   public boolean d(bus $$0) {
      return !this.a($$0).f();
   }

   public boolean e(bus $$0) {
      return false;
   }

   public abstract Iterable<cwo> fb();

   public abstract cwo a(bus var1);

   public abstract void a(bus var1, cwo var2);

   public Iterable<cwo> fc() {
      return List.of();
   }

   public Iterable<cwo> fd() {
      return this.fb();
   }

   public Iterable<cwo> fe() {
      return Iterables.concat(this.fc(), this.fd());
   }

   protected void c(cwo $$0) {
      $$0.h().l($$0);
   }

   public float ff() {
      Iterable<cwo> $$0 = this.fb();
      int $$1 = 0;
      int $$2 = 0;

      for (cwo $$3 : $$0) {
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
      bwk $$1 = this.g(bwo.v);
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
   public void h(buk $$0) {
      if (!this.fR()) {
         super.h($$0);
      }
   }

   private void c(buk $$0) {
      faz $$1;
      if (this.dQ()) {
         $$1 = this.dt();
      } else if (!$$0.dQ() && !this.dV().a_($$0.dv()).a(awp.aM)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dC(), $$0.dC());
         $$1 = new faz(this.dA(), $$2, this.dG());
         boolean $$4 = this.dq() <= 4.0F && this.dr() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.dr() / 2.0;
            faz $$6 = $$1.b(0.0, $$5, 0.0);
            fbt $$7 = fbq.a(fau.a($$6, (double)this.dq(), (double)this.dr(), (double)this.dq()));
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
      return (float)this.h(bwo.o) * $$0 * this.aS() + this.fk();
   }

   public float fk() {
      return this.b(btr.h) ? 0.1F * ((float)this.c(btr.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void s() {
      float $$0 = this.fj();
      if (!($$0 <= 1.0E-5F)) {
         faz $$1 = this.dy();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.cj()) {
            float $$2 = this.dL() * (float) (Math.PI / 180.0);
            this.j(new faz((double)(-ayz.a($$2)) * 0.2, 0.0, (double)ayz.b($$2) * 0.2));
         }

         this.ar = true;
      }
   }

   protected void fl() {
      this.i(this.dy().b(0.0, -0.04F, 0.0));
   }

   protected void c(axf<esx> $$0) {
      this.i(this.dy().b(0.0, 0.04F, 0.0));
   }

   protected float fm() {
      return 0.8F;
   }

   public boolean a(esy $$0) {
      return false;
   }

   @Override
   protected double bd() {
      return this.h(bwo.n);
   }

   protected double fn() {
      boolean $$0 = this.dy().e <= 0.0;
      return $$0 && this.b(btr.B) ? Math.min(this.be(), 0.01) : this.be();
   }

   public void a_(faz $$0) {
      if (this.dh()) {
         esy $$1 = this.dV().b_(this.dv());
         if ((this.bj() || this.bx()) && this.ek() && !this.a($$1)) {
            this.m($$0);
         } else if (this.fJ()) {
            this.H();
         } else {
            this.l($$0);
         }
      }
   }

   private void l(faz $$0) {
      ji $$1 = this.aQ();
      float $$2 = this.aJ() ? this.dV().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      faz $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      btp $$6 = this.c(btr.y);
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
         float $$7 = this instanceof chg ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void m(faz $$0) {
      boolean $$1 = this.dy().e <= 0.0;
      double $$2 = this.dC();
      double $$3 = this.fn();
      if (this.bj()) {
         float $$4 = this.cj() ? 0.9F : this.fm();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bwo.F);
         if (!this.aJ()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fp() - $$5) * $$6;
         }

         if (this.b(btr.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bvk.a, this.dy());
         faz $$7 = this.dy();
         if (this.P && this.q_()) {
            $$7 = new faz($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.i(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bvk.a, this.dy());
         if (this.b(awv.b) <= this.dp()) {
            this.i(this.dy().d(0.5, 0.8F, 0.5));
            faz $$8 = this.a($$3, $$1, this.dy());
            this.i($$8);
         } else {
            this.i(this.dy().c(0.5));
         }

         if ($$3 != 0.0) {
            this.i(this.dy().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      faz $$9 = this.dy();
      if (this.P && this.g($$9.d, $$9.e + 0.6F - this.dC() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void H() {
      faz $$0 = this.dy();
      double $$1 = $$0.i();
      this.i(this.n($$0));
      this.a(bvk.a, this.dy());
      if (!this.dV().C) {
         double $$2 = this.dy().i();
         this.c($$1, $$2);
      }
   }

   private faz n(faz $$0) {
      faz $$1 = this.bT();
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

   private void c(cow $$0, faz $$1) {
      faz $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.dh()) {
         this.C(this.e($$0));
         this.a_($$2);
      } else {
         this.i(faz.c);
      }
   }

   protected void a(cow $$0, faz $$1) {
   }

   protected faz b(cow $$0, faz $$1) {
      return $$1;
   }

   protected float e(cow $$0) {
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

   private faz a(faz $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.i(this.o(this.dy()));
      this.a(bvk.a, this.dy());
      faz $$2 = this.dy();
      if ((this.P || this.bm) && (this.q_() || this.dw().a(djn.rr) && dpk.a(this))) {
         $$2 = new faz($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public faz a(double $$0, boolean $$1, faz $$2) {
      if ($$0 != 0.0 && !this.cj()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new faz($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private faz o(faz $$0) {
      if (this.q_()) {
         this.k();
         float $$1 = 0.15F;
         double $$2 = ayz.a($$0.d, -0.15F, 0.15F);
         double $$3 = ayz.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dw().a(djn.ou) && this.fI() && this instanceof cow) {
            $$4 = 0.0;
         }

         $$0 = new faz($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aJ() ? this.fp() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fo();
   }

   protected float fo() {
      return this.cW() instanceof cow ? this.fp() * 0.1F : 0.02F;
   }

   public float fp() {
      return this.cd;
   }

   public void C(float $$0) {
      this.cd = $$0;
   }

   public boolean c(ard $$0, buk $$1) {
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
      bos $$10 = bor.a();
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
      Map<bus, cwo> $$0 = this.J();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bus, cwo> J() {
      Map<bus, cwo> $$0 = null;

      for (bus $$1 : bus.i) {
         cwo $$2 = switch ($$1.a()) {
            case a -> this.h($$1);
            case b -> this.g($$1);
            case c -> this.bW;
         };
         cwo $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bus.class);
            }

            $$0.put($$1, $$3);
            bwl $$4 = this.eY();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<bus, cwo> $$5 : $$0.entrySet()) {
            bus $$6 = $$5.getKey();
            cwo $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1) -> {
                  bwk $$2 = this.bR.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1.b());
                     $$2.b($$1);
                  }
               });
               if (this.dV() instanceof ard $$8) {
                  dda.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(cwo $$0, cwo $$1) {
      return !cwo.a($$1, $$0);
   }

   private void a(Map<bus, cwo> $$0) {
      cwo $$1 = $$0.get(bus.a);
      cwo $$2 = $$0.get(bus.b);
      if ($$1 != null && $$2 != null && cwo.a($$1, this.h(bus.b)) && cwo.a($$2, this.h(bus.a))) {
         ((ard)this.dV()).m().b(this, new acp(this, (byte)55));
         $$0.remove(bus.a);
         $$0.remove(bus.b);
         this.c(bus.a, $$1.v());
         this.c(bus.b, $$2.v());
      }
   }

   private void b(Map<bus, cwo> $$0) {
      List<Pair<bus, cwo>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cwo $$3 = $$2.v();
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

   private cwo g(bus $$0) {
      return this.bV.get($$0.b());
   }

   private void b(bus $$0, cwo $$1) {
      this.bV.set($$0.b(), $$1);
   }

   private cwo h(bus $$0) {
      return this.bU.get($$0.b());
   }

   private void c(bus $$0, cwo $$1) {
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

      faz $$0 = this.dy();
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
      bos $$4 = bor.a();
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

      fau $$9 = this.cR();
      faz $$10 = new faz((double)this.bn, (double)this.bo, (double)this.bp);
      if (this.b(btr.B) || this.b(btr.y)) {
         this.k();
      }

      label112: {
         if (this.cW() instanceof cow $$11 && this.bL()) {
            this.c($$11, $$10);
            break label112;
         }

         this.a_($$10);
      }

      if (!this.dV().B_() || this.dh()) {
         this.aK();
      }

      this.s(this instanceof chg);
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
               List<bus> $$2 = bus.i.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               bus $$3 = af.a($$2, this.ae);
               this.a($$3).a(1, this, $$3);
            }

            this.a(ebs.n);
         }
      }
   }

   protected boolean ft() {
      if (!this.aJ() && !this.bZ() && !this.b(btr.y)) {
         for (bus $$0 : bus.i) {
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
         this.dV().a(ebg.a(cow.class), this.cR(), bup.a(this)).forEach(this::D);
      } else {
         List<buk> $$2 = this.dV().a(this, this.cR(), bup.a(this));
         if (!$$2.isEmpty()) {
            int $$3 = $$0.O().c(dgd.v);
            if ($$3 > 0 && $$2.size() > $$3 - 1 && this.ae.a(4) == 0) {
               int $$4 = 0;

               for (buk $$5 : $$2) {
                  if (!$$5.bZ()) {
                     $$4++;
                  }
               }

               if ($$4 > $$3 - 1) {
                  this.a($$0, this.dW().h(), 6.0F);
               }
            }

            for (buk $$6 : $$2) {
               this.D($$6);
            }
         }
      }
   }

   protected void a(fau $$0, fau $$1) {
      fau $$2 = $$0.b($$1);
      List<buk> $$3 = this.dV().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (buk $$4 : $$3) {
            if ($$4 instanceof bvg) {
               this.g((bvg)$$4);
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

   protected void D(buk $$0) {
      $$0.h(this);
   }

   protected void g(bvg $$0) {
   }

   public boolean fv() {
      return (this.al.a(aC) & 4) != 0;
   }

   @Override
   public void ae() {
      buk $$0 = this.dk();
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

   public void a(clb $$0) {
      buk $$1 = $$0.p();
      if ($$1 instanceof are) {
         ap.R.a((are)$$1, $$0.l(), this);
      }
   }

   public void a(buk $$0, int $$1) {
      if (!$$0.dQ() && !this.dV().C && ($$0 instanceof clb || $$0 instanceof cpd || $$0 instanceof buw)) {
         ((ard)this.dV()).m().b($$0, new aft($$0.ar(), this.ar(), $$1));
      }
   }

   public boolean E(buk $$0) {
      return this.a($$0, dfp.a.a, dfp.b.a, $$0.dE());
   }

   public boolean a(buk $$0, dfp.a $$1, dfp.b $$2, double $$3) {
      if ($$0.dV() != this.dV()) {
         return false;
      } else {
         faz $$4 = new faz(this.dA(), this.dE(), this.dG());
         faz $$5 = new faz($$0.dA(), $$3, $$0.dG());
         return $$5.f($$4) > 128.0 ? false : this.dV().a(new dfp($$4, $$5, $$1, $$2, this)).d() == fax.a.a;
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
   public faz a(jn.a $$0, l.a $$1) {
      return k(super.a($$0, $$1));
   }

   public static faz k(faz $$0) {
      return new faz($$0.d, $$0.e, 0.0);
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

   public abstract bva fy();

   public boolean fz() {
      return (this.al.a(aC) & 1) > 0;
   }

   public bsi fA() {
      return (this.al.a(aC) & 2) > 0 ? bsi.b : bsi.a;
   }

   private void L() {
      if (this.fz()) {
         if (cwo.b(this.b(this.fA()), this.by)) {
            this.by = this.b(this.fA());
            this.a(this.by);
         } else {
            this.fF();
         }
      }
   }

   protected void a(cwo $$0) {
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

   public void c(bsi $$0) {
      cwo $$1 = this.b($$0);
      if (!$$1.f() && !this.fz()) {
         this.by = $$1;
         this.bz = $$1.a(this);
         if (!this.dV().C) {
            this.c(1, true);
            this.c(2, $$0 == bsi.b);
            this.a(ebs.D);
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
            this.by = cwo.j;
            this.bz = 0;
         }
      }
   }

   @Override
   public void a(fj.a $$0, faz $$1) {
      super.a($$0, $$1);
      this.ba = this.aZ;
      this.aX = this.aZ;
      this.aY = this.aX;
   }

   @Override
   public float t(float $$0) {
      return ayz.h($$0, this.aY, this.aX);
   }

   public void b(cwo $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         faz $$3 = new faz(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dN() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dL() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ae.i()) * 0.6 - 0.3;
         faz $$5 = new faz(((double)this.ae.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dN() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dL() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dA(), this.dE(), this.dG());
         this.dV().a(new lp(lt.T, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void w() {
      if (!this.dV().C || this.fz()) {
         bsi $$0 = this.fA();
         if (!this.by.equals(this.b($$0))) {
            this.fE();
         } else {
            if (!this.by.f() && this.fz()) {
               cwo $$1 = this.by.a(this.dV(), this);
               if ($$1 != this.by) {
                  this.a($$0, $$1);
               }

               this.fF();
            }
         }
      }
   }

   public void b(cwo $$0) {
   }

   public cwo fB() {
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
            this.a(ebs.C);
         }
      }

      this.by = cwo.j;
      this.bz = 0;
   }

   public boolean fG() {
      return this.fH() != null;
   }

   @Nullable
   public cwo fH() {
      if (this.fz() && !this.by.f()) {
         cwk $$0 = this.by.h();
         if ($$0.b(this.by) != cwq.d) {
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
      return super.cl() || !this.fJ() && this.c(bvs.b);
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
      dgh $$10 = this.dV();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.L_()) {
            ji $$12 = $$9.e();
            dww $$13 = $$10.a_($$12);
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

         if (this instanceof bvo $$14) {
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
   public final bun a(bvs $$0) {
      return $$0 == bvs.c ? aD : this.e($$0).a(this.ej());
   }

   protected bun e(bvs $$0) {
      return this.aq().n().a(this.ei());
   }

   public ImmutableList<bvs> fO() {
      return ImmutableList.of(bvs.a);
   }

   public fau f(bvs $$0) {
      bun $$1 = this.a($$0);
      return new fau((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bvs $$0) {
      fau $$1 = this.a($$0).a(this.dt());
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

      dww $$1 = this.dV().a_($$0);
      if ($$1.b() instanceof dje) {
         this.dV().a($$0, $$1.b(dje.c, Boolean.valueOf(true)), 3);
      }

      this.b(bvs.c);
      this.a($$0);
      this.g($$0);
      this.i(faz.c);
      this.ar = true;
   }

   private void a(ji $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean O() {
      return this.fP().map($$0 -> this.dV().a_($$0).b() instanceof dje).orElse(false);
   }

   public void fS() {
      this.fP().filter(this.dV()::B).ifPresent($$0x -> {
         dww $$1 = this.dV().a_($$0x);
         if ($$1.b() instanceof dje) {
            jn $$2 = $$1.c(dje.aF);
            this.dV().a($$0x, $$1.b(dje.c, Boolean.valueOf(false)), 3);
            faz $$3 = dje.a(this.aq(), this.dV(), $$0x, $$2, this.dL()).orElseGet(() -> {
               ji $$1x = $$0x.d();
               return new faz((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            faz $$4 = faz.c($$0x).d($$3).d();
            float $$5 = (float)ayz.d(ayz.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.v($$5);
            this.w(0.0F);
         }
      });
      faz $$0 = this.dt();
      this.b(bvs.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fQ();
   }

   @Nullable
   public jn fT() {
      ji $$0 = this.fP().orElse(null);
      return $$0 != null ? dje.a(this.dV(), $$0) : null;
   }

   @Override
   public boolean bM() {
      return !this.fR() && super.bM();
   }

   public cwo d(cwo $$0) {
      return cwo.j;
   }

   private static byte i(bus $$0) {
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

   public void a(cwk $$0, bus $$1) {
      this.dV().a(this, i($$1));
      this.a(this.a($$1), $$1, this.bR);
   }

   private void a(cwo $$0, bus $$1, bwl $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         bwk $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      dda.a($$0, this, $$1);
   }

   public static bus d(bsi $$0) {
      return $$0 == bsi.a ? bus.a : bus.b;
   }

   public final boolean e(cwo $$0) {
      if (this.bL() && !this.Z_()) {
         det $$1 = $$0.a(kv.D);
         if ($$1 != null && $$1.f()) {
            bus $$2 = $$1.a();
            return this.e($$2) && $$1.a(this.aq()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(bus $$0) {
      return true;
   }

   public final bus f(cwo $$0) {
      det $$1 = $$0.a(kv.D);
      return $$1 != null && this.e($$1.a()) ? $$1.a() : bus.a;
   }

   public final boolean a(cwo $$0, bus $$1) {
      det $$2 = $$0.a(kv.D);
      return $$2 == null ? $$1 == bus.a && this.e(bus.a) : $$1 == $$2.a() && this.e($$2.a()) && $$2.a(this.aq());
   }

   private static bvy a(bvg $$0, bus $$1) {
      return $$1 != bus.f && $$1 != bus.a && $$1 != bus.b ? bvy.a($$0, $$1, $$2 -> $$2.f() || $$0.f($$2) == $$1) : bvy.a($$0, $$1);
   }

   @Nullable
   private static bus r(int $$0) {
      if ($$0 == 100 + bus.f.b()) {
         return bus.f;
      } else if ($$0 == 100 + bus.e.b()) {
         return bus.e;
      } else if ($$0 == 100 + bus.d.b()) {
         return bus.d;
      } else if ($$0 == 100 + bus.c.b()) {
         return bus.c;
      } else if ($$0 == 98) {
         return bus.a;
      } else if ($$0 == 99) {
         return bus.b;
      } else {
         return $$0 == 105 ? bus.g : null;
      }
   }

   @Override
   public bvy a_(int $$0) {
      bus $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dJ() {
      if (this.Z_()) {
         return false;
      } else {
         boolean $$0 = !this.a(bus.f).a(awy.bq) && !this.a(bus.e).a(awy.bq) && !this.a(bus.d).a(awy.bq) && !this.a(bus.c).a(awy.bq) && !this.a(bus.g).a(awy.bq);
         return $$0 && super.dJ();
      }
   }

   @Override
   public boolean co() {
      return !this.dV().B_() && this.b(btr.x) || super.co();
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
      return this.dZ().h() instanceof cuq;
   }

   @Override
   public float dP() {
      float $$0 = (float)this.h(bwo.B);
      return this.cW() instanceof cow ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public faz m(buk $$0) {
      return this.dt().e(this.a($$0, this.a(this.aw()), this.ej() * this.ei()));
   }

   protected void a(int $$0, double $$1) {
      this.aZ = (float)ayz.e(1.0 / (double)$$0, (double)this.aZ, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(ayz.c((double)$$0 * this.h(bwo.h)));
   }

   public boolean fV() {
      return false;
   }

   public boolean a(ard $$0, bta $$1) {
      return this.d($$1) || dda.a($$0, this, $$1);
   }

   public static boolean b(cwo $$0, bus $$1) {
      if (!$$0.b(kv.F)) {
         return false;
      } else {
         det $$2 = $$0.a(kv.D);
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

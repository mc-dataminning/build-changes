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

public abstract class bvf extends buj implements bud {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "active_effects";
   private static final aku c = aku.b("powder_snow");
   private static final aku d = aku.b("sprinting");
   private static final bwl k = new bwl(d, 0.3F, bwl.a.c);
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
   protected static final ajx<Byte> aC = akb.a(bvf.class, ajz.a);
   private static final ajx<Float> bK = akb.a(bvf.class, ajz.d);
   private static final ajx<List<lr>> bL = akb.a(bvf.class, ajz.m);
   private static final ajx<Boolean> bM = akb.a(bvf.class, ajz.k);
   private static final ajx<Integer> bN = akb.a(bvf.class, ajz.b);
   private static final ajx<Integer> bO = akb.a(bvf.class, ajz.b);
   private static final ajx<Optional<ji>> bP = akb.a(bvf.class, ajz.p);
   private static final int bQ = 15;
   protected static final bum aD = bum.c(0.2F, 0.2F).b(0.2F);
   public static final float aE = 0.5F;
   public static final float aF = 0.5F;
   public static final String aG = "attributes";
   public static final Predicate<bvf> aH = $$0 -> {
      if ($$0 instanceof cov $$1) {
         cwn $$3 = $$1.a(bur.f);
         return !$$3.a(awx.cq);
      } else {
         return true;
      }
   };
   private final bwk bR;
   private final bsw bS = new bsw(this);
   private final Map<jr<btm>, bto> bT = Maps.newHashMap();
   private final ka<cwn> bU = ka.a(2, cwn.j);
   private final ka<cwn> bV = ka.a(4, cwn.j);
   private cwn bW = cwn.j;
   public boolean aI;
   private boolean bX = false;
   public bsh aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final bwg aT = new bwg();
   public final int aU = 20;
   public final float aV;
   public final float aW;
   public float aX;
   public float aY;
   public float aZ;
   public float ba;
   public final bui bb = new bui(this);
   @Nullable
   protected cov bc;
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
   private bvf bZ;
   private int ca;
   @Nullable
   private bvf cb;
   private int cc;
   private float cd;
   private int ce;
   private float cf;
   protected cwn by = cwn.j;
   protected int bz;
   protected int bA;
   private ji cg;
   private Optional<ji> ch = Optional.empty();
   @Nullable
   private bsz ci;
   private long cj;
   protected int bB;
   protected float bC;
   @Nullable
   protected cwn bD;
   private float ck;
   private float cl;
   protected bwh<?> bE;
   private boolean cm;
   private final EnumMap<bur, Reference2ObjectMap<dcx, Set<ddp>>> cn = new EnumMap<>(bur.class);
   protected float bF = 1.0F;

   protected bvf(buq<? extends bvf> $$0, dgg $$1) {
      super($$0, $$1);
      this.bR = new bwk(bwo.a($$0));
      this.x(this.eS());
      this.I = true;
      this.aW = (float)((Math.random() + 1.0) * 0.01F);
      this.ay();
      this.aV = (float)Math.random() * 12398.0F;
      this.v((float)(Math.random() * (float) (Math.PI * 2)));
      this.aZ = this.dM();
      ue $$2 = ue.a;
      this.bE = this.a(new Dynamic($$2, (un)$$2.createMap(ImmutableMap.of($$2.a("memories"), (un)$$2.emptyMap()))));
   }

   public bwh<?> ec() {
      return this.bE;
   }

   protected bwh.b<?> ed() {
      return bwh.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bwh<?> a(Dynamic<?> $$0) {
      return this.ed().a($$0);
   }

   @Override
   public void c(arc $$0) {
      this.a($$0, this.dX().y(), Float.MAX_VALUE);
   }

   public boolean a(buq<?> $$0) {
      return true;
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(aC, (byte)0);
      $$0.a(bL, List.of());
      $$0.a(bM, false);
      $$0.a(bN, 0);
      $$0.a(bO, 0);
      $$0.a(bK, 1.0F);
      $$0.a(bP, Optional.empty());
   }

   public static bwm.a ee() {
      return bwm.a()
         .a(bwn.s)
         .a(bwn.p)
         .a(bwn.v)
         .a(bwn.a)
         .a(bwn.b)
         .a(bwn.r)
         .a(bwn.B)
         .a(bwn.y)
         .a(bwn.n)
         .a(bwn.x)
         .a(bwn.k)
         .a(bwn.o)
         .a(bwn.w)
         .a(bwn.h)
         .a(bwn.i)
         .a(bwn.F)
         .a(bwn.u)
         .a(bwn.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dwv $$2, ji $$3) {
      if (!this.bj()) {
         this.br();
      }

      if (this.dW() instanceof arc $$4 && $$1 && this.Z > 0.0F) {
         this.b($$4, $$3);
         double $$5 = this.h(bwn.x);
         if ((double)this.Z > $$5 && !$$2.l()) {
            double $$6 = this.dB();
            double $$7 = this.dD();
            double $$8 = this.dH();
            ji $$9 = this.dw();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            float $$13 = (float)ayy.c((double)this.Z - $$5);
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

   public final boolean ef() {
      return this.aq().a(aws.m);
   }

   public float a(float $$0) {
      return ayy.h($$0, this.cl, this.ck);
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

      if (this.dW() instanceof arc $$0) {
         dcz.b($$0, this);
      }

      super.az();
      bor $$1 = boq.a();
      $$1.a("livingEntityBaseTick");
      if (this.bi() || this.dW().C) {
         this.aH();
      }

      if (this.bL()) {
         boolean $$2 = this instanceof cov;
         if (this.dW() instanceof arc $$3) {
            if (this.bM()) {
               this.a($$3, this.dX().g(), 1.0F);
            } else if ($$2 && !this.dW().F_().a(this.cR())) {
               double $$4 = this.dW().F_().a(this) + this.dW().F_().n();
               if ($$4 < 0.0) {
                  double $$5 = this.dW().F_().o();
                  if ($$5 > 0.0) {
                     this.a($$3, this.dX().x(), (float)Math.max(1, ayy.a(-$$4 * $$5)));
                  }
               }
            }
         }

         if (this.a(awu.a) && !this.dW().a_(ji.a(this.dB(), this.dF(), this.dH())).a(djm.nF)) {
            boolean $$6 = !this.ef() && !btp.c(this) && (!$$2 || !((cov)this).gj().a);
            if ($$6) {
               this.j(this.l(this.ct()));
               if (this.ct() == -20) {
                  this.j(0);
                  fay $$7 = this.dz();

                  for (int $$8 = 0; $$8 < 8; $$8++) {
                     double $$9 = this.ae.j() - this.ae.j();
                     double $$10 = this.ae.j() - this.ae.j();
                     double $$11 = this.ae.j() - this.ae.j();
                     this.dW().a(lt.d, this.dB() + $$9, this.dD() + $$10, this.dH() + $$11, $$7.d, $$7.e, $$7.f);
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

         if (this.dW() instanceof arc $$12) {
            ji $$13 = this.dw();
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

      if (this.aj > 0 && !(this instanceof ard)) {
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
      return ayy.h((float)this.h(bwn.u), super.aT(), 1.0F);
   }

   protected void eh() {
      bwj $$0 = this.g(bwn.v);
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
            bwj $$1 = this.g(bwn.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cv();
            $$1.b(new bwl(c, (double)$$2, bwl.a.a));
         }
      }
   }

   protected void b(arc $$0, ji $$1) {
      dcz.a($$0, this);
   }

   public boolean e_() {
      return false;
   }

   public float ej() {
      return this.e_() ? 0.5F : 1.0F;
   }

   public final float ek() {
      bwk $$0 = this.eY();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bwn.y));
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
         this.a(buj.d.a);
      }
   }

   public boolean en() {
      return !this.e_();
   }

   protected boolean eo() {
      return !this.e_();
   }

   protected int l(int $$0) {
      bwj $$1 = this.g(bwn.w);
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

   public final int a(arc $$0, @Nullable buj $$1) {
      return dcz.a($$0, $$1, this, this.e($$0));
   }

   protected int e(arc $$0) {
      return 0;
   }

   protected boolean ep() {
      return false;
   }

   @Nullable
   public bvf eq() {
      return this.bZ;
   }

   @Override
   public bvf am() {
      return this.eq();
   }

   public int er() {
      return this.ca;
   }

   public void c(@Nullable cov $$0) {
      this.bc = $$0;
      this.bd = this.af;
   }

   public void a(@Nullable bvf $$0) {
      this.bZ = $$0;
      this.ca = this.af;
   }

   @Nullable
   public bvf es() {
      return this.cb;
   }

   public int et() {
      return this.cc;
   }

   public void B(buj $$0) {
      if ($$0 instanceof bvf) {
         this.cb = (bvf)$$0;
      } else {
         this.cb = null;
      }

      this.cc = this.af;
   }

   public int eu() {
      return this.bf;
   }

   public void n(int $$0) {
      this.bf = $$0;
   }

   public boolean ev() {
      return this.bX;
   }

   public void r(boolean $$0) {
      this.bX = $$0;
   }

   protected boolean b(bur $$0) {
      return true;
   }

   public void a(bur $$0, cwn $$1, cwn $$2) {
      if (!this.dW().B_() && !this.Z_()) {
         boolean $$3 = $$2.f() && $$1.f();
         if (!$$3 && !cwn.c($$1, $$2) && !this.ak) {
            des $$4 = $$2.a(kv.D);
            if (!this.bb() && $$4 != null && $$0 == $$4.a()) {
               this.dW().a(null, this.dB(), this.dD(), this.dH(), $$4.b(), this.dn(), 1.0F, 1.0F, this.ae.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? ebr.v : ebr.S);
            }
         }
      }
   }

   @Override
   public void a(buj.d $$0) {
      if (($$0 == buj.d.a || $$0 == buj.d.b) && this.dW() instanceof arc $$1) {
         this.a($$1, $$0);
      }

      super.a($$0);
      this.bE.a();
   }

   protected void a(arc $$0, buj.d $$1) {
      for (bto $$2 : this.eB()) {
         $$2.a($$0, this, $$1);
      }

      this.bT.clear();
   }

   @Override
   public void b(tq $$0) {
      $$0.a("Health", this.eE());
      $$0.a("HurtTime", (short)this.aN);
      $$0.a("HurtByTimestamp", this.ca);
      $$0.a("DeathTime", (short)this.aP);
      $$0.a("AbsorptionAmount", this.fw());
      $$0.a("attributes", this.eY().d());
      if (!this.bT.isEmpty()) {
         tw $$1 = new tw();

         for (bto $$2 : this.bT.values()) {
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
      if ($$0.b("attributes", 9) && this.dW() != null && !this.dW().C) {
         this.eY().a($$0.c("attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         tw $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tq $$3 = $$1.a($$2);
            bto $$4 = bto.a($$3);
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
         fcd $$6 = this.dW().R();
         fby $$7 = $$6.b($$5);
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
         this.al.a(aq, bvr.c);
         if (!this.ak) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bE = this.a(new Dynamic(ue.a, $$0.c("Brain")));
      }
   }

   protected void ew() {
      Iterator<jr<btm>> $$0 = this.bT.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jr<btm> $$1 = $$0.next();
            bto $$2 = this.bT.get($$1);
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

      if (this.bY) {
         if (!this.dW().C) {
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
            this.dW().a(af.a($$3, this.ae), this.d(0.5), this.dE(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void K() {
      if (this.bT.isEmpty()) {
         this.ez();
         this.k(false);
      } else {
         this.k(this.b(btq.n));
         this.m();
      }
   }

   private void m() {
      List<lr> $$0 = this.bT.values().stream().filter(bto::g).map(bto::a).toList();
      this.al.a(bL, $$0);
      this.al.a(bM, d(this.bT.values()));
   }

   private void u() {
      boolean $$0 = this.co();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable buj $$0) {
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
         cwn $$3 = this.a(bur.f);
         buq<?> $$4 = $$0.aq();
         if ($$4 == buq.be && $$3.a(cwr.vk)
            || $$4 == buq.bN && $$3.a(cwr.vn)
            || $$4 == buq.aR && $$3.a(cwr.vq)
            || $$4 == buq.aS && $$3.a(cwr.vq)
            || $$4 == buq.E && $$3.a(cwr.vo)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bvf $$0) {
      return $$0 instanceof cov && this.dW().am() == bsf.a ? false : $$0.ex();
   }

   public boolean ex() {
      return !this.cC() && this.ey();
   }

   public boolean ey() {
      return !this.Z_() && this.bL();
   }

   public static boolean d(Collection<bto> $$0) {
      for (bto $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void ez() {
      this.al.a(bL, List.of());
   }

   public boolean eA() {
      if (this.dW().C) {
         return false;
      } else if (this.bT.isEmpty()) {
         return false;
      } else {
         Map<jr<btm>, bto> $$0 = Maps.newHashMap(this.bT);
         this.bT.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<bto> eB() {
      return this.bT.values();
   }

   public Map<jr<btm>, bto> eC() {
      return this.bT;
   }

   public boolean b(jr<btm> $$0) {
      return this.bT.containsKey($$0);
   }

   @Nullable
   public bto c(jr<btm> $$0) {
      return this.bT.get($$0);
   }

   public final boolean a(bto $$0) {
      return this.b($$0, null);
   }

   public boolean b(bto $$0, @Nullable buj $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         bto $$2 = this.bT.get($$0.c());
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

   public boolean b(bto $$0) {
      if (this.aq().a(aws.G)) {
         return !$$0.a(btq.M);
      } else if (this.aq().a(aws.F)) {
         return !$$0.a(btq.L);
      } else {
         return !this.aq().a(aws.w) ? true : !$$0.a(btq.j) && !$$0.a(btq.s);
      }
   }

   public void c(bto $$0, @Nullable buj $$1) {
      if (this.b($$0)) {
         bto $$2 = this.bT.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eD() {
      return this.aq().a(aws.x);
   }

   @Nullable
   public bto d(jr<btm> $$0) {
      return this.bT.remove($$0);
   }

   public boolean e(jr<btm> $$0) {
      bto $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(bto $$0, @Nullable buj $$1) {
      this.bY = true;
      if (!this.dW().C) {
         $$0.c().a().a(this.eY(), $$0.e());
         this.c($$0);
      }
   }

   public void c(bto $$0) {
      for (buj $$1 : this.cZ()) {
         if ($$1 instanceof ard $$2) {
            $$2.f.b(new afy(this.ar(), $$0, false));
         }
      }
   }

   protected void a(bto $$0, boolean $$1, @Nullable buj $$2) {
      this.bY = true;
      if ($$1 && !this.dW().C) {
         btm $$3 = $$0.c().a();
         $$3.a(this.eY());
         $$3.a(this.eY(), $$0.e());
         this.B();
      }

      if (!this.dW().C) {
         this.c($$0);
      }
   }

   protected void c(Collection<bto> $$0) {
      this.bY = true;
      if (!this.dW().C) {
         for (bto $$1 : $$0) {
            $$1.c().a().a(this.eY());

            for (buj $$2 : this.cZ()) {
               if ($$2 instanceof ard $$3) {
                  $$3.f.b(new aeb(this.ar(), $$1.c()));
               }
            }
         }

         this.B();
      }
   }

   private void B() {
      Set<bwj> $$0 = this.eY().b();

      for (bwj $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jr<bwi> $$0) {
      if ($$0.a(bwn.s)) {
         float $$1 = this.eS();
         if (this.eE() > $$1) {
            this.x($$1);
         }
      } else if ($$0.a(bwn.r)) {
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
      return this.al.a(bK);
   }

   public void x(float $$0) {
      this.al.a(bK, ayy.a($$0, 0.0F, this.eS()));
   }

   public boolean eF() {
      return this.eE() <= 0.0F;
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.eF()) {
         return false;
      } else if ($$1.a(awq.i) && this.b(btq.l)) {
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
            if (!$$1.a(awq.j) && $$1.c() instanceof bvf $$7) {
               this.d($$7);
            }

            $$4 = true;
         }

         if ($$1.a(awq.o) && this.aq().a(aws.l)) {
            $$2 *= 5.0F;
         }

         if ($$1.a(awq.a) && !this.a(bur.f).f()) {
            this.d($$1, $$2);
            $$2 *= 0.75F;
         }

         this.aT.a(1.5F);
         if (Float.isNaN($$2) || Float.isInfinite($$2)) {
            $$2 = Float.MAX_VALUE;
         }

         boolean $$8 = true;
         if ((float)this.aj > 10.0F && !$$1.a(awq.e)) {
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

            if (!$$1.a(awq.r) && (!$$4 || $$2 > 0.0F)) {
               this.bD();
            }

            if (!$$1.a(awq.z)) {
               double $$9 = 0.0;
               double $$10 = 0.0;
               if ($$1.c() instanceof cpo $$11) {
                  DoubleDoubleImmutablePair $$12 = $$11.a_(this, $$1);
                  $$9 = -$$12.leftDouble();
                  $$10 = -$$12.rightDouble();
               } else if ($$1.i() != null) {
                  $$9 = $$1.i().a() - this.dB();
                  $$10 = $$1.i().c() - this.dH();
               }

               this.p(0.4F, $$9, $$10);
               if (!$$4) {
                  this.a($$9, $$10);
               }
            }
         }

         if (this.eF()) {
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
            this.cj = this.dW().ad();

            for (bto $$14 : this.eB()) {
               $$14.a($$0, this, $$1, $$2);
            }
         }

         if (this instanceof ard $$15) {
            ap.i.a($$15, $$1, $$3, $$2, $$4);
            if ($$5 > 0.0F && $$5 < 3.4028235E37F) {
               $$15.a(awj.K, Math.round($$5 * 10.0F));
            }
         }

         if ($$1.d() instanceof ard $$16) {
            ap.h.a($$16, this, $$1, $$3, $$2, $$4);
         }

         return $$13;
      }
   }

   protected void f(bsz $$0) {
      if ($$0.d() instanceof bvf $$1 && !$$0.a(awq.q) && (!$$0.a(btc.I) || !this.aq().a(aws.E))) {
         this.a($$1);
      }
   }

   @Nullable
   protected cov g(bsz $$0) {
      buj $$1 = $$0.d();
      if ($$1 instanceof cov $$2) {
         this.bd = 100;
         this.bc = $$2;
         return $$2;
      } else {
         if ($$1 instanceof chz $$3 && $$3.p()) {
            this.bd = 100;
            if ($$3.ag_() instanceof cov $$4) {
               this.bc = $$4;
            } else {
               this.bc = null;
            }

            return this.bc;
         }

         return null;
      }
   }

   protected void d(bvf $$0) {
      $$0.e(this);
   }

   protected void e(bvf $$0) {
      $$0.p(0.5, $$0.dB() - this.dB(), $$0.dH() - this.dH());
   }

   private boolean j(bsz $$0) {
      if ($$0.a(awq.d)) {
         return false;
      } else {
         cwn $$1 = null;
         cyz $$2 = null;

         for (bsh $$3 : bsh.values()) {
            cwn $$4 = this.b($$3);
            $$2 = $$4.a(kv.H);
            if ($$2 != null) {
               $$1 = $$4.v();
               $$4.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof ard $$5) {
               $$5.b(awj.c.b($$1.h()));
               ap.C.a($$5, $$1);
               this.a(ebr.C);
            }

            this.x(1.0F);
            $$2.a($$1, this);
            this.dW().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public bsz eG() {
      if (this.dW().ad() - this.cj > 40L) {
         this.ci = null;
      }

      return this.ci;
   }

   protected void h(bsz $$0) {
      this.b(this.e($$0));
   }

   public void b(@Nullable avy $$0) {
      if ($$0 != null) {
         this.a($$0, this.fg(), this.fh());
      }
   }

   public boolean i(bsz $$0) {
      buj $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cpc $$3 && $$3.z() > 0) {
         $$2 = true;
      }

      cwn $$4 = this.fH();
      if (!$$0.a(awq.c) && $$4 != null && $$4.h() instanceof cxp && !$$2) {
         fay $$5 = $$0.i();
         if ($$5 != null) {
            fay $$6 = this.d(0.0F, this.cA());
            fay $$7 = $$5.a(this.du());
            $$7 = new fay($$7.d, 0.0, $$7.f).d();
            return $$7.b($$6) < 0.0;
         }
      }

      return false;
   }

   private void g(cwn $$0) {
      if (!$$0.f()) {
         if (!this.bb()) {
            this.dW().a(this.dB(), this.dD(), this.dH(), $$0.N(), this.dn(), 0.8F, 0.8F + this.dW().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(bsz $$0) {
      if (!this.dR() && !this.be) {
         buj $$1 = $$0.d();
         bvf $$2 = this.eR();
         if ($$2 != null) {
            $$2.a(this, $$0);
         }

         if (this.fR()) {
            this.fS();
         }

         if (!this.dW().C && this.l_()) {
            a.info("Named entity {} died: {}", this, this.eQ().a().getString());
         }

         this.be = true;
         this.eQ().c();
         if (this.dW() instanceof arc $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(ebr.p);
               this.b($$3, $$0);
               this.f($$2);
            }

            this.dW().a(this, (byte)3);
         }

         this.b(bvr.h);
      }
   }

   protected void f(@Nullable bvf $$0) {
      if (this.dW() instanceof arc $$1) {
         boolean var6 = false;
         if ($$0 instanceof ckn) {
            if ($$1.O().b(dgc.c)) {
               ji $$4 = this.dw();
               dwv $$5 = djm.ck.m();
               if (this.dW().a_($$4).l() && $$5.a((dgj)this.dW(), $$4)) {
                  this.dW().a($$4, $$5, 3);
                  var6 = true;
               }
            }

            if (!var6) {
               cla $$6 = new cla(this.dW(), this.dB(), this.dD(), this.dH(), new cwn(cwr.dF));
               this.dW().b($$6);
            }
         }
      }
   }

   protected void b(arc $$0, bsz $$1) {
      boolean $$2 = this.bd > 0;
      if (this.eo() && $$0.O().b(dgc.f)) {
         this.b($$0, $$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.f($$0);
      this.b($$0, $$1.d());
   }

   protected void f(arc $$0) {
   }

   protected void b(arc $$0, @Nullable buj $$1) {
      if (!this.eJ() && (this.ep() || this.bd > 0 && this.en() && $$0.O().b(dgc.f))) {
         buv.a($$0, this.du(), this.a($$0, $$1));
      }
   }

   protected void a(arc $$0, bsz $$1, boolean $$2) {
   }

   public long eH() {
      return 0L;
   }

   protected float b(buj $$0, bsz $$1) {
      float $$2 = (float)this.h(bwn.d);
      return this.dW() instanceof arc $$3 ? dcz.d($$3, this.ea(), $$0, $$1, $$2) : $$2;
   }

   protected void b(arc $$0, bsz $$1, boolean $$2) {
      Optional<akt<evu>> $$3 = this.eb();
      if (!$$3.isEmpty()) {
         evu $$4 = $$0.p().bc().b($$3.get());
         evs.a $$5 = new evs.a($$0).a(eyj.a, this).a(eyj.f, this.du()).a(eyj.c, $$1).b(eyj.d, $$1.d()).b(eyj.e, $$1.c());
         if ($$2 && this.bc != null) {
            $$5 = $$5.a(eyj.b, this.bc).a(this.bc.gF());
         }

         evs $$6 = $$5.a(eyi.g);
         $$4.a($$6, this.eH(), $$1x -> this.a($$0, $$1x));
      }
   }

   public boolean a(arc $$0, akt<evu> $$1, BiConsumer<arc, cwn> $$2) {
      return this.a($$0, $$1, $$0x -> $$0x.a(eyj.f, this.du()).a(eyj.a, this).a(eyi.j), $$2);
   }

   protected void a(arc $$0, akt<evu> $$1, cwn $$2, BiConsumer<arc, cwn> $$3) {
      this.a($$0, $$1, $$1x -> $$1x.a(eyj.f, this.du()).a(eyj.a, this).a(eyj.i, $$2).a(eyi.s), $$3);
   }

   protected boolean a(arc $$0, akt<evu> $$1, Function<evs.a, evs> $$2, BiConsumer<arc, cwn> $$3) {
      evu $$4 = $$0.p().bc().b($$1);
      evs $$5 = $$2.apply(new evs.a($$0));
      List<cwn> $$6 = $$4.a($$5);
      if (!$$6.isEmpty()) {
         $$6.forEach($$2x -> $$3.accept($$0, $$2x));
         return true;
      } else {
         return false;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(bwn.p);
      if (!($$0 <= 0.0)) {
         this.ar = true;
         fay $$3 = this.dz();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         fay $$4 = new fay($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aJ() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected avy e(bsz $$0) {
      return avz.kG;
   }

   @Nullable
   protected avy o_() {
      return avz.kB;
   }

   private avy q(int $$0) {
      return $$0 > 4 ? this.eM().b() : this.eM().a();
   }

   public void eI() {
      this.cm = true;
   }

   public boolean eJ() {
      return this.cm;
   }

   public float eK() {
      return 0.0F;
   }

   protected fat eL() {
      fat $$0 = this.cR();
      buj $$1 = this.dl();
      if ($$1 != null) {
         fay $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dcx, Set<ddp>> c(bur $$0) {
      return (Map<dcx, Set<ddp>>)this.cn.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public bvf.a eM() {
      return new bvf.a(avz.kH, avz.kz);
   }

   public Optional<ji> eN() {
      return this.ch;
   }

   public boolean q_() {
      if (this.Z_()) {
         return false;
      } else {
         ji $$0 = this.dw();
         dwv $$1 = this.dx();
         if ($$1.a(awo.aS)) {
            this.ch = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dsc && this.c($$0, $$1)) {
            this.ch = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(ji $$0, dwv $$1) {
      if (!$$1.c(dsc.b)) {
         return false;
      } else {
         dwv $$2 = this.dW().a_($$0.e());
         return $$2.a(djm.cX) && $$2.c(dns.b) == $$1.c(dsc.aF);
      }
   }

   @Override
   public boolean bL() {
      return !this.dR() && this.eE() > 0.0F;
   }

   public boolean a(bvf $$0, double $$1, boolean $$2, boolean $$3, double... $$4) {
      fay $$5 = $$0.g(1.0F).d();

      for (double $$6 : $$4) {
         fay $$7 = new fay(this.dB() - $$0.dB(), $$6 - $$0.dF(), this.dH() - $$0.dH());
         double $$8 = $$7.g();
         $$7 = $$7.d();
         double $$9 = $$5.b($$7);
         if ($$9 > 1.0 - $$1 / ($$2 ? $$8 : 1.0)) {
            return $$0.a(this, $$3 ? dfo.a.c : dfo.a.a, dfo.b.a, $$6);
         }
      }

      return false;
   }

   @Override
   public int cE() {
      return this.y(0.0F);
   }

   protected final int y(float $$0) {
      return ayy.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bsz $$2) {
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
      if (this.aq().a(aws.o)) {
         return 0;
      } else {
         float $$2 = (float)this.h(bwn.x);
         float $$3 = $$0 - $$2;
         return ayy.c((double)($$3 * $$1) * this.h(bwn.k));
      }
   }

   protected void eO() {
      if (!this.bb()) {
         int $$0 = ayy.a(this.dB());
         int $$1 = ayy.a(this.dD() - 0.2F);
         int $$2 = ayy.a(this.dH());
         dwv $$3 = this.dW().a_(new ji($$0, $$1, $$2));
         if (!$$3.l()) {
            drc $$4 = $$3.A();
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
      return ayy.a(this.h(bwn.a));
   }

   protected void c(bsz $$0, float $$1) {
   }

   protected void d(bsz $$0, float $$1) {
   }

   protected void z(float $$0) {
   }

   protected void a(bsz $$0, float $$1, bur... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bur $$4 : $$2) {
            cwn $$5 = this.a($$4);
            des $$6 = $$5.a(kv.D);
            if ($$6 != null && $$6.h() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float e(bsz $$0, float $$1) {
      if (!$$0.a(awq.b)) {
         this.c($$0, $$1);
         $$1 = bsv.a(this, $$1, $$0, (float)this.eP(), (float)this.h(bwn.b));
      }

      return $$1;
   }

   protected float f(bsz $$0, float $$1) {
      if ($$0.a(awq.f)) {
         return $$1;
      } else {
         if (this.b(btq.k) && !$$0.a(awq.g)) {
            int $$2 = (this.c(btq.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof ard) {
                  ((ard)this).a(awj.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof ard) {
                  ((ard)$$0.d()).a(awj.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(awq.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dW() instanceof arc $$7) {
               $$8 = dcz.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bsv.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void b(arc $$0, bsz $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var10 = Math.max($$2 - this.fw(), 0.0F);
         this.E(this.fw() - ($$2 - var10));
         float $$4 = $$2 - var10;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F && $$1.d() instanceof ard $$5) {
            $$5.a(awj.H, Math.round($$4 * 10.0F));
         }

         if (var10 != 0.0F) {
            this.eQ().a($$1, var10);
            this.x(this.eE() - var10);
            this.E(this.fw() - var10);
            this.a(ebr.o);
         }
      }
   }

   public bsw eQ() {
      return this.bS;
   }

   @Nullable
   public bvf eR() {
      if (this.bc != null) {
         return this.bc;
      } else {
         return this.bZ != null ? this.bZ : null;
      }
   }

   public final float eS() {
      return (float)this.h(bwn.s);
   }

   public final float eT() {
      return (float)this.h(bwn.r);
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

   private int C() {
      if (btp.a(this)) {
         return 6 - (1 + btp.b(this));
      } else {
         return this.b(btq.d) ? 6 + (1 + this.c(btq.d).e()) * 2 : 6;
      }
   }

   public void a(bsh $$0) {
      this.a($$0, false);
   }

   public void a(bsh $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.C() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dW() instanceof arc) {
            abn $$2 = new abn(this, $$0 == bsh.a ? 0 : 3);
            aqz $$3 = ((arc)this.dW()).m();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bsz $$0) {
      this.aT.a(1.5F);
      this.aj = 20;
      this.aO = 10;
      this.aN = this.aO;
      avy $$1 = this.e($$0);
      if ($$1 != null) {
         this.a($$1, this.fg(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }

      this.ci = $$0;
      this.cj = this.dW().ad();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            avy $$1 = this.o_();
            if ($$1 != null) {
               this.a($$1, this.fg(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cov)) {
               this.x(0.0F);
               this.a(this.dX().p());
            }
            break;
         case 29:
            this.a(avz.xd, 1.0F, 0.8F + this.dW().A.i() * 0.4F);
            break;
         case 30:
            this.a(avz.xe, 0.8F, 0.8F + this.dW().A.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ae.i() - 0.5F) * 0.2F;
               float $$6 = (this.ae.i() - 0.5F) * 0.2F;
               float $$7 = (this.ae.i() - 0.5F) * 0.2F;
               double $$8 = ayy.d($$4, this.K, this.dB()) + (this.ae.j() - 0.5) * (double)this.dr() * 2.0;
               double $$9 = ayy.d($$4, this.L, this.dD()) + this.ae.j() * (double)this.ds();
               double $$10 = ayy.d($$4, this.M, this.dH()) + (this.ae.j() - 0.5) * (double)this.dr() * 2.0;
               this.dW().a(lt.ae, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.g(this.a(bur.a));
            break;
         case 48:
            this.g(this.a(bur.b));
            break;
         case 49:
            this.g(this.a(bur.f));
            break;
         case 50:
            this.g(this.a(bur.e));
            break;
         case 51:
            this.g(this.a(bur.d));
            break;
         case 52:
            this.g(this.a(bur.c));
            break;
         case 54:
            dng.b(this);
            break;
         case 55:
            this.D();
            break;
         case 60:
            this.eW();
            break;
         case 65:
            this.g(this.a(bur.g));
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
         this.dW().a(lt.ad, this.d(1.0) - $$1 * 10.0, this.dE() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
      }
   }

   private void D() {
      cwn $$0 = this.a(bur.b);
      this.a(bur.b, this.a(bur.a));
      this.a(bur.a, $$0);
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
   public bwj g(jr<bwi> $$0) {
      return this.eY().a($$0);
   }

   public double h(jr<bwi> $$0) {
      return this.eY().c($$0);
   }

   public double i(jr<bwi> $$0) {
      return this.eY().d($$0);
   }

   public bwk eY() {
      return this.bR;
   }

   public cwn eZ() {
      return this.a(bur.a);
   }

   public cwn fa() {
      return this.a(bur.b);
   }

   public cwn a(buz $$0) {
      return this.fy() == $$0 ? this.eZ() : this.fa();
   }

   @Nonnull
   @Override
   public cwn ea() {
      return this.eZ();
   }

   public boolean b(cwj $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cwn> $$0) {
      return $$0.test(this.eZ()) || $$0.test(this.fa());
   }

   public cwn b(bsh $$0) {
      if ($$0 == bsh.a) {
         return this.a(bur.a);
      } else if ($$0 == bsh.b) {
         return this.a(bur.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bsh $$0, cwn $$1) {
      if ($$0 == bsh.a) {
         this.a(bur.a, $$1);
      } else {
         if ($$0 != bsh.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bur.b, $$1);
      }
   }

   public boolean d(bur $$0) {
      return !this.a($$0).f();
   }

   public boolean e(bur $$0) {
      return false;
   }

   public abstract Iterable<cwn> fb();

   public abstract cwn a(bur var1);

   public abstract void a(bur var1, cwn var2);

   public Iterable<cwn> fc() {
      return List.of();
   }

   public Iterable<cwn> fd() {
      return this.fb();
   }

   public Iterable<cwn> fe() {
      return Iterables.concat(this.fc(), this.fd());
   }

   protected void c(cwn $$0) {
      $$0.h().l($$0);
   }

   public float ff() {
      Iterable<cwn> $$0 = this.fb();
      int $$1 = 0;
      int $$2 = 0;

      for (cwn $$3 : $$0) {
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
      bwj $$1 = this.g(bwn.v);
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
   public void h(buj $$0) {
      if (!this.fR()) {
         super.h($$0);
      }
   }

   private void c(buj $$0) {
      fay $$1;
      if (this.dR()) {
         $$1 = this.du();
      } else if (!$$0.dR() && !this.dW().a_($$0.dw()).a(awo.aM)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dD(), $$0.dD());
         $$1 = new fay(this.dB(), $$2, this.dH());
         boolean $$4 = this.dr() <= 4.0F && this.ds() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.ds() / 2.0;
            fay $$6 = $$1.b(0.0, $$5, 0.0);
            fbs $$7 = fbp.a(fat.a($$6, (double)this.dr(), (double)this.ds(), (double)this.dr()));
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
      return (float)this.h(bwn.o) * $$0 * this.aS() + this.fk();
   }

   public float fk() {
      return this.b(btq.h) ? 0.1F * ((float)this.c(btq.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void s() {
      float $$0 = this.fj();
      if (!($$0 <= 1.0E-5F)) {
         fay $$1 = this.dz();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.cj()) {
            float $$2 = this.dM() * (float) (Math.PI / 180.0);
            this.i(new fay((double)(-ayy.a($$2)) * 0.2, 0.0, (double)ayy.b($$2) * 0.2));
         }

         this.ar = true;
      }
   }

   protected void fl() {
      this.h(this.dz().b(0.0, -0.04F, 0.0));
   }

   protected void c(axe<esw> $$0) {
      this.h(this.dz().b(0.0, 0.04F, 0.0));
   }

   protected float fm() {
      return 0.8F;
   }

   public boolean a(esx $$0) {
      return false;
   }

   @Override
   protected double bd() {
      return this.h(bwn.n);
   }

   protected double fn() {
      boolean $$0 = this.dz().e <= 0.0;
      return $$0 && this.b(btq.B) ? Math.min(this.be(), 0.01) : this.be();
   }

   public void a_(fay $$0) {
      if (this.di()) {
         esx $$1 = this.dW().b_(this.dw());
         if ((this.bj() || this.bx()) && this.el() && !this.a($$1)) {
            this.l($$0);
         } else if (this.fJ()) {
            this.E();
         } else {
            this.k($$0);
         }
      }
   }

   private void k(fay $$0) {
      ji $$1 = this.aQ();
      float $$2 = this.aJ() ? this.dW().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      fay $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      bto $$6 = this.c(btq.y);
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
         float $$7 = this instanceof chf ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void l(fay $$0) {
      boolean $$1 = this.dz().e <= 0.0;
      double $$2 = this.dD();
      double $$3 = this.fn();
      if (this.bj()) {
         float $$4 = this.cj() ? 0.9F : this.fm();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bwn.F);
         if (!this.aJ()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fp() - $$5) * $$6;
         }

         if (this.b(btq.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bvj.a, this.dz());
         fay $$7 = this.dz();
         if (this.P && this.q_()) {
            $$7 = new fay($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.h(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bvj.a, this.dz());
         if (this.b(awu.b) <= this.dq()) {
            this.h(this.dz().d(0.5, 0.8F, 0.5));
            fay $$8 = this.a($$3, $$1, this.dz());
            this.h($$8);
         } else {
            this.h(this.dz().c(0.5));
         }

         if ($$3 != 0.0) {
            this.h(this.dz().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      fay $$9 = this.dz();
      if (this.P && this.g($$9.d, $$9.e + 0.6F - this.dD() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void E() {
      fay $$0 = this.dz();
      double $$1 = $$0.i();
      this.h(this.m($$0));
      this.a(bvj.a, this.dz());
      if (!this.dW().C) {
         double $$2 = this.dz().i();
         this.c($$1, $$2);
      }
   }

   private fay m(fay $$0) {
      fay $$1 = this.bT();
      float $$2 = this.dO() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fn();
      double $$6 = ayy.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-ayy.a($$2)) * 0.04;
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

   private void c(cov $$0, fay $$1) {
      fay $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.di()) {
         this.C(this.e($$0));
         this.a_($$2);
      } else {
         this.h(fay.c);
      }
   }

   protected void a(cov $$0, fay $$1) {
   }

   protected fay b(cov $$0, fay $$1) {
      return $$1;
   }

   protected float e(cov $$0) {
      return this.fp();
   }

   public void s(boolean $$0) {
      float $$1 = (float)ayy.g(this.dB() - this.K, $$0 ? this.dD() - this.L : 0.0, this.dH() - this.M);
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

   private fay a(fay $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.h(this.n(this.dz()));
      this.a(bvj.a, this.dz());
      fay $$2 = this.dz();
      if ((this.P || this.bm) && (this.q_() || this.dx().a(djm.rr) && dpj.a(this))) {
         $$2 = new fay($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public fay a(double $$0, boolean $$1, fay $$2) {
      if ($$0 != 0.0 && !this.cj()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new fay($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private fay n(fay $$0) {
      if (this.q_()) {
         this.k();
         float $$1 = 0.15F;
         double $$2 = ayy.a($$0.d, -0.15F, 0.15F);
         double $$3 = ayy.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dx().a(djm.ou) && this.fI() && this instanceof cov) {
            $$4 = 0.0;
         }

         $$0 = new fay($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aJ() ? this.fp() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fo();
   }

   protected float fo() {
      return this.cX() instanceof cov ? this.fp() * 0.1F : 0.02F;
   }

   public float fp() {
      return this.cd;
   }

   public void C(float $$0) {
      this.cd = $$0;
   }

   public boolean c(arc $$0, buj $$1) {
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
         float $$8 = (float)ayy.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ayy.e(ayy.h(this.dM()) - $$8);
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
      bor $$10 = boq.a();
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
         this.bA++;
      } else {
         this.bA = 0;
      }

      if (this.fR()) {
         this.w(0.0F);
      }

      this.B();
      float $$11 = this.ek();
      if ($$11 != this.bF) {
         this.bF = $$11;
         this.m_();
      }

      this.bb.a();
   }

   private void F() {
      Map<bur, cwn> $$0 = this.G();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bur, cwn> G() {
      Map<bur, cwn> $$0 = null;

      for (bur $$1 : bur.i) {
         cwn $$2 = switch ($$1.a()) {
            case a -> this.h($$1);
            case b -> this.g($$1);
            case c -> this.bW;
         };
         cwn $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bur.class);
            }

            $$0.put($$1, $$3);
            bwk $$4 = this.eY();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<bur, cwn> $$5 : $$0.entrySet()) {
            bur $$6 = $$5.getKey();
            cwn $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1) -> {
                  bwj $$2 = this.bR.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1.b());
                     $$2.b($$1);
                  }
               });
               if (this.dW() instanceof arc $$8) {
                  dcz.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(cwn $$0, cwn $$1) {
      return !cwn.a($$1, $$0);
   }

   private void a(Map<bur, cwn> $$0) {
      cwn $$1 = $$0.get(bur.a);
      cwn $$2 = $$0.get(bur.b);
      if ($$1 != null && $$2 != null && cwn.a($$1, this.h(bur.b)) && cwn.a($$2, this.h(bur.a))) {
         ((arc)this.dW()).m().b(this, new aco(this, (byte)55));
         $$0.remove(bur.a);
         $$0.remove(bur.b);
         this.c(bur.a, $$1.v());
         this.c(bur.b, $$2.v());
      }
   }

   private void b(Map<bur, cwn> $$0) {
      List<Pair<bur, cwn>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cwn $$3 = $$2.v();
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
      ((arc)this.dW()).m().b(this, new aex(this.ar(), $$1));
   }

   private cwn g(bur $$0) {
      return this.bV.get($$0.b());
   }

   private void b(bur $$0, cwn $$1) {
      this.bV.set($$0.b(), $$1);
   }

   private cwn h(bur $$0) {
      return this.bU.get($$0.b());
   }

   private void c(bur $$0, cwn $$1) {
      this.bU.set($$0.b(), $$1);
   }

   protected float g(float $$0, float $$1) {
      float $$2 = ayy.h($$0 - this.aX);
      this.aX += $$2 * 0.3F;
      float $$3 = ayy.h(this.dM() - this.aX);
      float $$4 = this.fq();
      if (Math.abs($$3) > $$4) {
         this.aX = this.aX + ($$3 - (float)ayy.j((double)$$3) * $$4);
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
      } else if (!this.dk()) {
         this.h(this.dz().c(0.98));
      }

      if (this.bx > 0) {
         this.a(this.bx, this.bw);
         this.bx--;
      }

      fay $$0 = this.dz();
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
      bor $$4 = boq.a();
      $$4.a("ai");
      if (this.fi()) {
         this.bm = false;
         this.bn = 0.0F;
         this.bp = 0.0F;
      } else if (this.dk()) {
         $$4.a("newAi");
         this.fu();
         $$4.c();
      }

      $$4.c();
      $$4.a("jump");
      if (this.bm && this.el()) {
         double $$5;
         if (this.bx()) {
            $$5 = this.b(awu.b);
         } else {
            $$5 = this.b(awu.a);
         }

         boolean $$7 = this.bj() && $$5 > 0.0;
         double $$8 = this.dq();
         if (!$$7 || this.aJ() && !($$5 > $$8)) {
            if (!this.bx() || this.aJ() && !($$5 > $$8)) {
               if ((this.aJ() || $$7 && $$5 <= $$8) && this.ce == 0) {
                  this.s();
                  this.ce = 10;
               }
            } else {
               this.c(awu.b);
            }
         } else {
            this.c(awu.a);
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

      fat $$9 = this.cR();
      fay $$10 = new fay((double)this.bn, (double)this.bo, (double)this.bp);
      if (this.b(btq.B) || this.b(btq.y)) {
         this.k();
      }

      label112: {
         if (this.cX() instanceof cov $$11 && this.bL()) {
            this.c($$11, $$10);
            break label112;
         }

         this.a_($$10);
      }

      if (!this.dW().B_() || this.di()) {
         this.aK();
      }

      this.s(this instanceof chf);
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
      if (this.dW() instanceof arc $$13 && this.af % 40 == 0 && this.cw() && this.dK()) {
         this.a($$13, this.dX().v(), 1.0F);
      }

      $$4.c();
      $$4.a("push");
      if (this.bB > 0) {
         this.bB--;
         this.a($$9, this.cR());
      }

      this.o();
      $$4.c();
      if (this.dW() instanceof arc $$14 && this.fr() && this.bl()) {
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

         int $$0 = this.bA + 1;
         if ($$0 % 10 == 0) {
            int $$1 = $$0 / 10;
            if ($$1 % 2 == 0) {
               List<bur> $$2 = bur.i.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               bur $$3 = af.a($$2, this.ae);
               this.a($$3).a(1, this, $$3);
            }

            this.a(ebr.n);
         }
      }
   }

   protected boolean ft() {
      if (!this.aJ() && !this.bZ() && !this.b(btq.y)) {
         for (bur $$0 : bur.i) {
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
      if (!(this.dW() instanceof arc $$0)) {
         this.dW().a(ebf.a(cov.class), this.cR(), buo.a(this)).forEach(this::D);
      } else {
         List<buj> $$2 = this.dW().a(this, this.cR(), buo.a(this));
         if (!$$2.isEmpty()) {
            int $$3 = $$0.O().c(dgc.v);
            if ($$3 > 0 && $$2.size() > $$3 - 1 && this.ae.a(4) == 0) {
               int $$4 = 0;

               for (buj $$5 : $$2) {
                  if (!$$5.bZ()) {
                     $$4++;
                  }
               }

               if ($$4 > $$3 - 1) {
                  this.a($$0, this.dX().h(), 6.0F);
               }
            }

            for (buj $$6 : $$2) {
               this.D($$6);
            }
         }
      }
   }

   protected void a(fat $$0, fat $$1) {
      fat $$2 = $$0.b($$1);
      List<buj> $$3 = this.dW().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (buj $$4 : $$3) {
            if ($$4 instanceof bvf) {
               this.g((bvf)$$4);
               this.bB = 0;
               this.h(this.dz().c(-0.2));
               break;
            }
         }
      } else if (this.P) {
         this.bB = 0;
      }

      if (!this.dW().C && this.bB <= 0) {
         this.c(4, false);
         this.bC = 0.0F;
         this.bD = null;
      }
   }

   protected void D(buj $$0) {
      $$0.h(this);
   }

   protected void g(bvf $$0) {
   }

   public boolean fv() {
      return (this.al.a(aC) & 4) != 0;
   }

   @Override
   public void ae() {
      buj $$0 = this.dl();
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
      return this.bq > 0 ? this.br : this.dB();
   }

   @Override
   public double S_() {
      return this.bq > 0 ? this.bs : this.dD();
   }

   @Override
   public double g_() {
      return this.bq > 0 ? this.bt : this.dH();
   }

   @Override
   public float r_() {
      return this.bq > 0 ? (float)this.bv : this.dO();
   }

   @Override
   public float h_() {
      return this.bq > 0 ? (float)this.bu : this.dM();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bw = (double)$$0;
      this.bx = $$1;
   }

   public void t(boolean $$0) {
      this.bm = $$0;
   }

   public void a(cla $$0) {
      buj $$1 = $$0.p();
      if ($$1 instanceof ard) {
         ap.R.a((ard)$$1, $$0.l(), this);
      }
   }

   public void a(buj $$0, int $$1) {
      if (!$$0.dR() && !this.dW().C && ($$0 instanceof cla || $$0 instanceof cpc || $$0 instanceof buv)) {
         ((arc)this.dW()).m().b($$0, new afs($$0.ar(), this.ar(), $$1));
      }
   }

   public boolean E(buj $$0) {
      return this.a($$0, dfo.a.a, dfo.b.a, $$0.dF());
   }

   public boolean a(buj $$0, dfo.a $$1, dfo.b $$2, double $$3) {
      if ($$0.dW() != this.dW()) {
         return false;
      } else {
         fay $$4 = new fay(this.dB(), this.dF(), this.dH());
         fay $$5 = new fay($$0.dB(), $$3, $$0.dH());
         return $$5.f($$4) > 128.0 ? false : this.dW().a(new dfo($$4, $$5, $$1, $$2, this)).d() == faw.a.a;
      }
   }

   @Override
   public float i(float $$0) {
      return $$0 == 1.0F ? this.aZ : ayy.i($$0, this.ba, this.aZ);
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
   public fay a(jn.a $$0, l.a $$1) {
      return j(super.a($$0, $$1));
   }

   public static fay j(fay $$0) {
      return new fay($$0.d, $$0.e, 0.0);
   }

   public float fw() {
      return this.cf;
   }

   public final void E(float $$0) {
      this.F(ayy.a($$0, 0.0F, this.eT()));
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

   public abstract buz fy();

   public boolean fz() {
      return (this.al.a(aC) & 1) > 0;
   }

   public bsh fA() {
      return (this.al.a(aC) & 2) > 0 ? bsh.b : bsh.a;
   }

   private void H() {
      if (this.fz()) {
         if (cwn.b(this.b(this.fA()), this.by)) {
            this.by = this.b(this.fA());
            this.a(this.by);
         } else {
            this.fF();
         }
      }
   }

   protected void a(cwn $$0) {
      $$0.b(this.dW(), this, this.fC());
      if (--this.bz == 0 && !this.dW().C && !$$0.x()) {
         this.w();
      }
   }

   private void I() {
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

   public void c(bsh $$0) {
      cwn $$1 = this.b($$0);
      if (!$$1.f() && !this.fz()) {
         this.by = $$1;
         this.bz = $$1.a(this);
         if (!this.dW().C) {
            this.c(1, true);
            this.c(2, $$0 == bsh.b);
            this.a(ebr.D);
         }
      }
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (bP.equals($$0)) {
         if (this.dW().C) {
            this.fP().ifPresent(this::a);
         }
      } else if (aC.equals($$0) && this.dW().C) {
         if (this.fz() && this.by.f()) {
            this.by = this.b(this.fA());
            if (!this.by.f()) {
               this.bz = this.by.a(this);
            }
         } else if (!this.fz() && !this.by.f()) {
            this.by = cwn.j;
            this.bz = 0;
         }
      }
   }

   @Override
   public void a(fj.a $$0, fay $$1) {
      super.a($$0, $$1);
      this.ba = this.aZ;
      this.aX = this.aZ;
      this.aY = this.aX;
   }

   @Override
   public float t(float $$0) {
      return ayy.h($$0, this.aY, this.aX);
   }

   public void b(cwn $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         fay $$3 = new fay(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dO() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dM() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ae.i()) * 0.6 - 0.3;
         fay $$5 = new fay(((double)this.ae.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dO() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dM() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dB(), this.dF(), this.dH());
         this.dW().a(new lp(lt.T, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void w() {
      if (!this.dW().C || this.fz()) {
         bsh $$0 = this.fA();
         if (!this.by.equals(this.b($$0))) {
            this.fE();
         } else {
            if (!this.by.f() && this.fz()) {
               cwn $$1 = this.by.a(this.dW(), this);
               if ($$1 != this.by) {
                  this.a($$0, $$1);
               }

               this.fF();
            }
         }
      }
   }

   public void b(cwn $$0) {
   }

   public cwn fB() {
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
         this.by.a(this.dW(), this, this.fC());
         if (this.by.x()) {
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
            this.a(ebr.C);
         }
      }

      this.by = cwn.j;
      this.bz = 0;
   }

   public boolean fG() {
      return this.fH() != null;
   }

   @Nullable
   public cwn fH() {
      if (this.fz() && !this.by.f()) {
         cwj $$0 = this.by.h();
         if ($$0.b(this.by) != cwp.d) {
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
      return super.cl() || !this.fJ() && this.c(bvr.b);
   }

   public int fK() {
      return this.bA;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dB();
      double $$5 = this.dD();
      double $$6 = this.dH();
      double $$7 = $$1;
      boolean $$8 = false;
      ji $$9 = ji.a($$0, $$1, $$2);
      dgg $$10 = this.dW();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.L_()) {
            ji $$12 = $$9.e();
            dwv $$13 = $$10.a_($$12);
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

         if (this instanceof bvn $$14) {
            $$14.L().m();
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

   public void a(ji $$0, boolean $$1) {
   }

   public boolean fN() {
      return false;
   }

   @Override
   public final bum a(bvr $$0) {
      return $$0 == bvr.c ? aD : this.e($$0).a(this.ek());
   }

   protected bum e(bvr $$0) {
      return this.aq().n().a(this.ej());
   }

   public ImmutableList<bvr> fO() {
      return ImmutableList.of(bvr.a);
   }

   public fat f(bvr $$0) {
      bum $$1 = this.a($$0);
      return new fat((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bvr $$0) {
      fat $$1 = this.a($$0).a(this.du());
      return this.dW().b(this, $$1);
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

      dwv $$1 = this.dW().a_($$0);
      if ($$1.b() instanceof djd) {
         this.dW().a($$0, $$1.b(djd.c, Boolean.valueOf(true)), 3);
      }

      this.b(bvr.c);
      this.a($$0);
      this.g($$0);
      this.h(fay.c);
      this.ar = true;
   }

   private void a(ji $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean J() {
      return this.fP().map($$0 -> this.dW().a_($$0).b() instanceof djd).orElse(false);
   }

   public void fS() {
      this.fP().filter(this.dW()::B).ifPresent($$0x -> {
         dwv $$1 = this.dW().a_($$0x);
         if ($$1.b() instanceof djd) {
            jn $$2 = $$1.c(djd.aF);
            this.dW().a($$0x, $$1.b(djd.c, Boolean.valueOf(false)), 3);
            fay $$3 = djd.a(this.aq(), this.dW(), $$0x, $$2, this.dM()).orElseGet(() -> {
               ji $$1x = $$0x.d();
               return new fay((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            fay $$4 = fay.c($$0x).d($$3).d();
            float $$5 = (float)ayy.d(ayy.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.v($$5);
            this.w(0.0F);
         }
      });
      fay $$0 = this.du();
      this.b(bvr.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fQ();
   }

   @Nullable
   public jn fT() {
      ji $$0 = this.fP().orElse(null);
      return $$0 != null ? djd.a(this.dW(), $$0) : null;
   }

   @Override
   public boolean bM() {
      return !this.fR() && super.bM();
   }

   public cwn d(cwn $$0) {
      return cwn.j;
   }

   private static byte i(bur $$0) {
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

   public void a(cwj $$0, bur $$1) {
      this.dW().a(this, i($$1));
      this.a(this.a($$1), $$1, this.bR);
   }

   private void a(cwn $$0, bur $$1, bwk $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         bwj $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      dcz.a($$0, this, $$1);
   }

   public static bur d(bsh $$0) {
      return $$0 == bsh.a ? bur.a : bur.b;
   }

   public final boolean e(cwn $$0) {
      if (this.bL() && !this.Z_()) {
         des $$1 = $$0.a(kv.D);
         if ($$1 != null && $$1.f()) {
            bur $$2 = $$1.a();
            return this.e($$2) && $$1.a(this.aq()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(bur $$0) {
      return true;
   }

   public final bur f(cwn $$0) {
      des $$1 = $$0.a(kv.D);
      return $$1 != null && this.e($$1.a()) ? $$1.a() : bur.a;
   }

   public final boolean a(cwn $$0, bur $$1) {
      des $$2 = $$0.a(kv.D);
      return $$2 == null ? $$1 == bur.a && this.e(bur.a) : $$1 == $$2.a() && this.e($$2.a()) && $$2.a(this.aq());
   }

   private static bvx a(bvf $$0, bur $$1) {
      return $$1 != bur.f && $$1 != bur.a && $$1 != bur.b ? bvx.a($$0, $$1, $$2 -> $$2.f() || $$0.f($$2) == $$1) : bvx.a($$0, $$1);
   }

   @Nullable
   private static bur r(int $$0) {
      if ($$0 == 100 + bur.f.b()) {
         return bur.f;
      } else if ($$0 == 100 + bur.e.b()) {
         return bur.e;
      } else if ($$0 == 100 + bur.d.b()) {
         return bur.d;
      } else if ($$0 == 100 + bur.c.b()) {
         return bur.c;
      } else if ($$0 == 98) {
         return bur.a;
      } else if ($$0 == 99) {
         return bur.b;
      } else {
         return $$0 == 105 ? bur.g : null;
      }
   }

   @Override
   public bvx a_(int $$0) {
      bur $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dK() {
      if (this.Z_()) {
         return false;
      } else {
         boolean $$0 = !this.a(bur.f).a(awx.bq) && !this.a(bur.e).a(awx.bq) && !this.a(bur.d).a(awx.bq) && !this.a(bur.c).a(awx.bq) && !this.a(bur.g).a(awx.bq);
         return $$0 && super.dK();
      }
   }

   @Override
   public boolean co() {
      return !this.dW().B_() && this.b(btq.x) || super.co();
   }

   @Override
   public float dN() {
      return this.aX;
   }

   @Override
   public void a(abl $$0) {
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
      return this.ea().h() instanceof cup;
   }

   @Override
   public float dQ() {
      float $$0 = (float)this.h(bwn.B);
      return this.cX() instanceof cov ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public fay m(buj $$0) {
      return this.du().e(this.a($$0, this.a(this.aw()), this.ek() * this.ej()));
   }

   protected void a(int $$0, double $$1) {
      this.aZ = (float)ayy.e(1.0 / (double)$$0, (double)this.aZ, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(ayy.c((double)$$0 * this.h(bwn.h)));
   }

   public boolean fV() {
      return false;
   }

   public boolean a(arc $$0, bsz $$1) {
      return this.d($$1) || dcz.a($$0, this, $$1);
   }

   public static boolean b(cwn $$0, bur $$1) {
      if (!$$0.b(kv.F)) {
         return false;
      } else {
         des $$2 = $$0.a(kv.D);
         return $$2 != null && $$1 == $$2.a() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fW() {
      return this.bd;
   }

   public static record a(avy a, avy b) {
   }
}

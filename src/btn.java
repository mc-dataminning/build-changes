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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class btn extends bsr implements bso {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final akr d = akr.b("powder_snow");
   private static final akr e = akr.b("sprinting");
   private static final buu bH = new buu(e, 0.3F, buu.a.c);
   public static final int i = 2;
   public static final int j = 4;
   public static final int k = 98;
   public static final int l = 100;
   public static final int m = 105;
   public static final int n = 6;
   public static final int o = 100;
   private static final int bI = 40;
   public static final double p = 0.003;
   public static final double q = 0.08;
   public static final int r = 20;
   private static final int bJ = 10;
   private static final int bK = 2;
   public static final int s = 4;
   public static final float t = 0.42F;
   private static final double bL = 128.0;
   protected static final int u = 1;
   protected static final int v = 2;
   protected static final int aD = 4;
   protected static final ajw<Byte> aE = aka.a(btn.class, ajy.a);
   private static final ajw<Float> bM = aka.a(btn.class, ajy.d);
   private static final ajw<List<lk>> bN = aka.a(btn.class, ajy.m);
   private static final ajw<Boolean> bO = aka.a(btn.class, ajy.k);
   private static final ajw<Integer> bP = aka.a(btn.class, ajy.b);
   private static final ajw<Integer> bQ = aka.a(btn.class, ajy.b);
   private static final ajw<Optional<jd>> bR = aka.a(btn.class, ajy.p);
   private static final int bS = 15;
   protected static final bsu aF = bsu.c(0.2F, 0.2F).b(0.2F);
   public static final float aG = 0.5F;
   public static final float aH = 0.5F;
   private static final float bT = 0.21875F;
   public static final String aI = "attributes";
   private final but bU;
   private final brh bV = new brh(this);
   private final Map<jm<brx>, brz> bW = Maps.newHashMap();
   private final jv<cuq> bX = jv.a(2, cuq.l);
   private final jv<cuq> bY = jv.a(4, cuq.l);
   private cuq bZ = cuq.l;
   public boolean aJ;
   private boolean ca = false;
   public bqq aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public int aQ;
   public float aR;
   public float aS;
   protected int aT;
   public final bup aU = new bup();
   public final int aV = 20;
   public final float aW;
   public final float aX;
   public float aY;
   public float aZ;
   public float ba;
   public float bb;
   @Nullable
   protected cmx bc;
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
   private boolean cb = true;
   @Nullable
   private btn cc;
   private int cd;
   @Nullable
   private btn ce;
   private int cf;
   private float cg;
   private int ch;
   private float ci;
   protected cuq bz = cuq.l;
   protected int bA;
   protected int bB;
   private jd cj;
   private Optional<jd> ck = Optional.empty();
   @Nullable
   private brk cl;
   private long cm;
   protected int bC;
   protected float bD;
   @Nullable
   protected cuq bE;
   private float cn;
   private float co;
   protected buq<?> bF;
   private boolean cp;
   private final Reference2ObjectMap<dac, Set<dat>> cq = new Reference2ObjectArrayMap();
   protected float bG = 1.0F;

   protected btn(bsx<? extends btn> $$0, dcw $$1) {
      super($$0, $$1);
      this.bU = new but(bux.a($$0));
      this.v(this.eN());
      this.J = true;
      this.aX = (float)((Math.random() + 1.0) * 0.01F);
      this.av();
      this.aW = (float)Math.random() * 12398.0F;
      this.t((float)(Math.random() * (float) (Math.PI * 2)));
      this.ba = this.dE();
      up $$2 = up.a;
      this.bF = this.a(new Dynamic($$2, (uy)$$2.createMap(ImmutableMap.of($$2.a("memories"), (uy)$$2.emptyMap()))));
   }

   public buq<?> dT() {
      return this.bF;
   }

   protected buq.b<?> dU() {
      return buq.a(ImmutableList.of(), ImmutableList.of());
   }

   protected buq<?> a(Dynamic<?> $$0) {
      return this.dU().a($$0);
   }

   @Override
   public void ap() {
      this.a(this.dP().x(), Float.MAX_VALUE);
   }

   public boolean a(bsx<?> $$0) {
      return true;
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(aE, (byte)0);
      $$0.a(bN, List.of());
      $$0.a(bO, false);
      $$0.a(bP, 0);
      $$0.a(bQ, 0);
      $$0.a(bM, 1.0F);
      $$0.a(bR, Optional.empty());
   }

   public static buv.a dV() {
      return buv.a()
         .a(buw.s)
         .a(buw.p)
         .a(buw.v)
         .a(buw.a)
         .a(buw.b)
         .a(buw.r)
         .a(buw.B)
         .a(buw.y)
         .a(buw.n)
         .a(buw.x)
         .a(buw.k)
         .a(buw.o)
         .a(buw.w)
         .a(buw.h)
         .a(buw.i)
         .a(buw.E)
         .a(buw.u)
         .a(buw.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, jd $$3) {
      if (!this.bf()) {
         this.bn();
      }

      if (this.dO() instanceof aqu $$4 && $$1 && this.ac > 0.0F) {
         this.b($$4, $$3);
         double $$5 = this.g(buw.x);
         if ((double)this.ac > $$5 && !$$2.i()) {
            double $$6 = this.dt();
            double $$7 = this.dv();
            double $$8 = this.dz();
            jd $$9 = this.do();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            float $$13 = (float)ayo.c((double)this.ac - $$5);
            double $$14 = Math.min((double)(0.2F + $$13 / 15.0F), 2.5);
            int $$15 = (int)(150.0 * $$14);
            ((aqu)this.dO()).a(new le(lm.b, $$2), $$6, $$7, $$8, $$15, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.ck = Optional.empty();
      }
   }

   public final boolean dW() {
      return this.am().a(awi.m);
   }

   public float a(float $$0) {
      return ayo.i($$0, this.co, this.cn);
   }

   public boolean dX() {
      return this.dr().b() < 1.0E-5F && this.bj();
   }

   @Override
   public void aw() {
      this.aR = this.aS;
      if (this.an) {
         this.fF().ifPresent(this::a);
      }

      if (this.dO() instanceof aqu $$0) {
         dae.b($$0, this);
      }

      super.aw();
      this.dO().ag().a("livingEntityBaseTick");
      if (this.be() || this.dO().B) {
         this.aD();
      }

      if (this.bE()) {
         boolean $$1 = this instanceof cmx;
         if (!this.dO().B) {
            if (this.bF()) {
               this.a(this.dP().g(), 1.0F);
            } else if ($$1 && !this.dO().C_().a(this.cK())) {
               double $$2 = this.dO().C_().a(this) + this.dO().C_().n();
               if ($$2 < 0.0) {
                  double $$3 = this.dO().C_().o();
                  if ($$3 > 0.0) {
                     this.a(this.dP().w(), (float)Math.max(1, ayo.a(-$$2 * $$3)));
                  }
               }
            }
         }

         if (this.a(awk.a) && !this.dO().a_(jd.a(this.dt(), this.dx(), this.dz())).a(dga.nd)) {
            boolean $$4 = !this.dW() && !bsa.c(this) && (!$$1 || !((cmx)this).fZ().a);
            if ($$4) {
               this.j(this.m(this.cm()));
               if (this.cm() == -20) {
                  this.j(0);
                  exc $$5 = this.dr();

                  for (int $$6 = 0; $$6 < 8; $$6++) {
                     double $$7 = this.ah.j() - this.ah.j();
                     double $$8 = this.ah.j() - this.ah.j();
                     double $$9 = this.ah.j() - this.ah.j();
                     this.dO().a(lm.d, this.dt() + $$7, this.dv() + $$8, this.dz() + $$9, $$5.c, $$5.d, $$5.e);
                  }

                  this.a(this.dP().i(), 2.0F);
               }
            }

            if (!this.dO().B && this.bS() && this.dc() != null && this.dc().bU()) {
               this.ad();
            }
         } else if (this.cm() < this.cl()) {
            this.j(this.n(this.cm()));
         }

         if (this.dO() instanceof aqu $$10) {
            jd $$11 = this.do();
            if (!Objects.equal(this.cj, $$11)) {
               this.cj = $$11;
               this.b($$10, $$11);
            }
         }
      }

      if (this.bE() && (this.bh() || this.az)) {
         this.aI();
      }

      if (this.aO > 0) {
         this.aO--;
      }

      if (this.am > 0 && !(this instanceof aqv)) {
         this.am--;
      }

      if (this.ex() && this.dO().h(this)) {
         this.ed();
      }

      if (this.bd > 0) {
         this.bd--;
      } else {
         this.bc = null;
      }

      if (this.ce != null && !this.ce.bE()) {
         this.ce = null;
      }

      if (this.cc != null) {
         if (!this.cc.bE()) {
            this.a(null);
         } else if (this.ai - this.cd > 100) {
            this.a(null);
         }
      }

      this.eo();
      this.bj = this.bi;
      this.aZ = this.aY;
      this.bb = this.ba;
      this.O = this.dE();
      this.P = this.dG();
      this.dO().ag().c();
   }

   @Override
   protected float aO() {
      return ayo.i((float)this.g(buw.u), super.aO(), 1.0F);
   }

   protected void dY() {
      bus $$0 = this.f(buw.v);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.c(d);
         }
      }
   }

   protected void dZ() {
      if (!this.bp().i()) {
         int $$0 = this.cn();
         if ($$0 > 0) {
            bus $$1 = this.f(buw.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.co();
            $$1.b(new buu(d, (double)$$2, buu.a.a));
         }
      }
   }

   protected void b(aqu $$0, jd $$1) {
      dae.a($$0, this);
   }

   public boolean o_() {
      return false;
   }

   public float ea() {
      return this.o_() ? 0.5F : 1.0F;
   }

   public float eb() {
      but $$0 = this.eS();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(buw.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean ec() {
      return true;
   }

   protected void ed() {
      this.aQ++;
      if (this.aQ >= 20 && !this.dO().x_() && !this.dJ()) {
         this.dO().a(this, (byte)60);
         this.a(bsr.c.a);
      }
   }

   public boolean ee() {
      return !this.o_();
   }

   protected boolean ef() {
      return !this.o_();
   }

   protected int m(int $$0) {
      bus $$1 = this.f(buw.w);
      double $$2;
      if ($$1 != null) {
         $$2 = $$1.f();
      } else {
         $$2 = 0.0;
      }

      return $$2 > 0.0 && this.ah.j() >= 1.0 / ($$2 + 1.0) ? $$0 : $$0 - 1;
   }

   protected int n(int $$0) {
      return Math.min($$0 + 4, this.cl());
   }

   public final int a(aqu $$0, @Nullable bsr $$1) {
      return dae.a($$0, $$1, this, this.eg());
   }

   protected int eg() {
      return 0;
   }

   protected boolean eh() {
      return false;
   }

   @Nullable
   public btn ei() {
      return this.cc;
   }

   @Override
   public btn Y_() {
      return this.ei();
   }

   public int ej() {
      return this.cd;
   }

   public void c(@Nullable cmx $$0) {
      this.bc = $$0;
      this.bd = this.ai;
   }

   public void a(@Nullable btn $$0) {
      this.cc = $$0;
      this.cd = this.ai;
   }

   @Nullable
   public btn ek() {
      return this.ce;
   }

   public int el() {
      return this.cf;
   }

   public void A(bsr $$0) {
      if ($$0 instanceof btn) {
         this.ce = (btn)$$0;
      } else {
         this.ce = null;
      }

      this.cf = this.ai;
   }

   public int em() {
      return this.bf;
   }

   public void o(int $$0) {
      this.bf = $$0;
   }

   public boolean en() {
      return this.ca;
   }

   public void r(boolean $$0) {
      this.ca = $$0;
   }

   protected boolean b(bsy $$0) {
      return true;
   }

   public void a(bsy $$0, cuq $$1, cuq $$2) {
      boolean $$3 = $$2.e() && $$1.e();
      if (!$$3 && !cuq.c($$1, $$2) && !this.an) {
         cts $$4 = cts.c_($$2);
         if (!this.dO().x_() && !this.R_()) {
            if (!this.aX() && $$4 != null && $$4.m() == $$0) {
               this.dO().a(null, this.dt(), this.dv(), this.dz(), $$4.n(), this.de(), 1.0F, 1.0F, this.ah.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? dxz.v : dxz.S);
            }
         }
      }
   }

   @Override
   public void a(bsr.c $$0) {
      if ($$0 == bsr.c.a || $$0 == bsr.c.b) {
         this.c($$0);
      }

      super.a($$0);
      this.bF.a();
   }

   protected void c(bsr.c $$0) {
      for (brz $$1 : this.et()) {
         $$1.a(this, $$0);
      }

      this.bW.clear();
   }

   @Override
   public void b(ub $$0) {
      $$0.a("Health", this.ew());
      $$0.a("HurtTime", (short)this.aO);
      $$0.a("HurtByTimestamp", this.cd);
      $$0.a("DeathTime", (short)this.aQ);
      $$0.a("AbsorptionAmount", this.fo());
      $$0.a("attributes", this.eS().d());
      if (!this.bW.isEmpty()) {
         uh $$1 = new uh();

         for (brz $$2 : this.bW.values()) {
            $$1.add($$2.j());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fA());
      this.fF().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<uy> $$3 = this.bF.a(up.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(ub $$0) {
      this.D($$0.j("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dO() != null && !this.dO().B) {
         this.eS().a($$0.c("attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         uh $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ub $$3 = $$1.a($$2);
            brz $$4 = brz.a($$3);
            if ($$4 != null) {
               this.bW.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.v($$0.j("Health"));
      }

      this.aO = $$0.g("HurtTime");
      this.aQ = $$0.g("DeathTime");
      this.cd = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         eyg $$6 = this.dO().M();
         eyb $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cA(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         jd $$9 = new jd($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$9);
         this.ao.a(at, bua.c);
         if (!this.an) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bF = this.a(new Dynamic(up.a, $$0.c("Brain")));
      }
   }

   protected void eo() {
      Iterator<jm<brx>> $$0 = this.bW.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jm<brx> $$1 = $$0.next();
            brz $$2 = this.bW.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dO().B) {
                  $$0.remove();
                  this.a($$2);
               }
            } else if ($$2.d() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var6) {
      }

      if (this.cb) {
         if (!this.dO().B) {
            this.K();
            this.v();
         }

         this.cb = false;
      }

      List<lk> $$3 = this.ao.a(bN);
      if (!$$3.isEmpty()) {
         boolean $$4 = this.ao.a(bO);
         int $$5 = this.ci() ? 15 : 4;
         int $$6 = $$4 ? 5 : 1;
         if (this.ah.a($$5 * $$6) == 0) {
            this.dO().a(ad.a($$3, this.ah), this.d(0.5), this.dw(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void K() {
      if (this.bW.isEmpty()) {
         this.er();
         this.k(false);
      } else {
         this.k(this.b(bsb.n));
         this.s();
      }
   }

   private void s() {
      List<lk> $$0 = this.bW.values().stream().filter(brz::g).map(brz::a).toList();
      this.ao.a(bN, $$0);
      this.ao.a(bO, c(this.bW.values()));
   }

   private void v() {
      boolean $$0 = this.ch();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable bsr $$0) {
      double $$1 = 1.0;
      if (this.bZ()) {
         $$1 *= 0.8;
      }

      if (this.ci()) {
         float $$2 = this.eZ();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cuq $$3 = this.a(bsy.f);
         bsx<?> $$4 = $$0.am();
         if ($$4 == bsx.aN && $$3.a(cut.ul)
            || $$4 == bsx.bu && $$3.a(cut.uo)
            || $$4 == bsx.aA && $$3.a(cut.ur)
            || $$4 == bsx.aB && $$3.a(cut.ur)
            || $$4 == bsx.x && $$3.a(cut.up)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(btn $$0) {
      return $$0 instanceof cmx && this.dO().al() == bqo.a ? false : $$0.ep();
   }

   public boolean a(btn $$0, cef $$1) {
      return $$1.a(this, $$0);
   }

   public boolean ep() {
      return !this.cv() && this.eq();
   }

   public boolean eq() {
      return !this.R_() && this.bE();
   }

   public static boolean c(Collection<brz> $$0) {
      for (brz $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void er() {
      this.ao.a(bN, List.of());
   }

   public boolean es() {
      if (this.dO().B) {
         return false;
      } else {
         Iterator<brz> $$0 = this.bW.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<brz> et() {
      return this.bW.values();
   }

   public Map<jm<brx>, brz> eu() {
      return this.bW;
   }

   public boolean b(jm<brx> $$0) {
      return this.bW.containsKey($$0);
   }

   @Nullable
   public brz c(jm<brx> $$0) {
      return this.bW.get($$0);
   }

   public final boolean b(brz $$0) {
      return this.b($$0, null);
   }

   public boolean b(brz $$0, @Nullable bsr $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         brz $$2 = this.bW.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bW.put($$0.c(), $$0);
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

   public boolean c(brz $$0) {
      if (this.am().a(awi.G)) {
         return !$$0.a(bsb.M);
      } else if (this.am().a(awi.F)) {
         return !$$0.a(bsb.L);
      } else {
         return !this.am().a(awi.w) ? true : !$$0.a(bsb.j) && !$$0.a(bsb.s);
      }
   }

   public void c(brz $$0, @Nullable bsr $$1) {
      if (this.c($$0)) {
         brz $$2 = this.bW.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean ev() {
      return this.am().a(awi.x);
   }

   @Nullable
   public brz d(jm<brx> $$0) {
      return this.bW.remove($$0);
   }

   public boolean e(jm<brx> $$0) {
      brz $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(brz $$0, @Nullable bsr $$1) {
      this.cb = true;
      if (!this.dO().B) {
         $$0.c().a().a(this.eS(), $$0.e());
         this.d($$0);
      }
   }

   public void d(brz $$0) {
      for (bsr $$1 : this.cS()) {
         if ($$1 instanceof aqv $$2) {
            $$2.c.b(new agb(this.an(), $$0, false));
         }
      }
   }

   protected void a(brz $$0, boolean $$1, @Nullable bsr $$2) {
      this.cb = true;
      if ($$1 && !this.dO().B) {
         brx $$3 = $$0.c().a();
         $$3.a(this.eS());
         $$3.a(this.eS(), $$0.e());
         this.B();
      }

      if (!this.dO().B) {
         this.d($$0);
      }
   }

   protected void a(brz $$0) {
      this.cb = true;
      if (!this.dO().B) {
         $$0.c().a().a(this.eS());
         this.B();

         for (bsr $$1 : this.cS()) {
            if ($$1 instanceof aqv $$2) {
               $$2.c.b(new aeg(this.an(), $$0.c()));
            }
         }
      }
   }

   private void B() {
      Set<bus> $$0 = this.eS().b();

      for (bus $$1 : $$0) {
         this.i($$1.a());
      }

      $$0.clear();
   }

   private void i(jm<bur> $$0) {
      if ($$0.a(buw.s)) {
         float $$1 = this.eN();
         if (this.ew() > $$1) {
            this.v($$1);
         }
      } else if ($$0.a(buw.r)) {
         float $$2 = this.eO();
         if (this.fo() > $$2) {
            this.C($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.ew();
      if ($$1 > 0.0F) {
         this.v($$1 + $$0);
      }
   }

   public float ew() {
      return this.ao.a(bM);
   }

   public void v(float $$0) {
      this.ao.a(bM, ayo.a($$0, 0.0F, this.eN()));
   }

   public boolean ex() {
      return this.ew() <= 0.0F;
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dO().B) {
         return false;
      } else if (this.ex()) {
         return false;
      } else if ($$0.a(awg.i) && this.b(bsb.l)) {
         return false;
      } else {
         if (this.fH() && !this.dO().B) {
            this.fI();
         }

         this.bf = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.x($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(awg.j) && $$0.c() instanceof btn $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(awg.o) && this.am().a(awi.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(awg.a) && !this.a(bsy.f).e()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aU.a(1.5F);
         boolean $$7 = true;
         if ((float)this.am > 10.0F && !$$0.a(awg.e)) {
            if ($$1 <= this.bm) {
               return false;
            }

            this.f($$0, $$1 - this.bm);
            this.bm = $$1;
            $$7 = false;
         } else {
            this.bm = $$1;
            this.am = 20;
            this.f($$0, $$1);
            this.aP = 10;
            this.aO = this.aP;
         }

         bsr $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof btn $$9 && !$$0.a(awg.q) && (!$$0.a(brn.H) || !this.am().a(awi.E))) {
               this.a($$9);
            }

            if ($$8 instanceof cmx $$10) {
               this.bd = 100;
               this.bc = $$10;
            } else if ($$8 instanceof cgh $$11 && $$11.s()) {
               this.bd = 100;
               if ($$11.T_() instanceof cmx $$12) {
                  this.bc = $$12;
               } else {
                  this.bc = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dO().a(this, (byte)29);
            } else {
               this.dO().a(this, $$0);
            }

            if (!$$0.a(awg.r) && (!$$3 || $$1 > 0.0F)) {
               this.bw();
            }

            if (!$$0.a(awg.z)) {
               double $$13 = 0.0;
               double $$14 = 0.0;
               if ($$0.c() instanceof cnp $$15) {
                  DoubleDoubleImmutablePair $$16 = $$15.a_(this, $$0);
                  $$13 = -$$16.leftDouble();
                  $$14 = -$$16.rightDouble();
               } else if ($$0.i() != null) {
                  $$13 = $$0.i().a() - this.dt();
                  $$14 = $$0.i().c() - this.dz();
               }

               this.p(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.ex()) {
            if (!this.g($$0)) {
               if ($$7) {
                  this.b(this.n_());
               }

               this.a($$0);
            }
         } else if ($$7) {
            this.e($$0);
         }

         boolean $$17 = !$$3 || $$1 > 0.0F;
         if ($$17) {
            this.cl = $$0;
            this.cm = this.dO().Z();

            for (brz $$18 : this.et()) {
               $$18.a(this, $$0, $$1);
            }
         }

         if (this instanceof aqv) {
            an.i.a((aqv)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((aqv)this).a(avz.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof aqv) {
            an.h.a((aqv)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$17;
      }
   }

   protected void d(btn $$0) {
      $$0.e(this);
   }

   protected void e(btn $$0) {
      $$0.p(0.5, $$0.dt() - this.dt(), $$0.dz() - this.dz());
   }

   private boolean g(brk $$0) {
      if ($$0.a(awg.d)) {
         return false;
      } else {
         cuq $$1 = null;

         for (bqq $$2 : bqq.values()) {
            cuq $$3 = this.b($$2);
            if ($$3.a(cut.vt)) {
               $$1 = $$3.s();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof aqv $$4) {
               $$4.b(avz.c.b(cut.vt));
               an.C.a($$4, $$1);
               this.a(dxz.C);
            }

            this.v(1.0F);
            this.es();
            this.b(new brz(bsb.j, 900, 1));
            this.b(new brz(bsb.v, 100, 1));
            this.b(new brz(bsb.l, 800, 0));
            this.dO().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public brk ey() {
      if (this.dO().Z() - this.cm > 40L) {
         this.cl = null;
      }

      return this.cl;
   }

   protected void e(brk $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable avo $$0) {
      if ($$0 != null) {
         this.a($$0, this.fa(), this.fb());
      }
   }

   public boolean f(brk $$0) {
      bsr $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cnd $$3 && $$3.C() > 0) {
         $$2 = true;
      }

      if (!$$0.a(awg.c) && this.fy() && !$$2) {
         exc $$4 = $$0.i();
         if ($$4 != null) {
            exc $$5 = this.c(0.0F, this.ct());
            exc $$6 = $$4.a(this.dm());
            $$6 = new exc($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(cuq $$0) {
      if (!$$0.e()) {
         if (!this.aX()) {
            this.dO().a(this.dt(), this.dv(), this.dz(), $$0.K(), this.de(), 0.8F, 0.8F + this.dO().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(brk $$0) {
      if (!this.dJ() && !this.be) {
         bsr $$1 = $$0.d();
         btn $$2 = this.eM();
         if (this.bl >= 0 && $$2 != null) {
            $$2.a(this, this.bl, $$0);
         }

         if (this.fH()) {
            this.fI();
         }

         if (!this.dO().B && this.ai()) {
            b.info("Named entity {} died: {}", this, this.eL().a().getString());
         }

         this.be = true;
         this.eL().c();
         if (this.dO() instanceof aqu $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dxz.p);
               this.a($$3, $$0);
               this.f($$2);
            }

            this.dO().a(this, (byte)3);
         }

         this.b(bua.h);
      }
   }

   protected void f(@Nullable btn $$0) {
      if (!this.dO().B) {
         boolean $$1 = false;
         if ($$0 instanceof ciu) {
            if (this.dO().ab().b(dcs.c)) {
               jd $$2 = this.do();
               dtc $$3 = dga.cd.o();
               if (this.dO().a_($$2).i() && $$3.a((dcz)this.dO(), $$2)) {
                  this.dO().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               cjh $$4 = new cjh(this.dO(), this.dt(), this.dv(), this.dz(), new cuq(cut.dw));
               this.dO().b($$4);
            }
         }
      }
   }

   protected void a(aqu $$0, brk $$1) {
      boolean $$2 = this.bd > 0;
      if (this.ef() && $$0.ab().b(dcs.f)) {
         this.a($$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.ez();
      this.C($$1.d());
   }

   protected void ez() {
   }

   protected void C(@Nullable bsr $$0) {
      if (this.dO() instanceof aqu $$1 && !this.eD() && (this.eh() || this.bd > 0 && this.ee() && this.dO().ab().b(dcs.f))) {
         btc.a($$1, this.dm(), this.a($$1, $$0));
      }
   }

   protected void a(aqu $$0, brk $$1, boolean $$2) {
   }

   public akq<erw> eA() {
      return this.am().k();
   }

   public long eB() {
      return 0L;
   }

   protected float a(bsr $$0, brk $$1) {
      float $$2 = (float)this.g(buw.d);
      return this.dO() instanceof aqu $$3 ? dae.d($$3, this.dS(), $$0, $$1, $$2) : $$2;
   }

   protected void a(brk $$0, boolean $$1) {
      akq<erw> $$2 = this.eA();
      erw $$3 = this.dO().o().be().b($$2);
      eru.a $$4 = new eru.a((aqu)this.dO()).a(eun.a, this).a(eun.f, this.dm()).a(eun.c, $$0).b(eun.d, $$0.d()).b(eun.e, $$0.c());
      if ($$1 && this.bc != null) {
         $$4 = $$4.a(eun.b, this.bc).a(this.bc.gu());
      }

      eru $$5 = $$4.a(eum.g);
      $$3.a($$5, this.eB(), this::b);
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.g(buw.p);
      if (!($$0 <= 0.0)) {
         this.av = true;
         exc $$3 = this.dr();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         exc $$4 = new exc($$1, 0.0, $$2).d().a($$0);
         this.n($$3.c / 2.0 - $$4.c, this.aF() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected avo d(brk $$0) {
      return avp.kg;
   }

   @Nullable
   protected avo n_() {
      return avp.kb;
   }

   private avo r(int $$0) {
      return $$0 > 4 ? this.eH().b() : this.eH().a();
   }

   public void eC() {
      this.cp = true;
   }

   public boolean eD() {
      return this.cp;
   }

   public float eE() {
      return 0.0F;
   }

   protected ewx eF() {
      ewx $$0 = this.cK();
      bsr $$1 = this.dc();
      if ($$1 != null) {
         exc $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dac, Set<dat>> eG() {
      return this.cq;
   }

   public btn.a eH() {
      return new btn.a(avp.kh, avp.jZ);
   }

   protected avo c(cuq $$0) {
      return $$0.I();
   }

   public avo d(cuq $$0) {
      return $$0.J();
   }

   public Optional<jd> eI() {
      return this.ck;
   }

   public boolean p_() {
      if (this.R_()) {
         return false;
      } else {
         jd $$0 = this.do();
         dtc $$1 = this.dp();
         if ($$1.a(awe.aQ)) {
            this.ck = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dom && this.c($$0, $$1)) {
            this.ck = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(jd $$0, dtc $$1) {
      if (!$$1.c(dom.b)) {
         return false;
      } else {
         dtc $$2 = this.dO().a_($$0.e());
         return $$2.a(dga.cO) && $$2.c(dke.b) == $$1.c(dom.aE);
      }
   }

   @Override
   public boolean bE() {
      return !this.dJ() && this.ew() > 0.0F;
   }

   @Override
   public int cx() {
      return this.w(0.0F);
   }

   protected final int w(float $$0) {
      return ayo.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, brk $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.e($$0, $$1);
      if ($$4 > 0) {
         this.a(this.r($$4), 1.0F, 1.0F);
         this.eJ();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int e(float $$0, float $$1) {
      if (this.am().a(awi.o)) {
         return 0;
      } else {
         float $$2 = (float)this.g(buw.x);
         float $$3 = $$0 - $$2;
         return ayo.c((double)($$3 * $$1) * this.g(buw.k));
      }
   }

   protected void eJ() {
      if (!this.aX()) {
         int $$0 = ayo.a(this.dt());
         int $$1 = ayo.a(this.dv() - 0.2F);
         int $$2 = ayo.a(this.dz());
         dtc $$3 = this.dO().a_(new jd($$0, $$1, $$2));
         if (!$$3.i()) {
            dnm $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void n(float $$0) {
      this.aP = 10;
      this.aO = this.aP;
   }

   public int eK() {
      return ayo.a(this.g(buw.a));
   }

   protected void b(brk $$0, float $$1) {
   }

   protected void c(brk $$0, float $$1) {
   }

   protected void x(float $$0) {
   }

   protected void a(brk $$0, float $$1, bsy... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bsy $$4 : $$2) {
            cuq $$5 = this.a($$4);
            if ($$5.g() instanceof csf && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float d(brk $$0, float $$1) {
      if (!$$0.a(awg.b)) {
         this.b($$0, $$1);
         $$1 = brg.a(this, $$1, $$0, (float)this.eK(), (float)this.g(buw.b));
      }

      return $$1;
   }

   protected float e(brk $$0, float $$1) {
      if ($$0.a(awg.f)) {
         return $$1;
      } else {
         if (this.b(bsb.k) && !$$0.a(awg.g)) {
            int $$2 = (this.c(bsb.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof aqv) {
                  ((aqv)this).a(avz.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof aqv) {
                  ((aqv)$$0.d()).a(avz.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(awg.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dO() instanceof aqu $$7) {
               $$8 = dae.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = brg.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void f(brk $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fo(), 0.0F);
         this.C(this.fo() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof aqv $$4) {
            $$4.a(avz.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eL().a($$0, var9);
            this.v(this.ew() - var9);
            this.C(this.fo() - var9);
            this.a(dxz.o);
         }
      }
   }

   public brh eL() {
      return this.bV;
   }

   @Nullable
   public btn eM() {
      if (this.bc != null) {
         return this.bc;
      } else {
         return this.cc != null ? this.cc : null;
      }
   }

   public final float eN() {
      return (float)this.g(buw.s);
   }

   public final float eO() {
      return (float)this.g(buw.r);
   }

   public final int eP() {
      return this.ao.a(bP);
   }

   public final void p(int $$0) {
      this.ao.a(bP, $$0);
   }

   public final int eQ() {
      return this.ao.a(bQ);
   }

   public final void q(int $$0) {
      this.ao.a(bQ, $$0);
   }

   private int C() {
      if (bsa.a(this)) {
         return 6 - (1 + bsa.b(this));
      } else {
         return this.b(bsb.d) ? 6 + (1 + this.c(bsb.d).e()) * 2 : 6;
      }
   }

   public void a(bqq $$0) {
      this.a($$0, false);
   }

   public void a(bqq $$0, boolean $$1) {
      if (!this.aJ || this.aL >= this.C() / 2 || this.aL < 0) {
         this.aL = -1;
         this.aJ = true;
         this.aK = $$0;
         if (this.dO() instanceof aqu) {
            abx $$2 = new abx(this, $$0 == bqq.a ? 0 : 3);
            aqs $$3 = ((aqu)this.dO()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(brk $$0) {
      this.aU.a(1.5F);
      this.am = 20;
      this.aP = 10;
      this.aO = this.aP;
      avo $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.fa(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
      }

      this.a(this.dP().o(), 0.0F);
      this.cl = $$0;
      this.cm = this.dO().Z();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            avo $$1 = this.n_();
            if ($$1 != null) {
               this.a($$1, this.fa(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cmx)) {
               this.v(0.0F);
               this.a(this.dP().o());
            }
            break;
         case 29:
            this.a(avp.wD, 1.0F, 0.8F + this.dO().z.i() * 0.4F);
            break;
         case 30:
            this.a(avp.wE, 0.8F, 0.8F + this.dO().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ah.i() - 0.5F) * 0.2F;
               float $$6 = (this.ah.i() - 0.5F) * 0.2F;
               float $$7 = (this.ah.i() - 0.5F) * 0.2F;
               double $$8 = ayo.d($$4, this.L, this.dt()) + (this.ah.j() - 0.5) * (double)this.dj() * 2.0;
               double $$9 = ayo.d($$4, this.M, this.dv()) + this.ah.j() * (double)this.dk();
               double $$10 = ayo.d($$4, this.N, this.dz()) + (this.ah.j() - 0.5) * (double)this.dj() * 2.0;
               this.dO().a(lm.ac, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.a(bsy.a));
            break;
         case 48:
            this.i(this.a(bsy.b));
            break;
         case 49:
            this.i(this.a(bsy.f));
            break;
         case 50:
            this.i(this.a(bsy.e));
            break;
         case 51:
            this.i(this.a(bsy.d));
            break;
         case 52:
            this.i(this.a(bsy.c));
            break;
         case 54:
            djs.b(this);
            break;
         case 55:
            this.E();
            break;
         case 60:
            this.D();
            break;
         case 65:
            this.i(this.a(bsy.g));
            break;
         default:
            super.b($$0);
      }
   }

   private void D() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ah.k() * 0.02;
         double $$2 = this.ah.k() * 0.02;
         double $$3 = this.ah.k() * 0.02;
         this.dO().a(lm.ab, this.d(1.0), this.dw(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void E() {
      cuq $$0 = this.a(bsy.b);
      this.a(bsy.b, this.a(bsy.a));
      this.a(bsy.a, $$0);
   }

   @Override
   protected void aE() {
      this.a(this.dP().n(), 4.0F);
   }

   protected void eR() {
      int $$0 = this.C();
      if (this.aJ) {
         this.aL++;
         if (this.aL >= $$0) {
            this.aL = 0;
            this.aJ = false;
         }
      } else {
         this.aL = 0;
      }

      this.aS = (float)this.aL / (float)$$0;
   }

   @Nullable
   public bus f(jm<bur> $$0) {
      return this.eS().a($$0);
   }

   public double g(jm<bur> $$0) {
      return this.eS().c($$0);
   }

   public double h(jm<bur> $$0) {
      return this.eS().d($$0);
   }

   public but eS() {
      return this.bU;
   }

   public cuq eT() {
      return this.a(bsy.a);
   }

   public cuq eU() {
      return this.a(bsy.b);
   }

   @Nonnull
   @Override
   public cuq dS() {
      return this.eT();
   }

   public boolean b(cul $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cuq> $$0) {
      return $$0.test(this.eT()) || $$0.test(this.eU());
   }

   public cuq b(bqq $$0) {
      if ($$0 == bqq.a) {
         return this.a(bsy.a);
      } else if ($$0 == bqq.b) {
         return this.a(bsy.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bqq $$0, cuq $$1) {
      if ($$0 == bqq.a) {
         this.a(bsy.a, $$1);
      } else {
         if ($$0 != bqq.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bsy.b, $$1);
      }
   }

   public boolean c(bsy $$0) {
      return !this.a($$0).e();
   }

   public boolean d(bsy $$0) {
      return false;
   }

   public abstract Iterable<cuq> eV();

   public abstract cuq a(bsy var1);

   public abstract void a(bsy var1, cuq var2);

   public Iterable<cuq> eW() {
      return List.of();
   }

   public Iterable<cuq> eX() {
      return this.eV();
   }

   public Iterable<cuq> eY() {
      return Iterables.concat(this.eW(), this.eX());
   }

   protected void e(cuq $$0) {
      $$0.g().m($$0);
   }

   public float eZ() {
      Iterable<cuq> $$0 = this.eV();
      int $$1 = 0;
      int $$2 = 0;

      for (cuq $$3 : $$0) {
         if (!$$3.e()) {
            $$2++;
         }

         $$1++;
      }

      return $$1 > 0 ? (float)$$2 / (float)$$1 : 0.0F;
   }

   @Override
   public void h(boolean $$0) {
      super.h($$0);
      bus $$1 = this.f(buw.v);
      $$1.c(bH.b());
      if ($$0) {
         $$1.b(bH);
      }
   }

   protected float fa() {
      return 1.0F;
   }

   public float fb() {
      return this.o_() ? (this.ah.i() - this.ah.i()) * 0.2F + 1.5F : (this.ah.i() - this.ah.i()) * 0.2F + 1.0F;
   }

   protected boolean fc() {
      return this.ex();
   }

   @Override
   public void h(bsr $$0) {
      if (!this.fH()) {
         super.h($$0);
      }
   }

   private void d(bsr $$0) {
      exc $$1;
      if (this.dJ()) {
         $$1 = this.dm();
      } else if (!$$0.dJ() && !this.dO().a_($$0.do()).a(awe.aK)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dv(), $$0.dv());
         $$1 = new exc(this.dt(), $$2, this.dz());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cF() {
      return this.cE();
   }

   protected float fd() {
      return this.y(1.0F);
   }

   protected float y(float $$0) {
      return (float)this.g(buw.o) * $$0 * this.aN() + this.fe();
   }

   public float fe() {
      return this.b(bsb.h) ? 0.1F * ((float)this.c(bsb.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void ff() {
      float $$0 = this.fd();
      if (!($$0 <= 1.0E-5F)) {
         exc $$1 = this.dr();
         this.n($$1.c, (double)$$0, $$1.e);
         if (this.cc()) {
            float $$2 = this.dE() * (float) (Math.PI / 180.0);
            this.j(new exc((double)(-ayo.a($$2)) * 0.2, 0.0, (double)ayo.b($$2) * 0.2));
         }

         this.av = true;
      }
   }

   protected void fg() {
      this.i(this.dr().b(0.0, -0.04F, 0.0));
   }

   protected void c(awu<epd> $$0) {
      this.i(this.dr().b(0.0, 0.04F, 0.0));
   }

   protected float fh() {
      return 0.8F;
   }

   public boolean a(epe $$0) {
      return false;
   }

   @Override
   protected double aZ() {
      return this.g(buw.n);
   }

   public void a(exc $$0) {
      if (this.da()) {
         double $$1 = this.ba();
         boolean $$2 = this.dr().d <= 0.0;
         if ($$2 && this.b(bsb.B)) {
            $$1 = Math.min($$1, 0.01);
         }

         epe $$3 = this.dO().b_(this.do());
         if (this.bf() && this.ec() && !this.a($$3)) {
            double $$4 = this.dv();
            float $$5 = this.cc() ? 0.9F : this.fh();
            float $$6 = 0.02F;
            float $$7 = (float)this.g(buw.E);
            if (!this.aF()) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7;
               $$6 += (this.fj() - $$6) * $$7;
            }

            if (this.b(bsb.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bts.a, this.dr());
            exc $$8 = this.dr();
            if (this.Q && this.p_()) {
               $$8 = new exc($$8.c, 0.2, $$8.e);
            }

            this.i($$8.d((double)$$5, 0.8F, (double)$$5));
            exc $$9 = this.a($$1, $$2, this.dr());
            this.i($$9);
            if (this.Q && this.g($$9.c, $$9.d + 0.6F - this.dv() + $$4, $$9.e)) {
               this.n($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bt() && this.ec() && !this.a($$3)) {
            double $$10 = this.dv();
            this.a(0.02F, $$0);
            this.a(bts.a, this.dr());
            if (this.b(awk.b) <= this.di()) {
               this.i(this.dr().d(0.5, 0.8F, 0.5));
               exc $$11 = this.a($$1, $$2, this.dr());
               this.i($$11);
            } else {
               this.i(this.dr().a(0.5));
            }

            if ($$1 != 0.0) {
               this.i(this.dr().b(0.0, -$$1 / 4.0, 0.0));
            }

            exc $$12 = this.dr();
            if (this.Q && this.g($$12.c, $$12.d + 0.6F - this.dv() + $$10, $$12.e)) {
               this.n($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fA()) {
            this.cr();
            exc $$13 = this.dr();
            exc $$14 = this.bM();
            float $$15 = this.dG() * (float) (Math.PI / 180.0);
            double $$16 = Math.sqrt($$14.c * $$14.c + $$14.e * $$14.e);
            double $$17 = $$13.h();
            double $$18 = $$14.f();
            double $$19 = Math.cos((double)$$15);
            $$19 = $$19 * $$19 * Math.min(1.0, $$18 / 0.4);
            $$13 = this.dr().b(0.0, $$1 * (-1.0 + $$19 * 0.75), 0.0);
            if ($$13.d < 0.0 && $$16 > 0.0) {
               double $$20 = $$13.d * -0.1 * $$19;
               $$13 = $$13.b($$14.c * $$20 / $$16, $$20, $$14.e * $$20 / $$16);
            }

            if ($$15 < 0.0F && $$16 > 0.0) {
               double $$21 = $$17 * (double)(-ayo.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.i($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bts.a, this.dr());
            if (this.Q && !this.dO().B) {
               double $$22 = this.dr().h();
               double $$23 = $$17 - $$22;
               float $$24 = (float)($$23 * 10.0 - 3.0);
               if ($$24 > 0.0F) {
                  this.a(this.r((int)$$24), 1.0F, 1.0F);
                  this.a(this.dP().m(), $$24);
               }
            }

            if (this.aF() && !this.dO().B) {
               this.b(7, false);
            }
         } else {
            jd $$25 = this.aL();
            float $$26 = this.dO().a_($$25).b().h();
            float $$27 = this.aF() ? $$26 * 0.91F : 0.91F;
            exc $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.b(bsb.y)) {
               $$29 += (0.05 * (double)(this.c(bsb.y).e() + 1) - $$28.d) * 0.2;
            } else if (!this.dO().B || this.dO().B($$25)) {
               $$29 -= $$1;
            } else if (this.dv() > (double)this.dO().I_()) {
               $$29 = -0.1;
            } else {
               $$29 = 0.0;
            }

            if (this.en()) {
               this.n($$28.c, $$29, $$28.e);
            } else {
               this.n($$28.c * (double)$$27, this instanceof cfn ? $$29 * (double)$$27 : $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.s(this instanceof cfn);
   }

   private void c(cmx $$0, exc $$1) {
      exc $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.da()) {
         this.A(this.e($$0));
         this.a($$2);
      } else {
         this.s(false);
         this.i(exc.b);
         this.aG();
      }
   }

   protected void a(cmx $$0, exc $$1) {
   }

   protected exc b(cmx $$0, exc $$1) {
      return $$1;
   }

   protected float e(cmx $$0) {
      return this.fj();
   }

   public void s(boolean $$0) {
      float $$1 = (float)ayo.g(this.dt() - this.L, $$0 ? this.dv() - this.M : 0.0, this.dz() - this.N);
      this.z($$1);
   }

   protected void z(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aU.a($$1, 0.4F);
   }

   public exc a(exc $$0, float $$1) {
      this.a(this.E($$1), $$0);
      this.i(this.b(this.dr()));
      this.a(bts.a, this.dr());
      exc $$2 = this.dr();
      if ((this.Q || this.bn) && (this.p_() || this.dp().a(dga.qP) && dlt.a(this))) {
         $$2 = new exc($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public exc a(double $$0, boolean $$1, exc $$2) {
      if ($$0 != 0.0 && !this.cc()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new exc($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private exc b(exc $$0) {
      if (this.p_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = ayo.a($$0.c, -0.15F, 0.15F);
         double $$3 = ayo.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dp().a(dga.nS) && this.fz() && this instanceof cmx) {
            $$4 = 0.0;
         }

         $$0 = new exc($$2, $$4, $$3);
      }

      return $$0;
   }

   private float E(float $$0) {
      return this.aF() ? this.fj() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fi();
   }

   protected float fi() {
      return this.cQ() instanceof cmx ? this.fj() * 0.1F : 0.02F;
   }

   public float fj() {
      return this.cg;
   }

   public void A(float $$0) {
      this.cg = $$0;
   }

   public boolean D(bsr $$0) {
      this.A($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.J();
      this.N();
      if (!this.dO().B) {
         int $$0 = this.eP();
         if ($$0 > 0) {
            if (this.aM <= 0) {
               this.aM = 20 * (30 - $$0);
            }

            this.aM--;
            if (this.aM <= 0) {
               this.p($$0 - 1);
            }
         }

         int $$1 = this.eQ();
         if ($$1 > 0) {
            if (this.aN <= 0) {
               this.aN = 20 * (30 - $$1);
            }

            this.aN--;
            if (this.aN <= 0) {
               this.q($$1 - 1);
            }
         }

         this.F();
         if (this.ai % 20 == 0) {
            this.eL().c();
         }

         if (this.fH() && !this.O()) {
            this.fI();
         }
      }

      if (!this.dJ()) {
         this.m_();
      }

      double $$2 = this.dt() - this.L;
      double $$3 = this.dz() - this.N;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aY;
      float $$6 = 0.0F;
      this.bg = this.bh;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)ayo.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ayo.e(ayo.g(this.dE()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aS > 0.0F) {
         $$5 = this.dE();
      }

      if (!this.aF()) {
         $$7 = 0.0F;
      }

      this.bh = this.bh + ($$7 - this.bh) * 0.3F;
      this.dO().ag().a("headTurn");
      $$6 = this.f($$5, $$6);
      this.dO().ag().c();
      this.dO().ag().a("rangeChecks");

      while (this.dE() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dE() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aY - this.aZ < -180.0F) {
         this.aZ -= 360.0F;
      }

      while (this.aY - this.aZ >= 180.0F) {
         this.aZ += 360.0F;
      }

      while (this.dG() - this.P < -180.0F) {
         this.P -= 360.0F;
      }

      while (this.dG() - this.P >= 180.0F) {
         this.P += 360.0F;
      }

      while (this.ba - this.bb < -180.0F) {
         this.bb -= 360.0F;
      }

      while (this.ba - this.bb >= 180.0F) {
         this.bb += 360.0F;
      }

      this.dO().ag().c();
      this.bi += $$6;
      if (this.fA()) {
         this.bB++;
      } else {
         this.bB = 0;
      }

      if (this.fH()) {
         this.u(0.0F);
      }

      this.B();
      float $$10 = this.eb();
      if ($$10 != this.bG) {
         this.bG = $$10;
         this.i_();
      }
   }

   private void F() {
      Map<bsy, cuq> $$0 = this.H();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bsy, cuq> H() {
      Map<bsy, cuq> $$0 = null;

      for (bsy $$1 : bsy.values()) {
         cuq $$2 = switch ($$1.a()) {
            case a -> this.f($$1);
            case b -> this.e($$1);
            case c -> this.bZ;
         };
         cuq $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bsy.class);
            }

            $$0.put($$1, $$3);
            but $$4 = this.eS();
            if (!$$2.e()) {
               $$2.a($$1, ($$3x, $$4x) -> {
                  bus $$5 = $$4.a($$3x);
                  if ($$5 != null) {
                     $$5.e($$4x);
                  }

                  dae.a($$2, this, $$1);
               });
            }
         }
      }

      if ($$0 != null) {
         for (Entry<bsy, cuq> $$5 : $$0.entrySet()) {
            bsy $$6 = $$5.getKey();
            cuq $$7 = $$5.getValue();
            if (!$$7.e()) {
               $$7.a($$6, ($$2x, $$3x) -> {
                  bus $$4x = this.bU.a($$2x);
                  if ($$4x != null) {
                     $$4x.c($$3x.b());
                     $$4x.b($$3x);
                  }

                  if (this.dO() instanceof aqu $$6x) {
                     dae.a($$6x, $$7, this, $$6);
                  }
               });
            }
         }
      }

      return $$0;
   }

   public boolean a(cuq $$0, cuq $$1) {
      return !cuq.a($$1, $$0);
   }

   private void a(Map<bsy, cuq> $$0) {
      cuq $$1 = $$0.get(bsy.a);
      cuq $$2 = $$0.get(bsy.b);
      if ($$1 != null && $$2 != null && cuq.a($$1, this.f(bsy.b)) && cuq.a($$2, this.f(bsy.a))) {
         ((aqu)this.dO()).l().b(this, new acy(this, (byte)55));
         $$0.remove(bsy.a);
         $$0.remove(bsy.b);
         this.c(bsy.a, $$1.s());
         this.c(bsy.b, $$2.s());
      }
   }

   private void b(Map<bsy, cuq> $$0) {
      List<Pair<bsy, cuq>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cuq $$3 = $$2.s();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
               break;
            case c:
               this.bZ = $$3;
         }
      });
      ((aqu)this.dO()).l().b(this, new afc(this.an(), $$1));
   }

   private cuq e(bsy $$0) {
      return this.bY.get($$0.b());
   }

   private void b(bsy $$0, cuq $$1) {
      this.bY.set($$0.b(), $$1);
   }

   private cuq f(bsy $$0) {
      return this.bX.get($$0.b());
   }

   private void c(bsy $$0, cuq $$1) {
      this.bX.set($$0.b(), $$1);
   }

   protected float f(float $$0, float $$1) {
      float $$2 = ayo.g($$0 - this.aY);
      this.aY += $$2 * 0.3F;
      float $$3 = ayo.g(this.dE() - this.aY);
      float $$4 = this.fk();
      if (Math.abs($$3) > $$4) {
         this.aY = this.aY + ($$3 - (float)ayo.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fk() {
      return 50.0F;
   }

   public void m_() {
      if (this.ch > 0) {
         this.ch--;
      }

      if (this.da()) {
         this.br = 0;
         this.f(this.dt(), this.dv(), this.dz());
      }

      if (this.br > 0) {
         this.a(this.br, this.bs, this.bt, this.bu, this.bv, this.bw);
         this.br--;
      } else if (!this.db()) {
         this.i(this.dr().a(0.98));
      }

      if (this.by > 0) {
         this.a(this.by, this.bx);
         this.by--;
      }

      exc $$0 = this.dr();
      double $$1 = $$0.c;
      double $$2 = $$0.d;
      double $$3 = $$0.e;
      if (Math.abs($$0.c) < 0.003) {
         $$1 = 0.0;
      }

      if (Math.abs($$0.d) < 0.003) {
         $$2 = 0.0;
      }

      if (Math.abs($$0.e) < 0.003) {
         $$3 = 0.0;
      }

      this.n($$1, $$2, $$3);
      this.dO().ag().a("ai");
      if (this.fc()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      } else if (this.db()) {
         this.dO().ag().a("newAi");
         this.fm();
         this.dO().ag().c();
      }

      this.dO().ag().c();
      this.dO().ag().a("jump");
      if (this.bn && this.ec()) {
         double $$4;
         if (this.bt()) {
            $$4 = this.b(awk.b);
         } else {
            $$4 = this.b(awk.a);
         }

         boolean $$6 = this.bf() && $$4 > 0.0;
         double $$7 = this.di();
         if (!$$6 || this.aF() && !($$4 > $$7)) {
            if (!this.bt() || this.aF() && !($$4 > $$7)) {
               if ((this.aF() || $$6 && $$4 <= $$7) && this.ch == 0) {
                  this.ff();
                  this.ch = 10;
               }
            } else {
               this.c(awk.b);
            }
         } else {
            this.c(awk.a);
         }
      } else {
         this.ch = 0;
      }

      this.dO().ag().c();
      this.dO().ag().a("travel");
      this.bo *= 0.98F;
      this.bq *= 0.98F;
      this.I();
      ewx $$8 = this.cK();
      exc $$9 = new exc((double)this.bo, (double)this.bp, (double)this.bq);
      if (this.b(bsb.B) || this.b(bsb.y)) {
         this.n();
      }

      label104: {
         if (this.cQ() instanceof cmx $$10 && this.bE()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dO().ag().c();
      this.dO().ag().a("freezing");
      if (!this.dO().B && !this.ex()) {
         int $$11 = this.cn();
         if (this.az && this.dC()) {
            this.k(Math.min(this.cq(), $$11 + 1));
         } else {
            this.k(Math.max(0, $$11 - 2));
         }
      }

      this.dY();
      this.dZ();
      if (!this.dO().B && this.ai % 40 == 0 && this.cp() && this.dC()) {
         this.a(this.dP().u(), 1.0F);
      }

      this.dO().ag().c();
      this.dO().ag().a("push");
      if (this.bC > 0) {
         this.bC--;
         this.a($$8, this.cK());
      }

      this.r();
      this.dO().ag().c();
      if (!this.dO().B && this.fl() && this.bh()) {
         this.a(this.dP().i(), 1.0F);
      }
   }

   public boolean fl() {
      return false;
   }

   private void I() {
      boolean $$0 = this.i(7);
      if ($$0 && !this.aF() && !this.bS() && !this.b(bsb.y)) {
         cuq $$1 = this.a(bsy.e);
         if ($$1.a(cut.nT) && ctm.i($$1)) {
            $$0 = true;
            int $$2 = this.bB + 1;
            if (!this.dO().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, bsy.e);
               }

               this.a(dxz.n);
            }
         } else {
            $$0 = false;
         }
      } else {
         $$0 = false;
      }

      if (!this.dO().B) {
         this.b(7, $$0);
      }
   }

   protected void fm() {
   }

   protected void r() {
      if (this.dO().x_()) {
         this.dO().a(dxn.a(cmx.class), this.cK(), bsw.a(this)).forEach(this::E);
      } else {
         List<bsr> $$0 = this.dO().a(this, this.cK(), bsw.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dO().ab().c(dcs.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ah.a(4) == 0) {
               int $$2 = 0;

               for (bsr $$3 : $$0) {
                  if (!$$3.bS()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dP().h(), 6.0F);
               }
            }

            for (bsr $$4 : $$0) {
               this.E($$4);
            }
         }
      }
   }

   protected void a(ewx $$0, ewx $$1) {
      ewx $$2 = $$0.b($$1);
      List<bsr> $$3 = this.dO().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bsr $$4 : $$3) {
            if ($$4 instanceof btn) {
               this.g((btn)$$4);
               this.bC = 0;
               this.i(this.dr().a(-0.2));
               break;
            }
         }
      } else if (this.Q) {
         this.bC = 0;
      }

      if (!this.dO().B && this.bC <= 0) {
         this.c(4, false);
         this.bD = 0.0F;
         this.bE = null;
      }
   }

   protected void E(bsr $$0) {
      $$0.h(this);
   }

   protected void g(btn $$0) {
   }

   public boolean fn() {
      return (this.ao.a(aE) & 4) != 0;
   }

   @Override
   public void ad() {
      bsr $$0 = this.dc();
      super.ad();
      if ($$0 != null && $$0 != this.dc() && !this.dO().B) {
         this.d($$0);
      }
   }

   @Override
   public void u() {
      super.u();
      this.bg = this.bh;
      this.bh = 0.0F;
      this.n();
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
   public double c_() {
      return this.br > 0 ? this.bs : this.dt();
   }

   @Override
   public double d_() {
      return this.br > 0 ? this.bt : this.dv();
   }

   @Override
   public double P_() {
      return this.br > 0 ? this.bu : this.dz();
   }

   @Override
   public float Q_() {
      return this.br > 0 ? (float)this.bw : this.dG();
   }

   @Override
   public float e_() {
      return this.br > 0 ? (float)this.bv : this.dE();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bx = (double)$$0;
      this.by = $$1;
   }

   public void t(boolean $$0) {
      this.bn = $$0;
   }

   public void a(cjh $$0) {
      bsr $$1 = $$0.s();
      if ($$1 instanceof aqv) {
         an.R.a((aqv)$$1, $$0.p(), this);
      }
   }

   public void a(bsr $$0, int $$1) {
      if (!$$0.dJ() && !this.dO().B && ($$0 instanceof cjh || $$0 instanceof cnd || $$0 instanceof btc)) {
         ((aqu)this.dO()).l().b($$0, new afv($$0.an(), this.an(), $$1));
      }
   }

   public boolean F(bsr $$0) {
      if ($$0.dO() != this.dO()) {
         return false;
      } else {
         exc $$1 = new exc(this.dt(), this.dx(), this.dz());
         exc $$2 = new exc($$0.dt(), $$0.dx(), $$0.dz());
         return $$2.f($$1) > 128.0 ? false : this.dO().a(new dcf($$1, $$2, dcf.a.a, dcf.b.a, this)).c() == exa.a.a;
      }
   }

   @Override
   public float i(float $$0) {
      return $$0 == 1.0F ? this.ba : ayo.i($$0, this.bb, this.ba);
   }

   public float B(float $$0) {
      float $$1 = this.aS - this.aR;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aR + $$1 * $$0;
   }

   @Override
   public boolean bA() {
      return !this.dJ();
   }

   @Override
   public boolean bB() {
      return this.bE() && !this.R_() && !this.p_();
   }

   @Override
   public float ct() {
      return this.ba;
   }

   @Override
   public void o(float $$0) {
      this.ba = $$0;
   }

   @Override
   public void p(float $$0) {
      this.aY = $$0;
   }

   @Override
   public exc a(ji.a $$0, l.a $$1) {
      return k(super.a($$0, $$1));
   }

   public static exc k(exc $$0) {
      return new exc($$0.c, $$0.d, 0.0);
   }

   public float fo() {
      return this.ci;
   }

   public final void C(float $$0) {
      this.D(ayo.a($$0, 0.0F, this.eO()));
   }

   protected void D(float $$0) {
      this.ci = $$0;
   }

   public void f_() {
   }

   public void g_() {
   }

   protected void fp() {
      this.cb = true;
   }

   public abstract btg fq();

   public boolean fr() {
      return (this.ao.a(aE) & 1) > 0;
   }

   public bqq fs() {
      return (this.ao.a(aE) & 2) > 0 ? bqq.b : bqq.a;
   }

   private void J() {
      if (this.fr()) {
         if (cuq.b(this.b(this.fs()), this.bz)) {
            this.bz = this.b(this.fs());
            this.a(this.bz);
         } else {
            this.fx();
         }
      }
   }

   protected void a(cuq $$0) {
      $$0.b(this.dO(), this, this.fu());
      if (this.L()) {
         this.b($$0, 5);
      }

      if (--this.bA == 0 && !this.dO().B && !$$0.v()) {
         this.L_();
      }
   }

   private boolean L() {
      int $$0 = this.bz.a(this) - this.fu();
      int $$1 = (int)((float)this.bz.a(this) * 0.21875F);
      boolean $$2 = $$0 > $$1;
      return $$2 && this.fu() % 4 == 0;
   }

   private void N() {
      this.co = this.cn;
      if (this.ce()) {
         this.cn = Math.min(1.0F, this.cn + 0.09F);
      } else {
         this.cn = Math.max(0.0F, this.cn - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.ao.a(aE);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.ao.a(aE, (byte)$$2);
   }

   public void c(bqq $$0) {
      cuq $$1 = this.b($$0);
      if (!$$1.e() && !this.fr()) {
         this.bz = $$1;
         this.bA = $$1.a(this);
         if (!this.dO().B) {
            this.c(1, true);
            this.c(2, $$0 == bqq.b);
            this.a(dxz.D);
         }
      }
   }

   @Override
   public void a(ajw<?> $$0) {
      super.a($$0);
      if (bR.equals($$0)) {
         if (this.dO().B) {
            this.fF().ifPresent(this::a);
         }
      } else if (aE.equals($$0) && this.dO().B) {
         if (this.fr() && this.bz.e()) {
            this.bz = this.b(this.fs());
            if (!this.bz.e()) {
               this.bA = this.bz.a(this);
            }
         } else if (!this.fr() && !this.bz.e()) {
            this.bz = cuq.l;
            this.bA = 0;
         }
      }
   }

   @Override
   public void a(ff.a $$0, exc $$1) {
      super.a($$0, $$1);
      this.bb = this.ba;
      this.aY = this.ba;
      this.aZ = this.aY;
   }

   @Override
   public float r(float $$0) {
      return ayo.i($$0, this.aZ, this.aY);
   }

   protected void b(cuq $$0, int $$1) {
      if (!$$0.e() && this.fr()) {
         if ($$0.u() == cwo.c) {
            this.a(this.c($$0), 0.5F, this.dO().z.i() * 0.1F + 0.9F);
         }

         if ($$0.u() == cwo.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cuq $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         exc $$3 = new exc(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dG() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dE() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ah.i()) * 0.6 - 0.3;
         exc $$5 = new exc(((double)this.ah.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dG() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dE() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dt(), this.dx(), this.dz());
         this.dO().a(new li(lm.S, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void L_() {
      if (!this.dO().B || this.fr()) {
         bqq $$0 = this.fs();
         if (!this.bz.equals(this.b($$0))) {
            this.fw();
         } else {
            if (!this.bz.e() && this.fr()) {
               this.b(this.bz, 16);
               cuq $$1 = this.bz.a(this.dO(), this);
               if ($$1 != this.bz) {
                  this.a($$0, $$1);
               }

               this.fx();
            }
         }
      }
   }

   public cuq ft() {
      return this.bz;
   }

   public int fu() {
      return this.bA;
   }

   public int fv() {
      return this.fr() ? this.bz.a(this) - this.fu() : 0;
   }

   public void fw() {
      if (!this.bz.e()) {
         this.bz.a(this.dO(), this, this.fu());
         if (this.bz.v()) {
            this.J();
         }
      }

      this.fx();
   }

   public void fx() {
      if (!this.dO().B) {
         boolean $$0 = this.fr();
         this.c(1, false);
         if ($$0) {
            this.a(dxz.C);
         }
      }

      this.bz = cuq.l;
      this.bA = 0;
   }

   public boolean fy() {
      if (this.fr() && !this.bz.e()) {
         cul $$0 = this.bz.g();
         return $$0.b(this.bz) != cwo.d ? false : $$0.a(this.bz, this) - this.bA >= 5;
      } else {
         return false;
      }
   }

   public boolean fz() {
      return this.bW();
   }

   public boolean fA() {
      return this.i(7);
   }

   @Override
   public boolean ce() {
      return super.ce() || !this.fA() && this.c(bua.b);
   }

   public int fB() {
      return this.bB;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dt();
      double $$5 = this.dv();
      double $$6 = this.dz();
      double $$7 = $$1;
      boolean $$8 = false;
      jd $$9 = jd.a($$0, $$1, $$2);
      dcw $$10 = this.dO();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.I_()) {
            jd $$12 = $$9.e();
            dtc $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cK())) {
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

         if (this instanceof btw $$14) {
            $$14.N().n();
         }

         return true;
      }
   }

   public boolean fC() {
      return !this.ex();
   }

   public boolean fD() {
      return true;
   }

   public void a(jd $$0, boolean $$1) {
   }

   public boolean f(cuq $$0) {
      return false;
   }

   @Override
   public final bsu a(bua $$0) {
      return $$0 == bua.c ? aF : this.e($$0).a(this.eb());
   }

   protected bsu e(bua $$0) {
      return this.am().n().a(this.ea());
   }

   public ImmutableList<bua> fE() {
      return ImmutableList.of(bua.a);
   }

   public ewx f(bua $$0) {
      bsu $$1 = this.a($$0);
      return new ewx((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bua $$0) {
      ewx $$1 = this.a($$0).a(this.dm());
      return this.dO().b(this, $$1);
   }

   @Override
   public boolean o(boolean $$0) {
      return super.o($$0) && !this.fH();
   }

   public Optional<jd> fF() {
      return this.ao.a(bR);
   }

   public void g(jd $$0) {
      this.ao.a(bR, Optional.of($$0));
   }

   public void fG() {
      this.ao.a(bR, Optional.empty());
   }

   public boolean fH() {
      return this.fF().isPresent();
   }

   public void b(jd $$0) {
      if (this.bS()) {
         this.ad();
      }

      dtc $$1 = this.dO().a_($$0);
      if ($$1.b() instanceof dfr) {
         this.dO().a($$0, $$1.a(dfr.c, Boolean.valueOf(true)), 3);
      }

      this.b(bua.c);
      this.a($$0);
      this.g($$0);
      this.i(exc.b);
      this.av = true;
   }

   private void a(jd $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean O() {
      return this.fF().map($$0 -> this.dO().a_($$0).b() instanceof dfr).orElse(false);
   }

   public void fI() {
      this.fF().filter(this.dO()::B).ifPresent($$0x -> {
         dtc $$1 = this.dO().a_($$0x);
         if ($$1.b() instanceof dfr) {
            ji $$2 = $$1.c(dfr.aE);
            this.dO().a($$0x, $$1.a(dfr.c, Boolean.valueOf(false)), 3);
            exc $$3 = dfr.a(this.am(), this.dO(), $$0x, $$2, this.dE()).orElseGet(() -> {
               jd $$1x = $$0x.d();
               return new exc((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            exc $$4 = exc.c($$0x).d($$3).d();
            float $$5 = (float)ayo.d(ayo.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.t($$5);
            this.u(0.0F);
         }
      });
      exc $$0 = this.dm();
      this.b(bua.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fG();
   }

   @Nullable
   public ji fJ() {
      jd $$0 = this.fF().orElse(null);
      return $$0 != null ? dfr.a(this.dO(), $$0) : null;
   }

   @Override
   public boolean bF() {
      return !this.fH() && super.bF();
   }

   public cuq g(cuq $$0) {
      return cuq.l;
   }

   public final cuq a(dcw $$0, cuq $$1) {
      cpr $$2 = $$1.a(kq.v);
      return $$2 != null ? this.a($$0, $$1, $$2) : $$1;
   }

   public cuq a(dcw $$0, cuq $$1, cpr $$2) {
      $$0.a(null, this.dt(), this.dv(), this.dz(), this.d($$1), avq.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
      this.a($$2);
      $$1.a(1, this);
      this.a(dxz.m);
      return $$1;
   }

   private void a(cpr $$0) {
      if (!this.dO().x_()) {
         for (cpr.b $$2 : $$0.g()) {
            if (this.ah.i() < $$2.b()) {
               this.b($$2.a());
            }
         }
      }
   }

   private static byte g(bsy $$0) {
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

   public void a(cul $$0, bsy $$1) {
      this.dO().a(this, g($$1));
   }

   public static bsy d(bqq $$0) {
      return $$0 == bqq.a ? bsy.a : bsy.b;
   }

   @Override
   public ewx h_() {
      if (this.a(bsy.f).a(cut.uq)) {
         float $$0 = 0.5F;
         return this.cK().c(0.5, 0.5, 0.5);
      } else {
         return super.h_();
      }
   }

   public bsy h(cuq $$0) {
      cts $$1 = cts.c_($$0);
      if ($$1 != null) {
         bsy $$2 = $$1.m();
         if (this.d($$2)) {
            return $$2;
         }
      }

      return bsy.a;
   }

   private static bug a(btn $$0, bsy $$1) {
      return $$1 != bsy.f && $$1 != bsy.a && $$1 != bsy.b ? bug.a($$0, $$1, $$2 -> $$2.e() || $$0.h($$2) == $$1) : bug.a($$0, $$1);
   }

   @Nullable
   private static bsy s(int $$0) {
      if ($$0 == 100 + bsy.f.b()) {
         return bsy.f;
      } else if ($$0 == 100 + bsy.e.b()) {
         return bsy.e;
      } else if ($$0 == 100 + bsy.d.b()) {
         return bsy.d;
      } else if ($$0 == 100 + bsy.c.b()) {
         return bsy.c;
      } else if ($$0 == 98) {
         return bsy.a;
      } else if ($$0 == 99) {
         return bsy.b;
      } else {
         return $$0 == 105 ? bsy.g : null;
      }
   }

   @Override
   public bug a_(int $$0) {
      bsy $$1 = s($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dC() {
      if (this.R_()) {
         return false;
      } else {
         boolean $$0 = !this.a(bsy.f).a(awn.aZ) && !this.a(bsy.e).a(awn.aZ) && !this.a(bsy.d).a(awn.aZ) && !this.a(bsy.c).a(awn.aZ) && !this.a(bsy.g).a(awn.aZ);
         return $$0 && super.dC();
      }
   }

   @Override
   public boolean ch() {
      return !this.dO().x_() && this.b(bsb.x) || super.ch();
   }

   @Override
   public float dF() {
      return this.aY;
   }

   @Override
   public void a(abv $$0) {
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      float $$4 = $$0.n();
      float $$5 = $$0.m();
      this.f($$1, $$2, $$3);
      this.aY = $$0.o();
      this.ba = $$0.o();
      this.aZ = this.aY;
      this.bb = this.ba;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.n($$0.j(), $$0.k(), $$0.l());
   }

   public boolean fK() {
      return this.dS().g() instanceof csk;
   }

   @Override
   public float dI() {
      float $$0 = (float)this.g(buw.B);
      return this.cQ() instanceof cmx ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public exc m(bsr $$0) {
      return this.dm().e(this.a($$0, this.a(this.at()), this.eb() * this.ea()));
   }

   protected void a(int $$0, double $$1) {
      this.ba = (float)ayo.e(1.0 / (double)$$0, (double)this.ba, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(ayo.c((double)$$0 * this.g(buw.h)));
   }

   public boolean fL() {
      return false;
   }

   @Override
   public boolean b(brk $$0) {
      if (super.b($$0)) {
         return true;
      } else {
         if (this.dO() instanceof aqu $$1 && dae.a($$1, this, $$0)) {
            return true;
         }

         return false;
      }
   }

   public static record a(avo a, avo b) {
   }
}

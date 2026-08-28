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
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class btl extends bsq implements bsn {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final akq d = akq.b("powder_snow");
   private static final akq e = akq.b("sprinting");
   private static final bus bH = new bus(e, 0.3F, bus.a.c);
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
   protected static final ajv<Byte> aE = ajz.a(btl.class, ajx.a);
   private static final ajv<Float> bM = ajz.a(btl.class, ajx.d);
   private static final ajv<List<lk>> bN = ajz.a(btl.class, ajx.m);
   private static final ajv<Boolean> bO = ajz.a(btl.class, ajx.k);
   private static final ajv<Integer> bP = ajz.a(btl.class, ajx.b);
   private static final ajv<Integer> bQ = ajz.a(btl.class, ajx.b);
   private static final ajv<Optional<jd>> bR = ajz.a(btl.class, ajx.p);
   private static final int bS = 15;
   protected static final bst aF = bst.c(0.2F, 0.2F).b(0.2F);
   public static final float aG = 0.5F;
   public static final float aH = 0.5F;
   private static final float bT = 0.21875F;
   public static final String aI = "attributes";
   private final bur bU;
   private final brg bV = new brg(this);
   private final Map<jm<brw>, bry> bW = Maps.newHashMap();
   private final jv<cuo> bX = jv.a(2, cuo.l);
   private final jv<cuo> bY = jv.a(4, cuo.l);
   private cuo bZ = cuo.l;
   public boolean aJ;
   private boolean ca = false;
   public bqp aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public int aQ;
   public float aR;
   public float aS;
   protected int aT;
   public final bun aU = new bun();
   public final int aV = 20;
   public final float aW;
   public final float aX;
   public float aY;
   public float aZ;
   public float ba;
   public float bb;
   @Nullable
   protected cmv bc;
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
   private btl cc;
   private int cd;
   @Nullable
   private btl ce;
   private int cf;
   private float cg;
   private int ch;
   private float ci;
   protected cuo bz = cuo.l;
   protected int bA;
   protected int bB;
   private jd cj;
   private Optional<jd> ck = Optional.empty();
   @Nullable
   private brj cl;
   private long cm;
   protected int bC;
   protected float bD;
   @Nullable
   protected cuo bE;
   private float cn;
   private float co;
   protected buo<?> bF;
   private boolean cp;
   private final Reference2ObjectMap<daa, Set<dar>> cq = new Reference2ObjectArrayMap();
   protected float bG = 1.0F;

   protected btl(bsw<? extends btl> $$0, dcu $$1) {
      super($$0, $$1);
      this.bU = new bur(buv.a($$0));
      this.u(this.eO());
      this.J = true;
      this.aX = (float)((Math.random() + 1.0) * 0.01F);
      this.av();
      this.aW = (float)Math.random() * 12398.0F;
      this.s((float)(Math.random() * (float) (Math.PI * 2)));
      this.ba = this.dG();
      uo $$2 = uo.a;
      this.bF = this.a(new Dynamic($$2, (ux)$$2.createMap(ImmutableMap.of($$2.a("memories"), (ux)$$2.emptyMap()))));
   }

   public buo<?> dU() {
      return this.bF;
   }

   protected buo.b<?> dV() {
      return buo.a(ImmutableList.of(), ImmutableList.of());
   }

   protected buo<?> a(Dynamic<?> $$0) {
      return this.dV().a($$0);
   }

   @Override
   public void ap() {
      this.a(this.dR().x(), Float.MAX_VALUE);
   }

   public boolean a(bsw<?> $$0) {
      return true;
   }

   @Override
   protected void a(ajz.a $$0) {
      $$0.a(aE, (byte)0);
      $$0.a(bN, List.of());
      $$0.a(bO, false);
      $$0.a(bP, 0);
      $$0.a(bQ, 0);
      $$0.a(bM, 1.0F);
      $$0.a(bR, Optional.empty());
   }

   public static but.a dW() {
      return but.a()
         .a(buu.s)
         .a(buu.p)
         .a(buu.v)
         .a(buu.a)
         .a(buu.b)
         .a(buu.r)
         .a(buu.B)
         .a(buu.y)
         .a(buu.n)
         .a(buu.x)
         .a(buu.k)
         .a(buu.o)
         .a(buu.w)
         .a(buu.h)
         .a(buu.i)
         .a(buu.E)
         .a(buu.u)
         .a(buu.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dta $$2, jd $$3) {
      if (!this.bf()) {
         this.bn();
      }

      if (this.dQ() instanceof aqt $$4 && $$1 && this.ac > 0.0F) {
         this.a($$4, $$3);
         double $$5 = this.g(buu.x);
         if ((double)this.ac > $$5 && !$$2.i()) {
            double $$6 = this.dv();
            double $$7 = this.dx();
            double $$8 = this.dB();
            jd $$9 = this.dq();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            float $$13 = (float)ayn.c((double)this.ac - $$5);
            double $$14 = Math.min((double)(0.2F + $$13 / 15.0F), 2.5);
            int $$15 = (int)(150.0 * $$14);
            ((aqt)this.dQ()).a(new le(lm.b, $$2), $$6, $$7, $$8, $$15, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.ck = Optional.empty();
      }
   }

   public final boolean dX() {
      return this.am().a(awh.m);
   }

   public float a(float $$0) {
      return ayn.i($$0, this.co, this.cn);
   }

   public boolean dY() {
      return this.dt().b() < 1.0E-5F && this.bj();
   }

   @Override
   public void aw() {
      this.aR = this.aS;
      if (this.an) {
         this.fG().ifPresent(this::a);
      }

      if (this.dQ() instanceof aqt $$0) {
         dac.b($$0, this);
      }

      super.aw();
      this.dQ().ag().a("livingEntityBaseTick");
      if (this.be() || this.dQ().B) {
         this.aD();
      }

      if (this.bE()) {
         boolean $$1 = this instanceof cmv;
         if (!this.dQ().B) {
            if (this.bF()) {
               this.a(this.dR().g(), 1.0F);
            } else if ($$1 && !this.dQ().C_().a(this.cL())) {
               double $$2 = this.dQ().C_().a(this) + this.dQ().C_().n();
               if ($$2 < 0.0) {
                  double $$3 = this.dQ().C_().o();
                  if ($$3 > 0.0) {
                     this.a(this.dR().w(), (float)Math.max(1, ayn.a(-$$2 * $$3)));
                  }
               }
            }
         }

         if (this.a(awj.a) && !this.dQ().a_(jd.a(this.dv(), this.dz(), this.dB())).a(dfy.nd)) {
            boolean $$4 = !this.dX() && !brz.c(this) && (!$$1 || !((cmv)this).ga().a);
            if ($$4) {
               this.j(this.m(this.cm()));
               if (this.cm() == -20) {
                  this.j(0);
                  eww $$5 = this.dt();

                  for (int $$6 = 0; $$6 < 8; $$6++) {
                     double $$7 = this.ah.j() - this.ah.j();
                     double $$8 = this.ah.j() - this.ah.j();
                     double $$9 = this.ah.j() - this.ah.j();
                     this.dQ().a(lm.d, this.dv() + $$7, this.dx() + $$8, this.dB() + $$9, $$5.c, $$5.d, $$5.e);
                  }

                  this.a(this.dR().i(), 2.0F);
               }
            }

            if (!this.dQ().B && this.bS() && this.dd() != null && this.dd().bU()) {
               this.ad();
            }
         } else if (this.cm() < this.cl()) {
            this.j(this.n(this.cm()));
         }

         if (this.dQ() instanceof aqt $$10) {
            jd $$11 = this.dq();
            if (!Objects.equal(this.cj, $$11)) {
               this.cj = $$11;
               this.a($$10, $$11);
            }
         }
      }

      if (this.bE() && (this.bh() || this.az)) {
         this.aI();
      }

      if (this.aO > 0) {
         this.aO--;
      }

      if (this.am > 0 && !(this instanceof aqu)) {
         this.am--;
      }

      if (this.ey() && this.dQ().h(this)) {
         this.ee();
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

      this.ep();
      this.bj = this.bi;
      this.aZ = this.aY;
      this.bb = this.ba;
      this.O = this.dG();
      this.P = this.dI();
      this.dQ().ag().c();
   }

   @Override
   protected float aO() {
      return ayn.i((float)this.g(buu.u), super.aO(), 1.0F);
   }

   protected void dZ() {
      buq $$0 = this.f(buu.v);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.c(d);
         }
      }
   }

   protected void ea() {
      if (!this.bp().i()) {
         int $$0 = this.cn();
         if ($$0 > 0) {
            buq $$1 = this.f(buu.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.co();
            $$1.b(new bus(d, (double)$$2, bus.a.a));
         }
      }
   }

   protected void a(aqt $$0, jd $$1) {
      dac.a($$0, this);
   }

   public boolean o_() {
      return false;
   }

   public float eb() {
      return this.o_() ? 0.5F : 1.0F;
   }

   public float ec() {
      bur $$0 = this.eT();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(buu.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean ed() {
      return true;
   }

   protected void ee() {
      this.aQ++;
      if (this.aQ >= 20 && !this.dQ().x_() && !this.dL()) {
         this.dQ().a(this, (byte)60);
         this.a(bsq.c.a);
      }
   }

   public boolean ef() {
      return !this.o_();
   }

   protected boolean eg() {
      return !this.o_();
   }

   protected int m(int $$0) {
      buq $$1 = this.f(buu.w);
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

   public final int a(aqt $$0, @Nullable bsq $$1) {
      return dac.a($$0, $$1, this, this.eh());
   }

   protected int eh() {
      return 0;
   }

   protected boolean ei() {
      return false;
   }

   @Nullable
   public btl ej() {
      return this.cc;
   }

   @Override
   public btl T_() {
      return this.ej();
   }

   public int ek() {
      return this.cd;
   }

   public void c(@Nullable cmv $$0) {
      this.bc = $$0;
      this.bd = this.ai;
   }

   public void a(@Nullable btl $$0) {
      this.cc = $$0;
      this.cd = this.ai;
   }

   @Nullable
   public btl el() {
      return this.ce;
   }

   public int em() {
      return this.cf;
   }

   public void A(bsq $$0) {
      if ($$0 instanceof btl) {
         this.ce = (btl)$$0;
      } else {
         this.ce = null;
      }

      this.cf = this.ai;
   }

   public int en() {
      return this.bf;
   }

   public void o(int $$0) {
      this.bf = $$0;
   }

   public boolean eo() {
      return this.ca;
   }

   public void r(boolean $$0) {
      this.ca = $$0;
   }

   protected boolean b(bsx $$0) {
      return true;
   }

   public void a(bsx $$0, cuo $$1, cuo $$2) {
      boolean $$3 = $$2.e() && $$1.e();
      if (!$$3 && !cuo.c($$1, $$2) && !this.an) {
         ctq $$4 = ctq.c_($$2);
         if (!this.dQ().x_() && !this.N_()) {
            if (!this.aX() && $$4 != null && $$4.m() == $$0) {
               this.dQ().a(null, this.dv(), this.dx(), this.dB(), $$4.n(), this.df(), 1.0F, 1.0F, this.ah.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? dxw.v : dxw.S);
            }
         }
      }
   }

   @Override
   public void a(bsq.c $$0) {
      if ($$0 == bsq.c.a || $$0 == bsq.c.b) {
         this.c($$0);
      }

      super.a($$0);
      this.bF.a();
   }

   protected void c(bsq.c $$0) {
      for (bry $$1 : this.eu()) {
         $$1.a(this, $$0);
      }

      this.bW.clear();
   }

   @Override
   public void b(ua $$0) {
      $$0.a("Health", this.ex());
      $$0.a("HurtTime", (short)this.aO);
      $$0.a("HurtByTimestamp", this.cd);
      $$0.a("DeathTime", (short)this.aQ);
      $$0.a("AbsorptionAmount", this.fp());
      $$0.a("attributes", this.eT().d());
      if (!this.bW.isEmpty()) {
         ug $$1 = new ug();

         for (bry $$2 : this.bW.values()) {
            $$1.add($$2.j());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fB());
      this.fG().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<ux> $$3 = this.bF.a(uo.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(ua $$0) {
      this.C($$0.j("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dQ() != null && !this.dQ().B) {
         this.eT().a($$0.c("attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         ug $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ua $$3 = $$1.a($$2);
            bry $$4 = bry.a($$3);
            if ($$4 != null) {
               this.bW.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.u($$0.j("Health"));
      }

      this.aO = $$0.g("HurtTime");
      this.aQ = $$0.g("DeathTime");
      this.cd = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         eya $$6 = this.dQ().M();
         exv $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cB(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         jd $$9 = new jd($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.f($$9);
         this.ao.a(at, bty.c);
         if (!this.an) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bF = this.a(new Dynamic(uo.a, $$0.c("Brain")));
      }
   }

   protected void ep() {
      Iterator<jm<brw>> $$0 = this.bW.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jm<brw> $$1 = $$0.next();
            bry $$2 = this.bW.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dQ().B) {
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
         if (!this.dQ().B) {
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
            this.dQ().a(ad.a($$3, this.ah), this.d(0.5), this.dy(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void K() {
      if (this.bW.isEmpty()) {
         this.es();
         this.l(false);
      } else {
         this.l(this.b(bsa.n));
         this.s();
      }
   }

   private void s() {
      List<lk> $$0 = this.bW.values().stream().filter(bry::g).map(bry::a).toList();
      this.ao.a(bN, $$0);
      this.ao.a(bO, c(this.bW.values()));
   }

   private void v() {
      boolean $$0 = this.ch();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable bsq $$0) {
      double $$1 = 1.0;
      if (this.bZ()) {
         $$1 *= 0.8;
      }

      if (this.ci()) {
         float $$2 = this.fa();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cuo $$3 = this.a(bsx.f);
         bsw<?> $$4 = $$0.am();
         if ($$4 == bsw.aN && $$3.a(cur.ul)
            || $$4 == bsw.bu && $$3.a(cur.uo)
            || $$4 == bsw.aA && $$3.a(cur.ur)
            || $$4 == bsw.aB && $$3.a(cur.ur)
            || $$4 == bsw.x && $$3.a(cur.up)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(btl $$0) {
      return $$0 instanceof cmv && this.dQ().al() == bqn.a ? false : $$0.eq();
   }

   public boolean a(btl $$0, ced $$1) {
      return $$1.a(this, $$0);
   }

   public boolean eq() {
      return !this.cv() && this.er();
   }

   public boolean er() {
      return !this.N_() && this.bE();
   }

   public static boolean c(Collection<bry> $$0) {
      for (bry $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void es() {
      this.ao.a(bN, List.of());
   }

   public boolean et() {
      if (this.dQ().B) {
         return false;
      } else {
         Iterator<bry> $$0 = this.bW.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bry> eu() {
      return this.bW.values();
   }

   public Map<jm<brw>, bry> ev() {
      return this.bW;
   }

   public boolean b(jm<brw> $$0) {
      return this.bW.containsKey($$0);
   }

   @Nullable
   public bry c(jm<brw> $$0) {
      return this.bW.get($$0);
   }

   public final boolean b(bry $$0) {
      return this.b($$0, null);
   }

   public boolean b(bry $$0, @Nullable bsq $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bry $$2 = this.bW.get($$0.c());
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

   public boolean c(bry $$0) {
      if (this.am().a(awh.G)) {
         return !$$0.a(bsa.M);
      } else if (this.am().a(awh.F)) {
         return !$$0.a(bsa.L);
      } else {
         return !this.am().a(awh.w) ? true : !$$0.a(bsa.j) && !$$0.a(bsa.s);
      }
   }

   public void c(bry $$0, @Nullable bsq $$1) {
      if (this.c($$0)) {
         bry $$2 = this.bW.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean ew() {
      return this.am().a(awh.x);
   }

   @Nullable
   public bry d(jm<brw> $$0) {
      return this.bW.remove($$0);
   }

   public boolean e(jm<brw> $$0) {
      bry $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bry $$0, @Nullable bsq $$1) {
      this.cb = true;
      if (!this.dQ().B) {
         $$0.c().a().a(this.eT(), $$0.e());
         this.d($$0);
      }
   }

   public void d(bry $$0) {
      for (bsq $$1 : this.cT()) {
         if ($$1 instanceof aqu $$2) {
            $$2.c.b(new aga(this.an(), $$0, false));
         }
      }
   }

   protected void a(bry $$0, boolean $$1, @Nullable bsq $$2) {
      this.cb = true;
      if ($$1 && !this.dQ().B) {
         brw $$3 = $$0.c().a();
         $$3.a(this.eT());
         $$3.a(this.eT(), $$0.e());
         this.z();
      }

      if (!this.dQ().B) {
         this.d($$0);
      }
   }

   protected void a(bry $$0) {
      this.cb = true;
      if (!this.dQ().B) {
         $$0.c().a().a(this.eT());
         this.z();

         for (bsq $$1 : this.cT()) {
            if ($$1 instanceof aqu $$2) {
               $$2.c.b(new aef(this.an(), $$0.c()));
            }
         }
      }
   }

   private void z() {
      Set<buq> $$0 = this.eT().b();

      for (buq $$1 : $$0) {
         this.i($$1.a());
      }

      $$0.clear();
   }

   private void i(jm<bup> $$0) {
      if ($$0.a(buu.s)) {
         float $$1 = this.eO();
         if (this.ex() > $$1) {
            this.u($$1);
         }
      } else if ($$0.a(buu.r)) {
         float $$2 = this.eP();
         if (this.fp() > $$2) {
            this.B($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.ex();
      if ($$1 > 0.0F) {
         this.u($$1 + $$0);
      }
   }

   public float ex() {
      return this.ao.a(bM);
   }

   public void u(float $$0) {
      this.ao.a(bM, ayn.a($$0, 0.0F, this.eO()));
   }

   public boolean ey() {
      return this.ex() <= 0.0F;
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dQ().B) {
         return false;
      } else if (this.ey()) {
         return false;
      } else if ($$0.a(awf.i) && this.b(bsa.l)) {
         return false;
      } else {
         if (this.fI() && !this.dQ().B) {
            this.fJ();
         }

         this.bf = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.w($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(awf.j) && $$0.c() instanceof btl $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(awf.o) && this.am().a(awh.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(awf.a) && !this.a(bsx.f).e()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aU.a(1.5F);
         boolean $$7 = true;
         if ((float)this.am > 10.0F && !$$0.a(awf.e)) {
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

         bsq $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof btl $$9 && !$$0.a(awf.q) && (!$$0.a(brm.H) || !this.am().a(awh.E))) {
               this.a($$9);
            }

            if ($$8 instanceof cmv $$10) {
               this.bd = 100;
               this.bc = $$10;
            } else if ($$8 instanceof cgf $$11 && $$11.s()) {
               this.bd = 100;
               if ($$11.P_() instanceof cmv $$12) {
                  this.bc = $$12;
               } else {
                  this.bc = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dQ().a(this, (byte)29);
            } else {
               this.dQ().a(this, $$0);
            }

            if (!$$0.a(awf.r) && (!$$3 || $$1 > 0.0F)) {
               this.bw();
            }

            if (!$$0.a(awf.z)) {
               double $$13 = 0.0;
               double $$14 = 0.0;
               if ($$0.c() instanceof cnn $$15) {
                  DoubleDoubleImmutablePair $$16 = $$15.a_(this, $$0);
                  $$13 = -$$16.leftDouble();
                  $$14 = -$$16.rightDouble();
               } else if ($$0.h() != null) {
                  $$13 = $$0.h().a() - this.dv();
                  $$14 = $$0.h().c() - this.dB();
               }

               this.p(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.ey()) {
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
            this.cm = this.dQ().Z();

            for (bry $$18 : this.eu()) {
               $$18.a(this, $$0, $$1);
            }
         }

         if (this instanceof aqu) {
            an.i.a((aqu)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((aqu)this).a(avy.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof aqu) {
            an.h.a((aqu)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$17;
      }
   }

   protected void d(btl $$0) {
      $$0.e(this);
   }

   protected void e(btl $$0) {
      $$0.p(0.5, $$0.dv() - this.dv(), $$0.dB() - this.dB());
   }

   private boolean g(brj $$0) {
      if ($$0.a(awf.d)) {
         return false;
      } else {
         cuo $$1 = null;

         for (bqp $$2 : bqp.values()) {
            cuo $$3 = this.b($$2);
            if ($$3.a(cur.vt)) {
               $$1 = $$3.s();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof aqu $$4) {
               $$4.b(avy.c.b(cur.vt));
               an.C.a($$4, $$1);
               this.a(dxw.C);
            }

            this.u(1.0F);
            this.et();
            this.b(new bry(bsa.j, 900, 1));
            this.b(new bry(bsa.v, 100, 1));
            this.b(new bry(bsa.l, 800, 0));
            this.dQ().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public brj ez() {
      if (this.dQ().Z() - this.cm > 40L) {
         this.cl = null;
      }

      return this.cl;
   }

   protected void e(brj $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable avn $$0) {
      if ($$0 != null) {
         this.a($$0, this.fb(), this.fc());
      }
   }

   public boolean f(brj $$0) {
      bsq $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cnb $$3 && $$3.D() > 0) {
         $$2 = true;
      }

      if (!$$0.a(awf.c) && this.fz() && !$$2) {
         eww $$4 = $$0.h();
         if ($$4 != null) {
            eww $$5 = this.c(0.0F, this.ct());
            eww $$6 = $$4.a(this.do());
            $$6 = new eww($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(cuo $$0) {
      if (!$$0.e()) {
         if (!this.aX()) {
            this.dQ().a(this.dv(), this.dx(), this.dB(), $$0.K(), this.df(), 0.8F, 0.8F + this.dQ().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(brj $$0) {
      if (!this.dL() && !this.be) {
         bsq $$1 = $$0.d();
         btl $$2 = this.eN();
         if (this.bl >= 0 && $$2 != null) {
            $$2.a(this, this.bl, $$0);
         }

         if (this.fI()) {
            this.fJ();
         }

         if (!this.dQ().B && this.ai()) {
            b.info("Named entity {} died: {}", this, this.eM().a().getString());
         }

         this.be = true;
         this.eM().c();
         if (this.dQ() instanceof aqt $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dxw.p);
               this.a($$3, $$0);
               this.f($$2);
            }

            this.dQ().a(this, (byte)3);
         }

         this.b(bty.h);
      }
   }

   protected void f(@Nullable btl $$0) {
      if (!this.dQ().B) {
         boolean $$1 = false;
         if ($$0 instanceof cis) {
            if (this.dQ().ab().b(dcq.c)) {
               jd $$2 = this.dq();
               dta $$3 = dfy.cd.o();
               if (this.dQ().a_($$2).i() && $$3.a((dcx)this.dQ(), $$2)) {
                  this.dQ().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               cjf $$4 = new cjf(this.dQ(), this.dv(), this.dx(), this.dB(), new cuo(cur.dw));
               this.dQ().b($$4);
            }
         }
      }
   }

   protected void a(aqt $$0, brj $$1) {
      boolean $$2 = this.bd > 0;
      if (this.eg() && $$0.ab().b(dcq.f)) {
         this.a($$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.eA();
      this.C($$1.d());
   }

   protected void eA() {
   }

   protected void C(@Nullable bsq $$0) {
      if (this.dQ() instanceof aqt $$1 && !this.eE() && (this.ei() || this.bd > 0 && this.ef() && this.dQ().ab().b(dcq.f))) {
         btb.a($$1, this.do(), this.a($$1, $$0));
      }
   }

   protected void a(aqt $$0, brj $$1, boolean $$2) {
   }

   public akp<erq> eB() {
      return this.am().k();
   }

   public long eC() {
      return 0L;
   }

   protected float a(bsq $$0, brj $$1) {
      float $$2 = (float)this.g(buu.d);
      return this.dQ() instanceof aqt $$3 ? dac.d($$3, this.eU(), $$0, $$1, $$2) : $$2;
   }

   protected void a(brj $$0, boolean $$1) {
      akp<erq> $$2 = this.eB();
      erq $$3 = this.dQ().o().be().b($$2);
      ero.a $$4 = new ero.a((aqt)this.dQ()).a(euh.a, this).a(euh.f, this.do()).a(euh.c, $$0).b(euh.d, $$0.d()).b(euh.e, $$0.c());
      if ($$1 && this.bc != null) {
         $$4 = $$4.a(euh.b, this.bc).a(this.bc.gv());
      }

      ero $$5 = $$4.a(eug.g);
      $$3.a($$5, this.eC(), this::b);
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.g(buu.p);
      if (!($$0 <= 0.0)) {
         this.av = true;
         eww $$3 = this.dt();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         eww $$4 = new eww($$1, 0.0, $$2).d().a($$0);
         this.n($$3.c / 2.0 - $$4.c, this.aF() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected avn d(brj $$0) {
      return avo.kg;
   }

   @Nullable
   protected avn n_() {
      return avo.kb;
   }

   private avn d(int $$0) {
      return $$0 > 4 ? this.eI().b() : this.eI().a();
   }

   public void eD() {
      this.cp = true;
   }

   public boolean eE() {
      return this.cp;
   }

   public float eF() {
      return 0.0F;
   }

   protected ewr eG() {
      ewr $$0 = this.cL();
      bsq $$1 = this.dd();
      if ($$1 != null) {
         eww $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<daa, Set<dar>> eH() {
      return this.cq;
   }

   public btl.a eI() {
      return new btl.a(avo.kh, avo.jZ);
   }

   protected avn c(cuo $$0) {
      return $$0.I();
   }

   public avn d(cuo $$0) {
      return $$0.J();
   }

   public Optional<jd> eJ() {
      return this.ck;
   }

   public boolean p_() {
      if (this.N_()) {
         return false;
      } else {
         jd $$0 = this.dq();
         dta $$1 = this.dr();
         if ($$1.a(awd.aP)) {
            this.ck = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dok && this.c($$0, $$1)) {
            this.ck = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(jd $$0, dta $$1) {
      if ($$1.c(dok.b)) {
         dta $$2 = this.dQ().a_($$0.d());
         if ($$2.a(dfy.cO) && $$2.c(dkc.b) == $$1.c(dok.aE)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bE() {
      return !this.dL() && this.ex() > 0.0F;
   }

   @Override
   public int cy() {
      return this.v(0.0F);
   }

   protected final int v(float $$0) {
      return ayn.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, brj $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.e($$0, $$1);
      if ($$4 > 0) {
         this.a(this.d($$4), 1.0F, 1.0F);
         this.eK();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int e(float $$0, float $$1) {
      if (this.am().a(awh.o)) {
         return 0;
      } else {
         float $$2 = (float)this.g(buu.x);
         float $$3 = $$0 - $$2;
         return ayn.c((double)($$3 * $$1) * this.g(buu.k));
      }
   }

   protected void eK() {
      if (!this.aX()) {
         int $$0 = ayn.a(this.dv());
         int $$1 = ayn.a(this.dx() - 0.2F);
         int $$2 = ayn.a(this.dB());
         dta $$3 = this.dQ().a_(new jd($$0, $$1, $$2));
         if (!$$3.i()) {
            dnk $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void n(float $$0) {
      this.aP = 10;
      this.aO = this.aP;
   }

   public int eL() {
      return ayn.a(this.g(buu.a));
   }

   protected void b(brj $$0, float $$1) {
   }

   protected void c(brj $$0, float $$1) {
   }

   protected void w(float $$0) {
   }

   protected void a(brj $$0, float $$1, bsx... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bsx $$4 : $$2) {
            cuo $$5 = this.a($$4);
            if ($$5.g() instanceof csd && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float d(brj $$0, float $$1) {
      if (!$$0.a(awf.b)) {
         this.b($$0, $$1);
         $$1 = brf.a(this, $$1, $$0, (float)this.eL(), (float)this.g(buu.b));
      }

      return $$1;
   }

   protected float e(brj $$0, float $$1) {
      if ($$0.a(awf.f)) {
         return $$1;
      } else {
         if (this.b(bsa.k) && !$$0.a(awf.g)) {
            int $$2 = (this.c(bsa.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof aqu) {
                  ((aqu)this).a(avy.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof aqu) {
                  ((aqu)$$0.d()).a(avy.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(awf.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dQ() instanceof aqt $$7) {
               $$8 = dac.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = brf.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void f(brj $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fp(), 0.0F);
         this.B(this.fp() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof aqu $$4) {
            $$4.a(avy.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eM().a($$0, var9);
            this.u(this.ex() - var9);
            this.B(this.fp() - var9);
            this.a(dxw.o);
         }
      }
   }

   public brg eM() {
      return this.bV;
   }

   @Nullable
   public btl eN() {
      if (this.bc != null) {
         return this.bc;
      } else {
         return this.cc != null ? this.cc : null;
      }
   }

   public final float eO() {
      return (float)this.g(buu.s);
   }

   public final float eP() {
      return (float)this.g(buu.r);
   }

   public final int eQ() {
      return this.ao.a(bP);
   }

   public final void p(int $$0) {
      this.ao.a(bP, $$0);
   }

   public final int eR() {
      return this.ao.a(bQ);
   }

   public final void q(int $$0) {
      this.ao.a(bQ, $$0);
   }

   private int A() {
      if (brz.a(this)) {
         return 6 - (1 + brz.b(this));
      } else {
         return this.b(bsa.d) ? 6 + (1 + this.c(bsa.d).e()) * 2 : 6;
      }
   }

   public void a(bqp $$0) {
      this.a($$0, false);
   }

   public void a(bqp $$0, boolean $$1) {
      if (!this.aJ || this.aL >= this.A() / 2 || this.aL < 0) {
         this.aL = -1;
         this.aJ = true;
         this.aK = $$0;
         if (this.dQ() instanceof aqt) {
            abw $$2 = new abw(this, $$0 == bqp.a ? 0 : 3);
            aqr $$3 = ((aqt)this.dQ()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(brj $$0) {
      this.aU.a(1.5F);
      this.am = 20;
      this.aP = 10;
      this.aO = this.aP;
      avn $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.fb(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
      }

      this.a(this.dR().o(), 0.0F);
      this.cl = $$0;
      this.cm = this.dQ().Z();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            avn $$1 = this.n_();
            if ($$1 != null) {
               this.a($$1, this.fb(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cmv)) {
               this.u(0.0F);
               this.a(this.dR().o());
            }
            break;
         case 29:
            this.a(avo.wD, 1.0F, 0.8F + this.dQ().z.i() * 0.4F);
            break;
         case 30:
            this.a(avo.wE, 0.8F, 0.8F + this.dQ().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ah.i() - 0.5F) * 0.2F;
               float $$6 = (this.ah.i() - 0.5F) * 0.2F;
               float $$7 = (this.ah.i() - 0.5F) * 0.2F;
               double $$8 = ayn.d($$4, this.L, this.dv()) + (this.ah.j() - 0.5) * (double)this.dk() * 2.0;
               double $$9 = ayn.d($$4, this.M, this.dx()) + this.ah.j() * (double)this.dl();
               double $$10 = ayn.d($$4, this.N, this.dB()) + (this.ah.j() - 0.5) * (double)this.dk() * 2.0;
               this.dQ().a(lm.ac, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.a(bsx.a));
            break;
         case 48:
            this.i(this.a(bsx.b));
            break;
         case 49:
            this.i(this.a(bsx.f));
            break;
         case 50:
            this.i(this.a(bsx.e));
            break;
         case 51:
            this.i(this.a(bsx.d));
            break;
         case 52:
            this.i(this.a(bsx.c));
            break;
         case 54:
            djq.b(this);
            break;
         case 55:
            this.C();
            break;
         case 60:
            this.B();
            break;
         case 65:
            this.i(this.a(bsx.g));
            break;
         default:
            super.b($$0);
      }
   }

   private void B() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ah.k() * 0.02;
         double $$2 = this.ah.k() * 0.02;
         double $$3 = this.ah.k() * 0.02;
         this.dQ().a(lm.ab, this.d(1.0), this.dy(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void C() {
      cuo $$0 = this.a(bsx.b);
      this.a(bsx.b, this.a(bsx.a));
      this.a(bsx.a, $$0);
   }

   @Override
   protected void aE() {
      this.a(this.dR().n(), 4.0F);
   }

   protected void eS() {
      int $$0 = this.A();
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
   public buq f(jm<bup> $$0) {
      return this.eT().a($$0);
   }

   public double g(jm<bup> $$0) {
      return this.eT().c($$0);
   }

   public double h(jm<bup> $$0) {
      return this.eT().d($$0);
   }

   public bur eT() {
      return this.bU;
   }

   public cuo eU() {
      return this.a(bsx.a);
   }

   public cuo eV() {
      return this.a(bsx.b);
   }

   public boolean b(cuj $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cuo> $$0) {
      return $$0.test(this.eU()) || $$0.test(this.eV());
   }

   public cuo b(bqp $$0) {
      if ($$0 == bqp.a) {
         return this.a(bsx.a);
      } else if ($$0 == bqp.b) {
         return this.a(bsx.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bqp $$0, cuo $$1) {
      if ($$0 == bqp.a) {
         this.a(bsx.a, $$1);
      } else {
         if ($$0 != bqp.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bsx.b, $$1);
      }
   }

   public boolean c(bsx $$0) {
      return !this.a($$0).e();
   }

   public boolean d(bsx $$0) {
      return false;
   }

   public abstract Iterable<cuo> eW();

   public abstract cuo a(bsx var1);

   public abstract void a(bsx var1, cuo var2);

   public Iterable<cuo> eX() {
      return List.of();
   }

   public Iterable<cuo> eY() {
      return this.eW();
   }

   public Iterable<cuo> eZ() {
      return Iterables.concat(this.eX(), this.eY());
   }

   protected void e(cuo $$0) {
      $$0.g().m($$0);
   }

   public float fa() {
      Iterable<cuo> $$0 = this.eW();
      int $$1 = 0;
      int $$2 = 0;

      for (cuo $$3 : $$0) {
         if (!$$3.e()) {
            $$2++;
         }

         $$1++;
      }

      return $$1 > 0 ? (float)$$2 / (float)$$1 : 0.0F;
   }

   @Override
   public void i(boolean $$0) {
      super.i($$0);
      buq $$1 = this.f(buu.v);
      $$1.c(bH.b());
      if ($$0) {
         $$1.b(bH);
      }
   }

   protected float fb() {
      return 1.0F;
   }

   public float fc() {
      return this.o_() ? (this.ah.i() - this.ah.i()) * 0.2F + 1.5F : (this.ah.i() - this.ah.i()) * 0.2F + 1.0F;
   }

   protected boolean fd() {
      return this.ey();
   }

   @Override
   public void h(bsq $$0) {
      if (!this.fI()) {
         super.h($$0);
      }
   }

   private void b(bsq $$0) {
      eww $$1;
      if (this.dL()) {
         $$1 = this.do();
      } else if (!$$0.dL() && !this.dQ().a_($$0.dq()).a(awd.aJ)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dx(), $$0.dx());
         $$1 = new eww(this.dv(), $$2, this.dB());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cG() {
      return this.cF();
   }

   protected float fe() {
      return this.x(1.0F);
   }

   protected float x(float $$0) {
      return (float)this.g(buu.o) * $$0 * this.aN() + this.ff();
   }

   public float ff() {
      return this.b(bsa.h) ? 0.1F * ((float)this.c(bsa.h).e() + 1.0F) : 0.0F;
   }

   protected void fg() {
      float $$0 = this.fe();
      if (!($$0 <= 1.0E-5F)) {
         eww $$1 = this.dt();
         this.n($$1.c, (double)$$0, $$1.e);
         if (this.cc()) {
            float $$2 = this.dG() * (float) (Math.PI / 180.0);
            this.j(new eww((double)(-ayn.a($$2)) * 0.2, 0.0, (double)ayn.b($$2) * 0.2));
         }

         this.av = true;
      }
   }

   protected void fh() {
      this.i(this.dt().b(0.0, -0.04F, 0.0));
   }

   protected void c(awt<eox> $$0) {
      this.i(this.dt().b(0.0, 0.04F, 0.0));
   }

   protected float fi() {
      return 0.8F;
   }

   public boolean a(eoy $$0) {
      return false;
   }

   @Override
   protected double aZ() {
      return this.g(buu.n);
   }

   public void a(eww $$0) {
      if (this.db()) {
         double $$1 = this.ba();
         boolean $$2 = this.dt().d <= 0.0;
         if ($$2 && this.b(bsa.B)) {
            $$1 = Math.min($$1, 0.01);
         }

         eoy $$3 = this.dQ().b_(this.dq());
         if (this.bf() && this.ed() && !this.a($$3)) {
            double $$4 = this.dx();
            float $$5 = this.cc() ? 0.9F : this.fi();
            float $$6 = 0.02F;
            float $$7 = (float)this.g(buu.E);
            if (!this.aF()) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7;
               $$6 += (this.fk() - $$6) * $$7;
            }

            if (this.b(bsa.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(btq.a, this.dt());
            eww $$8 = this.dt();
            if (this.Q && this.p_()) {
               $$8 = new eww($$8.c, 0.2, $$8.e);
            }

            this.i($$8.d((double)$$5, 0.8F, (double)$$5));
            eww $$9 = this.a($$1, $$2, this.dt());
            this.i($$9);
            if (this.Q && this.g($$9.c, $$9.d + 0.6F - this.dx() + $$4, $$9.e)) {
               this.n($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bt() && this.ed() && !this.a($$3)) {
            double $$10 = this.dx();
            this.a(0.02F, $$0);
            this.a(btq.a, this.dt());
            if (this.b(awj.b) <= this.dj()) {
               this.i(this.dt().d(0.5, 0.8F, 0.5));
               eww $$11 = this.a($$1, $$2, this.dt());
               this.i($$11);
            } else {
               this.i(this.dt().a(0.5));
            }

            if ($$1 != 0.0) {
               this.i(this.dt().b(0.0, -$$1 / 4.0, 0.0));
            }

            eww $$12 = this.dt();
            if (this.Q && this.g($$12.c, $$12.d + 0.6F - this.dx() + $$10, $$12.e)) {
               this.n($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fB()) {
            this.cr();
            eww $$13 = this.dt();
            eww $$14 = this.bM();
            float $$15 = this.dI() * (float) (Math.PI / 180.0);
            double $$16 = Math.sqrt($$14.c * $$14.c + $$14.e * $$14.e);
            double $$17 = $$13.h();
            double $$18 = $$14.f();
            double $$19 = Math.cos((double)$$15);
            $$19 = $$19 * $$19 * Math.min(1.0, $$18 / 0.4);
            $$13 = this.dt().b(0.0, $$1 * (-1.0 + $$19 * 0.75), 0.0);
            if ($$13.d < 0.0 && $$16 > 0.0) {
               double $$20 = $$13.d * -0.1 * $$19;
               $$13 = $$13.b($$14.c * $$20 / $$16, $$20, $$14.e * $$20 / $$16);
            }

            if ($$15 < 0.0F && $$16 > 0.0) {
               double $$21 = $$17 * (double)(-ayn.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.i($$13.d(0.99F, 0.98F, 0.99F));
            this.a(btq.a, this.dt());
            if (this.Q && !this.dQ().B) {
               double $$22 = this.dt().h();
               double $$23 = $$17 - $$22;
               float $$24 = (float)($$23 * 10.0 - 3.0);
               if ($$24 > 0.0F) {
                  this.a(this.d((int)$$24), 1.0F, 1.0F);
                  this.a(this.dR().m(), $$24);
               }
            }

            if (this.aF() && !this.dQ().B) {
               this.b(7, false);
            }
         } else {
            jd $$25 = this.aL();
            float $$26 = this.dQ().a_($$25).b().h();
            float $$27 = this.aF() ? $$26 * 0.91F : 0.91F;
            eww $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.b(bsa.y)) {
               $$29 += (0.05 * (double)(this.c(bsa.y).e() + 1) - $$28.d) * 0.2;
            } else if (!this.dQ().B || this.dQ().B($$25)) {
               $$29 -= $$1;
            } else if (this.dx() > (double)this.dQ().I_()) {
               $$29 = -0.1;
            } else {
               $$29 = 0.0;
            }

            if (this.eo()) {
               this.n($$28.c, $$29, $$28.e);
            } else {
               this.n($$28.c * (double)$$27, this instanceof cfl ? $$29 * (double)$$27 : $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.s(this instanceof cfl);
   }

   private void c(cmv $$0, eww $$1) {
      eww $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.db()) {
         this.z(this.e($$0));
         this.a($$2);
      } else {
         this.s(false);
         this.i(eww.b);
         this.aG();
      }
   }

   protected void a(cmv $$0, eww $$1) {
   }

   protected eww b(cmv $$0, eww $$1) {
      return $$1;
   }

   protected float e(cmv $$0) {
      return this.fk();
   }

   public void s(boolean $$0) {
      float $$1 = (float)ayn.g(this.dv() - this.L, $$0 ? this.dx() - this.M : 0.0, this.dB() - this.N);
      this.y($$1);
   }

   protected void y(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aU.a($$1, 0.4F);
   }

   public eww a(eww $$0, float $$1) {
      this.a(this.D($$1), $$0);
      this.i(this.b(this.dt()));
      this.a(btq.a, this.dt());
      eww $$2 = this.dt();
      if ((this.Q || this.bn) && (this.p_() || this.dr().a(dfy.qP) && dlr.a(this))) {
         $$2 = new eww($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public eww a(double $$0, boolean $$1, eww $$2) {
      if ($$0 != 0.0 && !this.cc()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new eww($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private eww b(eww $$0) {
      if (this.p_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = ayn.a($$0.c, -0.15F, 0.15F);
         double $$3 = ayn.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dr().a(dfy.nS) && this.fA() && this instanceof cmv) {
            $$4 = 0.0;
         }

         $$0 = new eww($$2, $$4, $$3);
      }

      return $$0;
   }

   private float D(float $$0) {
      return this.aF() ? this.fk() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fj();
   }

   protected float fj() {
      return this.cR() instanceof cmv ? this.fk() * 0.1F : 0.02F;
   }

   public float fk() {
      return this.cg;
   }

   public void z(float $$0) {
      this.cg = $$0;
   }

   public boolean D(bsq $$0) {
      this.A($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.H();
      this.J();
      if (!this.dQ().B) {
         int $$0 = this.eQ();
         if ($$0 > 0) {
            if (this.aM <= 0) {
               this.aM = 20 * (30 - $$0);
            }

            this.aM--;
            if (this.aM <= 0) {
               this.p($$0 - 1);
            }
         }

         int $$1 = this.eR();
         if ($$1 > 0) {
            if (this.aN <= 0) {
               this.aN = 20 * (30 - $$1);
            }

            this.aN--;
            if (this.aN <= 0) {
               this.q($$1 - 1);
            }
         }

         this.D();
         if (this.ai % 20 == 0) {
            this.eM().c();
         }

         if (this.fI() && !this.L()) {
            this.fJ();
         }
      }

      if (!this.dL()) {
         this.m_();
      }

      double $$2 = this.dv() - this.L;
      double $$3 = this.dB() - this.N;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aY;
      float $$6 = 0.0F;
      this.bg = this.bh;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)ayn.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ayn.e(ayn.g(this.dG()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aS > 0.0F) {
         $$5 = this.dG();
      }

      if (!this.aF()) {
         $$7 = 0.0F;
      }

      this.bh = this.bh + ($$7 - this.bh) * 0.3F;
      this.dQ().ag().a("headTurn");
      $$6 = this.f($$5, $$6);
      this.dQ().ag().c();
      this.dQ().ag().a("rangeChecks");

      while (this.dG() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dG() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aY - this.aZ < -180.0F) {
         this.aZ -= 360.0F;
      }

      while (this.aY - this.aZ >= 180.0F) {
         this.aZ += 360.0F;
      }

      while (this.dI() - this.P < -180.0F) {
         this.P -= 360.0F;
      }

      while (this.dI() - this.P >= 180.0F) {
         this.P += 360.0F;
      }

      while (this.ba - this.bb < -180.0F) {
         this.bb -= 360.0F;
      }

      while (this.ba - this.bb >= 180.0F) {
         this.bb += 360.0F;
      }

      this.dQ().ag().c();
      this.bi += $$6;
      if (this.fB()) {
         this.bB++;
      } else {
         this.bB = 0;
      }

      if (this.fI()) {
         this.t(0.0F);
      }

      this.z();
      float $$10 = this.ec();
      if ($$10 != this.bG) {
         this.bG = $$10;
         this.i_();
      }
   }

   private void D() {
      Map<bsx, cuo> $$0 = this.E();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bsx, cuo> E() {
      Map<bsx, cuo> $$0 = null;

      for (bsx $$1 : bsx.values()) {
         cuo $$2 = switch ($$1.a()) {
            case a -> this.f($$1);
            case b -> this.e($$1);
            case c -> this.bZ;
         };
         cuo $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bsx.class);
            }

            $$0.put($$1, $$3);
            bur $$4 = this.eT();
            if (!$$2.e()) {
               $$2.a($$1, ($$3x, $$4x) -> {
                  buq $$5 = $$4.a($$3x);
                  if ($$5 != null) {
                     $$5.d($$4x);
                  }

                  dac.a($$2, this, $$1);
               });
            }

            if (!$$3.e()) {
               $$3.a($$1, ($$3x, $$4x) -> {
                  buq $$5 = $$4.a($$3x);
                  if ($$5 != null) {
                     $$5.c($$4x.b());
                     $$5.b($$4x);
                  }

                  if (this.dQ() instanceof aqt $$7) {
                     dac.a($$7, $$3, this, $$1);
                  }
               });
            }
         }
      }

      return $$0;
   }

   public boolean a(cuo $$0, cuo $$1) {
      return !cuo.a($$1, $$0);
   }

   private void a(Map<bsx, cuo> $$0) {
      cuo $$1 = $$0.get(bsx.a);
      cuo $$2 = $$0.get(bsx.b);
      if ($$1 != null && $$2 != null && cuo.a($$1, this.f(bsx.b)) && cuo.a($$2, this.f(bsx.a))) {
         ((aqt)this.dQ()).l().b(this, new acx(this, (byte)55));
         $$0.remove(bsx.a);
         $$0.remove(bsx.b);
         this.c(bsx.a, $$1.s());
         this.c(bsx.b, $$2.s());
      }
   }

   private void b(Map<bsx, cuo> $$0) {
      List<Pair<bsx, cuo>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cuo $$3 = $$2.s();
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
      ((aqt)this.dQ()).l().b(this, new afb(this.an(), $$1));
   }

   private cuo e(bsx $$0) {
      return this.bY.get($$0.b());
   }

   private void b(bsx $$0, cuo $$1) {
      this.bY.set($$0.b(), $$1);
   }

   private cuo f(bsx $$0) {
      return this.bX.get($$0.b());
   }

   private void c(bsx $$0, cuo $$1) {
      this.bX.set($$0.b(), $$1);
   }

   protected float f(float $$0, float $$1) {
      float $$2 = ayn.g($$0 - this.aY);
      this.aY += $$2 * 0.3F;
      float $$3 = ayn.g(this.dG() - this.aY);
      float $$4 = this.fl();
      if (Math.abs($$3) > $$4) {
         this.aY = this.aY + ($$3 - (float)ayn.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fl() {
      return 50.0F;
   }

   public void m_() {
      if (this.ch > 0) {
         this.ch--;
      }

      if (this.db()) {
         this.br = 0;
         this.f(this.dv(), this.dx(), this.dB());
      }

      if (this.br > 0) {
         this.a(this.br, this.bs, this.bt, this.bu, this.bv, this.bw);
         this.br--;
      } else if (!this.dc()) {
         this.i(this.dt().a(0.98));
      }

      if (this.by > 0) {
         this.a(this.by, this.bx);
         this.by--;
      }

      eww $$0 = this.dt();
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
      this.dQ().ag().a("ai");
      if (this.fd()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      } else if (this.dc()) {
         this.dQ().ag().a("newAi");
         this.fn();
         this.dQ().ag().c();
      }

      this.dQ().ag().c();
      this.dQ().ag().a("jump");
      if (this.bn && this.ed()) {
         double $$4;
         if (this.bt()) {
            $$4 = this.b(awj.b);
         } else {
            $$4 = this.b(awj.a);
         }

         boolean $$6 = this.bf() && $$4 > 0.0;
         double $$7 = this.dj();
         if (!$$6 || this.aF() && !($$4 > $$7)) {
            if (!this.bt() || this.aF() && !($$4 > $$7)) {
               if ((this.aF() || $$6 && $$4 <= $$7) && this.ch == 0) {
                  this.fg();
                  this.ch = 10;
               }
            } else {
               this.c(awj.b);
            }
         } else {
            this.c(awj.a);
         }
      } else {
         this.ch = 0;
      }

      this.dQ().ag().c();
      this.dQ().ag().a("travel");
      this.bo *= 0.98F;
      this.bq *= 0.98F;
      this.F();
      ewr $$8 = this.cL();
      eww $$9 = new eww((double)this.bo, (double)this.bp, (double)this.bq);
      if (this.b(bsa.B) || this.b(bsa.y)) {
         this.n();
      }

      label104: {
         if (this.cR() instanceof cmv $$10 && this.bE()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dQ().ag().c();
      this.dQ().ag().a("freezing");
      if (!this.dQ().B && !this.ey()) {
         int $$11 = this.cn();
         if (this.az && this.dE()) {
            this.k(Math.min(this.cq(), $$11 + 1));
         } else {
            this.k(Math.max(0, $$11 - 2));
         }
      }

      this.dZ();
      this.ea();
      if (!this.dQ().B && this.ai % 40 == 0 && this.cp() && this.dE()) {
         this.a(this.dR().u(), 1.0F);
      }

      this.dQ().ag().c();
      this.dQ().ag().a("push");
      if (this.bC > 0) {
         this.bC--;
         this.a($$8, this.cL());
      }

      this.r();
      this.dQ().ag().c();
      if (!this.dQ().B && this.fm() && this.bh()) {
         this.a(this.dR().i(), 1.0F);
      }
   }

   public boolean fm() {
      return false;
   }

   private void F() {
      boolean $$0 = this.i(7);
      if ($$0 && !this.aF() && !this.bS() && !this.b(bsa.y)) {
         cuo $$1 = this.a(bsx.e);
         if ($$1.a(cur.nT) && ctk.i($$1)) {
            $$0 = true;
            int $$2 = this.bB + 1;
            if (!this.dQ().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, bsx.e);
               }

               this.a(dxw.n);
            }
         } else {
            $$0 = false;
         }
      } else {
         $$0 = false;
      }

      if (!this.dQ().B) {
         this.b(7, $$0);
      }
   }

   protected void fn() {
   }

   protected void r() {
      if (this.dQ().x_()) {
         this.dQ().a(dxk.a(cmv.class), this.cL(), bsv.a(this)).forEach(this::E);
      } else {
         List<bsq> $$0 = this.dQ().a(this, this.cL(), bsv.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dQ().ab().c(dcq.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ah.a(4) == 0) {
               int $$2 = 0;

               for (bsq $$3 : $$0) {
                  if (!$$3.bS()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dR().h(), 6.0F);
               }
            }

            for (bsq $$4 : $$0) {
               this.E($$4);
            }
         }
      }
   }

   protected void a(ewr $$0, ewr $$1) {
      ewr $$2 = $$0.b($$1);
      List<bsq> $$3 = this.dQ().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bsq $$4 : $$3) {
            if ($$4 instanceof btl) {
               this.g((btl)$$4);
               this.bC = 0;
               this.i(this.dt().a(-0.2));
               break;
            }
         }
      } else if (this.Q) {
         this.bC = 0;
      }

      if (!this.dQ().B && this.bC <= 0) {
         this.c(4, false);
         this.bD = 0.0F;
         this.bE = null;
      }
   }

   protected void E(bsq $$0) {
      $$0.h(this);
   }

   protected void g(btl $$0) {
   }

   public boolean fo() {
      return (this.ao.a(aE) & 4) != 0;
   }

   @Override
   public void ad() {
      bsq $$0 = this.dd();
      super.ad();
      if ($$0 != null && $$0 != this.dd() && !this.dQ().B) {
         this.b($$0);
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
      return this.br > 0 ? this.bs : this.dv();
   }

   @Override
   public double d_() {
      return this.br > 0 ? this.bt : this.dx();
   }

   @Override
   public double L_() {
      return this.br > 0 ? this.bu : this.dB();
   }

   @Override
   public float M_() {
      return this.br > 0 ? (float)this.bw : this.dI();
   }

   @Override
   public float e_() {
      return this.br > 0 ? (float)this.bv : this.dG();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bx = (double)$$0;
      this.by = $$1;
   }

   public void t(boolean $$0) {
      this.bn = $$0;
   }

   public void a(cjf $$0) {
      bsq $$1 = $$0.s();
      if ($$1 instanceof aqu) {
         an.R.a((aqu)$$1, $$0.p(), this);
      }
   }

   public void a(bsq $$0, int $$1) {
      if (!$$0.dL() && !this.dQ().B && ($$0 instanceof cjf || $$0 instanceof cnb || $$0 instanceof btb)) {
         ((aqt)this.dQ()).l().b($$0, new afu($$0.an(), this.an(), $$1));
      }
   }

   public boolean F(bsq $$0) {
      if ($$0.dQ() != this.dQ()) {
         return false;
      } else {
         eww $$1 = new eww(this.dv(), this.dz(), this.dB());
         eww $$2 = new eww($$0.dv(), $$0.dz(), $$0.dB());
         return $$2.f($$1) > 128.0 ? false : this.dQ().a(new dcd($$1, $$2, dcd.a.a, dcd.b.a, this)).c() == ewu.a.a;
      }
   }

   @Override
   public float i(float $$0) {
      return $$0 == 1.0F ? this.ba : ayn.i($$0, this.bb, this.ba);
   }

   public float A(float $$0) {
      float $$1 = this.aS - this.aR;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aR + $$1 * $$0;
   }

   @Override
   public boolean bA() {
      return !this.dL();
   }

   @Override
   public boolean bB() {
      return this.bE() && !this.N_() && !this.p_();
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
   public eww a(ji.a $$0, l.a $$1) {
      return k(super.a($$0, $$1));
   }

   public static eww k(eww $$0) {
      return new eww($$0.c, $$0.d, 0.0);
   }

   public float fp() {
      return this.ci;
   }

   public final void B(float $$0) {
      this.C(ayn.a($$0, 0.0F, this.eP()));
   }

   protected void C(float $$0) {
      this.ci = $$0;
   }

   public void f_() {
   }

   public void g_() {
   }

   protected void fq() {
      this.cb = true;
   }

   public abstract btf fr();

   public boolean fs() {
      return (this.ao.a(aE) & 1) > 0;
   }

   public bqp ft() {
      return (this.ao.a(aE) & 2) > 0 ? bqp.b : bqp.a;
   }

   private void H() {
      if (this.fs()) {
         if (cuo.b(this.b(this.ft()), this.bz)) {
            this.bz = this.b(this.ft());
            this.a(this.bz);
         } else {
            this.fy();
         }
      }
   }

   protected void a(cuo $$0) {
      $$0.b(this.dQ(), this, this.fv());
      if (this.I()) {
         this.b($$0, 5);
      }

      if (--this.bA == 0 && !this.dQ().B && !$$0.v()) {
         this.y();
      }
   }

   private boolean I() {
      int $$0 = this.bz.a(this) - this.fv();
      int $$1 = (int)((float)this.bz.a(this) * 0.21875F);
      boolean $$2 = $$0 > $$1;
      return $$2 && this.fv() % 4 == 0;
   }

   private void J() {
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

   public void c(bqp $$0) {
      cuo $$1 = this.b($$0);
      if (!$$1.e() && !this.fs()) {
         this.bz = $$1;
         this.bA = $$1.a(this);
         if (!this.dQ().B) {
            this.c(1, true);
            this.c(2, $$0 == bqp.b);
            this.a(dxw.D);
         }
      }
   }

   @Override
   public void a(ajv<?> $$0) {
      super.a($$0);
      if (bR.equals($$0)) {
         if (this.dQ().B) {
            this.fG().ifPresent(this::a);
         }
      } else if (aE.equals($$0) && this.dQ().B) {
         if (this.fs() && this.bz.e()) {
            this.bz = this.b(this.ft());
            if (!this.bz.e()) {
               this.bA = this.bz.a(this);
            }
         } else if (!this.fs() && !this.bz.e()) {
            this.bz = cuo.l;
            this.bA = 0;
         }
      }
   }

   @Override
   public void a(ff.a $$0, eww $$1) {
      super.a($$0, $$1);
      this.bb = this.ba;
      this.aY = this.ba;
      this.aZ = this.aY;
   }

   protected void b(cuo $$0, int $$1) {
      if (!$$0.e() && this.fs()) {
         if ($$0.u() == cwm.c) {
            this.a(this.c($$0), 0.5F, this.dQ().z.i() * 0.1F + 0.9F);
         }

         if ($$0.u() == cwm.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cuo $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         eww $$3 = new eww(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dI() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dG() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ah.i()) * 0.6 - 0.3;
         eww $$5 = new eww(((double)this.ah.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dI() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dG() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dv(), this.dz(), this.dB());
         this.dQ().a(new li(lm.S, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void y() {
      if (!this.dQ().B || this.fs()) {
         bqp $$0 = this.ft();
         if (!this.bz.equals(this.b($$0))) {
            this.fx();
         } else {
            if (!this.bz.e() && this.fs()) {
               this.b(this.bz, 16);
               cuo $$1 = this.bz.a(this.dQ(), this);
               if ($$1 != this.bz) {
                  this.a($$0, $$1);
               }

               this.fy();
            }
         }
      }
   }

   public cuo fu() {
      return this.bz;
   }

   public int fv() {
      return this.bA;
   }

   public int fw() {
      return this.fs() ? this.bz.a(this) - this.fv() : 0;
   }

   public void fx() {
      if (!this.bz.e()) {
         this.bz.a(this.dQ(), this, this.fv());
         if (this.bz.v()) {
            this.H();
         }
      }

      this.fy();
   }

   public void fy() {
      if (!this.dQ().B) {
         boolean $$0 = this.fs();
         this.c(1, false);
         if ($$0) {
            this.a(dxw.C);
         }
      }

      this.bz = cuo.l;
      this.bA = 0;
   }

   public boolean fz() {
      if (this.fs() && !this.bz.e()) {
         cuj $$0 = this.bz.g();
         return $$0.b(this.bz) != cwm.d ? false : $$0.a(this.bz, this) - this.bA >= 5;
      } else {
         return false;
      }
   }

   public boolean fA() {
      return this.bW();
   }

   public boolean fB() {
      return this.i(7);
   }

   @Override
   public boolean ce() {
      return super.ce() || !this.fB() && this.c(bty.b);
   }

   public int fC() {
      return this.bB;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dv();
      double $$5 = this.dx();
      double $$6 = this.dB();
      double $$7 = $$1;
      boolean $$8 = false;
      jd $$9 = jd.a($$0, $$1, $$2);
      dcu $$10 = this.dQ();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.I_()) {
            jd $$12 = $$9.d();
            dta $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cL())) {
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

         if (this instanceof btu $$14) {
            $$14.J().n();
         }

         return true;
      }
   }

   public boolean fD() {
      return !this.ey();
   }

   public boolean fE() {
      return true;
   }

   public void a(jd $$0, boolean $$1) {
   }

   public boolean f(cuo $$0) {
      return false;
   }

   @Override
   public final bst a(bty $$0) {
      return $$0 == bty.c ? aF : this.e($$0).a(this.ec());
   }

   protected bst e(bty $$0) {
      return this.am().n().a(this.eb());
   }

   public ImmutableList<bty> fF() {
      return ImmutableList.of(bty.a);
   }

   public ewr f(bty $$0) {
      bst $$1 = this.a($$0);
      return new ewr((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bty $$0) {
      ewr $$1 = this.a($$0).a(this.do());
      return this.dQ().b(this, $$1);
   }

   @Override
   public boolean cx() {
      return super.cx() && !this.fI();
   }

   public Optional<jd> fG() {
      return this.ao.a(bR);
   }

   public void f(jd $$0) {
      this.ao.a(bR, Optional.of($$0));
   }

   public void fH() {
      this.ao.a(bR, Optional.empty());
   }

   public boolean fI() {
      return this.fG().isPresent();
   }

   public void b(jd $$0) {
      if (this.bS()) {
         this.ad();
      }

      dta $$1 = this.dQ().a_($$0);
      if ($$1.b() instanceof dfp) {
         this.dQ().a($$0, $$1.a(dfp.c, Boolean.valueOf(true)), 3);
      }

      this.b(bty.c);
      this.a($$0);
      this.f($$0);
      this.i(eww.b);
      this.av = true;
   }

   private void a(jd $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean L() {
      return this.fG().map($$0 -> this.dQ().a_($$0).b() instanceof dfp).orElse(false);
   }

   public void fJ() {
      this.fG().filter(this.dQ()::B).ifPresent($$0x -> {
         dta $$1 = this.dQ().a_($$0x);
         if ($$1.b() instanceof dfp) {
            ji $$2 = $$1.c(dfp.aE);
            this.dQ().a($$0x, $$1.a(dfp.c, Boolean.valueOf(false)), 3);
            eww $$3 = dfp.a(this.am(), this.dQ(), $$0x, $$2, this.dG()).orElseGet(() -> {
               jd $$1x = $$0x.c();
               return new eww((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            eww $$4 = eww.c($$0x).d($$3).d();
            float $$5 = (float)ayn.d(ayn.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.s($$5);
            this.t(0.0F);
         }
      });
      eww $$0 = this.do();
      this.b(bty.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fH();
   }

   @Nullable
   public ji fK() {
      jd $$0 = this.fG().orElse(null);
      return $$0 != null ? dfp.a(this.dQ(), $$0) : null;
   }

   @Override
   public boolean bF() {
      return !this.fI() && super.bF();
   }

   public cuo g(cuo $$0) {
      return cuo.l;
   }

   public final cuo a(dcu $$0, cuo $$1) {
      cpp $$2 = $$1.a(kq.v);
      return $$2 != null ? this.a($$0, $$1, $$2) : $$1;
   }

   public cuo a(dcu $$0, cuo $$1, cpp $$2) {
      $$0.a(null, this.dv(), this.dx(), this.dB(), this.d($$1), avp.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
      this.a($$2);
      $$1.a(1, this);
      this.a(dxw.m);
      return $$1;
   }

   private void a(cpp $$0) {
      if (!this.dQ().x_()) {
         for (cpp.b $$2 : $$0.g()) {
            if (this.ah.i() < $$2.b()) {
               this.b($$2.a());
            }
         }
      }
   }

   private static byte g(bsx $$0) {
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

   public void a(cuj $$0, bsx $$1) {
      this.dQ().a(this, g($$1));
   }

   public static bsx d(bqp $$0) {
      return $$0 == bqp.a ? bsx.a : bsx.b;
   }

   @Override
   public ewr h_() {
      if (this.a(bsx.f).a(cur.uq)) {
         float $$0 = 0.5F;
         return this.cL().c(0.5, 0.5, 0.5);
      } else {
         return super.h_();
      }
   }

   public bsx h(cuo $$0) {
      ctq $$1 = ctq.c_($$0);
      if ($$1 != null) {
         bsx $$2 = $$1.m();
         if (this.d($$2)) {
            return $$2;
         }
      }

      return bsx.a;
   }

   private static bue a(btl $$0, bsx $$1) {
      return $$1 != bsx.f && $$1 != bsx.a && $$1 != bsx.b ? bue.a($$0, $$1, $$2 -> $$2.e() || $$0.h($$2) == $$1) : bue.a($$0, $$1);
   }

   @Nullable
   private static bsx r(int $$0) {
      if ($$0 == 100 + bsx.f.b()) {
         return bsx.f;
      } else if ($$0 == 100 + bsx.e.b()) {
         return bsx.e;
      } else if ($$0 == 100 + bsx.d.b()) {
         return bsx.d;
      } else if ($$0 == 100 + bsx.c.b()) {
         return bsx.c;
      } else if ($$0 == 98) {
         return bsx.a;
      } else if ($$0 == 99) {
         return bsx.b;
      } else {
         return $$0 == 105 ? bsx.g : null;
      }
   }

   @Override
   public bue a_(int $$0) {
      bsx $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dE() {
      if (this.N_()) {
         return false;
      } else {
         boolean $$0 = !this.a(bsx.f).a(awm.aZ) && !this.a(bsx.e).a(awm.aZ) && !this.a(bsx.d).a(awm.aZ) && !this.a(bsx.c).a(awm.aZ) && !this.a(bsx.g).a(awm.aZ);
         return $$0 && super.dE();
      }
   }

   @Override
   public boolean ch() {
      return !this.dQ().x_() && this.b(bsa.x) || super.ch();
   }

   @Override
   public float dH() {
      return this.aY;
   }

   @Override
   public void a(abu $$0) {
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

   public boolean fL() {
      return this.eU().g() instanceof csi;
   }

   @Override
   public float dK() {
      float $$0 = (float)this.g(buu.B);
      return this.cR() instanceof cmv ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public eww m(bsq $$0) {
      return this.do().e(this.a($$0, this.a(this.at()), this.ec() * this.eb()));
   }

   protected void a(int $$0, double $$1) {
      this.ba = (float)ayn.e(1.0 / (double)$$0, (double)this.ba, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(ayn.c((double)$$0 * this.g(buu.h)));
   }

   public boolean fM() {
      return false;
   }

   @Override
   public boolean b(brj $$0) {
      if (super.b($$0)) {
         return true;
      } else {
         if (this.dQ() instanceof aqt $$1 && dac.a($$1, this, $$0)) {
            return true;
         }

         return false;
      }
   }

   public static record a(avn a, avn b) {
   }
}

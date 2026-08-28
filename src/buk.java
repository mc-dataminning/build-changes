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
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
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
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class buk extends bto implements btk {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final alc d = alc.b("powder_snow");
   private static final alc e = alc.b("sprinting");
   private static final bvp bD = new bvp(e, 0.3F, bvp.a.c);
   public static final int i = 2;
   public static final int j = 4;
   public static final int k = 98;
   public static final int l = 100;
   public static final int m = 105;
   public static final int n = 6;
   public static final int o = 100;
   private static final int bE = 40;
   public static final double p = 0.003;
   public static final double q = 0.08;
   public static final int r = 20;
   private static final int bF = 10;
   private static final int bG = 2;
   public static final float s = 0.42F;
   private static final double bH = 128.0;
   protected static final int t = 1;
   protected static final int u = 2;
   protected static final int v = 4;
   protected static final akg<Byte> az = akk.a(buk.class, aki.a);
   private static final akg<Float> bI = akk.a(buk.class, aki.d);
   private static final akg<List<ll>> bJ = akk.a(buk.class, aki.m);
   private static final akg<Boolean> bK = akk.a(buk.class, aki.k);
   private static final akg<Integer> bL = akk.a(buk.class, aki.b);
   private static final akg<Integer> bM = akk.a(buk.class, aki.b);
   private static final akg<Optional<je>> bN = akk.a(buk.class, aki.p);
   private static final int bO = 15;
   protected static final btr aA = btr.c(0.2F, 0.2F).b(0.2F);
   public static final float aB = 0.5F;
   public static final float aC = 0.5F;
   public static final String aD = "attributes";
   private final bvo bP;
   private final bsd bQ = new bsd(this);
   private final Map<jn<bst>, bsv> bR = Maps.newHashMap();
   private final jw<cvp> bS = jw.a(2, cvp.k);
   private final jw<cvp> bT = jw.a(4, cvp.k);
   private cvp bU = cvp.k;
   public boolean aE;
   private boolean bV = false;
   public bro aF;
   public int aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public float aM;
   public float aN;
   protected int aO;
   public final bvk aP = new bvk();
   public final int aQ = 20;
   public final float aR;
   public final float aS;
   public float aT;
   public float aU;
   public float aV;
   public float aW;
   public final btn aX = new btn(this);
   @Nullable
   protected cnu aY;
   protected int aZ;
   protected boolean ba;
   protected int bb;
   protected float bc;
   protected float bd;
   protected float be;
   protected float bf;
   protected float bg;
   protected int bh;
   protected float bi;
   protected boolean bj;
   public float bk;
   public float bl;
   public float bm;
   protected int bn;
   protected double bo;
   protected double bp;
   protected double bq;
   protected double br;
   protected double bs;
   protected double bt;
   protected int bu;
   private boolean bW = true;
   @Nullable
   private buk bX;
   private int bY;
   @Nullable
   private buk bZ;
   private int ca;
   private float cb;
   private int cc;
   private float cd;
   protected cvp bv = cvp.k;
   protected int bw;
   protected int bx;
   private je ce;
   private Optional<je> cf = Optional.empty();
   @Nullable
   private bsg cg;
   private long ch;
   protected int by;
   protected float bz;
   @Nullable
   protected cvp bA;
   private float ci;
   private float cj;
   protected bvl<?> bB;
   private boolean ck;
   private final EnumMap<btw, Reference2ObjectMap<dbk, Set<dcc>>> cl = new EnumMap<>(btw.class);
   protected float bC = 1.0F;

   protected buk(btv<? extends buk> $$0, deg $$1) {
      super($$0, $$1);
      this.bP = new bvo(bvs.a($$0));
      this.x(this.eQ());
      this.J = true;
      this.aS = (float)((Math.random() + 1.0) * 0.01F);
      this.ax();
      this.aR = (float)Math.random() * 12398.0F;
      this.v((float)(Math.random() * (float) (Math.PI * 2)));
      this.aV = this.dI();
      ut $$2 = ut.a;
      this.bB = this.a(new Dynamic($$2, (vc)$$2.createMap(ImmutableMap.of($$2.a("memories"), (vc)$$2.emptyMap()))));
   }

   public bvl<?> dX() {
      return this.bB;
   }

   protected bvl.b<?> dY() {
      return bvl.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bvl<?> a(Dynamic<?> $$0) {
      return this.dY().a($$0);
   }

   @Override
   public void ar() {
      this.a(this.dT().y(), Float.MAX_VALUE);
   }

   public boolean a(btv<?> $$0) {
      return true;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(az, (byte)0);
      $$0.a(bJ, List.of());
      $$0.a(bK, false);
      $$0.a(bL, 0);
      $$0.a(bM, 0);
      $$0.a(bI, 1.0F);
      $$0.a(bN, Optional.empty());
   }

   public static bvq.a dZ() {
      return bvq.a()
         .a(bvr.s)
         .a(bvr.p)
         .a(bvr.v)
         .a(bvr.a)
         .a(bvr.b)
         .a(bvr.r)
         .a(bvr.B)
         .a(bvr.y)
         .a(bvr.n)
         .a(bvr.x)
         .a(bvr.k)
         .a(bvr.o)
         .a(bvr.w)
         .a(bvr.h)
         .a(bvr.i)
         .a(bvr.F)
         .a(bvr.u)
         .a(bvr.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, duo $$2, je $$3) {
      if (!this.bi()) {
         this.bq();
      }

      if (this.dS() instanceof arh $$4 && $$1 && this.aa > 0.0F) {
         this.b($$4, $$3);
         double $$5 = this.h(bvr.x);
         if ((double)this.aa > $$5 && !$$2.l()) {
            double $$6 = this.dx();
            double $$7 = this.dz();
            double $$8 = this.dD();
            je $$9 = this.ds();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            float $$13 = (float)azd.c((double)this.aa - $$5);
            double $$14 = Math.min((double)(0.2F + $$13 / 15.0F), 2.5);
            int $$15 = (int)(150.0 * $$14);
            ((arh)this.dS()).a(new lf(ln.b, $$2), $$6, $$7, $$8, $$15, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cf = Optional.empty();
      }
   }

   public final boolean ea() {
      return this.ao().a(awx.m);
   }

   public float a(float $$0) {
      return azd.h($$0, this.cj, this.ci);
   }

   public boolean eb() {
      return this.dv().b() < 1.0E-5F && this.bm();
   }

   @Override
   public void ay() {
      this.aM = this.aN;
      if (this.al) {
         this.fK().ifPresent(this::a);
      }

      if (this.dS() instanceof arh $$0) {
         dbm.b($$0, this);
      }

      super.ay();
      this.dS().ah().a("livingEntityBaseTick");
      if (this.bh() || this.dS().B) {
         this.aF();
      }

      if (this.bI()) {
         boolean $$1 = this instanceof cnu;
         if (!this.dS().B) {
            if (this.bJ()) {
               this.a(this.dT().g(), 1.0F);
            } else if ($$1 && !this.dS().A_().a(this.cO())) {
               double $$2 = this.dS().A_().a(this) + this.dS().A_().n();
               if ($$2 < 0.0) {
                  double $$3 = this.dS().A_().o();
                  if ($$3 > 0.0) {
                     this.a(this.dT().x(), (float)Math.max(1, azd.a(-$$2 * $$3)));
                  }
               }
            }
         }

         if (this.a(awz.a) && !this.dS().a_(je.a(this.dx(), this.dB(), this.dD())).a(dhl.nd)) {
            boolean $$4 = !this.ea() && !bsw.c(this) && (!$$1 || !((cnu)this).gd().a);
            if ($$4) {
               this.j(this.m(this.cq()));
               if (this.cq() == -20) {
                  this.j(0);
                  eys $$5 = this.dv();

                  for (int $$6 = 0; $$6 < 8; $$6++) {
                     double $$7 = this.af.j() - this.af.j();
                     double $$8 = this.af.j() - this.af.j();
                     double $$9 = this.af.j() - this.af.j();
                     this.dS().a(ln.d, this.dx() + $$7, this.dz() + $$8, this.dD() + $$9, $$5.d, $$5.e, $$5.f);
                  }

                  this.a(this.dT().i(), 2.0F);
               }
            }

            if (!this.dS().B && this.bW() && this.dg() != null && this.dg().bY()) {
               this.af();
            }
         } else if (this.cq() < this.cp()) {
            this.j(this.n(this.cq()));
         }

         if (this.dS() instanceof arh $$10) {
            je $$11 = this.ds();
            if (!Objects.equal(this.ce, $$11)) {
               this.ce = $$11;
               this.b($$10, $$11);
            }
         }
      }

      if (this.bI() && (this.bk() || this.aw)) {
         this.aL();
      }

      if (this.aJ > 0) {
         this.aJ--;
      }

      if (this.ak > 0 && !(this instanceof ari)) {
         this.ak--;
      }

      if (this.eB() && this.dS().h(this)) {
         this.eh();
      }

      if (this.aZ > 0) {
         this.aZ--;
      } else {
         this.aY = null;
      }

      if (this.bZ != null && !this.bZ.bI()) {
         this.bZ = null;
      }

      if (this.bX != null) {
         if (!this.bX.bI()) {
            this.a(null);
         } else if (this.ag - this.bY > 100) {
            this.a(null);
         }
      }

      this.es();
      this.bf = this.be;
      this.aU = this.aT;
      this.aW = this.aV;
      this.O = this.dI();
      this.P = this.dK();
      this.dS().ah().c();
   }

   @Override
   protected float aR() {
      return azd.h((float)this.h(bvr.u), super.aR(), 1.0F);
   }

   protected void ec() {
      bvn $$0 = this.g(bvr.v);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.c(d);
         }
      }
   }

   protected void ed() {
      if (!this.bs().l()) {
         int $$0 = this.cr();
         if ($$0 > 0) {
            bvn $$1 = this.g(bvr.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cs();
            $$1.b(new bvp(d, (double)$$2, bvp.a.a));
         }
      }
   }

   protected void b(arh $$0, je $$1) {
      dbm.a($$0, this);
   }

   public boolean o_() {
      return false;
   }

   public float ee() {
      return this.o_() ? 0.5F : 1.0F;
   }

   public final float ef() {
      bvo $$0 = this.eV();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bvr.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean eg() {
      return true;
   }

   protected void eh() {
      this.aL++;
      if (this.aL >= 20 && !this.dS().w_() && !this.dN()) {
         this.dS().a(this, (byte)60);
         this.a(bto.c.a);
      }
   }

   public boolean ei() {
      return !this.o_();
   }

   protected boolean ej() {
      return !this.o_();
   }

   protected int m(int $$0) {
      bvn $$1 = this.g(bvr.w);
      double $$2;
      if ($$1 != null) {
         $$2 = $$1.g();
      } else {
         $$2 = 0.0;
      }

      return $$2 > 0.0 && this.af.j() >= 1.0 / ($$2 + 1.0) ? $$0 : $$0 - 1;
   }

   protected int n(int $$0) {
      return Math.min($$0 + 4, this.cp());
   }

   public final int a(arh $$0, @Nullable bto $$1) {
      return dbm.a($$0, $$1, this, this.ek());
   }

   protected int ek() {
      return 0;
   }

   protected boolean el() {
      return false;
   }

   @Nullable
   public buk em() {
      return this.bX;
   }

   @Override
   public buk X_() {
      return this.em();
   }

   public int en() {
      return this.bY;
   }

   public void c(@Nullable cnu $$0) {
      this.aY = $$0;
      this.aZ = this.ag;
   }

   public void a(@Nullable buk $$0) {
      this.bX = $$0;
      this.bY = this.ag;
   }

   @Nullable
   public buk eo() {
      return this.bZ;
   }

   public int ep() {
      return this.ca;
   }

   public void B(bto $$0) {
      if ($$0 instanceof buk) {
         this.bZ = (buk)$$0;
      } else {
         this.bZ = null;
      }

      this.ca = this.ag;
   }

   public int eq() {
      return this.bb;
   }

   public void o(int $$0) {
      this.bb = $$0;
   }

   public boolean er() {
      return this.bV;
   }

   public void r(boolean $$0) {
      this.bV = $$0;
   }

   protected boolean b(btw $$0) {
      return true;
   }

   public void a(btw $$0, cvp $$1, cvp $$2) {
      boolean $$3 = $$2.f() && $$1.f();
      if (!$$3 && !cvp.c($$1, $$2) && !this.al) {
         cus $$4 = cus.c_($$2);
         if (!this.dS().w_() && !this.P_()) {
            if (!this.ba() && $$4 != null && $$4.l() == $$0) {
               this.dS().a(null, this.dx(), this.dz(), this.dD(), $$4.m(), this.di(), 1.0F, 1.0F, this.af.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? dzl.v : dzl.S);
            }
         }
      }
   }

   @Override
   public void a(bto.c $$0) {
      if ($$0 == bto.c.a || $$0 == bto.c.b) {
         this.c($$0);
      }

      super.a($$0);
      this.bB.a();
   }

   protected void c(bto.c $$0) {
      for (bsv $$1 : this.ex()) {
         $$1.a(this, $$0);
      }

      this.bR.clear();
   }

   @Override
   public void b(uf $$0) {
      $$0.a("Health", this.eA());
      $$0.a("HurtTime", (short)this.aJ);
      $$0.a("HurtByTimestamp", this.bY);
      $$0.a("DeathTime", (short)this.aL);
      $$0.a("AbsorptionAmount", this.fs());
      $$0.a("attributes", this.eV().d());
      if (!this.bR.isEmpty()) {
         ul $$1 = new ul();

         for (bsv $$2 : this.bR.values()) {
            $$1.add($$2.j());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fF());
      this.fK().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<vc> $$3 = this.bB.a(ut.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(uf $$0) {
      this.F($$0.j("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dS() != null && !this.dS().B) {
         this.eV().a($$0.c("attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         ul $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            uf $$3 = $$1.a($$2);
            bsv $$4 = bsv.a($$3);
            if ($$4 != null) {
               this.bR.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.x($$0.j("Health"));
      }

      this.aJ = $$0.g("HurtTime");
      this.aL = $$0.g("DeathTime");
      this.bY = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         ezx $$6 = this.dS().O();
         ezs $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cE(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         je $$9 = new je($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$9);
         this.am.a(ar, buw.c);
         if (!this.al) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bB = this.a(new Dynamic(ut.a, $$0.c("Brain")));
      }
   }

   protected void es() {
      Iterator<jn<bst>> $$0 = this.bR.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jn<bst> $$1 = $$0.next();
            bsv $$2 = this.bR.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dS().B) {
                  $$0.remove();
                  this.c(List.of($$2));
               }
            } else if ($$2.d() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var6) {
      }

      if (this.bW) {
         if (!this.dS().B) {
            this.L();
            this.w();
         }

         this.bW = false;
      }

      List<ll> $$3 = this.am.a(bJ);
      if (!$$3.isEmpty()) {
         boolean $$4 = this.am.a(bK);
         int $$5 = this.cm() ? 15 : 4;
         int $$6 = $$4 ? 5 : 1;
         if (this.af.a($$5 * $$6) == 0) {
            this.dS().a(ad.a($$3, this.af), this.d(0.5), this.dA(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void L() {
      if (this.bR.isEmpty()) {
         this.ev();
         this.k(false);
      } else {
         this.k(this.b(bsx.n));
         this.q();
      }
   }

   private void q() {
      List<ll> $$0 = this.bR.values().stream().filter(bsv::g).map(bsv::a).toList();
      this.am.a(bJ, $$0);
      this.am.a(bK, d(this.bR.values()));
   }

   private void w() {
      boolean $$0 = this.cl();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable bto $$0) {
      double $$1 = 1.0;
      if (this.cd()) {
         $$1 *= 0.8;
      }

      if (this.cm()) {
         float $$2 = this.fc();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cvp $$3 = this.a(btw.f);
         btv<?> $$4 = $$0.ao();
         if ($$4 == btv.aN && $$3.a(cvt.un)
            || $$4 == btv.bu && $$3.a(cvt.uq)
            || $$4 == btv.aA && $$3.a(cvt.ut)
            || $$4 == btv.aB && $$3.a(cvt.ut)
            || $$4 == btv.x && $$3.a(cvt.ur)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(buk $$0) {
      return $$0 instanceof cnu && this.dS().am() == brm.a ? false : $$0.et();
   }

   public boolean a(buk $$0, cfa $$1) {
      return $$1.a(this, $$0);
   }

   public boolean et() {
      return !this.cz() && this.eu();
   }

   public boolean eu() {
      return !this.P_() && this.bI();
   }

   public static boolean d(Collection<bsv> $$0) {
      for (bsv $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void ev() {
      this.am.a(bJ, List.of());
   }

   public boolean ew() {
      if (this.dS().B) {
         return false;
      } else if (this.bR.isEmpty()) {
         return false;
      } else {
         Map<jn<bst>, bsv> $$0 = Maps.newHashMap(this.bR);
         this.bR.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<bsv> ex() {
      return this.bR.values();
   }

   public Map<jn<bst>, bsv> ey() {
      return this.bR;
   }

   public boolean b(jn<bst> $$0) {
      return this.bR.containsKey($$0);
   }

   @Nullable
   public bsv c(jn<bst> $$0) {
      return this.bR.get($$0);
   }

   public final boolean a(bsv $$0) {
      return this.b($$0, null);
   }

   public boolean b(bsv $$0, @Nullable bto $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         bsv $$2 = this.bR.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bR.put($$0.c(), $$0);
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

   public boolean b(bsv $$0) {
      if (this.ao().a(awx.G)) {
         return !$$0.a(bsx.M);
      } else if (this.ao().a(awx.F)) {
         return !$$0.a(bsx.L);
      } else {
         return !this.ao().a(awx.w) ? true : !$$0.a(bsx.j) && !$$0.a(bsx.s);
      }
   }

   public void c(bsv $$0, @Nullable bto $$1) {
      if (this.b($$0)) {
         bsv $$2 = this.bR.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean ez() {
      return this.ao().a(awx.x);
   }

   @Nullable
   public bsv d(jn<bst> $$0) {
      return this.bR.remove($$0);
   }

   public boolean e(jn<bst> $$0) {
      bsv $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(bsv $$0, @Nullable bto $$1) {
      this.bW = true;
      if (!this.dS().B) {
         $$0.c().a().a(this.eV(), $$0.e());
         this.c($$0);
      }
   }

   public void c(bsv $$0) {
      for (bto $$1 : this.cW()) {
         if ($$1 instanceof ari $$2) {
            $$2.c.b(new agj(this.ap(), $$0, false));
         }
      }
   }

   protected void a(bsv $$0, boolean $$1, @Nullable bto $$2) {
      this.bW = true;
      if ($$1 && !this.dS().B) {
         bst $$3 = $$0.c().a();
         $$3.a(this.eV());
         $$3.a(this.eV(), $$0.e());
         this.D();
      }

      if (!this.dS().B) {
         this.c($$0);
      }
   }

   protected void c(Collection<bsv> $$0) {
      this.bW = true;
      if (!this.dS().B) {
         for (bsv $$1 : $$0) {
            $$1.c().a().a(this.eV());

            for (bto $$2 : this.cW()) {
               if ($$2 instanceof ari $$3) {
                  $$3.c.b(new aem(this.ap(), $$1.c()));
               }
            }
         }

         this.D();
      }
   }

   private void D() {
      Set<bvn> $$0 = this.eV().b();

      for (bvn $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jn<bvm> $$0) {
      if ($$0.a(bvr.s)) {
         float $$1 = this.eQ();
         if (this.eA() > $$1) {
            this.x($$1);
         }
      } else if ($$0.a(bvr.r)) {
         float $$2 = this.eR();
         if (this.fs() > $$2) {
            this.E($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.eA();
      if ($$1 > 0.0F) {
         this.x($$1 + $$0);
      }
   }

   public float eA() {
      return this.am.a(bI);
   }

   public void x(float $$0) {
      this.am.a(bI, azd.a($$0, 0.0F, this.eQ()));
   }

   public boolean eB() {
      return this.eA() <= 0.0F;
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dS().B) {
         return false;
      } else if (this.eB()) {
         return false;
      } else if ($$0.a(awv.i) && this.b(bsx.l)) {
         return false;
      } else {
         if (this.fM() && !this.dS().B) {
            this.fN();
         }

         this.bb = 0;
         if ($$1 < 0.0F) {
            $$1 = 0.0F;
         }

         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.z($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(awv.j) && $$0.c() instanceof buk $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(awv.o) && this.ao().a(awx.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(awv.a) && !this.a(btw.f).f()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aP.a(1.5F);
         if (Float.isNaN($$1) || Float.isInfinite($$1)) {
            $$1 = Float.MAX_VALUE;
         }

         boolean $$7 = true;
         if ((float)this.ak > 10.0F && !$$0.a(awv.e)) {
            if ($$1 <= this.bi) {
               return false;
            }

            this.f($$0, $$1 - this.bi);
            this.bi = $$1;
            $$7 = false;
         } else {
            this.bi = $$1;
            this.ak = 20;
            this.f($$0, $$1);
            this.aK = 10;
            this.aJ = this.aK;
         }

         bto $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof buk $$9 && !$$0.a(awv.q) && (!$$0.a(bsj.I) || !this.ao().a(awx.E))) {
               this.a($$9);
            }

            if ($$8 instanceof cnu $$10) {
               this.aZ = 100;
               this.aY = $$10;
            } else if ($$8 instanceof chd $$11 && $$11.q()) {
               this.aZ = 100;
               if ($$11.R_() instanceof cnu $$12) {
                  this.aY = $$12;
               } else {
                  this.aY = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dS().a(this, (byte)29);
            } else {
               this.dS().a(this, $$0);
            }

            if (!$$0.a(awv.r) && (!$$3 || $$1 > 0.0F)) {
               this.bA();
            }

            if (!$$0.a(awv.z)) {
               double $$13 = 0.0;
               double $$14 = 0.0;
               if ($$0.c() instanceof coo $$15) {
                  DoubleDoubleImmutablePair $$16 = $$15.a_(this, $$0);
                  $$13 = -$$16.leftDouble();
                  $$14 = -$$16.rightDouble();
               } else if ($$0.i() != null) {
                  $$13 = $$0.i().a() - this.dx();
                  $$14 = $$0.i().c() - this.dD();
               }

               this.p(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.eB()) {
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
            this.cg = $$0;
            this.ch = this.dS().aa();

            for (bsv $$18 : this.ex()) {
               $$18.a(this, $$0, $$1);
            }
         }

         if (this instanceof ari) {
            an.i.a((ari)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((ari)this).a(awo.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof ari) {
            an.h.a((ari)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$17;
      }
   }

   protected void d(buk $$0) {
      $$0.e(this);
   }

   protected void e(buk $$0) {
      $$0.p(0.5, $$0.dx() - this.dx(), $$0.dD() - this.dD());
   }

   private boolean g(bsg $$0) {
      if ($$0.a(awv.d)) {
         return false;
      } else {
         cvp $$1 = null;

         for (bro $$2 : bro.values()) {
            cvp $$3 = this.b($$2);
            if ($$3.a(cvt.vv)) {
               $$1 = $$3.u();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof ari $$4) {
               $$4.b(awo.c.b(cvt.vv));
               an.C.a($$4, $$1);
               this.a(dzl.C);
            }

            this.x(1.0F);
            this.ew();
            this.a(new bsv(bsx.j, 900, 1));
            this.a(new bsv(bsx.v, 100, 1));
            this.a(new bsv(bsx.l, 800, 0));
            this.dS().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bsg eC() {
      if (this.dS().aa() - this.ch > 40L) {
         this.cg = null;
      }

      return this.cg;
   }

   protected void e(bsg $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable awd $$0) {
      if ($$0 != null) {
         this.a($$0, this.fd(), this.fe());
      }
   }

   public boolean f(bsg $$0) {
      bto $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cob $$3 && $$3.A() > 0) {
         $$2 = true;
      }

      if (!$$0.a(awv.c) && this.fC() && !$$2) {
         eys $$4 = $$0.i();
         if ($$4 != null) {
            eys $$5 = this.c(0.0F, this.cx());
            eys $$6 = $$4.a(this.dq());
            $$6 = new eys($$6.d, 0.0, $$6.f).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void h(cvp $$0) {
      if (!$$0.f()) {
         if (!this.ba()) {
            this.dS().a(this.dx(), this.dz(), this.dD(), $$0.K(), this.di(), 0.8F, 0.8F + this.dS().z.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(bsg $$0) {
      if (!this.dN() && !this.ba) {
         bto $$1 = $$0.d();
         buk $$2 = this.eP();
         if (this.bh >= 0 && $$2 != null) {
            $$2.a(this, this.bh, $$0);
         }

         if (this.fM()) {
            this.fN();
         }

         if (!this.dS().B && this.ak()) {
            b.info("Named entity {} died: {}", this, this.eO().a().getString());
         }

         this.ba = true;
         this.eO().c();
         if (this.dS() instanceof arh $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dzl.p);
               this.a($$3, $$0);
               this.f($$2);
            }

            this.dS().a(this, (byte)3);
         }

         this.b(buw.h);
      }
   }

   protected void f(@Nullable buk $$0) {
      if (!this.dS().B) {
         boolean $$1 = false;
         if ($$0 instanceof cjr) {
            if (this.dS().ac().b(dec.c)) {
               je $$2 = this.ds();
               duo $$3 = dhl.cd.o();
               if (this.dS().a_($$2).l() && $$3.a((dej)this.dS(), $$2)) {
                  this.dS().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               cke $$4 = new cke(this.dS(), this.dx(), this.dz(), this.dD(), new cvp(cvt.dw));
               this.dS().b($$4);
            }
         }
      }
   }

   protected void a(arh $$0, bsg $$1) {
      boolean $$2 = this.aZ > 0;
      if (this.ej() && $$0.ac().b(dec.f)) {
         this.a($$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.eD();
      this.D($$1.d());
   }

   protected void eD() {
   }

   protected void D(@Nullable bto $$0) {
      if (this.dS() instanceof arh $$1 && !this.eH() && (this.el() || this.aZ > 0 && this.ei() && this.dS().ac().b(dec.f))) {
         bua.a($$1, this.dq(), this.a($$1, $$0));
      }
   }

   protected void a(arh $$0, bsg $$1, boolean $$2) {
   }

   public alb<etm> eE() {
      return this.ao().k();
   }

   public long eF() {
      return 0L;
   }

   protected float a(bto $$0, bsg $$1) {
      float $$2 = (float)this.h(bvr.d);
      return this.dS() instanceof arh $$3 ? dbm.d($$3, this.dW(), $$0, $$1, $$2) : $$2;
   }

   protected void a(bsg $$0, boolean $$1) {
      alb<etm> $$2 = this.eE();
      etm $$3 = this.dS().o().bd().b($$2);
      etk.a $$4 = new etk.a((arh)this.dS()).a(ewd.a, this).a(ewd.f, this.dq()).a(ewd.c, $$0).b(ewd.d, $$0.d()).b(ewd.e, $$0.c());
      if ($$1 && this.aY != null) {
         $$4 = $$4.a(ewd.b, this.aY).a(this.aY.gy());
      }

      etk $$5 = $$4.a(ewc.g);
      $$3.a($$5, this.eF(), this::b);
   }

   protected void a(alb<etm> $$0, Consumer<cvp> $$1) {
      if (this.dS() instanceof arh $$2) {
         etm $$3 = $$2.o().bd().b($$0);
         etk $$4 = new etk.a($$2).a(ewd.f, this.dq()).a(ewd.a, this).a(ewc.s);
         ObjectListIterator var6 = $$3.a($$4).iterator();

         while (var6.hasNext()) {
            cvp $$5 = (cvp)var6.next();
            $$1.accept($$5);
         }
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(bvr.p);
      if (!($$0 <= 0.0)) {
         this.as = true;
         eys $$3 = this.dv();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         eys $$4 = new eys($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aH() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected awd d(bsg $$0) {
      return awe.kh;
   }

   @Nullable
   protected awd n_() {
      return awe.kc;
   }

   private awd r(int $$0) {
      return $$0 > 4 ? this.eK().b() : this.eK().a();
   }

   public void eG() {
      this.ck = true;
   }

   public boolean eH() {
      return this.ck;
   }

   public float eI() {
      return 0.0F;
   }

   protected eyn eJ() {
      eyn $$0 = this.cO();
      bto $$1 = this.dg();
      if ($$1 != null) {
         eys $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dbk, Set<dcc>> c(btw $$0) {
      return (Map<dbk, Set<dcc>>)this.cl.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public buk.a eK() {
      return new buk.a(awe.ki, awe.ka);
   }

   public Optional<je> eL() {
      return this.cf;
   }

   public boolean p_() {
      if (this.P_()) {
         return false;
      } else {
         je $$0 = this.ds();
         duo $$1 = this.dt();
         if ($$1.a(awt.aQ)) {
            this.cf = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dpx && this.c($$0, $$1)) {
            this.cf = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(je $$0, duo $$1) {
      if (!$$1.c(dpx.b)) {
         return false;
      } else {
         duo $$2 = this.dS().a_($$0.e());
         return $$2.a(dhl.cO) && $$2.c(dlp.b) == $$1.c(dpx.aF);
      }
   }

   @Override
   public boolean bI() {
      return !this.dN() && this.eA() > 0.0F;
   }

   @Override
   public int cB() {
      return this.y(0.0F);
   }

   protected final int y(float $$0) {
      return azd.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bsg $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.e($$0, $$1);
      if ($$4 > 0) {
         this.a(this.r($$4), 1.0F, 1.0F);
         this.eM();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int e(float $$0, float $$1) {
      if (this.ao().a(awx.o)) {
         return 0;
      } else {
         float $$2 = (float)this.h(bvr.x);
         float $$3 = $$0 - $$2;
         return azd.c((double)($$3 * $$1) * this.h(bvr.k));
      }
   }

   protected void eM() {
      if (!this.ba()) {
         int $$0 = azd.a(this.dx());
         int $$1 = azd.a(this.dz() - 0.2F);
         int $$2 = azd.a(this.dD());
         duo $$3 = this.dS().a_(new je($$0, $$1, $$2));
         if (!$$3.l()) {
            dox $$4 = $$3.A();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void p(float $$0) {
      this.aK = 10;
      this.aJ = this.aK;
   }

   public int eN() {
      return azd.a(this.h(bvr.a));
   }

   protected void b(bsg $$0, float $$1) {
   }

   protected void c(bsg $$0, float $$1) {
   }

   protected void z(float $$0) {
   }

   protected void a(bsg $$0, float $$1, btw... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (btw $$4 : $$2) {
            cvp $$5 = this.a($$4);
            if ($$5.h() instanceof cti && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float d(bsg $$0, float $$1) {
      if (!$$0.a(awv.b)) {
         this.b($$0, $$1);
         $$1 = bsc.a(this, $$1, $$0, (float)this.eN(), (float)this.h(bvr.b));
      }

      return $$1;
   }

   protected float e(bsg $$0, float $$1) {
      if ($$0.a(awv.f)) {
         return $$1;
      } else {
         if (this.b(bsx.k) && !$$0.a(awv.g)) {
            int $$2 = (this.c(bsx.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof ari) {
                  ((ari)this).a(awo.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof ari) {
                  ((ari)$$0.d()).a(awo.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(awv.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dS() instanceof arh $$7) {
               $$8 = dbm.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bsc.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void f(bsg $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fs(), 0.0F);
         this.E(this.fs() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof ari $$4) {
            $$4.a(awo.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eO().a($$0, var9);
            this.x(this.eA() - var9);
            this.E(this.fs() - var9);
            this.a(dzl.o);
         }
      }
   }

   public bsd eO() {
      return this.bQ;
   }

   @Nullable
   public buk eP() {
      if (this.aY != null) {
         return this.aY;
      } else {
         return this.bX != null ? this.bX : null;
      }
   }

   public final float eQ() {
      return (float)this.h(bvr.s);
   }

   public final float eR() {
      return (float)this.h(bvr.r);
   }

   public final int eS() {
      return this.am.a(bL);
   }

   public final void p(int $$0) {
      this.am.a(bL, $$0);
   }

   public final int eT() {
      return this.am.a(bM);
   }

   public final void q(int $$0) {
      this.am.a(bM, $$0);
   }

   private int E() {
      if (bsw.a(this)) {
         return 6 - (1 + bsw.b(this));
      } else {
         return this.b(bsx.d) ? 6 + (1 + this.c(bsx.d).e()) * 2 : 6;
      }
   }

   public void a(bro $$0) {
      this.a($$0, false);
   }

   public void a(bro $$0, boolean $$1) {
      if (!this.aE || this.aG >= this.E() / 2 || this.aG < 0) {
         this.aG = -1;
         this.aE = true;
         this.aF = $$0;
         if (this.dS() instanceof arh) {
            acc $$2 = new acc(this, $$0 == bro.a ? 0 : 3);
            arf $$3 = ((arh)this.dS()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bsg $$0) {
      this.aP.a(1.5F);
      this.ak = 20;
      this.aK = 10;
      this.aJ = this.aK;
      awd $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.fd(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
      }

      this.a(this.dT().p(), 0.0F);
      this.cg = $$0;
      this.ch = this.dS().aa();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            awd $$1 = this.n_();
            if ($$1 != null) {
               this.a($$1, this.fd(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cnu)) {
               this.x(0.0F);
               this.a(this.dT().p());
            }
            break;
         case 29:
            this.a(awe.wE, 1.0F, 0.8F + this.dS().z.i() * 0.4F);
            break;
         case 30:
            this.a(awe.wF, 0.8F, 0.8F + this.dS().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.af.i() - 0.5F) * 0.2F;
               float $$6 = (this.af.i() - 0.5F) * 0.2F;
               float $$7 = (this.af.i() - 0.5F) * 0.2F;
               double $$8 = azd.d($$4, this.L, this.dx()) + (this.af.j() - 0.5) * (double)this.dn() * 2.0;
               double $$9 = azd.d($$4, this.M, this.dz()) + this.af.j() * (double)this.do();
               double $$10 = azd.d($$4, this.N, this.dD()) + (this.af.j() - 0.5) * (double)this.dn() * 2.0;
               this.dS().a(ln.ac, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.h(this.a(btw.a));
            break;
         case 48:
            this.h(this.a(btw.b));
            break;
         case 49:
            this.h(this.a(btw.f));
            break;
         case 50:
            this.h(this.a(btw.e));
            break;
         case 51:
            this.h(this.a(btw.d));
            break;
         case 52:
            this.h(this.a(btw.c));
            break;
         case 54:
            dld.b(this);
            break;
         case 55:
            this.G();
            break;
         case 60:
            this.F();
            break;
         case 65:
            this.h(this.a(btw.g));
            break;
         default:
            super.b($$0);
      }
   }

   private void F() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.af.k() * 0.02;
         double $$2 = this.af.k() * 0.02;
         double $$3 = this.af.k() * 0.02;
         this.dS().a(ln.ab, this.d(1.0), this.dA(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void G() {
      cvp $$0 = this.a(btw.b);
      this.a(btw.b, this.a(btw.a));
      this.a(btw.a, $$0);
   }

   @Override
   protected void aG() {
      this.a(this.dT().o(), 4.0F);
   }

   protected void eU() {
      int $$0 = this.E();
      if (this.aE) {
         this.aG++;
         if (this.aG >= $$0) {
            this.aG = 0;
            this.aE = false;
         }
      } else {
         this.aG = 0;
      }

      this.aN = (float)this.aG / (float)$$0;
   }

   @Nullable
   public bvn g(jn<bvm> $$0) {
      return this.eV().a($$0);
   }

   public double h(jn<bvm> $$0) {
      return this.eV().c($$0);
   }

   public double i(jn<bvm> $$0) {
      return this.eV().d($$0);
   }

   public bvo eV() {
      return this.bP;
   }

   public cvp eW() {
      return this.a(btw.a);
   }

   public cvp eX() {
      return this.a(btw.b);
   }

   public cvp a(bue $$0) {
      return this.fu() == $$0 ? this.eW() : this.eX();
   }

   @Nonnull
   @Override
   public cvp dW() {
      return this.eW();
   }

   public boolean b(cvk $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cvp> $$0) {
      return $$0.test(this.eW()) || $$0.test(this.eX());
   }

   public cvp b(bro $$0) {
      if ($$0 == bro.a) {
         return this.a(btw.a);
      } else if ($$0 == bro.b) {
         return this.a(btw.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bro $$0, cvp $$1) {
      if ($$0 == bro.a) {
         this.a(btw.a, $$1);
      } else {
         if ($$0 != bro.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(btw.b, $$1);
      }
   }

   public boolean d(btw $$0) {
      return !this.a($$0).f();
   }

   public boolean e(btw $$0) {
      return false;
   }

   public abstract Iterable<cvp> eY();

   public abstract cvp a(btw var1);

   public abstract void a(btw var1, cvp var2);

   public Iterable<cvp> eZ() {
      return List.of();
   }

   public Iterable<cvp> fa() {
      return this.eY();
   }

   public Iterable<cvp> fb() {
      return Iterables.concat(this.eZ(), this.fa());
   }

   protected void c(cvp $$0) {
      $$0.h().l($$0);
   }

   public float fc() {
      Iterable<cvp> $$0 = this.eY();
      int $$1 = 0;
      int $$2 = 0;

      for (cvp $$3 : $$0) {
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
      bvn $$1 = this.g(bvr.v);
      $$1.c(bD.b());
      if ($$0) {
         $$1.b(bD);
      }
   }

   protected float fd() {
      return 1.0F;
   }

   public float fe() {
      return this.o_() ? (this.af.i() - this.af.i()) * 0.2F + 1.5F : (this.af.i() - this.af.i()) * 0.2F + 1.0F;
   }

   protected boolean ff() {
      return this.eB();
   }

   @Override
   public void h(bto $$0) {
      if (!this.fM()) {
         super.h($$0);
      }
   }

   private void d(bto $$0) {
      eys $$1;
      if (this.dN()) {
         $$1 = this.dq();
      } else if (!$$0.dN() && !this.dS().a_($$0.ds()).a(awt.aK)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dz(), $$0.dz());
         $$1 = new eys(this.dx(), $$2, this.dD());
         boolean $$4 = this.dn() <= 4.0F && this.do() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.do() / 2.0;
            eys $$6 = $$1.b(0.0, $$5, 0.0);
            ezm $$7 = ezj.a(eyn.a($$6, (double)this.dn(), (double)this.do(), (double)this.dn()));
            $$1 = this.dS().a(this, $$7, $$6, (double)this.dn(), (double)this.do(), (double)this.dn()).map($$1x -> $$1x.b(0.0, -$$5, 0.0)).orElse($$1);
         }
      }

      this.a($$1.d, $$1.e, $$1.f);
   }

   @Override
   public boolean cJ() {
      return this.cI();
   }

   protected float fg() {
      return this.A(1.0F);
   }

   protected float A(float $$0) {
      return (float)this.h(bvr.o) * $$0 * this.aQ() + this.fh();
   }

   public float fh() {
      return this.b(bsx.h) ? 0.1F * ((float)this.c(bsx.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void v() {
      float $$0 = this.fg();
      if (!($$0 <= 1.0E-5F)) {
         eys $$1 = this.dv();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.cg()) {
            float $$2 = this.dI() * (float) (Math.PI / 180.0);
            this.i(new eys((double)(-azd.a($$2)) * 0.2, 0.0, (double)azd.b($$2) * 0.2));
         }

         this.as = true;
      }
   }

   protected void fi() {
      this.h(this.dv().b(0.0, -0.04F, 0.0));
   }

   protected void c(axj<eqo> $$0) {
      this.h(this.dv().b(0.0, 0.04F, 0.0));
   }

   protected float fj() {
      return 0.8F;
   }

   public boolean a(eqp $$0) {
      return false;
   }

   @Override
   protected double bc() {
      return this.h(bvr.n);
   }

   protected double fk() {
      boolean $$0 = this.dv().e <= 0.0;
      return $$0 && this.b(bsx.B) ? Math.min(this.bd(), 0.01) : this.bd();
   }

   public void a_(eys $$0) {
      if (this.de()) {
         eqp $$1 = this.dS().b_(this.ds());
         if ((this.bi() || this.bw()) && this.eg() && !this.a($$1)) {
            this.l($$0);
         } else if (this.fF()) {
            this.I();
         } else {
            this.k($$0);
         }
      }
   }

   private void k(eys $$0) {
      je $$1 = this.aO();
      float $$2 = this.aH() ? this.dS().a_($$1).b().h() : 1.0F;
      float $$3 = $$2 * 0.91F;
      eys $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      bsv $$6 = this.c(bsx.y);
      if ($$6 != null) {
         $$5 += (0.05 * (double)($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.dS().B || this.dS().B($$1)) {
         $$5 -= this.fk();
      } else if (this.dz() > (double)this.dS().G_()) {
         $$5 = -0.1;
      } else {
         $$5 = 0.0;
      }

      if (this.er()) {
         this.n($$4.d, $$5, $$4.f);
      } else {
         float $$7 = this instanceof cgj ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void l(eys $$0) {
      boolean $$1 = this.dv().e <= 0.0;
      double $$2 = this.dz();
      double $$3 = this.fk();
      if (this.bi()) {
         float $$4 = this.cg() ? 0.9F : this.fj();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bvr.F);
         if (!this.aH()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fm() - $$5) * $$6;
         }

         if (this.b(bsx.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(buo.a, this.dv());
         eys $$7 = this.dv();
         if (this.Q && this.p_()) {
            $$7 = new eys($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.h(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(buo.a, this.dv());
         if (this.b(awz.b) <= this.dm()) {
            this.h(this.dv().d(0.5, 0.8F, 0.5));
            eys $$8 = this.a($$3, $$1, this.dv());
            this.h($$8);
         } else {
            this.h(this.dv().c(0.5));
         }

         if ($$3 != 0.0) {
            this.h(this.dv().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      eys $$9 = this.dv();
      if (this.Q && this.g($$9.d, $$9.e + 0.6F - this.dz() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void I() {
      eys $$0 = this.dv();
      double $$1 = $$0.i();
      this.h(this.m($$0));
      this.a(buo.a, this.dv());
      if (!this.dS().B) {
         double $$2 = this.dv().i();
         this.c($$1, $$2);
      }
   }

   private eys m(eys $$0) {
      eys $$1 = this.bQ();
      float $$2 = this.dK() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fk();
      double $$6 = azd.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-azd.a($$2)) * 0.04;
         $$0 = $$0.b(-$$1.d * $$8 / $$3, $$8 * 3.2, -$$1.f * $$8 / $$3);
      }

      if ($$3 > 0.0) {
         $$0 = $$0.b(($$1.d / $$3 * $$4 - $$0.d) * 0.1, 0.0, ($$1.f / $$3 * $$4 - $$0.f) * 0.1);
      }

      return $$0.d(0.99F, 0.98F, 0.99F);
   }

   private void c(double $$0, double $$1) {
      if (this.Q) {
         double $$2 = $$0 - $$1;
         float $$3 = (float)($$2 * 10.0 - 3.0);
         if ($$3 > 0.0F) {
            this.a(this.r((int)$$3), 1.0F, 1.0F);
            this.a(this.dT().n(), $$3);
         }
      }
   }

   private void c(cnu $$0, eys $$1) {
      eys $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.de()) {
         this.C(this.e($$0));
         this.a_($$2);
      } else {
         this.h(eys.c);
      }
   }

   protected void a(cnu $$0, eys $$1) {
   }

   protected eys b(cnu $$0, eys $$1) {
      return $$1;
   }

   protected float e(cnu $$0) {
      return this.fm();
   }

   public void s(boolean $$0) {
      float $$1 = (float)azd.g(this.dx() - this.L, $$0 ? this.dz() - this.M : 0.0, this.dD() - this.N);
      if (!this.bW() && this.bI()) {
         this.B($$1);
      } else {
         this.aP.a();
      }
   }

   protected void B(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aP.a($$1, 0.4F, this.o_() ? 3.0F : 1.0F);
   }

   private eys a(eys $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.h(this.n(this.dv()));
      this.a(buo.a, this.dv());
      eys $$2 = this.dv();
      if ((this.Q || this.bj) && (this.p_() || this.dt().a(dhl.qP) && dne.a(this))) {
         $$2 = new eys($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public eys a(double $$0, boolean $$1, eys $$2) {
      if ($$0 != 0.0 && !this.cg()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new eys($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private eys n(eys $$0) {
      if (this.p_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = azd.a($$0.d, -0.15F, 0.15F);
         double $$3 = azd.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dt().a(dhl.nS) && this.fE() && this instanceof cnu) {
            $$4 = 0.0;
         }

         $$0 = new eys($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aH() ? this.fm() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fl();
   }

   protected float fl() {
      return this.cU() instanceof cnu ? this.fm() * 0.1F : 0.02F;
   }

   public float fm() {
      return this.cb;
   }

   public void C(float $$0) {
      this.cb = $$0;
   }

   public boolean E(bto $$0) {
      this.B($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.M();
      this.O();
      if (!this.dS().B) {
         int $$0 = this.eS();
         if ($$0 > 0) {
            if (this.aH <= 0) {
               this.aH = 20 * (30 - $$0);
            }

            this.aH--;
            if (this.aH <= 0) {
               this.p($$0 - 1);
            }
         }

         int $$1 = this.eT();
         if ($$1 > 0) {
            if (this.aI <= 0) {
               this.aI = 20 * (30 - $$1);
            }

            this.aI--;
            if (this.aI <= 0) {
               this.q($$1 - 1);
            }
         }

         this.J();
         if (this.ag % 20 == 0) {
            this.eO().c();
         }

         if (this.fM() && !this.P()) {
            this.fN();
         }
      }

      if (!this.dN()) {
         this.m_();
      }

      double $$2 = this.dx() - this.L;
      double $$3 = this.dD() - this.N;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aT;
      float $$6 = 0.0F;
      this.bc = this.bd;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)azd.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = azd.e(azd.g(this.dI()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aN > 0.0F) {
         $$5 = this.dI();
      }

      if (!this.aH()) {
         $$7 = 0.0F;
      }

      this.bd = this.bd + ($$7 - this.bd) * 0.3F;
      this.dS().ah().a("headTurn");
      $$6 = this.f($$5, $$6);
      this.dS().ah().c();
      this.dS().ah().a("rangeChecks");

      while (this.dI() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dI() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aT - this.aU < -180.0F) {
         this.aU -= 360.0F;
      }

      while (this.aT - this.aU >= 180.0F) {
         this.aU += 360.0F;
      }

      while (this.dK() - this.P < -180.0F) {
         this.P -= 360.0F;
      }

      while (this.dK() - this.P >= 180.0F) {
         this.P += 360.0F;
      }

      while (this.aV - this.aW < -180.0F) {
         this.aW -= 360.0F;
      }

      while (this.aV - this.aW >= 180.0F) {
         this.aW += 360.0F;
      }

      this.dS().ah().c();
      this.be += $$6;
      if (this.fF()) {
         this.bx++;
      } else {
         this.bx = 0;
      }

      if (this.fM()) {
         this.w(0.0F);
      }

      this.D();
      float $$10 = this.ef();
      if ($$10 != this.bC) {
         this.bC = $$10;
         this.i_();
      }

      this.aX.a();
   }

   private void J() {
      Map<btw, cvp> $$0 = this.K();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<btw, cvp> K() {
      Map<btw, cvp> $$0 = null;

      for (btw $$1 : btw.values()) {
         cvp $$2 = switch ($$1.a()) {
            case a -> this.g($$1);
            case b -> this.f($$1);
            case c -> this.bU;
         };
         cvp $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(btw.class);
            }

            $$0.put($$1, $$3);
            bvo $$4 = this.eV();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<btw, cvp> $$5 : $$0.entrySet()) {
            btw $$6 = $$5.getKey();
            cvp $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1) -> {
                  bvn $$2 = this.bP.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1.b());
                     $$2.b($$1);
                  }
               });
               if (this.dS() instanceof arh $$8) {
                  dbm.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(cvp $$0, cvp $$1) {
      return !cvp.a($$1, $$0);
   }

   private void a(Map<btw, cvp> $$0) {
      cvp $$1 = $$0.get(btw.a);
      cvp $$2 = $$0.get(btw.b);
      if ($$1 != null && $$2 != null && cvp.a($$1, this.g(btw.b)) && cvp.a($$2, this.g(btw.a))) {
         ((arh)this.dS()).l().b(this, new add(this, (byte)55));
         $$0.remove(btw.a);
         $$0.remove(btw.b);
         this.c(btw.a, $$1.u());
         this.c(btw.b, $$2.u());
      }
   }

   private void b(Map<btw, cvp> $$0) {
      List<Pair<btw, cvp>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cvp $$3 = $$2.u();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
               break;
            case c:
               this.bU = $$3;
         }
      });
      ((arh)this.dS()).l().b(this, new afi(this.ap(), $$1));
   }

   private cvp f(btw $$0) {
      return this.bT.get($$0.b());
   }

   private void b(btw $$0, cvp $$1) {
      this.bT.set($$0.b(), $$1);
   }

   private cvp g(btw $$0) {
      return this.bS.get($$0.b());
   }

   private void c(btw $$0, cvp $$1) {
      this.bS.set($$0.b(), $$1);
   }

   protected float f(float $$0, float $$1) {
      float $$2 = azd.g($$0 - this.aT);
      this.aT += $$2 * 0.3F;
      float $$3 = azd.g(this.dI() - this.aT);
      float $$4 = this.fn();
      if (Math.abs($$3) > $$4) {
         this.aT = this.aT + ($$3 - (float)azd.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fn() {
      return 50.0F;
   }

   public void m_() {
      if (this.cc > 0) {
         this.cc--;
      }

      if (this.de()) {
         this.bn = 0;
         this.f(this.dx(), this.dz(), this.dD());
      }

      if (this.bn > 0) {
         this.a(this.bn, this.bo, this.bp, this.bq, this.br, this.bs);
         this.bn--;
      } else if (!this.df()) {
         this.h(this.dv().c(0.98));
      }

      if (this.bu > 0) {
         this.a(this.bu, this.bt);
         this.bu--;
      }

      eys $$0 = this.dv();
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
      this.dS().ah().a("ai");
      if (this.ff()) {
         this.bj = false;
         this.bk = 0.0F;
         this.bm = 0.0F;
      } else if (this.df()) {
         this.dS().ah().a("newAi");
         this.fq();
         this.dS().ah().c();
      }

      this.dS().ah().c();
      this.dS().ah().a("jump");
      if (this.bj && this.eg()) {
         double $$4;
         if (this.bw()) {
            $$4 = this.b(awz.b);
         } else {
            $$4 = this.b(awz.a);
         }

         boolean $$6 = this.bi() && $$4 > 0.0;
         double $$7 = this.dm();
         if (!$$6 || this.aH() && !($$4 > $$7)) {
            if (!this.bw() || this.aH() && !($$4 > $$7)) {
               if ((this.aH() || $$6 && $$4 <= $$7) && this.cc == 0) {
                  this.v();
                  this.cc = 10;
               }
            } else {
               this.c(awz.b);
            }
         } else {
            this.c(awz.a);
         }
      } else {
         this.cc = 0;
      }

      this.dS().ah().c();
      this.dS().ah().a("travel");
      this.bk *= 0.98F;
      this.bm *= 0.98F;
      if (this.fF()) {
         this.fp();
      }

      eyn $$8 = this.cO();
      eys $$9 = new eys((double)this.bk, (double)this.bl, (double)this.bm);
      if (this.b(bsx.B) || this.b(bsx.y)) {
         this.n();
      }

      label115: {
         if (this.cU() instanceof cnu $$10 && this.bI()) {
            this.c($$10, $$9);
            break label115;
         }

         this.a_($$9);
      }

      if (!this.dS().w_() || this.de()) {
         this.aI();
      }

      this.s(this instanceof cgj);
      this.dS().ah().c();
      this.dS().ah().a("freezing");
      if (!this.dS().B && !this.eB()) {
         int $$11 = this.cr();
         if (this.aw && this.dG()) {
            this.k(Math.min(this.cu(), $$11 + 1));
         } else {
            this.k(Math.max(0, $$11 - 2));
         }
      }

      this.ec();
      this.ed();
      if (!this.dS().B && this.ag % 40 == 0 && this.ct() && this.dG()) {
         this.a(this.dT().v(), 1.0F);
      }

      this.dS().ah().c();
      this.dS().ah().a("push");
      if (this.by > 0) {
         this.by--;
         this.a($$8, this.cO());
      }

      this.r();
      this.dS().ah().c();
      if (!this.dS().B && this.fo() && this.bk()) {
         this.a(this.dT().i(), 1.0F);
      }
   }

   public boolean fo() {
      return false;
   }

   protected void fp() {
      this.cv();
      if (!this.dS().B) {
         cvp $$0 = this.a(btw.e);
         if (!this.d($$0)) {
            this.b(7, false);
            return;
         }

         int $$1 = this.bx + 1;
         if ($$1 % 10 == 0) {
            int $$2 = $$1 / 10;
            if ($$2 % 2 == 0) {
               $$0.a(1, this, btw.e);
            }

            this.a(dzl.n);
         }
      }
   }

   protected boolean d(cvp $$0) {
      return !this.aH() && !this.bW() && !this.b(bsx.y) ? $$0.a(cvt.nU) && cun.g($$0) : false;
   }

   protected void fq() {
   }

   protected void r() {
      if (this.dS().w_()) {
         this.dS().a(dyz.a(cnu.class), this.cO(), btt.a(this)).forEach(this::F);
      } else {
         List<bto> $$0 = this.dS().a(this, this.cO(), btt.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dS().ac().c(dec.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.af.a(4) == 0) {
               int $$2 = 0;

               for (bto $$3 : $$0) {
                  if (!$$3.bW()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dT().h(), 6.0F);
               }
            }

            for (bto $$4 : $$0) {
               this.F($$4);
            }
         }
      }
   }

   protected void a(eyn $$0, eyn $$1) {
      eyn $$2 = $$0.b($$1);
      List<bto> $$3 = this.dS().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bto $$4 : $$3) {
            if ($$4 instanceof buk) {
               this.g((buk)$$4);
               this.by = 0;
               this.h(this.dv().c(-0.2));
               break;
            }
         }
      } else if (this.Q) {
         this.by = 0;
      }

      if (!this.dS().B && this.by <= 0) {
         this.c(4, false);
         this.bz = 0.0F;
         this.bA = null;
      }
   }

   protected void F(bto $$0) {
      $$0.h(this);
   }

   protected void g(buk $$0) {
   }

   public boolean fr() {
      return (this.am.a(az) & 4) != 0;
   }

   @Override
   public void af() {
      bto $$0 = this.dg();
      super.af();
      if ($$0 != null && $$0 != this.dg() && !this.dS().B) {
         this.d($$0);
      }
   }

   @Override
   public void u() {
      super.u();
      this.bc = this.bd;
      this.bd = 0.0F;
      this.n();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.bo = $$0;
      this.bp = $$1;
      this.bq = $$2;
      this.br = (double)$$3;
      this.bs = (double)$$4;
      this.bn = $$5;
   }

   @Override
   public double c_() {
      return this.bn > 0 ? this.bo : this.dx();
   }

   @Override
   public double d_() {
      return this.bn > 0 ? this.bp : this.dz();
   }

   @Override
   public double N_() {
      return this.bn > 0 ? this.bq : this.dD();
   }

   @Override
   public float O_() {
      return this.bn > 0 ? (float)this.bs : this.dK();
   }

   @Override
   public float e_() {
      return this.bn > 0 ? (float)this.br : this.dI();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bt = (double)$$0;
      this.bu = $$1;
   }

   public void t(boolean $$0) {
      this.bj = $$0;
   }

   public void a(cke $$0) {
      bto $$1 = $$0.s();
      if ($$1 instanceof ari) {
         an.R.a((ari)$$1, $$0.m(), this);
      }
   }

   public void a(bto $$0, int $$1) {
      if (!$$0.dN() && !this.dS().B && ($$0 instanceof cke || $$0 instanceof cob || $$0 instanceof bua)) {
         ((arh)this.dS()).l().b($$0, new agd($$0.ap(), this.ap(), $$1));
      }
   }

   public boolean G(bto $$0) {
      if ($$0.dS() != this.dS()) {
         return false;
      } else {
         eys $$1 = new eys(this.dx(), this.dB(), this.dD());
         eys $$2 = new eys($$0.dx(), $$0.dB(), $$0.dD());
         return $$2.f($$1) > 128.0 ? false : this.dS().a(new ddo($$1, $$2, ddo.a.a, ddo.b.a, this)).d() == eyq.a.a;
      }
   }

   @Override
   public float i(float $$0) {
      return $$0 == 1.0F ? this.aV : azd.h($$0, this.aW, this.aV);
   }

   public float D(float $$0) {
      float $$1 = this.aN - this.aM;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aM + $$1 * $$0;
   }

   @Override
   public boolean bE() {
      return !this.dN();
   }

   @Override
   public boolean bF() {
      return this.bI() && !this.P_() && !this.p_();
   }

   @Override
   public float cx() {
      return this.aV;
   }

   @Override
   public void q(float $$0) {
      this.aV = $$0;
   }

   @Override
   public void r(float $$0) {
      this.aT = $$0;
   }

   @Override
   public eys a(jj.a $$0, l.a $$1) {
      return j(super.a($$0, $$1));
   }

   public static eys j(eys $$0) {
      return new eys($$0.d, $$0.e, 0.0);
   }

   public float fs() {
      return this.cd;
   }

   public final void E(float $$0) {
      this.F(azd.a($$0, 0.0F, this.eR()));
   }

   protected void F(float $$0) {
      this.cd = $$0;
   }

   public void f_() {
   }

   public void g_() {
   }

   protected void ft() {
      this.bW = true;
   }

   public abstract bue fu();

   public boolean fv() {
      return (this.am.a(az) & 1) > 0;
   }

   public bro fw() {
      return (this.am.a(az) & 2) > 0 ? bro.b : bro.a;
   }

   private void M() {
      if (this.fv()) {
         if (cvp.b(this.b(this.fw()), this.bv)) {
            this.bv = this.b(this.fw());
            this.a(this.bv);
         } else {
            this.fB();
         }
      }
   }

   protected void a(cvp $$0) {
      $$0.b(this.dS(), this, this.fy());
      if (--this.bw == 0 && !this.dS().B && !$$0.x()) {
         this.z();
      }
   }

   private void O() {
      this.cj = this.ci;
      if (this.ci()) {
         this.ci = Math.min(1.0F, this.ci + 0.09F);
      } else {
         this.ci = Math.max(0.0F, this.ci - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.am.a(az);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.am.a(az, (byte)$$2);
   }

   public void c(bro $$0) {
      cvp $$1 = this.b($$0);
      if (!$$1.f() && !this.fv()) {
         this.bv = $$1;
         this.bw = $$1.a(this);
         if (!this.dS().B) {
            this.c(1, true);
            this.c(2, $$0 == bro.b);
            this.a(dzl.D);
         }
      }
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (bN.equals($$0)) {
         if (this.dS().B) {
            this.fK().ifPresent(this::a);
         }
      } else if (az.equals($$0) && this.dS().B) {
         if (this.fv() && this.bv.f()) {
            this.bv = this.b(this.fw());
            if (!this.bv.f()) {
               this.bw = this.bv.a(this);
            }
         } else if (!this.fv() && !this.bv.f()) {
            this.bv = cvp.k;
            this.bw = 0;
         }
      }
   }

   @Override
   public void a(ff.a $$0, eys $$1) {
      super.a($$0, $$1);
      this.aW = this.aV;
      this.aT = this.aV;
      this.aU = this.aT;
   }

   @Override
   public float t(float $$0) {
      return azd.h($$0, this.aU, this.aT);
   }

   public void b(cvp $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         eys $$3 = new eys(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dK() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dI() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.af.i()) * 0.6 - 0.3;
         eys $$5 = new eys(((double)this.af.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dK() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dI() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dx(), this.dB(), this.dD());
         this.dS().a(new lj(ln.S, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void z() {
      if (!this.dS().B || this.fv()) {
         bro $$0 = this.fw();
         if (!this.bv.equals(this.b($$0))) {
            this.fA();
         } else {
            if (!this.bv.f() && this.fv()) {
               cvp $$1 = this.bv.a(this.dS(), this);
               if ($$1 != this.bv) {
                  this.a($$0, $$1);
               }

               this.fB();
            }
         }
      }
   }

   public cvp fx() {
      return this.bv;
   }

   public int fy() {
      return this.bw;
   }

   public int fz() {
      return this.fv() ? this.bv.a(this) - this.fy() : 0;
   }

   public void fA() {
      if (!this.bv.f()) {
         this.bv.a(this.dS(), this, this.fy());
         if (this.bv.x()) {
            this.M();
         }
      }

      this.fB();
   }

   public void fB() {
      if (!this.dS().B) {
         boolean $$0 = this.fv();
         this.c(1, false);
         if ($$0) {
            this.a(dzl.C);
         }
      }

      this.bv = cvp.k;
      this.bw = 0;
   }

   public boolean fC() {
      return this.fD() != null;
   }

   @Nullable
   public cvp fD() {
      if (this.fv() && !this.bv.f()) {
         cvk $$0 = this.bv.h();
         if ($$0.a(this.bv) != cvr.d) {
            return null;
         } else {
            return $$0.a(this.bv, this) - this.bw < 5 ? null : this.bv;
         }
      } else {
         return null;
      }
   }

   public boolean fE() {
      return this.ca();
   }

   public boolean fF() {
      return this.i(7);
   }

   @Override
   public boolean ci() {
      return super.ci() || !this.fF() && this.c(buw.b);
   }

   public int fG() {
      return this.bx;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dx();
      double $$5 = this.dz();
      double $$6 = this.dD();
      double $$7 = $$1;
      boolean $$8 = false;
      je $$9 = je.a($$0, $$1, $$2);
      deg $$10 = this.dS();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.G_()) {
            je $$12 = $$9.e();
            duo $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cO())) {
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

         if (this instanceof bus $$14) {
            $$14.P().o();
         }

         return true;
      }
   }

   public boolean fH() {
      return !this.eB();
   }

   public boolean fI() {
      return true;
   }

   public void a(je $$0, boolean $$1) {
   }

   public boolean e(cvp $$0) {
      return false;
   }

   @Override
   public final btr a(buw $$0) {
      return $$0 == buw.c ? aA : this.e($$0).a(this.ef());
   }

   protected btr e(buw $$0) {
      return this.ao().n().a(this.ee());
   }

   public ImmutableList<buw> fJ() {
      return ImmutableList.of(buw.a);
   }

   public eyn f(buw $$0) {
      btr $$1 = this.a($$0);
      return new eyn((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(buw $$0) {
      eyn $$1 = this.a($$0).a(this.dq());
      return this.dS().b(this, $$1);
   }

   @Override
   public boolean o(boolean $$0) {
      return super.o($$0) && !this.fM();
   }

   public Optional<je> fK() {
      return this.am.a(bN);
   }

   public void g(je $$0) {
      this.am.a(bN, Optional.of($$0));
   }

   public void fL() {
      this.am.a(bN, Optional.empty());
   }

   public boolean fM() {
      return this.fK().isPresent();
   }

   public void b(je $$0) {
      if (this.bW()) {
         this.af();
      }

      duo $$1 = this.dS().a_($$0);
      if ($$1.b() instanceof dhc) {
         this.dS().a($$0, $$1.b(dhc.c, Boolean.valueOf(true)), 3);
      }

      this.b(buw.c);
      this.a($$0);
      this.g($$0);
      this.h(eys.c);
      this.as = true;
   }

   private void a(je $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean P() {
      return this.fK().map($$0 -> this.dS().a_($$0).b() instanceof dhc).orElse(false);
   }

   public void fN() {
      this.fK().filter(this.dS()::B).ifPresent($$0x -> {
         duo $$1 = this.dS().a_($$0x);
         if ($$1.b() instanceof dhc) {
            jj $$2 = $$1.c(dhc.aF);
            this.dS().a($$0x, $$1.b(dhc.c, Boolean.valueOf(false)), 3);
            eys $$3 = dhc.a(this.ao(), this.dS(), $$0x, $$2, this.dI()).orElseGet(() -> {
               je $$1x = $$0x.d();
               return new eys((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            eys $$4 = eys.c($$0x).d($$3).d();
            float $$5 = (float)azd.d(azd.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.v($$5);
            this.w(0.0F);
         }
      });
      eys $$0 = this.dq();
      this.b(buw.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fL();
   }

   @Nullable
   public jj fO() {
      je $$0 = this.fK().orElse(null);
      return $$0 != null ? dhc.a(this.dS(), $$0) : null;
   }

   @Override
   public boolean bJ() {
      return !this.fM() && super.bJ();
   }

   public cvp f(cvp $$0) {
      return cvp.k;
   }

   private static byte h(btw $$0) {
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

   public void a(cvk $$0, btw $$1) {
      this.dS().a(this, h($$1));
      this.a(this.a($$1), $$1, this.bP);
   }

   private void a(cvp $$0, btw $$1, bvo $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         bvn $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      dbm.a($$0, this, $$1);
   }

   public static btw d(bro $$0) {
      return $$0 == bro.a ? btw.a : btw.b;
   }

   public btw g(cvp $$0) {
      cus $$1 = cus.c_($$0);
      if ($$1 != null) {
         btw $$2 = $$1.l();
         if (this.e($$2)) {
            return $$2;
         }
      }

      return btw.a;
   }

   private static bvb a(buk $$0, btw $$1) {
      return $$1 != btw.f && $$1 != btw.a && $$1 != btw.b ? bvb.a($$0, $$1, $$2 -> $$2.f() || $$0.g($$2) == $$1) : bvb.a($$0, $$1);
   }

   @Nullable
   private static btw s(int $$0) {
      if ($$0 == 100 + btw.f.b()) {
         return btw.f;
      } else if ($$0 == 100 + btw.e.b()) {
         return btw.e;
      } else if ($$0 == 100 + btw.d.b()) {
         return btw.d;
      } else if ($$0 == 100 + btw.c.b()) {
         return btw.c;
      } else if ($$0 == 98) {
         return btw.a;
      } else if ($$0 == 99) {
         return btw.b;
      } else {
         return $$0 == 105 ? btw.g : null;
      }
   }

   @Override
   public bvb a_(int $$0) {
      btw $$1 = s($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dG() {
      if (this.P_()) {
         return false;
      } else {
         boolean $$0 = !this.a(btw.f).a(axc.be) && !this.a(btw.e).a(axc.be) && !this.a(btw.d).a(axc.be) && !this.a(btw.c).a(axc.be) && !this.a(btw.g).a(axc.be);
         return $$0 && super.dG();
      }
   }

   @Override
   public boolean cl() {
      return !this.dS().w_() && this.b(bsx.x) || super.cl();
   }

   @Override
   public float dJ() {
      return this.aT;
   }

   @Override
   public void a(aca $$0) {
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      float $$4 = $$0.n();
      float $$5 = $$0.m();
      this.f($$1, $$2, $$3);
      this.aT = $$0.o();
      this.aV = $$0.o();
      this.aU = this.aT;
      this.aW = this.aV;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.n($$0.j(), $$0.k(), $$0.l());
   }

   public boolean fP() {
      return this.dW().h() instanceof ctn;
   }

   @Override
   public float dM() {
      float $$0 = (float)this.h(bvr.B);
      return this.cU() instanceof cnu ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public eys m(bto $$0) {
      return this.dq().e(this.a($$0, this.a(this.av()), this.ef() * this.ee()));
   }

   protected void a(int $$0, double $$1) {
      this.aV = (float)azd.e(1.0 / (double)$$0, (double)this.aV, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(azd.c((double)$$0 * this.h(bvr.h)));
   }

   public boolean fQ() {
      return false;
   }

   @Override
   public boolean b(bsg $$0) {
      if (super.b($$0)) {
         return true;
      } else {
         if (this.dS() instanceof arh $$1 && dbm.a($$1, this, $$0)) {
            return true;
         }

         return false;
      }
   }

   public static record a(awd a, awd b) {
   }
}

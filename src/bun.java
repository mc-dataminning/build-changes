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

public abstract class bun extends btr implements btn {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final ale d = ale.b("powder_snow");
   private static final ale e = ale.b("sprinting");
   private static final bvs bD = new bvs(e, 0.3F, bvs.a.c);
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
   protected static final akh<Byte> az = akl.a(bun.class, akj.a);
   private static final akh<Float> bI = akl.a(bun.class, akj.d);
   private static final akh<List<lm>> bJ = akl.a(bun.class, akj.m);
   private static final akh<Boolean> bK = akl.a(bun.class, akj.k);
   private static final akh<Integer> bL = akl.a(bun.class, akj.b);
   private static final akh<Integer> bM = akl.a(bun.class, akj.b);
   private static final akh<Optional<jf>> bN = akl.a(bun.class, akj.p);
   private static final int bO = 15;
   protected static final btu aA = btu.c(0.2F, 0.2F).b(0.2F);
   public static final float aB = 0.5F;
   public static final float aC = 0.5F;
   public static final String aD = "attributes";
   private final bvr bP;
   private final bsg bQ = new bsg(this);
   private final Map<jo<bsw>, bsy> bR = Maps.newHashMap();
   private final jx<cvs> bS = jx.a(2, cvs.k);
   private final jx<cvs> bT = jx.a(4, cvs.k);
   private cvs bU = cvs.k;
   public boolean aE;
   private boolean bV = false;
   public brr aF;
   public int aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public float aM;
   public float aN;
   protected int aO;
   public final bvn aP = new bvn();
   public final int aQ = 20;
   public final float aR;
   public final float aS;
   public float aT;
   public float aU;
   public float aV;
   public float aW;
   public final btq aX = new btq(this);
   @Nullable
   protected cnx aY;
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
   private bun bX;
   private int bY;
   @Nullable
   private bun bZ;
   private int ca;
   private float cb;
   private int cc;
   private float cd;
   protected cvs bv = cvs.k;
   protected int bw;
   protected int bx;
   private jf ce;
   private Optional<jf> cf = Optional.empty();
   @Nullable
   private bsj cg;
   private long ch;
   protected int by;
   protected float bz;
   @Nullable
   protected cvs bA;
   private float ci;
   private float cj;
   protected bvo<?> bB;
   private boolean ck;
   private final EnumMap<btz, Reference2ObjectMap<dbn, Set<dcf>>> cl = new EnumMap<>(btz.class);
   protected float bC = 1.0F;

   protected bun(bty<? extends bun> $$0, dej $$1) {
      super($$0, $$1);
      this.bP = new bvr(bvv.a($$0));
      this.x(this.eQ());
      this.J = true;
      this.aS = (float)((Math.random() + 1.0) * 0.01F);
      this.ax();
      this.aR = (float)Math.random() * 12398.0F;
      this.v((float)(Math.random() * (float) (Math.PI * 2)));
      this.aV = this.dI();
      uu $$2 = uu.a;
      this.bB = this.a(new Dynamic($$2, (vd)$$2.createMap(ImmutableMap.of($$2.a("memories"), (vd)$$2.emptyMap()))));
   }

   public bvo<?> dY() {
      return this.bB;
   }

   protected bvo.b<?> dZ() {
      return bvo.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bvo<?> a(Dynamic<?> $$0) {
      return this.dZ().a($$0);
   }

   @Override
   public void ar() {
      this.a(this.dT().y(), Float.MAX_VALUE);
   }

   public boolean a(bty<?> $$0) {
      return true;
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(az, (byte)0);
      $$0.a(bJ, List.of());
      $$0.a(bK, false);
      $$0.a(bL, 0);
      $$0.a(bM, 0);
      $$0.a(bI, 1.0F);
      $$0.a(bN, Optional.empty());
   }

   public static bvt.a ea() {
      return bvt.a()
         .a(bvu.s)
         .a(bvu.p)
         .a(bvu.v)
         .a(bvu.a)
         .a(bvu.b)
         .a(bvu.r)
         .a(bvu.B)
         .a(bvu.y)
         .a(bvu.n)
         .a(bvu.x)
         .a(bvu.k)
         .a(bvu.o)
         .a(bvu.w)
         .a(bvu.h)
         .a(bvu.i)
         .a(bvu.F)
         .a(bvu.u)
         .a(bvu.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dus $$2, jf $$3) {
      if (!this.bi()) {
         this.bq();
      }

      if (this.dS() instanceof arj $$4 && $$1 && this.aa > 0.0F) {
         this.b($$4, $$3);
         double $$5 = this.h(bvu.x);
         if ((double)this.aa > $$5 && !$$2.l()) {
            double $$6 = this.dx();
            double $$7 = this.dz();
            double $$8 = this.dD();
            jf $$9 = this.ds();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            float $$13 = (float)azf.c((double)this.aa - $$5);
            double $$14 = Math.min((double)(0.2F + $$13 / 15.0F), 2.5);
            int $$15 = (int)(150.0 * $$14);
            ((arj)this.dS()).a(new lg(lo.b, $$2), $$6, $$7, $$8, $$15, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cf = Optional.empty();
      }
   }

   public final boolean eb() {
      return this.ao().a(awz.m);
   }

   public float a(float $$0) {
      return azf.h($$0, this.cj, this.ci);
   }

   public boolean ec() {
      return this.dv().b() < 1.0E-5F && this.bm();
   }

   @Override
   public void ay() {
      this.aM = this.aN;
      if (this.al) {
         this.fL().ifPresent(this::a);
      }

      if (this.dS() instanceof arj $$0) {
         dbp.b($$0, this);
      }

      super.ay();
      this.dS().ah().a("livingEntityBaseTick");
      if (this.bh() || this.dS().B) {
         this.aF();
      }

      if (this.bI()) {
         boolean $$1 = this instanceof cnx;
         if (!this.dS().B) {
            if (this.bJ()) {
               this.a(this.dT().g(), 1.0F);
            } else if ($$1 && !this.dS().B_().a(this.cO())) {
               double $$2 = this.dS().B_().a(this) + this.dS().B_().n();
               if ($$2 < 0.0) {
                  double $$3 = this.dS().B_().o();
                  if ($$3 > 0.0) {
                     this.a(this.dT().x(), (float)Math.max(1, azf.a(-$$2 * $$3)));
                  }
               }
            }
         }

         if (this.a(axb.a) && !this.dS().a_(jf.a(this.dx(), this.dB(), this.dD())).a(dho.nd)) {
            boolean $$4 = !this.eb() && !bsz.c(this) && (!$$1 || !((cnx)this).ge().a);
            if ($$4) {
               this.j(this.m(this.cq()));
               if (this.cq() == -20) {
                  this.j(0);
                  eyw $$5 = this.dv();

                  for (int $$6 = 0; $$6 < 8; $$6++) {
                     double $$7 = this.af.j() - this.af.j();
                     double $$8 = this.af.j() - this.af.j();
                     double $$9 = this.af.j() - this.af.j();
                     this.dS().a(lo.d, this.dx() + $$7, this.dz() + $$8, this.dD() + $$9, $$5.d, $$5.e, $$5.f);
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

         if (this.dS() instanceof arj $$10) {
            jf $$11 = this.ds();
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

      if (this.ak > 0 && !(this instanceof ark)) {
         this.ak--;
      }

      if (this.eC() && this.dS().h(this)) {
         this.ei();
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

      this.et();
      this.bf = this.be;
      this.aU = this.aT;
      this.aW = this.aV;
      this.O = this.dI();
      this.P = this.dK();
      this.dS().ah().c();
   }

   @Override
   protected float aR() {
      return azf.h((float)this.h(bvu.u), super.aR(), 1.0F);
   }

   protected void ed() {
      bvq $$0 = this.g(bvu.v);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.c(d);
         }
      }
   }

   protected void ee() {
      if (!this.bs().l()) {
         int $$0 = this.cr();
         if ($$0 > 0) {
            bvq $$1 = this.g(bvu.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cs();
            $$1.b(new bvs(d, (double)$$2, bvs.a.a));
         }
      }
   }

   protected void b(arj $$0, jf $$1) {
      dbp.a($$0, this);
   }

   public boolean p_() {
      return false;
   }

   public float ef() {
      return this.p_() ? 0.5F : 1.0F;
   }

   public final float eg() {
      bvr $$0 = this.eV();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bvu.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean eh() {
      return true;
   }

   protected void ei() {
      this.aL++;
      if (this.aL >= 20 && !this.dS().x_() && !this.dN()) {
         this.dS().a(this, (byte)60);
         this.a(btr.c.a);
      }
   }

   public boolean ej() {
      return !this.p_();
   }

   protected boolean ek() {
      return !this.p_();
   }

   protected int m(int $$0) {
      bvq $$1 = this.g(bvu.w);
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

   public final int a(arj $$0, @Nullable btr $$1) {
      return dbp.a($$0, $$1, this, this.el());
   }

   protected int el() {
      return 0;
   }

   protected boolean em() {
      return false;
   }

   @Nullable
   public bun en() {
      return this.bX;
   }

   @Override
   public bun Y_() {
      return this.en();
   }

   public int eo() {
      return this.bY;
   }

   public void c(@Nullable cnx $$0) {
      this.aY = $$0;
      this.aZ = this.ag;
   }

   public void a(@Nullable bun $$0) {
      this.bX = $$0;
      this.bY = this.ag;
   }

   @Nullable
   public bun ep() {
      return this.bZ;
   }

   public int eq() {
      return this.ca;
   }

   public void B(btr $$0) {
      if ($$0 instanceof bun) {
         this.bZ = (bun)$$0;
      } else {
         this.bZ = null;
      }

      this.ca = this.ag;
   }

   public int er() {
      return this.bb;
   }

   public void o(int $$0) {
      this.bb = $$0;
   }

   public boolean es() {
      return this.bV;
   }

   public void r(boolean $$0) {
      this.bV = $$0;
   }

   protected boolean b(btz $$0) {
      return true;
   }

   public void a(btz $$0, cvs $$1, cvs $$2) {
      boolean $$3 = $$2.f() && $$1.f();
      if (!$$3 && !cvs.c($$1, $$2) && !this.al) {
         cuv $$4 = cuv.c_($$2);
         if (!this.dS().x_() && !this.Q_()) {
            if (!this.ba() && $$4 != null && $$4.l() == $$0) {
               this.dS().a(null, this.dx(), this.dz(), this.dD(), $$4.m(), this.di(), 1.0F, 1.0F, this.af.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? dzp.v : dzp.S);
            }
         }
      }
   }

   @Override
   public void a(btr.c $$0) {
      if ($$0 == btr.c.a || $$0 == btr.c.b) {
         this.c($$0);
      }

      super.a($$0);
      this.bB.a();
   }

   protected void c(btr.c $$0) {
      for (bsy $$1 : this.ey()) {
         $$1.a(this, $$0);
      }

      this.bR.clear();
   }

   @Override
   public void b(ug $$0) {
      $$0.a("Health", this.eB());
      $$0.a("HurtTime", (short)this.aJ);
      $$0.a("HurtByTimestamp", this.bY);
      $$0.a("DeathTime", (short)this.aL);
      $$0.a("AbsorptionAmount", this.fs());
      $$0.a("attributes", this.eV().d());
      if (!this.bR.isEmpty()) {
         um $$1 = new um();

         for (bsy $$2 : this.bR.values()) {
            $$1.add($$2.j());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fF());
      this.fL().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<vd> $$3 = this.bB.a(uu.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(ug $$0) {
      this.F($$0.j("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dS() != null && !this.dS().B) {
         this.eV().a($$0.c("attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         um $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ug $$3 = $$1.a($$2);
            bsy $$4 = bsy.a($$3);
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
         fab $$6 = this.dS().O();
         ezw $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cE(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         jf $$9 = new jf($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$9);
         this.am.a(ar, buz.c);
         if (!this.al) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bB = this.a(new Dynamic(uu.a, $$0.c("Brain")));
      }
   }

   protected void et() {
      Iterator<jo<bsw>> $$0 = this.bR.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jo<bsw> $$1 = $$0.next();
            bsy $$2 = this.bR.get($$1);
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

      List<lm> $$3 = this.am.a(bJ);
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
         this.ew();
         this.k(false);
      } else {
         this.k(this.b(bta.n));
         this.q();
      }
   }

   private void q() {
      List<lm> $$0 = this.bR.values().stream().filter(bsy::g).map(bsy::a).toList();
      this.am.a(bJ, $$0);
      this.am.a(bK, d(this.bR.values()));
   }

   private void w() {
      boolean $$0 = this.cl();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable btr $$0) {
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
         cvs $$3 = this.a(btz.f);
         bty<?> $$4 = $$0.ao();
         if ($$4 == bty.aN && $$3.a(cvw.un)
            || $$4 == bty.bu && $$3.a(cvw.uq)
            || $$4 == bty.aA && $$3.a(cvw.ut)
            || $$4 == bty.aB && $$3.a(cvw.ut)
            || $$4 == bty.x && $$3.a(cvw.ur)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bun $$0) {
      return $$0 instanceof cnx && this.dS().am() == brp.a ? false : $$0.eu();
   }

   public boolean a(bun $$0, cfd $$1) {
      return $$1.a(this, $$0);
   }

   public boolean eu() {
      return !this.cz() && this.ev();
   }

   public boolean ev() {
      return !this.Q_() && this.bI();
   }

   public static boolean d(Collection<bsy> $$0) {
      for (bsy $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void ew() {
      this.am.a(bJ, List.of());
   }

   public boolean ex() {
      if (this.dS().B) {
         return false;
      } else if (this.bR.isEmpty()) {
         return false;
      } else {
         Map<jo<bsw>, bsy> $$0 = Maps.newHashMap(this.bR);
         this.bR.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<bsy> ey() {
      return this.bR.values();
   }

   public Map<jo<bsw>, bsy> ez() {
      return this.bR;
   }

   public boolean b(jo<bsw> $$0) {
      return this.bR.containsKey($$0);
   }

   @Nullable
   public bsy c(jo<bsw> $$0) {
      return this.bR.get($$0);
   }

   public final boolean a(bsy $$0) {
      return this.b($$0, null);
   }

   public boolean b(bsy $$0, @Nullable btr $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         bsy $$2 = this.bR.get($$0.c());
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

   public boolean b(bsy $$0) {
      if (this.ao().a(awz.G)) {
         return !$$0.a(bta.M);
      } else if (this.ao().a(awz.F)) {
         return !$$0.a(bta.L);
      } else {
         return !this.ao().a(awz.w) ? true : !$$0.a(bta.j) && !$$0.a(bta.s);
      }
   }

   public void c(bsy $$0, @Nullable btr $$1) {
      if (this.b($$0)) {
         bsy $$2 = this.bR.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eA() {
      return this.ao().a(awz.x);
   }

   @Nullable
   public bsy d(jo<bsw> $$0) {
      return this.bR.remove($$0);
   }

   public boolean e(jo<bsw> $$0) {
      bsy $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(bsy $$0, @Nullable btr $$1) {
      this.bW = true;
      if (!this.dS().B) {
         $$0.c().a().a(this.eV(), $$0.e());
         this.c($$0);
      }
   }

   public void c(bsy $$0) {
      for (btr $$1 : this.cW()) {
         if ($$1 instanceof ark $$2) {
            $$2.c.b(new agk(this.ap(), $$0, false));
         }
      }
   }

   protected void a(bsy $$0, boolean $$1, @Nullable btr $$2) {
      this.bW = true;
      if ($$1 && !this.dS().B) {
         bsw $$3 = $$0.c().a();
         $$3.a(this.eV());
         $$3.a(this.eV(), $$0.e());
         this.D();
      }

      if (!this.dS().B) {
         this.c($$0);
      }
   }

   protected void c(Collection<bsy> $$0) {
      this.bW = true;
      if (!this.dS().B) {
         for (bsy $$1 : $$0) {
            $$1.c().a().a(this.eV());

            for (btr $$2 : this.cW()) {
               if ($$2 instanceof ark $$3) {
                  $$3.c.b(new aen(this.ap(), $$1.c()));
               }
            }
         }

         this.D();
      }
   }

   private void D() {
      Set<bvq> $$0 = this.eV().b();

      for (bvq $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jo<bvp> $$0) {
      if ($$0.a(bvu.s)) {
         float $$1 = this.eQ();
         if (this.eB() > $$1) {
            this.x($$1);
         }
      } else if ($$0.a(bvu.r)) {
         float $$2 = this.eR();
         if (this.fs() > $$2) {
            this.E($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.eB();
      if ($$1 > 0.0F) {
         this.x($$1 + $$0);
      }
   }

   public float eB() {
      return this.am.a(bI);
   }

   public void x(float $$0) {
      this.am.a(bI, azf.a($$0, 0.0F, this.eQ()));
   }

   public boolean eC() {
      return this.eB() <= 0.0F;
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dS().B) {
         return false;
      } else if (this.eC()) {
         return false;
      } else if ($$0.a(awx.i) && this.b(bta.l)) {
         return false;
      } else {
         if (this.fN() && !this.dS().B) {
            this.fO();
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
            if (!$$0.a(awx.j) && $$0.c() instanceof bun $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(awx.o) && this.ao().a(awz.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(awx.a) && !this.a(btz.f).f()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aP.a(1.5F);
         if (Float.isNaN($$1) || Float.isInfinite($$1)) {
            $$1 = Float.MAX_VALUE;
         }

         boolean $$7 = true;
         if ((float)this.ak > 10.0F && !$$0.a(awx.e)) {
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

         btr $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bun $$9 && !$$0.a(awx.q) && (!$$0.a(bsm.I) || !this.ao().a(awz.E))) {
               this.a($$9);
            }

            if ($$8 instanceof cnx $$10) {
               this.aZ = 100;
               this.aY = $$10;
            } else if ($$8 instanceof chg $$11 && $$11.q()) {
               this.aZ = 100;
               if ($$11.S_() instanceof cnx $$12) {
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

            if (!$$0.a(awx.r) && (!$$3 || $$1 > 0.0F)) {
               this.bA();
            }

            if (!$$0.a(awx.z)) {
               double $$13 = 0.0;
               double $$14 = 0.0;
               if ($$0.c() instanceof cor $$15) {
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

         if (this.eC()) {
            if (!this.g($$0)) {
               if ($$7) {
                  this.b(this.o_());
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

            for (bsy $$18 : this.ey()) {
               $$18.a(this, $$0, $$1);
            }
         }

         if (this instanceof ark) {
            an.i.a((ark)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((ark)this).a(awq.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof ark) {
            an.h.a((ark)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$17;
      }
   }

   protected void d(bun $$0) {
      $$0.e(this);
   }

   protected void e(bun $$0) {
      $$0.p(0.5, $$0.dx() - this.dx(), $$0.dD() - this.dD());
   }

   private boolean g(bsj $$0) {
      if ($$0.a(awx.d)) {
         return false;
      } else {
         cvs $$1 = null;

         for (brr $$2 : brr.values()) {
            cvs $$3 = this.b($$2);
            if ($$3.a(cvw.vv)) {
               $$1 = $$3.u();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof ark $$4) {
               $$4.b(awq.c.b(cvw.vv));
               an.C.a($$4, $$1);
               this.a(dzp.C);
            }

            this.x(1.0F);
            this.ex();
            this.a(new bsy(bta.j, 900, 1));
            this.a(new bsy(bta.v, 100, 1));
            this.a(new bsy(bta.l, 800, 0));
            this.dS().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bsj eD() {
      if (this.dS().aa() - this.ch > 40L) {
         this.cg = null;
      }

      return this.cg;
   }

   protected void e(bsj $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable awf $$0) {
      if ($$0 != null) {
         this.a($$0, this.fd(), this.fe());
      }
   }

   public boolean f(bsj $$0) {
      btr $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof coe $$3 && $$3.A() > 0) {
         $$2 = true;
      }

      if (!$$0.a(awx.c) && this.fC() && !$$2) {
         eyw $$4 = $$0.i();
         if ($$4 != null) {
            eyw $$5 = this.c(0.0F, this.cx());
            eyw $$6 = $$4.a(this.dq());
            $$6 = new eyw($$6.d, 0.0, $$6.f).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void h(cvs $$0) {
      if (!$$0.f()) {
         if (!this.ba()) {
            this.dS().a(this.dx(), this.dz(), this.dD(), $$0.L(), this.di(), 0.8F, 0.8F + this.dS().z.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(bsj $$0) {
      if (!this.dN() && !this.ba) {
         btr $$1 = $$0.d();
         bun $$2 = this.eP();
         if (this.bh >= 0 && $$2 != null) {
            $$2.a(this, this.bh, $$0);
         }

         if (this.fN()) {
            this.fO();
         }

         if (!this.dS().B && this.ak()) {
            b.info("Named entity {} died: {}", this, this.eO().a().getString());
         }

         this.ba = true;
         this.eO().c();
         if (this.dS() instanceof arj $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dzp.p);
               this.a($$3, $$0);
               this.f($$2);
            }

            this.dS().a(this, (byte)3);
         }

         this.b(buz.h);
      }
   }

   protected void f(@Nullable bun $$0) {
      if (!this.dS().B) {
         boolean $$1 = false;
         if ($$0 instanceof cju) {
            if (this.dS().ac().b(def.c)) {
               jf $$2 = this.ds();
               dus $$3 = dho.cd.n();
               if (this.dS().a_($$2).l() && $$3.a((dem)this.dS(), $$2)) {
                  this.dS().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               ckh $$4 = new ckh(this.dS(), this.dx(), this.dz(), this.dD(), new cvs(cvw.dw));
               this.dS().b($$4);
            }
         }
      }
   }

   protected void a(arj $$0, bsj $$1) {
      boolean $$2 = this.aZ > 0;
      if (this.ek() && $$0.ac().b(def.f)) {
         this.a($$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.eE();
      this.D($$1.d());
   }

   protected void eE() {
   }

   protected void D(@Nullable btr $$0) {
      if (this.dS() instanceof arj $$1 && !this.eH() && (this.em() || this.aZ > 0 && this.ej() && this.dS().ac().b(def.f))) {
         bud.a($$1, this.dq(), this.a($$1, $$0));
      }
   }

   protected void a(arj $$0, bsj $$1, boolean $$2) {
   }

   public long eF() {
      return 0L;
   }

   protected float a(btr $$0, bsj $$1) {
      float $$2 = (float)this.h(bvu.d);
      return this.dS() instanceof arj $$3 ? dbp.d($$3, this.dW(), $$0, $$1, $$2) : $$2;
   }

   protected void a(bsj $$0, boolean $$1) {
      Optional<ald<etq>> $$2 = this.dX();
      if (!$$2.isEmpty()) {
         etq $$3 = this.dS().o().bd().b($$2.get());
         eto.a $$4 = new eto.a((arj)this.dS()).a(ewh.a, this).a(ewh.f, this.dq()).a(ewh.c, $$0).b(ewh.d, $$0.d()).b(ewh.e, $$0.c());
         if ($$1 && this.aY != null) {
            $$4 = $$4.a(ewh.b, this.aY).a(this.aY.gz());
         }

         eto $$5 = $$4.a(ewg.g);
         $$3.a($$5, this.eF(), this::b);
      }
   }

   protected void a(ald<etq> $$0, Consumer<cvs> $$1) {
      if (this.dS() instanceof arj $$2) {
         etq $$3 = $$2.o().bd().b($$0);
         eto $$4 = new eto.a($$2).a(ewh.f, this.dq()).a(ewh.a, this).a(ewg.s);
         ObjectListIterator var6 = $$3.a($$4).iterator();

         while (var6.hasNext()) {
            cvs $$5 = (cvs)var6.next();
            $$1.accept($$5);
         }
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(bvu.p);
      if (!($$0 <= 0.0)) {
         this.as = true;
         eyw $$3 = this.dv();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         eyw $$4 = new eyw($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aH() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected awf d(bsj $$0) {
      return awg.kh;
   }

   @Nullable
   protected awf o_() {
      return awg.kc;
   }

   private awf r(int $$0) {
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

   protected eyr eJ() {
      eyr $$0 = this.cO();
      btr $$1 = this.dg();
      if ($$1 != null) {
         eyw $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dbn, Set<dcf>> c(btz $$0) {
      return (Map<dbn, Set<dcf>>)this.cl.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public bun.a eK() {
      return new bun.a(awg.ki, awg.ka);
   }

   public Optional<jf> eL() {
      return this.cf;
   }

   public boolean q_() {
      if (this.Q_()) {
         return false;
      } else {
         jf $$0 = this.ds();
         dus $$1 = this.dt();
         if ($$1.a(awv.aQ)) {
            this.cf = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dqa && this.c($$0, $$1)) {
            this.cf = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(jf $$0, dus $$1) {
      if (!$$1.c(dqa.b)) {
         return false;
      } else {
         dus $$2 = this.dS().a_($$0.e());
         return $$2.a(dho.cO) && $$2.c(dls.b) == $$1.c(dqa.aF);
      }
   }

   @Override
   public boolean bI() {
      return !this.dN() && this.eB() > 0.0F;
   }

   @Override
   public int cB() {
      return this.y(0.0F);
   }

   protected final int y(float $$0) {
      return azf.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bsj $$2) {
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
      if (this.ao().a(awz.o)) {
         return 0;
      } else {
         float $$2 = (float)this.h(bvu.x);
         float $$3 = $$0 - $$2;
         return azf.c((double)($$3 * $$1) * this.h(bvu.k));
      }
   }

   protected void eM() {
      if (!this.ba()) {
         int $$0 = azf.a(this.dx());
         int $$1 = azf.a(this.dz() - 0.2F);
         int $$2 = azf.a(this.dD());
         dus $$3 = this.dS().a_(new jf($$0, $$1, $$2));
         if (!$$3.l()) {
            dpa $$4 = $$3.A();
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
      return azf.a(this.h(bvu.a));
   }

   protected void b(bsj $$0, float $$1) {
   }

   protected void c(bsj $$0, float $$1) {
   }

   protected void z(float $$0) {
   }

   protected void a(bsj $$0, float $$1, btz... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (btz $$4 : $$2) {
            cvs $$5 = this.a($$4);
            if ($$5.h() instanceof ctl && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float d(bsj $$0, float $$1) {
      if (!$$0.a(awx.b)) {
         this.b($$0, $$1);
         $$1 = bsf.a(this, $$1, $$0, (float)this.eN(), (float)this.h(bvu.b));
      }

      return $$1;
   }

   protected float e(bsj $$0, float $$1) {
      if ($$0.a(awx.f)) {
         return $$1;
      } else {
         if (this.b(bta.k) && !$$0.a(awx.g)) {
            int $$2 = (this.c(bta.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof ark) {
                  ((ark)this).a(awq.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof ark) {
                  ((ark)$$0.d()).a(awq.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(awx.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dS() instanceof arj $$7) {
               $$8 = dbp.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bsf.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void f(bsj $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fs(), 0.0F);
         this.E(this.fs() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof ark $$4) {
            $$4.a(awq.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eO().a($$0, var9);
            this.x(this.eB() - var9);
            this.E(this.fs() - var9);
            this.a(dzp.o);
         }
      }
   }

   public bsg eO() {
      return this.bQ;
   }

   @Nullable
   public bun eP() {
      if (this.aY != null) {
         return this.aY;
      } else {
         return this.bX != null ? this.bX : null;
      }
   }

   public final float eQ() {
      return (float)this.h(bvu.s);
   }

   public final float eR() {
      return (float)this.h(bvu.r);
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
      if (bsz.a(this)) {
         return 6 - (1 + bsz.b(this));
      } else {
         return this.b(bta.d) ? 6 + (1 + this.c(bta.d).e()) * 2 : 6;
      }
   }

   public void a(brr $$0) {
      this.a($$0, false);
   }

   public void a(brr $$0, boolean $$1) {
      if (!this.aE || this.aG >= this.E() / 2 || this.aG < 0) {
         this.aG = -1;
         this.aE = true;
         this.aF = $$0;
         if (this.dS() instanceof arj) {
            acd $$2 = new acd(this, $$0 == brr.a ? 0 : 3);
            arh $$3 = ((arj)this.dS()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bsj $$0) {
      this.aP.a(1.5F);
      this.ak = 20;
      this.aK = 10;
      this.aJ = this.aK;
      awf $$1 = this.d($$0);
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
            awf $$1 = this.o_();
            if ($$1 != null) {
               this.a($$1, this.fd(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cnx)) {
               this.x(0.0F);
               this.a(this.dT().p());
            }
            break;
         case 29:
            this.a(awg.wE, 1.0F, 0.8F + this.dS().z.i() * 0.4F);
            break;
         case 30:
            this.a(awg.wF, 0.8F, 0.8F + this.dS().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.af.i() - 0.5F) * 0.2F;
               float $$6 = (this.af.i() - 0.5F) * 0.2F;
               float $$7 = (this.af.i() - 0.5F) * 0.2F;
               double $$8 = azf.d($$4, this.L, this.dx()) + (this.af.j() - 0.5) * (double)this.dn() * 2.0;
               double $$9 = azf.d($$4, this.M, this.dz()) + this.af.j() * (double)this.do();
               double $$10 = azf.d($$4, this.N, this.dD()) + (this.af.j() - 0.5) * (double)this.dn() * 2.0;
               this.dS().a(lo.ac, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.h(this.a(btz.a));
            break;
         case 48:
            this.h(this.a(btz.b));
            break;
         case 49:
            this.h(this.a(btz.f));
            break;
         case 50:
            this.h(this.a(btz.e));
            break;
         case 51:
            this.h(this.a(btz.d));
            break;
         case 52:
            this.h(this.a(btz.c));
            break;
         case 54:
            dlg.b(this);
            break;
         case 55:
            this.G();
            break;
         case 60:
            this.F();
            break;
         case 65:
            this.h(this.a(btz.g));
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
         this.dS().a(lo.ab, this.d(1.0), this.dA(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void G() {
      cvs $$0 = this.a(btz.b);
      this.a(btz.b, this.a(btz.a));
      this.a(btz.a, $$0);
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
   public bvq g(jo<bvp> $$0) {
      return this.eV().a($$0);
   }

   public double h(jo<bvp> $$0) {
      return this.eV().c($$0);
   }

   public double i(jo<bvp> $$0) {
      return this.eV().d($$0);
   }

   public bvr eV() {
      return this.bP;
   }

   public cvs eW() {
      return this.a(btz.a);
   }

   public cvs eX() {
      return this.a(btz.b);
   }

   public cvs a(buh $$0) {
      return this.fu() == $$0 ? this.eW() : this.eX();
   }

   @Nonnull
   @Override
   public cvs dW() {
      return this.eW();
   }

   public boolean b(cvn $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cvs> $$0) {
      return $$0.test(this.eW()) || $$0.test(this.eX());
   }

   public cvs b(brr $$0) {
      if ($$0 == brr.a) {
         return this.a(btz.a);
      } else if ($$0 == brr.b) {
         return this.a(btz.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(brr $$0, cvs $$1) {
      if ($$0 == brr.a) {
         this.a(btz.a, $$1);
      } else {
         if ($$0 != brr.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(btz.b, $$1);
      }
   }

   public boolean d(btz $$0) {
      return !this.a($$0).f();
   }

   public boolean e(btz $$0) {
      return false;
   }

   public abstract Iterable<cvs> eY();

   public abstract cvs a(btz var1);

   public abstract void a(btz var1, cvs var2);

   public Iterable<cvs> eZ() {
      return List.of();
   }

   public Iterable<cvs> fa() {
      return this.eY();
   }

   public Iterable<cvs> fb() {
      return Iterables.concat(this.eZ(), this.fa());
   }

   protected void c(cvs $$0) {
      $$0.h().l($$0);
   }

   public float fc() {
      Iterable<cvs> $$0 = this.eY();
      int $$1 = 0;
      int $$2 = 0;

      for (cvs $$3 : $$0) {
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
      bvq $$1 = this.g(bvu.v);
      $$1.c(bD.b());
      if ($$0) {
         $$1.b(bD);
      }
   }

   protected float fd() {
      return 1.0F;
   }

   public float fe() {
      return this.p_() ? (this.af.i() - this.af.i()) * 0.2F + 1.5F : (this.af.i() - this.af.i()) * 0.2F + 1.0F;
   }

   protected boolean ff() {
      return this.eC();
   }

   @Override
   public void h(btr $$0) {
      if (!this.fN()) {
         super.h($$0);
      }
   }

   private void d(btr $$0) {
      eyw $$1;
      if (this.dN()) {
         $$1 = this.dq();
      } else if (!$$0.dN() && !this.dS().a_($$0.ds()).a(awv.aK)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dz(), $$0.dz());
         $$1 = new eyw(this.dx(), $$2, this.dD());
         boolean $$4 = this.dn() <= 4.0F && this.do() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.do() / 2.0;
            eyw $$6 = $$1.b(0.0, $$5, 0.0);
            ezq $$7 = ezn.a(eyr.a($$6, (double)this.dn(), (double)this.do(), (double)this.dn()));
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
      return (float)this.h(bvu.o) * $$0 * this.aQ() + this.fh();
   }

   public float fh() {
      return this.b(bta.h) ? 0.1F * ((float)this.c(bta.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void v() {
      float $$0 = this.fg();
      if (!($$0 <= 1.0E-5F)) {
         eyw $$1 = this.dv();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.cg()) {
            float $$2 = this.dI() * (float) (Math.PI / 180.0);
            this.i(new eyw((double)(-azf.a($$2)) * 0.2, 0.0, (double)azf.b($$2) * 0.2));
         }

         this.as = true;
      }
   }

   protected void fi() {
      this.h(this.dv().b(0.0, -0.04F, 0.0));
   }

   protected void c(axl<eqs> $$0) {
      this.h(this.dv().b(0.0, 0.04F, 0.0));
   }

   protected float fj() {
      return 0.8F;
   }

   public boolean a(eqt $$0) {
      return false;
   }

   @Override
   protected double bc() {
      return this.h(bvu.n);
   }

   protected double fk() {
      boolean $$0 = this.dv().e <= 0.0;
      return $$0 && this.b(bta.B) ? Math.min(this.bd(), 0.01) : this.bd();
   }

   public void a_(eyw $$0) {
      if (this.de()) {
         eqt $$1 = this.dS().b_(this.ds());
         if ((this.bi() || this.bw()) && this.eh() && !this.a($$1)) {
            this.l($$0);
         } else if (this.fF()) {
            this.I();
         } else {
            this.k($$0);
         }
      }
   }

   private void k(eyw $$0) {
      jf $$1 = this.aO();
      float $$2 = this.aH() ? this.dS().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      eyw $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      bsy $$6 = this.c(bta.y);
      if ($$6 != null) {
         $$5 += (0.05 * (double)($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.dS().B || this.dS().B($$1)) {
         $$5 -= this.fk();
      } else if (this.dz() > (double)this.dS().H_()) {
         $$5 = -0.1;
      } else {
         $$5 = 0.0;
      }

      if (this.es()) {
         this.n($$4.d, $$5, $$4.f);
      } else {
         float $$7 = this instanceof cgm ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void l(eyw $$0) {
      boolean $$1 = this.dv().e <= 0.0;
      double $$2 = this.dz();
      double $$3 = this.fk();
      if (this.bi()) {
         float $$4 = this.cg() ? 0.9F : this.fj();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bvu.F);
         if (!this.aH()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fm() - $$5) * $$6;
         }

         if (this.b(bta.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bur.a, this.dv());
         eyw $$7 = this.dv();
         if (this.Q && this.q_()) {
            $$7 = new eyw($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.h(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bur.a, this.dv());
         if (this.b(axb.b) <= this.dm()) {
            this.h(this.dv().d(0.5, 0.8F, 0.5));
            eyw $$8 = this.a($$3, $$1, this.dv());
            this.h($$8);
         } else {
            this.h(this.dv().c(0.5));
         }

         if ($$3 != 0.0) {
            this.h(this.dv().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      eyw $$9 = this.dv();
      if (this.Q && this.g($$9.d, $$9.e + 0.6F - this.dz() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void I() {
      eyw $$0 = this.dv();
      double $$1 = $$0.i();
      this.h(this.m($$0));
      this.a(bur.a, this.dv());
      if (!this.dS().B) {
         double $$2 = this.dv().i();
         this.c($$1, $$2);
      }
   }

   private eyw m(eyw $$0) {
      eyw $$1 = this.bQ();
      float $$2 = this.dK() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fk();
      double $$6 = azf.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-azf.a($$2)) * 0.04;
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

   private void c(cnx $$0, eyw $$1) {
      eyw $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.de()) {
         this.C(this.e($$0));
         this.a_($$2);
      } else {
         this.h(eyw.c);
      }
   }

   protected void a(cnx $$0, eyw $$1) {
   }

   protected eyw b(cnx $$0, eyw $$1) {
      return $$1;
   }

   protected float e(cnx $$0) {
      return this.fm();
   }

   public void s(boolean $$0) {
      float $$1 = (float)azf.g(this.dx() - this.L, $$0 ? this.dz() - this.M : 0.0, this.dD() - this.N);
      if (!this.bW() && this.bI()) {
         this.B($$1);
      } else {
         this.aP.a();
      }
   }

   protected void B(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aP.a($$1, 0.4F, this.p_() ? 3.0F : 1.0F);
   }

   private eyw a(eyw $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.h(this.n(this.dv()));
      this.a(bur.a, this.dv());
      eyw $$2 = this.dv();
      if ((this.Q || this.bj) && (this.q_() || this.dt().a(dho.qP) && dnh.a(this))) {
         $$2 = new eyw($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public eyw a(double $$0, boolean $$1, eyw $$2) {
      if ($$0 != 0.0 && !this.cg()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new eyw($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private eyw n(eyw $$0) {
      if (this.q_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = azf.a($$0.d, -0.15F, 0.15F);
         double $$3 = azf.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dt().a(dho.nS) && this.fE() && this instanceof cnx) {
            $$4 = 0.0;
         }

         $$0 = new eyw($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aH() ? this.fm() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fl();
   }

   protected float fl() {
      return this.cU() instanceof cnx ? this.fm() * 0.1F : 0.02F;
   }

   public float fm() {
      return this.cb;
   }

   public void C(float $$0) {
      this.cb = $$0;
   }

   public boolean E(btr $$0) {
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

         if (this.fN() && !this.P()) {
            this.fO();
         }
      }

      if (!this.dN()) {
         this.n_();
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
         float $$8 = (float)azf.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = azf.e(azf.h(this.dI()) - $$8);
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

      if (this.fN()) {
         this.w(0.0F);
      }

      this.D();
      float $$10 = this.eg();
      if ($$10 != this.bC) {
         this.bC = $$10;
         this.j_();
      }

      this.aX.a();
   }

   private void J() {
      Map<btz, cvs> $$0 = this.K();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<btz, cvs> K() {
      Map<btz, cvs> $$0 = null;

      for (btz $$1 : btz.values()) {
         cvs $$2 = switch ($$1.a()) {
            case a -> this.g($$1);
            case b -> this.f($$1);
            case c -> this.bU;
         };
         cvs $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(btz.class);
            }

            $$0.put($$1, $$3);
            bvr $$4 = this.eV();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<btz, cvs> $$5 : $$0.entrySet()) {
            btz $$6 = $$5.getKey();
            cvs $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1) -> {
                  bvq $$2 = this.bP.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1.b());
                     $$2.b($$1);
                  }
               });
               if (this.dS() instanceof arj $$8) {
                  dbp.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(cvs $$0, cvs $$1) {
      return !cvs.a($$1, $$0);
   }

   private void a(Map<btz, cvs> $$0) {
      cvs $$1 = $$0.get(btz.a);
      cvs $$2 = $$0.get(btz.b);
      if ($$1 != null && $$2 != null && cvs.a($$1, this.g(btz.b)) && cvs.a($$2, this.g(btz.a))) {
         ((arj)this.dS()).l().b(this, new ade(this, (byte)55));
         $$0.remove(btz.a);
         $$0.remove(btz.b);
         this.c(btz.a, $$1.u());
         this.c(btz.b, $$2.u());
      }
   }

   private void b(Map<btz, cvs> $$0) {
      List<Pair<btz, cvs>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cvs $$3 = $$2.u();
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
      ((arj)this.dS()).l().b(this, new afj(this.ap(), $$1));
   }

   private cvs f(btz $$0) {
      return this.bT.get($$0.b());
   }

   private void b(btz $$0, cvs $$1) {
      this.bT.set($$0.b(), $$1);
   }

   private cvs g(btz $$0) {
      return this.bS.get($$0.b());
   }

   private void c(btz $$0, cvs $$1) {
      this.bS.set($$0.b(), $$1);
   }

   protected float f(float $$0, float $$1) {
      float $$2 = azf.h($$0 - this.aT);
      this.aT += $$2 * 0.3F;
      float $$3 = azf.h(this.dI() - this.aT);
      float $$4 = this.fn();
      if (Math.abs($$3) > $$4) {
         this.aT = this.aT + ($$3 - (float)azf.j((double)$$3) * $$4);
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

   public void n_() {
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

      eyw $$0 = this.dv();
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
      if (this.bj && this.eh()) {
         double $$4;
         if (this.bw()) {
            $$4 = this.b(axb.b);
         } else {
            $$4 = this.b(axb.a);
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
               this.c(axb.b);
            }
         } else {
            this.c(axb.a);
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

      eyr $$8 = this.cO();
      eyw $$9 = new eyw((double)this.bk, (double)this.bl, (double)this.bm);
      if (this.b(bta.B) || this.b(bta.y)) {
         this.n();
      }

      label115: {
         if (this.cU() instanceof cnx $$10 && this.bI()) {
            this.c($$10, $$9);
            break label115;
         }

         this.a_($$9);
      }

      if (!this.dS().x_() || this.de()) {
         this.aI();
      }

      this.s(this instanceof cgm);
      this.dS().ah().c();
      this.dS().ah().a("freezing");
      if (!this.dS().B && !this.eC()) {
         int $$11 = this.cr();
         if (this.aw && this.dG()) {
            this.k(Math.min(this.cu(), $$11 + 1));
         } else {
            this.k(Math.max(0, $$11 - 2));
         }
      }

      this.ed();
      this.ee();
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
         cvs $$0 = this.a(btz.e);
         if (!this.d($$0)) {
            this.b(7, false);
            return;
         }

         int $$1 = this.bx + 1;
         if ($$1 % 10 == 0) {
            int $$2 = $$1 / 10;
            if ($$2 % 2 == 0) {
               $$0.a(1, this, btz.e);
            }

            this.a(dzp.n);
         }
      }
   }

   protected boolean d(cvs $$0) {
      return !this.aH() && !this.bW() && !this.b(bta.y) ? $$0.a(cvw.nU) && cuq.g($$0) : false;
   }

   protected void fq() {
   }

   protected void r() {
      if (this.dS().x_()) {
         this.dS().a(dzd.a(cnx.class), this.cO(), btw.a(this)).forEach(this::F);
      } else {
         List<btr> $$0 = this.dS().a(this, this.cO(), btw.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dS().ac().c(def.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.af.a(4) == 0) {
               int $$2 = 0;

               for (btr $$3 : $$0) {
                  if (!$$3.bW()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dT().h(), 6.0F);
               }
            }

            for (btr $$4 : $$0) {
               this.F($$4);
            }
         }
      }
   }

   protected void a(eyr $$0, eyr $$1) {
      eyr $$2 = $$0.b($$1);
      List<btr> $$3 = this.dS().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (btr $$4 : $$3) {
            if ($$4 instanceof bun) {
               this.g((bun)$$4);
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

   protected void F(btr $$0) {
      $$0.h(this);
   }

   protected void g(bun $$0) {
   }

   public boolean fr() {
      return (this.am.a(az) & 4) != 0;
   }

   @Override
   public void af() {
      btr $$0 = this.dg();
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
   public double d_() {
      return this.bn > 0 ? this.bo : this.dx();
   }

   @Override
   public double e_() {
      return this.bn > 0 ? this.bp : this.dz();
   }

   @Override
   public double O_() {
      return this.bn > 0 ? this.bq : this.dD();
   }

   @Override
   public float P_() {
      return this.bn > 0 ? (float)this.bs : this.dK();
   }

   @Override
   public float f_() {
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

   public void a(ckh $$0) {
      btr $$1 = $$0.s();
      if ($$1 instanceof ark) {
         an.R.a((ark)$$1, $$0.m(), this);
      }
   }

   public void a(btr $$0, int $$1) {
      if (!$$0.dN() && !this.dS().B && ($$0 instanceof ckh || $$0 instanceof coe || $$0 instanceof bud)) {
         ((arj)this.dS()).l().b($$0, new age($$0.ap(), this.ap(), $$1));
      }
   }

   public boolean G(btr $$0) {
      if ($$0.dS() != this.dS()) {
         return false;
      } else {
         eyw $$1 = new eyw(this.dx(), this.dB(), this.dD());
         eyw $$2 = new eyw($$0.dx(), $$0.dB(), $$0.dD());
         return $$2.f($$1) > 128.0 ? false : this.dS().a(new ddr($$1, $$2, ddr.a.a, ddr.b.a, this)).d() == eyu.a.a;
      }
   }

   @Override
   public float i(float $$0) {
      return $$0 == 1.0F ? this.aV : azf.h($$0, this.aW, this.aV);
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
      return this.bI() && !this.Q_() && !this.q_();
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
   public eyw a(jk.a $$0, l.a $$1) {
      return j(super.a($$0, $$1));
   }

   public static eyw j(eyw $$0) {
      return new eyw($$0.d, $$0.e, 0.0);
   }

   public float fs() {
      return this.cd;
   }

   public final void E(float $$0) {
      this.F(azf.a($$0, 0.0F, this.eR()));
   }

   protected void F(float $$0) {
      this.cd = $$0;
   }

   public void g_() {
   }

   public void h_() {
   }

   protected void ft() {
      this.bW = true;
   }

   public abstract buh fu();

   public boolean fv() {
      return (this.am.a(az) & 1) > 0;
   }

   public brr fw() {
      return (this.am.a(az) & 2) > 0 ? brr.b : brr.a;
   }

   private void M() {
      if (this.fv()) {
         if (cvs.b(this.b(this.fw()), this.bv)) {
            this.bv = this.b(this.fw());
            this.a(this.bv);
         } else {
            this.fB();
         }
      }
   }

   protected void a(cvs $$0) {
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

   public void c(brr $$0) {
      cvs $$1 = this.b($$0);
      if (!$$1.f() && !this.fv()) {
         this.bv = $$1;
         this.bw = $$1.a(this);
         if (!this.dS().B) {
            this.c(1, true);
            this.c(2, $$0 == brr.b);
            this.a(dzp.D);
         }
      }
   }

   @Override
   public void a(akh<?> $$0) {
      super.a($$0);
      if (bN.equals($$0)) {
         if (this.dS().B) {
            this.fL().ifPresent(this::a);
         }
      } else if (az.equals($$0) && this.dS().B) {
         if (this.fv() && this.bv.f()) {
            this.bv = this.b(this.fw());
            if (!this.bv.f()) {
               this.bw = this.bv.a(this);
            }
         } else if (!this.fv() && !this.bv.f()) {
            this.bv = cvs.k;
            this.bw = 0;
         }
      }
   }

   @Override
   public void a(fg.a $$0, eyw $$1) {
      super.a($$0, $$1);
      this.aW = this.aV;
      this.aT = this.aV;
      this.aU = this.aT;
   }

   @Override
   public float t(float $$0) {
      return azf.h($$0, this.aU, this.aT);
   }

   public void b(cvs $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         eyw $$3 = new eyw(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dK() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dI() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.af.i()) * 0.6 - 0.3;
         eyw $$5 = new eyw(((double)this.af.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dK() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dI() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dx(), this.dB(), this.dD());
         this.dS().a(new lk(lo.S, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void z() {
      if (!this.dS().B || this.fv()) {
         brr $$0 = this.fw();
         if (!this.bv.equals(this.b($$0))) {
            this.fA();
         } else {
            if (!this.bv.f() && this.fv()) {
               cvs $$1 = this.bv.a(this.dS(), this);
               if ($$1 != this.bv) {
                  this.a($$0, $$1);
               }

               this.fB();
            }
         }
      }
   }

   public cvs fx() {
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
            this.a(dzp.C);
         }
      }

      this.bv = cvs.k;
      this.bw = 0;
   }

   public boolean fC() {
      return this.fD() != null;
   }

   @Nullable
   public cvs fD() {
      if (this.fv() && !this.bv.f()) {
         cvn $$0 = this.bv.h();
         if ($$0.a(this.bv) != cvu.d) {
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
      return super.ci() || !this.fF() && this.c(buz.b);
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
      jf $$9 = jf.a($$0, $$1, $$2);
      dej $$10 = this.dS();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.H_()) {
            jf $$12 = $$9.e();
            dus $$13 = $$10.a_($$12);
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

         if (this instanceof buv $$14) {
            $$14.P().o();
         }

         return true;
      }
   }

   public boolean fH() {
      return !this.eC();
   }

   public boolean fI() {
      return true;
   }

   public void a(jf $$0, boolean $$1) {
   }

   public boolean e(cvs $$0) {
      return false;
   }

   public boolean fJ() {
      return false;
   }

   @Override
   public final btu a(buz $$0) {
      return $$0 == buz.c ? aA : this.e($$0).a(this.eg());
   }

   protected btu e(buz $$0) {
      return this.ao().n().a(this.ef());
   }

   public ImmutableList<buz> fK() {
      return ImmutableList.of(buz.a);
   }

   public eyr f(buz $$0) {
      btu $$1 = this.a($$0);
      return new eyr((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(buz $$0) {
      eyr $$1 = this.a($$0).a(this.dq());
      return this.dS().b(this, $$1);
   }

   @Override
   public boolean o(boolean $$0) {
      return super.o($$0) && !this.fN();
   }

   public Optional<jf> fL() {
      return this.am.a(bN);
   }

   public void g(jf $$0) {
      this.am.a(bN, Optional.of($$0));
   }

   public void fM() {
      this.am.a(bN, Optional.empty());
   }

   public boolean fN() {
      return this.fL().isPresent();
   }

   public void b(jf $$0) {
      if (this.bW()) {
         this.af();
      }

      dus $$1 = this.dS().a_($$0);
      if ($$1.b() instanceof dhf) {
         this.dS().a($$0, $$1.b(dhf.c, Boolean.valueOf(true)), 3);
      }

      this.b(buz.c);
      this.a($$0);
      this.g($$0);
      this.h(eyw.c);
      this.as = true;
   }

   private void a(jf $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean P() {
      return this.fL().map($$0 -> this.dS().a_($$0).b() instanceof dhf).orElse(false);
   }

   public void fO() {
      this.fL().filter(this.dS()::B).ifPresent($$0x -> {
         dus $$1 = this.dS().a_($$0x);
         if ($$1.b() instanceof dhf) {
            jk $$2 = $$1.c(dhf.aF);
            this.dS().a($$0x, $$1.b(dhf.c, Boolean.valueOf(false)), 3);
            eyw $$3 = dhf.a(this.ao(), this.dS(), $$0x, $$2, this.dI()).orElseGet(() -> {
               jf $$1x = $$0x.d();
               return new eyw((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            eyw $$4 = eyw.c($$0x).d($$3).d();
            float $$5 = (float)azf.d(azf.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.v($$5);
            this.w(0.0F);
         }
      });
      eyw $$0 = this.dq();
      this.b(buz.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fM();
   }

   @Nullable
   public jk fP() {
      jf $$0 = this.fL().orElse(null);
      return $$0 != null ? dhf.a(this.dS(), $$0) : null;
   }

   @Override
   public boolean bJ() {
      return !this.fN() && super.bJ();
   }

   public cvs f(cvs $$0) {
      return cvs.k;
   }

   private static byte h(btz $$0) {
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

   public void a(cvn $$0, btz $$1) {
      this.dS().a(this, h($$1));
      this.a(this.a($$1), $$1, this.bP);
   }

   private void a(cvs $$0, btz $$1, bvr $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         bvq $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      dbp.a($$0, this, $$1);
   }

   public static btz d(brr $$0) {
      return $$0 == brr.a ? btz.a : btz.b;
   }

   public btz g(cvs $$0) {
      cuv $$1 = cuv.c_($$0);
      if ($$1 != null) {
         btz $$2 = $$1.l();
         if (this.e($$2)) {
            return $$2;
         }
      }

      return btz.a;
   }

   private static bve a(bun $$0, btz $$1) {
      return $$1 != btz.f && $$1 != btz.a && $$1 != btz.b ? bve.a($$0, $$1, $$2 -> $$2.f() || $$0.g($$2) == $$1) : bve.a($$0, $$1);
   }

   @Nullable
   private static btz s(int $$0) {
      if ($$0 == 100 + btz.f.b()) {
         return btz.f;
      } else if ($$0 == 100 + btz.e.b()) {
         return btz.e;
      } else if ($$0 == 100 + btz.d.b()) {
         return btz.d;
      } else if ($$0 == 100 + btz.c.b()) {
         return btz.c;
      } else if ($$0 == 98) {
         return btz.a;
      } else if ($$0 == 99) {
         return btz.b;
      } else {
         return $$0 == 105 ? btz.g : null;
      }
   }

   @Override
   public bve a_(int $$0) {
      btz $$1 = s($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dG() {
      if (this.Q_()) {
         return false;
      } else {
         boolean $$0 = !this.a(btz.f).a(axe.be) && !this.a(btz.e).a(axe.be) && !this.a(btz.d).a(axe.be) && !this.a(btz.c).a(axe.be) && !this.a(btz.g).a(axe.be);
         return $$0 && super.dG();
      }
   }

   @Override
   public boolean cl() {
      return !this.dS().x_() && this.b(bta.x) || super.cl();
   }

   @Override
   public float dJ() {
      return this.aT;
   }

   @Override
   public void a(acb $$0) {
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

   public boolean fQ() {
      return this.dW().h() instanceof ctq;
   }

   @Override
   public float dM() {
      float $$0 = (float)this.h(bvu.B);
      return this.cU() instanceof cnx ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public eyw m(btr $$0) {
      return this.dq().e(this.a($$0, this.a(this.av()), this.eg() * this.ef()));
   }

   protected void a(int $$0, double $$1) {
      this.aV = (float)azf.e(1.0 / (double)$$0, (double)this.aV, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(azf.c((double)$$0 * this.h(bvu.h)));
   }

   public boolean fR() {
      return false;
   }

   @Override
   public boolean b(bsj $$0) {
      if (super.b($$0)) {
         return true;
      } else {
         if (this.dS() instanceof arj $$1 && dbp.a($$1, this, $$0)) {
            return true;
         }

         return false;
      }
   }

   public static record a(awf a, awf b) {
   }
}

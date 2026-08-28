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
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class bva extends bue implements bty {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final ali d = ali.b("powder_snow");
   private static final ali e = ali.b("sprinting");
   private static final bwg k = new bwg(e, 0.3F, bwg.a.c);
   public static final int m = 2;
   public static final int n = 4;
   public static final int o = 98;
   public static final int p = 100;
   public static final int q = 105;
   public static final int r = 6;
   public static final int s = 100;
   private static final int l = 40;
   public static final double t = 0.003;
   public static final double u = 0.08;
   public static final int v = 20;
   private static final int bH = 10;
   private static final int bI = 2;
   public static final float az = 0.42F;
   private static final double bJ = 128.0;
   protected static final int aA = 1;
   protected static final int aB = 2;
   protected static final int aC = 4;
   protected static final akl<Byte> aD = akp.a(bva.class, akn.a);
   private static final akl<Float> bK = akp.a(bva.class, akn.d);
   private static final akl<List<lp>> bL = akp.a(bva.class, akn.m);
   private static final akl<Boolean> bM = akp.a(bva.class, akn.k);
   private static final akl<Integer> bN = akp.a(bva.class, akn.b);
   private static final akl<Integer> bO = akp.a(bva.class, akn.b);
   private static final akl<Optional<jh>> bP = akp.a(bva.class, akn.p);
   private static final int bQ = 15;
   protected static final buh aE = buh.c(0.2F, 0.2F).b(0.2F);
   public static final float aF = 0.5F;
   public static final float aG = 0.5F;
   public static final String aH = "attributes";
   private final bwf bR;
   private final bsr bS = new bsr(this);
   private final Map<jq<bth>, btj> bT = Maps.newHashMap();
   private final jz<cwb> bU = jz.a(2, cwb.k);
   private final jz<cwb> bV = jz.a(4, cwb.k);
   private cwb bW = cwb.k;
   public boolean aI;
   private boolean bX = false;
   public bsc aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final bwb aT = new bwb();
   public final int aU = 20;
   public final float aV;
   public final float aW;
   public float aX;
   public float aY;
   public float aZ;
   public float ba;
   public final bud bb = new bud(this);
   @Nullable
   protected com bc;
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
   private boolean bY = true;
   @Nullable
   private bva bZ;
   private int ca;
   @Nullable
   private bva cb;
   private int cc;
   private float cd;
   private int ce;
   private float cf;
   protected cwb bz = cwb.k;
   protected int bA;
   protected int bB;
   private jh cg;
   private Optional<jh> ch = Optional.empty();
   @Nullable
   private bsu ci;
   private long cj;
   protected int bC;
   protected float bD;
   @Nullable
   protected cwb bE;
   private float ck;
   private float cl;
   protected bwc<?> bF;
   private boolean cm;
   private final EnumMap<bum, Reference2ObjectMap<dbs, Set<dck>>> cn = new EnumMap<>(bum.class);
   protected float bG = 1.0F;

   protected bva(bul<? extends bva> $$0, dfb $$1) {
      super($$0, $$1);
      this.bR = new bwf(bwj.a($$0));
      this.x(this.eV());
      this.J = true;
      this.aW = (float)((Math.random() + 1.0) * 0.01F);
      this.aA();
      this.aV = (float)Math.random() * 12398.0F;
      this.v((float)(Math.random() * (float) (Math.PI * 2)));
      this.aZ = this.dN();
      uy $$2 = uy.a;
      this.bF = this.a(new Dynamic($$2, (vh)$$2.createMap(ImmutableMap.of($$2.a("memories"), (vh)$$2.emptyMap()))));
   }

   public bwc<?> ed() {
      return this.bF;
   }

   protected bwc.b<?> ee() {
      return bwc.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bwc<?> a(Dynamic<?> $$0) {
      return this.ee().a($$0);
   }

   @Override
   public void au() {
      this.a(this.dY().y(), Float.MAX_VALUE);
   }

   public boolean a(bul<?> $$0) {
      return true;
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(aD, (byte)0);
      $$0.a(bL, List.of());
      $$0.a(bM, false);
      $$0.a(bN, 0);
      $$0.a(bO, 0);
      $$0.a(bK, 1.0F);
      $$0.a(bP, Optional.empty());
   }

   public static bwh.a ef() {
      return bwh.a()
         .a(bwi.s)
         .a(bwi.p)
         .a(bwi.v)
         .a(bwi.a)
         .a(bwi.b)
         .a(bwi.r)
         .a(bwi.B)
         .a(bwi.y)
         .a(bwi.n)
         .a(bwi.x)
         .a(bwi.k)
         .a(bwi.o)
         .a(bwi.w)
         .a(bwi.h)
         .a(bwi.i)
         .a(bwi.F)
         .a(bwi.u)
         .a(bwi.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvj $$2, jh $$3) {
      if (!this.bk()) {
         this.bs();
      }

      if (this.dX() instanceof arn $$4 && $$1 && this.aa > 0.0F) {
         this.b($$4, $$3);
         double $$5 = this.h(bwi.x);
         if ((double)this.aa > $$5 && !$$2.l()) {
            double $$6 = this.dC();
            double $$7 = this.dE();
            double $$8 = this.dI();
            jh $$9 = this.dx();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            float $$13 = (float)azk.c((double)this.aa - $$5);
            double $$14 = Math.min((double)(0.2F + $$13 / 15.0F), 2.5);
            int $$15 = (int)(150.0 * $$14);
            ((arn)this.dX()).a(new lj(lr.b, $$2), $$6, $$7, $$8, $$15, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.ch = Optional.empty();
      }
   }

   public final boolean eg() {
      return this.ar().a(axe.m);
   }

   public float a(float $$0) {
      return azk.h($$0, this.cl, this.ck);
   }

   public boolean eh() {
      return this.dA().b() < 1.0E-5F && this.bo();
   }

   @Override
   public void aB() {
      this.aQ = this.aR;
      if (this.al) {
         this.fR().ifPresent(this::a);
      }

      if (this.dX() instanceof arn $$0) {
         dbu.b($$0, this);
      }

      super.aB();
      bon $$1 = bom.a();
      $$1.a("livingEntityBaseTick");
      if (this.bj() || this.dX().C) {
         this.aI();
      }

      if (this.bM()) {
         boolean $$2 = this instanceof com;
         if (!this.dX().C) {
            if (this.bN()) {
               this.a(this.dY().g(), 1.0F);
            } else if ($$2 && !this.dX().C_().a(this.cS())) {
               double $$3 = this.dX().C_().a(this) + this.dX().C_().n();
               if ($$3 < 0.0) {
                  double $$4 = this.dX().C_().o();
                  if ($$4 > 0.0) {
                     this.a(this.dY().x(), (float)Math.max(1, azk.a(-$$3 * $$4)));
                  }
               }
            }
         }

         if (this.a(axg.a) && !this.dX().a_(jh.a(this.dC(), this.dG(), this.dI())).a(dig.nd)) {
            boolean $$5 = !this.eg() && !btk.c(this) && (!$$2 || !((com)this).gl().a);
            if ($$5) {
               this.j(this.m(this.cu()));
               if (this.cu() == -20) {
                  this.j(0);
                  ezn $$6 = this.dA();

                  for (int $$7 = 0; $$7 < 8; $$7++) {
                     double $$8 = this.af.j() - this.af.j();
                     double $$9 = this.af.j() - this.af.j();
                     double $$10 = this.af.j() - this.af.j();
                     this.dX().a(lr.d, this.dC() + $$8, this.dE() + $$9, this.dI() + $$10, $$6.d, $$6.e, $$6.f);
                  }

                  this.a(this.dY().i(), 2.0F);
               }
            }

            if (!this.dX().C && this.ca() && this.dl() != null && this.dl().cc()) {
               this.af();
            }
         } else if (this.cu() < this.ct()) {
            this.j(this.n(this.cu()));
         }

         if (this.dX() instanceof arn $$11) {
            jh $$12 = this.dx();
            if (!Objects.equal(this.cg, $$12)) {
               this.cg = $$12;
               this.b($$11, $$12);
            }
         }
      }

      if (this.bM() && (this.bm() || this.aw)) {
         this.aO();
      }

      if (this.aN > 0) {
         this.aN--;
      }

      if (this.ak > 0 && !(this instanceof aro)) {
         this.ak--;
      }

      if (this.eH() && this.dX().h(this)) {
         this.en();
      }

      if (this.bd > 0) {
         this.bd--;
      } else {
         this.bc = null;
      }

      if (this.cb != null && !this.cb.bM()) {
         this.cb = null;
      }

      if (this.bZ != null) {
         if (!this.bZ.bM()) {
            this.a(null);
         } else if (this.ag - this.ca > 100) {
            this.a(null);
         }
      }

      this.ey();
      this.bj = this.bi;
      this.aY = this.aX;
      this.ba = this.aZ;
      this.O = this.dN();
      this.P = this.dP();
      $$1.c();
   }

   @Override
   protected float aU() {
      return azk.h((float)this.h(bwi.u), super.aU(), 1.0F);
   }

   protected void ei() {
      bwe $$0 = this.g(bwi.v);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.c(d);
         }
      }
   }

   protected void ej() {
      if (!this.bu().l()) {
         int $$0 = this.cv();
         if ($$0 > 0) {
            bwe $$1 = this.g(bwi.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cw();
            $$1.b(new bwg(d, (double)$$2, bwg.a.a));
         }
      }
   }

   protected void b(arn $$0, jh $$1) {
      dbu.a($$0, this);
   }

   public boolean p_() {
      return false;
   }

   public float ek() {
      return this.p_() ? 0.5F : 1.0F;
   }

   public final float el() {
      bwf $$0 = this.fa();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bwi.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean em() {
      return true;
   }

   protected void en() {
      this.aP++;
      if (this.aP >= 20 && !this.dX().y_() && !this.dS()) {
         this.dX().a(this, (byte)60);
         this.a(bue.c.a);
      }
   }

   public boolean eo() {
      return !this.p_();
   }

   protected boolean ep() {
      return !this.p_();
   }

   protected int m(int $$0) {
      bwe $$1 = this.g(bwi.w);
      double $$2;
      if ($$1 != null) {
         $$2 = $$1.g();
      } else {
         $$2 = 0.0;
      }

      return $$2 > 0.0 && this.af.j() >= 1.0 / ($$2 + 1.0) ? $$0 : $$0 - 1;
   }

   protected int n(int $$0) {
      return Math.min($$0 + 4, this.ct());
   }

   public final int a(arn $$0, @Nullable bue $$1) {
      return dbu.a($$0, $$1, this, this.eq());
   }

   protected int eq() {
      return 0;
   }

   protected boolean er() {
      return false;
   }

   @Nullable
   public bva es() {
      return this.bZ;
   }

   @Override
   public bva Z_() {
      return this.es();
   }

   public int et() {
      return this.ca;
   }

   public void c(@Nullable com $$0) {
      this.bc = $$0;
      this.bd = this.ag;
   }

   public void a(@Nullable bva $$0) {
      this.bZ = $$0;
      this.ca = this.ag;
   }

   @Nullable
   public bva eu() {
      return this.cb;
   }

   public int ev() {
      return this.cc;
   }

   public void B(bue $$0) {
      if ($$0 instanceof bva) {
         this.cb = (bva)$$0;
      } else {
         this.cb = null;
      }

      this.cc = this.ag;
   }

   public int ew() {
      return this.bf;
   }

   public void o(int $$0) {
      this.bf = $$0;
   }

   public boolean ex() {
      return this.bX;
   }

   public void r(boolean $$0) {
      this.bX = $$0;
   }

   protected boolean b(bum $$0) {
      return true;
   }

   public void a(bum $$0, cwb $$1, cwb $$2) {
      if (!this.dX().y_() && !this.R_()) {
         boolean $$3 = $$2.f() && $$1.f();
         if (!$$3 && !cwb.c($$1, $$2) && !this.al) {
            ddn $$4 = $$2.a(ku.D);
            if (!this.bc() && $$4 != null && $$0 == $$4.a()) {
               this.dX().a(null, this.dC(), this.dE(), this.dI(), $$4.b(), this.dn(), 1.0F, 1.0F, this.af.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? eag.v : eag.S);
            }
         }
      }
   }

   @Override
   public void a(bue.c $$0) {
      if ($$0 == bue.c.a || $$0 == bue.c.b) {
         this.c($$0);
      }

      super.a($$0);
      this.bF.a();
   }

   protected void c(bue.c $$0) {
      for (btj $$1 : this.eD()) {
         $$1.a(this, $$0);
      }

      this.bT.clear();
   }

   @Override
   public void b(uk $$0) {
      $$0.a("Health", this.eG());
      $$0.a("HurtTime", (short)this.aN);
      $$0.a("HurtByTimestamp", this.ca);
      $$0.a("DeathTime", (short)this.aP);
      $$0.a("AbsorptionAmount", this.fy());
      $$0.a("attributes", this.fa().d());
      if (!this.bT.isEmpty()) {
         uq $$1 = new uq();

         for (btj $$2 : this.bT.values()) {
            $$1.add($$2.j());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fL());
      this.fR().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<vh> $$3 = this.bF.a(uy.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(uk $$0) {
      this.F($$0.j("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dX() != null && !this.dX().C) {
         this.fa().a($$0.c("attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         uq $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            uk $$3 = $$1.a($$2);
            btj $$4 = btj.a($$3);
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
         fas $$6 = this.dX().O();
         fan $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cI(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         jh $$9 = new jh($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$9);
         this.am.a(ar, bvm.c);
         if (!this.al) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bF = this.a(new Dynamic(uy.a, $$0.c("Brain")));
      }
   }

   protected void ey() {
      Iterator<jq<bth>> $$0 = this.bT.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jq<bth> $$1 = $$0.next();
            btj $$2 = this.bT.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dX().C) {
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
         if (!this.dX().C) {
            this.L();
            this.w();
         }

         this.bY = false;
      }

      List<lp> $$3 = this.am.a(bL);
      if (!$$3.isEmpty()) {
         boolean $$4 = this.am.a(bM);
         int $$5 = this.cq() ? 15 : 4;
         int $$6 = $$4 ? 5 : 1;
         if (this.af.a($$5 * $$6) == 0) {
            this.dX().a(ae.a($$3, this.af), this.d(0.5), this.dF(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void L() {
      if (this.bT.isEmpty()) {
         this.eB();
         this.k(false);
      } else {
         this.k(this.b(btl.n));
         this.q();
      }
   }

   private void q() {
      List<lp> $$0 = this.bT.values().stream().filter(btj::g).map(btj::a).toList();
      this.am.a(bL, $$0);
      this.am.a(bM, d(this.bT.values()));
   }

   private void w() {
      boolean $$0 = this.cp();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable bue $$0) {
      double $$1 = 1.0;
      if (this.ch()) {
         $$1 *= 0.8;
      }

      if (this.cq()) {
         float $$2 = this.fh();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cwb $$3 = this.a(bum.f);
         bul<?> $$4 = $$0.ar();
         if ($$4 == bul.aN && $$3.a(cwf.un)
            || $$4 == bul.bu && $$3.a(cwf.uq)
            || $$4 == bul.aA && $$3.a(cwf.ut)
            || $$4 == bul.aB && $$3.a(cwf.ut)
            || $$4 == bul.x && $$3.a(cwf.ur)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bva $$0) {
      return $$0 instanceof com && this.dX().ak() == bsa.a ? false : $$0.ez();
   }

   public boolean a(bva $$0, cfr $$1) {
      return $$1.a(this, $$0);
   }

   public boolean ez() {
      return !this.cD() && this.eA();
   }

   public boolean eA() {
      return !this.R_() && this.bM();
   }

   public static boolean d(Collection<btj> $$0) {
      for (btj $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void eB() {
      this.am.a(bL, List.of());
   }

   public boolean eC() {
      if (this.dX().C) {
         return false;
      } else if (this.bT.isEmpty()) {
         return false;
      } else {
         Map<jq<bth>, btj> $$0 = Maps.newHashMap(this.bT);
         this.bT.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<btj> eD() {
      return this.bT.values();
   }

   public Map<jq<bth>, btj> eE() {
      return this.bT;
   }

   public boolean b(jq<bth> $$0) {
      return this.bT.containsKey($$0);
   }

   @Nullable
   public btj c(jq<bth> $$0) {
      return this.bT.get($$0);
   }

   public final boolean a(btj $$0) {
      return this.b($$0, null);
   }

   public boolean b(btj $$0, @Nullable bue $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         btj $$2 = this.bT.get($$0.c());
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

   public boolean b(btj $$0) {
      if (this.ar().a(axe.G)) {
         return !$$0.a(btl.M);
      } else if (this.ar().a(axe.F)) {
         return !$$0.a(btl.L);
      } else {
         return !this.ar().a(axe.w) ? true : !$$0.a(btl.j) && !$$0.a(btl.s);
      }
   }

   public void c(btj $$0, @Nullable bue $$1) {
      if (this.b($$0)) {
         btj $$2 = this.bT.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eF() {
      return this.ar().a(axe.x);
   }

   @Nullable
   public btj d(jq<bth> $$0) {
      return this.bT.remove($$0);
   }

   public boolean e(jq<bth> $$0) {
      btj $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(btj $$0, @Nullable bue $$1) {
      this.bY = true;
      if (!this.dX().C) {
         $$0.c().a().a(this.fa(), $$0.e());
         this.c($$0);
      }
   }

   public void c(btj $$0) {
      for (bue $$1 : this.da()) {
         if ($$1 instanceof aro $$2) {
            $$2.g.b(new ago(this.as(), $$0, false));
         }
      }
   }

   protected void a(btj $$0, boolean $$1, @Nullable bue $$2) {
      this.bY = true;
      if ($$1 && !this.dX().C) {
         bth $$3 = $$0.c().a();
         $$3.a(this.fa());
         $$3.a(this.fa(), $$0.e());
         this.D();
      }

      if (!this.dX().C) {
         this.c($$0);
      }
   }

   protected void c(Collection<btj> $$0) {
      this.bY = true;
      if (!this.dX().C) {
         for (btj $$1 : $$0) {
            $$1.c().a().a(this.fa());

            for (bue $$2 : this.da()) {
               if ($$2 instanceof aro $$3) {
                  $$3.g.b(new aer(this.as(), $$1.c()));
               }
            }
         }

         this.D();
      }
   }

   private void D() {
      Set<bwe> $$0 = this.fa().b();

      for (bwe $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jq<bwd> $$0) {
      if ($$0.a(bwi.s)) {
         float $$1 = this.eV();
         if (this.eG() > $$1) {
            this.x($$1);
         }
      } else if ($$0.a(bwi.r)) {
         float $$2 = this.eW();
         if (this.fy() > $$2) {
            this.E($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.eG();
      if ($$1 > 0.0F) {
         this.x($$1 + $$0);
      }
   }

   public float eG() {
      return this.am.a(bK);
   }

   public void x(float $$0) {
      this.am.a(bK, azk.a($$0, 0.0F, this.eV()));
   }

   public boolean eH() {
      return this.eG() <= 0.0F;
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dX().C) {
         return false;
      } else if (this.eH()) {
         return false;
      } else if ($$0.a(axc.i) && this.b(btl.l)) {
         return false;
      } else {
         if (this.fT() && !this.dX().C) {
            this.fU();
         }

         this.bf = 0;
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
            if (!$$0.a(axc.j) && $$0.c() instanceof bva $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(axc.o) && this.ar().a(axe.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(axc.a) && !this.a(bum.f).f()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aT.a(1.5F);
         if (Float.isNaN($$1) || Float.isInfinite($$1)) {
            $$1 = Float.MAX_VALUE;
         }

         boolean $$7 = true;
         if ((float)this.ak > 10.0F && !$$0.a(axc.e)) {
            if ($$1 <= this.bm) {
               return false;
            }

            this.f($$0, $$1 - this.bm);
            this.bm = $$1;
            $$7 = false;
         } else {
            this.bm = $$1;
            this.ak = 20;
            this.f($$0, $$1);
            this.aO = 10;
            this.aN = this.aO;
         }

         bue $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bva $$9 && !$$0.a(axc.q) && (!$$0.a(bsx.I) || !this.ar().a(axe.E))) {
               this.a($$9);
            }

            if ($$8 instanceof com $$10) {
               this.bd = 100;
               this.bc = $$10;
            } else if ($$8 instanceof chu $$11 && $$11.q()) {
               this.bd = 100;
               if ($$11.T_() instanceof com $$12) {
                  this.bc = $$12;
               } else {
                  this.bc = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dX().a(this, (byte)29);
            } else {
               this.dX().a(this, $$0);
            }

            if (!$$0.a(axc.r) && (!$$3 || $$1 > 0.0F)) {
               this.bE();
            }

            if (!$$0.a(axc.z)) {
               double $$13 = 0.0;
               double $$14 = 0.0;
               if ($$0.c() instanceof cpg $$15) {
                  DoubleDoubleImmutablePair $$16 = $$15.a_(this, $$0);
                  $$13 = -$$16.leftDouble();
                  $$14 = -$$16.rightDouble();
               } else if ($$0.i() != null) {
                  $$13 = $$0.i().a() - this.dC();
                  $$14 = $$0.i().c() - this.dI();
               }

               this.p(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.eH()) {
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
            this.ci = $$0;
            this.cj = this.dX().aa();

            for (btj $$18 : this.eD()) {
               $$18.a(this, $$0, $$1);
            }
         }

         if (this instanceof aro) {
            ao.i.a((aro)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((aro)this).a(awv.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof aro) {
            ao.h.a((aro)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$17;
      }
   }

   protected void d(bva $$0) {
      $$0.e(this);
   }

   protected void e(bva $$0) {
      $$0.p(0.5, $$0.dC() - this.dC(), $$0.dI() - this.dI());
   }

   private boolean g(bsu $$0) {
      if ($$0.a(axc.d)) {
         return false;
      } else {
         cwb $$1 = null;
         cyn $$2 = null;

         for (bsc $$3 : bsc.values()) {
            cwb $$4 = this.b($$3);
            $$2 = $$4.a(ku.H);
            if ($$2 != null) {
               $$1 = $$4.v();
               $$4.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof aro $$5) {
               $$5.b(awv.c.b($$1.h()));
               ao.C.a($$5, $$1);
               this.a(eag.C);
            }

            this.x(1.0F);
            $$2.a($$1, this);
            this.dX().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public bsu eI() {
      if (this.dX().aa() - this.cj > 40L) {
         this.ci = null;
      }

      return this.ci;
   }

   protected void e(bsu $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable awk $$0) {
      if ($$0 != null) {
         this.a($$0, this.fi(), this.fj());
      }
   }

   public boolean f(bsu $$0) {
      bue $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cou $$3 && $$3.z() > 0) {
         $$2 = true;
      }

      if (!$$0.a(axc.c) && this.fI() && !$$2) {
         ezn $$4 = $$0.i();
         if ($$4 != null) {
            ezn $$5 = this.c(0.0F, this.cB());
            ezn $$6 = $$4.a(this.dv());
            $$6 = new ezn($$6.d, 0.0, $$6.f).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void g(cwb $$0) {
      if (!$$0.f()) {
         if (!this.bc()) {
            this.dX().a(this.dC(), this.dE(), this.dI(), $$0.M(), this.dn(), 0.8F, 0.8F + this.dX().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(bsu $$0) {
      if (!this.dS() && !this.be) {
         bue $$1 = $$0.d();
         bva $$2 = this.eU();
         if (this.bl >= 0 && $$2 != null) {
            $$2.a(this, this.bl, $$0);
         }

         if (this.fT()) {
            this.fU();
         }

         if (!this.dX().C && this.an()) {
            b.info("Named entity {} died: {}", this, this.eT().a().getString());
         }

         this.be = true;
         this.eT().c();
         if (this.dX() instanceof arn $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(eag.p);
               this.a($$3, $$0);
               this.f($$2);
            }

            this.dX().a(this, (byte)3);
         }

         this.b(bvm.h);
      }
   }

   protected void f(@Nullable bva $$0) {
      if (!this.dX().C) {
         boolean $$1 = false;
         if ($$0 instanceof cki) {
            if (this.dX().ac().b(dex.c)) {
               jh $$2 = this.dx();
               dvj $$3 = dig.cd.m();
               if (this.dX().a_($$2).l() && $$3.a((dfe)this.dX(), $$2)) {
                  this.dX().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               ckv $$4 = new ckv(this.dX(), this.dC(), this.dE(), this.dI(), new cwb(cwf.dw));
               this.dX().b($$4);
            }
         }
      }
   }

   protected void a(arn $$0, bsu $$1) {
      boolean $$2 = this.bd > 0;
      if (this.ep() && $$0.ac().b(dex.f)) {
         this.a($$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.eJ();
      this.D($$1.d());
   }

   protected void eJ() {
   }

   protected void D(@Nullable bue $$0) {
      if (this.dX() instanceof arn $$1 && !this.eM() && (this.er() || this.bd > 0 && this.eo() && this.dX().ac().b(dex.f))) {
         buq.a($$1, this.dv(), this.a($$1, $$0));
      }
   }

   protected void a(arn $$0, bsu $$1, boolean $$2) {
   }

   public long eK() {
      return 0L;
   }

   protected float a(bue $$0, bsu $$1) {
      float $$2 = (float)this.h(bwi.d);
      return this.dX() instanceof arn $$3 ? dbu.d($$3, this.eb(), $$0, $$1, $$2) : $$2;
   }

   protected void a(bsu $$0, boolean $$1) {
      Optional<alh<euh>> $$2 = this.ec();
      if (!$$2.isEmpty()) {
         euh $$3 = this.dX().o().bc().b($$2.get());
         euf.a $$4 = new euf.a((arn)this.dX()).a(ewy.a, this).a(ewy.f, this.dv()).a(ewy.c, $$0).b(ewy.d, $$0.d()).b(ewy.e, $$0.c());
         if ($$1 && this.bc != null) {
            $$4 = $$4.a(ewy.b, this.bc).a(this.bc.gG());
         }

         euf $$5 = $$4.a(ewx.g);
         $$3.a($$5, this.eK(), this::b);
      }
   }

   public boolean a(alh<euh> $$0, Consumer<cwb> $$1) {
      return this.a($$0, $$0x -> $$0x.a(ewy.f, this.dv()).a(ewy.a, this).a(ewx.j), $$1);
   }

   protected void a(alh<euh> $$0, cwb $$1, Consumer<cwb> $$2) {
      this.a($$0, $$1x -> $$1x.a(ewy.f, this.dv()).a(ewy.a, this).a(ewy.i, $$1).a(ewx.s), $$2);
   }

   protected boolean a(alh<euh> $$0, Function<euf.a, euf> $$1, Consumer<cwb> $$2) {
      if (!(this.dX() instanceof arn $$3)) {
         return false;
      } else {
         euh $$4 = $$3.o().bc().b($$0);
         euf $$5 = $$1.apply(new euf.a($$3));
         boolean $$6 = false;

         for (ObjectListIterator var8 = $$4.a($$5).iterator(); var8.hasNext(); $$6 = true) {
            cwb $$7 = (cwb)var8.next();
            $$2.accept($$7);
         }

         return $$6;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(bwi.p);
      if (!($$0 <= 0.0)) {
         this.as = true;
         ezn $$3 = this.dA();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         ezn $$4 = new ezn($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aK() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected awk d(bsu $$0) {
      return awl.kh;
   }

   @Nullable
   protected awk o_() {
      return awl.kc;
   }

   private awk r(int $$0) {
      return $$0 > 4 ? this.eP().b() : this.eP().a();
   }

   public void eL() {
      this.cm = true;
   }

   public boolean eM() {
      return this.cm;
   }

   public float eN() {
      return 0.0F;
   }

   protected ezi eO() {
      ezi $$0 = this.cS();
      bue $$1 = this.dl();
      if ($$1 != null) {
         ezn $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dbs, Set<dck>> c(bum $$0) {
      return (Map<dbs, Set<dck>>)this.cn.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public bva.a eP() {
      return new bva.a(awl.ki, awl.ka);
   }

   public Optional<jh> eQ() {
      return this.ch;
   }

   public boolean q_() {
      if (this.R_()) {
         return false;
      } else {
         jh $$0 = this.dx();
         dvj $$1 = this.dy();
         if ($$1.a(axa.aQ)) {
            this.ch = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dqr && this.c($$0, $$1)) {
            this.ch = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(jh $$0, dvj $$1) {
      if (!$$1.c(dqr.b)) {
         return false;
      } else {
         dvj $$2 = this.dX().a_($$0.e());
         return $$2.a(dig.cO) && $$2.c(dmj.b) == $$1.c(dqr.aF);
      }
   }

   @Override
   public boolean bM() {
      return !this.dS() && this.eG() > 0.0F;
   }

   @Override
   public int cF() {
      return this.y(0.0F);
   }

   protected final int y(float $$0) {
      return azk.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bsu $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.e($$0, $$1);
      if ($$4 > 0) {
         this.a(this.r($$4), 1.0F, 1.0F);
         this.eR();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int e(float $$0, float $$1) {
      if (this.ar().a(axe.o)) {
         return 0;
      } else {
         float $$2 = (float)this.h(bwi.x);
         float $$3 = $$0 - $$2;
         return azk.c((double)($$3 * $$1) * this.h(bwi.k));
      }
   }

   protected void eR() {
      if (!this.bc()) {
         int $$0 = azk.a(this.dC());
         int $$1 = azk.a(this.dE() - 0.2F);
         int $$2 = azk.a(this.dI());
         dvj $$3 = this.dX().a_(new jh($$0, $$1, $$2));
         if (!$$3.l()) {
            dpr $$4 = $$3.A();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void p(float $$0) {
      this.aO = 10;
      this.aN = this.aO;
   }

   public int eS() {
      return azk.a(this.h(bwi.a));
   }

   protected void b(bsu $$0, float $$1) {
   }

   protected void c(bsu $$0, float $$1) {
   }

   protected void z(float $$0) {
   }

   protected void a(bsu $$0, float $$1, bum... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bum $$4 : $$2) {
            cwb $$5 = this.a($$4);
            ddn $$6 = $$5.a(ku.D);
            if ($$6 != null && $$6.g() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float d(bsu $$0, float $$1) {
      if (!$$0.a(axc.b)) {
         this.b($$0, $$1);
         $$1 = bsq.a(this, $$1, $$0, (float)this.eS(), (float)this.h(bwi.b));
      }

      return $$1;
   }

   protected float e(bsu $$0, float $$1) {
      if ($$0.a(axc.f)) {
         return $$1;
      } else {
         if (this.b(btl.k) && !$$0.a(axc.g)) {
            int $$2 = (this.c(btl.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof aro) {
                  ((aro)this).a(awv.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof aro) {
                  ((aro)$$0.d()).a(awv.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(axc.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dX() instanceof arn $$7) {
               $$8 = dbu.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bsq.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void f(bsu $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fy(), 0.0F);
         this.E(this.fy() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof aro $$4) {
            $$4.a(awv.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eT().a($$0, var9);
            this.x(this.eG() - var9);
            this.E(this.fy() - var9);
            this.a(eag.o);
         }
      }
   }

   public bsr eT() {
      return this.bS;
   }

   @Nullable
   public bva eU() {
      if (this.bc != null) {
         return this.bc;
      } else {
         return this.bZ != null ? this.bZ : null;
      }
   }

   public final float eV() {
      return (float)this.h(bwi.s);
   }

   public final float eW() {
      return (float)this.h(bwi.r);
   }

   public final int eX() {
      return this.am.a(bN);
   }

   public final void p(int $$0) {
      this.am.a(bN, $$0);
   }

   public final int eY() {
      return this.am.a(bO);
   }

   public final void q(int $$0) {
      this.am.a(bO, $$0);
   }

   private int E() {
      if (btk.a(this)) {
         return 6 - (1 + btk.b(this));
      } else {
         return this.b(btl.d) ? 6 + (1 + this.c(btl.d).e()) * 2 : 6;
      }
   }

   public void a(bsc $$0) {
      this.a($$0, false);
   }

   public void a(bsc $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.E() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dX() instanceof arn) {
            ach $$2 = new ach(this, $$0 == bsc.a ? 0 : 3);
            arl $$3 = ((arn)this.dX()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bsu $$0) {
      this.aT.a(1.5F);
      this.ak = 20;
      this.aO = 10;
      this.aN = this.aO;
      awk $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.fi(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
      }

      this.a(this.dY().p(), 0.0F);
      this.ci = $$0;
      this.cj = this.dX().aa();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            awk $$1 = this.o_();
            if ($$1 != null) {
               this.a($$1, this.fi(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof com)) {
               this.x(0.0F);
               this.a(this.dY().p());
            }
            break;
         case 29:
            this.a(awl.wC, 1.0F, 0.8F + this.dX().A.i() * 0.4F);
            break;
         case 30:
            this.a(awl.wD, 0.8F, 0.8F + this.dX().A.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.af.i() - 0.5F) * 0.2F;
               float $$6 = (this.af.i() - 0.5F) * 0.2F;
               float $$7 = (this.af.i() - 0.5F) * 0.2F;
               double $$8 = azk.d($$4, this.L, this.dC()) + (this.af.j() - 0.5) * (double)this.ds() * 2.0;
               double $$9 = azk.d($$4, this.M, this.dE()) + this.af.j() * (double)this.dt();
               double $$10 = azk.d($$4, this.N, this.dI()) + (this.af.j() - 0.5) * (double)this.ds() * 2.0;
               this.dX().a(lr.ac, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.g(this.a(bum.a));
            break;
         case 48:
            this.g(this.a(bum.b));
            break;
         case 49:
            this.g(this.a(bum.f));
            break;
         case 50:
            this.g(this.a(bum.e));
            break;
         case 51:
            this.g(this.a(bum.d));
            break;
         case 52:
            this.g(this.a(bum.c));
            break;
         case 54:
            dlx.b(this);
            break;
         case 55:
            this.G();
            break;
         case 60:
            this.F();
            break;
         case 65:
            this.g(this.a(bum.g));
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
         this.dX().a(lr.ab, this.d(1.0), this.dF(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void G() {
      cwb $$0 = this.a(bum.b);
      this.a(bum.b, this.a(bum.a));
      this.a(bum.a, $$0);
   }

   @Override
   protected void aJ() {
      this.a(this.dY().o(), 4.0F);
   }

   protected void eZ() {
      int $$0 = this.E();
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
   public bwe g(jq<bwd> $$0) {
      return this.fa().a($$0);
   }

   public double h(jq<bwd> $$0) {
      return this.fa().c($$0);
   }

   public double i(jq<bwd> $$0) {
      return this.fa().d($$0);
   }

   public bwf fa() {
      return this.bR;
   }

   public cwb fb() {
      return this.a(bum.a);
   }

   public cwb fc() {
      return this.a(bum.b);
   }

   public cwb a(buu $$0) {
      return this.fA() == $$0 ? this.fb() : this.fc();
   }

   @Nonnull
   @Override
   public cwb eb() {
      return this.fb();
   }

   public boolean b(cvx $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cwb> $$0) {
      return $$0.test(this.fb()) || $$0.test(this.fc());
   }

   public cwb b(bsc $$0) {
      if ($$0 == bsc.a) {
         return this.a(bum.a);
      } else if ($$0 == bsc.b) {
         return this.a(bum.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bsc $$0, cwb $$1) {
      if ($$0 == bsc.a) {
         this.a(bum.a, $$1);
      } else {
         if ($$0 != bsc.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bum.b, $$1);
      }
   }

   public boolean d(bum $$0) {
      return !this.a($$0).f();
   }

   public boolean e(bum $$0) {
      return false;
   }

   public abstract Iterable<cwb> fd();

   public abstract cwb a(bum var1);

   public abstract void a(bum var1, cwb var2);

   public Iterable<cwb> fe() {
      return List.of();
   }

   public Iterable<cwb> ff() {
      return this.fd();
   }

   public Iterable<cwb> fg() {
      return Iterables.concat(this.fe(), this.ff());
   }

   protected void c(cwb $$0) {
      $$0.h().l($$0);
   }

   public float fh() {
      Iterable<cwb> $$0 = this.fd();
      int $$1 = 0;
      int $$2 = 0;

      for (cwb $$3 : $$0) {
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
      bwe $$1 = this.g(bwi.v);
      $$1.c(k.b());
      if ($$0) {
         $$1.b(k);
      }
   }

   protected float fi() {
      return 1.0F;
   }

   public float fj() {
      return this.p_() ? (this.af.i() - this.af.i()) * 0.2F + 1.5F : (this.af.i() - this.af.i()) * 0.2F + 1.0F;
   }

   protected boolean fk() {
      return this.eH();
   }

   @Override
   public void h(bue $$0) {
      if (!this.fT()) {
         super.h($$0);
      }
   }

   private void d(bue $$0) {
      ezn $$1;
      if (this.dS()) {
         $$1 = this.dv();
      } else if (!$$0.dS() && !this.dX().a_($$0.dx()).a(axa.aK)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dE(), $$0.dE());
         $$1 = new ezn(this.dC(), $$2, this.dI());
         boolean $$4 = this.ds() <= 4.0F && this.dt() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.dt() / 2.0;
            ezn $$6 = $$1.b(0.0, $$5, 0.0);
            fah $$7 = fae.a(ezi.a($$6, (double)this.ds(), (double)this.dt(), (double)this.ds()));
            $$1 = this.dX().a(this, $$7, $$6, (double)this.ds(), (double)this.dt(), (double)this.ds()).map($$1x -> $$1x.b(0.0, -$$5, 0.0)).orElse($$1);
         }
      }

      this.a($$1.d, $$1.e, $$1.f);
   }

   @Override
   public boolean cN() {
      return this.cM();
   }

   protected float fl() {
      return this.A(1.0F);
   }

   protected float A(float $$0) {
      return (float)this.h(bwi.o) * $$0 * this.aT() + this.fm();
   }

   public float fm() {
      return this.b(btl.h) ? 0.1F * ((float)this.c(btl.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void v() {
      float $$0 = this.fl();
      if (!($$0 <= 1.0E-5F)) {
         ezn $$1 = this.dA();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.ck()) {
            float $$2 = this.dN() * (float) (Math.PI / 180.0);
            this.i(new ezn((double)(-azk.a($$2)) * 0.2, 0.0, (double)azk.b($$2) * 0.2));
         }

         this.as = true;
      }
   }

   protected void fn() {
      this.h(this.dA().b(0.0, -0.04F, 0.0));
   }

   protected void c(axq<erj> $$0) {
      this.h(this.dA().b(0.0, 0.04F, 0.0));
   }

   protected float fo() {
      return 0.8F;
   }

   public boolean a(erk $$0) {
      return false;
   }

   @Override
   protected double be() {
      return this.h(bwi.n);
   }

   protected double fp() {
      boolean $$0 = this.dA().e <= 0.0;
      return $$0 && this.b(btl.B) ? Math.min(this.bf(), 0.01) : this.bf();
   }

   public void a_(ezn $$0) {
      if (this.dj()) {
         erk $$1 = this.dX().b_(this.dx());
         if ((this.bk() || this.by()) && this.em() && !this.a($$1)) {
            this.l($$0);
         } else if (this.fL()) {
            this.I();
         } else {
            this.k($$0);
         }
      }
   }

   private void k(ezn $$0) {
      jh $$1 = this.aR();
      float $$2 = this.aK() ? this.dX().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      ezn $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      btj $$6 = this.c(btl.y);
      if ($$6 != null) {
         $$5 += (0.05 * (double)($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.dX().C || this.dX().B($$1)) {
         $$5 -= this.fp();
      } else if (this.dE() > (double)this.dX().I_()) {
         $$5 = -0.1;
      } else {
         $$5 = 0.0;
      }

      if (this.ex()) {
         this.n($$4.d, $$5, $$4.f);
      } else {
         float $$7 = this instanceof cha ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void l(ezn $$0) {
      boolean $$1 = this.dA().e <= 0.0;
      double $$2 = this.dE();
      double $$3 = this.fp();
      if (this.bk()) {
         float $$4 = this.ck() ? 0.9F : this.fo();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bwi.F);
         if (!this.aK()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fr() - $$5) * $$6;
         }

         if (this.b(btl.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bve.a, this.dA());
         ezn $$7 = this.dA();
         if (this.Q && this.q_()) {
            $$7 = new ezn($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.h(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bve.a, this.dA());
         if (this.b(axg.b) <= this.dr()) {
            this.h(this.dA().d(0.5, 0.8F, 0.5));
            ezn $$8 = this.a($$3, $$1, this.dA());
            this.h($$8);
         } else {
            this.h(this.dA().c(0.5));
         }

         if ($$3 != 0.0) {
            this.h(this.dA().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      ezn $$9 = this.dA();
      if (this.Q && this.g($$9.d, $$9.e + 0.6F - this.dE() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void I() {
      ezn $$0 = this.dA();
      double $$1 = $$0.i();
      this.h(this.m($$0));
      this.a(bve.a, this.dA());
      if (!this.dX().C) {
         double $$2 = this.dA().i();
         this.c($$1, $$2);
      }
   }

   private ezn m(ezn $$0) {
      ezn $$1 = this.bU();
      float $$2 = this.dP() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fp();
      double $$6 = azk.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-azk.a($$2)) * 0.04;
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
            this.a(this.dY().n(), $$3);
         }
      }
   }

   private void c(com $$0, ezn $$1) {
      ezn $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.dj()) {
         this.C(this.e($$0));
         this.a_($$2);
      } else {
         this.h(ezn.c);
      }
   }

   protected void a(com $$0, ezn $$1) {
   }

   protected ezn b(com $$0, ezn $$1) {
      return $$1;
   }

   protected float e(com $$0) {
      return this.fr();
   }

   public void s(boolean $$0) {
      float $$1 = (float)azk.g(this.dC() - this.L, $$0 ? this.dE() - this.M : 0.0, this.dI() - this.N);
      if (!this.ca() && this.bM()) {
         this.B($$1);
      } else {
         this.aT.a();
      }
   }

   protected void B(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aT.a($$1, 0.4F, this.p_() ? 3.0F : 1.0F);
   }

   private ezn a(ezn $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.h(this.n(this.dA()));
      this.a(bve.a, this.dA());
      ezn $$2 = this.dA();
      if ((this.Q || this.bn) && (this.q_() || this.dy().a(dig.qP) && dny.a(this))) {
         $$2 = new ezn($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public ezn a(double $$0, boolean $$1, ezn $$2) {
      if ($$0 != 0.0 && !this.ck()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new ezn($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private ezn n(ezn $$0) {
      if (this.q_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = azk.a($$0.d, -0.15F, 0.15F);
         double $$3 = azk.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dy().a(dig.nS) && this.fK() && this instanceof com) {
            $$4 = 0.0;
         }

         $$0 = new ezn($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aK() ? this.fr() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fq();
   }

   protected float fq() {
      return this.cY() instanceof com ? this.fr() * 0.1F : 0.02F;
   }

   public float fr() {
      return this.cd;
   }

   public void C(float $$0) {
      this.cd = $$0;
   }

   public boolean E(bue $$0) {
      this.B($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.M();
      this.O();
      if (!this.dX().C) {
         int $$0 = this.eX();
         if ($$0 > 0) {
            if (this.aL <= 0) {
               this.aL = 20 * (30 - $$0);
            }

            this.aL--;
            if (this.aL <= 0) {
               this.p($$0 - 1);
            }
         }

         int $$1 = this.eY();
         if ($$1 > 0) {
            if (this.aM <= 0) {
               this.aM = 20 * (30 - $$1);
            }

            this.aM--;
            if (this.aM <= 0) {
               this.q($$1 - 1);
            }
         }

         this.J();
         if (this.ag % 20 == 0) {
            this.eT().c();
         }

         if (this.fT() && !this.P()) {
            this.fU();
         }
      }

      if (!this.dS()) {
         this.n_();
      }

      double $$2 = this.dC() - this.L;
      double $$3 = this.dI() - this.N;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aX;
      float $$6 = 0.0F;
      this.bg = this.bh;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)azk.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = azk.e(azk.h(this.dN()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aR > 0.0F) {
         $$5 = this.dN();
      }

      if (!this.aK()) {
         $$7 = 0.0F;
      }

      this.bh = this.bh + ($$7 - this.bh) * 0.3F;
      bon $$10 = bom.a();
      $$10.a("headTurn");
      $$6 = this.f($$5, $$6);
      $$10.c();
      $$10.a("rangeChecks");

      while (this.dN() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dN() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aX - this.aY < -180.0F) {
         this.aY -= 360.0F;
      }

      while (this.aX - this.aY >= 180.0F) {
         this.aY += 360.0F;
      }

      while (this.dP() - this.P < -180.0F) {
         this.P -= 360.0F;
      }

      while (this.dP() - this.P >= 180.0F) {
         this.P += 360.0F;
      }

      while (this.aZ - this.ba < -180.0F) {
         this.ba -= 360.0F;
      }

      while (this.aZ - this.ba >= 180.0F) {
         this.ba += 360.0F;
      }

      $$10.c();
      this.bi += $$6;
      if (this.fL()) {
         this.bB++;
      } else {
         this.bB = 0;
      }

      if (this.fT()) {
         this.w(0.0F);
      }

      this.D();
      float $$11 = this.el();
      if ($$11 != this.bG) {
         this.bG = $$11;
         this.j_();
      }

      this.bb.a();
   }

   private void J() {
      Map<bum, cwb> $$0 = this.K();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bum, cwb> K() {
      Map<bum, cwb> $$0 = null;

      for (bum $$1 : bum.i) {
         cwb $$2 = switch ($$1.a()) {
            case a -> this.h($$1);
            case b -> this.g($$1);
            case c -> this.bW;
         };
         cwb $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bum.class);
            }

            $$0.put($$1, $$3);
            bwf $$4 = this.fa();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<bum, cwb> $$5 : $$0.entrySet()) {
            bum $$6 = $$5.getKey();
            cwb $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1) -> {
                  bwe $$2 = this.bR.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1.b());
                     $$2.b($$1);
                  }
               });
               if (this.dX() instanceof arn $$8) {
                  dbu.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(cwb $$0, cwb $$1) {
      return !cwb.a($$1, $$0);
   }

   private void a(Map<bum, cwb> $$0) {
      cwb $$1 = $$0.get(bum.a);
      cwb $$2 = $$0.get(bum.b);
      if ($$1 != null && $$2 != null && cwb.a($$1, this.h(bum.b)) && cwb.a($$2, this.h(bum.a))) {
         ((arn)this.dX()).l().b(this, new adi(this, (byte)55));
         $$0.remove(bum.a);
         $$0.remove(bum.b);
         this.c(bum.a, $$1.v());
         this.c(bum.b, $$2.v());
      }
   }

   private void b(Map<bum, cwb> $$0) {
      List<Pair<bum, cwb>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cwb $$3 = $$2.v();
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
      ((arn)this.dX()).l().b(this, new afn(this.as(), $$1));
   }

   private cwb g(bum $$0) {
      return this.bV.get($$0.b());
   }

   private void b(bum $$0, cwb $$1) {
      this.bV.set($$0.b(), $$1);
   }

   private cwb h(bum $$0) {
      return this.bU.get($$0.b());
   }

   private void c(bum $$0, cwb $$1) {
      this.bU.set($$0.b(), $$1);
   }

   protected float f(float $$0, float $$1) {
      float $$2 = azk.h($$0 - this.aX);
      this.aX += $$2 * 0.3F;
      float $$3 = azk.h(this.dN() - this.aX);
      float $$4 = this.fs();
      if (Math.abs($$3) > $$4) {
         this.aX = this.aX + ($$3 - (float)azk.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fs() {
      return 50.0F;
   }

   public void n_() {
      if (this.ce > 0) {
         this.ce--;
      }

      if (this.dj()) {
         this.br = 0;
         this.f(this.dC(), this.dE(), this.dI());
      }

      if (this.br > 0) {
         this.a(this.br, this.bs, this.bt, this.bu, this.bv, this.bw);
         this.br--;
      } else if (!this.dk()) {
         this.h(this.dA().c(0.98));
      }

      if (this.by > 0) {
         this.a(this.by, this.bx);
         this.by--;
      }

      ezn $$0 = this.dA();
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
      bon $$4 = bom.a();
      $$4.a("ai");
      if (this.fk()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      } else if (this.dk()) {
         $$4.a("newAi");
         this.fw();
         $$4.c();
      }

      $$4.c();
      $$4.a("jump");
      if (this.bn && this.em()) {
         double $$5;
         if (this.by()) {
            $$5 = this.b(axg.b);
         } else {
            $$5 = this.b(axg.a);
         }

         boolean $$7 = this.bk() && $$5 > 0.0;
         double $$8 = this.dr();
         if (!$$7 || this.aK() && !($$5 > $$8)) {
            if (!this.by() || this.aK() && !($$5 > $$8)) {
               if ((this.aK() || $$7 && $$5 <= $$8) && this.ce == 0) {
                  this.v();
                  this.ce = 10;
               }
            } else {
               this.c(axg.b);
            }
         } else {
            this.c(axg.a);
         }
      } else {
         this.ce = 0;
      }

      $$4.c();
      $$4.a("travel");
      this.bo *= 0.98F;
      this.bq *= 0.98F;
      if (this.fL()) {
         this.fu();
      }

      ezi $$9 = this.cS();
      ezn $$10 = new ezn((double)this.bo, (double)this.bp, (double)this.bq);
      if (this.b(btl.B) || this.b(btl.y)) {
         this.n();
      }

      label115: {
         if (this.cY() instanceof com $$11 && this.bM()) {
            this.c($$11, $$10);
            break label115;
         }

         this.a_($$10);
      }

      if (!this.dX().y_() || this.dj()) {
         this.aL();
      }

      this.s(this instanceof cha);
      $$4.c();
      $$4.a("freezing");
      if (!this.dX().C && !this.eH()) {
         int $$12 = this.cv();
         if (this.aw && this.dL()) {
            this.k(Math.min(this.cy(), $$12 + 1));
         } else {
            this.k(Math.max(0, $$12 - 2));
         }
      }

      this.ei();
      this.ej();
      if (!this.dX().C && this.ag % 40 == 0 && this.cx() && this.dL()) {
         this.a(this.dY().v(), 1.0F);
      }

      $$4.c();
      $$4.a("push");
      if (this.bC > 0) {
         this.bC--;
         this.a($$9, this.cS());
      }

      this.r();
      $$4.c();
      if (!this.dX().C && this.ft() && this.bm()) {
         this.a(this.dY().i(), 1.0F);
      }
   }

   public boolean ft() {
      return false;
   }

   protected void fu() {
      this.cz();
      if (!this.dX().C) {
         if (!this.fv()) {
            this.b(7, false);
            return;
         }

         int $$0 = this.bB + 1;
         if ($$0 % 10 == 0) {
            int $$1 = $$0 / 10;
            if ($$1 % 2 == 0) {
               List<bum> $$2 = bum.i.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               bum $$3 = ae.a($$2, this.af);
               this.a($$3).a(1, this, $$3);
            }

            this.a(eag.n);
         }
      }
   }

   protected boolean fv() {
      if (!this.aK() && !this.ca() && !this.b(btl.y)) {
         for (bum $$0 : bum.i) {
            if (b(this.a($$0), $$0)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   protected void fw() {
   }

   protected void r() {
      if (this.dX().y_()) {
         this.dX().a(dzu.a(com.class), this.cS(), buj.a(this)).forEach(this::F);
      } else {
         List<bue> $$0 = this.dX().a(this, this.cS(), buj.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dX().ac().c(dex.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.af.a(4) == 0) {
               int $$2 = 0;

               for (bue $$3 : $$0) {
                  if (!$$3.ca()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dY().h(), 6.0F);
               }
            }

            for (bue $$4 : $$0) {
               this.F($$4);
            }
         }
      }
   }

   protected void a(ezi $$0, ezi $$1) {
      ezi $$2 = $$0.b($$1);
      List<bue> $$3 = this.dX().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bue $$4 : $$3) {
            if ($$4 instanceof bva) {
               this.g((bva)$$4);
               this.bC = 0;
               this.h(this.dA().c(-0.2));
               break;
            }
         }
      } else if (this.Q) {
         this.bC = 0;
      }

      if (!this.dX().C && this.bC <= 0) {
         this.c(4, false);
         this.bD = 0.0F;
         this.bE = null;
      }
   }

   protected void F(bue $$0) {
      $$0.h(this);
   }

   protected void g(bva $$0) {
   }

   public boolean fx() {
      return (this.am.a(aD) & 4) != 0;
   }

   @Override
   public void af() {
      bue $$0 = this.dl();
      super.af();
      if ($$0 != null && $$0 != this.dl() && !this.dX().C) {
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
   public double d_() {
      return this.br > 0 ? this.bs : this.dC();
   }

   @Override
   public double e_() {
      return this.br > 0 ? this.bt : this.dE();
   }

   @Override
   public double P_() {
      return this.br > 0 ? this.bu : this.dI();
   }

   @Override
   public float Q_() {
      return this.br > 0 ? (float)this.bw : this.dP();
   }

   @Override
   public float f_() {
      return this.br > 0 ? (float)this.bv : this.dN();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bx = (double)$$0;
      this.by = $$1;
   }

   public void t(boolean $$0) {
      this.bn = $$0;
   }

   public void a(ckv $$0) {
      bue $$1 = $$0.s();
      if ($$1 instanceof aro) {
         ao.R.a((aro)$$1, $$0.m(), this);
      }
   }

   public void a(bue $$0, int $$1) {
      if (!$$0.dS() && !this.dX().C && ($$0 instanceof ckv || $$0 instanceof cou || $$0 instanceof buq)) {
         ((arn)this.dX()).l().b($$0, new agi($$0.as(), this.as(), $$1));
      }
   }

   public boolean G(bue $$0) {
      if ($$0.dX() != this.dX()) {
         return false;
      } else {
         ezn $$1 = new ezn(this.dC(), this.dG(), this.dI());
         ezn $$2 = new ezn($$0.dC(), $$0.dG(), $$0.dI());
         return $$2.f($$1) > 128.0 ? false : this.dX().a(new dej($$1, $$2, dej.a.a, dej.b.a, this)).d() == ezl.a.a;
      }
   }

   @Override
   public float i(float $$0) {
      return $$0 == 1.0F ? this.aZ : azk.h($$0, this.ba, this.aZ);
   }

   public float D(float $$0) {
      float $$1 = this.aR - this.aQ;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aQ + $$1 * $$0;
   }

   @Override
   public boolean bI() {
      return !this.dS();
   }

   @Override
   public boolean bJ() {
      return this.bM() && !this.R_() && !this.q_();
   }

   @Override
   public float cB() {
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
   public ezn a(jm.a $$0, l.a $$1) {
      return j(super.a($$0, $$1));
   }

   public static ezn j(ezn $$0) {
      return new ezn($$0.d, $$0.e, 0.0);
   }

   public float fy() {
      return this.cf;
   }

   public final void E(float $$0) {
      this.F(azk.a($$0, 0.0F, this.eW()));
   }

   protected void F(float $$0) {
      this.cf = $$0;
   }

   public void g_() {
   }

   public void h_() {
   }

   protected void fz() {
      this.bY = true;
   }

   public abstract buu fA();

   public boolean fB() {
      return (this.am.a(aD) & 1) > 0;
   }

   public bsc fC() {
      return (this.am.a(aD) & 2) > 0 ? bsc.b : bsc.a;
   }

   private void M() {
      if (this.fB()) {
         if (cwb.b(this.b(this.fC()), this.bz)) {
            this.bz = this.b(this.fC());
            this.a(this.bz);
         } else {
            this.fH();
         }
      }
   }

   protected void a(cwb $$0) {
      $$0.b(this.dX(), this, this.fE());
      if (--this.bA == 0 && !this.dX().C && !$$0.x()) {
         this.z();
      }
   }

   private void O() {
      this.cl = this.ck;
      if (this.cm()) {
         this.ck = Math.min(1.0F, this.ck + 0.09F);
      } else {
         this.ck = Math.max(0.0F, this.ck - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.am.a(aD);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.am.a(aD, (byte)$$2);
   }

   public void c(bsc $$0) {
      cwb $$1 = this.b($$0);
      if (!$$1.f() && !this.fB()) {
         this.bz = $$1;
         this.bA = $$1.a(this);
         if (!this.dX().C) {
            this.c(1, true);
            this.c(2, $$0 == bsc.b);
            this.a(eag.D);
         }
      }
   }

   @Override
   public void a(akl<?> $$0) {
      super.a($$0);
      if (bP.equals($$0)) {
         if (this.dX().C) {
            this.fR().ifPresent(this::a);
         }
      } else if (aD.equals($$0) && this.dX().C) {
         if (this.fB() && this.bz.f()) {
            this.bz = this.b(this.fC());
            if (!this.bz.f()) {
               this.bA = this.bz.a(this);
            }
         } else if (!this.fB() && !this.bz.f()) {
            this.bz = cwb.k;
            this.bA = 0;
         }
      }
   }

   @Override
   public void a(fi.a $$0, ezn $$1) {
      super.a($$0, $$1);
      this.ba = this.aZ;
      this.aX = this.aZ;
      this.aY = this.aX;
   }

   @Override
   public float t(float $$0) {
      return azk.h($$0, this.aY, this.aX);
   }

   public void b(cwb $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ezn $$3 = new ezn(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dP() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dN() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.af.i()) * 0.6 - 0.3;
         ezn $$5 = new ezn(((double)this.af.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dP() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dN() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dC(), this.dG(), this.dI());
         this.dX().a(new ln(lr.S, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void z() {
      if (!this.dX().C || this.fB()) {
         bsc $$0 = this.fC();
         if (!this.bz.equals(this.b($$0))) {
            this.fG();
         } else {
            if (!this.bz.f() && this.fB()) {
               cwb $$1 = this.bz.a(this.dX(), this);
               if ($$1 != this.bz) {
                  this.a($$0, $$1);
               }

               this.fH();
            }
         }
      }
   }

   public cwb fD() {
      return this.bz;
   }

   public int fE() {
      return this.bA;
   }

   public int fF() {
      return this.fB() ? this.bz.a(this) - this.fE() : 0;
   }

   public void fG() {
      if (!this.bz.f()) {
         this.bz.a(this.dX(), this, this.fE());
         if (this.bz.x()) {
            this.M();
         }
      }

      this.fH();
   }

   public void fH() {
      if (!this.dX().C) {
         boolean $$0 = this.fB();
         this.c(1, false);
         if ($$0) {
            this.a(eag.C);
         }
      }

      this.bz = cwb.k;
      this.bA = 0;
   }

   public boolean fI() {
      return this.fJ() != null;
   }

   @Nullable
   public cwb fJ() {
      if (this.fB() && !this.bz.f()) {
         cvx $$0 = this.bz.h();
         if ($$0.b(this.bz) != cwd.d) {
            return null;
         } else {
            return $$0.a(this.bz, this) - this.bA < 5 ? null : this.bz;
         }
      } else {
         return null;
      }
   }

   public boolean fK() {
      return this.ce();
   }

   public boolean fL() {
      return this.i(7);
   }

   @Override
   public boolean cm() {
      return super.cm() || !this.fL() && this.c(bvm.b);
   }

   public int fM() {
      return this.bB;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dC();
      double $$5 = this.dE();
      double $$6 = this.dI();
      double $$7 = $$1;
      boolean $$8 = false;
      jh $$9 = jh.a($$0, $$1, $$2);
      dfb $$10 = this.dX();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.I_()) {
            jh $$12 = $$9.e();
            dvj $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cS())) {
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

         if (this instanceof bvi $$14) {
            $$14.P().o();
         }

         return true;
      }
   }

   public boolean fN() {
      return !this.eH();
   }

   public boolean fO() {
      return true;
   }

   public void a(jh $$0, boolean $$1) {
   }

   public boolean fP() {
      return false;
   }

   @Override
   public final buh a(bvm $$0) {
      return $$0 == bvm.c ? aE : this.e($$0).a(this.el());
   }

   protected buh e(bvm $$0) {
      return this.ar().n().a(this.ek());
   }

   public ImmutableList<bvm> fQ() {
      return ImmutableList.of(bvm.a);
   }

   public ezi f(bvm $$0) {
      buh $$1 = this.a($$0);
      return new ezi((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bvm $$0) {
      ezi $$1 = this.a($$0).a(this.dv());
      return this.dX().b(this, $$1);
   }

   @Override
   public boolean o(boolean $$0) {
      return super.o($$0) && !this.fT();
   }

   public Optional<jh> fR() {
      return this.am.a(bP);
   }

   public void g(jh $$0) {
      this.am.a(bP, Optional.of($$0));
   }

   public void fS() {
      this.am.a(bP, Optional.empty());
   }

   public boolean fT() {
      return this.fR().isPresent();
   }

   public void b(jh $$0) {
      if (this.ca()) {
         this.af();
      }

      dvj $$1 = this.dX().a_($$0);
      if ($$1.b() instanceof dhx) {
         this.dX().a($$0, $$1.b(dhx.c, Boolean.valueOf(true)), 3);
      }

      this.b(bvm.c);
      this.a($$0);
      this.g($$0);
      this.h(ezn.c);
      this.as = true;
   }

   private void a(jh $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean P() {
      return this.fR().map($$0 -> this.dX().a_($$0).b() instanceof dhx).orElse(false);
   }

   public void fU() {
      this.fR().filter(this.dX()::B).ifPresent($$0x -> {
         dvj $$1 = this.dX().a_($$0x);
         if ($$1.b() instanceof dhx) {
            jm $$2 = $$1.c(dhx.aF);
            this.dX().a($$0x, $$1.b(dhx.c, Boolean.valueOf(false)), 3);
            ezn $$3 = dhx.a(this.ar(), this.dX(), $$0x, $$2, this.dN()).orElseGet(() -> {
               jh $$1x = $$0x.d();
               return new ezn((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ezn $$4 = ezn.c($$0x).d($$3).d();
            float $$5 = (float)azk.d(azk.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.v($$5);
            this.w(0.0F);
         }
      });
      ezn $$0 = this.dv();
      this.b(bvm.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fS();
   }

   @Nullable
   public jm fV() {
      jh $$0 = this.fR().orElse(null);
      return $$0 != null ? dhx.a(this.dX(), $$0) : null;
   }

   @Override
   public boolean bN() {
      return !this.fT() && super.bN();
   }

   public cwb d(cwb $$0) {
      return cwb.k;
   }

   private static byte i(bum $$0) {
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

   public void a(cvx $$0, bum $$1) {
      this.dX().a(this, i($$1));
      this.a(this.a($$1), $$1, this.bR);
   }

   private void a(cwb $$0, bum $$1, bwf $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         bwe $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      dbu.a($$0, this, $$1);
   }

   public static bum d(bsc $$0) {
      return $$0 == bsc.a ? bum.a : bum.b;
   }

   public final boolean e(cwb $$0) {
      if (this.bM() && !this.R_()) {
         ddn $$1 = $$0.a(ku.D);
         if ($$1 != null && $$1.e()) {
            bum $$2 = $$1.a();
            return this.e($$2) && $$1.a(this.ar()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(bum $$0) {
      return true;
   }

   public final bum f(cwb $$0) {
      ddn $$1 = $$0.a(ku.D);
      return $$1 != null && this.e($$1.a()) ? $$1.a() : bum.a;
   }

   public final boolean a(cwb $$0, bum $$1) {
      ddn $$2 = $$0.a(ku.D);
      return $$2 == null ? $$1 == bum.a && this.e(bum.a) : $$1 == $$2.a() && this.e($$2.a()) && $$2.a(this.ar());
   }

   private static bvs a(bva $$0, bum $$1) {
      return $$1 != bum.f && $$1 != bum.a && $$1 != bum.b ? bvs.a($$0, $$1, $$2 -> $$2.f() || $$0.f($$2) == $$1) : bvs.a($$0, $$1);
   }

   @Nullable
   private static bum s(int $$0) {
      if ($$0 == 100 + bum.f.b()) {
         return bum.f;
      } else if ($$0 == 100 + bum.e.b()) {
         return bum.e;
      } else if ($$0 == 100 + bum.d.b()) {
         return bum.d;
      } else if ($$0 == 100 + bum.c.b()) {
         return bum.c;
      } else if ($$0 == 98) {
         return bum.a;
      } else if ($$0 == 99) {
         return bum.b;
      } else {
         return $$0 == 105 ? bum.g : null;
      }
   }

   @Override
   public bvs a_(int $$0) {
      bum $$1 = s($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dL() {
      if (this.R_()) {
         return false;
      } else {
         boolean $$0 = !this.a(bum.f).a(axj.bq) && !this.a(bum.e).a(axj.bq) && !this.a(bum.d).a(axj.bq) && !this.a(bum.c).a(axj.bq) && !this.a(bum.g).a(axj.bq);
         return $$0 && super.dL();
      }
   }

   @Override
   public boolean cp() {
      return !this.dX().y_() && this.b(btl.x) || super.cp();
   }

   @Override
   public float dO() {
      return this.aX;
   }

   @Override
   public void a(acf $$0) {
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

   public boolean fW() {
      return this.eb().h() instanceof cud;
   }

   @Override
   public float dR() {
      float $$0 = (float)this.h(bwi.B);
      return this.cY() instanceof com ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ezn m(bue $$0) {
      return this.dv().e(this.a($$0, this.a(this.ay()), this.el() * this.ek()));
   }

   protected void a(int $$0, double $$1) {
      this.aZ = (float)azk.e(1.0 / (double)$$0, (double)this.aZ, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(azk.c((double)$$0 * this.h(bwi.h)));
   }

   public boolean fX() {
      return false;
   }

   @Override
   public boolean b(bsu $$0) {
      if (super.b($$0)) {
         return true;
      } else {
         if (this.dX() instanceof arn $$1 && dbu.a($$1, this, $$0)) {
            return true;
         }

         return false;
      }
   }

   public static boolean b(cwb $$0, bum $$1) {
      if (!$$0.b(ku.F)) {
         return false;
      } else {
         ddn $$2 = $$0.a(ku.D);
         return $$2 != null && $$1 == $$2.a() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fY() {
      return this.bd;
   }

   public static record a(awk a, awk b) {
   }
}
